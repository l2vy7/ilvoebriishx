package p110m0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: m0.k */
/* compiled from: NestedScrollingChildHelper */
public class C5713k {

    /* renamed from: a */
    private ViewParent f24338a;

    /* renamed from: b */
    private ViewParent f24339b;

    /* renamed from: c */
    private final View f24340c;

    /* renamed from: d */
    private boolean f24341d;

    /* renamed from: e */
    private int[] f24342e;

    public C5713k(View view) {
        this.f24340c = view;
    }

    /* renamed from: g */
    private boolean m25229g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo22463l() || (h = m25230h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f24340c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = m25231i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        C5739x.m25410d(h, this.f24340c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f24340c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m25230h(int i) {
        if (i == 0) {
            return this.f24338a;
        }
        if (i != 1) {
            return null;
        }
        return this.f24339b;
    }

    /* renamed from: i */
    private int[] m25231i() {
        if (this.f24342e == null) {
            this.f24342e = new int[2];
        }
        return this.f24342e;
    }

    /* renamed from: n */
    private void m25232n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f24338a = viewParent;
        } else if (i == 1) {
            this.f24339b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo22455a(float f, float f2, boolean z) {
        ViewParent h;
        if (!mo22463l() || (h = m25230h(0)) == null) {
            return false;
        }
        return C5739x.m25407a(h, this.f24340c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo22456b(float f, float f2) {
        ViewParent h;
        if (!mo22463l() || (h = m25230h(0)) == null) {
            return false;
        }
        return C5739x.m25408b(h, this.f24340c, f, f2);
    }

    /* renamed from: c */
    public boolean mo22457c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo22458d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo22458d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!mo22463l() || (h = m25230h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f24340c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m25231i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C5739x.m25409c(h, this.f24340c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f24340c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo22459e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m25229g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo22460f(int i, int i2, int i3, int i4, int[] iArr) {
        return m25229g(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: j */
    public boolean mo22461j() {
        return mo22462k(0);
    }

    /* renamed from: k */
    public boolean mo22462k(int i) {
        return m25230h(i) != null;
    }

    /* renamed from: l */
    public boolean mo22463l() {
        return this.f24341d;
    }

    /* renamed from: m */
    public void mo22464m(boolean z) {
        if (this.f24341d) {
            C5723u.m25284K0(this.f24340c);
        }
        this.f24341d = z;
    }

    /* renamed from: o */
    public boolean mo22465o(int i) {
        return mo22466p(i, 0);
    }

    /* renamed from: p */
    public boolean mo22466p(int i, int i2) {
        if (mo22462k(i2)) {
            return true;
        }
        if (!mo22463l()) {
            return false;
        }
        View view = this.f24340c;
        for (ViewParent parent = this.f24340c.getParent(); parent != null; parent = parent.getParent()) {
            if (C5739x.m25412f(parent, view, this.f24340c, i, i2)) {
                m25232n(i2, parent);
                C5739x.m25411e(parent, view, this.f24340c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo22467q() {
        mo22468r(0);
    }

    /* renamed from: r */
    public void mo22468r(int i) {
        ViewParent h = m25230h(i);
        if (h != null) {
            C5739x.m25413g(h, this.f24340c, i);
            m25232n(i, (ViewParent) null);
        }
    }
}
