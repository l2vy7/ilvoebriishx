package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkw */
/* compiled from: IMASDK */
public class bkw {

    /* renamed from: a */
    protected volatile bln f16613a;

    /* renamed from: b */
    private volatile bjq f16614b;

    static {
        bka.m16275a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p039v3.internal.bln mo15409a(com.google.ads.interactivemedia.p039v3.internal.bln r2) {
        /*
            r1 = this;
            com.google.ads.interactivemedia.v3.internal.bln r0 = r1.f16613a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.google.ads.interactivemedia.v3.internal.bln r0 = r1.f16613a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f16613a = r2     // Catch:{ bkt -> 0x0013 }
            com.google.ads.interactivemedia.v3.internal.bjq r0 = com.google.ads.interactivemedia.p039v3.internal.bjq.f16482b     // Catch:{ bkt -> 0x0013 }
            r1.f16614b = r0     // Catch:{ bkt -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f16613a = r2     // Catch:{ all -> 0x001d }
            com.google.ads.interactivemedia.v3.internal.bjq r2 = com.google.ads.interactivemedia.p039v3.internal.bjq.f16482b     // Catch:{ all -> 0x001d }
            r1.f16614b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.google.ads.interactivemedia.v3.internal.bln r2 = r1.f16613a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bkw.mo15409a(com.google.ads.interactivemedia.v3.internal.bln):com.google.ads.interactivemedia.v3.internal.bln");
    }

    /* renamed from: b */
    public final int mo15410b() {
        if (this.f16614b != null) {
            return this.f16614b.mo15201c();
        }
        if (this.f16613a != null) {
            return this.f16613a.mo15392al();
        }
        return 0;
    }

    /* renamed from: c */
    public final bjq mo15411c() {
        if (this.f16614b != null) {
            return this.f16614b;
        }
        synchronized (this) {
            if (this.f16614b != null) {
                bjq bjq = this.f16614b;
                return bjq;
            }
            if (this.f16613a == null) {
                this.f16614b = bjq.f16482b;
            } else {
                this.f16614b = this.f16613a.mo15166af();
            }
            bjq bjq2 = this.f16614b;
            return bjq2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkw)) {
            return false;
        }
        bkw bkw = (bkw) obj;
        bln bln = this.f16613a;
        bln bln2 = bkw.f16613a;
        if (bln == null && bln2 == null) {
            return mo15411c().equals(bkw.mo15411c());
        }
        if (bln != null && bln2 != null) {
            return bln.equals(bln2);
        }
        if (bln != null) {
            return bln.equals(bkw.mo15409a(bln.mo15387ag()));
        }
        return mo15409a(bln2.mo15387ag()).equals(bln2);
    }

    public int hashCode() {
        return 1;
    }
}
