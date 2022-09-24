package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p131p5.C10871d;
import p250s5.C10986q;
import p250s5.C10987r;
import p256v4.C11058b;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C9060l();

    /* renamed from: b */
    private int f44876b;

    /* renamed from: c */
    private zzm f44877c;

    /* renamed from: d */
    private C10986q f44878d;

    /* renamed from: e */
    private C10871d f44879e;

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f44876b = i;
        this.f44877c = zzm;
        C10871d dVar = null;
        this.f44878d = iBinder == null ? null : C10987r.m49326b2(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface instanceof C10871d ? (C10871d) queryLocalInterface : new C9049a(iBinder2);
        }
        this.f44879e = dVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f44876b);
        C11058b.m49535u(parcel, 2, this.f44877c, i, false);
        C10986q qVar = this.f44878d;
        IBinder iBinder = null;
        C11058b.m49526l(parcel, 3, qVar == null ? null : qVar.asBinder(), false);
        C10871d dVar = this.f44879e;
        if (dVar != null) {
            iBinder = dVar.asBinder();
        }
        C11058b.m49526l(parcel, 4, iBinder, false);
        C11058b.m49516b(parcel, a);
    }
}
