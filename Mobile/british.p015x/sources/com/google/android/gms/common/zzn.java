package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p199d5.C10487a;
import p199d5.C10489b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C7453r();

    /* renamed from: b */
    private final String f29449b;

    /* renamed from: c */
    private final boolean f29450c;

    /* renamed from: d */
    private final boolean f29451d;

    /* renamed from: e */
    private final Context f29452e;

    /* renamed from: f */
    private final boolean f29453f;

    zzn(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f29449b = str;
        this.f29450c = z;
        this.f29451d = z2;
        this.f29452e = (Context) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder));
        this.f29453f = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [d5.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f29449b, false);
        C11058b.m49517c(parcel, 2, this.f29450c);
        C11058b.m49517c(parcel, 3, this.f29451d);
        C11058b.m49526l(parcel, 4, C10489b.m48195m6(this.f29452e), false);
        C11058b.m49517c(parcel, 5, this.f29453f);
        C11058b.m49516b(parcel, a);
    }
}
