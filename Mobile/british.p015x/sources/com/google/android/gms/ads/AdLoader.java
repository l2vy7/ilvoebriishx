package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.C4618oy;
import com.google.android.gms.internal.ads.C7737gz;
import com.google.android.gms.internal.ads.C7807iu;
import com.google.android.gms.internal.ads.C7882kw;
import com.google.android.gms.internal.ads.C7993nw;
import com.google.android.gms.internal.ads.C8134ru;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.gg0;
import com.google.android.gms.internal.ads.ig0;
import com.google.android.gms.internal.ads.qc0;
import com.google.android.gms.internal.ads.x50;
import com.google.android.gms.internal.ads.z50;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbnw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class AdLoader {

    /* renamed from: a */
    private final C8134ru f27728a;

    /* renamed from: b */
    private final Context f27729b;

    /* renamed from: c */
    private final C7882kw f27730c;

    AdLoader(Context context, C7882kw kwVar, C8134ru ruVar) {
        this.f27729b = context;
        this.f27730c = kwVar;
        this.f27728a = ruVar;
    }

    /* renamed from: a */
    private final void m28775a(C4618oy oyVar) {
        try {
            this.f27730c.mo31966i4(this.f27728a.mo34626a(this.f27729b, oyVar));
        } catch (RemoteException e) {
            co0.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.f27730c.zzi();
        } catch (RemoteException e) {
            co0.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(@RecentlyNonNull AdRequest adRequest) {
        m28775a(adRequest.zza());
    }

    public void loadAds(@RecentlyNonNull AdRequest adRequest, int i) {
        try {
            this.f27730c.mo31967y0(this.f27728a.mo34626a(this.f27729b, adRequest.zza()), i);
        } catch (RemoteException e) {
            co0.zzh("Failed to load ads.", e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static class Builder {

        /* renamed from: a */
        private final Context f27731a;

        /* renamed from: b */
        private final C7993nw f27732b;

        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            C7993nw c = C8241uv.m38462a().mo34793c(context, str, new qc0());
            this.f27731a = (Context) C4604n.m20099l(context, "context cannot be null");
            this.f27732b = c;
        }

        @RecentlyNonNull
        public AdLoader build() {
            try {
                return new AdLoader(this.f27731a, this.f27732b.zze(), C8134ru.f38776a);
            } catch (RemoteException e) {
                co0.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.f27731a, new C7737gz().mo32308o6(), C8134ru.f38776a);
            }
        }

        @RecentlyNonNull
        public Builder forAdManagerAdView(@RecentlyNonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @RecentlyNonNull AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f27732b.mo32037H3(new z50(onAdManagerAdViewLoadedListener), new zzbfi(this.f27731a, adSizeArr));
            } catch (RemoteException e) {
                co0.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder forCustomFormatAd(@RecentlyNonNull String str, @RecentlyNonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            gg0 gg0 = new gg0(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.f27732b.mo32047r2(str, gg0.mo32124b(), gg0.mo32123a());
            } catch (RemoteException e) {
                co0.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder forCustomTemplateAd(@RecentlyNonNull String str, @RecentlyNonNull NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            x50 x50 = new x50(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.f27732b.mo32047r2(str, x50.mo35723e(), x50.mo35722d());
            } catch (RemoteException e) {
                co0.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder forNativeAd(@RecentlyNonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f27732b.mo32039P2(new ig0(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                co0.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder forUnifiedNativeAd(@RecentlyNonNull UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.f27732b.mo32039P2(new a60(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                co0.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder withAdListener(@RecentlyNonNull AdListener adListener) {
            try {
                this.f27732b.mo32038N5(new C7807iu(adListener));
            } catch (RemoteException e) {
                co0.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder withAdManagerAdViewOptions(@RecentlyNonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.f27732b.mo32044Y5(adManagerAdViewOptions);
            } catch (RemoteException e) {
                co0.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder withNativeAdOptions(@RecentlyNonNull NativeAdOptions nativeAdOptions) {
            try {
                this.f27732b.mo32048y2(new zzbnw(nativeAdOptions));
            } catch (RemoteException e) {
                co0.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder withNativeAdOptions(@RecentlyNonNull com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.f27732b.mo32048y2(new zzbnw(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzbkq(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e) {
                co0.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public void loadAd(@RecentlyNonNull AdManagerAdRequest adManagerAdRequest) {
        m28775a(adManagerAdRequest.f19843a);
    }
}
