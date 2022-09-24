package com.startapp;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/* renamed from: com.startapp.a */
/* compiled from: Sta */
public class C11760a {

    /* renamed from: a */
    public static final byte[] f52512a = {10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};

    /* renamed from: b */
    public static final String f52513b = "ts";

    /* renamed from: c */
    public static final String f52514c = "tsh";

    /* renamed from: d */
    public static final String f52515d = "afh";

    /* renamed from: e */
    public static final String f52516e = "MD5";

    /* renamed from: f */
    public static final String f52517f = "UTF-8";

    /* renamed from: g */
    public static final byte[] f52518g = {12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};

    static {
        C12437y.m53774a((Class<?>) C11760a.class);
    }

    /* renamed from: a */
    public static String m51982a() {
        int hashCode = f52512a.hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if (((-hashCode) & hashCode) != hashCode) {
                int i2 = i % hashCode;
            }
        }
        return new Long(System.currentTimeMillis()).toString();
    }

    /* renamed from: b */
    public static String m51986b(String str) {
        return Base64.encodeToString(m51984a(str.getBytes()), 2);
    }

    /* renamed from: c */
    public static String m51987c(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f52517f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String a = m51982a();
        StringBuilder a2 = C12458z0.m53804a("&");
        a2.append(f52513b);
        a2.append("=");
        a2.append(a);
        a2.append("&");
        a2.append(f52515d);
        a2.append("=");
        a2.append(m51983a(str2 + a));
        return a2.toString();
    }

    /* renamed from: a */
    public static String m51983a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f52512a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            byte b2 = bArr[i];
        }
        byte[] bytes2 = str.getBytes();
        byte b3 = f52512a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, b3)];
        for (int i2 = 0; i2 < bytes2.length; i2++) {
            int i3 = i2 % b3;
            bArr2[i3] = (byte) (bArr2[i3] ^ bytes2[i2]);
        }
        byte[] bArr3 = f52512a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f52516e).digest(m51985a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f52517f);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static byte[] m51984a(byte[] bArr) {
        byte[] bArr2 = f52518g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = (long) bArr.hashCode();
        if (((long) hashCode) > hashCode2) {
            int i = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i2 = i % hashCode;
            }
        }
        return m51985a(m51985a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    /* renamed from: a */
    public static byte[] m51985a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }
}
