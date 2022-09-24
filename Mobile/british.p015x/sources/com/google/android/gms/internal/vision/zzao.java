package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C9507f();

    /* renamed from: b */
    private final zzal[] f46043b;

    /* renamed from: c */
    public final zzab f46044c;

    /* renamed from: d */
    private final zzab f46045d;

    /* renamed from: e */
    public final String f46046e;

    /* renamed from: f */
    private final float f46047f;

    /* renamed from: g */
    public final String f46048g;

    /* renamed from: h */
    private final boolean f46049h;

    public zzao(zzal[] zzalArr, zzab zzab, zzab zzab2, String str, float f, String str2, boolean z) {
        this.f46043b = zzalArr;
        this.f46044c = zzab;
        this.f46045d = zzab2;
        this.f46046e = str;
        this.f46047f = f;
        this.f46048g = str2;
        this.f46049h = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49540z(parcel, 2, this.f46043b, i, false);
        C11058b.m49535u(parcel, 3, this.f46044c, i, false);
        C11058b.m49535u(parcel, 4, this.f46045d, i, false);
        C11058b.m49537w(parcel, 5, this.f46046e, false);
        C11058b.m49524j(parcel, 6, this.f46047f);
        C11058b.m49537w(parcel, 7, this.f46048g, false);
        C11058b.m49517c(parcel, 8, this.f46049h);
        C11058b.m49516b(parcel, a);
    }
}
