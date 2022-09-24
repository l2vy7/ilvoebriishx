package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C9125e1;
import com.google.android.gms.internal.measurement.C9186i1;
import com.google.android.gms.internal.measurement.C9216k1;
import com.google.android.gms.internal.measurement.C9246m1;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p150t.C6077a;
import p199d5.C10487a;
import p199d5.C10489b;
import p256u5.C11044s;
import p256u5.C11047v;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
public class AppMeasurementDynamiteService extends C9125e1 {

    /* renamed from: b */
    C4670h4 f21267b = null;

    /* renamed from: c */
    private final Map f21268c = new C6077a();

    /* renamed from: b2 */
    private final void m21459b2(C9186i1 i1Var, String str) {
        zzb();
        this.f21267b.mo19372N().mo19298I(i1Var, str);
    }

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.f21267b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19391y().mo39314k(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38949h0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38931J((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19391y().mo39315l(str, j);
    }

    public void generateEventId(C9186i1 i1Var) throws RemoteException {
        zzb();
        long r0 = this.f21267b.mo19372N().mo19325r0();
        zzb();
        this.f21267b.mo19372N().mo19297H(i1Var, r0);
    }

    public void getAppInstanceId(C9186i1 i1Var) throws RemoteException {
        zzb();
        this.f21267b.mo19273e().mo38909z(new C9832l5(this, i1Var));
    }

    public void getCachedAppInstanceId(C9186i1 i1Var) throws RemoteException {
        zzb();
        m21459b2(i1Var, this.f21267b.mo19367I().mo38942X());
    }

    public void getConditionalUserProperties(String str, String str2, C9186i1 i1Var) throws RemoteException {
        zzb();
        this.f21267b.mo19273e().mo38909z(new C9761e9(this, i1Var, str, str2));
    }

    public void getCurrentScreenClass(C9186i1 i1Var) throws RemoteException {
        zzb();
        m21459b2(i1Var, this.f21267b.mo19367I().mo38943Y());
    }

    public void getCurrentScreenName(C9186i1 i1Var) throws RemoteException {
        zzb();
        m21459b2(i1Var, this.f21267b.mo19367I().mo38944Z());
    }

    public void getGmpAppId(C9186i1 i1Var) throws RemoteException {
        String str;
        zzb();
        C9779g6 I = this.f21267b.mo19367I();
        if (I.f21269a.mo19373O() != null) {
            str = I.f21269a.mo19373O();
        } else {
            try {
                str = C11047v.m49451b(I.f21269a.mo19277r(), "google_app_id", I.f21269a.mo19376R());
            } catch (IllegalStateException e) {
                I.f21269a.mo19276j().mo19282q().mo38857b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m21459b2(i1Var, str);
    }

    public void getMaxUserProperties(String str, C9186i1 i1Var) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38937S(str);
        zzb();
        this.f21267b.mo19372N().mo19296G(i1Var, 25);
    }

    public void getTestFlag(C9186i1 i1Var, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.f21267b.mo19372N().mo19298I(i1Var, this.f21267b.mo19367I().mo38945a0());
        } else if (i == 1) {
            this.f21267b.mo19372N().mo19297H(i1Var, this.f21267b.mo19367I().mo38941W().longValue());
        } else if (i == 2) {
            C4668d9 N = this.f21267b.mo19372N();
            double doubleValue = this.f21267b.mo19367I().mo38939U().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                i1Var.mo37383e(bundle);
            } catch (RemoteException e) {
                N.f21269a.mo19276j().mo19287w().mo38857b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f21267b.mo19372N().mo19296G(i1Var, this.f21267b.mo19367I().mo38940V().intValue());
        } else if (i == 4) {
            this.f21267b.mo19372N().mo19292C(i1Var, this.f21267b.mo19367I().mo38938T().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C9186i1 i1Var) throws RemoteException {
        zzb();
        this.f21267b.mo19273e().mo38909z(new C9801i7(this, i1Var, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    public void initialize(C10487a aVar, zzcl zzcl, long j) throws RemoteException {
        C4670h4 h4Var = this.f21267b;
        if (h4Var == null) {
            this.f21267b = C4670h4.m21577H((Context) C4604n.m20098k((Context) C10489b.m48194f3(aVar)), zzcl, Long.valueOf(j));
        } else {
            h4Var.mo19276j().mo19287w().mo38856a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C9186i1 i1Var) throws RemoteException {
        zzb();
        this.f21267b.mo19273e().mo38909z(new C9771f9(this, i1Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38954s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C9186i1 i1Var, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        C4604n.m20094g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f21267b.mo19273e().mo38909z(new C9811j6(this, i1Var, new zzau(str2, new zzas(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException {
        Object obj;
        Object obj2;
        zzb();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = C10489b.m48194f3(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C10489b.m48194f3(aVar2);
        }
        if (aVar3 != null) {
            obj3 = C10489b.m48194f3(aVar3);
        }
        this.f21267b.mo19276j().mo19279F(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C10487a aVar, Bundle bundle, long j) throws RemoteException {
        zzb();
        C9768f6 f6Var = this.f21267b.mo19367I().f46293c;
        if (f6Var != null) {
            this.f21267b.mo19367I().mo38950n();
            f6Var.onActivityCreated((Activity) C10489b.m48194f3(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C10487a aVar, long j) throws RemoteException {
        zzb();
        C9768f6 f6Var = this.f21267b.mo19367I().f46293c;
        if (f6Var != null) {
            this.f21267b.mo19367I().mo38950n();
            f6Var.onActivityDestroyed((Activity) C10489b.m48194f3(aVar));
        }
    }

    public void onActivityPaused(C10487a aVar, long j) throws RemoteException {
        zzb();
        C9768f6 f6Var = this.f21267b.mo19367I().f46293c;
        if (f6Var != null) {
            this.f21267b.mo19367I().mo38950n();
            f6Var.onActivityPaused((Activity) C10489b.m48194f3(aVar));
        }
    }

    public void onActivityResumed(C10487a aVar, long j) throws RemoteException {
        zzb();
        C9768f6 f6Var = this.f21267b.mo19367I().f46293c;
        if (f6Var != null) {
            this.f21267b.mo19367I().mo38950n();
            f6Var.onActivityResumed((Activity) C10489b.m48194f3(aVar));
        }
    }

    public void onActivitySaveInstanceState(C10487a aVar, C9186i1 i1Var, long j) throws RemoteException {
        zzb();
        C9768f6 f6Var = this.f21267b.mo19367I().f46293c;
        Bundle bundle = new Bundle();
        if (f6Var != null) {
            this.f21267b.mo19367I().mo38950n();
            f6Var.onActivitySaveInstanceState((Activity) C10489b.m48194f3(aVar), bundle);
        }
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21267b.mo19276j().mo19287w().mo38857b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C10487a aVar, long j) throws RemoteException {
        zzb();
        if (this.f21267b.mo19367I().f46293c != null) {
            this.f21267b.mo19367I().mo38950n();
            Activity activity = (Activity) C10489b.m48194f3(aVar);
        }
    }

    public void onActivityStopped(C10487a aVar, long j) throws RemoteException {
        zzb();
        if (this.f21267b.mo19367I().f46293c != null) {
            this.f21267b.mo19367I().mo38950n();
            Activity activity = (Activity) C10489b.m48194f3(aVar);
        }
    }

    public void performAction(Bundle bundle, C9186i1 i1Var, long j) throws RemoteException {
        zzb();
        i1Var.mo37383e((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C9216k1 k1Var) throws RemoteException {
        C11044s sVar;
        zzb();
        synchronized (this.f21268c) {
            sVar = (C11044s) this.f21268c.get(Integer.valueOf(k1Var.zzd()));
            if (sVar == null) {
                sVar = new C9792h9(this, k1Var);
                this.f21268c.put(Integer.valueOf(k1Var.zzd()), sVar);
            }
        }
        this.f21267b.mo19367I().mo38959x(sVar);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38960y(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f21267b.mo19276j().mo19282q().mo38856a("Conditional user property must not be null");
        } else {
            this.f21267b.mo19367I().mo38926E(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38929H(bundle, j);
    }

    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38927F(bundle, -20, j);
    }

    public void setCurrentScreen(C10487a aVar, String str, String str2, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19369K().mo39198E((Activity) C10489b.m48194f3(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        C9779g6 I = this.f21267b.mo19367I();
        I.mo39230d();
        I.f21269a.mo19273e().mo38909z(new C9810j5(I, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zzb();
        C9779g6 I = this.f21267b.mo19367I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f21269a.mo19273e().mo38909z(new C9788h5(I, bundle2));
    }

    public void setEventInterceptor(C9216k1 k1Var) throws RemoteException {
        zzb();
        C9782g9 g9Var = new C9782g9(this, k1Var);
        if (this.f21267b.mo19273e().mo38904C()) {
            this.f21267b.mo19367I().mo38930I(g9Var);
        } else {
            this.f21267b.mo19273e().mo38909z(new C9802i8(this, g9Var));
        }
    }

    public void setInstanceIdProvider(C9246m1 m1Var) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38931J(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        C9779g6 I = this.f21267b.mo19367I();
        I.f21269a.mo19273e().mo38909z(new C9843m5(I, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        if (str == null || str.length() != 0) {
            this.f21267b.mo19367I().mo38934M((String) null, "_id", str, true, j);
        } else {
            this.f21267b.mo19276j().mo19287w().mo38856a("User ID must be non-empty");
        }
    }

    public void setUserProperty(String str, String str2, C10487a aVar, boolean z, long j) throws RemoteException {
        zzb();
        this.f21267b.mo19367I().mo38934M(str, str2, C10489b.m48194f3(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C9216k1 k1Var) throws RemoteException {
        C11044s sVar;
        zzb();
        synchronized (this.f21268c) {
            sVar = (C11044s) this.f21268c.remove(Integer.valueOf(k1Var.zzd()));
        }
        if (sVar == null) {
            sVar = new C9792h9(this, k1Var);
        }
        this.f21267b.mo19367I().mo38936O(sVar);
    }
}
