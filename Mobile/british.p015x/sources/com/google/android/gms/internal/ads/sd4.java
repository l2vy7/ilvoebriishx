package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sd4 extends ud4 {

    /* renamed from: b */
    private long f38955b = C6540C.TIME_UNSET;

    /* renamed from: c */
    private long[] f38956c = new long[0];

    /* renamed from: d */
    private long[] f38957d = new long[0];

    public sd4() {
        super(new ub4());
    }

    /* renamed from: g */
    private static Double m37383g(uq2 uq2) {
        return Double.valueOf(Double.longBitsToDouble(uq2.mo35256z()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m37384h(com.google.android.gms.internal.ads.uq2 r4, int r5) {
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
            java.lang.Double r0 = m37383g(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo35237g(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo35252v()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0047
            int r2 = r4.mo35249s()
            java.lang.Object r2 = m37384h(r4, r2)
            if (r2 == 0) goto L_0x0044
            r1.add(r2)
        L_0x0044:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0047:
            return r1
        L_0x0048:
            java.util.HashMap r4 = m37386j(r4)
            return r4
        L_0x004d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0052:
            java.lang.String r0 = m37385i(r4)
            int r1 = r4.mo35249s()
            r2 = 9
            if (r1 != r2) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Object r1 = m37384h(r4, r1)
            if (r1 == 0) goto L_0x0052
            r5.put(r0, r1)
            goto L_0x0052
        L_0x0069:
            java.lang.String r4 = m37385i(r4)
            return r4
        L_0x006e:
            int r4 = r4.mo35249s()
            if (r4 != r1) goto L_0x0075
            r0 = 1
        L_0x0075:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007a:
            java.lang.Double r4 = m37383g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sd4.m37384h(com.google.android.gms.internal.ads.uq2, int):java.lang.Object");
    }

    /* renamed from: i */
    private static String m37385i(uq2 uq2) {
        int w = uq2.mo35253w();
        int k = uq2.mo35241k();
        uq2.mo35237g(w);
        return new String(uq2.mo35238h(), k, w);
    }

    /* renamed from: j */
    private static HashMap<String, Object> m37386j(uq2 uq2) {
        int v = uq2.mo35252v();
        HashMap<String, Object> hashMap = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            String i2 = m37385i(uq2);
            Object h = m37384h(uq2, uq2.mo35249s());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo34112a(uq2 uq2) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo34113b(uq2 uq2, long j) {
        if (uq2.mo35249s() != 2 || !"onMetaData".equals(m37385i(uq2)) || uq2.mo35249s() != 8) {
            return false;
        }
        HashMap<String, Object> j2 = m37386j(uq2);
        Object obj = j2.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f38955b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = j2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f38956c = new long[size];
                this.f38957d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f38956c = new long[0];
                        this.f38957d = new long[0];
                    } else {
                        this.f38956c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f38957d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f38956c = new long[0];
                this.f38957d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo34698d() {
        return this.f38955b;
    }

    /* renamed from: e */
    public final long[] mo34699e() {
        return this.f38957d;
    }

    /* renamed from: f */
    public final long[] mo34700f() {
        return this.f38956c;
    }
}
