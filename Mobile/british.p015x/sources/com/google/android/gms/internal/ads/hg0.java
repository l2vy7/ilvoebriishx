package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class hg0 implements NativeCustomFormatAd {

    /* renamed from: a */
    private final l40 f32720a;

    /* renamed from: b */
    private final MediaView f32721b;

    /* renamed from: c */
    private final VideoController f32722c = new VideoController();

    /* renamed from: d */
    private NativeCustomFormatAd.DisplayOpenMeasurement f32723d;

    public hg0(l40 l40) {
        Context context;
        this.f32720a = l40;
        MediaView mediaView = null;
        try {
            context = (Context) C10489b.m48194f3(l40.zzg());
        } catch (RemoteException | NullPointerException e) {
            co0.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.f32720a.mo32833W(C10489b.m48195m6(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
        }
        this.f32721b = mediaView;
    }

    public final void destroy() {
        try {
            this.f32720a.zzk();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f32720a.zzj();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.f32720a.zzh();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f32723d == null && this.f32720a.zzp()) {
                this.f32723d = new yf0(this.f32720a);
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return this.f32723d;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            q30 c = this.f32720a.mo32834c(str);
            if (c != null) {
                return new zf0(c);
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.f32720a.mo32835f0(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            C7774hy zze = this.f32720a.zze();
            if (zze != null) {
                this.f32722c.zzb(zze);
            }
        } catch (RemoteException e) {
            co0.zzh("Exception occurred while getting video controller", e);
        }
        return this.f32722c;
    }

    public final MediaView getVideoMediaView() {
        return this.f32721b;
    }

    public final void performClick(String str) {
        try {
            this.f32720a.mo32832P(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f32720a.zzn();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
