package com.google.ads.interactivemedia.p038v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ro */
/* compiled from: IMASDK */
public final class C4319ro {

    /* renamed from: a */
    private final alw f18528a = new alw(10);

    /* renamed from: a */
    public final C4507yn mo16617a(C4307rc rcVar, C4527zg zgVar) throws IOException {
        C4507yn ynVar = null;
        int i = 0;
        while (true) {
            try {
                rcVar.mo16600g(this.f18528a.mo13952j(), 0, 10);
                this.f18528a.mo13951i(0);
                if (this.f18528a.mo13961s() != 4801587) {
                    break;
                }
                this.f18528a.mo13954l(3);
                int B = this.f18528a.mo13933B();
                int i2 = B + 10;
                if (ynVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f18528a.mo13952j(), 0, bArr, 0, 10);
                    rcVar.mo16600g(bArr, 10, B);
                    ynVar = new C4529zi(zgVar).mo16896c(bArr, i2);
                } else {
                    rcVar.mo16602i(B);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        rcVar.mo16603j();
        rcVar.mo16602i(i);
        return ynVar;
    }
}
