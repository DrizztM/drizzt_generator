package drizzt.model;

import java.util.ArrayList;
import java.util.List;

public class CiaDeviceAppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public CiaDeviceAppExample() {
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

    public CiaDeviceAppExample(int pageIndex, int pageSize) {
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

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andBluetoothIsNull() {
            addCriterion("bluetooth is null");
            return (Criteria) this;
        }

        public Criteria andBluetoothIsNotNull() {
            addCriterion("bluetooth is not null");
            return (Criteria) this;
        }

        public Criteria andBluetoothEqualTo(String value) {
            addCriterion("bluetooth =", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotEqualTo(String value) {
            addCriterion("bluetooth <>", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothGreaterThan(String value) {
            addCriterion("bluetooth >", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothGreaterThanOrEqualTo(String value) {
            addCriterion("bluetooth >=", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothLessThan(String value) {
            addCriterion("bluetooth <", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothLessThanOrEqualTo(String value) {
            addCriterion("bluetooth <=", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothLike(String value) {
            addCriterion("bluetooth like", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotLike(String value) {
            addCriterion("bluetooth not like", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothIn(List<String> values) {
            addCriterion("bluetooth in", values, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotIn(List<String> values) {
            addCriterion("bluetooth not in", values, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothBetween(String value1, String value2) {
            addCriterion("bluetooth between", value1, value2, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotBetween(String value1, String value2) {
            addCriterion("bluetooth not between", value1, value2, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andAndroidIdIsNull() {
            addCriterion("androidId is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIdIsNotNull() {
            addCriterion("androidId is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidIdEqualTo(String value) {
            addCriterion("androidId =", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotEqualTo(String value) {
            addCriterion("androidId <>", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdGreaterThan(String value) {
            addCriterion("androidId >", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdGreaterThanOrEqualTo(String value) {
            addCriterion("androidId >=", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdLessThan(String value) {
            addCriterion("androidId <", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdLessThanOrEqualTo(String value) {
            addCriterion("androidId <=", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdLike(String value) {
            addCriterion("androidId like", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotLike(String value) {
            addCriterion("androidId not like", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdIn(List<String> values) {
            addCriterion("androidId in", values, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotIn(List<String> values) {
            addCriterion("androidId not in", values, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdBetween(String value1, String value2) {
            addCriterion("androidId between", value1, value2, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotBetween(String value1, String value2) {
            addCriterion("androidId not between", value1, value2, "androidId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeIsNull() {
            addCriterion("phoneType is null");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeIsNotNull() {
            addCriterion("phoneType is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeEqualTo(String value) {
            addCriterion("phoneType =", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeNotEqualTo(String value) {
            addCriterion("phoneType <>", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeGreaterThan(String value) {
            addCriterion("phoneType >", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("phoneType >=", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeLessThan(String value) {
            addCriterion("phoneType <", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeLessThanOrEqualTo(String value) {
            addCriterion("phoneType <=", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeLike(String value) {
            addCriterion("phoneType like", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeNotLike(String value) {
            addCriterion("phoneType not like", value, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeIn(List<String> values) {
            addCriterion("phoneType in", values, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeNotIn(List<String> values) {
            addCriterion("phoneType not in", values, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeBetween(String value1, String value2) {
            addCriterion("phoneType between", value1, value2, "phoneType");
            return (Criteria) this;
        }

        public Criteria andPhoneTypeNotBetween(String value1, String value2) {
            addCriterion("phoneType not between", value1, value2, "phoneType");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNull() {
            addCriterion("systemVersion is null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNotNull() {
            addCriterion("systemVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionEqualTo(String value) {
            addCriterion("systemVersion =", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotEqualTo(String value) {
            addCriterion("systemVersion <>", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThan(String value) {
            addCriterion("systemVersion >", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("systemVersion >=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThan(String value) {
            addCriterion("systemVersion <", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("systemVersion <=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLike(String value) {
            addCriterion("systemVersion like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotLike(String value) {
            addCriterion("systemVersion not like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIn(List<String> values) {
            addCriterion("systemVersion in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotIn(List<String> values) {
            addCriterion("systemVersion not in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionBetween(String value1, String value2) {
            addCriterion("systemVersion between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotBetween(String value1, String value2) {
            addCriterion("systemVersion not between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("appName is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("appName is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("appName =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("appName <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("appName >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("appName >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("appName <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("appName <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("appName like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("appName not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("appName in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("appName not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("appName between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("appName not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("appVersion is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("appVersion is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("appVersion =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("appVersion <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("appVersion >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("appVersion >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("appVersion <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("appVersion <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("appVersion like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("appVersion not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("appVersion in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("appVersion not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("appVersion between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("appVersion not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("packageName is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("packageName is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("packageName =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("packageName <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("packageName >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("packageName >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("packageName <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("packageName <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("packageName like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("packageName not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("packageName in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("packageName not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("packageName between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("packageName not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIsNull() {
            addCriterion("sdkVersion is null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIsNotNull() {
            addCriterion("sdkVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionEqualTo(String value) {
            addCriterion("sdkVersion =", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotEqualTo(String value) {
            addCriterion("sdkVersion <>", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionGreaterThan(String value) {
            addCriterion("sdkVersion >", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sdkVersion >=", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLessThan(String value) {
            addCriterion("sdkVersion <", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLessThanOrEqualTo(String value) {
            addCriterion("sdkVersion <=", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLike(String value) {
            addCriterion("sdkVersion like", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotLike(String value) {
            addCriterion("sdkVersion not like", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIn(List<String> values) {
            addCriterion("sdkVersion in", values, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotIn(List<String> values) {
            addCriterion("sdkVersion not in", values, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionBetween(String value1, String value2) {
            addCriterion("sdkVersion between", value1, value2, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotBetween(String value1, String value2) {
            addCriterion("sdkVersion not between", value1, value2, "sdkVersion");
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