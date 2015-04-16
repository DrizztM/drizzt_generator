package drizzt.model;

import java.util.Date;

public class CiaApp {
    private Integer id;

    private String type;

    private String name;

    private String version;

    private String appId;

    private String authKey;

    private String chargeState;

    private String openState;

    private Date regDate;

    private Integer tryNum;

    private String tryState;

    private Integer developerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getChargeState() {
        return chargeState;
    }

    public void setChargeState(String chargeState) {
        this.chargeState = chargeState;
    }

    public String getOpenState() {
        return openState;
    }

    public void setOpenState(String openState) {
        this.openState = openState;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Integer getTryNum() {
        return tryNum;
    }

    public void setTryNum(Integer tryNum) {
        this.tryNum = tryNum;
    }

    public String getTryState() {
        return tryState;
    }

    public void setTryState(String tryState) {
        this.tryState = tryState;
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }
}