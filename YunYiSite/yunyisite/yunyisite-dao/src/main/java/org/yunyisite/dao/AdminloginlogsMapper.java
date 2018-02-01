package org.yunyisite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yunyisite.domain.Adminloginlogs;
import org.yunyisite.domain.AdminloginlogsExample;

public interface AdminloginlogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int countByExample(AdminloginlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByExample(AdminloginlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByPrimaryKey(Integer adminloginlogid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insert(Adminloginlogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insertSelective(Adminloginlogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    List<Adminloginlogs> selectByExample(AdminloginlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    Adminloginlogs selectByPrimaryKey(Integer adminloginlogid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExampleSelective(@Param("record") Adminloginlogs record, @Param("example") AdminloginlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExample(@Param("record") Adminloginlogs record, @Param("example") AdminloginlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKeySelective(Adminloginlogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKey(Adminloginlogs record);
}