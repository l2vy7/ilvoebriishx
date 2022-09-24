package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.C7556bz;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.n30;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.u30;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class NativeAdView extends FrameLayout {
    @NotOnlyInitialized

    /* renamed from: b */
    private final FrameLayout f19902b;
    @NotOnlyInitialized

    /* renamed from: c */
    private final u30 f19903c = m19830e();

    public NativeAdView(@RecentlyNonNull Context context) {
        super(context);
        this.f19902b = m19829d(context);
    }

    /* renamed from: d */
    private final FrameLayout m19829d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    /* renamed from: e */
    private final u30 m19830e() {
        if (isInEditMode()) {
            return null;
        }
        return C8241uv.m38462a().mo34796g(this.f19902b.getContext(), this, this.f19902b);
    }

    /* renamed from: f */
    private final void m19831f(String str, View view) {
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                u30.mo31332C2(str, C10489b.m48195m6(view));
            } catch (RemoteException e) {
                co0.zzh("Unable to call setAssetView on delegate", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: a */
    public final View mo17731a(@RecentlyNonNull String str) {
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                C10487a a = u30.mo31337a(str);
                if (a != null) {
                    return (View) C10489b.m48194f3(a);
                }
            } catch (RemoteException e) {
                co0.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final void addView(@RecentlyNonNull View view, int i, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f19902b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo17733b(MediaContent mediaContent) {
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                if (mediaContent instanceof C7556bz) {
                    u30.mo31336U2(((C7556bz) mediaContent).mo30826a());
                } else if (mediaContent == null) {
                    u30.mo31336U2((n30) null);
                } else {
                    co0.zze("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e) {
                co0.zzh("Unable to call setMediaContent on delegate", e);
            }
        }
    }

    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f19902b;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo17735c(ImageView.ScaleType scaleType) {
        u30 u30 = this.f19903c;
        if (u30 != null && scaleType != null) {
            try {
                u30.mo31335S1(C10489b.m48195m6(scaleType));
            } catch (RemoteException e) {
                co0.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public void destroy() {
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                u30.zzc();
            } catch (RemoteException e) {
                co0.zzh("Unable to destroy native ad view", e);
            }
        }
    }

    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        u30 u30;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37087f2)).booleanValue() && (u30 = this.f19903c) != null) {
            try {
                u30.mo31333D(C10489b.m48195m6(motionEvent));
            } catch (RemoteException e) {
                co0.zzh("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public AdChoicesView getAdChoicesView() {
        View a = mo17731a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return mo17731a("3005");
    }

    @RecentlyNullable
    public final View getBodyView() {
        return mo17731a("3004");
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return mo17731a("3002");
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return mo17731a("3001");
    }

    @RecentlyNullable
    public final View getIconView() {
        return mo17731a("3003");
    }

    @RecentlyNullable
    public final View getImageView() {
        return mo17731a("3008");
    }

    @RecentlyNullable
    public final MediaView getMediaView() {
        View a = mo17731a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a == null) {
            return null;
        }
        co0.zze("View is not an instance of MediaView");
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return mo17731a("3007");
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return mo17731a("3009");
    }

    @RecentlyNullable
    public final View getStoreView() {
        return mo17731a("3006");
    }

    public final void onVisibilityChanged(@RecentlyNonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                u30.mo31331A(C10489b.m48195m6(view), i);
            } catch (RemoteException e) {
                co0.zzh("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f19902b);
    }

    public final void removeView(@RecentlyNonNull View view) {
        if (this.f19902b != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        m19831f("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        m19831f("3005", view);
    }

    public final void setBodyView(View view) {
        m19831f("3004", view);
    }

    public final void setCallToActionView(View view) {
        m19831f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                u30.mo31338k0(C10489b.m48195m6(view));
            } catch (RemoteException e) {
                co0.zzh("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        m19831f("3001", view);
    }

    public final void setIconView(View view) {
        m19831f("3003", view);
    }

    public final void setImageView(View view) {
        m19831f("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m19831f("3010", mediaView);
        if (mediaView != null) {
            mediaView.mo28820a(new zzb(this));
            mediaView.mo28821b(new zzc(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, d5.a] */
    public void setNativeAd(@RecentlyNonNull NativeAd nativeAd) {
        u30 u30 = this.f19903c;
        if (u30 != null) {
            try {
                u30.mo31334I2(nativeAd.mo28824a());
            } catch (RemoteException e) {
                co0.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        m19831f("3007", view);
    }

    public final void setStarRatingView(View view) {
        m19831f("3009", view);
    }

    public final void setStoreView(View view) {
        m19831f("3006", view);
    }

    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19902b = m19829d(context);
    }

    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19902b = m19829d(context);
    }

    @TargetApi(21)
    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f19902b = m19829d(context);
    }
}
