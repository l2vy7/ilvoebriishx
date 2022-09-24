package com.google.android.gms.measurement.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.a3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9714a3 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ int f46141b;

    /* renamed from: c */
    final /* synthetic */ String f46142c;

    /* renamed from: d */
    final /* synthetic */ Object f46143d;

    /* renamed from: e */
    final /* synthetic */ Object f46144e;

    /* renamed from: f */
    final /* synthetic */ Object f46145f;

    /* renamed from: g */
    final /* synthetic */ C4667d3 f46146g;

    C9714a3(C4667d3 d3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f46146g = d3Var;
        this.f46141b = i;
        this.f46142c = str;
        this.f46143d = obj;
        this.f46144e = obj2;
        this.f46145f = obj3;
    }

    public final void run() {
        C4671q3 F = this.f46146g.f21269a.mo19365F();
        if (F.mo38883m()) {
            C4667d3 d3Var = this.f46146g;
            if (d3Var.f21270c == 0) {
                if (d3Var.f21269a.mo19392z().mo19343H()) {
                    C4667d3 d3Var2 = this.f46146g;
                    d3Var2.f21269a.mo19275g();
                    d3Var2.f21270c = 'C';
                } else {
                    C4667d3 d3Var3 = this.f46146g;
                    d3Var3.f21269a.mo19275g();
                    d3Var3.f21270c = 'c';
                }
            }
            C4667d3 d3Var4 = this.f46146g;
            if (d3Var4.f21271d < 0) {
                d3Var4.f21269a.mo19392z().mo19350p();
                d3Var4.f21271d = 55005;
            }
            char charAt = "01VDIWEA?".charAt(this.f46141b);
            C4667d3 d3Var5 = this.f46146g;
            char n = d3Var5.f21270c;
            long o = d3Var5.f21271d;
            String A = C4667d3.m21467A(true, this.f46142c, this.f46143d, this.f46144e, this.f46145f);
            StringBuilder sb = new StringBuilder(A.length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(n);
            sb.append(o);
            sb.append(":");
            sb.append(A);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f46142c.substring(0, 1024);
            }
            C9863o3 o3Var = F.f21328d;
            if (o3Var != null) {
                o3Var.mo39085b(sb2, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f46146g.mo19278C(), "Persisted config not initialized. Not logging error/warn");
    }
}
