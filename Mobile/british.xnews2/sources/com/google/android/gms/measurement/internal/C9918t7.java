package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.C9186i1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p185z4.C6469a;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9918t7 extends C9923u3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9908s7 f46762c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11030e f46763d;

    /* renamed from: e */
    private volatile Boolean f46764e;

    /* renamed from: f */
    private final C9826l f46765f;

    /* renamed from: g */
    private final C9824k8 f46766g;

    /* renamed from: h */
    private final List f46767h = new ArrayList();

    /* renamed from: i */
    private final C9826l f46768i;

    protected C9918t7(C4670h4 h4Var) {
        super(h4Var);
        this.f46766g = new C9824k8(h4Var.mo19274f());
        this.f46762c = new C9908s7(this);
        this.f46765f = new C9739c7(this, h4Var);
        this.f46768i = new C9759e7(this, h4Var);
    }

    /* renamed from: C */
    private final zzp m45381C(boolean z) {
        Pair a;
        this.f21269a.mo19275g();
        C4672u2 B = this.f21269a.mo19361B();
        String str = null;
        if (z) {
            C4667d3 j = this.f21269a.mo19276j();
            if (!(j.f21269a.mo19365F().f21328d == null || (a = j.f21269a.mo19365F().f21328d.mo39084a()) == null || a == C4671q3.f21326x)) {
                String valueOf = String.valueOf(a.second);
                String str2 = (String) a.first;
                StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return B.mo19406p(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m45382D() {
        mo19272b();
        this.f21269a.mo19276j().mo19286v().mo38857b("Processing queued up service tasks", Integer.valueOf(this.f46767h.size()));
        for (Runnable run : this.f46767h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Task exception while flushing queue", e);
            }
        }
        this.f46767h.clear();
        this.f46768i.mo39048b();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m45383E() {
        mo19272b();
        this.f46766g.mo39044b();
        C9826l lVar = this.f46765f;
        this.f21269a.mo19392z();
        lVar.mo39049d(((Long) C9903s2.f46660K.mo39174a((Object) null)).longValue());
    }

    /* renamed from: F */
    private final void m45384F(Runnable runnable) throws IllegalStateException {
        mo19272b();
        if (mo39228z()) {
            runnable.run();
            return;
        }
        int size = this.f46767h.size();
        this.f21269a.mo19392z();
        if (((long) size) >= 1000) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f46767h.add(runnable);
        this.f46768i.mo39049d(60000);
        mo39209P();
    }

    /* renamed from: G */
    private final boolean m45385G() {
        this.f21269a.mo19275g();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m45390M(C9918t7 t7Var, ComponentName componentName) {
        t7Var.mo19272b();
        if (t7Var.f46763d != null) {
            t7Var.f46763d = null;
            t7Var.f21269a.mo19276j().mo19286v().mo38857b("Disconnected from device MeasurementService", componentName);
            t7Var.mo19272b();
            t7Var.mo39209P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo39205A() {
        mo19272b();
        mo39230d();
        if (!mo39206B() || this.f21269a.mo19372N().mo19321o0() >= ((Integer) C9903s2.f46697k0.mo39174a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39206B() {
        /*
            r6 = this;
            r6.mo19272b()
            r6.mo39230d()
            java.lang.Boolean r0 = r6.f46764e
            if (r0 != 0) goto L_0x0149
            r6.mo19272b()
            r6.mo39230d()
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.q3 r0 = r0.mo19365F()
            r0.mo19272b()
            android.content.SharedPreferences r1 = r0.mo19393n()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo19393n()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0143
        L_0x003f:
            com.google.android.gms.measurement.internal.h4 r4 = r6.f21269a
            r4.mo19275g()
            com.google.android.gms.measurement.internal.h4 r4 = r6.f21269a
            com.google.android.gms.measurement.internal.u2 r4 = r4.mo19361B()
            int r4 = r4.mo19404n()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x010b
        L_0x0053:
            com.google.android.gms.measurement.internal.h4 r4 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19286v()
            java.lang.String r5 = "Checking service availability"
            r4.mo38856a(r5)
            com.google.android.gms.measurement.internal.h4 r4 = r6.f21269a
            com.google.android.gms.measurement.internal.d9 r4 = r4.mo19372N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo19323p0(r5)
            if (r4 == 0) goto L_0x00fa
            if (r4 == r1) goto L_0x00ea
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo38857b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()
            java.lang.String r3 = "Service updating"
            r0.mo38856a(r3)
            goto L_0x0050
        L_0x00a5:
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()
            java.lang.String r1 = "Service invalid"
            r0.mo38856a(r1)
            goto L_0x00c4
        L_0x00b5:
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()
            java.lang.String r1 = "Service disabled"
            r0.mo38856a(r1)
        L_0x00c4:
            r1 = 0
            goto L_0x010b
        L_0x00c6:
            com.google.android.gms.measurement.internal.h4 r4 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19281p()
            java.lang.String r5 = "Service container out of date"
            r4.mo38856a(r5)
            com.google.android.gms.measurement.internal.h4 r4 = r6.f21269a
            com.google.android.gms.measurement.internal.d9 r4 = r4.mo19372N()
            int r4 = r4.mo19321o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010b
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = 0
        L_0x00e8:
            r3 = r1
            goto L_0x00c4
        L_0x00ea:
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            java.lang.String r4 = "Service missing"
            r0.mo38856a(r4)
            goto L_0x010b
        L_0x00fa:
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            java.lang.String r3 = "Service available"
            r0.mo38856a(r3)
            goto L_0x0050
        L_0x010b:
            if (r3 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            boolean r0 = r0.mo19342G()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo38856a(r1)
            goto L_0x0142
        L_0x0129:
            if (r1 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.h4 r0 = r6.f21269a
            com.google.android.gms.measurement.internal.q3 r0 = r0.mo19365F()
            r0.mo19272b()
            android.content.SharedPreferences r0 = r0.mo19393n()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0142:
            r1 = r3
        L_0x0143:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f46764e = r0
        L_0x0149:
            java.lang.Boolean r0 = r6.f46764e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9918t7.mo39206B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo39207J() {
        return this.f46764e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo39208O() {
        mo19272b();
        mo39230d();
        zzp C = m45381C(true);
        this.f21269a.mo19362C().mo39260q();
        m45384F(new C9976z6(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo39209P() {
        mo19272b();
        mo39230d();
        if (!mo39228z()) {
            if (mo39206B()) {
                this.f46762c.mo39187c();
            } else if (!this.f21269a.mo19392z().mo19342G()) {
                this.f21269a.mo19275g();
                List<ResolveInfo> queryIntentServices = this.f21269a.mo19277r().getPackageManager().queryIntentServices(new Intent().setClassName(this.f21269a.mo19277r(), "com.google.android.gms.measurement.AppMeasurementService"), C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.f21269a.mo19276j().mo19282q().mo38856a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context r = this.f21269a.mo19277r();
                this.f21269a.mo19275g();
                intent.setComponent(new ComponentName(r, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f46762c.mo39186b(intent);
            }
        }
    }

    /* renamed from: Q */
    public final void mo39210Q() {
        mo19272b();
        mo39230d();
        this.f46762c.mo39188d();
        try {
            C6469a.m28199b().mo24299c(this.f21269a.mo19277r(), this.f46762c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f46763d = null;
    }

    /* renamed from: R */
    public final void mo39211R(C9186i1 i1Var) {
        mo19272b();
        mo39230d();
        m45384F(new C9966y6(this, m45381C(false), i1Var));
    }

    /* renamed from: S */
    public final void mo39212S(AtomicReference atomicReference) {
        mo19272b();
        mo39230d();
        m45384F(new C9956x6(this, atomicReference, m45381C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo39213T(C9186i1 i1Var, String str, String str2) {
        mo19272b();
        mo39230d();
        m45384F(new C9834l7(this, str, str2, m45381C(false), i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo39214U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo19272b();
        mo39230d();
        m45384F(new C9823k7(this, atomicReference, (String) null, str2, str3, m45381C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo39215V(C9186i1 i1Var, String str, String str2, boolean z) {
        mo19272b();
        mo39230d();
        m45384F(new C9926u6(this, str, str2, m45381C(false), z, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo39216W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo19272b();
        mo39230d();
        m45384F(new C9845m7(this, atomicReference, (String) null, str2, str3, m45381C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo19403m() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo39217n(zzau zzau, String str) {
        C4604n.m20098k(zzau);
        mo19272b();
        mo39230d();
        m45385G();
        m45384F(new C9790h7(this, true, m45381C(true), this.f21269a.mo19362C().mo39264v(zzau), zzau, str));
    }

    /* renamed from: o */
    public final void mo39218o(C9186i1 i1Var, zzau zzau, String str) {
        mo19272b();
        mo39230d();
        if (this.f21269a.mo19372N().mo19323p0(C7355d.f29215a) != 0) {
            this.f21269a.mo19276j().mo19287w().mo38856a("Not bundling data. Service unavailable or out of date");
            this.f21269a.mo19372N().mo19295F(i1Var, new byte[0]);
            return;
        }
        m45384F(new C9749d7(this, zzau, str, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo39219p() {
        mo19272b();
        mo39230d();
        zzp C = m45381C(false);
        m45385G();
        this.f21269a.mo19362C().mo39259p();
        m45384F(new C9946w6(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo39220q(C11030e eVar, AbstractSafeParcelable abstractSafeParcelable, zzp zzp) {
        int i;
        mo19272b();
        mo39230d();
        m45385G();
        this.f21269a.mo19392z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List o = this.f21269a.mo19362C().mo39258o(100);
            if (o != null) {
                arrayList.addAll(o);
                i = o.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        eVar.mo38849t5((zzau) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e) {
                        this.f21269a.mo19276j().mo19282q().mo38857b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzks) {
                    try {
                        eVar.mo38834J1((zzks) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e2) {
                        this.f21269a.mo19276j().mo19282q().mo38857b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        eVar.mo38833I0((zzab) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e3) {
                        this.f21269a.mo19276j().mo19282q().mo38857b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo39221s(zzab zzab) {
        C4604n.m20098k(zzab);
        mo19272b();
        mo39230d();
        this.f21269a.mo19275g();
        m45384F(new C9812j7(this, true, m45381C(true), this.f21269a.mo19362C().mo39263u(zzab), new zzab(zzab), zzab));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo39222t(boolean z) {
        mo19272b();
        mo39230d();
        if (z) {
            m45385G();
            this.f21269a.mo19362C().mo39259p();
        }
        if (mo39205A()) {
            m45384F(new C9780g7(this, m45381C(false)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo39223u(C9844m6 m6Var) {
        mo19272b();
        mo39230d();
        m45384F(new C9718a7(this, m6Var));
    }

    /* renamed from: v */
    public final void mo39224v(Bundle bundle) {
        mo19272b();
        mo39230d();
        m45384F(new C9728b7(this, m45381C(false), bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo39225w() {
        mo19272b();
        mo39230d();
        m45384F(new C9769f7(this, m45381C(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo39226x(C11030e eVar) {
        mo19272b();
        C4604n.m20098k(eVar);
        this.f46763d = eVar;
        m45383E();
        m45382D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo39227y(zzks zzks) {
        mo19272b();
        mo39230d();
        m45385G();
        m45384F(new C9936v6(this, m45381C(true), this.f21269a.mo19362C().mo39265w(zzks), zzks));
    }

    /* renamed from: z */
    public final boolean mo39228z() {
        mo19272b();
        mo39230d();
        return this.f46763d != null;
    }
}
