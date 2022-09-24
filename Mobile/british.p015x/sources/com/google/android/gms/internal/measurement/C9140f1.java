package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public interface C9140f1 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(C9186i1 i1Var) throws RemoteException;

    void getAppInstanceId(C9186i1 i1Var) throws RemoteException;

    void getCachedAppInstanceId(C9186i1 i1Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, C9186i1 i1Var) throws RemoteException;

    void getCurrentScreenClass(C9186i1 i1Var) throws RemoteException;

    void getCurrentScreenName(C9186i1 i1Var) throws RemoteException;

    void getGmpAppId(C9186i1 i1Var) throws RemoteException;

    void getMaxUserProperties(String str, C9186i1 i1Var) throws RemoteException;

    void getTestFlag(C9186i1 i1Var, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, C9186i1 i1Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(C10487a aVar, zzcl zzcl, long j) throws RemoteException;

    void isDataCollectionEnabled(C9186i1 i1Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, C9186i1 i1Var, long j) throws RemoteException;

    void logHealthData(int i, String str, C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException;

    void onActivityCreated(C10487a aVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(C10487a aVar, long j) throws RemoteException;

    void onActivityPaused(C10487a aVar, long j) throws RemoteException;

    void onActivityResumed(C10487a aVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(C10487a aVar, C9186i1 i1Var, long j) throws RemoteException;

    void onActivityStarted(C10487a aVar, long j) throws RemoteException;

    void onActivityStopped(C10487a aVar, long j) throws RemoteException;

    void performAction(Bundle bundle, C9186i1 i1Var, long j) throws RemoteException;

    void registerOnMeasurementEventListener(C9216k1 k1Var) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(C10487a aVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(C9216k1 k1Var) throws RemoteException;

    void setInstanceIdProvider(C9246m1 m1Var) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, C10487a aVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(C9216k1 k1Var) throws RemoteException;
}
