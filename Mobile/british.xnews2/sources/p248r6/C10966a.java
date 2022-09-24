package p248r6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.C10214j;
import com.google.android.material.internal.C10220m;
import p016c0.C2617a;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6531k;
import p193c6.C6532l;
import p199d6.C10493a;
import p207f6.C10538a;
import p232m6.C10805c;
import p232m6.C10806d;
import p242p6.C10887f;
import p242p6.C10888g;
import p242p6.C10889h;
import p242p6.C10894j;

/* renamed from: r6.a */
/* compiled from: TooltipDrawable */
public class C10966a extends C10889h implements C10214j.C10216b {

    /* renamed from: Q */
    private static final int f49916Q = C6531k.Widget_MaterialComponents_Tooltip;

    /* renamed from: R */
    private static final int f49917R = C6522b.tooltipStyle;

    /* renamed from: A */
    private final Context f49918A;

    /* renamed from: B */
    private final Paint.FontMetrics f49919B = new Paint.FontMetrics();

    /* renamed from: C */
    private final C10214j f49920C;

    /* renamed from: D */
    private final View.OnLayoutChangeListener f49921D;

    /* renamed from: E */
    private final Rect f49922E;

    /* renamed from: F */
    private int f49923F;

    /* renamed from: G */
    private int f49924G;

    /* renamed from: H */
    private int f49925H;

    /* renamed from: I */
    private int f49926I;

    /* renamed from: J */
    private int f49927J;

    /* renamed from: K */
    private int f49928K;

    /* renamed from: L */
    private float f49929L;

    /* renamed from: M */
    private float f49930M;

    /* renamed from: N */
    private final float f49931N;

    /* renamed from: O */
    private float f49932O;

    /* renamed from: P */
    private float f49933P;

    /* renamed from: z */
    private CharSequence f49934z;

    /* renamed from: r6.a$a */
    /* compiled from: TooltipDrawable */
    class C10967a implements View.OnLayoutChangeListener {
        C10967a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C10966a.this.m49304E0(view);
        }
    }

    private C10966a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C10214j jVar = new C10214j(this);
        this.f49920C = jVar;
        this.f49921D = new C10967a();
        this.f49922E = new Rect();
        this.f49929L = 1.0f;
        this.f49930M = 1.0f;
        this.f49931N = 0.5f;
        this.f49932O = 0.5f;
        this.f49933P = 1.0f;
        this.f49918A = context;
        jVar.mo40990e().density = context.getResources().getDisplayMetrics().density;
        jVar.mo40990e().setTextAlign(Paint.Align.CENTER);
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m49304E0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f49928K = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f49922E);
    }

    /* renamed from: r0 */
    private float m49306r0() {
        int i;
        if (((this.f49922E.right - getBounds().right) - this.f49928K) - this.f49926I < 0) {
            i = ((this.f49922E.right - getBounds().right) - this.f49928K) - this.f49926I;
        } else if (((this.f49922E.left - getBounds().left) - this.f49928K) + this.f49926I <= 0) {
            return 0.0f;
        } else {
            i = ((this.f49922E.left - getBounds().left) - this.f49928K) + this.f49926I;
        }
        return (float) i;
    }

    /* renamed from: s0 */
    private float m49307s0() {
        this.f49920C.mo40990e().getFontMetrics(this.f49919B);
        Paint.FontMetrics fontMetrics = this.f49919B;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: t0 */
    private float m49308t0(Rect rect) {
        return ((float) rect.centerY()) - m49307s0();
    }

    /* renamed from: u0 */
    public static C10966a m49309u0(Context context, AttributeSet attributeSet, int i, int i2) {
        C10966a aVar = new C10966a(context, attributeSet, i, i2);
        aVar.m49313z0(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: v0 */
    private C10887f m49310v0() {
        double width = (double) getBounds().width();
        double d = (double) this.f49927J;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        Double.isNaN(width);
        float f = ((float) (width - (d * sqrt))) / 2.0f;
        return new C10894j(new C10888g((float) this.f49927J), Math.min(Math.max(-m49306r0(), -f), f));
    }

    /* renamed from: x0 */
    private void m49311x0(Canvas canvas) {
        if (this.f49934z != null) {
            Rect bounds = getBounds();
            int t0 = (int) m49308t0(bounds);
            if (this.f49920C.mo40989d() != null) {
                this.f49920C.mo40990e().drawableState = getState();
                this.f49920C.mo40995j(this.f49918A);
                this.f49920C.mo40990e().setAlpha((int) (this.f49933P * 255.0f));
            }
            CharSequence charSequence = this.f49934z;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) t0, this.f49920C.mo40990e());
        }
    }

    /* renamed from: y0 */
    private float m49312y0() {
        CharSequence charSequence = this.f49934z;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f49920C.mo40991f(charSequence.toString());
    }

    /* renamed from: z0 */
    private void m49313z0(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C10220m.m47116h(this.f49918A, attributeSet, C6532l.f26663E9, i, i2, new int[0]);
        this.f49927J = this.f49918A.getResources().getDimensionPixelSize(C6524d.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(mo43076D().mo43140v().mo43159s(m49310v0()).mo43154m());
        mo43261C0(h.getText(C6532l.f26729K9));
        mo43262D0(C10805c.m48758f(this.f49918A, h, C6532l.f26674F9));
        mo43091a0(ColorStateList.valueOf(h.getColor(C6532l.f26740L9, C10538a.m48272f(C2617a.m9119m(C10538a.m48269c(this.f49918A, 16842801, C10966a.class.getCanonicalName()), 229), C2617a.m9119m(C10538a.m48269c(this.f49918A, C6522b.colorOnBackground, C10966a.class.getCanonicalName()), 153)))));
        mo43108l0(ColorStateList.valueOf(C10538a.m48269c(this.f49918A, C6522b.colorSurface, C10966a.class.getCanonicalName())));
        this.f49923F = h.getDimensionPixelSize(C6532l.f26685G9, 0);
        this.f49924G = h.getDimensionPixelSize(C6532l.f26707I9, 0);
        this.f49925H = h.getDimensionPixelSize(C6532l.f26718J9, 0);
        this.f49926I = h.getDimensionPixelSize(C6532l.f26696H9, 0);
        h.recycle();
    }

    /* renamed from: A0 */
    public void mo43259A0(View view) {
        if (view != null) {
            m49304E0(view);
            view.addOnLayoutChangeListener(this.f49921D);
        }
    }

    /* renamed from: B0 */
    public void mo43260B0(float f) {
        this.f49932O = 1.2f;
        this.f49929L = f;
        this.f49930M = f;
        this.f49933P = C10493a.m48199b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: C0 */
    public void mo43261C0(CharSequence charSequence) {
        if (!TextUtils.equals(this.f49934z, charSequence)) {
            this.f49934z = charSequence;
            this.f49920C.mo40994i(true);
            invalidateSelf();
        }
    }

    /* renamed from: D0 */
    public void mo43262D0(C10806d dVar) {
        this.f49920C.mo40993h(dVar, this.f49918A);
    }

    /* renamed from: a */
    public void mo39691a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        float r0 = m49306r0();
        double d = (double) this.f49927J;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        double d2 = d * sqrt;
        double d3 = (double) this.f49927J;
        Double.isNaN(d3);
        canvas.scale(this.f49929L, this.f49930M, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.f49932O));
        canvas.translate(r0, (float) (-(d2 - d3)));
        super.draw(canvas);
        m49311x0(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f49920C.mo40990e().getTextSize(), (float) this.f49925H);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f49923F * 2)) + m49312y0(), (float) this.f49924G);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(mo43076D().mo43140v().mo43159s(m49310v0()).mo43154m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: w0 */
    public void mo43265w0(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f49921D);
        }
    }
}
