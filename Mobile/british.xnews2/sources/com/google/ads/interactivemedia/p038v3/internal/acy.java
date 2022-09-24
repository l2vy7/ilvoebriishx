package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acy */
/* compiled from: IMASDK */
final class acy implements C4327rw {

    /* renamed from: a */
    public C4120ke f14215a;

    /* renamed from: b */
    private final int f14216b;

    /* renamed from: c */
    private final int f14217c;

    /* renamed from: d */
    private final C4120ke f14218d;

    /* renamed from: e */
    private final C4305ra f14219e = new C4305ra();

    /* renamed from: f */
    private C4327rw f14220f;

    /* renamed from: g */
    private long f14221g;

    public acy(int i, int i2, C4120ke keVar) {
        this.f14216b = i;
        this.f14217c = i2;
        this.f14218d = keVar;
    }

    /* renamed from: a */
    public final void mo13403a(C4120ke keVar) {
        C4120ke keVar2 = this.f14218d;
        if (keVar2 != null) {
            keVar = keVar.mo16127b(keVar2);
        }
        this.f14215a = keVar;
        C4327rw rwVar = this.f14220f;
        int i = amm.f15298a;
        rwVar.mo13403a(keVar);
    }

    /* renamed from: b */
    public final void mo13404b(long j, int i, int i2, int i3, C4326rv rvVar) {
        long j2 = this.f14221g;
        if (j2 != C6540C.TIME_UNSET && j >= j2) {
            this.f14220f = this.f14219e;
        }
        C4327rw rwVar = this.f14220f;
        int i4 = amm.f15298a;
        rwVar.mo13404b(j, i, i2, i3, rvVar);
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
        C4327rw rwVar = this.f14220f;
        int i2 = amm.f15298a;
        return rwVar.mo13405c(ajd, i, z);
    }

    /* renamed from: f */
    public final void mo13408f(alw alw, int i) {
        C4327rw rwVar = this.f14220f;
        int i2 = amm.f15298a;
        rwVar.mo13406d(alw, i);
    }

    /* renamed from: g */
    public final void mo13473g(acw acw, long j) {
        if (acw == null) {
            this.f14220f = this.f14219e;
            return;
        }
        this.f14221g = j;
        C4327rw c = acw.mo13472c(this.f14217c);
        this.f14220f = c;
        C4120ke keVar = this.f14215a;
        if (keVar != null) {
            c.mo13403a(keVar);
        }
    }
}
