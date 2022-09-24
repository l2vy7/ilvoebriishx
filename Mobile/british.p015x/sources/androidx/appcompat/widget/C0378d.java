package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p073f.C5247j;
import p111m0.C5723u;

/* renamed from: androidx.appcompat.widget.d */
/* compiled from: AppCompatBackgroundHelper */
class C0378d {

    /* renamed from: a */
    private final View f1534a;

    /* renamed from: b */
    private final C0382f f1535b;

    /* renamed from: c */
    private int f1536c = -1;

    /* renamed from: d */
    private C0379d0 f1537d;

    /* renamed from: e */
    private C0379d0 f1538e;

    /* renamed from: f */
    private C0379d0 f1539f;

    C0378d(View view) {
        this.f1534a = view;
        this.f1535b = C0382f.m1971b();
    }

    /* renamed from: a */
    private boolean m1950a(Drawable drawable) {
        if (this.f1539f == null) {
            this.f1539f = new C0379d0();
        }
        C0379d0 d0Var = this.f1539f;
        d0Var.mo2076a();
        ColorStateList s = C5723u.m25337s(this.f1534a);
        if (s != null) {
            d0Var.f1543d = true;
            d0Var.f1540a = s;
        }
        PorterDuff.Mode t = C5723u.m25339t(this.f1534a);
        if (t != null) {
            d0Var.f1542c = true;
            d0Var.f1541b = t;
        }
        if (!d0Var.f1543d && !d0Var.f1542c) {
            return false;
        }
        C0382f.m1974i(drawable, d0Var, this.f1534a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1951k() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1537d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2067b() {
        Drawable background = this.f1534a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1951k() || !m1950a(background)) {
            C0379d0 d0Var = this.f1538e;
            if (d0Var != null) {
                C0382f.m1974i(background, d0Var, this.f1534a.getDrawableState());
                return;
            }
            C0379d0 d0Var2 = this.f1537d;
            if (d0Var2 != null) {
                C0382f.m1974i(background, d0Var2, this.f1534a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2068c() {
        C0379d0 d0Var = this.f1538e;
        if (d0Var != null) {
            return d0Var.f1540a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2069d() {
        C0379d0 d0Var = this.f1538e;
        if (d0Var != null) {
            return d0Var.f1541b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2070e(AttributeSet attributeSet, int i) {
        Context context = this.f1534a.getContext();
        int[] iArr = C5247j.f23079T3;
        C0384f0 v = C0384f0.m1994v(context, attributeSet, iArr, i, 0);
        View view = this.f1534a;
        C5723u.m25326m0(view, view.getContext(), iArr, attributeSet, v.mo2112r(), i, 0);
        try {
            int i2 = C5247j.f23084U3;
            if (v.mo2113s(i2)) {
                this.f1536c = v.mo2108n(i2, -1);
                ColorStateList f = this.f1535b.mo2088f(this.f1534a.getContext(), this.f1536c);
                if (f != null) {
                    mo2073h(f);
                }
            }
            int i3 = C5247j.f23089V3;
            if (v.mo2113s(i3)) {
                C5723u.m25338s0(this.f1534a, v.mo2097c(i3));
            }
            int i4 = C5247j.f23094W3;
            if (v.mo2113s(i4)) {
                C5723u.m25340t0(this.f1534a, C0409p.m2201e(v.mo2105k(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2114w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2071f(Drawable drawable) {
        this.f1536c = -1;
        mo2073h((ColorStateList) null);
        mo2067b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2072g(int i) {
        this.f1536c = i;
        C0382f fVar = this.f1535b;
        mo2073h(fVar != null ? fVar.mo2088f(this.f1534a.getContext(), i) : null);
        mo2067b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2073h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1537d == null) {
                this.f1537d = new C0379d0();
            }
            C0379d0 d0Var = this.f1537d;
            d0Var.f1540a = colorStateList;
            d0Var.f1543d = true;
        } else {
            this.f1537d = null;
        }
        mo2067b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2074i(ColorStateList colorStateList) {
        if (this.f1538e == null) {
            this.f1538e = new C0379d0();
        }
        C0379d0 d0Var = this.f1538e;
        d0Var.f1540a = colorStateList;
        d0Var.f1543d = true;
        mo2067b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2075j(PorterDuff.Mode mode) {
        if (this.f1538e == null) {
            this.f1538e = new C0379d0();
        }
        C0379d0 d0Var = this.f1538e;
        d0Var.f1541b = mode;
        d0Var.f1542c = true;
        mo2067b();
    }
}
