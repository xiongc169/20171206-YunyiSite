package org.yoong.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yoong.domain.RoleMenu;
import org.yoong.domain.RoleMenuExample;

public interface RoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    long countByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int deleteByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int insert(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int insertSelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    List<RoleMenu> selectByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    RoleMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int updateByPrimaryKeySelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Tue Aug 21 15:51:14 CST 2018
     */
    int updateByPrimaryKey(RoleMenu record);
}