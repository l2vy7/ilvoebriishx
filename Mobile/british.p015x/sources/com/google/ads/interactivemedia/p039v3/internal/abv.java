package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abv */
/* compiled from: IMASDK */
final class abv implements aaz, C4309re, akb, akf, acf {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map<String, String> f14054b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C4120ke f14055c;

    /* renamed from: A */
    private boolean f14056A;

    /* renamed from: B */
    private int f14057B;

    /* renamed from: C */
    private boolean f14058C;

    /* renamed from: D */
    private boolean f14059D;

    /* renamed from: E */
    private int f14060E;

    /* renamed from: F */
    private long f14061F;

    /* renamed from: G */
    private long f14062G;

    /* renamed from: H */
    private long f14063H;

    /* renamed from: I */
    private boolean f14064I;

    /* renamed from: J */
    private int f14065J;

    /* renamed from: K */
    private boolean f14066K;

    /* renamed from: L */
    private boolean f14067L;

    /* renamed from: M */
    private final ajl f14068M;

    /* renamed from: N */
    private final aup f14069N;

    /* renamed from: d */
    private final Uri f14070d;

    /* renamed from: e */
    private final ajg f14071e;

    /* renamed from: f */
    private final C4286qi f14072f;

    /* renamed from: g */
    private final abj f14073g;

    /* renamed from: h */
    private final C4281qd f14074h;

    /* renamed from: i */
    private final abr f14075i;

    /* renamed from: j */
    private final long f14076j = 1048576;

    /* renamed from: k */
    private final aki f14077k = new aki("ProgressiveMediaPeriod");

    /* renamed from: l */
    private final abn f14078l;

    /* renamed from: m */
    private final aku f14079m;

    /* renamed from: n */
    private final Runnable f14080n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Runnable f14081o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Handler f14082p;

    /* renamed from: q */
    private aay f14083q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C4517yx f14084r;

    /* renamed from: s */
    private acg[] f14085s;

    /* renamed from: t */
    private abt[] f14086t;

    /* renamed from: u */
    private boolean f14087u;

    /* renamed from: v */
    private boolean f14088v;

    /* renamed from: w */
    private boolean f14089w;

    /* renamed from: x */
    private abu f14090x;

    /* renamed from: y */
    private C4324rt f14091y;

    /* renamed from: z */
    private long f14092z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        f14054b = Collections.unmodifiableMap(hashMap);
        C4119kd kdVar = new C4119kd();
        kdVar.mo16107S("icy");
        kdVar.mo16120ae(MimeTypes.APPLICATION_ICY);
        f14055c = kdVar.mo16115a();
    }

    public abv(Uri uri, ajg ajg, abn abn, C4286qi qiVar, C4281qd qdVar, aup aup, abj abj, abr abr, ajl ajl, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14070d = uri;
        this.f14071e = ajg;
        this.f14072f = qiVar;
        this.f14074h = qdVar;
        this.f14069N = aup;
        this.f14073g = abj;
        this.f14075i = abr;
        this.f14068M = ajl;
        this.f14078l = abn;
        this.f14079m = new aku();
        this.f14080n = new abo(this, (byte[]) null);
        this.f14081o = new abo(this);
        this.f14082p = amm.m14241k();
        this.f14086t = new abt[0];
        this.f14085s = new acg[0];
        this.f14063H = C6540C.TIME_UNSET;
        this.f14061F = -1;
        this.f14092z = C6540C.TIME_UNSET;
        this.f14057B = 1;
    }

    /* renamed from: J */
    private final void m12943J(int i) {
        m12953T();
        abu abu = this.f14090x;
        boolean[] zArr = abu.f14053d;
        if (!zArr[i]) {
            C4120ke a = abu.f14050a.mo13453a(i).mo13445a(0);
            this.f14073g.mo13341o(aln.m14042l(a.f17681l), a, 0, this.f14062G);
            zArr[i] = true;
        }
    }

    /* renamed from: K */
    private final void m12944K(int i) {
        m12953T();
        boolean[] zArr = this.f14090x.f14051b;
        if (this.f14064I && zArr[i]) {
            if (!this.f14085s[i].mo13427y(false)) {
                this.f14063H = 0;
                this.f14064I = false;
                this.f14059D = true;
                this.f14062G = 0;
                this.f14065J = 0;
                for (acg h : this.f14085s) {
                    h.mo13410h();
                }
                aay aay = this.f14083q;
                aup.m14890u(aay);
                aay.mo13239l(this);
            }
        }
    }

    /* renamed from: L */
    private final boolean m12945L() {
        return this.f14059D || m12952S();
    }

    /* renamed from: M */
    private final C4327rw m12946M(abt abt) {
        int length = this.f14085s.length;
        for (int i = 0; i < length; i++) {
            if (abt.equals(this.f14086t[i])) {
                return this.f14085s[i];
            }
        }
        acg M = acg.m13018M(this.f14068M, this.f14082p.getLooper(), this.f14072f, this.f14074h);
        M.mo13398H(this);
        int i2 = length + 1;
        abt[] abtArr = (abt[]) Arrays.copyOf(this.f14086t, i2);
        abtArr[length] = abt;
        this.f14086t = (abt[]) amm.m14237g(abtArr);
        acg[] acgArr = (acg[]) Arrays.copyOf(this.f14085s, i2);
        acgArr[length] = M;
        this.f14085s = (acg[]) amm.m14237g(acgArr);
        return M;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void mo13360G() {
        C4507yn ynVar;
        if (!this.f14067L && !this.f14088v && this.f14087u && this.f14091y != null) {
            acg[] acgArr = this.f14085s;
            int length = acgArr.length;
            int i = 0;
            while (i < length) {
                if (acgArr[i].mo13422t() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f14079m.mo13862d();
            int length2 = this.f14085s.length;
            aco[] acoArr = new aco[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C4120ke t = this.f14085s[i2].mo13422t();
                aup.m14890u(t);
                String str = t.f17681l;
                boolean a = aln.m14031a(str);
                boolean z = a || aln.m14032b(str);
                zArr[i2] = z;
                this.f14089w = z | this.f14089w;
                C4517yx yxVar = this.f14084r;
                if (yxVar != null) {
                    if (a || this.f14086t[i2].f14049b) {
                        C4507yn ynVar2 = t.f17679j;
                        if (ynVar2 == null) {
                            ynVar = new C4507yn(yxVar);
                        } else {
                            ynVar = ynVar2.mo16834d(yxVar);
                        }
                        C4119kd a2 = t.mo16126a();
                        a2.mo16112X(ynVar);
                        t = a2.mo16115a();
                    }
                    if (a && t.f17675f == -1 && t.f17676g == -1 && yxVar.f19711a != -1) {
                        C4119kd a3 = t.mo16126a();
                        a3.mo16095G(yxVar.f19711a);
                        t = a3.mo16115a();
                    }
                }
                acoArr[i2] = new aco(t.mo16128c(this.f14072f.mo16575b(t)));
            }
            this.f14090x = new abu(new acq(acoArr), zArr);
            this.f14088v = true;
            aay aay = this.f14083q;
            aup.m14890u(aay);
            aay.mo13237j(this);
        }
    }

    /* renamed from: O */
    private final void m12948O(abq abq) {
        if (this.f14061F == -1) {
            this.f14061F = abq.f14043m;
        }
    }

    /* renamed from: P */
    private final void m12949P() {
        abq abq = new abq(this, this.f14070d, this.f14071e, this.f14078l, this, this.f14079m);
        if (this.f14088v) {
            aup.m14887r(m12952S());
            long j = this.f14092z;
            if (j == C6540C.TIME_UNSET || this.f14063H <= j) {
                C4324rt rtVar = this.f14091y;
                aup.m14890u(rtVar);
                abq.m12925i(abq, rtVar.mo16581b(this.f14063H).f18534a.f18540c, this.f14063H);
                for (acg j2 : this.f14085s) {
                    j2.mo13412j(this.f14063H);
                }
                this.f14063H = C6540C.TIME_UNSET;
            } else {
                this.f14066K = true;
                this.f14063H = C6540C.TIME_UNSET;
                return;
            }
        }
        this.f14065J = m12950Q();
        this.f14077k.mo13843e(abq, this, aup.m14894y(this.f14057B));
        ajk f = abq.f14042l;
        abj abj = this.f14073g;
        long unused = abq.f14032b;
        abj.mo13345s(new aas(f), 1, -1, (C4120ke) null, 0, abq.f14041k, this.f14092z);
    }

    /* renamed from: Q */
    private final int m12950Q() {
        int i = 0;
        for (acg m : this.f14085s) {
            i += m.mo13415m();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final long m12951R() {
        long j = Long.MIN_VALUE;
        for (acg u : this.f14085s) {
            j = Math.max(j, u.mo13423u());
        }
        return j;
    }

    /* renamed from: S */
    private final boolean m12952S() {
        return this.f14063H != C6540C.TIME_UNSET;
    }

    /* renamed from: T */
    private final void m12953T() {
        aup.m14887r(this.f14088v);
        aup.m14890u(this.f14090x);
        aup.m14890u(this.f14091y);
    }

    /* renamed from: I */
    public final void mo13361I() {
        this.f14082p.post(this.f14080n);
    }

    /* renamed from: a */
    public final void mo13228a(aay aay, long j) {
        this.f14083q = aay;
        this.f14079m.mo13859a();
        m12949P();
    }

    /* renamed from: b */
    public final void mo13229b() throws IOException {
        mo13369r();
        if (this.f14066K && !this.f14088v) {
            throw new C4144lb("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: ba */
    public final C4327rw mo13362ba(int i, int i2) {
        return m12946M(new abt(i, false));
    }

    /* renamed from: bb */
    public final void mo13363bb() {
        this.f14087u = true;
        this.f14082p.post(this.f14080n);
    }

    /* renamed from: bc */
    public final void mo13364bc(C4324rt rtVar) {
        this.f14082p.post(new abp(this, rtVar));
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
    }

    /* renamed from: c */
    public final acq mo13231c() {
        m12953T();
        return this.f14090x.f14050a;
    }

    /* renamed from: d */
    public final long mo13232d(aih[] aihArr, boolean[] zArr, ach[] achArr, boolean[] zArr2, long j) {
        aih aih;
        m12953T();
        abu abu = this.f14090x;
        acq acq = abu.f14050a;
        boolean[] zArr3 = abu.f14052c;
        int i = this.f14060E;
        int i2 = 0;
        for (int i3 = 0; i3 < aihArr.length; i3++) {
            abs abs = achArr[i3];
            if (abs != null && (aihArr[i3] == null || !zArr[i3])) {
                int a = abs.f14047b;
                aup.m14887r(zArr3[a]);
                this.f14060E--;
                zArr3[a] = false;
                achArr[i3] = null;
            }
        }
        boolean z = !this.f14058C ? j != 0 : i == 0;
        for (int i4 = 0; i4 < aihArr.length; i4++) {
            if (achArr[i4] == null && (aih = aihArr[i4]) != null) {
                aup.m14887r(aih.mo13738k() == 1);
                aup.m14887r(aih.mo13740m(0) == 0);
                int b = acq.mo13454b(aih.mo13737j());
                aup.m14887r(!zArr3[b]);
                this.f14060E++;
                zArr3[b] = true;
                achArr[i4] = new abs(this, b);
                zArr2[i4] = true;
                if (!z) {
                    acg acg = this.f14085s[b];
                    z = !acg.mo13392B(j, true) && acg.mo13420r() != 0;
                }
            }
        }
        if (this.f14060E == 0) {
            this.f14064I = false;
            this.f14059D = false;
            if (this.f14077k.mo13844f()) {
                acg[] acgArr = this.f14085s;
                int length = acgArr.length;
                while (i2 < length) {
                    acgArr[i2].mo13396F();
                    i2++;
                }
                this.f14077k.mo13845g();
            } else {
                acg[] acgArr2 = this.f14085s;
                int length2 = acgArr2.length;
                while (i2 < length2) {
                    acgArr2[i2].mo13410h();
                    i2++;
                }
            }
        } else if (z) {
            j = mo13235h(j);
            while (i2 < 2) {
                if (achArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f14058C = true;
        return j;
    }

    /* renamed from: f */
    public final long mo13233f() {
        if (!this.f14059D) {
            return C6540C.TIME_UNSET;
        }
        if (!this.f14066K && m12950Q() <= this.f14065J) {
            return C6540C.TIME_UNSET;
        }
        this.f14059D = false;
        return this.f14062G;
    }

    /* renamed from: g */
    public final long mo13234g() {
        long j;
        m12953T();
        boolean[] zArr = this.f14090x.f14051b;
        if (this.f14066K) {
            return Long.MIN_VALUE;
        }
        if (m12952S()) {
            return this.f14063H;
        }
        if (this.f14089w) {
            int length = this.f14085s.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f14085s[i].mo13425w()) {
                    j = Math.min(j, this.f14085s[i].mo13423u());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m12951R();
        }
        return j == Long.MIN_VALUE ? this.f14062G : j;
    }

    /* renamed from: h */
    public final long mo13235h(long j) {
        m12953T();
        boolean[] zArr = this.f14090x.f14051b;
        if (true != this.f14091y.mo16580a()) {
            j = 0;
        }
        int i = 0;
        this.f14059D = false;
        this.f14062G = j;
        if (m12952S()) {
            this.f14063H = j;
            return j;
        }
        if (this.f14057B != 7) {
            int length = this.f14085s.length;
            int i2 = 0;
            while (i2 < length) {
                if (this.f14085s[i2].mo13392B(j, false) || (!zArr[i2] && this.f14089w)) {
                    i2++;
                }
            }
            return j;
        }
        this.f14064I = false;
        this.f14063H = j;
        this.f14066K = false;
        if (this.f14077k.mo13844f()) {
            acg[] acgArr = this.f14085s;
            int length2 = acgArr.length;
            while (i < length2) {
                acgArr[i].mo13396F();
                i++;
            }
            this.f14077k.mo13845g();
        } else {
            this.f14077k.mo13842d();
            acg[] acgArr2 = this.f14085s;
            int length3 = acgArr2.length;
            while (i < length3) {
                acgArr2[i].mo13410h();
                i++;
            }
        }
        return j;
    }

    /* renamed from: i */
    public final long mo13236i(long j, C4159lq lqVar) {
        m12953T();
        if (!this.f14091y.mo16580a()) {
            return 0;
        }
        C4322rr b = this.f14091y.mo16581b(j);
        return lqVar.mo16267a(j, b.f18534a.f18539b, b.f18535b.f18539b);
    }

    /* renamed from: j */
    public final void mo13365j() {
        if (this.f14088v) {
            for (acg o : this.f14085s) {
                o.mo13417o();
            }
        }
        this.f14077k.mo13847i(this);
        this.f14082p.removeCallbacksAndMessages((Object) null);
        this.f14083q = null;
        this.f14067L = true;
    }

    /* renamed from: k */
    public final long mo13238k() {
        if (this.f14060E == 0) {
            return Long.MIN_VALUE;
        }
        return mo13234g();
    }

    /* renamed from: l */
    public final void mo13366l() {
        for (acg g : this.f14085s) {
            g.mo13409g();
        }
        this.f14078l.mo13348b();
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        if (this.f14066K || this.f14077k.mo13841c() || this.f14064I) {
            return false;
        }
        if (this.f14088v && this.f14060E == 0) {
            return false;
        }
        boolean a = this.f14079m.mo13859a();
        if (this.f14077k.mo13844f()) {
            return a;
        }
        m12949P();
        return true;
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        return this.f14077k.mo13844f() && this.f14079m.mo13861c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo13367o(int i) {
        return !m12945L() && this.f14085s[i].mo13427y(this.f14066K);
    }

    /* renamed from: p */
    public final void mo13243p(long j) {
        m12953T();
        if (!m12952S()) {
            boolean[] zArr = this.f14090x.f14052c;
            int length = this.f14085s.length;
            for (int i = 0; i < length; i++) {
                this.f14085s[i].mo13402N(j, zArr[i]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo13368q(int i) throws IOException {
        this.f14085s[i].mo13418p();
        mo13369r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo13369r() throws IOException {
        this.f14077k.mo13848j(aup.m14894y(this.f14057B));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final int mo13370s(int i, C4121kf kfVar, C4269ps psVar, int i2) {
        if (m12945L()) {
            return -3;
        }
        m12943J(i);
        int z = this.f14085s[i].mo13428z(kfVar, psVar, i2, this.f14066K);
        if (z == -3) {
            m12944K(i);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final int mo13371t(int i, long j) {
        if (m12945L()) {
            return 0;
        }
        m12943J(i);
        acg acg = this.f14085s[i];
        int C = acg.mo13393C(j, this.f14066K);
        acg.mo13394D(C);
        if (C != 0) {
            return C;
        }
        m12944K(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C4327rw mo13372u() {
        return m12946M(new abt(0, true));
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ akc mo13373v(ake ake, long j, long j2, IOException iOException, int i) {
        akc b;
        C4324rt rtVar;
        abq abq = (abq) ake;
        m12948O(abq);
        ako unused = abq.f14034d;
        long unused2 = abq.f14032b;
        ajk unused3 = abq.f14042l;
        aas aas = new aas();
        new aax(1, -1, (C4120ke) null, 0, C4083iv.m17451a(abq.f14041k), C4083iv.m17451a(this.f14092z));
        long z = aup.m14895z(new aka(iOException, i));
        if (z == C6540C.TIME_UNSET) {
            b = aki.f15147c;
        } else {
            int Q = m12950Q();
            boolean z2 = Q > this.f14065J;
            if (this.f14061F != -1 || ((rtVar = this.f14091y) != null && rtVar.mo16582c() != C6540C.TIME_UNSET)) {
                this.f14065J = Q;
            } else if (!this.f14088v || m12945L()) {
                this.f14059D = this.f14088v;
                this.f14062G = 0;
                this.f14065J = 0;
                for (acg h : this.f14085s) {
                    h.mo13410h();
                }
                abq.m12925i(abq, 0, 0);
            } else {
                this.f14064I = true;
                b = aki.f15146b;
            }
            b = aki.m13929b(z2, z);
        }
        akc akc = b;
        boolean z3 = !akc.mo13834a();
        this.f14073g.mo13344r(aas, 1, -1, (C4120ke) null, 0, abq.f14041k, this.f14092z, iOException, z3);
        if (z3) {
            long unused4 = abq.f14032b;
        }
        return akc;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo13374w(ake ake, long j, long j2, boolean z) {
        abq abq = (abq) ake;
        ako unused = abq.f14034d;
        long unused2 = abq.f14032b;
        ajk unused3 = abq.f14042l;
        aas aas = new aas();
        long unused4 = abq.f14032b;
        this.f14073g.mo13342p(aas, 1, -1, (C4120ke) null, 0, abq.f14041k, this.f14092z);
        if (!z) {
            m12948O(abq);
            for (acg h : this.f14085s) {
                h.mo13410h();
            }
            if (this.f14060E > 0) {
                aay aay = this.f14083q;
                aup.m14890u(aay);
                aay.mo13239l(this);
            }
        }
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo13375x(ake ake, long j, long j2) {
        C4324rt rtVar;
        abq abq = (abq) ake;
        if (this.f14092z == C6540C.TIME_UNSET && (rtVar = this.f14091y) != null) {
            boolean a = rtVar.mo16580a();
            long R = m12951R();
            long j3 = R == Long.MIN_VALUE ? 0 : R + ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
            this.f14092z = j3;
            this.f14075i.mo13357b(j3, a, this.f14056A);
        }
        ako unused = abq.f14034d;
        long unused2 = abq.f14032b;
        ajk unused3 = abq.f14042l;
        aas aas = new aas();
        long unused4 = abq.f14032b;
        this.f14073g.mo13343q(aas, 1, -1, (C4120ke) null, 0, abq.f14041k, this.f14092z);
        m12948O(abq);
        this.f14066K = true;
        aay aay = this.f14083q;
        aup.m14890u(aay);
        aay.mo13239l(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ void mo13376y(C4324rt rtVar) {
        C4324rt rtVar2;
        if (this.f14084r == null) {
            rtVar2 = rtVar;
        } else {
            rtVar2 = new C4323rs(C6540C.TIME_UNSET);
        }
        this.f14091y = rtVar2;
        this.f14092z = rtVar.mo16582c();
        boolean z = false;
        int i = 1;
        if (this.f14061F == -1 && rtVar.mo16582c() == C6540C.TIME_UNSET) {
            z = true;
        }
        this.f14056A = z;
        if (true == z) {
            i = 7;
        }
        this.f14057B = i;
        this.f14075i.mo13357b(this.f14092z, rtVar.mo16580a(), this.f14056A);
        if (!this.f14088v) {
            mo13360G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo13377z() {
        if (!this.f14067L) {
            aay aay = this.f14083q;
            aup.m14890u(aay);
            aay.mo13239l(this);
        }
    }
}
