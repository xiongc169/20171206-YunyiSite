package com.yunyi.dao.yoong_rehearsal;

import com.yunyi.domain.yoong_rehearsal.Test;
import com.yunyi.domain.yoong_rehearsal.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int countByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int deleteByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    List<Test> selectByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    Test selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jun 02 15:35:15 CST 2021
     */
    int updateByPrimaryKey(Test record);
}