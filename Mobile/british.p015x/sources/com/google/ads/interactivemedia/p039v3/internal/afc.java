package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afc */
/* compiled from: IMASDK */
public final class afc extends afa {

    /* renamed from: e */
    final afi f14500e;

    /* renamed from: f */
    final afi f14501f;

    /* renamed from: g */
    final long f14502g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afc(aew aew, long j, long j2, long j3, long j4, long j5, List<afd> list, long j6, afi afi, afi afi2, long j7, long j8) {
        super(aew, j, j2, j3, j5, list, j6, j7, j8);
        this.f14500e = afi;
        this.f14501f = afi2;
        this.f14502g = j4;
    }

    /* renamed from: d */
    public final aew mo13593d(aez aez, long j) {
        long j2;
        List<afd> list = this.f14495c;
        if (list != null) {
            j2 = list.get((int) (j - this.f14493a)).f14503a;
        } else {
            j2 = (j - this.f14493a) * this.f14494b;
        }
        long j3 = j2;
        afi afi = this.f14501f;
        C4120ke keVar = aez.f14486b;
        return new aew(afi.mo13601b(keVar.f17670a, j, keVar.f17677h, j3), 0, -1);
    }

    /* renamed from: h */
    public final int mo13597h(long j) {
        List<afd> list = this.f14495c;
        if (list != null) {
            return list.size();
        }
        long j2 = this.f14502g;
        if (j2 != -1) {
            return (int) ((j2 - this.f14493a) + 1);
        }
        if (j != C6540C.TIME_UNSET) {
            return (int) amm.m14190G(j, (this.f14494b * 1000000) / this.f14508i);
        }
        return -1;
    }

    /* renamed from: i */
    public final aew mo13598i(aez aez) {
        afi afi = this.f14500e;
        if (afi == null) {
            return this.f14507h;
        }
        C4120ke keVar = aez.f14486b;
        return new aew(afi.mo13601b(keVar.f17670a, 0, keVar.f17677h, 0), 0, -1);
    }
}
