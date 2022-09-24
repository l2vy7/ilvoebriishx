package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjx */
/* compiled from: IMASDK */
final class bjx implements bne {

    /* renamed from: a */
    private final bjw f16506a;

    private bjx(bjw bjw) {
        bkr.m16347j(bjw, "output");
        this.f16506a = bjw;
        bjw.f16502a = this;
    }

    /* renamed from: a */
    public static bjx m16233a(bjw bjw) {
        bjx bjx = bjw.f16502a;
        return bjx != null ? bjx : new bjx(bjw);
    }

    /* renamed from: A */
    public final void mo15321A(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15310an(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15319w(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo15322B(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15312ap(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15320x(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo15323C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16182J(list.get(i4).intValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15308al(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15298ab(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo15324D(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15307ak(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15303ag(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo15325E(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof bky) {
            bky bky = (bky) list;
            while (i2 < list.size()) {
                Object g = bky.mo15414g(i2);
                if (g instanceof String) {
                    this.f16506a.mo15304ah(i, (String) g);
                } else {
                    this.f16506a.mo15305ai(i, (bjq) g);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15304ah(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo15326F(int i, List<bjq> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16506a.mo15305ai(i, list.get(i2));
        }
    }

    /* renamed from: G */
    public final void mo15327G(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16183K(list.get(i4).intValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15309am(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15299ac(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo15328H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15310an(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15300ad(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo15329I(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15312ap(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15302af(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo15330J(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16184L(list.get(i4).intValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15309am(bjw.m16192T(list.get(i2).intValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15317u(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: K */
    public final void mo15331K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16186N(list.get(i4).longValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15311ao(bjw.m16193U(list.get(i2).longValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15318v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: L */
    public final <K, V> void mo15332L(int i, blg<K, V> blg, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f16506a.mo15297aa(i, 2);
            this.f16506a.mo15309am(bli.m16413j(blg, next.getKey(), next.getValue()));
            bli.m16412i(this.f16506a, blg, next.getKey(), next.getValue());
        }
    }

    /* renamed from: b */
    public final void mo15333b(int i, int i2) throws IOException {
        this.f16506a.mo15300ad(i, i2);
    }

    /* renamed from: c */
    public final void mo15334c(int i, long j) throws IOException {
        this.f16506a.mo15301ae(i, j);
    }

    /* renamed from: d */
    public final void mo15335d(int i, long j) throws IOException {
        this.f16506a.mo15302af(i, j);
    }

    /* renamed from: e */
    public final void mo15336e(int i, float f) throws IOException {
        this.f16506a.mo15319w(i, f);
    }

    /* renamed from: f */
    public final void mo15337f(int i, double d) throws IOException {
        this.f16506a.mo15320x(i, d);
    }

    /* renamed from: g */
    public final void mo15338g(int i, int i2) throws IOException {
        this.f16506a.mo15298ab(i, i2);
    }

    /* renamed from: h */
    public final void mo15339h(int i, long j) throws IOException {
        this.f16506a.mo15301ae(i, j);
    }

    /* renamed from: i */
    public final void mo15340i(int i, int i2) throws IOException {
        this.f16506a.mo15298ab(i, i2);
    }

    /* renamed from: j */
    public final void mo15341j(int i, long j) throws IOException {
        this.f16506a.mo15302af(i, j);
    }

    /* renamed from: k */
    public final void mo15342k(int i, int i2) throws IOException {
        this.f16506a.mo15300ad(i, i2);
    }

    /* renamed from: l */
    public final void mo15343l(int i, boolean z) throws IOException {
        this.f16506a.mo15303ag(i, z);
    }

    /* renamed from: m */
    public final void mo15344m(int i, String str) throws IOException {
        this.f16506a.mo15304ah(i, str);
    }

    /* renamed from: n */
    public final void mo15345n(int i, bjq bjq) throws IOException {
        this.f16506a.mo15305ai(i, bjq);
    }

    /* renamed from: o */
    public final void mo15346o(int i, int i2) throws IOException {
        this.f16506a.mo15299ac(i, i2);
    }

    /* renamed from: p */
    public final void mo15347p(int i, int i2) throws IOException {
        this.f16506a.mo15317u(i, i2);
    }

    /* renamed from: q */
    public final void mo15348q(int i, long j) throws IOException {
        this.f16506a.mo15318v(i, j);
    }

    /* renamed from: r */
    public final void mo15349r(int i, Object obj, bly bly) throws IOException {
        this.f16506a.mo15306aj(i, (bln) obj, bly);
    }

    /* renamed from: s */
    public final void mo15350s(int i, Object obj, bly bly) throws IOException {
        bjw bjw = this.f16506a;
        bjw.mo15297aa(i, 3);
        bly.mo15452f((bln) obj, bjw.f16502a);
        bjw.mo15297aa(i, 4);
    }

    /* renamed from: t */
    public final void mo15351t(int i) throws IOException {
        this.f16506a.mo15297aa(i, 3);
    }

    /* renamed from: u */
    public final void mo15352u(int i) throws IOException {
        this.f16506a.mo15297aa(i, 4);
    }

    /* renamed from: v */
    public final void mo15353v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16182J(list.get(i4).intValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15308al(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15298ab(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo15354w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15310an(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15300ad(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo15355x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16185M(list.get(i4).longValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15311ao(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15301ae(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo15356y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += bjw.m16185M(list.get(i4).longValue());
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15311ao(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15301ae(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo15357z(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16506a.mo15297aa(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f16506a.mo15309am(i3);
            while (i2 < list.size()) {
                this.f16506a.mo15312ap(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16506a.mo15302af(i, list.get(i2).longValue());
            i2++;
        }
    }
}
