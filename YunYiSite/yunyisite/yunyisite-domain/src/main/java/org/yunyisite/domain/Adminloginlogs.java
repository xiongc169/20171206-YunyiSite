package org.yunyisite.domain;

import java.util.Date;

public class Adminloginlogs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AdminLoginLogs.AdminLoginLogId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private Integer adminloginlogid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AdminLoginLogs.AdminId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private Integer adminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AdminLoginLogs.AdminLoginAddress
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String adminloginaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AdminLoginLogs.AdminLoginIP
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String adminloginip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AdminLoginLogs.AdminLoginTime
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private Date adminlogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AdminLoginLogs.AdminLoginInfo
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String adminlogininfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AdminLoginLogs.AdminLoginLogId
     *
     * @return the value of AdminLoginLogs.AdminLoginLogId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Integer getAdminloginlogid() {
        return adminloginlogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AdminLoginLogs.AdminLoginLogId
     *
     * @param adminloginlogid the value for AdminLoginLogs.AdminLoginLogId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAdminloginlogid(Integer adminloginlogid) {
        this.adminloginlogid = adminloginlogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AdminLoginLogs.AdminId
     *
     * @return the value of AdminLoginLogs.AdminId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AdminLoginLogs.AdminId
     *
     * @param adminid the value for AdminLoginLogs.AdminId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AdminLoginLogs.AdminLoginAddress
     *
     * @return the value of AdminLoginLogs.AdminLoginAddress
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getAdminloginaddress() {
        return adminloginaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AdminLoginLogs.AdminLoginAddress
     *
     * @param adminloginaddress the value for AdminLoginLogs.AdminLoginAddress
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAdminloginaddress(String adminloginaddress) {
        this.adminloginaddress = adminloginaddress == null ? null : adminloginaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AdminLoginLogs.AdminLoginIP
     *
     * @return the value of AdminLoginLogs.AdminLoginIP
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getAdminloginip() {
        return adminloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AdminLoginLogs.AdminLoginIP
     *
     * @param adminloginip the value for AdminLoginLogs.AdminLoginIP
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAdminloginip(String adminloginip) {
        this.adminloginip = adminloginip == null ? null : adminloginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AdminLoginLogs.AdminLoginTime
     *
     * @return the value of AdminLoginLogs.AdminLoginTime
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Date getAdminlogintime() {
        return adminlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AdminLoginLogs.AdminLoginTime
     *
     * @param adminlogintime the value for AdminLoginLogs.AdminLoginTime
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAdminlogintime(Date adminlogintime) {
        this.adminlogintime = adminlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AdminLoginLogs.AdminLoginInfo
     *
     * @return the value of AdminLoginLogs.AdminLoginInfo
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getAdminlogininfo() {
        return adminlogininfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AdminLoginLogs.AdminLoginInfo
     *
     * @param adminlogininfo the value for AdminLoginLogs.AdminLoginInfo
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAdminlogininfo(String adminlogininfo) {
        this.adminlogininfo = adminlogininfo == null ? null : adminlogininfo.trim();
    }
}