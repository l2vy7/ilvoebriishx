package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a04 implements m80, s04, ua4, n54, h84, g24 {

    /* renamed from: b */
    private final ov1 f20082b;

    /* renamed from: c */
    private final gf0 f20083c;

    /* renamed from: d */
    private final gh0 f20084d = new gh0();

    /* renamed from: e */
    private final zz3 f20085e;

    /* renamed from: f */
    private final SparseArray<b04> f20086f;

    /* renamed from: g */
    private eb2<c04> f20087g;

    /* renamed from: h */
    private kb0 f20088h;

    /* renamed from: i */
    private y42 f20089i;

    /* renamed from: j */
    private boolean f20090j;

    public a04(ov1 ov1) {
        this.f20082b = ov1;
        this.f20087g = new eb2<>(d13.m20296a(), ov1, uz3.f40225a);
        gf0 gf0 = new gf0();
        this.f20083c = gf0;
        this.f20085e = new zz3(gf0);
        this.f20086f = new SparseArray<>();
    }

    /* renamed from: V */
    public static /* synthetic */ void m20112V(a04 a04) {
        b04 T = a04.mo18034T();
        a04.mo18043b0(T, 1036, new wz3(T));
        a04.f20087g.mo31516e();
    }

    /* renamed from: e0 */
    private final b04 m20113e0(c54 c54) {
        gi0 gi0;
        Objects.requireNonNull(this.f20088h);
        if (c54 == null) {
            gi0 = null;
        } else {
            gi0 = this.f20085e.mo36148a(c54);
        }
        if (c54 != null && gi0 != null) {
            return mo18035U(gi0, gi0.mo32144n(c54.f34474a, this.f20083c).f32286c, c54);
        }
        int zzg = ((vw3) this.f20088h).zzg();
        gi0 zzm = this.f20088h.zzm();
        if (zzg >= zzm.mo31951c()) {
            zzm = gi0.f32342a;
        }
        return mo18035U(zzm, zzg, (c54) null);
    }

    /* renamed from: f0 */
    private final b04 m20114f0(int i, c54 c54) {
        kb0 kb0 = this.f20088h;
        Objects.requireNonNull(kb0);
        if (c54 == null) {
            gi0 zzm = kb0.zzm();
            if (i >= zzm.mo31951c()) {
                zzm = gi0.f32342a;
            }
            return mo18035U(zzm, i, (c54) null);
        } else if (this.f20085e.mo36148a(c54) != null) {
            return m20113e0(c54);
        } else {
            return mo18035U(gi0.f32342a, i, c54);
        }
    }

    /* renamed from: g0 */
    private final b04 m20115g0() {
        return m20113e0(this.f20085e.mo36151d());
    }

    /* renamed from: h0 */
    private final b04 m20116h0() {
        return m20113e0(this.f20085e.mo36152e());
    }

    /* renamed from: A */
    public final void mo18015A(int i, c54 c54, u44 u44, z44 z44) {
        b04 f0 = m20114f0(i, c54);
        mo18043b0(f0, 1001, new bz3(f0, u44, z44));
    }

    /* renamed from: B */
    public final void mo18016B(int i, long j) {
        b04 g0 = m20115g0();
        mo18043b0(g0, 1023, new fy3(g0, i, j));
    }

    /* renamed from: C */
    public final void mo18017C(Exception exc) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1038, new hz3(h0, exc));
    }

    /* renamed from: D */
    public final void mo18018D(boolean z, int i) {
        b04 T = mo18034T();
        mo18043b0(T, 5, new rz3(T, z, i));
    }

    /* renamed from: E */
    public final void mo18019E(mc3 mc3) {
        b04 g0 = m20115g0();
        mo18043b0(g0, AnalyticsListener.EVENT_AUDIO_DISABLED, new vy3(g0, mc3));
    }

    /* renamed from: F */
    public final void mo18020F(gi0 gi0, int i) {
        zz3 zz3 = this.f20085e;
        kb0 kb0 = this.f20088h;
        Objects.requireNonNull(kb0);
        zz3.mo36155i(kb0);
        b04 T = mo18034T();
        mo18043b0(T, 0, new dy3(T, i));
    }

    /* renamed from: G */
    public final void mo18021G(int i, c54 c54, u44 u44, z44 z44) {
        b04 f0 = m20114f0(i, c54);
        mo18043b0(f0, 1000, new cz3(f0, u44, z44));
    }

    /* renamed from: H */
    public final void mo18022H(String str, long j, long j2) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1021, new mz3(h0, str, j2, j));
    }

    /* renamed from: I */
    public final /* synthetic */ void mo18023I(b34 b34) {
    }

    /* renamed from: J */
    public final void mo18024J(int i, c54 c54, u44 u44, z44 z44, IOException iOException, boolean z) {
        b04 f0 = m20114f0(i, c54);
        mo18043b0(f0, 1003, new dz3(f0, u44, z44, iOException, z));
    }

    /* renamed from: K */
    public final void mo18025K(float f) {
        b04 h0 = m20116h0();
        mo18043b0(h0, AnalyticsListener.EVENT_VOLUME_CHANGED, new xz3(h0, f));
    }

    /* renamed from: L */
    public final void mo18026L(C8281w wVar, nd3 nd3) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1010, new ly3(h0, wVar, nd3));
    }

    /* renamed from: M */
    public final void mo18027M(iw0 iw0) {
        b04 T = mo18034T();
        mo18043b0(T, 2, new ty3(T, iw0));
    }

    /* renamed from: N */
    public final void mo18028N(int i, c54 c54, z44 z44) {
        b04 f0 = m20114f0(i, c54);
        mo18043b0(f0, 1004, new ez3(f0, z44));
    }

    /* renamed from: O */
    public final void mo18029O(C7916lt ltVar) {
        b04 T = mo18034T();
        mo18043b0(T, 14, new oy3(T, ltVar));
    }

    /* renamed from: P */
    public final void mo18030P(String str) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1024, new kz3(h0, str));
    }

    /* renamed from: Q */
    public final void mo18031Q(C7764ho hoVar, int i) {
        b04 T = mo18034T();
        mo18043b0(T, 1, new ny3(T, hoVar, i));
    }

    /* renamed from: R */
    public final void mo18032R(cm0 cm0, cn0 cn0) {
        b04 T = mo18034T();
        mo18043b0(T, 2, new sy3(T, cm0, cn0));
    }

    /* renamed from: S */
    public final void mo18033S(f00 f00) {
        C7880ku kuVar;
        b04 b04 = null;
        if ((f00 instanceof vk3) && (kuVar = ((vk3) f00).f40456j) != null) {
            b04 = m20113e0(new c54(kuVar));
        }
        if (b04 == null) {
            b04 = mo18034T();
        }
        mo18043b0(b04, 10, new py3(b04, f00));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final b04 mo18034T() {
        return m20113e0(this.f20085e.mo36149b());
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    /* renamed from: U */
    public final b04 mo18035U(gi0 gi0, int i, c54 c54) {
        gi0 gi02 = gi0;
        int i2 = i;
        boolean z = true;
        c54 c542 = true == gi0.mo32145o() ? null : c54;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!gi02.equals(this.f20088h.zzm()) || i2 != ((vw3) this.f20088h).zzg()) {
            z = false;
        }
        long j = 0;
        if (c542 == null || !c542.mo33183b()) {
            if (z) {
                j = this.f20088h.zzj();
            } else if (!gi0.mo32145o()) {
                long j2 = gi02.mo31485e(i2, this.f20084d, 0).f32319k;
                j = xy3.m39692d(0);
            }
        } else if (z && this.f20088h.zze() == c542.f34475b && this.f20088h.zzf() == c542.f34476c) {
            j = this.f20088h.zzk();
        }
        return new b04(elapsedRealtime, gi0, i, c542, j, this.f20088h.zzm(), ((vw3) this.f20088h).zzg(), this.f20085e.mo36149b(), this.f20088h.zzk(), this.f20088h.zzl());
    }

    /* renamed from: W */
    public final void mo18036W(c04 c04) {
        this.f20087g.mo31513b(c04);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final /* synthetic */ void mo18037X(kb0 kb0, c04 c04, fb4 fb4) {
        SparseArray<b04> sparseArray = this.f20086f;
        SparseArray sparseArray2 = new SparseArray(fb4.mo31798b());
        for (int i = 0; i < fb4.mo31798b(); i++) {
            int a = fb4.mo31797a(i);
            b04 b04 = sparseArray.get(a);
            Objects.requireNonNull(b04);
            sparseArray2.append(a, b04);
        }
    }

    /* renamed from: Y */
    public final void mo18038Y() {
        if (!this.f20090j) {
            b04 T = mo18034T();
            this.f20090j = true;
            mo18043b0(T, -1, new ay3(T));
        }
    }

    /* renamed from: Z */
    public final void mo18039Z() {
        y42 y42 = this.f20089i;
        nu1.m20743b(y42);
        y42.mo35874d(new vz3(this));
    }

    /* renamed from: a */
    public final void mo18040a(int i, long j, long j2) {
        b04 e0 = m20113e0(this.f20085e.mo36150c());
        mo18043b0(e0, 1006, new hy3(e0, i, j, j2));
    }

    /* renamed from: a0 */
    public final void mo18041a0(c04 c04) {
        this.f20087g.mo31517f(c04);
    }

    /* renamed from: b */
    public final void mo18042b(mc3 mc3) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1020, new zy3(h0, mc3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void mo18043b0(b04 b04, int i, b82<c04> b82) {
        this.f20086f.put(i, b04);
        eb2<c04> eb2 = this.f20087g;
        eb2.mo31515d(i, b82);
        eb2.mo31514c();
    }

    /* renamed from: c */
    public final void mo18044c(Exception exc) {
        b04 h0 = m20116h0();
        mo18043b0(h0, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new gz3(h0, exc));
    }

    /* renamed from: c0 */
    public final void mo18045c0(kb0 kb0, Looper looper) {
        boolean z = true;
        if (this.f20088h != null && !this.f20085e.f42840b.isEmpty()) {
            z = false;
        }
        nu1.m20747f(z);
        this.f20088h = kb0;
        this.f20089i = this.f20082b.mo34015a(looper, (Handler.Callback) null);
        this.f20087g = this.f20087g.mo31512a(looper, new tz3(this, kb0));
    }

    /* renamed from: d */
    public final void mo18046d(String str, long j, long j2) {
        b04 h0 = m20116h0();
        mo18043b0(h0, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new lz3(h0, str, j2, j));
    }

    /* renamed from: d0 */
    public final void mo18047d0(List<c54> list, c54 c54) {
        zz3 zz3 = this.f20085e;
        kb0 kb0 = this.f20088h;
        Objects.requireNonNull(kb0);
        zz3.mo36154h(list, c54, kb0);
    }

    /* renamed from: e */
    public final void mo18048e(int i, long j, long j2) {
        b04 h0 = m20116h0();
        mo18043b0(h0, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new gy3(h0, i, j, j2));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo18049f() {
    }

    /* renamed from: g */
    public final void mo18050g(boolean z) {
        b04 h0 = m20116h0();
        mo18043b0(h0, AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED, new pz3(h0, z));
    }

    /* renamed from: h */
    public final void mo18051h(ky0 ky0) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1028, new uy3(h0, ky0));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo18052i(int i, boolean z) {
    }

    /* renamed from: j */
    public final void mo18053j(mc3 mc3) {
        b04 g0 = m20115g0();
        mo18043b0(g0, 1025, new yy3(g0, mc3));
    }

    /* renamed from: k */
    public final void mo18054k(Object obj, long j) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1027, new iz3(h0, obj, j));
    }

    /* renamed from: l */
    public final void mo18055l(int i, int i2) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1029, new ey3(h0, i, i2));
    }

    /* renamed from: m */
    public final void mo18056m(Exception exc) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1037, new fz3(h0, exc));
    }

    /* renamed from: n */
    public final void mo18057n(long j) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1011, new jy3(h0, j));
    }

    /* renamed from: o */
    public final void mo18058o(int i) {
        b04 T = mo18034T();
        mo18043b0(T, 6, new cy3(T, i));
    }

    /* renamed from: p */
    public final void mo18059p(int i) {
        b04 T = mo18034T();
        mo18043b0(T, 4, new by3(T, i));
    }

    /* renamed from: q */
    public final void mo18060q(boolean z) {
        b04 T = mo18034T();
        mo18043b0(T, 3, new nz3(T, z));
    }

    /* renamed from: r */
    public final void mo18061r(h20 h20) {
        b04 T = mo18034T();
        mo18043b0(T, 12, new qy3(T, h20));
    }

    /* renamed from: s */
    public final void mo18062s(ja0 ja0, ja0 ja02, int i) {
        if (i == 1) {
            this.f20090j = false;
            i = 1;
        }
        zz3 zz3 = this.f20085e;
        kb0 kb0 = this.f20088h;
        Objects.requireNonNull(kb0);
        zz3.mo36153g(kb0);
        b04 T = mo18034T();
        mo18043b0(T, 11, new iy3(T, i, ja0, ja02));
    }

    /* renamed from: t */
    public final void mo18063t(boolean z, int i) {
        b04 T = mo18034T();
        mo18043b0(T, -1, new sz3(T, z, i));
    }

    /* renamed from: u */
    public final void mo18064u(k60 k60) {
        b04 T = mo18034T();
        mo18043b0(T, 13, new ry3(T, k60));
    }

    /* renamed from: v */
    public final void mo18065v(int i, c54 c54, u44 u44, z44 z44) {
        b04 f0 = m20114f0(i, c54);
        mo18043b0(f0, 1002, new az3(f0, u44, z44));
    }

    /* renamed from: w */
    public final void mo18066w(C8281w wVar, nd3 nd3) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1022, new my3(h0, wVar, nd3));
    }

    /* renamed from: x */
    public final void mo18067x(boolean z) {
        b04 T = mo18034T();
        mo18043b0(T, 7, new oz3(T, z));
    }

    /* renamed from: y */
    public final void mo18068y(long j, int i) {
        b04 g0 = m20115g0();
        mo18043b0(g0, 1026, new ky3(g0, j, i));
    }

    /* renamed from: z */
    public final void mo18069z(mc3 mc3) {
        b04 h0 = m20116h0();
        mo18043b0(h0, 1008, new wy3(h0, mc3));
    }

    public final void zzm() {
        b04 T = mo18034T();
        mo18043b0(T, -1, new qz3(T));
    }

    public final void zzw(String str) {
        b04 h0 = m20116h0();
        mo18043b0(h0, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new jz3(h0, str));
    }
}
