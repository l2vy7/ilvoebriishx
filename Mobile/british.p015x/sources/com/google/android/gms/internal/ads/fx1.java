package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fx1 implements nw1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f32011a;

    /* renamed from: b */
    private final String f32012b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final uw1 f32013c;

    /* renamed from: d */
    private final zq2 f32014d;

    fx1(long j, Context context, uw1 uw1, uv0 uv0, String str) {
        this.f32011a = j;
        this.f32012b = str;
        this.f32013c = uw1;
        br2 B = uv0.mo35280B();
        B.mo30791a(context);
        B.zza(str);
        this.f32014d = B.zzc().zza();
    }

    /* renamed from: a */
    public final void mo30811a(zzbfd zzbfd) {
        try {
            this.f32014d.mo30685G1(zzbfd, new dx1(this));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza() {
    }

    public final void zzc() {
        try {
            this.f32014d.mo30688Y2(new ex1(this));
            this.f32014d.mo30692p0(C10489b.m48195m6(null));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
