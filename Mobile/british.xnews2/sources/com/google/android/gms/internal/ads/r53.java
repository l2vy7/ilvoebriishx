package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r53 extends AbstractSet<Map.Entry> {

    /* renamed from: b */
    final /* synthetic */ y53 f20682b;

    r53(y53 y53) {
        this.f20682b = y53;
    }

    public final void clear() {
        this.f20682b.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        Map q = this.f20682b.mo19004q();
        if (q != null) {
            return q.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int h = this.f20682b.m21189B(entry.getKey());
            if (h == -1 || !x33.m21118a(y53.m21203o(this.f20682b, h), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        y53 y53 = this.f20682b;
        Map q = y53.mo19004q();
        if (q != null) {
            return q.entrySet().iterator();
        }
        return new p53(y53);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = com.google.android.gms.internal.ads.y53.m21198g(r9.f20682b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.y53 r0 = r9.f20682b
            java.util.Map r0 = r0.mo19004q()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r10 = r0.remove(r10)
            return r10
        L_0x0011:
            boolean r0 = r10 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0066
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.android.gms.internal.ads.y53 r0 = r9.f20682b
            boolean r0 = r0.mo19011w()
            if (r0 == 0) goto L_0x0021
            return r1
        L_0x0021:
            com.google.android.gms.internal.ads.y53 r0 = r9.f20682b
            int r0 = r0.m21188A()
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            com.google.android.gms.internal.ads.y53 r10 = r9.f20682b
            java.lang.Object r5 = com.google.android.gms.internal.ads.y53.m21202n(r10)
            com.google.android.gms.internal.ads.y53 r10 = r9.f20682b
            int[] r6 = r10.m21193b()
            com.google.android.gms.internal.ads.y53 r10 = r9.f20682b
            java.lang.Object[] r7 = r10.m21194c()
            com.google.android.gms.internal.ads.y53 r10 = r9.f20682b
            java.lang.Object[] r8 = r10.m21195d()
            r4 = r0
            int r10 = com.google.android.gms.internal.ads.z53.m21260b(r2, r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 != r2) goto L_0x0050
            return r1
        L_0x0050:
            com.google.android.gms.internal.ads.y53 r1 = r9.f20682b
            r1.mo19009v(r10, r0)
            com.google.android.gms.internal.ads.y53 r10 = r9.f20682b
            int r0 = r10.f21013g
            int r0 = r0 + r2
            r10.f21013g = r0
            com.google.android.gms.internal.ads.y53 r10 = r9.f20682b
            r10.mo19007t()
            r10 = 1
            return r10
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r53.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.f20682b.size();
    }
}
