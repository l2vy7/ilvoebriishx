package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.gi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7721gi implements C8155sg, C8405zg {

    /* renamed from: p */
    public static final C8226ug f32325p = new C7647ei();

    /* renamed from: q */
    private static final int f32326q = C7836jm.m33645g("qt  ");

    /* renamed from: a */
    private final C7544bm f32327a = new C7544bm(C8410zl.f42494a);

    /* renamed from: b */
    private final C7544bm f32328b = new C7544bm(4);

    /* renamed from: c */
    private final C7544bm f32329c = new C7544bm(16);

    /* renamed from: d */
    private final Stack<C8015oh> f32330d = new Stack<>();

    /* renamed from: e */
    private int f32331e;

    /* renamed from: f */
    private int f32332f;

    /* renamed from: g */
    private long f32333g;

    /* renamed from: h */
    private int f32334h;

    /* renamed from: i */
    private C7544bm f32335i;

    /* renamed from: j */
    private int f32336j;

    /* renamed from: k */
    private int f32337k;

    /* renamed from: l */
    private C8190tg f32338l;

    /* renamed from: m */
    private C7684fi[] f32339m;

    /* renamed from: n */
    private long f32340n;

    /* renamed from: o */
    private boolean f32341o;

    /* renamed from: f */
    private final void m32525f() {
        this.f32331e = 0;
        this.f32334h = 0;
    }

    /* renamed from: g */
    private final void m32526g(long j) throws C8153se {
        zzatr zzatr;
        zzatr zzatr2;
        C8297wg wgVar;
        C7796ii a;
        while (!this.f32330d.isEmpty() && this.f32330d.peek().f36460P0 == j) {
            C8015oh pop = this.f32330d.pop();
            if (pop.f38132a == C8086qh.f38044C) {
                ArrayList arrayList = new ArrayList();
                C8297wg wgVar2 = new C8297wg();
                C8050ph e = pop.mo33899e(C8086qh.f38041A0);
                if (e != null) {
                    zzatr = C8334xh.m39470c(e, this.f32341o);
                    if (zzatr != null) {
                        wgVar2.mo35616b(zzatr);
                    }
                } else {
                    zzatr = null;
                }
                long j2 = C6540C.TIME_UNSET;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < pop.f36462R0.size()) {
                    C8015oh ohVar = pop.f36462R0.get(i);
                    if (ohVar.f38132a == C8086qh.f38048E && (a = C8334xh.m39468a(ohVar, pop.mo33899e(C8086qh.f38046D), C6540C.TIME_UNSET, (zzarf) null, this.f32341o)) != null) {
                        C7942mi b = C8334xh.m39469b(a, ohVar.mo33898d(C8086qh.f38050F).mo33898d(C8086qh.f38052G).mo33898d(C8086qh.f38054H), wgVar2);
                        if (b.f35519a != 0) {
                            C7684fi fiVar = new C7684fi(a, b, this.f32338l.mo33910h(i, a.f33245b));
                            zzapg f = a.f33249f.mo36190f(b.f35522d + 30);
                            if (a.f33245b == 1) {
                                if (wgVar2.mo35615a()) {
                                    f = f.mo36188e(wgVar2.f40780a, wgVar2.f40781b);
                                }
                                if (zzatr != null) {
                                    f = f.mo36191g(zzatr);
                                }
                            }
                            fiVar.f31765c.mo30672a(f);
                            wgVar = wgVar2;
                            zzatr2 = zzatr;
                            long max = Math.max(j2, a.f33248e);
                            arrayList.add(fiVar);
                            long j4 = b.f35520b[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            wgVar2 = wgVar;
                            zzatr = zzatr2;
                        }
                    }
                    wgVar = wgVar2;
                    zzatr2 = zzatr;
                    i++;
                    wgVar2 = wgVar;
                    zzatr = zzatr2;
                }
                this.f32340n = j2;
                this.f32339m = (C7684fi[]) arrayList.toArray(new C7684fi[arrayList.size()]);
                this.f32338l.zzb();
                this.f32338l.mo33909g(this);
                this.f32330d.clear();
                this.f32331e = 2;
            } else if (!this.f32330d.isEmpty()) {
                this.f32330d.peek().mo33900f(pop);
            }
        }
        if (this.f32331e != 2) {
            m32525f();
        }
    }

    /* renamed from: a */
    public final long mo32130a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C7684fi fiVar : this.f32339m) {
            C7942mi miVar = fiVar.f31764b;
            int a = miVar.mo33548a(j);
            if (a == -1) {
                a = miVar.mo33549b(j);
            }
            long j3 = miVar.f35520b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: b */
    public final boolean mo30928b(C8121rg rgVar) throws IOException, InterruptedException {
        return C7758hi.m32873b(rgVar);
    }

    /* renamed from: c */
    public final void mo30929c(C8190tg tgVar) {
        this.f32338l = tgVar;
    }

    /* renamed from: d */
    public final void mo30930d(long j, long j2) {
        this.f32330d.clear();
        this.f32334h = 0;
        this.f32336j = 0;
        this.f32337k = 0;
        if (j == 0) {
            m32525f();
            return;
        }
        C7684fi[] fiVarArr = this.f32339m;
        if (fiVarArr != null) {
            for (C7684fi fiVar : fiVarArr) {
                C7942mi miVar = fiVar.f31764b;
                int a = miVar.mo33548a(j2);
                if (a == -1) {
                    a = miVar.mo33549b(j2);
                }
                fiVar.f31766d = a;
            }
        }
    }

    /* renamed from: e */
    public final int mo30931e(C8121rg rgVar, C8333xg xgVar) throws IOException, InterruptedException {
        C7684fi[] fiVarArr;
        boolean z;
        boolean z2;
        C8121rg rgVar2 = rgVar;
        C8333xg xgVar2 = xgVar;
        while (true) {
            int i = this.f32331e;
            if (i == 0) {
                if (this.f32334h == 0) {
                    if (!rgVar2.mo34538h(this.f32329c.f30037a, 0, 8, true)) {
                        return -1;
                    }
                    this.f32334h = 8;
                    this.f32329c.mo30725v(0);
                    this.f32333g = this.f32329c.mo30716m();
                    this.f32332f = this.f32329c.mo30708e();
                }
                if (this.f32333g == 1) {
                    rgVar2.mo34538h(this.f32329c.f30037a, 8, 8, false);
                    this.f32334h += 8;
                    this.f32333g = this.f32329c.mo30717n();
                }
                int i2 = this.f32332f;
                if (i2 == C8086qh.f38044C || i2 == C8086qh.f38048E || i2 == C8086qh.f38050F || i2 == C8086qh.f38052G || i2 == C8086qh.f38054H || i2 == C8086qh.f38071Q) {
                    long d = (rgVar.mo34534d() + this.f32333g) - ((long) this.f32334h);
                    this.f32330d.add(new C8015oh(this.f32332f, d));
                    if (this.f32333g == ((long) this.f32334h)) {
                        m32526g(d);
                    } else {
                        m32525f();
                    }
                } else {
                    if (i2 == C8086qh.f38073S || i2 == C8086qh.f38046D || i2 == C8086qh.f38074T || i2 == C8086qh.f38075U || i2 == C8086qh.f38105m0 || i2 == C8086qh.f38107n0 || i2 == C8086qh.f38109o0 || i2 == C8086qh.f38072R || i2 == C8086qh.f38111p0 || i2 == C8086qh.f38113q0 || i2 == C8086qh.f38115r0 || i2 == C8086qh.f38117s0 || i2 == C8086qh.f38119t0 || i2 == C8086qh.f38070P || i2 == C8086qh.f38082b || i2 == C8086qh.f38041A0) {
                        C8195tl.m37900e(this.f32334h == 8);
                        C8195tl.m37900e(this.f32333g <= 2147483647L);
                        C7544bm bmVar = new C7544bm((int) this.f32333g);
                        this.f32335i = bmVar;
                        System.arraycopy(this.f32329c.f30037a, 0, bmVar.f30037a, 0, 8);
                    } else {
                        this.f32335i = null;
                    }
                    this.f32331e = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    fiVarArr = this.f32339m;
                    if (i3 >= fiVarArr.length) {
                        break;
                    }
                    C7684fi fiVar = fiVarArr[i3];
                    int i5 = fiVar.f31766d;
                    C7942mi miVar = fiVar.f31764b;
                    if (i5 != miVar.f35519a) {
                        long j2 = miVar.f35520b[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                C7684fi fiVar2 = fiVarArr[i4];
                C7539bh bhVar = fiVar2.f31765c;
                int i6 = fiVar2.f31766d;
                C7942mi miVar2 = fiVar2.f31764b;
                long j3 = miVar2.f35520b[i6];
                int i7 = miVar2.f35521c[i6];
                if (fiVar2.f31763a.f33250g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long d2 = (j3 - rgVar.mo34534d()) + ((long) this.f32336j);
                if (d2 < 0 || d2 >= 262144) {
                    xgVar2.f41156a = j3;
                    return 1;
                }
                int i8 = (int) d2;
                boolean z3 = false;
                rgVar2.mo34539i(i8, false);
                int i9 = fiVar2.f31763a.f33254k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f32336j;
                        if (i10 >= i7) {
                            break;
                        }
                        int d3 = bhVar.mo30675d(rgVar2, i7 - i10, false);
                        this.f32336j += d3;
                        this.f32337k -= d3;
                    }
                } else {
                    byte[] bArr = this.f32328b.f30037a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f32336j < i7) {
                        int i12 = this.f32337k;
                        if (i12 == 0) {
                            rgVar2.mo34538h(this.f32328b.f30037a, i11, i9, z3);
                            this.f32328b.mo30725v(z3 ? 1 : 0);
                            this.f32337k = this.f32328b.mo30712i();
                            this.f32327a.mo30725v(z3);
                            bhVar.mo30673b(this.f32327a, 4);
                            this.f32336j += 4;
                            i7 += i11;
                        } else {
                            int d4 = bhVar.mo30675d(rgVar2, i12, z3);
                            this.f32336j += d4;
                            this.f32337k -= d4;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                C7942mi miVar3 = fiVar2.f31764b;
                bhVar.mo30674c(miVar3.f35523e[i6], miVar3.f35524f[i6], i13, 0, (C7503ah) null);
                fiVar2.f31766d++;
                this.f32336j = 0;
                this.f32337k = 0;
                return 0;
            } else {
                long j4 = this.f32333g - ((long) this.f32334h);
                long d5 = rgVar.mo34534d() + j4;
                C7544bm bmVar2 = this.f32335i;
                if (bmVar2 != null) {
                    rgVar2.mo34538h(bmVar2.f30037a, this.f32334h, (int) j4, false);
                    if (this.f32332f == C8086qh.f38082b) {
                        C7544bm bmVar3 = this.f32335i;
                        bmVar3.mo30725v(8);
                        if (bmVar3.mo30708e() == f32326q) {
                            z2 = true;
                        } else {
                            bmVar3.mo30726w(4);
                            while (true) {
                                if (bmVar3.mo30704a() > 0) {
                                    if (bmVar3.mo30708e() == f32326q) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.f32341o = z2;
                    } else if (!this.f32330d.isEmpty()) {
                        this.f32330d.peek().mo33901g(new C8050ph(this.f32332f, this.f32335i));
                    }
                } else if (j4 < 262144) {
                    rgVar2.mo34539i((int) j4, false);
                } else {
                    xgVar2.f41156a = rgVar.mo34534d() + j4;
                    z = true;
                    m32526g(d5);
                    if (z && this.f32331e != 2) {
                        return 1;
                    }
                }
                z = false;
                m32526g(d5);
                return 1;
            }
        }
    }

    public final long zza() {
        return this.f32340n;
    }

    public final boolean zzc() {
        return true;
    }
}
