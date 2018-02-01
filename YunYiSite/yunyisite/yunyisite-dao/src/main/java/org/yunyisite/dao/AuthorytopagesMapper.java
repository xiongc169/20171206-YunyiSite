package org.yunyisite.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yunyisite.domain.Authorytopages;
import org.yunyisite.domain.AuthorytopagesExample;

public interface AuthorytopagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int countByExample(AuthorytopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByExample(AuthorytopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insert(Authorytopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int insertSelective(Authorytopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    List<Authorytopages> selectByExample(AuthorytopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    Authorytopages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExampleSelective(@Param("record") Authorytopages record, @Param("example") AuthorytopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByExample(@Param("record") Authorytopages record, @Param("example") AuthorytopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKeySelective(Authorytopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    int updateByPrimaryKey(Authorytopages record);
}