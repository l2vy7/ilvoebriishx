package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class r30 extends NativeAd.Image {

    /* renamed from: a */
    private final q30 f38522a;

    /* renamed from: b */
    private final Drawable f38523b;

    /* renamed from: c */
    private final Uri f38524c;

    /* renamed from: d */
    private final double f38525d;

    /* renamed from: e */
    private final int f38526e;

    /* renamed from: f */
    private final int f38527f;

    public r30(q30 q30) {
        Drawable drawable;
        double d;
        int i;
        this.f38522a = q30;
        Uri uri = null;
        try {
            C10487a zzf = q30.zzf();
            if (zzf != null) {
                drawable = (Drawable) C10489b.m48194f3(zzf);
                this.f38523b = drawable;
                uri = this.f38522a.zze();
                this.f38524c = uri;
                d = this.f38522a.zzb();
                this.f38525d = d;
                int i2 = -1;
                i = this.f38522a.zzd();
                this.f38526e = i;
                i2 = this.f38522a.zzc();
                this.f38527f = i2;
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        drawable = null;
        this.f38523b = drawable;
        try {
            uri = this.f38522a.zze();
        } catch (RemoteException e2) {
            co0.zzh("", e2);
        }
        this.f38524c = uri;
        try {
            d = this.f38522a.zzb();
        } catch (RemoteException e3) {
            co0.zzh("", e3);
            d = 1.0d;
        }
        this.f38525d = d;
        int i22 = -1;
        try {
            i = this.f38522a.zzd();
        } catch (RemoteException e4) {
            co0.zzh("", e4);
            i = -1;
        }
        this.f38526e = i;
        try {
            i22 = this.f38522a.zzc();
        } catch (RemoteException e5) {
            co0.zzh("", e5);
        }
        this.f38527f = i22;
    }

    public final Drawable getDrawable() {
        return this.f38523b;
    }

    public final double getScale() {
        return this.f38525d;
    }

    public final Uri getUri() {
        return this.f38524c;
    }

    public final int zza() {
        return this.f38527f;
    }

    public final int zzb() {
        return this.f38526e;
    }
}
