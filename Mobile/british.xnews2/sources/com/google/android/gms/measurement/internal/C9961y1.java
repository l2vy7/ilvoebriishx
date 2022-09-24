package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import java.util.Map;
import p149t.C6077a;

/* renamed from: com.google.android.gms.measurement.internal.y1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9961y1 extends C9942w2 {

    /* renamed from: b */
    private final Map f46893b = new C6077a();

    /* renamed from: c */
    private final Map f46894c = new C6077a();

    /* renamed from: d */
    private long f46895d;

    public C9961y1(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: d */
    static /* synthetic */ void m45506d(C9961y1 y1Var, String str, long j) {
        y1Var.mo19272b();
        C4604n.m20094g(str);
        if (y1Var.f46894c.isEmpty()) {
            y1Var.f46895d = j;
        }
        Integer num = (Integer) y1Var.f46894c.get(str);
        if (num != null) {
            y1Var.f46894c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (y1Var.f46894c.size() >= 100) {
            y1Var.f21269a.mo19276j().mo19287w().mo38856a("Too many ads visible");
        } else {
            y1Var.f46894c.put(str, 1);
            y1Var.f46893b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m45507h(C9961y1 y1Var, String str, long j) {
        y1Var.mo19272b();
        C4604n.m20094g(str);
        Integer num = (Integer) y1Var.f46894c.get(str);
        if (num != null) {
            C9844m6 t = y1Var.f21269a.mo19369K().mo39202t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                y1Var.f46894c.remove(str);
                Long l = (Long) y1Var.f46893b.get(str);
                if (l == null) {
                    y1Var.f21269a.mo19276j().mo19282q().mo38856a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    y1Var.f46893b.remove(str);
                    y1Var.m45510o(str, j - longValue, t);
                }
                if (y1Var.f46894c.isEmpty()) {
                    long j2 = y1Var.f46895d;
                    if (j2 == 0) {
                        y1Var.f21269a.mo19276j().mo19282q().mo38856a("First ad exposure time was never set");
                        return;
                    }
                    y1Var.m45509n(j - j2, t);
                    y1Var.f46895d = 0;
                    return;
                }
                return;
            }
            y1Var.f46894c.put(str, Integer.valueOf(intValue));
            return;
        }
        y1Var.f21269a.mo19276j().mo19282q().mo38857b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: n */
    private final void m45509n(long j, C9844m6 m6Var) {
        if (m6Var == null) {
            this.f21269a.mo19276j().mo19286v().mo38856a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f21269a.mo19276j().mo19286v().mo38857b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C4668d9.m21502x(m6Var, bundle, true);
            this.f21269a.mo19367I().mo38956u("am", "_xa", bundle);
        }
    }

    /* renamed from: o */
    private final void m45510o(String str, long j, C9844m6 m6Var) {
        if (m6Var == null) {
            this.f21269a.mo19276j().mo19286v().mo38856a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f21269a.mo19276j().mo19286v().mo38857b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C4668d9.m21502x(m6Var, bundle, true);
            this.f21269a.mo19367I().mo38956u("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m45511p(long j) {
        for (String put : this.f46893b.keySet()) {
            this.f46893b.put(put, Long.valueOf(j));
        }
        if (!this.f46893b.isEmpty()) {
            this.f46895d = j;
        }
    }

    /* renamed from: k */
    public final void mo39314k(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Ad unit id must be a non-empty string");
        } else {
            this.f21269a.mo19273e().mo38909z(new C9710a(this, str, j));
        }
    }

    /* renamed from: l */
    public final void mo39315l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Ad unit id must be a non-empty string");
        } else {
            this.f21269a.mo19273e().mo38909z(new C9939w(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo39316m(long j) {
        C9844m6 t = this.f21269a.mo19369K().mo39202t(false);
        for (String str : this.f46893b.keySet()) {
            m45510o(str, j - ((Long) this.f46893b.get(str)).longValue(), t);
        }
        if (!this.f46893b.isEmpty()) {
            m45509n(j - this.f46895d, t);
        }
        m45511p(j);
    }
}
