package com.ironsource.mediationsdk.model;

import java.util.Map;
import p304e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.model.d */
public final class C11418d {

    /* renamed from: a */
    public final Map<String, String> f51365a;

    public C11418d() {
        this((Map) null, 1);
    }

    public C11418d(Map<String, String> map) {
        C12691c.m53984c(map, "mediationTypes");
        this.f51365a = map;
    }

    private /* synthetic */ C11418d(Map map, int i) {
        this(C12648w.m53860a());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C11418d) && C12691c.m53982a(this.f51365a, ((C11418d) obj).f51365a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f51365a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f51365a + ")";
    }
}
