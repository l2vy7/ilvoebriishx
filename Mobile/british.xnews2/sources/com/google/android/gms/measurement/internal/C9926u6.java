package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9186i1;
import java.util.List;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9926u6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46783b;

    /* renamed from: c */
    final /* synthetic */ String f46784c;

    /* renamed from: d */
    final /* synthetic */ zzp f46785d;

    /* renamed from: e */
    final /* synthetic */ boolean f46786e;

    /* renamed from: f */
    final /* synthetic */ C9186i1 f46787f;

    /* renamed from: g */
    final /* synthetic */ C9918t7 f46788g;

    C9926u6(C9918t7 t7Var, String str, String str2, zzp zzp, boolean z, C9186i1 i1Var) {
        this.f46788g = t7Var;
        this.f46783b = str;
        this.f46784c = str2;
        this.f46785d = zzp;
        this.f46786e = z;
        this.f46787f = i1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C9918t7 t7Var = this.f46788g;
            C11030e H = t7Var.f46763d;
            if (H == null) {
                t7Var.f21269a.mo19276j().mo19282q().mo38858c("Failed to get user properties; not connected to service", this.f46783b, this.f46784c);
                this.f46788g.f21269a.mo19372N().mo19294E(this.f46787f, bundle2);
                return;
            }
            C4604n.m20098k(this.f46785d);
            List<zzks> N3 = H.mo38836N3(this.f46783b, this.f46784c, this.f46786e, this.f46785d);
            bundle = new Bundle();
            if (N3 != null) {
                for (zzks zzks : N3) {
                    String str = zzks.f46945f;
                    if (str != null) {
                        bundle.putString(zzks.f46942c, str);
                    } else {
                        Long l = zzks.f46944e;
                        if (l != null) {
                            bundle.putLong(zzks.f46942c, l.longValue());
                        } else {
                            Double d = zzks.f46947h;
                            if (d != null) {
                                bundle.putDouble(zzks.f46942c, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f46788g.m45383E();
                this.f46788g.f21269a.mo19372N().mo19294E(this.f46787f, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f46788g.f21269a.mo19276j().mo19282q().mo38858c("Failed to get user properties; remote exception", this.f46783b, e);
                    this.f46788g.f21269a.mo19372N().mo19294E(this.f46787f, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f46788g.f21269a.mo19372N().mo19294E(this.f46787f, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f46788g.f21269a.mo19276j().mo19282q().mo38858c("Failed to get user properties; remote exception", this.f46783b, e);
            this.f46788g.f21269a.mo19372N().mo19294E(this.f46787f, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f46788g.f21269a.mo19372N().mo19294E(this.f46787f, bundle2);
            throw th;
        }
    }
}
