package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import p199d5.C10487a;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.bz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7556bz implements MediaContent {

    /* renamed from: a */
    private final n30 f30174a;

    /* renamed from: b */
    private final VideoController f30175b = new VideoController();

    public C7556bz(n30 n30) {
        this.f30174a = n30;
    }

    /* renamed from: a */
    public final n30 mo30826a() {
        return this.f30174a;
    }

    public final float getAspectRatio() {
        try {
            return this.f30174a.zze();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.f30174a.zzf();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.f30174a.zzg();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            C10487a zzi = this.f30174a.zzi();
            if (zzi != null) {
                return (Drawable) C10489b.m48194f3(zzi);
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f30174a.zzh() != null) {
                this.f30175b.zzb(this.f30174a.zzh());
            }
        } catch (RemoteException e) {
            co0.zzh("Exception occurred while getting video controller", e);
        }
        return this.f30175b;
    }

    public final boolean hasVideoContent() {
        try {
            return this.f30174a.zzk();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.f30174a.zzj(C10489b.m48195m6(drawable));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
