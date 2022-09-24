package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcjf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcjf> CREATOR = new jo0();

    /* renamed from: b */
    public String f43036b;

    /* renamed from: c */
    public int f43037c;

    /* renamed from: d */
    public int f43038d;

    /* renamed from: e */
    public boolean f43039e;

    /* renamed from: f */
    public boolean f43040f;

    public zzcjf(int i, int i2, boolean z, boolean z2) {
        this(214106000, i2, true, false, false);
    }

    /* renamed from: C0 */
    public static zzcjf m40656C0() {
        return new zzcjf((int) C7355d.f29215a, (int) C7355d.f29215a, true, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f43036b, false);
        C11058b.m49527m(parcel, 3, this.f43037c);
        C11058b.m49527m(parcel, 4, this.f43038d);
        C11058b.m49517c(parcel, 5, this.f43039e);
        C11058b.m49517c(parcel, 6, this.f43040f);
        C11058b.m49516b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcjf(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r0 = r11.length()
            int r0 = r0 + 36
            r12.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = "."
            r12.append(r0)
            r12.append(r9)
            r12.append(r0)
            r12.append(r11)
            java.lang.String r2 = r12.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjf.<init>(int, int, boolean, boolean, boolean):void");
    }

    zzcjf(String str, int i, int i2, boolean z, boolean z2) {
        this.f43036b = str;
        this.f43037c = i;
        this.f43038d = i2;
        this.f43039e = z;
        this.f43040f = z2;
    }
}
