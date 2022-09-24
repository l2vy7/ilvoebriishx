package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.oj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8017oj implements C8158sj, C8190tg, C7983nl, C7577ck {

    /* renamed from: A */
    private boolean f36473A;

    /* renamed from: B */
    private long f36474B;

    /* renamed from: C */
    private long f36475C;

    /* renamed from: D */
    private long f36476D;

    /* renamed from: E */
    private int f36477E;

    /* renamed from: F */
    private boolean f36478F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f36479G;

    /* renamed from: H */
    private final C7724gl f36480H;

    /* renamed from: b */
    private final Uri f36481b;

    /* renamed from: c */
    private final C7613dl f36482c;

    /* renamed from: d */
    private final int f36483d;

    /* renamed from: e */
    private final Handler f36484e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8052pj f36485f;

    /* renamed from: g */
    private final C8193tj f36486g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f36487h;

    /* renamed from: i */
    private final C8126rl f36488i = new C8126rl("Loader:ExtractorMediaPeriod");

    /* renamed from: j */
    private final C7943mj f36489j;

    /* renamed from: k */
    private final C8268vl f36490k;

    /* renamed from: l */
    private final Runnable f36491l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Runnable f36492m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Handler f36493n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final SparseArray<C7612dk> f36494o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8124rj f36495p;

    /* renamed from: q */
    private C8405zg f36496q;

    /* renamed from: r */
    private boolean f36497r;

    /* renamed from: s */
    private boolean f36498s;

    /* renamed from: t */
    private boolean f36499t;

    /* renamed from: u */
    private boolean f36500u;

    /* renamed from: v */
    private int f36501v;

    /* renamed from: w */
    private C7870kk f36502w;

    /* renamed from: x */
    private long f36503x;

    /* renamed from: y */
    private boolean[] f36504y;

    /* renamed from: z */
    private boolean[] f36505z;

    public C8017oj(Uri uri, C7613dl dlVar, C8155sg[] sgVarArr, int i, Handler handler, C8052pj pjVar, C8193tj tjVar, C7724gl glVar, String str, int i2, byte[] bArr) {
        this.f36481b = uri;
        this.f36482c = dlVar;
        this.f36483d = i;
        this.f36484e = handler;
        this.f36485f = pjVar;
        this.f36486g = tjVar;
        this.f36480H = glVar;
        this.f36487h = (long) i2;
        this.f36489j = new C7943mj(sgVarArr, this);
        this.f36490k = new C8268vl();
        this.f36491l = new C7759hj(this);
        this.f36492m = new C7797ij(this);
        this.f36493n = new Handler();
        this.f36476D = C6540C.TIME_UNSET;
        this.f36494o = new SparseArray<>();
        this.f36474B = -1;
    }

    /* renamed from: m */
    private final int m35712m() {
        int size = this.f36494o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f36494o.valueAt(i2).mo31269e();
        }
        return i;
    }

    /* renamed from: n */
    private final long m35713n() {
        int size = this.f36494o.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f36494o.valueAt(i).mo31271g());
        }
        return j;
    }

    /* renamed from: o */
    private final void m35714o(C7906lj ljVar) {
        if (this.f36474B == -1) {
            this.f36474B = ljVar.f35118i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r0 = r11.f36496q;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m35715p() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.lj r6 = new com.google.android.gms.internal.ads.lj
            android.net.Uri r2 = r11.f36481b
            com.google.android.gms.internal.ads.dl r3 = r11.f36482c
            com.google.android.gms.internal.ads.mj r4 = r11.f36489j
            com.google.android.gms.internal.ads.vl r5 = r11.f36490k
            r0 = r6
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r11.f36498s
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r11.m35716q()
            com.google.android.gms.internal.ads.C8195tl.m37900e(r0)
            long r3 = r11.f36503x
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            long r7 = r11.f36476D
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            r0 = 1
            r11.f36478F = r0
            r11.f36476D = r1
            return
        L_0x0032:
            com.google.android.gms.internal.ads.zg r0 = r11.f36496q
            long r3 = r11.f36476D
            long r3 = r0.mo32130a(r3)
            long r7 = r11.f36476D
            r6.mo33343b(r3, r7)
            r11.f36476D = r1
        L_0x0041:
            int r0 = r11.m35712m()
            r11.f36477E = r0
            int r0 = r11.f36483d
            r3 = -1
            r4 = 6
            r5 = 3
            if (r0 != r3) goto L_0x006a
            boolean r0 = r11.f36498s
            if (r0 == 0) goto L_0x0069
            long r7 = r11.f36474B
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.zg r0 = r11.f36496q
            if (r0 == 0) goto L_0x0067
            long r7 = r0.zza()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = 6
            goto L_0x006a
        L_0x0069:
            r0 = 3
        L_0x006a:
            com.google.android.gms.internal.ads.rl r1 = r11.f36488i
            r1.mo34548a(r6, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8017oj.m35715p():void");
    }

    /* renamed from: q */
    private final boolean m35716q() {
        return this.f36476D != C6540C.TIME_UNSET;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: y */
    static /* bridge */ /* synthetic */ void m35723y(com.google.android.gms.internal.ads.C8017oj r8) {
        /*
            boolean r0 = r8.f36479G
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8.f36498s
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.zg r0 = r8.f36496q
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.f36497r
            if (r0 != 0) goto L_0x0012
            goto L_0x009c
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.dk> r0 = r8.f36494o
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002d
            android.util.SparseArray<com.google.android.gms.internal.ads.dk> r3 = r8.f36494o
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.dk r3 = (com.google.android.gms.internal.ads.C7612dk) r3
            com.google.android.gms.internal.ads.zzapg r3 = r3.mo31272h()
            if (r3 == 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002d:
            com.google.android.gms.internal.ads.vl r2 = r8.f36490k
            r2.mo35438b()
            com.google.android.gms.internal.ads.jk[] r2 = new com.google.android.gms.internal.ads.C7834jk[r0]
            boolean[] r3 = new boolean[r0]
            r8.f36505z = r3
            boolean[] r3 = new boolean[r0]
            r8.f36504y = r3
            com.google.android.gms.internal.ads.zg r3 = r8.f36496q
            long r3 = r3.zza()
            r8.f36503x = r3
            r3 = 0
        L_0x0045:
            r4 = 1
            if (r3 >= r0) goto L_0x007b
            android.util.SparseArray<com.google.android.gms.internal.ads.dk> r5 = r8.f36494o
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.dk r5 = (com.google.android.gms.internal.ads.C7612dk) r5
            com.google.android.gms.internal.ads.zzapg r5 = r5.mo31272h()
            com.google.android.gms.internal.ads.jk r6 = new com.google.android.gms.internal.ads.jk
            com.google.android.gms.internal.ads.zzapg[] r7 = new com.google.android.gms.internal.ads.zzapg[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f42870g
            boolean r6 = com.google.android.gms.internal.ads.C8374yl.m39951b(r5)
            if (r6 != 0) goto L_0x006f
            boolean r5 = com.google.android.gms.internal.ads.C8374yl.m39950a(r5)
            if (r5 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            boolean[] r5 = r8.f36505z
            r5[r3] = r4
            boolean r5 = r8.f36473A
            r4 = r4 | r5
            r8.f36473A = r4
            int r3 = r3 + 1
            goto L_0x0045
        L_0x007b:
            com.google.android.gms.internal.ads.kk r0 = new com.google.android.gms.internal.ads.kk
            r0.<init>(r2)
            r8.f36502w = r0
            r8.f36498s = r4
            com.google.android.gms.internal.ads.tj r0 = r8.f36486g
            com.google.android.gms.internal.ads.ik r1 = new com.google.android.gms.internal.ads.ik
            long r2 = r8.f36503x
            com.google.android.gms.internal.ads.zg r4 = r8.f36496q
            boolean r4 = r4.zzc()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo33873c(r1, r2)
            com.google.android.gms.internal.ads.rj r0 = r8.f36495p
            r0.mo33872b(r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8017oj.m35723y(com.google.android.gms.internal.ads.oj):void");
    }

    /* renamed from: A */
    public final void mo33905A() {
        this.f36488i.mo34551h(new C7833jj(this, this.f36489j));
        this.f36493n.removeCallbacksAndMessages((Object) null);
        this.f36479G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo33906B(int i, long j) {
        C7612dk valueAt = this.f36494o.valueAt(i);
        if (!this.f36478F || j <= valueAt.mo31271g()) {
            valueAt.mo31278n(j, true);
        } else {
            valueAt.mo31276l();
        }
    }

    /* renamed from: a */
    public final boolean mo32146a(long j) {
        if (this.f36478F) {
            return false;
        }
        if (this.f36498s && this.f36501v == 0) {
            return false;
        }
        boolean c = this.f36490k.mo35439c();
        if (this.f36488i.mo34552i()) {
            return c;
        }
        m35715p();
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33712b(C8054pl plVar, long j, long j2) {
        m35714o((C7906lj) plVar);
        this.f36478F = true;
        if (this.f36503x == C6540C.TIME_UNSET) {
            long n = m35713n();
            long j3 = n == Long.MIN_VALUE ? 0 : n + ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
            this.f36503x = j3;
            this.f36486g.mo33873c(new C7798ik(j3, this.f36496q.zzc()), (Object) null);
        }
        this.f36495p.mo31883d(this);
    }

    /* renamed from: c */
    public final long mo33907c(C8018ok[] okVarArr, boolean[] zArr, C7649ek[] ekVarArr, boolean[] zArr2, long j) {
        C8018ok okVar;
        C8195tl.m37900e(this.f36498s);
        for (int i = 0; i < okVarArr.length; i++) {
            C7981nj njVar = ekVarArr[i];
            if (njVar != null && (okVarArr[i] == null || !zArr[i])) {
                int c = njVar.f36026a;
                C8195tl.m37900e(this.f36504y[c]);
                this.f36501v--;
                this.f36504y[c] = false;
                this.f36494o.valueAt(c).mo31273i();
                ekVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < okVarArr.length; i2++) {
            if (ekVarArr[i2] == null && (okVar = okVarArr[i2]) != null) {
                okVar.mo33930b();
                C8195tl.m37900e(okVar.mo33929a(0) == 0);
                int a = this.f36502w.mo33099a(okVar.mo33932d());
                C8195tl.m37900e(!this.f36504y[a]);
                this.f36501v++;
                this.f36504y[a] = true;
                ekVarArr[i2] = new C7981nj(this, a);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f36499t) {
            int size = this.f36494o.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f36504y[i3]) {
                    this.f36494o.valueAt(i3).mo31273i();
                }
            }
        }
        if (this.f36501v == 0) {
            this.f36500u = false;
            if (this.f36488i.mo34552i()) {
                this.f36488i.mo34549f();
            }
        } else if (!this.f36499t ? j != 0 : z) {
            j = mo33911i(j);
            for (int i4 = 0; i4 < ekVarArr.length; i4++) {
                if (ekVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f36499t = true;
        return j;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33713d(C8054pl plVar, long j, long j2, boolean z) {
        m35714o((C7906lj) plVar);
        if (!z && this.f36501v > 0) {
            int size = this.f36494o.size();
            for (int i = 0; i < size; i++) {
                this.f36494o.valueAt(i).mo31274j(this.f36504y[i]);
            }
            this.f36495p.mo31883d(this);
        }
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ int mo33714e(C8054pl plVar, long j, long j2, IOException iOException) {
        C8405zg zgVar;
        C7906lj ljVar = (C7906lj) plVar;
        m35714o(ljVar);
        Handler handler = this.f36484e;
        if (handler != null) {
            handler.post(new C7869kj(this, iOException));
        }
        if (iOException instanceof C7907lk) {
            return 3;
        }
        int m = m35712m();
        int i = this.f36477E;
        if (this.f36474B == -1 && ((zgVar = this.f36496q) == null || zgVar.zza() == C6540C.TIME_UNSET)) {
            this.f36475C = 0;
            this.f36500u = this.f36498s;
            int size = this.f36494o.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f36494o.valueAt(i2).mo31274j(!this.f36498s || this.f36504y[i2]);
            }
            ljVar.mo33343b(0, 0);
        }
        this.f36477E = m35712m();
        if (m <= i) {
            return 0;
        }
        return 1;
    }

    /* renamed from: f */
    public final void mo33908f(long j) {
    }

    /* renamed from: g */
    public final void mo33909g(C8405zg zgVar) {
        this.f36496q = zgVar;
        this.f36493n.post(this.f36491l);
    }

    /* renamed from: h */
    public final C7539bh mo33910h(int i, int i2) {
        C7612dk dkVar = this.f36494o.get(i);
        if (dkVar != null) {
            return dkVar;
        }
        C7612dk dkVar2 = new C7612dk(this.f36480H, (byte[]) null);
        dkVar2.mo31275k(this);
        this.f36494o.put(i, dkVar2);
        return dkVar2;
    }

    /* renamed from: i */
    public final long mo33911i(long j) {
        if (true != this.f36496q.zzc()) {
            j = 0;
        }
        this.f36475C = j;
        int size = this.f36494o.size();
        boolean q = true ^ m35716q();
        int i = 0;
        while (true) {
            if (q) {
                if (i >= size) {
                    break;
                }
                if (this.f36504y[i]) {
                    q = this.f36494o.valueAt(i).mo31278n(j, false);
                }
                i++;
            } else {
                this.f36476D = j;
                this.f36478F = false;
                if (this.f36488i.mo34552i()) {
                    this.f36488i.mo34549f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        this.f36494o.valueAt(i2).mo31274j(this.f36504y[i2]);
                    }
                }
            }
        }
        this.f36500u = false;
        return j;
    }

    /* renamed from: j */
    public final void mo30942j(zzapg zzapg) {
        this.f36493n.post(this.f36491l);
    }

    /* renamed from: k */
    public final void mo33912k(C8124rj rjVar, long j) {
        this.f36495p = rjVar;
        this.f36490k.mo35439c();
        m35715p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo33913l(int i) {
        return this.f36478F || (!m35716q() && this.f36494o.valueAt(i).mo31277m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo33914r(int i, C8083qe qeVar, C7940mg mgVar, boolean z) {
        if (this.f36500u || m35716q()) {
            return -3;
        }
        return this.f36494o.valueAt(i).mo31270f(qeVar, mgVar, z, this.f36478F, this.f36475C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo33915z() throws IOException {
        this.f36488i.mo34550g(Integer.MIN_VALUE);
    }

    public final long zza() {
        if (this.f36501v == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    public final void zzb() {
        this.f36497r = true;
        this.f36493n.post(this.f36491l);
    }

    public final long zzg() {
        long j;
        if (this.f36478F) {
            return Long.MIN_VALUE;
        }
        if (m35716q()) {
            return this.f36476D;
        }
        if (this.f36473A) {
            int size = this.f36494o.size();
            j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.f36505z[i]) {
                    j = Math.min(j, this.f36494o.valueAt(i).mo31271g());
                }
            }
        } else {
            j = m35713n();
        }
        return j == Long.MIN_VALUE ? this.f36475C : j;
    }

    public final long zzh() {
        if (!this.f36500u) {
            return C6540C.TIME_UNSET;
        }
        this.f36500u = false;
        return this.f36475C;
    }

    public final C7870kk zzn() {
        return this.f36502w;
    }

    public final void zzs() throws IOException {
        this.f36488i.mo34550g(Integer.MIN_VALUE);
    }
}
