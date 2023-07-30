package com.chain.example03;


import com.chain.example02.AuthInfo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 责任链审核抽象类
 **/
public abstract class AuthLink {

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式化

    protected String levelUserId; //审核人id

    protected String levelUserName; //审核人姓名

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    //保存对下一个处理者的引用
    protected AuthLink next;

    /**
     * 获取下一步处理节点
     * @return
     */
    public AuthLink next() {
        return next;
    }


    //添加下一步处理节点
    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    //抽象审核方法,不同级别处理不同的审核业务
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
