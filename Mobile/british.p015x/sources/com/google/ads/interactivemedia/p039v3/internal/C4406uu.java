package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uu */
/* compiled from: IMASDK */
final class C4406uu extends C4416vd {

    /* renamed from: a */
    private C4316rl f19102a;

    /* renamed from: b */
    private C4405ut f19103b;

    C4406uu() {
    }

    /* renamed from: d */
    private static boolean m19167d(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16689a(boolean z) {
        super.mo16689a(z);
        if (z) {
            this.f19102a = null;
            this.f19103b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16690b(alw alw) {
        if (!m19167d(alw.mo13952j())) {
            return -1;
        }
        int i = (alw.mo13952j()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int j = C4038hd.m17324j(alw, i);
            alw.mo13951i(0);
            return (long) j;
        }
        alw.mo13954l(4);
        alw.mo13942K();
        int j2 = C4038hd.m17324j(alw, i);
        alw.mo13951i(0);
        return (long) j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16691c(alw alw, long j, C4414vb vbVar) {
        byte[] j2 = alw.mo13952j();
        C4316rl rlVar = this.f19102a;
        if (rlVar == null) {
            C4316rl rlVar2 = new C4316rl(j2, 17);
            this.f19102a = rlVar2;
            vbVar.f19132a = rlVar2.mo16610c(Arrays.copyOfRange(j2, 9, alw.mo13948f()), (C4507yn) null);
            return true;
        } else if ((j2[0] & Byte.MAX_VALUE) == 3) {
            C4315rk i = ajq.m13895i(alw);
            C4316rl e = rlVar.mo16612e(i);
            this.f19102a = e;
            this.f19103b = new C4405ut(e, i);
            return true;
        } else if (!m19167d(j2)) {
            return true;
        } else {
            C4405ut utVar = this.f19103b;
            if (utVar != null) {
                utVar.mo16688d(j);
                vbVar.f19133b = this.f19103b;
            }
            aup.m14890u(vbVar.f19132a);
            return false;
        }
    }
}
