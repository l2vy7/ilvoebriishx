package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class aq3 {

    /* renamed from: c */
    private static final wo3 f29725c = wo3.m39219a();

    /* renamed from: a */
    protected volatile uq3 f29726a;

    /* renamed from: b */
    private volatile eo3 f29727b;

    /* renamed from: a */
    public final int mo30470a() {
        if (this.f29727b != null) {
            return ((ao3) this.f29727b).f29707f.length;
        }
        if (this.f29726a != null) {
            return this.f29726a.mo33137a();
        }
        return 0;
    }

    /* renamed from: b */
    public final eo3 mo30471b() {
        if (this.f29727b != null) {
            return this.f29727b;
        }
        synchronized (this) {
            if (this.f29727b != null) {
                eo3 eo3 = this.f29727b;
                return eo3;
            }
            if (this.f29726a == null) {
                this.f29727b = eo3.f31444c;
            } else {
                this.f29727b = this.f29726a.mo33364c();
            }
            eo3 eo32 = this.f29727b;
            return eo32;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30472c(com.google.android.gms.internal.ads.uq3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.uq3 r0 = r1.f29726a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.uq3 r0 = r1.f29726a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f29726a = r2     // Catch:{ wp3 -> 0x0011 }
            com.google.android.gms.internal.ads.eo3 r0 = com.google.android.gms.internal.ads.eo3.f31444c     // Catch:{ wp3 -> 0x0011 }
            r1.f29727b = r0     // Catch:{ wp3 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f29726a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.eo3 r2 = com.google.android.gms.internal.ads.eo3.f31444c     // Catch:{ all -> 0x001b }
            r1.f29727b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aq3.mo30472c(com.google.android.gms.internal.ads.uq3):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3)) {
            return false;
        }
        aq3 aq3 = (aq3) obj;
        uq3 uq3 = this.f29726a;
        uq3 uq32 = aq3.f29726a;
        if (uq3 == null && uq32 == null) {
            return mo30471b().equals(aq3.mo30471b());
        }
        if (uq3 != null && uq32 != null) {
            return uq3.equals(uq32);
        }
        if (uq3 != null) {
            aq3.mo30472c(uq3.mo32419d());
            return uq3.equals(aq3.f29726a);
        }
        mo30472c(uq32.mo32419d());
        return this.f29726a.equals(uq32);
    }

    public int hashCode() {
        return 1;
    }
}
