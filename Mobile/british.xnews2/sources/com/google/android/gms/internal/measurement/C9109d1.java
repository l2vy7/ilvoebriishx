package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9109d1 extends C9276o0 implements C9140f1 {
    C9109d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeLong(j);
        mo37766f3(23, x);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43505d(x, bundle);
        mo37766f3(9, x);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeLong(j);
        mo37766f3(24, x);
    }

    public final void generateEventId(C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, i1Var);
        mo37766f3(22, x);
    }

    public final void getCachedAppInstanceId(C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, i1Var);
        mo37766f3(19, x);
    }

    public final void getConditionalUserProperties(String str, String str2, C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43506e(x, i1Var);
        mo37766f3(10, x);
    }

    public final void getCurrentScreenClass(C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, i1Var);
        mo37766f3(17, x);
    }

    public final void getCurrentScreenName(C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, i1Var);
        mo37766f3(16, x);
    }

    public final void getGmpAppId(C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, i1Var);
        mo37766f3(21, x);
    }

    public final void getMaxUserProperties(String str, C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        C9307q0.m43506e(x, i1Var);
        mo37766f3(6, x);
    }

    public final void getUserProperties(String str, String str2, boolean z, C9186i1 i1Var) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43504c(x, z);
        C9307q0.m43506e(x, i1Var);
        mo37766f3(5, x);
    }

    public final void initialize(C10487a aVar, zzcl zzcl, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        C9307q0.m43505d(x, zzcl);
        x.writeLong(j);
        mo37766f3(1, x);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43505d(x, bundle);
        C9307q0.m43504c(x, z);
        C9307q0.m43504c(x, z2);
        x.writeLong(j);
        mo37766f3(2, x);
    }

    public final void logHealthData(int i, String str, C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException {
        Parcel x = mo37767x();
        x.writeInt(5);
        x.writeString(str);
        C9307q0.m43506e(x, aVar);
        C9307q0.m43506e(x, aVar2);
        C9307q0.m43506e(x, aVar3);
        mo37766f3(33, x);
    }

    public final void onActivityCreated(C10487a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        C9307q0.m43505d(x, bundle);
        x.writeLong(j);
        mo37766f3(27, x);
    }

    public final void onActivityDestroyed(C10487a aVar, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        x.writeLong(j);
        mo37766f3(28, x);
    }

    public final void onActivityPaused(C10487a aVar, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        x.writeLong(j);
        mo37766f3(29, x);
    }

    public final void onActivityResumed(C10487a aVar, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        x.writeLong(j);
        mo37766f3(30, x);
    }

    public final void onActivitySaveInstanceState(C10487a aVar, C9186i1 i1Var, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        C9307q0.m43506e(x, i1Var);
        x.writeLong(j);
        mo37766f3(31, x);
    }

    public final void onActivityStarted(C10487a aVar, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        x.writeLong(j);
        mo37766f3(25, x);
    }

    public final void onActivityStopped(C10487a aVar, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        x.writeLong(j);
        mo37766f3(26, x);
    }

    public final void performAction(Bundle bundle, C9186i1 i1Var, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, bundle);
        C9307q0.m43506e(x, i1Var);
        x.writeLong(j);
        mo37766f3(32, x);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, bundle);
        x.writeLong(j);
        mo37766f3(8, x);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, bundle);
        x.writeLong(j);
        mo37766f3(44, x);
    }

    public final void setCurrentScreen(C10487a aVar, String str, String str2, long j) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43506e(x, aVar);
        x.writeString(str);
        x.writeString(str2);
        x.writeLong(j);
        mo37766f3(15, x);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43504c(x, z);
        mo37766f3(39, x);
    }

    public final void setUserProperty(String str, String str2, C10487a aVar, boolean z, long j) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43506e(x, aVar);
        C9307q0.m43504c(x, z);
        x.writeLong(j);
        mo37766f3(4, x);
    }
}
