package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9917t6 extends C9923u3 {

    /* renamed from: c */
    private volatile C9844m6 f46750c;

    /* renamed from: d */
    private volatile C9844m6 f46751d;

    /* renamed from: e */
    protected C9844m6 f46752e;

    /* renamed from: f */
    private final Map f46753f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f46754g;

    /* renamed from: h */
    private volatile boolean f46755h;

    /* renamed from: i */
    private volatile C9844m6 f46756i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9844m6 f46757j;

    /* renamed from: k */
    private boolean f46758k;

    /* renamed from: l */
    private final Object f46759l = new Object();

    /* renamed from: m */
    private C9844m6 f46760m;

    /* renamed from: n */
    private String f46761n;

    public C9917t6(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: H */
    private final C9844m6 m45360H(Activity activity) {
        C4604n.m20098k(activity);
        C9844m6 m6Var = (C9844m6) this.f46753f.get(activity);
        if (m6Var == null) {
            C9844m6 m6Var2 = new C9844m6((String) null, mo39203u(activity.getClass(), "Activity"), this.f21269a.mo19372N().mo19325r0());
            this.f46753f.put(activity, m6Var2);
            m6Var = m6Var2;
        }
        return this.f46756i != null ? this.f46756i : m6Var;
    }

    /* renamed from: n */
    private final void m45361n(Activity activity, C9844m6 m6Var, boolean z) {
        C9844m6 m6Var2;
        C9844m6 m6Var3;
        C9844m6 m6Var4 = m6Var;
        if (this.f46750c == null) {
            m6Var2 = this.f46751d;
        } else {
            m6Var2 = this.f46750c;
        }
        C9844m6 m6Var5 = m6Var2;
        if (m6Var4.f46468b == null) {
            m6Var3 = new C9844m6(m6Var4.f46467a, activity != null ? mo39203u(activity.getClass(), "Activity") : null, m6Var4.f46469c, m6Var4.f46471e, m6Var4.f46472f);
        } else {
            m6Var3 = m6Var4;
        }
        this.f46751d = this.f46750c;
        this.f46750c = m6Var3;
        this.f21269a.mo19273e().mo38909z(new C9866o6(this, m6Var3, m6Var5, this.f21269a.mo19274f().elapsedRealtime(), z));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m45362o(C9844m6 m6Var, C9844m6 m6Var2, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        long j3;
        C9844m6 m6Var3 = m6Var;
        C9844m6 m6Var4 = m6Var2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo19272b();
        boolean z2 = false;
        boolean z3 = m6Var4 == null || m6Var4.f46469c != m6Var3.f46469c || !C4668d9.m21491Z(m6Var4.f46468b, m6Var3.f46468b) || !C4668d9.m21491Z(m6Var4.f46467a, m6Var3.f46467a);
        if (z && this.f46752e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C4668d9.m21502x(m6Var3, bundle4, true);
            if (m6Var4 != null) {
                String str = m6Var4.f46467a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = m6Var4.f46468b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", m6Var4.f46469c);
            }
            if (z2) {
                C9781g8 g8Var = this.f21269a.mo19371M().f46391e;
                long j5 = j4 - g8Var.f46310b;
                g8Var.f46310b = j4;
                if (j5 > 0) {
                    this.f21269a.mo19372N().mo19330v(bundle4, j5);
                }
            }
            if (!this.f21269a.mo19392z().mo19339D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != m6Var3.f46471e ? TtmlNode.TEXT_EMPHASIS_AUTO : "app";
            long currentTimeMillis = this.f21269a.mo19274f().currentTimeMillis();
            if (m6Var3.f46471e) {
                j3 = currentTimeMillis;
                long j6 = m6Var3.f46472f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f21269a.mo19367I().mo38957v(str3, "_vs", j2, bundle4);
                }
            } else {
                j3 = currentTimeMillis;
            }
            j2 = j3;
            this.f21269a.mo19367I().mo38957v(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            m45363p(this.f46752e, true, j4);
        }
        this.f46752e = m6Var3;
        if (m6Var3.f46471e) {
            this.f46757j = m6Var3;
        }
        this.f21269a.mo19370L().mo39223u(m6Var3);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m45363p(C9844m6 m6Var, boolean z, long j) {
        this.f21269a.mo19391y().mo39316m(this.f21269a.mo19274f().elapsedRealtime());
        if (this.f21269a.mo19371M().f46391e.mo38966d(m6Var != null && m6Var.f46470d, z, j) && m6Var != null) {
            m6Var.f46470d = false;
        }
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m45367x(C9917t6 t6Var, Bundle bundle, C9844m6 m6Var, C9844m6 m6Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        t6Var.m45362o(m6Var, m6Var2, j, true, t6Var.f21269a.mo19372N().mo19331v0((String) null, "screen_view", bundle, (List) null, false));
    }

    /* renamed from: A */
    public final void mo39194A(Activity activity) {
        synchronized (this.f46759l) {
            if (activity == this.f46754g) {
                this.f46754g = null;
            }
        }
        if (this.f21269a.mo19392z().mo19339D()) {
            this.f46753f.remove(activity);
        }
    }

    /* renamed from: B */
    public final void mo39195B(Activity activity) {
        synchronized (this.f46759l) {
            this.f46758k = false;
            this.f46755h = true;
        }
        long elapsedRealtime = this.f21269a.mo19274f().elapsedRealtime();
        if (!this.f21269a.mo19392z().mo19339D()) {
            this.f46750c = null;
            this.f21269a.mo19273e().mo38909z(new C9887q6(this, elapsedRealtime));
            return;
        }
        C9844m6 H = m45360H(activity);
        this.f46751d = this.f46750c;
        this.f46750c = null;
        this.f21269a.mo19273e().mo38909z(new C9897r6(this, H, elapsedRealtime));
    }

    /* renamed from: C */
    public final void mo39196C(Activity activity) {
        synchronized (this.f46759l) {
            this.f46758k = true;
            if (activity != this.f46754g) {
                synchronized (this.f46759l) {
                    this.f46754g = activity;
                    this.f46755h = false;
                }
                if (this.f21269a.mo19392z().mo19339D()) {
                    this.f46756i = null;
                    this.f21269a.mo19273e().mo38909z(new C9907s6(this));
                }
            }
        }
        if (!this.f21269a.mo19392z().mo19339D()) {
            this.f46750c = this.f46756i;
            this.f21269a.mo19273e().mo38909z(new C9877p6(this));
            return;
        }
        m45361n(activity, m45360H(activity), false);
        C9961y1 y = this.f21269a.mo19391y();
        y.f21269a.mo19273e().mo38909z(new C9950x0(y, y.f21269a.mo19274f().elapsedRealtime()));
    }

    /* renamed from: D */
    public final void mo39197D(Activity activity, Bundle bundle) {
        C9844m6 m6Var;
        if (this.f21269a.mo19392z().mo19339D() && bundle != null && (m6Var = (C9844m6) this.f46753f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(TtmlNode.ATTR_ID, m6Var.f46469c);
            bundle2.putString(MediationMetaData.KEY_NAME, m6Var.f46467a);
            bundle2.putString("referrer_name", m6Var.f46468b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39198E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.h4 r0 = r3.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            boolean r0 = r0.mo19339D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19288x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo38856a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.m6 r0 = r3.f46750c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19288x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo38856a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f46753f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19288x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo38856a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo39203u(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f46468b
            boolean r1 = com.google.android.gms.measurement.internal.C4668d9.m21491Z(r1, r6)
            java.lang.String r0 = r0.f46467a
            boolean r0 = com.google.android.gms.measurement.internal.C4668d9.m21491Z(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19288x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo38856a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            com.google.android.gms.measurement.internal.h4 r1 = r3.f21269a
            r1.mo19392z()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19288x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo38857b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.h4 r1 = r3.f21269a
            r1.mo19392z()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.h4 r4 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19288x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo38857b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.h4 r0 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo38858c(r2, r1, r6)
            com.google.android.gms.measurement.internal.m6 r0 = new com.google.android.gms.measurement.internal.m6
            com.google.android.gms.measurement.internal.h4 r1 = r3.f21269a
            com.google.android.gms.measurement.internal.d9 r1 = r1.mo19372N()
            long r1 = r1.mo19325r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f46753f
            r5.put(r4, r0)
            r5 = 1
            r3.m45361n(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9917t6.mo39198E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f21269a.mo19276j().mo19286v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo38858c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f46750c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f46751d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f46750c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C9844m6(r3, r4, r12.f21269a.mo19372N().mo19325r0(), true, r14);
        r12.f46750c = r2;
        r12.f46751d = r0;
        r12.f46756i = r2;
        r12.f21269a.mo19273e().mo38909z(new com.google.android.gms.measurement.internal.C9855n6(r12, r13, r2, r0, r12.f21269a.mo19274f().elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39199F(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f46759l
            monitor-enter(r0)
            boolean r1 = r12.f46758k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.h4 r13 = r12.f21269a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo19276j()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.b3 r13 = r13.mo19288x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo38856a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h4 r4 = r12.f21269a     // Catch:{ all -> 0x011b }
            r4.mo19392z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.h4 r13 = r12.f21269a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo19276j()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.b3 r13 = r13.mo19288x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo38857b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h4 r5 = r12.f21269a     // Catch:{ all -> 0x011b }
            r5.mo19392z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.h4 r13 = r12.f21269a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo19276j()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.b3 r13 = r13.mo19288x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo38857b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f46754g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo39203u(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.m6 r1 = r12.f46750c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f46755h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f46755h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f46468b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.C4668d9.m21491Z(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f46467a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.C4668d9.m21491Z(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.h4 r13 = r12.f21269a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo19276j()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.b3 r13 = r13.mo19288x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo38856a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h4 r0 = r12.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo38858c(r5, r1, r2)
            com.google.android.gms.measurement.internal.m6 r0 = r12.f46750c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.m6 r0 = r12.f46751d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.m6 r0 = r12.f46750c
        L_0x00e5:
            com.google.android.gms.measurement.internal.m6 r1 = new com.google.android.gms.measurement.internal.m6
            com.google.android.gms.measurement.internal.h4 r2 = r12.f21269a
            com.google.android.gms.measurement.internal.d9 r2 = r2.mo19372N()
            long r5 = r2.mo19325r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f46750c = r1
            r12.f46751d = r0
            r12.f46756i = r1
            com.google.android.gms.measurement.internal.h4 r14 = r12.f21269a
            a5.e r14 = r14.mo19274f()
            long r10 = r14.elapsedRealtime()
            com.google.android.gms.measurement.internal.h4 r14 = r12.f21269a
            com.google.android.gms.measurement.internal.f4 r14 = r14.mo19273e()
            com.google.android.gms.measurement.internal.n6 r15 = new com.google.android.gms.measurement.internal.n6
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo38909z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9917t6.mo39199F(android.os.Bundle, long):void");
    }

    /* renamed from: G */
    public final void mo39200G(String str, C9844m6 m6Var) {
        mo19272b();
        synchronized (this) {
            String str2 = this.f46761n;
            if (str2 == null || str2.equals(str) || m6Var != null) {
                this.f46761n = str;
                this.f46760m = m6Var;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo19403m() {
        return false;
    }

    /* renamed from: s */
    public final C9844m6 mo39201s() {
        return this.f46750c;
    }

    /* renamed from: t */
    public final C9844m6 mo39202t(boolean z) {
        mo39230d();
        mo19272b();
        if (!z) {
            return this.f46752e;
        }
        C9844m6 m6Var = this.f46752e;
        return m6Var != null ? m6Var : this.f46757j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo39203u(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f21269a.mo19392z();
        if (length2 <= 100) {
            return str2;
        }
        this.f21269a.mo19392z();
        return str2.substring(0, 100);
    }

    /* renamed from: z */
    public final void mo39204z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f21269a.mo19392z().mo19339D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f46753f.put(activity, new C9844m6(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong(TtmlNode.ATTR_ID)));
        }
    }
}
