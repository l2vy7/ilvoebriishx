package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.art */
/* compiled from: IMASDK */
public final class art {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m14630a(java.lang.Iterable<T> r2) {
        /*
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0015
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r2 = r2.get(r0)
            return r2
        L_0x0015:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L_0x001b:
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L_0x001f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.art.m14630a(java.lang.Iterable):java.lang.Object");
    }

    /* renamed from: b */
    public static void m14631b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static <T> void m14632c(T t) {
        Objects.requireNonNull(t);
    }

    /* renamed from: d */
    public static boolean m14633d() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static int m14634e() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt((Object) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }
}
