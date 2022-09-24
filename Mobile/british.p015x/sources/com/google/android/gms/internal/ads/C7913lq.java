package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.lq */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7913lq {

    /* renamed from: a */
    C8330xd f35182a;

    /* renamed from: b */
    boolean f35183b;

    public C7913lq() {
    }

    public C7913lq(Context context) {
        p00.m35913c(context);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37229v3)).booleanValue()) {
            try {
                this.f35182a = (C8330xd) ho0.m32903b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C7766hq.f32801a);
                C10489b.m48195m6(context);
                this.f35182a.mo35410z0(C10489b.m48195m6(context), "GMA_SDK");
                this.f35183b = true;
            } catch (RemoteException | go0 | NullPointerException unused) {
                co0.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
