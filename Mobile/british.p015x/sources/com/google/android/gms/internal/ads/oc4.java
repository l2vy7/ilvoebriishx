package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oc4 {

    /* renamed from: a */
    private final uq2 f36385a = new uq2(10);

    /* renamed from: a */
    public final zzdd mo33867a(wb4 wb4, qe4 qe4) throws IOException {
        zzdd zzdd = null;
        int i = 0;
        while (true) {
            try {
                ((qb4) wb4).mo33311e(this.f36385a.mo35238h(), 0, 10, false);
                this.f36385a.mo35236f(0);
                if (this.f36385a.mo35251u() != 4801587) {
                    break;
                }
                this.f36385a.mo35237g(3);
                int r = this.f36385a.mo35248r();
                int i2 = r + 10;
                if (zzdd == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f36385a.mo35238h(), 0, bArr, 0, 10);
                    ((qb4) wb4).mo33311e(bArr, 10, r, false);
                    zzdd = se4.m37395a(bArr, i2, qe4, new u91());
                } else {
                    ((qb4) wb4).mo34304j(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        wb4.zzj();
        ((qb4) wb4).mo34304j(i, false);
        return zzdd;
    }
}
