package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bs2 {

    /* renamed from: a */
    public final zzbkq f30084a;

    /* renamed from: b */
    public final zzbtz f30085b;

    /* renamed from: c */
    public final cc2 f30086c;

    /* renamed from: d */
    public final zzbfd f30087d;

    /* renamed from: e */
    public final zzbfi f30088e;

    /* renamed from: f */
    public final String f30089f;

    /* renamed from: g */
    public final ArrayList<String> f30090g;

    /* renamed from: h */
    public final ArrayList<String> f30091h;

    /* renamed from: i */
    public final zzbnw f30092i;

    /* renamed from: j */
    public final zzbfo f30093j;

    /* renamed from: k */
    public final int f30094k;

    /* renamed from: l */
    public final AdManagerAdViewOptions f30095l;

    /* renamed from: m */
    public final PublisherAdViewOptions f30096m;

    /* renamed from: n */
    public final C8385yw f30097n;

    /* renamed from: o */
    public final qr2 f30098o;

    /* renamed from: p */
    public final boolean f30099p;

    /* renamed from: q */
    public final C7590cx f30100q;

    /* synthetic */ bs2(zr2 zr2, as2 as2) {
        zzbkq zzbkq;
        zzbnw zzbnw;
        this.f30088e = zr2.f42561b;
        this.f30089f = zr2.f42562c;
        this.f30100q = zr2.f42577r;
        int i = zr2.f42560a.f42940b;
        long j = zr2.f42560a.f42941c;
        Bundle bundle = zr2.f42560a.f42942d;
        int i2 = zr2.f42560a.f42943e;
        List<String> list = zr2.f42560a.f42944f;
        boolean z = zr2.f42560a.f42945g;
        int i3 = zr2.f42560a.f42946h;
        boolean z2 = true;
        if (!zr2.f42560a.f42947i && !zr2.f42564e) {
            z2 = false;
        }
        this.f30087d = new zzbfd(i, j, bundle, i2, list, z, i3, z2, zr2.f42560a.f42948j, zr2.f42560a.f42949k, zr2.f42560a.f42950l, zr2.f42560a.f42951m, zr2.f42560a.f42952n, zr2.f42560a.f42953o, zr2.f42560a.f42954p, zr2.f42560a.f42955q, zr2.f42560a.f42956r, zr2.f42560a.f42957s, zr2.f42560a.f42958t, zr2.f42560a.f42959u, zr2.f42560a.f42960v, zr2.f42560a.f42961w, zzt.zza(zr2.f42560a.f42962x), zr2.f42560a.f42963y);
        if (zr2.f42563d != null) {
            zzbkq = zr2.f42563d;
        } else {
            zzbkq = zr2.f42567h != null ? zr2.f42567h.f42998g : null;
        }
        this.f30084a = zzbkq;
        this.f30090g = zr2.f42565f;
        this.f30091h = zr2.f42566g;
        if (zr2.f42565f == null) {
            zzbnw = null;
        } else {
            zzbnw = zr2.f42567h == null ? new zzbnw(new NativeAdOptions.Builder().build()) : zr2.f42567h;
        }
        this.f30092i = zzbnw;
        this.f30093j = zr2.f42568i;
        this.f30094k = zr2.f42572m;
        this.f30095l = zr2.f42569j;
        this.f30096m = zr2.f42570k;
        this.f30097n = zr2.f42571l;
        this.f30085b = zr2.f42573n;
        this.f30098o = new qr2(zr2.f42574o, (pr2) null);
        this.f30099p = zr2.f42575p;
        this.f30086c = zr2.f42576q;
    }

    /* renamed from: a */
    public final i50 mo30795a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f30096m;
        if (publisherAdViewOptions == null && this.f30095l == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.f30095l.zza();
    }
}
