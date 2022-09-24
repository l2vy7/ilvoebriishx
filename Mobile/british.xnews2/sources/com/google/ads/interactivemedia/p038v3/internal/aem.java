package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aem */
/* compiled from: IMASDK */
public final class aem implements C4327rw {

    /* renamed from: a */
    final /* synthetic */ aen f14416a;

    /* renamed from: b */
    private final acg f14417b;

    /* renamed from: c */
    private final C4121kf f14418c = new C4121kf();

    /* renamed from: d */
    private long f14419d = C6540C.TIME_UNSET;

    /* renamed from: e */
    private final C4269ps f14420e = new C4269ps();

    aem(aen aen, ajl ajl) {
        this.f14416a = aen;
        this.f14417b = acg.m13017L(ajl);
    }

    /* renamed from: a */
    public final void mo13403a(C4120ke keVar) {
        this.f14417b.mo13403a(keVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if ("3".equals(r13) != false) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13404b(long r8, int r10, int r11, int r12, com.google.ads.interactivemedia.p038v3.internal.C4326rv r13) {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.acg r0 = r7.f14417b
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.mo13404b(r1, r3, r4, r5, r6)
        L_0x000a:
            com.google.ads.interactivemedia.v3.internal.acg r8 = r7.f14417b
            r9 = 0
            boolean r8 = r8.mo13427y(r9)
            if (r8 == 0) goto L_0x009c
            com.google.ads.interactivemedia.v3.internal.ps r8 = r7.f14420e
            r8.mo16508a()
            com.google.ads.interactivemedia.v3.internal.acg r8 = r7.f14417b
            com.google.ads.interactivemedia.v3.internal.kf r10 = r7.f14418c
            com.google.ads.interactivemedia.v3.internal.ps r11 = r7.f14420e
            int r8 = r8.mo13428z(r10, r11, r9, r9)
            r10 = -4
            if (r8 != r10) goto L_0x002d
            com.google.ads.interactivemedia.v3.internal.ps r8 = r7.f14420e
            r8.mo16522k()
            com.google.ads.interactivemedia.v3.internal.ps r8 = r7.f14420e
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            if (r8 == 0) goto L_0x000a
            long r10 = r8.f18399d
            com.google.ads.interactivemedia.v3.internal.aen r12 = r7.f14416a
            com.google.ads.interactivemedia.v3.internal.yr r12 = r12.f14422b
            com.google.ads.interactivemedia.v3.internal.yn r8 = r12.mo16840a(r8)
            if (r8 == 0) goto L_0x000a
            com.google.ads.interactivemedia.v3.internal.ym r8 = r8.mo16832b(r9)
            com.google.ads.interactivemedia.v3.internal.yq r8 = (com.google.ads.interactivemedia.p038v3.internal.C4510yq) r8
            java.lang.String r12 = r8.f19692a
            java.lang.String r13 = r8.f19693b
            java.lang.String r0 = "urn:mpeg:dash:event:2012"
            boolean r12 = r0.equals(r12)
            r0 = 1
            if (r12 == 0) goto L_0x006b
            java.lang.String r12 = "1"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x006a
            java.lang.String r12 = "2"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x006a
            java.lang.String r12 = "3"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006a:
            r9 = 1
        L_0x006b:
            if (r9 == 0) goto L_0x000a
        L_0x006d:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            byte[] r8 = r8.f19696e     // Catch:{ lb -> 0x007d }
            java.lang.String r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14253w(r8)     // Catch:{ lb -> 0x007d }
            long r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14195L(r8)     // Catch:{ lb -> 0x007d }
            goto L_0x007e
        L_0x007d:
            r8 = r12
        L_0x007e:
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x000a
            com.google.ads.interactivemedia.v3.internal.aek r12 = new com.google.ads.interactivemedia.v3.internal.aek
            r12.<init>(r10, r8)
            com.google.ads.interactivemedia.v3.internal.aen r8 = r7.f14416a
            android.os.Handler r8 = r8.f14423c
            com.google.ads.interactivemedia.v3.internal.aen r9 = r7.f14416a
            android.os.Handler r9 = r9.f14423c
            android.os.Message r9 = r9.obtainMessage(r0, r12)
            r8.sendMessage(r9)
            goto L_0x000a
        L_0x009c:
            com.google.ads.interactivemedia.v3.internal.acg r8 = r7.f14417b
            r8.mo13395E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.aem.mo13404b(long, int, int, int, com.google.ads.interactivemedia.v3.internal.rv):void");
    }

    /* renamed from: c */
    public final int mo13405c(ajd ajd, int i, boolean z) throws IOException {
        return ajq.m13892f(this, ajd, i, z);
    }

    /* renamed from: d */
    public final void mo13406d(alw alw, int i) {
        ajq.m13893g(this, alw, i);
    }

    /* renamed from: e */
    public final int mo13407e(ajd ajd, int i, boolean z) throws IOException {
        return ajq.m13892f(this.f14417b, ajd, i, z);
    }

    /* renamed from: f */
    public final void mo13408f(alw alw, int i) {
        ajq.m13893g(this.f14417b, alw, i);
    }

    /* renamed from: g */
    public final void mo13554g(ada ada) {
        long j = this.f14419d;
        if (j == C6540C.TIME_UNSET || ada.f14245j > j) {
            this.f14419d = ada.f14245j;
        }
        this.f14416a.mo13562h();
    }

    /* renamed from: h */
    public final boolean mo13555h(ada ada) {
        long j = this.f14419d;
        boolean z = false;
        if (j != C6540C.TIME_UNSET && j < ada.f14244i) {
            z = true;
        }
        return this.f14416a.mo13561e(z);
    }

    /* renamed from: i */
    public final void mo13556i() {
        this.f14417b.mo13409g();
    }
}
