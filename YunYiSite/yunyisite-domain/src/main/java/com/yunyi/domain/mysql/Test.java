package com.yunyi.domain.mysql;

public class Test {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbggenerated Wed Oct 16 19:46:10 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.name
     *
     * @mbggenerated Wed Oct 16 19:46:10 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.id
     *
     * @return the value of test.id
     *
     * @mbggenerated Wed Oct 16 19:46:10 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.id
     *
     * @param id the value for test.id
     *
     * @mbggenerated Wed Oct 16 19:46:10 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.name
     *
     * @return the value of test.name
     *
     * @mbggenerated Wed Oct 16 19:46:10 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.name
     *
     * @param name the value for test.name
     *
     * @mbggenerated Wed Oct 16 19:46:10 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}