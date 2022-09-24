package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gg0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener f32298a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final NativeCustomFormatAd.OnCustomClickListener f32299b;

    /* renamed from: c */
    private NativeCustomFormatAd f32300c;

    public gg0(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.f32298a = onCustomFormatAdLoadedListener;
        this.f32299b = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized NativeCustomFormatAd m32513f(l40 l40) {
        NativeCustomFormatAd nativeCustomFormatAd = this.f32300c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        hg0 hg0 = new hg0(l40);
        this.f32300c = hg0;
        return hg0;
    }

    /* renamed from: a */
    public final v40 mo32123a() {
        if (this.f32299b == null) {
            return null;
        }
        return new cg0(this, (bg0) null);
    }

    /* renamed from: b */
    public final y40 mo32124b() {
        return new eg0(this, (dg0) null);
    }
}
