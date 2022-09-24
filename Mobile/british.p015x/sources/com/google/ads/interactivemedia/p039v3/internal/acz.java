package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acz */
/* compiled from: IMASDK */
public final class acz implements C4309re, adc {

    /* renamed from: b */
    public static final adb f14222b = acx.f14214a;

    /* renamed from: c */
    private static final C4321rq f14223c = new C4321rq();

    /* renamed from: d */
    private final C4306rb f14224d;

    /* renamed from: e */
    private final int f14225e;

    /* renamed from: f */
    private final C4120ke f14226f;

    /* renamed from: g */
    private final SparseArray<acy> f14227g = new SparseArray<>();

    /* renamed from: h */
    private boolean f14228h;

    /* renamed from: i */
    private long f14229i;

    /* renamed from: j */
    private C4324rt f14230j;

    /* renamed from: k */
    private C4120ke[] f14231k;

    /* renamed from: l */
    private acw f14232l;

    public acz(C4306rb rbVar, int i, C4120ke keVar) {
        this.f14224d = rbVar;
        this.f14225e = i;
        this.f14226f = keVar;
    }

    /* renamed from: ba */
    public final C4327rw mo13362ba(int i, int i2) {
        acy acy = this.f14227g.get(i);
        if (acy == null) {
            aup.m14887r(this.f14231k == null);
            acy = new acy(i, i2, i2 == this.f14225e ? this.f14226f : null);
            acy.mo13473g(this.f14232l, this.f14229i);
            this.f14227g.put(i, acy);
        }
        return acy;
    }

    /* renamed from: bb */
    public final void mo13363bb() {
        C4120ke[] keVarArr = new C4120ke[this.f14227g.size()];
        for (int i = 0; i < this.f14227g.size(); i++) {
            C4120ke keVar = this.f14227g.valueAt(i).f14215a;
            aup.m14889t(keVar);
            keVarArr[i] = keVar;
        }
        this.f14231k = keVarArr;
    }

    /* renamed from: bc */
    public final void mo13364bc(C4324rt rtVar) {
        this.f14230j = rtVar;
    }

    /* renamed from: d */
    public final C4300qw mo13474d() {
        C4324rt rtVar = this.f14230j;
        if (rtVar instanceof C4300qw) {
            return (C4300qw) rtVar;
        }
        return null;
    }

    /* renamed from: e */
    public final C4120ke[] mo13475e() {
        return this.f14231k;
    }

    /* renamed from: f */
    public final void mo13476f() {
        this.f14224d.mo13693h();
    }

    /* renamed from: g */
    public final boolean mo13477g(C4307rc rcVar) throws IOException {
        int f = this.f14224d.mo13691f(rcVar, f14223c);
        aup.m14887r(f != 1);
        return f == 0;
    }

    /* renamed from: h */
    public final void mo13478h(acw acw, long j, long j2) {
        this.f14232l = acw;
        this.f14229i = j2;
        if (!this.f14228h) {
            this.f14224d.mo13690e(this);
            if (j != C6540C.TIME_UNSET) {
                this.f14224d.mo13692g(0, j);
            }
            this.f14228h = true;
            return;
        }
        C4306rb rbVar = this.f14224d;
        if (j == C6540C.TIME_UNSET) {
            j = 0;
        }
        rbVar.mo13692g(0, j);
        for (int i = 0; i < this.f14227g.size(); i++) {
            this.f14227g.valueAt(i).mo13473g(acw, j2);
        }
    }
}
