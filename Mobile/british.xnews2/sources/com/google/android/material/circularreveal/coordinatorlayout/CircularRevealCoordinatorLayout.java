package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C10078b;
import com.google.android.material.circularreveal.C10080c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements C10080c {

    /* renamed from: A */
    private final C10078b f47635A = new C10078b(this);

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo40337a() {
        this.f47635A.mo40360a();
    }

    /* renamed from: b */
    public void mo40338b() {
        this.f47635A.mo40361b();
    }

    /* renamed from: c */
    public void mo40339c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo40340d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C10078b bVar = this.f47635A;
        if (bVar != null) {
            bVar.mo40362c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f47635A.mo40363e();
    }

    public int getCircularRevealScrimColor() {
        return this.f47635A.mo40364f();
    }

    public C10080c.C10085e getRevealInfo() {
        return this.f47635A.mo40365h();
    }

    public boolean isOpaque() {
        C10078b bVar = this.f47635A;
        if (bVar != null) {
            return bVar.mo40366j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f47635A.mo40367k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f47635A.mo40368l(i);
    }

    public void setRevealInfo(C10080c.C10085e eVar) {
        this.f47635A.mo40369m(eVar);
    }
}
