package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p063d0.C5135a;
import p073f.C5247j;
import p111m0.C5723u;

/* renamed from: androidx.appcompat.widget.j */
/* compiled from: AppCompatSeekBarHelper */
class C0395j extends C0391i {

    /* renamed from: d */
    private final SeekBar f1605d;

    /* renamed from: e */
    private Drawable f1606e;

    /* renamed from: f */
    private ColorStateList f1607f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1608g = null;

    /* renamed from: h */
    private boolean f1609h = false;

    /* renamed from: i */
    private boolean f1610i = false;

    C0395j(SeekBar seekBar) {
        super(seekBar);
        this.f1605d = seekBar;
    }

    /* renamed from: f */
    private void m2078f() {
        Drawable drawable = this.f1606e;
        if (drawable == null) {
            return;
        }
        if (this.f1609h || this.f1610i) {
            Drawable r = C5135a.m23418r(drawable.mutate());
            this.f1606e = r;
            if (this.f1609h) {
                C5135a.m23415o(r, this.f1607f);
            }
            if (this.f1610i) {
                C5135a.m23416p(this.f1606e, this.f1608g);
            }
            if (this.f1606e.isStateful()) {
                this.f1606e.setState(this.f1605d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2164c(AttributeSet attributeSet, int i) {
        super.mo2164c(attributeSet, i);
        Context context = this.f1605d.getContext();
        int[] iArr = C5247j.f23095X;
        C0384f0 v = C0384f0.m1994v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1605d;
        C5723u.m25326m0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo2112r(), i, 0);
        Drawable h = v.mo2102h(C5247j.f23100Y);
        if (h != null) {
            this.f1605d.setThumb(h);
        }
        mo2176j(v.mo2101g(C5247j.f23105Z));
        int i2 = C5247j.f23117b0;
        if (v.mo2113s(i2)) {
            this.f1608g = C0409p.m2201e(v.mo2105k(i2, -1), this.f1608g);
            this.f1610i = true;
        }
        int i3 = C5247j.f23111a0;
        if (v.mo2113s(i3)) {
            this.f1607f = v.mo2097c(i3);
            this.f1609h = true;
        }
        v.mo2114w();
        m2078f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2173g(Canvas canvas) {
        if (this.f1606e != null) {
            int max = this.f1605d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1606e.getIntrinsicWidth();
                int intrinsicHeight = this.f1606e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1606e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1605d.getWidth() - this.f1605d.getPaddingLeft()) - this.f1605d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1605d.getPaddingLeft(), (float) (this.f1605d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1606e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2174h() {
        Drawable drawable = this.f1606e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1605d.getDrawableState())) {
            this.f1605d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2175i() {
        Drawable drawable = this.f1606e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2176j(Drawable drawable) {
        Drawable drawable2 = this.f1606e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1606e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1605d);
            C5135a.m23413m(drawable, C5723u.m25265B(this.f1605d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1605d.getDrawableState());
            }
            m2078f();
        }
        this.f1605d.invalidate();
    }
}
