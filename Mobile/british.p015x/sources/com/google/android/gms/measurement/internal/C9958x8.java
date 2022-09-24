package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9128e4;
import com.google.android.gms.internal.measurement.C9143f4;
import com.google.android.gms.internal.measurement.C9189i4;
import com.google.android.gms.internal.measurement.C9204j4;
import com.google.android.gms.internal.measurement.C9226kc;
import com.google.android.gms.internal.measurement.C9280o4;
import com.google.android.gms.internal.measurement.C9287ob;
import com.google.android.gms.internal.measurement.C9357t3;
import com.google.android.gms.internal.measurement.C9435y4;
import com.google.android.gms.internal.measurement.C9449z4;
import com.google.android.gms.internal.measurement.C9458zd;
import com.google.android.gms.internal.measurement.zzcl;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p006a5.C6483e;
import p150t.C6077a;
import p193c5.C6520c;
import p256u5.C11026a;
import p256u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9958x8 implements C9747d5 {

    /* renamed from: E */
    private static volatile C9958x8 f46860E;

    /* renamed from: A */
    private final Map f46861A;

    /* renamed from: B */
    private C9844m6 f46862B;

    /* renamed from: C */
    private String f46863C;

    /* renamed from: D */
    private final C9741c9 f46864D = new C9938v8(this);

    /* renamed from: a */
    private final C9726b4 f46865a;

    /* renamed from: b */
    private final C9797i3 f46866b;

    /* renamed from: c */
    private C9793i f46867c;

    /* renamed from: d */
    private C9819k3 f46868d;

    /* renamed from: e */
    private C9846m8 f46869e;

    /* renamed from: f */
    private C9880p9 f46870f;

    /* renamed from: g */
    private final C9978z8 f46871g;

    /* renamed from: h */
    private C9833l6 f46872h;

    /* renamed from: i */
    private C9937v7 f46873i;

    /* renamed from: j */
    private final C9879p8 f46874j;

    /* renamed from: k */
    private C9914t3 f46875k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4670h4 f46876l;

    /* renamed from: m */
    private boolean f46877m = false;

    /* renamed from: n */
    private boolean f46878n;

    /* renamed from: o */
    long f46879o;

    /* renamed from: p */
    private List f46880p;

    /* renamed from: q */
    private int f46881q;

    /* renamed from: r */
    private int f46882r;

    /* renamed from: s */
    private boolean f46883s;

    /* renamed from: t */
    private boolean f46884t;

    /* renamed from: u */
    private boolean f46885u;

    /* renamed from: v */
    private FileLock f46886v;

    /* renamed from: w */
    private FileChannel f46887w;

    /* renamed from: x */
    private List f46888x;

    /* renamed from: y */
    private List f46889y;

    /* renamed from: z */
    private long f46890z;

    C9958x8(C9968y8 y8Var, C4670h4 h4Var) {
        C4604n.m20098k(y8Var);
        this.f46876l = C4670h4.m21577H(y8Var.f46910a, (zzcl) null, (Long) null);
        this.f46890z = -1;
        this.f46874j = new C9879p8(this);
        C9978z8 z8Var = new C9978z8(this);
        z8Var.mo39091h();
        this.f46871g = z8Var;
        C9797i3 i3Var = new C9797i3(this);
        i3Var.mo39091h();
        this.f46866b = i3Var;
        C9726b4 b4Var = new C9726b4(this);
        b4Var.mo39091h();
        this.f46865a = b4Var;
        this.f46861A = new HashMap();
        mo19273e().mo38909z(new C9889q8(this, y8Var));
    }

    /* renamed from: E */
    static final void m45443E(C9128e4 e4Var, int i, String str) {
        List U = e4Var.mo37536U();
        int i2 = 0;
        while (i2 < U.size()) {
            if (!"_err".equals(((C9204j4) U.get(i2)).mo37664G())) {
                i2++;
            } else {
                return;
            }
        }
        C9189i4 D = C9204j4.m43050D();
        D.mo37641O("_err");
        D.mo37640N(Long.valueOf((long) i).longValue());
        C9189i4 D2 = C9204j4.m43050D();
        D2.mo37641O("_ev");
        D2.mo37642P(str);
        e4Var.mo37526K((C9204j4) D.mo37840w());
        e4Var.mo37526K((C9204j4) D2.mo37840w());
    }

    /* renamed from: G */
    static final void m45444G(C9128e4 e4Var, String str) {
        List U = e4Var.mo37536U();
        for (int i = 0; i < U.size(); i++) {
            if (str.equals(((C9204j4) U.get(i)).mo37664G())) {
                e4Var.mo37528M(i);
                return;
            }
        }
    }

    /* renamed from: H */
    private final zzp m45445H(String str) {
        String str2 = str;
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        C9885q4 R = iVar.mo38989R(str2);
        if (R == null || TextUtils.isEmpty(R.mo39144f0())) {
            mo19276j().mo19281p().mo38857b("No app data available; dropping", str2);
            return null;
        }
        Boolean I = m45446I(R);
        if (I == null || I.booleanValue()) {
            C9885q4 q4Var = R;
            return new zzp(str, R.mo39148h0(), R.mo39144f0(), R.mo39117K(), R.mo39142e0(), R.mo39128V(), R.mo39125S(), (String) null, R.mo39115I(), false, R.mo39146g0(), q4Var.mo39107A(), 0, 0, q4Var.mo39114H(), false, q4Var.mo39134a0(), q4Var.mo39132Z(), q4Var.mo39126T(), q4Var.mo39135b(), (String) null, mo39279U(str).mo43336h());
        }
        mo19276j().mo19282q().mo38857b("App version does not match; dropping. appId", C4667d3.m21474z(str));
        return null;
    }

    /* renamed from: I */
    private final Boolean m45446I(C9885q4 q4Var) {
        try {
            if (q4Var.mo39117K() != -2147483648L) {
                if (q4Var.mo39117K() == ((long) C6520c.m28321a(this.f46876l.mo19277r()).mo24355f(q4Var.mo39138c0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C6520c.m28321a(this.f46876l.mo19277r()).mo24355f(q4Var.mo39138c0(), 0).versionName;
                String f0 = q4Var.mo39144f0();
                if (f0 != null && f0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: J */
    private final void m45447J() {
        mo19273e().mo19272b();
        if (this.f46883s || this.f46884t || this.f46885u) {
            mo19276j().mo19286v().mo38859d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f46883s), Boolean.valueOf(this.f46884t), Boolean.valueOf(this.f46885u));
            return;
        }
        mo19276j().mo19286v().mo38856a("Stopping uploading service(s)");
        List<Runnable> list = this.f46880p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C4604n.m20098k(this.f46880p)).clear();
        }
    }

    /* renamed from: K */
    private final void m45448K(C9280o4 o4Var, long j, boolean z) {
        C9730b9 b9Var;
        String str = true != z ? "_lte" : "_se";
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        C9730b9 X = iVar.mo38994X(o4Var.mo37824q0(), str);
        if (X == null || X.f46188e == null) {
            b9Var = new C9730b9(o4Var.mo37824q0(), TtmlNode.TEXT_EMPHASIS_AUTO, str, mo19274f().currentTimeMillis(), Long.valueOf(j));
        } else {
            b9Var = new C9730b9(o4Var.mo37824q0(), TtmlNode.TEXT_EMPHASIS_AUTO, str, mo19274f().currentTimeMillis(), Long.valueOf(((Long) X.f46188e).longValue() + j));
        }
        C9435y4 C = C9449z4.m43918C();
        C.mo38190K(str);
        C.mo38191L(mo19274f().currentTimeMillis());
        C.mo38189J(((Long) b9Var.f46188e).longValue());
        C9449z4 z4Var = (C9449z4) C.mo37840w();
        int w = C9978z8.m45550w(o4Var, str);
        if (w >= 0) {
            o4Var.mo37821n0(w, z4Var);
        } else {
            o4Var.mo37774E0(z4Var);
        }
        if (j > 0) {
            C9793i iVar2 = this.f46867c;
            m45454Q(iVar2);
            iVar2.mo39016x(b9Var);
            mo19276j().mo19286v().mo38858c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", b9Var.f46188e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0238  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m45449L() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.f4 r1 = r20.mo19273e()
            r1.mo19272b()
            r20.mo39286b()
            long r1 = r0.f46879o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            a5.e r5 = r20.mo19274f()
            long r5 = r5.elapsedRealtime()
            long r7 = r0.f46879o
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.d3 r3 = r20.mo19276j()
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19286v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo38857b(r2, r1)
            com.google.android.gms.measurement.internal.k3 r1 = r20.mo39283Y()
            r1.mo39038c()
            com.google.android.gms.measurement.internal.m8 r1 = r0.f46869e
            m45454Q(r1)
            r1.mo39067l()
            return
        L_0x004c:
            r0.f46879o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.h4 r1 = r0.f46876l
            boolean r1 = r1.mo19388q()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r20.m45451N()
            if (r1 != 0) goto L_0x005e
            goto L_0x0255
        L_0x005e:
            a5.e r1 = r20.mo19274f()
            long r1 = r1.currentTimeMillis()
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46651B
            r6 = 0
            java.lang.Object r5 = r5.mo39174a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.i r5 = r0.f46867c
            m45454Q(r5)
            boolean r5 = r5.mo39012t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.i r5 = r0.f46867c
            m45454Q(r5)
            boolean r5 = r5.mo39011s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.f r5 = r20.mo39278T()
            java.lang.String r5 = r5.mo19354u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46720w
            java.lang.Object r5 = r5.mo39174a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46718v
            java.lang.Object r5 = r5.mo39174a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46716u
            java.lang.Object r5 = r5.mo39174a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.v7 r5 = r0.f46873i
            com.google.android.gms.measurement.internal.n3 r5 = r5.f46815j
            long r13 = r5.mo39075a()
            com.google.android.gms.measurement.internal.v7 r5 = r0.f46873i
            com.google.android.gms.measurement.internal.n3 r5 = r5.f46816k
            long r15 = r5.mo39075a()
            com.google.android.gms.measurement.internal.i r5 = r0.f46867c
            m45454Q(r5)
            r17 = r10
            long r9 = r5.mo38984M()
            com.google.android.gms.measurement.internal.i r5 = r0.f46867c
            m45454Q(r5)
            r18 = r7
            long r6 = r5.mo38985N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018f
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.z8 r13 = r0.f46871g
            m45454Q(r13)
            boolean r13 = r13.mo39349M(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018f
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018f
            r1 = 0
        L_0x0152:
            r20.mo39278T()
            r2 = 20
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46653D
            r6 = 0
            java.lang.Object r5 = r5.mo39174a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r2 = com.google.android.gms.measurement.internal.C9903s2.f46652C
            java.lang.Object r2 = r2.mo39174a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018f
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018f:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.i3 r1 = r0.f46866b
            m45454Q(r1)
            boolean r1 = r1.mo39017l()
            if (r1 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.v7 r1 = r0.f46873i
            com.google.android.gms.measurement.internal.n3 r1 = r1.f46814i
            long r1 = r1.mo39075a()
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46712s
            r6 = 0
            java.lang.Object r5 = r5.mo39174a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.z8 r9 = r0.f46871g
            m45454Q(r9)
            boolean r9 = r9.mo39349M(r1, r5)
            if (r9 != 0) goto L_0x01ca
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ca:
            com.google.android.gms.measurement.internal.k3 r1 = r20.mo39283Y()
            r1.mo39038c()
            a5.e r1 = r20.mo19274f()
            long r1 = r1.currentTimeMillis()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0201
            r20.mo39278T()
            com.google.android.gms.measurement.internal.r2 r1 = com.google.android.gms.measurement.internal.C9903s2.f46722x
            r2 = 0
            java.lang.Object r1 = r1.mo39174a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.v7 r1 = r0.f46873i
            com.google.android.gms.measurement.internal.n3 r1 = r1.f46815j
            a5.e r2 = r20.mo19274f()
            long r2 = r2.currentTimeMillis()
            r1.mo39076b(r2)
        L_0x0201:
            com.google.android.gms.measurement.internal.d3 r1 = r20.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo38857b(r3, r2)
            com.google.android.gms.measurement.internal.m8 r1 = r0.f46869e
            m45454Q(r1)
            r1.mo39068m(r7)
            return
        L_0x021b:
            com.google.android.gms.measurement.internal.d3 r1 = r20.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            java.lang.String r2 = "No network"
            r1.mo38856a(r2)
            com.google.android.gms.measurement.internal.k3 r1 = r20.mo39283Y()
            r1.mo39037b()
            com.google.android.gms.measurement.internal.m8 r1 = r0.f46869e
            m45454Q(r1)
            r1.mo39067l()
            return
        L_0x0238:
            com.google.android.gms.measurement.internal.d3 r1 = r20.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo38856a(r2)
            com.google.android.gms.measurement.internal.k3 r1 = r20.mo39283Y()
            r1.mo39038c()
            com.google.android.gms.measurement.internal.m8 r1 = r0.f46869e
            m45454Q(r1)
            r1.mo39067l()
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.d3 r1 = r20.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo38856a(r2)
            com.google.android.gms.measurement.internal.k3 r1 = r20.mo39283Y()
            r1.mo39038c()
            com.google.android.gms.measurement.internal.m8 r1 = r0.f46869e
            m45454Q(r1)
            r1.mo39067l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9958x8.m45449L():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b7e, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C4669f.m21551d() + r8)) goto L_0x0b80;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x088b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0902 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0904 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x090c A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0938 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b6e A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bf5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c11 A[Catch:{ SQLiteException -> 0x0c29 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0d05=Splitter:B:420:0x0d05} */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m45450M(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.i r4 = r1.f46867c
            m45454Q(r4)
            r4.mo39001e0()
            com.google.android.gms.measurement.internal.w8 r4 = new com.google.android.gms.measurement.internal.w8     // Catch:{ all -> 0x0d17 }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            r6 = 0
            long r9 = r1.f46890z     // Catch:{ all -> 0x0d17 }
            r7 = r43
            r11 = r4
            r5.mo38981G(r6, r7, r9, r11)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r4.f46839c     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0d05
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0d05
        L_0x002e:
            com.google.android.gms.internal.measurement.p4 r5 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.o8 r5 = r5.mo37997q()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.o4 r5 = (com.google.android.gms.internal.measurement.C9280o4) r5     // Catch:{ all -> 0x0d17 }
            r5.mo37780I0()     // Catch:{ all -> 0x0d17 }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.f46839c     // Catch:{ all -> 0x0d17 }
            int r12 = r12.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.f46839c     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r3 = (com.google.android.gms.internal.measurement.C9143f4) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.o8 r3 = r3.mo37997q()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e4 r3 = (com.google.android.gms.internal.measurement.C9128e4) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b4 r12 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r2 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo37885L1()     // Catch:{ all -> 0x0d17 }
            r20 = r9
            java.lang.String r9 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.mo38871x(r2, r9)     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.d3 r2 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.p4 r7 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h4 r12 = r1.f46876l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.y2 r12 = r12.mo19363D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo39320d(r15)     // Catch:{ all -> 0x0d17 }
            r2.mo38858c(r6, r7, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b4 r2 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r6 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo37885L1()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo38869v(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.b4 r2 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r6 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo37885L1()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo38872y(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.d9 r21 = r41.mo39293g0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.c9 r2 = r1.f46864D     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r6 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r23 = r6.mo37885L1()     // Catch:{ all -> 0x0d17 }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            r27 = 0
            r22 = r2
            r21.mo19290A(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d17 }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = p256u5.C11040o.m49439a(r18)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.mo37529N(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r12 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r12 = r12.mo19286v()     // Catch:{ all -> 0x0d17 }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.mo38856a(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo19278C()     // Catch:{ all -> 0x0d17 }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.mo37521B()     // Catch:{ all -> 0x0d17 }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.j4 r21 = r3.mo37534S(r2)     // Catch:{ all -> 0x0d17 }
            r22 = r8
            java.lang.String r8 = r21.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.j4 r8 = r3.mo37534S(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo37665H()     // Catch:{ all -> 0x0d17 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.j4 r12 = r3.mo37534S(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo37665H()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.d3 r8 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r8 = r8.mo19288x()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.mo38856a(r12)     // Catch:{ all -> 0x0d17 }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.b4 r2 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r8 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo38870w(r8, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.z8 r12 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.C4604n.m20094g(r12)     // Catch:{ all -> 0x0d17 }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d17 }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.mo37521B()     // Catch:{ all -> 0x0d17 }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            com.google.android.gms.internal.measurement.j4 r7 = r3.mo37534S(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.j4 r5 = r3.mo37534S(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.o8 r5 = r5.mo37997q()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.i4 r5 = (com.google.android.gms.internal.measurement.C9189i4) r5     // Catch:{ all -> 0x0d17 }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.mo37640N(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r5 = r5.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C9204j4) r5     // Catch:{ all -> 0x0d17 }
            r3.mo37531P(r10, r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            com.google.android.gms.internal.measurement.j4 r13 = r3.mo37534S(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0243
            com.google.android.gms.internal.measurement.j4 r5 = r3.mo37534S(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.o8 r5 = r5.mo37997q()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.i4 r5 = (com.google.android.gms.internal.measurement.C9189i4) r5     // Catch:{ all -> 0x0d17 }
            r12 = 1
            r5.mo37640N(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r5 = r5.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C9204j4) r5     // Catch:{ all -> 0x0d17 }
            r3.mo37531P(r10, r5)     // Catch:{ all -> 0x0d17 }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.d3 r10 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r10 = r10.mo19286v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.h4 r13 = r1.f46876l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.y2 r13 = r13.mo19363D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo39320d(r14)     // Catch:{ all -> 0x0d17 }
            r10.mo38857b(r11, r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.i4 r10 = com.google.android.gms.internal.measurement.C9204j4.m43050D()     // Catch:{ all -> 0x0d17 }
            r10.mo37641O(r8)     // Catch:{ all -> 0x0d17 }
            r13 = 1
            r10.mo37640N(r13)     // Catch:{ all -> 0x0d17 }
            r3.mo37525J(r10)     // Catch:{ all -> 0x0d17 }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.d3 r10 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r10 = r10.mo19286v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.h4 r12 = r1.f46876l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.y2 r12 = r12.mo19363D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo39320d(r13)     // Catch:{ all -> 0x0d17 }
            r10.mo38857b(r11, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.i4 r10 = com.google.android.gms.internal.measurement.C9204j4.m43050D()     // Catch:{ all -> 0x0d17 }
            r10.mo37641O(r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            r10.mo37640N(r11)     // Catch:{ all -> 0x0d17 }
            r3.mo37525J(r10)     // Catch:{ all -> 0x0d17 }
        L_0x02a8:
            com.google.android.gms.measurement.internal.i r10 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r10)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.mo39275F()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r11 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r11.mo37885L1()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.g r10 = r26.mo38991T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r10.f46280e     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f r12 = r41.mo39278T()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r13 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo37885L1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r2 r14 = com.google.android.gms.measurement.internal.C9903s2.f46706p     // Catch:{ all -> 0x0d17 }
            int r12 = r12.mo19348n(r13, r14)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r12     // Catch:{ all -> 0x0d17 }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02e2
            m45444G(r3, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            boolean r5 = com.google.android.gms.measurement.internal.C4668d9.m21488W(r5)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.mo39275F()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r10 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r10.mo37885L1()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.g r5 = r26.mo38991T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r5.f46278c     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f r5 = r41.mo39278T()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r12 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo37885L1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r2 r13 = com.google.android.gms.measurement.internal.C9903s2.f46704o     // Catch:{ all -> 0x0d17 }
            int r5 = r5.mo19348n(r12, r13)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r5     // Catch:{ all -> 0x0d17 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.d3 r5 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.p4 r11 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r11)     // Catch:{ all -> 0x0d17 }
            r5.mo38857b(r10, r11)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.mo37521B()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r13) goto L_0x036b
            com.google.android.gms.internal.measurement.j4 r13 = r3.mo37534S(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r13.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x035d
            com.google.android.gms.internal.measurement.o8 r5 = r13.mo37997q()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.i4 r5 = (com.google.android.gms.internal.measurement.C9189i4) r5     // Catch:{ all -> 0x0d17 }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.mo37528M(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            com.google.android.gms.internal.measurement.o8 r5 = r5.clone()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.i4 r5 = (com.google.android.gms.internal.measurement.C9189i4) r5     // Catch:{ all -> 0x0d17 }
            r5.mo37641O(r9)     // Catch:{ all -> 0x0d17 }
            r9 = 10
            r5.mo37640N(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r5 = r5.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C9204j4) r5     // Catch:{ all -> 0x0d17 }
            r3.mo37531P(r12, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.d3 r5 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.p4 r10 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = r10.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0d17 }
            r5.mo38857b(r9, r10)     // Catch:{ all -> 0x0d17 }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r3.mo37536U()     // Catch:{ all -> 0x0d17 }
            r2.<init>(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r11 = (com.google.android.gms.internal.measurement.C9204j4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r11 = (com.google.android.gms.internal.measurement.C9204j4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C9204j4) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo37669V()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C9204j4) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo37667T()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.d3 r2 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19288x()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo38856a(r5)     // Catch:{ all -> 0x0d17 }
            r3.mo37528M(r9)     // Catch:{ all -> 0x0d17 }
            m45444G(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 18
            m45443E(r3, r2, r13)     // Catch:{ all -> 0x0d17 }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C9204j4) r2     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo37665H()     // Catch:{ all -> 0x0d17 }
            int r10 = r2.length()     // Catch:{ all -> 0x0d17 }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d17 }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d17 }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.d3 r2 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19288x()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo38856a(r10)     // Catch:{ all -> 0x0d17 }
            r3.mo37528M(r9)     // Catch:{ all -> 0x0d17 }
            m45444G(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 19
            m45443E(r3, r2, r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d17 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.z8 r2 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r2 = r3.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C9143f4) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r2 = com.google.android.gms.measurement.internal.C9978z8.m45541m(r2, r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.mo37523H()     // Catch:{ all -> 0x0d17 }
            long r12 = r3.mo37523H()     // Catch:{ all -> 0x0d17 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d17 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            com.google.android.gms.internal.measurement.o8 r2 = r7.clone()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e4 r2 = (com.google.android.gms.internal.measurement.C9128e4) r2     // Catch:{ all -> 0x0d17 }
            boolean r6 = r1.m45452O(r3, r2)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.mo37801T(r6, r2)     // Catch:{ all -> 0x0d17 }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.mo37535T()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.z8 r2 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r2 = r3.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C9143f4) r2     // Catch:{ all -> 0x0d17 }
            r11 = r24
            com.google.android.gms.internal.measurement.j4 r2 = com.google.android.gms.measurement.internal.C9978z8.m45541m(r2, r11)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.mo37523H()     // Catch:{ all -> 0x0d17 }
            long r13 = r3.mo37523H()     // Catch:{ all -> 0x0d17 }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d17 }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            com.google.android.gms.internal.measurement.o8 r2 = r23.clone()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e4 r2 = (com.google.android.gms.internal.measurement.C9128e4) r2     // Catch:{ all -> 0x0d17 }
            boolean r7 = r1.m45452O(r2, r3)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.mo37801T(r8, r2)     // Catch:{ all -> 0x0d17 }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.f46839c     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r6 = r3.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r6 = (com.google.android.gms.internal.measurement.C9143f4) r6     // Catch:{ all -> 0x0d17 }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d17 }
            int r9 = r20 + 1
            r10.mo37772C0(r3)     // Catch:{ all -> 0x0d17 }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            com.google.android.gms.internal.measurement.f4 r12 = r10.mo37831x0(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r12.mo37555H()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.z8 r13 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r13 = com.google.android.gms.measurement.internal.C9978z8.m45541m(r12, r6)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            r10.mo37794P0(r5)     // Catch:{ all -> 0x0d17 }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.z8 r13 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r12 = com.google.android.gms.measurement.internal.C9978z8.m45541m(r12, r11)     // Catch:{ all -> 0x0d17 }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.mo37669V()     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.mo37663C()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.m45448K(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r10.mo37826s0()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r11 = (com.google.android.gms.internal.measurement.C9143f4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo37555H()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r10.mo37824q0()     // Catch:{ all -> 0x0d17 }
            r5.mo39005l(r6, r9)     // Catch:{ all -> 0x0d17 }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.C9978z8.m45550w(r10, r5)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.m45448K(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.C9978z8.m45550w(r10, r9)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05fa
            r10.mo37796Q0(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.p4 r7 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)     // Catch:{ all -> 0x0d17 }
            r5.mo38857b(r6, r7)     // Catch:{ all -> 0x0d17 }
        L_0x05fa:
            com.google.android.gms.measurement.internal.z8 r5 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h4 r6 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19286v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.mo38856a(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.x8 r6 = r5.f46518b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b4 r6 = r6.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.mo37824q0()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.mo38867t(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.x8 r6 = r5.f46518b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i r6 = r6.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.mo37824q0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.q4 r6 = r6.mo38989R(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.mo39114H()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.h4 r6 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.m r6 = r6.mo19360A()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.mo39061s()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.h4 r6 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19281p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.mo38856a(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.y4 r6 = com.google.android.gms.internal.measurement.C9449z4.m43918C()     // Catch:{ all -> 0x0d17 }
            r7 = r17
            r6.mo38190K(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.m r5 = r5.mo19360A()     // Catch:{ all -> 0x0d17 }
            long r8 = r5.mo39057n()     // Catch:{ all -> 0x0d17 }
            r6.mo38191L(r8)     // Catch:{ all -> 0x0d17 }
            r8 = 1
            r6.mo38189J(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r5 = r6.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.z4 r5 = (com.google.android.gms.internal.measurement.C9449z4) r5     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0673:
            int r8 = r10.mo37828u0()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r8) goto L_0x068e
            com.google.android.gms.internal.measurement.z4 r8 = r10.mo37823p0(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo38212F()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x068b
            r10.mo37821n0(r6, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.mo37774E0(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mo37817j0(r5)     // Catch:{ all -> 0x0d17 }
            r5 = -9223372036854775808
            r10.mo37799S(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
        L_0x069f:
            int r6 = r10.mo37813f0()     // Catch:{ all -> 0x0d17 }
            if (r5 >= r6) goto L_0x06d2
            com.google.android.gms.internal.measurement.f4 r6 = r10.mo37831x0(r5)     // Catch:{ all -> 0x0d17 }
            long r7 = r6.mo37553C()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.mo37830w0()     // Catch:{ all -> 0x0d17 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x06bc
            long r7 = r6.mo37553C()     // Catch:{ all -> 0x0d17 }
            r10.mo37817j0(r7)     // Catch:{ all -> 0x0d17 }
        L_0x06bc:
            long r7 = r6.mo37553C()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.mo37829v0()     // Catch:{ all -> 0x0d17 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x06cf
            long r6 = r6.mo37553C()     // Catch:{ all -> 0x0d17 }
            r10.mo37799S(r6)     // Catch:{ all -> 0x0d17 }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.mo37792O0()     // Catch:{ all -> 0x0d17 }
            r10.mo37776G0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.p9 r5 = r1.f46870f     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r21 = r10.mo37824q0()     // Catch:{ all -> 0x0d17 }
            java.util.List r22 = r10.mo37826s0()     // Catch:{ all -> 0x0d17 }
            java.util.List r23 = r10.mo37827t0()     // Catch:{ all -> 0x0d17 }
            long r6 = r10.mo37830w0()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r10.mo37829v0()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            r20 = r5
            java.util.List r5 = r20.mo39104l(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d17 }
            r10.mo37832y0(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f r5 = r41.mo39278T()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r6 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo37885L1()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo19341F(r6)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0a51
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d17 }
            r5.<init>()     // Catch:{ all -> 0x0d17 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            r6.<init>()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d9 r7 = r41.mo39293g0()     // Catch:{ all -> 0x0d17 }
            java.security.SecureRandom r7 = r7.mo19327t()     // Catch:{ all -> 0x0d17 }
            r8 = 0
        L_0x0725:
            int r9 = r10.mo37813f0()     // Catch:{ all -> 0x0d17 }
            if (r8 >= r9) goto L_0x0a17
            com.google.android.gms.internal.measurement.f4 r9 = r10.mo37831x0(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.o8 r9 = r9.mo37997q()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e4 r9 = (com.google.android.gms.internal.measurement.C9128e4) r9     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.z8 r11 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r11 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r11 = (com.google.android.gms.internal.measurement.C9143f4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C9978z8.m45542n(r11, r14)     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d17 }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r14 = (com.google.android.gms.measurement.internal.C9859o) r14     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.i r14 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r15 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r15.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r17 = com.google.android.gms.common.internal.C4604n.m20098k(r11)     // Catch:{ all -> 0x0d17 }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r14 = r14.mo38993V(r15, r2)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d17 }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.f46533i     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.f46534j     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d17 }
            r17 = 1
            int r11 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.z8 r2 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = r14.f46534j     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C9978z8.m45539P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
        L_0x079a:
            java.lang.Boolean r2 = r14.f46535k     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.z8 r2 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C9978z8.m45539P(r9, r12, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07b2:
            com.google.android.gms.internal.measurement.r8 r2 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C9143f4) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
        L_0x07bb:
            r10.mo37801T(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x07be:
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a0b
        L_0x07c8:
            com.google.android.gms.measurement.internal.b4 r2 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r3 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.mo38860c(r3, r11)     // Catch:{ all -> 0x0d17 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo38858c(r14, r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.d9 r11 = r41.mo39293g0()     // Catch:{ all -> 0x0d17 }
            long r14 = r9.mo37523H()     // Catch:{ all -> 0x0d17 }
            long r14 = r11.mo19326s0(r14, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r11 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r11 = (com.google.android.gms.internal.measurement.C9143f4) r11     // Catch:{ all -> 0x0d17 }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d17 }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.mo37556I()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.j4 r11 = (com.google.android.gms.internal.measurement.C9204j4) r11     // Catch:{ all -> 0x0d17 }
            r22 = r3
            java.lang.String r3 = r11.mo37664G()     // Catch:{ all -> 0x0d17 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d17 }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.mo37663C()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.b4 r2 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r3 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            int r2 = r2.mo38862l(r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x0866:
            if (r2 > 0) goto L_0x088b
            com.google.android.gms.measurement.internal.d3 r3 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            r3.mo38858c(r11, r12, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r2 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C9143f4) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            r10.mo37801T(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x088b:
            java.lang.String r3 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r3 = (com.google.android.gms.measurement.internal.C9859o) r3     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.i r3 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r11 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r3 = r3.mo38993V(r11, r12)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.d3 r3 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.p4 r12 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo37885L1()     // Catch:{ all -> 0x0d17 }
            r22 = r14
            java.lang.String r14 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            r3.mo38858c(r11, r12, r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r3 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r11 = r4.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r25 = r11.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r26 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.mo37523H()     // Catch:{ all -> 0x0d17 }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d17 }
            goto L_0x08ed
        L_0x08eb:
            r22 = r14
        L_0x08ed:
            com.google.android.gms.measurement.internal.z8 r11 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r11 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r11 = (com.google.android.gms.internal.measurement.C9143f4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C9978z8.m45542n(r11, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0904
            r12 = 1
            goto L_0x0905
        L_0x0904:
            r12 = 0
        L_0x0905:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            r14 = 1
            if (r2 != r14) goto L_0x0938
            com.google.android.gms.internal.measurement.r8 r2 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C9143f4) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
            java.lang.Long r2 = r3.f46533i     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Long r2 = r3.f46534j     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Boolean r2 = r3.f46535k     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
        L_0x0927:
            r2 = 0
            com.google.android.gms.measurement.internal.o r3 = r3.mo39081a(r2, r2, r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0933:
            r10.mo37801T(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x0938:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x097a
            com.google.android.gms.measurement.internal.z8 r11 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r11)     // Catch:{ all -> 0x0d17 }
            long r14 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C9978z8.m45539P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r11 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r11 = (com.google.android.gms.internal.measurement.C9143f4) r11     // Catch:{ all -> 0x0d17 }
            r6.add(r11)     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x095f
            r11 = 0
            com.google.android.gms.measurement.internal.o r3 = r3.mo39081a(r11, r2, r11)     // Catch:{ all -> 0x0d17 }
        L_0x095f:
            java.lang.String r2 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            long r11 = r9.mo37523H()     // Catch:{ all -> 0x0d17 }
            r14 = r22
            com.google.android.gms.measurement.internal.o r3 = r3.mo39082b(r11, r14)     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a08
        L_0x097a:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.f46532h     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x098f
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x09a5
        L_0x098f:
            com.google.android.gms.measurement.internal.d9 r7 = r41.mo39293g0()     // Catch:{ all -> 0x0d17 }
            r25 = r10
            r23 = r11
            long r10 = r9.mo37522C()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.mo19326s0(r10, r4)     // Catch:{ all -> 0x0d17 }
        L_0x09a5:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09ee
            com.google.android.gms.measurement.internal.z8 r4 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r4)     // Catch:{ all -> 0x0d17 }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d17 }
            r10 = r44
            com.google.android.gms.measurement.internal.C9978z8.m45539P(r9, r10, r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.z8 r7 = r1.f46871g     // Catch:{ all -> 0x0d17 }
            m45454Q(r7)     // Catch:{ all -> 0x0d17 }
            long r10 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C9978z8.m45539P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r7 = r9.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.f4 r7 = (com.google.android.gms.internal.measurement.C9143f4) r7     // Catch:{ all -> 0x0d17 }
            r6.add(r7)     // Catch:{ all -> 0x0d17 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x09dc
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d17 }
            r10 = 0
            com.google.android.gms.measurement.internal.o r3 = r3.mo39081a(r10, r2, r7)     // Catch:{ all -> 0x0d17 }
        L_0x09dc:
            java.lang.String r2 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            long r10 = r9.mo37523H()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r3 = r3.mo39082b(r10, r14)     // Catch:{ all -> 0x0d17 }
            r7 = r26
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a06
        L_0x09ee:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0a06
            java.lang.String r2 = r9.mo37535T()     // Catch:{ all -> 0x0d17 }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.o r3 = r3.mo39081a(r11, r10, r10)     // Catch:{ all -> 0x0d17 }
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0a06:
            r2 = r25
        L_0x0a08:
            r2.mo37801T(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0a0b:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a17:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d17 }
            int r4 = r2.mo37813f0()     // Catch:{ all -> 0x0d17 }
            if (r3 >= r4) goto L_0x0a2b
            r2.mo37780I0()     // Catch:{ all -> 0x0d17 }
            r2.mo37833z0(r6)     // Catch:{ all -> 0x0d17 }
        L_0x0a2b:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0a33:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r4 == 0) goto L_0x0a4e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d17 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.o r4 = (com.google.android.gms.measurement.internal.C9859o) r4     // Catch:{ all -> 0x0d17 }
            r5.mo39009p(r4)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a33
        L_0x0a4e:
            r3 = r24
            goto L_0x0a53
        L_0x0a51:
            r2 = r10
            r3 = r4
        L_0x0a53:
            com.google.android.gms.internal.measurement.p4 r4 = r3.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r4 = r4.mo37885L1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.q4 r5 = r5.mo38989R(r4)     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0a7c
            com.google.android.gms.measurement.internal.d3 r5 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.p4 r7 = r3.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)     // Catch:{ all -> 0x0d17 }
            r5.mo38857b(r6, r7)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad8
        L_0x0a7c:
            int r6 = r2.mo37813f0()     // Catch:{ all -> 0x0d17 }
            if (r6 <= 0) goto L_0x0ad8
            long r6 = r5.mo39129W()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a90
            r2.mo37810c0(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a93
        L_0x0a90:
            r2.mo37786L0()     // Catch:{ all -> 0x0d17 }
        L_0x0a93:
            long r8 = r5.mo39131Y()     // Catch:{ all -> 0x0d17 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a9e
            goto L_0x0a9f
        L_0x0a9e:
            r6 = r8
        L_0x0a9f:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0aa7
            r2.mo37811d0(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0aaa
        L_0x0aa7:
            r2.mo37788M0()     // Catch:{ all -> 0x0d17 }
        L_0x0aaa:
            r5.mo39139d()     // Catch:{ all -> 0x0d17 }
            long r6 = r5.mo39130X()     // Catch:{ all -> 0x0d17 }
            int r7 = (int) r6     // Catch:{ all -> 0x0d17 }
            r2.mo37783K(r7)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.mo37830w0()     // Catch:{ all -> 0x0d17 }
            r5.mo39109C(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.mo37829v0()     // Catch:{ all -> 0x0d17 }
            r5.mo39167z(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r5.mo39136b0()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0acd
            r2.mo37805X(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad0
        L_0x0acd:
            r2.mo37782J0()     // Catch:{ all -> 0x0d17 }
        L_0x0ad0:
            com.google.android.gms.measurement.internal.i r6 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r6)     // Catch:{ all -> 0x0d17 }
            r6.mo39008o(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0ad8:
            int r5 = r2.mo37813f0()     // Catch:{ all -> 0x0d17 }
            if (r5 <= 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.h4 r5 = r1.f46876l     // Catch:{ all -> 0x0d17 }
            r5.mo19275g()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b4 r5 = r1.f46865a     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r6 = r3.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo37885L1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.t3 r5 = r5.mo38863n(r6)     // Catch:{ all -> 0x0d17 }
            r6 = -1
            if (r5 == 0) goto L_0x0b05
            boolean r8 = r5.mo38053P()     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0afd
            goto L_0x0b05
        L_0x0afd:
            long r8 = r5.mo38045B()     // Catch:{ all -> 0x0d17 }
            r2.mo37787M(r8)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b05:
            com.google.android.gms.internal.measurement.p4 r5 = r3.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = r5.mo37876G()     // Catch:{ all -> 0x0d17 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0b15
            r2.mo37787M(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b15:
            com.google.android.gms.measurement.internal.d3 r5 = r41.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.p4 r9 = r3.f46837a     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = r9.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r9)     // Catch:{ all -> 0x0d17 }
            r5.mo38857b(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0b2c:
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r8 r2 = r2.mo37840w()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.p4 r2 = (com.google.android.gms.internal.measurement.C9296p4) r2     // Catch:{ all -> 0x0d17 }
            r5.mo19272b()     // Catch:{ all -> 0x0d17 }
            r5.mo39090d()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.C4604n.m20098k(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r2.mo37885L1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.C4604n.m20094g(r8)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.mo37892e1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.C4604n.m20101n(r8)     // Catch:{ all -> 0x0d17 }
            r5.mo39004h0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h4 r8 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            a5.e r8 = r8.mo19274f()     // Catch:{ all -> 0x0d17 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0d17 }
            long r10 = r2.mo37922z1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h4 r12 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            r12.mo19392z()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.C4669f.m21551d()     // Catch:{ all -> 0x0d17 }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b80
            long r10 = r2.mo37922z1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h4 r12 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            r12.mo19392z()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.C4669f.m21551d()     // Catch:{ all -> 0x0d17 }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0ba3
        L_0x0b80:
            com.google.android.gms.measurement.internal.h4 r10 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r10 = r10.mo19287w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d17 }
            long r13 = r2.mo37922z1()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d17 }
            r10.mo38859d(r11, r12, r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0ba3:
            byte[] r8 = r2.mo37404l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.x8 r9 = r5.f46518b     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.z8 r9 = r9.f46871g     // Catch:{ IOException -> 0x0c43 }
            m45454Q(r9)     // Catch:{ IOException -> 0x0c43 }
            byte[] r8 = r9.mo39350O(r8)     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.h4 r9 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19286v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.mo38857b(r10, r11)     // Catch:{ all -> 0x0d17 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d17 }
            r9.<init>()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.mo37885L1()     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.mo37922z1()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.mo37898k1()     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0c02
            java.lang.String r8 = "retry_count"
            int r10 = r2.mo37907s1()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
        L_0x0c02:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo38987P()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c29 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.h4 r6 = r5.f21269a     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19282q()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.mo37885L1()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r8)     // Catch:{ SQLiteException -> 0x0c29 }
            r6.mo38857b(r7, r8)     // Catch:{ SQLiteException -> 0x0c29 }
            goto L_0x0c5c
        L_0x0c29:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r2)     // Catch:{ all -> 0x0d17 }
            r5.mo38858c(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0c5c
        L_0x0c43:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.mo37885L1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r2)     // Catch:{ all -> 0x0d17 }
            r5.mo38858c(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
        L_0x0c5c:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            java.util.List r3 = r3.f46838b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.C4604n.m20098k(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo19272b()     // Catch:{ all -> 0x0d17 }
            r2.mo39090d()     // Catch:{ all -> 0x0d17 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0c74:
            int r7 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r7) goto L_0x0c91
            if (r6 == 0) goto L_0x0c81
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
        L_0x0c81:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d17 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
            int r6 = r6 + 1
            goto L_0x0c74
        L_0x0c91:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo38987P()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d17 }
            int r6 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r5 == r6) goto L_0x0cc6
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d17 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo38858c(r6, r5, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cc6:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo38987P()     // Catch:{ all -> 0x0d17 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cde }
            goto L_0x0cf3
        L_0x0cde:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r4)     // Catch:{ all -> 0x0d17 }
            r2.mo38858c(r5, r4, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cf3:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            r2.mo39007n()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            r2 = 1
            return r2
        L_0x0d05:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0d17 }
            m45454Q(r2)     // Catch:{ all -> 0x0d17 }
            r2.mo39007n()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            r2 = 0
            return r2
        L_0x0d17:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.i r3 = r1.f46867c
            m45454Q(r3)
            r3.mo39002f0()
            goto L_0x0d23
        L_0x0d22:
            throw r2
        L_0x0d23:
            goto L_0x0d22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9958x8.m45450M(java.lang.String, long):boolean");
    }

    /* renamed from: N */
    private final boolean m45451N() {
        mo19273e().mo19272b();
        mo39286b();
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        if (iVar.mo39010q()) {
            return true;
        }
        C9793i iVar2 = this.f46867c;
        m45454Q(iVar2);
        return !TextUtils.isEmpty(iVar2.mo38996Z());
    }

    /* renamed from: O */
    private final boolean m45452O(C9128e4 e4Var, C9128e4 e4Var2) {
        String str;
        C4604n.m20088a("_e".equals(e4Var.mo37535T()));
        m45454Q(this.f46871g);
        C9204j4 m = C9978z8.m45541m((C9143f4) e4Var.mo37840w(), "_sc");
        String str2 = null;
        if (m == null) {
            str = null;
        } else {
            str = m.mo37665H();
        }
        m45454Q(this.f46871g);
        C9204j4 m2 = C9978z8.m45541m((C9143f4) e4Var2.mo37840w(), "_pc");
        if (m2 != null) {
            str2 = m2.mo37665H();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C4604n.m20088a("_e".equals(e4Var.mo37535T()));
        m45454Q(this.f46871g);
        C9204j4 m3 = C9978z8.m45541m((C9143f4) e4Var.mo37840w(), "_et");
        if (m3 == null || !m3.mo37669V() || m3.mo37663C() <= 0) {
            return true;
        }
        long C = m3.mo37663C();
        m45454Q(this.f46871g);
        C9204j4 m4 = C9978z8.m45541m((C9143f4) e4Var2.mo37840w(), "_et");
        if (m4 != null && m4.mo37663C() > 0) {
            C += m4.mo37663C();
        }
        m45454Q(this.f46871g);
        C9978z8.m45539P(e4Var2, "_et", Long.valueOf(C));
        m45454Q(this.f46871g);
        C9978z8.m45539P(e4Var, "_fr", 1L);
        return true;
    }

    /* renamed from: P */
    private static final boolean m45453P(zzp zzp) {
        return !TextUtils.isEmpty(zzp.f46949c) || !TextUtils.isEmpty(zzp.f46964r);
    }

    /* renamed from: Q */
    private static final C9868o8 m45454Q(C9868o8 o8Var) {
        if (o8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (o8Var.mo39092i()) {
            return o8Var;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o8Var.getClass())));
        }
    }

    /* renamed from: e0 */
    public static C9958x8 m45456e0(Context context) {
        C4604n.m20098k(context);
        C4604n.m20098k(context.getApplicationContext());
        if (f46860E == null) {
            synchronized (C9958x8.class) {
                if (f46860E == null) {
                    f46860E = new C9958x8((C9968y8) C4604n.m20098k(new C9968y8(context)), (C4670h4) null);
                }
            }
        }
        return f46860E;
    }

    /* renamed from: j0 */
    static /* bridge */ /* synthetic */ void m45457j0(C9958x8 x8Var, C9968y8 y8Var) {
        x8Var.mo19273e().mo19272b();
        x8Var.f46875k = new C9914t3(x8Var);
        C9793i iVar = new C9793i(x8Var);
        iVar.mo39091h();
        x8Var.f46867c = iVar;
        x8Var.mo39278T().mo19359z((C9751e) C4604n.m20098k(x8Var.f46865a));
        C9937v7 v7Var = new C9937v7(x8Var);
        v7Var.mo39091h();
        x8Var.f46873i = v7Var;
        C9880p9 p9Var = new C9880p9(x8Var);
        p9Var.mo39091h();
        x8Var.f46870f = p9Var;
        C9833l6 l6Var = new C9833l6(x8Var);
        l6Var.mo39091h();
        x8Var.f46872h = l6Var;
        C9846m8 m8Var = new C9846m8(x8Var);
        m8Var.mo39091h();
        x8Var.f46869e = m8Var;
        x8Var.f46868d = new C9819k3(x8Var);
        if (x8Var.f46881q != x8Var.f46882r) {
            x8Var.mo19276j().mo19282q().mo38858c("Not all upload components initialized", Integer.valueOf(x8Var.f46881q), Integer.valueOf(x8Var.f46882r));
        }
        x8Var.f46877m = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo39271A(zzks zzks, zzp zzp) {
        long j;
        zzks zzks2 = zzks;
        zzp zzp2 = zzp;
        mo19273e().mo19272b();
        mo39286b();
        if (m45453P(zzp)) {
            if (!zzp2.f46955i) {
                mo39276R(zzp2);
                return;
            }
            int n0 = mo39293g0().mo19319n0(zzks2.f46942c);
            if (n0 != 0) {
                C4668d9 g0 = mo39293g0();
                String str = zzks2.f46942c;
                mo39278T();
                String p = g0.mo19322p(str, 24, true);
                String str2 = zzks2.f46942c;
                mo39293g0().mo19290A(this.f46864D, zzp2.f46948b, n0, "_ev", p, str2 != null ? str2.length() : 0);
                return;
            }
            int j0 = mo39293g0().mo19314j0(zzks2.f46942c, zzks.mo39366C0());
            if (j0 != 0) {
                C4668d9 g02 = mo39293g0();
                String str3 = zzks2.f46942c;
                mo39278T();
                String p2 = g02.mo19322p(str3, 24, true);
                Object C0 = zzks.mo39366C0();
                mo39293g0().mo19290A(this.f46864D, zzp2.f46948b, j0, "_ev", p2, (C0 == null || (!(C0 instanceof String) && !(C0 instanceof CharSequence))) ? 0 : C0.toString().length());
                return;
            }
            Object o = mo39293g0().mo19320o(zzks2.f46942c, zzks.mo39366C0());
            if (o != null) {
                if ("_sid".equals(zzks2.f46942c)) {
                    long j2 = zzks2.f46943d;
                    String str4 = zzks2.f46946g;
                    String str5 = (String) C4604n.m20098k(zzp2.f46948b);
                    C9793i iVar = this.f46867c;
                    m45454Q(iVar);
                    C9730b9 X = iVar.mo38994X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f46188e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo39271A(new zzks("_sno", j2, Long.valueOf(j + 1), str4), zzp2);
                        }
                    }
                    if (X != null) {
                        mo19276j().mo19287w().mo38857b("Retrieved last session number from database does not contain a valid (long) value", X.f46188e);
                    }
                    C9793i iVar2 = this.f46867c;
                    m45454Q(iVar2);
                    C9859o V = iVar2.mo38993V(str5, "_s");
                    if (V != null) {
                        j = V.f46527c;
                        mo19276j().mo19286v().mo38857b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo39271A(new zzks("_sno", j2, Long.valueOf(j + 1), str4), zzp2);
                }
                C9730b9 b9Var = new C9730b9((String) C4604n.m20098k(zzp2.f46948b), (String) C4604n.m20098k(zzks2.f46946g), zzks2.f46942c, zzks2.f46943d, o);
                mo19276j().mo19286v().mo38858c("Setting user property", this.f46876l.mo19363D().mo39322f(b9Var.f46186c), o);
                C9793i iVar3 = this.f46867c;
                m45454Q(iVar3);
                iVar3.mo39001e0();
                try {
                    C9287ob.m43342b();
                    if (this.f46876l.mo19392z().mo19337B((String) null, C9903s2.f46707p0) && "_id".equals(b9Var.f46186c)) {
                        if (this.f46876l.mo19392z().mo19337B((String) null, C9903s2.f46713s0)) {
                            C9793i iVar4 = this.f46867c;
                            m45454Q(iVar4);
                            C9730b9 X2 = iVar4.mo38994X(zzp2.f46948b, "_id");
                            if (X2 != null && !b9Var.f46188e.equals(X2.f46188e)) {
                                C9793i iVar5 = this.f46867c;
                                m45454Q(iVar5);
                                iVar5.mo39005l(zzp2.f46948b, "_lair");
                            }
                        } else {
                            C9793i iVar6 = this.f46867c;
                            m45454Q(iVar6);
                            iVar6.mo39005l(zzp2.f46948b, "_lair");
                        }
                    }
                    mo39276R(zzp2);
                    C9793i iVar7 = this.f46867c;
                    m45454Q(iVar7);
                    boolean x = iVar7.mo39016x(b9Var);
                    C9793i iVar8 = this.f46867c;
                    m45454Q(iVar8);
                    iVar8.mo39007n();
                    if (!x) {
                        mo19276j().mo19282q().mo38858c("Too many unique user properties are set. Ignoring user property", this.f46876l.mo19363D().mo39322f(b9Var.f46186c), b9Var.f46188e);
                        mo39293g0().mo19290A(this.f46864D, zzp2.f46948b, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C9793i iVar9 = this.f46867c;
                    m45454Q(iVar9);
                    iVar9.mo39002f0();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v16, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:199|200) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f21269a.mo19276j().mo19282q().mo38858c("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.C4667d3.m21474z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        mo19276j().mo19282q().mo38858c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C4667d3.m21474z(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04e8, code lost:
        if (r3 != null) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x046e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x012c, all -> 0x050c }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0485 A[Catch:{ all -> 0x012c, all -> 0x050c }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0508 A[SYNTHETIC, Splitter:B:235:0x0508] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x050c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:190:0x03f0=Splitter:B:190:0x03f0, B:55:0x0117=Splitter:B:55:0x0117, B:47:0x0108=Splitter:B:47:0x0108, B:129:0x0268=Splitter:B:129:0x0268, B:58:0x0129=Splitter:B:58:0x0129, B:213:0x04c9=Splitter:B:213:0x04c9, B:139:0x027b=Splitter:B:139:0x027b, B:225:0x04eb=Splitter:B:225:0x04eb} */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39272B() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.f4 r0 = r22.mo19273e()
            r0.mo19272b()
            r22.mo39286b()
            r2 = 1
            r1.f46885u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.h4 r0 = r1.f46876l     // Catch:{ all -> 0x050c }
            r0.mo19275g()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.h4 r0 = r1.f46876l     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.t7 r0 = r0.mo19370L()     // Catch:{ all -> 0x050c }
            java.lang.Boolean r0 = r0.mo39207J()     // Catch:{ all -> 0x050c }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo38856a(r2)     // Catch:{ all -> 0x050c }
            r1.f46885u = r3
        L_0x0030:
            r22.m45447J()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo38856a(r2)     // Catch:{ all -> 0x050c }
            r1.f46885u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f46879o     // Catch:{ all -> 0x050c }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.m45449L()     // Catch:{ all -> 0x050c }
            r1.f46885u = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.f4 r0 = r22.mo19273e()     // Catch:{ all -> 0x050c }
            r0.mo19272b()     // Catch:{ all -> 0x050c }
            java.util.List r0 = r1.f46888x     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo38856a(r2)     // Catch:{ all -> 0x050c }
            r1.f46885u = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.i3 r0 = r1.f46866b     // Catch:{ all -> 0x050c }
            m45454Q(r0)     // Catch:{ all -> 0x050c }
            boolean r0 = r0.mo39017l()     // Catch:{ all -> 0x050c }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo38856a(r2)     // Catch:{ all -> 0x050c }
            r22.m45449L()     // Catch:{ all -> 0x050c }
            r1.f46885u = r3
            goto L_0x0030
        L_0x0091:
            a5.e r0 = r22.mo19274f()     // Catch:{ all -> 0x050c }
            long r4 = r0.currentTimeMillis()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.f r0 = r22.mo39278T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.r2 r8 = com.google.android.gms.measurement.internal.C9903s2.f46667R     // Catch:{ all -> 0x050c }
            r9 = 0
            int r0 = r0.mo19348n(r9, r8)     // Catch:{ all -> 0x050c }
            r22.mo39278T()     // Catch:{ all -> 0x050c }
            long r10 = com.google.android.gms.measurement.internal.C4669f.m21550I()     // Catch:{ all -> 0x050c }
            long r10 = r4 - r10
            r8 = 0
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.m45450M(r9, r10)     // Catch:{ all -> 0x050c }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.v7 r0 = r1.f46873i     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.n3 r0 = r0.f46815j     // Catch:{ all -> 0x050c }
            long r10 = r0.mo39075a()     // Catch:{ all -> 0x050c }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()     // Catch:{ all -> 0x050c }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x050c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x050c }
            r0.mo38857b(r6, r7)     // Catch:{ all -> 0x050c }
        L_0x00dc:
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c     // Catch:{ all -> 0x050c }
            m45454Q(r0)     // Catch:{ all -> 0x050c }
            java.lang.String r6 = r0.mo38996Z()     // Catch:{ all -> 0x050c }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x050c }
            r7 = -1
            if (r0 != 0) goto L_0x0489
            long r10 = r1.f46890z     // Catch:{ all -> 0x050c }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.i r10 = r1.f46867c     // Catch:{ all -> 0x050c }
            m45454Q(r10)     // Catch:{ all -> 0x050c }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo38987P()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x050c }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            com.google.android.gms.measurement.internal.h4 r10 = r10.f21269a     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo19276j()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.b3 r10 = r10.mo19282q()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo38857b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f46890z = r7     // Catch:{ all -> 0x050c }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x0134:
            com.google.android.gms.measurement.internal.f r0 = r22.mo39278T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.r2 r7 = com.google.android.gms.measurement.internal.C9903s2.f46690h     // Catch:{ all -> 0x050c }
            int r0 = r0.mo19348n(r6, r7)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.f r7 = r22.mo39278T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.r2 r8 = com.google.android.gms.measurement.internal.C9903s2.f46692i     // Catch:{ all -> 0x050c }
            int r7 = r7.mo19348n(r6, r8)     // Catch:{ all -> 0x050c }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.i r8 = r1.f46867c     // Catch:{ all -> 0x050c }
            m45454Q(r8)     // Catch:{ all -> 0x050c }
            r8.mo19272b()     // Catch:{ all -> 0x050c }
            r8.mo39090d()     // Catch:{ all -> 0x050c }
            if (r0 <= 0) goto L_0x015b
            r10 = 1
            goto L_0x015c
        L_0x015b:
            r10 = 0
        L_0x015c:
            com.google.android.gms.common.internal.C4604n.m20088a(r10)     // Catch:{ all -> 0x050c }
            if (r7 <= 0) goto L_0x0163
            r10 = 1
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            com.google.android.gms.common.internal.C4604n.m20088a(r10)     // Catch:{ all -> 0x050c }
            com.google.android.gms.common.internal.C4604n.m20094g(r6)     // Catch:{ all -> 0x050c }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo38987P()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x050c }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = 0
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.x8 r2 = r8.f46518b     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.z8 r2 = r2.f46871g     // Catch:{ IOException -> 0x0242 }
            m45454Q(r2)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r9.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            com.google.android.gms.internal.measurement.o4 r2 = com.google.android.gms.internal.measurement.C9296p4.m43369H1()     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.v9 r2 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r2, r0)     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.o4 r2 = (com.google.android.gms.internal.measurement.C9280o4) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo37815h0(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.r8 r0 = r2.mo37840w()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.internal.measurement.p4 r0 = (com.google.android.gms.internal.measurement.C9296p4) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r2 = r8.f21269a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo38858c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo38857b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            com.google.android.gms.measurement.internal.h4 r2 = r8.f21269a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo38858c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x050c }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x0483
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            com.google.android.gms.measurement.internal.h4 r2 = r8.f21269a     // Catch:{ all -> 0x0481 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0481 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)     // Catch:{ all -> 0x0481 }
            r2.mo38858c(r3, r4, r0)     // Catch:{ all -> 0x0481 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0481 }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x050c }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x050c }
            if (r2 != 0) goto L_0x04ff
            u5.b r2 = r1.mo39279U(r6)     // Catch:{ all -> 0x050c }
            u5.a r3 = p256u5.C11026a.AD_STORAGE     // Catch:{ all -> 0x050c }
            boolean r2 = r2.mo43338i(r3)     // Catch:{ all -> 0x050c }
            if (r2 == 0) goto L_0x02fe
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x050c }
        L_0x02ad:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x050c }
            if (r3 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x050c }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x050c }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.p4 r3 = (com.google.android.gms.internal.measurement.C9296p4) r3     // Catch:{ all -> 0x050c }
            java.lang.String r4 = r3.mo37882K()     // Catch:{ all -> 0x050c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x02ad
            java.lang.String r2 = r3.mo37882K()     // Catch:{ all -> 0x050c }
            goto L_0x02cd
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            if (r2 == 0) goto L_0x02fe
            r3 = 0
        L_0x02d0:
            int r4 = r0.size()     // Catch:{ all -> 0x050c }
            if (r3 >= r4) goto L_0x02fe
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x050c }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x050c }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.p4 r4 = (com.google.android.gms.internal.measurement.C9296p4) r4     // Catch:{ all -> 0x050c }
            java.lang.String r5 = r4.mo37882K()     // Catch:{ all -> 0x050c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x02eb
            goto L_0x02fb
        L_0x02eb:
            java.lang.String r4 = r4.mo37882K()     // Catch:{ all -> 0x050c }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x02fb
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x050c }
            goto L_0x02fe
        L_0x02fb:
            int r3 = r3 + 1
            goto L_0x02d0
        L_0x02fe:
            com.google.android.gms.internal.measurement.m4 r2 = com.google.android.gms.internal.measurement.C9265n4.m43236z()     // Catch:{ all -> 0x050c }
            int r3 = r0.size()     // Catch:{ all -> 0x050c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x050c }
            int r5 = r0.size()     // Catch:{ all -> 0x050c }
            r4.<init>(r5)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.f r5 = r22.mo39278T()     // Catch:{ all -> 0x050c }
            boolean r5 = r5.mo19338C(r6)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x0327
            u5.b r5 = r1.mo39279U(r6)     // Catch:{ all -> 0x050c }
            u5.a r7 = p256u5.C11026a.AD_STORAGE     // Catch:{ all -> 0x050c }
            boolean r5 = r5.mo43338i(r7)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x0327
            r5 = 1
            goto L_0x0328
        L_0x0327:
            r5 = 0
        L_0x0328:
            u5.b r7 = r1.mo39279U(r6)     // Catch:{ all -> 0x050c }
            u5.a r8 = p256u5.C11026a.AD_STORAGE     // Catch:{ all -> 0x050c }
            boolean r7 = r7.mo43338i(r8)     // Catch:{ all -> 0x050c }
            u5.b r8 = r1.mo39279U(r6)     // Catch:{ all -> 0x050c }
            u5.a r9 = p256u5.C11026a.ANALYTICS_STORAGE     // Catch:{ all -> 0x050c }
            boolean r8 = r8.mo43338i(r9)     // Catch:{ all -> 0x050c }
            r9 = 0
        L_0x033d:
            if (r9 >= r3) goto L_0x03b3
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x050c }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x050c }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.p4 r10 = (com.google.android.gms.internal.measurement.C9296p4) r10     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.o8 r10 = r10.mo37997q()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.o4 r10 = (com.google.android.gms.internal.measurement.C9280o4) r10     // Catch:{ all -> 0x050c }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x050c }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x050c }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x050c }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x050c }
            r4.add(r11)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.f r11 = r22.mo39278T()     // Catch:{ all -> 0x050c }
            r11.mo19350p()     // Catch:{ all -> 0x050c }
            r11 = 55005(0xd6dd, double:2.7176E-319)
            r10.mo37820m0(r11)     // Catch:{ all -> 0x050c }
            r11 = r20
            r10.mo37819l0(r11)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.h4 r13 = r1.f46876l     // Catch:{ all -> 0x050c }
            r13.mo19275g()     // Catch:{ all -> 0x050c }
            r13 = 0
            r10.mo37816i0(r13)     // Catch:{ all -> 0x050c }
            if (r5 != 0) goto L_0x037c
            r10.mo37778H0()     // Catch:{ all -> 0x050c }
        L_0x037c:
            if (r7 != 0) goto L_0x0384
            r10.mo37790N0()     // Catch:{ all -> 0x050c }
            r10.mo37784K0()     // Catch:{ all -> 0x050c }
        L_0x0384:
            if (r8 != 0) goto L_0x0389
            r10.mo37775F0()     // Catch:{ all -> 0x050c }
        L_0x0389:
            com.google.android.gms.measurement.internal.f r13 = r22.mo39278T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.r2 r14 = com.google.android.gms.measurement.internal.C9903s2.f46671V     // Catch:{ all -> 0x050c }
            boolean r13 = r13.mo19337B(r6, r14)     // Catch:{ all -> 0x050c }
            if (r13 == 0) goto L_0x03ab
            com.google.android.gms.internal.measurement.r8 r13 = r10.mo37840w()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.p4 r13 = (com.google.android.gms.internal.measurement.C9296p4) r13     // Catch:{ all -> 0x050c }
            byte[] r13 = r13.mo37404l()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.z8 r14 = r1.f46871g     // Catch:{ all -> 0x050c }
            m45454Q(r14)     // Catch:{ all -> 0x050c }
            long r13 = r14.mo39351x(r13)     // Catch:{ all -> 0x050c }
            r10.mo37785L(r13)     // Catch:{ all -> 0x050c }
        L_0x03ab:
            r2.mo37726B(r10)     // Catch:{ all -> 0x050c }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x033d
        L_0x03b3:
            r11 = r20
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.mo19278C()     // Catch:{ all -> 0x050c }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x03d4
            com.google.android.gms.measurement.internal.z8 r0 = r1.f46871g     // Catch:{ all -> 0x050c }
            m45454Q(r0)     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.r8 r5 = r2.mo37840w()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C9265n4) r5     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.mo39342D(r5)     // Catch:{ all -> 0x050c }
            goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            com.google.android.gms.measurement.internal.z8 r5 = r1.f46871g     // Catch:{ all -> 0x050c }
            m45454Q(r5)     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.r8 r5 = r2.mo37840w()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C9265n4) r5     // Catch:{ all -> 0x050c }
            byte[] r14 = r5.mo37404l()     // Catch:{ all -> 0x050c }
            r22.mo39278T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46710r     // Catch:{ all -> 0x050c }
            r9 = 0
            java.lang.Object r5 = r5.mo39174a(r9)     // Catch:{ all -> 0x050c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x050c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x046e }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x046e }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x046e }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.C4604n.m20088a(r7)     // Catch:{ MalformedURLException -> 0x046e }
            java.util.List r7 = r1.f46888x     // Catch:{ MalformedURLException -> 0x046e }
            if (r7 == 0) goto L_0x0410
            com.google.android.gms.measurement.internal.d3 r4 = r22.mo19276j()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19282q()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo38856a(r7)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x0417
        L_0x0410:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x046e }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x046e }
            r1.f46888x = r7     // Catch:{ MalformedURLException -> 0x046e }
        L_0x0417:
            com.google.android.gms.measurement.internal.v7 r4 = r1.f46873i     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.n3 r4 = r4.f46816k     // Catch:{ MalformedURLException -> 0x046e }
            r4.mo39076b(r11)     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x042b
            r3 = 0
            com.google.android.gms.internal.measurement.p4 r2 = r2.mo37727C(r3)     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r4 = r2.mo37885L1()     // Catch:{ MalformedURLException -> 0x046e }
        L_0x042b:
            com.google.android.gms.measurement.internal.d3 r2 = r22.mo19276j()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19286v()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x046e }
            r2.mo38859d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x046e }
            r2 = 1
            r1.f46884t = r2     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.i3 r11 = r1.f46866b     // Catch:{ MalformedURLException -> 0x046e }
            m45454Q(r11)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.r8 r0 = new com.google.android.gms.measurement.internal.r8     // Catch:{ MalformedURLException -> 0x046e }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x046e }
            r11.mo19272b()     // Catch:{ MalformedURLException -> 0x046e }
            r11.mo39090d()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.common.internal.C4604n.m20098k(r13)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.common.internal.C4604n.m20098k(r14)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.common.internal.C4604n.m20098k(r0)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.f4 r2 = r2.mo19273e()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.h3 r3 = new com.google.android.gms.measurement.internal.h3     // Catch:{ MalformedURLException -> 0x046e }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x046e }
            r2.mo38908y(r3)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x04ff
        L_0x046e:
            com.google.android.gms.measurement.internal.d3 r0 = r22.mo19276j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)     // Catch:{ all -> 0x050c }
            r0.mo38858c(r2, r3, r5)     // Catch:{ all -> 0x050c }
            goto L_0x04ff
        L_0x0481:
            r0 = move-exception
            r9 = r11
        L_0x0483:
            if (r9 == 0) goto L_0x0488
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x0488:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x0489:
            r11 = r4
            r1.f46890z = r7     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x050c }
            m45454Q(r2)     // Catch:{ all -> 0x050c }
            r22.mo39278T()     // Catch:{ all -> 0x050c }
            long r3 = com.google.android.gms.measurement.internal.C4669f.m21550I()     // Catch:{ all -> 0x050c }
            long r3 = r11 - r3
            r2.mo19272b()     // Catch:{ all -> 0x050c }
            r2.mo39090d()     // Catch:{ all -> 0x050c }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo38987P()     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            r4 = 0
            r5[r4] = r3     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r3, r5)     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04d3 }
            if (r0 != 0) goto L_0x04cd
            com.google.android.gms.measurement.internal.h4 r0 = r2.f21269a     // Catch:{ SQLiteException -> 0x04d3 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x04d3 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()     // Catch:{ SQLiteException -> 0x04d3 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo38856a(r4)     // Catch:{ SQLiteException -> 0x04d3 }
        L_0x04c9:
            r3.close()     // Catch:{ all -> 0x050c }
            goto L_0x04eb
        L_0x04cd:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04d3 }
            goto L_0x04c9
        L_0x04d3:
            r0 = move-exception
            goto L_0x04d9
        L_0x04d5:
            r0 = move-exception
            goto L_0x0506
        L_0x04d7:
            r0 = move-exception
            r3 = r9
        L_0x04d9:
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0504 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0504 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0504 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo38857b(r4, r0)     // Catch:{ all -> 0x0504 }
            if (r3 == 0) goto L_0x04eb
            goto L_0x04c9
        L_0x04eb:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x050c }
            if (r0 != 0) goto L_0x04ff
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c     // Catch:{ all -> 0x050c }
            m45454Q(r0)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.q4 r0 = r0.mo38989R(r9)     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x04ff
            r1.mo39288c(r0)     // Catch:{ all -> 0x050c }
        L_0x04ff:
            r2 = 0
            r1.f46885u = r2
            goto L_0x0030
        L_0x0504:
            r0 = move-exception
            r9 = r3
        L_0x0506:
            if (r9 == 0) goto L_0x050b
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x050b:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x050c:
            r0 = move-exception
            r2 = 0
            r1.f46885u = r2
            r22.m45447J()
            goto L_0x0515
        L_0x0514:
            throw r0
        L_0x0515:
            goto L_0x0514
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9958x8.mo39272B():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0751, code lost:
        if (r14.size() == 0) goto L_0x0753;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f4 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x033e A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0341 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03a5 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0535 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0574 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05ed A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x063a A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0647 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0654 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0662 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0673 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06b4 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x06cf A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0756 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0777 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x07e4 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07f1 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x080a A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x08a3 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08c2 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0954 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x09ff A[Catch:{ SQLiteException -> 0x0a1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0a15  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0960 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192 A[SYNTHETIC, Splitter:B:51:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0210 A[Catch:{ NumberFormatException -> 0x073b, all -> 0x0a96 }] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39273C(com.google.android.gms.measurement.internal.zzau r35, com.google.android.gms.measurement.internal.zzp r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.C4604n.m20098k(r36)
            java.lang.String r8 = r3.f46948b
            com.google.android.gms.common.internal.C4604n.m20094g(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.f4 r10 = r34.mo19273e()
            r10.mo19272b()
            r34.mo39286b()
            java.lang.String r10 = r3.f46948b
            com.google.android.gms.measurement.internal.z8 r11 = r1.f46871g
            m45454Q(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C9978z8.m45540l(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f46955i
            if (r11 == 0) goto L_0x0aa1
            com.google.android.gms.measurement.internal.b4 r11 = r1.f46865a
            m45454Q(r11)
            java.lang.String r12 = r2.f46937b
            boolean r11 = r11.mo38871x(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.d3 r3 = r34.mo19276j()
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19287w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)
            com.google.android.gms.measurement.internal.h4 r5 = r1.f46876l
            com.google.android.gms.measurement.internal.y2 r5 = r5.mo19363D()
            java.lang.String r6 = r2.f46937b
            java.lang.String r5 = r5.mo39320d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo38858c(r6, r4, r5)
            com.google.android.gms.measurement.internal.b4 r3 = r1.f46865a
            m45454Q(r3)
            boolean r3 = r3.mo38869v(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.b4 r3 = r1.f46865a
            m45454Q(r3)
            boolean r3 = r3.mo38872y(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f46937b
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.d9 r11 = r34.mo39293g0()
            com.google.android.gms.measurement.internal.c9 r12 = r1.f46864D
            r14 = 11
            java.lang.String r2 = r2.f46937b
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo19290A(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            com.google.android.gms.measurement.internal.q4 r2 = r2.mo38989R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo39127U()
            long r5 = r2.mo39118L()
            long r3 = java.lang.Math.max(r3, r5)
            a5.e r5 = r34.mo19274f()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo39278T()
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46650A
            java.lang.Object r5 = r5.mo39174a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.d3 r3 = r34.mo19276j()
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19281p()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo38856a(r4)
            r1.mo39288c(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.e3 r2 = com.google.android.gms.measurement.internal.C9755e3.m45043b(r35)
            com.google.android.gms.measurement.internal.d9 r11 = r34.mo39293g0()
            com.google.android.gms.measurement.internal.f r12 = r34.mo39278T()
            int r12 = r12.mo19347m(r10)
            r11.mo19335z(r2, r12)
            com.google.android.gms.measurement.internal.zzau r2 = r2.mo38893a()
            com.google.android.gms.measurement.internal.d3 r11 = r34.mo19276j()
            java.lang.String r11 = r11.mo19278C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d3 r11 = r34.mo19276j()
            com.google.android.gms.measurement.internal.b3 r11 = r11.mo19286v()
            com.google.android.gms.measurement.internal.h4 r12 = r1.f46876l
            com.google.android.gms.measurement.internal.y2 r12 = r12.mo19363D()
            java.lang.String r12 = r12.mo39319c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo38857b(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c
            m45454Q(r11)
            r11.mo39001e0()
            r1.mo39276R(r3)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.internal.measurement.C9287ob.m43342b()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r11 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r12 = com.google.android.gms.measurement.internal.C9903s2.f46707p0     // Catch:{ all -> 0x0a96 }
            boolean r11 = r11.mo19337B(r14, r12)     // Catch:{ all -> 0x0a96 }
            if (r11 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.f r11 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r12 = com.google.android.gms.measurement.internal.C9903s2.f46709q0     // Catch:{ all -> 0x0a96 }
            boolean r11 = r11.mo19337B(r14, r12)     // Catch:{ all -> 0x0a96 }
            if (r11 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r11)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = "_lair"
            r11.mo39005l(r12, r13)     // Catch:{ all -> 0x0a96 }
        L_0x014e:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x0171
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a96 }
            if (r9 != 0) goto L_0x0171
            java.lang.String r9 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a96 }
            if (r9 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r9 = 0
            goto L_0x0172
        L_0x0171:
            r9 = 1
        L_0x0172:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0a96 }
            if (r11 != 0) goto L_0x0186
            if (r9 == 0) goto L_0x0180
            r9 = 1
            goto L_0x0186
        L_0x0180:
            r33 = r4
            r8 = r15
        L_0x0183:
            r4 = 2
            goto L_0x032b
        L_0x0186:
            com.google.android.gms.measurement.internal.zzas r11 = r2.f46938c     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo39359H0(r13)     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.zzas r9 = r2.f46938c     // Catch:{ all -> 0x0a96 }
            java.lang.Double r9 = r9.mo39356E0(r13)     // Catch:{ all -> 0x0a96 }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0a96 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x01bc
            com.google.android.gms.measurement.internal.zzas r9 = r2.f46938c     // Catch:{ all -> 0x0a96 }
            java.lang.Long r9 = r9.mo39357F0(r13)     // Catch:{ all -> 0x0a96 }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0a96 }
            double r13 = (double) r14
            java.lang.Double.isNaN(r13)
            double r17 = r13 * r19
            goto L_0x01be
        L_0x01bc:
            r21 = r15
        L_0x01be:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01d8
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01d8
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a96 }
            if (r9 == 0) goto L_0x020a
            long r13 = -r13
            goto L_0x020a
        L_0x01d8:
            com.google.android.gms.measurement.internal.d3 r2 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0a96 }
            r2.mo38858c(r3, r4, r5)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            r2.mo39007n()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            return
        L_0x01fe:
            r21 = r15
            com.google.android.gms.measurement.internal.zzas r9 = r2.f46938c     // Catch:{ all -> 0x0a96 }
            java.lang.Long r9 = r9.mo39357F0(r13)     // Catch:{ all -> 0x0a96 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a96 }
        L_0x020a:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a96 }
            if (r9 != 0) goto L_0x0325
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a96 }
            if (r11 == 0) goto L_0x0325
            java.lang.String r11 = "_ltv_"
            int r12 = r9.length()     // Catch:{ all -> 0x0a96 }
            if (r12 == 0) goto L_0x022b
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0a96 }
            goto L_0x0230
        L_0x022b:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0a96 }
            r9.<init>(r11)     // Catch:{ all -> 0x0a96 }
        L_0x0230:
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r11)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b9 r11 = r11.mo38994X(r10, r9)     // Catch:{ all -> 0x0a96 }
            if (r11 == 0) goto L_0x0270
            java.lang.Object r11 = r11.f46188e     // Catch:{ all -> 0x0a96 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a96 }
            if (r12 != 0) goto L_0x0242
            goto L_0x0270
        L_0x0242:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0a96 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b9 r18 = new com.google.android.gms.measurement.internal.b9     // Catch:{ all -> 0x0a96 }
            java.lang.String r15 = r2.f46939d     // Catch:{ all -> 0x0a96 }
            a5.e r17 = r34.mo19274f()     // Catch:{ all -> 0x0a96 }
            long r19 = r17.currentTimeMillis()     // Catch:{ all -> 0x0a96 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a96 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = 0
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a96 }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02e9
        L_0x0270:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r11)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r12 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r8 = com.google.android.gms.measurement.internal.C9903s2.f46655F     // Catch:{ all -> 0x0a96 }
            int r8 = r12.mo19348n(r10, r8)     // Catch:{ all -> 0x0a96 }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.C4604n.m20094g(r10)     // Catch:{ all -> 0x0a96 }
            r11.mo19272b()     // Catch:{ all -> 0x0a96 }
            r11.mo39090d()     // Catch:{ all -> 0x0a96 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo38987P()     // Catch:{ SQLiteException -> 0x02b3 }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02af }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02af }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02af }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02af }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x02ad }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x02ad }
            goto L_0x02cd
        L_0x02ad:
            r0 = move-exception
            goto L_0x02b9
        L_0x02af:
            r0 = move-exception
            r33 = r4
            goto L_0x02b8
        L_0x02b3:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x02b8:
            r4 = 2
        L_0x02b9:
            r8 = r0
            com.google.android.gms.measurement.internal.h4 r11 = r11.f21269a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r11 = r11.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            r11.mo38858c(r12, r15, r8)     // Catch:{ all -> 0x0a96 }
        L_0x02cd:
            com.google.android.gms.measurement.internal.b9 r18 = new com.google.android.gms.measurement.internal.b9     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r2.f46939d     // Catch:{ all -> 0x0a96 }
            a5.e r11 = r34.mo19274f()     // Catch:{ all -> 0x0a96 }
            long r15 = r11.currentTimeMillis()     // Catch:{ all -> 0x0a96 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a96 }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a96 }
            r9 = r18
        L_0x02e9:
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r11)     // Catch:{ all -> 0x0a96 }
            boolean r11 = r11.mo39016x(r9)     // Catch:{ all -> 0x0a96 }
            if (r11 != 0) goto L_0x032b
            com.google.android.gms.measurement.internal.d3 r11 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r11 = r11.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r14 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.y2 r14 = r14.mo19363D()     // Catch:{ all -> 0x0a96 }
            java.lang.String r15 = r9.f46186c     // Catch:{ all -> 0x0a96 }
            java.lang.String r14 = r14.mo39322f(r15)     // Catch:{ all -> 0x0a96 }
            java.lang.Object r9 = r9.f46188e     // Catch:{ all -> 0x0a96 }
            r11.mo38859d(r12, r13, r14, r9)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d9 r11 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.c9 r12 = r1.f46864D     // Catch:{ all -> 0x0a96 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo19290A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a96 }
            goto L_0x032b
        L_0x0325:
            r33 = r4
            r8 = r21
            goto L_0x0183
        L_0x032b:
            java.lang.String r9 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r9 = com.google.android.gms.measurement.internal.C4668d9.m21488W(r9)     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a96 }
            r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.zzas r11 = r2.f46938c     // Catch:{ all -> 0x0a96 }
            if (r11 != 0) goto L_0x0341
            r16 = 0
            goto L_0x0361
        L_0x0341:
            com.google.android.gms.measurement.internal.p r12 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0a96 }
            r12.<init>(r11)     // Catch:{ all -> 0x0a96 }
            r16 = 0
        L_0x0348:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0a96 }
            if (r13 == 0) goto L_0x0361
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0a96 }
            java.lang.Object r13 = r11.mo39358G0(r13)     // Catch:{ all -> 0x0a96 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0a96 }
            if (r14 == 0) goto L_0x0348
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0a96 }
            int r13 = r13.length     // Catch:{ all -> 0x0a96 }
            long r13 = (long) r13     // Catch:{ all -> 0x0a96 }
            long r16 = r16 + r13
            goto L_0x0348
        L_0x0361:
            r22 = 1
            long r16 = r16 + r22
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r11)     // Catch:{ all -> 0x0a96 }
            long r12 = r34.mo39275F()     // Catch:{ all -> 0x0a96 }
            r20 = 1
            r21 = 0
            r24 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r15 = r16
            r17 = r20
            r18 = r9
            r19 = r21
            r20 = r8
            r21 = r24
            com.google.android.gms.measurement.internal.g r11 = r11.mo38992U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0a96 }
            long r12 = r11.f46277b     // Catch:{ all -> 0x0a96 }
            r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r14 = com.google.android.gms.measurement.internal.C9903s2.f46698l     // Catch:{ all -> 0x0a96 }
            r15 = 0
            java.lang.Object r14 = r14.mo39174a(r15)     // Catch:{ all -> 0x0a96 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a96 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a96 }
            long r4 = (long) r14     // Catch:{ all -> 0x0a96 }
            long r12 = r12 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x03d2
            long r12 = r12 % r4
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03c1
            com.google.android.gms.measurement.internal.d3 r2 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            long r5 = r11.f46277b     // Catch:{ all -> 0x0a96 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a96 }
            r2.mo38858c(r3, r4, r5)     // Catch:{ all -> 0x0a96 }
        L_0x03c1:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            r2.mo39007n()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            return
        L_0x03d2:
            if (r9 == 0) goto L_0x0430
            long r12 = r11.f46276a     // Catch:{ all -> 0x0a96 }
            r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r14 = com.google.android.gms.measurement.internal.C9903s2.f46702n     // Catch:{ all -> 0x0a96 }
            java.lang.Object r14 = r14.mo39174a(r15)     // Catch:{ all -> 0x0a96 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a96 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a96 }
            long r4 = (long) r14     // Catch:{ all -> 0x0a96 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0430
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r4
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x040b
            com.google.android.gms.measurement.internal.d3 r3 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            long r6 = r11.f46276a     // Catch:{ all -> 0x0a96 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a96 }
            r3.mo38858c(r4, r5, r6)     // Catch:{ all -> 0x0a96 }
        L_0x040b:
            com.google.android.gms.measurement.internal.d9 r11 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.c9 r12 = r1.f46864D     // Catch:{ all -> 0x0a96 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo19290A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            r2.mo39007n()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            return
        L_0x0430:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0480
            long r12 = r11.f46279d     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r5 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r14 = com.google.android.gms.measurement.internal.C9903s2.f46700m     // Catch:{ all -> 0x0a96 }
            int r5 = r5.mo19348n(r8, r14)     // Catch:{ all -> 0x0a96 }
            int r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0a96 }
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0a96 }
            long r4 = (long) r5     // Catch:{ all -> 0x0a96 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0480
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x046f
            com.google.android.gms.measurement.internal.d3 r2 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            long r5 = r11.f46279d     // Catch:{ all -> 0x0a96 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a96 }
            r2.mo38858c(r3, r4, r5)     // Catch:{ all -> 0x0a96 }
        L_0x046f:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            r2.mo39007n()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            return
        L_0x0480:
            com.google.android.gms.measurement.internal.zzas r4 = r2.f46938c     // Catch:{ all -> 0x0a96 }
            android.os.Bundle r4 = r4.mo39355D0()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d9 r5 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f46939d     // Catch:{ all -> 0x0a96 }
            r5.mo19291B(r4, r11, r12)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d9 r5 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            boolean r5 = r5.mo19308S(r10)     // Catch:{ all -> 0x0a96 }
            java.lang.String r14 = "_r"
            if (r5 == 0) goto L_0x04b1
            com.google.android.gms.measurement.internal.d9 r5 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = "_dbg"
            r5.mo19291B(r4, r12, r11)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d9 r5 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            r5.mo19291B(r4, r14, r11)     // Catch:{ all -> 0x0a96 }
        L_0x04b1:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0a96 }
            if (r5 == 0) goto L_0x04d7
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r5)     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b9 r5 = r5.mo38994X(r11, r7)     // Catch:{ all -> 0x0a96 }
            if (r5 == 0) goto L_0x04d7
            java.lang.Object r11 = r5.f46188e     // Catch:{ all -> 0x0a96 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a96 }
            if (r11 == 0) goto L_0x04d7
            com.google.android.gms.measurement.internal.d9 r11 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            java.lang.Object r5 = r5.f46188e     // Catch:{ all -> 0x0a96 }
            r11.mo19291B(r4, r7, r5)     // Catch:{ all -> 0x0a96 }
        L_0x04d7:
            com.google.android.gms.measurement.internal.i r5 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r5)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20094g(r10)     // Catch:{ all -> 0x0a96 }
            r5.mo19272b()     // Catch:{ all -> 0x0a96 }
            r5.mo39090d()     // Catch:{ all -> 0x0a96 }
            android.database.sqlite.SQLiteDatabase r7 = r5.mo38987P()     // Catch:{ SQLiteException -> 0x0517 }
            com.google.android.gms.measurement.internal.h4 r11 = r5.f21269a     // Catch:{ SQLiteException -> 0x0517 }
            com.google.android.gms.measurement.internal.f r11 = r11.mo19392z()     // Catch:{ SQLiteException -> 0x0517 }
            com.google.android.gms.measurement.internal.r2 r12 = com.google.android.gms.measurement.internal.C9903s2.f46708q     // Catch:{ SQLiteException -> 0x0517 }
            int r11 = r11.mo19348n(r10, r12)     // Catch:{ SQLiteException -> 0x0517 }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ SQLiteException -> 0x0517 }
            r13 = 0
            int r8 = java.lang.Math.max(r13, r8)     // Catch:{ SQLiteException -> 0x0515 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0515 }
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0515 }
            r11[r13] = r10     // Catch:{ SQLiteException -> 0x0515 }
            r12 = 1
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x0515 }
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r8, r11)     // Catch:{ SQLiteException -> 0x0515 }
            long r7 = (long) r5
            goto L_0x052f
        L_0x0515:
            r0 = move-exception
            goto L_0x0519
        L_0x0517:
            r0 = move-exception
            r13 = 0
        L_0x0519:
            r7 = r0
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            r5.mo38858c(r8, r11, r7)     // Catch:{ all -> 0x0a96 }
            r7 = 0
        L_0x052f:
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x054a
            com.google.android.gms.measurement.internal.d3 r5 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19287w()     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a96 }
            r5.mo38858c(r11, r12, r7)     // Catch:{ all -> 0x0a96 }
        L_0x054a:
            com.google.android.gms.measurement.internal.n r5 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r12 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = r2.f46939d     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r2.f46937b     // Catch:{ all -> 0x0a96 }
            long r2 = r2.f46940e     // Catch:{ all -> 0x0a96 }
            r18 = 0
            r11 = r5
            r31 = 0
            r13 = r7
            r7 = r14
            r14 = r10
            r32 = r6
            r6 = r15
            r15 = r8
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C4670h4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = r5.f46485b     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.o r2 = r2.mo38993V(r10, r3)     // Catch:{ all -> 0x0a96 }
            if (r2 != 0) goto L_0x05ed
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            long r2 = r2.mo38986O(r10)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r4 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            int r4 = r4.mo19345k(r10)     // Catch:{ all -> 0x0a96 }
            long r11 = (long) r4     // Catch:{ all -> 0x0a96 }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x05cf
            if (r9 == 0) goto L_0x05cf
            com.google.android.gms.measurement.internal.d3 r2 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r10)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r6 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.y2 r6 = r6.mo19363D()     // Catch:{ all -> 0x0a96 }
            java.lang.String r5 = r5.f46485b     // Catch:{ all -> 0x0a96 }
            java.lang.String r5 = r6.mo39320d(r5)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r6 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            int r6 = r6.mo19345k(r10)     // Catch:{ all -> 0x0a96 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a96 }
            r2.mo38859d(r3, r4, r5, r6)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d9 r11 = r34.mo39293g0()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.c9 r12 = r1.f46864D     // Catch:{ all -> 0x0a96 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo19290A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            return
        L_0x05cf:
            com.google.android.gms.measurement.internal.o r2 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = r5.f46485b     // Catch:{ all -> 0x0a96 }
            long r3 = r5.f46487d     // Catch:{ all -> 0x0a96 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0a96 }
            goto L_0x05fb
        L_0x05ed:
            com.google.android.gms.measurement.internal.h4 r3 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            long r8 = r2.f46530f     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.n r5 = r5.mo39073a(r3, r8)     // Catch:{ all -> 0x0a96 }
            long r3 = r5.f46487d     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.o r2 = r2.mo39083c(r3)     // Catch:{ all -> 0x0a96 }
        L_0x05fb:
            com.google.android.gms.measurement.internal.i r3 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r3)     // Catch:{ all -> 0x0a96 }
            r3.mo39009p(r2)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f4 r2 = r34.mo19273e()     // Catch:{ all -> 0x0a96 }
            r2.mo19272b()     // Catch:{ all -> 0x0a96 }
            r34.mo39286b()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20098k(r5)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20098k(r36)     // Catch:{ all -> 0x0a96 }
            java.lang.String r2 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20094g(r2)     // Catch:{ all -> 0x0a96 }
            java.lang.String r2 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            r3 = r36
            java.lang.String r4 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20088a(r2)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.internal.measurement.o4 r2 = com.google.android.gms.internal.measurement.C9296p4.m43369H1()     // Catch:{ all -> 0x0a96 }
            r4 = 1
            r2.mo37812e0(r4)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = "android"
            r2.mo37808a0(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x063f
            java.lang.String r8 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            r2.mo37769B(r8)     // Catch:{ all -> 0x0a96 }
        L_0x063f:
            java.lang.String r8 = r3.f46951e     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x064c
            java.lang.String r8 = r3.f46951e     // Catch:{ all -> 0x0a96 }
            r2.mo37777H(r8)     // Catch:{ all -> 0x0a96 }
        L_0x064c:
            java.lang.String r8 = r3.f46950d     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x0659
            java.lang.String r8 = r3.f46950d     // Catch:{ all -> 0x0a96 }
            r2.mo37779I(r8)     // Catch:{ all -> 0x0a96 }
        L_0x0659:
            long r8 = r3.f46957k     // Catch:{ all -> 0x0a96 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0666
            int r9 = (int) r8     // Catch:{ all -> 0x0a96 }
            r2.mo37781J(r9)     // Catch:{ all -> 0x0a96 }
        L_0x0666:
            long r8 = r3.f46952f     // Catch:{ all -> 0x0a96 }
            r2.mo37804W(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r3.f46949c     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x0678
            java.lang.String r8 = r3.f46949c     // Catch:{ all -> 0x0a96 }
            r2.mo37803V(r8)     // Catch:{ all -> 0x0a96 }
        L_0x0678:
            java.lang.String r8 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C4604n.m20098k(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a96 }
            u5.b r8 = r1.mo39279U(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r3.f46969w     // Catch:{ all -> 0x0a96 }
            u5.b r9 = p256u5.C11027b.m49402b(r9)     // Catch:{ all -> 0x0a96 }
            u5.b r8 = r8.mo43331c(r9)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r8.mo43336h()     // Catch:{ all -> 0x0a96 }
            r2.mo37789N(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r2.mo37825r0()     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 == 0) goto L_0x06ac
            java.lang.String r8 = r3.f46964r     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x06ac
            java.lang.String r8 = r3.f46964r     // Catch:{ all -> 0x0a96 }
            r2.mo37798R0(r8)     // Catch:{ all -> 0x0a96 }
        L_0x06ac:
            long r8 = r3.f46953g     // Catch:{ all -> 0x0a96 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06b7
            r2.mo37791O(r8)     // Catch:{ all -> 0x0a96 }
        L_0x06b7:
            long r8 = r3.f46966t     // Catch:{ all -> 0x0a96 }
            r2.mo37797R(r8)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.z8 r8 = r1.f46871g     // Catch:{ all -> 0x0a96 }
            m45454Q(r8)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.x8 r9 = r8.f46518b     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r9 = r9.f46876l     // Catch:{ all -> 0x0a96 }
            android.content.Context r9 = r9.mo19277r()     // Catch:{ all -> 0x0a96 }
            java.util.Map r9 = com.google.android.gms.measurement.internal.C9903s2.m45337c(r9)     // Catch:{ all -> 0x0a96 }
            if (r9 == 0) goto L_0x0753
            int r10 = r9.size()     // Catch:{ all -> 0x0a96 }
            if (r10 != 0) goto L_0x06d7
            goto L_0x0753
        L_0x06d7:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0a96 }
            r14.<init>()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r10 = com.google.android.gms.measurement.internal.C9903s2.f46666Q     // Catch:{ all -> 0x0a96 }
            java.lang.Object r10 = r10.mo39174a(r6)     // Catch:{ all -> 0x0a96 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0a96 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0a96 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0a96 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a96 }
        L_0x06f0:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a96 }
            if (r11 == 0) goto L_0x074d
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0a96 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0a96 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0a96 }
            if (r12 == 0) goto L_0x06f0
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x073b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x073b }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x073b }
            if (r11 == 0) goto L_0x06f0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x073b }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x073b }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x073b }
            if (r11 < r10) goto L_0x06f0
            com.google.android.gms.measurement.internal.h4 r11 = r8.f21269a     // Catch:{ NumberFormatException -> 0x073b }
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo19276j()     // Catch:{ NumberFormatException -> 0x073b }
            com.google.android.gms.measurement.internal.b3 r11 = r11.mo19287w()     // Catch:{ NumberFormatException -> 0x073b }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x073b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x073b }
            r11.mo38857b(r12, r13)     // Catch:{ NumberFormatException -> 0x073b }
            goto L_0x074d
        L_0x073b:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.h4 r12 = r8.f21269a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r12 = r12.mo19287w()     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo38857b(r13, r11)     // Catch:{ all -> 0x0a96 }
            goto L_0x06f0
        L_0x074d:
            int r8 = r14.size()     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x0754
        L_0x0753:
            r14 = r6
        L_0x0754:
            if (r14 == 0) goto L_0x0759
            r2.mo37768A0(r14)     // Catch:{ all -> 0x0a96 }
        L_0x0759:
            java.lang.String r8 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C4604n.m20098k(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a96 }
            u5.b r8 = r1.mo39279U(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r3.f46969w     // Catch:{ all -> 0x0a96 }
            u5.b r9 = p256u5.C11027b.m49402b(r9)     // Catch:{ all -> 0x0a96 }
            u5.b r8 = r8.mo43331c(r9)     // Catch:{ all -> 0x0a96 }
            u5.a r9 = p256u5.C11026a.AD_STORAGE     // Catch:{ all -> 0x0a96 }
            boolean r10 = r8.mo43338i(r9)     // Catch:{ all -> 0x0a96 }
            if (r10 == 0) goto L_0x07a1
            com.google.android.gms.measurement.internal.v7 r10 = r1.f46873i     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            android.util.Pair r10 = r10.mo39247m(r11, r8)     // Catch:{ all -> 0x0a96 }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a96 }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0a96 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a96 }
            if (r11 != 0) goto L_0x07a1
            boolean r11 = r3.f46962p     // Catch:{ all -> 0x0a96 }
            if (r11 == 0) goto L_0x07a1
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a96 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0a96 }
            r2.mo37814g0(r11)     // Catch:{ all -> 0x0a96 }
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0a96 }
            if (r10 == 0) goto L_0x07a1
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0a96 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0a96 }
            r2.mo37806Y(r10)     // Catch:{ all -> 0x0a96 }
        L_0x07a1:
            com.google.android.gms.measurement.internal.h4 r10 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.m r10 = r10.mo19360A()     // Catch:{ all -> 0x0a96 }
            r10.mo38880i()     // Catch:{ all -> 0x0a96 }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0a96 }
            r2.mo37793P(r10)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r10 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.m r10 = r10.mo19360A()     // Catch:{ all -> 0x0a96 }
            r10.mo38880i()     // Catch:{ all -> 0x0a96 }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a96 }
            r2.mo37807Z(r10)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r10 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.m r10 = r10.mo19360A()     // Catch:{ all -> 0x0a96 }
            long r10 = r10.mo39058o()     // Catch:{ all -> 0x0a96 }
            int r11 = (int) r10     // Catch:{ all -> 0x0a96 }
            r2.mo37818k0(r11)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r10 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.m r10 = r10.mo19360A()     // Catch:{ all -> 0x0a96 }
            java.lang.String r10 = r10.mo39059p()     // Catch:{ all -> 0x0a96 }
            r2.mo37822o0(r10)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r10 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r11 = com.google.android.gms.measurement.internal.C9903s2.f46695j0     // Catch:{ all -> 0x0a96 }
            boolean r10 = r10.mo19337B(r6, r11)     // Catch:{ all -> 0x0a96 }
            if (r10 != 0) goto L_0x07e9
            long r12 = r3.f46959m     // Catch:{ all -> 0x0a96 }
            r2.mo37800S0(r12)     // Catch:{ all -> 0x0a96 }
        L_0x07e9:
            com.google.android.gms.measurement.internal.h4 r10 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            boolean r10 = r10.mo19385n()     // Catch:{ all -> 0x0a96 }
            if (r10 == 0) goto L_0x07fd
            r2.mo37824q0()     // Catch:{ all -> 0x0a96 }
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a96 }
            if (r10 != 0) goto L_0x07fd
            r2.mo37795Q(r6)     // Catch:{ all -> 0x0a96 }
        L_0x07fd:
            com.google.android.gms.measurement.internal.i r10 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r10)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.q4 r10 = r10.mo38989R(r12)     // Catch:{ all -> 0x0a96 }
            if (r10 != 0) goto L_0x087a
            com.google.android.gms.measurement.internal.q4 r10 = new com.google.android.gms.measurement.internal.q4     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.h4 r12 = r1.f46876l     // Catch:{ all -> 0x0a96 }
            java.lang.String r13 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            r10.<init>(r12, r13)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = r1.mo39295h0(r8)     // Catch:{ all -> 0x0a96 }
            r10.mo39147h(r12)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = r3.f46958l     // Catch:{ all -> 0x0a96 }
            r10.mo39163v(r12)     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = r3.f46949c     // Catch:{ all -> 0x0a96 }
            r10.mo39164w(r12)     // Catch:{ all -> 0x0a96 }
            boolean r9 = r8.mo43338i(r9)     // Catch:{ all -> 0x0a96 }
            if (r9 == 0) goto L_0x0835
            com.google.android.gms.measurement.internal.v7 r9 = r1.f46873i     // Catch:{ all -> 0x0a96 }
            java.lang.String r12 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r9.mo39248n(r12)     // Catch:{ all -> 0x0a96 }
            r10.mo39112F(r9)     // Catch:{ all -> 0x0a96 }
        L_0x0835:
            r12 = 0
            r10.mo39108B(r12)     // Catch:{ all -> 0x0a96 }
            r10.mo39109C(r12)     // Catch:{ all -> 0x0a96 }
            r10.mo39167z(r12)     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r3.f46950d     // Catch:{ all -> 0x0a96 }
            r10.mo39151j(r9)     // Catch:{ all -> 0x0a96 }
            long r12 = r3.f46957k     // Catch:{ all -> 0x0a96 }
            r10.mo39152k(r12)     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r3.f46951e     // Catch:{ all -> 0x0a96 }
            r10.mo39149i(r9)     // Catch:{ all -> 0x0a96 }
            long r12 = r3.f46952f     // Catch:{ all -> 0x0a96 }
            r10.mo39165x(r12)     // Catch:{ all -> 0x0a96 }
            long r12 = r3.f46953g     // Catch:{ all -> 0x0a96 }
            r10.mo39160s(r12)     // Catch:{ all -> 0x0a96 }
            boolean r9 = r3.f46955i     // Catch:{ all -> 0x0a96 }
            r10.mo39110D(r9)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r9 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            boolean r9 = r9.mo19337B(r6, r11)     // Catch:{ all -> 0x0a96 }
            if (r9 != 0) goto L_0x086d
            long r11 = r3.f46959m     // Catch:{ all -> 0x0a96 }
            r10.mo39145g(r11)     // Catch:{ all -> 0x0a96 }
        L_0x086d:
            long r11 = r3.f46966t     // Catch:{ all -> 0x0a96 }
            r10.mo39161t(r11)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r9 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r9)     // Catch:{ all -> 0x0a96 }
            r9.mo39008o(r10)     // Catch:{ all -> 0x0a96 }
        L_0x087a:
            u5.a r9 = p256u5.C11026a.ANALYTICS_STORAGE     // Catch:{ all -> 0x0a96 }
            boolean r8 = r8.mo43338i(r9)     // Catch:{ all -> 0x0a96 }
            if (r8 == 0) goto L_0x0899
            java.lang.String r8 = r10.mo39140d0()     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x0899
            java.lang.String r8 = r10.mo39140d0()     // Catch:{ all -> 0x0a96 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C4604n.m20098k(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a96 }
            r2.mo37771C(r8)     // Catch:{ all -> 0x0a96 }
        L_0x0899:
            java.lang.String r8 = r10.mo39146g0()     // Catch:{ all -> 0x0a96 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a96 }
            if (r8 != 0) goto L_0x08b0
            java.lang.String r8 = r10.mo39146g0()     // Catch:{ all -> 0x0a96 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C4604n.m20098k(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a96 }
            r2.mo37802U(r8)     // Catch:{ all -> 0x0a96 }
        L_0x08b0:
            com.google.android.gms.measurement.internal.i r8 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = r3.f46948b     // Catch:{ all -> 0x0a96 }
            java.util.List r3 = r8.mo38999c0(r3)     // Catch:{ all -> 0x0a96 }
            r13 = 0
        L_0x08bc:
            int r8 = r3.size()     // Catch:{ all -> 0x0a96 }
            if (r13 >= r8) goto L_0x08f2
            com.google.android.gms.internal.measurement.y4 r8 = com.google.android.gms.internal.measurement.C9449z4.m43918C()     // Catch:{ all -> 0x0a96 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b9 r9 = (com.google.android.gms.measurement.internal.C9730b9) r9     // Catch:{ all -> 0x0a96 }
            java.lang.String r9 = r9.f46186c     // Catch:{ all -> 0x0a96 }
            r8.mo38190K(r9)     // Catch:{ all -> 0x0a96 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b9 r9 = (com.google.android.gms.measurement.internal.C9730b9) r9     // Catch:{ all -> 0x0a96 }
            long r9 = r9.f46187d     // Catch:{ all -> 0x0a96 }
            r8.mo38191L(r9)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.z8 r9 = r1.f46871g     // Catch:{ all -> 0x0a96 }
            m45454Q(r9)     // Catch:{ all -> 0x0a96 }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b9 r10 = (com.google.android.gms.measurement.internal.C9730b9) r10     // Catch:{ all -> 0x0a96 }
            java.lang.Object r10 = r10.f46188e     // Catch:{ all -> 0x0a96 }
            r9.mo39348K(r8, r10)     // Catch:{ all -> 0x0a96 }
            r2.mo37773D0(r8)     // Catch:{ all -> 0x0a96 }
            int r13 = r13 + 1
            goto L_0x08bc
        L_0x08f2:
            com.google.android.gms.measurement.internal.i r3 = r1.f46867c     // Catch:{ IOException -> 0x0a4c }
            m45454Q(r3)     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.internal.measurement.r8 r8 = r2.mo37840w()     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.internal.measurement.p4 r8 = (com.google.android.gms.internal.measurement.C9296p4) r8     // Catch:{ IOException -> 0x0a4c }
            r3.mo19272b()     // Catch:{ IOException -> 0x0a4c }
            r3.mo39090d()     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.common.internal.C4604n.m20098k(r8)     // Catch:{ IOException -> 0x0a4c }
            java.lang.String r9 = r8.mo37885L1()     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.common.internal.C4604n.m20094g(r9)     // Catch:{ IOException -> 0x0a4c }
            byte[] r9 = r8.mo37404l()     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.measurement.internal.x8 r10 = r3.f46518b     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.measurement.internal.z8 r10 = r10.f46871g     // Catch:{ IOException -> 0x0a4c }
            m45454Q(r10)     // Catch:{ IOException -> 0x0a4c }
            long r10 = r10.mo39351x(r9)     // Catch:{ IOException -> 0x0a4c }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a4c }
            r12.<init>()     // Catch:{ IOException -> 0x0a4c }
            java.lang.String r13 = r8.mo37885L1()     // Catch:{ IOException -> 0x0a4c }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a4c }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a4c }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a4c }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a4c }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo38987P()     // Catch:{ SQLiteException -> 0x0a32 }
            java.lang.String r13 = "raw_events_metadata"
            r4 = 4
            r9.insertWithOnConflict(r13, r6, r12, r4)     // Catch:{ SQLiteException -> 0x0a32 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.zzas r3 = r5.f46489f     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.p r4 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0a96 }
            r4.<init>(r3)     // Catch:{ all -> 0x0a96 }
        L_0x094e:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0a96 }
            if (r3 == 0) goto L_0x0960
            java.lang.String r3 = r4.next()     // Catch:{ all -> 0x0a96 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0a96 }
            if (r3 == 0) goto L_0x094e
        L_0x095e:
            r13 = 1
            goto L_0x09a1
        L_0x0960:
            com.google.android.gms.measurement.internal.b4 r3 = r1.f46865a     // Catch:{ all -> 0x0a96 }
            m45454Q(r3)     // Catch:{ all -> 0x0a96 }
            java.lang.String r4 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = r5.f46485b     // Catch:{ all -> 0x0a96 }
            boolean r3 = r3.mo38870w(r4, r7)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r4 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r4)     // Catch:{ all -> 0x0a96 }
            long r17 = r34.mo39275F()     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r4
            r19 = r7
            com.google.android.gms.measurement.internal.g r4 = r16.mo38991T(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0a96 }
            if (r3 == 0) goto L_0x09a0
            long r3 = r4.f46280e     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.f r7 = r34.mo39278T()     // Catch:{ all -> 0x0a96 }
            java.lang.String r8 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.r2 r9 = com.google.android.gms.measurement.internal.C9903s2.f46706p     // Catch:{ all -> 0x0a96 }
            int r7 = r7.mo19348n(r8, r9)     // Catch:{ all -> 0x0a96 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a96 }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x09a0
            goto L_0x095e
        L_0x09a0:
            r13 = 0
        L_0x09a1:
            r2.mo19272b()     // Catch:{ all -> 0x0a96 }
            r2.mo39090d()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20098k(r5)     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.common.internal.C4604n.m20094g(r3)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.x8 r3 = r2.f46518b     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.z8 r3 = r3.f46871g     // Catch:{ all -> 0x0a96 }
            m45454Q(r3)     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.internal.measurement.f4 r3 = r3.mo39341B(r5)     // Catch:{ all -> 0x0a96 }
            byte[] r3 = r3.mo37404l()     // Catch:{ all -> 0x0a96 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0a96 }
            r4.<init>()     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            r4.put(r14, r7)     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f46485b     // Catch:{ all -> 0x0a96 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f46487d     // Catch:{ all -> 0x0a96 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a96 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a96 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a96 }
            r4.put(r15, r7)     // Catch:{ all -> 0x0a96 }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0a96 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0a96 }
            r4.put(r3, r7)     // Catch:{ all -> 0x0a96 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo38987P()     // Catch:{ SQLiteException -> 0x0a1a }
            r7 = r32
            long r3 = r3.insert(r7, r6, r4)     // Catch:{ SQLiteException -> 0x0a1a }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0a15
            com.google.android.gms.measurement.internal.h4 r3 = r2.f21269a     // Catch:{ SQLiteException -> 0x0a1a }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ SQLiteException -> 0x0a1a }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ SQLiteException -> 0x0a1a }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f46484a     // Catch:{ SQLiteException -> 0x0a1a }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)     // Catch:{ SQLiteException -> 0x0a1a }
            r3.mo38857b(r4, r6)     // Catch:{ SQLiteException -> 0x0a1a }
            goto L_0x0a63
        L_0x0a15:
            r3 = 0
            r1.f46879o = r3     // Catch:{ all -> 0x0a96 }
            goto L_0x0a63
        L_0x0a1a:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f46484a     // Catch:{ all -> 0x0a96 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r5)     // Catch:{ all -> 0x0a96 }
            r2.mo38858c(r4, r5, r3)     // Catch:{ all -> 0x0a96 }
            goto L_0x0a63
        L_0x0a32:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ IOException -> 0x0a4c }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ IOException -> 0x0a4c }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo37885L1()     // Catch:{ IOException -> 0x0a4c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)     // Catch:{ IOException -> 0x0a4c }
            r3.mo38858c(r5, r6, r4)     // Catch:{ IOException -> 0x0a4c }
            throw r4     // Catch:{ IOException -> 0x0a4c }
        L_0x0a4c:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.d3 r4 = r34.mo19276j()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19282q()     // Catch:{ all -> 0x0a96 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo37824q0()     // Catch:{ all -> 0x0a96 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r2)     // Catch:{ all -> 0x0a96 }
            r4.mo38858c(r5, r2, r3)     // Catch:{ all -> 0x0a96 }
        L_0x0a63:
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c     // Catch:{ all -> 0x0a96 }
            m45454Q(r2)     // Catch:{ all -> 0x0a96 }
            r2.mo39007n()     // Catch:{ all -> 0x0a96 }
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            r34.m45449L()
            com.google.android.gms.measurement.internal.d3 r2 = r34.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19286v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo38857b(r4, r3)
            return
        L_0x0a96:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.i r3 = r1.f46867c
            m45454Q(r3)
            r3.mo39002f0()
            throw r2
        L_0x0aa1:
            r1.mo39276R(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9958x8.mo39273C(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzp):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo39274D() {
        mo19273e().mo19272b();
        FileLock fileLock = this.f46886v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f46867c.f21269a.mo19392z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f46876l.mo19277r().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f46887w = channel;
                FileLock tryLock = channel.tryLock();
                this.f46886v = tryLock;
                if (tryLock != null) {
                    mo19276j().mo19286v().mo38856a("Storage concurrent access okay");
                    return true;
                }
                mo19276j().mo19282q().mo38856a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo19276j().mo19282q().mo38857b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo19276j().mo19282q().mo38857b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo19276j().mo19287w().mo38857b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo19276j().mo19286v().mo38856a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo39275F() {
        long currentTimeMillis = mo19274f().currentTimeMillis();
        C9937v7 v7Var = this.f46873i;
        v7Var.mo39090d();
        v7Var.mo19272b();
        long a = v7Var.f46817l.mo39075a();
        if (a == 0) {
            a = ((long) v7Var.f21269a.mo19372N().mo19327t().nextInt(86400000)) + 1;
            v7Var.f46817l.mo39076b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final C9885q4 mo39276R(zzp zzp) {
        mo19273e().mo19272b();
        mo39286b();
        C4604n.m20098k(zzp);
        C4604n.m20094g(zzp.f46948b);
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        C9885q4 R = iVar.mo38989R(zzp.f46948b);
        C11027b c = mo39279U(zzp.f46948b).mo43331c(C11027b.m49402b(zzp.f46969w));
        C11026a aVar = C11026a.AD_STORAGE;
        String n = c.mo43338i(aVar) ? this.f46873i.mo39248n(zzp.f46948b) : "";
        if (R == null) {
            R = new C9885q4(this.f46876l, zzp.f46948b);
            if (c.mo43338i(C11026a.ANALYTICS_STORAGE)) {
                R.mo39147h(mo39295h0(c));
            }
            if (c.mo43338i(aVar)) {
                R.mo39112F(n);
            }
        } else if (c.mo43338i(aVar) && n != null && !n.equals(R.mo39133a())) {
            R.mo39112F(n);
            C9287ob.m43342b();
            C4669f T = mo39278T();
            C9893r2 r2Var = C9903s2.f46707p0;
            if (!T.mo19337B((String) null, r2Var) || !mo39278T().mo19337B((String) null, C9903s2.f46717u0)) {
                R.mo39147h(mo39295h0(c));
            } else if (!"00000000-0000-0000-0000-000000000000".equals(this.f46873i.mo39247m(zzp.f46948b, c).first)) {
                R.mo39147h(mo39295h0(c));
            }
            C9287ob.m43342b();
            if (mo39278T().mo19337B((String) null, r2Var) && !"00000000-0000-0000-0000-000000000000".equals(this.f46873i.mo39247m(zzp.f46948b, c).first)) {
                C9793i iVar2 = this.f46867c;
                m45454Q(iVar2);
                if (iVar2.mo38994X(zzp.f46948b, "_id") != null) {
                    C9793i iVar3 = this.f46867c;
                    m45454Q(iVar3);
                    if (iVar3.mo38994X(zzp.f46948b, "_lair") == null) {
                        C9730b9 b9Var = new C9730b9(zzp.f46948b, TtmlNode.TEXT_EMPHASIS_AUTO, "_lair", mo19274f().currentTimeMillis(), 1L);
                        C9793i iVar4 = this.f46867c;
                        m45454Q(iVar4);
                        iVar4.mo39016x(b9Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo39140d0()) && c.mo43338i(C11026a.ANALYTICS_STORAGE)) {
            R.mo39147h(mo39295h0(c));
        }
        R.mo39164w(zzp.f46949c);
        R.mo39141e(zzp.f46964r);
        if (!TextUtils.isEmpty(zzp.f46958l)) {
            R.mo39163v(zzp.f46958l);
        }
        long j = zzp.f46952f;
        if (j != 0) {
            R.mo39165x(j);
        }
        if (!TextUtils.isEmpty(zzp.f46950d)) {
            R.mo39151j(zzp.f46950d);
        }
        R.mo39152k(zzp.f46957k);
        String str = zzp.f46951e;
        if (str != null) {
            R.mo39149i(str);
        }
        R.mo39160s(zzp.f46953g);
        R.mo39110D(zzp.f46955i);
        if (!TextUtils.isEmpty(zzp.f46954h)) {
            R.mo39166y(zzp.f46954h);
        }
        if (!mo39278T().mo19337B((String) null, C9903s2.f46695j0)) {
            R.mo39145g(zzp.f46959m);
        }
        R.mo39143f(zzp.f46962p);
        R.mo39111E(zzp.f46965s);
        R.mo39161t(zzp.f46966t);
        C9226kc.m43158b();
        if (mo39278T().mo19337B((String) null, C9903s2.f46727z0)) {
            R.mo39113G(zzp.f46967u);
        } else {
            C9226kc.m43158b();
            if (mo39278T().mo19337B((String) null, C9903s2.f46725y0)) {
                R.mo39113G((List) null);
            }
        }
        if (R.mo39116J()) {
            C9793i iVar5 = this.f46867c;
            m45454Q(iVar5);
            iVar5.mo39008o(R);
        }
        return R;
    }

    /* renamed from: S */
    public final C9880p9 mo39277S() {
        C9880p9 p9Var = this.f46870f;
        m45454Q(p9Var);
        return p9Var;
    }

    /* renamed from: T */
    public final C4669f mo39278T() {
        return ((C4670h4) C4604n.m20098k(this.f46876l)).mo19392z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final C11027b mo39279U(String str) {
        String str2;
        C11027b bVar = C11027b.f49992b;
        mo19273e().mo19272b();
        mo39286b();
        C11027b bVar2 = (C11027b) this.f46861A.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        C4604n.m20098k(str);
        iVar.mo19272b();
        iVar.mo39090d();
        Cursor cursor = null;
        try {
            Cursor rawQuery = iVar.mo38987P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C11027b b = C11027b.m49402b(str2);
            mo39313z(str, b);
            return b;
        } catch (SQLiteException e) {
            iVar.f21269a.mo19276j().mo19282q().mo38858c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: V */
    public final C9793i mo39280V() {
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        return iVar;
    }

    /* renamed from: W */
    public final C9962y2 mo39281W() {
        return this.f46876l.mo19363D();
    }

    /* renamed from: X */
    public final C9797i3 mo39282X() {
        C9797i3 i3Var = this.f46866b;
        m45454Q(i3Var);
        return i3Var;
    }

    /* renamed from: Y */
    public final C9819k3 mo39283Y() {
        C9819k3 k3Var = this.f46868d;
        if (k3Var != null) {
            return k3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: Z */
    public final C9726b4 mo39284Z() {
        C9726b4 b4Var = this.f46865a;
        m45454Q(b4Var);
        return b4Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39285a() {
        mo19273e().mo19272b();
        mo39286b();
        if (!this.f46878n) {
            this.f46878n = true;
            if (mo39274D()) {
                FileChannel fileChannel = this.f46887w;
                mo19273e().mo19272b();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo19276j().mo19282q().mo38856a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo19276j().mo19287w().mo38857b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo19276j().mo19282q().mo38857b("Failed to read from channel", e);
                    }
                }
                int o = this.f46876l.mo19361B().mo19405o();
                mo19273e().mo19272b();
                if (i > o) {
                    mo19276j().mo19282q().mo38858c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(o));
                } else if (i < o) {
                    FileChannel fileChannel2 = this.f46887w;
                    mo19273e().mo19272b();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo19276j().mo19282q().mo38856a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(o);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            if (mo39278T().mo19337B((String) null, C9903s2.f46691h0) && Build.VERSION.SDK_INT <= 19) {
                                fileChannel2.position(0);
                            }
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo19276j().mo19282q().mo38857b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo19276j().mo19286v().mo38858c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(o));
                            return;
                        } catch (IOException e2) {
                            mo19276j().mo19282q().mo38857b("Failed to write to channel", e2);
                        }
                    }
                    mo19276j().mo19282q().mo38858c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(o));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39286b() {
        if (!this.f46877m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final C4670h4 mo39287b0() {
        return this.f46876l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo39288c(C9885q4 q4Var) {
        String str;
        mo19273e().mo19272b();
        if (!TextUtils.isEmpty(q4Var.mo39148h0()) || !TextUtils.isEmpty(q4Var.mo39134a0())) {
            C9879p8 p8Var = this.f46874j;
            Uri.Builder builder = new Uri.Builder();
            String h0 = q4Var.mo39148h0();
            if (TextUtils.isEmpty(h0)) {
                h0 = q4Var.mo39134a0();
            }
            C6077a aVar = null;
            Uri.Builder encodedAuthority = builder.scheme((String) C9903s2.f46686f.mo39174a((Object) null)).encodedAuthority((String) C9903s2.f46688g.mo39174a((Object) null));
            String valueOf = String.valueOf(h0);
            if (valueOf.length() != 0) {
                str = "config/app/".concat(valueOf);
            } else {
                str = new String("config/app/");
            }
            Uri.Builder appendQueryParameter = encodedAuthority.path(str).appendQueryParameter("app_instance_id", q4Var.mo39140d0()).appendQueryParameter("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            p8Var.f21269a.mo19392z().mo19350p();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(55005)).appendQueryParameter("runtime_version", SessionDescription.SUPPORTED_SDP_VERSION);
            String uri = builder.build().toString();
            try {
                String str2 = (String) C4604n.m20098k(q4Var.mo39138c0());
                URL url = new URL(uri);
                mo19276j().mo19286v().mo38857b("Fetching remote configuration", str2);
                C9726b4 b4Var = this.f46865a;
                m45454Q(b4Var);
                C9357t3 n = b4Var.mo38863n(str2);
                C9726b4 b4Var2 = this.f46865a;
                m45454Q(b4Var2);
                String o = b4Var2.mo38864o(str2);
                if (n != null && !TextUtils.isEmpty(o)) {
                    aVar = new C6077a();
                    aVar.put("If-Modified-Since", o);
                }
                this.f46883s = true;
                C9797i3 i3Var = this.f46866b;
                m45454Q(i3Var);
                C9909s8 s8Var = new C9909s8(this);
                i3Var.mo19272b();
                i3Var.mo39090d();
                C4604n.m20098k(url);
                C4604n.m20098k(s8Var);
                i3Var.f21269a.mo19273e().mo38908y(new C9787h3(i3Var, str2, url, (byte[]) null, aVar, s8Var));
            } catch (MalformedURLException unused) {
                mo19276j().mo19282q().mo38858c("Failed to parse config URL. Not fetching. appId", C4667d3.m21474z(q4Var.mo39138c0()), uri);
            }
        } else {
            mo39300l((String) C4604n.m20098k(q4Var.mo39138c0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* renamed from: c0 */
    public final C9833l6 mo39289c0() {
        C9833l6 l6Var = this.f46872h;
        m45454Q(l6Var);
        return l6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo39290d(zzau zzau, zzp zzp) {
        zzau zzau2;
        List<zzab> list;
        List<zzab> list2;
        List<zzab> list3;
        String str;
        zzp zzp2 = zzp;
        C4604n.m20098k(zzp);
        C4604n.m20094g(zzp2.f46948b);
        mo19273e().mo19272b();
        mo39286b();
        String str2 = zzp2.f46948b;
        zzau zzau3 = zzau;
        long j = zzau3.f46940e;
        C9458zd.m44022b();
        C9844m6 m6Var = null;
        if (mo39278T().mo19337B((String) null, C9903s2.f46719v0)) {
            C9755e3 b = C9755e3.m45043b(zzau);
            mo19273e().mo19272b();
            if (!(this.f46862B == null || (str = this.f46863C) == null || !str.equals(str2))) {
                m6Var = this.f46862B;
            }
            C4668d9.m21502x(m6Var, b.f46229d, false);
            zzau3 = b.mo38893a();
        }
        m45454Q(this.f46871g);
        if (C9978z8.m45540l(zzau3, zzp2)) {
            if (!zzp2.f46955i) {
                mo39276R(zzp2);
                return;
            }
            List list4 = zzp2.f46967u;
            if (list4 == null) {
                zzau2 = zzau3;
            } else if (list4.contains(zzau3.f46937b)) {
                Bundle D0 = zzau3.f46938c.mo39355D0();
                D0.putLong("ga_safelisted", 1);
                zzau2 = new zzau(zzau3.f46937b, new zzas(D0), zzau3.f46939d, zzau3.f46940e);
            } else {
                mo19276j().mo19281p().mo38859d("Dropping non-safelisted event. appId, event name, origin", str2, zzau3.f46937b, zzau3.f46939d);
                return;
            }
            C9793i iVar = this.f46867c;
            m45454Q(iVar);
            iVar.mo39001e0();
            try {
                C9793i iVar2 = this.f46867c;
                m45454Q(iVar2);
                C4604n.m20094g(str2);
                iVar2.mo19272b();
                iVar2.mo39090d();
                if (j < 0) {
                    iVar2.f21269a.mo19276j().mo19287w().mo38858c("Invalid time querying timed out conditional properties", C4667d3.m21474z(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = iVar2.mo38998b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzab zzab : list) {
                    if (zzab != null) {
                        mo19276j().mo19286v().mo38859d("User property timed out", zzab.f46925b, this.f46876l.mo19363D().mo39322f(zzab.f46927d.f46942c), zzab.f46927d.mo39366C0());
                        zzau zzau4 = zzab.f46931h;
                        if (zzau4 != null) {
                            mo39273C(new zzau(zzau4, j), zzp2);
                        }
                        C9793i iVar3 = this.f46867c;
                        m45454Q(iVar3);
                        iVar3.mo38982J(str2, zzab.f46927d.f46942c);
                    }
                }
                C9793i iVar4 = this.f46867c;
                m45454Q(iVar4);
                C4604n.m20094g(str2);
                iVar4.mo19272b();
                iVar4.mo39090d();
                if (j < 0) {
                    iVar4.f21269a.mo19276j().mo19287w().mo38858c("Invalid time querying expired conditional properties", C4667d3.m21474z(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = iVar4.mo38998b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzau> arrayList = new ArrayList<>(list2.size());
                for (zzab zzab2 : list2) {
                    if (zzab2 != null) {
                        mo19276j().mo19286v().mo38859d("User property expired", zzab2.f46925b, this.f46876l.mo19363D().mo39322f(zzab2.f46927d.f46942c), zzab2.f46927d.mo39366C0());
                        C9793i iVar5 = this.f46867c;
                        m45454Q(iVar5);
                        iVar5.mo39005l(str2, zzab2.f46927d.f46942c);
                        zzau zzau5 = zzab2.f46935l;
                        if (zzau5 != null) {
                            arrayList.add(zzau5);
                        }
                        C9793i iVar6 = this.f46867c;
                        m45454Q(iVar6);
                        iVar6.mo38982J(str2, zzab2.f46927d.f46942c);
                    }
                }
                for (zzau zzau6 : arrayList) {
                    mo39273C(new zzau(zzau6, j), zzp2);
                }
                C9793i iVar7 = this.f46867c;
                m45454Q(iVar7);
                String str3 = zzau2.f46937b;
                C4604n.m20094g(str2);
                C4604n.m20094g(str3);
                iVar7.mo19272b();
                iVar7.mo39090d();
                if (j < 0) {
                    iVar7.f21269a.mo19276j().mo19287w().mo38859d("Invalid time querying triggered conditional properties", C4667d3.m21474z(str2), iVar7.f21269a.mo19363D().mo39320d(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = iVar7.mo38998b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzau> arrayList2 = new ArrayList<>(list3.size());
                for (zzab zzab3 : list3) {
                    if (zzab3 != null) {
                        zzks zzks = zzab3.f46927d;
                        C9730b9 b9Var = new C9730b9((String) C4604n.m20098k(zzab3.f46925b), zzab3.f46926c, zzks.f46942c, j, C4604n.m20098k(zzks.mo39366C0()));
                        C9793i iVar8 = this.f46867c;
                        m45454Q(iVar8);
                        if (iVar8.mo39016x(b9Var)) {
                            mo19276j().mo19286v().mo38859d("User property triggered", zzab3.f46925b, this.f46876l.mo19363D().mo39322f(b9Var.f46186c), b9Var.f46188e);
                        } else {
                            mo19276j().mo19282q().mo38859d("Too many active user properties, ignoring", C4667d3.m21474z(zzab3.f46925b), this.f46876l.mo19363D().mo39322f(b9Var.f46186c), b9Var.f46188e);
                        }
                        zzau zzau7 = zzab3.f46933j;
                        if (zzau7 != null) {
                            arrayList2.add(zzau7);
                        }
                        zzab3.f46927d = new zzks(b9Var);
                        zzab3.f46929f = true;
                        C9793i iVar9 = this.f46867c;
                        m45454Q(iVar9);
                        iVar9.mo39015w(zzab3);
                    }
                }
                mo39273C(zzau2, zzp2);
                for (zzau zzau8 : arrayList2) {
                    mo39273C(new zzau(zzau8, j), zzp2);
                }
                C9793i iVar10 = this.f46867c;
                m45454Q(iVar10);
                iVar10.mo39007n();
            } finally {
                C9793i iVar11 = this.f46867c;
                m45454Q(iVar11);
                iVar11.mo39002f0();
            }
        }
    }

    /* renamed from: d0 */
    public final C9937v7 mo39291d0() {
        return this.f46873i;
    }

    /* renamed from: e */
    public final C9766f4 mo19273e() {
        return ((C4670h4) C4604n.m20098k(this.f46876l)).mo19273e();
    }

    /* renamed from: f */
    public final C6483e mo19274f() {
        return ((C4670h4) C4604n.m20098k(this.f46876l)).mo19274f();
    }

    /* renamed from: f0 */
    public final C9978z8 mo39292f0() {
        C9978z8 z8Var = this.f46871g;
        m45454Q(z8Var);
        return z8Var;
    }

    /* renamed from: g */
    public final C9721b mo19275g() {
        throw null;
    }

    /* renamed from: g0 */
    public final C4668d9 mo39293g0() {
        return ((C4670h4) C4604n.m20098k(this.f46876l)).mo19372N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo39294h(zzau zzau, String str) {
        zzau zzau2 = zzau;
        String str2 = str;
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        C9885q4 R = iVar.mo38989R(str2);
        if (R == null || TextUtils.isEmpty(R.mo39144f0())) {
            mo19276j().mo19281p().mo38857b("No app data available; dropping event", str2);
            return;
        }
        Boolean I = m45446I(R);
        if (I == null) {
            if (!"_ui".equals(zzau2.f46937b)) {
                mo19276j().mo19287w().mo38857b("Could not find package. appId", C4667d3.m21474z(str));
            }
        } else if (!I.booleanValue()) {
            mo19276j().mo19282q().mo38857b("App version does not match; dropping event. appId", C4667d3.m21474z(str));
            return;
        }
        zzp zzp = r2;
        C9885q4 q4Var = R;
        zzp zzp2 = new zzp(str, R.mo39148h0(), R.mo39144f0(), R.mo39117K(), R.mo39142e0(), R.mo39128V(), R.mo39125S(), (String) null, R.mo39115I(), false, q4Var.mo39146g0(), q4Var.mo39107A(), 0, 0, q4Var.mo39114H(), false, q4Var.mo39134a0(), q4Var.mo39132Z(), q4Var.mo39126T(), q4Var.mo39135b(), (String) null, mo39279U(str2).mo43336h());
        mo39296i(zzau2, zzp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final String mo39295h0(C11027b bVar) {
        if (!bVar.mo43338i(C11026a.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo39293g0().mo19327t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo39296i(zzau zzau, zzp zzp) {
        C4604n.m20094g(zzp.f46948b);
        C9755e3 b = C9755e3.m45043b(zzau);
        C4668d9 g0 = mo39293g0();
        Bundle bundle = b.f46229d;
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        g0.mo19334y(bundle, iVar.mo38988Q(zzp.f46948b));
        mo39293g0().mo19335z(b, mo39278T().mo19347m(zzp.f46948b));
        zzau a = b.mo38893a();
        if ("_cmp".equals(a.f46937b) && "referrer API v2".equals(a.f46938c.mo39359H0("_cis"))) {
            String H0 = a.f46938c.mo39359H0("gclid");
            if (!TextUtils.isEmpty(H0)) {
                mo39271A(new zzks("_lgclid", a.f46940e, H0, TtmlNode.TEXT_EMPHASIS_AUTO), zzp);
            }
        }
        mo39290d(a, zzp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final String mo39297i0(zzp zzp) {
        try {
            return (String) mo19273e().mo38906s(new C9919t8(this, zzp)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo19276j().mo19282q().mo38858c("Failed to get app instance id. appId", C4667d3.m21474z(zzp.f46948b), e);
            return null;
        }
    }

    /* renamed from: j */
    public final C4667d3 mo19276j() {
        return ((C4670h4) C4604n.m20098k(this.f46876l)).mo19276j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo39298k() {
        this.f46882r++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final void mo39299k0(Runnable runnable) {
        mo19273e().mo19272b();
        if (this.f46880p == null) {
            this.f46880p = new ArrayList();
        }
        this.f46880p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127 A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135 A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157 A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015b A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39300l(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.f4 r0 = r6.mo19273e()
            r0.mo19272b()
            r6.mo39286b()
            com.google.android.gms.common.internal.C4604n.m20094g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0176 }
        L_0x0012:
            com.google.android.gms.measurement.internal.d3 r1 = r6.mo19276j()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()     // Catch:{ all -> 0x0176 }
            int r2 = r10.length     // Catch:{ all -> 0x0176 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo38857b(r3, r2)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.i r1 = r6.f46867c     // Catch:{ all -> 0x0176 }
            m45454Q(r1)     // Catch:{ all -> 0x0176 }
            r1.mo39001e0()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.i r1 = r6.f46867c     // Catch:{ all -> 0x016c }
            m45454Q(r1)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.q4 r1 = r1.mo38989R(r7)     // Catch:{ all -> 0x016c }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r8 == r3) goto L_0x0043
            if (r8 != r4) goto L_0x0047
            r8 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r9 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.d3 r8 = r6.mo19276j()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.b3 r8 = r8.mo19287w()     // Catch:{ all -> 0x016c }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)     // Catch:{ all -> 0x016c }
            r8.mo38857b(r9, r7)     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r8 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            a5.e r10 = r6.mo19274f()     // Catch:{ all -> 0x016c }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r1.mo39162u(r10)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.i r10 = r6.f46867c     // Catch:{ all -> 0x016c }
            m45454Q(r10)     // Catch:{ all -> 0x016c }
            r10.mo39008o(r1)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.d3 r10 = r6.mo19276j()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.b3 r10 = r10.mo19286v()     // Catch:{ all -> 0x016c }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016c }
            r10.mo38858c(r11, r1, r9)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.b4 r9 = r6.f46865a     // Catch:{ all -> 0x016c }
            m45454Q(r9)     // Catch:{ all -> 0x016c }
            r9.mo38865q(r7)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.v7 r7 = r6.f46873i     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.n3 r7 = r7.f46816k     // Catch:{ all -> 0x016c }
            a5.e r9 = r6.mo19274f()     // Catch:{ all -> 0x016c }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r7.mo39076b(r9)     // Catch:{ all -> 0x016c }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a7
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.v7 r7 = r6.f46873i     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.n3 r7 = r7.f46814i     // Catch:{ all -> 0x016c }
            a5.e r8 = r6.mo19274f()     // Catch:{ all -> 0x016c }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r7.mo39076b(r8)     // Catch:{ all -> 0x016c }
        L_0x00b6:
            r6.m45449L()     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x00bb:
            r9 = 0
            if (r11 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x016c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x016c }
            goto L_0x00c8
        L_0x00c7:
            r11 = r9
        L_0x00c8:
            if (r11 == 0) goto L_0x00d7
            int r3 = r11.size()     // Catch:{ all -> 0x016c }
            if (r3 <= 0) goto L_0x00d7
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x016c }
            goto L_0x00d8
        L_0x00d7:
            r11 = r9
        L_0x00d8:
            if (r8 == r5) goto L_0x00f6
            if (r8 != r4) goto L_0x00dd
            goto L_0x00f6
        L_0x00dd:
            com.google.android.gms.measurement.internal.b4 r9 = r6.f46865a     // Catch:{ all -> 0x016c }
            m45454Q(r9)     // Catch:{ all -> 0x016c }
            boolean r9 = r9.mo38873z(r7, r10, r11)     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.i r7 = r6.f46867c     // Catch:{ all -> 0x0176 }
            m45454Q(r7)     // Catch:{ all -> 0x0176 }
        L_0x00ed:
            r7.mo39002f0()     // Catch:{ all -> 0x0176 }
            r6.f46883s = r0
            r6.m45447J()
            return
        L_0x00f6:
            com.google.android.gms.measurement.internal.b4 r10 = r6.f46865a     // Catch:{ all -> 0x016c }
            m45454Q(r10)     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.t3 r10 = r10.mo38863n(r7)     // Catch:{ all -> 0x016c }
            if (r10 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.b4 r10 = r6.f46865a     // Catch:{ all -> 0x016c }
            m45454Q(r10)     // Catch:{ all -> 0x016c }
            boolean r9 = r10.mo38873z(r7, r9, r9)     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.i r7 = r6.f46867c     // Catch:{ all -> 0x0176 }
            m45454Q(r7)     // Catch:{ all -> 0x0176 }
            goto L_0x00ed
        L_0x0112:
            a5.e r9 = r6.mo19274f()     // Catch:{ all -> 0x016c }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r1.mo39153l(r9)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.i r9 = r6.f46867c     // Catch:{ all -> 0x016c }
            m45454Q(r9)     // Catch:{ all -> 0x016c }
            r9.mo39008o(r1)     // Catch:{ all -> 0x016c }
            if (r8 != r5) goto L_0x0135
            com.google.android.gms.measurement.internal.d3 r8 = r6.mo19276j()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.b3 r8 = r8.mo19288x()     // Catch:{ all -> 0x016c }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo38857b(r9, r7)     // Catch:{ all -> 0x016c }
            goto L_0x0146
        L_0x0135:
            com.google.android.gms.measurement.internal.d3 r7 = r6.mo19276j()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19286v()     // Catch:{ all -> 0x016c }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016c }
            r7.mo38858c(r9, r8, r2)     // Catch:{ all -> 0x016c }
        L_0x0146:
            com.google.android.gms.measurement.internal.i3 r7 = r6.f46866b     // Catch:{ all -> 0x016c }
            m45454Q(r7)     // Catch:{ all -> 0x016c }
            boolean r7 = r7.mo39017l()     // Catch:{ all -> 0x016c }
            if (r7 == 0) goto L_0x015b
            boolean r7 = r6.m45451N()     // Catch:{ all -> 0x016c }
            if (r7 == 0) goto L_0x015b
            r6.mo39272B()     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x015b:
            r6.m45449L()     // Catch:{ all -> 0x016c }
        L_0x015e:
            com.google.android.gms.measurement.internal.i r7 = r6.f46867c     // Catch:{ all -> 0x016c }
            m45454Q(r7)     // Catch:{ all -> 0x016c }
            r7.mo39007n()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.i r7 = r6.f46867c     // Catch:{ all -> 0x0176 }
            m45454Q(r7)     // Catch:{ all -> 0x0176 }
            goto L_0x00ed
        L_0x016c:
            r7 = move-exception
            com.google.android.gms.measurement.internal.i r8 = r6.f46867c     // Catch:{ all -> 0x0176 }
            m45454Q(r8)     // Catch:{ all -> 0x0176 }
            r8.mo39002f0()     // Catch:{ all -> 0x0176 }
            throw r7     // Catch:{ all -> 0x0176 }
        L_0x0176:
            r7 = move-exception
            r6.f46883s = r0
            r6.m45447J()
            goto L_0x017e
        L_0x017d:
            throw r7
        L_0x017e:
            goto L_0x017d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9958x8.mo39300l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo39301m(boolean z) {
        m45449L();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo39302n(int i, Throwable th, byte[] bArr, String str) {
        C9793i iVar;
        mo19273e().mo19272b();
        mo39286b();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f46884t = false;
                m45447J();
                throw th2;
            }
        }
        List<Long> list = (List) C4604n.m20098k(this.f46888x);
        this.f46888x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo19276j().mo19286v().mo38858c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f46873i.f46816k.mo39076b(mo19274f().currentTimeMillis());
            if (i == 503 || i == 429) {
                this.f46873i.f46814i.mo39076b(mo19274f().currentTimeMillis());
            }
            C9793i iVar2 = this.f46867c;
            m45454Q(iVar2);
            iVar2.mo39003g0(list);
            m45449L();
            this.f46884t = false;
            m45447J();
        }
        if (th == null) {
            try {
                this.f46873i.f46815j.mo39076b(mo19274f().currentTimeMillis());
                this.f46873i.f46816k.mo39076b(0);
                m45449L();
                mo19276j().mo19286v().mo38858c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C9793i iVar3 = this.f46867c;
                m45454Q(iVar3);
                iVar3.mo39001e0();
                try {
                    for (Long l : list) {
                        try {
                            iVar = this.f46867c;
                            m45454Q(iVar);
                            long longValue = l.longValue();
                            iVar.mo19272b();
                            iVar.mo39090d();
                            if (iVar.mo38987P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            iVar.f21269a.mo19276j().mo19282q().mo38857b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f46889y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C9793i iVar4 = this.f46867c;
                    m45454Q(iVar4);
                    iVar4.mo39007n();
                    C9793i iVar5 = this.f46867c;
                    m45454Q(iVar5);
                    iVar5.mo39002f0();
                    this.f46889y = null;
                    C9797i3 i3Var = this.f46866b;
                    m45454Q(i3Var);
                    if (!i3Var.mo39017l() || !m45451N()) {
                        this.f46890z = -1;
                        m45449L();
                    } else {
                        mo39272B();
                    }
                    this.f46879o = 0;
                } catch (Throwable th3) {
                    C9793i iVar6 = this.f46867c;
                    m45454Q(iVar6);
                    iVar6.mo39002f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo19276j().mo19282q().mo38857b("Database error while trying to delete uploaded bundles", e3);
                this.f46879o = mo19274f().elapsedRealtime();
                mo19276j().mo19286v().mo38857b("Disable upload, time", Long.valueOf(this.f46879o));
            }
            this.f46884t = false;
            m45447J();
        }
        mo19276j().mo19286v().mo38858c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f46873i.f46816k.mo39076b(mo19274f().currentTimeMillis());
        this.f46873i.f46814i.mo39076b(mo19274f().currentTimeMillis());
        C9793i iVar22 = this.f46867c;
        m45454Q(iVar22);
        iVar22.mo39003g0(list);
        m45449L();
        this.f46884t = false;
        m45447J();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03cb A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03f7 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x040e A[SYNTHETIC, Splitter:B:128:0x040e] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04d4 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0538 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e4 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0239 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0566 }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39303o(com.google.android.gms.measurement.internal.zzp r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.f4 r8 = r23.mo19273e()
            r8.mo19272b()
            r23.mo39286b()
            com.google.android.gms.common.internal.C4604n.m20098k(r24)
            java.lang.String r8 = r2.f46948b
            com.google.android.gms.common.internal.C4604n.m20094g(r8)
            boolean r8 = m45453P(r24)
            if (r8 == 0) goto L_0x0570
            com.google.android.gms.measurement.internal.i r8 = r1.f46867c
            m45454Q(r8)
            java.lang.String r9 = r2.f46948b
            com.google.android.gms.measurement.internal.q4 r8 = r8.mo38989R(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo39148h0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f46949c
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo39153l(r9)
            com.google.android.gms.measurement.internal.i r11 = r1.f46867c
            m45454Q(r11)
            r11.mo39008o(r8)
            com.google.android.gms.measurement.internal.b4 r8 = r1.f46865a
            m45454Q(r8)
            java.lang.String r11 = r2.f46948b
            r8.mo38866s(r11)
        L_0x005e:
            boolean r8 = r2.f46955i
            if (r8 != 0) goto L_0x0066
            r23.mo39276R(r24)
            return
        L_0x0066:
            long r11 = r2.f46960n
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            a5.e r8 = r23.mo19274f()
            long r11 = r8.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.h4 r8 = r1.f46876l
            com.google.android.gms.measurement.internal.m r8 = r8.mo19360A()
            r8.mo39060q()
            int r8 = r2.f46961o
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.d3 r13 = r23.mo19276j()
            com.google.android.gms.measurement.internal.b3 r13 = r13.mo19287w()
            java.lang.String r14 = r2.f46948b
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo38858c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.i r9 = r1.f46867c
            m45454Q(r9)
            r9.mo39001e0()
            com.google.android.gms.measurement.internal.i r9 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r9)     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = r2.f46948b     // Catch:{ all -> 0x0566 }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.b9 r9 = r9.mo38994X(r10, r13)     // Catch:{ all -> 0x0566 }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f46185b     // Catch:{ all -> 0x0566 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x0566 }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.f46965s     // Catch:{ all -> 0x0566 }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzks r10 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.f46965s     // Catch:{ all -> 0x0566 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0566 }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0566 }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = 1
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0566 }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f46188e     // Catch:{ all -> 0x0566 }
            java.lang.Long r13 = r10.f46944e     // Catch:{ all -> 0x0566 }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x0566 }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.mo39271A(r10, r2)     // Catch:{ all -> 0x0566 }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.zzks r9 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0566 }
            r1.mo39307t(r9, r2)     // Catch:{ all -> 0x0566 }
        L_0x0119:
            com.google.android.gms.measurement.internal.i r9 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r9)     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = r2.f46948b     // Catch:{ all -> 0x0566 }
            java.lang.Object r10 = com.google.android.gms.common.internal.C4604n.m20098k(r10)     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.q4 r9 = r9.mo38989R(r10)     // Catch:{ all -> 0x0566 }
            if (r9 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.d9 r13 = r23.mo39293g0()     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = r2.f46949c     // Catch:{ all -> 0x0566 }
            java.lang.String r15 = r9.mo39148h0()     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = r2.f46964r     // Catch:{ all -> 0x0566 }
            java.lang.String r3 = r9.mo39134a0()     // Catch:{ all -> 0x0566 }
            boolean r3 = r13.mo19311b0(r14, r15, r10, r3)     // Catch:{ all -> 0x0566 }
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.d3 r3 = r23.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19287w()     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.mo39138c0()     // Catch:{ all -> 0x0566 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r13)     // Catch:{ all -> 0x0566 }
            r3.mo38857b(r10, r13)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.i r3 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r3)     // Catch:{ all -> 0x0566 }
            java.lang.String r9 = r9.mo39138c0()     // Catch:{ all -> 0x0566 }
            r3.mo39090d()     // Catch:{ all -> 0x0566 }
            r3.mo19272b()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.common.internal.C4604n.m20094g(r9)     // Catch:{ all -> 0x0566 }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo38987P()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cd }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.h4 r0 = r3.f21269a     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cd }
            r0.mo38858c(r10, r9, r13)     // Catch:{ SQLiteException -> 0x01cd }
            goto L_0x01e1
        L_0x01cd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r9)     // Catch:{ all -> 0x0566 }
            r3.mo38858c(r10, r9, r0)     // Catch:{ all -> 0x0566 }
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 == 0) goto L_0x0239
            long r13 = r9.mo39117K()     // Catch:{ all -> 0x0566 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r13 = r9.mo39117K()     // Catch:{ all -> 0x0566 }
            r3 = r5
            long r4 = r2.f46957k     // Catch:{ all -> 0x0566 }
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fc:
            r3 = r5
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.String r4 = r9.mo39144f0()     // Catch:{ all -> 0x0566 }
            long r13 = r9.mo39117K()     // Catch:{ all -> 0x0566 }
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            java.lang.String r5 = r2.f46950d     // Catch:{ all -> 0x0566 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0566 }
            if (r5 != 0) goto L_0x0216
            r15 = 1
            goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x023a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0566 }
            r0.<init>()     // Catch:{ all -> 0x0566 }
            java.lang.String r5 = "_pv"
            r0.putString(r5, r4)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.zzas r15 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0566 }
            r15.<init>(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0566 }
            r1.mo39290d(r4, r2)     // Catch:{ all -> 0x0566 }
            goto L_0x023a
        L_0x0239:
            r3 = r5
        L_0x023a:
            r23.mo39276R(r24)     // Catch:{ all -> 0x0566 }
            if (r8 != 0) goto L_0x024e
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r4 = r2.f46948b     // Catch:{ all -> 0x0566 }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.o r0 = r0.mo38993V(r4, r5)     // Catch:{ all -> 0x0566 }
            r15 = 0
            goto L_0x025c
        L_0x024e:
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r4 = r2.f46948b     // Catch:{ all -> 0x0566 }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.o r0 = r0.mo38993V(r4, r5)     // Catch:{ all -> 0x0566 }
            r15 = 1
        L_0x025c:
            if (r0 != 0) goto L_0x0538
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r4
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r14 = "_r"
            java.lang.String r13 = "_c"
            if (r15 != 0) goto L_0x04ee
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0566 }
            java.lang.String r15 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0566 }
            java.lang.String r18 = "auto"
            r8 = r13
            r13 = r0
            r9 = r14
            r14 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0566 }
            r1.mo39271A(r0, r2)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.f4 r0 = r23.mo19273e()     // Catch:{ all -> 0x0566 }
            r0.mo19272b()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.t3 r0 = r1.f46875k     // Catch:{ all -> 0x0566 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C4604n.m20098k(r0)     // Catch:{ all -> 0x0566 }
            r13 = r0
            com.google.android.gms.measurement.internal.t3 r13 = (com.google.android.gms.measurement.internal.C9914t3) r13     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r2.f46948b     // Catch:{ all -> 0x0566 }
            if (r0 == 0) goto L_0x038a
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0566 }
            if (r14 == 0) goto L_0x02a3
            goto L_0x038a
        L_0x02a3:
            com.google.android.gms.measurement.internal.h4 r14 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.f4 r14 = r14.mo19273e()     // Catch:{ all -> 0x0566 }
            r14.mo19272b()     // Catch:{ all -> 0x0566 }
            boolean r14 = r13.mo39191a()     // Catch:{ all -> 0x0566 }
            if (r14 != 0) goto L_0x02c3
            com.google.android.gms.measurement.internal.h4 r0 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19285u()     // Catch:{ all -> 0x0566 }
            java.lang.String r3 = "Install Referrer Reporter is not available"
            r0.mo38856a(r3)     // Catch:{ all -> 0x0566 }
            goto L_0x0399
        L_0x02c3:
            com.google.android.gms.measurement.internal.s3 r14 = new com.google.android.gms.measurement.internal.s3     // Catch:{ all -> 0x0566 }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.h4 r0 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo19273e()     // Catch:{ all -> 0x0566 }
            r0.mo19272b()     // Catch:{ all -> 0x0566 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0566 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0566 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r3, r10)     // Catch:{ all -> 0x0566 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.h4 r10 = r13.f46742a     // Catch:{ all -> 0x0566 }
            android.content.Context r10 = r10.mo19277r()     // Catch:{ all -> 0x0566 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ all -> 0x0566 }
            if (r10 != 0) goto L_0x02ff
            com.google.android.gms.measurement.internal.h4 r0 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19289y()     // Catch:{ all -> 0x0566 }
            java.lang.String r3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo38856a(r3)     // Catch:{ all -> 0x0566 }
            goto L_0x0399
        L_0x02ff:
            r15 = 0
            java.util.List r10 = r10.queryIntentServices(r0, r15)     // Catch:{ all -> 0x0566 }
            if (r10 == 0) goto L_0x037a
            boolean r17 = r10.isEmpty()     // Catch:{ all -> 0x0566 }
            if (r17 != 0) goto L_0x037a
            java.lang.Object r10 = r10.get(r15)     // Catch:{ all -> 0x0566 }
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10     // Catch:{ all -> 0x0566 }
            android.content.pm.ServiceInfo r10 = r10.serviceInfo     // Catch:{ all -> 0x0566 }
            if (r10 == 0) goto L_0x0399
            java.lang.String r15 = r10.packageName     // Catch:{ all -> 0x0566 }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0566 }
            if (r10 == 0) goto L_0x036a
            boolean r3 = r3.equals(r15)     // Catch:{ all -> 0x0566 }
            if (r3 == 0) goto L_0x036a
            boolean r3 = r13.mo39191a()     // Catch:{ all -> 0x0566 }
            if (r3 == 0) goto L_0x036a
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0566 }
            r3.<init>(r0)     // Catch:{ all -> 0x0566 }
            z4.a r0 = p186z4.C6469a.m28199b()     // Catch:{ RuntimeException -> 0x0355 }
            com.google.android.gms.measurement.internal.h4 r10 = r13.f46742a     // Catch:{ RuntimeException -> 0x0355 }
            android.content.Context r10 = r10.mo19277r()     // Catch:{ RuntimeException -> 0x0355 }
            r15 = 1
            boolean r0 = r0.mo24298a(r10, r3, r14, r15)     // Catch:{ RuntimeException -> 0x0355 }
            com.google.android.gms.measurement.internal.h4 r3 = r13.f46742a     // Catch:{ RuntimeException -> 0x0355 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ RuntimeException -> 0x0355 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19286v()     // Catch:{ RuntimeException -> 0x0355 }
            java.lang.String r14 = "Install Referrer Service is"
            java.lang.String r15 = "available"
            java.lang.String r16 = "not available"
            r10 = 1
            if (r10 == r0) goto L_0x0351
            r15 = r16
        L_0x0351:
            r3.mo38857b(r14, r15)     // Catch:{ RuntimeException -> 0x0355 }
            goto L_0x0399
        L_0x0355:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x0566 }
            java.lang.String r13 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0566 }
            r3.mo38857b(r13, r0)     // Catch:{ all -> 0x0566 }
            goto L_0x0399
        L_0x036a:
            com.google.android.gms.measurement.internal.h4 r0 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x0566 }
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo38856a(r3)     // Catch:{ all -> 0x0566 }
            goto L_0x0399
        L_0x037a:
            com.google.android.gms.measurement.internal.h4 r0 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19285u()     // Catch:{ all -> 0x0566 }
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo38856a(r3)     // Catch:{ all -> 0x0566 }
            goto L_0x0399
        L_0x038a:
            com.google.android.gms.measurement.internal.h4 r0 = r13.f46742a     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19289y()     // Catch:{ all -> 0x0566 }
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo38856a(r3)     // Catch:{ all -> 0x0566 }
        L_0x0399:
            com.google.android.gms.measurement.internal.f4 r0 = r23.mo19273e()     // Catch:{ all -> 0x0566 }
            r0.mo19272b()     // Catch:{ all -> 0x0566 }
            r23.mo39286b()     // Catch:{ all -> 0x0566 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0566 }
            r3.<init>()     // Catch:{ all -> 0x0566 }
            r13 = 1
            r3.putLong(r8, r13)     // Catch:{ all -> 0x0566 }
            r3.putLong(r9, r13)     // Catch:{ all -> 0x0566 }
            r8 = 0
            r3.putLong(r7, r8)     // Catch:{ all -> 0x0566 }
            r3.putLong(r6, r8)     // Catch:{ all -> 0x0566 }
            r15 = r22
            r3.putLong(r15, r8)     // Catch:{ all -> 0x0566 }
            r14 = r21
            r3.putLong(r14, r8)     // Catch:{ all -> 0x0566 }
            r8 = 1
            r3.putLong(r5, r8)     // Catch:{ all -> 0x0566 }
            boolean r0 = r2.f46963q     // Catch:{ all -> 0x0566 }
            if (r0 == 0) goto L_0x03ce
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0566 }
        L_0x03ce:
            java.lang.String r0 = r2.f46948b     // Catch:{ all -> 0x0566 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C4604n.m20098k(r0)     // Catch:{ all -> 0x0566 }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r0)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.common.internal.C4604n.m20094g(r4)     // Catch:{ all -> 0x0566 }
            r0.mo19272b()     // Catch:{ all -> 0x0566 }
            r0.mo39090d()     // Catch:{ all -> 0x0566 }
            java.lang.String r5 = "first_open_count"
            long r8 = r0.mo38983L(r4, r5)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.h4 r0 = r1.f46876l     // Catch:{ all -> 0x0566 }
            android.content.Context r0 = r0.mo19277r()     // Catch:{ all -> 0x0566 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0566 }
            if (r0 != 0) goto L_0x040e
            com.google.android.gms.measurement.internal.d3 r0 = r23.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ all -> 0x0566 }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r4)     // Catch:{ all -> 0x0566 }
            r0.mo38857b(r5, r4)     // Catch:{ all -> 0x0566 }
            r22 = r6
        L_0x040a:
            r4 = 0
            goto L_0x04d0
        L_0x040e:
            com.google.android.gms.measurement.internal.h4 r0 = r1.f46876l     // Catch:{ NameNotFoundException -> 0x041e }
            android.content.Context r0 = r0.mo19277r()     // Catch:{ NameNotFoundException -> 0x041e }
            c5.b r0 = p193c5.C6520c.m28321a(r0)     // Catch:{ NameNotFoundException -> 0x041e }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.mo24355f(r4, r5)     // Catch:{ NameNotFoundException -> 0x041e }
            goto L_0x0431
        L_0x041e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d3 r5 = r23.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0566 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r4)     // Catch:{ all -> 0x0566 }
            r5.mo38858c(r13, r10, r0)     // Catch:{ all -> 0x0566 }
            r0 = 0
        L_0x0431:
            if (r0 == 0) goto L_0x048f
            r21 = r14
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x0566 }
            r17 = 0
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0489
            r22 = r6
            long r5 = r0.lastUpdateTime     // Catch:{ all -> 0x0566 }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0469
            com.google.android.gms.measurement.internal.f r0 = r23.mo39278T()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.r2 r5 = com.google.android.gms.measurement.internal.C9903s2.f46683d0     // Catch:{ all -> 0x0566 }
            r6 = 0
            boolean r0 = r0.mo19337B(r6, r5)     // Catch:{ all -> 0x0566 }
            if (r0 == 0) goto L_0x0463
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0461
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0566 }
            r0 = 0
            r8 = 0
            goto L_0x046b
        L_0x0461:
            r0 = 0
            goto L_0x046b
        L_0x0463:
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0566 }
            goto L_0x0461
        L_0x0469:
            r6 = 0
            r0 = 1
        L_0x046b:
            com.google.android.gms.measurement.internal.zzks r5 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x0475
            r16 = 0
            goto L_0x0477
        L_0x0475:
            r16 = 1
        L_0x0477:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0566 }
            java.lang.String r18 = "auto"
            r13 = r5
            r7 = r21
            r6 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0566 }
            r1.mo39271A(r5, r2)     // Catch:{ all -> 0x0566 }
            goto L_0x0493
        L_0x0489:
            r22 = r6
            r6 = r15
            r7 = r21
            goto L_0x0493
        L_0x048f:
            r22 = r6
            r7 = r14
            r6 = r15
        L_0x0493:
            com.google.android.gms.measurement.internal.h4 r0 = r1.f46876l     // Catch:{ NameNotFoundException -> 0x04a3 }
            android.content.Context r0 = r0.mo19277r()     // Catch:{ NameNotFoundException -> 0x04a3 }
            c5.b r0 = p193c5.C6520c.m28321a(r0)     // Catch:{ NameNotFoundException -> 0x04a3 }
            r5 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo24352c(r4, r5)     // Catch:{ NameNotFoundException -> 0x04a3 }
            goto L_0x04b6
        L_0x04a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d3 r5 = r23.mo19276j()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0566 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r4)     // Catch:{ all -> 0x0566 }
            r5.mo38858c(r13, r4, r0)     // Catch:{ all -> 0x0566 }
            r0 = 0
        L_0x04b6:
            if (r0 == 0) goto L_0x040a
            int r4 = r0.flags     // Catch:{ all -> 0x0566 }
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x04c3
            r4 = 1
            r3.putLong(r6, r4)     // Catch:{ all -> 0x0566 }
        L_0x04c3:
            int r0 = r0.flags     // Catch:{ all -> 0x0566 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x040a
            r4 = 1
            r3.putLong(r7, r4)     // Catch:{ all -> 0x0566 }
            goto L_0x040a
        L_0x04d0:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04d9
            r4 = r22
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0566 }
        L_0x04d9:
            com.google.android.gms.measurement.internal.zzau r0 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.zzas r15 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0566 }
            r15.<init>(r3)     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0566 }
            r1.mo39296i(r0, r2)     // Catch:{ all -> 0x0566 }
            goto L_0x0555
        L_0x04ee:
            r6 = r13
            r3 = r14
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0566 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0566 }
            r1.mo39271A(r0, r2)     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.f4 r0 = r23.mo19273e()     // Catch:{ all -> 0x0566 }
            r0.mo19272b()     // Catch:{ all -> 0x0566 }
            r23.mo39286b()     // Catch:{ all -> 0x0566 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0566 }
            r0.<init>()     // Catch:{ all -> 0x0566 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x0566 }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x0566 }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x0566 }
            boolean r3 = r2.f46963q     // Catch:{ all -> 0x0566 }
            if (r3 == 0) goto L_0x0523
            r0.putLong(r4, r7)     // Catch:{ all -> 0x0566 }
        L_0x0523:
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.zzas r15 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0566 }
            r15.<init>(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0566 }
            r1.mo39296i(r3, r2)     // Catch:{ all -> 0x0566 }
            goto L_0x0555
        L_0x0538:
            boolean r0 = r2.f46956j     // Catch:{ all -> 0x0566 }
            if (r0 == 0) goto L_0x0555
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0566 }
            r0.<init>()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.zzas r15 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0566 }
            r15.<init>(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0566 }
            r1.mo39296i(r3, r2)     // Catch:{ all -> 0x0566 }
        L_0x0555:
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c     // Catch:{ all -> 0x0566 }
            m45454Q(r0)     // Catch:{ all -> 0x0566 }
            r0.mo39007n()     // Catch:{ all -> 0x0566 }
            com.google.android.gms.measurement.internal.i r0 = r1.f46867c
            m45454Q(r0)
            r0.mo39002f0()
            return
        L_0x0566:
            r0 = move-exception
            com.google.android.gms.measurement.internal.i r2 = r1.f46867c
            m45454Q(r2)
            r2.mo39002f0()
            throw r0
        L_0x0570:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9958x8.mo39303o(com.google.android.gms.measurement.internal.zzp):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo39304p() {
        this.f46881q++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo39305q(zzab zzab) {
        zzp H = m45445H((String) C4604n.m20098k(zzab.f46925b));
        if (H != null) {
            mo39306s(zzab, H);
        }
    }

    /* renamed from: r */
    public final Context mo19277r() {
        return this.f46876l.mo19277r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo39306s(zzab zzab, zzp zzp) {
        C4604n.m20098k(zzab);
        C4604n.m20094g(zzab.f46925b);
        C4604n.m20098k(zzab.f46927d);
        C4604n.m20094g(zzab.f46927d.f46942c);
        mo19273e().mo19272b();
        mo39286b();
        if (m45453P(zzp)) {
            if (zzp.f46955i) {
                C9793i iVar = this.f46867c;
                m45454Q(iVar);
                iVar.mo39001e0();
                try {
                    mo39276R(zzp);
                    String str = (String) C4604n.m20098k(zzab.f46925b);
                    C9793i iVar2 = this.f46867c;
                    m45454Q(iVar2);
                    zzab S = iVar2.mo38990S(str, zzab.f46927d.f46942c);
                    if (S != null) {
                        mo19276j().mo19281p().mo38858c("Removing conditional user property", zzab.f46925b, this.f46876l.mo19363D().mo39322f(zzab.f46927d.f46942c));
                        C9793i iVar3 = this.f46867c;
                        m45454Q(iVar3);
                        iVar3.mo38982J(str, zzab.f46927d.f46942c);
                        if (S.f46929f) {
                            C9793i iVar4 = this.f46867c;
                            m45454Q(iVar4);
                            iVar4.mo39005l(str, zzab.f46927d.f46942c);
                        }
                        zzau zzau = zzab.f46935l;
                        if (zzau != null) {
                            zzas zzas = zzau.f46938c;
                            mo39273C((zzau) C4604n.m20098k(mo39293g0().mo19333w0(str, ((zzau) C4604n.m20098k(zzab.f46935l)).f46937b, zzas != null ? zzas.mo39355D0() : null, S.f46926c, zzab.f46935l.f46940e, true, true)), zzp);
                        }
                    } else {
                        mo19276j().mo19287w().mo38858c("Conditional user property doesn't exist", C4667d3.m21474z(zzab.f46925b), this.f46876l.mo19363D().mo39322f(zzab.f46927d.f46942c));
                    }
                    C9793i iVar5 = this.f46867c;
                    m45454Q(iVar5);
                    iVar5.mo39007n();
                } finally {
                    C9793i iVar6 = this.f46867c;
                    m45454Q(iVar6);
                    iVar6.mo39002f0();
                }
            } else {
                mo39276R(zzp);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo39307t(zzks zzks, zzp zzp) {
        mo19273e().mo19272b();
        mo39286b();
        if (m45453P(zzp)) {
            if (!zzp.f46955i) {
                mo39276R(zzp);
            } else if (!"_npa".equals(zzks.f46942c) || zzp.f46965s == null) {
                mo19276j().mo19281p().mo38857b("Removing user property", this.f46876l.mo19363D().mo39322f(zzks.f46942c));
                C9793i iVar = this.f46867c;
                m45454Q(iVar);
                iVar.mo39001e0();
                try {
                    mo39276R(zzp);
                    C9287ob.m43342b();
                    if (this.f46876l.mo19392z().mo19337B((String) null, C9903s2.f46707p0) && this.f46876l.mo19392z().mo19337B((String) null, C9903s2.f46711r0) && "_id".equals(zzks.f46942c)) {
                        C9793i iVar2 = this.f46867c;
                        m45454Q(iVar2);
                        iVar2.mo39005l((String) C4604n.m20098k(zzp.f46948b), "_lair");
                    }
                    C9793i iVar3 = this.f46867c;
                    m45454Q(iVar3);
                    iVar3.mo39005l((String) C4604n.m20098k(zzp.f46948b), zzks.f46942c);
                    C9793i iVar4 = this.f46867c;
                    m45454Q(iVar4);
                    iVar4.mo39007n();
                    mo19276j().mo19281p().mo38857b("User property removed", this.f46876l.mo19363D().mo39322f(zzks.f46942c));
                } finally {
                    C9793i iVar5 = this.f46867c;
                    m45454Q(iVar5);
                    iVar5.mo39002f0();
                }
            } else {
                mo19276j().mo19281p().mo38856a("Falling back to manifest metadata value for ad personalization");
                mo39271A(new zzks("_npa", mo19274f().currentTimeMillis(), Long.valueOf(true != zzp.f46965s.booleanValue() ? 0 : 1), TtmlNode.TEXT_EMPHASIS_AUTO), zzp);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo39308u(zzp zzp) {
        if (this.f46888x != null) {
            ArrayList arrayList = new ArrayList();
            this.f46889y = arrayList;
            arrayList.addAll(this.f46888x);
        }
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        String str = (String) C4604n.m20098k(zzp.f46948b);
        C4604n.m20094g(str);
        iVar.mo19272b();
        iVar.mo39090d();
        try {
            SQLiteDatabase P = iVar.mo38987P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                iVar.f21269a.mo19276j().mo19286v().mo38858c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            iVar.f21269a.mo19276j().mo19282q().mo38858c("Error resetting analytics data. appId, error", C4667d3.m21474z(str), e);
        }
        if (zzp.f46955i) {
            mo39303o(zzp);
        }
    }

    /* renamed from: v */
    public final void mo39309v(String str, C9844m6 m6Var) {
        mo19273e().mo19272b();
        String str2 = this.f46863C;
        if (str2 == null || str2.equals(str) || m6Var != null) {
            this.f46863C = str;
            this.f46862B = m6Var;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo39310w() {
        mo19273e().mo19272b();
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        iVar.mo39004h0();
        if (this.f46873i.f46815j.mo39075a() == 0) {
            this.f46873i.f46815j.mo39076b(mo19274f().currentTimeMillis());
        }
        m45449L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo39311x(zzab zzab) {
        zzp H = m45445H((String) C4604n.m20098k(zzab.f46925b));
        if (H != null) {
            mo39312y(zzab, H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo39312y(zzab zzab, zzp zzp) {
        C4604n.m20098k(zzab);
        C4604n.m20094g(zzab.f46925b);
        C4604n.m20098k(zzab.f46926c);
        C4604n.m20098k(zzab.f46927d);
        C4604n.m20094g(zzab.f46927d.f46942c);
        mo19273e().mo19272b();
        mo39286b();
        if (m45453P(zzp)) {
            if (!zzp.f46955i) {
                mo39276R(zzp);
                return;
            }
            zzab zzab2 = new zzab(zzab);
            boolean z = false;
            zzab2.f46929f = false;
            C9793i iVar = this.f46867c;
            m45454Q(iVar);
            iVar.mo39001e0();
            try {
                C9793i iVar2 = this.f46867c;
                m45454Q(iVar2);
                zzab S = iVar2.mo38990S((String) C4604n.m20098k(zzab2.f46925b), zzab2.f46927d.f46942c);
                if (S != null && !S.f46926c.equals(zzab2.f46926c)) {
                    mo19276j().mo19287w().mo38859d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f46876l.mo19363D().mo39322f(zzab2.f46927d.f46942c), zzab2.f46926c, S.f46926c);
                }
                if (S != null && S.f46929f) {
                    zzab2.f46926c = S.f46926c;
                    zzab2.f46928e = S.f46928e;
                    zzab2.f46932i = S.f46932i;
                    zzab2.f46930g = S.f46930g;
                    zzab2.f46933j = S.f46933j;
                    zzab2.f46929f = true;
                    zzks zzks = zzab2.f46927d;
                    zzab2.f46927d = new zzks(zzks.f46942c, S.f46927d.f46943d, zzks.mo39366C0(), S.f46927d.f46946g);
                } else if (TextUtils.isEmpty(zzab2.f46930g)) {
                    zzks zzks2 = zzab2.f46927d;
                    zzab2.f46927d = new zzks(zzks2.f46942c, zzab2.f46928e, zzks2.mo39366C0(), zzab2.f46927d.f46946g);
                    zzab2.f46929f = true;
                    z = true;
                }
                if (zzab2.f46929f) {
                    zzks zzks3 = zzab2.f46927d;
                    C9730b9 b9Var = new C9730b9((String) C4604n.m20098k(zzab2.f46925b), zzab2.f46926c, zzks3.f46942c, zzks3.f46943d, C4604n.m20098k(zzks3.mo39366C0()));
                    C9793i iVar3 = this.f46867c;
                    m45454Q(iVar3);
                    if (iVar3.mo39016x(b9Var)) {
                        mo19276j().mo19281p().mo38859d("User property updated immediately", zzab2.f46925b, this.f46876l.mo19363D().mo39322f(b9Var.f46186c), b9Var.f46188e);
                    } else {
                        mo19276j().mo19282q().mo38859d("(2)Too many active user properties, ignoring", C4667d3.m21474z(zzab2.f46925b), this.f46876l.mo19363D().mo39322f(b9Var.f46186c), b9Var.f46188e);
                    }
                    if (z && zzab2.f46933j != null) {
                        mo39273C(new zzau(zzab2.f46933j, zzab2.f46928e), zzp);
                    }
                }
                C9793i iVar4 = this.f46867c;
                m45454Q(iVar4);
                if (iVar4.mo39015w(zzab2)) {
                    mo19276j().mo19281p().mo38859d("Conditional property added", zzab2.f46925b, this.f46876l.mo19363D().mo39322f(zzab2.f46927d.f46942c), zzab2.f46927d.mo39366C0());
                } else {
                    mo19276j().mo19282q().mo38859d("Too many conditional properties, ignoring", C4667d3.m21474z(zzab2.f46925b), this.f46876l.mo19363D().mo39322f(zzab2.f46927d.f46942c), zzab2.f46927d.mo39366C0());
                }
                C9793i iVar5 = this.f46867c;
                m45454Q(iVar5);
                iVar5.mo39007n();
            } finally {
                C9793i iVar6 = this.f46867c;
                m45454Q(iVar6);
                iVar6.mo39002f0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo39313z(String str, C11027b bVar) {
        mo19273e().mo19272b();
        mo39286b();
        this.f46861A.put(str, bVar);
        C9793i iVar = this.f46867c;
        m45454Q(iVar);
        C4604n.m20098k(str);
        C4604n.m20098k(bVar);
        iVar.mo19272b();
        iVar.mo39090d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", bVar.mo43336h());
        try {
            if (iVar.mo38987P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                iVar.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert/update consent setting (got -1). appId", C4667d3.m21474z(str));
            }
        } catch (SQLiteException e) {
            iVar.f21269a.mo19276j().mo19282q().mo38858c("Error storing consent setting. appId, error", C4667d3.m21474z(str), e);
        }
    }
}
