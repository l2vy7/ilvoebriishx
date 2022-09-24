package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sl */
/* compiled from: IMASDK */
final class C4343sl extends C4345sn {

    /* renamed from: b */
    private long f18622b = C6540C.TIME_UNSET;

    /* renamed from: c */
    private long[] f18623c = new long[0];

    /* renamed from: d */
    private long[] f18624d = new long[0];

    public C4343sl() {
        super(new C4305ra());
    }

    /* renamed from: g */
    private static Double m18865g(alw alw) {
        return Double.valueOf(Double.longBitsToDouble(alw.mo13967y()));
    }

    /* renamed from: h */
    private static String m18866h(alw alw) {
        int p = alw.mo13958p();
        int h = alw.mo13950h();
        alw.mo13954l(p);
        return new String(alw.mo13952j(), h, p);
    }

    /* renamed from: i */
    private static HashMap<String, Object> m18867i(alw alw) {
        int C = alw.mo13934C();
        HashMap<String, Object> hashMap = new HashMap<>(C);
        for (int i = 0; i < C; i++) {
            String h = m18866h(alw);
            Object j = m18868j(alw, alw.mo13957o());
            if (j != null) {
                hashMap.put(h, j);
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m18868j(com.google.ads.interactivemedia.p038v3.internal.alw r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007a
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x006e
            r1 = 2
            if (r5 == r1) goto L_0x0069
            r2 = 3
            if (r5 == r2) goto L_0x004d
            r2 = 8
            if (r5 == r2) goto L_0x0048
            r2 = 10
            if (r5 == r2) goto L_0x002c
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m18865g(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo13954l(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo13934C()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0047
            int r2 = r4.mo13957o()
            java.lang.Object r2 = m18868j(r4, r2)
            if (r2 == 0) goto L_0x0044
            r1.add(r2)
        L_0x0044:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0047:
            return r1
        L_0x0048:
            java.util.HashMap r4 = m18867i(r4)
            return r4
        L_0x004d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0052:
            java.lang.String r0 = m18866h(r4)
            int r1 = r4.mo13957o()
            r2 = 9
            if (r1 != r2) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Object r1 = m18868j(r4, r1)
            if (r1 == 0) goto L_0x0052
            r5.put(r0, r1)
            goto L_0x0052
        L_0x0069:
            java.lang.String r4 = m18866h(r4)
            return r4
        L_0x006e:
            int r4 = r4.mo13957o()
            if (r4 != r1) goto L_0x0075
            r0 = 1
        L_0x0075:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007a:
            java.lang.Double r4 = m18865g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4343sl.m18868j(com.google.ads.interactivemedia.v3.internal.alw, int):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16632a(alw alw) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16633b(alw alw, long j) {
        if (alw.mo13957o() != 2 || !"onMetaData".equals(m18866h(alw)) || alw.mo13957o() != 8) {
            return false;
        }
        HashMap<String, Object> i = m18867i(alw);
        Object obj = i.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f18622b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = i.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f18623c = new long[size];
                this.f18624d = new long[size];
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f18623c = new long[0];
                        this.f18624d = new long[0];
                    } else {
                        this.f18623c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f18624d[i2] = ((Double) obj5).longValue();
                        i2++;
                    }
                }
                this.f18623c = new long[0];
                this.f18624d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: c */
    public final long mo16634c() {
        return this.f18622b;
    }

    /* renamed from: d */
    public final long[] mo16635d() {
        return this.f18623c;
    }

    /* renamed from: e */
    public final long[] mo16636e() {
        return this.f18624d;
    }
}
