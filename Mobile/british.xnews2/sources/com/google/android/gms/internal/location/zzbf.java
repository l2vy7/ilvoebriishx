package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p131p5.C10871d;
import p250s5.C10989t;
import p250s5.C10990u;
import p250s5.C10992w;
import p250s5.C10993x;
import p256v4.C11058b;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new C9058j();

    /* renamed from: b */
    private int f44856b;

    /* renamed from: c */
    private zzbd f44857c;

    /* renamed from: d */
    private C10992w f44858d;

    /* renamed from: e */
    private PendingIntent f44859e;

    /* renamed from: f */
    private C10989t f44860f;

    /* renamed from: g */
    private C10871d f44861g;

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f44856b = i;
        this.f44857c = zzbd;
        C10871d dVar = null;
        this.f44858d = iBinder == null ? null : C10993x.m49332b2(iBinder);
        this.f44859e = pendingIntent;
        this.f44860f = iBinder2 == null ? null : C10990u.m49330b2(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface instanceof C10871d ? (C10871d) queryLocalInterface : new C9049a(iBinder3);
        }
        this.f44861g = dVar;
    }

    /* renamed from: C0 */
    public static zzbf m42570C0(C10989t tVar, C10871d dVar) {
        return new zzbf(2, (zzbd) null, (IBinder) null, (PendingIntent) null, tVar.asBinder(), dVar != null ? dVar.asBinder() : null);
    }

    /* renamed from: D0 */
    public static zzbf m42571D0(C10992w wVar, C10871d dVar) {
        return new zzbf(2, (zzbd) null, wVar.asBinder(), (PendingIntent) null, (IBinder) null, dVar != null ? dVar.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f44856b);
        C11058b.m49535u(parcel, 2, this.f44857c, i, false);
        C10992w wVar = this.f44858d;
        IBinder iBinder = null;
        C11058b.m49526l(parcel, 3, wVar == null ? null : wVar.asBinder(), false);
        C11058b.m49535u(parcel, 4, this.f44859e, i, false);
        C10989t tVar = this.f44860f;
        C11058b.m49526l(parcel, 5, tVar == null ? null : tVar.asBinder(), false);
        C10871d dVar = this.f44861g;
        if (dVar != null) {
            iBinder = dVar.asBinder();
        }
        C11058b.m49526l(parcel, 6, iBinder, false);
        C11058b.m49516b(parcel, a);
    }
}
