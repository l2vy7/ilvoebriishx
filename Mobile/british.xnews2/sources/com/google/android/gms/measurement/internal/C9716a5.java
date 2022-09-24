package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.C4599e;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9076b;
import com.google.android.gms.internal.measurement.C9093c1;
import com.google.android.gms.internal.measurement.C9402w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p006a5.C6495t;
import p255u5.C11029d;
import p255u5.C11040o;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9716a5 extends C11029d {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9958x8 f46149b;

    /* renamed from: c */
    private Boolean f46150c;

    /* renamed from: d */
    private String f46151d = null;

    public C9716a5(C9958x8 x8Var, String str) {
        C4604n.m20098k(x8Var);
        this.f46149b = x8Var;
    }

    /* renamed from: b2 */
    private final void m44974b2(zzau zzau, zzp zzp) {
        this.f46149b.mo39285a();
        this.f46149b.mo39290d(zzau, zzp);
    }

    /* renamed from: q6 */
    private final void m44976q6(zzp zzp, boolean z) {
        C4604n.m20098k(zzp);
        C4604n.m20094g(zzp.f46948b);
        m44977r6(zzp.f46948b, false);
        this.f46149b.mo39293g0().mo19300K(zzp.f46949c, zzp.f46964r);
    }

    /* renamed from: r6 */
    private final void m44977r6(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f46150c == null) {
                        if (!"com.google.android.gms".equals(this.f46151d) && !C6495t.m28292a(this.f46149b.mo19277r(), Binder.getCallingUid())) {
                            if (!C4599e.m20051a(this.f46149b.mo19277r()).mo17972c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f46150c = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f46150c = Boolean.valueOf(z2);
                    }
                    if (this.f46150c.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f46149b.mo19276j().mo19282q().mo38857b("Measurement Service called with invalid calling package. appId", C4667d3.m21474z(str));
                    throw e;
                }
            }
            if (this.f46151d == null && C7355d.m29947m(this.f46149b.mo19277r(), Binder.getCallingUid(), str)) {
                this.f46151d = str;
            }
            if (!str.equals(this.f46151d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f46149b.mo19276j().mo19282q().mo38856a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: C3 */
    public final void mo38829C3(zzp zzp) {
        C4604n.m20094g(zzp.f46948b);
        C4604n.m20098k(zzp.f46969w);
        C9905s4 s4Var = new C9905s4(this, zzp);
        C4604n.m20098k(s4Var);
        if (this.f46149b.mo19273e().mo38904C()) {
            s4Var.run();
        } else {
            this.f46149b.mo19273e().mo38903A(s4Var);
        }
    }

    /* renamed from: E3 */
    public final void mo38830E3(long j, String str, String str2, String str3) {
        mo38847p6(new C9974z4(this, str2, str3, str, j));
    }

    /* renamed from: G0 */
    public final void mo38831G0(zzau zzau, String str, String str2) {
        C4604n.m20098k(zzau);
        C4604n.m20094g(str);
        m44977r6(str, true);
        mo38847p6(new C9924u4(this, zzau, str));
    }

    /* renamed from: H2 */
    public final void mo38832H2(zzp zzp) {
        m44976q6(zzp, false);
        mo38847p6(new C9964y4(this, zzp));
    }

    /* renamed from: I0 */
    public final void mo38833I0(zzab zzab, zzp zzp) {
        C4604n.m20098k(zzab);
        C4604n.m20098k(zzab.f46927d);
        m44976q6(zzp, false);
        zzab zzab2 = new zzab(zzab);
        zzab2.f46925b = zzp.f46948b;
        mo38847p6(new C9809j4(this, zzab2, zzp));
    }

    /* renamed from: J1 */
    public final void mo38834J1(zzks zzks, zzp zzp) {
        C4604n.m20098k(zzks);
        m44976q6(zzp, false);
        mo38847p6(new C9944w4(this, zzks, zzp));
    }

    /* renamed from: L2 */
    public final List mo38835L2(String str, String str2, zzp zzp) {
        m44976q6(zzp, false);
        String str3 = zzp.f46948b;
        C4604n.m20098k(str3);
        try {
            return (List) this.f46149b.mo19273e().mo38906s(new C9853n4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f46149b.mo19276j().mo19282q().mo38857b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: N3 */
    public final List mo38836N3(String str, String str2, boolean z, zzp zzp) {
        m44976q6(zzp, false);
        String str3 = zzp.f46948b;
        C4604n.m20098k(str3);
        try {
            List<C9730b9> list = (List) this.f46149b.mo19273e().mo38906s(new C9831l4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C9730b9 b9Var : list) {
                if (z || !C4668d9.m21487V(b9Var.f46186c)) {
                    arrayList.add(new zzks(b9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f46149b.mo19276j().mo19282q().mo38858c("Failed to query user properties. appId", C4667d3.m21474z(zzp.f46948b), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: P0 */
    public final List mo38837P0(String str, String str2, String str3, boolean z) {
        m44977r6(str, true);
        try {
            List<C9730b9> list = (List) this.f46149b.mo19273e().mo38906s(new C9842m4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C9730b9 b9Var : list) {
                if (z || !C4668d9.m21487V(b9Var.f46186c)) {
                    arrayList.add(new zzks(b9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f46149b.mo19276j().mo19282q().mo38858c("Failed to get user properties as. appId", C4667d3.m21474z(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: P1 */
    public final void mo38838P1(zzab zzab) {
        C4604n.m20098k(zzab);
        C4604n.m20098k(zzab.f46927d);
        C4604n.m20094g(zzab.f46925b);
        m44977r6(zzab.f46925b, true);
        mo38847p6(new C9820k4(this, new zzab(zzab)));
    }

    /* renamed from: Q5 */
    public final byte[] mo38839Q5(zzau zzau, String str) {
        C4604n.m20094g(str);
        C4604n.m20098k(zzau);
        m44977r6(str, true);
        this.f46149b.mo19276j().mo19281p().mo38857b("Log and bundle. event", this.f46149b.mo39281W().mo39320d(zzau.f46937b));
        long a = this.f46149b.mo19274f().mo24318a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f46149b.mo19273e().mo38907t(new C9934v4(this, zzau, str)).get();
            if (bArr == null) {
                this.f46149b.mo19276j().mo19282q().mo38857b("Log and bundle returned null. appId", C4667d3.m21474z(str));
                bArr = new byte[0];
            }
            this.f46149b.mo19276j().mo19281p().mo38859d("Log and bundle processed. event, size, time_ms", this.f46149b.mo39281W().mo39320d(zzau.f46937b), Integer.valueOf(bArr.length), Long.valueOf((this.f46149b.mo19274f().mo24318a() / 1000000) - a));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f46149b.mo19276j().mo19282q().mo38859d("Failed to log and bundle. appId, event, error", C4667d3.m21474z(str), this.f46149b.mo39281W().mo39320d(zzau.f46937b), e);
            return null;
        }
    }

    /* renamed from: V1 */
    public final List mo38840V1(String str, String str2, String str3) {
        m44977r6(str, true);
        try {
            return (List) this.f46149b.mo19273e().mo38906s(new C9864o4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f46149b.mo19276j().mo19282q().mo38857b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: Y0 */
    public final void mo38841Y0(zzp zzp) {
        C4604n.m20094g(zzp.f46948b);
        m44977r6(zzp.f46948b, false);
        mo38847p6(new C9875p4(this, zzp));
    }

    /* renamed from: Y4 */
    public final List mo38842Y4(zzp zzp, boolean z) {
        m44976q6(zzp, false);
        String str = zzp.f46948b;
        C4604n.m20098k(str);
        try {
            List<C9730b9> list = (List) this.f46149b.mo19273e().mo38906s(new C9954x4(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C9730b9 b9Var : list) {
                if (z || !C4668d9.m21487V(b9Var.f46186c)) {
                    arrayList.add(new zzks(b9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f46149b.mo19276j().mo19282q().mo38858c("Failed to get user properties. appId", C4667d3.m21474z(zzp.f46948b), e);
            return null;
        }
    }

    /* renamed from: e3 */
    public final void mo38843e3(zzp zzp) {
        m44976q6(zzp, false);
        mo38847p6(new C9895r4(this, zzp));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f3 */
    public final zzau mo38844f3(zzau zzau, zzp zzp) {
        zzas zzas;
        if (!(!"_cmp".equals(zzau.f46937b) || (zzas = zzau.f46938c) == null || zzas.zza() == 0)) {
            String H0 = zzau.f46938c.mo39359H0("_cis");
            if ("referrer broadcast".equals(H0) || "referrer API".equals(H0)) {
                this.f46149b.mo19276j().mo19285u().mo38857b("Event has been filtered ", zzau.toString());
                return new zzau("_cmpx", zzau.f46938c, zzau.f46939d, zzau.f46940e);
            }
        }
        return zzau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n6 */
    public final void mo38845n6(zzau zzau, zzp zzp) {
        C9093c1 c1Var;
        if (!this.f46149b.mo39284Z().mo38868u(zzp.f46948b)) {
            m44974b2(zzau, zzp);
            return;
        }
        this.f46149b.mo19276j().mo19286v().mo38857b("EES config found for", zzp.f46948b);
        C9726b4 Z = this.f46149b.mo39284Z();
        String str = zzp.f46948b;
        if (TextUtils.isEmpty(str)) {
            c1Var = null;
        } else {
            c1Var = (C9093c1) Z.f46170i.mo23310c(str);
        }
        if (c1Var != null) {
            try {
                Map I = this.f46149b.mo39292f0().mo39346I(zzau.f46938c.mo39355D0(), true);
                String a = C11040o.m49439a(zzau.f46937b);
                if (a == null) {
                    a = zzau.f46937b;
                }
                if (c1Var.mo37442e(new C9076b(a, zzau.f46940e, I))) {
                    if (c1Var.mo37444g()) {
                        this.f46149b.mo19276j().mo19286v().mo38857b("EES edited event", zzau.f46937b);
                        m44974b2(this.f46149b.mo39292f0().mo39340A(c1Var.mo37438a().mo37431b()), zzp);
                    } else {
                        m44974b2(zzau, zzp);
                    }
                    if (c1Var.mo37443f()) {
                        for (C9076b bVar : c1Var.mo37438a().mo37432c()) {
                            this.f46149b.mo19276j().mo19286v().mo38857b("EES logging created event", bVar.mo37374d());
                            m44974b2(this.f46149b.mo39292f0().mo39340A(bVar), zzp);
                        }
                        return;
                    }
                    return;
                }
            } catch (C9402w1 unused) {
                this.f46149b.mo19276j().mo19282q().mo38858c("EES error. appId, eventName", zzp.f46949c, zzau.f46937b);
            }
            this.f46149b.mo19276j().mo19286v().mo38857b("EES was not applied to event", zzau.f46937b);
            m44974b2(zzau, zzp);
            return;
        }
        this.f46149b.mo19276j().mo19286v().mo38857b("EES not loaded for", zzp.f46948b);
        m44974b2(zzau, zzp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o6 */
    public final /* synthetic */ void mo38846o6(String str, Bundle bundle) {
        C9793i V = this.f46149b.mo39280V();
        V.mo19272b();
        V.mo39090d();
        byte[] l = V.f46518b.mo39292f0().mo39341B(new C9848n(V.f21269a, "", str, "dep", 0, 0, bundle)).mo37404l();
        V.f21269a.mo19276j().mo19286v().mo38858c("Saving default event parameters, appId, data size", V.f21269a.mo19363D().mo39320d(str), Integer.valueOf(l.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", l);
        try {
            if (V.mo38987P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                V.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert default event parameters (got -1). appId", C4667d3.m21474z(str));
            }
        } catch (SQLiteException e) {
            V.f21269a.mo19276j().mo19282q().mo38858c("Error storing default event parameters. appId", C4667d3.m21474z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p6 */
    public final void mo38847p6(Runnable runnable) {
        C4604n.m20098k(runnable);
        if (this.f46149b.mo19273e().mo38904C()) {
            runnable.run();
        } else {
            this.f46149b.mo19273e().mo38909z(runnable);
        }
    }

    /* renamed from: t1 */
    public final String mo38848t1(zzp zzp) {
        m44976q6(zzp, false);
        return this.f46149b.mo39297i0(zzp);
    }

    /* renamed from: t5 */
    public final void mo38849t5(zzau zzau, zzp zzp) {
        C4604n.m20098k(zzau);
        m44976q6(zzp, false);
        mo38847p6(new C9915t4(this, zzau, zzp));
    }

    /* renamed from: x0 */
    public final void mo38850x0(Bundle bundle, zzp zzp) {
        m44976q6(zzp, false);
        String str = zzp.f46948b;
        C4604n.m20098k(str);
        mo38847p6(new C9798i4(this, str, bundle));
    }
}
