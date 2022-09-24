package com.startapp;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: com.startapp.o9 */
/* compiled from: Sta */
public class C12111o9 {

    /* renamed from: a */
    private static final String f53964a = "o9";

    /* renamed from: b */
    private static final String f53965b = "SHA-256";

    /* renamed from: c */
    private static final int f53966c = 8192;

    /* renamed from: a */
    public static byte[] m52705a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f53965b);
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m52704a(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f53965b);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return instance.digest();
                }
            }
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return null;
        }
    }
}
