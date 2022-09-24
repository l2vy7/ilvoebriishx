package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p256v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcdc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdc> CREATOR = new ji0();

    /* renamed from: A */
    public final List<String> f21090A;

    /* renamed from: B */
    public final long f21091B;

    /* renamed from: C */
    public final String f21092C;

    /* renamed from: D */
    public final float f21093D;

    /* renamed from: E */
    public final int f21094E;

    /* renamed from: F */
    public final int f21095F;

    /* renamed from: G */
    public final boolean f21096G;

    /* renamed from: H */
    public final String f21097H;

    /* renamed from: I */
    public final boolean f21098I;

    /* renamed from: J */
    public final String f21099J;

    /* renamed from: K */
    public final boolean f21100K;

    /* renamed from: L */
    public final int f21101L;

    /* renamed from: M */
    public final Bundle f21102M;

    /* renamed from: N */
    public final String f21103N;

    /* renamed from: O */
    public final zzbjd f21104O;

    /* renamed from: P */
    public final boolean f21105P;

    /* renamed from: Q */
    public final Bundle f21106Q;

    /* renamed from: R */
    public final String f21107R;

    /* renamed from: S */
    public final String f21108S;

    /* renamed from: T */
    public final String f21109T;

    /* renamed from: U */
    public final boolean f21110U;

    /* renamed from: V */
    public final List<Integer> f21111V;

    /* renamed from: W */
    public final String f21112W;

    /* renamed from: X */
    public final List<String> f21113X;

    /* renamed from: Y */
    public final int f21114Y;

    /* renamed from: Z */
    public final boolean f21115Z;

    /* renamed from: b */
    public final int f21116b;

    /* renamed from: c */
    public final Bundle f21117c;

    /* renamed from: d */
    public final zzbfd f21118d;

    /* renamed from: e */
    public final zzbfi f21119e;

    /* renamed from: f */
    public final String f21120f;

    /* renamed from: g */
    public final ApplicationInfo f21121g;

    /* renamed from: h */
    public final PackageInfo f21122h;

    /* renamed from: i */
    public final String f21123i;

    /* renamed from: j */
    public final String f21124j;

    /* renamed from: k */
    public final String f21125k;

    /* renamed from: l */
    public final zzcjf f21126l;

    /* renamed from: l0 */
    public final boolean f21127l0;

    /* renamed from: m */
    public final Bundle f21128m;

    /* renamed from: m0 */
    public final boolean f21129m0;

    /* renamed from: n */
    public final int f21130n;

    /* renamed from: n0 */
    public final ArrayList<String> f21131n0;

    /* renamed from: o */
    public final List<String> f21132o;

    /* renamed from: o0 */
    public final String f21133o0;

    /* renamed from: p */
    public final Bundle f21134p;

    /* renamed from: p0 */
    public final zzbtz f21135p0;

    /* renamed from: q */
    public final boolean f21136q;

    /* renamed from: q0 */
    public final String f21137q0;

    /* renamed from: r */
    public final int f21138r;

    /* renamed from: r0 */
    public final Bundle f21139r0;

    /* renamed from: s */
    public final int f21140s;

    /* renamed from: t */
    public final float f21141t;

    /* renamed from: u */
    public final String f21142u;

    /* renamed from: v */
    public final long f21143v;

    /* renamed from: w */
    public final String f21144w;

    /* renamed from: x */
    public final List<String> f21145x;

    /* renamed from: y */
    public final String f21146y;

    /* renamed from: z */
    public final zzbnw f21147z;

    zzcdc(int i, Bundle bundle, zzbfd zzbfd, zzbfi zzbfi, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzcjf zzcjf, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzbnw zzbnw, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, zzbjd zzbjd, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List<Integer> list4, String str15, List<String> list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList<String> arrayList, String str16, zzbtz zzbtz, String str17, Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f21116b = i;
        this.f21117c = bundle;
        this.f21118d = zzbfd;
        this.f21119e = zzbfi;
        this.f21120f = str;
        this.f21121g = applicationInfo;
        this.f21122h = packageInfo;
        this.f21123i = str2;
        this.f21124j = str3;
        this.f21125k = str4;
        this.f21126l = zzcjf;
        this.f21128m = bundle2;
        this.f21130n = i2;
        this.f21132o = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.f21090A = list6;
        this.f21134p = bundle3;
        this.f21136q = z;
        this.f21138r = i3;
        this.f21140s = i4;
        this.f21141t = f;
        this.f21142u = str5;
        this.f21143v = j;
        this.f21144w = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.f21145x = list7;
        this.f21146y = str7;
        this.f21147z = zzbnw;
        this.f21091B = j2;
        this.f21092C = str8;
        this.f21093D = f2;
        this.f21098I = z2;
        this.f21094E = i5;
        this.f21095F = i6;
        this.f21096G = z3;
        this.f21097H = str9;
        this.f21099J = str10;
        this.f21100K = z4;
        this.f21101L = i7;
        this.f21102M = bundle4;
        this.f21103N = str11;
        this.f21104O = zzbjd;
        this.f21105P = z5;
        this.f21106Q = bundle5;
        this.f21107R = str12;
        this.f21108S = str13;
        this.f21109T = str14;
        this.f21110U = z6;
        this.f21111V = list4;
        this.f21112W = str15;
        this.f21113X = list5;
        this.f21114Y = i8;
        this.f21115Z = z7;
        this.f21127l0 = z8;
        this.f21129m0 = z9;
        this.f21131n0 = arrayList;
        this.f21133o0 = str16;
        this.f21135p0 = zzbtz;
        this.f21137q0 = str17;
        this.f21139r0 = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f21116b);
        C11058b.m49519e(parcel, 2, this.f21117c, false);
        C11058b.m49535u(parcel, 3, this.f21118d, i, false);
        C11058b.m49535u(parcel, 4, this.f21119e, i, false);
        C11058b.m49537w(parcel, 5, this.f21120f, false);
        C11058b.m49535u(parcel, 6, this.f21121g, i, false);
        C11058b.m49535u(parcel, 7, this.f21122h, i, false);
        C11058b.m49537w(parcel, 8, this.f21123i, false);
        C11058b.m49537w(parcel, 9, this.f21124j, false);
        C11058b.m49537w(parcel, 10, this.f21125k, false);
        C11058b.m49535u(parcel, 11, this.f21126l, i, false);
        C11058b.m49519e(parcel, 12, this.f21128m, false);
        C11058b.m49527m(parcel, 13, this.f21130n);
        C11058b.m49539y(parcel, 14, this.f21132o, false);
        C11058b.m49519e(parcel, 15, this.f21134p, false);
        C11058b.m49517c(parcel, 16, this.f21136q);
        C11058b.m49527m(parcel, 18, this.f21138r);
        C11058b.m49527m(parcel, 19, this.f21140s);
        C11058b.m49524j(parcel, 20, this.f21141t);
        C11058b.m49537w(parcel, 21, this.f21142u, false);
        C11058b.m49531q(parcel, 25, this.f21143v);
        C11058b.m49537w(parcel, 26, this.f21144w, false);
        C11058b.m49539y(parcel, 27, this.f21145x, false);
        C11058b.m49537w(parcel, 28, this.f21146y, false);
        C11058b.m49535u(parcel, 29, this.f21147z, i, false);
        C11058b.m49539y(parcel, 30, this.f21090A, false);
        C11058b.m49531q(parcel, 31, this.f21091B);
        C11058b.m49537w(parcel, 33, this.f21092C, false);
        C11058b.m49524j(parcel, 34, this.f21093D);
        C11058b.m49527m(parcel, 35, this.f21094E);
        C11058b.m49527m(parcel, 36, this.f21095F);
        C11058b.m49517c(parcel, 37, this.f21096G);
        C11058b.m49537w(parcel, 39, this.f21097H, false);
        C11058b.m49517c(parcel, 40, this.f21098I);
        C11058b.m49537w(parcel, 41, this.f21099J, false);
        C11058b.m49517c(parcel, 42, this.f21100K);
        C11058b.m49527m(parcel, 43, this.f21101L);
        C11058b.m49519e(parcel, 44, this.f21102M, false);
        C11058b.m49537w(parcel, 45, this.f21103N, false);
        C11058b.m49535u(parcel, 46, this.f21104O, i, false);
        C11058b.m49517c(parcel, 47, this.f21105P);
        C11058b.m49519e(parcel, 48, this.f21106Q, false);
        C11058b.m49537w(parcel, 49, this.f21107R, false);
        C11058b.m49537w(parcel, 50, this.f21108S, false);
        C11058b.m49537w(parcel, 51, this.f21109T, false);
        C11058b.m49517c(parcel, 52, this.f21110U);
        C11058b.m49529o(parcel, 53, this.f21111V, false);
        C11058b.m49537w(parcel, 54, this.f21112W, false);
        C11058b.m49539y(parcel, 55, this.f21113X, false);
        C11058b.m49527m(parcel, 56, this.f21114Y);
        C11058b.m49517c(parcel, 57, this.f21115Z);
        C11058b.m49517c(parcel, 58, this.f21127l0);
        C11058b.m49517c(parcel, 59, this.f21129m0);
        C11058b.m49539y(parcel, 60, this.f21131n0, false);
        C11058b.m49537w(parcel, 61, this.f21133o0, false);
        C11058b.m49535u(parcel, 63, this.f21135p0, i, false);
        C11058b.m49537w(parcel, 64, this.f21137q0, false);
        C11058b.m49519e(parcel, 65, this.f21139r0, false);
        C11058b.m49516b(parcel, a);
    }
}
