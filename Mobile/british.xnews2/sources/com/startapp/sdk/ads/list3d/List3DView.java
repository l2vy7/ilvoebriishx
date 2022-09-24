package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.C12073n5;
import com.startapp.C12107o5;
import com.startapp.C12157r2;
import com.startapp.C12437y;
import java.util.LinkedList;

/* compiled from: Sta */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a */
    public Adapter f54243a;

    /* renamed from: b */
    public int f54244b = 0;

    /* renamed from: c */
    public int f54245c;

    /* renamed from: d */
    public int f54246d;

    /* renamed from: e */
    public int f54247e;

    /* renamed from: f */
    public int f54248f;

    /* renamed from: g */
    public int f54249g;

    /* renamed from: h */
    public int f54250h;

    /* renamed from: i */
    public int f54251i;

    /* renamed from: j */
    public int f54252j;

    /* renamed from: k */
    public VelocityTracker f54253k;

    /* renamed from: l */
    public C12157r2 f54254l;

    /* renamed from: m */
    public Runnable f54255m;

    /* renamed from: n */
    public final LinkedList<View> f54256n = new LinkedList<>();

    /* renamed from: o */
    public Runnable f54257o;

    /* renamed from: p */
    public Rect f54258p;

    /* renamed from: q */
    public Camera f54259q;

    /* renamed from: r */
    public Matrix f54260r;

    /* renamed from: s */
    public Paint f54261s;

    /* renamed from: t */
    public int f54262t = Integer.MIN_VALUE;

    /* renamed from: u */
    public boolean f54263u = false;

    /* renamed from: v */
    public boolean f54264v = false;

    /* renamed from: w */
    public boolean f54265w = false;

    /* renamed from: x */
    public boolean f54266x = false;

    public List3DView(Context context, AttributeSet attributeSet, String str, String str2) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final boolean mo45889a() {
        int i = C12437y.f55146a;
        return Build.VERSION.SDK_INT >= 12;
    }

    /* renamed from: b */
    public int mo45890b(int i, int i2) {
        if (this.f54258p == null) {
            this.f54258p = new Rect();
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHitRect(this.f54258p);
            if (this.f54258p.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo45892c(View view) {
        return (int) ((((float) view.getMeasuredHeight()) * 0.35000002f) / 2.0f);
    }

    /* renamed from: d */
    public int mo45893d(View view) {
        return view.getTop() - mo45892c(view);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = (float) (getHeight() / 2);
        float f = (((float) (top + height)) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos((double) f)) * 0.15000000596046448d));
        float f2 = (((float) this.f54250h) - (f * 20.0f)) % 90.0f;
        if (f2 < 0.0f) {
            f2 += 90.0f;
        }
        float f3 = f2;
        if (f3 < 45.0f) {
            Canvas canvas2 = canvas;
            Bitmap bitmap = drawingCache;
            int i = top;
            int i2 = left;
            int i3 = width;
            int i4 = height;
            float f4 = cos;
            mo45887a(canvas2, bitmap, i, i2, i3, i4, f4, f3 - 90.0f);
            mo45887a(canvas2, bitmap, i, i2, i3, i4, f4, f3);
            return false;
        }
        Canvas canvas3 = canvas;
        Bitmap bitmap2 = drawingCache;
        int i5 = top;
        int i6 = left;
        int i7 = width;
        int i8 = height;
        float f5 = cos;
        mo45887a(canvas3, bitmap2, i5, i6, i7, i8, f5, f3);
        mo45887a(canvas3, bitmap2, i5, i6, i7, i8, f5, f3 - 90.0f);
        return false;
    }

    public Adapter getAdapter() {
        return this.f54243a;
    }

    public View getSelectedView() {
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f54255m);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f54263u && this.f54243a != null) {
            if (getChildCount() == 0) {
                if (this.f54265w) {
                    this.f54248f = getHeight() / 3;
                }
                this.f54252j = -1;
                mo45886a(this.f54248f, 0);
            } else {
                int d = (this.f54248f + this.f54249g) - mo45893d(getChildAt(0));
                int childCount = getChildCount();
                if (this.f54252j != this.f54243a.getCount() - 1 && childCount > 1) {
                    View childAt = getChildAt(0);
                    while (childAt != null && mo45883a(childAt) + d < 0) {
                        removeViewInLayout(childAt);
                        childCount--;
                        this.f54256n.addLast(childAt);
                        this.f54251i++;
                        this.f54249g = mo45891b(childAt) + this.f54249g;
                        childAt = childCount > 1 ? getChildAt(0) : null;
                    }
                }
                if (this.f54251i != 0 && childCount > 1) {
                    View childAt2 = getChildAt(childCount - 1);
                    while (childAt2 != null && mo45893d(childAt2) + d > getHeight()) {
                        removeViewInLayout(childAt2);
                        childCount--;
                        this.f54256n.addLast(childAt2);
                        this.f54252j--;
                        childAt2 = childCount > 1 ? getChildAt(childCount - 1) : null;
                    }
                }
                mo45886a(mo45883a(getChildAt(getChildCount() - 1)), d);
                int d2 = mo45893d(getChildAt(0));
                while (d2 + d > 0 && (i5 = this.f54251i) > 0) {
                    int i6 = i5 - 1;
                    this.f54251i = i6;
                    View view = this.f54243a.getView(i6, this.f54256n.size() != 0 ? this.f54256n.removeFirst() : null, this);
                    mo45888a(view, 1);
                    int b = mo45891b(view);
                    d2 -= b;
                    this.f54249g -= b;
                }
            }
            int i7 = this.f54248f + this.f54249g;
            float width = ((float) getWidth()) * 0.0f;
            float height = 1.0f / (((float) getHeight()) * 0.9f);
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt3 = getChildAt(i8);
                double d3 = (double) width;
                double d4 = (double) height;
                Double.isNaN(d4);
                double d5 = (double) i7;
                Double.isNaN(d5);
                double sin = Math.sin(d4 * 6.283185307179586d * d5);
                Double.isNaN(d3);
                int i9 = (int) (sin * d3);
                int measuredWidth = childAt3.getMeasuredWidth();
                int measuredHeight = childAt3.getMeasuredHeight();
                int width2 = ((getWidth() - measuredWidth) / 2) + i9;
                int c = mo45892c(childAt3);
                int i10 = i7 + c;
                childAt3.layout(width2, i10, measuredWidth + width2, i10 + measuredHeight);
                i7 += (c * 2) + measuredHeight;
            }
            if (this.f54265w && !this.f54266x) {
                this.f54266x = true;
                dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
                postDelayed(new C12073n5(this), 5);
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 <= (r0 + 10)) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x0097
            r1 = 0
            r3 = 2
            if (r0 == r2) goto L_0x0059
            if (r0 == r3) goto L_0x001a
            r6.mo45884a((float) r1)
            goto L_0x00f9
        L_0x001a:
            int r0 = r6.f54244b
            if (r0 != r2) goto L_0x0043
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r4 = r6.f54245c
            int r5 = r4 + -10
            if (r0 < r5) goto L_0x003c
            int r4 = r4 + 10
            if (r0 > r4) goto L_0x003c
            int r0 = r6.f54246d
            int r4 = r0 + -10
            if (r1 < r4) goto L_0x003c
            int r0 = r0 + 10
            if (r1 <= r0) goto L_0x0043
        L_0x003c:
            java.lang.Runnable r0 = r6.f54257o
            r6.removeCallbacks(r0)
            r6.f54244b = r3
        L_0x0043:
            int r0 = r6.f54244b
            if (r0 != r3) goto L_0x00f9
            android.view.VelocityTracker r0 = r6.f54253k
            r0.addMovement(r7)
            float r7 = r7.getY()
            int r7 = (int) r7
            int r0 = r6.f54246d
            int r7 = r7 - r0
            r6.mo45885a((int) r7)
            goto L_0x00f9
        L_0x0059:
            int r0 = r6.f54244b
            if (r0 != r2) goto L_0x007f
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.mo45890b(r0, r7)
            r0 = -1
            if (r7 == r0) goto L_0x0093
            android.view.View r0 = r6.getChildAt(r7)
            int r3 = r6.f54251i
            int r3 = r3 + r7
            android.widget.Adapter r7 = r6.f54243a
            long r4 = r7.getItemId(r3)
            r6.performItemClick(r0, r3, r4)
            goto L_0x0093
        L_0x007f:
            if (r0 != r3) goto L_0x0093
            android.view.VelocityTracker r0 = r6.f54253k
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r6.f54253k
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r6.f54253k
            float r1 = r7.getYVelocity()
        L_0x0093:
            r6.mo45884a((float) r1)
            goto L_0x00f9
        L_0x0097:
            boolean r0 = r6.mo45889a()
            if (r0 == 0) goto L_0x00b9
            r3 = 1500(0x5dc, double:7.41E-321)
            int r0 = com.startapp.C12437y.f55146a
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 12
            if (r0 < r5) goto L_0x00b9
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            r3 = 0
            r0.setListener(r3)
        L_0x00b9:
            java.lang.Runnable r0 = r6.f54255m
            r6.removeCallbacks(r0)
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.f54245c = r0
            float r0 = r7.getY()
            int r0 = (int) r0
            r6.f54246d = r0
            android.view.View r0 = r6.getChildAt(r1)
            int r0 = r6.mo45893d(r0)
            int r1 = r6.f54249g
            int r0 = r0 - r1
            r6.f54247e = r0
            java.lang.Runnable r0 = r6.f54257o
            if (r0 != 0) goto L_0x00e4
            com.startapp.p5 r0 = new com.startapp.p5
            r0.<init>(r6)
            r6.f54257o = r0
        L_0x00e4:
            java.lang.Runnable r0 = r6.f54257o
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r3 = (long) r1
            r6.postDelayed(r0, r3)
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f54253k = r0
            r0.addMovement(r7)
            r6.f54244b = r2
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(Adapter adapter) {
        if (mo45889a() && this.f54264v) {
            int i = C12437y.f55146a;
            if (Build.VERSION.SDK_INT >= 11) {
                setAlpha(0.0f);
            }
        }
        this.f54243a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(C12157r2 r2Var) {
        C12157r2 r2Var2 = this.f54254l;
        if (r2Var2 != null) {
            float f = r2Var2.f54090a;
            float f2 = r2Var2.f54091b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            r2Var.f54091b = f2;
            r2Var.f54090a = f;
            r2Var.f54094e = currentAnimationTimeMillis;
        }
        this.f54254l = r2Var;
    }

    public void setFade(boolean z) {
        this.f54264v = z;
    }

    public void setHint(boolean z) {
        this.f54265w = z;
    }

    public void setSelection(int i) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f54263u = true;
    }

    public void setTag(String str) {
    }

    /* renamed from: a */
    public final void mo45887a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.f54259q == null) {
            this.f54259q = new Camera();
        }
        this.f54259q.save();
        this.f54259q.translate(0.0f, 0.0f, (float) i4);
        this.f54259q.rotateX(f2);
        float f3 = (float) (-i4);
        this.f54259q.translate(0.0f, 0.0f, f3);
        if (this.f54260r == null) {
            this.f54260r = new Matrix();
        }
        this.f54259q.getMatrix(this.f54260r);
        this.f54259q.restore();
        this.f54260r.preTranslate((float) (-i3), f3);
        this.f54260r.postScale(f, f);
        this.f54260r.postTranslate((float) (i2 + i3), (float) (i + i4));
        if (this.f54261s == null) {
            Paint paint = new Paint();
            this.f54261s = paint;
            paint.setAntiAlias(true);
            this.f54261s.setFilterBitmap(true);
        }
        Paint paint2 = this.f54261s;
        double d = (double) f2;
        Double.isNaN(d);
        double cos = Math.cos((d * 3.141592653589793d) / 180.0d);
        int i5 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i5 > 255) {
            i5 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i5, i5, i5), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f54260r, this.f54261s);
    }

    /* renamed from: b */
    public final int mo45891b(View view) {
        return (mo45892c(view) * 2) + view.getMeasuredHeight();
    }

    /* renamed from: a */
    public final void mo45884a(float f) {
        VelocityTracker velocityTracker = this.f54253k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f54253k = null;
            removeCallbacks(this.f54257o);
            if (this.f54255m == null) {
                this.f54255m = new C12107o5(this);
            }
            C12157r2 r2Var = this.f54254l;
            if (r2Var != null) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                r2Var.f54091b = f;
                r2Var.f54090a = (float) this.f54248f;
                r2Var.f54094e = currentAnimationTimeMillis;
                post(this.f54255m);
            }
            this.f54244b = 0;
        }
    }

    /* renamed from: a */
    public void mo45885a(int i) {
        int i2;
        int i3 = this.f54247e + i;
        this.f54248f = i3;
        int height = (-(i3 * 270)) / getHeight();
        this.f54250h = height;
        int i4 = height % 90;
        if (i4 < 45) {
            i2 = (getHeight() * (-(height - i4))) / 270;
        } else {
            i2 = (getHeight() * (-((height + 90) - i4))) / 270;
        }
        if (this.f54262t == Integer.MIN_VALUE && this.f54252j == this.f54243a.getCount() - 1 && mo45883a(getChildAt(getChildCount() - 1)) < getHeight()) {
            this.f54262t = i2;
        }
        if (i2 > 0) {
            i2 = 0;
        } else {
            int i5 = this.f54262t;
            if (i2 < i5) {
                i2 = i5;
            }
        }
        C12157r2 r2Var = this.f54254l;
        float f = (float) i2;
        r2Var.f54092c = f;
        r2Var.f54093d = f;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo45886a(int i, int i2) {
        while (i + i2 < getHeight() && this.f54252j < this.f54243a.getCount() - 1) {
            int i3 = this.f54252j + 1;
            this.f54252j = i3;
            View view = this.f54243a.getView(i3, this.f54256n.size() != 0 ? this.f54256n.removeFirst() : null, this);
            mo45888a(view, 0);
            i += mo45891b(view);
        }
    }

    /* renamed from: a */
    public final void mo45888a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i2 = i == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i2, layoutParams, true);
        view.measure(((int) (((float) getWidth()) * 0.85f)) | 1073741824, 0);
    }

    /* renamed from: a */
    public final int mo45883a(View view) {
        return mo45892c(view) + view.getBottom();
    }
}
