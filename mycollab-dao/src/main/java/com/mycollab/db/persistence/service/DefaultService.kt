package com.mycollab.db.persistence.service

import com.mycollab.db.arguments.BasicSearchRequest
import com.mycollab.db.arguments.SearchCriteria
import com.mycollab.db.arguments.SearchField
import com.mycollab.db.persistence.IMassUpdateDAO
import com.mycollab.db.persistence.ISearchableDAO
import org.apache.commons.beanutils.PropertyUtils
import org.apache.ibatis.session.RowBounds
import org.slf4j.LoggerFactory
import java.io.Serializable

/**
 * @param <K>
 * @param <T>
 * @param <S>
 * @author MyCollab Ltd.
 * @since 1.0
</S></T></K> */
abstract class DefaultService<K : Serializable, T, S : SearchCriteria> : DefaultCrudService<K, T>(), IDefaultService<K, T, S> {

    abstract val searchMapper: ISearchableDAO<S>

    override fun getTotalCount(criteria: S): Int {
        return searchMapper.getTotalCount(criteria)
    }

    override fun findPageableListByCriteria(searchRequest: BasicSearchRequest<S>): List<*> {
        return searchMapper.findPageableListByCriteria(searchRequest.searchCriteria,
                RowBounds((searchRequest.currentPage - 1) * searchRequest.numberOfItems,
                        searchRequest.numberOfItems))
    }

    override fun findAbsoluteListByCriteria(searchCriteria: S, firstIndex: Int?, numberOfItems: Int?): List<*> {
        return searchMapper.findPageableListByCriteria(searchCriteria,
                RowBounds(firstIndex!!, numberOfItems!!))
    }

    override fun removeByCriteria(criteria: S, sAccountId: Int) {
        var isValid = false
        try {
            val propertyDescriptors = PropertyUtils.getPropertyDescriptors(criteria)

            for (descriptor in propertyDescriptors) {
                val propName = descriptor.name
                if (descriptor.propertyType.genericSuperclass === SearchField::class.java && PropertyUtils.getProperty(criteria, propName) != null) {
                    isValid = true
                    break
                }

            }
        } catch (e: Exception) {
            LOG.debug("Error while validating criteria", e)
        }

        if (isValid) {
            searchMapper.removeByCriteria(criteria)
        }
    }

    override fun getNextItemKey(criteria: S): Int? {
        return searchMapper.getNextItemKey(criteria)
    }

    override fun getPreviousItemKey(criteria: S): Int? {
        return searchMapper.getPreviousItemKey(criteria)
    }

    override fun updateBySearchCriteria(record: T, searchCriteria: S) {
        if (searchMapper is IMassUpdateDAO<*, *>) {
            (searchMapper as IMassUpdateDAO<T, S>).updateBySearchCriteria(record, searchCriteria)
        }
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(DefaultService::class.java)
    }
}