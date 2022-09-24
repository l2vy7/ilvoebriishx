package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p006a5.C6486h;
import p243q4.C10922b;

/* renamed from: com.google.android.gms.internal.cast.v8 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C4646v8 {

    /* renamed from: i */
    private static final C10922b f21202i = new C10922b("FeatureUsageAnalytics");

    /* renamed from: j */
    private static final String f21203j = "20.0.0";

    /* renamed from: k */
    private static C4646v8 f21204k;

    /* renamed from: a */
    private final C4639n0 f21205a;

    /* renamed from: b */
    private final SharedPreferences f21206b;

    /* renamed from: c */
    private final String f21207c;

    /* renamed from: d */
    private final Runnable f21208d = new C8761u7(this);

    /* renamed from: e */
    private final Handler f21209e = new C8564i0(Looper.getMainLooper());

    /* renamed from: f */
    private final Set<C8652n7> f21210f;

    /* renamed from: g */
    private final Set<C8652n7> f21211g;

    /* renamed from: h */
    private long f21212h;

    private C4646v8(SharedPreferences sharedPreferences, C4639n0 n0Var, String str) {
        this.f21206b = sharedPreferences;
        this.f21205a = n0Var;
        this.f21207c = str;
        HashSet hashSet = new HashSet();
        this.f21210f = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f21211g = hashSet2;
        String string = sharedPreferences.getString("feature_usage_sdk_version", (String) null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", (String) null);
        hashSet.clear();
        hashSet2.clear();
        this.f21212h = 0;
        if (!f21203j.equals(string) || !str.equals(string2)) {
            HashSet hashSet3 = new HashSet();
            for (String next : sharedPreferences.getAll().keySet()) {
                if (next.startsWith("feature_usage_timestamp_")) {
                    hashSet3.add(next);
                }
            }
            hashSet3.add("feature_usage_last_report_time");
            m21380e(hashSet3);
            this.f21206b.edit().putString("feature_usage_sdk_version", f21203j).putString("feature_usage_package_name", this.f21207c).apply();
            return;
        }
        this.f21212h = sharedPreferences.getLong("feature_usage_last_report_time", 0);
        long g = m21382g();
        HashSet hashSet4 = new HashSet();
        for (String next2 : sharedPreferences.getAll().keySet()) {
            if (next2.startsWith("feature_usage_timestamp_")) {
                long j = this.f21206b.getLong(next2, 0);
                if (j != 0 && g - j > 1209600000) {
                    hashSet4.add(next2);
                } else if (next2.startsWith("feature_usage_timestamp_reported_feature_")) {
                    C8652n7 i = m21384i(next2.substring(41));
                    this.f21211g.add(i);
                    this.f21210f.add(i);
                } else if (next2.startsWith("feature_usage_timestamp_detected_feature_")) {
                    this.f21210f.add(m21384i(next2.substring(41)));
                }
            }
        }
        m21380e(hashSet4);
        C4604n.m20098k(this.f21209e);
        C4604n.m20098k(this.f21208d);
        m21381f();
    }

    /* renamed from: a */
    public static synchronized C4646v8 m21377a(SharedPreferences sharedPreferences, C4639n0 n0Var, String str) {
        C4646v8 v8Var;
        synchronized (C4646v8.class) {
            if (f21204k == null) {
                f21204k = new C4646v8(sharedPreferences, n0Var, str);
            }
            v8Var = f21204k;
        }
        return v8Var;
    }

    /* renamed from: b */
    public static void m21378b(C8652n7 n7Var) {
        C4646v8 v8Var = f21204k;
        if (v8Var != null) {
            v8Var.f21206b.edit().putLong(v8Var.m21383h(Integer.toString(n7Var.zza())), v8Var.m21382g()).apply();
            v8Var.f21210f.add(n7Var);
            v8Var.m21381f();
        }
    }

    /* renamed from: c */
    static String m21379c(String str, String str2) {
        return String.format("%s%s", new Object[]{str, str2});
    }

    /* renamed from: e */
    private final void m21380e(Set<String> set) {
        if (!set.isEmpty()) {
            SharedPreferences.Editor edit = this.f21206b.edit();
            for (String remove : set) {
                edit.remove(remove);
            }
            edit.apply();
        }
    }

    @RequiresNonNull({"handler", "reportFeatureUsageRunnable"})
    /* renamed from: f */
    private final void m21381f() {
        this.f21209e.post(this.f21208d);
    }

    /* renamed from: g */
    private final long m21382g() {
        return C6486h.m28261b().currentTimeMillis();
    }

    @RequiresNonNull({"sharedPreferences"})
    /* renamed from: h */
    private final String m21383h(String str) {
        String c = m21379c("feature_usage_timestamp_reported_feature_", str);
        if (this.f21206b.contains(c)) {
            return c;
        }
        return m21379c("feature_usage_timestamp_detected_feature_", str);
    }

    /* renamed from: i */
    private static C8652n7 m21384i(String str) {
        try {
            return C8652n7.m41147a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return C8652n7.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo19137d() {
        if (!this.f21210f.isEmpty()) {
            long j = true != this.f21211g.equals(this.f21210f) ? 86400000 : 172800000;
            long g = m21382g();
            long j2 = this.f21212h;
            if (j2 == 0 || g - j2 >= j) {
                f21202i.mo43190a("Upload the feature usage report.", new Object[0]);
                C8489d8 m = C8505e8.m40790m();
                m.mo36429m(f21203j);
                m.mo36428l(this.f21207c);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f21210f);
                C8808x7 m2 = C8823y7.m41429m();
                m2.mo36773m(arrayList);
                m2.mo36772l((C8505e8) m.mo36634i());
                C8653n8 n = C8669o8.m41176n();
                n.mo36613B((C8823y7) m2.mo36634i());
                this.f21205a.mo19116b((C8669o8) n.mo36634i(), C8435a5.API_USAGE_REPORT);
                SharedPreferences.Editor edit = this.f21206b.edit();
                if (!this.f21211g.equals(this.f21210f)) {
                    this.f21211g.clear();
                    this.f21211g.addAll(this.f21210f);
                    for (C8652n7 zza : this.f21211g) {
                        String num = Integer.toString(zza.zza());
                        String h = m21383h(num);
                        String c = m21379c("feature_usage_timestamp_reported_feature_", num);
                        if (!TextUtils.equals(h, c)) {
                            long j3 = this.f21206b.getLong(h, 0);
                            edit.remove(h);
                            if (j3 != 0) {
                                edit.putLong(c, j3);
                            }
                        }
                    }
                }
                this.f21212h = g;
                edit.putLong("feature_usage_last_report_time", g).apply();
            }
        }
    }
}
