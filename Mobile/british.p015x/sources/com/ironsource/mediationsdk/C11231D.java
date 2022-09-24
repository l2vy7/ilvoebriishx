package com.ironsource.mediationsdk;

import p304e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.D */
public final class C11231D {

    /* renamed from: a */
    public final String f50370a;

    /* renamed from: b */
    public final String f50371b;

    public C11231D(String str, String str2) {
        C12691c.m53984c(str, "advId");
        C12691c.m53984c(str2, "advIdType");
        this.f50370a = str;
        this.f50371b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11231D)) {
            return false;
        }
        C11231D d = (C11231D) obj;
        return C12691c.m53982a(this.f50370a, d.f50370a) && C12691c.m53982a(this.f50371b, d.f50371b);
    }

    public final int hashCode() {
        String str = this.f50370a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50371b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IronSourceAdvId(advId=" + this.f50370a + ", advIdType=" + this.f50371b + ")";
    }
}
