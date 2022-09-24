package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9874p3 {

    /* renamed from: a */
    private final String f46567a;

    /* renamed from: b */
    private boolean f46568b;

    /* renamed from: c */
    private String f46569c;

    /* renamed from: d */
    final /* synthetic */ C4671q3 f46570d;

    public C9874p3(C4671q3 q3Var, String str, String str2) {
        this.f46570d = q3Var;
        C4604n.m20094g(str);
        this.f46567a = str;
    }

    /* renamed from: a */
    public final String mo39098a() {
        if (!this.f46568b) {
            this.f46568b = true;
            this.f46569c = this.f46570d.mo19393n().getString(this.f46567a, (String) null);
        }
        return this.f46569c;
    }

    /* renamed from: b */
    public final void mo39099b(String str) {
        SharedPreferences.Editor edit = this.f46570d.mo19393n().edit();
        edit.putString(this.f46567a, str);
        edit.apply();
        this.f46569c = str;
    }
}
