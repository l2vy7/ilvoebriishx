package com.ironsource.mediationsdk.p285c;

import com.ironsource.mediationsdk.logger.IronLog;
import p303e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.c.a */
public final class C11360a {
    static {
        new C11360a();
    }

    private C11360a() {
    }

    /* renamed from: a */
    public static final boolean m50765a(Object obj, String str) {
        C12691c.m53984c(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        IronLog.API.error(str);
        return false;
    }
}
