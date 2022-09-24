package com.ironsource.sdk.service;

import java.util.HashMap;
import p304e8.C12691c;

/* renamed from: com.ironsource.sdk.service.a */
public final class C11746a {

    /* renamed from: a */
    public static final C11746a f52469a = new C11746a();

    /* renamed from: b */
    private static final HashMap<String, Long> f52470b = new HashMap<>();

    private C11746a() {
    }

    /* renamed from: a */
    public static long m51914a(String str) {
        C12691c.m53984c(str, "instance");
        Long l = f52470b.get(str);
        if (l == null) {
            return -1;
        }
        C12691c.m53983b(l, "it");
        return l.longValue();
    }

    /* renamed from: a */
    public static boolean m51915a(String str, long j) {
        C12691c.m53984c(str, "instance");
        if (!(str.length() == 0)) {
            HashMap<String, Long> hashMap = f52470b;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, Long.valueOf(j));
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m51916b(String str) {
        C12691c.m53984c(str, "instance");
        HashMap<String, Long> hashMap = f52470b;
        if (hashMap.get(str) == null) {
            return false;
        }
        hashMap.remove(str);
        return true;
    }

    /* renamed from: c */
    public static long m51917c(String str) {
        C12691c.m53984c(str, "instance");
        Long l = f52470b.get(str);
        if (l == null) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C12691c.m53983b(l, "it");
        return currentTimeMillis - l.longValue();
    }
}
