package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p004a3.C0058e;
import p004a3.C0065j;
import p004a3.C0066k;
import p082g2.C5292j;
import p169w2.C6304a;
import p169w2.C6305b;
import p169w2.C6306c;
import p169w2.C6307d;
import p169w2.C6309e;
import p169w2.C6310f;
import p169w2.C6312h;
import p174x2.C6386h;
import p174x2.C6387i;

/* renamed from: com.bumptech.glide.i */
/* compiled from: RequestBuilder */
public class C3333i<TranscodeType> extends C6304a<C3333i<TranscodeType>> {

    /* renamed from: P */
    protected static final C6310f f12662P = ((C6310f) ((C6310f) ((C6310f) new C6310f().mo24036g(C5292j.f23393c)).mo24034e0(C3325f.LOW)).mo24045l0(true));

    /* renamed from: B */
    private final Context f12663B;

    /* renamed from: C */
    private final C3335j f12664C;

    /* renamed from: D */
    private final Class<TranscodeType> f12665D;

    /* renamed from: E */
    private final C3319b f12666E;

    /* renamed from: F */
    private final C3323d f12667F;

    /* renamed from: G */
    private C3338k<?, ? super TranscodeType> f12668G;

    /* renamed from: H */
    private Object f12669H;

    /* renamed from: I */
    private List<C6309e<TranscodeType>> f12670I;

    /* renamed from: J */
    private C3333i<TranscodeType> f12671J;

    /* renamed from: K */
    private C3333i<TranscodeType> f12672K;

    /* renamed from: L */
    private Float f12673L;

    /* renamed from: M */
    private boolean f12674M = true;

    /* renamed from: N */
    private boolean f12675N;

    /* renamed from: O */
    private boolean f12676O;

    /* renamed from: com.bumptech.glide.i$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C3334a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12677a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12678b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.f[] r0 = com.bumptech.glide.C3325f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12678b = r0
                r1 = 1
                com.bumptech.glide.f r2 = com.bumptech.glide.C3325f.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12678b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.f r3 = com.bumptech.glide.C3325f.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12678b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.f r4 = com.bumptech.glide.C3325f.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f12678b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.f r5 = com.bumptech.glide.C3325f.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f12677a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f12677a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f12677a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f12677a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f12677a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f12677a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f12677a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f12677a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C3333i.C3334a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    protected C3333i(C3319b bVar, C3335j jVar, Class<TranscodeType> cls, Context context) {
        this.f12666E = bVar;
        this.f12664C = jVar;
        this.f12665D = cls;
        this.f12663B = context;
        this.f12668G = jVar.mo11152o(cls);
        this.f12667F = bVar.mo11096i();
        m11153y0(jVar.mo11150m());
        mo11139a(jVar.mo11151n());
    }

    /* renamed from: B0 */
    private <Y extends C6386h<TranscodeType>> Y m11145B0(Y y, C6309e<TranscodeType> eVar, C6304a<?> aVar, Executor executor) {
        C0065j.m247d(y);
        if (this.f12675N) {
            C6306c t0 = m11149t0(y, eVar, aVar, executor);
            C6306c g = y.mo24216g();
            if (!t0.mo24063e(g) || m11146D0(aVar, g)) {
                this.f12664C.mo11149l(y);
                y.mo24214c(t0);
                this.f12664C.mo11166v(y, t0);
                return y;
            }
            if (!((C6306c) C0065j.m247d(g)).isRunning()) {
                g.mo24067i();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: D0 */
    private boolean m11146D0(C6304a<?> aVar, C6306c cVar) {
        return !aVar.mo24019O() && cVar.mo24062d();
    }

    /* renamed from: G0 */
    private C3333i<TranscodeType> m11147G0(Object obj) {
        this.f12669H = obj;
        this.f12675N = true;
        return this;
    }

    /* renamed from: H0 */
    private C6306c m11148H0(Object obj, C6386h<TranscodeType> hVar, C6309e<TranscodeType> eVar, C6304a<?> aVar, C6307d dVar, C3338k<?, ? super TranscodeType> kVar, C3325f fVar, int i, int i2, Executor executor) {
        Context context = this.f12663B;
        C3323d dVar2 = this.f12667F;
        return C6312h.m27793x(context, dVar2, obj, this.f12669H, this.f12665D, aVar, i, i2, fVar, hVar, eVar, this.f12670I, dVar, dVar2.mo11114f(), kVar.mo11171b(), executor);
    }

    /* renamed from: t0 */
    private C6306c m11149t0(C6386h<TranscodeType> hVar, C6309e<TranscodeType> eVar, C6304a<?> aVar, Executor executor) {
        return m11150u0(new Object(), hVar, eVar, (C6307d) null, this.f12668G, aVar.mo24011C(), aVar.mo24056w(), aVar.mo24055s(), aVar, executor);
    }

    /* renamed from: u0 */
    private C6306c m11150u0(Object obj, C6386h<TranscodeType> hVar, C6309e<TranscodeType> eVar, C6307d dVar, C3338k<?, ? super TranscodeType> kVar, C3325f fVar, int i, int i2, C6304a<?> aVar, Executor executor) {
        C6305b bVar;
        C6305b bVar2;
        if (this.f12672K != null) {
            bVar2 = new C6305b(obj, dVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = dVar;
        }
        C6306c v0 = m11151v0(obj, hVar, eVar, bVar2, kVar, fVar, i, i2, aVar, executor);
        if (bVar == null) {
            return v0;
        }
        int w = this.f12672K.mo24056w();
        int s = this.f12672K.mo24055s();
        if (C0066k.m267s(i, i2) && !this.f12672K.mo24025W()) {
            w = aVar.mo24056w();
            s = aVar.mo24055s();
        }
        C3333i<TranscodeType> iVar = this.f12672K;
        C6305b bVar3 = bVar;
        bVar3.mo24071p(v0, iVar.m11150u0(obj, hVar, eVar, bVar3, iVar.f12668G, iVar.mo24011C(), w, s, this.f12672K, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [w2.a<?>, w2.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p169w2.C6306c m11151v0(java.lang.Object r19, p174x2.C6386h<TranscodeType> r20, p169w2.C6309e<TranscodeType> r21, p169w2.C6307d r22, com.bumptech.glide.C3338k<?, ? super TranscodeType> r23, com.bumptech.glide.C3325f r24, int r25, int r26, p169w2.C6304a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.i<TranscodeType> r0 = r11.f12671J
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.f12676O
            if (r1 != 0) goto L_0x008c
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.f12668G
            boolean r2 = r0.f12674M
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.mo24020P()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.i<TranscodeType> r0 = r11.f12671J
            com.bumptech.glide.f r0 = r0.mo24011C()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.f r0 = r11.m11152x0(r13)
        L_0x002b:
            r15 = r0
            com.bumptech.glide.i<TranscodeType> r0 = r11.f12671J
            int r0 = r0.mo24056w()
            com.bumptech.glide.i<TranscodeType> r1 = r11.f12671J
            int r1 = r1.mo24055s()
            boolean r2 = p004a3.C0066k.m267s(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.bumptech.glide.i<TranscodeType> r2 = r11.f12671J
            boolean r2 = r2.mo24025W()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.mo24056w()
            int r1 = r27.mo24055s()
        L_0x004e:
            r16 = r0
            r17 = r1
            w2.i r10 = new w2.i
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            w2.c r10 = r0.m11148H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f12676O = r0
            com.bumptech.glide.i<TranscodeType> r9 = r11.f12671J
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            w2.c r0 = r0.m11150u0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f12676O = r1
            r13.mo24078o(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.f12673L
            if (r0 == 0) goto L_0x00d4
            w2.i r14 = new w2.i
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            w2.c r15 = r0.m11148H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            w2.a r0 = r27.clone()
            java.lang.Float r1 = r11.f12673L
            float r1 = r1.floatValue()
            w2.a r4 = r0.mo24043k0(r1)
            com.bumptech.glide.f r7 = r11.m11152x0(r13)
            r0 = r18
            r1 = r19
            w2.c r0 = r0.m11148H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo24078o(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            w2.c r0 = r0.m11148H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C3333i.m11151v0(java.lang.Object, x2.h, w2.e, w2.d, com.bumptech.glide.k, com.bumptech.glide.f, int, int, w2.a, java.util.concurrent.Executor):w2.c");
    }

    /* renamed from: x0 */
    private C3325f m11152x0(C3325f fVar) {
        int i = C3334a.f12678b[fVar.ordinal()];
        if (i == 1) {
            return C3325f.NORMAL;
        }
        if (i == 2) {
            return C3325f.HIGH;
        }
        if (i == 3 || i == 4) {
            return C3325f.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo24011C());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: y0 */
    private void m11153y0(List<C6309e<Object>> list) {
        for (C6309e<Object> r0 : list) {
            mo11142r0(r0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public <Y extends C6386h<TranscodeType>> Y mo11135A0(Y y, C6309e<TranscodeType> eVar, Executor executor) {
        return m11145B0(y, eVar, this, executor);
    }

    /* renamed from: C0 */
    public C6387i<ImageView, TranscodeType> mo11136C0(ImageView imageView) {
        C6304a aVar;
        C0066k.m249a();
        C0065j.m247d(imageView);
        if (!mo24024V() && mo24022T() && imageView.getScaleType() != null) {
            switch (C3334a.f12677a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo24027Y();
                    break;
                case 2:
                    aVar = clone().mo24028Z();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo24029a0();
                    break;
                case 6:
                    aVar = clone().mo24028Z();
                    break;
            }
        }
        aVar = this;
        return (C6387i) m11145B0(this.f12667F.mo11109a(imageView, this.f12665D), (C6309e) null, aVar, C0058e.m229b());
    }

    /* renamed from: E0 */
    public C3333i<TranscodeType> mo11137E0(Object obj) {
        return m11147G0(obj);
    }

    /* renamed from: F0 */
    public C3333i<TranscodeType> mo11138F0(String str) {
        return m11147G0(str);
    }

    /* renamed from: r0 */
    public C3333i<TranscodeType> mo11142r0(C6309e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f12670I == null) {
                this.f12670I = new ArrayList();
            }
            this.f12670I.add(eVar);
        }
        return this;
    }

    /* renamed from: s0 */
    public C3333i<TranscodeType> mo11139a(C6304a<?> aVar) {
        C0065j.m247d(aVar);
        return (C3333i) super.mo11139a(aVar);
    }

    /* renamed from: w0 */
    public C3333i<TranscodeType> clone() {
        C3333i<TranscodeType> iVar = (C3333i) super.clone();
        iVar.f12668G = iVar.f12668G.clone();
        return iVar;
    }

    /* renamed from: z0 */
    public <Y extends C6386h<TranscodeType>> Y mo11145z0(Y y) {
        return mo11135A0(y, (C6309e) null, C0058e.m229b());
    }
}
