package org.yoong.wong_user.domain;

import java.util.Date;

public class Resource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.resource_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Long resourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.resource_name
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Long resourceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.create_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.modify_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.note1
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private String note1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.note2
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private String note2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.is_delete
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Integer isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.id
     *
     * @return the value of resource.id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.id
     *
     * @param id the value for resource.id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.resource_id
     *
     * @return the value of resource.resource_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.resource_id
     *
     * @param resourceId the value for resource.resource_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.resource_name
     *
     * @return the value of resource.resource_name
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Long getResourceName() {
        return resourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.resource_name
     *
     * @param resourceName the value for resource.resource_name
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setResourceName(Long resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.create_time
     *
     * @return the value of resource.create_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.create_time
     *
     * @param createTime the value for resource.create_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.modify_time
     *
     * @return the value of resource.modify_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.modify_time
     *
     * @param modifyTime the value for resource.modify_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.note1
     *
     * @return the value of resource.note1
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public String getNote1() {
        return note1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.note1
     *
     * @param note1 the value for resource.note1
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.note2
     *
     * @return the value of resource.note2
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public String getNote2() {
        return note2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.note2
     *
     * @param note2 the value for resource.note2
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.is_delete
     *
     * @return the value of resource.is_delete
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.is_delete
     *
     * @param isDelete the value for resource.is_delete
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}