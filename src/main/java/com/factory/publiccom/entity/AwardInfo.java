package com.factory.publiccom.entity;

import java.util.Map;

/**
 * 获奖信息
 */
public class AwardInfo {
    private String uid;
    //奖品类型
    private Integer awardType;
    //奖品编号
    private String awardNumber;
    //额外信息
    private Map<String,String> extMap;

    public String getUid() {
        return uid;
    }

    public void setUid(String id) {
        this.uid = id;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    @Override
    public String toString() {
        return "AwardInfo{" +
                "id='" + uid + '\'' +
                ", awardType=" + awardType +
                ", awardNumber='" + awardNumber + '\'' +
                ", extMap=" + extMap +
                '}';
    }

    public AwardInfo() {
    }
}
