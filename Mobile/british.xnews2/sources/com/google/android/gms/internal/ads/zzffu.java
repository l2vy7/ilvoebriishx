package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import p256v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzffu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffu> CREATOR = new rt2();

    /* renamed from: b */
    private final ot2[] f21166b;
    @Nullable

    /* renamed from: c */
    public final Context f21167c;

    /* renamed from: d */
    private final int f21168d;

    /* renamed from: e */
    public final ot2 f21169e;

    /* renamed from: f */
    public final int f21170f;

    /* renamed from: g */
    public final int f21171g;

    /* renamed from: h */
    public final int f21172h;

    /* renamed from: i */
    public final String f21173i;

    /* renamed from: j */
    private final int f21174j;

    /* renamed from: k */
    private final int f21175k;

    /* renamed from: l */
    private final int[] f21176l;

    /* renamed from: m */
    private final int[] f21177m;

    /* renamed from: n */
    public final int f21178n;

    public zzffu(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        ot2[] values = ot2.values();
        this.f21166b = values;
        int[] a = pt2.m36213a();
        this.f21176l = a;
        int[] a2 = qt2.m36737a();
        this.f21177m = a2;
        this.f21167c = null;
        this.f21168d = i;
        this.f21169e = values[i];
        this.f21170f = i2;
        this.f21171g = i3;
        this.f21172h = i4;
        this.f21173i = str;
        this.f21174j = i5;
        this.f21178n = a[i5];
        this.f21175k = i6;
        int i7 = a2[i6];
    }

    /* renamed from: C0 */
    public static zzffu m21324C0(ot2 ot2, Context context) {
        if (ot2 == ot2.Rewarded) {
            return new zzffu(context, ot2, ((Integer) C8311wv.m39277c().mo18570b(p00.f36948O4)).intValue(), ((Integer) C8311wv.m39277c().mo18570b(p00.f36996U4)).intValue(), ((Integer) C8311wv.m39277c().mo18570b(p00.f37012W4)).intValue(), (String) C8311wv.m39277c().mo18570b(p00.f37028Y4), (String) C8311wv.m39277c().mo18570b(p00.f36964Q4), (String) C8311wv.m39277c().mo18570b(p00.f36980S4));
        } else if (ot2 == ot2.Interstitial) {
            return new zzffu(context, ot2, ((Integer) C8311wv.m39277c().mo18570b(p00.f36956P4)).intValue(), ((Integer) C8311wv.m39277c().mo18570b(p00.f37004V4)).intValue(), ((Integer) C8311wv.m39277c().mo18570b(p00.f37020X4)).intValue(), (String) C8311wv.m39277c().mo18570b(p00.f37036Z4), (String) C8311wv.m39277c().mo18570b(p00.f36972R4), (String) C8311wv.m39277c().mo18570b(p00.f36988T4));
        } else if (ot2 != ot2.AppOpen) {
            return null;
        } else {
            return new zzffu(context, ot2, ((Integer) C8311wv.m39277c().mo18570b(p00.f37063c5)).intValue(), ((Integer) C8311wv.m39277c().mo18570b(p00.f37081e5)).intValue(), ((Integer) C8311wv.m39277c().mo18570b(p00.f37090f5)).intValue(), (String) C8311wv.m39277c().mo18570b(p00.f37045a5), (String) C8311wv.m39277c().mo18570b(p00.f37054b5), (String) C8311wv.m39277c().mo18570b(p00.f37072d5));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f21168d);
        C11058b.m49527m(parcel, 2, this.f21170f);
        C11058b.m49527m(parcel, 3, this.f21171g);
        C11058b.m49527m(parcel, 4, this.f21172h);
        C11058b.m49537w(parcel, 5, this.f21173i, false);
        C11058b.m49527m(parcel, 6, this.f21174j);
        C11058b.m49527m(parcel, 7, this.f21175k);
        C11058b.m49516b(parcel, a);
    }

    private zzffu(@Nullable Context context, ot2 ot2, int i, int i2, int i3, String str, String str2, String str3) {
        this.f21166b = ot2.values();
        this.f21176l = pt2.m36213a();
        this.f21177m = qt2.m36737a();
        this.f21167c = context;
        this.f21168d = ot2.ordinal();
        this.f21169e = ot2;
        this.f21170f = i;
        this.f21171g = i2;
        this.f21172h = i3;
        this.f21173i = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.f21178n = i4;
        this.f21174j = i4 - 1;
        "onAdClosed".equals(str3);
        this.f21175k = 0;
    }
}
