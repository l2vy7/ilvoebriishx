package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x52 implements a52<m41, rs2, p62> {

    /* renamed from: a */
    private final Context f41042a;

    /* renamed from: b */
    private final k51 f41043b;

    /* renamed from: c */
    private final Executor f41044c;

    public x52(Context context, k51 k51, Executor executor) {
        this.f41042a = context;
        this.f41043b = k51;
        this.f41044c = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo30307a(com.google.android.gms.internal.ads.ur2 r7, com.google.android.gms.internal.ads.ir2 r8, com.google.android.gms.internal.ads.u42 r9) throws com.google.android.gms.internal.ads.gs2, com.google.android.gms.internal.ads.l82 {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36901I5
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.f33473e0
            if (r0 == 0) goto L_0x0077
            AdapterT r0 = r9.f39763b
            com.google.android.gms.internal.ads.rs2 r0 = (com.google.android.gms.internal.ads.rs2) r0
            com.google.android.gms.internal.ads.cd0 r0 = r0.mo34602f()
            if (r0 == 0) goto L_0x0067
            d5.a r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = p198d5.C10489b.m48194f3(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.mb3 r0 = com.google.android.gms.internal.ads.bb3.m30649i(r1)
            com.google.android.gms.internal.ads.w52 r3 = new com.google.android.gms.internal.ads.w52
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.nb3 r2 = com.google.android.gms.internal.ads.po0.f37726e
            com.google.android.gms.internal.ads.mb3 r0 = com.google.android.gms.internal.ads.bb3.m30654n(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.gs2 r8 = new com.google.android.gms.internal.ads.gs2
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.gs2 r7 = new com.google.android.gms.internal.ads.gs2
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.gs2 r8 = new com.google.android.gms.internal.ads.gs2
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.co0.zzg(r7)
            com.google.android.gms.internal.ads.gs2 r8 = new com.google.android.gms.internal.ads.gs2
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            AdapterT r0 = r9.f39763b
            com.google.android.gms.internal.ads.rs2 r0 = (com.google.android.gms.internal.ads.rs2) r0
            android.view.View r2 = r0.mo34600d()
        L_0x007f:
            com.google.android.gms.internal.ads.k51 r0 = r6.f41043b
            com.google.android.gms.internal.ads.e71 r3 = new com.google.android.gms.internal.ads.e71
            java.lang.String r4 = r9.f39762a
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.u41 r7 = new com.google.android.gms.internal.ads.u41
            AdapterT r4 = r9.f39763b
            com.google.android.gms.internal.ads.rs2 r4 = (com.google.android.gms.internal.ads.rs2) r4
            com.google.android.gms.internal.ads.v52 r5 = new com.google.android.gms.internal.ads.v52
            r5.<init>(r4)
            java.util.List<com.google.android.gms.internal.ads.jr2> r8 = r8.f33496v
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.jr2 r8 = (com.google.android.gms.internal.ads.jr2) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.n41 r7 = r0.mo33031a(r3, r7)
            com.google.android.gms.internal.ads.ai1 r8 = r7.mo33628i()
            r8.mo30383E0(r2)
            com.google.android.gms.internal.ads.mb1 r8 = r7.mo32496c()
            com.google.android.gms.internal.ads.z11 r0 = new com.google.android.gms.internal.ads.z11
            AdapterT r1 = r9.f39763b
            com.google.android.gms.internal.ads.rs2 r1 = (com.google.android.gms.internal.ads.rs2) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.f41044c
            r8.mo30921s0(r0, r1)
            ListenerT r8 = r9.f39764c
            com.google.android.gms.internal.ads.p62 r8 = (com.google.android.gms.internal.ads.p62) r8
            com.google.android.gms.internal.ads.y92 r9 = r7.mo32806g()
            r8.mo34075o6(r9)
            com.google.android.gms.internal.ads.m41 r7 = r7.mo33627h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x52.mo30307a(com.google.android.gms.internal.ads.ur2, com.google.android.gms.internal.ads.ir2, com.google.android.gms.internal.ads.u42):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<rs2, p62> u42) throws gs2 {
        zzbfi a;
        zzbfi zzbfi = ur2.f39936a.f38765a.f30088e;
        if (zzbfi.f42977o) {
            a = new zzbfi(this.f41042a, zza.zzd(zzbfi.f42968f, zzbfi.f42965c));
        } else {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36901I5)).booleanValue() || !ir2.f33473e0) {
                a = fs2.m32243a(this.f41042a, ir2.f33496v);
            } else {
                a = new zzbfi(this.f41042a, zza.zze(zzbfi.f42968f, zzbfi.f42965c));
            }
        }
        zzbfi zzbfi2 = a;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36901I5)).booleanValue() || !ir2.f33473e0) {
            ((rs2) u42.f39763b).mo34611o(this.f41042a, zzbfi2, ur2.f39936a.f38765a.f30087d, ir2.f33497w.toString(), zzby.zzl(ir2.f33494t), (zc0) u42.f39764c);
        } else {
            ((rs2) u42.f39763b).mo34612p(this.f41042a, zzbfi2, ur2.f39936a.f38765a.f30087d, ir2.f33497w.toString(), zzby.zzl(ir2.f33494t), (zc0) u42.f39764c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo35725c(View view, ir2 ir2, Object obj) throws Exception {
        return bb3.m30649i(d61.m31252a(this.f41042a, view, ir2));
    }
}
