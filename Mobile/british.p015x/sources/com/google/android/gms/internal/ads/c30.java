package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class c30 extends p30 {

    /* renamed from: b */
    private final Drawable f30225b;

    /* renamed from: c */
    private final Uri f30226c;

    /* renamed from: d */
    private final double f30227d;

    /* renamed from: e */
    private final int f30228e;

    /* renamed from: f */
    private final int f30229f;

    public c30(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f30225b = drawable;
        this.f30226c = uri;
        this.f30227d = d;
        this.f30228e = i;
        this.f30229f = i2;
    }

    public final double zzb() {
        return this.f30227d;
    }

    public final int zzc() {
        return this.f30229f;
    }

    public final int zzd() {
        return this.f30228e;
    }

    public final Uri zze() throws RemoteException {
        return this.f30226c;
    }

    public final C10487a zzf() throws RemoteException {
        return C10489b.m48195m6(this.f30225b);
    }
}
