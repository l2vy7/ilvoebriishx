package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9852n3 {

    /* renamed from: a */
    private final String f46493a;

    /* renamed from: b */
    private final long f46494b;

    /* renamed from: c */
    private boolean f46495c;

    /* renamed from: d */
    private long f46496d;

    /* renamed from: e */
    final /* synthetic */ C4671q3 f46497e;

    public C9852n3(C4671q3 q3Var, String str, long j) {
        this.f46497e = q3Var;
        C4604n.m20094g(str);
        this.f46493a = str;
        this.f46494b = j;
    }

    /* renamed from: a */
    public final long mo39075a() {
        if (!this.f46495c) {
            this.f46495c = true;
            this.f46496d = this.f46497e.mo19393n().getLong(this.f46493a, this.f46494b);
        }
        return this.f46496d;
    }

    /* renamed from: b */
    public final void mo39076b(long j) {
        SharedPreferences.Editor edit = this.f46497e.mo19393n().edit();
        edit.putLong(this.f46493a, j);
        edit.apply();
        this.f46496d = j;
    }
}
