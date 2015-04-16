package drizzt.model;

import java.util.ArrayList;
import java.util.List;

public class CiaMobileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public CiaMobileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public CiaMobileExample(int pageIndex, int pageSize) {
        this();
        this.pageIndex=pageIndex;
        this.pageSize=pageSize;
    }

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

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobileNumber is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobileNumber =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobileNumber <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobileNumber >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobileNumber >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobileNumber <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobileNumber <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobileNumber like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobileNumber not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobileNumber in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobileNumber not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobileNumber between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobileNumber not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileAreaIsNull() {
            addCriterion("mobileArea is null");
            return (Criteria) this;
        }

        public Criteria andMobileAreaIsNotNull() {
            addCriterion("mobileArea is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAreaEqualTo(String value) {
            addCriterion("mobileArea =", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotEqualTo(String value) {
            addCriterion("mobileArea <>", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaGreaterThan(String value) {
            addCriterion("mobileArea >", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaGreaterThanOrEqualTo(String value) {
            addCriterion("mobileArea >=", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaLessThan(String value) {
            addCriterion("mobileArea <", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaLessThanOrEqualTo(String value) {
            addCriterion("mobileArea <=", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaLike(String value) {
            addCriterion("mobileArea like", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotLike(String value) {
            addCriterion("mobileArea not like", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaIn(List<String> values) {
            addCriterion("mobileArea in", values, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotIn(List<String> values) {
            addCriterion("mobileArea not in", values, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaBetween(String value1, String value2) {
            addCriterion("mobileArea between", value1, value2, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotBetween(String value1, String value2) {
            addCriterion("mobileArea not between", value1, value2, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIsNull() {
            addCriterion("mobileType is null");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIsNotNull() {
            addCriterion("mobileType is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTypeEqualTo(String value) {
            addCriterion("mobileType =", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotEqualTo(String value) {
            addCriterion("mobileType <>", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeGreaterThan(String value) {
            addCriterion("mobileType >", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mobileType >=", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLessThan(String value) {
            addCriterion("mobileType <", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLessThanOrEqualTo(String value) {
            addCriterion("mobileType <=", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLike(String value) {
            addCriterion("mobileType like", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotLike(String value) {
            addCriterion("mobileType not like", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIn(List<String> values) {
            addCriterion("mobileType in", values, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotIn(List<String> values) {
            addCriterion("mobileType not in", values, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeBetween(String value1, String value2) {
            addCriterion("mobileType between", value1, value2, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotBetween(String value1, String value2) {
            addCriterion("mobileType not between", value1, value2, "mobileType");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("areaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("areaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("areaCode =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("areaCode <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("areaCode >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("areaCode >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("areaCode <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("areaCode <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("areaCode like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("areaCode not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("areaCode in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("areaCode not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("areaCode between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("areaCode not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("postCode is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("postCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("postCode =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("postCode <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("postCode >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postCode >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("postCode <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("postCode <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("postCode like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("postCode not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("postCode in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("postCode not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("postCode between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("postCode not between", value1, value2, "postCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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