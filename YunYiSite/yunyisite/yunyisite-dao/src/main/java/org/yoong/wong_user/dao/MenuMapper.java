package org.yoong.wong_user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yoong.wong_user.domain.Menu;
import org.yoong.wong_user.domain.MenuExample;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    int countByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    int deleteByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    int insertSelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Wed Jan 16 15:35:01 CST 2019
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);
}