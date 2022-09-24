package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class yf0 implements NativeCustomFormatAd.DisplayOpenMeasurement {

    /* renamed from: a */
    private final l40 f41852a;

    public yf0(l40 l40) {
        this.f41852a = l40;
        try {
            l40.zzl();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.f41852a.mo32836g0(C10489b.m48195m6(view));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final boolean start() {
        try {
            return this.f41852a.zzr();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }
}
