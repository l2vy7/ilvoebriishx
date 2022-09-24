package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C7191a;

/* renamed from: com.google.android.gms.common.internal.s */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7426s implements C7191a.C7195d.C7198c, C7191a.C7195d {

    /* renamed from: c */
    public static final C7426s f29361c = m30064a().mo30163a();

    /* renamed from: b */
    private final String f29362b;

    /* renamed from: com.google.android.gms.common.internal.s$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C7427a {

        /* renamed from: a */
        private String f29363a;

        /* synthetic */ C7427a(C7435v vVar) {
        }

        /* renamed from: a */
        public C7426s mo30163a() {
            return new C7426s(this.f29363a, (C7437w) null);
        }
    }

    /* synthetic */ C7426s(String str, C7437w wVar) {
        this.f29362b = str;
    }

    /* renamed from: a */
    public static C7427a m30064a() {
        return new C7427a((C7435v) null);
    }

    /* renamed from: b */
    public final Bundle mo30160b() {
        Bundle bundle = new Bundle();
        String str = this.f29362b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7426s)) {
            return false;
        }
        return C7408m.m30028a(this.f29362b, ((C7426s) obj).f29362b);
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f29362b);
    }
}
