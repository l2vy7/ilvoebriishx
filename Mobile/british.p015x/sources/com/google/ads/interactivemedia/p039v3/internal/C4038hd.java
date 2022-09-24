package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hd */
/* compiled from: IMASDK */
public final class C4038hd {

    /* renamed from: a */
    static awx f17375a;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m17315a(com.google.ads.interactivemedia.p039v3.internal.C4037hc r4) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            com.google.ads.interactivemedia.v3.internal.awx r0 = f17375a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.google.ads.interactivemedia.v3.internal.aod<java.lang.String> r0 = com.google.ads.interactivemedia.p039v3.internal.aok.f15495k
            java.lang.Object r0 = r0.mo14149f()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0015
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0030
        L_0x0015:
            r0 = 0
            if (r4 != 0) goto L_0x0019
            goto L_0x002e
        L_0x0019:
            java.lang.String r1 = "wCJZ843zNtSkKMoGSMKdcpsu6ggFXNA5rmM9kRCtd4jNPRIXc7Yg/+6vw3D1/ShN"
            java.lang.String r2 = "fqoL5OqbNwpX0+STfRhZkkeT0CV4fkIJkgX1nxTEgm8="
            java.lang.reflect.Method r4 = r4.mo15905m(r1, r2)
            if (r4 != 0) goto L_0x0024
            goto L_0x002e
        L_0x0024:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r4 = r4.invoke(r0, r1)
            java.lang.String r4 = (java.lang.String) r4
            r0 = r4
        L_0x002e:
            if (r0 == 0) goto L_0x0110
        L_0x0030:
            r4 = 1
            byte[] r4 = m17317c(r0, r4)     // Catch:{ IllegalArgumentException -> 0x0110 }
            com.google.ads.interactivemedia.v3.internal.axe r4 = com.google.ads.interactivemedia.p039v3.internal.axi.m15110a(r4)     // Catch:{  }
            com.google.ads.interactivemedia.v3.internal.bcs r0 = com.google.ads.interactivemedia.p039v3.internal.azo.f15926a     // Catch:{  }
            java.util.List r0 = r0.mo14926a()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0043:
            boolean r1 = r0.hasNext()     // Catch:{  }
            if (r1 == 0) goto L_0x010a
            java.lang.Object r1 = r0.next()     // Catch:{  }
            com.google.ads.interactivemedia.v3.internal.bcd r1 = (com.google.ads.interactivemedia.p039v3.internal.bcd) r1     // Catch:{  }
            java.lang.String r2 = r1.mo14895c()     // Catch:{  }
            boolean r2 = r2.isEmpty()     // Catch:{  }
            if (r2 != 0) goto L_0x0102
            java.lang.String r2 = r1.mo14894a()     // Catch:{  }
            boolean r2 = r2.isEmpty()     // Catch:{  }
            if (r2 != 0) goto L_0x00fa
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            boolean r2 = r2.isEmpty()     // Catch:{  }
            if (r2 != 0) goto L_0x00f2
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkAead"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkMac"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkHybridDecrypt"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkHybridEncrypt"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkPublicKeySign"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkPublicKeyVerify"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkStreamingAead"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            java.lang.String r3 = "TinkDeterministicAead"
            boolean r2 = r2.equals(r3)     // Catch:{  }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = r1.mo14898f()     // Catch:{  }
            com.google.ads.interactivemedia.v3.internal.awt r2 = com.google.ads.interactivemedia.p039v3.internal.axt.m15143a(r2)     // Catch:{  }
            com.google.ads.interactivemedia.v3.internal.axm r3 = r2.mo14716a()     // Catch:{  }
            com.google.ads.interactivemedia.p039v3.internal.axt.m15145c(r3)     // Catch:{  }
            r1.mo14895c()     // Catch:{  }
            r1.mo14894a()     // Catch:{  }
            r1.mo14896d()     // Catch:{  }
            com.google.ads.interactivemedia.v3.internal.awy r2 = r2.mo14717b()     // Catch:{  }
            boolean r1 = r1.mo14897e()     // Catch:{  }
            com.google.ads.interactivemedia.p039v3.internal.axt.m15144b(r2, r1)     // Catch:{  }
            goto L_0x0043
        L_0x00f2:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r4.<init>(r0)     // Catch:{  }
            throw r4     // Catch:{  }
        L_0x00fa:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r4.<init>(r0)     // Catch:{  }
            throw r4     // Catch:{  }
        L_0x0102:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r4.<init>(r0)     // Catch:{  }
            throw r4     // Catch:{  }
        L_0x010a:
            com.google.ads.interactivemedia.v3.internal.awx r4 = com.google.ads.interactivemedia.p039v3.internal.azr.m15303a(r4)     // Catch:{  }
            f17375a = r4     // Catch:{  }
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4038hd.m17315a(com.google.ads.interactivemedia.v3.internal.hc):void");
    }

    /* renamed from: b */
    public static String m17316b(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    /* renamed from: c */
    public static byte[] m17317c(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }

    /* renamed from: d */
    public static Map<String, String> m17318d(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int indexOf = encodedQuery.indexOf(35);
        int i = 0;
        if (indexOf == -1) {
            indexOf = encodedQuery.length();
        }
        do {
            int indexOf2 = encodedQuery.indexOf(38, i);
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            int indexOf3 = encodedQuery.indexOf(61, i);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                indexOf3 = indexOf2;
            }
            linkedHashMap.put(encodedQuery.substring(i, indexOf3), indexOf3 < indexOf2 ? encodedQuery.substring(indexOf3 + 1, indexOf2) : "");
            i = indexOf2 + 1;
        } while (i < indexOf);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    public static void m17319e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: f */
    public static void m17320f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r7 != r1.f18517f) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if ((r17.mo13957o() * 1000) == r3) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        if (r4 == r3) goto L_0x009d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17321g(com.google.ads.interactivemedia.p039v3.internal.alw r17, com.google.ads.interactivemedia.p039v3.internal.C4316rl r18, int r19, com.google.ads.interactivemedia.p039v3.internal.C4312rh r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r17.mo13950h()
            long r3 = r17.mo13963u()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0019
            return r9
        L_0x0019:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            r11 = 7
            r13 = -1
            if (r6 > r11) goto L_0x004b
            int r11 = r1.f18518g
            int r11 = r11 + r13
            if (r6 != r11) goto L_0x00b1
            goto L_0x0054
        L_0x004b:
            r11 = 10
            if (r6 > r11) goto L_0x00b1
            int r6 = r1.f18518g
            r11 = 2
            if (r6 != r11) goto L_0x00b1
        L_0x0054:
            if (r8 != 0) goto L_0x0059
        L_0x0056:
            r14 = 1
            goto L_0x005e
        L_0x0059:
            int r6 = r1.f18520i
            if (r8 != r6) goto L_0x00b1
            goto L_0x0056
        L_0x005e:
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x00b1
            r3 = r20
            boolean r3 = m17330p(r0, r1, r5, r3)
            if (r3 == 0) goto L_0x00b1
            int r3 = m17324j(r0, r12)
            if (r3 == r13) goto L_0x00b1
            int r4 = r1.f18513b
            if (r3 > r4) goto L_0x00b1
            int r3 = r1.f18516e
            if (r7 != 0) goto L_0x0079
            goto L_0x009d
        L_0x0079:
            r4 = 11
            if (r7 > r4) goto L_0x0082
            int r1 = r1.f18517f
            if (r7 == r1) goto L_0x009d
            goto L_0x00b1
        L_0x0082:
            r1 = 12
            if (r7 != r1) goto L_0x008f
            int r1 = r17.mo13957o()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00b1
            goto L_0x009d
        L_0x008f:
            r1 = 14
            if (r7 > r1) goto L_0x00b1
            int r4 = r17.mo13958p()
            if (r7 != r1) goto L_0x009b
            int r4 = r4 * 10
        L_0x009b:
            if (r4 != r3) goto L_0x00b1
        L_0x009d:
            int r1 = r17.mo13957o()
            int r3 = r17.mo13950h()
            byte[] r0 = r17.mo13952j()
            int r3 = r3 + r13
            int r0 = com.google.ads.interactivemedia.p039v3.internal.amm.m14225ao(r0, r2, r3)
            if (r1 != r0) goto L_0x00b1
            return r10
        L_0x00b1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4038hd.m17321g(com.google.ads.interactivemedia.v3.internal.alw, com.google.ads.interactivemedia.v3.internal.rl, int, com.google.ads.interactivemedia.v3.internal.rh):boolean");
    }

    /* renamed from: h */
    public static boolean m17322h(C4307rc rcVar, C4316rl rlVar, int i, C4312rh rhVar) throws IOException {
        long k = rcVar.mo16604k();
        byte[] bArr = new byte[2];
        rcVar.mo16600g(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            rcVar.mo16603j();
            rcVar.mo16602i((int) (k - rcVar.mo16605l()));
            return false;
        }
        alw alw = new alw(16);
        System.arraycopy(bArr, 0, alw.mo13952j(), 0, 2);
        alw.mo13949g(m17326l(rcVar, alw.mo13952j(), 2, 14));
        rcVar.mo16603j();
        rcVar.mo16602i((int) (k - rcVar.mo16605l()));
        return m17321g(alw, rlVar, i, rhVar);
    }

    /* renamed from: i */
    public static long m17323i(C4307rc rcVar, C4316rl rlVar) throws IOException {
        rcVar.mo16603j();
        boolean z = true;
        rcVar.mo16602i(1);
        byte[] bArr = new byte[1];
        rcVar.mo16600g(bArr, 0, 1);
        byte b = bArr[0] & 1;
        rcVar.mo16602i(2);
        int i = 1 != b ? 6 : 7;
        alw alw = new alw(i);
        alw.mo13949g(m17326l(rcVar, alw.mo13952j(), 0, i));
        rcVar.mo16603j();
        C4312rh rhVar = new C4312rh();
        if (1 != b) {
            z = false;
        }
        if (m17330p(alw, rlVar, z, rhVar)) {
            return rhVar.f18506a;
        }
        throw new C4144lb();
    }

    /* renamed from: j */
    public static int m17324j(alw alw, int i) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return alw.mo13957o() + 1;
            case 7:
                return alw.mo13958p() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: k */
    public static C4306rb[] m17325k(C4311rg rgVar) {
        return rgVar.mo15843a();
    }

    /* renamed from: l */
    public static int m17326l(C4307rc rcVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int e = rcVar.mo16598e(bArr, i + i3, i2 - i3);
            if (e == -1) {
                break;
            }
            i3 += e;
        }
        return i3;
    }

    /* renamed from: m */
    public static void m17327m(long j, alw alw, C4327rw[] rwVarArr) {
        int i;
        while (true) {
            boolean z = true;
            if (alw.mo13947e() > 1) {
                int q = m17331q(alw);
                int q2 = m17331q(alw);
                int h = alw.mo13950h() + q2;
                if (q2 == -1 || q2 > alw.mo13947e()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    h = alw.mo13948f();
                } else if (q == 4 && q2 >= 8) {
                    int o = alw.mo13957o();
                    int p = alw.mo13958p();
                    if (p == 49) {
                        i = alw.mo13965w();
                        p = 49;
                    } else {
                        i = 0;
                    }
                    int o2 = alw.mo13957o();
                    if (p == 47) {
                        alw.mo13954l(1);
                    }
                    boolean z2 = o == 181 && (p == 49 || p == 47) && o2 == 3;
                    if (p == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m17328n(j, alw, rwVarArr);
                    }
                }
                alw.mo13951i(h);
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    public static void m17328n(long j, alw alw, C4327rw[] rwVarArr) {
        int o = alw.mo13957o();
        if ((o & 64) != 0) {
            alw.mo13954l(1);
            int i = (o & 31) * 3;
            int h = alw.mo13950h();
            for (C4327rw rwVar : rwVarArr) {
                alw.mo13951i(h);
                rwVar.mo13406d(alw, i);
                rwVar.mo13404b(j, 1, i, 0, (C4326rv) null);
            }
        }
    }

    /* renamed from: o */
    public static void m17329o(C4279qb qbVar, C4279qb qbVar2) {
        if (qbVar != qbVar2) {
            if (qbVar2 != null) {
                qbVar2.mo16570f((C4281qd) null);
            }
            if (qbVar != null) {
                qbVar.mo16571g((C4281qd) null);
            }
        }
    }

    /* renamed from: p */
    private static boolean m17330p(alw alw, C4316rl rlVar, boolean z, C4312rh rhVar) {
        try {
            long K = alw.mo13942K();
            if (!z) {
                K *= (long) rlVar.f18513b;
            }
            rhVar.f18506a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private static int m17331q(alw alw) {
        int i = 0;
        while (alw.mo13947e() != 0) {
            int o = alw.mo13957o();
            i += o;
            if (o != 255) {
                return i;
            }
        }
        return -1;
    }
}
