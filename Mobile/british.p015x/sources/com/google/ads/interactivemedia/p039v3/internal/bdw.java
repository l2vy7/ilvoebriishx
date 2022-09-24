package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdw */
/* compiled from: IMASDK */
public final class bdw implements bag {

    /* renamed from: a */
    private final ThreadLocal<Mac> f16192a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f16193b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Key f16194c;

    /* renamed from: d */
    private final int f16195d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bdw(java.lang.String r6, java.security.Key r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            com.google.ads.interactivemedia.v3.internal.bdv r0 = new com.google.ads.interactivemedia.v3.internal.bdv
            r0.<init>(r5)
            r5.f16192a = r0
            r5.f16193b = r6
            r5.f16194c = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L_0x008e
            int r7 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r7) {
                case -1823053428: goto L_0x004b;
                case 392315023: goto L_0x0041;
                case 392315118: goto L_0x0037;
                case 392316170: goto L_0x002d;
                case 392317873: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0055
        L_0x0023:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 4
            goto L_0x0056
        L_0x002d:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 2
            goto L_0x0056
        L_0x0041:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 0
            goto L_0x0056
        L_0x0055:
            r7 = -1
        L_0x0056:
            if (r7 == 0) goto L_0x0086
            if (r7 == r4) goto L_0x0083
            if (r7 == r3) goto L_0x0080
            if (r7 == r2) goto L_0x007d
            if (r7 == r1) goto L_0x0078
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r6.length()
            if (r1 == 0) goto L_0x006f
            java.lang.String r6 = r0.concat(r6)
            goto L_0x0074
        L_0x006f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L_0x0074:
            r7.<init>(r6)
            throw r7
        L_0x0078:
            r6 = 64
            r5.f16195d = r6
            goto L_0x008a
        L_0x007d:
            r6 = 48
            goto L_0x0088
        L_0x0080:
            r6 = 32
            goto L_0x0088
        L_0x0083:
            r6 = 28
            goto L_0x0088
        L_0x0086:
            r6 = 20
        L_0x0088:
            r5.f16195d = r6
        L_0x008a:
            r0.get()
            return
        L_0x008e:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bdw.<init>(java.lang.String, java.security.Key):void");
    }

    /* renamed from: a */
    public final byte[] mo14784a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.f16195d) {
            this.f16192a.get().update(bArr);
            return Arrays.copyOf(this.f16192a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
