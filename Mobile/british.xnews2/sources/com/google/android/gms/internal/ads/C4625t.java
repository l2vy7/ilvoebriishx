package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.t */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4625t {

    /* renamed from: a */
    private final byte[] f20829a = new byte[10];

    /* renamed from: b */
    private boolean f20830b;

    /* renamed from: c */
    private int f20831c;

    /* renamed from: d */
    private long f20832d;

    /* renamed from: e */
    private int f20833e;

    /* renamed from: f */
    private int f20834f;

    /* renamed from: g */
    private int f20835g;

    @RequiresNonNull({"#1.output"})
    /* renamed from: a */
    public final void mo18831a(C4622s sVar) {
        if (this.f20831c > 0) {
            sVar.f20774X.mo30358e(this.f20832d, this.f20833e, this.f20834f, this.f20835g, sVar.f20785j);
            this.f20831c = 0;
        }
    }

    /* renamed from: b */
    public final void mo18832b() {
        this.f20830b = false;
        this.f20831c = 0;
    }

    @RequiresNonNull({"#1.output"})
    /* renamed from: c */
    public final void mo18833c(C4622s sVar, long j, int i, int i2, int i3) {
        if (this.f20830b) {
            int i4 = this.f20831c;
            int i5 = i4 + 1;
            this.f20831c = i5;
            if (i4 == 0) {
                this.f20832d = j;
                this.f20833e = i;
                this.f20834f = 0;
            }
            this.f20834f += i2;
            this.f20835g = i3;
            if (i5 >= 16) {
                mo18831a(sVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo18834d(wb4 wb4) throws IOException {
        if (!this.f20830b) {
            ((qb4) wb4).mo33311e(this.f20829a, 0, 10, false);
            wb4.zzj();
            byte[] bArr = this.f20829a;
            int i = ab4.f29597g;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f20830b = true;
            }
        }
    }
}
