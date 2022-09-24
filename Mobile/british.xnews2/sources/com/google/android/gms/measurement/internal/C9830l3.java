package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9830l3 {

    /* renamed from: a */
    private final String f46428a;

    /* renamed from: b */
    private final boolean f46429b;

    /* renamed from: c */
    private boolean f46430c;

    /* renamed from: d */
    private boolean f46431d;

    /* renamed from: e */
    final /* synthetic */ C4671q3 f46432e;

    public C9830l3(C4671q3 q3Var, String str, boolean z) {
        this.f46432e = q3Var;
        C4604n.m20094g(str);
        this.f46428a = str;
        this.f46429b = z;
    }

    /* renamed from: a */
    public final void mo39051a(boolean z) {
        SharedPreferences.Editor edit = this.f46432e.mo19393n().edit();
        edit.putBoolean(this.f46428a, z);
        edit.apply();
        this.f46431d = z;
    }

    /* renamed from: b */
    public final boolean mo39052b() {
        if (!this.f46430c) {
            this.f46430c = true;
            this.f46431d = this.f46432e.mo19393n().getBoolean(this.f46428a, this.f46429b);
        }
        return this.f46431d;
    }
}
