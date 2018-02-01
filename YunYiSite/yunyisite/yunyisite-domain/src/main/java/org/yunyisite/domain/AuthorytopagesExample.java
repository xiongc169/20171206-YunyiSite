package org.yunyisite.domain;

import java.util.ArrayList;
import java.util.List;

public class AuthorytopagesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public AuthorytopagesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthoryidIsNull() {
            addCriterion("AuthoryId is null");
            return (Criteria) this;
        }

        public Criteria andAuthoryidIsNotNull() {
            addCriterion("AuthoryId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoryidEqualTo(Integer value) {
            addCriterion("AuthoryId =", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidNotEqualTo(Integer value) {
            addCriterion("AuthoryId <>", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidGreaterThan(Integer value) {
            addCriterion("AuthoryId >", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuthoryId >=", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidLessThan(Integer value) {
            addCriterion("AuthoryId <", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidLessThanOrEqualTo(Integer value) {
            addCriterion("AuthoryId <=", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidIn(List<Integer> values) {
            addCriterion("AuthoryId in", values, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidNotIn(List<Integer> values) {
            addCriterion("AuthoryId not in", values, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidBetween(Integer value1, Integer value2) {
            addCriterion("AuthoryId between", value1, value2, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("AuthoryId not between", value1, value2, "authoryid");
            return (Criteria) this;
        }

        public Criteria andPageidIsNull() {
            addCriterion("PageId is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("PageId is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Integer value) {
            addCriterion("PageId =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Integer value) {
            addCriterion("PageId <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Integer value) {
            addCriterion("PageId >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PageId >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Integer value) {
            addCriterion("PageId <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Integer value) {
            addCriterion("PageId <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Integer> values) {
            addCriterion("PageId in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Integer> values) {
            addCriterion("PageId not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Integer value1, Integer value2) {
            addCriterion("PageId between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Integer value1, Integer value2) {
            addCriterion("PageId not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andActionlistIsNull() {
            addCriterion("ActionList is null");
            return (Criteria) this;
        }

        public Criteria andActionlistIsNotNull() {
            addCriterion("ActionList is not null");
            return (Criteria) this;
        }

        public Criteria andActionlistEqualTo(String value) {
            addCriterion("ActionList =", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistNotEqualTo(String value) {
            addCriterion("ActionList <>", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistGreaterThan(String value) {
            addCriterion("ActionList >", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistGreaterThanOrEqualTo(String value) {
            addCriterion("ActionList >=", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistLessThan(String value) {
            addCriterion("ActionList <", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistLessThanOrEqualTo(String value) {
            addCriterion("ActionList <=", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistLike(String value) {
            addCriterion("ActionList like", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistNotLike(String value) {
            addCriterion("ActionList not like", value, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistIn(List<String> values) {
            addCriterion("ActionList in", values, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistNotIn(List<String> values) {
            addCriterion("ActionList not in", values, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistBetween(String value1, String value2) {
            addCriterion("ActionList between", value1, value2, "actionlist");
            return (Criteria) this;
        }

        public Criteria andActionlistNotBetween(String value1, String value2) {
            addCriterion("ActionList not between", value1, value2, "actionlist");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("IsShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("IsShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Byte value) {
            addCriterion("IsShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Byte value) {
            addCriterion("IsShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Byte value) {
            addCriterion("IsShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Byte value) {
            addCriterion("IsShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Byte value) {
            addCriterion("IsShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Byte> values) {
            addCriterion("IsShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Byte> values) {
            addCriterion("IsShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Byte value1, Byte value2) {
            addCriterion("IsShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Byte value1, Byte value2) {
            addCriterion("IsShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("IsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("IsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Byte value) {
            addCriterion("IsDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Byte value) {
            addCriterion("IsDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Byte value) {
            addCriterion("IsDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Byte value) {
            addCriterion("IsDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Byte value) {
            addCriterion("IsDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Byte> values) {
            addCriterion("IsDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Byte> values) {
            addCriterion("IsDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Byte value1, Byte value2) {
            addCriterion("IsDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("IsDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AuthoryToPages
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 18 16:24:35 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AuthoryToPages
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}