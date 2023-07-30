package com.chain.example02;

/**
 * 审核信息
 **/
public class AuthInfo {

    private String code;

    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            info = this.info.concat(str+" ");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "AuthInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
