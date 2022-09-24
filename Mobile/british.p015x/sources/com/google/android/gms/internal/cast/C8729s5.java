package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import p244q4.C10922b;

/* renamed from: com.google.android.gms.internal.cast.s5 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8729s5 {

    /* renamed from: g */
    private static final C10922b f43980g = new C10922b("ApplicationAnalyticsSession");

    /* renamed from: h */
    public static long f43981h = System.currentTimeMillis();

    /* renamed from: a */
    public String f43982a;

    /* renamed from: b */
    public String f43983b;

    /* renamed from: c */
    public long f43984c = f43981h;

    /* renamed from: d */
    public int f43985d = 1;

    /* renamed from: e */
    public int f43986e;

    /* renamed from: f */
    public String f43987f;

    private C8729s5() {
    }

    /* renamed from: a */
    public static C8729s5 m41302a() {
        C8729s5 s5Var = new C8729s5();
        f43981h++;
        return s5Var;
    }

    /* renamed from: b */
    public static C8729s5 m41303b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        C8729s5 s5Var = new C8729s5();
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        s5Var.f43982a = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        s5Var.f43983b = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        s5Var.f43984c = sharedPreferences.getLong("analytics_session_id", 0);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        s5Var.f43985d = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            s5Var.f43986e = sharedPreferences.getInt("device_capabilities", 0);
            return null;
        }
        s5Var.f43987f = sharedPreferences.getString("receiver_session_id", "");
        return s5Var;
    }

    /* renamed from: c */
    public final void mo36728c(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            f43980g.mo43190a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("application_id", this.f43982a);
            edit.putString("receiver_metrics_id", this.f43983b);
            edit.putLong("analytics_session_id", this.f43984c);
            edit.putInt("event_sequence_number", this.f43985d);
            edit.putInt("device_capabilities", this.f43986e);
            edit.putString("receiver_session_id", this.f43987f);
            edit.apply();
        }
    }
}
