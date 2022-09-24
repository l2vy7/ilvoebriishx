package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.C11757c;
import java.security.MessageDigest;

/* renamed from: com.ironsource.sdk.controller.t */
final class C11614t {

    /* renamed from: a */
    String f52105a;

    C11614t(String str) {
        this.f52105a = str;
    }

    /* renamed from: a */
    private String m51562a(String str) {
        try {
            return C11757c.m51971a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return m51563c(str);
        }
    }

    /* renamed from: c */
    private String m51563c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = SessionDescription.SUPPORTED_SDP_VERSION + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo44777b(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m51562a(str + str2 + this.f52105a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
