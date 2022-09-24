package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ww */
/* compiled from: IMASDK */
final class C4462ww implements C4455wp {

    /* renamed from: a */
    final /* synthetic */ C4464wy f19493a;

    /* renamed from: b */
    private final alv f19494b = new alv(new byte[4]);

    public C4462ww(C4464wy wyVar) {
        this.f19493a = wyVar;
    }

    /* renamed from: a */
    public final void mo16746a(amk amk, C4309re reVar, C4469xc xcVar) {
    }

    /* renamed from: b */
    public final void mo16747b(alw alw) {
        if (alw.mo13957o() == 0 && (alw.mo13957o() & 128) != 0) {
            alw.mo13954l(6);
            int e = alw.mo13947e() / 4;
            for (int i = 0; i < e; i++) {
                alw.mo13955m(this.f19494b, 4);
                int i2 = this.f19494b.mo13927i(16);
                this.f19494b.mo13925g(3);
                if (i2 == 0) {
                    this.f19494b.mo13925g(13);
                } else {
                    int i3 = this.f19494b.mo13927i(13);
                    if (this.f19493a.f19507h.get(i3) == null) {
                        this.f19493a.f19507h.put(i3, new C4456wq(new C4463wx(this.f19493a, i3)));
                        C4464wy.m19418r(this.f19493a);
                    }
                }
            }
            if (this.f19493a.f19501b != 2) {
                this.f19493a.f19507h.remove(0);
            }
        }
    }
}
