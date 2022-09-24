package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ky2 {

    /* renamed from: a */
    private final String f34747a;

    /* renamed from: b */
    private final String f34748b;

    private ky2(String str, String str2) {
        this.f34747a = str;
        this.f34748b = str2;
    }

    /* renamed from: a */
    public static ky2 m34240a(String str, String str2) {
        kz2.m34244a(str, "Name is null or empty");
        kz2.m34244a(str2, "Version is null or empty");
        return new ky2(str, str2);
    }

    /* renamed from: b */
    public final String mo33215b() {
        return this.f34747a;
    }

    /* renamed from: c */
    public final String mo33216c() {
        return this.f34748b;
    }
}
