package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.kq */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7876kq {

    /* renamed from: a */
    private final byte[] f34417a;

    /* renamed from: b */
    private int f34418b;

    /* renamed from: c */
    final /* synthetic */ C7913lq f34419c;

    /* synthetic */ C7876kq(C7913lq lqVar, byte[] bArr, C7839jq jqVar) {
        this.f34419c = lqVar;
        this.f34417a = bArr;
    }

    /* renamed from: a */
    public final C7876kq mo33149a(int i) {
        this.f34418b = i;
        return this;
    }

    /* renamed from: b */
    public final synchronized void mo33150b() {
        try {
            C7913lq lqVar = this.f34419c;
            if (lqVar.f35183b) {
                lqVar.f35182a.mo35406L(this.f34417a);
                this.f34419c.f35182a.mo35409o(0);
                this.f34419c.f35182a.mo35408k(this.f34418b);
                this.f34419c.f35182a.mo35407U((int[]) null);
                this.f34419c.f35182a.zzf();
            }
        } catch (RemoteException e) {
            co0.zzf("Clearcut log failed", e);
        }
    }
}
