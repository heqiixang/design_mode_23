package bridgepattern;

import com.bridgepattern.service.*;

import java.math.BigDecimal;

public class Test {
    @org.junit.Test
    public void test(){
        Pay payFace = new WxPay(new PayFaceMode());
        payFace.transfer("wx_0001","10001",new BigDecimal(100));
        System.out.println("------------------------------------------------");
        Pay payFingerprintMode = new WxPay(new PayFingerprintMode());
        payFingerprintMode.transfer("wx_0001","10001",new BigDecimal(100));
        System.out.println("------------------------------------------------");
        Pay payCypher = new WxPay(new PayCypher());
        payCypher.transfer("wx_0001","10001",new BigDecimal(100));
        System.out.println("====================================支付宝=================================");
        Pay zfbPayFace = new ZfbPay(new PayFaceMode());
        zfbPayFace.transfer("zfb_0001","10001",new BigDecimal(100));
        System.out.println("------------------------------------------------");
        Pay zfbPayFingerprintMode = new ZfbPay(new PayFingerprintMode());
        zfbPayFingerprintMode.transfer("zfb_0001","10001",new BigDecimal(100));
        System.out.println("------------------------------------------------");
        Pay zfbPayCypher = new ZfbPay(new PayCypher());
        zfbPayCypher.transfer("zfb_0001","10001",new BigDecimal(100));
    }
}
