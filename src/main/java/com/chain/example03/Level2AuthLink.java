package com.chain.example03;
import com.chain.example02.AuthInfo;
import com.chain.example02.AuthService;
import java.text.ParseException;
import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/14
 **/
public class Level2AuthLink extends AuthLink {

    private Date beginDate = sdf.parse("2022-11-11 00:00:00");
    private Date endDate = sdf.parse("2022-11-20 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next ) {
            return new AuthInfo("0002", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0003", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }
}
