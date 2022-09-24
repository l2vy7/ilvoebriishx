package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C10078b;
import com.google.android.material.circularreveal.C10080c;

public class CircularRevealCardView extends MaterialCardView implements C10080c {

    /* renamed from: t */
    private final C10078b f47634t = new C10078b(this);

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo40337a() {
        this.f47634t.mo40360a();
    }

    /* renamed from: b */
    public void mo40338b() {
        this.f47634t.mo40361b();
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
        C10078b bVar = this.f47634t;
        if (bVar != null) {
            bVar.mo40362c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f47634t.mo40363e();
    }

    public int getCircularRevealScrimColor() {
        return this.f47634t.mo40364f();
    }

    public C10080c.C10085e getRevealInfo() {
        return this.f47634t.mo40365h();
    }

    public boolean isOpaque() {
        C10078b bVar = this.f47634t;
        if (bVar != null) {
            return bVar.mo40366j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f47634t.mo40367k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f47634t.mo40368l(i);
    }

    public void setRevealInfo(C10080c.C10085e eVar) {
        this.f47634t.mo40369m(eVar);
    }
}
