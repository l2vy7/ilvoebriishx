package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.C10214j;
import com.google.android.material.internal.C10220m;
import com.google.android.material.internal.C10227s;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p016c0.C2617a;
import p062d0.C5135a;
import p078g.C5264a;
import p099k0.C5535a;
import p193c6.C6532l;
import p199d6.C10500h;
import p203e6.C10515a;
import p214h6.C10579a;
import p232m6.C10805c;
import p232m6.C10806d;
import p236n6.C10841b;
import p242p6.C10889h;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C10074a extends C10889h implements Drawable.Callback, C10214j.C10216b {

    /* renamed from: U0 */
    private static final int[] f47548U0 = {16842910};

    /* renamed from: V0 */
    private static final ShapeDrawable f47549V0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private ColorStateList f47550A;

    /* renamed from: A0 */
    private int f47551A0;

    /* renamed from: B */
    private float f47552B;

    /* renamed from: B0 */
    private int f47553B0;

    /* renamed from: C */
    private float f47554C = -1.0f;

    /* renamed from: C0 */
    private int f47555C0;

    /* renamed from: D */
    private ColorStateList f47556D;

    /* renamed from: D0 */
    private int f47557D0;

    /* renamed from: E */
    private float f47558E;

    /* renamed from: E0 */
    private int f47559E0;

    /* renamed from: F */
    private ColorStateList f47560F;

    /* renamed from: F0 */
    private boolean f47561F0;

    /* renamed from: G */
    private CharSequence f47562G;

    /* renamed from: G0 */
    private int f47563G0;

    /* renamed from: H */
    private boolean f47564H;

    /* renamed from: H0 */
    private int f47565H0 = 255;

    /* renamed from: I */
    private Drawable f47566I;

    /* renamed from: I0 */
    private ColorFilter f47567I0;

    /* renamed from: J */
    private ColorStateList f47568J;

    /* renamed from: J0 */
    private PorterDuffColorFilter f47569J0;

    /* renamed from: K */
    private float f47570K;

    /* renamed from: K0 */
    private ColorStateList f47571K0;

    /* renamed from: L */
    private boolean f47572L;

    /* renamed from: L0 */
    private PorterDuff.Mode f47573L0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: M */
    private boolean f47574M;

    /* renamed from: M0 */
    private int[] f47575M0;

    /* renamed from: N */
    private Drawable f47576N;

    /* renamed from: N0 */
    private boolean f47577N0;

    /* renamed from: O */
    private Drawable f47578O;

    /* renamed from: O0 */
    private ColorStateList f47579O0;

    /* renamed from: P */
    private ColorStateList f47580P;

    /* renamed from: P0 */
    private WeakReference<C10075a> f47581P0 = new WeakReference<>((Object) null);

    /* renamed from: Q */
    private float f47582Q;

    /* renamed from: Q0 */
    private TextUtils.TruncateAt f47583Q0;

    /* renamed from: R */
    private CharSequence f47584R;

    /* renamed from: R0 */
    private boolean f47585R0;

    /* renamed from: S */
    private boolean f47586S;

    /* renamed from: S0 */
    private int f47587S0;

    /* renamed from: T */
    private boolean f47588T;

    /* renamed from: T0 */
    private boolean f47589T0;

    /* renamed from: U */
    private Drawable f47590U;

    /* renamed from: V */
    private ColorStateList f47591V;

    /* renamed from: W */
    private C10500h f47592W;

    /* renamed from: X */
    private C10500h f47593X;

    /* renamed from: Y */
    private float f47594Y;

    /* renamed from: Z */
    private float f47595Z;

    /* renamed from: l0 */
    private float f47596l0;

    /* renamed from: m0 */
    private float f47597m0;

    /* renamed from: n0 */
    private float f47598n0;

    /* renamed from: o0 */
    private float f47599o0;

    /* renamed from: p0 */
    private float f47600p0;

    /* renamed from: q0 */
    private float f47601q0;

    /* renamed from: r0 */
    private final Context f47602r0;

    /* renamed from: s0 */
    private final Paint f47603s0 = new Paint(1);

    /* renamed from: t0 */
    private final Paint f47604t0;

    /* renamed from: u0 */
    private final Paint.FontMetrics f47605u0 = new Paint.FontMetrics();

    /* renamed from: v0 */
    private final RectF f47606v0 = new RectF();

    /* renamed from: w0 */
    private final PointF f47607w0 = new PointF();

    /* renamed from: x0 */
    private final Path f47608x0 = new Path();

    /* renamed from: y0 */
    private final C10214j f47609y0;

    /* renamed from: z */
    private ColorStateList f47610z;

    /* renamed from: z0 */
    private int f47611z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C10075a {
        /* renamed from: a */
        void mo40035a();
    }

    private C10074a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo43084P(context);
        this.f47602r0 = context;
        C10214j jVar = new C10214j(this);
        this.f47609y0 = jVar;
        this.f47562G = "";
        jVar.mo40990e().density = context.getResources().getDisplayMetrics().density;
        this.f47604t0 = null;
        int[] iArr = f47548U0;
        setState(iArr);
        mo40316r2(iArr);
        this.f47585R0 = true;
        if (C10841b.f49599a) {
            f47549V0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private boolean m46230A0() {
        return this.f47588T && this.f47590U != null && this.f47586S;
    }

    /* renamed from: A1 */
    private void m46231A1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C10220m.m47116h(this.f47602r0, attributeSet, C6532l.f26632C0, i, i2, new int[0]);
        this.f47589T0 = h.hasValue(C6532l.f27044o1);
        m46251h2(C10805c.m48753a(this.f47602r0, h, C6532l.f26901b1));
        mo40238L1(C10805c.m48753a(this.f47602r0, h, C6532l.f26764O0));
        mo40273Z1(h.getDimension(C6532l.f26849W0, 0.0f));
        int i3 = C6532l.f26775P0;
        if (h.hasValue(i3)) {
            mo40244N1(h.getDimension(i3, 0.0f));
        }
        mo40281d2(C10805c.m48753a(this.f47602r0, h, C6532l.f26879Z0));
        mo40285f2(h.getDimension(C6532l.f26890a1, 0.0f));
        mo40224E2(C10805c.m48753a(this.f47602r0, h, C6532l.f27033n1));
        mo40234J2(h.getText(C6532l.f26698I0));
        C10806d f = C10805c.m48758f(this.f47602r0, h, C6532l.f26643D0);
        f.f49548n = h.getDimension(C6532l.f26654E0, f.f49548n);
        mo40236K2(f);
        int i4 = h.getInt(C6532l.f26676G0, 0);
        if (i4 == 1) {
            mo40332w2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            mo40332w2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo40332w2(TextUtils.TruncateAt.END);
        }
        mo40271Y1(h.getBoolean(C6532l.f26839V0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo40271Y1(h.getBoolean(C6532l.f26808S0, false));
        }
        mo40256R1(C10805c.m48756d(this.f47602r0, h, C6532l.f26797R0));
        int i5 = C6532l.f26829U0;
        if (h.hasValue(i5)) {
            mo40265V1(C10805c.m48753a(this.f47602r0, h, i5));
        }
        mo40261T1(h.getDimension(C6532l.f26819T0, -1.0f));
        mo40326u2(h.getBoolean(C6532l.f26978i1, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo40326u2(h.getBoolean(C6532l.f26923d1, false));
        }
        mo40295i2(C10805c.m48756d(this.f47602r0, h, C6532l.f26912c1));
        mo40319s2(C10805c.m48753a(this.f47602r0, h, C6532l.f26967h1));
        mo40307n2(h.getDimension(C6532l.f26945f1, 0.0f));
        mo40221D1(h.getBoolean(C6532l.f26709J0, false));
        mo40235K1(h.getBoolean(C6532l.f26753N0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo40235K1(h.getBoolean(C6532l.f26731L0, false));
        }
        mo40225F1(C10805c.m48756d(this.f47602r0, h, C6532l.f26720K0));
        int i6 = C6532l.f26742M0;
        if (h.hasValue(i6)) {
            mo40229H1(C10805c.m48753a(this.f47602r0, h, i6));
        }
        mo40230H2(C10500h.m48213c(this.f47602r0, h, C6532l.f27055p1));
        mo40333x2(C10500h.m48213c(this.f47602r0, h, C6532l.f27000k1));
        mo40277b2(h.getDimension(C6532l.f26869Y0, 0.0f));
        mo40219B2(h.getDimension(C6532l.f27022m1, 0.0f));
        mo40336z2(h.getDimension(C6532l.f27011l1, 0.0f));
        mo40248O2(h.getDimension(C6532l.f27077r1, 0.0f));
        mo40242M2(h.getDimension(C6532l.f27066q1, 0.0f));
        mo40313p2(h.getDimension(C6532l.f26956g1, 0.0f));
        mo40301k2(h.getDimension(C6532l.f26934e1, 0.0f));
        mo40250P1(h.getDimension(C6532l.f26786Q0, 0.0f));
        mo40222D2(h.getDimensionPixelSize(C6532l.f26687H0, Integer.MAX_VALUE));
        h.recycle();
    }

    /* renamed from: B0 */
    public static C10074a m46232B0(Context context, AttributeSet attributeSet, int i, int i2) {
        C10074a aVar = new C10074a(context, attributeSet, i, i2);
        aVar.m46231A1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: C0 */
    private void m46233C0(Canvas canvas, Rect rect) {
        if (m46243S2()) {
            m46253r0(rect, this.f47606v0);
            RectF rectF = this.f47606v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f47590U.setBounds(0, 0, (int) this.f47606v0.width(), (int) this.f47606v0.height());
            this.f47590U.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0152  */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m46234C1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f47610z
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f47611z0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r6.mo43107l(r1)
            int r3 = r6.f47611z0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r6.f47611z0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r6.f47550A
            if (r3 == 0) goto L_0x0028
            int r5 = r6.f47551A0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r6.mo43107l(r3)
            int r5 = r6.f47551A0
            if (r5 == r3) goto L_0x0034
            r6.f47551A0 = r3
            r0 = 1
        L_0x0034:
            int r1 = p207f6.C10538a.m48272f(r1, r3)
            int r3 = r6.f47553B0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.ColorStateList r5 = r6.mo43117x()
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r6.f47553B0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo43091a0(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r6.f47556D
            if (r1 == 0) goto L_0x0060
            int r3 = r6.f47555C0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r6.f47555C0
            if (r3 == r1) goto L_0x0068
            r6.f47555C0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r6.f47579O0
            if (r1 == 0) goto L_0x007b
            boolean r1 = p236n6.C10841b.m48834e(r7)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r6.f47579O0
            int r3 = r6.f47557D0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r6.f47557D0
            if (r3 == r1) goto L_0x0087
            r6.f47557D0 = r1
            boolean r1 = r6.f47577N0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.google.android.material.internal.j r1 = r6.f47609y0
            m6.d r1 = r1.mo40989d()
            if (r1 == 0) goto L_0x00a8
            com.google.android.material.internal.j r1 = r6.f47609y0
            m6.d r1 = r1.mo40989d()
            android.content.res.ColorStateList r1 = r1.f49535a
            if (r1 == 0) goto L_0x00a8
            com.google.android.material.internal.j r1 = r6.f47609y0
            m6.d r1 = r1.mo40989d()
            android.content.res.ColorStateList r1 = r1.f49535a
            int r3 = r6.f47559E0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a9
        L_0x00a8:
            r1 = 0
        L_0x00a9:
            int r3 = r6.f47559E0
            if (r3 == r1) goto L_0x00b0
            r6.f47559E0 = r1
            r0 = 1
        L_0x00b0:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m46256t1(r1, r3)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = r6.f47586S
            if (r1 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            boolean r3 = r6.f47561F0
            if (r3 == r1) goto L_0x00de
            android.graphics.drawable.Drawable r3 = r6.f47590U
            if (r3 == 0) goto L_0x00de
            float r0 = r6.mo40317s0()
            r6.f47561F0 = r1
            float r1 = r6.mo40317s0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            r0 = 1
            r1 = 1
            goto L_0x00df
        L_0x00dd:
            r0 = 1
        L_0x00de:
            r1 = 0
        L_0x00df:
            android.content.res.ColorStateList r3 = r6.f47571K0
            if (r3 == 0) goto L_0x00ea
            int r5 = r6.f47563G0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00eb
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            int r5 = r6.f47563G0
            if (r5 == r3) goto L_0x00fc
            r6.f47563G0 = r3
            android.content.res.ColorStateList r0 = r6.f47571K0
            android.graphics.PorterDuff$Mode r3 = r6.f47573L0
            android.graphics.PorterDuffColorFilter r0 = p214h6.C10579a.m48324b(r6, r0, r3)
            r6.f47569J0 = r0
            goto L_0x00fd
        L_0x00fc:
            r4 = r0
        L_0x00fd:
            android.graphics.drawable.Drawable r0 = r6.f47566I
            boolean r0 = m46262y1(r0)
            if (r0 == 0) goto L_0x010c
            android.graphics.drawable.Drawable r0 = r6.f47566I
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x010c:
            android.graphics.drawable.Drawable r0 = r6.f47590U
            boolean r0 = m46262y1(r0)
            if (r0 == 0) goto L_0x011b
            android.graphics.drawable.Drawable r0 = r6.f47590U
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x011b:
            android.graphics.drawable.Drawable r0 = r6.f47576N
            boolean r0 = m46262y1(r0)
            if (r0 == 0) goto L_0x0138
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f47576N
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0138:
            boolean r7 = p236n6.C10841b.f49599a
            if (r7 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r7 = r6.f47578O
            boolean r7 = m46262y1(r7)
            if (r7 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r7 = r6.f47578O
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x014b:
            if (r4 == 0) goto L_0x0150
            r6.invalidateSelf()
        L_0x0150:
            if (r1 == 0) goto L_0x0155
            r6.mo40218B1()
        L_0x0155:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C10074a.m46234C1(int[], int[]):boolean");
    }

    /* renamed from: D0 */
    private void m46235D0(Canvas canvas, Rect rect) {
        if (!this.f47589T0) {
            this.f47603s0.setColor(this.f47551A0);
            this.f47603s0.setStyle(Paint.Style.FILL);
            this.f47603s0.setColorFilter(m46254r1());
            this.f47606v0.set(rect);
            canvas.drawRoundRect(this.f47606v0, mo40246O0(), mo40246O0(), this.f47603s0);
        }
    }

    /* renamed from: E0 */
    private void m46236E0(Canvas canvas, Rect rect) {
        if (m46244T2()) {
            m46253r0(rect, this.f47606v0);
            RectF rectF = this.f47606v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f47566I.setBounds(0, 0, (int) this.f47606v0.width(), (int) this.f47606v0.height());
            this.f47566I.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: F0 */
    private void m46237F0(Canvas canvas, Rect rect) {
        if (this.f47558E > 0.0f && !this.f47589T0) {
            this.f47603s0.setColor(this.f47555C0);
            this.f47603s0.setStyle(Paint.Style.STROKE);
            if (!this.f47589T0) {
                this.f47603s0.setColorFilter(m46254r1());
            }
            RectF rectF = this.f47606v0;
            float f = this.f47558E;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f47554C - (this.f47558E / 2.0f);
            canvas.drawRoundRect(this.f47606v0, f2, f2, this.f47603s0);
        }
    }

    /* renamed from: G0 */
    private void m46238G0(Canvas canvas, Rect rect) {
        if (!this.f47589T0) {
            this.f47603s0.setColor(this.f47611z0);
            this.f47603s0.setStyle(Paint.Style.FILL);
            this.f47606v0.set(rect);
            canvas.drawRoundRect(this.f47606v0, mo40246O0(), mo40246O0(), this.f47603s0);
        }
    }

    /* renamed from: H0 */
    private void m46239H0(Canvas canvas, Rect rect) {
        if (m46245U2()) {
            m46257u0(rect, this.f47606v0);
            RectF rectF = this.f47606v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f47576N.setBounds(0, 0, (int) this.f47606v0.width(), (int) this.f47606v0.height());
            if (C10841b.f49599a) {
                this.f47578O.setBounds(this.f47576N.getBounds());
                this.f47578O.jumpToCurrentState();
                this.f47578O.draw(canvas);
            } else {
                this.f47576N.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: I0 */
    private void m46240I0(Canvas canvas, Rect rect) {
        this.f47603s0.setColor(this.f47557D0);
        this.f47603s0.setStyle(Paint.Style.FILL);
        this.f47606v0.set(rect);
        if (!this.f47589T0) {
            canvas.drawRoundRect(this.f47606v0, mo40246O0(), mo40246O0(), this.f47603s0);
            return;
        }
        mo43101h(new RectF(rect), this.f47608x0);
        super.mo43112p(canvas, this.f47603s0, this.f47608x0, mo43115u());
    }

    /* renamed from: J0 */
    private void m46241J0(Canvas canvas, Rect rect) {
        Paint paint = this.f47604t0;
        if (paint != null) {
            paint.setColor(C2617a.m9119m(-16777216, 127));
            canvas.drawRect(rect, this.f47604t0);
            if (m46244T2() || m46243S2()) {
                m46253r0(rect, this.f47606v0);
                canvas.drawRect(this.f47606v0, this.f47604t0);
            }
            if (this.f47562G != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f47604t0);
            }
            if (m46245U2()) {
                m46257u0(rect, this.f47606v0);
                canvas.drawRect(this.f47606v0, this.f47604t0);
            }
            this.f47604t0.setColor(C2617a.m9119m(-65536, 127));
            m46255t0(rect, this.f47606v0);
            canvas.drawRect(this.f47606v0, this.f47604t0);
            this.f47604t0.setColor(C2617a.m9119m(-16711936, 127));
            m46258v0(rect, this.f47606v0);
            canvas.drawRect(this.f47606v0, this.f47604t0);
        }
    }

    /* renamed from: K0 */
    private void m46242K0(Canvas canvas, Rect rect) {
        if (this.f47562G != null) {
            Paint.Align z0 = mo40335z0(rect, this.f47607w0);
            m46259x0(rect, this.f47606v0);
            if (this.f47609y0.mo40989d() != null) {
                this.f47609y0.mo40990e().drawableState = getState();
                this.f47609y0.mo40995j(this.f47602r0);
            }
            this.f47609y0.mo40990e().setTextAlign(z0);
            int i = 0;
            boolean z = Math.round(this.f47609y0.mo40991f(mo40306n1().toString())) > Math.round(this.f47606v0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f47606v0);
            }
            CharSequence charSequence = this.f47562G;
            if (z && this.f47583Q0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f47609y0.mo40990e(), this.f47606v0.width(), this.f47583Q0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f47607w0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f47609y0.mo40990e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: S2 */
    private boolean m46243S2() {
        return this.f47588T && this.f47590U != null && this.f47561F0;
    }

    /* renamed from: T2 */
    private boolean m46244T2() {
        return this.f47564H && this.f47566I != null;
    }

    /* renamed from: U2 */
    private boolean m46245U2() {
        return this.f47574M && this.f47576N != null;
    }

    /* renamed from: V2 */
    private void m46246V2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: W2 */
    private void m46247W2() {
        this.f47579O0 = this.f47577N0 ? C10841b.m48833d(this.f47560F) : null;
    }

    @TargetApi(21)
    /* renamed from: X2 */
    private void m46248X2() {
        this.f47578O = new RippleDrawable(C10841b.m48833d(mo40302l1()), this.f47576N, f47549V0);
    }

    /* renamed from: f1 */
    private float m46249f1() {
        Drawable drawable = this.f47561F0 ? this.f47590U : this.f47566I;
        float f = this.f47570K;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil((double) C10227s.m47135c(this.f47602r0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: g1 */
    private float m46250g1() {
        Drawable drawable = this.f47561F0 ? this.f47590U : this.f47566I;
        float f = this.f47570K;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: h2 */
    private void m46251h2(ColorStateList colorStateList) {
        if (this.f47610z != colorStateList) {
            this.f47610z = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: q0 */
    private void m46252q0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C5135a.m23413m(drawable, C5135a.m23406f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f47576N) {
                if (drawable.isStateful()) {
                    drawable.setState(mo40278c1());
                }
                C5135a.m23415o(drawable, this.f47580P);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f47566I;
            if (drawable == drawable2 && this.f47572L) {
                C5135a.m23415o(drawable2, this.f47568J);
            }
        }
    }

    /* renamed from: r0 */
    private void m46253r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m46244T2() || m46243S2()) {
            float f = this.f47594Y + this.f47595Z;
            float g1 = m46250g1();
            if (C5135a.m23406f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + g1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - g1;
            }
            float f1 = m46249f1();
            float exactCenterY = rect.exactCenterY() - (f1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f1;
        }
    }

    /* renamed from: r1 */
    private ColorFilter m46254r1() {
        ColorFilter colorFilter = this.f47567I0;
        return colorFilter != null ? colorFilter : this.f47569J0;
    }

    /* renamed from: t0 */
    private void m46255t0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m46245U2()) {
            float f = this.f47601q0 + this.f47600p0 + this.f47582Q + this.f47599o0 + this.f47598n0;
            if (C5135a.m23406f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: t1 */
    private static boolean m46256t1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u0 */
    private void m46257u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m46245U2()) {
            float f = this.f47601q0 + this.f47600p0;
            if (C5135a.m23406f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f47582Q;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f47582Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f47582Q;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: v0 */
    private void m46258v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m46245U2()) {
            float f = this.f47601q0 + this.f47600p0 + this.f47582Q + this.f47599o0 + this.f47598n0;
            if (C5135a.m23406f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: x0 */
    private void m46259x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f47562G != null) {
            float s0 = this.f47594Y + mo40317s0() + this.f47597m0;
            float w0 = this.f47601q0 + mo40330w0() + this.f47598n0;
            if (C5135a.m23406f(this) == 0) {
                rectF.left = ((float) rect.left) + s0;
                rectF.right = ((float) rect.right) - w0;
            } else {
                rectF.left = ((float) rect.left) + w0;
                rectF.right = ((float) rect.right) - s0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: x1 */
    private static boolean m46260x1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: y0 */
    private float m46261y0() {
        this.f47609y0.mo40990e().getFontMetrics(this.f47605u0);
        Paint.FontMetrics fontMetrics = this.f47605u0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: y1 */
    private static boolean m46262y1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f49535a;
     */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m46263z1(p232m6.C10806d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f49535a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C10074a.m46263z1(m6.d):boolean");
    }

    /* renamed from: A2 */
    public void mo40217A2(int i) {
        mo40336z2(this.f47602r0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B1 */
    public void mo40218B1() {
        C10075a aVar = (C10075a) this.f47581P0.get();
        if (aVar != null) {
            aVar.mo40035a();
        }
    }

    /* renamed from: B2 */
    public void mo40219B2(float f) {
        if (this.f47595Z != f) {
            float s0 = mo40317s0();
            this.f47595Z = f;
            float s02 = mo40317s0();
            invalidateSelf();
            if (s0 != s02) {
                mo40218B1();
            }
        }
    }

    /* renamed from: C2 */
    public void mo40220C2(int i) {
        mo40219B2(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: D1 */
    public void mo40221D1(boolean z) {
        if (this.f47586S != z) {
            this.f47586S = z;
            float s0 = mo40317s0();
            if (!z && this.f47561F0) {
                this.f47561F0 = false;
            }
            float s02 = mo40317s0();
            invalidateSelf();
            if (s0 != s02) {
                mo40218B1();
            }
        }
    }

    /* renamed from: D2 */
    public void mo40222D2(int i) {
        this.f47587S0 = i;
    }

    /* renamed from: E1 */
    public void mo40223E1(int i) {
        mo40221D1(this.f47602r0.getResources().getBoolean(i));
    }

    /* renamed from: E2 */
    public void mo40224E2(ColorStateList colorStateList) {
        if (this.f47560F != colorStateList) {
            this.f47560F = colorStateList;
            m46247W2();
            onStateChange(getState());
        }
    }

    /* renamed from: F1 */
    public void mo40225F1(Drawable drawable) {
        if (this.f47590U != drawable) {
            float s0 = mo40317s0();
            this.f47590U = drawable;
            float s02 = mo40317s0();
            m46246V2(this.f47590U);
            m46252q0(this.f47590U);
            invalidateSelf();
            if (s0 != s02) {
                mo40218B1();
            }
        }
    }

    /* renamed from: F2 */
    public void mo40226F2(int i) {
        mo40224E2(C5264a.m23788c(this.f47602r0, i));
    }

    /* renamed from: G1 */
    public void mo40227G1(int i) {
        mo40225F1(C5264a.m23789d(this.f47602r0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public void mo40228G2(boolean z) {
        this.f47585R0 = z;
    }

    /* renamed from: H1 */
    public void mo40229H1(ColorStateList colorStateList) {
        if (this.f47591V != colorStateList) {
            this.f47591V = colorStateList;
            if (m46230A0()) {
                C5135a.m23415o(this.f47590U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H2 */
    public void mo40230H2(C10500h hVar) {
        this.f47592W = hVar;
    }

    /* renamed from: I1 */
    public void mo40231I1(int i) {
        mo40229H1(C5264a.m23788c(this.f47602r0, i));
    }

    /* renamed from: I2 */
    public void mo40232I2(int i) {
        mo40230H2(C10500h.m48214d(this.f47602r0, i));
    }

    /* renamed from: J1 */
    public void mo40233J1(int i) {
        mo40235K1(this.f47602r0.getResources().getBoolean(i));
    }

    /* renamed from: J2 */
    public void mo40234J2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f47562G, charSequence)) {
            this.f47562G = charSequence;
            this.f47609y0.mo40994i(true);
            invalidateSelf();
            mo40218B1();
        }
    }

    /* renamed from: K1 */
    public void mo40235K1(boolean z) {
        if (this.f47588T != z) {
            boolean S2 = m46243S2();
            this.f47588T = z;
            boolean S22 = m46243S2();
            if (S2 != S22) {
                if (S22) {
                    m46252q0(this.f47590U);
                } else {
                    m46246V2(this.f47590U);
                }
                invalidateSelf();
                mo40218B1();
            }
        }
    }

    /* renamed from: K2 */
    public void mo40236K2(C10806d dVar) {
        this.f47609y0.mo40993h(dVar, this.f47602r0);
    }

    /* renamed from: L0 */
    public Drawable mo40237L0() {
        return this.f47590U;
    }

    /* renamed from: L1 */
    public void mo40238L1(ColorStateList colorStateList) {
        if (this.f47550A != colorStateList) {
            this.f47550A = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: L2 */
    public void mo40239L2(int i) {
        mo40236K2(new C10806d(this.f47602r0, i));
    }

    /* renamed from: M0 */
    public ColorStateList mo40240M0() {
        return this.f47591V;
    }

    /* renamed from: M1 */
    public void mo40241M1(int i) {
        mo40238L1(C5264a.m23788c(this.f47602r0, i));
    }

    /* renamed from: M2 */
    public void mo40242M2(float f) {
        if (this.f47598n0 != f) {
            this.f47598n0 = f;
            invalidateSelf();
            mo40218B1();
        }
    }

    /* renamed from: N0 */
    public ColorStateList mo40243N0() {
        return this.f47550A;
    }

    @Deprecated
    /* renamed from: N1 */
    public void mo40244N1(float f) {
        if (this.f47554C != f) {
            this.f47554C = f;
            setShapeAppearanceModel(mo43076D().mo43141w(f));
        }
    }

    /* renamed from: N2 */
    public void mo40245N2(int i) {
        mo40242M2(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: O0 */
    public float mo40246O0() {
        return this.f47589T0 ? mo43080I() : this.f47554C;
    }

    @Deprecated
    /* renamed from: O1 */
    public void mo40247O1(int i) {
        mo40244N1(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: O2 */
    public void mo40248O2(float f) {
        if (this.f47597m0 != f) {
            this.f47597m0 = f;
            invalidateSelf();
            mo40218B1();
        }
    }

    /* renamed from: P0 */
    public float mo40249P0() {
        return this.f47601q0;
    }

    /* renamed from: P1 */
    public void mo40250P1(float f) {
        if (this.f47601q0 != f) {
            this.f47601q0 = f;
            invalidateSelf();
            mo40218B1();
        }
    }

    /* renamed from: P2 */
    public void mo40251P2(int i) {
        mo40248O2(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: Q0 */
    public Drawable mo40252Q0() {
        Drawable drawable = this.f47566I;
        if (drawable != null) {
            return C5135a.m23417q(drawable);
        }
        return null;
    }

    /* renamed from: Q1 */
    public void mo40253Q1(int i) {
        mo40250P1(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: Q2 */
    public void mo40254Q2(boolean z) {
        if (this.f47577N0 != z) {
            this.f47577N0 = z;
            m46247W2();
            onStateChange(getState());
        }
    }

    /* renamed from: R0 */
    public float mo40255R0() {
        return this.f47570K;
    }

    /* renamed from: R1 */
    public void mo40256R1(Drawable drawable) {
        Drawable Q0 = mo40252Q0();
        if (Q0 != drawable) {
            float s0 = mo40317s0();
            this.f47566I = drawable != null ? C5135a.m23418r(drawable).mutate() : null;
            float s02 = mo40317s0();
            m46246V2(Q0);
            if (m46244T2()) {
                m46252q0(this.f47566I);
            }
            invalidateSelf();
            if (s0 != s02) {
                mo40218B1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R2 */
    public boolean mo40257R2() {
        return this.f47585R0;
    }

    /* renamed from: S0 */
    public ColorStateList mo40258S0() {
        return this.f47568J;
    }

    /* renamed from: S1 */
    public void mo40259S1(int i) {
        mo40256R1(C5264a.m23789d(this.f47602r0, i));
    }

    /* renamed from: T0 */
    public float mo40260T0() {
        return this.f47552B;
    }

    /* renamed from: T1 */
    public void mo40261T1(float f) {
        if (this.f47570K != f) {
            float s0 = mo40317s0();
            this.f47570K = f;
            float s02 = mo40317s0();
            invalidateSelf();
            if (s0 != s02) {
                mo40218B1();
            }
        }
    }

    /* renamed from: U0 */
    public float mo40262U0() {
        return this.f47594Y;
    }

    /* renamed from: U1 */
    public void mo40263U1(int i) {
        mo40261T1(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: V0 */
    public ColorStateList mo40264V0() {
        return this.f47556D;
    }

    /* renamed from: V1 */
    public void mo40265V1(ColorStateList colorStateList) {
        this.f47572L = true;
        if (this.f47568J != colorStateList) {
            this.f47568J = colorStateList;
            if (m46244T2()) {
                C5135a.m23415o(this.f47566I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: W0 */
    public float mo40266W0() {
        return this.f47558E;
    }

    /* renamed from: W1 */
    public void mo40267W1(int i) {
        mo40265V1(C5264a.m23788c(this.f47602r0, i));
    }

    /* renamed from: X0 */
    public Drawable mo40268X0() {
        Drawable drawable = this.f47576N;
        if (drawable != null) {
            return C5135a.m23417q(drawable);
        }
        return null;
    }

    /* renamed from: X1 */
    public void mo40269X1(int i) {
        mo40271Y1(this.f47602r0.getResources().getBoolean(i));
    }

    /* renamed from: Y0 */
    public CharSequence mo40270Y0() {
        return this.f47584R;
    }

    /* renamed from: Y1 */
    public void mo40271Y1(boolean z) {
        if (this.f47564H != z) {
            boolean T2 = m46244T2();
            this.f47564H = z;
            boolean T22 = m46244T2();
            if (T2 != T22) {
                if (T22) {
                    m46252q0(this.f47566I);
                } else {
                    m46246V2(this.f47566I);
                }
                invalidateSelf();
                mo40218B1();
            }
        }
    }

    /* renamed from: Z0 */
    public float mo40272Z0() {
        return this.f47600p0;
    }

    /* renamed from: Z1 */
    public void mo40273Z1(float f) {
        if (this.f47552B != f) {
            this.f47552B = f;
            invalidateSelf();
            mo40218B1();
        }
    }

    /* renamed from: a */
    public void mo39691a() {
        mo40218B1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public float mo40274a1() {
        return this.f47582Q;
    }

    /* renamed from: a2 */
    public void mo40275a2(int i) {
        mo40273Z1(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public float mo40276b1() {
        return this.f47599o0;
    }

    /* renamed from: b2 */
    public void mo40277b2(float f) {
        if (this.f47594Y != f) {
            this.f47594Y = f;
            invalidateSelf();
            mo40218B1();
        }
    }

    /* renamed from: c1 */
    public int[] mo40278c1() {
        return this.f47575M0;
    }

    /* renamed from: c2 */
    public void mo40279c2(int i) {
        mo40277b2(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: d1 */
    public ColorStateList mo40280d1() {
        return this.f47580P;
    }

    /* renamed from: d2 */
    public void mo40281d2(ColorStateList colorStateList) {
        if (this.f47556D != colorStateList) {
            this.f47556D = colorStateList;
            if (this.f47589T0) {
                mo43108l0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f47565H0;
            if (i2 < 255) {
                i = C10515a.m48245a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m46238G0(canvas, bounds);
            m46235D0(canvas, bounds);
            if (this.f47589T0) {
                super.draw(canvas);
            }
            m46237F0(canvas, bounds);
            m46240I0(canvas, bounds);
            m46236E0(canvas, bounds);
            m46233C0(canvas, bounds);
            if (this.f47585R0) {
                m46242K0(canvas, bounds);
            }
            m46239H0(canvas, bounds);
            m46241J0(canvas, bounds);
            if (this.f47565H0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public void mo40283e1(RectF rectF) {
        m46258v0(getBounds(), rectF);
    }

    /* renamed from: e2 */
    public void mo40284e2(int i) {
        mo40281d2(C5264a.m23788c(this.f47602r0, i));
    }

    /* renamed from: f2 */
    public void mo40285f2(float f) {
        if (this.f47558E != f) {
            this.f47558E = f;
            this.f47603s0.setStrokeWidth(f);
            if (this.f47589T0) {
                super.mo43109m0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: g2 */
    public void mo40286g2(int i) {
        mo40285f2(this.f47602r0.getResources().getDimension(i));
    }

    public int getAlpha() {
        return this.f47565H0;
    }

    public ColorFilter getColorFilter() {
        return this.f47567I0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f47552B;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f47594Y + mo40317s0() + this.f47597m0 + this.f47609y0.mo40991f(mo40306n1().toString()) + this.f47598n0 + mo40330w0() + this.f47601q0), this.f47587S0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f47589T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f47554C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f47554C);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public TextUtils.TruncateAt mo40293h1() {
        return this.f47583Q0;
    }

    /* renamed from: i1 */
    public C10500h mo40294i1() {
        return this.f47593X;
    }

    /* renamed from: i2 */
    public void mo40295i2(Drawable drawable) {
        Drawable X0 = mo40268X0();
        if (X0 != drawable) {
            float w0 = mo40330w0();
            this.f47576N = drawable != null ? C5135a.m23418r(drawable).mutate() : null;
            if (C10841b.f49599a) {
                m46248X2();
            }
            float w02 = mo40330w0();
            m46246V2(X0);
            if (m46245U2()) {
                m46252q0(this.f47576N);
            }
            invalidateSelf();
            if (w0 != w02) {
                mo40218B1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m46260x1(this.f47610z) || m46260x1(this.f47550A) || m46260x1(this.f47556D) || (this.f47577N0 && m46260x1(this.f47579O0)) || m46263z1(this.f47609y0.mo40989d()) || m46230A0() || m46262y1(this.f47566I) || m46262y1(this.f47590U) || m46260x1(this.f47571K0);
    }

    /* renamed from: j1 */
    public float mo40298j1() {
        return this.f47596l0;
    }

    /* renamed from: j2 */
    public void mo40299j2(CharSequence charSequence) {
        if (this.f47584R != charSequence) {
            this.f47584R = C5535a.m24694c().mo22076h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: k1 */
    public float mo40300k1() {
        return this.f47595Z;
    }

    /* renamed from: k2 */
    public void mo40301k2(float f) {
        if (this.f47600p0 != f) {
            this.f47600p0 = f;
            invalidateSelf();
            if (m46245U2()) {
                mo40218B1();
            }
        }
    }

    /* renamed from: l1 */
    public ColorStateList mo40302l1() {
        return this.f47560F;
    }

    /* renamed from: l2 */
    public void mo40303l2(int i) {
        mo40301k2(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: m1 */
    public C10500h mo40304m1() {
        return this.f47592W;
    }

    /* renamed from: m2 */
    public void mo40305m2(int i) {
        mo40295i2(C5264a.m23789d(this.f47602r0, i));
    }

    /* renamed from: n1 */
    public CharSequence mo40306n1() {
        return this.f47562G;
    }

    /* renamed from: n2 */
    public void mo40307n2(float f) {
        if (this.f47582Q != f) {
            this.f47582Q = f;
            invalidateSelf();
            if (m46245U2()) {
                mo40218B1();
            }
        }
    }

    /* renamed from: o1 */
    public C10806d mo40308o1() {
        return this.f47609y0.mo40989d();
    }

    /* renamed from: o2 */
    public void mo40309o2(int i) {
        mo40307n2(this.f47602r0.getResources().getDimension(i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m46244T2()) {
            onLayoutDirectionChanged |= C5135a.m23413m(this.f47566I, i);
        }
        if (m46243S2()) {
            onLayoutDirectionChanged |= C5135a.m23413m(this.f47590U, i);
        }
        if (m46245U2()) {
            onLayoutDirectionChanged |= C5135a.m23413m(this.f47576N, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m46244T2()) {
            onLevelChange |= this.f47566I.setLevel(i);
        }
        if (m46243S2()) {
            onLevelChange |= this.f47590U.setLevel(i);
        }
        if (m46245U2()) {
            onLevelChange |= this.f47576N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f47589T0) {
            super.onStateChange(iArr);
        }
        return m46234C1(iArr, mo40278c1());
    }

    /* renamed from: p1 */
    public float mo40312p1() {
        return this.f47598n0;
    }

    /* renamed from: p2 */
    public void mo40313p2(float f) {
        if (this.f47599o0 != f) {
            this.f47599o0 = f;
            invalidateSelf();
            if (m46245U2()) {
                mo40218B1();
            }
        }
    }

    /* renamed from: q1 */
    public float mo40314q1() {
        return this.f47597m0;
    }

    /* renamed from: q2 */
    public void mo40315q2(int i) {
        mo40313p2(this.f47602r0.getResources().getDimension(i));
    }

    /* renamed from: r2 */
    public boolean mo40316r2(int[] iArr) {
        if (Arrays.equals(this.f47575M0, iArr)) {
            return false;
        }
        this.f47575M0 = iArr;
        if (m46245U2()) {
            return m46234C1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public float mo40317s0() {
        if (m46244T2() || m46243S2()) {
            return this.f47595Z + m46250g1() + this.f47596l0;
        }
        return 0.0f;
    }

    /* renamed from: s1 */
    public boolean mo40318s1() {
        return this.f47577N0;
    }

    /* renamed from: s2 */
    public void mo40319s2(ColorStateList colorStateList) {
        if (this.f47580P != colorStateList) {
            this.f47580P = colorStateList;
            if (m46245U2()) {
                C5135a.m23415o(this.f47576N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f47565H0 != i) {
            this.f47565H0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f47567I0 != colorFilter) {
            this.f47567I0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f47571K0 != colorStateList) {
            this.f47571K0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f47573L0 != mode) {
            this.f47573L0 = mode;
            this.f47569J0 = C10579a.m48324b(this, this.f47571K0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m46244T2()) {
            visible |= this.f47566I.setVisible(z, z2);
        }
        if (m46243S2()) {
            visible |= this.f47590U.setVisible(z, z2);
        }
        if (m46245U2()) {
            visible |= this.f47576N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void mo40324t2(int i) {
        mo40319s2(C5264a.m23788c(this.f47602r0, i));
    }

    /* renamed from: u1 */
    public boolean mo40325u1() {
        return this.f47586S;
    }

    /* renamed from: u2 */
    public void mo40326u2(boolean z) {
        if (this.f47574M != z) {
            boolean U2 = m46245U2();
            this.f47574M = z;
            boolean U22 = m46245U2();
            if (U2 != U22) {
                if (U22) {
                    m46252q0(this.f47576N);
                } else {
                    m46246V2(this.f47576N);
                }
                invalidateSelf();
                mo40218B1();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public boolean mo40328v1() {
        return m46262y1(this.f47576N);
    }

    /* renamed from: v2 */
    public void mo40329v2(C10075a aVar) {
        this.f47581P0 = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public float mo40330w0() {
        if (m46245U2()) {
            return this.f47599o0 + this.f47582Q + this.f47600p0;
        }
        return 0.0f;
    }

    /* renamed from: w1 */
    public boolean mo40331w1() {
        return this.f47574M;
    }

    /* renamed from: w2 */
    public void mo40332w2(TextUtils.TruncateAt truncateAt) {
        this.f47583Q0 = truncateAt;
    }

    /* renamed from: x2 */
    public void mo40333x2(C10500h hVar) {
        this.f47593X = hVar;
    }

    /* renamed from: y2 */
    public void mo40334y2(int i) {
        mo40333x2(C10500h.m48214d(this.f47602r0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public Paint.Align mo40335z0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f47562G != null) {
            float s0 = this.f47594Y + mo40317s0() + this.f47597m0;
            if (C5135a.m23406f(this) == 0) {
                pointF.x = ((float) rect.left) + s0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - s0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m46261y0();
        }
        return align;
    }

    /* renamed from: z2 */
    public void mo40336z2(float f) {
        if (this.f47596l0 != f) {
            float s0 = mo40317s0();
            this.f47596l0 = f;
            float s02 = mo40317s0();
            invalidateSelf();
            if (s0 != s02) {
                mo40218B1();
            }
        }
    }
}
