package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p079g.C5264a;
import p194c6.C6531k;
import p243p6.C10889h;
import p243p6.C10897m;
import p243p6.C10901n;
import p243p6.C10913p;

public class ShapeableImageView extends AppCompatImageView implements C10913p {

    /* renamed from: v */
    private static final int f47940v = C6531k.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: d */
    private final C10901n f47941d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RectF f47942e;

    /* renamed from: f */
    private final RectF f47943f;

    /* renamed from: g */
    private final Paint f47944g;

    /* renamed from: h */
    private final Paint f47945h;

    /* renamed from: i */
    private final Path f47946i;

    /* renamed from: j */
    private ColorStateList f47947j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10889h f47948k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C10897m f47949l;

    /* renamed from: m */
    private float f47950m;

    /* renamed from: n */
    private Path f47951n;

    /* renamed from: o */
    private int f47952o;

    /* renamed from: p */
    private int f47953p;

    /* renamed from: q */
    private int f47954q;

    /* renamed from: r */
    private int f47955r;

    /* renamed from: s */
    private int f47956s;

    /* renamed from: t */
    private int f47957t;

    /* renamed from: u */
    private boolean f47958u;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    class C10180a extends ViewOutlineProvider {

        /* renamed from: a */
        private final Rect f47959a = new Rect();

        C10180a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f47949l != null) {
                if (ShapeableImageView.this.f47948k == null) {
                    C10889h unused = ShapeableImageView.this.f47948k = new C10889h(ShapeableImageView.this.f47949l);
                }
                ShapeableImageView.this.f47942e.round(this.f47959a);
                ShapeableImageView.this.f47948k.setBounds(this.f47959a);
                ShapeableImageView.this.f47948k.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private void m46899g(Canvas canvas) {
        if (this.f47947j != null) {
            this.f47944g.setStrokeWidth(this.f47950m);
            int colorForState = this.f47947j.getColorForState(getDrawableState(), this.f47947j.getDefaultColor());
            if (this.f47950m > 0.0f && colorForState != 0) {
                this.f47944g.setColor(colorForState);
                canvas.drawPath(this.f47946i, this.f47944g);
            }
        }
    }

    /* renamed from: h */
    private boolean m46900h() {
        return (this.f47956s == Integer.MIN_VALUE && this.f47957t == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: i */
    private boolean m46901i() {
        return Build.VERSION.SDK_INT >= 17 && getLayoutDirection() == 1;
    }

    /* renamed from: j */
    private void m46902j(int i, int i2) {
        this.f47942e.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f47941d.mo43167d(this.f47949l, 1.0f, this.f47942e, this.f47946i);
        this.f47951n.rewind();
        this.f47951n.addPath(this.f47946i);
        this.f47943f.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f47951n.addRect(this.f47943f, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f47955r;
    }

    public final int getContentPaddingEnd() {
        int i = this.f47957t;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m46901i() ? this.f47952o : this.f47954q;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (m46900h()) {
            if (m46901i() && (i2 = this.f47957t) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m46901i() && (i = this.f47956s) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f47952o;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (m46900h()) {
            if (m46901i() && (i2 = this.f47956s) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m46901i() && (i = this.f47957t) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f47954q;
    }

    public final int getContentPaddingStart() {
        int i = this.f47956s;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m46901i() ? this.f47954q : this.f47952o;
    }

    public int getContentPaddingTop() {
        return this.f47953p;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C10897m getShapeAppearanceModel() {
        return this.f47949l;
    }

    public ColorStateList getStrokeColor() {
        return this.f47947j;
    }

    public float getStrokeWidth() {
        return this.f47950m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f47951n, this.f47945h);
        m46899g(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f47958u) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 19 || isLayoutDirectionResolved()) {
                this.f47958u = true;
                if (i3 < 21 || (!isPaddingRelative() && !m46900h())) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                } else {
                    setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m46902j(i, i2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        this.f47949l = mVar;
        C10889h hVar = this.f47948k;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        m46902j(getWidth(), getHeight());
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f47947j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C5264a.m23788c(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f47950m != f) {
            this.f47950m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f47940v
            android.content.Context r7 = p246q6.C10962a.m49296c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            p6.n r7 = p243p6.C10901n.m49062k()
            r6.f47941d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f47946i = r7
            r7 = 0
            r6.f47958u = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f47945h = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f47942e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f47943f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f47951n = r2
            int[] r2 = p194c6.C6532l.f27115u6
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = p194c6.C6532l.f26638C6
            android.content.res.ColorStateList r4 = p233m6.C10805c.m48753a(r1, r2, r4)
            r6.f47947j = r4
            int r4 = p194c6.C6532l.f26649D6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f47950m = r4
            int r4 = p194c6.C6532l.f27126v6
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f47952o = r7
            r6.f47953p = r7
            r6.f47954q = r7
            r6.f47955r = r7
            int r4 = p194c6.C6532l.f27159y6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f47952o = r4
            int r4 = p194c6.C6532l.f26627B6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f47953p = r4
            int r4 = p194c6.C6532l.f27170z6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f47954q = r4
            int r4 = p194c6.C6532l.f27137w6
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f47955r = r7
            int r7 = p194c6.C6532l.f26616A6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f47956s = r7
            int r7 = p194c6.C6532l.f27148x6
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f47957t = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f47944g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            p6.m$b r7 = p243p6.C10897m.m48996e(r1, r8, r9, r0)
            p6.m r7 = r7.mo43154m()
            r6.f47949l = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x00cc
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
