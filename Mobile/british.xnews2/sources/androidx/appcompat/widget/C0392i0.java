package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p110m0.C5723u;
import p110m0.C5737v;

/* renamed from: androidx.appcompat.widget.i0 */
/* compiled from: TooltipCompatHandler */
class C0392i0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    private static C0392i0 f1592k;

    /* renamed from: l */
    private static C0392i0 f1593l;

    /* renamed from: b */
    private final View f1594b;

    /* renamed from: c */
    private final CharSequence f1595c;

    /* renamed from: d */
    private final int f1596d;

    /* renamed from: e */
    private final Runnable f1597e = new C0393a();

    /* renamed from: f */
    private final Runnable f1598f = new C0394b();

    /* renamed from: g */
    private int f1599g;

    /* renamed from: h */
    private int f1600h;

    /* renamed from: i */
    private C0396j0 f1601i;

    /* renamed from: j */
    private boolean f1602j;

    /* renamed from: androidx.appcompat.widget.i0$a */
    /* compiled from: TooltipCompatHandler */
    class C0393a implements Runnable {
        C0393a() {
        }

        public void run() {
            C0392i0.this.mo2166g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$b */
    /* compiled from: TooltipCompatHandler */
    class C0394b implements Runnable {
        C0394b() {
        }

        public void run() {
            C0392i0.this.mo2165c();
        }
    }

    private C0392i0(View view, CharSequence charSequence) {
        this.f1594b = view;
        this.f1595c = charSequence;
        this.f1596d = C5737v.m25403c(ViewConfiguration.get(view.getContext()));
        m2071b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m2070a() {
        this.f1594b.removeCallbacks(this.f1597e);
    }

    /* renamed from: b */
    private void m2071b() {
        this.f1599g = Integer.MAX_VALUE;
        this.f1600h = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m2072d() {
        this.f1594b.postDelayed(this.f1597e, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m2073e(C0392i0 i0Var) {
        C0392i0 i0Var2 = f1592k;
        if (i0Var2 != null) {
            i0Var2.m2070a();
        }
        f1592k = i0Var;
        if (i0Var != null) {
            i0Var.m2072d();
        }
    }

    /* renamed from: f */
    public static void m2074f(View view, CharSequence charSequence) {
        C0392i0 i0Var = f1592k;
        if (i0Var != null && i0Var.f1594b == view) {
            m2073e((C0392i0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0392i0 i0Var2 = f1593l;
            if (i0Var2 != null && i0Var2.f1594b == view) {
                i0Var2.mo2165c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0392i0(view, charSequence);
    }

    /* renamed from: h */
    private boolean m2075h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1599g) <= this.f1596d && Math.abs(y - this.f1600h) <= this.f1596d) {
            return false;
        }
        this.f1599g = x;
        this.f1600h = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2165c() {
        if (f1593l == this) {
            f1593l = null;
            C0396j0 j0Var = this.f1601i;
            if (j0Var != null) {
                j0Var.mo2177c();
                this.f1601i = null;
                m2071b();
                this.f1594b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1592k == this) {
            m2073e((C0392i0) null);
        }
        this.f1594b.removeCallbacks(this.f1598f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2166g(boolean z) {
        long j;
        int i;
        long j2;
        if (C5723u.m25293S(this.f1594b)) {
            m2073e((C0392i0) null);
            C0392i0 i0Var = f1593l;
            if (i0Var != null) {
                i0Var.mo2165c();
            }
            f1593l = this;
            this.f1602j = z;
            C0396j0 j0Var = new C0396j0(this.f1594b.getContext());
            this.f1601i = j0Var;
            j0Var.mo2179e(this.f1594b, this.f1599g, this.f1600h, this.f1602j, this.f1595c);
            this.f1594b.addOnAttachStateChangeListener(this);
            if (this.f1602j) {
                j = 2500;
            } else {
                if ((C5723u.m25287M(this.f1594b) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1594b.removeCallbacks(this.f1598f);
            this.f1594b.postDelayed(this.f1598f, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1601i != null && this.f1602j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1594b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2071b();
                mo2165c();
            }
        } else if (this.f1594b.isEnabled() && this.f1601i == null && m2075h(motionEvent)) {
            m2073e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1599g = view.getWidth() / 2;
        this.f1600h = view.getHeight() / 2;
        mo2166g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2165c();
    }
}
