package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjv */
/* compiled from: IMASDK */
public final class bjv extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    bjv() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    bjv(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 == 0) goto L_0x0011
            java.lang.String r3 = r1.concat(r3)
            goto L_0x0016
        L_0x0011:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L_0x0016:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bjv.<init>(java.lang.String, java.lang.Throwable):void");
    }

    bjv(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
