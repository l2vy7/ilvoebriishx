package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9074ad;
import com.google.android.gms.internal.measurement.C9366tc;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p149t.C6077a;
import p255u5.C11026a;
import p255u5.C11027b;
import p255u5.C11039n;
import p255u5.C11042q;
import p255u5.C11043r;
import p255u5.C11044s;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9779g6 extends C9923u3 {

    /* renamed from: c */
    protected C9768f6 f46293c;

    /* renamed from: d */
    private C11043r f46294d;

    /* renamed from: e */
    private final Set f46295e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f46296f;

    /* renamed from: g */
    private final AtomicReference f46297g = new AtomicReference();

    /* renamed from: h */
    private final Object f46298h = new Object();

    /* renamed from: i */
    private C11027b f46299i = new C11027b((Boolean) null, (Boolean) null);

    /* renamed from: j */
    private int f46300j = 100;

    /* renamed from: k */
    private final AtomicLong f46301k = new AtomicLong(0);

    /* renamed from: l */
    private long f46302l = -1;

    /* renamed from: m */
    private int f46303m = 100;

    /* renamed from: n */
    final C9814j9 f46304n;

    /* renamed from: o */
    protected boolean f46305o = true;

    /* renamed from: p */
    private final C9741c9 f46306p = new C9935v5(this);

    protected C9779g6(C4670h4 h4Var) {
        super(h4Var);
        this.f46304n = new C9814j9(h4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void mo38951o(Bundle bundle, long j) {
        if (TextUtils.isEmpty(this.f21269a.mo19361B().mo19409t())) {
            mo38927F(bundle, 0, j);
        } else {
            this.f21269a.mo19276j().mo19288x().mo38856a("Using developer consent only; google app id found");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final void m45073Q(Boolean bool, boolean z) {
        mo19272b();
        mo39230d();
        this.f21269a.mo19276j().mo19281p().mo38857b("Setting app measurement enabled (FE)", bool);
        this.f21269a.mo19365F().mo19397s(bool);
        if (z) {
            C4671q3 F = this.f21269a.mo19365F();
            C4670h4 h4Var = F.f21269a;
            F.mo19272b();
            SharedPreferences.Editor edit = F.mo19393n().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f21269a.mo19386o() || (bool != null && !bool.booleanValue())) {
            m45074R();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m45074R() {
        mo19272b();
        String a = this.f21269a.mo19365F().f21337m.mo39098a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo38935N("app", "_npa", (Object) null, this.f21269a.mo19274f().currentTimeMillis());
            } else {
                mo38935N("app", "_npa", Long.valueOf(true != "true".equals(a) ? 0 : 1), this.f21269a.mo19274f().currentTimeMillis());
            }
        }
        if (!this.f21269a.mo19385n() || !this.f46305o) {
            this.f21269a.mo19276j().mo19281p().mo38856a("Updating Scion state (FE)");
            this.f21269a.mo19370L().mo39225w();
            return;
        }
        this.f21269a.mo19276j().mo19281p().mo38856a("Recording app launch after enabling measurement for the first time (FE)");
        mo38948g0();
        C9074ad.m42632b();
        if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46687f0)) {
            this.f21269a.mo19371M().f46390d.mo38977a();
        }
        this.f21269a.mo19273e().mo38909z(new C9821k5(this));
    }

    /* renamed from: d0 */
    static /* synthetic */ void m45075d0(C9779g6 g6Var, C11027b bVar, int i, long j, boolean z, boolean z2) {
        g6Var.mo19272b();
        g6Var.mo39230d();
        if (j > g6Var.f46302l || !C11027b.m49404j(g6Var.f46303m, i)) {
            C4671q3 F = g6Var.f21269a.mo19365F();
            C4670h4 h4Var = F.f21269a;
            F.mo19272b();
            if (F.mo19401w(i)) {
                SharedPreferences.Editor edit = F.mo19393n().edit();
                edit.putString("consent_settings", bVar.mo43336h());
                edit.putInt("consent_source", i);
                edit.apply();
                g6Var.f46302l = j;
                g6Var.f46303m = i;
                g6Var.f21269a.mo19370L().mo39222t(z);
                if (z2) {
                    g6Var.f21269a.mo19370L().mo39212S(new AtomicReference());
                    return;
                }
                return;
            }
            g6Var.f21269a.mo19276j().mo19285u().mo38857b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        g6Var.f21269a.mo19276j().mo19285u().mo38857b("Dropped out-of-date consent setting, proposed settings", bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo38922A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f21269a.mo19273e().mo38909z(new C9854n5(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo38923B(String str, String str2, long j, Object obj) {
        this.f21269a.mo19273e().mo38909z(new C9865o5(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo38924C(String str) {
        this.f46297g.set(str);
    }

    /* renamed from: D */
    public final void mo38925D(Bundle bundle) {
        mo38926E(bundle, this.f21269a.mo19274f().currentTimeMillis());
    }

    /* renamed from: E */
    public final void mo38926E(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C4604n.m20098k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f21269a.mo19276j().mo19287w().mo38856a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C4604n.m20098k(bundle2);
        C11039n.m49437a(bundle2, "app_id", cls2, (Object) null);
        C11039n.m49437a(bundle2, TtmlNode.ATTR_TTS_ORIGIN, cls2, (Object) null);
        C11039n.m49437a(bundle2, MediationMetaData.KEY_NAME, cls2, (Object) null);
        C11039n.m49437a(bundle2, "value", Object.class, (Object) null);
        C11039n.m49437a(bundle2, "trigger_event_name", cls2, (Object) null);
        C11039n.m49437a(bundle2, "trigger_timeout", cls, 0L);
        C11039n.m49437a(bundle2, "timed_out_event_name", cls2, (Object) null);
        C11039n.m49437a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C11039n.m49437a(bundle2, "triggered_event_name", cls2, (Object) null);
        C11039n.m49437a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C11039n.m49437a(bundle2, "time_to_live", cls, 0L);
        C11039n.m49437a(bundle2, "expired_event_name", cls2, (Object) null);
        C11039n.m49437a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        C4604n.m20094g(bundle2.getString(MediationMetaData.KEY_NAME));
        C4604n.m20094g(bundle2.getString(TtmlNode.ATTR_TTS_ORIGIN));
        C4604n.m20098k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        if (this.f21269a.mo19372N().mo19319n0(string) != 0) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Invalid conditional user property name", this.f21269a.mo19363D().mo39322f(string));
        } else if (this.f21269a.mo19372N().mo19314j0(string, obj) == 0) {
            Object o = this.f21269a.mo19372N().mo19320o(string, obj);
            if (o == null) {
                this.f21269a.mo19276j().mo19282q().mo38858c("Unable to normalize conditional user property value", this.f21269a.mo19363D().mo39322f(string), obj);
                return;
            }
            C11039n.m49438b(bundle2, o);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f21269a.mo19392z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f21269a.mo19276j().mo19282q().mo38858c("Invalid conditional user property timeout", this.f21269a.mo19363D().mo39322f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f21269a.mo19392z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f21269a.mo19276j().mo19282q().mo38858c("Invalid conditional user property time to live", this.f21269a.mo19363D().mo39322f(string), Long.valueOf(j3));
            } else {
                this.f21269a.mo19273e().mo38909z(new C9886q5(this, bundle2));
            }
        } else {
            this.f21269a.mo19276j().mo19282q().mo38858c("Invalid conditional user property value", this.f21269a.mo19363D().mo39322f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo38927F(Bundle bundle, int i, long j) {
        mo39230d();
        String g = C11027b.m49403g(bundle);
        if (g != null) {
            this.f21269a.mo19276j().mo19288x().mo38857b("Ignoring invalid consent setting", g);
            this.f21269a.mo19276j().mo19288x().mo38856a("Valid consent values are 'granted', 'denied'");
        }
        mo38928G(C11027b.m49401a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo38928G(C11027b bVar, int i, long j) {
        boolean z;
        boolean z2;
        C11027b bVar2;
        boolean z3;
        C11027b bVar3 = bVar;
        int i2 = i;
        mo39230d();
        if (i2 != -10 && bVar.mo43333e() == null && bVar.mo43335f() == null) {
            this.f21269a.mo19276j().mo19288x().mo38856a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f46298h) {
            z = true;
            z2 = false;
            if (C11027b.m49404j(i2, this.f46300j)) {
                boolean k = bVar.mo43339k(this.f46299i);
                C11026a aVar = C11026a.ANALYTICS_STORAGE;
                if (bVar.mo43338i(aVar) && !this.f46299i.mo43338i(aVar)) {
                    z2 = true;
                }
                C11027b d = bVar.mo43332d(this.f46299i);
                this.f46299i = d;
                this.f46300j = i2;
                boolean z4 = k;
                bVar2 = d;
                z3 = z2;
                z2 = z4;
            } else {
                bVar2 = bVar3;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.f21269a.mo19276j().mo19285u().mo38857b("Ignoring lower-priority consent settings, proposed settings", bVar2);
            return;
        }
        long andIncrement = this.f46301k.getAndIncrement();
        if (z2) {
            this.f46297g.set((Object) null);
            this.f21269a.mo19273e().mo38903A(new C9727b6(this, bVar2, j, i, andIncrement, z3));
        } else if (i2 == 30 || i2 == -10) {
            this.f21269a.mo19273e().mo38903A(new C9738c6(this, bVar2, i, andIncrement, z3));
        } else {
            this.f21269a.mo19273e().mo38909z(new C9748d6(this, bVar2, i, andIncrement, z3));
        }
    }

    /* renamed from: H */
    public final void mo38929H(Bundle bundle, long j) {
        C9366tc.m43665b();
        if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46703n0)) {
            this.f21269a.mo19273e().mo38903A(new C9799i5(this, bundle, j));
        } else {
            mo38951o(bundle, j);
        }
    }

    /* renamed from: I */
    public final void mo38930I(C11043r rVar) {
        C11043r rVar2;
        mo19272b();
        mo39230d();
        if (!(rVar == null || rVar == (rVar2 = this.f46294d))) {
            C4604n.m20102o(rVar2 == null, "EventInterceptor already set.");
        }
        this.f46294d = rVar;
    }

    /* renamed from: J */
    public final void mo38931J(Boolean bool) {
        mo39230d();
        this.f21269a.mo19273e().mo38909z(new C9717a6(this, bool));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo38932K(C11027b bVar) {
        mo19272b();
        boolean z = (bVar.mo43338i(C11026a.ANALYTICS_STORAGE) && bVar.mo43338i(C11026a.AD_STORAGE)) || this.f21269a.mo19370L().mo39205A();
        if (z != this.f21269a.mo19386o()) {
            this.f21269a.mo19382k(z);
            C4671q3 F = this.f21269a.mo19365F();
            C4670h4 h4Var = F.f21269a;
            F.mo19272b();
            Boolean valueOf = F.mo19393n().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo19393n().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m45073Q(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: L */
    public final void mo38933L(String str, String str2, Object obj, boolean z) {
        mo38934M(TtmlNode.TEXT_EMPHASIS_AUTO, "_ldl", obj, true, this.f21269a.mo19274f().currentTimeMillis());
    }

    /* renamed from: M */
    public final void mo38934M(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.f21269a.mo19372N().mo19319n0(str3);
        } else {
            C4668d9 N = this.f21269a.mo19372N();
            if (N.mo19306Q("user property", str3)) {
                if (!N.mo19302M("user property", C11042q.f50006a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    N.f21269a.mo19392z();
                    if (N.mo19301L("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            C4668d9 N2 = this.f21269a.mo19372N();
            this.f21269a.mo19392z();
            this.f21269a.mo19372N().mo19290A(this.f46306p, (String) null, i, "_ev", N2.mo19322p(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int j0 = this.f21269a.mo19372N().mo19314j0(str3, obj2);
            if (j0 != 0) {
                C4668d9 N3 = this.f21269a.mo19372N();
                this.f21269a.mo19392z();
                String p = N3.mo19322p(str3, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i2 = obj.toString().length();
                } else {
                    i2 = 0;
                }
                this.f21269a.mo19372N().mo19290A(this.f46306p, (String) null, j0, "_ev", p, i2);
                return;
            }
            Object o = this.f21269a.mo19372N().mo19320o(str3, obj2);
            if (o != null) {
                mo38923B(str4, str2, j, o);
            }
        } else {
            mo38923B(str4, str2, j, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38935N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C4604n.m20094g(r9)
            com.google.android.gms.common.internal.C4604n.m20094g(r10)
            r8.mo19272b()
            r8.mo39230d()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.h4 r10 = r8.f21269a
            com.google.android.gms.measurement.internal.q3 r10 = r10.mo19365F()
            com.google.android.gms.measurement.internal.p3 r10 = r10.f21337m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo39099b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.h4 r10 = r8.f21269a
            com.google.android.gms.measurement.internal.q3 r10 = r10.mo19365F()
            com.google.android.gms.measurement.internal.p3 r10 = r10.f21337m
            java.lang.String r0 = "unset"
            r10.mo39099b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.h4 r10 = r8.f21269a
            boolean r10 = r10.mo19385n()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.h4 r9 = r8.f21269a
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19286v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo38856a(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.h4 r10 = r8.f21269a
            boolean r10 = r10.mo19388q()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzks r10 = new com.google.android.gms.measurement.internal.zzks
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.h4 r9 = r8.f21269a
            com.google.android.gms.measurement.internal.t7 r9 = r9.mo19370L()
            r9.mo39227y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9779g6.mo38935N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: O */
    public final void mo38936O(C11044s sVar) {
        mo39230d();
        C4604n.m20098k(sVar);
        if (!this.f46295e.remove(sVar)) {
            this.f21269a.mo19276j().mo19287w().mo38856a("OnEventListener had not been registered");
        }
    }

    /* renamed from: S */
    public final int mo38937S(String str) {
        C4604n.m20094g(str);
        this.f21269a.mo19392z();
        return 25;
    }

    /* renamed from: T */
    public final Boolean mo38938T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f21269a.mo19273e().mo38905q(atomicReference, 15000, "boolean test flag value", new C9906s5(this, atomicReference));
    }

    /* renamed from: U */
    public final Double mo38939U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f21269a.mo19273e().mo38905q(atomicReference, 15000, "double test flag value", new C9975z5(this, atomicReference));
    }

    /* renamed from: V */
    public final Integer mo38940V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f21269a.mo19273e().mo38905q(atomicReference, 15000, "int test flag value", new C9965y5(this, atomicReference));
    }

    /* renamed from: W */
    public final Long mo38941W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f21269a.mo19273e().mo38905q(atomicReference, 15000, "long test flag value", new C9955x5(this, atomicReference));
    }

    /* renamed from: X */
    public final String mo38942X() {
        return (String) this.f46297g.get();
    }

    /* renamed from: Y */
    public final String mo38943Y() {
        C9844m6 s = this.f21269a.mo19369K().mo39201s();
        if (s != null) {
            return s.f46468b;
        }
        return null;
    }

    /* renamed from: Z */
    public final String mo38944Z() {
        C9844m6 s = this.f21269a.mo19369K().mo39201s();
        if (s != null) {
            return s.f46467a;
        }
        return null;
    }

    /* renamed from: a0 */
    public final String mo38945a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f21269a.mo19273e().mo38905q(atomicReference, 15000, "String test flag value", new C9945w5(this, atomicReference));
    }

    /* renamed from: b0 */
    public final ArrayList mo38946b0(String str, String str2) {
        if (this.f21269a.mo19273e().mo38904C()) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f21269a.mo19275g();
        if (C9721b.m45001a()) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f21269a.mo19273e().mo38905q(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get conditional user properties", new C9916t5(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C4668d9.m21501u(list);
        }
        this.f21269a.mo19276j().mo19282q().mo38857b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: c0 */
    public final Map mo38947c0(String str, String str2, boolean z) {
        if (this.f21269a.mo19273e().mo38904C()) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f21269a.mo19275g();
        if (C9721b.m45001a()) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f21269a.mo19273e().mo38905q(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new C9925u5(this, atomicReference, (String) null, str, str2, z));
        List<zzks> list = (List) atomicReference.get();
        if (list == null) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C6077a aVar = new C6077a(list.size());
        for (zzks zzks : list) {
            Object C0 = zzks.mo39366C0();
            if (C0 != null) {
                aVar.put(zzks.f46942c, C0);
            }
        }
        return aVar;
    }

    /* renamed from: g0 */
    public final void mo38948g0() {
        mo19272b();
        mo39230d();
        if (this.f21269a.mo19388q()) {
            if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46675Z)) {
                C4669f z = this.f21269a.mo19392z();
                z.f21269a.mo19275g();
                Boolean t = z.mo19353t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f21269a.mo19276j().mo19281p().mo38856a("Deferred Deep Link feature enabled.");
                    this.f21269a.mo19273e().mo38909z(new C9778g5(this));
                }
            }
            this.f21269a.mo19370L().mo39208O();
            this.f46305o = false;
            C4671q3 F = this.f21269a.mo19365F();
            F.mo19272b();
            String string = F.mo19393n().getString("previous_os_version", (String) null);
            F.f21269a.mo19360A().mo38880i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo19393n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f21269a.mo19360A().mo38880i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo38956u(TtmlNode.TEXT_EMPHASIS_AUTO, "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: h0 */
    public final void mo38949h0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.f21269a.mo19274f().currentTimeMillis();
        C4604n.m20094g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f21269a.mo19273e().mo38909z(new C9896r5(this, bundle2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo19403m() {
        return false;
    }

    /* renamed from: n */
    public final void mo38950n() {
        if ((this.f21269a.mo19277r().getApplicationContext() instanceof Application) && this.f46293c != null) {
            ((Application) this.f21269a.mo19277r().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f46293c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo38952p(Bundle bundle) {
        if (bundle == null) {
            this.f21269a.mo19365F().f21347w.mo39063b(new Bundle());
            return;
        }
        Bundle a = this.f21269a.mo19365F().f21347w.mo39062a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f21269a.mo19372N().mo19309T(obj)) {
                    this.f21269a.mo19372N().mo19290A(this.f46306p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f21269a.mo19276j().mo19288x().mo38858c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C4668d9.m21487V(str)) {
                this.f21269a.mo19276j().mo19288x().mo38857b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                C4668d9 N = this.f21269a.mo19372N();
                this.f21269a.mo19392z();
                if (N.mo19303N("param", str, 100, obj)) {
                    this.f21269a.mo19372N().mo19291B(a, str, obj);
                }
            }
        }
        this.f21269a.mo19372N();
        int l = this.f21269a.mo19392z().mo19346l();
        if (a.size() > l) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > l) {
                    a.remove(str2);
                }
            }
            this.f21269a.mo19372N().mo19290A(this.f46306p, (String) null, 26, (String) null, (String) null, 0);
            this.f21269a.mo19276j().mo19288x().mo38856a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f21269a.mo19365F().f21347w.mo39063b(a);
        this.f21269a.mo19370L().mo39224v(a);
    }

    /* renamed from: q */
    public final void mo38953q(String str, String str2, Bundle bundle) {
        mo38954s(str, str2, bundle, true, true, this.f21269a.mo19274f().currentTimeMillis());
    }

    /* renamed from: s */
    public final void mo38954s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String str4 = str2;
        if (C4668d9.m21491Z(str2, "screen_view")) {
            this.f21269a.mo19369K().mo39199F(bundle2, j);
            return;
        }
        long j2 = j;
        mo38922A(str3, str2, j, bundle2, z2, !z2 || this.f46294d == null || C4668d9.m21487V(str2), z, (String) null);
    }

    /* renamed from: t */
    public final void mo38955t(String str, String str2, Bundle bundle, String str3) {
        C4670h4.m21579t();
        mo38922A(TtmlNode.TEXT_EMPHASIS_AUTO, str2, this.f21269a.mo19274f().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo38956u(String str, String str2, Bundle bundle) {
        mo19272b();
        mo38957v(str, str2, this.f21269a.mo19274f().currentTimeMillis(), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo38957v(String str, String str2, long j, Bundle bundle) {
        mo19272b();
        mo38958w(str, str2, j, bundle, true, this.f46294d == null || C4668d9.m21487V(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38958w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.C4604n.m20094g(r20)
            com.google.android.gms.common.internal.C4604n.m20098k(r24)
            r19.mo19272b()
            r19.mo39230d()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            boolean r1 = r1.mo19385n()
            if (r1 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.u2 r1 = r1.mo19361B()
            java.util.List r1 = r1.mo19410u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo38858c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f46296f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f46296f = r15
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo19389s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo19277r()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo19277r()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19287w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo38857b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19285u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo38856a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19275g()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            a5.e r0 = r0.mo19274f()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo38935N(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            r0.mo19275g()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C4668d9.m21492a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r0 = r0.mo19372N()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo19365F()
            com.google.android.gms.measurement.internal.m3 r1 = r1.f21347w
            android.os.Bundle r1 = r1.mo39062a()
            r0.mo19334y(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19275g()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo19306Q(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = p255u5.C11040o.f49998a
            java.lang.String[] r5 = p255u5.C11040o.f49999b
            boolean r3 = r1.mo19302M(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.h4 r3 = r1.f21269a
            r3.mo19392z()
            boolean r1 = r1.mo19301L(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19283s()
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r2 = r2.mo19363D()
            java.lang.String r2 = r2.mo39320d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo38857b(r3, r2)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            r2.mo19392z()
            java.lang.String r0 = r1.mo19322p(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            com.google.android.gms.measurement.internal.c9 r2 = r7.f46306p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo19290A(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.internal.measurement.C9458zd.m44022b()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.f r1 = r1.mo19392z()
            com.google.android.gms.measurement.internal.r2 r2 = com.google.android.gms.measurement.internal.C9903s2.f46719v0
            boolean r1 = r1.mo19337B(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19275g()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.t6 r1 = r1.mo19369K()
            com.google.android.gms.measurement.internal.m6 r1 = r1.mo39202t(r14)
            if (r1 == 0) goto L_0x01a3
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a3
            r1.f46470d = r15
        L_0x01a3:
            if (r25 == 0) goto L_0x01a9
            if (r27 != 0) goto L_0x01a9
            r3 = 1
            goto L_0x01aa
        L_0x01a9:
            r3 = 0
        L_0x01aa:
            com.google.android.gms.measurement.internal.C4668d9.m21502x(r1, r12, r3)
            goto L_0x01d1
        L_0x01ae:
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19275g()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.t6 r1 = r1.mo19369K()
            com.google.android.gms.measurement.internal.m6 r1 = r1.mo39202t(r14)
            if (r1 == 0) goto L_0x01c7
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01c7
            r1.f46470d = r15
        L_0x01c7:
            if (r25 == 0) goto L_0x01cd
            if (r27 != 0) goto L_0x01cd
            r3 = 1
            goto L_0x01ce
        L_0x01cd:
            r3 = 0
        L_0x01ce:
            com.google.android.gms.measurement.internal.C4668d9.m21502x(r1, r12, r3)
        L_0x01d1:
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C4668d9.m21487V(r21)
            if (r25 == 0) goto L_0x021e
            u5.r r4 = r7.f46294d
            if (r4 == 0) goto L_0x021e
            if (r3 != 0) goto L_0x021e
            if (r1 == 0) goto L_0x01e8
            r16 = 1
            goto L_0x0220
        L_0x01e8:
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r1 = r1.mo19363D()
            java.lang.String r1 = r1.mo39320d(r9)
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r2 = r2.mo19363D()
            java.lang.String r2 = r2.mo39318b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo38858c(r3, r1, r2)
            u5.r r0 = r7.f46294d
            com.google.android.gms.common.internal.C4604n.m20098k(r0)
            u5.r r1 = r7.f46294d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo38967a(r2, r3, r4, r5)
            return
        L_0x021e:
            r16 = r1
        L_0x0220:
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            boolean r1 = r1.mo19388q()
            if (r1 == 0) goto L_0x0511
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            int r1 = r1.mo19315k0(r9)
            if (r1 == 0) goto L_0x027e
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19283s()
            com.google.android.gms.measurement.internal.h4 r3 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo38857b(r4, r3)
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r2 = r2.mo19372N()
            com.google.android.gms.measurement.internal.h4 r3 = r7.f21269a
            r3.mo19392z()
            java.lang.String r0 = r2.mo19322p(r9, r0, r15)
            if (r9 == 0) goto L_0x0262
            int r14 = r21.length()
        L_0x0262:
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r2 = r2.mo19372N()
            com.google.android.gms.measurement.internal.c9 r3 = r7.f46306p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo19290A(r21, r22, r23, r24, r25, r26)
            return
        L_0x027e:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = p006a5.C6484f.m28253c(r1)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo19331v0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.C4604n.m20098k(r12)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19275g()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.t6 r1 = r1.mo19369K()
            com.google.android.gms.measurement.internal.m6 r1 = r1.mo39202t(r14)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02e3
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02e3
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.j8 r1 = r1.mo19371M()
            com.google.android.gms.measurement.internal.g8 r1 = r1.f46391e
            com.google.android.gms.measurement.internal.j8 r2 = r1.f46312d
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            a5.e r2 = r2.mo19274f()
            long r2 = r2.elapsedRealtime()
            long r14 = r1.f46310b
            long r14 = r2 - r14
            r1.f46310b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e3
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            r1.mo19330v(r12, r14)
        L_0x02e3:
            com.google.android.gms.internal.measurement.C9318qc.m43515b()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.f r1 = r1.mo19392z()
            com.google.android.gms.measurement.internal.r2 r2 = com.google.android.gms.measurement.internal.C9903s2.f46685e0
            boolean r1 = r1.mo19337B(r13, r2)
            if (r1 == 0) goto L_0x036d
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x034c
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x034c
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = p006a5.C0116s.m414a(r2)
            if (r3 == 0) goto L_0x0318
            r2 = r13
            goto L_0x031e
        L_0x0318:
            if (r2 == 0) goto L_0x031e
            java.lang.String r2 = r2.trim()
        L_0x031e:
            com.google.android.gms.measurement.internal.h4 r3 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r3 = r3.mo19365F()
            com.google.android.gms.measurement.internal.p3 r3 = r3.f21344t
            java.lang.String r3 = r3.mo39098a()
            boolean r3 = com.google.android.gms.measurement.internal.C4668d9.m21491Z(r2, r3)
            if (r3 != 0) goto L_0x033c
            com.google.android.gms.measurement.internal.h4 r1 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo19365F()
            com.google.android.gms.measurement.internal.p3 r1 = r1.f21344t
            r1.mo39099b(r2)
            goto L_0x036d
        L_0x033c:
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo38856a(r1)
            return
        L_0x034c:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x036d
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            com.google.android.gms.measurement.internal.h4 r1 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo19365F()
            com.google.android.gms.measurement.internal.p3 r1 = r1.f21344t
            java.lang.String r1 = r1.mo39098a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x036d
            r12.putString(r2, r1)
        L_0x036d:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo19365F()
            com.google.android.gms.measurement.internal.n3 r1 = r1.f21339o
            long r1 = r1.mo39075a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo19365F()
            boolean r1 = r1.mo19400v(r10)
            if (r1 == 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo19365F()
            com.google.android.gms.measurement.internal.l3 r1 = r1.f21341q
            boolean r1 = r1.mo39052b()
            if (r1 == 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo38856a(r2)
            r15 = 0
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            a5.e r1 = r1.mo19274f()
            long r17 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r19
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.mo38935N(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            a5.e r1 = r1.mo19274f()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo38935N(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            a5.e r1 = r1.mo19274f()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo38935N(r2, r3, r4, r5)
            goto L_0x03f1
        L_0x03ef:
            r13 = r4
            r8 = r5
        L_0x03f1:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0418
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo38856a(r2)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.j8 r1 = r1.mo19371M()
            com.google.android.gms.measurement.internal.h8 r1 = r1.f46390d
            r2 = 1
            r1.mo38978b(r10, r2)
        L_0x0418:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0429:
            if (r3 >= r2) goto L_0x0477
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0474
            com.google.android.gms.measurement.internal.h4 r5 = r7.f21269a
            r5.mo19372N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0449
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x046f
        L_0x0449:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x045a
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x046f
        L_0x045a:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x046e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x046f
        L_0x046e:
            r8 = 0
        L_0x046f:
            if (r8 == 0) goto L_0x0474
            r12.putParcelableArray(r4, r8)
        L_0x0474:
            int r3 = r3 + 1
            goto L_0x0429
        L_0x0477:
            r8 = 0
        L_0x0478:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x04e1
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x048b
            java.lang.String r2 = "_ep"
            r9 = r20
            goto L_0x048f
        L_0x048b:
            r9 = r20
            r2 = r21
        L_0x048f:
            r1.putString(r0, r9)
            if (r26 == 0) goto L_0x049e
            com.google.android.gms.measurement.internal.h4 r3 = r7.f21269a
            com.google.android.gms.measurement.internal.d9 r3 = r3.mo19372N()
            android.os.Bundle r1 = r3.mo19329u0(r1)
        L_0x049e:
            r12 = r1
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas
            r3.<init>(r12)
            r1 = r15
            r4 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.t7 r1 = r1.mo19370L()
            r5 = r28
            r1.mo39217n(r15, r5)
            if (r16 != 0) goto L_0x04de
            java.util.Set r1 = r7.f46295e
            java.util.Iterator r15 = r1.iterator()
        L_0x04c1:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04de
            java.lang.Object r1 = r15.next()
            u5.s r1 = (p255u5.C11044s) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo38980a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x04c1
        L_0x04de:
            int r8 = r8 + 1
            goto L_0x0478
        L_0x04e1:
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            r0.mo19275g()
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.t6 r0 = r0.mo19369K()
            r1 = 0
            com.google.android.gms.measurement.internal.m6 r0 = r0.mo39202t(r1)
            if (r0 == 0) goto L_0x0511
            r1 = r21
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0511
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.j8 r0 = r0.mo19371M()
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            a5.e r1 = r1.mo19274f()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.g8 r0 = r0.f46391e
            r3 = 1
            r0.mo38966d(r3, r3, r1)
        L_0x0511:
            return
        L_0x0512:
            com.google.android.gms.measurement.internal.h4 r0 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo38856a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9779g6.mo38958w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo38959x(C11044s sVar) {
        mo39230d();
        C4604n.m20098k(sVar);
        if (!this.f46295e.add(sVar)) {
            this.f21269a.mo19276j().mo19287w().mo38856a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo38960y(long j) {
        this.f46297g.set((Object) null);
        this.f21269a.mo19273e().mo38909z(new C9876p5(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo38961z(long j, boolean z) {
        mo19272b();
        mo39230d();
        this.f21269a.mo19276j().mo19281p().mo38856a("Resetting analytics data (FE)");
        C9813j8 M = this.f21269a.mo19371M();
        M.mo19272b();
        M.f46391e.mo38963a();
        boolean n = this.f21269a.mo19385n();
        C4671q3 F = this.f21269a.mo19365F();
        F.f21329e.mo39076b(j);
        if (!TextUtils.isEmpty(F.f21269a.mo19365F().f21344t.mo39098a())) {
            F.f21344t.mo39099b((String) null);
        }
        C9074ad.m42632b();
        C4669f z2 = F.f21269a.mo19392z();
        C9893r2 r2Var = C9903s2.f46687f0;
        if (z2.mo19337B((String) null, r2Var)) {
            F.f21339o.mo39076b(0);
        }
        if (!F.f21269a.mo19392z().mo19340E()) {
            F.mo19398t(!n);
        }
        F.f21345u.mo39099b((String) null);
        F.f21346v.mo39076b(0);
        F.f21347w.mo39063b((Bundle) null);
        if (z) {
            this.f21269a.mo19370L().mo39219p();
        }
        C9074ad.m42632b();
        if (this.f21269a.mo19392z().mo19337B((String) null, r2Var)) {
            this.f21269a.mo19371M().f46390d.mo38977a();
        }
        this.f46305o = !n;
    }
}
