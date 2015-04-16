package drizzt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CiaAppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public CiaAppExample() {
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

    public CiaAppExample(int pageIndex, int pageSize) {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("appId is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("appId is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("appId =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("appId <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("appId >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("appId >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("appId <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("appId <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("appId like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("appId not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("appId in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("appId not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("appId between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("appId not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAuthKeyIsNull() {
            addCriterion("authKey is null");
            return (Criteria) this;
        }

        public Criteria andAuthKeyIsNotNull() {
            addCriterion("authKey is not null");
            return (Criteria) this;
        }

        public Criteria andAuthKeyEqualTo(String value) {
            addCriterion("authKey =", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotEqualTo(String value) {
            addCriterion("authKey <>", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyGreaterThan(String value) {
            addCriterion("authKey >", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyGreaterThanOrEqualTo(String value) {
            addCriterion("authKey >=", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyLessThan(String value) {
            addCriterion("authKey <", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyLessThanOrEqualTo(String value) {
            addCriterion("authKey <=", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyLike(String value) {
            addCriterion("authKey like", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotLike(String value) {
            addCriterion("authKey not like", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyIn(List<String> values) {
            addCriterion("authKey in", values, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotIn(List<String> values) {
            addCriterion("authKey not in", values, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyBetween(String value1, String value2) {
            addCriterion("authKey between", value1, value2, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotBetween(String value1, String value2) {
            addCriterion("authKey not between", value1, value2, "authKey");
            return (Criteria) this;
        }

        public Criteria andChargeStateIsNull() {
            addCriterion("chargeState is null");
            return (Criteria) this;
        }

        public Criteria andChargeStateIsNotNull() {
            addCriterion("chargeState is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStateEqualTo(String value) {
            addCriterion("chargeState =", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotEqualTo(String value) {
            addCriterion("chargeState <>", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateGreaterThan(String value) {
            addCriterion("chargeState >", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateGreaterThanOrEqualTo(String value) {
            addCriterion("chargeState >=", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLessThan(String value) {
            addCriterion("chargeState <", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLessThanOrEqualTo(String value) {
            addCriterion("chargeState <=", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLike(String value) {
            addCriterion("chargeState like", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotLike(String value) {
            addCriterion("chargeState not like", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateIn(List<String> values) {
            addCriterion("chargeState in", values, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotIn(List<String> values) {
            addCriterion("chargeState not in", values, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateBetween(String value1, String value2) {
            addCriterion("chargeState between", value1, value2, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotBetween(String value1, String value2) {
            addCriterion("chargeState not between", value1, value2, "chargeState");
            return (Criteria) this;
        }

        public Criteria andOpenStateIsNull() {
            addCriterion("openState is null");
            return (Criteria) this;
        }

        public Criteria andOpenStateIsNotNull() {
            addCriterion("openState is not null");
            return (Criteria) this;
        }

        public Criteria andOpenStateEqualTo(String value) {
            addCriterion("openState =", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateNotEqualTo(String value) {
            addCriterion("openState <>", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateGreaterThan(String value) {
            addCriterion("openState >", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateGreaterThanOrEqualTo(String value) {
            addCriterion("openState >=", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateLessThan(String value) {
            addCriterion("openState <", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateLessThanOrEqualTo(String value) {
            addCriterion("openState <=", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateLike(String value) {
            addCriterion("openState like", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateNotLike(String value) {
            addCriterion("openState not like", value, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateIn(List<String> values) {
            addCriterion("openState in", values, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateNotIn(List<String> values) {
            addCriterion("openState not in", values, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateBetween(String value1, String value2) {
            addCriterion("openState between", value1, value2, "openState");
            return (Criteria) this;
        }

        public Criteria andOpenStateNotBetween(String value1, String value2) {
            addCriterion("openState not between", value1, value2, "openState");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("regDate is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("regDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("regDate =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("regDate <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("regDate >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("regDate >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("regDate <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("regDate <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("regDate in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("regDate not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("regDate between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("regDate not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andTryNumIsNull() {
            addCriterion("tryNum is null");
            return (Criteria) this;
        }

        public Criteria andTryNumIsNotNull() {
            addCriterion("tryNum is not null");
            return (Criteria) this;
        }

        public Criteria andTryNumEqualTo(Integer value) {
            addCriterion("tryNum =", value, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumNotEqualTo(Integer value) {
            addCriterion("tryNum <>", value, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumGreaterThan(Integer value) {
            addCriterion("tryNum >", value, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tryNum >=", value, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumLessThan(Integer value) {
            addCriterion("tryNum <", value, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumLessThanOrEqualTo(Integer value) {
            addCriterion("tryNum <=", value, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumIn(List<Integer> values) {
            addCriterion("tryNum in", values, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumNotIn(List<Integer> values) {
            addCriterion("tryNum not in", values, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumBetween(Integer value1, Integer value2) {
            addCriterion("tryNum between", value1, value2, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tryNum not between", value1, value2, "tryNum");
            return (Criteria) this;
        }

        public Criteria andTryStateIsNull() {
            addCriterion("tryState is null");
            return (Criteria) this;
        }

        public Criteria andTryStateIsNotNull() {
            addCriterion("tryState is not null");
            return (Criteria) this;
        }

        public Criteria andTryStateEqualTo(String value) {
            addCriterion("tryState =", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateNotEqualTo(String value) {
            addCriterion("tryState <>", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateGreaterThan(String value) {
            addCriterion("tryState >", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateGreaterThanOrEqualTo(String value) {
            addCriterion("tryState >=", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateLessThan(String value) {
            addCriterion("tryState <", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateLessThanOrEqualTo(String value) {
            addCriterion("tryState <=", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateLike(String value) {
            addCriterion("tryState like", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateNotLike(String value) {
            addCriterion("tryState not like", value, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateIn(List<String> values) {
            addCriterion("tryState in", values, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateNotIn(List<String> values) {
            addCriterion("tryState not in", values, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateBetween(String value1, String value2) {
            addCriterion("tryState between", value1, value2, "tryState");
            return (Criteria) this;
        }

        public Criteria andTryStateNotBetween(String value1, String value2) {
            addCriterion("tryState not between", value1, value2, "tryState");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developerId is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developerId is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(Integer value) {
            addCriterion("developerId =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(Integer value) {
            addCriterion("developerId <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(Integer value) {
            addCriterion("developerId >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("developerId >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(Integer value) {
            addCriterion("developerId <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(Integer value) {
            addCriterion("developerId <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<Integer> values) {
            addCriterion("developerId in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<Integer> values) {
            addCriterion("developerId not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(Integer value1, Integer value2) {
            addCriterion("developerId between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("developerId not between", value1, value2, "developerId");
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