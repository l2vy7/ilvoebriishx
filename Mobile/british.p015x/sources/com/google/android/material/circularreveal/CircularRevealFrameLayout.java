package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.C10080c;

public class CircularRevealFrameLayout extends FrameLayout implements C10080c {

    /* renamed from: b */
    private final C10078b f47612b = new C10078b(this);

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo40337a() {
        this.f47612b.mo40360a();
    }

    /* renamed from: b */
    public void mo40338b() {
        this.f47612b.mo40361b();
    }

    /* renamed from: c */
    public void mo40339c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo40340d() {
        return super.isOpaque();
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C10078b bVar = this.f47612b;
        if (bVar != null) {
            bVar.mo40362c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f47612b.mo40363e();
    }

    public int getCircularRevealScrimColor() {
        return this.f47612b.mo40364f();
    }

    public C10080c.C10085e getRevealInfo() {
        return this.f47612b.mo40365h();
    }

    public boolean isOpaque() {
        C10078b bVar = this.f47612b;
        if (bVar != null) {
            return bVar.mo40366j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f47612b.mo40367k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f47612b.mo40368l(i);
    }

    public void setRevealInfo(C10080c.C10085e eVar) {
        this.f47612b.mo40369m(eVar);
    }
}
