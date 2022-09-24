package com.ironsource.mediationsdk.utils;

import p304e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.utils.a */
public final class C11482a {

    /* renamed from: a */
    public final boolean f51529a;

    /* renamed from: b */
    public final String f51530b;

    /* renamed from: c */
    public final boolean f51531c;

    public C11482a() {
        this(false, (String) null, false, 7);
    }

    public C11482a(boolean z, String str, boolean z2) {
        C12691c.m53984c(str, "externalArmEventsUrl");
        this.f51529a = z;
        this.f51530b = str;
        this.f51531c = z2;
    }

    private /* synthetic */ C11482a(boolean z, String str, boolean z2, int i) {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11482a)) {
            return false;
        }
        C11482a aVar = (C11482a) obj;
        return this.f51529a == aVar.f51529a && C12691c.m53982a(this.f51530b, aVar.f51530b) && this.f51531c == aVar.f51531c;
    }

    public final int hashCode() {
        boolean z = this.f51529a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f51530b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f51531c;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f51529a + ", externalArmEventsUrl=" + this.f51530b + ", shouldUseAppSet=" + this.f51531c + ")";
    }
}
