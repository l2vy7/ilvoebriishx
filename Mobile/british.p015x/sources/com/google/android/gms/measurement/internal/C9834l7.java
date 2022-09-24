package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9186i1;
import java.util.ArrayList;
import p256u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9834l7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46439b;

    /* renamed from: c */
    final /* synthetic */ String f46440c;

    /* renamed from: d */
    final /* synthetic */ zzp f46441d;

    /* renamed from: e */
    final /* synthetic */ C9186i1 f46442e;

    /* renamed from: f */
    final /* synthetic */ C9918t7 f46443f;

    C9834l7(C9918t7 t7Var, String str, String str2, zzp zzp, C9186i1 i1Var) {
        this.f46443f = t7Var;
        this.f46439b = str;
        this.f46440c = str2;
        this.f46441d = zzp;
        this.f46442e = i1Var;
    }

    public final void run() {
        C4670h4 h4Var;
        ArrayList arrayList = new ArrayList();
        try {
            C9918t7 t7Var = this.f46443f;
            C11030e H = t7Var.f46763d;
            if (H == null) {
                t7Var.f21269a.mo19276j().mo19282q().mo38858c("Failed to get conditional properties; not connected to service", this.f46439b, this.f46440c);
                h4Var = this.f46443f.f21269a;
            } else {
                C4604n.m20098k(this.f46441d);
                arrayList = C4668d9.m21501u(H.mo38835L2(this.f46439b, this.f46440c, this.f46441d));
                this.f46443f.m45383E();
                h4Var = this.f46443f.f21269a;
            }
        } catch (RemoteException e) {
            this.f46443f.f21269a.mo19276j().mo19282q().mo38859d("Failed to get conditional properties; remote exception", this.f46439b, this.f46440c, e);
            h4Var = this.f46443f.f21269a;
        } catch (Throwable th) {
            this.f46443f.f21269a.mo19372N().mo19293D(this.f46442e, arrayList);
            throw th;
        }
        h4Var.mo19372N().mo19293D(this.f46442e, arrayList);
    }
}
