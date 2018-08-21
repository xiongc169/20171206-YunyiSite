package org.yoong.domain;

import java.util.Date;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Long menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_name
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Long menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_url
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private String menuUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.order
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Integer order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.create_time
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.modify_time
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.note1
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private String note1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.note2
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private String note2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.is_delete
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_id
     *
     * @return the value of menu.menu_id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_id
     *
     * @param menuId the value for menu.menu_id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_name
     *
     * @return the value of menu.menu_name
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Long getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_name
     *
     * @param menuName the value for menu.menu_name
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setMenuName(Long menuName) {
        this.menuName = menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_url
     *
     * @return the value of menu.menu_url
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_url
     *
     * @param menuUrl the value for menu.menu_url
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parent_id
     *
     * @return the value of menu.parent_id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_id
     *
     * @param parentId the value for menu.parent_id
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.order
     *
     * @return the value of menu.order
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.order
     *
     * @param order the value for menu.order
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.create_time
     *
     * @return the value of menu.create_time
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.create_time
     *
     * @param createTime the value for menu.create_time
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.modify_time
     *
     * @return the value of menu.modify_time
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.modify_time
     *
     * @param modifyTime the value for menu.modify_time
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.note1
     *
     * @return the value of menu.note1
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public String getNote1() {
        return note1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.note1
     *
     * @param note1 the value for menu.note1
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.note2
     *
     * @return the value of menu.note2
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public String getNote2() {
        return note2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.note2
     *
     * @param note2 the value for menu.note2
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.is_delete
     *
     * @return the value of menu.is_delete
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.is_delete
     *
     * @param isDelete the value for menu.is_delete
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}