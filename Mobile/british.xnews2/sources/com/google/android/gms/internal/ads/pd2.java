package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pd2 implements yi2<Bundle> {

    /* renamed from: a */
    public final zzbfi f37591a;

    /* renamed from: b */
    public final String f37592b;

    /* renamed from: c */
    public final boolean f37593c;

    /* renamed from: d */
    public final String f37594d;

    /* renamed from: e */
    public final float f37595e;

    /* renamed from: f */
    public final int f37596f;

    /* renamed from: g */
    public final int f37597g;

    /* renamed from: h */
    public final String f37598h;

    /* renamed from: i */
    public final boolean f37599i;

    public pd2(zzbfi zzbfi, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        C4604n.m20099l(zzbfi, "the adSize must not be null");
        this.f37591a = zzbfi;
        this.f37592b = str;
        this.f37593c = z;
        this.f37594d = str2;
        this.f37595e = f;
        this.f37596f = i;
        this.f37597g = i2;
        this.f37598h = str3;
        this.f37599i = z2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        ms2.m34893g(bundle, "smart_w", "full", this.f37591a.f42968f == -1);
        ms2.m34893g(bundle, "smart_h", TtmlNode.TEXT_EMPHASIS_AUTO, this.f37591a.f42965c == -2);
        Boolean bool = Boolean.TRUE;
        ms2.m34891e(bundle, "ene", bool, this.f37591a.f42973k);
        ms2.m34893g(bundle, "rafmt", "102", this.f37591a.f42976n);
        ms2.m34893g(bundle, "rafmt", "103", this.f37591a.f42977o);
        ms2.m34893g(bundle, "rafmt", "105", this.f37591a.f42978p);
        ms2.m34891e(bundle, "inline_adaptive_slot", bool, this.f37599i);
        ms2.m34891e(bundle, "interscroller_slot", bool, this.f37591a.f42978p);
        ms2.m34889c(bundle, "format", this.f37592b);
        ms2.m34893g(bundle, "fluid", "height", this.f37593c);
        String str = this.f37594d;
        ms2.m34893g(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f37595e);
        bundle.putInt("sw", this.f37596f);
        bundle.putInt("sh", this.f37597g);
        String str2 = this.f37598h;
        ms2.m34893g(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzbfi[] zzbfiArr = this.f37591a.f42970h;
        if (zzbfiArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f37591a.f42965c);
            bundle2.putInt("width", this.f37591a.f42968f);
            bundle2.putBoolean("is_fluid_height", this.f37591a.f42972j);
            arrayList.add(bundle2);
        } else {
            for (zzbfi zzbfi : zzbfiArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzbfi.f42972j);
                bundle3.putInt("height", zzbfi.f42965c);
                bundle3.putInt("width", zzbfi.f42968f);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
