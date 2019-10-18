package com.yunyi.domain.wong_user;

import java.util.Date;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.user_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.create_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.modify_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.note1
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private String note1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.note2
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private String note2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.is_delete
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    private Integer isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.id
     *
     * @return the value of user_role.id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.id
     *
     * @param id the value for user_role.id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.user_id
     *
     * @return the value of user_role.user_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.user_id
     *
     * @param userId the value for user_role.user_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role_id
     *
     * @return the value of user_role.role_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role_id
     *
     * @param roleId the value for user_role.role_id
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.create_time
     *
     * @return the value of user_role.create_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.create_time
     *
     * @param createTime the value for user_role.create_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.modify_time
     *
     * @return the value of user_role.modify_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.modify_time
     *
     * @param modifyTime the value for user_role.modify_time
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.note1
     *
     * @return the value of user_role.note1
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public String getNote1() {
        return note1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.note1
     *
     * @param note1 the value for user_role.note1
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.note2
     *
     * @return the value of user_role.note2
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public String getNote2() {
        return note2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.note2
     *
     * @param note2 the value for user_role.note2
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.is_delete
     *
     * @return the value of user_role.is_delete
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.is_delete
     *
     * @param isDelete the value for user_role.is_delete
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}