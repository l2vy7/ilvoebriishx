package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p111m0.C5690c0;
import p111m0.C5718p;
import p111m0.C5723u;
import p194c6.C6531k;
import p194c6.C6532l;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: b */
    Drawable f47990b;

    /* renamed from: c */
    Rect f47991c;

    /* renamed from: d */
    private Rect f47992d;

    /* renamed from: e */
    private boolean f47993e;

    /* renamed from: f */
    private boolean f47994f;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    class C10187a implements C5718p {
        C10187a() {
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f47991c == null) {
                scrimInsetsFrameLayout.f47991c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f47991c.set(c0Var.mo22411j(), c0Var.mo22413l(), c0Var.mo22412k(), c0Var.mo22410i());
            ScrimInsetsFrameLayout.this.mo40877a(c0Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!c0Var.mo22414m() || ScrimInsetsFrameLayout.this.f47990b == null);
            C5723u.m25310e0(ScrimInsetsFrameLayout.this);
            return c0Var.mo22402c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40877a(C5690c0 c0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f47991c != null && this.f47990b != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f47993e) {
                this.f47992d.set(0, 0, width, this.f47991c.top);
                this.f47990b.setBounds(this.f47992d);
                this.f47990b.draw(canvas);
            }
            if (this.f47994f) {
                this.f47992d.set(0, height - this.f47991c.bottom, width, height);
                this.f47990b.setBounds(this.f47992d);
                this.f47990b.draw(canvas);
            }
            Rect rect = this.f47992d;
            Rect rect2 = this.f47991c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f47990b.setBounds(this.f47992d);
            this.f47990b.draw(canvas);
            Rect rect3 = this.f47992d;
            Rect rect4 = this.f47991c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f47990b.setBounds(this.f47992d);
            this.f47990b.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f47990b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f47990b;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f47994f = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f47993e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f47990b = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47992d = new Rect();
        this.f47993e = true;
        this.f47994f = true;
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26939e6, i, C6531k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f47990b = h.getDrawable(C6532l.f26950f6);
        h.recycle();
        setWillNotDraw(true);
        C5723u.m25266B0(this, new C10187a());
    }
}
