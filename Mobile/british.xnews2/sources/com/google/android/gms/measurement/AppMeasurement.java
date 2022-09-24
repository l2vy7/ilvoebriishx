package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.measurement.internal.C4670h4;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p255u5.C11039n;
import p255u5.C11046u;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f46127b;

    /* renamed from: a */
    private final C9709d f46128a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            C4604n.m20098k(bundle);
            this.mAppId = (String) C11039n.m49437a(bundle, "app_id", cls2, (Object) null);
            this.mOrigin = (String) C11039n.m49437a(bundle, TtmlNode.ATTR_TTS_ORIGIN, cls2, (Object) null);
            this.mName = (String) C11039n.m49437a(bundle, MediationMetaData.KEY_NAME, cls2, (Object) null);
            this.mValue = C11039n.m49437a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C11039n.m49437a(bundle, "trigger_event_name", cls2, (Object) null);
            this.mTriggerTimeout = ((Long) C11039n.m49437a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C11039n.m49437a(bundle, "timed_out_event_name", cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) C11039n.m49437a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) C11039n.m49437a(bundle, "triggered_event_name", cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) C11039n.m49437a(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) C11039n.m49437a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C11039n.m49437a(bundle, "expired_event_name", cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) C11039n.m49437a(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) C11039n.m49437a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C11039n.m49437a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C11039n.m49437a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    public AppMeasurement(C4670h4 h4Var) {
        this.f46128a = new C9706a(h4Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f46127b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f46127b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            u5.u r2 = (p255u5.C11046u) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((p255u5.C11046u) r2)     // Catch:{ all -> 0x0056 }
            f46127b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.h4 r14 = com.google.android.gms.measurement.internal.C4670h4.m21577H(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.C4670h4) r14)     // Catch:{ all -> 0x0056 }
            f46127b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f46127b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f46128a.mo38818j(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f46128a.mo38817d(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f46128a.mo38819l(str);
    }

    @Keep
    public long generateEventId() {
        return this.f46128a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f46128a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i;
        List<Bundle> E = this.f46128a.mo38813E(str, str2);
        if (E == null) {
            i = 0;
        } else {
            i = E.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : E) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f46128a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f46128a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f46128a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f46128a.zza(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f46128a.mo38814a(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f46128a.mo38816c(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C4604n.m20098k(conditionalUserProperty);
        C9709d dVar = this.f46128a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(MediationMetaData.KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C11039n.m49438b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.mo38815b(bundle);
    }

    public AppMeasurement(C11046u uVar) {
        this.f46128a = new C9707b(uVar);
    }
}
