package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vx */
/* compiled from: IMASDK */
final class C4436vx {

    /* renamed from: a */
    private final C4327rw f19283a;

    /* renamed from: b */
    private boolean f19284b;

    /* renamed from: c */
    private boolean f19285c;

    /* renamed from: d */
    private boolean f19286d;

    /* renamed from: e */
    private int f19287e;

    /* renamed from: f */
    private int f19288f;

    /* renamed from: g */
    private long f19289g;

    /* renamed from: h */
    private long f19290h;

    public C4436vx(C4327rw rwVar) {
        this.f19283a = rwVar;
    }

    /* renamed from: a */
    public final void mo16720a() {
        this.f19284b = false;
        this.f19285c = false;
        this.f19286d = false;
        this.f19287e = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16721b(int r5, long r6) {
        /*
            r4 = this;
            r4.f19287e = r5
            r0 = 0
            r4.f19286d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L_0x0013
            if (r5 != r1) goto L_0x0011
            r5 = 179(0xb3, float:2.51E-43)
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r4.f19284b = r1
            if (r5 != r2) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r4.f19285c = r3
            r4.f19288f = r0
            r4.f19290h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4436vx.mo16721b(int, long):void");
    }

    /* renamed from: c */
    public final void mo16722c(byte[] bArr, int i, int i2) {
        if (this.f19285c) {
            int i3 = this.f19288f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f19286d = ((bArr[i4] & 192) >> 6) == 0;
                this.f19285c = false;
                return;
            }
            this.f19288f = i3 + (i2 - i);
        }
    }

    /* renamed from: d */
    public final void mo16723d(long j, int i, boolean z) {
        if (this.f19287e == 182 && z && this.f19284b) {
            long j2 = this.f19289g;
            this.f19283a.mo13404b(this.f19290h, this.f19286d ? 1 : 0, (int) (j - j2), i, (C4326rv) null);
        }
        if (this.f19287e != 179) {
            this.f19289g = j;
        }
    }
}
