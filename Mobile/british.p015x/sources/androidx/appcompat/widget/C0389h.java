package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0620g;
import p073f.C5247j;
import p079g.C5264a;
import p111m0.C5723u;

/* renamed from: androidx.appcompat.widget.h */
/* compiled from: AppCompatImageHelper */
public class C0389h {

    /* renamed from: a */
    private final ImageView f1585a;

    /* renamed from: b */
    private C0379d0 f1586b;

    /* renamed from: c */
    private C0379d0 f1587c;

    /* renamed from: d */
    private C0379d0 f1588d;

    public C0389h(ImageView imageView) {
        this.f1585a = imageView;
    }

    /* renamed from: a */
    private boolean m2054a(Drawable drawable) {
        if (this.f1588d == null) {
            this.f1588d = new C0379d0();
        }
        C0379d0 d0Var = this.f1588d;
        d0Var.mo2076a();
        ColorStateList a = C0620g.m3439a(this.f1585a);
        if (a != null) {
            d0Var.f1543d = true;
            d0Var.f1540a = a;
        }
        PorterDuff.Mode b = C0620g.m3440b(this.f1585a);
        if (b != null) {
            d0Var.f1542c = true;
            d0Var.f1541b = b;
        }
        if (!d0Var.f1543d && !d0Var.f1542c) {
            return false;
        }
        C0382f.m1974i(drawable, d0Var, this.f1585a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m2055j() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1586b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2155b() {
        Drawable drawable = this.f1585a.getDrawable();
        if (drawable != null) {
            C0409p.m2198b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m2055j() || !m2054a(drawable)) {
            C0379d0 d0Var = this.f1587c;
            if (d0Var != null) {
                C0382f.m1974i(drawable, d0Var, this.f1585a.getDrawableState());
                return;
            }
            C0379d0 d0Var2 = this.f1586b;
            if (d0Var2 != null) {
                C0382f.m1974i(drawable, d0Var2, this.f1585a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2156c() {
        C0379d0 d0Var = this.f1587c;
        if (d0Var != null) {
            return d0Var.f1540a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2157d() {
        C0379d0 d0Var = this.f1587c;
        if (d0Var != null) {
            return d0Var.f1541b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo2158e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1585a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void mo2159f(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f1585a.getContext();
        int[] iArr = C5247j.f23075T;
        C0384f0 v = C0384f0.m1994v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1585a;
        C5723u.m25326m0(imageView, imageView.getContext(), iArr, attributeSet, v.mo2112r(), i, 0);
        try {
            Drawable drawable = this.f1585a.getDrawable();
            if (!(drawable != null || (n = v.mo2108n(C5247j.f23080U, -1)) == -1 || (drawable = C5264a.m23789d(this.f1585a.getContext(), n)) == null)) {
                this.f1585a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0409p.m2198b(drawable);
            }
            int i2 = C5247j.f23085V;
            if (v.mo2113s(i2)) {
                C0620g.m3441c(this.f1585a, v.mo2097c(i2));
            }
            int i3 = C5247j.f23090W;
            if (v.mo2113s(i3)) {
                C0620g.m3442d(this.f1585a, C0409p.m2201e(v.mo2105k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2114w();
        }
    }

    /* renamed from: g */
    public void mo2160g(int i) {
        if (i != 0) {
            Drawable d = C5264a.m23789d(this.f1585a.getContext(), i);
            if (d != null) {
                C0409p.m2198b(d);
            }
            this.f1585a.setImageDrawable(d);
        } else {
            this.f1585a.setImageDrawable((Drawable) null);
        }
        mo2155b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2161h(ColorStateList colorStateList) {
        if (this.f1587c == null) {
            this.f1587c = new C0379d0();
        }
        C0379d0 d0Var = this.f1587c;
        d0Var.f1540a = colorStateList;
        d0Var.f1543d = true;
        mo2155b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2162i(PorterDuff.Mode mode) {
        if (this.f1587c == null) {
            this.f1587c = new C0379d0();
        }
        C0379d0 d0Var = this.f1587c;
        d0Var.f1541b = mode;
        d0Var.f1542c = true;
        mo2155b();
    }
}
