package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.a40;
import com.google.android.gms.internal.ads.co0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class NativeAdViewHolder {
    @RecentlyNonNull
    public static WeakHashMap<View, NativeAdViewHolder> zza = new WeakHashMap<>();
    @NotOnlyInitialized

    /* renamed from: a */
    private a40 f19904a;

    /* renamed from: b */
    private WeakReference<View> f19905b;

    public NativeAdViewHolder(@RecentlyNonNull View view, @RecentlyNonNull Map<String, View> map, @RecentlyNonNull Map<String, View> map2) {
        C4604n.m20099l(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            co0.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zza.get(view) != null) {
            co0.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zza.put(view, this);
            this.f19905b = new WeakReference<>(view);
            this.f19904a = C8241uv.m38462a().mo34797h(view, m19835a(map), m19835a(map2));
        }
    }

    /* renamed from: a */
    private static final HashMap<String, View> m19835a(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    public final void setClickConfirmingView(@RecentlyNonNull View view) {
        try {
            this.f19904a.mo18150O(C10489b.m48195m6(view));
        } catch (RemoteException e) {
            co0.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, d5.a] */
    public void setNativeAd(@RecentlyNonNull NativeAd nativeAd) {
        ? a = nativeAd.mo28824a();
        WeakReference<View> weakReference = this.f19905b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            co0.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        a40 a40 = this.f19904a;
        if (a40 != null) {
            try {
                a40.mo18149K(a);
            } catch (RemoteException e) {
                co0.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        a40 a40 = this.f19904a;
        if (a40 != null) {
            try {
                a40.zzd();
            } catch (RemoteException e) {
                co0.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.f19905b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
