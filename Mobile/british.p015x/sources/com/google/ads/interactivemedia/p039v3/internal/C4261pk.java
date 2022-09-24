package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pk */
/* compiled from: IMASDK */
public final class C4261pk implements C4215ns {

    /* renamed from: b */
    private int f18355b;

    /* renamed from: c */
    private float f18356c = 1.0f;

    /* renamed from: d */
    private float f18357d = 1.0f;

    /* renamed from: e */
    private C4213nq f18358e;

    /* renamed from: f */
    private C4213nq f18359f;

    /* renamed from: g */
    private C4213nq f18360g;

    /* renamed from: h */
    private C4213nq f18361h;

    /* renamed from: i */
    private boolean f18362i;

    /* renamed from: j */
    private C4260pj f18363j;

    /* renamed from: k */
    private ByteBuffer f18364k;

    /* renamed from: l */
    private ShortBuffer f18365l;

    /* renamed from: m */
    private ByteBuffer f18366m;

    /* renamed from: n */
    private long f18367n;

    /* renamed from: o */
    private long f18368o;

    /* renamed from: p */
    private boolean f18369p;

    public C4261pk() {
        C4213nq nqVar = C4213nq.f18095a;
        this.f18358e = nqVar;
        this.f18359f = nqVar;
        this.f18360g = nqVar;
        this.f18361h = nqVar;
        ByteBuffer byteBuffer = C4215ns.f18100a;
        this.f18364k = byteBuffer;
        this.f18365l = byteBuffer.asShortBuffer();
        this.f18366m = byteBuffer;
        this.f18355b = -1;
    }

    /* renamed from: a */
    public final C4213nq mo16373a(C4213nq nqVar) throws C4214nr {
        if (nqVar.f18098d == 2) {
            int i = this.f18355b;
            if (i == -1) {
                i = nqVar.f18096b;
            }
            this.f18358e = nqVar;
            C4213nq nqVar2 = new C4213nq(i, nqVar.f18097c, 2);
            this.f18359f = nqVar2;
            this.f18362i = true;
            return nqVar2;
        }
        throw new C4214nr(nqVar);
    }

    /* renamed from: b */
    public final boolean mo16374b() {
        if (this.f18359f.f18096b != -1) {
            return Math.abs(this.f18356c + -1.0f) >= 1.0E-4f || Math.abs(this.f18357d + -1.0f) >= 1.0E-4f || this.f18359f.f18096b != this.f18358e.f18096b;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo16375c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C4260pj pjVar = this.f18363j;
            aup.m14890u(pjVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f18367n += (long) remaining;
            pjVar.mo16497b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: d */
    public final void mo16376d() {
        C4260pj pjVar = this.f18363j;
        if (pjVar != null) {
            pjVar.mo16499d();
        }
        this.f18369p = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo16377e() {
        int f;
        C4260pj pjVar = this.f18363j;
        if (pjVar != null && (f = pjVar.mo16501f()) > 0) {
            if (this.f18364k.capacity() < f) {
                ByteBuffer order = ByteBuffer.allocateDirect(f).order(ByteOrder.nativeOrder());
                this.f18364k = order;
                this.f18365l = order.asShortBuffer();
            } else {
                this.f18364k.clear();
                this.f18365l.clear();
            }
            pjVar.mo16498c(this.f18365l);
            this.f18368o += (long) f;
            this.f18364k.limit(f);
            this.f18366m = this.f18364k;
        }
        ByteBuffer byteBuffer = this.f18366m;
        this.f18366m = C4215ns.f18100a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f18363j;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16378f() {
        /*
            r3 = this;
            boolean r0 = r3.f18369p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.ads.interactivemedia.v3.internal.pj r0 = r3.f18363j
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo16501f()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4261pk.mo16378f():boolean");
    }

    /* renamed from: g */
    public final void mo16379g() {
        if (mo16374b()) {
            C4213nq nqVar = this.f18358e;
            this.f18360g = nqVar;
            C4213nq nqVar2 = this.f18359f;
            this.f18361h = nqVar2;
            if (this.f18362i) {
                this.f18363j = new C4260pj(nqVar.f18096b, nqVar.f18097c, this.f18356c, this.f18357d, nqVar2.f18096b);
            } else {
                C4260pj pjVar = this.f18363j;
                if (pjVar != null) {
                    pjVar.mo16500e();
                }
            }
        }
        this.f18366m = C4215ns.f18100a;
        this.f18367n = 0;
        this.f18368o = 0;
        this.f18369p = false;
    }

    /* renamed from: h */
    public final void mo16380h() {
        this.f18356c = 1.0f;
        this.f18357d = 1.0f;
        C4213nq nqVar = C4213nq.f18095a;
        this.f18358e = nqVar;
        this.f18359f = nqVar;
        this.f18360g = nqVar;
        this.f18361h = nqVar;
        ByteBuffer byteBuffer = C4215ns.f18100a;
        this.f18364k = byteBuffer;
        this.f18365l = byteBuffer.asShortBuffer();
        this.f18366m = byteBuffer;
        this.f18355b = -1;
        this.f18362i = false;
        this.f18363j = null;
        this.f18367n = 0;
        this.f18368o = 0;
        this.f18369p = false;
    }

    /* renamed from: i */
    public final void mo16502i(float f) {
        if (this.f18356c != f) {
            this.f18356c = f;
            this.f18362i = true;
        }
    }

    /* renamed from: j */
    public final void mo16503j(float f) {
        if (this.f18357d != f) {
            this.f18357d = f;
            this.f18362i = true;
        }
    }

    /* renamed from: k */
    public final long mo16504k(long j) {
        if (this.f18368o >= 1024) {
            long j2 = this.f18367n;
            C4260pj pjVar = this.f18363j;
            aup.m14890u(pjVar);
            long a = j2 - ((long) pjVar.mo16496a());
            int i = this.f18361h.f18096b;
            int i2 = this.f18360g.f18096b;
            if (i == i2) {
                return amm.m14196M(j, a, this.f18368o);
            }
            return amm.m14196M(j, a * ((long) i), this.f18368o * ((long) i2));
        }
        double d = (double) this.f18356c;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }
}
