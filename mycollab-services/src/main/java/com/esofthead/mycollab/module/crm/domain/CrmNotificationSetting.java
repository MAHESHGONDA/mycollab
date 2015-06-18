/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_crm_notifications*/
package com.esofthead.mycollab.module.crm.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_crm_notifications")
public class CrmNotificationSetting extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_notifications.id
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_notifications.username
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("username")
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_notifications.sAccountId
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_notifications.level
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("level")
    private String level;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_notifications.id
     *
     * @return the value of m_crm_notifications.id
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_notifications.id
     *
     * @param id the value for m_crm_notifications.id
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_notifications.username
     *
     * @return the value of m_crm_notifications.username
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_notifications.username
     *
     * @param username the value for m_crm_notifications.username
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_notifications.sAccountId
     *
     * @return the value of m_crm_notifications.sAccountId
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_notifications.sAccountId
     *
     * @param saccountid the value for m_crm_notifications.sAccountId
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_notifications.level
     *
     * @return the value of m_crm_notifications.level
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_notifications.level
     *
     * @param level the value for m_crm_notifications.level
     *
     * @mbggenerated Wed Jun 17 14:56:55 ICT 2015
     */
    public void setLevel(String level) {
        this.level = level;
    }

    public static enum Field {
        id,
        username,
        saccountid,
        level;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}