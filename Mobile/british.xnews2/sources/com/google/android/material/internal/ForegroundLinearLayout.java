package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p193c6.C6532l;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: q */
    private Drawable f47972q;

    /* renamed from: r */
    private final Rect f47973r;

    /* renamed from: s */
    private final Rect f47974s;

    /* renamed from: t */
    private int f47975t;

    /* renamed from: u */
    protected boolean f47976u;

    /* renamed from: v */
    boolean f47977v;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f47972q;
        if (drawable != null) {
            if (this.f47977v) {
                this.f47977v = false;
                Rect rect = this.f47973r;
                Rect rect2 = this.f47974s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f47976u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f47975t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f47972q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f47972q;
        if (drawable != null && drawable.isStateful()) {
            this.f47972q.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f47972q;
    }

    public int getForegroundGravity() {
        return this.f47975t;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f47972q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f47977v = z | this.f47977v;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f47977v = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f47972q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f47972q);
            }
            this.f47972q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f47975t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f47975t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f47975t = i;
            if (i == 119 && this.f47972q != null) {
                this.f47972q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f47972q;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47973r = new Rect();
        this.f47974s = new Rect();
        this.f47975t = 119;
        this.f47976u = true;
        this.f47977v = false;
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26881Z2, i, 0, new int[0]);
        this.f47975t = h.getInt(C6532l.f26903b3, this.f47975t);
        Drawable drawable = h.getDrawable(C6532l.f26892a3);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f47976u = h.getBoolean(C6532l.f26914c3, true);
        h.recycle();
    }
}
