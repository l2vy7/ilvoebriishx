package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class k30 implements NativeCustomTemplateAd.DisplayOpenMeasurement {

    /* renamed from: a */
    private final l40 f34133a;

    public k30(l40 l40) {
        this.f34133a = l40;
        try {
            l40.zzl();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.f34133a.mo32836g0(C10489b.m48195m6(view));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final boolean start() {
        try {
            return this.f34133a.zzr();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }
}
