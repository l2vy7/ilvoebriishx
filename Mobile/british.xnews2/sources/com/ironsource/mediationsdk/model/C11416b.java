package com.ironsource.mediationsdk.model;

import p303e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.model.b */
public final class C11416b {

    /* renamed from: a */
    public final String f51352a;

    public C11416b() {
        this((String) null, 1);
    }

    public C11416b(String str) {
        C12691c.m53984c(str, "auctionData");
        this.f51352a = str;
    }

    private /* synthetic */ C11416b(String str, int i) {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C11416b) && C12691c.m53982a(this.f51352a, ((C11416b) obj).f51352a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f51352a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f51352a + ")";
    }
}
