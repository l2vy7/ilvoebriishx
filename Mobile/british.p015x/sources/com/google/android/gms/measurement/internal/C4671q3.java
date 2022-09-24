package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.C4604n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p256u5.C11027b;
import p256u5.C11033h;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4671q3 extends C9737c5 {

    /* renamed from: x */
    static final Pair f21326x = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f21327c;

    /* renamed from: d */
    public C9863o3 f21328d;

    /* renamed from: e */
    public final C9852n3 f21329e = new C9852n3(this, "first_open_time", 0);

    /* renamed from: f */
    public final C9852n3 f21330f = new C9852n3(this, "app_install_time", 0);

    /* renamed from: g */
    public final C9874p3 f21331g = new C9874p3(this, "app_instance_id", (String) null);

    /* renamed from: h */
    private String f21332h;

    /* renamed from: i */
    private boolean f21333i;

    /* renamed from: j */
    private long f21334j;

    /* renamed from: k */
    public final C9852n3 f21335k = new C9852n3(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C9830l3 f21336l = new C9830l3(this, "start_new_session", true);

    /* renamed from: m */
    public final C9874p3 f21337m = new C9874p3(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C9830l3 f21338n = new C9830l3(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C9852n3 f21339o = new C9852n3(this, "last_pause_time", 0);

    /* renamed from: p */
    public boolean f21340p;

    /* renamed from: q */
    public final C9830l3 f21341q = new C9830l3(this, "app_backgrounded", false);

    /* renamed from: r */
    public final C9830l3 f21342r = new C9830l3(this, "deep_link_retrieval_complete", false);

    /* renamed from: s */
    public final C9852n3 f21343s = new C9852n3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: t */
    public final C9874p3 f21344t = new C9874p3(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: u */
    public final C9874p3 f21345u = new C9874p3(this, "deferred_attribution_cache", (String) null);

    /* renamed from: v */
    public final C9852n3 f21346v = new C9852n3(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: w */
    public final C9841m3 f21347w = new C9841m3(this, "default_event_parameters", (Bundle) null);

    C4671q3(C4670h4 h4Var) {
        super(h4Var);
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: d */
    public final void mo19313d() {
        SharedPreferences sharedPreferences = this.f21269a.mo19277r().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f21327c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f21340p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f21327c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f21269a.mo19392z();
        this.f21328d = new C9863o3(this, "health_monitor", Math.max(0, ((Long) C9903s2.f46682d.mo39174a((Object) null)).longValue()), (C11033h) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo19280h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final SharedPreferences mo19393n() {
        mo19272b();
        mo38880i();
        C4604n.m20098k(this.f21327c);
        return this.f21327c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Pair mo19394o(String str) {
        mo19272b();
        long elapsedRealtime = this.f21269a.mo19274f().elapsedRealtime();
        String str2 = this.f21332h;
        if (str2 != null && elapsedRealtime < this.f21334j) {
            return new Pair(str2, Boolean.valueOf(this.f21333i));
        }
        this.f21334j = elapsedRealtime + this.f21269a.mo19392z().mo19351q(str, C9903s2.f46680c);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f21269a.mo19277r());
            this.f21332h = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f21332h = id;
            }
            this.f21333i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.f21269a.mo19276j().mo19281p().mo38857b("Unable to get advertising id", e);
            this.f21332h = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f21332h, Boolean.valueOf(this.f21333i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C11027b mo19395p() {
        mo19272b();
        return C11027b.m49402b(mo19393n().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Boolean mo19396q() {
        mo19272b();
        if (mo19393n().contains("measurement_enabled")) {
            return Boolean.valueOf(mo19393n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo19397s(Boolean bool) {
        mo19272b();
        SharedPreferences.Editor edit = mo19393n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo19398t(boolean z) {
        mo19272b();
        this.f21269a.mo19276j().mo19286v().mo38857b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo19393n().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo19399u() {
        SharedPreferences sharedPreferences = this.f21327c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo19400v(long j) {
        return j - this.f21335k.mo39075a() > this.f21339o.mo39075a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo19401w(int i) {
        return C11027b.m49404j(i, mo19393n().getInt("consent_source", 100));
    }
}
