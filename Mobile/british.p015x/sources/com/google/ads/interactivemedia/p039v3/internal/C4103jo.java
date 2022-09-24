package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jo */
/* compiled from: IMASDK */
final class C4103jo extends C4081it {

    /* renamed from: b */
    static final int[] f17536b = {1, 2, 7, 8, 9, 10, 11, 12, 13};

    /* renamed from: d */
    public static final /* synthetic */ int f17537d = 0;

    /* renamed from: c */
    final aip f17538c;

    /* renamed from: e */
    private final aio f17539e;

    /* renamed from: f */
    private final alb f17540f;

    /* renamed from: g */
    private final C4111jw f17541g;

    /* renamed from: h */
    private final C4114jz f17542h;

    /* renamed from: i */
    private final alh<C4149lg> f17543i;

    /* renamed from: j */
    private final CopyOnWriteArraySet<C4090jb> f17544j = new CopyOnWriteArraySet<>();

    /* renamed from: k */
    private final C4168lz f17545k;

    /* renamed from: l */
    private final List<C4102jn> f17546l = new ArrayList();

    /* renamed from: m */
    private final boolean f17547m;

    /* renamed from: n */
    private final C4201ne f17548n;

    /* renamed from: o */
    private final Looper f17549o;

    /* renamed from: p */
    private final aiz f17550p;

    /* renamed from: q */
    private final aks f17551q;

    /* renamed from: r */
    private int f17552r;

    /* renamed from: s */
    private boolean f17553s;

    /* renamed from: t */
    private int f17554t;

    /* renamed from: u */
    private int f17555u;

    /* renamed from: v */
    private C4148lf f17556v;

    /* renamed from: w */
    private C4145lc f17557w;

    /* renamed from: x */
    private int f17558x;

    /* renamed from: y */
    private long f17559y;

    /* renamed from: z */
    private ack f17560z = new ack();

    @SuppressLint({"HandlerLeak"})
    public C4103jo(C4156ln[] lnVarArr, aio aio, C4085ix ixVar, aiz aiz, C4201ne neVar, boolean z, C4159lq lqVar, C4084iw iwVar, long j, aks aks, Looper looper, C4150lh lhVar) {
        aiz aiz2 = aiz;
        C4201ne neVar2 = neVar;
        aks aks2 = aks;
        Looper looper2 = looper;
        C4150lh lhVar2 = lhVar;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = amm.f15302e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.13.2] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = lnVarArr.length;
        aup.m14887r(true);
        C4156ln[] lnVarArr2 = (C4156ln[]) aup.m14890u(lnVarArr);
        aup.m14890u(aio);
        this.f17539e = aio;
        this.f17550p = aiz2;
        this.f17548n = neVar2;
        this.f17547m = z;
        this.f17549o = looper2;
        this.f17551q = aks2;
        this.f17543i = new alh<>(looper2, aks2, new C4092jd(lhVar2));
        aip aip = new aip(new C4158lp[2], new aih[2], (Object) null);
        this.f17538c = aip;
        this.f17545k = new C4168lz();
        C4147le leVar = new C4147le();
        leVar.mo16228c(f17536b);
        leVar.mo16227b();
        this.f17556v = leVar.mo16226a();
        this.f17558x = -1;
        this.f17540f = aks2.mo13858b(looper2, (Handler.Callback) null);
        C4095jg jgVar = new C4095jg(this);
        this.f17541g = jgVar;
        this.f17557w = C4145lc.m17839a(aip);
        if (neVar2 != null) {
            neVar2.mo16354Q(lhVar2, looper2);
            mo16001e(neVar2);
            aiz2.mo13794b(new Handler(looper2), neVar2);
        }
        this.f17542h = new C4114jz(lnVarArr, aio, aip, ixVar, aiz, neVar, lqVar, iwVar, 500, looper, aks, jgVar);
    }

    /* renamed from: G */
    private final int m17507G() {
        if (this.f17557w.f17807a.mo16333v()) {
            return this.f17558x;
        }
        C4145lc lcVar = this.f17557w;
        return lcVar.f17807a.mo15925g(lcVar.f17808b.f13998a, this.f17545k).f17914c;
    }

    /* renamed from: H */
    private final void m17508H(C4145lc lcVar, boolean z, int i, int i2, int i3, boolean z2) {
        Pair pair;
        C4129kn knVar;
        int i4;
        C4145lc lcVar2 = lcVar;
        int i5 = i;
        C4145lc lcVar3 = this.f17557w;
        this.f17557w = lcVar2;
        boolean z3 = !lcVar3.f17807a.equals(lcVar2.f17807a);
        C4171mb mbVar = lcVar3.f17807a;
        C4171mb mbVar2 = lcVar2.f17807a;
        if (mbVar2.mo16333v() && mbVar.mo16333v()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (mbVar2.mo16333v() != mbVar.mo16333v()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            Object obj = mbVar.mo16334w(mbVar.mo15925g(lcVar3.f17808b.f13998a, this.f17545k).f17914c, this.f17449a).f17926b;
            Object obj2 = mbVar2.mo16334w(mbVar2.mo15925g(lcVar2.f17808b.f13998a, this.f17545k).f17914c, this.f17449a).f17926b;
            int i6 = this.f17449a.f17939o;
            if (!obj.equals(obj2)) {
                if (z && i5 == 0) {
                    i4 = 1;
                } else if (z && i5 == 1) {
                    i4 = 2;
                } else if (z3) {
                    i4 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            } else if (z && i5 == 0 && mbVar2.mo13290i(lcVar2.f17808b.f13998a) == i6) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (!lcVar3.f17807a.equals(lcVar2.f17807a)) {
            this.f17543i.mo13903d(0, new C4098jj(lcVar2, i2));
        }
        if (z) {
            this.f17543i.mo13903d(12, new C4099jk(i5));
        }
        if (booleanValue) {
            if (!lcVar2.f17807a.mo16333v()) {
                knVar = lcVar2.f17807a.mo16334w(lcVar2.f17807a.mo15925g(lcVar2.f17808b.f13998a, this.f17545k).f17914c, this.f17449a).f17927c;
            } else {
                knVar = null;
            }
            this.f17543i.mo13903d(1, new C4100jl(knVar, intValue));
        }
        C4089ja jaVar = lcVar3.f17811e;
        C4089ja jaVar2 = lcVar2.f17811e;
        if (!(jaVar == jaVar2 || jaVar2 == null)) {
            this.f17543i.mo13903d(11, new C4093je(lcVar2, (byte[][]) null));
        }
        aip aip = lcVar3.f17814h;
        aip aip2 = lcVar2.f17814h;
        if (aip != aip2) {
            Object obj3 = aip2.f15007d;
            this.f17543i.mo13903d(2, new C4101jm(lcVar2, new ail(aip2.f15006c)));
        }
        if (!lcVar3.f17815i.equals(lcVar2.f17815i)) {
            this.f17543i.mo13903d(3, new C4093je(lcVar2, (byte[]) null));
        }
        if (lcVar3.f17812f != lcVar2.f17812f) {
            this.f17543i.mo13903d(4, new C4093je(lcVar2));
        }
        if (!(lcVar3.f17810d == lcVar2.f17810d && lcVar3.f17817k == lcVar2.f17817k)) {
            this.f17543i.mo13903d(-1, new C4093je(lcVar2, (char[]) null));
        }
        if (lcVar3.f17810d != lcVar2.f17810d) {
            this.f17543i.mo13903d(5, new C4093je(lcVar2, (short[]) null));
        }
        if (lcVar3.f17817k != lcVar2.f17817k) {
            this.f17543i.mo13903d(6, new C4098jj(lcVar2, i3, (byte[]) null));
        }
        if (lcVar3.f17818l != lcVar2.f17818l) {
            this.f17543i.mo13903d(7, new C4093je(lcVar2, (int[]) null));
        }
        if (m17511K(lcVar3) != m17511K(lcVar)) {
            this.f17543i.mo13903d(8, new C4093je(lcVar2, (boolean[]) null));
        }
        if (!lcVar3.f17819m.equals(lcVar2.f17819m)) {
            this.f17543i.mo13903d(13, new C4093je(lcVar2, (float[]) null));
        }
        if (z2) {
            this.f17543i.mo13903d(-1, C4097ji.f17524b);
        }
        C4148lf lfVar = this.f17556v;
        C4148lf b = mo15936b(f17536b);
        this.f17556v = b;
        if (!b.equals(lfVar)) {
            this.f17543i.mo13903d(14, new C4094jf(this));
        }
        this.f17543i.mo13904e();
        if (lcVar3.f17820n != lcVar2.f17820n) {
            Iterator<C4090jb> it = this.f17544j.iterator();
            while (it.hasNext()) {
                it.next().mo15987a();
            }
        }
        if (lcVar3.f17821o != lcVar2.f17821o) {
            Iterator<C4090jb> it2 = this.f17544j.iterator();
            while (it2.hasNext()) {
                it2.next().mo15988b();
            }
        }
    }

    /* renamed from: I */
    private final C4145lc m17509I(C4145lc lcVar, C4171mb mbVar, Pair<Object, Long> pair) {
        abb abb;
        acq acq;
        aip aip;
        List list;
        long j;
        C4171mb mbVar2 = mbVar;
        Pair<Object, Long> pair2 = pair;
        aup.m14885p(mbVar.mo16333v() || pair2 != null);
        C4171mb mbVar3 = lcVar.f17807a;
        C4145lc d = lcVar.mo16216d(mbVar);
        if (mbVar.mo16333v()) {
            abb b = C4145lc.m17840b();
            C4145lc g = d.mo16215c(b, C4083iv.m17452b(this.f17559y), C4083iv.m17452b(this.f17559y), 0, acq.f14192a, this.f17538c, atz.m14807i()).mo16219g(b);
            g.f17822p = g.f17824r;
            return g;
        }
        Object obj = d.f17808b.f13998a;
        int i = amm.f15298a;
        boolean z = !obj.equals(pair2.first);
        if (z) {
            abb = new abb(pair2.first);
        } else {
            abb = d.f17808b;
        }
        abb abb2 = abb;
        long longValue = ((Long) pair2.second).longValue();
        long b2 = C4083iv.m17452b(mo16017u());
        if (!mbVar3.mo16333v()) {
            b2 -= mbVar3.mo15925g(obj, this.f17545k).f17916e;
        }
        if (z || longValue < b2) {
            abb abb3 = abb2;
            aup.m14887r(!abb3.mo13312b());
            if (z) {
                acq = acq.f14192a;
            } else {
                acq = d.f17813g;
            }
            acq acq2 = acq;
            if (z) {
                aip = this.f17538c;
            } else {
                aip = d.f17814h;
            }
            aip aip2 = aip;
            if (z) {
                list = atz.m14807i();
            } else {
                list = d.f17815i;
            }
            C4145lc g2 = d.mo16215c(abb3, longValue, longValue, 0, acq2, aip2, list).mo16219g(abb3);
            g2.f17822p = longValue;
            return g2;
        } else if (longValue == b2) {
            int i2 = mbVar2.mo13290i(d.f17816j.f13998a);
            if (i2 != -1 && mbVar2.mo16330A(i2, this.f17545k).f17914c == mbVar2.mo15925g(abb2.f13998a, this.f17545k).f17914c) {
                return d;
            }
            mbVar2.mo15925g(abb2.f13998a, this.f17545k);
            if (abb2.mo13312b()) {
                this.f17545k.mo16321g(abb2.f13999b);
                j = C6540C.TIME_UNSET;
            } else {
                j = this.f17545k.f17915d;
            }
            C4145lc g3 = d.mo16215c(abb2, d.f17824r, d.f17824r, j - d.f17824r, d.f17813g, d.f17814h, d.f17815i).mo16219g(abb2);
            g3.f17822p = j;
            return g3;
        } else {
            abb abb4 = abb2;
            aup.m14887r(!abb4.mo13312b());
            long max = Math.max(0, d.f17823q - (longValue - b2));
            long j2 = d.f17822p;
            if (d.f17816j.equals(d.f17808b)) {
                j2 = longValue + max;
            }
            C4145lc c = d.mo16215c(abb4, longValue, longValue, max, d.f17813g, d.f17814h, d.f17815i);
            c.f17822p = j2;
            return c;
        }
    }

    /* renamed from: J */
    private final Pair<Object, Long> m17510J(C4171mb mbVar, int i, long j) {
        if (mbVar.mo16333v()) {
            this.f17558x = i;
            if (j == C6540C.TIME_UNSET) {
                j = 0;
            }
            this.f17559y = j;
            return null;
        }
        if (i >= mbVar.mo13271t()) {
            i = mbVar.mo13287e(false);
            j = mbVar.mo16334w(i, this.f17449a).mo16325a();
        }
        return mbVar.mo16336y(this.f17449a, this.f17545k, i, C4083iv.m17452b(j));
    }

    /* renamed from: K */
    private static boolean m17511K(C4145lc lcVar) {
        return lcVar.f17810d == 3 && lcVar.f17817k && lcVar.f17818l == 0;
    }

    /* renamed from: A */
    public final void mo15993A() {
    }

    /* renamed from: B */
    public final void mo15994B() {
    }

    /* renamed from: C */
    public final void mo15995C(int i) {
        C4171mb mbVar = this.f17557w.f17807a;
        if (i < 0 || (!mbVar.mo16333v() && i >= mbVar.mo13271t())) {
            throw new C4122kg();
        }
        int i2 = 1;
        this.f17552r++;
        if (mo16014r()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C4110jv jvVar = new C4110jv(this.f17557w);
            jvVar.mo16027a(1);
            this.f17541g.mo15989a(jvVar);
            return;
        }
        if (mo16003g() != 1) {
            i2 = 2;
        }
        C4145lc I = m17509I(this.f17557w.mo16217e(i2), mbVar, m17510J(mbVar, i, 0));
        this.f17542h.mo16033d(mbVar, i, C4083iv.m17452b(0));
        m17508H(I, true, 1, 0, 1, true);
    }

    /* renamed from: D */
    public final void mo15996D(List<abd> list) {
        m17507G();
        mo16012p();
        this.f17552r++;
        if (!this.f17546l.isEmpty()) {
            int size = this.f17546l.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f17546l.remove(i);
            }
            this.f17560z = this.f17560z.mo13435g(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4140ky kyVar = new C4140ky(list.get(i2), this.f17547m);
            arrayList.add(kyVar);
            this.f17546l.add(i2, new C4102jn(kyVar.f17782b, kyVar.f17781a.mo13307C()));
        }
        this.f17560z = this.f17560z.mo13434f(0, arrayList.size());
        C4154ll llVar = new C4154ll(this.f17546l, this.f17560z);
        if (llVar.mo16333v() || llVar.mo13271t() > 0) {
            C4145lc I = m17509I(this.f17557w, llVar, m17510J(llVar, 0, C6540C.TIME_UNSET));
            int i3 = I.f17810d;
            if (i3 != 1) {
                i3 = (llVar.mo16333v() || llVar.mo13271t() <= 0) ? 4 : 2;
            }
            C4145lc e = I.mo16217e(i3);
            this.f17542h.mo16042p(arrayList, 0, C4083iv.m17452b(C6540C.TIME_UNSET), this.f17560z);
            m17508H(e, false, 4, 0, 1, false);
            return;
        }
        throw new C4122kg();
    }

    /* renamed from: E */
    public final void mo15997E() {
        mo15998F((C4089ja) null);
    }

    /* renamed from: F */
    public final void mo15998F(C4089ja jaVar) {
        C4145lc lcVar = this.f17557w;
        C4145lc g = lcVar.mo16219g(lcVar.f17808b);
        g.f17822p = g.f17824r;
        g.f17823q = 0;
        C4145lc e = g.mo16217e(1);
        if (jaVar != null) {
            e = e.mo16218f(jaVar);
        }
        this.f17552r++;
        this.f17542h.mo16034e();
        m17508H(e, false, 4, 0, 1, false);
    }

    /* renamed from: c */
    public final boolean mo15999c() {
        return this.f17557w.f17821o;
    }

    /* renamed from: d */
    public final Looper mo16000d() {
        return this.f17549o;
    }

    /* renamed from: e */
    public final void mo16001e(C4149lg lgVar) {
        this.f17543i.mo13901b(lgVar);
    }

    /* renamed from: f */
    public final void mo16002f(C4090jb jbVar) {
        this.f17544j.add(jbVar);
    }

    /* renamed from: g */
    public final int mo16003g() {
        return this.f17557w.f17810d;
    }

    /* renamed from: h */
    public final void mo16004h() {
        C4145lc lcVar = this.f17557w;
        if (lcVar.f17810d == 1) {
            C4145lc f = lcVar.mo16218f((C4089ja) null);
            C4145lc e = f.mo16217e(true != f.f17807a.mo16333v() ? 2 : 4);
            this.f17552r++;
            this.f17542h.mo16031b();
            m17508H(e, false, 4, 1, 1, false);
        }
    }

    /* renamed from: i */
    public final void mo16005i(boolean z, int i, int i2) {
        C4145lc lcVar = this.f17557w;
        if (lcVar.f17817k != z || lcVar.f17818l != i) {
            this.f17552r++;
            C4145lc h = lcVar.mo16220h(z, i);
            this.f17542h.mo16032c(z, i);
            m17508H(h, false, 4, 0, i2, false);
        }
    }

    /* renamed from: j */
    public final boolean mo16006j() {
        return this.f17557w.f17817k;
    }

    /* renamed from: k */
    public final void mo16007k() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = amm.f15302e;
        String a = C4116ka.m17668a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.13.2] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f17542h.mo16036g()) {
            this.f17543i.mo13905f(11, C4097ji.f17523a);
        }
        this.f17543i.mo13906g();
        this.f17540f.mo13886g();
        C4201ne neVar = this.f17548n;
        if (neVar != null) {
            this.f17550p.mo13795c(neVar);
        }
        C4145lc e = this.f17557w.mo16217e(1);
        this.f17557w = e;
        C4145lc g = e.mo16219g(e.f17808b);
        this.f17557w = g;
        g.f17822p = g.f17824r;
        this.f17557w.f17823q = 0;
    }

    /* renamed from: l */
    public final C4153lk mo16008l(C4152lj ljVar) {
        return new C4153lk(this.f17542h, ljVar, this.f17557w.f17807a, mo16010n(), this.f17551q, this.f17542h.mo16037h());
    }

    /* renamed from: m */
    public final int mo16009m() {
        if (this.f17557w.f17807a.mo16333v()) {
            return 0;
        }
        C4145lc lcVar = this.f17557w;
        return lcVar.f17807a.mo13290i(lcVar.f17808b.f13998a);
    }

    /* renamed from: n */
    public final int mo16010n() {
        int G = m17507G();
        if (G == -1) {
            return 0;
        }
        return G;
    }

    /* renamed from: o */
    public final long mo16011o() {
        if (!mo16014r()) {
            C4171mb v = mo16018v();
            if (v.mo16333v()) {
                return C6540C.TIME_UNSET;
            }
            return C4083iv.m17451a(v.mo16334w(mo16010n(), this.f17449a).f17938n);
        }
        C4145lc lcVar = this.f17557w;
        abb abb = lcVar.f17808b;
        lcVar.f17807a.mo15925g(abb.f13998a, this.f17545k);
        this.f17545k.mo16321g(abb.f13999b);
        return C4083iv.m17451a(C6540C.TIME_UNSET);
    }

    /* renamed from: p */
    public final long mo16012p() {
        if (this.f17557w.f17807a.mo16333v()) {
            return this.f17559y;
        }
        if (this.f17557w.f17808b.mo13312b()) {
            return C4083iv.m17451a(this.f17557w.f17824r);
        }
        C4145lc lcVar = this.f17557w;
        abb abb = lcVar.f17808b;
        long a = C4083iv.m17451a(lcVar.f17824r);
        this.f17557w.f17807a.mo15925g(abb.f13998a, this.f17545k);
        return a + this.f17545k.mo16314a();
    }

    /* renamed from: q */
    public final long mo16013q() {
        return C4083iv.m17451a(this.f17557w.f17823q);
    }

    /* renamed from: r */
    public final boolean mo16014r() {
        return this.f17557w.f17808b.mo13312b();
    }

    /* renamed from: s */
    public final int mo16015s() {
        if (mo16014r()) {
            return this.f17557w.f17808b.f13999b;
        }
        return -1;
    }

    /* renamed from: t */
    public final int mo16016t() {
        if (mo16014r()) {
            return this.f17557w.f17808b.f14000c;
        }
        return -1;
    }

    /* renamed from: u */
    public final long mo16017u() {
        if (!mo16014r()) {
            return mo16012p();
        }
        C4145lc lcVar = this.f17557w;
        lcVar.f17807a.mo15925g(lcVar.f17808b.f13998a, this.f17545k);
        C4145lc lcVar2 = this.f17557w;
        if (lcVar2.f17809c == C6540C.TIME_UNSET) {
            return lcVar2.f17807a.mo16334w(mo16010n(), this.f17449a).mo16325a();
        }
        return this.f17545k.mo16314a() + C4083iv.m17451a(this.f17557w.f17809c);
    }

    /* renamed from: v */
    public final C4171mb mo16018v() {
        return this.f17557w.f17807a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo16019w(C4149lg lgVar) {
        lgVar.mo16245t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ void mo16020y(C4110jv jvVar) {
        this.f17540f.mo13885f(new C4096jh(this, jvVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo16021z(C4110jv jvVar) {
        int i = this.f17552r - jvVar.f17578b;
        this.f17552r = i;
        boolean z = true;
        if (jvVar.f17579c) {
            this.f17553s = true;
            this.f17554t = jvVar.f17580d;
        }
        if (jvVar.f17581e) {
            this.f17555u = jvVar.f17582f;
        }
        if (i == 0) {
            C4171mb mbVar = jvVar.f17577a.f17807a;
            if (!this.f17557w.f17807a.mo16333v() && mbVar.mo16333v()) {
                this.f17558x = -1;
                this.f17559y = 0;
            }
            if (!mbVar.mo16333v()) {
                List<C4171mb> s = ((C4154ll) mbVar).mo16264s();
                if (s.size() != this.f17546l.size()) {
                    z = false;
                }
                aup.m14887r(z);
                for (int i2 = 0; i2 < s.size(); i2++) {
                    this.f17546l.get(i2).f17535b = s.get(i2);
                }
            }
            boolean z2 = this.f17553s;
            this.f17553s = false;
            m17508H(jvVar.f17577a, z2, this.f17554t, 1, this.f17555u, false);
        }
    }
}
