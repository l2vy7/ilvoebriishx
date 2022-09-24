package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.C9287ob;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p255u5.C11026a;
import p255u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9937v7 extends C9868o8 {

    /* renamed from: d */
    private final Map f46809d = new HashMap();

    /* renamed from: e */
    private String f46810e;

    /* renamed from: f */
    private boolean f46811f;

    /* renamed from: g */
    private long f46812g;

    /* renamed from: h */
    public final C9852n3 f46813h;

    /* renamed from: i */
    public final C9852n3 f46814i;

    /* renamed from: j */
    public final C9852n3 f46815j;

    /* renamed from: k */
    public final C9852n3 f46816k;

    /* renamed from: l */
    public final C9852n3 f46817l;

    C9937v7(C9958x8 x8Var) {
        super(x8Var);
        C4671q3 F = this.f21269a.mo19365F();
        F.getClass();
        this.f46813h = new C9852n3(F, "last_delete_stale", 0);
        C4671q3 F2 = this.f21269a.mo19365F();
        F2.getClass();
        this.f46814i = new C9852n3(F2, "backoff", 0);
        C4671q3 F3 = this.f21269a.mo19365F();
        F3.getClass();
        this.f46815j = new C9852n3(F3, "last_upload", 0);
        C4671q3 F4 = this.f21269a.mo19365F();
        F4.getClass();
        this.f46816k = new C9852n3(F4, "last_upload_attempt", 0);
        C4671q3 F5 = this.f21269a.mo19365F();
        F5.getClass();
        this.f46817l = new C9852n3(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: l */
    public final Pair mo39246l(String str) {
        C9927u7 u7Var;
        mo19272b();
        long elapsedRealtime = this.f21269a.mo19274f().elapsedRealtime();
        C9287ob.m43342b();
        if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46715t0)) {
            C9927u7 u7Var2 = (C9927u7) this.f46809d.get(str);
            if (u7Var2 != null && elapsedRealtime < u7Var2.f46791c) {
                return new Pair(u7Var2.f46789a, Boolean.valueOf(u7Var2.f46790b));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long q = elapsedRealtime + this.f21269a.mo19392z().mo19351q(str, C9903s2.f46680c);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f21269a.mo19277r());
                if (advertisingIdInfo == null) {
                    return new Pair("", Boolean.FALSE);
                }
                String id = advertisingIdInfo.getId();
                if (id != null) {
                    u7Var = new C9927u7(id, advertisingIdInfo.isLimitAdTrackingEnabled(), q);
                } else {
                    u7Var = new C9927u7("", advertisingIdInfo.isLimitAdTrackingEnabled(), q);
                }
                this.f46809d.put(str, u7Var);
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(u7Var.f46789a, Boolean.valueOf(u7Var.f46790b));
            } catch (Exception e) {
                this.f21269a.mo19276j().mo19281p().mo38857b("Unable to get advertising id", e);
                u7Var = new C9927u7("", false, q);
            }
        } else {
            String str2 = this.f46810e;
            if (str2 != null && elapsedRealtime < this.f46812g) {
                return new Pair(str2, Boolean.valueOf(this.f46811f));
            }
            this.f46812g = elapsedRealtime + this.f21269a.mo19392z().mo19351q(str, C9903s2.f46680c);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.f21269a.mo19277r());
                if (advertisingIdInfo2 == null) {
                    return new Pair("", Boolean.FALSE);
                }
                this.f46810e = "";
                String id2 = advertisingIdInfo2.getId();
                if (id2 != null) {
                    this.f46810e = id2;
                }
                this.f46811f = advertisingIdInfo2.isLimitAdTrackingEnabled();
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(this.f46810e, Boolean.valueOf(this.f46811f));
            } catch (Exception e2) {
                this.f21269a.mo19276j().mo19281p().mo38857b("Unable to get advertising id", e2);
                this.f46810e = "";
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Pair mo39247m(String str, C11027b bVar) {
        if (bVar.mo43338i(C11026a.AD_STORAGE)) {
            return mo39246l(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: n */
    public final String mo39248n(String str) {
        mo19272b();
        String str2 = (String) mo39246l(str).first;
        MessageDigest s = C4668d9.m21500s();
        if (s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, s.digest(str2.getBytes()))});
    }
}
