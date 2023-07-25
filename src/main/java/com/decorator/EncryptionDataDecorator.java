package com.decorator;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * 具体装饰者类对文件加密解密
 */
public class EncryptionDataDecorator extends DataLoaderDecorator {
    public EncryptionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return deCode(super.read());
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    //加密
    public String encode(String data) {
        Base64.Encoder encoder = Base64.getEncoder();
        try {
            byte[] bytes = data.getBytes("utf-8");
            String s = encoder.encodeToString(bytes);
            return s;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    //解密
    public String deCode(String data) {
        Base64.Decoder decoder = Base64.getDecoder();
        try {
            String s = new String(decoder.decode(data), "utf-8");
            return s;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
