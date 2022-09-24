package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tc */
/* compiled from: IMASDK */
final class C4361tc {

    /* renamed from: a */
    private final byte[] f18726a = new byte[10];

    /* renamed from: b */
    private boolean f18727b;

    /* renamed from: c */
    private int f18728c;

    /* renamed from: d */
    private long f18729d;

    /* renamed from: e */
    private int f18730e;

    /* renamed from: f */
    private int f18731f;

    /* renamed from: g */
    private int f18732g;

    /* renamed from: a */
    public final void mo16642a() {
        this.f18727b = false;
        this.f18728c = 0;
    }

    /* renamed from: b */
    public final void mo16643b(C4307rc rcVar) throws IOException {
        if (!this.f18727b) {
            rcVar.mo16600g(this.f18726a, 0, 10);
            rcVar.mo16603j();
            byte[] bArr = this.f18726a;
            int i = C4207nk.f18076a;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f18727b = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo16644c(C4360tb tbVar, long j, int i, int i2, int i3) {
        if (this.f18727b) {
            int i4 = this.f18728c;
            int i5 = i4 + 1;
            this.f18728c = i5;
            if (i4 == 0) {
                this.f18729d = j;
                this.f18730e = i;
                this.f18731f = 0;
            }
            this.f18731f += i2;
            this.f18732g = i3;
            if (i5 >= 16) {
                mo16645d(tbVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo16645d(C4360tb tbVar) {
        if (this.f18728c > 0) {
            tbVar.f18696V.mo13404b(this.f18729d, this.f18730e, this.f18731f, this.f18732g, tbVar.f18708i);
            this.f18728c = 0;
        }
    }
}
