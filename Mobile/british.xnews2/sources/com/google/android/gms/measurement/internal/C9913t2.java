package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C9276o0;
import com.google.android.gms.internal.measurement.C9307q0;
import java.util.ArrayList;
import java.util.List;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.t2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9913t2 extends C9276o0 implements C11030e {
    C9913t2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: C3 */
    public final void mo38829C3(zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzp);
        mo37766f3(20, x);
    }

    /* renamed from: E3 */
    public final void mo38830E3(long j, String str, String str2, String str3) throws RemoteException {
        Parcel x = mo37767x();
        x.writeLong(j);
        x.writeString(str);
        x.writeString(str2);
        x.writeString(str3);
        mo37766f3(10, x);
    }

    /* renamed from: H2 */
    public final void mo38832H2(zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzp);
        mo37766f3(4, x);
    }

    /* renamed from: I0 */
    public final void mo38833I0(zzab zzab, zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzab);
        C9307q0.m43505d(x, zzp);
        mo37766f3(12, x);
    }

    /* renamed from: J1 */
    public final void mo38834J1(zzks zzks, zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzks);
        C9307q0.m43505d(x, zzp);
        mo37766f3(2, x);
    }

    /* renamed from: L2 */
    public final List mo38835L2(String str, String str2, zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43505d(x, zzp);
        Parcel b2 = mo37765b2(16, x);
        ArrayList<zzab> createTypedArrayList = b2.createTypedArrayList(zzab.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: N3 */
    public final List mo38836N3(String str, String str2, boolean z, zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43504c(x, z);
        C9307q0.m43505d(x, zzp);
        Parcel b2 = mo37765b2(14, x);
        ArrayList<zzks> createTypedArrayList = b2.createTypedArrayList(zzks.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: P0 */
    public final List mo38837P0(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString((String) null);
        x.writeString(str2);
        x.writeString(str3);
        C9307q0.m43504c(x, z);
        Parcel b2 = mo37765b2(15, x);
        ArrayList<zzks> createTypedArrayList = b2.createTypedArrayList(zzks.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: Q5 */
    public final byte[] mo38839Q5(zzau zzau, String str) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzau);
        x.writeString(str);
        Parcel b2 = mo37765b2(9, x);
        byte[] createByteArray = b2.createByteArray();
        b2.recycle();
        return createByteArray;
    }

    /* renamed from: V1 */
    public final List mo38840V1(String str, String str2, String str3) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString((String) null);
        x.writeString(str2);
        x.writeString(str3);
        Parcel b2 = mo37765b2(17, x);
        ArrayList<zzab> createTypedArrayList = b2.createTypedArrayList(zzab.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: Y0 */
    public final void mo38841Y0(zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzp);
        mo37766f3(18, x);
    }

    /* renamed from: e3 */
    public final void mo38843e3(zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzp);
        mo37766f3(6, x);
    }

    /* renamed from: t1 */
    public final String mo38848t1(zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzp);
        Parcel b2 = mo37765b2(11, x);
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    /* renamed from: t5 */
    public final void mo38849t5(zzau zzau, zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, zzau);
        C9307q0.m43505d(x, zzp);
        mo37766f3(1, x);
    }

    /* renamed from: x0 */
    public final void mo38850x0(Bundle bundle, zzp zzp) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, bundle);
        C9307q0.m43505d(x, zzp);
        mo37766f3(19, x);
    }
}
