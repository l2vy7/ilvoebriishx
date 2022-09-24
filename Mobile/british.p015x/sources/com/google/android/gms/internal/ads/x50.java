package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class x50 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f41036a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final NativeCustomTemplateAd.OnCustomClickListener f41037b;

    /* renamed from: c */
    private NativeCustomTemplateAd f41038c;

    public x50(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f41036a = onCustomTemplateAdLoadedListener;
        this.f41037b = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized NativeCustomTemplateAd m39375f(l40 l40) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f41038c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        m40 m40 = new m40(l40);
        this.f41038c = m40;
        return m40;
    }

    /* renamed from: d */
    public final v40 mo35722d() {
        if (this.f41037b == null) {
            return null;
        }
        return new u50(this, (t50) null);
    }

    /* renamed from: e */
    public final y40 mo35723e() {
        return new w50(this, (v50) null);
    }
}
