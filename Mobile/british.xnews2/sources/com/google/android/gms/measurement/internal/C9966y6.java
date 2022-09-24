package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9186i1;
import p255u5.C11026a;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9966y6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46905b;

    /* renamed from: c */
    final /* synthetic */ C9186i1 f46906c;

    /* renamed from: d */
    final /* synthetic */ C9918t7 f46907d;

    C9966y6(C9918t7 t7Var, zzp zzp, C9186i1 i1Var) {
        this.f46907d = t7Var;
        this.f46905b = zzp;
        this.f46906c = i1Var;
    }

    public final void run() {
        C4670h4 h4Var;
        String str = null;
        try {
            if (!this.f46907d.f21269a.mo19365F().mo19395p().mo43338i(C11026a.ANALYTICS_STORAGE)) {
                this.f46907d.f21269a.mo19276j().mo19288x().mo38856a("Analytics storage consent denied; will not get app instance id");
                this.f46907d.f21269a.mo19367I().mo38924C((String) null);
                this.f46907d.f21269a.mo19365F().f21331g.mo39099b((String) null);
                h4Var = this.f46907d.f21269a;
            } else {
                C9918t7 t7Var = this.f46907d;
                C11030e H = t7Var.f46763d;
                if (H == null) {
                    t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to get app instance id");
                    h4Var = this.f46907d.f21269a;
                } else {
                    C4604n.m20098k(this.f46905b);
                    str = H.mo38848t1(this.f46905b);
                    if (str != null) {
                        this.f46907d.f21269a.mo19367I().mo38924C(str);
                        this.f46907d.f21269a.mo19365F().f21331g.mo39099b(str);
                    }
                    this.f46907d.m45383E();
                    h4Var = this.f46907d.f21269a;
                }
            }
        } catch (RemoteException e) {
            this.f46907d.f21269a.mo19276j().mo19282q().mo38857b("Failed to get app instance id", e);
            h4Var = this.f46907d.f21269a;
        } catch (Throwable th) {
            this.f46907d.f21269a.mo19372N().mo19298I(this.f46906c, (String) null);
            throw th;
        }
        h4Var.mo19372N().mo19298I(this.f46906c, str);
    }
}
