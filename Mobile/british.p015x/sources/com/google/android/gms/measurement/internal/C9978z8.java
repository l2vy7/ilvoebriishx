package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9080b3;
import com.google.android.gms.internal.measurement.C9081b4;
import com.google.android.gms.internal.measurement.C9085b9;
import com.google.android.gms.internal.measurement.C9112d4;
import com.google.android.gms.internal.measurement.C9128e4;
import com.google.android.gms.internal.measurement.C9132e8;
import com.google.android.gms.internal.measurement.C9143f4;
import com.google.android.gms.internal.measurement.C9158g3;
import com.google.android.gms.internal.measurement.C9188i3;
import com.google.android.gms.internal.measurement.C9189i4;
import com.google.android.gms.internal.measurement.C9204j4;
import com.google.android.gms.internal.measurement.C9264n3;
import com.google.android.gms.internal.measurement.C9265n4;
import com.google.android.gms.internal.measurement.C9280o4;
import com.google.android.gms.internal.measurement.C9296p4;
import com.google.android.gms.internal.measurement.C9304pd;
import com.google.android.gms.internal.measurement.C9389v4;
import com.google.android.gms.internal.measurement.C9394v9;
import com.google.android.gms.internal.measurement.C9420x4;
import com.google.android.gms.internal.measurement.C9435y4;
import com.google.android.gms.internal.measurement.C9447z2;
import com.google.android.gms.internal.measurement.C9449z4;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9978z8 extends C9868o8 {
    C9978z8(C9958x8 x8Var) {
        super(x8Var);
    }

    /* renamed from: C */
    static C9394v9 m45535C(C9394v9 v9Var, byte[] bArr) throws C9085b9 {
        C9132e8 b = C9132e8.m42825b();
        if (b != null) {
            return v9Var.mo37315j(bArr, b);
        }
        return v9Var.mo37313e(bArr);
    }

    /* renamed from: H */
    static List m45536H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    static boolean m45537L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    static boolean m45538N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    static final void m45539P(C9128e4 e4Var, String str, Object obj) {
        List U = e4Var.mo37536U();
        int i = 0;
        while (true) {
            if (i >= U.size()) {
                i = -1;
                break;
            } else if (str.equals(((C9204j4) U.get(i)).mo37664G())) {
                break;
            } else {
                i++;
            }
        }
        C9189i4 D = C9204j4.m43050D();
        D.mo37641O(str);
        if (obj instanceof Long) {
            D.mo37640N(((Long) obj).longValue());
        }
        if (i >= 0) {
            e4Var.mo37530O(i, D);
        } else {
            e4Var.mo37525J(D);
        }
    }

    /* renamed from: l */
    static final boolean m45540l(zzau zzau, zzp zzp) {
        C4604n.m20098k(zzau);
        C4604n.m20098k(zzp);
        return !TextUtils.isEmpty(zzp.f46949c) || !TextUtils.isEmpty(zzp.f46964r);
    }

    /* renamed from: m */
    static final C9204j4 m45541m(C9143f4 f4Var, String str) {
        for (C9204j4 j4Var : f4Var.mo37556I()) {
            if (j4Var.mo37664G().equals(str)) {
                return j4Var;
            }
        }
        return null;
    }

    /* renamed from: n */
    static final Object m45542n(C9143f4 f4Var, String str) {
        C9204j4 m = m45541m(f4Var, str);
        if (m == null) {
            return null;
        }
        if (m.mo37671X()) {
            return m.mo37665H();
        }
        if (m.mo37669V()) {
            return Long.valueOf(m.mo37663C());
        }
        if (m.mo37667T()) {
            return Double.valueOf(m.mo37672z());
        }
        if (m.mo37662B() <= 0) {
            return null;
        }
        List<C9204j4> I = m.mo37666I();
        ArrayList arrayList = new ArrayList();
        for (C9204j4 j4Var : I) {
            if (j4Var != null) {
                Bundle bundle = new Bundle();
                for (C9204j4 j4Var2 : j4Var.mo37666I()) {
                    if (j4Var2.mo37671X()) {
                        bundle.putString(j4Var2.mo37664G(), j4Var2.mo37665H());
                    } else if (j4Var2.mo37669V()) {
                        bundle.putLong(j4Var2.mo37664G(), j4Var2.mo37663C());
                    } else if (j4Var2.mo37667T()) {
                        bundle.putDouble(j4Var2.mo37664G(), j4Var2.mo37672z());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: o */
    private final void m45543o(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9204j4 j4Var = (C9204j4) it.next();
                if (j4Var != null) {
                    m45545q(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m45548u(sb, i2, MediationMetaData.KEY_NAME, j4Var.mo37670W() ? this.f21269a.mo19363D().mo39321e(j4Var.mo37664G()) : null);
                    m45548u(sb, i2, "string_value", j4Var.mo37671X() ? j4Var.mo37665H() : null);
                    m45548u(sb, i2, "int_value", j4Var.mo37669V() ? Long.valueOf(j4Var.mo37663C()) : null);
                    if (j4Var.mo37667T()) {
                        d = Double.valueOf(j4Var.mo37672z());
                    }
                    m45548u(sb, i2, "double_value", d);
                    if (j4Var.mo37662B() > 0) {
                        m45543o(sb, i2, j4Var.mo37666I());
                    }
                    m45545q(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: p */
    private final void m45544p(StringBuilder sb, int i, C9080b3 b3Var) {
        String str;
        if (b3Var != null) {
            m45545q(sb, i);
            sb.append("filter {\n");
            if (b3Var.mo37389H()) {
                m45548u(sb, i, "complement", Boolean.valueOf(b3Var.mo37388G()));
            }
            if (b3Var.mo37391J()) {
                m45548u(sb, i, "param_name", this.f21269a.mo19363D().mo39321e(b3Var.mo37387D()));
            }
            if (b3Var.mo37392K()) {
                int i2 = i + 1;
                C9264n3 C = b3Var.mo37386C();
                if (C != null) {
                    m45545q(sb, i2);
                    sb.append("string_filter {\n");
                    if (C.mo37751I()) {
                        switch (C.mo37752J()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m45548u(sb, i2, "match_type", str);
                    }
                    if (C.mo37750H()) {
                        m45548u(sb, i2, "expression", C.mo37746C());
                    }
                    if (C.mo37749G()) {
                        m45548u(sb, i2, "case_sensitive", Boolean.valueOf(C.mo37748F()));
                    }
                    if (C.mo37753z() > 0) {
                        m45545q(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : C.mo37747D()) {
                            m45545q(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m45545q(sb, i2);
                    sb.append("}\n");
                }
            }
            if (b3Var.mo37390I()) {
                m45549v(sb, i + 1, "number_filter", b3Var.mo37385B());
            }
            m45545q(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: q */
    private static final void m45545q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: s */
    private static final String m45546s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    private static final void m45547t(StringBuilder sb, int i, String str, C9389v4 v4Var) {
        if (v4Var != null) {
            m45545q(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (v4Var.mo38103A() != 0) {
                m45545q(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : v4Var.mo38109K()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (v4Var.mo38105C() != 0) {
                m45545q(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : v4Var.mo38111M()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (v4Var.mo38112z() != 0) {
                m45545q(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C9112d4 d4Var : v4Var.mo38108J()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(d4Var.mo37499H() ? Integer.valueOf(d4Var.mo37500z()) : null);
                    sb.append(":");
                    sb.append(d4Var.mo37498G() ? Long.valueOf(d4Var.mo37497A()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (v4Var.mo38104B() != 0) {
                m45545q(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C9420x4 x4Var : v4Var.mo38110L()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(x4Var.mo38146I() ? Integer.valueOf(x4Var.mo38143A()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : x4Var.mo38145F()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m45545q(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    private static final void m45548u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m45545q(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    private static final void m45549v(StringBuilder sb, int i, String str, C9158g3 g3Var) {
        if (g3Var != null) {
            m45545q(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (g3Var.mo37586G()) {
                int L = g3Var.mo37591L();
                m45548u(sb, i, "comparison_type", L != 1 ? L != 2 ? L != 3 ? L != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (g3Var.mo37588I()) {
                m45548u(sb, i, "match_as_float", Boolean.valueOf(g3Var.mo37585F()));
            }
            if (g3Var.mo37587H()) {
                m45548u(sb, i, "comparison_value", g3Var.mo37582B());
            }
            if (g3Var.mo37590K()) {
                m45548u(sb, i, "min_comparison_value", g3Var.mo37584D());
            }
            if (g3Var.mo37589J()) {
                m45548u(sb, i, "max_comparison_value", g3Var.mo37583C());
            }
            m45545q(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    static int m45550w(C9280o4 o4Var, String str) {
        for (int i = 0; i < o4Var.mo37828u0(); i++) {
            if (str.equals(o4Var.mo37823p0(i).mo38212F())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzau mo39340A(com.google.android.gms.internal.measurement.C9076b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo37375e()
            r1 = 1
            android.os.Bundle r0 = r8.mo39352y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo37374d()
            java.lang.String r1 = p256u5.C11040o.m49440b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo37374d()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzau r1 = new com.google.android.gms.measurement.internal.zzau
            com.google.android.gms.measurement.internal.zzas r4 = new com.google.android.gms.measurement.internal.zzas
            r4.<init>(r0)
            long r6 = r9.mo37370a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9978z8.mo39340A(com.google.android.gms.internal.measurement.b):com.google.android.gms.measurement.internal.zzau");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C9143f4 mo39341B(C9848n nVar) {
        C9128e4 D = C9143f4.m42844D();
        D.mo37532Q(nVar.f46488e);
        C9870p pVar = new C9870p(nVar.f46489f);
        while (pVar.hasNext()) {
            String a = pVar.next();
            C9189i4 D2 = C9204j4.m43050D();
            D2.mo37641O(a);
            Object G0 = nVar.f46489f.mo39358G0(a);
            C4604n.m20098k(G0);
            mo39347J(D2, G0);
            D.mo37525J(D2);
        }
        return (C9143f4) D.mo37840w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo39342D(C9265n4 n4Var) {
        if (n4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C9296p4 p4Var : n4Var.mo37755C()) {
            if (p4Var != null) {
                m45545q(sb, 1);
                sb.append("bundle {\n");
                if (p4Var.mo37897j1()) {
                    m45548u(sb, 1, "protocol_version", Integer.valueOf(p4Var.mo37905r1()));
                }
                m45548u(sb, 1, "platform", p4Var.mo37880J());
                if (p4Var.mo37893f1()) {
                    m45548u(sb, 1, "gmp_version", Long.valueOf(p4Var.mo37866A1()));
                }
                if (p4Var.mo37903p1()) {
                    m45548u(sb, 1, "uploading_gmp_version", Long.valueOf(p4Var.mo37875F1()));
                }
                if (p4Var.mo37865A0()) {
                    m45548u(sb, 1, "dynamite_version", Long.valueOf(p4Var.mo37919y1()));
                }
                if (p4Var.mo37916x0()) {
                    m45548u(sb, 1, "config_version", Long.valueOf(p4Var.mo37915w1()));
                }
                m45548u(sb, 1, "gmp_app_id", p4Var.mo37876G());
                m45548u(sb, 1, "admob_app_id", p4Var.mo37883K1());
                m45548u(sb, 1, "app_id", p4Var.mo37885L1());
                m45548u(sb, 1, "app_version", p4Var.mo37864A());
                if (p4Var.mo37912v0()) {
                    m45548u(sb, 1, "app_version_major", Integer.valueOf(p4Var.mo37890a0()));
                }
                m45548u(sb, 1, "firebase_instance_id", p4Var.mo37874F());
                if (p4Var.mo37921z0()) {
                    m45548u(sb, 1, "dev_cert_hash", Long.valueOf(p4Var.mo37917x1()));
                }
                m45548u(sb, 1, "app_store", p4Var.mo37920z());
                if (p4Var.mo37902o1()) {
                    m45548u(sb, 1, "upload_timestamp_millis", Long.valueOf(p4Var.mo37873E1()));
                }
                if (p4Var.mo37900m1()) {
                    m45548u(sb, 1, "start_timestamp_millis", Long.valueOf(p4Var.mo37872D1()));
                }
                if (p4Var.mo37892e1()) {
                    m45548u(sb, 1, "end_timestamp_millis", Long.valueOf(p4Var.mo37922z1()));
                }
                if (p4Var.mo37896i1()) {
                    m45548u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(p4Var.mo37870C1()));
                }
                if (p4Var.mo37895h1()) {
                    m45548u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(p4Var.mo37868B1()));
                }
                m45548u(sb, 1, "app_instance_id", p4Var.mo37887M1());
                m45548u(sb, 1, "resettable_device_id", p4Var.mo37882K());
                m45548u(sb, 1, "ds_id", p4Var.mo37871D());
                if (p4Var.mo37894g1()) {
                    m45548u(sb, 1, "limited_ad_tracking", Boolean.valueOf(p4Var.mo37906s0()));
                }
                m45548u(sb, 1, "os_version", p4Var.mo37879I());
                m45548u(sb, 1, "device_model", p4Var.mo37869C());
                m45548u(sb, 1, "user_default_language", p4Var.mo37884L());
                if (p4Var.mo37901n1()) {
                    m45548u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(p4Var.mo37909t1()));
                }
                if (p4Var.mo37914w0()) {
                    m45548u(sb, 1, "bundle_sequential_index", Integer.valueOf(p4Var.mo37891b1()));
                }
                if (p4Var.mo37899l1()) {
                    m45548u(sb, 1, "service_upload", Boolean.valueOf(p4Var.mo37908t0()));
                }
                m45548u(sb, 1, "health_monitor", p4Var.mo37878H());
                if (!this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46695j0) && p4Var.mo37910u0() && p4Var.mo37913v1() != 0) {
                    m45548u(sb, 1, "android_id", Long.valueOf(p4Var.mo37913v1()));
                }
                if (p4Var.mo37898k1()) {
                    m45548u(sb, 1, "retry_counter", Integer.valueOf(p4Var.mo37907s1()));
                }
                if (p4Var.mo37918y0()) {
                    m45548u(sb, 1, "consent_signals", p4Var.mo37867B());
                }
                List<C9449z4> O = p4Var.mo37889O();
                if (O != null) {
                    for (C9449z4 z4Var : O) {
                        if (z4Var != null) {
                            m45545q(sb, 2);
                            sb.append("user_property {\n");
                            m45548u(sb, 2, "set_timestamp_millis", z4Var.mo38216R() ? Long.valueOf(z4Var.mo38211B()) : null);
                            m45548u(sb, 2, MediationMetaData.KEY_NAME, this.f21269a.mo19363D().mo39322f(z4Var.mo38212F()));
                            m45548u(sb, 2, "string_value", z4Var.mo38213G());
                            m45548u(sb, 2, "int_value", z4Var.mo38215Q() ? Long.valueOf(z4Var.mo38210A()) : null);
                            m45548u(sb, 2, "double_value", z4Var.mo38214P() ? Double.valueOf(z4Var.mo38218z()) : null);
                            m45545q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C9081b4> M = p4Var.mo37886M();
                if (M != null) {
                    for (C9081b4 b4Var : M) {
                        if (b4Var != null) {
                            m45545q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (b4Var.mo37397K()) {
                                m45548u(sb, 2, "audience_id", Integer.valueOf(b4Var.mo37400z()));
                            }
                            if (b4Var.mo37398L()) {
                                m45548u(sb, 2, "new_audience", Boolean.valueOf(b4Var.mo37396J()));
                            }
                            m45547t(sb, 2, "current_data", b4Var.mo37394C());
                            if (b4Var.mo37399M()) {
                                m45547t(sb, 2, "previous_data", b4Var.mo37395D());
                            }
                            m45545q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C9143f4> N = p4Var.mo37888N();
                if (N != null) {
                    for (C9143f4 f4Var : N) {
                        if (f4Var != null) {
                            m45545q(sb, 2);
                            sb.append("event {\n");
                            m45548u(sb, 2, MediationMetaData.KEY_NAME, this.f21269a.mo19363D().mo39320d(f4Var.mo37555H()));
                            if (f4Var.mo37559T()) {
                                m45548u(sb, 2, "timestamp_millis", Long.valueOf(f4Var.mo37553C()));
                            }
                            if (f4Var.mo37558S()) {
                                m45548u(sb, 2, "previous_timestamp_millis", Long.valueOf(f4Var.mo37552B()));
                            }
                            if (f4Var.mo37557R()) {
                                m45548u(sb, 2, "count", Integer.valueOf(f4Var.mo37560z()));
                            }
                            if (f4Var.mo37551A() != 0) {
                                m45543o(sb, 2, f4Var.mo37556I());
                            }
                            m45545q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m45545q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo39343E(C9447z2 z2Var) {
        if (z2Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (z2Var.mo38207O()) {
            m45548u(sb, 0, "filter_id", Integer.valueOf(z2Var.mo38198A()));
        }
        m45548u(sb, 0, "event_name", this.f21269a.mo19363D().mo39320d(z2Var.mo38201G()));
        String s = m45546s(z2Var.mo38203K(), z2Var.mo38204L(), z2Var.mo38205M());
        if (!s.isEmpty()) {
            m45548u(sb, 0, "filter_type", s);
        }
        if (z2Var.mo38206N()) {
            m45549v(sb, 1, "event_count_filter", z2Var.mo38200F());
        }
        if (z2Var.mo38209z() > 0) {
            sb.append("  filters {\n");
            for (C9080b3 p : z2Var.mo38202H()) {
                m45544p(sb, 2, p);
            }
        }
        m45545q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo39344F(C9188i3 i3Var) {
        if (i3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (i3Var.mo37629J()) {
            m45548u(sb, 0, "filter_id", Integer.valueOf(i3Var.mo37631z()));
        }
        m45548u(sb, 0, "property_name", this.f21269a.mo19363D().mo39322f(i3Var.mo37625D()));
        String s = m45546s(i3Var.mo37626G(), i3Var.mo37627H(), i3Var.mo37628I());
        if (!s.isEmpty()) {
            m45548u(sb, 0, "filter_type", s);
        }
        m45544p(sb, 1, i3Var.mo37624A());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final List mo39345G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f21269a.mo19276j().mo19287w().mo38857b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f21269a.mo19276j().mo19287w().mo38858c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Map mo39346I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            C9304pd.m43497b();
            if (!this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46705o0) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo39346I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo39346I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo39346I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo39347J(C9189i4 i4Var, Object obj) {
        C4604n.m20098k(obj);
        i4Var.mo37638L();
        i4Var.mo37636J();
        i4Var.mo37635I();
        i4Var.mo37637K();
        if (obj instanceof String) {
            i4Var.mo37642P((String) obj);
        } else if (obj instanceof Long) {
            i4Var.mo37640N(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            i4Var.mo37639M(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C9189i4 D = C9204j4.m43050D();
                    for (String str : bundle.keySet()) {
                        C9189i4 D2 = C9204j4.m43050D();
                        D2.mo37641O(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            D2.mo37640N(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            D2.mo37642P((String) obj2);
                        } else if (obj2 instanceof Double) {
                            D2.mo37639M(((Double) obj2).doubleValue());
                        }
                        D.mo37634H(D2);
                    }
                    if (D.mo37632B() > 0) {
                        arrayList.add((C9204j4) D.mo37840w());
                    }
                }
            }
            i4Var.mo37633C(arrayList);
        } else {
            this.f21269a.mo19276j().mo19282q().mo38857b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo39348K(C9435y4 y4Var, Object obj) {
        C4604n.m20098k(obj);
        y4Var.mo38187H();
        y4Var.mo38186C();
        y4Var.mo38185B();
        if (obj instanceof String) {
            y4Var.mo38192M((String) obj);
        } else if (obj instanceof Long) {
            y4Var.mo38189J(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            y4Var.mo38188I(((Double) obj).doubleValue());
        } else {
            this.f21269a.mo19276j().mo19282q().mo38857b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo39349M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f21269a.mo19274f().currentTimeMillis() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] mo39350O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo39351x(byte[] bArr) {
        C4604n.m20098k(bArr);
        this.f21269a.mo19372N().mo19272b();
        MessageDigest s = C4668d9.m21500s();
        if (s != null) {
            return C4668d9.m21499q0(s.digest(bArr));
        }
        this.f21269a.mo19276j().mo19282q().mo38856a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Bundle mo39352y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                C9304pd.m43497b();
                if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46705o0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(mo39352y((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(mo39352y((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f21269a.mo19276j().mo19282q().mo38856a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo39353z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.h4 r5 = r4.f21269a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo38856a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9978z8.mo39353z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
