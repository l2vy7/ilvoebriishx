package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfi> CREATOR = new C8168su();

    /* renamed from: b */
    public final String f42964b;

    /* renamed from: c */
    public final int f42965c;

    /* renamed from: d */
    public final int f42966d;

    /* renamed from: e */
    public final boolean f42967e;

    /* renamed from: f */
    public final int f42968f;

    /* renamed from: g */
    public final int f42969g;

    /* renamed from: h */
    public final zzbfi[] f42970h;

    /* renamed from: i */
    public final boolean f42971i;

    /* renamed from: j */
    public final boolean f42972j;

    /* renamed from: k */
    public boolean f42973k;

    /* renamed from: l */
    public boolean f42974l;

    /* renamed from: m */
    public boolean f42975m;

    /* renamed from: n */
    public boolean f42976n;

    /* renamed from: o */
    public boolean f42977o;

    /* renamed from: p */
    public boolean f42978p;

    public zzbfi() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzbfi[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: C0 */
    public static int m40641C0(DisplayMetrics displayMetrics) {
        return (int) (((float) m40646H0(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: D0 */
    public static zzbfi m40642D0() {
        return new zzbfi("interstitial_mb", 0, 0, false, 0, 0, (zzbfi[]) null, false, false, false, false, true, false, false, false);
    }

    /* renamed from: E0 */
    public static zzbfi m40643E0() {
        return new zzbfi("320x50_mb", 0, 0, false, 0, 0, (zzbfi[]) null, true, false, false, false, false, false, false, false);
    }

    /* renamed from: F0 */
    public static zzbfi m40644F0() {
        return new zzbfi("reward_mb", 0, 0, true, 0, 0, (zzbfi[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: G0 */
    public static zzbfi m40645G0() {
        return new zzbfi("invalid", 0, 0, false, 0, 0, (zzbfi[]) null, false, false, false, true, false, false, false, false);
    }

    /* renamed from: H0 */
    private static int m40646H0(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f42964b, false);
        C11058b.m49527m(parcel, 3, this.f42965c);
        C11058b.m49527m(parcel, 4, this.f42966d);
        C11058b.m49517c(parcel, 5, this.f42967e);
        C11058b.m49527m(parcel, 6, this.f42968f);
        C11058b.m49527m(parcel, 7, this.f42969g);
        C11058b.m49540z(parcel, 8, this.f42970h, i, false);
        C11058b.m49517c(parcel, 9, this.f42971i);
        C11058b.m49517c(parcel, 10, this.f42972j);
        C11058b.m49517c(parcel, 11, this.f42973k);
        C11058b.m49517c(parcel, 12, this.f42974l);
        C11058b.m49517c(parcel, 13, this.f42975m);
        C11058b.m49517c(parcel, 14, this.f42976n);
        C11058b.m49517c(parcel, 15, this.f42977o);
        C11058b.m49517c(parcel, 16, this.f42978p);
        C11058b.m49516b(parcel, a);
    }

    public zzbfi(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbfi(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f42967e = r0
            boolean r2 = r1.isFluid()
            r12.f42972j = r2
            boolean r3 = com.google.android.gms.ads.zza.zzf(r1)
            r12.f42976n = r3
            boolean r3 = com.google.android.gms.ads.zza.zzg(r1)
            r12.f42977o = r3
            boolean r3 = com.google.android.gms.ads.zza.zzh(r1)
            r12.f42978p = r3
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r3 = r2.getWidth()
            r12.f42968f = r3
            int r2 = r2.getHeight()
            r12.f42965c = r2
            goto L_0x005d
        L_0x0031:
            boolean r2 = r12.f42977o
            if (r2 == 0) goto L_0x0042
            int r2 = r1.getWidth()
            r12.f42968f = r2
            int r2 = com.google.android.gms.ads.zza.zza(r1)
            r12.f42965c = r2
            goto L_0x005d
        L_0x0042:
            if (r3 == 0) goto L_0x0051
            int r2 = r1.getWidth()
            r12.f42968f = r2
            int r2 = com.google.android.gms.ads.zza.zzb(r1)
            r12.f42965c = r2
            goto L_0x005d
        L_0x0051:
            int r2 = r1.getWidth()
            r12.f42968f = r2
            int r2 = r1.getHeight()
            r12.f42965c = r2
        L_0x005d:
            int r3 = r12.f42968f
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r5 = -1
            if (r3 != r5) goto L_0x0136
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            android.content.res.Resources r6 = r13.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 == r7) goto L_0x007c
            goto L_0x0118
        L_0x007c:
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r7 = r6.heightPixels
            float r7 = (float) r7
            float r6 = r6.density
            float r7 = r7 / r6
            int r6 = (int) r7
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L_0x0118
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            java.lang.String r7 = "window"
            java.lang.Object r7 = r13.getSystemService(r7)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            if (r7 == 0) goto L_0x0118
            android.view.Display r7 = r7.getDefaultDisplay()
            boolean r8 = p006a5.C6492o.m28281d()
            if (r8 == 0) goto L_0x00b6
            r7.getRealMetrics(r6)
            int r8 = r6.heightPixels
            int r9 = r6.widthPixels
            goto L_0x00ea
        L_0x00b6:
            java.lang.Class<android.view.Display> r8 = android.view.Display.class
            java.lang.String r9 = "getRawHeight"
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ Exception -> 0x0118 }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.Object r8 = r8.invoke(r7, r9)     // Catch:{ Exception -> 0x0118 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<android.view.Display> r9 = android.view.Display.class
            java.lang.String r10 = "getRawWidth"
            java.lang.Class[] r11 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ Exception -> 0x0118 }
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.Object r9 = r9.invoke(r7, r10)     // Catch:{ Exception -> 0x0118 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x0118 }
            if (r8 != 0) goto L_0x00de
            r8 = 0
            goto L_0x00e2
        L_0x00de:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0118 }
        L_0x00e2:
            if (r9 != 0) goto L_0x00e6
            r9 = 0
            goto L_0x00ea
        L_0x00e6:
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0118 }
        L_0x00ea:
            r7.getMetrics(r6)
            int r7 = r6.heightPixels
            int r6 = r6.widthPixels
            if (r7 != r8) goto L_0x0118
            if (r6 != r9) goto L_0x0118
            int r6 = r4.widthPixels
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = "navigation_bar_width"
            java.lang.String r9 = "dimen"
            java.lang.String r10 = "android"
            int r7 = r7.getIdentifier(r8, r9, r10)
            if (r7 <= 0) goto L_0x0113
            android.content.res.Resources r8 = r13.getResources()
            int r7 = r8.getDimensionPixelSize(r7)
            goto L_0x0114
        L_0x0113:
            r7 = 0
        L_0x0114:
            int r6 = r6 - r7
            r12.f42969g = r6
            goto L_0x011c
        L_0x0118:
            int r6 = r4.widthPixels
            r12.f42969g = r6
        L_0x011c:
            float r6 = (float) r6
            float r7 = r4.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0143
            int r8 = r8 + 1
            goto L_0x0143
        L_0x0136:
            int r8 = r12.f42968f
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            int r6 = r12.f42968f
            int r6 = com.google.android.gms.internal.ads.vn0.m38852k(r4, r6)
            r12.f42969g = r6
        L_0x0143:
            r6 = -2
            if (r2 != r6) goto L_0x014b
            int r7 = m40646H0(r4)
            goto L_0x014d
        L_0x014b:
            int r7 = r12.f42965c
        L_0x014d:
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            int r4 = com.google.android.gms.internal.ads.vn0.m38852k(r4, r7)
            r12.f42966d = r4
            java.lang.String r4 = "_as"
            java.lang.String r9 = "x"
            r10 = 26
            if (r3 == r5) goto L_0x0194
            if (r2 != r6) goto L_0x0161
            goto L_0x0194
        L_0x0161:
            boolean r2 = r12.f42977o
            if (r2 != 0) goto L_0x0178
            boolean r2 = r12.f42978p
            if (r2 == 0) goto L_0x016a
            goto L_0x0178
        L_0x016a:
            boolean r2 = r12.f42972j
            if (r2 == 0) goto L_0x0171
            java.lang.String r1 = "320x50_mb"
            goto L_0x0191
        L_0x0171:
            java.lang.String r1 = r1.toString()
            r12.f42964b = r1
            goto L_0x01ab
        L_0x0178:
            int r1 = r12.f42968f
            int r2 = r12.f42965c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x0191:
            r12.f42964b = r1
            goto L_0x01ab
        L_0x0194:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r8)
            r1.append(r9)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r12.f42964b = r1
        L_0x01ab:
            int r1 = r14.length
            r2 = 1
            if (r1 <= r2) goto L_0x01c5
            com.google.android.gms.internal.ads.zzbfi[] r1 = new com.google.android.gms.internal.ads.zzbfi[r1]
            r12.f42970h = r1
            r1 = 0
        L_0x01b4:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x01c8
            com.google.android.gms.internal.ads.zzbfi[] r2 = r12.f42970h
            com.google.android.gms.internal.ads.zzbfi r3 = new com.google.android.gms.internal.ads.zzbfi
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x01b4
        L_0x01c5:
            r13 = 0
            r12.f42970h = r13
        L_0x01c8:
            r12.f42971i = r0
            r12.f42973k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfi.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    zzbfi(String str, int i, int i2, boolean z, int i3, int i4, zzbfi[] zzbfiArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f42964b = str;
        this.f42965c = i;
        this.f42966d = i2;
        this.f42967e = z;
        this.f42968f = i3;
        this.f42969g = i4;
        this.f42970h = zzbfiArr;
        this.f42971i = z2;
        this.f42972j = z3;
        this.f42973k = z4;
        this.f42974l = z5;
        this.f42975m = z6;
        this.f42976n = z7;
        this.f42977o = z8;
        this.f42978p = z9;
    }
}
