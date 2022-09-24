package com.google.ads.interactivemedia.p038v3.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Hide;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.apu */
/* compiled from: IMASDK */
public final class apu {

    /* renamed from: a */
    final /* synthetic */ apv f15542a;

    /* renamed from: b */
    private final byte[] f15543b;

    /* renamed from: c */
    private int f15544c;

    /* renamed from: d */
    private int f15545d;

    /* synthetic */ apu(apv apv, byte[] bArr) {
        this.f15542a = apv;
        this.f15543b = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo14196a() {
        try {
            apv apv = this.f15542a;
            if (apv.f15547b) {
                apv.f15546a.mo14201f(this.f15543b);
                this.f15542a.f15546a.mo14202g(this.f15544c);
                this.f15542a.f15546a.mo14203h(this.f15545d);
                this.f15542a.f15546a.mo14205j();
                this.f15542a.f15546a.mo14200e();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    /* renamed from: b */
    public final void mo14197b(int i) {
        this.f15545d = i;
    }

    /* renamed from: c */
    public final void mo14198c(int i) {
        this.f15544c = i;
    }
}
