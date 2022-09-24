package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.C4604n;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p006a5.C0115q;
import p192c5.C6520c;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4669f extends C4666b5 {

    /* renamed from: b */
    private Boolean f21289b;

    /* renamed from: c */
    private C9751e f21290c = C9742d.f46203a;

    /* renamed from: d */
    private Boolean f21291d;

    C4669f(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: I */
    public static final long m21550I() {
        return ((Long) C9903s2.f46684e.mo39174a((Object) null)).longValue();
    }

    /* renamed from: d */
    public static final long m21551d() {
        return ((Long) C9903s2.f46654E.mo39174a((Object) null)).longValue();
    }

    /* renamed from: h */
    private final String m21552h(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C4604n.m20098k(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f21269a.mo19276j().mo19282q().mo38857b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean mo19336A() {
        Boolean t = mo19353t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: B */
    public final boolean mo19337B(String str, C9893r2 r2Var) {
        if (str == null) {
            return ((Boolean) r2Var.mo39174a((Object) null)).booleanValue();
        }
        String c = this.f21290c.mo38860c(str, r2Var.mo39175b());
        if (TextUtils.isEmpty(c)) {
            return ((Boolean) r2Var.mo39174a((Object) null)).booleanValue();
        }
        return ((Boolean) r2Var.mo39174a(Boolean.valueOf(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(c)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo19338C(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.f21290c.mo38860c(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo19339D() {
        Boolean t = mo19353t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo19340E() {
        this.f21269a.mo19275g();
        Boolean t = mo19353t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo19341F(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.f21290c.mo38860c(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo19342G() {
        if (this.f21289b == null) {
            Boolean t = mo19353t("app_measurement_lite");
            this.f21289b = t;
            if (t == null) {
                this.f21289b = Boolean.FALSE;
            }
        }
        return this.f21289b.booleanValue() || !this.f21269a.mo19389s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean mo19343H() {
        if (this.f21291d == null) {
            synchronized (this) {
                if (this.f21291d == null) {
                    ApplicationInfo applicationInfo = this.f21269a.mo19277r().getApplicationInfo();
                    String a = C0115q.m413a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f21291d = Boolean.valueOf(z);
                    }
                    if (this.f21291d == null) {
                        this.f21291d = Boolean.TRUE;
                        this.f21269a.mo19276j().mo19282q().mo38856a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f21291d.booleanValue();
    }

    /* renamed from: i */
    public final double mo19344i(String str, C9893r2 r2Var) {
        if (str == null) {
            return ((Double) r2Var.mo39174a((Object) null)).doubleValue();
        }
        String c = this.f21290c.mo38860c(str, r2Var.mo39175b());
        if (TextUtils.isEmpty(c)) {
            return ((Double) r2Var.mo39174a((Object) null)).doubleValue();
        }
        try {
            return ((Double) r2Var.mo39174a(Double.valueOf(Double.parseDouble(c)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) r2Var.mo39174a((Object) null)).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo19345k(String str) {
        return mo19349o(str, C9903s2.f46658I, 500, 2000);
    }

    /* renamed from: l */
    public final int mo19346l() {
        C4668d9 N = this.f21269a.mo19372N();
        Boolean J = N.f21269a.mo19370L().mo39207J();
        if (N.mo19321o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: m */
    public final int mo19347m(String str) {
        return mo19349o(str, C9903s2.f46659J, 25, 100);
    }

    /* renamed from: n */
    public final int mo19348n(String str, C9893r2 r2Var) {
        if (str == null) {
            return ((Integer) r2Var.mo39174a((Object) null)).intValue();
        }
        String c = this.f21290c.mo38860c(str, r2Var.mo39175b());
        if (TextUtils.isEmpty(c)) {
            return ((Integer) r2Var.mo39174a((Object) null)).intValue();
        }
        try {
            return ((Integer) r2Var.mo39174a(Integer.valueOf(Integer.parseInt(c)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) r2Var.mo39174a((Object) null)).intValue();
        }
    }

    /* renamed from: o */
    public final int mo19349o(String str, C9893r2 r2Var, int i, int i2) {
        return Math.max(Math.min(mo19348n(str, r2Var), i2), i);
    }

    /* renamed from: p */
    public final long mo19350p() {
        this.f21269a.mo19275g();
        return 55005;
    }

    /* renamed from: q */
    public final long mo19351q(String str, C9893r2 r2Var) {
        if (str == null) {
            return ((Long) r2Var.mo39174a((Object) null)).longValue();
        }
        String c = this.f21290c.mo38860c(str, r2Var.mo39175b());
        if (TextUtils.isEmpty(c)) {
            return ((Long) r2Var.mo39174a((Object) null)).longValue();
        }
        try {
            return ((Long) r2Var.mo39174a(Long.valueOf(Long.parseLong(c)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) r2Var.mo39174a((Object) null)).longValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Bundle mo19352s() {
        try {
            if (this.f21269a.mo19277r().getPackageManager() == null) {
                this.f21269a.mo19276j().mo19282q().mo38856a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C6520c.m28321a(this.f21269a.mo19277r()).mo24352c(this.f21269a.mo19277r().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f21269a.mo19276j().mo19282q().mo38856a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean mo19353t(String str) {
        C4604n.m20094g(str);
        Bundle s = mo19352s();
        if (s == null) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo19354u() {
        return m21552h("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo19355v() {
        return m21552h("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo19356w() {
        this.f21269a.mo19275g();
        return "FA";
    }

    /* renamed from: x */
    public final String mo19357x(String str, C9893r2 r2Var) {
        if (str == null) {
            return (String) r2Var.mo39174a((Object) null);
        }
        return (String) r2Var.mo39174a(this.f21290c.mo38860c(str, r2Var.mo39175b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo19358y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C4604n.m20094g(r4)
            android.os.Bundle r0 = r3.mo19352s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19282q()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo38856a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.h4 r0 = r3.f21269a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo19277r()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.h4 r0 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo38857b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4669f.mo19358y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo19359z(C9751e eVar) {
        this.f21290c = eVar;
    }
}
