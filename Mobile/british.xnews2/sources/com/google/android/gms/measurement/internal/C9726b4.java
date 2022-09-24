package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9085b9;
import com.google.android.gms.internal.measurement.C9093c1;
import com.google.android.gms.internal.measurement.C9129e5;
import com.google.android.gms.internal.measurement.C9160g5;
import com.google.android.gms.internal.measurement.C9295p3;
import com.google.android.gms.internal.measurement.C9305pe;
import com.google.android.gms.internal.measurement.C9341s3;
import com.google.android.gms.internal.measurement.C9357t3;
import com.google.android.gms.internal.measurement.C9388v3;
import com.google.android.gms.internal.measurement.C9402w1;
import java.util.ArrayList;
import java.util.Map;
import p149t.C6077a;
import p149t.C6083e;
import p255u5.C11036k;
import p255u5.C11040o;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9726b4 extends C9868o8 implements C9751e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f46165d = new C6077a();

    /* renamed from: e */
    final Map f46166e = new C6077a();

    /* renamed from: f */
    final Map f46167f = new C6077a();

    /* renamed from: g */
    private final Map f46168g = new C6077a();

    /* renamed from: h */
    private final Map f46169h = new C6077a();

    /* renamed from: i */
    final C6083e f46170i = new C9963y3(this, 20);

    /* renamed from: j */
    final C9305pe f46171j = new C9973z3(this);

    /* renamed from: k */
    private final Map f46172k = new C6077a();

    C9726b4(C9958x8 x8Var) {
        super(x8Var);
    }

    /* renamed from: A */
    private final C9357t3 m45006A(String str, byte[] bArr) {
        if (bArr == null) {
            return C9357t3.m43634G();
        }
        try {
            C9357t3 t3Var = (C9357t3) ((C9341s3) C9978z8.m45535C(C9357t3.m43632D(), bArr)).mo37840w();
            C9725b3 v = this.f21269a.mo19276j().mo19286v();
            String str2 = null;
            Long valueOf = t3Var.mo38053P() ? Long.valueOf(t3Var.mo38045B()) : null;
            if (t3Var.mo38052O()) {
                str2 = t3Var.mo38047H();
            }
            v.mo38858c("Parsed config. version, gmp_app_id", valueOf, str2);
            return t3Var;
        } catch (C9085b9 e) {
            this.f21269a.mo19276j().mo19287w().mo38858c("Unable to merge remote config. appId", C4667d3.m21474z(str), e);
            return C9357t3.m43634G();
        } catch (RuntimeException e2) {
            this.f21269a.mo19276j().mo19287w().mo38858c("Unable to merge remote config. appId", C4667d3.m21474z(str), e2);
            return C9357t3.m43634G();
        }
    }

    /* renamed from: B */
    private final void m45007B(String str, C9341s3 s3Var) {
        C6077a aVar = new C6077a();
        C6077a aVar2 = new C6077a();
        C6077a aVar3 = new C6077a();
        if (s3Var != null) {
            for (int i = 0; i < s3Var.mo38018B(); i++) {
                C9295p3 p3Var = (C9295p3) s3Var.mo38019C(i).mo37997q();
                if (TextUtils.isEmpty(p3Var.mo37858H())) {
                    this.f21269a.mo19276j().mo19287w().mo38856a("EventConfig contained null event name");
                } else {
                    String H = p3Var.mo37858H();
                    String b = C11040o.m49440b(p3Var.mo37858H());
                    if (!TextUtils.isEmpty(b)) {
                        p3Var.mo37857C(b);
                        s3Var.mo38021I(i, p3Var);
                    }
                    if (p3Var.mo37861K() && p3Var.mo37859I()) {
                        aVar.put(H, Boolean.TRUE);
                    }
                    if (p3Var.mo37862L() && p3Var.mo37860J()) {
                        aVar2.put(p3Var.mo37858H(), Boolean.TRUE);
                    }
                    if (p3Var.mo37863M()) {
                        if (p3Var.mo37856B() < 2 || p3Var.mo37856B() > 65535) {
                            this.f21269a.mo19276j().mo19287w().mo38858c("Invalid sampling rate. Event name, sample rate", p3Var.mo37858H(), Integer.valueOf(p3Var.mo37856B()));
                        } else {
                            aVar3.put(p3Var.mo37858H(), Integer.valueOf(p3Var.mo37856B()));
                        }
                    }
                }
            }
        }
        this.f46166e.put(str, aVar);
        this.f46167f.put(str, aVar2);
        this.f46169h.put(str, aVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m45008C(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo39090d()
            r12.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r13)
            java.util.Map r0 = r12.f46168g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.x8 r0 = r12.f46518b
            com.google.android.gms.measurement.internal.i r0 = r0.mo39280V()
            com.google.android.gms.common.internal.C4604n.m20094g(r13)
            r0.mo19272b()
            r0.mo39090d()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo38987P()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r3 != 0) goto L_0x0045
            goto L_0x008f
        L_0x0045:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r5 == 0) goto L_0x0066
            com.google.android.gms.measurement.internal.h4 r5 = r0.f21269a     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r13)     // Catch:{ SQLiteException -> 0x0072 }
            r5.mo38857b(r6, r7)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0066:
            if (r3 != 0) goto L_0x0069
            goto L_0x008f
        L_0x0069:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0072 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0072 }
            r2.close()
            goto L_0x0093
        L_0x0072:
            r3 = move-exception
            goto L_0x007a
        L_0x0074:
            r13 = move-exception
            goto L_0x00f4
        L_0x0077:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007a:
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r13)     // Catch:{ all -> 0x00f2 }
            r0.mo38858c(r4, r5, r3)     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0092
        L_0x008f:
            r2.close()
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r5 != 0) goto L_0x00b4
            java.util.Map r0 = r12.f46165d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46166e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46167f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46168g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46172k
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46169h
            r0.put(r13, r1)
            return
        L_0x00b4:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            com.google.android.gms.internal.measurement.t3 r0 = r12.m45006A(r13, r0)
            com.google.android.gms.internal.measurement.o8 r0 = r0.mo37997q()
            com.google.android.gms.internal.measurement.s3 r0 = (com.google.android.gms.internal.measurement.C9341s3) r0
            r12.m45007B(r13, r0)
            java.util.Map r1 = r12.f46165d
            com.google.android.gms.internal.measurement.r8 r2 = r0.mo37840w()
            com.google.android.gms.internal.measurement.t3 r2 = (com.google.android.gms.internal.measurement.C9357t3) r2
            java.util.Map r2 = m45010E(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f46168g
            com.google.android.gms.internal.measurement.r8 r2 = r0.mo37840w()
            com.google.android.gms.internal.measurement.t3 r2 = (com.google.android.gms.internal.measurement.C9357t3) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()
            com.google.android.gms.internal.measurement.t3 r0 = (com.google.android.gms.internal.measurement.C9357t3) r0
            r12.m45009D(r13, r0)
            java.util.Map r0 = r12.f46172k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            return
        L_0x00f2:
            r13 = move-exception
            r1 = r2
        L_0x00f4:
            if (r1 == 0) goto L_0x00f9
            r1.close()
        L_0x00f9:
            throw r13
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9726b4.m45008C(java.lang.String):void");
    }

    /* renamed from: D */
    private final void m45009D(String str, C9357t3 t3Var) {
        if (t3Var.mo38054z() != 0) {
            this.f21269a.mo19276j().mo19286v().mo38857b("EES programs found", Integer.valueOf(t3Var.mo38054z()));
            C9160g5 g5Var = (C9160g5) t3Var.mo38049J().get(0);
            try {
                C9093c1 c1Var = new C9093c1();
                c1Var.mo37441d("internal.remoteConfig", new C9943w3(this, str));
                c1Var.mo37441d("internal.appMetadata", new C11036k(this, str));
                c1Var.mo37441d("internal.logger", new C9933v3(this));
                c1Var.mo37440c(g5Var);
                this.f46170i.mo23311d(str, c1Var);
                this.f21269a.mo19276j().mo19286v().mo38858c("EES program loaded for appId, activities", str, Integer.valueOf(g5Var.mo37595z().mo37448z()));
                for (C9129e5 A : g5Var.mo37595z().mo37447C()) {
                    this.f21269a.mo19276j().mo19286v().mo38857b("EES program activity", A.mo37538A());
                }
            } catch (C9402w1 unused) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Failed to load EES program. appId", str);
            }
        } else {
            this.f46170i.mo23312e(str);
        }
    }

    /* renamed from: E */
    private static final Map m45010E(C9357t3 t3Var) {
        C6077a aVar = new C6077a();
        if (t3Var != null) {
            for (C9388v3 v3Var : t3Var.mo38050K()) {
                aVar.put(v3Var.mo38101A(), v3Var.mo38102B());
            }
        }
        return aVar;
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ C9093c1 m45011m(C9726b4 b4Var, String str) {
        b4Var.mo39090d();
        C4604n.m20094g(str);
        if (!b4Var.mo38868u(str)) {
            return null;
        }
        if (!b4Var.f46168g.containsKey(str) || b4Var.f46168g.get(str) == null) {
            b4Var.m45008C(str);
        } else {
            b4Var.m45009D(str, (C9357t3) b4Var.f46168g.get(str));
        }
        return (C9093c1) b4Var.f46170i.mo23314h().get(str);
    }

    /* renamed from: c */
    public final String mo38860c(String str, String str2) {
        mo19272b();
        m45008C(str);
        Map map = (Map) this.f46165d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo38862l(String str, String str2) {
        Integer num;
        mo19272b();
        m45008C(str);
        Map map = (Map) this.f46169h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C9357t3 mo38863n(String str) {
        mo39090d();
        mo19272b();
        C4604n.m20094g(str);
        m45008C(str);
        return (C9357t3) this.f46168g.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo38864o(String str) {
        mo19272b();
        return (String) this.f46172k.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo38865q(String str) {
        mo19272b();
        this.f46172k.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo38866s(String str) {
        mo19272b();
        this.f46168g.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo38867t(String str) {
        mo19272b();
        C9357t3 n = mo38863n(str);
        if (n == null) {
            return false;
        }
        return n.mo38051N();
    }

    /* renamed from: u */
    public final boolean mo38868u(String str) {
        C9357t3 t3Var;
        if (TextUtils.isEmpty(str) || (t3Var = (C9357t3) this.f46168g.get(str)) == null || t3Var.mo38054z() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo38869v(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(mo38860c(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo38870w(String str, String str2) {
        Boolean bool;
        mo19272b();
        m45008C(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f46167f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo38871x(String str, String str2) {
        Boolean bool;
        mo19272b();
        m45008C(str);
        if (mo38869v(str) && C4668d9.m21487V(str2)) {
            return true;
        }
        if (mo38872y(str) && C4668d9.m21488W(str2)) {
            return true;
        }
        Map map = (Map) this.f46166e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo38872y(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(mo38860c(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo38873z(String str, byte[] bArr, String str2) {
        mo39090d();
        mo19272b();
        C4604n.m20094g(str);
        C9341s3 s3Var = (C9341s3) m45006A(str, bArr).mo37997q();
        if (s3Var == null) {
            return false;
        }
        m45007B(str, s3Var);
        m45009D(str, (C9357t3) s3Var.mo37840w());
        this.f46168g.put(str, (C9357t3) s3Var.mo37840w());
        this.f46172k.put(str, str2);
        this.f46165d.put(str, m45010E((C9357t3) s3Var.mo37840w()));
        this.f46518b.mo39280V().mo39006m(str, new ArrayList(s3Var.mo38022J()));
        try {
            s3Var.mo38020H();
            bArr = ((C9357t3) s3Var.mo37840w()).mo37404l();
        } catch (RuntimeException e) {
            this.f21269a.mo19276j().mo19287w().mo38858c("Unable to serialize reduced-size config. Storing full config instead. appId", C4667d3.m21474z(str), e);
        }
        C9793i V = this.f46518b.mo39280V();
        C4604n.m20094g(str);
        V.mo19272b();
        V.mo39090d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) V.mo38987P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                V.f21269a.mo19276j().mo19282q().mo38857b("Failed to update remote config (got 0). appId", C4667d3.m21474z(str));
            }
        } catch (SQLiteException e2) {
            V.f21269a.mo19276j().mo19282q().mo38858c("Error storing remote config. appId", C4667d3.m21474z(str), e2);
        }
        this.f46168g.put(str, (C9357t3) s3Var.mo37840w());
        return true;
    }
}
