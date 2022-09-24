package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.m6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7930m6 {

    /* renamed from: d */
    protected static final Comparator<byte[]> f35413d = new C7893l6();

    /* renamed from: a */
    private final List<byte[]> f35414a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f35415b = new ArrayList(64);

    /* renamed from: c */
    private int f35416c = 0;

    public C7930m6(int i) {
    }

    /* renamed from: c */
    private final synchronized void m34707c() {
        while (this.f35416c > 4096) {
            byte[] remove = this.f35414a.remove(0);
            this.f35415b.remove(remove);
            this.f35416c -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33494a(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x002d
            int r0 = r4.length     // Catch:{ all -> 0x002a }
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L_0x0009
            goto L_0x002d
        L_0x0009:
            java.util.List<byte[]> r1 = r3.f35414a     // Catch:{ all -> 0x002a }
            r1.add(r4)     // Catch:{ all -> 0x002a }
            java.util.List<byte[]> r1 = r3.f35415b     // Catch:{ all -> 0x002a }
            java.util.Comparator<byte[]> r2 = f35413d     // Catch:{ all -> 0x002a }
            int r1 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch:{ all -> 0x002a }
            if (r1 >= 0) goto L_0x001b
            int r1 = -r1
            int r1 = r1 + -1
        L_0x001b:
            java.util.List<byte[]> r2 = r3.f35415b     // Catch:{ all -> 0x002a }
            r2.add(r1, r4)     // Catch:{ all -> 0x002a }
            int r4 = r3.f35416c     // Catch:{ all -> 0x002a }
            int r4 = r4 + r0
            r3.f35416c = r4     // Catch:{ all -> 0x002a }
            r3.m34707c()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002d:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7930m6.mo33494a(byte[]):void");
    }

    /* renamed from: b */
    public final synchronized byte[] mo33495b(int i) {
        for (int i2 = 0; i2 < this.f35415b.size(); i2++) {
            byte[] bArr = this.f35415b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f35416c -= length;
                this.f35415b.remove(i2);
                this.f35414a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
