package p170x;

import p165w.C6243d;
import p165w.C6246e;
import p165w.C6254i;
import p170x.C6323f;
import p170x.C6333m;

/* renamed from: x.j */
/* compiled from: HorizontalWidgetRun */
public class C6328j extends C6333m {

    /* renamed from: k */
    private static int[] f26124k = new int[2];

    /* renamed from: x.j$a */
    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class C6329a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26125a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                x.m$b[] r0 = p170x.C6333m.C6335b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26125a = r0
                x.m$b r1 = p170x.C6333m.C6335b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26125a     // Catch:{ NoSuchFieldError -> 0x001d }
                x.m$b r1 = p170x.C6333m.C6335b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26125a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x.m$b r1 = p170x.C6333m.C6335b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p170x.C6328j.C6329a.<clinit>():void");
        }
    }

    public C6328j(C6246e eVar) {
        super(eVar);
        this.f26144h.f26106e = C6323f.C6324a.LEFT;
        this.f26145i.f26106e = C6323f.C6324a.RIGHT;
        this.f26142f = 0;
    }

    /* renamed from: q */
    private void m27874q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bc, code lost:
        if (r14 != 1) goto L_0x0324;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24081a(p170x.C6321d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p170x.C6328j.C6329a.f26125a
            x.m$b r1 = r8.f26146j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            w.e r0 = r8.f26138b
            w.d r1 = r0.f25734D
            w.d r0 = r0.f25738F
            r3 = r17
            r8.mo24113n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo24114o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo24115p(r17)
        L_0x002e:
            x.g r0 = r8.f26141e
            boolean r0 = r0.f26111j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x0324
            w.e$b r0 = r8.f26140d
            w.e$b r3 = p165w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x0324
            w.e r0 = r8.f26138b
            int r3 = r0.f25781l
            if (r3 == r1) goto L_0x0306
            if (r3 == r2) goto L_0x0046
            goto L_0x0324
        L_0x0046:
            int r1 = r0.f25783m
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.mo23851v()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            w.e r0 = r8.f26138b
            x.l r1 = r0.f25769f
            x.g r1 = r1.f26141e
            int r1 = r1.f26108g
            float r1 = (float) r1
            float r0 = r0.mo23849u()
            goto L_0x0084
        L_0x0068:
            w.e r0 = r8.f26138b
            x.l r1 = r0.f25769f
            x.g r1 = r1.f26141e
            int r1 = r1.f26108g
            float r1 = (float) r1
            float r0 = r0.mo23849u()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            w.e r0 = r8.f26138b
            x.l r1 = r0.f25769f
            x.g r1 = r1.f26141e
            int r1 = r1.f26108g
            float r1 = (float) r1
            float r0 = r0.mo23849u()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            x.g r1 = r8.f26141e
            r1.mo24099d(r0)
            goto L_0x0324
        L_0x008f:
            x.l r1 = r0.f25769f
            x.f r12 = r1.f26144h
            x.f r13 = r1.f26145i
            w.d r1 = r0.f25734D
            w.d r1 = r1.f25712d
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            w.d r2 = r0.f25736E
            w.d r2 = r2.f25712d
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            w.d r4 = r0.f25738F
            w.d r4 = r4.f25712d
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            w.d r5 = r0.f25739G
            w.d r5 = r5.f25712d
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            int r14 = r0.mo23851v()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            w.e r0 = r8.f26138b
            float r15 = r0.mo23849u()
            boolean r0 = r12.f26111j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f26111j
            if (r0 == 0) goto L_0x012e
            x.f r0 = r8.f26144h
            boolean r1 = r0.f26104c
            if (r1 == 0) goto L_0x012d
            x.f r1 = r8.f26145i
            boolean r1 = r1.f26104c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            x.f r1 = r8.f26144h
            int r1 = r1.f26107f
            int r2 = r0 + r1
            x.f r0 = r8.f26145i
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            x.f r1 = r8.f26145i
            int r1 = r1.f26107f
            int r3 = r0 - r1
            int r0 = r12.f26108g
            int r1 = r12.f26107f
            int r4 = r0 + r1
            int r0 = r13.f26108g
            int r1 = r13.f26107f
            int r5 = r0 - r1
            int[] r1 = f26124k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m27874q(r1, r2, r3, r4, r5, r6, r7)
            x.g r0 = r8.f26141e
            int[] r1 = f26124k
            r1 = r1[r10]
            r0.mo24099d(r1)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            int[] r1 = f26124k
            r1 = r1[r9]
            r0.mo24099d(r1)
        L_0x012d:
            return
        L_0x012e:
            x.f r0 = r8.f26144h
            boolean r1 = r0.f26111j
            if (r1 == 0) goto L_0x018b
            x.f r1 = r8.f26145i
            boolean r2 = r1.f26111j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f26104c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f26104c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f26108g
            int r0 = r0.f26107f
            int r2 = r2 + r0
            int r0 = r1.f26108g
            int r1 = r1.f26107f
            int r3 = r0 - r1
            java.util.List<x.f> r0 = r12.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            int r1 = r12.f26107f
            int r4 = r0 + r1
            java.util.List<x.f> r0 = r13.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            int r1 = r13.f26107f
            int r5 = r0 - r1
            int[] r1 = f26124k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m27874q(r1, r2, r3, r4, r5, r6, r7)
            x.g r0 = r8.f26141e
            int[] r1 = f26124k
            r1 = r1[r10]
            r0.mo24099d(r1)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            int[] r1 = f26124k
            r1 = r1[r9]
            r0.mo24099d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            x.f r0 = r8.f26144h
            boolean r1 = r0.f26104c
            if (r1 == 0) goto L_0x01ff
            x.f r1 = r8.f26145i
            boolean r1 = r1.f26104c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f26104c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f26104c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            x.f r1 = r8.f26144h
            int r1 = r1.f26107f
            int r2 = r0 + r1
            x.f r0 = r8.f26145i
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            x.f r1 = r8.f26145i
            int r1 = r1.f26107f
            int r3 = r0 - r1
            java.util.List<x.f> r0 = r12.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            int r1 = r12.f26107f
            int r4 = r0 + r1
            java.util.List<x.f> r0 = r13.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            int r0 = r0.f26108g
            int r1 = r13.f26107f
            int r5 = r0 - r1
            int[] r1 = f26124k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m27874q(r1, r2, r3, r4, r5, r6, r7)
            x.g r0 = r8.f26141e
            int[] r1 = f26124k
            r1 = r1[r10]
            r0.mo24099d(r1)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            int[] r1 = f26124k
            r1 = r1[r9]
            r0.mo24099d(r1)
            goto L_0x0324
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x028b
            if (r4 == 0) goto L_0x028b
            x.f r0 = r8.f26144h
            boolean r0 = r0.f26104c
            if (r0 == 0) goto L_0x028a
            x.f r0 = r8.f26145i
            boolean r0 = r0.f26104c
            if (r0 != 0) goto L_0x0212
            goto L_0x028a
        L_0x0212:
            w.e r0 = r8.f26138b
            float r0 = r0.mo23849u()
            x.f r1 = r8.f26144h
            java.util.List<x.f> r1 = r1.f26113l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p170x.C6323f) r1
            int r1 = r1.f26108g
            x.f r2 = r8.f26144h
            int r2 = r2.f26107f
            int r1 = r1 + r2
            x.f r2 = r8.f26145i
            java.util.List<x.f> r2 = r2.f26113l
            java.lang.Object r2 = r2.get(r10)
            x.f r2 = (p170x.C6323f) r2
            int r2 = r2.f26108g
            x.f r4 = r8.f26145i
            int r4 = r4.f26107f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0266
            if (r14 == 0) goto L_0x0266
            if (r14 == r9) goto L_0x0242
            goto L_0x0324
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.mo24109g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo24109g(r2, r9)
            if (r2 == r3) goto L_0x0256
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0256:
            x.g r0 = r8.f26141e
            r0.mo24099d(r1)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            r0.mo24099d(r3)
            goto L_0x0324
        L_0x0266:
            int r2 = r2 - r1
            int r1 = r8.mo24109g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo24109g(r2, r9)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            x.g r0 = r8.f26141e
            r0.mo24099d(r1)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            r0.mo24099d(r3)
            goto L_0x0324
        L_0x028a:
            return
        L_0x028b:
            if (r2 == 0) goto L_0x0324
            if (r5 == 0) goto L_0x0324
            boolean r0 = r12.f26104c
            if (r0 == 0) goto L_0x0305
            boolean r0 = r13.f26104c
            if (r0 != 0) goto L_0x0298
            goto L_0x0305
        L_0x0298:
            w.e r0 = r8.f26138b
            float r0 = r0.mo23849u()
            java.util.List<x.f> r1 = r12.f26113l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p170x.C6323f) r1
            int r1 = r1.f26108g
            int r2 = r12.f26107f
            int r1 = r1 + r2
            java.util.List<x.f> r2 = r13.f26113l
            java.lang.Object r2 = r2.get(r10)
            x.f r2 = (p170x.C6323f) r2
            int r2 = r2.f26108g
            int r4 = r13.f26107f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02e2
            if (r14 == 0) goto L_0x02bf
            if (r14 == r9) goto L_0x02e2
            goto L_0x0324
        L_0x02bf:
            int r2 = r2 - r1
            int r1 = r8.mo24109g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo24109g(r2, r10)
            if (r2 == r3) goto L_0x02d3
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d3:
            x.g r0 = r8.f26141e
            r0.mo24099d(r3)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            r0.mo24099d(r1)
            goto L_0x0324
        L_0x02e2:
            int r2 = r2 - r1
            int r1 = r8.mo24109g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo24109g(r2, r10)
            if (r2 == r3) goto L_0x02f6
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f6:
            x.g r0 = r8.f26141e
            r0.mo24099d(r3)
            w.e r0 = r8.f26138b
            x.l r0 = r0.f25769f
            x.g r0 = r0.f26141e
            r0.mo24099d(r1)
            goto L_0x0324
        L_0x0305:
            return
        L_0x0306:
            w.e r0 = r0.mo23795H()
            if (r0 == 0) goto L_0x0324
            x.j r0 = r0.f25767e
            x.g r0 = r0.f26141e
            boolean r1 = r0.f26111j
            if (r1 == 0) goto L_0x0324
            w.e r1 = r8.f26138b
            float r1 = r1.f25791q
            int r0 = r0.f26108g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            x.g r1 = r8.f26141e
            r1.mo24099d(r0)
        L_0x0324:
            x.f r0 = r8.f26144h
            boolean r1 = r0.f26104c
            if (r1 == 0) goto L_0x0446
            x.f r1 = r8.f26145i
            boolean r2 = r1.f26104c
            if (r2 != 0) goto L_0x0332
            goto L_0x0446
        L_0x0332:
            boolean r0 = r0.f26111j
            if (r0 == 0) goto L_0x0341
            boolean r0 = r1.f26111j
            if (r0 == 0) goto L_0x0341
            x.g r0 = r8.f26141e
            boolean r0 = r0.f26111j
            if (r0 == 0) goto L_0x0341
            return
        L_0x0341:
            x.g r0 = r8.f26141e
            boolean r0 = r0.f26111j
            if (r0 != 0) goto L_0x038b
            w.e$b r0 = r8.f26140d
            w.e$b r1 = p165w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x038b
            w.e r0 = r8.f26138b
            int r1 = r0.f25781l
            if (r1 != 0) goto L_0x038b
            boolean r0 = r0.mo23813W()
            if (r0 != 0) goto L_0x038b
            x.f r0 = r8.f26144h
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            x.f r1 = r8.f26145i
            java.util.List<x.f> r1 = r1.f26113l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p170x.C6323f) r1
            int r0 = r0.f26108g
            x.f r2 = r8.f26144h
            int r3 = r2.f26107f
            int r0 = r0 + r3
            int r1 = r1.f26108g
            x.f r3 = r8.f26145i
            int r3 = r3.f26107f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo24099d(r0)
            x.f r0 = r8.f26145i
            r0.mo24099d(r1)
            x.g r0 = r8.f26141e
            r0.mo24099d(r3)
            return
        L_0x038b:
            x.g r0 = r8.f26141e
            boolean r0 = r0.f26111j
            if (r0 != 0) goto L_0x03ef
            w.e$b r0 = r8.f26140d
            w.e$b r1 = p165w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            int r0 = r8.f26137a
            if (r0 != r9) goto L_0x03ef
            x.f r0 = r8.f26144h
            java.util.List<x.f> r0 = r0.f26113l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            x.f r0 = r8.f26145i
            java.util.List<x.f> r0 = r0.f26113l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            x.f r0 = r8.f26144h
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            x.f r1 = r8.f26145i
            java.util.List<x.f> r1 = r1.f26113l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p170x.C6323f) r1
            int r0 = r0.f26108g
            x.f r2 = r8.f26144h
            int r2 = r2.f26107f
            int r0 = r0 + r2
            int r1 = r1.f26108g
            x.f r2 = r8.f26145i
            int r2 = r2.f26107f
            int r1 = r1 + r2
            int r1 = r1 - r0
            x.g r0 = r8.f26141e
            int r0 = r0.f26123m
            int r0 = java.lang.Math.min(r1, r0)
            w.e r1 = r8.f26138b
            int r2 = r1.f25789p
            int r1 = r1.f25787o
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ea
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ea:
            x.g r1 = r8.f26141e
            r1.mo24099d(r0)
        L_0x03ef:
            x.g r0 = r8.f26141e
            boolean r0 = r0.f26111j
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            x.f r0 = r8.f26144h
            java.util.List<x.f> r0 = r0.f26113l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p170x.C6323f) r0
            x.f r1 = r8.f26145i
            java.util.List<x.f> r1 = r1.f26113l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p170x.C6323f) r1
            int r2 = r0.f26108g
            x.f r3 = r8.f26144h
            int r3 = r3.f26107f
            int r2 = r2 + r3
            int r3 = r1.f26108g
            x.f r4 = r8.f26145i
            int r4 = r4.f26107f
            int r3 = r3 + r4
            w.e r4 = r8.f26138b
            float r4 = r4.mo23855x()
            if (r0 != r1) goto L_0x0426
            int r2 = r0.f26108g
            int r3 = r1.f26108g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0426:
            int r3 = r3 - r2
            x.g r0 = r8.f26141e
            int r0 = r0.f26108g
            int r3 = r3 - r0
            x.f r0 = r8.f26144h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo24099d(r1)
            x.f r0 = r8.f26145i
            x.f r1 = r8.f26144h
            int r1 = r1.f26108g
            x.g r2 = r8.f26141e
            int r2 = r2.f26108g
            int r1 = r1 + r2
            r0.mo24099d(r1)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p170x.C6328j.mo24081a(x.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24082d() {
        C6246e H;
        C6246e H2;
        C6246e eVar = this.f26138b;
        if (eVar.f25759a) {
            this.f26141e.mo24099d(eVar.mo23808Q());
        }
        if (!this.f26141e.f26111j) {
            C6246e.C6248b z = this.f26138b.mo23859z();
            this.f26140d = z;
            if (z != C6246e.C6248b.MATCH_CONSTRAINT) {
                C6246e.C6248b bVar = C6246e.C6248b.MATCH_PARENT;
                if (z == bVar && (((H2 = this.f26138b.mo23795H()) != null && H2.mo23859z() == C6246e.C6248b.FIXED) || H2.mo23859z() == bVar)) {
                    int Q = (H2.mo23808Q() - this.f26138b.f25734D.mo23768c()) - this.f26138b.f25738F.mo23768c();
                    mo24107b(this.f26144h, H2.f25767e.f26144h, this.f26138b.f25734D.mo23768c());
                    mo24107b(this.f26145i, H2.f25767e.f26145i, -this.f26138b.f25738F.mo23768c());
                    this.f26141e.mo24099d(Q);
                    return;
                } else if (this.f26140d == C6246e.C6248b.FIXED) {
                    this.f26141e.mo24099d(this.f26138b.mo23808Q());
                }
            }
        } else {
            C6246e.C6248b bVar2 = this.f26140d;
            C6246e.C6248b bVar3 = C6246e.C6248b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((H = this.f26138b.mo23795H()) != null && H.mo23859z() == C6246e.C6248b.FIXED) || H.mo23859z() == bVar3)) {
                mo24107b(this.f26144h, H.f25767e.f26144h, this.f26138b.f25734D.mo23768c());
                mo24107b(this.f26145i, H.f25767e.f26145i, -this.f26138b.f25738F.mo23768c());
                return;
            }
        }
        C6325g gVar = this.f26141e;
        if (gVar.f26111j) {
            C6246e eVar2 = this.f26138b;
            if (eVar2.f25759a) {
                C6243d[] dVarArr = eVar2.f25744L;
                if (dVarArr[0].f25712d == null || dVarArr[1].f25712d == null) {
                    if (dVarArr[0].f25712d != null) {
                        C6323f h = mo24110h(dVarArr[0]);
                        if (h != null) {
                            mo24107b(this.f26144h, h, this.f26138b.f25744L[0].mo23768c());
                            mo24107b(this.f26145i, this.f26144h, this.f26141e.f26108g);
                            return;
                        }
                        return;
                    } else if (dVarArr[1].f25712d != null) {
                        C6323f h2 = mo24110h(dVarArr[1]);
                        if (h2 != null) {
                            mo24107b(this.f26145i, h2, -this.f26138b.f25744L[1].mo23768c());
                            mo24107b(this.f26144h, this.f26145i, -this.f26141e.f26108g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C6254i) && eVar2.mo23795H() != null && this.f26138b.mo23835n(C6243d.C6245b.CENTER).f25712d == null) {
                        mo24107b(this.f26144h, this.f26138b.mo23795H().f25767e.f26144h, this.f26138b.mo23809R());
                        mo24107b(this.f26145i, this.f26144h, this.f26141e.f26108g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.mo23813W()) {
                    this.f26144h.f26107f = this.f26138b.f25744L[0].mo23768c();
                    this.f26145i.f26107f = -this.f26138b.f25744L[1].mo23768c();
                    return;
                } else {
                    C6323f h3 = mo24110h(this.f26138b.f25744L[0]);
                    if (h3 != null) {
                        mo24107b(this.f26144h, h3, this.f26138b.f25744L[0].mo23768c());
                    }
                    C6323f h4 = mo24110h(this.f26138b.f25744L[1]);
                    if (h4 != null) {
                        mo24107b(this.f26145i, h4, -this.f26138b.f25744L[1].mo23768c());
                    }
                    this.f26144h.f26103b = true;
                    this.f26145i.f26103b = true;
                    return;
                }
            }
        }
        if (this.f26140d == C6246e.C6248b.MATCH_CONSTRAINT) {
            C6246e eVar3 = this.f26138b;
            int i = eVar3.f25781l;
            if (i == 2) {
                C6246e H3 = eVar3.mo23795H();
                if (H3 != null) {
                    C6325g gVar2 = H3.f25769f.f26141e;
                    this.f26141e.f26113l.add(gVar2);
                    gVar2.f26112k.add(this.f26141e);
                    C6325g gVar3 = this.f26141e;
                    gVar3.f26103b = true;
                    gVar3.f26112k.add(this.f26144h);
                    this.f26141e.f26112k.add(this.f26145i);
                }
            } else if (i == 3) {
                if (eVar3.f25783m == 3) {
                    this.f26144h.f26102a = this;
                    this.f26145i.f26102a = this;
                    C6331l lVar = eVar3.f25769f;
                    lVar.f26144h.f26102a = this;
                    lVar.f26145i.f26102a = this;
                    gVar.f26102a = this;
                    if (eVar3.mo23815Y()) {
                        this.f26141e.f26113l.add(this.f26138b.f25769f.f26141e);
                        this.f26138b.f25769f.f26141e.f26112k.add(this.f26141e);
                        C6331l lVar2 = this.f26138b.f25769f;
                        lVar2.f26141e.f26102a = this;
                        this.f26141e.f26113l.add(lVar2.f26144h);
                        this.f26141e.f26113l.add(this.f26138b.f25769f.f26145i);
                        this.f26138b.f25769f.f26144h.f26112k.add(this.f26141e);
                        this.f26138b.f25769f.f26145i.f26112k.add(this.f26141e);
                    } else if (this.f26138b.mo23813W()) {
                        this.f26138b.f25769f.f26141e.f26113l.add(this.f26141e);
                        this.f26141e.f26112k.add(this.f26138b.f25769f.f26141e);
                    } else {
                        this.f26138b.f25769f.f26141e.f26113l.add(this.f26141e);
                    }
                } else {
                    C6325g gVar4 = eVar3.f25769f.f26141e;
                    gVar.f26113l.add(gVar4);
                    gVar4.f26112k.add(this.f26141e);
                    this.f26138b.f25769f.f26144h.f26112k.add(this.f26141e);
                    this.f26138b.f25769f.f26145i.f26112k.add(this.f26141e);
                    C6325g gVar5 = this.f26141e;
                    gVar5.f26103b = true;
                    gVar5.f26112k.add(this.f26144h);
                    this.f26141e.f26112k.add(this.f26145i);
                    this.f26144h.f26113l.add(this.f26141e);
                    this.f26145i.f26113l.add(this.f26141e);
                }
            }
        }
        C6246e eVar4 = this.f26138b;
        C6243d[] dVarArr2 = eVar4.f25744L;
        if (dVarArr2[0].f25712d == null || dVarArr2[1].f25712d == null) {
            if (dVarArr2[0].f25712d != null) {
                C6323f h5 = mo24110h(dVarArr2[0]);
                if (h5 != null) {
                    mo24107b(this.f26144h, h5, this.f26138b.f25744L[0].mo23768c());
                    mo24108c(this.f26145i, this.f26144h, 1, this.f26141e);
                }
            } else if (dVarArr2[1].f25712d != null) {
                C6323f h6 = mo24110h(dVarArr2[1]);
                if (h6 != null) {
                    mo24107b(this.f26145i, h6, -this.f26138b.f25744L[1].mo23768c());
                    mo24108c(this.f26144h, this.f26145i, -1, this.f26141e);
                }
            } else if (!(eVar4 instanceof C6254i) && eVar4.mo23795H() != null) {
                mo24107b(this.f26144h, this.f26138b.mo23795H().f25767e.f26144h, this.f26138b.mo23809R());
                mo24108c(this.f26145i, this.f26144h, 1, this.f26141e);
            }
        } else if (eVar4.mo23813W()) {
            this.f26144h.f26107f = this.f26138b.f25744L[0].mo23768c();
            this.f26145i.f26107f = -this.f26138b.f25744L[1].mo23768c();
        } else {
            C6323f h7 = mo24110h(this.f26138b.f25744L[0]);
            C6323f h8 = mo24110h(this.f26138b.f25744L[1]);
            h7.mo24097b(this);
            h8.mo24097b(this);
            this.f26146j = C6333m.C6335b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo24083e() {
        C6323f fVar = this.f26144h;
        if (fVar.f26111j) {
            this.f26138b.mo23794G0(fVar.f26108g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24084f() {
        this.f26139c = null;
        this.f26144h.mo24098c();
        this.f26145i.mo24098c();
        this.f26141e.mo24098c();
        this.f26143g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo24086m() {
        if (this.f26140d != C6246e.C6248b.MATCH_CONSTRAINT || this.f26138b.f25781l == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo24101r() {
        this.f26143g = false;
        this.f26144h.mo24098c();
        this.f26144h.f26111j = false;
        this.f26145i.mo24098c();
        this.f26145i.f26111j = false;
        this.f26141e.f26111j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f26138b.mo23845s();
    }
}
