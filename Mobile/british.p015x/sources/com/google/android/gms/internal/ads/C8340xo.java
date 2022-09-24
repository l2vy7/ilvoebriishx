package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.xo */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8340xo extends AppOpenAd {

    /* renamed from: a */
    private final C7546bp f41234a;

    /* renamed from: b */
    private final String f41235b;

    /* renamed from: c */
    private final C8377yo f41236c = new C8377yo();

    /* renamed from: d */
    FullScreenContentCallback f41237d;

    /* renamed from: e */
    private OnPaidEventListener f41238e;

    public C8340xo(C7546bp bpVar, String str) {
        this.f41234a = bpVar;
        this.f41235b = str;
    }

    public final String getAdUnitId() {
        return this.f41235b;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f41237d;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f41238e;
    }

    public final ResponseInfo getResponseInfo() {
        C7663ey eyVar;
        try {
            eyVar = this.f41234a.zzf();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            eyVar = null;
        }
        return ResponseInfo.zzb(eyVar);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f41237d = fullScreenContentCallback;
        this.f41236c.mo35950n6(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.f41234a.mo30755e0(z);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f41238e = onPaidEventListener;
        try {
            this.f41234a.mo30754N4(new C8139rz(onPaidEventListener));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity) {
        try {
            this.f41234a.mo30757m1(C10489b.m48195m6(activity), this.f41236c);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
