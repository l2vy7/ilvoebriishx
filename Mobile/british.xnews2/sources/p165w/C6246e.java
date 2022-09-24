package p165w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p160v.C6212c;
import p160v.C6213d;
import p165w.C6243d;
import p170x.C6320c;
import p170x.C6323f;
import p170x.C6328j;
import p170x.C6331l;
import p170x.C6333m;

/* renamed from: w.e */
/* compiled from: ConstraintWidget */
public class C6246e {

    /* renamed from: F0 */
    public static float f25727F0 = 0.5f;

    /* renamed from: A */
    private boolean f25728A = false;

    /* renamed from: A0 */
    public float[] f25729A0;

    /* renamed from: B */
    private boolean f25730B;

    /* renamed from: B0 */
    protected C6246e[] f25731B0;

    /* renamed from: C */
    private boolean f25732C = false;

    /* renamed from: C0 */
    protected C6246e[] f25733C0;

    /* renamed from: D */
    public C6243d f25734D = new C6243d(this, C6243d.C6245b.LEFT);

    /* renamed from: D0 */
    C6246e f25735D0;

    /* renamed from: E */
    public C6243d f25736E = new C6243d(this, C6243d.C6245b.TOP);

    /* renamed from: E0 */
    C6246e f25737E0;

    /* renamed from: F */
    public C6243d f25738F = new C6243d(this, C6243d.C6245b.RIGHT);

    /* renamed from: G */
    public C6243d f25739G = new C6243d(this, C6243d.C6245b.BOTTOM);

    /* renamed from: H */
    C6243d f25740H = new C6243d(this, C6243d.C6245b.BASELINE);

    /* renamed from: I */
    C6243d f25741I = new C6243d(this, C6243d.C6245b.CENTER_X);

    /* renamed from: J */
    C6243d f25742J = new C6243d(this, C6243d.C6245b.CENTER_Y);

    /* renamed from: K */
    C6243d f25743K;

    /* renamed from: L */
    public C6243d[] f25744L;

    /* renamed from: M */
    protected ArrayList<C6243d> f25745M;

    /* renamed from: N */
    private boolean[] f25746N;

    /* renamed from: O */
    public C6248b[] f25747O;

    /* renamed from: P */
    public C6246e f25748P;

    /* renamed from: Q */
    int f25749Q;

    /* renamed from: R */
    int f25750R;

    /* renamed from: S */
    public float f25751S;

    /* renamed from: T */
    protected int f25752T;

    /* renamed from: U */
    protected int f25753U;

    /* renamed from: V */
    protected int f25754V;

    /* renamed from: W */
    int f25755W;

    /* renamed from: X */
    int f25756X;

    /* renamed from: Y */
    protected int f25757Y;

    /* renamed from: Z */
    protected int f25758Z;

    /* renamed from: a */
    public boolean f25759a = false;

    /* renamed from: a0 */
    int f25760a0;

    /* renamed from: b */
    public C6333m[] f25761b = new C6333m[2];

    /* renamed from: b0 */
    protected int f25762b0;

    /* renamed from: c */
    public C6320c f25763c;

    /* renamed from: c0 */
    protected int f25764c0;

    /* renamed from: d */
    public C6320c f25765d;

    /* renamed from: d0 */
    float f25766d0;

    /* renamed from: e */
    public C6328j f25767e = new C6328j(this);

    /* renamed from: e0 */
    float f25768e0;

    /* renamed from: f */
    public C6331l f25769f = new C6331l(this);

    /* renamed from: f0 */
    private Object f25770f0;

    /* renamed from: g */
    public boolean[] f25771g = {true, true};

    /* renamed from: g0 */
    private int f25772g0;

    /* renamed from: h */
    public int[] f25773h = {0, 0, 0, 0};

    /* renamed from: h0 */
    private int f25774h0;

    /* renamed from: i */
    boolean f25775i = false;

    /* renamed from: i0 */
    private String f25776i0;

    /* renamed from: j */
    public int f25777j = -1;

    /* renamed from: j0 */
    private String f25778j0;

    /* renamed from: k */
    public int f25779k = -1;

    /* renamed from: k0 */
    int f25780k0;

    /* renamed from: l */
    public int f25781l = 0;

    /* renamed from: l0 */
    int f25782l0;

    /* renamed from: m */
    public int f25783m = 0;

    /* renamed from: m0 */
    int f25784m0;

    /* renamed from: n */
    public int[] f25785n = new int[2];

    /* renamed from: n0 */
    int f25786n0;

    /* renamed from: o */
    public int f25787o = 0;

    /* renamed from: o0 */
    boolean f25788o0;

    /* renamed from: p */
    public int f25789p = 0;

    /* renamed from: p0 */
    boolean f25790p0;

    /* renamed from: q */
    public float f25791q = 1.0f;

    /* renamed from: q0 */
    boolean f25792q0;

    /* renamed from: r */
    public int f25793r = 0;

    /* renamed from: r0 */
    boolean f25794r0;

    /* renamed from: s */
    public int f25795s = 0;

    /* renamed from: s0 */
    boolean f25796s0;

    /* renamed from: t */
    public float f25797t = 1.0f;

    /* renamed from: t0 */
    boolean f25798t0;

    /* renamed from: u */
    public boolean f25799u;

    /* renamed from: u0 */
    boolean f25800u0;

    /* renamed from: v */
    public boolean f25801v;

    /* renamed from: v0 */
    boolean f25802v0;

    /* renamed from: w */
    int f25803w = -1;

    /* renamed from: w0 */
    int f25804w0;

    /* renamed from: x */
    float f25805x = 1.0f;

    /* renamed from: x0 */
    int f25806x0;

    /* renamed from: y */
    private int[] f25807y = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: y0 */
    boolean f25808y0;

    /* renamed from: z */
    private float f25809z = 0.0f;

    /* renamed from: z0 */
    boolean f25810z0;

    /* renamed from: w.e$a */
    /* compiled from: ConstraintWidget */
    static /* synthetic */ class C6247a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25811a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25812b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                w.e$b[] r0 = p165w.C6246e.C6248b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25812b = r0
                r1 = 1
                w.e$b r2 = p165w.C6246e.C6248b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25812b     // Catch:{ NoSuchFieldError -> 0x001d }
                w.e$b r3 = p165w.C6246e.C6248b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25812b     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.e$b r4 = p165w.C6246e.C6248b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f25812b     // Catch:{ NoSuchFieldError -> 0x0033 }
                w.e$b r5 = p165w.C6246e.C6248b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                w.d$b[] r4 = p165w.C6243d.C6245b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f25811a = r4
                w.d$b r5 = p165w.C6243d.C6245b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f25811a     // Catch:{ NoSuchFieldError -> 0x004e }
                w.d$b r4 = p165w.C6243d.C6245b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x0058 }
                w.d$b r1 = p165w.C6243d.C6245b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x0062 }
                w.d$b r1 = p165w.C6243d.C6245b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x006d }
                w.d$b r1 = p165w.C6243d.C6245b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x0078 }
                w.d$b r1 = p165w.C6243d.C6245b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x0083 }
                w.d$b r1 = p165w.C6243d.C6245b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x008f }
                w.d$b r1 = p165w.C6243d.C6245b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f25811a     // Catch:{ NoSuchFieldError -> 0x009b }
                w.d$b r1 = p165w.C6243d.C6245b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p165w.C6246e.C6247a.<clinit>():void");
        }
    }

    /* renamed from: w.e$b */
    /* compiled from: ConstraintWidget */
    public enum C6248b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C6246e() {
        C6243d dVar = new C6243d(this, C6243d.C6245b.CENTER);
        this.f25743K = dVar;
        this.f25744L = new C6243d[]{this.f25734D, this.f25738F, this.f25736E, this.f25739G, this.f25740H, dVar};
        this.f25745M = new ArrayList<>();
        this.f25746N = new boolean[2];
        C6248b bVar = C6248b.FIXED;
        this.f25747O = new C6248b[]{bVar, bVar};
        this.f25748P = null;
        this.f25749Q = 0;
        this.f25750R = 0;
        this.f25751S = 0.0f;
        this.f25752T = -1;
        this.f25753U = 0;
        this.f25754V = 0;
        this.f25755W = 0;
        this.f25756X = 0;
        this.f25757Y = 0;
        this.f25758Z = 0;
        this.f25760a0 = 0;
        float f = f25727F0;
        this.f25766d0 = f;
        this.f25768e0 = f;
        this.f25772g0 = 0;
        this.f25774h0 = 0;
        this.f25776i0 = null;
        this.f25778j0 = null;
        this.f25800u0 = false;
        this.f25802v0 = false;
        this.f25804w0 = 0;
        this.f25806x0 = 0;
        this.f25729A0 = new float[]{-1.0f, -1.0f};
        this.f25731B0 = new C6246e[]{null, null};
        this.f25733C0 = new C6246e[]{null, null};
        this.f25735D0 = null;
        this.f25737E0 = null;
        m27364d();
    }

    /* renamed from: V */
    private boolean m27363V(int i) {
        int i2 = i * 2;
        C6243d[] dVarArr = this.f25744L;
        if (!(dVarArr[i2].f25712d == null || dVarArr[i2].f25712d.f25712d == dVarArr[i2])) {
            int i3 = i2 + 1;
            return dVarArr[i3].f25712d != null && dVarArr[i3].f25712d.f25712d == dVarArr[i3];
        }
    }

    /* renamed from: d */
    private void m27364d() {
        this.f25745M.add(this.f25734D);
        this.f25745M.add(this.f25736E);
        this.f25745M.add(this.f25738F);
        this.f25745M.add(this.f25739G);
        this.f25745M.add(this.f25741I);
        this.f25745M.add(this.f25742J);
        this.f25745M.add(this.f25743K);
        this.f25745M.add(this.f25740H);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0326 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ca  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27365h(p160v.C6213d r32, boolean r33, boolean r34, boolean r35, boolean r36, p160v.C6222i r37, p160v.C6222i r38, p165w.C6246e.C6248b r39, boolean r40, p165w.C6243d r41, p165w.C6243d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r53
            r3 = r54
            r4 = r55
            v.i r9 = r10.mo23709q(r13)
            v.i r8 = r10.mo23709q(r14)
            w.d r5 = r41.mo23772g()
            v.i r7 = r10.mo23709q(r5)
            w.d r5 = r42.mo23772g()
            v.i r6 = r10.mo23709q(r5)
            p160v.C6213d.m27239w()
            boolean r16 = r41.mo23775j()
            boolean r17 = r42.mo23775j()
            w.d r5 = r0.f25743K
            boolean r18 = r5.mo23775j()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r48 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r52
        L_0x0051:
            int[] r20 = p165w.C6246e.C6247a.f25812b
            int r21 = r39.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0071
        L_0x006a:
            r12 = r19
            if (r12 != r2) goto L_0x006f
            goto L_0x0067
        L_0x006f:
            r19 = 1
        L_0x0071:
            int r2 = r0.f25774h0
            r14 = 8
            if (r2 != r14) goto L_0x007b
            r2 = 0
            r19 = 0
            goto L_0x007d
        L_0x007b:
            r2 = r44
        L_0x007d:
            if (r57 == 0) goto L_0x009b
            if (r16 != 0) goto L_0x008b
            if (r17 != 0) goto L_0x008b
            if (r18 != 0) goto L_0x008b
            r14 = r43
            r10.mo23700f(r9, r14)
            goto L_0x009b
        L_0x008b:
            if (r16 == 0) goto L_0x009b
            if (r17 != 0) goto L_0x009b
            int r14 = r41.mo23768c()
            r23 = r6
            r6 = 8
            r10.mo23699e(r9, r7, r14, r6)
            goto L_0x009f
        L_0x009b:
            r23 = r6
            r6 = 8
        L_0x009f:
            if (r19 != 0) goto L_0x00ca
            if (r40 == 0) goto L_0x00b8
            r6 = 0
            r14 = 3
            r10.mo23699e(r8, r9, r6, r14)
            r6 = 8
            if (r15 <= 0) goto L_0x00af
            r10.mo23702h(r8, r9, r15, r6)
        L_0x00af:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L_0x00bb
            r10.mo23704j(r8, r9, r1, r6)
            goto L_0x00bb
        L_0x00b8:
            r10.mo23699e(r8, r9, r2, r6)
        L_0x00bb:
            r24 = r3
            r1 = r4
            r15 = r7
            r2 = r8
        L_0x00c0:
            r25 = r19
            r14 = r23
            r19 = r36
        L_0x00c6:
            r23 = r5
            goto L_0x01bb
        L_0x00ca:
            r1 = 2
            if (r5 == r1) goto L_0x00ef
            if (r48 != 0) goto L_0x00ef
            r1 = 1
            if (r12 == r1) goto L_0x00d4
            if (r12 != 0) goto L_0x00ef
        L_0x00d4:
            int r1 = java.lang.Math.max(r3, r2)
            if (r4 <= 0) goto L_0x00de
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00de:
            r2 = 8
            r10.mo23699e(r8, r9, r1, r2)
            r19 = r36
            r24 = r3
            r1 = r4
            r15 = r7
            r2 = r8
            r14 = r23
            r25 = 0
            goto L_0x00c6
        L_0x00ef:
            r1 = -2
            if (r3 != r1) goto L_0x00f4
            r14 = r2
            goto L_0x00f5
        L_0x00f4:
            r14 = r3
        L_0x00f5:
            if (r4 != r1) goto L_0x00f9
            r1 = r2
            goto L_0x00fa
        L_0x00f9:
            r1 = r4
        L_0x00fa:
            if (r2 <= 0) goto L_0x0100
            r3 = 1
            if (r12 == r3) goto L_0x0100
            r2 = 0
        L_0x0100:
            if (r14 <= 0) goto L_0x010b
            r3 = 8
            r10.mo23702h(r8, r9, r14, r3)
            int r2 = java.lang.Math.max(r2, r14)
        L_0x010b:
            if (r1 <= 0) goto L_0x0124
            if (r34 == 0) goto L_0x0114
            r3 = 1
            if (r12 != r3) goto L_0x0114
            r3 = 0
            goto L_0x0115
        L_0x0114:
            r3 = 1
        L_0x0115:
            if (r3 == 0) goto L_0x011d
            r3 = 8
            r10.mo23704j(r8, r9, r1, r3)
            goto L_0x011f
        L_0x011d:
            r3 = 8
        L_0x011f:
            int r2 = java.lang.Math.min(r2, r1)
            goto L_0x0126
        L_0x0124:
            r3 = 8
        L_0x0126:
            r4 = 1
            if (r12 != r4) goto L_0x0146
            if (r34 == 0) goto L_0x012f
            r10.mo23699e(r8, r9, r2, r3)
            goto L_0x0140
        L_0x012f:
            if (r49 == 0) goto L_0x0139
            r4 = 5
            r10.mo23699e(r8, r9, r2, r4)
            r10.mo23704j(r8, r9, r2, r3)
            goto L_0x0140
        L_0x0139:
            r4 = 5
            r10.mo23699e(r8, r9, r2, r4)
            r10.mo23704j(r8, r9, r2, r3)
        L_0x0140:
            r15 = r7
            r2 = r8
            r24 = r14
            goto L_0x00c0
        L_0x0146:
            r2 = 2
            if (r12 != r2) goto L_0x01ad
            w.d$b r3 = r41.mo23773h()
            w.d$b r4 = p165w.C6243d.C6245b.TOP
            if (r3 == r4) goto L_0x0173
            w.d$b r3 = r41.mo23773h()
            w.d$b r6 = p165w.C6243d.C6245b.BOTTOM
            if (r3 != r6) goto L_0x015a
            goto L_0x0173
        L_0x015a:
            w.e r3 = r0.f25748P
            w.d$b r4 = p165w.C6243d.C6245b.LEFT
            w.d r3 = r3.mo23835n(r4)
            v.i r3 = r10.mo23709q(r3)
            w.e r4 = r0.f25748P
            w.d$b r6 = p165w.C6243d.C6245b.RIGHT
            w.d r4 = r4.mo23835n(r6)
            v.i r4 = r10.mo23709q(r4)
            goto L_0x0189
        L_0x0173:
            w.e r3 = r0.f25748P
            w.d r3 = r3.mo23835n(r4)
            v.i r3 = r10.mo23709q(r3)
            w.e r4 = r0.f25748P
            w.d$b r6 = p165w.C6243d.C6245b.BOTTOM
            w.d r4 = r4.mo23835n(r6)
            v.i r4 = r10.mo23709q(r4)
        L_0x0189:
            r19 = r3
            r6 = r4
            v.b r3 = r32.mo23710r()
            r4 = r8
            r2 = r5
            r5 = r9
            r40 = r14
            r14 = r23
            r15 = r7
            r7 = r19
            r23 = r2
            r2 = r8
            r8 = r56
            v.b r3 = r3.mo23679k(r4, r5, r6, r7, r8)
            r10.mo23698d(r3)
            r19 = r36
            r24 = r40
            r25 = 0
            goto L_0x01bb
        L_0x01ad:
            r15 = r7
            r2 = r8
            r40 = r14
            r14 = r23
            r23 = r5
            r24 = r40
            r25 = r19
            r19 = 1
        L_0x01bb:
            if (r57 == 0) goto L_0x040b
            if (r49 == 0) goto L_0x01cd
            r3 = r38
            r5 = r2
            r4 = r9
            r1 = r11
            r6 = r23
            r2 = 8
            r7 = 2
            r22 = 1
            goto L_0x0417
        L_0x01cd:
            if (r16 != 0) goto L_0x01d5
            if (r17 != 0) goto L_0x01d5
            if (r18 != 0) goto L_0x01d5
            goto L_0x03ef
        L_0x01d5:
            if (r16 == 0) goto L_0x01db
            if (r17 != 0) goto L_0x01db
            goto L_0x03ef
        L_0x01db:
            if (r16 != 0) goto L_0x01f2
            if (r17 == 0) goto L_0x01f2
            int r1 = r42.mo23768c()
            int r1 = -r1
            r3 = 8
            r10.mo23699e(r2, r14, r1, r3)
            if (r34 == 0) goto L_0x03ef
            r1 = 5
            r6 = 0
            r10.mo23702h(r9, r11, r6, r1)
            goto L_0x03ef
        L_0x01f2:
            r3 = 8
            r6 = 0
            if (r16 == 0) goto L_0x03ef
            if (r17 == 0) goto L_0x03ef
            w.d r4 = r13.f25712d
            w.e r8 = r4.f25710b
            r5 = r42
            r7 = 8
            w.d r3 = r5.f25712d
            w.e r4 = r3.f25710b
            w.e r3 = r31.mo23795H()
            r16 = 6
            if (r25 == 0) goto L_0x02bf
            if (r12 != 0) goto L_0x0242
            if (r1 != 0) goto L_0x021c
            if (r24 != 0) goto L_0x021c
            r1 = 8
            r17 = 8
            r18 = 0
            r20 = 1
            goto L_0x0223
        L_0x021c:
            r1 = 5
            r17 = 5
            r18 = 1
            r20 = 0
        L_0x0223:
            boolean r6 = r8 instanceof p165w.C6240a
            if (r6 != 0) goto L_0x0237
            boolean r6 = r4 instanceof p165w.C6240a
            if (r6 == 0) goto L_0x022c
            goto L_0x0237
        L_0x022c:
            r23 = r1
            r21 = r18
            r1 = 6
            r6 = 0
            r7 = 1
            r18 = r17
            goto L_0x02ca
        L_0x0237:
            r23 = r1
            r21 = r18
            r1 = 6
            r6 = 0
            r7 = 1
            r18 = 4
            goto L_0x02ca
        L_0x0242:
            r6 = 1
            if (r12 != r6) goto L_0x0252
            r1 = 6
            r6 = 1
            r7 = 1
            r18 = 4
            r20 = 0
        L_0x024c:
            r21 = 1
            r23 = 8
            goto L_0x02ca
        L_0x0252:
            r6 = 3
            if (r12 != r6) goto L_0x02b5
            int r6 = r0.f25803w
            r7 = -1
            if (r6 != r7) goto L_0x026b
            if (r50 == 0) goto L_0x0262
            if (r34 == 0) goto L_0x0260
            r1 = 5
            goto L_0x0264
        L_0x0260:
            r1 = 4
            goto L_0x0264
        L_0x0262:
            r1 = 8
        L_0x0264:
            r6 = 1
            r7 = 1
            r18 = 5
            r20 = 1
            goto L_0x024c
        L_0x026b:
            if (r48 == 0) goto L_0x028d
            r6 = r53
            r7 = 2
            if (r6 == r7) goto L_0x0278
            r7 = 1
            if (r6 != r7) goto L_0x0276
            goto L_0x0279
        L_0x0276:
            r6 = 0
            goto L_0x027a
        L_0x0278:
            r7 = 1
        L_0x0279:
            r6 = 1
        L_0x027a:
            if (r6 != 0) goto L_0x0280
            r1 = 8
            r6 = 5
            goto L_0x0282
        L_0x0280:
            r1 = 5
            r6 = 4
        L_0x0282:
            r23 = r1
            r18 = r6
            r1 = 6
            r6 = 1
        L_0x0288:
            r20 = 1
            r21 = 1
            goto L_0x02ca
        L_0x028d:
            r7 = 1
            if (r1 <= 0) goto L_0x0295
            r1 = 6
            r6 = 1
            r18 = 5
            goto L_0x02b2
        L_0x0295:
            if (r1 != 0) goto L_0x02ae
            if (r24 != 0) goto L_0x02ae
            if (r50 != 0) goto L_0x02a0
            r1 = 6
            r6 = 1
            r18 = 8
            goto L_0x02b2
        L_0x02a0:
            if (r8 == r3) goto L_0x02a6
            if (r4 == r3) goto L_0x02a6
            r1 = 4
            goto L_0x02a7
        L_0x02a6:
            r1 = 5
        L_0x02a7:
            r23 = r1
            r1 = 6
            r6 = 1
            r18 = 4
            goto L_0x0288
        L_0x02ae:
            r1 = 6
            r6 = 1
            r18 = 4
        L_0x02b2:
            r20 = 1
            goto L_0x02c6
        L_0x02b5:
            r7 = 1
            r1 = 6
            r6 = 0
            r18 = 4
            r20 = 0
            r21 = 0
            goto L_0x02c8
        L_0x02bf:
            r7 = 1
            r1 = 6
            r6 = 1
            r18 = 4
            r20 = 0
        L_0x02c6:
            r21 = 1
        L_0x02c8:
            r23 = 5
        L_0x02ca:
            if (r6 == 0) goto L_0x02d5
            if (r15 != r14) goto L_0x02d5
            if (r8 == r3) goto L_0x02d5
            r26 = 0
            r27 = 0
            goto L_0x02d9
        L_0x02d5:
            r26 = r6
            r27 = 1
        L_0x02d9:
            if (r21 == 0) goto L_0x0312
            int r6 = r0.f25774h0
            r7 = 8
            if (r6 != r7) goto L_0x02e4
            r17 = 4
            goto L_0x02e6
        L_0x02e4:
            r17 = r1
        L_0x02e6:
            int r6 = r41.mo23768c()
            int r28 = r42.mo23768c()
            r1 = r32
            r36 = r2
            r13 = 0
            r21 = 4
            r22 = 1
            r2 = r9
            r13 = r3
            r3 = r15
            r52 = r12
            r12 = r4
            r4 = r6
            r6 = r5
            r5 = r47
            r6 = r14
            r11 = 8
            r7 = r36
            r29 = r8
            r8 = r28
            r30 = r9
            r9 = r17
            r1.mo23697c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0322
        L_0x0312:
            r36 = r2
            r13 = r3
            r29 = r8
            r30 = r9
            r52 = r12
            r11 = 8
            r21 = 4
            r22 = 1
            r12 = r4
        L_0x0322:
            int r1 = r0.f25774h0
            if (r1 != r11) goto L_0x0327
            return
        L_0x0327:
            if (r26 == 0) goto L_0x0355
            if (r34 == 0) goto L_0x033b
            if (r15 == r14) goto L_0x033b
            if (r25 != 0) goto L_0x033b
            r1 = r29
            boolean r2 = r1 instanceof p165w.C6240a
            if (r2 != 0) goto L_0x0339
            boolean r2 = r12 instanceof p165w.C6240a
            if (r2 == 0) goto L_0x033d
        L_0x0339:
            r2 = 6
            goto L_0x033f
        L_0x033b:
            r1 = r29
        L_0x033d:
            r2 = r23
        L_0x033f:
            int r3 = r41.mo23768c()
            r4 = r30
            r10.mo23702h(r4, r15, r3, r2)
            int r3 = r42.mo23768c()
            int r3 = -r3
            r5 = r36
            r10.mo23704j(r5, r14, r3, r2)
            r23 = r2
            goto L_0x035b
        L_0x0355:
            r5 = r36
            r1 = r29
            r4 = r30
        L_0x035b:
            if (r34 == 0) goto L_0x036b
            if (r51 == 0) goto L_0x036b
            boolean r2 = r1 instanceof p165w.C6240a
            if (r2 != 0) goto L_0x036b
            boolean r2 = r12 instanceof p165w.C6240a
            if (r2 != 0) goto L_0x036b
            r2 = 1
            r3 = 6
            r6 = 6
            goto L_0x0371
        L_0x036b:
            r3 = r18
            r6 = r23
            r2 = r27
        L_0x0371:
            if (r2 == 0) goto L_0x03be
            if (r20 == 0) goto L_0x039f
            if (r50 == 0) goto L_0x0379
            if (r35 == 0) goto L_0x039f
        L_0x0379:
            if (r1 == r13) goto L_0x0380
            if (r12 != r13) goto L_0x037e
            goto L_0x0380
        L_0x037e:
            r16 = r3
        L_0x0380:
            boolean r2 = r1 instanceof p165w.C6252h
            if (r2 != 0) goto L_0x0388
            boolean r2 = r12 instanceof p165w.C6252h
            if (r2 == 0) goto L_0x038a
        L_0x0388:
            r16 = 5
        L_0x038a:
            boolean r2 = r1 instanceof p165w.C6240a
            if (r2 != 0) goto L_0x0392
            boolean r2 = r12 instanceof p165w.C6240a
            if (r2 == 0) goto L_0x0394
        L_0x0392:
            r16 = 5
        L_0x0394:
            if (r50 == 0) goto L_0x0398
            r2 = 5
            goto L_0x039a
        L_0x0398:
            r2 = r16
        L_0x039a:
            int r2 = java.lang.Math.max(r2, r3)
            goto L_0x03a0
        L_0x039f:
            r2 = r3
        L_0x03a0:
            if (r34 == 0) goto L_0x03af
            int r2 = java.lang.Math.min(r6, r2)
            if (r48 == 0) goto L_0x03af
            if (r50 != 0) goto L_0x03af
            if (r1 == r13) goto L_0x03ae
            if (r12 != r13) goto L_0x03af
        L_0x03ae:
            r2 = 4
        L_0x03af:
            int r1 = r41.mo23768c()
            r10.mo23699e(r4, r15, r1, r2)
            int r1 = r42.mo23768c()
            int r1 = -r1
            r10.mo23699e(r5, r14, r1, r2)
        L_0x03be:
            if (r34 == 0) goto L_0x03d3
            r1 = r37
            r2 = 8
            if (r1 != r15) goto L_0x03cb
            int r3 = r41.mo23768c()
            goto L_0x03cc
        L_0x03cb:
            r3 = 0
        L_0x03cc:
            if (r15 == r1) goto L_0x03d5
            r6 = 5
            r10.mo23702h(r4, r1, r3, r6)
            goto L_0x03d5
        L_0x03d3:
            r2 = 8
        L_0x03d5:
            if (r34 == 0) goto L_0x03f0
            if (r25 == 0) goto L_0x03f0
            if (r45 != 0) goto L_0x03f0
            if (r24 != 0) goto L_0x03f0
            if (r25 == 0) goto L_0x03e9
            r12 = r52
            r1 = 3
            if (r12 != r1) goto L_0x03e9
            r1 = 0
            r10.mo23702h(r5, r4, r1, r2)
            goto L_0x03f0
        L_0x03e9:
            r1 = 0
            r2 = 5
            r10.mo23702h(r5, r4, r1, r2)
            goto L_0x03f0
        L_0x03ef:
            r5 = r2
        L_0x03f0:
            if (r34 == 0) goto L_0x040a
            if (r19 == 0) goto L_0x040a
            r1 = r42
            w.d r2 = r1.f25712d
            if (r2 == 0) goto L_0x0401
            int r2 = r42.mo23768c()
            r3 = r38
            goto L_0x0404
        L_0x0401:
            r3 = r38
            r2 = 0
        L_0x0404:
            if (r14 == r3) goto L_0x040a
            r1 = 5
            r10.mo23702h(r3, r5, r2, r1)
        L_0x040a:
            return
        L_0x040b:
            r3 = r38
            r5 = r2
            r4 = r9
            r1 = r11
            r2 = 8
            r7 = 2
            r22 = 1
            r6 = r23
        L_0x0417:
            if (r6 >= r7) goto L_0x0457
            if (r34 == 0) goto L_0x0457
            if (r19 == 0) goto L_0x0457
            r6 = 0
            r10.mo23702h(r4, r1, r6, r2)
            if (r33 != 0) goto L_0x042c
            w.d r1 = r0.f25740H
            w.d r1 = r1.f25712d
            if (r1 != 0) goto L_0x042a
            goto L_0x042c
        L_0x042a:
            r1 = 0
            goto L_0x042d
        L_0x042c:
            r1 = 1
        L_0x042d:
            if (r33 != 0) goto L_0x044f
            w.d r4 = r0.f25740H
            w.d r4 = r4.f25712d
            if (r4 == 0) goto L_0x044f
            w.e r1 = r4.f25710b
            float r4 = r1.f25751S
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x044c
            w.e$b[] r1 = r1.f25747O
            r4 = 0
            r6 = r1[r4]
            w.e$b r4 = p165w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r6 != r4) goto L_0x044c
            r1 = r1[r22]
            if (r1 != r4) goto L_0x044c
            goto L_0x0451
        L_0x044c:
            r22 = 0
            goto L_0x0451
        L_0x044f:
            r22 = r1
        L_0x0451:
            if (r22 == 0) goto L_0x0457
            r1 = 0
            r10.mo23702h(r3, r5, r1, r2)
        L_0x0457:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165w.C6246e.m27365h(v.d, boolean, boolean, boolean, boolean, v.i, v.i, w.e$b, boolean, w.d, w.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int mo23781A() {
        C6243d dVar = this.f25734D;
        int i = 0;
        if (dVar != null) {
            i = 0 + dVar.f25713e;
        }
        C6243d dVar2 = this.f25738F;
        return dVar2 != null ? i + dVar2.f25713e : i;
    }

    /* renamed from: A0 */
    public void mo23782A0(int i, int i2) {
        this.f25754V = i;
        int i3 = i2 - i;
        this.f25750R = i3;
        int i4 = this.f25764c0;
        if (i3 < i4) {
            this.f25750R = i4;
        }
    }

    /* renamed from: B */
    public int mo23783B(int i) {
        if (i == 0) {
            return mo23808Q();
        }
        if (i == 1) {
            return mo23853w();
        }
        return 0;
    }

    /* renamed from: B0 */
    public void mo23784B0(C6248b bVar) {
        this.f25747O[1] = bVar;
    }

    /* renamed from: C */
    public int mo23785C() {
        return this.f25807y[1];
    }

    /* renamed from: C0 */
    public void mo23786C0(int i, int i2, int i3, float f) {
        this.f25783m = i;
        this.f25793r = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f25795s = i3;
        this.f25797t = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f25783m = 2;
        }
    }

    /* renamed from: D */
    public int mo23787D() {
        return this.f25807y[0];
    }

    /* renamed from: D0 */
    public void mo23788D0(float f) {
        this.f25729A0[1] = f;
    }

    /* renamed from: E */
    public int mo23789E() {
        return this.f25764c0;
    }

    /* renamed from: E0 */
    public void mo23790E0(int i) {
        this.f25774h0 = i;
    }

    /* renamed from: F */
    public int mo23791F() {
        return this.f25762b0;
    }

    /* renamed from: F0 */
    public void mo23792F0(int i) {
        this.f25749Q = i;
        int i2 = this.f25762b0;
        if (i < i2) {
            this.f25749Q = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f25739G;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p165w.C6246e mo23793G(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            w.d r3 = r2.f25738F
            w.d r0 = r3.f25712d
            if (r0 == 0) goto L_0x001f
            w.d r1 = r0.f25712d
            if (r1 != r3) goto L_0x001f
            w.e r3 = r0.f25710b
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            w.d r3 = r2.f25739G
            w.d r0 = r3.f25712d
            if (r0 == 0) goto L_0x001f
            w.d r1 = r0.f25712d
            if (r1 != r3) goto L_0x001f
            w.e r3 = r0.f25710b
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p165w.C6246e.mo23793G(int):w.e");
    }

    /* renamed from: G0 */
    public void mo23794G0(int i) {
        this.f25753U = i;
    }

    /* renamed from: H */
    public C6246e mo23795H() {
        return this.f25748P;
    }

    /* renamed from: H0 */
    public void mo23796H0(int i) {
        this.f25754V = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f25736E;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p165w.C6246e mo23797I(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            w.d r3 = r2.f25734D
            w.d r0 = r3.f25712d
            if (r0 == 0) goto L_0x001f
            w.d r1 = r0.f25712d
            if (r1 != r3) goto L_0x001f
            w.e r3 = r0.f25710b
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            w.d r3 = r2.f25736E
            w.d r0 = r3.f25712d
            if (r0 == 0) goto L_0x001f
            w.d r1 = r0.f25712d
            if (r1 != r3) goto L_0x001f
            w.e r3 = r0.f25710b
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p165w.C6246e.mo23797I(int):w.e");
    }

    /* renamed from: I0 */
    public void mo23798I0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f25803w == -1) {
            if (z3 && !z4) {
                this.f25803w = 0;
            } else if (!z3 && z4) {
                this.f25803w = 1;
                if (this.f25752T == -1) {
                    this.f25805x = 1.0f / this.f25805x;
                }
            }
        }
        if (this.f25803w == 0 && (!this.f25736E.mo23775j() || !this.f25739G.mo23775j())) {
            this.f25803w = 1;
        } else if (this.f25803w == 1 && (!this.f25734D.mo23775j() || !this.f25738F.mo23775j())) {
            this.f25803w = 0;
        }
        if (this.f25803w == -1 && (!this.f25736E.mo23775j() || !this.f25739G.mo23775j() || !this.f25734D.mo23775j() || !this.f25738F.mo23775j())) {
            if (this.f25736E.mo23775j() && this.f25739G.mo23775j()) {
                this.f25803w = 0;
            } else if (this.f25734D.mo23775j() && this.f25738F.mo23775j()) {
                this.f25805x = 1.0f / this.f25805x;
                this.f25803w = 1;
            }
        }
        if (this.f25803w == -1) {
            int i = this.f25787o;
            if (i > 0 && this.f25793r == 0) {
                this.f25803w = 0;
            } else if (i == 0 && this.f25793r > 0) {
                this.f25805x = 1.0f / this.f25805x;
                this.f25803w = 1;
            }
        }
    }

    /* renamed from: J */
    public int mo23799J() {
        return mo23809R() + this.f25749Q;
    }

    /* renamed from: J0 */
    public void mo23800J0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.f25767e.mo24112k();
        boolean k2 = z2 & this.f25769f.mo24112k();
        C6328j jVar = this.f25767e;
        int i3 = jVar.f26144h.f26108g;
        C6331l lVar = this.f25769f;
        int i4 = lVar.f26144h.f26108g;
        int i5 = jVar.f26145i.f26108g;
        int i6 = lVar.f26145i.f26108g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.f25753U = i3;
        }
        if (k2) {
            this.f25754V = i4;
        }
        if (this.f25774h0 == 8) {
            this.f25749Q = 0;
            this.f25750R = 0;
            return;
        }
        if (k) {
            if (this.f25747O[0] == C6248b.FIXED && i8 < (i2 = this.f25749Q)) {
                i8 = i2;
            }
            this.f25749Q = i8;
            int i10 = this.f25762b0;
            if (i8 < i10) {
                this.f25749Q = i10;
            }
        }
        if (k2) {
            if (this.f25747O[1] == C6248b.FIXED && i9 < (i = this.f25750R)) {
                i9 = i;
            }
            this.f25750R = i9;
            int i11 = this.f25764c0;
            if (i9 < i11) {
                this.f25750R = i11;
            }
        }
    }

    /* renamed from: K */
    public C6333m mo23801K(int i) {
        if (i == 0) {
            return this.f25767e;
        }
        if (i == 1) {
            return this.f25769f;
        }
        return null;
    }

    /* renamed from: K0 */
    public void mo23802K0(C6213d dVar) {
        int x = dVar.mo23713x(this.f25734D);
        int x2 = dVar.mo23713x(this.f25736E);
        int x3 = dVar.mo23713x(this.f25738F);
        int x4 = dVar.mo23713x(this.f25739G);
        C6328j jVar = this.f25767e;
        C6323f fVar = jVar.f26144h;
        if (fVar.f26111j) {
            C6323f fVar2 = jVar.f26145i;
            if (fVar2.f26111j) {
                x = fVar.f26108g;
                x3 = fVar2.f26108g;
            }
        }
        C6331l lVar = this.f25769f;
        C6323f fVar3 = lVar.f26144h;
        if (fVar3.f26111j) {
            C6323f fVar4 = lVar.f26145i;
            if (fVar4.f26111j) {
                x2 = fVar3.f26108g;
                x4 = fVar4.f26108g;
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        mo23824g0(x, x2, x3, x4);
    }

    /* renamed from: L */
    public float mo23803L() {
        return this.f25768e0;
    }

    /* renamed from: M */
    public int mo23804M() {
        return this.f25806x0;
    }

    /* renamed from: N */
    public C6248b mo23805N() {
        return this.f25747O[1];
    }

    /* renamed from: O */
    public int mo23806O() {
        int i = 0;
        if (this.f25734D != null) {
            i = 0 + this.f25736E.f25713e;
        }
        return this.f25738F != null ? i + this.f25739G.f25713e : i;
    }

    /* renamed from: P */
    public int mo23807P() {
        return this.f25774h0;
    }

    /* renamed from: Q */
    public int mo23808Q() {
        if (this.f25774h0 == 8) {
            return 0;
        }
        return this.f25749Q;
    }

    /* renamed from: R */
    public int mo23809R() {
        C6246e eVar = this.f25748P;
        if (eVar == null || !(eVar instanceof C6249f)) {
            return this.f25753U;
        }
        return ((C6249f) eVar).f25823M0 + this.f25753U;
    }

    /* renamed from: S */
    public int mo23810S() {
        C6246e eVar = this.f25748P;
        if (eVar == null || !(eVar instanceof C6249f)) {
            return this.f25754V;
        }
        return ((C6249f) eVar).f25824N0 + this.f25754V;
    }

    /* renamed from: T */
    public boolean mo23811T() {
        return this.f25728A;
    }

    /* renamed from: U */
    public void mo23812U(C6243d.C6245b bVar, C6246e eVar, C6243d.C6245b bVar2, int i, int i2) {
        mo23835n(bVar).mo23767b(eVar.mo23835n(bVar2), i, i2, true);
    }

    /* renamed from: W */
    public boolean mo23813W() {
        C6243d dVar = this.f25734D;
        C6243d dVar2 = dVar.f25712d;
        if (dVar2 != null && dVar2.f25712d == dVar) {
            return true;
        }
        C6243d dVar3 = this.f25738F;
        C6243d dVar4 = dVar3.f25712d;
        return dVar4 != null && dVar4.f25712d == dVar3;
    }

    /* renamed from: X */
    public boolean mo23814X() {
        return this.f25730B;
    }

    /* renamed from: Y */
    public boolean mo23815Y() {
        C6243d dVar = this.f25736E;
        C6243d dVar2 = dVar.f25712d;
        if (dVar2 != null && dVar2.f25712d == dVar) {
            return true;
        }
        C6243d dVar3 = this.f25739G;
        C6243d dVar4 = dVar3.f25712d;
        return dVar4 != null && dVar4.f25712d == dVar3;
    }

    /* renamed from: Z */
    public void mo23816Z() {
        this.f25734D.mo23777l();
        this.f25736E.mo23777l();
        this.f25738F.mo23777l();
        this.f25739G.mo23777l();
        this.f25740H.mo23777l();
        this.f25741I.mo23777l();
        this.f25742J.mo23777l();
        this.f25743K.mo23777l();
        this.f25748P = null;
        this.f25809z = 0.0f;
        this.f25749Q = 0;
        this.f25750R = 0;
        this.f25751S = 0.0f;
        this.f25752T = -1;
        this.f25753U = 0;
        this.f25754V = 0;
        this.f25757Y = 0;
        this.f25758Z = 0;
        this.f25760a0 = 0;
        this.f25762b0 = 0;
        this.f25764c0 = 0;
        float f = f25727F0;
        this.f25766d0 = f;
        this.f25768e0 = f;
        C6248b[] bVarArr = this.f25747O;
        C6248b bVar = C6248b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f25770f0 = null;
        this.f25772g0 = 0;
        this.f25774h0 = 0;
        this.f25778j0 = null;
        this.f25796s0 = false;
        this.f25798t0 = false;
        this.f25804w0 = 0;
        this.f25806x0 = 0;
        this.f25808y0 = false;
        this.f25810z0 = false;
        float[] fArr = this.f25729A0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f25777j = -1;
        this.f25779k = -1;
        int[] iArr = this.f25807y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f25781l = 0;
        this.f25783m = 0;
        this.f25791q = 1.0f;
        this.f25797t = 1.0f;
        this.f25789p = Integer.MAX_VALUE;
        this.f25795s = Integer.MAX_VALUE;
        this.f25787o = 0;
        this.f25793r = 0;
        this.f25775i = false;
        this.f25803w = -1;
        this.f25805x = 1.0f;
        this.f25800u0 = false;
        this.f25802v0 = false;
        boolean[] zArr = this.f25771g;
        zArr[0] = true;
        zArr[1] = true;
        this.f25732C = false;
        boolean[] zArr2 = this.f25746N;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    /* renamed from: a0 */
    public void mo23817a0() {
        C6246e H = mo23795H();
        if (H == null || !(H instanceof C6249f) || !((C6249f) mo23795H()).mo23869Y0()) {
            int size = this.f25745M.size();
            for (int i = 0; i < size; i++) {
                this.f25745M.get(i).mo23777l();
            }
        }
    }

    /* renamed from: b0 */
    public void mo23818b0(C6212c cVar) {
        this.f25734D.mo23778m(cVar);
        this.f25736E.mo23778m(cVar);
        this.f25738F.mo23778m(cVar);
        this.f25739G.mo23778m(cVar);
        this.f25740H.mo23778m(cVar);
        this.f25743K.mo23778m(cVar);
        this.f25741I.mo23778m(cVar);
        this.f25742J.mo23778m(cVar);
    }

    /* renamed from: c0 */
    public void mo23819c0(int i) {
        this.f25760a0 = i;
        this.f25728A = i > 0;
    }

    /* renamed from: d0 */
    public void mo23820d0(Object obj) {
        this.f25770f0 = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo23821e() {
        return (this instanceof C6257l) || (this instanceof C6252h);
    }

    /* renamed from: e0 */
    public void mo23822e0(String str) {
        this.f25776i0 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23761f(p160v.C6213d r48) {
        /*
            r47 = this;
            r13 = r47
            r9 = r48
            w.d r0 = r13.f25734D
            v.i r7 = r9.mo23709q(r0)
            w.d r0 = r13.f25738F
            v.i r6 = r9.mo23709q(r0)
            w.d r0 = r13.f25736E
            v.i r4 = r9.mo23709q(r0)
            w.d r0 = r13.f25739G
            v.i r3 = r9.mo23709q(r0)
            w.d r0 = r13.f25740H
            v.i r1 = r9.mo23709q(r0)
            v.e r0 = p160v.C6213d.f25594r
            x.j r0 = r13.f25767e
            x.f r2 = r0.f26144h
            boolean r5 = r2.f26111j
            r15 = 8
            r14 = 1
            r12 = 0
            if (r5 == 0) goto L_0x00be
            x.f r0 = r0.f26145i
            boolean r0 = r0.f26111j
            if (r0 == 0) goto L_0x00be
            x.l r0 = r13.f25769f
            x.f r5 = r0.f26144h
            boolean r5 = r5.f26111j
            if (r5 == 0) goto L_0x00be
            x.f r0 = r0.f26145i
            boolean r0 = r0.f26111j
            if (r0 == 0) goto L_0x00be
            int r0 = r2.f26108g
            r9.mo23700f(r7, r0)
            x.j r0 = r13.f25767e
            x.f r0 = r0.f26145i
            int r0 = r0.f26108g
            r9.mo23700f(r6, r0)
            x.l r0 = r13.f25769f
            x.f r0 = r0.f26144h
            int r0 = r0.f26108g
            r9.mo23700f(r4, r0)
            x.l r0 = r13.f25769f
            x.f r0 = r0.f26145i
            int r0 = r0.f26108g
            r9.mo23700f(r3, r0)
            x.l r0 = r13.f25769f
            x.f r0 = r0.f26134k
            int r0 = r0.f26108g
            r9.mo23700f(r1, r0)
            w.e r0 = r13.f25748P
            if (r0 == 0) goto L_0x00bd
            if (r0 == 0) goto L_0x007d
            w.e$b[] r1 = r0.f25747O
            r1 = r1[r12]
            w.e$b r2 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r1 != r2) goto L_0x007d
            r1 = 1
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x008a
            w.e$b[] r0 = r0.f25747O
            r0 = r0[r14]
            w.e$b r2 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r0 != r2) goto L_0x008a
            r0 = 1
            goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            if (r1 == 0) goto L_0x00a4
            boolean[] r1 = r13.f25771g
            boolean r1 = r1[r12]
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r47.mo23813W()
            if (r1 != 0) goto L_0x00a4
            w.e r1 = r13.f25748P
            w.d r1 = r1.f25738F
            v.i r1 = r9.mo23709q(r1)
            r9.mo23702h(r1, r6, r12, r15)
        L_0x00a4:
            if (r0 == 0) goto L_0x00bd
            boolean[] r0 = r13.f25771g
            boolean r0 = r0[r14]
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r47.mo23815Y()
            if (r0 != 0) goto L_0x00bd
            w.e r0 = r13.f25748P
            w.d r0 = r0.f25739G
            v.i r0 = r9.mo23709q(r0)
            r9.mo23702h(r0, r3, r12, r15)
        L_0x00bd:
            return
        L_0x00be:
            w.e r0 = r13.f25748P
            if (r0 == 0) goto L_0x014a
            if (r0 == 0) goto L_0x00ce
            w.e$b[] r2 = r0.f25747O
            r2 = r2[r12]
            w.e$b r5 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r2 != r5) goto L_0x00ce
            r2 = 1
            goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            if (r0 == 0) goto L_0x00db
            w.e$b[] r0 = r0.f25747O
            r0 = r0[r14]
            w.e$b r5 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r0 != r5) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            boolean r5 = r13.m27363V(r12)
            if (r5 == 0) goto L_0x00eb
            w.e r5 = r13.f25748P
            w.f r5 = (p165w.C6249f) r5
            r5.mo23862P0(r13, r12)
            r5 = 1
            goto L_0x00ef
        L_0x00eb:
            boolean r5 = r47.mo23813W()
        L_0x00ef:
            boolean r8 = r13.m27363V(r14)
            if (r8 == 0) goto L_0x00fe
            w.e r8 = r13.f25748P
            w.f r8 = (p165w.C6249f) r8
            r8.mo23862P0(r13, r14)
            r8 = 1
            goto L_0x0102
        L_0x00fe:
            boolean r8 = r47.mo23815Y()
        L_0x0102:
            if (r5 != 0) goto L_0x0121
            if (r2 == 0) goto L_0x0121
            int r10 = r13.f25774h0
            if (r10 == r15) goto L_0x0121
            w.d r10 = r13.f25734D
            w.d r10 = r10.f25712d
            if (r10 != 0) goto L_0x0121
            w.d r10 = r13.f25738F
            w.d r10 = r10.f25712d
            if (r10 != 0) goto L_0x0121
            w.e r10 = r13.f25748P
            w.d r10 = r10.f25738F
            v.i r10 = r9.mo23709q(r10)
            r9.mo23702h(r10, r6, r12, r14)
        L_0x0121:
            if (r8 != 0) goto L_0x0144
            if (r0 == 0) goto L_0x0144
            int r10 = r13.f25774h0
            if (r10 == r15) goto L_0x0144
            w.d r10 = r13.f25736E
            w.d r10 = r10.f25712d
            if (r10 != 0) goto L_0x0144
            w.d r10 = r13.f25739G
            w.d r10 = r10.f25712d
            if (r10 != 0) goto L_0x0144
            w.d r10 = r13.f25740H
            if (r10 != 0) goto L_0x0144
            w.e r10 = r13.f25748P
            w.d r10 = r10.f25739G
            v.i r10 = r9.mo23709q(r10)
            r9.mo23702h(r10, r3, r12, r14)
        L_0x0144:
            r11 = r2
            r28 = r5
            r27 = r8
            goto L_0x0150
        L_0x014a:
            r0 = 0
            r11 = 0
            r27 = 0
            r28 = 0
        L_0x0150:
            int r2 = r13.f25749Q
            int r5 = r13.f25762b0
            if (r2 >= r5) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r5 = r2
        L_0x0158:
            int r8 = r13.f25750R
            int r10 = r13.f25764c0
            if (r8 >= r10) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r10 = r8
        L_0x0160:
            w.e$b[] r15 = r13.f25747O
            r14 = r15[r12]
            w.e$b r12 = p165w.C6246e.C6248b.MATCH_CONSTRAINT
            r19 = r1
            if (r14 == r12) goto L_0x016c
            r14 = 1
            goto L_0x016d
        L_0x016c:
            r14 = 0
        L_0x016d:
            r17 = 1
            r1 = r15[r17]
            r20 = r3
            if (r1 == r12) goto L_0x0177
            r1 = 1
            goto L_0x0178
        L_0x0177:
            r1 = 0
        L_0x0178:
            int r3 = r13.f25752T
            r13.f25803w = r3
            r21 = r4
            float r4 = r13.f25751S
            r13.f25805x = r4
            r22 = r5
            int r5 = r13.f25781l
            r23 = r10
            int r10 = r13.f25783m
            r24 = 0
            r25 = 4
            r26 = r6
            int r24 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x0222
            int r6 = r13.f25774h0
            r30 = r7
            r7 = 8
            if (r6 == r7) goto L_0x0224
            r6 = 0
            r7 = r15[r6]
            if (r7 != r12) goto L_0x01a4
            if (r5 != 0) goto L_0x01a4
            r5 = 3
        L_0x01a4:
            r7 = 1
            r6 = r15[r7]
            if (r6 != r12) goto L_0x01ae
            if (r10 != 0) goto L_0x01ae
            r6 = 0
            r10 = 3
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            r9 = r15[r6]
            if (r9 != r12) goto L_0x01c0
            r6 = r15[r7]
            if (r6 != r12) goto L_0x01c0
            r6 = 3
            if (r5 != r6) goto L_0x01c1
            if (r10 != r6) goto L_0x01c1
            r13.mo23798I0(r11, r0, r14, r1)
            goto L_0x0216
        L_0x01c0:
            r6 = 3
        L_0x01c1:
            r1 = 0
            r7 = r15[r1]
            if (r7 != r12) goto L_0x01e9
            if (r5 != r6) goto L_0x01e9
            r13.f25803w = r1
            float r1 = (float) r8
            float r4 = r4 * r1
            int r1 = (int) r4
            r6 = 1
            r2 = r15[r6]
            if (r2 == r12) goto L_0x01de
            r5 = r1
            r32 = r10
            r31 = r23
            r9 = 0
            r18 = 0
            r33 = 4
            goto L_0x022f
        L_0x01de:
            r33 = r5
            r32 = r10
            r31 = r23
            r9 = 1
            r18 = 0
            r5 = r1
            goto L_0x022f
        L_0x01e9:
            r6 = 1
            r1 = r15[r6]
            if (r1 != r12) goto L_0x0216
            r1 = 3
            if (r10 != r1) goto L_0x0216
            r13.f25803w = r6
            r1 = -1
            if (r3 != r1) goto L_0x01fb
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r4
            r13.f25805x = r1
        L_0x01fb:
            float r1 = r13.f25805x
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            r18 = 0
            r2 = r15[r18]
            r31 = r1
            r33 = r5
            if (r2 == r12) goto L_0x0211
            r5 = r22
            r9 = 0
            r32 = 4
            goto L_0x022f
        L_0x0211:
            r32 = r10
            r5 = r22
            goto L_0x0220
        L_0x0216:
            r18 = 0
            r33 = r5
            r32 = r10
            r5 = r22
            r31 = r23
        L_0x0220:
            r9 = 1
            goto L_0x022f
        L_0x0222:
            r30 = r7
        L_0x0224:
            r18 = 0
            r33 = r5
            r32 = r10
            r5 = r22
            r31 = r23
            r9 = 0
        L_0x022f:
            int[] r1 = r13.f25785n
            r1[r18] = r33
            r2 = 1
            r1[r2] = r32
            r13.f25775i = r9
            if (r9 == 0) goto L_0x0244
            int r1 = r13.f25803w
            r6 = -1
            if (r1 == 0) goto L_0x0241
            if (r1 != r6) goto L_0x0245
        L_0x0241:
            r22 = 1
            goto L_0x0247
        L_0x0244:
            r6 = -1
        L_0x0245:
            r22 = 0
        L_0x0247:
            w.e$b[] r1 = r13.f25747O
            r2 = 0
            r1 = r1[r2]
            w.e$b r7 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r1 != r7) goto L_0x0257
            boolean r1 = r13 instanceof p165w.C6249f
            if (r1 == 0) goto L_0x0257
            r29 = 1
            goto L_0x0259
        L_0x0257:
            r29 = 0
        L_0x0259:
            if (r29 == 0) goto L_0x025e
            r34 = 0
            goto L_0x0260
        L_0x025e:
            r34 = r5
        L_0x0260:
            w.d r1 = r13.f25743K
            boolean r1 = r1.mo23775j()
            r3 = 1
            r35 = r1 ^ 1
            boolean[] r1 = r13.f25746N
            r2 = 0
            boolean r36 = r1[r2]
            boolean r37 = r1[r3]
            int r1 = r13.f25777j
            r4 = 2
            r38 = 0
            if (r1 == r4) goto L_0x0358
            x.j r1 = r13.f25767e
            x.f r2 = r1.f26144h
            boolean r5 = r2.f26111j
            if (r5 == 0) goto L_0x02ce
            x.f r1 = r1.f26145i
            boolean r1 = r1.f26111j
            if (r1 != 0) goto L_0x0286
            goto L_0x02ce
        L_0x0286:
            int r1 = r2.f26108g
            r15 = r48
            r14 = r30
            r15.mo23700f(r14, r1)
            x.j r1 = r13.f25767e
            x.f r1 = r1.f26145i
            int r1 = r1.f26108g
            r12 = r26
            r15.mo23700f(r12, r1)
            w.e r1 = r13.f25748P
            if (r1 == 0) goto L_0x02ba
            if (r11 == 0) goto L_0x02ba
            boolean[] r1 = r13.f25771g
            r2 = 0
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x02ba
            boolean r1 = r47.mo23813W()
            if (r1 != 0) goto L_0x02ba
            w.e r1 = r13.f25748P
            w.d r1 = r1.f25738F
            v.i r1 = r15.mo23709q(r1)
            r10 = 8
            r15.mo23702h(r1, r12, r2, r10)
        L_0x02ba:
            r41 = r0
            r45 = r7
            r46 = r9
            r30 = r11
            r39 = r12
            r40 = r14
            r42 = r19
            r43 = r20
            r44 = r21
            goto L_0x036c
        L_0x02ce:
            r15 = r48
            r12 = r26
            r14 = r30
            r10 = 8
            w.e r1 = r13.f25748P
            if (r1 == 0) goto L_0x02e3
            w.d r1 = r1.f25738F
            v.i r1 = r15.mo23709q(r1)
            r17 = r1
            goto L_0x02e5
        L_0x02e3:
            r17 = r38
        L_0x02e5:
            w.e r1 = r13.f25748P
            if (r1 == 0) goto L_0x02f2
            w.d r1 = r1.f25734D
            v.i r1 = r15.mo23709q(r1)
            r26 = r1
            goto L_0x02f4
        L_0x02f2:
            r26 = r38
        L_0x02f4:
            r2 = 1
            boolean[] r1 = r13.f25771g
            r16 = 0
            boolean r5 = r1[r16]
            w.e$b[] r1 = r13.f25747O
            r8 = r1[r16]
            w.d r1 = r13.f25734D
            r18 = 8
            r10 = r1
            w.d r1 = r13.f25738F
            r30 = r11
            r11 = r1
            int r1 = r13.f25753U
            r39 = r12
            r2 = 0
            r12 = r1
            int r1 = r13.f25762b0
            r40 = r14
            r14 = r1
            int[] r1 = r13.f25807y
            r1 = r1[r2]
            r15 = r1
            float r1 = r13.f25766d0
            r16 = r1
            int r1 = r13.f25787o
            r23 = r1
            int r1 = r13.f25789p
            r24 = r1
            float r1 = r13.f25791q
            r25 = r1
            r41 = r0
            r0 = r47
            r42 = r19
            r1 = r48
            r43 = r20
            r3 = r30
            r44 = r21
            r4 = r41
            r6 = r26
            r45 = r7
            r7 = r17
            r46 = r9
            r9 = r29
            r13 = r34
            r17 = r22
            r18 = r28
            r19 = r27
            r20 = r36
            r21 = r33
            r22 = r32
            r26 = r35
            r2 = 1
            r0.m27365h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x036a
        L_0x0358:
            r41 = r0
            r45 = r7
            r46 = r9
            r42 = r19
            r43 = r20
            r44 = r21
            r39 = r26
            r40 = r30
            r30 = r11
        L_0x036a:
            r13 = r47
        L_0x036c:
            x.l r0 = r13.f25769f
            x.f r1 = r0.f26144h
            boolean r2 = r1.f26111j
            if (r2 == 0) goto L_0x03bf
            x.f r0 = r0.f26145i
            boolean r0 = r0.f26111j
            if (r0 == 0) goto L_0x03bf
            int r0 = r1.f26108g
            r9 = r48
            r7 = r44
            r9.mo23700f(r7, r0)
            x.l r0 = r13.f25769f
            x.f r0 = r0.f26145i
            int r0 = r0.f26108g
            r6 = r43
            r9.mo23700f(r6, r0)
            x.l r0 = r13.f25769f
            x.f r0 = r0.f26134k
            int r0 = r0.f26108g
            r1 = r42
            r9.mo23700f(r1, r0)
            w.e r0 = r13.f25748P
            if (r0 == 0) goto L_0x03b9
            if (r27 != 0) goto L_0x03b9
            if (r41 == 0) goto L_0x03b9
            boolean[] r2 = r13.f25771g
            r4 = 1
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x03b5
            w.d r0 = r0.f25739G
            v.i r0 = r9.mo23709q(r0)
            r2 = 8
            r3 = 0
            r9.mo23702h(r0, r6, r3, r2)
            goto L_0x03bd
        L_0x03b5:
            r2 = 8
            r3 = 0
            goto L_0x03bd
        L_0x03b9:
            r2 = 8
            r3 = 0
            r4 = 1
        L_0x03bd:
            r14 = 0
            goto L_0x03cc
        L_0x03bf:
            r9 = r48
            r1 = r42
            r6 = r43
            r7 = r44
            r2 = 8
            r3 = 0
            r4 = 1
            r14 = 1
        L_0x03cc:
            int r0 = r13.f25779k
            r5 = 2
            if (r0 != r5) goto L_0x03d3
            r12 = 0
            goto L_0x03d4
        L_0x03d3:
            r12 = r14
        L_0x03d4:
            if (r12 == 0) goto L_0x0491
            w.e$b[] r0 = r13.f25747O
            r0 = r0[r4]
            r5 = r45
            if (r0 != r5) goto L_0x03e5
            boolean r0 = r13 instanceof p165w.C6249f
            if (r0 == 0) goto L_0x03e5
            r17 = 1
            goto L_0x03e7
        L_0x03e5:
            r17 = 0
        L_0x03e7:
            if (r17 == 0) goto L_0x03eb
            r31 = 0
        L_0x03eb:
            if (r46 == 0) goto L_0x03f7
            int r0 = r13.f25803w
            if (r0 == r4) goto L_0x03f4
            r5 = -1
            if (r0 != r5) goto L_0x03f7
        L_0x03f4:
            r18 = 1
            goto L_0x03f9
        L_0x03f7:
            r18 = 0
        L_0x03f9:
            w.e r0 = r13.f25748P
            if (r0 == 0) goto L_0x0404
            w.d r0 = r0.f25739G
            v.i r0 = r9.mo23709q(r0)
            goto L_0x0406
        L_0x0404:
            r0 = r38
        L_0x0406:
            w.e r5 = r13.f25748P
            if (r5 == 0) goto L_0x0412
            w.d r5 = r5.f25736E
            v.i r5 = r9.mo23709q(r5)
            r38 = r5
        L_0x0412:
            int r5 = r13.f25760a0
            if (r5 > 0) goto L_0x041a
            int r5 = r13.f25774h0
            if (r5 != r2) goto L_0x0444
        L_0x041a:
            int r5 = r47.mo23837o()
            r9.mo23699e(r1, r7, r5, r2)
            w.d r5 = r13.f25740H
            w.d r5 = r5.f25712d
            if (r5 == 0) goto L_0x043d
            v.i r5 = r9.mo23709q(r5)
            r9.mo23699e(r1, r5, r3, r2)
            if (r41 == 0) goto L_0x043a
            w.d r1 = r13.f25739G
            v.i r1 = r9.mo23709q(r1)
            r2 = 5
            r9.mo23702h(r0, r1, r3, r2)
        L_0x043a:
            r26 = 0
            goto L_0x0446
        L_0x043d:
            int r5 = r13.f25774h0
            if (r5 != r2) goto L_0x0444
            r9.mo23699e(r1, r7, r3, r2)
        L_0x0444:
            r26 = r35
        L_0x0446:
            r2 = 0
            boolean[] r1 = r13.f25771g
            boolean r5 = r1[r4]
            w.e$b[] r1 = r13.f25747O
            r8 = r1[r4]
            w.d r10 = r13.f25736E
            w.d r11 = r13.f25739G
            int r12 = r13.f25754V
            int r14 = r13.f25764c0
            int[] r1 = r13.f25807y
            r15 = r1[r4]
            float r1 = r13.f25768e0
            r16 = r1
            int r1 = r13.f25793r
            r23 = r1
            int r1 = r13.f25795s
            r24 = r1
            float r1 = r13.f25797t
            r25 = r1
            r19 = r0
            r0 = r47
            r1 = r48
            r3 = r41
            r4 = r30
            r29 = r6
            r6 = r38
            r30 = r7
            r7 = r19
            r9 = r17
            r13 = r31
            r17 = r18
            r18 = r27
            r19 = r28
            r20 = r37
            r21 = r32
            r22 = r33
            r0.m27365h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0495
        L_0x0491:
            r29 = r6
            r30 = r7
        L_0x0495:
            if (r46 == 0) goto L_0x04c2
            r6 = 8
            r7 = r47
            int r0 = r7.f25803w
            r1 = 1
            if (r0 != r1) goto L_0x04b0
            float r5 = r7.f25805x
            r0 = r48
            r1 = r29
            r2 = r30
            r3 = r39
            r4 = r40
            r0.mo23705k(r1, r2, r3, r4, r5, r6)
            goto L_0x04c4
        L_0x04b0:
            float r5 = r7.f25805x
            r6 = 8
            r0 = r48
            r1 = r39
            r2 = r40
            r3 = r29
            r4 = r30
            r0.mo23705k(r1, r2, r3, r4, r5, r6)
            goto L_0x04c4
        L_0x04c2:
            r7 = r47
        L_0x04c4:
            w.d r0 = r7.f25743K
            boolean r0 = r0.mo23775j()
            if (r0 == 0) goto L_0x04ec
            w.d r0 = r7.f25743K
            w.d r0 = r0.mo23772g()
            w.e r0 = r0.mo23770e()
            float r1 = r7.f25809z
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            w.d r2 = r7.f25743K
            int r2 = r2.mo23768c()
            r3 = r48
            r3.mo23696b(r7, r0, r1, r2)
        L_0x04ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165w.C6246e.mo23761f(v.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23823f0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f25751S = r9
            r8.f25752T = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f25751S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165w.C6246e.mo23823f0(java.lang.String):void");
    }

    /* renamed from: g */
    public boolean mo23762g() {
        return this.f25774h0 != 8;
    }

    /* renamed from: g0 */
    public void mo23824g0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f25753U = i;
        this.f25754V = i2;
        if (this.f25774h0 == 8) {
            this.f25749Q = 0;
            this.f25750R = 0;
            return;
        }
        C6248b[] bVarArr = this.f25747O;
        C6248b bVar = bVarArr[0];
        C6248b bVar2 = C6248b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.f25749Q)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.f25750R)) {
            i8 = i5;
        }
        this.f25749Q = i7;
        this.f25750R = i8;
        int i9 = this.f25764c0;
        if (i8 < i9) {
            this.f25750R = i9;
        }
        int i10 = this.f25762b0;
        if (i7 < i10) {
            this.f25749Q = i10;
        }
    }

    /* renamed from: h0 */
    public void mo23825h0(boolean z) {
        this.f25728A = z;
    }

    /* renamed from: i */
    public void mo23826i(C6243d.C6245b bVar, C6246e eVar, C6243d.C6245b bVar2, int i) {
        C6243d.C6245b bVar3;
        C6243d.C6245b bVar4;
        boolean z;
        C6243d.C6245b bVar5 = C6243d.C6245b.CENTER;
        if (bVar != bVar5) {
            C6243d.C6245b bVar6 = C6243d.C6245b.CENTER_X;
            if (bVar == bVar6 && (bVar2 == (bVar4 = C6243d.C6245b.LEFT) || bVar2 == C6243d.C6245b.RIGHT)) {
                C6243d n = mo23835n(bVar4);
                C6243d n2 = eVar.mo23835n(bVar2);
                C6243d n3 = mo23835n(C6243d.C6245b.RIGHT);
                n.mo23766a(n2, 0);
                n3.mo23766a(n2, 0);
                mo23835n(bVar6).mo23766a(n2, 0);
                return;
            }
            C6243d.C6245b bVar7 = C6243d.C6245b.CENTER_Y;
            if (bVar == bVar7 && (bVar2 == (bVar3 = C6243d.C6245b.TOP) || bVar2 == C6243d.C6245b.BOTTOM)) {
                C6243d n4 = eVar.mo23835n(bVar2);
                mo23835n(bVar3).mo23766a(n4, 0);
                mo23835n(C6243d.C6245b.BOTTOM).mo23766a(n4, 0);
                mo23835n(bVar7).mo23766a(n4, 0);
            } else if (bVar == bVar6 && bVar2 == bVar6) {
                C6243d.C6245b bVar8 = C6243d.C6245b.LEFT;
                mo23835n(bVar8).mo23766a(eVar.mo23835n(bVar8), 0);
                C6243d.C6245b bVar9 = C6243d.C6245b.RIGHT;
                mo23835n(bVar9).mo23766a(eVar.mo23835n(bVar9), 0);
                mo23835n(bVar6).mo23766a(eVar.mo23835n(bVar2), 0);
            } else if (bVar == bVar7 && bVar2 == bVar7) {
                C6243d.C6245b bVar10 = C6243d.C6245b.TOP;
                mo23835n(bVar10).mo23766a(eVar.mo23835n(bVar10), 0);
                C6243d.C6245b bVar11 = C6243d.C6245b.BOTTOM;
                mo23835n(bVar11).mo23766a(eVar.mo23835n(bVar11), 0);
                mo23835n(bVar7).mo23766a(eVar.mo23835n(bVar2), 0);
            } else {
                C6243d n5 = mo23835n(bVar);
                C6243d n6 = eVar.mo23835n(bVar2);
                if (n5.mo23776k(n6)) {
                    C6243d.C6245b bVar12 = C6243d.C6245b.BASELINE;
                    if (bVar == bVar12) {
                        C6243d n7 = mo23835n(C6243d.C6245b.TOP);
                        C6243d n8 = mo23835n(C6243d.C6245b.BOTTOM);
                        if (n7 != null) {
                            n7.mo23777l();
                        }
                        if (n8 != null) {
                            n8.mo23777l();
                        }
                        i = 0;
                    } else if (bVar == C6243d.C6245b.TOP || bVar == C6243d.C6245b.BOTTOM) {
                        C6243d n9 = mo23835n(bVar12);
                        if (n9 != null) {
                            n9.mo23777l();
                        }
                        C6243d n10 = mo23835n(bVar5);
                        if (n10.mo23772g() != n6) {
                            n10.mo23777l();
                        }
                        C6243d d = mo23835n(bVar).mo23769d();
                        C6243d n11 = mo23835n(bVar7);
                        if (n11.mo23775j()) {
                            d.mo23777l();
                            n11.mo23777l();
                        }
                    } else if (bVar == C6243d.C6245b.LEFT || bVar == C6243d.C6245b.RIGHT) {
                        C6243d n12 = mo23835n(bVar5);
                        if (n12.mo23772g() != n6) {
                            n12.mo23777l();
                        }
                        C6243d d2 = mo23835n(bVar).mo23769d();
                        C6243d n13 = mo23835n(bVar6);
                        if (n13.mo23775j()) {
                            d2.mo23777l();
                            n13.mo23777l();
                        }
                    }
                    n5.mo23766a(n6, i);
                }
            }
        } else if (bVar2 == bVar5) {
            C6243d.C6245b bVar13 = C6243d.C6245b.LEFT;
            C6243d n14 = mo23835n(bVar13);
            C6243d.C6245b bVar14 = C6243d.C6245b.RIGHT;
            C6243d n15 = mo23835n(bVar14);
            C6243d.C6245b bVar15 = C6243d.C6245b.TOP;
            C6243d n16 = mo23835n(bVar15);
            C6243d.C6245b bVar16 = C6243d.C6245b.BOTTOM;
            C6243d n17 = mo23835n(bVar16);
            boolean z2 = true;
            if ((n14 == null || !n14.mo23775j()) && (n15 == null || !n15.mo23775j())) {
                mo23826i(bVar13, eVar, bVar13, 0);
                mo23826i(bVar14, eVar, bVar14, 0);
                z = true;
            } else {
                z = false;
            }
            if ((n16 == null || !n16.mo23775j()) && (n17 == null || !n17.mo23775j())) {
                mo23826i(bVar15, eVar, bVar15, 0);
                mo23826i(bVar16, eVar, bVar16, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo23835n(bVar5).mo23766a(eVar.mo23835n(bVar5), 0);
            } else if (z) {
                C6243d.C6245b bVar17 = C6243d.C6245b.CENTER_X;
                mo23835n(bVar17).mo23766a(eVar.mo23835n(bVar17), 0);
            } else if (z2) {
                C6243d.C6245b bVar18 = C6243d.C6245b.CENTER_Y;
                mo23835n(bVar18).mo23766a(eVar.mo23835n(bVar18), 0);
            }
        } else {
            C6243d.C6245b bVar19 = C6243d.C6245b.LEFT;
            if (bVar2 == bVar19 || bVar2 == C6243d.C6245b.RIGHT) {
                mo23826i(bVar19, eVar, bVar2, 0);
                mo23826i(C6243d.C6245b.RIGHT, eVar, bVar2, 0);
                mo23835n(bVar5).mo23766a(eVar.mo23835n(bVar2), 0);
                return;
            }
            C6243d.C6245b bVar20 = C6243d.C6245b.TOP;
            if (bVar2 == bVar20 || bVar2 == C6243d.C6245b.BOTTOM) {
                mo23826i(bVar20, eVar, bVar2, 0);
                mo23826i(C6243d.C6245b.BOTTOM, eVar, bVar2, 0);
                mo23835n(bVar5).mo23766a(eVar.mo23835n(bVar2), 0);
            }
        }
    }

    /* renamed from: i0 */
    public void mo23827i0(int i) {
        this.f25750R = i;
        int i2 = this.f25764c0;
        if (i < i2) {
            this.f25750R = i2;
        }
    }

    /* renamed from: j */
    public void mo23828j(C6243d dVar, C6243d dVar2, int i) {
        if (dVar.mo23770e() == this) {
            mo23826i(dVar.mo23773h(), dVar2.mo23770e(), dVar2.mo23773h(), i);
        }
    }

    /* renamed from: j0 */
    public void mo23829j0(float f) {
        this.f25766d0 = f;
    }

    /* renamed from: k */
    public void mo23830k(C6246e eVar, float f, int i) {
        C6243d.C6245b bVar = C6243d.C6245b.CENTER;
        mo23812U(bVar, eVar, bVar, i, 0);
        this.f25809z = f;
    }

    /* renamed from: k0 */
    public void mo23831k0(int i) {
        this.f25804w0 = i;
    }

    /* renamed from: l */
    public void mo23763l(C6246e eVar, HashMap<C6246e, C6246e> hashMap) {
        this.f25777j = eVar.f25777j;
        this.f25779k = eVar.f25779k;
        this.f25781l = eVar.f25781l;
        this.f25783m = eVar.f25783m;
        int[] iArr = this.f25785n;
        int[] iArr2 = eVar.f25785n;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f25787o = eVar.f25787o;
        this.f25789p = eVar.f25789p;
        this.f25793r = eVar.f25793r;
        this.f25795s = eVar.f25795s;
        this.f25797t = eVar.f25797t;
        this.f25799u = eVar.f25799u;
        this.f25801v = eVar.f25801v;
        this.f25803w = eVar.f25803w;
        this.f25805x = eVar.f25805x;
        int[] iArr3 = eVar.f25807y;
        this.f25807y = Arrays.copyOf(iArr3, iArr3.length);
        this.f25809z = eVar.f25809z;
        this.f25728A = eVar.f25728A;
        this.f25730B = eVar.f25730B;
        this.f25734D.mo23777l();
        this.f25736E.mo23777l();
        this.f25738F.mo23777l();
        this.f25739G.mo23777l();
        this.f25740H.mo23777l();
        this.f25741I.mo23777l();
        this.f25742J.mo23777l();
        this.f25743K.mo23777l();
        this.f25747O = (C6248b[]) Arrays.copyOf(this.f25747O, 2);
        C6246e eVar2 = null;
        this.f25748P = this.f25748P == null ? null : hashMap.get(eVar.f25748P);
        this.f25749Q = eVar.f25749Q;
        this.f25750R = eVar.f25750R;
        this.f25751S = eVar.f25751S;
        this.f25752T = eVar.f25752T;
        this.f25753U = eVar.f25753U;
        this.f25754V = eVar.f25754V;
        this.f25755W = eVar.f25755W;
        this.f25756X = eVar.f25756X;
        this.f25757Y = eVar.f25757Y;
        this.f25758Z = eVar.f25758Z;
        this.f25760a0 = eVar.f25760a0;
        this.f25762b0 = eVar.f25762b0;
        this.f25764c0 = eVar.f25764c0;
        this.f25766d0 = eVar.f25766d0;
        this.f25768e0 = eVar.f25768e0;
        this.f25770f0 = eVar.f25770f0;
        this.f25772g0 = eVar.f25772g0;
        this.f25774h0 = eVar.f25774h0;
        this.f25776i0 = eVar.f25776i0;
        this.f25778j0 = eVar.f25778j0;
        this.f25780k0 = eVar.f25780k0;
        this.f25782l0 = eVar.f25782l0;
        this.f25784m0 = eVar.f25784m0;
        this.f25786n0 = eVar.f25786n0;
        this.f25788o0 = eVar.f25788o0;
        this.f25790p0 = eVar.f25790p0;
        this.f25792q0 = eVar.f25792q0;
        this.f25794r0 = eVar.f25794r0;
        this.f25796s0 = eVar.f25796s0;
        this.f25798t0 = eVar.f25798t0;
        this.f25800u0 = eVar.f25800u0;
        this.f25802v0 = eVar.f25802v0;
        this.f25804w0 = eVar.f25804w0;
        this.f25806x0 = eVar.f25806x0;
        this.f25808y0 = eVar.f25808y0;
        this.f25810z0 = eVar.f25810z0;
        float[] fArr = this.f25729A0;
        float[] fArr2 = eVar.f25729A0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        C6246e[] eVarArr = this.f25731B0;
        C6246e[] eVarArr2 = eVar.f25731B0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        C6246e[] eVarArr3 = this.f25733C0;
        C6246e[] eVarArr4 = eVar.f25733C0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        C6246e eVar3 = eVar.f25735D0;
        this.f25735D0 = eVar3 == null ? null : hashMap.get(eVar3);
        C6246e eVar4 = eVar.f25737E0;
        if (eVar4 != null) {
            eVar2 = hashMap.get(eVar4);
        }
        this.f25737E0 = eVar2;
    }

    /* renamed from: l0 */
    public void mo23832l0(int i, int i2) {
        this.f25753U = i;
        int i3 = i2 - i;
        this.f25749Q = i3;
        int i4 = this.f25762b0;
        if (i3 < i4) {
            this.f25749Q = i4;
        }
    }

    /* renamed from: m */
    public void mo23833m(C6213d dVar) {
        dVar.mo23709q(this.f25734D);
        dVar.mo23709q(this.f25736E);
        dVar.mo23709q(this.f25738F);
        dVar.mo23709q(this.f25739G);
        if (this.f25760a0 > 0) {
            dVar.mo23709q(this.f25740H);
        }
    }

    /* renamed from: m0 */
    public void mo23834m0(C6248b bVar) {
        this.f25747O[0] = bVar;
    }

    /* renamed from: n */
    public C6243d mo23835n(C6243d.C6245b bVar) {
        switch (C6247a.f25811a[bVar.ordinal()]) {
            case 1:
                return this.f25734D;
            case 2:
                return this.f25736E;
            case 3:
                return this.f25738F;
            case 4:
                return this.f25739G;
            case 5:
                return this.f25740H;
            case 6:
                return this.f25743K;
            case 7:
                return this.f25741I;
            case 8:
                return this.f25742J;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: n0 */
    public void mo23836n0(int i, int i2, int i3, float f) {
        this.f25781l = i;
        this.f25787o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f25789p = i3;
        this.f25791q = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f25781l = 2;
        }
    }

    /* renamed from: o */
    public int mo23837o() {
        return this.f25760a0;
    }

    /* renamed from: o0 */
    public void mo23838o0(float f) {
        this.f25729A0[0] = f;
    }

    /* renamed from: p */
    public float mo23839p(int i) {
        if (i == 0) {
            return this.f25766d0;
        }
        if (i == 1) {
            return this.f25768e0;
        }
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo23840p0(int i, boolean z) {
        this.f25746N[i] = z;
    }

    /* renamed from: q */
    public int mo23841q() {
        return mo23810S() + this.f25750R;
    }

    /* renamed from: q0 */
    public void mo23842q0(boolean z) {
        this.f25730B = z;
    }

    /* renamed from: r */
    public Object mo23843r() {
        return this.f25770f0;
    }

    /* renamed from: r0 */
    public void mo23844r0(boolean z) {
        this.f25732C = z;
    }

    /* renamed from: s */
    public String mo23845s() {
        return this.f25776i0;
    }

    /* renamed from: s0 */
    public void mo23846s0(int i) {
        this.f25807y[1] = i;
    }

    /* renamed from: t */
    public C6248b mo23847t(int i) {
        if (i == 0) {
            return mo23859z();
        }
        if (i == 1) {
            return mo23805N();
        }
        return null;
    }

    /* renamed from: t0 */
    public void mo23848t0(int i) {
        this.f25807y[0] = i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f25778j0 != null) {
            str = "type: " + this.f25778j0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f25776i0 != null) {
            str2 = "id: " + this.f25776i0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f25753U);
        sb.append(", ");
        sb.append(this.f25754V);
        sb.append(") - (");
        sb.append(this.f25749Q);
        sb.append(" x ");
        sb.append(this.f25750R);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public float mo23849u() {
        return this.f25751S;
    }

    /* renamed from: u0 */
    public void mo23850u0(int i) {
        if (i < 0) {
            this.f25764c0 = 0;
        } else {
            this.f25764c0 = i;
        }
    }

    /* renamed from: v */
    public int mo23851v() {
        return this.f25752T;
    }

    /* renamed from: v0 */
    public void mo23852v0(int i) {
        if (i < 0) {
            this.f25762b0 = 0;
        } else {
            this.f25762b0 = i;
        }
    }

    /* renamed from: w */
    public int mo23853w() {
        if (this.f25774h0 == 8) {
            return 0;
        }
        return this.f25750R;
    }

    /* renamed from: w0 */
    public void mo23854w0(int i, int i2) {
        this.f25753U = i;
        this.f25754V = i2;
    }

    /* renamed from: x */
    public float mo23855x() {
        return this.f25766d0;
    }

    /* renamed from: x0 */
    public void mo23856x0(C6246e eVar) {
        this.f25748P = eVar;
    }

    /* renamed from: y */
    public int mo23857y() {
        return this.f25804w0;
    }

    /* renamed from: y0 */
    public void mo23858y0(float f) {
        this.f25768e0 = f;
    }

    /* renamed from: z */
    public C6248b mo23859z() {
        return this.f25747O[0];
    }

    /* renamed from: z0 */
    public void mo23860z0(int i) {
        this.f25806x0 = i;
    }
}
