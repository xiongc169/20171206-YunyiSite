package org.yunyisite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yunyisite.domain.Businesssystem;
import org.yunyisite.domain.BusinesssystemExample;

public interface BusinesssystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int countByExample(BusinesssystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByExample(BusinesssystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insert(Businesssystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insertSelective(Businesssystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    List<Businesssystem> selectByExample(BusinesssystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    Businesssystem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExampleSelective(@Param("record") Businesssystem record, @Param("example") BusinesssystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExample(@Param("record") Businesssystem record, @Param("example") BusinesssystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKeySelective(Businesssystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BusinessSystem
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKey(Businesssystem record);
}