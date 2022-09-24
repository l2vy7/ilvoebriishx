package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.ads.metadata.MediationMetaData;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bb2 extends ve0 {

    /* renamed from: b */
    private final String f29948b;

    /* renamed from: c */
    private final te0 f29949c;

    /* renamed from: d */
    private final uo0<JSONObject> f29950d;

    /* renamed from: e */
    private final JSONObject f29951e;
    @GuardedBy("this")

    /* renamed from: f */
    private boolean f29952f = false;

    public bb2(String str, te0 te0, uo0<JSONObject> uo0) {
        JSONObject jSONObject = new JSONObject();
        this.f29951e = jSONObject;
        this.f29950d = uo0;
        this.f29948b = str;
        this.f29949c = te0;
        try {
            jSONObject.put("adapter_version", te0.zzf().toString());
            jSONObject.put("sdk_version", te0.zzg().toString());
            jSONObject.put(MediationMetaData.KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30648b(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f29952f     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.mo30650c(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f29951e     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.uo0<org.json.JSONObject> r3 = r2.f29950d     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.f29951e     // Catch:{ all -> 0x0023 }
            r3.zzd(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.f29952f = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.mo30648b(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* renamed from: b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30649b6(com.google.android.gms.internal.ads.zzbew r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f29952f     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f29951e     // Catch:{ JSONException -> 0x0010 }
            java.lang.String r1 = "signal_error"
            java.lang.String r3 = r3.f42936c     // Catch:{ JSONException -> 0x0010 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0010 }
        L_0x0010:
            com.google.android.gms.internal.ads.uo0<org.json.JSONObject> r3 = r2.f29950d     // Catch:{ all -> 0x001c }
            org.json.JSONObject r0 = r2.f29951e     // Catch:{ all -> 0x001c }
            r3.zzd(r0)     // Catch:{ all -> 0x001c }
            r3 = 1
            r2.f29952f = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.mo30649b6(com.google.android.gms.internal.ads.zzbew):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30650c(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f29952f     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f29951e     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.uo0<org.json.JSONObject> r3 = r2.f29950d     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f29951e     // Catch:{ all -> 0x001a }
            r3.zzd(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f29952f = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.mo30650c(java.lang.String):void");
    }

    public final synchronized void zzb() {
        if (!this.f29952f) {
            this.f29950d.zzd(this.f29951e);
            this.f29952f = true;
        }
    }
}
