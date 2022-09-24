package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class mb4 {

    /* renamed from: a */
    protected final gb4 f35471a;

    /* renamed from: b */
    protected final lb4 f35472b;

    /* renamed from: c */
    protected ib4 f35473c;

    /* renamed from: d */
    private final int f35474d;

    protected mb4(jb4 jb4, lb4 lb4, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f35472b = lb4;
        this.f35474d = i;
        this.f35471a = new gb4(jb4, j, 0, j3, j4, j5, j6);
    }

    /* renamed from: f */
    protected static final int m34745f(wb4 wb4, long j, tc4 tc4) {
        if (j == wb4.zze()) {
            return 0;
        }
        tc4.f39386a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m34746g(wb4 wb4, long j) throws IOException {
        long zze = j - wb4.zze();
        if (zze < 0 || zze > 262144) {
            return false;
        }
        ((qb4) wb4).mo34305k((int) zze, false);
        return true;
    }

    /* renamed from: a */
    public final int mo33520a(wb4 wb4, tc4 tc4) throws IOException {
        while (true) {
            ib4 ib4 = this.f35473c;
            nu1.m20743b(ib4);
            long b = ib4.f33196f;
            long a = ib4.f33197g;
            long c = ib4.f33198h;
            if (a - b <= ((long) this.f35474d)) {
                mo33522c(false, b);
                return m34745f(wb4, b, tc4);
            } else if (!m34746g(wb4, c)) {
                return m34745f(wb4, c, tc4);
            } else {
                wb4.zzj();
                kb4 a2 = this.f35472b.mo33023a(wb4, ib4.f33192b);
                int a3 = a2.f34231a;
                if (a3 == -3) {
                    mo33522c(false, c);
                    return m34745f(wb4, c, tc4);
                } else if (a3 == -2) {
                    ib4.m33168h(ib4, a2.f34232b, a2.f34233c);
                } else if (a3 != -1) {
                    m34746g(wb4, a2.f34233c);
                    mo33522c(true, a2.f34233c);
                    return m34745f(wb4, a2.f34233c, tc4);
                } else {
                    ib4.m33167g(ib4, a2.f34232b, a2.f34233c);
                }
            }
        }
    }

    /* renamed from: b */
    public final wc4 mo33521b() {
        return this.f35471a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo33522c(boolean z, long j) {
        this.f35473c = null;
        this.f35472b.zzb();
    }

    /* renamed from: d */
    public final void mo33523d(long j) {
        long j2 = j;
        ib4 ib4 = this.f35473c;
        if (ib4 == null || ib4.f33191a != j2) {
            ib4 ib42 = r1;
            ib4 ib43 = new ib4(j, this.f35471a.mo32050g(j2), 0, this.f35471a.f32224c, this.f35471a.f32225d, this.f35471a.f32226e, this.f35471a.f32227f);
            this.f35473c = ib42;
        }
    }

    /* renamed from: e */
    public final boolean mo33524e() {
        return this.f35473c != null;
    }
}
