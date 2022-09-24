package com.google.ads.interactivemedia.p039v3.internal;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oz */
/* compiled from: IMASDK */
public final class C4249oz implements C4232oi {

    /* renamed from: A */
    private long f18238A;

    /* renamed from: B */
    private int f18239B;

    /* renamed from: C */
    private boolean f18240C;

    /* renamed from: D */
    private boolean f18241D;

    /* renamed from: E */
    private long f18242E;

    /* renamed from: F */
    private float f18243F;

    /* renamed from: G */
    private C4215ns[] f18244G;

    /* renamed from: H */
    private ByteBuffer[] f18245H;

    /* renamed from: I */
    private ByteBuffer f18246I;

    /* renamed from: J */
    private int f18247J;

    /* renamed from: K */
    private ByteBuffer f18248K;

    /* renamed from: L */
    private byte[] f18249L;

    /* renamed from: M */
    private int f18250M;

    /* renamed from: N */
    private int f18251N;

    /* renamed from: O */
    private boolean f18252O;

    /* renamed from: P */
    private boolean f18253P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f18254Q;

    /* renamed from: R */
    private boolean f18255R;

    /* renamed from: S */
    private int f18256S;

    /* renamed from: T */
    private C4237on f18257T;

    /* renamed from: U */
    private boolean f18258U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public long f18259V;

    /* renamed from: W */
    private boolean f18260W;

    /* renamed from: X */
    private boolean f18261X;

    /* renamed from: Y */
    private final C4242os f18262Y;

    /* renamed from: a */
    private final C4211no f18263a = null;

    /* renamed from: b */
    private final boolean f18264b;

    /* renamed from: c */
    private final C4239op f18265c;

    /* renamed from: d */
    private final C4262pl f18266d;

    /* renamed from: e */
    private final C4215ns[] f18267e;

    /* renamed from: f */
    private final C4215ns[] f18268f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ConditionVariable f18269g;

    /* renamed from: h */
    private final C4236om f18270h;

    /* renamed from: i */
    private final ArrayDeque<C4243ot> f18271i;

    /* renamed from: j */
    private final boolean f18272j;

    /* renamed from: k */
    private C4248oy f18273k;

    /* renamed from: l */
    private final C4244ou<C4228oe> f18274l;

    /* renamed from: m */
    private final C4244ou<C4231oh> f18275m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4229of f18276n;

    /* renamed from: o */
    private C4241or f18277o;

    /* renamed from: p */
    private C4241or f18278p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AudioTrack f18279q;

    /* renamed from: r */
    private C4210nn f18280r;

    /* renamed from: s */
    private C4243ot f18281s;

    /* renamed from: t */
    private C4243ot f18282t;

    /* renamed from: u */
    private C4146ld f18283u;

    /* renamed from: v */
    private ByteBuffer f18284v;

    /* renamed from: w */
    private int f18285w;

    /* renamed from: x */
    private long f18286x;

    /* renamed from: y */
    private long f18287y;

    /* renamed from: z */
    private long f18288z;

    public C4249oz(C4211no noVar, C4242os osVar) {
        this.f18262Y = osVar;
        int i = amm.f15298a;
        this.f18264b = false;
        this.f18272j = false;
        this.f18269g = new ConditionVariable(true);
        this.f18270h = new C4236om(new C4245ov(this));
        C4239op opVar = new C4239op();
        this.f18265c = opVar;
        C4262pl plVar = new C4262pl();
        this.f18266d = plVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C4238oo[]{new C4258ph(), opVar, plVar});
        Collections.addAll(arrayList, osVar.mo16477a());
        this.f18267e = (C4215ns[]) arrayList.toArray(new C4215ns[0]);
        this.f18268f = new C4215ns[]{new C4252pb()};
        this.f18243F = 1.0f;
        this.f18280r = C4210nn.f18088a;
        this.f18256S = 0;
        this.f18257T = new C4237on();
        C4146ld ldVar = C4146ld.f17825a;
        this.f18282t = new C4243ot(ldVar, false, 0, 0);
        this.f18283u = ldVar;
        this.f18251N = -1;
        this.f18244G = new C4215ns[0];
        this.f18245H = new ByteBuffer[0];
        this.f18271i = new ArrayDeque<>();
        this.f18274l = new C4244ou<>();
        this.f18275m = new C4244ou<>();
    }

    /* renamed from: G */
    private final void m18421G() {
        int i = 0;
        while (true) {
            C4215ns[] nsVarArr = this.f18244G;
            if (i < nsVarArr.length) {
                C4215ns nsVar = nsVarArr[i];
                nsVar.mo16379g();
                this.f18245H[i] = nsVar.mo16377e();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    private final void m18422H(long j) throws C4231oh {
        ByteBuffer byteBuffer;
        int length = this.f18244G.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f18245H[i - 1];
            } else {
                byteBuffer = this.f18246I;
                if (byteBuffer == null) {
                    byteBuffer = C4215ns.f18100a;
                }
            }
            if (i == length) {
                m18423I(byteBuffer, j);
            } else {
                C4215ns nsVar = this.f18244G[i];
                if (i > this.f18251N) {
                    nsVar.mo16375c(byteBuffer);
                }
                ByteBuffer e = nsVar.mo16377e();
                this.f18245H[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        if (r15 < r14) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18423I(java.nio.ByteBuffer r13, long r14) throws com.google.ads.interactivemedia.p039v3.internal.C4231oh {
        /*
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.f18248K
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r13) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14885p(r0)
            goto L_0x003b
        L_0x0018:
            r12.f18248K = r13
            int r0 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            if (r0 >= r1) goto L_0x003b
            int r0 = r13.remaining()
            byte[] r4 = r12.f18249L
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.f18249L = r4
        L_0x002d:
            int r4 = r13.position()
            byte[] r5 = r12.f18249L
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.f18250M = r3
        L_0x003b:
            int r0 = r13.remaining()
            int r4 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            if (r4 >= r1) goto L_0x006f
            com.google.ads.interactivemedia.v3.internal.om r14 = r12.f18270h
            long r5 = r12.f18288z
            int r14 = r14.mo16456f(r5)
            if (r14 <= 0) goto L_0x006c
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f18279q
            byte[] r1 = r12.f18249L
            int r5 = r12.f18250M
            int r14 = r15.write(r1, r5, r14)
            if (r14 <= 0) goto L_0x00f3
            int r15 = r12.f18250M
            int r15 = r15 + r14
            r12.f18250M = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto L_0x00f3
        L_0x006c:
            r14 = 0
            goto L_0x00f3
        L_0x006f:
            boolean r1 = r12.f18258U
            if (r1 == 0) goto L_0x00ed
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r1)
            android.media.AudioTrack r6 = r12.f18279q
            r1 = 26
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r4 < r1) goto L_0x0094
            r9 = 1
            long r10 = r14 * r7
            r7 = r13
            r8 = r0
            int r14 = r6.write(r7, r8, r9, r10)
            goto L_0x00f3
        L_0x0094:
            java.nio.ByteBuffer r1 = r12.f18284v
            if (r1 != 0) goto L_0x00ad
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r12.f18284v = r1
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r5)
            java.nio.ByteBuffer r1 = r12.f18284v
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r5)
        L_0x00ad:
            int r1 = r12.f18285w
            if (r1 != 0) goto L_0x00c7
            java.nio.ByteBuffer r1 = r12.f18284v
            r5 = 4
            r1.putInt(r5, r0)
            java.nio.ByteBuffer r1 = r12.f18284v
            r5 = 8
            long r14 = r14 * r7
            r1.putLong(r5, r14)
            java.nio.ByteBuffer r14 = r12.f18284v
            r14.position(r3)
            r12.f18285w = r0
        L_0x00c7:
            java.nio.ByteBuffer r14 = r12.f18284v
            int r14 = r14.remaining()
            if (r14 <= 0) goto L_0x00de
            java.nio.ByteBuffer r15 = r12.f18284v
            int r15 = r6.write(r15, r14, r2)
            if (r15 >= 0) goto L_0x00db
            r12.f18285w = r3
            r14 = r15
            goto L_0x00f3
        L_0x00db:
            if (r15 >= r14) goto L_0x00de
            goto L_0x006c
        L_0x00de:
            int r14 = m18438X(r6, r13, r0)
            if (r14 >= 0) goto L_0x00e7
            r12.f18285w = r3
            goto L_0x00f3
        L_0x00e7:
            int r15 = r12.f18285w
            int r15 = r15 - r14
            r12.f18285w = r15
            goto L_0x00f3
        L_0x00ed:
            android.media.AudioTrack r14 = r12.f18279q
            int r14 = m18438X(r14, r13, r0)
        L_0x00f3:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r12.f18259V = r5
            if (r14 >= 0) goto L_0x0128
            r13 = 24
            if (r4 < r13) goto L_0x0102
            r13 = -6
            if (r14 == r13) goto L_0x0108
        L_0x0102:
            r13 = -32
            if (r14 != r13) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r2 = 0
        L_0x0108:
            if (r2 == 0) goto L_0x010d
            r12.m18424J()
        L_0x010d:
            com.google.ads.interactivemedia.v3.internal.oh r13 = new com.google.ads.interactivemedia.v3.internal.oh
            com.google.ads.interactivemedia.v3.internal.or r15 = r12.f18278p
            com.google.ads.interactivemedia.v3.internal.ke r15 = r15.f18214a
            r13.<init>(r14, r15, r2)
            com.google.ads.interactivemedia.v3.internal.of r14 = r12.f18276n
            if (r14 == 0) goto L_0x011d
            r14.mo16412b(r13)
        L_0x011d:
            boolean r14 = r13.f18156a
            if (r14 != 0) goto L_0x0127
            com.google.ads.interactivemedia.v3.internal.ou<com.google.ads.interactivemedia.v3.internal.oh> r14 = r12.f18275m
            r14.mo16482a(r13)
            return
        L_0x0127:
            throw r13
        L_0x0128:
            com.google.ads.interactivemedia.v3.internal.ou<com.google.ads.interactivemedia.v3.internal.oh> r15 = r12.f18275m
            r15.mo16483b()
            android.media.AudioTrack r15 = r12.f18279q
            boolean r15 = m18437W(r15)
            if (r15 == 0) goto L_0x0168
            long r4 = r12.f18238A
            r6 = 0
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x013f
            r12.f18261X = r3
        L_0x013f:
            boolean r15 = r12.f18254Q
            if (r15 == 0) goto L_0x0168
            com.google.ads.interactivemedia.v3.internal.of r15 = r12.f18276n
            if (r15 == 0) goto L_0x0168
            if (r14 >= r0) goto L_0x0168
            boolean r15 = r12.f18261X
            if (r15 != 0) goto L_0x0168
            com.google.ads.interactivemedia.v3.internal.om r15 = r12.f18270h
            long r4 = r15.mo16457g(r4)
            com.google.ads.interactivemedia.v3.internal.of r15 = r12.f18276n
            com.google.ads.interactivemedia.v3.internal.pc r15 = (com.google.ads.interactivemedia.p039v3.internal.C4253pc) r15
            com.google.ads.interactivemedia.v3.internal.pd r1 = r15.f18298a
            com.google.ads.interactivemedia.v3.internal.lm r1 = r1.f18309l
            if (r1 == 0) goto L_0x0168
            com.google.ads.interactivemedia.v3.internal.pd r15 = r15.f18298a
            com.google.ads.interactivemedia.v3.internal.lm r15 = r15.f18309l
            r15.mo16023a(r4)
        L_0x0168:
            com.google.ads.interactivemedia.v3.internal.or r15 = r12.f18278p
            int r15 = r15.f18216c
            if (r15 != 0) goto L_0x0174
            long r4 = r12.f18288z
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.f18288z = r4
        L_0x0174:
            if (r14 != r0) goto L_0x0190
            if (r15 == 0) goto L_0x018d
            java.nio.ByteBuffer r14 = r12.f18246I
            if (r13 != r14) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r2 = 0
        L_0x017e:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r2)
            long r13 = r12.f18238A
            int r15 = r12.f18239B
            int r0 = r12.f18247J
            int r15 = r15 * r0
            long r0 = (long) r15
            long r13 = r13 + r0
            r12.f18238A = r13
        L_0x018d:
            r13 = 0
            r12.f18248K = r13
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4249oz.m18423I(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: J */
    private final void m18424J() {
        if (this.f18278p.mo16476d()) {
            this.f18260W = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m18425K() throws com.google.ads.interactivemedia.p039v3.internal.C4231oh {
        /*
            r9 = this;
            int r0 = r9.f18251N
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f18251N = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f18251N
            com.google.ads.interactivemedia.v3.internal.ns[] r5 = r9.f18244G
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo16376d()
        L_0x001f:
            r9.m18422H(r7)
            boolean r0 = r4.mo16378f()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f18251N
            int r0 = r0 + r2
            r9.f18251N = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f18248K
            if (r0 == 0) goto L_0x003b
            r9.m18423I(r0, r7)
            java.nio.ByteBuffer r0 = r9.f18248K
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f18251N = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4249oz.m18425K():boolean");
    }

    /* renamed from: L */
    private final void m18426L() {
        if (m18433S()) {
            if (amm.f15298a >= 21) {
                this.f18279q.setVolume(this.f18243F);
                return;
            }
            AudioTrack audioTrack = this.f18279q;
            float f = this.f18243F;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: M */
    private final void m18427M(C4146ld ldVar, boolean z) {
        C4243ot O = m18429O();
        if (!ldVar.equals(O.f18226a) || z != O.f18227b) {
            C4243ot otVar = new C4243ot(ldVar, z, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
            if (m18433S()) {
                this.f18281s = otVar;
            } else {
                this.f18282t = otVar;
            }
        }
    }

    /* renamed from: N */
    private final C4146ld m18428N() {
        return m18429O().f18226a;
    }

    /* renamed from: O */
    private final C4243ot m18429O() {
        C4243ot otVar = this.f18281s;
        if (otVar != null) {
            return otVar;
        }
        return !this.f18271i.isEmpty() ? this.f18271i.getLast() : this.f18282t;
    }

    /* renamed from: P */
    private final void m18430P(long j) {
        C4146ld ldVar;
        boolean z;
        if (m18431Q()) {
            C4242os osVar = this.f18262Y;
            ldVar = m18428N();
            osVar.mo16480d(ldVar);
        } else {
            ldVar = C4146ld.f17825a;
        }
        C4146ld ldVar2 = ldVar;
        if (m18431Q()) {
            C4242os osVar2 = this.f18262Y;
            boolean x = mo16489x();
            osVar2.mo16481e(x);
            z = x;
        } else {
            z = false;
        }
        this.f18271i.add(new C4243ot(ldVar2, z, Math.max(0, j), this.f18278p.mo16473a(m18435U())));
        C4215ns[] nsVarArr = this.f18278p.f18222i;
        ArrayList arrayList = new ArrayList();
        for (C4215ns nsVar : nsVarArr) {
            if (nsVar.mo16374b()) {
                arrayList.add(nsVar);
            } else {
                nsVar.mo16379g();
            }
        }
        int size = arrayList.size();
        this.f18244G = (C4215ns[]) arrayList.toArray(new C4215ns[size]);
        this.f18245H = new ByteBuffer[size];
        m18421G();
        C4229of ofVar = this.f18276n;
        if (ofVar != null) {
            ((C4253pc) ofVar).f18298a.f18300c.mo16398h(z);
        }
    }

    /* renamed from: Q */
    private final boolean m18431Q() {
        return !this.f18258U && MimeTypes.AUDIO_RAW.equals(this.f18278p.f18214a.f17681l) && !m18432R(this.f18278p.f18214a.f17664A);
    }

    /* renamed from: R */
    private final boolean m18432R(int i) {
        return false;
    }

    /* renamed from: S */
    private final boolean m18433S() {
        return this.f18279q != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final long m18434T() {
        C4241or orVar = this.f18278p;
        return orVar.f18216c == 0 ? this.f18286x / ((long) orVar.f18215b) : this.f18287y;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final long m18435U() {
        C4241or orVar = this.f18278p;
        return orVar.f18216c == 0 ? this.f18288z / ((long) orVar.f18217d) : this.f18238A;
    }

    /* renamed from: V */
    private static Pair<Integer, Integer> m18436V(C4120ke keVar, C4211no noVar) {
        return null;
    }

    /* renamed from: W */
    private static boolean m18437W(AudioTrack audioTrack) {
        return amm.f15298a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: X */
    private static int m18438X(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: Y */
    private final void m18439Y() {
        if (!this.f18253P) {
            this.f18253P = true;
            this.f18270h.mo16459i(m18435U());
            this.f18279q.stop();
            this.f18285w = 0;
        }
    }

    /* renamed from: a */
    public final void mo16413a(C4229of ofVar) {
        this.f18276n = ofVar;
    }

    /* renamed from: b */
    public final boolean mo16414b(C4120ke keVar) {
        return mo16415c(keVar) != 0;
    }

    /* renamed from: c */
    public final int mo16415c(C4120ke keVar) {
        if (!MimeTypes.AUDIO_RAW.equals(keVar.f17681l)) {
            if (!this.f18260W) {
                int i = amm.f15298a;
            }
            return m18436V(keVar, (C4211no) null) != null ? 2 : 0;
        } else if (!amm.m14207X(keVar.f17664A)) {
            int i2 = keVar.f17664A;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i2);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        } else if (keVar.f17664A != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    /* renamed from: d */
    public final long mo16416d(boolean z) {
        long j;
        if (!m18433S() || this.f18241D) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f18270h.mo16452b(z), this.f18278p.mo16473a(m18435U()));
        while (!this.f18271i.isEmpty() && min >= this.f18271i.getFirst().f18229d) {
            this.f18282t = this.f18271i.remove();
        }
        C4243ot otVar = this.f18282t;
        long j2 = min - otVar.f18229d;
        if (otVar.f18226a.equals(C4146ld.f17825a)) {
            j = this.f18282t.f18228c + j2;
        } else if (this.f18271i.isEmpty()) {
            j = this.f18262Y.mo16478b(j2) + this.f18282t.f18228c;
        } else {
            C4243ot first = this.f18271i.getFirst();
            j = first.f18228c - amm.m14197N(first.f18229d - min, this.f18282t.f18226a.f17826b);
        }
        return j + this.f18278p.mo16473a(this.f18262Y.mo16479c());
    }

    /* renamed from: e */
    public final void mo16417e() {
        this.f18254Q = true;
        if (m18433S()) {
            this.f18270h.mo16453c();
            this.f18279q.play();
        }
    }

    /* renamed from: f */
    public final void mo16418f() {
        this.f18240C = true;
    }

    /* renamed from: g */
    public final boolean mo16419g(ByteBuffer byteBuffer, long j, int i) throws C4228oe, C4231oh {
        int i2;
        byte b;
        byte b2;
        int i3;
        byte b3;
        int i4;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        int i5 = i;
        ByteBuffer byteBuffer3 = this.f18246I;
        aup.m14885p(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f18277o != null) {
            if (!m18425K()) {
                return false;
            }
            C4241or orVar = this.f18277o;
            C4241or orVar2 = this.f18278p;
            if (orVar2.f18216c == orVar.f18216c && orVar2.f18220g == orVar.f18220g && orVar2.f18218e == orVar.f18218e && orVar2.f18219f == orVar.f18219f && orVar2.f18217d == orVar.f18217d) {
                this.f18278p = orVar;
                this.f18277o = null;
                if (m18437W(this.f18279q)) {
                    this.f18279q.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f18279q;
                    C4120ke keVar = this.f18278p.f18214a;
                    audioTrack.setOffloadDelayPadding(keVar.f17665B, keVar.f17666C);
                    this.f18261X = true;
                }
            } else {
                m18439Y();
                if (mo16422j()) {
                    return false;
                }
                mo16433u();
            }
            m18430P(j2);
        }
        if (!m18433S()) {
            try {
                this.f18269g.block();
                C4241or orVar3 = this.f18278p;
                aup.m14890u(orVar3);
                AudioTrack c = orVar3.mo16475c(this.f18258U, this.f18280r, this.f18256S);
                this.f18279q = c;
                if (m18437W(c)) {
                    AudioTrack audioTrack2 = this.f18279q;
                    if (this.f18273k == null) {
                        this.f18273k = new C4248oy(this);
                    }
                    this.f18273k.mo16487a(audioTrack2);
                    AudioTrack audioTrack3 = this.f18279q;
                    C4120ke keVar2 = this.f18278p.f18214a;
                    audioTrack3.setOffloadDelayPadding(keVar2.f17665B, keVar2.f17666C);
                }
                this.f18256S = this.f18279q.getAudioSessionId();
                C4236om omVar = this.f18270h;
                AudioTrack audioTrack4 = this.f18279q;
                C4241or orVar4 = this.f18278p;
                omVar.mo16451a(audioTrack4, orVar4.f18216c == 2, orVar4.f18220g, orVar4.f18217d, orVar4.f18221h);
                m18426L();
                int i6 = this.f18257T.f18201a;
                this.f18241D = true;
            } catch (C4228oe e) {
                m18424J();
                C4229of ofVar = this.f18276n;
                if (ofVar != null) {
                    ofVar.mo16412b(e);
                }
                throw e;
            } catch (C4228oe e2) {
                if (!e2.f18154a) {
                    this.f18274l.mo16482a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.f18274l.mo16483b();
        if (this.f18241D) {
            this.f18242E = Math.max(0, j2);
            this.f18240C = false;
            this.f18241D = false;
            m18430P(j2);
            if (this.f18254Q) {
                mo16417e();
            }
        }
        if (!this.f18270h.mo16455e(m18435U())) {
            return false;
        }
        if (this.f18246I == null) {
            aup.m14885p(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C4241or orVar5 = this.f18278p;
            if (orVar5.f18216c != 0 && this.f18239B == 0) {
                int i7 = orVar5.f18220g;
                int i8 = 1024;
                switch (i7) {
                    case 5:
                    case 6:
                    case 18:
                        i8 = C4207nk.m18274e(byteBuffer);
                        break;
                    case 7:
                    case 8:
                        int i9 = C4251pa.f18293a;
                        int position = byteBuffer.position();
                        byte b4 = byteBuffer2.get(position);
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i2 = (byteBuffer2.get(position + 4) & 7) << 4;
                                b3 = byteBuffer2.get(position + 7);
                            } else if (b4 != 31) {
                                i3 = (byteBuffer2.get(position + 4) & 1) << 6;
                                b2 = byteBuffer2.get(position + 5);
                            } else {
                                i2 = (byteBuffer2.get(position + 5) & 7) << 4;
                                b3 = byteBuffer2.get(position + 6);
                            }
                            b = b3 & 60;
                            i8 = (((b >> 2) | i2) + 1) * 32;
                            break;
                        } else {
                            i3 = (byteBuffer2.get(position + 5) & 1) << 6;
                            b2 = byteBuffer2.get(position + 4);
                        }
                        b = b2 & 252;
                        i8 = (((b >> 2) | i2) + 1) * 32;
                    case 9:
                        i8 = C4256pf.m18510b(amm.m14213ac(byteBuffer2, byteBuffer.position()));
                        if (i8 == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        break;
                    case 11:
                    case 12:
                        i8 = 2048;
                        break;
                    case 14:
                        int i10 = C4207nk.f18076a;
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i11 = position2;
                        while (true) {
                            if (i11 > limit) {
                                i4 = -1;
                            } else if ((amm.m14213ac(byteBuffer2, i11 + 4) & -2) == -126718022) {
                                i4 = i11 - position2;
                            } else {
                                i11++;
                            }
                        }
                        if (i4 != -1) {
                            i8 = (40 << ((byteBuffer2.get((byteBuffer.position() + i4) + ((byteBuffer2.get((byteBuffer.position() + i4) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            break;
                        } else {
                            i8 = 0;
                            break;
                        }
                    case 15:
                        i8 = 512;
                        break;
                    case 17:
                        int i12 = C4209nm.f18086a;
                        byte[] bArr = new byte[16];
                        int position3 = byteBuffer.position();
                        byteBuffer2.get(bArr);
                        byteBuffer2.position(position3);
                        i8 = C4209nm.m18276a(new alv(bArr)).f18085c;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i7);
                        throw new IllegalStateException(sb.toString());
                }
                this.f18239B = i8;
                if (i8 == 0) {
                    return true;
                }
            }
            if (this.f18281s != null) {
                if (!m18425K()) {
                    return false;
                }
                m18430P(j2);
                this.f18281s = null;
            }
            long T = this.f18242E + (((m18434T() - this.f18266d.mo16507q()) * 1000000) / ((long) this.f18278p.f18214a.f17695z));
            if (!this.f18240C && Math.abs(T - j2) > 200000) {
                this.f18276n.mo16412b(new C4230og(j2, T));
                this.f18240C = true;
            }
            if (this.f18240C) {
                if (!m18425K()) {
                    return false;
                }
                long j3 = j2 - T;
                this.f18242E += j3;
                this.f18240C = false;
                m18430P(j2);
                C4229of ofVar2 = this.f18276n;
                if (!(ofVar2 == null || j3 == 0)) {
                    ((C4253pc) ofVar2).f18298a.mo16491Y();
                }
            }
            if (this.f18278p.f18216c == 0) {
                this.f18286x += (long) byteBuffer.remaining();
            } else {
                this.f18287y += (long) (this.f18239B * i5);
            }
            this.f18246I = byteBuffer2;
            this.f18247J = i5;
        }
        m18422H(j2);
        if (!this.f18246I.hasRemaining()) {
            this.f18246I = null;
            this.f18247J = 0;
            return true;
        } else if (!this.f18270h.mo16458h(m18435U())) {
            return false;
        } else {
            Log.w("DefaultAudioSink", "Resetting stalled audio track");
            mo16433u();
            return true;
        }
    }

    /* renamed from: h */
    public final void mo16420h() throws C4231oh {
        if (!this.f18252O && m18433S() && m18425K()) {
            m18439Y();
            this.f18252O = true;
        }
    }

    /* renamed from: i */
    public final boolean mo16421i() {
        return !m18433S() || (this.f18252O && !mo16422j());
    }

    /* renamed from: j */
    public final boolean mo16422j() {
        return m18433S() && this.f18270h.mo16460j(m18435U());
    }

    /* renamed from: k */
    public final void mo16423k(C4146ld ldVar) {
        m18427M(new C4146ld(amm.m14193J(ldVar.f17826b, 0.1f, 8.0f), amm.m14193J(ldVar.f17827c, 0.1f, 8.0f)), mo16489x());
    }

    /* renamed from: l */
    public final C4146ld mo16424l() {
        return m18428N();
    }

    /* renamed from: m */
    public final void mo16425m(boolean z) {
        m18427M(m18428N(), z);
    }

    /* renamed from: n */
    public final void mo16426n(C4210nn nnVar) {
        if (!this.f18280r.equals(nnVar)) {
            this.f18280r = nnVar;
            if (!this.f18258U) {
                mo16433u();
            }
        }
    }

    /* renamed from: o */
    public final void mo16427o(int i) {
        if (this.f18256S != i) {
            this.f18256S = i;
            this.f18255R = i != 0;
            mo16433u();
        }
    }

    /* renamed from: p */
    public final void mo16428p(C4237on onVar) {
        if (!this.f18257T.equals(onVar)) {
            int i = onVar.f18201a;
            if (this.f18279q != null) {
                int i2 = this.f18257T.f18201a;
            }
            this.f18257T = onVar;
        }
    }

    /* renamed from: q */
    public final void mo16429q() {
        aup.m14887r(amm.f15298a >= 21);
        aup.m14887r(this.f18255R);
        if (!this.f18258U) {
            this.f18258U = true;
            mo16433u();
        }
    }

    /* renamed from: r */
    public final void mo16430r() {
        if (this.f18258U) {
            this.f18258U = false;
            mo16433u();
        }
    }

    /* renamed from: s */
    public final void mo16431s(float f) {
        if (this.f18243F != f) {
            this.f18243F = f;
            m18426L();
        }
    }

    /* renamed from: t */
    public final void mo16432t() {
        this.f18254Q = false;
        if (m18433S() && this.f18270h.mo16461k()) {
            this.f18279q.pause();
        }
    }

    /* renamed from: u */
    public final void mo16433u() {
        if (m18433S()) {
            this.f18286x = 0;
            this.f18287y = 0;
            this.f18288z = 0;
            this.f18238A = 0;
            this.f18261X = false;
            this.f18239B = 0;
            this.f18282t = new C4243ot(m18428N(), mo16489x(), 0, 0);
            this.f18242E = 0;
            this.f18281s = null;
            this.f18271i.clear();
            this.f18246I = null;
            this.f18247J = 0;
            this.f18248K = null;
            this.f18253P = false;
            this.f18252O = false;
            this.f18251N = -1;
            this.f18284v = null;
            this.f18285w = 0;
            this.f18266d.mo16506p();
            m18421G();
            if (this.f18270h.mo16454d()) {
                this.f18279q.pause();
            }
            if (m18437W(this.f18279q)) {
                C4248oy oyVar = this.f18273k;
                aup.m14890u(oyVar);
                oyVar.mo16488b(this.f18279q);
            }
            AudioTrack audioTrack = this.f18279q;
            this.f18279q = null;
            if (amm.f15298a < 21 && !this.f18255R) {
                this.f18256S = 0;
            }
            C4241or orVar = this.f18277o;
            if (orVar != null) {
                this.f18278p = orVar;
                this.f18277o = null;
            }
            this.f18270h.mo16462l();
            this.f18269g.close();
            new C4240oq(this, audioTrack).start();
        }
        this.f18275m.mo16483b();
        this.f18274l.mo16483b();
    }

    /* renamed from: v */
    public final void mo16434v() {
        mo16433u();
        for (C4215ns h : this.f18267e) {
            h.mo16380h();
        }
        C4215ns[] nsVarArr = this.f18268f;
        int length = nsVarArr.length;
        nsVarArr[0].mo16380h();
        this.f18254Q = false;
        this.f18260W = false;
    }

    /* renamed from: w */
    public final void mo16435w(C4120ke keVar, int[] iArr) throws C4227od {
        C4215ns[] nsVarArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C4215ns[] nsVarArr2;
        int[] iArr2;
        if (MimeTypes.AUDIO_RAW.equals(keVar.f17681l)) {
            aup.m14885p(amm.m14207X(keVar.f17664A));
            i6 = amm.m14211aa(keVar.f17664A, keVar.f17694y);
            if (m18432R(keVar.f17664A)) {
                nsVarArr2 = this.f18268f;
            } else {
                nsVarArr2 = this.f18267e;
            }
            this.f18266d.mo16505o(keVar.f17665B, keVar.f17666C);
            if (amm.f15298a < 21 && keVar.f17694y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i7 = 0; i7 < 6; i7++) {
                    iArr2[i7] = i7;
                }
            } else {
                iArr2 = iArr;
            }
            this.f18265c.mo16471o(iArr2);
            C4213nq nqVar = new C4213nq(keVar.f17695z, keVar.f17694y, keVar.f17664A);
            int length = nsVarArr2.length;
            int i8 = 0;
            while (i8 < length) {
                C4215ns nsVar = nsVarArr2[i8];
                try {
                    C4213nq a = nsVar.mo16373a(nqVar);
                    if (true == nsVar.mo16374b()) {
                        nqVar = a;
                    }
                    i8++;
                } catch (C4214nr e) {
                    throw new C4227od((Throwable) e, keVar);
                }
            }
            int i9 = nqVar.f18098d;
            i3 = nqVar.f18096b;
            i2 = amm.m14209Z(nqVar.f18097c);
            nsVarArr = nsVarArr2;
            i = i9;
            i4 = amm.m14211aa(i9, nqVar.f18097c);
            i5 = 0;
        } else {
            C4215ns[] nsVarArr3 = new C4215ns[0];
            int i10 = keVar.f17695z;
            Pair<Integer, Integer> V = m18436V(keVar, (C4211no) null);
            int i11 = amm.f15298a;
            if (V != null) {
                int intValue = ((Integer) V.first).intValue();
                nsVarArr = nsVarArr3;
                i2 = ((Integer) V.second).intValue();
                i = intValue;
                i6 = -1;
                i4 = -1;
                i3 = i10;
                i5 = 2;
            } else {
                String valueOf = String.valueOf(keVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                sb.append("Unable to configure passthrough for: ");
                sb.append(valueOf);
                throw new C4227od(sb.toString(), keVar);
            }
        }
        if (i == 0) {
            String valueOf2 = String.valueOf(keVar);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i5);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new C4227od(sb2.toString(), keVar);
        } else if (i2 != 0) {
            this.f18260W = false;
            C4241or orVar = new C4241or(keVar, i6, i5, i4, i3, i2, i, false, nsVarArr);
            if (m18433S()) {
                this.f18277o = orVar;
            } else {
                this.f18278p = orVar;
            }
        } else {
            String valueOf3 = String.valueOf(keVar);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 54);
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i5);
            sb3.append(") for: ");
            sb3.append(valueOf3);
            throw new C4227od(sb3.toString(), keVar);
        }
    }

    /* renamed from: x */
    public final boolean mo16489x() {
        return m18429O().f18227b;
    }
}
