package com.google.android.gms.internal.cast;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Map;
import p243q4.C10922b;

/* renamed from: com.google.android.gms.internal.cast.t6 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C4644t6 {

    /* renamed from: d */
    private static final C10922b f21196d = new C10922b("ApplicationAnalyticsUtils");

    /* renamed from: e */
    private static final String f21197e = "20.0.0";

    /* renamed from: a */
    private final String f21198a;

    /* renamed from: b */
    private final Map<Integer, Integer> f21199b;

    /* renamed from: c */
    private final Map<Integer, Integer> f21200c;

    public C4644t6(Bundle bundle, String str) {
        this.f21198a = str;
        this.f21199b = C8811xa.m41411a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f21200c = C8811xa.m41411a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* renamed from: e */
    private final C8653n8 m21366e(C8729s5 s5Var) {
        long j;
        C8653n8 n = C8669o8.m41176n();
        n.mo36614l(s5Var.f43984c);
        int i = s5Var.f43985d;
        s5Var.f43985d = i + 1;
        n.mo36617o(i);
        String str = s5Var.f43983b;
        if (str != null) {
            n.mo36616n(str);
        }
        C8489d8 m = C8505e8.m40790m();
        m.mo36429m(f21197e);
        m.mo36428l(this.f21198a);
        n.mo36621y((C8505e8) m.mo36634i());
        C8522f8 m2 = C8538g8.m40926m();
        if (s5Var.f43982a != null) {
            C8793w8 m3 = C8809x8.m41407m();
            m3.mo36757l(s5Var.f43982a);
            m2.mo36483l((C8809x8) m3.mo36634i());
        }
        m2.mo36484m(false);
        String str2 = s5Var.f43987f;
        if (str2 != null) {
            try {
                String replace = str2.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                f21196d.mo43196g(e, "receiverSessionId %s is not valid for hash", str2);
                j = 0;
            }
            m2.mo36485n(j);
        }
        m2.mo36488s(s5Var.f43986e);
        n.mo36620w(m2);
        return n;
    }

    /* renamed from: f */
    private static void m21367f(C8653n8 n8Var, boolean z) {
        C8522f8 n = C8538g8.m40927n(n8Var.mo36618p());
        n.mo36484m(z);
        n8Var.mo36620w(n);
    }

    /* renamed from: a */
    public final C8669o8 mo19122a(C8729s5 s5Var) {
        return (C8669o8) m21366e(s5Var).mo36634i();
    }

    /* renamed from: b */
    public final C8669o8 mo19123b(C8729s5 s5Var) {
        C8653n8 e = m21366e(s5Var);
        C8522f8 n = C8538g8.m40927n(e.mo36618p());
        n.mo36486o(C8803x2.APP_SESSION_RESUMED_FROM_SAVED_SESSION.zza());
        e.mo36619s((C8538g8) n.mo36634i());
        m21367f(e, true);
        return (C8669o8) e.mo36634i();
    }

    /* renamed from: c */
    public final C8669o8 mo19124c(C8729s5 s5Var, boolean z) {
        C8653n8 e = m21366e(s5Var);
        m21367f(e, z);
        return (C8669o8) e.mo36634i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.cast.C8669o8 mo19125d(com.google.android.gms.internal.cast.C8729s5 r4, int r5) {
        /*
            r3 = this;
            com.google.android.gms.internal.cast.n8 r4 = r3.m21366e(r4)
            com.google.android.gms.internal.cast.g8 r0 = r4.mo36618p()
            com.google.android.gms.internal.cast.f8 r0 = com.google.android.gms.internal.cast.C8538g8.m40927n(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r3.f21200c
            if (r1 == 0) goto L_0x002e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r3.f21200c
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.C4604n.m20098k(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0030
        L_0x002e:
            int r1 = r5 + 10000
        L_0x0030:
            r0.mo36486o(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r3.f21199b
            if (r1 == 0) goto L_0x0055
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x0042
            goto L_0x0055
        L_0x0042:
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r3.f21199b
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.C4604n.m20098k(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0057
        L_0x0055:
            int r5 = r5 + 10000
        L_0x0057:
            r0.mo36487p(r5)
            com.google.android.gms.internal.cast.qc r5 = r0.mo36634i()
            com.google.android.gms.internal.cast.g8 r5 = (com.google.android.gms.internal.cast.C8538g8) r5
            r4.mo36619s(r5)
            com.google.android.gms.internal.cast.qc r4 = r4.mo36634i()
            com.google.android.gms.internal.cast.o8 r4 = (com.google.android.gms.internal.cast.C8669o8) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C4644t6.mo19125d(com.google.android.gms.internal.cast.s5, int):com.google.android.gms.internal.cast.o8");
    }
}
