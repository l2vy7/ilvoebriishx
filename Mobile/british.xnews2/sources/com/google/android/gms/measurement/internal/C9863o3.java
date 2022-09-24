package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C4604n;
import p255u5.C11033h;

/* renamed from: com.google.android.gms.measurement.internal.o3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9863o3 {

    /* renamed from: a */
    final String f46539a;

    /* renamed from: b */
    private final String f46540b;

    /* renamed from: c */
    private final String f46541c;

    /* renamed from: d */
    private final long f46542d;

    /* renamed from: e */
    final /* synthetic */ C4671q3 f46543e;

    /* synthetic */ C9863o3(C4671q3 q3Var, String str, long j, C11033h hVar) {
        this.f46543e = q3Var;
        C4604n.m20094g("health_monitor");
        C4604n.m20088a(j > 0);
        this.f46539a = "health_monitor:start";
        this.f46540b = "health_monitor:count";
        this.f46541c = "health_monitor:value";
        this.f46542d = j;
    }

    /* renamed from: c */
    private final long m45251c() {
        return this.f46543e.mo19393n().getLong(this.f46539a, 0);
    }

    /* renamed from: d */
    private final void m45252d() {
        this.f46543e.mo19272b();
        long currentTimeMillis = this.f46543e.f21269a.mo19274f().currentTimeMillis();
        SharedPreferences.Editor edit = this.f46543e.mo19393n().edit();
        edit.remove(this.f46540b);
        edit.remove(this.f46541c);
        edit.putLong(this.f46539a, currentTimeMillis);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair mo39084a() {
        long j;
        this.f46543e.mo19272b();
        this.f46543e.mo19272b();
        long c = m45251c();
        if (c == 0) {
            m45252d();
            j = 0;
        } else {
            j = Math.abs(c - this.f46543e.f21269a.mo19274f().currentTimeMillis());
        }
        long j2 = this.f46542d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m45252d();
            return null;
        }
        String string = this.f46543e.mo19393n().getString(this.f46541c, (String) null);
        long j3 = this.f46543e.mo19393n().getLong(this.f46540b, 0);
        m45252d();
        if (string == null || j3 <= 0) {
            return C4671q3.f21326x;
        }
        return new Pair(string, Long.valueOf(j3));
    }

    /* renamed from: b */
    public final void mo39085b(String str, long j) {
        this.f46543e.mo19272b();
        if (m45251c() == 0) {
            m45252d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f46543e.mo19393n().getLong(this.f46540b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f46543e.mo19393n().edit();
            edit.putString(this.f46541c, str);
            edit.putLong(this.f46540b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f46543e.f21269a.mo19372N().mo19327t().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f46543e.mo19393n().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f46541c, str);
        }
        edit2.putLong(this.f46540b, j3);
        edit2.apply();
    }
}
