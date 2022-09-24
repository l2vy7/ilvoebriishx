package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.clearcut.C4586a;
import com.google.android.gms.internal.clearcut.C8921i5;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p193c5.C6520c;
import p258v5.C11059a;

/* renamed from: com.google.android.gms.internal.clearcut.w5 */
public final class C9027w5 implements C4586a.C4588b {

    /* renamed from: b */
    private static final Charset f44778b = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: c */
    private static final C8972p f44779c;

    /* renamed from: d */
    private static final C8972p f44780d = new C8972p(C11059a.m49541a("com.google.android.gms.clearcut.public")).mo37107f("gms:playlog:service:sampling_").mo37108h("LogSampling__");

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C4649f<C8921i5>> f44781e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final HashMap<String, C4649f<String>> f44782f = new HashMap<>();

    /* renamed from: g */
    private static Boolean f44783g = null;

    /* renamed from: h */
    private static Long f44784h = null;

    /* renamed from: i */
    private static final C4649f<Boolean> f44785i;

    /* renamed from: a */
    private final Context f44786a;

    static {
        C8972p h = new C8972p(C11059a.m49541a("com.google.android.gms.clearcut.public")).mo37107f("gms:playlog:service:samplingrules_").mo37108h("LogSamplingRules__");
        f44779c = h;
        f44785i = h.mo37106e("enable_log_sampling_rules", false);
    }

    public C9027w5(Context context) {
        this.f44786a = context;
        if (context != null) {
            C4649f.m21399b(context);
        }
    }

    /* renamed from: b */
    private static long m42474b(String str, long j) {
        if (str == null || str.isEmpty()) {
            return C8992r5.m42322c(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f44778b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return C8992r5.m42322c(allocate.array());
    }

    /* renamed from: c */
    private static C8921i5.C8923b m42475c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i = 0;
        if (indexOf >= 0) {
            i = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return (C8921i5.C8923b) C8921i5.C8923b.m41864B().mo36974o(str2).mo36975p(parseLong).mo36976s(parseLong2).mo36908n();
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("negative values not supported: ");
            sb.append(parseLong);
            sb.append("/");
            sb.append(parseLong2);
            Log.e("LogSamplerImpl", sb.toString());
            return null;
        } catch (NumberFormatException e) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e);
            return null;
        }
    }

    /* renamed from: d */
    private static boolean m42476d(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0 ? 1 : (j == 0 ? 0 : -1)) >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) < j2;
    }

    /* renamed from: e */
    private static boolean m42477e(Context context) {
        if (f44783g == null) {
            f44783g = Boolean.valueOf(C6520c.m28321a(context).mo24350a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f44783g.booleanValue();
    }

    /* renamed from: f */
    private static long m42478f(Context context) {
        if (f44784h == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (m42477e(context)) {
                j = C9048z5.m42547a(context.getContentResolver(), "android_id", 0);
            }
            f44784h = Long.valueOf(j);
        }
        return f44784h.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r3 = f44779c.mo37104a(r1, com.google.android.gms.internal.clearcut.C8921i5.m41859t(), com.google.android.gms.internal.clearcut.C9034x5.f44797a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17880a(com.google.android.gms.clearcut.zze r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.clearcut.zzr r0 = r13.f28851b
            java.lang.String r1 = r0.f44830h
            int r0 = r0.f44826d
            com.google.android.gms.internal.clearcut.n5 r13 = r13.f28859j
            r2 = 0
            if (r13 == 0) goto L_0x000e
            int r13 = r13.f44656h
            goto L_0x000f
        L_0x000e:
            r13 = 0
        L_0x000f:
            com.google.android.gms.internal.clearcut.f<java.lang.Boolean> r3 = f44785i
            java.lang.Object r3 = r3.mo19168a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L_0x0077
            if (r1 == 0) goto L_0x0027
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            if (r0 < 0) goto L_0x002e
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x002f
        L_0x002e:
            r1 = r4
        L_0x002f:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r13 = r12.f44786a
            if (r13 == 0) goto L_0x0056
            boolean r13 = m42477e(r13)
            if (r13 != 0) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.f<java.lang.String>> r13 = f44782f
            java.lang.Object r0 = r13.get(r1)
            com.google.android.gms.internal.clearcut.f r0 = (com.google.android.gms.internal.clearcut.C4649f) r0
            if (r0 != 0) goto L_0x004f
            com.google.android.gms.internal.clearcut.p r0 = f44780d
            com.google.android.gms.internal.clearcut.f r0 = r0.mo37105b(r1, r4)
            r13.put(r1, r0)
        L_0x004f:
            java.lang.Object r13 = r0.mo19168a()
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
        L_0x0056:
            com.google.android.gms.internal.clearcut.i5$b r13 = m42475c(r4)
            if (r13 == 0) goto L_0x00fb
            java.lang.String r0 = r13.mo36972x()
            android.content.Context r1 = r12.f44786a
            long r1 = m42478f(r1)
            long r3 = m42474b(r0, r1)
            long r5 = r13.mo36973y()
            long r7 = r13.mo36969A()
            boolean r13 = m42476d(r3, r5, r7)
            return r13
        L_0x0077:
            if (r1 == 0) goto L_0x0080
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            if (r0 < 0) goto L_0x0087
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0088
        L_0x0087:
            r1 = r4
        L_0x0088:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r0 = r12.f44786a
            if (r0 != 0) goto L_0x0093
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00bc
        L_0x0093:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.f<com.google.android.gms.internal.clearcut.i5>> r0 = f44781e
            java.lang.Object r3 = r0.get(r1)
            com.google.android.gms.internal.clearcut.f r3 = (com.google.android.gms.internal.clearcut.C4649f) r3
            if (r3 != 0) goto L_0x00b2
            com.google.android.gms.internal.clearcut.p r3 = f44779c
            com.google.android.gms.internal.clearcut.i5 r4 = com.google.android.gms.internal.clearcut.C8921i5.m41859t()
            com.google.android.gms.internal.clearcut.o r5 = com.google.android.gms.internal.clearcut.C9034x5.f44797a
            com.google.android.gms.internal.clearcut.f r3 = r3.mo37104a(r1, r4, r5)
            java.lang.Object r0 = r0.putIfAbsent(r1, r3)
            com.google.android.gms.internal.clearcut.f r0 = (com.google.android.gms.internal.clearcut.C4649f) r0
            if (r0 == 0) goto L_0x00b2
            r3 = r0
        L_0x00b2:
            java.lang.Object r0 = r3.mo19168a()
            com.google.android.gms.internal.clearcut.i5 r0 = (com.google.android.gms.internal.clearcut.C8921i5) r0
            java.util.List r0 = r0.mo36968s()
        L_0x00bc:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.clearcut.i5$b r1 = (com.google.android.gms.internal.clearcut.C8921i5.C8923b) r1
            boolean r3 = r1.mo36971w()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.mo36970s()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.mo36970s()
            if (r3 != r13) goto L_0x00c0
        L_0x00de:
            java.lang.String r3 = r1.mo36972x()
            android.content.Context r4 = r12.f44786a
            long r4 = m42478f(r4)
            long r6 = m42474b(r3, r4)
            long r8 = r1.mo36973y()
            long r10 = r1.mo36969A()
            boolean r1 = m42476d(r6, r8, r10)
            if (r1 != 0) goto L_0x00c0
            return r2
        L_0x00fb:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C9027w5.mo17880a(com.google.android.gms.clearcut.zze):boolean");
    }
}
