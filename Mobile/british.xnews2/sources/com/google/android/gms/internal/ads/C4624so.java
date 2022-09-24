package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.so */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4624so extends C4614jo {

    /* renamed from: c */
    private MessageDigest f20826c;

    /* renamed from: d */
    private final int f20827d;

    /* renamed from: e */
    private final int f20828e;

    public C4624so(int i) {
        int i2 = i >> 3;
        this.f20827d = (i & 7) > 0 ? i2 + 1 : i2;
        this.f20828e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo18456b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f20471a
            monitor-enter(r0)
            java.security.MessageDigest r1 = r8.mo18455a()     // Catch:{ all -> 0x0064 }
            r8.f20826c = r1     // Catch:{ all -> 0x0064 }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return r9
        L_0x0010:
            r1.reset()     // Catch:{ all -> 0x0064 }
            java.security.MessageDigest r1 = r8.f20826c     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x0064 }
            byte[] r9 = r9.getBytes(r3)     // Catch:{ all -> 0x0064 }
            r1.update(r9)     // Catch:{ all -> 0x0064 }
            java.security.MessageDigest r9 = r8.f20826c     // Catch:{ all -> 0x0064 }
            byte[] r9 = r9.digest()     // Catch:{ all -> 0x0064 }
            int r1 = r9.length     // Catch:{ all -> 0x0064 }
            int r3 = r8.f20827d     // Catch:{ all -> 0x0064 }
            if (r1 <= r3) goto L_0x002e
            r1 = r3
        L_0x002e:
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x0064 }
            java.lang.System.arraycopy(r9, r2, r3, r2, r1)     // Catch:{ all -> 0x0064 }
            int r9 = r8.f20828e     // Catch:{ all -> 0x0064 }
            r9 = r9 & 7
            if (r9 <= 0) goto L_0x0062
            r4 = 0
        L_0x003b:
            r9 = 8
            if (r2 >= r1) goto L_0x004b
            if (r2 <= 0) goto L_0x0042
            long r4 = r4 << r9
        L_0x0042:
            byte r9 = r3[r2]     // Catch:{ all -> 0x0064 }
            r9 = r9 & 255(0xff, float:3.57E-43)
            long r6 = (long) r9     // Catch:{ all -> 0x0064 }
            long r4 = r4 + r6
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004b:
            int r1 = r8.f20828e     // Catch:{ all -> 0x0064 }
            r1 = r1 & 7
            int r1 = 8 - r1
            long r1 = r4 >>> r1
            int r4 = r8.f20827d     // Catch:{ all -> 0x0064 }
        L_0x0055:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0062
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r1
            int r6 = (int) r5     // Catch:{ all -> 0x0064 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x0064 }
            r3[r4] = r5     // Catch:{ all -> 0x0064 }
            long r1 = r1 >>> r9
            goto L_0x0055
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return r3
        L_0x0064:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0067:
            throw r9
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4624so.mo18456b(java.lang.String):byte[]");
    }
}
