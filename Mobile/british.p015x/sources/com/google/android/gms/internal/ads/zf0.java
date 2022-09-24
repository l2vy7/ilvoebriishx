package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zf0 extends NativeAd.Image {

    /* renamed from: a */
    private final q30 f42457a;

    /* renamed from: b */
    private final Drawable f42458b;

    /* renamed from: c */
    private final Uri f42459c;

    /* renamed from: d */
    private final double f42460d;

    public zf0(q30 q30) {
        Drawable drawable;
        double d;
        this.f42457a = q30;
        Uri uri = null;
        try {
            C10487a zzf = q30.zzf();
            if (zzf != null) {
                drawable = (Drawable) C10489b.m48194f3(zzf);
                this.f42458b = drawable;
                uri = this.f42457a.zze();
                this.f42459c = uri;
                d = this.f42457a.zzb();
                this.f42460d = d;
                this.f42457a.zzd();
                this.f42457a.zzc();
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        drawable = null;
        this.f42458b = drawable;
        try {
            uri = this.f42457a.zze();
        } catch (RemoteException e2) {
            co0.zzh("", e2);
        }
        this.f42459c = uri;
        try {
            d = this.f42457a.zzb();
        } catch (RemoteException e3) {
            co0.zzh("", e3);
            d = 1.0d;
        }
        this.f42460d = d;
        try {
            this.f42457a.zzd();
        } catch (RemoteException e4) {
            co0.zzh("", e4);
        }
        try {
            this.f42457a.zzc();
        } catch (RemoteException e5) {
            co0.zzh("", e5);
        }
    }

    public final Drawable getDrawable() {
        return this.f42458b;
    }

    public final double getScale() {
        return this.f42460d;
    }

    public final Uri getUri() {
        return this.f42459c;
    }
}
