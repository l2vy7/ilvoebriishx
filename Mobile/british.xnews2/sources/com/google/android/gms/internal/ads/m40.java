package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import java.util.List;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class m40 implements NativeCustomTemplateAd {

    /* renamed from: a */
    private final l40 f35391a;

    /* renamed from: b */
    private final MediaView f35392b;

    /* renamed from: c */
    private final VideoController f35393c = new VideoController();

    /* renamed from: d */
    private NativeCustomTemplateAd.DisplayOpenMeasurement f35394d;

    public m40(l40 l40) {
        Context context;
        this.f35391a = l40;
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
                if (true == this.f35391a.mo32833W(C10489b.m48195m6(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
        }
        this.f35392b = mediaView;
    }

    /* renamed from: a */
    public final l40 mo33467a() {
        return this.f35391a;
    }

    public final void destroy() {
        try {
            this.f35391a.zzk();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f35391a.zzj();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f35391a.zzh();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f35394d == null && this.f35391a.zzp()) {
                this.f35394d = new k30(this.f35391a);
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return this.f35394d;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            q30 c = this.f35391a.mo32834c(str);
            if (c != null) {
                return new r30(c);
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.f35391a.mo32835f0(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            C7774hy zze = this.f35391a.zze();
            if (zze != null) {
                this.f35393c.zzb(zze);
            }
        } catch (RemoteException e) {
            co0.zzh("Exception occurred while getting video controller", e);
        }
        return this.f35393c;
    }

    public final MediaView getVideoMediaView() {
        return this.f35392b;
    }

    public final void performClick(String str) {
        try {
            this.f35391a.mo32832P(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f35391a.zzn();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
