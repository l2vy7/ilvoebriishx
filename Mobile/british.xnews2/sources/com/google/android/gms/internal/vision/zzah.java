package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C9469b();

    /* renamed from: b */
    public final zzao[] f46031b;

    /* renamed from: c */
    public final zzab f46032c;

    /* renamed from: d */
    private final zzab f46033d;

    /* renamed from: e */
    private final zzab f46034e;

    /* renamed from: f */
    public final String f46035f;

    /* renamed from: g */
    private final float f46036g;

    /* renamed from: h */
    public final String f46037h;

    /* renamed from: i */
    private final int f46038i;

    /* renamed from: j */
    public final boolean f46039j;

    /* renamed from: k */
    public final int f46040k;

    /* renamed from: l */
    public final int f46041l;

    public zzah(zzao[] zzaoArr, zzab zzab, zzab zzab2, zzab zzab3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f46031b = zzaoArr;
        this.f46032c = zzab;
        this.f46033d = zzab2;
        this.f46034e = zzab3;
        this.f46035f = str;
        this.f46036g = f;
        this.f46037h = str2;
        this.f46038i = i;
        this.f46039j = z;
        this.f46040k = i2;
        this.f46041l = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49540z(parcel, 2, this.f46031b, i, false);
        C11058b.m49535u(parcel, 3, this.f46032c, i, false);
        C11058b.m49535u(parcel, 4, this.f46033d, i, false);
        C11058b.m49535u(parcel, 5, this.f46034e, i, false);
        C11058b.m49537w(parcel, 6, this.f46035f, false);
        C11058b.m49524j(parcel, 7, this.f46036g);
        C11058b.m49537w(parcel, 8, this.f46037h, false);
        C11058b.m49527m(parcel, 9, this.f46038i);
        C11058b.m49517c(parcel, 10, this.f46039j);
        C11058b.m49527m(parcel, 11, this.f46040k);
        C11058b.m49527m(parcel, 12, this.f46041l);
        C11058b.m49516b(parcel, a);
    }
}
