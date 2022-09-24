package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.oe */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8012oe implements Handler.Callback, C8124rj, C8337xk, C8193tj {

    /* renamed from: A */
    private int f36412A;

    /* renamed from: B */
    private C7938me f36413B;

    /* renamed from: C */
    private long f36414C;

    /* renamed from: D */
    private C7864ke f36415D;

    /* renamed from: E */
    private C7864ke f36416E;

    /* renamed from: F */
    private C7864ke f36417F;

    /* renamed from: G */
    private C7501af f36418G;

    /* renamed from: H */
    private boolean f36419H;

    /* renamed from: I */
    private volatile int f36420I;

    /* renamed from: J */
    private volatile int f36421J;

    /* renamed from: K */
    private final jr0 f36422K;

    /* renamed from: b */
    private final C8224ue[] f36423b;

    /* renamed from: c */
    private final C8261ve[] f36424c;

    /* renamed from: d */
    private final C8373yk f36425d;

    /* renamed from: e */
    private final C7651em f36426e;

    /* renamed from: f */
    private final Handler f36427f;

    /* renamed from: g */
    private final HandlerThread f36428g;

    /* renamed from: h */
    private final Handler f36429h;

    /* renamed from: i */
    private final C7680fe f36430i;

    /* renamed from: j */
    private final C8403ze f36431j;

    /* renamed from: k */
    private final C8367ye f36432k;

    /* renamed from: l */
    private C7901le f36433l;

    /* renamed from: m */
    private C8188te f36434m;

    /* renamed from: n */
    private C8224ue f36435n;

    /* renamed from: o */
    private C8338xl f36436o;

    /* renamed from: p */
    private C8229uj f36437p;

    /* renamed from: q */
    private C8224ue[] f36438q;

    /* renamed from: r */
    private boolean f36439r;

    /* renamed from: s */
    private boolean f36440s;

    /* renamed from: t */
    private boolean f36441t;

    /* renamed from: u */
    private boolean f36442u;

    /* renamed from: v */
    private int f36443v;

    /* renamed from: w */
    private int f36444w = 0;

    /* renamed from: x */
    private int f36445x;

    /* renamed from: y */
    private int f36446y;

    /* renamed from: z */
    private long f36447z;

    public C8012oe(C8224ue[] ueVarArr, C8373yk ykVar, jr0 jr0, boolean z, int i, Handler handler, C7901le leVar, C7680fe feVar, byte[] bArr) {
        this.f36423b = ueVarArr;
        this.f36425d = ykVar;
        this.f36422K = jr0;
        this.f36440s = z;
        this.f36429h = handler;
        this.f36443v = 1;
        this.f36433l = leVar;
        this.f36430i = feVar;
        this.f36424c = new C8261ve[2];
        for (int i2 = 0; i2 < 2; i2++) {
            ueVarArr[i2].mo35171e(i2);
            this.f36424c[i2] = ueVarArr[i2].zzf();
        }
        this.f36426e = new C7651em();
        this.f36438q = new C8224ue[0];
        this.f36431j = new C8403ze();
        this.f36432k = new C8367ye();
        ykVar.mo35941c(this);
        this.f36434m = C8188te.f39400d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f36428g = handlerThread;
        handlerThread.start();
        this.f36427f = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: A */
    private final int m35656A(int i, C7501af afVar, C7501af afVar2) {
        int b = afVar.mo30364b();
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = afVar.mo30368f(i, this.f36432k, this.f36431j, this.f36444w);
            i2 = afVar2.mo30363a(afVar.mo30366d(i, this.f36432k, true).f41794b);
        }
        return i2;
    }

    /* renamed from: B */
    private final long m35657B(int i, long j) throws C7536be {
        C7864ke keVar;
        m35675k();
        this.f36441t = false;
        m35672h(2);
        C7864ke keVar2 = this.f36417F;
        if (keVar2 == null) {
            C7864ke keVar3 = this.f36415D;
            if (keVar3 != null) {
                keVar3.mo33070c();
            }
            keVar = null;
        } else {
            keVar = null;
            while (keVar2 != null) {
                if (keVar2.f34264g != i || !keVar2.f34267j) {
                    keVar2.mo33070c();
                } else {
                    keVar = keVar2;
                }
                keVar2 = keVar2.f34269l;
            }
        }
        C7864ke keVar4 = this.f36417F;
        if (!(keVar4 == keVar && keVar4 == this.f36416E)) {
            for (C8224ue zzj : this.f36438q) {
                zzj.zzj();
            }
            this.f36438q = new C8224ue[0];
            this.f36436o = null;
            this.f36435n = null;
            this.f36417F = null;
        }
        if (keVar != null) {
            keVar.f34269l = null;
            this.f36415D = keVar;
            this.f36416E = keVar;
            m35671g(keVar);
            C7864ke keVar5 = this.f36417F;
            if (keVar5.f34268k) {
                j = keVar5.f34258a.mo33911i(j);
            }
            m35668a(j);
            m35664I();
        } else {
            this.f36415D = null;
            this.f36416E = null;
            this.f36417F = null;
            m35668a(j);
        }
        this.f36427f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: C */
    private final Pair<Integer, Long> m35658C(int i, long j) {
        return m35659D(this.f36418G, 0, C6540C.TIME_UNSET);
    }

    /* renamed from: D */
    private final Pair<Integer, Long> m35659D(C7501af afVar, int i, long j) {
        return m35660E(afVar, 0, j, 0);
    }

    /* renamed from: E */
    private final Pair<Integer, Long> m35660E(C7501af afVar, int i, long j, long j2) {
        C8195tl.m37896a(0, 0, afVar.mo30365c());
        afVar.mo30367e(0, this.f36431j, false, j2);
        if (j == C6540C.TIME_UNSET) {
            j = 0;
        }
        long j3 = afVar.mo30366d(0, this.f36432k, false).f41795c;
        if (j3 != C6540C.TIME_UNSET) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    /* renamed from: F */
    private final Pair<Integer, Long> m35661F(C7938me meVar) {
        C7501af afVar = meVar.f35500a;
        if (afVar.mo30370h()) {
            afVar = this.f36418G;
        }
        try {
            Pair<Integer, Long> D = m35659D(afVar, 0, meVar.f35502c);
            C7501af afVar2 = this.f36418G;
            if (afVar2 == afVar) {
                return D;
            }
            if (afVar2.mo30363a(afVar.mo30366d(((Integer) D.first).intValue(), this.f36432k, true).f41794b) != -1) {
                return Pair.create(0, (Long) D.second);
            }
            if (m35656A(((Integer) D.first).intValue(), afVar, this.f36418G) == -1) {
                return null;
            }
            this.f36418G.mo30366d(0, this.f36432k, false);
            return m35658C(0, C6540C.TIME_UNSET);
        } catch (IndexOutOfBoundsException unused) {
            throw new C8119re(this.f36418G, 0, meVar.f35502c);
        }
    }

    /* renamed from: G */
    private final void m35662G(boolean[] zArr, int i) throws C7536be {
        int i2;
        this.f36438q = new C8224ue[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            C8224ue ueVar = this.f36423b[i3];
            C8018ok a = this.f36417F.f34270m.f42487b.mo35640a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.f36438q[i4] = ueVar;
                if (ueVar.zzb() == 0) {
                    C8295we weVar = this.f36417F.f34270m.f42489d[i3];
                    boolean z = this.f36440s && this.f36443v == 3;
                    boolean z2 = !zArr[i3] && z;
                    a.mo33930b();
                    zzapg[] zzapgArr = new zzapg[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzapgArr[i6] = a.mo33931c(i6);
                    }
                    C7864ke keVar = this.f36417F;
                    i2 = i3;
                    ueVar.mo35173g(weVar, zzapgArr, keVar.f34261d[i3], this.f36414C, z2, keVar.f34263f - keVar.f34265h);
                    C8338xl zzi = ueVar.zzi();
                    if (zzi != null) {
                        if (this.f36436o == null) {
                            this.f36436o = zzi;
                            this.f36435n = ueVar;
                            zzi.mo30903a(this.f36434m);
                        } else {
                            throw C7536be.m30678c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        ueVar.mo35170d();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* renamed from: H */
    private final void m35663H(Object obj, int i) {
        this.f36433l = new C7901le(0, 0);
        m35666K(obj, i);
        this.f36433l = new C7901le(0, C6540C.TIME_UNSET);
        m35672h(4);
        m35667L(false);
    }

    /* renamed from: I */
    private final void m35664I() {
        long j;
        C7864ke keVar = this.f36415D;
        if (!keVar.f34267j) {
            j = 0;
        } else {
            j = keVar.f34258a.zza();
        }
        if (j == Long.MIN_VALUE) {
            m35670f(false);
            return;
        }
        C7864ke keVar2 = this.f36415D;
        long j2 = this.f36414C - (keVar2.f34263f - keVar2.f34265h);
        boolean j3 = this.f36422K.mo32966j(j - j2);
        m35670f(j3);
        if (j3) {
            this.f36415D.f34258a.mo32146a(j2);
        }
    }

    /* renamed from: J */
    private final void m35665J() throws IOException {
        C7864ke keVar = this.f36415D;
        if (keVar != null && !keVar.f34267j) {
            C7864ke keVar2 = this.f36416E;
            if (keVar2 == null || keVar2.f34269l == keVar) {
                C8224ue[] ueVarArr = this.f36438q;
                int length = ueVarArr.length;
                int i = 0;
                while (i < length) {
                    if (ueVarArr[i].zzA()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f36415D.f34258a.zzs();
            }
        }
    }

    /* renamed from: K */
    private final void m35666K(Object obj, int i) {
        this.f36429h.obtainMessage(6, new C7976ne(this.f36418G, obj, this.f36433l, i)).sendToTarget();
    }

    /* renamed from: L */
    private final void m35667L(boolean z) {
        this.f36427f.removeMessages(2);
        this.f36441t = false;
        this.f36426e.mo31601d();
        this.f36436o = null;
        this.f36435n = null;
        this.f36414C = 60000000;
        for (C8224ue ueVar : this.f36438q) {
            try {
                m35679o(ueVar);
                ueVar.zzj();
            } catch (C7536be | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f36438q = new C8224ue[0];
        C7864ke keVar = this.f36417F;
        if (keVar == null) {
            keVar = this.f36415D;
        }
        m35680p(keVar);
        this.f36415D = null;
        this.f36416E = null;
        this.f36417F = null;
        m35670f(false);
        if (z) {
            C8229uj ujVar = this.f36437p;
            if (ujVar != null) {
                ujVar.zzd();
                this.f36437p = null;
            }
            this.f36418G = null;
        }
    }

    /* renamed from: a */
    private final void m35668a(long j) throws C7536be {
        long j2;
        C7864ke keVar = this.f36417F;
        if (keVar == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + (keVar.f34263f - keVar.f34265h);
        }
        this.f36414C = j2;
        this.f36426e.mo31599b(j2);
        for (C8224ue f : this.f36438q) {
            f.mo35172f(this.f36414C);
        }
    }

    /* renamed from: e */
    private final void m35669e(long j, long j2) {
        this.f36427f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f36427f.sendEmptyMessage(2);
        } else {
            this.f36427f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: f */
    private final void m35670f(boolean z) {
        if (this.f36442u != z) {
            this.f36442u = z;
            this.f36429h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: g */
    private final void m35671g(C7864ke keVar) throws C7536be {
        if (this.f36417F != keVar) {
            boolean[] zArr = new boolean[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                C8224ue ueVar = this.f36423b[i2];
                zArr[i2] = ueVar.zzb() != 0;
                C8018ok a = keVar.f34270m.f42487b.mo35640a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (ueVar.zzB() && ueVar.zzh() == this.f36417F.f34261d[i2]))) {
                    if (ueVar == this.f36435n) {
                        this.f36426e.mo31602e(this.f36436o);
                        this.f36436o = null;
                        this.f36435n = null;
                    }
                    m35679o(ueVar);
                    ueVar.zzj();
                }
            }
            this.f36417F = keVar;
            this.f36429h.obtainMessage(3, keVar.f34270m).sendToTarget();
            m35662G(zArr, i);
        }
    }

    /* renamed from: h */
    private final void m35672h(int i) {
        if (this.f36443v != i) {
            this.f36443v = i;
            this.f36429h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: i */
    private final void m35673i() throws C7536be {
        this.f36441t = false;
        this.f36426e.mo31600c();
        for (C8224ue d : this.f36438q) {
            d.mo35170d();
        }
    }

    /* renamed from: j */
    private final void m35674j() {
        m35667L(true);
        this.f36422K.mo32959c();
        m35672h(1);
    }

    /* renamed from: k */
    private final void m35675k() throws C7536be {
        this.f36426e.mo31601d();
        for (C8224ue o : this.f36438q) {
            m35679o(o);
        }
    }

    /* renamed from: l */
    private final void m35676l() throws C7536be {
        long j;
        C7864ke keVar = this.f36417F;
        if (keVar != null) {
            long zzh = keVar.f34258a.zzh();
            if (zzh != C6540C.TIME_UNSET) {
                m35668a(zzh);
            } else {
                C8224ue ueVar = this.f36435n;
                if (ueVar == null || ueVar.zzE()) {
                    this.f36414C = this.f36426e.zzI();
                } else {
                    long zzI = this.f36436o.zzI();
                    this.f36414C = zzI;
                    this.f36426e.mo31599b(zzI);
                }
                C7864ke keVar2 = this.f36417F;
                zzh = this.f36414C - (keVar2.f34263f - keVar2.f34265h);
            }
            this.f36433l.f35011c = zzh;
            this.f36447z = SystemClock.elapsedRealtime() * 1000;
            if (this.f36438q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f36417F.f34258a.zzg();
            }
            C7901le leVar = this.f36433l;
            if (j == Long.MIN_VALUE) {
                j = this.f36418G.mo30366d(this.f36417F.f34264g, this.f36432k, false).f41795c;
            }
            leVar.f35012d = j;
        }
    }

    /* renamed from: m */
    private final boolean m35677m(int i) {
        this.f36418G.mo30366d(i, this.f36432k, false);
        this.f36418G.mo30369g(0, this.f36431j, false);
        if (this.f36418G.mo30368f(i, this.f36432k, this.f36431j, this.f36444w) == -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r6 = r5.f36417F.f34269l;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m35678n(long r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.le r2 = r5.f36433l
            long r2 = r2.f35011c
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x001f
            com.google.android.gms.internal.ads.ke r6 = r5.f36417F
            com.google.android.gms.internal.ads.ke r6 = r6.f34269l
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.f34267j
            if (r6 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8012oe.m35678n(long):boolean");
    }

    /* renamed from: o */
    private static final void m35679o(C8224ue ueVar) throws C7536be {
        if (ueVar.zzb() == 2) {
            ueVar.zzz();
        }
    }

    /* renamed from: p */
    private static final void m35680p(C7864ke keVar) {
        while (keVar != null) {
            keVar.mo33070c();
            keVar = keVar.f34269l;
        }
    }

    /* renamed from: b */
    public final void mo33872b(C8158sj sjVar) {
        this.f36427f.obtainMessage(8, sjVar).sendToTarget();
    }

    /* renamed from: c */
    public final void mo33873c(C7501af afVar, Object obj) {
        this.f36427f.obtainMessage(7, Pair.create(afVar, (Object) null)).sendToTarget();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo31883d(C7760hk hkVar) {
        this.f36427f.obtainMessage(9, (C8158sj) hkVar).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0798, code lost:
        if (m35678n(r1) != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x087e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x087f, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f36429h.obtainMessage(8, com.google.android.gms.internal.ads.C7536be.m30678c(r1)).sendToTarget();
        m35674j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x089a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x089b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x089c, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08b9, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0268 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026c A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0271 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ea A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f1 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0508 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x050b A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0546 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0558 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0572 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }, LOOP:8: B:317:0x0572->B:321:0x0582, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06c7 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x087e A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            r33 = this;
            r8 = r33
            r1 = r34
            r10 = 1
            int r2 = r1.what     // Catch:{ be -> 0x08b8, IOException -> 0x089b, RuntimeException -> 0x087e }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x083d;
                case 1: goto L_0x080e;
                case 2: goto L_0x0429;
                case 3: goto L_0x038a;
                case 4: goto L_0x036c;
                case 5: goto L_0x0368;
                case 6: goto L_0x0351;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b6;
                case 10: goto L_0x00da;
                case 11: goto L_0x009c;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36444w = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            com.google.android.gms.internal.ads.ke r3 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.ke r4 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.af r11 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r13 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ze r14 = r8.f36431j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.mo30368f(r12, r13, r14, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0042:
            com.google.android.gms.internal.ads.ke r12 = r2.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0068
            if (r11 == r5) goto L_0x0068
            int r13 = r12.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 != r11) goto L_0x0068
            com.google.android.gms.internal.ads.ke r2 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r4 = r4 | r2
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r11 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ze r14 = r8.f36431j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r2.mo30368f(r13, r11, r14, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r12
            goto L_0x0042
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            m35680p(r12)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f34269l = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x006f:
            int r5 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r5 = r8.m35677m(r5)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f34266i = r5     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != 0) goto L_0x007b
            r8.f36415D = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x007b:
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.ke r2 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0092
            int r2 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r3 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r8.m35657B(r2, r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r5 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r2, r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r5     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0092:
            int r2 = r8.f36443v     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r15) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            r8.m35672h(r7)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x009b:
            return r10
        L_0x009c:
            java.lang.Object r1 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ee[] r1 = (com.google.android.gms.internal.ads.C7643ee[]) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ all -> 0x00c9 }
        L_0x00a1:
            if (r9 >= r2) goto L_0x00b1
            r3 = r1[r9]     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.internal.ads.de r4 = r3.f31331a     // Catch:{ all -> 0x00c9 }
            int r5 = r3.f31332b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f31333c     // Catch:{ all -> 0x00c9 }
            r4.mo30905j(r5, r3)     // Catch:{ all -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00b1:
            com.google.android.gms.internal.ads.uj r1 = r8.f36437p     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00ba
            android.os.Handler r1 = r8.f36427f     // Catch:{ all -> 0x00c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            monitor-enter(r33)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r8.f36446y     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + r10
            r8.f36446y = r1     // Catch:{ all -> 0x00c5 }
            r33.notifyAll()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            return r10
        L_0x00c5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            monitor-enter(r33)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.f36446y     // Catch:{ all -> 0x00d6 }
            int r2 = r2 + r10
            r8.f36446y = r2     // Catch:{ all -> 0x00d6 }
            r33.notifyAll()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00da:
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x01b5
            r2 = 1
        L_0x00df:
            if (r1 == 0) goto L_0x01b5
            boolean r3 = r1.f34267j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x00e7
            goto L_0x01b5
        L_0x00e7:
            boolean r3 = r1.mo33072e()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.ke r2 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r3 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == r3) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            com.google.android.gms.internal.ads.ke r3 = r3.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m35680p(r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r3 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f34269l = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36415D = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36416E = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean[] r4 = new boolean[r7]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r5 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r3.mo33069b(r11, r2, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r5 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.le r5 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.f35011c = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35668a(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x011e:
            boolean[] r2 = new boolean[r7]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 0
            r5 = 0
        L_0x0122:
            if (r3 >= r7) goto L_0x0169
            com.google.android.gms.internal.ads.ue[] r11 = r8.f36423b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r11[r3]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.zzb()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0130:
            r12 = 0
        L_0x0131:
            r2[r3] = r12     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r13 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ek[] r13 = r13.f34261d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r3]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x013d
            int r5 = r5 + 1
        L_0x013d:
            if (r12 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.ek r12 = r11.zzh()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == r12) goto L_0x015d
            com.google.android.gms.internal.ads.ue r12 = r8.f36435n     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r12) goto L_0x0156
            if (r13 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.em r12 = r8.f36426e     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xl r13 = r8.f36436o     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.mo31602e(r13)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0152:
            r8.f36436o = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36435n = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0156:
            m35679o(r11)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.zzj()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0166
        L_0x015d:
            boolean r12 = r4[r3]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0166
            long r12 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo35172f(r12)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0169:
            android.os.Handler r3 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zk r1 = r1.f34270m     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35662G(r2, r5)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x019d
        L_0x0178:
            r8.f36415D = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r1.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            r1.mo33070c()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r1.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x017c
        L_0x0184:
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.f34269l = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.f34267j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x019d
            long r2 = r1.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r11 - r2
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r3 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo33068a(r1, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x019d:
            r33.m35664I()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m35676l()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f36427f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r7)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x01b5
        L_0x01a9:
            com.google.android.gms.internal.ads.ke r3 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != r3) goto L_0x01af
            r3 = 0
            goto L_0x01b0
        L_0x01af:
            r3 = 1
        L_0x01b0:
            r2 = r2 & r3
            com.google.android.gms.internal.ads.ke r1 = r1.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x00df
        L_0x01b5:
            return r10
        L_0x01b6:
            java.lang.Object r1 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.sj r1 = (com.google.android.gms.internal.ads.C8158sj) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.sj r2 = r2.f34258a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r1) goto L_0x01c5
            r33.m35664I()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01c5:
            return r10
        L_0x01c6:
            java.lang.Object r1 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.sj r1 = (com.google.android.gms.internal.ads.C8158sj) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.sj r3 = r2.f34258a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == r1) goto L_0x01d3
            goto L_0x01f5
        L_0x01d3:
            r2.f34267j = r10     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo33072e()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.mo33068a(r3, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f34265h = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x01f2
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36416E = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35668a(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35671g(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f2:
            r33.m35664I()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f5:
            return r10
        L_0x01f6:
            java.lang.Object r1 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r1.first     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r3 = (com.google.android.gms.internal.ads.C7501af) r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36418G = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0263
            int r4 = r8.f36412A     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 <= 0) goto L_0x0235
            com.google.android.gms.internal.ads.me r3 = r8.f36413B     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r3 = r8.m35661F(r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r8.f36412A     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36412A = r9     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36413B = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x021d
            r8.m35663H(r1, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x021d:
            com.google.android.gms.internal.ads.le r7 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.first     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.intValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7.<init>(r11, r14)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r7     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0264
        L_0x0235:
            com.google.android.gms.internal.ads.le r4 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r4.f35010b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0263
            boolean r3 = r3.mo30370h()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0248
            r8.m35663H(r1, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0248:
            android.util.Pair r3 = r8.m35658C(r9, r12)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r4 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r7 = r3.first     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.intValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4.<init>(r7, r14)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r4     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0263:
            r4 = 0
        L_0x0264:
            com.google.android.gms.internal.ads.ke r3 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x026a
            com.google.android.gms.internal.ads.ke r3 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x026a:
            if (r3 != 0) goto L_0x0271
            r8.m35666K(r1, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0271:
            com.google.android.gms.internal.ads.af r7 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.f34259b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.mo30363a(r11)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != r5) goto L_0x02d4
            int r6 = r3.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r7 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.m35656A(r6, r2, r7)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r5) goto L_0x028a
            r8.m35663H(r1, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x028a:
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r6 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo30366d(r9, r6, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r2 = r8.m35658C(r9, r12)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r6 = r2.first     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = r6.intValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r2.longValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r7 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo30366d(r6, r7, r10)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r2 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.f41794b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f34264g = r5     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02b2:
            com.google.android.gms.internal.ads.ke r3 = r3.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r7 = r3.f34259b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r7.equals(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r10 == r7) goto L_0x02c0
            r7 = -1
            goto L_0x02c1
        L_0x02c0:
            r7 = r6
        L_0x02c1:
            r3.f34264g = r7     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x02b2
        L_0x02c4:
            long r2 = r8.m35657B(r6, r11)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r5 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r6, r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r5     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35666K(r1, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x02d4:
            boolean r2 = r8.m35677m(r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f34264g = r9     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f34266i = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != r2) goto L_0x02e2
            r2 = 1
            goto L_0x02e3
        L_0x02e2:
            r2 = 0
        L_0x02e3:
            com.google.android.gms.internal.ads.le r11 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.f35009a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x02fa
            com.google.android.gms.internal.ads.le r12 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f35010b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.<init>(r9, r13)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f35011c = r13     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f35012d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f35012d = r13     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r12     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02fa:
            com.google.android.gms.internal.ads.ke r11 = r3.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 == 0) goto L_0x034d
            com.google.android.gms.internal.ads.af r12 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r13 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ze r14 = r8.f36431j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f36444w     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r12.mo30368f(r7, r13, r14, r15)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == r5) goto L_0x0330
            java.lang.Object r12 = r11.f34259b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r13 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r14 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r13 = r13.mo30366d(r7, r14, r10)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r13 = r13.f41794b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r12 = r12.equals(r13)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0330
            boolean r3 = r8.m35677m(r7)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f34264g = r7     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f34266i = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r3 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r3) goto L_0x032c
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02fa
        L_0x0330:
            if (r2 != 0) goto L_0x0346
            com.google.android.gms.internal.ads.ke r2 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r3 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r3.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r8.m35657B(r2, r5)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r3 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.<init>(r2, r5)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x034d
        L_0x0346:
            r8.f36415D = r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f34269l = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m35680p(r11)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x034d:
            r8.m35666K(r1, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0350:
            return r10
        L_0x0351:
            r8.m35667L(r10)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.jr0 r1 = r8.f36422K     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo32958b()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35672h(r10)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            monitor-enter(r33)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36439r = r10     // Catch:{ all -> 0x0364 }
            r33.notifyAll()     // Catch:{ all -> 0x0364 }
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            return r10
        L_0x0364:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            throw r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0368:
            r33.m35674j()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x036c:
            java.lang.Object r1 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.te r1 = (com.google.android.gms.internal.ads.C8188te) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xl r2 = r8.f36436o     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0379
            com.google.android.gms.internal.ads.te r1 = r2.mo30903a(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x037e
        L_0x0379:
            com.google.android.gms.internal.ads.em r2 = r8.f36426e     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo30903a(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x037e:
            r8.f36434m = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x038a:
            java.lang.Object r1 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.me r1 = (com.google.android.gms.internal.ads.C7938me) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x039b
            int r2 = r8.f36412A     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r8.f36412A = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36413B = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x039b:
            android.util.Pair r2 = r8.m35661F(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.internal.ads.le r1 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r1 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r12)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35672h(r15)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35667L(r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03bf:
            long r3 = r1.f35502c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            r1 = 1
            goto L_0x03c8
        L_0x03c7:
            r1 = 0
        L_0x03c8:
            java.lang.Object r3 = r2.first     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.intValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.longValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r2 = r8.f36433l     // Catch:{ all -> 0x0416 }
            int r6 = r2.f35009a     // Catch:{ all -> 0x0416 }
            if (r3 != r6) goto L_0x03fb
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r16
            long r11 = r2.f35011c     // Catch:{ all -> 0x0416 }
            long r11 = r11 / r16
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x03fb
            com.google.android.gms.internal.ads.le r2 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x03f7:
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03fb:
            long r6 = r8.m35657B(r3, r4)     // Catch:{ all -> 0x0416 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0405
            r2 = 1
            goto L_0x0406
        L_0x0405:
            r2 = 0
        L_0x0406:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.le r2 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r6)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x03f7
        L_0x0415:
            return r10
        L_0x0416:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.le r6 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6.<init>(r3, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r6     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r6)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            throw r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0429:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r1 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.internal.ads.uj r1 = r8.f36437p     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r5
            goto L_0x0677
        L_0x043b:
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0444
            com.google.android.gms.internal.ads.le r1 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f35009a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0479
        L_0x0444:
            int r2 = r1.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r1.f34266i     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0553
            boolean r1 = r1.mo33071d()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.af r1 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r7 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r1 = r1.mo30366d(r2, r7, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f41795c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x046d
            com.google.android.gms.internal.ads.ke r7 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.f34260c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f34260c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0553
        L_0x046d:
            com.google.android.gms.internal.ads.af r1 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r7 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ze r14 = r8.f36431j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f36444w     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.mo30368f(r2, r7, r14, r15)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0479:
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.mo30364b()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 < r2) goto L_0x0488
            com.google.android.gms.internal.ads.uj r1 = r8.f36437p     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0553
        L_0x0488:
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0493
            com.google.android.gms.internal.ads.le r2 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0490:
            r11 = r5
            r15 = 2
            goto L_0x04e6
        L_0x0493:
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r7 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo30366d(r1, r7, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ze r7 = r8.f36431j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo30369g(r9, r7, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x04a4
            goto L_0x0490
        L_0x04a4:
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r11
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r7 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r1 = r2.mo30366d(r1, r7, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f41795c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 + r1
            long r1 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r1
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r13 = java.lang.Math.max(r3, r14)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r33
            r3 = r7
            r6 = r5
            r4 = r11
            r11 = r6
            r15 = 2
            r6 = r13
            android.util.Pair r1 = r1.m35660E(r2, r3, r4, r6)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0554
            java.lang.Object r2 = r1.first     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.intValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r1.longValue()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r2
        L_0x04e6:
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x04f1
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04ee:
            r21 = r5
            goto L_0x0504
        L_0x04f1:
            long r5 = r2.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 - r13
            com.google.android.gms.internal.ads.af r7 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r13 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r2 = r7.mo30366d(r2, r13, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f41795c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 + r13
            goto L_0x04ee
        L_0x0504:
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x050b
            r27 = 0
            goto L_0x0510
        L_0x050b:
            int r2 = r2.f34260c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r27 = r2
        L_0x0510:
            boolean r29 = r8.m35677m(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.af r2 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r5 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo30366d(r1, r5, r10)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = new com.google.android.gms.internal.ads.ke     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ue[] r5 = r8.f36423b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve[] r6 = r8.f36424c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.yk r7 = r8.f36425d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.jr0 r13 = r8.f36422K     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.uj r14 = r8.f36437p     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r15 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r15 = r15.f41794b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r32 = 0
            r18 = r2
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r13
            r25 = r14
            r26 = r15
            r28 = r1
            r30 = r3
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0548
            r1.f34269l = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0548:
            r8.f36415D = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.sj r1 = r2.f34258a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo33912k(r8, r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35670f(r10)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0554
        L_0x0553:
            r11 = r5
        L_0x0554:
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056b
            boolean r1 = r1.mo33071d()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x055f
            goto L_0x056b
        L_0x055f:
            com.google.android.gms.internal.ads.ke r1 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056e
            boolean r1 = r8.f36442u     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x056e
            r33.m35664I()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x056e
        L_0x056b:
            r8.m35670f(r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x056e:
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0677
        L_0x0572:
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == r2) goto L_0x05a9
            long r3 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r5 = r1.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x05a9
            r1.mo33070c()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r1.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35671g(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r1 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r3, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m35676l()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 5
            com.google.android.gms.internal.ads.le r3 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0572
        L_0x05a9:
            boolean r1 = r2.f34266i     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x05cf
            r1 = 0
        L_0x05ae:
            r2 = 2
            if (r1 >= r2) goto L_0x0677
            com.google.android.gms.internal.ads.ue[] r2 = r8.f36423b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r3 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ek[] r3 = r3.f34261d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            com.google.android.gms.internal.ads.ek r4 = r2.zzh()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x05cc
            boolean r3 = r2.zzA()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            r2.zzv()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x05cc:
            int r1 = r1 + 1
            goto L_0x05ae
        L_0x05cf:
            r1 = 0
        L_0x05d0:
            r2 = 2
            if (r1 >= r2) goto L_0x05ee
            com.google.android.gms.internal.ads.ue[] r2 = r8.f36423b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r3 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ek[] r3 = r3.f34261d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ek r4 = r2.zzh()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x0677
            if (r3 == 0) goto L_0x05eb
            boolean r2 = r2.zzA()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
        L_0x05eb:
            int r1 = r1 + 1
            goto L_0x05d0
        L_0x05ee:
            com.google.android.gms.internal.ads.ke r1 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r1.f34269l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
            boolean r3 = r2.f34267j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0677
            com.google.android.gms.internal.ads.zk r1 = r1.f34270m     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36416E = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zk r3 = r2.f34270m     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.sj r2 = r2.f34258a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.zzh()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 0
            r6 = 2
        L_0x0606:
            if (r2 >= r6) goto L_0x0677
            com.google.android.gms.internal.ads.ue[] r6 = r8.f36423b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6 = r6[r2]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wk r7 = r1.f42487b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ok r7 = r7.mo35640a(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0619
        L_0x0614:
            r19 = r3
            r20 = r4
            goto L_0x066d
        L_0x0619:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0626
            r6.zzv()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0614
        L_0x0626:
            boolean r7 = r6.zzB()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0614
            com.google.android.gms.internal.ads.wk r7 = r3.f42487b     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ok r7 = r7.mo35640a(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we[] r13 = r1.f42489d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r2]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we[] r14 = r3.f42489d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == 0) goto L_0x0666
            boolean r13 = r14.equals(r13)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x0666
            r7.mo33930b()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzapg[] r13 = new com.google.android.gms.internal.ads.zzapg[r10]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = 0
        L_0x0648:
            if (r14 > 0) goto L_0x0653
            com.google.android.gms.internal.ads.zzapg r15 = r7.mo33931c(r14)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13[r14] = r15     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r14 = r14 + 1
            goto L_0x0648
        L_0x0653:
            com.google.android.gms.internal.ads.ke r7 = r8.f36416E     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ek[] r14 = r7.f34261d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r7.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r19 = r3
            r20 = r4
            long r3 = r7.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r3
            r6.mo35174i(r13, r14, r9)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x066d
        L_0x0666:
            r19 = r3
            r20 = r4
            r6.zzv()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x066d:
            int r2 = r2 + 1
            r3 = r19
            r4 = r20
            r6 = 2
            r9 = 0
            r10 = 1
            goto L_0x0606
        L_0x0677:
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 10
            if (r1 != 0) goto L_0x0686
            r33.m35665J()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m35669e(r11, r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0683:
            r1 = 1
            goto L_0x080d
        L_0x0686:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.C7725gm.m32582a(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m35676l()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r1 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.sj r1 = r1.f34258a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r4 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r4.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo33908f(r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ue[] r1 = r8.f36438q     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r1.length     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x069f:
            if (r7 >= r4) goto L_0x06d6
            r9 = r1[r7]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r8.f36447z     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9.mo34135h(r13, r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x06b4
            boolean r2 = r9.zzE()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06b4
            r6 = 1
            goto L_0x06b5
        L_0x06b4:
            r6 = 0
        L_0x06b5:
            boolean r2 = r9.mo30904b()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06c4
            boolean r2 = r9.zzE()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06c2
            goto L_0x06c4
        L_0x06c2:
            r2 = 0
            goto L_0x06c5
        L_0x06c4:
            r2 = 1
        L_0x06c5:
            if (r2 != 0) goto L_0x06ca
            r9.zzm()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06ca:
            if (r5 == 0) goto L_0x06d0
            if (r2 == 0) goto L_0x06d0
            r5 = 1
            goto L_0x06d1
        L_0x06d0:
            r5 = 0
        L_0x06d1:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x069f
        L_0x06d6:
            if (r5 != 0) goto L_0x06db
            r33.m35665J()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06db:
            com.google.android.gms.internal.ads.xl r1 = r8.f36436o     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.te r1 = r1.zzJ()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.te r2 = r8.f36434m     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.equals(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06fe
            r8.f36434m = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.em r2 = r8.f36426e     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xl r3 = r8.f36436o     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo31602e(r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06fe:
            com.google.android.gms.internal.ads.af r1 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r3 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            com.google.android.gms.internal.ads.ye r1 = r1.mo30366d(r2, r3, r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f41795c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x072f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0720
            com.google.android.gms.internal.ads.le r3 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f35011c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x072f
        L_0x0720:
            com.google.android.gms.internal.ads.ke r3 = r8.f36417F     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r3.f34266i     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x072f
            r3 = 4
            r8.m35672h(r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m35675k()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x072f:
            int r3 = r8.f36443v     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 2
            if (r3 != r4) goto L_0x07a6
            com.google.android.gms.internal.ads.ue[] r3 = r8.f36438q     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x0794
            if (r5 == 0) goto L_0x07c0
            boolean r1 = r8.f36441t     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f34267j     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x0746
            long r2 = r2.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x074c
        L_0x0746:
            com.google.android.gms.internal.ads.sj r2 = r2.f34258a     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.zzg()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x074c:
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0766
            com.google.android.gms.internal.ads.ke r2 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f34266i     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0759
            goto L_0x079a
        L_0x0759:
            com.google.android.gms.internal.ads.af r3 = r8.f36418G     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f34264g     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ye r4 = r8.f36432k     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 0
            com.google.android.gms.internal.ads.ye r2 = r3.mo30366d(r2, r4, r5)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.f41795c     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0766:
            boolean r4 = r8.f36419H     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 == 0) goto L_0x0780
            com.google.android.gms.internal.ads.jr0 r2 = r8.f36422K     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.le r3 = r8.f36433l     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f35012d     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r5 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r3 = r3 - r6
            boolean r1 = r2.mo32967k(r3, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0791
        L_0x0780:
            com.google.android.gms.internal.ads.jr0 r4 = r8.f36422K     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ke r5 = r8.f36415D     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f36414C     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f34263f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f34265h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.mo32967k(r2, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0791:
            if (r1 == 0) goto L_0x07c0
            goto L_0x079a
        L_0x0794:
            boolean r1 = r8.m35678n(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
        L_0x079a:
            r1 = 3
            r8.m35672h(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r1 = r8.f36440s     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
            r33.m35673i()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x07a6:
            r4 = 3
            if (r3 != r4) goto L_0x07c0
            com.google.android.gms.internal.ads.ue[] r3 = r8.f36438q     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x07af
            goto L_0x07b3
        L_0x07af:
            boolean r5 = r8.m35678n(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07b3:
            if (r5 != 0) goto L_0x07c0
            boolean r1 = r8.f36440s     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36441t = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m35672h(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m35675k()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07c0:
            int r1 = r8.f36443v     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07d3
            com.google.android.gms.internal.ads.ue[] r1 = r8.f36438q     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9 = 0
        L_0x07c9:
            if (r9 >= r2) goto L_0x07d3
            r3 = r1[r9]     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzm()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r9 = r9 + 1
            goto L_0x07c9
        L_0x07d3:
            boolean r1 = r8.f36440s     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07dc
            int r1 = r8.f36443v     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 == r2) goto L_0x07e1
        L_0x07dc:
            int r1 = r8.f36443v     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07ef
        L_0x07e1:
            int r1 = r8.f36420I     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07e9
            int r1 = r8.f36420I     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = (long) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07eb
        L_0x07e9:
            r2 = 10
        L_0x07eb:
            r8.m35669e(r11, r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x07ef:
            com.google.android.gms.internal.ads.ue[] r1 = r8.f36438q     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.length     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0802
            int r1 = r8.f36421J     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07fc
            int r1 = r8.f36421J     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = (long) r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07fe
        L_0x07fc:
            r1 = r16
        L_0x07fe:
            r8.m35669e(r11, r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x0802:
            android.os.Handler r1 = r8.f36427f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0808:
            com.google.android.gms.internal.ads.C7725gm.m32583b()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0683
        L_0x080d:
            return r1
        L_0x080e:
            int r1 = r1.arg1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0814
            r1 = 1
            goto L_0x0815
        L_0x0814:
            r1 = 0
        L_0x0815:
            r2 = 0
            r8.f36441t = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36440s = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0824
            r33.m35675k()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m35676l()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0822:
            r1 = 1
            goto L_0x083c
        L_0x0824:
            int r1 = r8.f36443v     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 != r2) goto L_0x0833
            r33.m35673i()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f36427f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x0833:
            r2 = 2
            if (r1 != r2) goto L_0x0822
            android.os.Handler r1 = r8.f36427f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r2)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x083c:
            return r1
        L_0x083d:
            java.lang.Object r2 = r1.obj     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.uj r2 = (com.google.android.gms.internal.ads.C8229uj) r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.arg1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f36429h     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r8.m35667L(r3)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.jr0 r3 = r8.f36422K     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo32957a()     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0860
            com.google.android.gms.internal.ads.le r1 = new com.google.android.gms.internal.ads.le     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f36433l = r1     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0860:
            r8.f36437p = r2     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.fe r1 = r8.f36430i     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r2.mo34346d(r1, r3, r8)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m35672h(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f36427f     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.sendEmptyMessage(r1)     // Catch:{ be -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r3
        L_0x0872:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08a0
        L_0x0878:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08bd
        L_0x087e:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f36429h
            com.google.android.gms.internal.ads.be r1 = com.google.android.gms.internal.ads.C7536be.m30678c(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r33.m35674j()
            r1 = 1
            return r1
        L_0x089b:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08a0:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Source error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f36429h
            com.google.android.gms.internal.ads.be r2 = com.google.android.gms.internal.ads.C7536be.m30677b(r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m35674j()
            return r1
        L_0x08b8:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08bd:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f36429h
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m35674j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8012oe.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33875q(com.google.android.gms.internal.ads.C7643ee... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f36439r     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f36445x     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f36445x = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f36427f     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f36446y     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0035
        L_0x0034:
            throw r4
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8012oe.mo33875q(com.google.android.gms.internal.ads.ee[]):void");
    }

    /* renamed from: r */
    public final void mo33876r() {
        this.f36419H = true;
    }

    /* renamed from: s */
    public final void mo33877s(C8229uj ujVar, boolean z) {
        this.f36427f.obtainMessage(0, 1, 0, ujVar).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33878t() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f36439r     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f36427f     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f36439r     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f36428g     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0028
        L_0x0027:
            throw r0
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8012oe.mo33878t():void");
    }

    /* renamed from: u */
    public final void mo33879u(C7501af afVar, int i, long j) {
        this.f36427f.obtainMessage(3, new C7938me(afVar, 0, j)).sendToTarget();
    }

    /* renamed from: v */
    public final void mo33880v(C7643ee... eeVarArr) {
        if (this.f36439r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f36445x++;
        this.f36427f.obtainMessage(11, eeVarArr).sendToTarget();
    }

    /* renamed from: w */
    public final void mo33881w(int i) {
        this.f36421J = i;
    }

    /* renamed from: x */
    public final void mo33882x(int i) {
        this.f36420I = i;
    }

    /* renamed from: y */
    public final void mo33883y(boolean z) {
        this.f36427f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: z */
    public final void mo33884z() {
        this.f36427f.sendEmptyMessage(5);
    }

    public final void zzf() {
        this.f36427f.sendEmptyMessage(10);
    }
}
