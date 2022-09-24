package p166w;

import java.util.ArrayList;
import java.util.HashMap;
import p161v.C6213d;
import p166w.C6246e;

/* renamed from: w.g */
/* compiled from: Flow */
public class C6250g extends C6257l {
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public int f25841V0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public int f25842W0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public int f25843X0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public int f25844Y0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public int f25845Z0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public int f25846a1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: b1 */
    public float f25847b1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public float f25848c1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public float f25849d1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public float f25850e1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public float f25851f1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public float f25852g1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public int f25853h1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public int f25854i1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public int f25855j1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public int f25856k1 = 2;

    /* renamed from: l1 */
    private int f25857l1 = 0;

    /* renamed from: m1 */
    private int f25858m1 = -1;

    /* renamed from: n1 */
    private int f25859n1 = 0;

    /* renamed from: o1 */
    private ArrayList<C6251a> f25860o1 = new ArrayList<>();

    /* renamed from: p1 */
    private C6246e[] f25861p1 = null;

    /* renamed from: q1 */
    private C6246e[] f25862q1 = null;

    /* renamed from: r1 */
    private int[] f25863r1 = null;
    /* access modifiers changed from: private */

    /* renamed from: s1 */
    public C6246e[] f25864s1;
    /* access modifiers changed from: private */

    /* renamed from: t1 */
    public int f25865t1 = 0;

    /* renamed from: w.g$a */
    /* compiled from: Flow */
    private class C6251a {

        /* renamed from: a */
        private int f25866a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C6246e f25867b = null;

        /* renamed from: c */
        int f25868c = 0;

        /* renamed from: d */
        private C6243d f25869d;

        /* renamed from: e */
        private C6243d f25870e;

        /* renamed from: f */
        private C6243d f25871f;

        /* renamed from: g */
        private C6243d f25872g;

        /* renamed from: h */
        private int f25873h = 0;

        /* renamed from: i */
        private int f25874i = 0;

        /* renamed from: j */
        private int f25875j = 0;

        /* renamed from: k */
        private int f25876k = 0;

        /* renamed from: l */
        private int f25877l = 0;

        /* renamed from: m */
        private int f25878m = 0;

        /* renamed from: n */
        private int f25879n = 0;

        /* renamed from: o */
        private int f25880o = 0;

        /* renamed from: p */
        private int f25881p = 0;

        /* renamed from: q */
        private int f25882q = 0;

        public C6251a(int i, C6243d dVar, C6243d dVar2, C6243d dVar3, C6243d dVar4, int i2) {
            this.f25866a = i;
            this.f25869d = dVar;
            this.f25870e = dVar2;
            this.f25871f = dVar3;
            this.f25872g = dVar4;
            this.f25873h = C6250g.this.mo23926Q0();
            this.f25874i = C6250g.this.mo23928S0();
            this.f25875j = C6250g.this.mo23927R0();
            this.f25876k = C6250g.this.mo23925P0();
            this.f25882q = i2;
        }

        /* renamed from: h */
        private void m27524h() {
            this.f25877l = 0;
            this.f25878m = 0;
            this.f25867b = null;
            this.f25868c = 0;
            int i = this.f25880o;
            int i2 = 0;
            while (i2 < i && this.f25879n + i2 < C6250g.this.f25865t1) {
                C6246e eVar = C6250g.this.f25864s1[this.f25879n + i2];
                if (this.f25866a == 0) {
                    int Q = eVar.mo23808Q();
                    int g1 = C6250g.this.f25853h1;
                    if (eVar.mo23807P() == 8) {
                        g1 = 0;
                    }
                    this.f25877l += Q + g1;
                    int t1 = C6250g.this.m27476B1(eVar, this.f25882q);
                    if (this.f25867b == null || this.f25868c < t1) {
                        this.f25867b = eVar;
                        this.f25868c = t1;
                        this.f25878m = t1;
                    }
                } else {
                    int s1 = C6250g.this.m27477C1(eVar, this.f25882q);
                    int t12 = C6250g.this.m27476B1(eVar, this.f25882q);
                    int h1 = C6250g.this.f25854i1;
                    if (eVar.mo23807P() == 8) {
                        h1 = 0;
                    }
                    this.f25878m += t12 + h1;
                    if (this.f25867b == null || this.f25868c < s1) {
                        this.f25867b = eVar;
                        this.f25868c = s1;
                        this.f25877l = s1;
                    }
                }
                i2++;
            }
        }

        /* renamed from: b */
        public void mo23902b(C6246e eVar) {
            int i = 0;
            if (this.f25866a == 0) {
                int s1 = C6250g.this.m27477C1(eVar, this.f25882q);
                if (eVar.mo23859z() == C6246e.C6248b.MATCH_CONSTRAINT) {
                    this.f25881p++;
                    s1 = 0;
                }
                int g1 = C6250g.this.f25853h1;
                if (eVar.mo23807P() != 8) {
                    i = g1;
                }
                this.f25877l += s1 + i;
                int t1 = C6250g.this.m27476B1(eVar, this.f25882q);
                if (this.f25867b == null || this.f25868c < t1) {
                    this.f25867b = eVar;
                    this.f25868c = t1;
                    this.f25878m = t1;
                }
            } else {
                int s12 = C6250g.this.m27477C1(eVar, this.f25882q);
                int t12 = C6250g.this.m27476B1(eVar, this.f25882q);
                if (eVar.mo23805N() == C6246e.C6248b.MATCH_CONSTRAINT) {
                    this.f25881p++;
                    t12 = 0;
                }
                int h1 = C6250g.this.f25854i1;
                if (eVar.mo23807P() != 8) {
                    i = h1;
                }
                this.f25878m += t12 + i;
                if (this.f25867b == null || this.f25868c < s12) {
                    this.f25867b = eVar;
                    this.f25868c = s12;
                    this.f25877l = s12;
                }
            }
            this.f25880o++;
        }

        /* renamed from: c */
        public void mo23903c() {
            this.f25868c = 0;
            this.f25867b = null;
            this.f25877l = 0;
            this.f25878m = 0;
            this.f25879n = 0;
            this.f25880o = 0;
            this.f25881p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23904d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f25880o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f25879n
                int r4 = r4 + r3
                w.g r5 = p166w.C6250g.this
                int r5 = r5.f25865t1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                w.g r4 = p166w.C6250g.this
                w.e[] r4 = r4.f25864s1
                int r5 = r0.f25879n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.mo23817a0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x035c
                w.e r3 = r0.f25867b
                if (r3 != 0) goto L_0x002f
                goto L_0x035c
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0067
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f25879n
                int r10 = r10 + r9
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25865t1
                if (r10 < r11) goto L_0x004f
                goto L_0x0067
            L_0x004f:
                w.g r10 = p166w.C6250g.this
                w.e[] r10 = r10.f25864s1
                int r11 = r0.f25879n
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.mo23807P()
                if (r9 != 0) goto L_0x0064
                if (r7 != r5) goto L_0x0063
                r7 = r6
            L_0x0063:
                r8 = r6
            L_0x0064:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0067:
                r6 = 0
                int r9 = r0.f25866a
                if (r9 != 0) goto L_0x01eb
                w.e r9 = r0.f25867b
                w.g r10 = p166w.C6250g.this
                int r10 = r10.f25842W0
                r9.mo23860z0(r10)
                int r10 = r0.f25874i
                if (r18 <= 0) goto L_0x0082
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25854i1
                int r10 = r10 + r11
            L_0x0082:
                w.d r11 = r9.f25736E
                w.d r12 = r0.f25870e
                r11.mo23766a(r12, r10)
                if (r19 == 0) goto L_0x0094
                w.d r10 = r9.f25739G
                w.d r11 = r0.f25872g
                int r12 = r0.f25876k
                r10.mo23766a(r11, r12)
            L_0x0094:
                if (r18 <= 0) goto L_0x00a1
                w.d r10 = r0.f25870e
                w.e r10 = r10.f25710b
                w.d r10 = r10.f25739G
                w.d r11 = r9.f25736E
                r10.mo23766a(r11, r2)
            L_0x00a1:
                w.g r10 = p166w.C6250g.this
                int r10 = r10.f25856k1
                r11 = 3
                if (r10 != r11) goto L_0x00db
                boolean r10 = r9.mo23811T()
                if (r10 != 0) goto L_0x00db
                r10 = 0
            L_0x00b1:
                if (r10 >= r1) goto L_0x00db
                if (r17 == 0) goto L_0x00b9
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00ba
            L_0x00b9:
                r12 = r10
            L_0x00ba:
                int r13 = r0.f25879n
                int r13 = r13 + r12
                w.g r14 = p166w.C6250g.this
                int r14 = r14.f25865t1
                if (r13 < r14) goto L_0x00c6
                goto L_0x00db
            L_0x00c6:
                w.g r13 = p166w.C6250g.this
                w.e[] r13 = r13.f25864s1
                int r14 = r0.f25879n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo23811T()
                if (r13 == 0) goto L_0x00d8
                goto L_0x00dc
            L_0x00d8:
                int r10 = r10 + 1
                goto L_0x00b1
            L_0x00db:
                r12 = r9
            L_0x00dc:
                r10 = 0
            L_0x00dd:
                if (r10 >= r1) goto L_0x035c
                if (r17 == 0) goto L_0x00e5
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e6
            L_0x00e5:
                r13 = r10
            L_0x00e6:
                int r14 = r0.f25879n
                int r14 = r14 + r13
                w.g r15 = p166w.C6250g.this
                int r15 = r15.f25865t1
                if (r14 < r15) goto L_0x00f3
                goto L_0x035c
            L_0x00f3:
                w.g r14 = p166w.C6250g.this
                w.e[] r14 = r14.f25864s1
                int r15 = r0.f25879n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L_0x0109
                w.d r15 = r14.f25734D
                w.d r11 = r0.f25869d
                int r3 = r0.f25873h
                r14.mo23828j(r15, r11, r3)
            L_0x0109:
                if (r13 != 0) goto L_0x014c
                w.g r3 = p166w.C6250g.this
                int r3 = r3.f25841V0
                w.g r11 = p166w.C6250g.this
                float r11 = r11.f25847b1
                int r13 = r0.f25879n
                if (r13 != 0) goto L_0x0130
                w.g r13 = p166w.C6250g.this
                int r13 = r13.f25843X0
                if (r13 == r5) goto L_0x0130
                w.g r3 = p166w.C6250g.this
                int r3 = r3.f25843X0
                w.g r11 = p166w.C6250g.this
                float r11 = r11.f25849d1
                goto L_0x0146
            L_0x0130:
                if (r19 == 0) goto L_0x0146
                w.g r13 = p166w.C6250g.this
                int r13 = r13.f25845Z0
                if (r13 == r5) goto L_0x0146
                w.g r3 = p166w.C6250g.this
                int r3 = r3.f25845Z0
                w.g r11 = p166w.C6250g.this
                float r11 = r11.f25851f1
            L_0x0146:
                r14.mo23831k0(r3)
                r14.mo23829j0(r11)
            L_0x014c:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x0159
                w.d r3 = r14.f25738F
                w.d r11 = r0.f25871f
                int r13 = r0.f25875j
                r14.mo23828j(r3, r11, r13)
            L_0x0159:
                if (r6 == 0) goto L_0x0184
                w.d r3 = r14.f25734D
                w.d r11 = r6.f25738F
                w.g r13 = p166w.C6250g.this
                int r13 = r13.f25853h1
                r3.mo23766a(r11, r13)
                if (r10 != r7) goto L_0x0171
                w.d r3 = r14.f25734D
                int r11 = r0.f25873h
                r3.mo23779n(r11)
            L_0x0171:
                w.d r3 = r6.f25738F
                w.d r11 = r14.f25734D
                r3.mo23766a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x0184
                w.d r3 = r6.f25738F
                int r6 = r0.f25875j
                r3.mo23779n(r6)
            L_0x0184:
                if (r14 == r9) goto L_0x01e4
                w.g r3 = p166w.C6250g.this
                int r3 = r3.f25856k1
                r6 = 3
                if (r3 != r6) goto L_0x01a5
                boolean r3 = r12.mo23811T()
                if (r3 == 0) goto L_0x01a5
                if (r14 == r12) goto L_0x01a5
                boolean r3 = r14.mo23811T()
                if (r3 == 0) goto L_0x01a5
                w.d r3 = r14.f25740H
                w.d r11 = r12.f25740H
                r3.mo23766a(r11, r2)
                goto L_0x01e5
            L_0x01a5:
                w.g r3 = p166w.C6250g.this
                int r3 = r3.f25856k1
                if (r3 == 0) goto L_0x01dc
                r11 = 1
                if (r3 == r11) goto L_0x01d4
                if (r4 == 0) goto L_0x01c5
                w.d r3 = r14.f25736E
                w.d r11 = r0.f25870e
                int r13 = r0.f25874i
                r3.mo23766a(r11, r13)
                w.d r3 = r14.f25739G
                w.d r11 = r0.f25872g
                int r13 = r0.f25876k
                r3.mo23766a(r11, r13)
                goto L_0x01e5
            L_0x01c5:
                w.d r3 = r14.f25736E
                w.d r11 = r9.f25736E
                r3.mo23766a(r11, r2)
                w.d r3 = r14.f25739G
                w.d r11 = r9.f25739G
                r3.mo23766a(r11, r2)
                goto L_0x01e5
            L_0x01d4:
                w.d r3 = r14.f25739G
                w.d r11 = r9.f25739G
                r3.mo23766a(r11, r2)
                goto L_0x01e5
            L_0x01dc:
                w.d r3 = r14.f25736E
                w.d r11 = r9.f25736E
                r3.mo23766a(r11, r2)
                goto L_0x01e5
            L_0x01e4:
                r6 = 3
            L_0x01e5:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00dd
            L_0x01eb:
                w.e r3 = r0.f25867b
                w.g r9 = p166w.C6250g.this
                int r9 = r9.f25841V0
                r3.mo23831k0(r9)
                int r9 = r0.f25873h
                if (r18 <= 0) goto L_0x0201
                w.g r10 = p166w.C6250g.this
                int r10 = r10.f25853h1
                int r9 = r9 + r10
            L_0x0201:
                if (r17 == 0) goto L_0x0223
                w.d r10 = r3.f25738F
                w.d r11 = r0.f25871f
                r10.mo23766a(r11, r9)
                if (r19 == 0) goto L_0x0215
                w.d r9 = r3.f25734D
                w.d r10 = r0.f25869d
                int r11 = r0.f25875j
                r9.mo23766a(r10, r11)
            L_0x0215:
                if (r18 <= 0) goto L_0x0242
                w.d r9 = r0.f25871f
                w.e r9 = r9.f25710b
                w.d r9 = r9.f25734D
                w.d r10 = r3.f25738F
                r9.mo23766a(r10, r2)
                goto L_0x0242
            L_0x0223:
                w.d r10 = r3.f25734D
                w.d r11 = r0.f25869d
                r10.mo23766a(r11, r9)
                if (r19 == 0) goto L_0x0235
                w.d r9 = r3.f25738F
                w.d r10 = r0.f25871f
                int r11 = r0.f25875j
                r9.mo23766a(r10, r11)
            L_0x0235:
                if (r18 <= 0) goto L_0x0242
                w.d r9 = r0.f25869d
                w.e r9 = r9.f25710b
                w.d r9 = r9.f25738F
                w.d r10 = r3.f25734D
                r9.mo23766a(r10, r2)
            L_0x0242:
                r9 = 0
            L_0x0243:
                if (r9 >= r1) goto L_0x035c
                int r10 = r0.f25879n
                int r10 = r10 + r9
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25865t1
                if (r10 < r11) goto L_0x0252
                goto L_0x035c
            L_0x0252:
                w.g r10 = p166w.C6250g.this
                w.e[] r10 = r10.f25864s1
                int r11 = r0.f25879n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r9 != 0) goto L_0x02a9
                w.d r11 = r10.f25736E
                w.d r12 = r0.f25870e
                int r13 = r0.f25874i
                r10.mo23828j(r11, r12, r13)
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25842W0
                w.g r12 = p166w.C6250g.this
                float r12 = r12.f25848c1
                int r13 = r0.f25879n
                if (r13 != 0) goto L_0x028d
                w.g r13 = p166w.C6250g.this
                int r13 = r13.f25844Y0
                if (r13 == r5) goto L_0x028d
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25844Y0
                w.g r12 = p166w.C6250g.this
                float r12 = r12.f25850e1
                goto L_0x02a3
            L_0x028d:
                if (r19 == 0) goto L_0x02a3
                w.g r13 = p166w.C6250g.this
                int r13 = r13.f25846a1
                if (r13 == r5) goto L_0x02a3
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25846a1
                w.g r12 = p166w.C6250g.this
                float r12 = r12.f25852g1
            L_0x02a3:
                r10.mo23860z0(r11)
                r10.mo23858y0(r12)
            L_0x02a9:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02b6
                w.d r11 = r10.f25739G
                w.d r12 = r0.f25872g
                int r13 = r0.f25876k
                r10.mo23828j(r11, r12, r13)
            L_0x02b6:
                if (r6 == 0) goto L_0x02e1
                w.d r11 = r10.f25736E
                w.d r12 = r6.f25739G
                w.g r13 = p166w.C6250g.this
                int r13 = r13.f25854i1
                r11.mo23766a(r12, r13)
                if (r9 != r7) goto L_0x02ce
                w.d r11 = r10.f25736E
                int r12 = r0.f25874i
                r11.mo23779n(r12)
            L_0x02ce:
                w.d r11 = r6.f25739G
                w.d r12 = r10.f25736E
                r11.mo23766a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x02e1
                w.d r6 = r6.f25739G
                int r11 = r0.f25876k
                r6.mo23779n(r11)
            L_0x02e1:
                if (r10 == r3) goto L_0x0356
                r6 = 2
                if (r17 == 0) goto L_0x0313
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25855j1
                if (r11 == 0) goto L_0x030b
                r12 = 1
                if (r11 == r12) goto L_0x0303
                if (r11 == r6) goto L_0x02f4
                goto L_0x0356
            L_0x02f4:
                w.d r6 = r10.f25734D
                w.d r11 = r3.f25734D
                r6.mo23766a(r11, r2)
                w.d r6 = r10.f25738F
                w.d r11 = r3.f25738F
                r6.mo23766a(r11, r2)
                goto L_0x0356
            L_0x0303:
                w.d r6 = r10.f25734D
                w.d r11 = r3.f25734D
                r6.mo23766a(r11, r2)
                goto L_0x0356
            L_0x030b:
                w.d r6 = r10.f25738F
                w.d r11 = r3.f25738F
                r6.mo23766a(r11, r2)
                goto L_0x0356
            L_0x0313:
                w.g r11 = p166w.C6250g.this
                int r11 = r11.f25855j1
                if (r11 == 0) goto L_0x034d
                r12 = 1
                if (r11 == r12) goto L_0x0345
                if (r11 == r6) goto L_0x0321
                goto L_0x0357
            L_0x0321:
                if (r4 == 0) goto L_0x0336
                w.d r6 = r10.f25734D
                w.d r11 = r0.f25869d
                int r13 = r0.f25873h
                r6.mo23766a(r11, r13)
                w.d r6 = r10.f25738F
                w.d r11 = r0.f25871f
                int r13 = r0.f25875j
                r6.mo23766a(r11, r13)
                goto L_0x0357
            L_0x0336:
                w.d r6 = r10.f25734D
                w.d r11 = r3.f25734D
                r6.mo23766a(r11, r2)
                w.d r6 = r10.f25738F
                w.d r11 = r3.f25738F
                r6.mo23766a(r11, r2)
                goto L_0x0357
            L_0x0345:
                w.d r6 = r10.f25738F
                w.d r11 = r3.f25738F
                r6.mo23766a(r11, r2)
                goto L_0x0357
            L_0x034d:
                r12 = 1
                w.d r6 = r10.f25734D
                w.d r11 = r3.f25734D
                r6.mo23766a(r11, r2)
                goto L_0x0357
            L_0x0356:
                r12 = 1
            L_0x0357:
                int r9 = r9 + 1
                r6 = r10
                goto L_0x0243
            L_0x035c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p166w.C6250g.C6251a.mo23904d(boolean, int, boolean):void");
        }

        /* renamed from: e */
        public int mo23905e() {
            if (this.f25866a == 1) {
                return this.f25878m - C6250g.this.f25854i1;
            }
            return this.f25878m;
        }

        /* renamed from: f */
        public int mo23906f() {
            if (this.f25866a == 0) {
                return this.f25877l - C6250g.this.f25853h1;
            }
            return this.f25877l;
        }

        /* renamed from: g */
        public void mo23907g(int i) {
            int i2 = this.f25881p;
            if (i2 != 0) {
                int i3 = this.f25880o;
                int i4 = i / i2;
                int i5 = 0;
                while (i5 < i3 && this.f25879n + i5 < C6250g.this.f25865t1) {
                    C6246e eVar = C6250g.this.f25864s1[this.f25879n + i5];
                    if (this.f25866a == 0) {
                        if (eVar != null && eVar.mo23859z() == C6246e.C6248b.MATCH_CONSTRAINT && eVar.f25781l == 0) {
                            C6250g.this.mo23929U0(eVar, C6246e.C6248b.FIXED, i4, eVar.mo23805N(), eVar.mo23853w());
                        }
                    } else if (eVar != null && eVar.mo23805N() == C6246e.C6248b.MATCH_CONSTRAINT && eVar.f25783m == 0) {
                        C6250g.this.mo23929U0(eVar, eVar.mo23859z(), eVar.mo23808Q(), C6246e.C6248b.FIXED, i4);
                    }
                    i5++;
                }
                m27524h();
            }
        }

        /* renamed from: i */
        public void mo23908i(int i) {
            this.f25879n = i;
        }

        /* renamed from: j */
        public void mo23909j(int i, C6243d dVar, C6243d dVar2, C6243d dVar3, C6243d dVar4, int i2, int i3, int i4, int i5, int i6) {
            this.f25866a = i;
            this.f25869d = dVar;
            this.f25870e = dVar2;
            this.f25871f = dVar3;
            this.f25872g = dVar4;
            this.f25873h = i2;
            this.f25874i = i3;
            this.f25875j = i4;
            this.f25876k = i5;
            this.f25882q = i6;
        }
    }

    /* renamed from: A1 */
    private void m27475A1(boolean z) {
        C6246e eVar;
        if (this.f25863r1 != null && this.f25862q1 != null && this.f25861p1 != null) {
            for (int i = 0; i < this.f25865t1; i++) {
                this.f25864s1[i].mo23817a0();
            }
            int[] iArr = this.f25863r1;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C6246e eVar2 = null;
            for (int i4 = 0; i4 < i2; i4++) {
                C6246e eVar3 = this.f25862q1[z ? (i2 - i4) - 1 : i4];
                if (!(eVar3 == null || eVar3.mo23807P() == 8)) {
                    if (i4 == 0) {
                        eVar3.mo23828j(eVar3.f25734D, this.f25734D, mo23926Q0());
                        eVar3.mo23831k0(this.f25841V0);
                        eVar3.mo23829j0(this.f25847b1);
                    }
                    if (i4 == i2 - 1) {
                        eVar3.mo23828j(eVar3.f25738F, this.f25738F, mo23927R0());
                    }
                    if (i4 > 0) {
                        eVar3.mo23828j(eVar3.f25734D, eVar2.f25738F, this.f25853h1);
                        eVar2.mo23828j(eVar2.f25738F, eVar3.f25734D, 0);
                    }
                    eVar2 = eVar3;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                C6246e eVar4 = this.f25861p1[i5];
                if (!(eVar4 == null || eVar4.mo23807P() == 8)) {
                    if (i5 == 0) {
                        eVar4.mo23828j(eVar4.f25736E, this.f25736E, mo23928S0());
                        eVar4.mo23860z0(this.f25842W0);
                        eVar4.mo23858y0(this.f25848c1);
                    }
                    if (i5 == i3 - 1) {
                        eVar4.mo23828j(eVar4.f25739G, this.f25739G, mo23925P0());
                    }
                    if (i5 > 0) {
                        eVar4.mo23828j(eVar4.f25736E, eVar2.f25739G, this.f25854i1);
                        eVar2.mo23828j(eVar2.f25739G, eVar4.f25736E, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i7 * i2) + i6;
                    if (this.f25859n1 == 1) {
                        i8 = (i6 * i3) + i7;
                    }
                    C6246e[] eVarArr = this.f25864s1;
                    if (!(i8 >= eVarArr.length || (eVar = eVarArr[i8]) == null || eVar.mo23807P() == 8)) {
                        C6246e eVar5 = this.f25862q1[i6];
                        C6246e eVar6 = this.f25861p1[i7];
                        if (eVar != eVar5) {
                            eVar.mo23828j(eVar.f25734D, eVar5.f25734D, 0);
                            eVar.mo23828j(eVar.f25738F, eVar5.f25738F, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.mo23828j(eVar.f25736E, eVar6.f25736E, 0);
                            eVar.mo23828j(eVar.f25739G, eVar6.f25739G, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final int m27476B1(C6246e eVar, int i) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo23805N() == C6246e.C6248b.MATCH_CONSTRAINT) {
            int i2 = eVar.f25783m;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.f25797t * ((float) i));
                if (i3 != eVar.mo23853w()) {
                    mo23929U0(eVar, eVar.mo23859z(), eVar.mo23808Q(), C6246e.C6248b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.mo23853w();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) eVar.mo23808Q()) * eVar.f25751S) + 0.5f);
                }
            }
        }
        return eVar.mo23853w();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final int m27477C1(C6246e eVar, int i) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo23859z() == C6246e.C6248b.MATCH_CONSTRAINT) {
            int i2 = eVar.f25781l;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.f25791q * ((float) i));
                if (i3 != eVar.mo23808Q()) {
                    mo23929U0(eVar, C6246e.C6248b.FIXED, i3, eVar.mo23805N(), eVar.mo23853w());
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.mo23808Q();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) eVar.mo23853w()) * eVar.f25751S) + 0.5f);
                }
            }
        }
        return eVar.mo23808Q();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* renamed from: D1 */
    private void m27478D1(p166w.C6246e[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            if (r3 != 0) goto L_0x0030
            int r6 = r0.f25858m1
            if (r6 > 0) goto L_0x002d
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.f25853h1
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.m27477C1(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = 0
            goto L_0x0051
        L_0x0030:
            int r6 = r0.f25858m1
            if (r6 > 0) goto L_0x0050
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0037:
            if (r7 >= r2) goto L_0x0050
            if (r7 <= 0) goto L_0x003e
            int r9 = r0.f25854i1
            int r8 = r8 + r9
        L_0x003e:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            int r9 = r0.m27476B1(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            int r6 = r6 + 1
        L_0x004d:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0050:
            r7 = 0
        L_0x0051:
            int[] r8 = r0.f25863r1
            if (r8 != 0) goto L_0x005a
            r8 = 2
            int[] r8 = new int[r8]
            r0.f25863r1 = r8
        L_0x005a:
            r8 = 1
            if (r6 != 0) goto L_0x005f
            if (r3 == r8) goto L_0x0063
        L_0x005f:
            if (r7 != 0) goto L_0x0065
            if (r3 != 0) goto L_0x0065
        L_0x0063:
            r9 = 1
            goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            if (r9 != 0) goto L_0x012b
            if (r3 != 0) goto L_0x0074
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007d
        L_0x0074:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007d:
            w.e[] r10 = r0.f25862q1
            r11 = 0
            if (r10 == 0) goto L_0x008a
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008e
        L_0x008a:
            w.e[] r10 = new p166w.C6246e[r7]
            r0.f25862q1 = r10
        L_0x008e:
            w.e[] r10 = r0.f25861p1
            if (r10 == 0) goto L_0x009a
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009e
        L_0x009a:
            w.e[] r10 = new p166w.C6246e[r6]
            r0.f25861p1 = r10
        L_0x009e:
            r10 = 0
        L_0x009f:
            if (r10 >= r7) goto L_0x00e7
            r11 = 0
        L_0x00a2:
            if (r11 >= r6) goto L_0x00e4
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00ac
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00ac:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00b0
            goto L_0x00e1
        L_0x00b0:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b5
            goto L_0x00e1
        L_0x00b5:
            int r13 = r0.m27477C1(r12, r4)
            w.e[] r14 = r0.f25862q1
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c7
            r14 = r14[r10]
            int r14 = r14.mo23808Q()
            if (r14 >= r13) goto L_0x00cb
        L_0x00c7:
            w.e[] r13 = r0.f25862q1
            r13[r10] = r12
        L_0x00cb:
            int r13 = r0.m27476B1(r12, r4)
            w.e[] r14 = r0.f25861p1
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00dd
            r14 = r14[r11]
            int r14 = r14.mo23853w()
            if (r14 >= r13) goto L_0x00e1
        L_0x00dd:
            w.e[] r13 = r0.f25861p1
            r13[r11] = r12
        L_0x00e1:
            int r11 = r11 + 1
            goto L_0x00a2
        L_0x00e4:
            int r10 = r10 + 1
            goto L_0x009f
        L_0x00e7:
            r10 = 0
            r11 = 0
        L_0x00e9:
            if (r10 >= r7) goto L_0x00fe
            w.e[] r12 = r0.f25862q1
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00fb
            if (r10 <= 0) goto L_0x00f6
            int r13 = r0.f25853h1
            int r11 = r11 + r13
        L_0x00f6:
            int r12 = r0.m27477C1(r12, r4)
            int r11 = r11 + r12
        L_0x00fb:
            int r10 = r10 + 1
            goto L_0x00e9
        L_0x00fe:
            r10 = 0
            r12 = 0
        L_0x0100:
            if (r10 >= r6) goto L_0x0115
            w.e[] r13 = r0.f25861p1
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0112
            if (r10 <= 0) goto L_0x010d
            int r14 = r0.f25854i1
            int r12 = r12 + r14
        L_0x010d:
            int r13 = r0.m27476B1(r13, r4)
            int r12 = r12 + r13
        L_0x0112:
            int r10 = r10 + 1
            goto L_0x0100
        L_0x0115:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0123
            if (r11 <= r4) goto L_0x0063
            if (r7 <= r8) goto L_0x0063
            int r7 = r7 + -1
            goto L_0x0066
        L_0x0123:
            if (r12 <= r4) goto L_0x0063
            if (r6 <= r8) goto L_0x0063
            int r6 = r6 + -1
            goto L_0x0066
        L_0x012b:
            int[] r1 = r0.f25863r1
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166w.C6250g.m27478D1(w.e[], int, int, int, int[]):void");
    }

    /* renamed from: E1 */
    private void m27479E1(C6246e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        C6243d dVar;
        int i5;
        int i6;
        int i7;
        C6243d dVar2;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f25860o1.clear();
            C6251a aVar = new C6251a(i2, this.f25734D, this.f25736E, this.f25738F, this.f25739G, i3);
            this.f25860o1.add(aVar);
            if (i2 == 0) {
                i4 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i13 < i10) {
                    C6246e eVar = eVarArr[i13];
                    int C1 = m27477C1(eVar, i11);
                    if (eVar.mo23859z() == C6246e.C6248b.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i14 = i4;
                    boolean z = (i12 == i11 || (this.f25853h1 + i12) + C1 > i11) && aVar.f25867b != null;
                    if (!z && i13 > 0 && (i9 = this.f25858m1) > 0 && i13 % i9 == 0) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C6251a(i2, this.f25734D, this.f25736E, this.f25738F, this.f25739G, i3);
                        aVar.mo23908i(i13);
                        this.f25860o1.add(aVar);
                    } else if (i13 > 0) {
                        i12 += this.f25853h1 + C1;
                        aVar.mo23902b(eVar);
                        i13++;
                        i4 = i14;
                    }
                    i12 = C1;
                    aVar.mo23902b(eVar);
                    i13++;
                    i4 = i14;
                }
            } else {
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < i10) {
                    C6246e eVar2 = eVarArr[i17];
                    int B1 = m27476B1(eVar2, i11);
                    if (eVar2.mo23805N() == C6246e.C6248b.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i18 = i4;
                    boolean z2 = (i16 == i11 || (this.f25854i1 + i16) + B1 > i11) && aVar.f25867b != null;
                    if (!z2 && i17 > 0 && (i8 = this.f25858m1) > 0 && i17 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C6251a(i2, this.f25734D, this.f25736E, this.f25738F, this.f25739G, i3);
                        aVar.mo23908i(i17);
                        this.f25860o1.add(aVar);
                    } else if (i17 > 0) {
                        i16 += this.f25854i1 + B1;
                        aVar.mo23902b(eVar2);
                        i17++;
                        i15 = i18;
                    }
                    i16 = B1;
                    aVar.mo23902b(eVar2);
                    i17++;
                    i15 = i18;
                }
            }
            int size = this.f25860o1.size();
            C6243d dVar3 = this.f25734D;
            C6243d dVar4 = this.f25736E;
            C6243d dVar5 = this.f25738F;
            C6243d dVar6 = this.f25739G;
            int Q0 = mo23926Q0();
            int S0 = mo23928S0();
            int R0 = mo23927R0();
            int P0 = mo23925P0();
            C6246e.C6248b z3 = mo23859z();
            C6246e.C6248b bVar = C6246e.C6248b.WRAP_CONTENT;
            boolean z4 = z3 == bVar || mo23805N() == bVar;
            if (i4 > 0 && z4) {
                for (int i19 = 0; i19 < size; i19++) {
                    C6251a aVar2 = this.f25860o1.get(i19);
                    if (i2 == 0) {
                        aVar2.mo23907g(i11 - aVar2.mo23906f());
                    } else {
                        aVar2.mo23907g(i11 - aVar2.mo23905e());
                    }
                }
            }
            int i20 = S0;
            int i21 = R0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = Q0;
            C6243d dVar7 = dVar4;
            C6243d dVar8 = dVar3;
            int i26 = P0;
            while (i24 < size) {
                C6251a aVar3 = this.f25860o1.get(i24);
                if (i2 == 0) {
                    if (i24 < size - 1) {
                        dVar2 = this.f25860o1.get(i24 + 1).f25867b.f25736E;
                        i7 = 0;
                    } else {
                        dVar2 = this.f25739G;
                        i7 = mo23925P0();
                    }
                    C6243d dVar9 = aVar3.f25867b.f25739G;
                    C6243d dVar10 = dVar8;
                    C6243d dVar11 = dVar8;
                    int i27 = i22;
                    C6243d dVar12 = dVar7;
                    int i28 = i23;
                    C6243d dVar13 = dVar5;
                    C6243d dVar14 = dVar5;
                    i5 = i24;
                    aVar3.mo23909j(i2, dVar10, dVar12, dVar13, dVar2, i25, i20, i21, i7, i3);
                    int max = Math.max(i28, aVar3.mo23906f());
                    i22 = i27 + aVar3.mo23905e();
                    if (i5 > 0) {
                        i22 += this.f25854i1;
                    }
                    dVar8 = dVar11;
                    i23 = max;
                    dVar7 = dVar9;
                    i20 = 0;
                    dVar = dVar14;
                    int i29 = i7;
                    dVar6 = dVar2;
                    i26 = i29;
                } else {
                    C6243d dVar15 = dVar8;
                    int i30 = i22;
                    int i31 = i23;
                    i5 = i24;
                    if (i5 < size - 1) {
                        dVar = this.f25860o1.get(i5 + 1).f25867b.f25734D;
                        i6 = 0;
                    } else {
                        dVar = this.f25738F;
                        i6 = mo23927R0();
                    }
                    C6243d dVar16 = aVar3.f25867b.f25738F;
                    aVar3.mo23909j(i2, dVar15, dVar7, dVar, dVar6, i25, i20, i6, i26, i3);
                    i23 = i31 + aVar3.mo23906f();
                    int max2 = Math.max(i30, aVar3.mo23905e());
                    if (i5 > 0) {
                        i23 += this.f25853h1;
                    }
                    i22 = max2;
                    i21 = i6;
                    dVar8 = dVar16;
                    i25 = 0;
                }
                i24 = i5 + 1;
                int i32 = i3;
                dVar5 = dVar;
            }
            iArr[0] = i23;
            iArr[1] = i22;
        }
    }

    /* renamed from: F1 */
    private void m27480F1(C6246e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        C6251a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.f25860o1.size() == 0) {
                aVar = new C6251a(i2, this.f25734D, this.f25736E, this.f25738F, this.f25739G, i3);
                this.f25860o1.add(aVar);
            } else {
                C6251a aVar2 = this.f25860o1.get(0);
                aVar2.mo23903c();
                aVar = aVar2;
                int i5 = i2;
                aVar.mo23909j(i5, this.f25734D, this.f25736E, this.f25738F, this.f25739G, mo23926Q0(), mo23928S0(), mo23927R0(), mo23925P0(), i3);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                aVar.mo23902b(eVarArr[i6]);
            }
            iArr[0] = aVar.mo23906f();
            iArr[1] = aVar.mo23905e();
        }
    }

    /* renamed from: G1 */
    public void mo23882G1(float f) {
        this.f25849d1 = f;
    }

    /* renamed from: H1 */
    public void mo23883H1(int i) {
        this.f25843X0 = i;
    }

    /* renamed from: I1 */
    public void mo23884I1(float f) {
        this.f25850e1 = f;
    }

    /* renamed from: J1 */
    public void mo23885J1(int i) {
        this.f25844Y0 = i;
    }

    /* renamed from: K1 */
    public void mo23886K1(int i) {
        this.f25855j1 = i;
    }

    /* renamed from: L1 */
    public void mo23887L1(float f) {
        this.f25847b1 = f;
    }

    /* renamed from: M1 */
    public void mo23888M1(int i) {
        this.f25853h1 = i;
    }

    /* renamed from: N1 */
    public void mo23889N1(int i) {
        this.f25841V0 = i;
    }

    /* renamed from: O1 */
    public void mo23890O1(float f) {
        this.f25851f1 = f;
    }

    /* renamed from: P1 */
    public void mo23891P1(int i) {
        this.f25845Z0 = i;
    }

    /* renamed from: Q1 */
    public void mo23892Q1(float f) {
        this.f25852g1 = f;
    }

    /* renamed from: R1 */
    public void mo23893R1(int i) {
        this.f25846a1 = i;
    }

    /* renamed from: S1 */
    public void mo23894S1(int i) {
        this.f25858m1 = i;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23895T0(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f25892H0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.mo23930V0()
            if (r0 != 0) goto L_0x001c
            r6.mo23933Y0(r11, r11)
            r6.mo23932X0(r11)
            return
        L_0x001c:
            int r12 = r18.mo23926Q0()
            int r13 = r18.mo23927R0()
            int r14 = r18.mo23928S0()
            int r15 = r18.mo23925P0()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f25859n1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f25841V0
            if (r2 != r1) goto L_0x0045
            r6.f25841V0 = r11
        L_0x0045:
            int r2 = r6.f25842W0
            if (r2 != r1) goto L_0x0058
            r6.f25842W0 = r11
            goto L_0x0058
        L_0x004c:
            int r2 = r6.f25841V0
            if (r2 != r1) goto L_0x0052
            r6.f25841V0 = r11
        L_0x0052:
            int r2 = r6.f25842W0
            if (r2 != r1) goto L_0x0058
            r6.f25842W0 = r11
        L_0x0058:
            w.e[] r1 = r6.f25891G0
            r2 = 0
            r3 = 0
        L_0x005c:
            int r11 = r6.f25892H0
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            w.e[] r11 = r6.f25891G0
            r11 = r11[r2]
            int r11 = r11.mo23807P()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            w.e[] r1 = new p166w.C6246e[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.f25892H0
            if (r2 >= r11) goto L_0x008f
            w.e[] r11 = r6.f25891G0
            r11 = r11[r2]
            int r4 = r11.mo23807P()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.f25864s1 = r1
            r6.f25865t1 = r2
            int r0 = r6.f25857l1
            if (r0 == 0) goto L_0x00bf
            r4 = 1
            if (r0 == r4) goto L_0x00b2
            r3 = 2
            if (r0 == r3) goto L_0x00a5
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00cc
        L_0x00a5:
            int r3 = r6.f25859n1
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.m27478D1(r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x00b2:
            r17 = r5
            r11 = 1
            int r3 = r6.f25859n1
            r0 = r18
            r4 = r16
            r0.m27479E1(r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x00bf:
            r17 = r5
            r11 = 1
            int r3 = r6.f25859n1
            r0 = r18
            r4 = r16
            r0.m27480F1(r1, r2, r3, r4, r5)
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00dc
            r1 = r8
            goto L_0x00e7
        L_0x00dc:
            if (r7 != r3) goto L_0x00e3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00e7
        L_0x00e3:
            if (r7 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r1 = 0
        L_0x00e7:
            if (r9 != r4) goto L_0x00eb
            r2 = r10
            goto L_0x00f6
        L_0x00eb:
            if (r9 != r3) goto L_0x00f2
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x00f6
        L_0x00f2:
            if (r9 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            r6.mo23933Y0(r1, r2)
            r6.mo23792F0(r1)
            r6.mo23827i0(r2)
            int r1 = r6.f25892H0
            if (r1 <= 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r11 = 0
        L_0x0105:
            r6.mo23932X0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166w.C6250g.mo23895T0(int, int, int, int):void");
    }

    /* renamed from: T1 */
    public void mo23896T1(int i) {
        this.f25859n1 = i;
    }

    /* renamed from: U1 */
    public void mo23897U1(int i) {
        this.f25856k1 = i;
    }

    /* renamed from: V1 */
    public void mo23898V1(float f) {
        this.f25848c1 = f;
    }

    /* renamed from: W1 */
    public void mo23899W1(int i) {
        this.f25854i1 = i;
    }

    /* renamed from: X1 */
    public void mo23900X1(int i) {
        this.f25842W0 = i;
    }

    /* renamed from: Y1 */
    public void mo23901Y1(int i) {
        this.f25857l1 = i;
    }

    /* renamed from: f */
    public void mo23761f(C6213d dVar) {
        super.mo23761f(dVar);
        boolean c1 = mo23795H() != null ? ((C6249f) mo23795H()).mo23873c1() : false;
        int i = this.f25857l1;
        if (i != 0) {
            if (i == 1) {
                int size = this.f25860o1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f25860o1.get(i2).mo23904d(c1, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                m27475A1(c1);
            }
        } else if (this.f25860o1.size() > 0) {
            this.f25860o1.get(0).mo23904d(c1, 0, true);
        }
        mo23932X0(false);
    }

    /* renamed from: l */
    public void mo23763l(C6246e eVar, HashMap<C6246e, C6246e> hashMap) {
        super.mo23763l(eVar, hashMap);
        C6250g gVar = (C6250g) eVar;
        this.f25841V0 = gVar.f25841V0;
        this.f25842W0 = gVar.f25842W0;
        this.f25843X0 = gVar.f25843X0;
        this.f25844Y0 = gVar.f25844Y0;
        this.f25845Z0 = gVar.f25845Z0;
        this.f25846a1 = gVar.f25846a1;
        this.f25847b1 = gVar.f25847b1;
        this.f25848c1 = gVar.f25848c1;
        this.f25849d1 = gVar.f25849d1;
        this.f25850e1 = gVar.f25850e1;
        this.f25851f1 = gVar.f25851f1;
        this.f25852g1 = gVar.f25852g1;
        this.f25853h1 = gVar.f25853h1;
        this.f25854i1 = gVar.f25854i1;
        this.f25855j1 = gVar.f25855j1;
        this.f25856k1 = gVar.f25856k1;
        this.f25857l1 = gVar.f25857l1;
        this.f25858m1 = gVar.f25858m1;
        this.f25859n1 = gVar.f25859n1;
    }
}
