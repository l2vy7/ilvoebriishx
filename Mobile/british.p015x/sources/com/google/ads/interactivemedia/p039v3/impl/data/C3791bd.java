package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.internal.ark;

@ark(mo14242a = C3761aa.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bd */
/* compiled from: IMASDK */
public abstract class C3791bd {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    private static C3791bd create(String str, String str2, String str3, int i) {
        return new C3761aa(str, str2, str3, i);
    }

    public static C3791bd forError(String str, int i) {
        return create(str, "", UNKNOWN_CONTENT_TYPE, i);
    }

    public static C3791bd forResponse(String str, String str2) {
        return forResponse(str, str2, UNKNOWN_CONTENT_TYPE);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    /* renamed from: id */
    public abstract String mo12943id();

    public static C3791bd forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }
}
