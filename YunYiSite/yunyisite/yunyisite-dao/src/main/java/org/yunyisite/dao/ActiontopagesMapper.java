package org.yunyisite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yunyisite.domain.Actiontopages;
import org.yunyisite.domain.ActiontopagesExample;

public interface ActiontopagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int countByExample(ActiontopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByExample(ActiontopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insert(Actiontopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insertSelective(Actiontopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    List<Actiontopages> selectByExample(ActiontopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    Actiontopages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExampleSelective(@Param("record") Actiontopages record, @Param("example") ActiontopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExample(@Param("record") Actiontopages record, @Param("example") ActiontopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKeySelective(Actiontopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ActionToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKey(Actiontopages record);
}