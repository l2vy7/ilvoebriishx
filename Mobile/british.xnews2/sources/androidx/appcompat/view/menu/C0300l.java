package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.widget.C0419u;
import p072f.C5241d;
import p072f.C5244g;
import p110m0.C5723u;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: StandardMenuPopup */
final class C0300l extends C0293h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w */
    private static final int f1039w = C5244g.f22954o;

    /* renamed from: c */
    private final Context f1040c;

    /* renamed from: d */
    private final C0287e f1041d;

    /* renamed from: e */
    private final C0286d f1042e;

    /* renamed from: f */
    private final boolean f1043f;

    /* renamed from: g */
    private final int f1044g;

    /* renamed from: h */
    private final int f1045h;

    /* renamed from: i */
    private final int f1046i;

    /* renamed from: j */
    final C0419u f1047j;

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f1048k = new C0301a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1049l = new C0302b();

    /* renamed from: m */
    private PopupWindow.OnDismissListener f1050m;

    /* renamed from: n */
    private View f1051n;

    /* renamed from: o */
    View f1052o;

    /* renamed from: p */
    private C0296j.C0297a f1053p;

    /* renamed from: q */
    ViewTreeObserver f1054q;

    /* renamed from: r */
    private boolean f1055r;

    /* renamed from: s */
    private boolean f1056s;

    /* renamed from: t */
    private int f1057t;

    /* renamed from: u */
    private int f1058u = 0;

    /* renamed from: v */
    private boolean f1059v;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* compiled from: StandardMenuPopup */
    class C0301a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0301a() {
        }

        public void onGlobalLayout() {
            if (C0300l.this.mo1044a() && !C0300l.this.f1047j.mo1750A()) {
                View view = C0300l.this.f1052o;
                if (view == null || !view.isShown()) {
                    C0300l.this.dismiss();
                } else {
                    C0300l.this.f1047j.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* compiled from: StandardMenuPopup */
    class C0302b implements View.OnAttachStateChangeListener {
        C0302b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0300l.this.f1054q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0300l.this.f1054q = view.getViewTreeObserver();
                }
                C0300l lVar = C0300l.this;
                lVar.f1054q.removeGlobalOnLayoutListener(lVar.f1048k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0300l(Context context, C0287e eVar, View view, int i, int i2, boolean z) {
        this.f1040c = context;
        this.f1041d = eVar;
        this.f1043f = z;
        this.f1042e = new C0286d(eVar, LayoutInflater.from(context), z, f1039w);
        this.f1045h = i;
        this.f1046i = i2;
        Resources resources = context.getResources();
        this.f1044g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5241d.f22843d));
        this.f1051n = view;
        this.f1047j = new C0419u(context, (AttributeSet) null, i, i2);
        eVar.mo1126c(this, context);
    }

    /* renamed from: A */
    private boolean m1544A() {
        View view;
        if (mo1044a()) {
            return true;
        }
        if (this.f1055r || (view = this.f1051n) == null) {
            return false;
        }
        this.f1052o = view;
        this.f1047j.mo1758J(this);
        this.f1047j.mo1759K(this);
        this.f1047j.mo1757I(true);
        View view2 = this.f1052o;
        boolean z = this.f1054q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1054q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1048k);
        }
        view2.addOnAttachStateChangeListener(this.f1049l);
        this.f1047j.mo1751C(view2);
        this.f1047j.mo1754F(this.f1058u);
        if (!this.f1056s) {
            this.f1057t = C0293h.m1498p(this.f1042e, (ViewGroup) null, this.f1040c, this.f1044g);
            this.f1056s = true;
        }
        this.f1047j.mo1753E(this.f1057t);
        this.f1047j.mo1756H(2);
        this.f1047j.mo1755G(mo1253o());
        this.f1047j.show();
        ListView j = this.f1047j.mo1048j();
        j.setOnKeyListener(this);
        if (this.f1059v && this.f1041d.mo1165z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1040c).inflate(C5244g.f22953n, j, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1041d.mo1165z());
            }
            frameLayout.setEnabled(false);
            j.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1047j.mo1630o(this.f1042e);
        this.f1047j.show();
        return true;
    }

    /* renamed from: a */
    public boolean mo1044a() {
        return !this.f1055r && this.f1047j.mo1044a();
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
        if (eVar == this.f1041d) {
            dismiss();
            C0296j.C0297a aVar = this.f1053p;
            if (aVar != null) {
                aVar.mo877b(eVar, z);
            }
        }
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        this.f1056s = false;
        C0286d dVar = this.f1042e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo1045d() {
        return false;
    }

    public void dismiss() {
        if (mo1044a()) {
            this.f1047j.dismiss();
        }
    }

    /* renamed from: g */
    public void mo1031g(C0296j.C0297a aVar) {
        this.f1053p = aVar;
    }

    /* renamed from: i */
    public void mo1047i(Parcelable parcelable) {
    }

    /* renamed from: j */
    public ListView mo1048j() {
        return this.f1047j.mo1048j();
    }

    /* renamed from: k */
    public boolean mo1035k(C0303m mVar) {
        if (mVar.hasVisibleItems()) {
            C0294i iVar = new C0294i(this.f1040c, mVar, this.f1052o, this.f1043f, this.f1045h, this.f1046i);
            iVar.mo1264j(this.f1053p);
            iVar.mo1261g(C0293h.m1499y(mVar));
            iVar.mo1263i(this.f1050m);
            this.f1050m = null;
            this.f1041d.mo1133e(false);
            int c = this.f1047j.mo1765c();
            int n = this.f1047j.mo1769n();
            if ((Gravity.getAbsoluteGravity(this.f1058u, C5723u.m25265B(this.f1051n)) & 7) == 5) {
                c += this.f1051n.getWidth();
            }
            if (iVar.mo1267n(c, n)) {
                C0296j.C0297a aVar = this.f1053p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo878c(mVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public Parcelable mo1049l() {
        return null;
    }

    /* renamed from: m */
    public void mo1050m(C0287e eVar) {
    }

    public void onDismiss() {
        this.f1055r = true;
        this.f1041d.close();
        ViewTreeObserver viewTreeObserver = this.f1054q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1054q = this.f1052o.getViewTreeObserver();
            }
            this.f1054q.removeGlobalOnLayoutListener(this.f1048k);
            this.f1054q = null;
        }
        this.f1052o.removeOnAttachStateChangeListener(this.f1049l);
        PopupWindow.OnDismissListener onDismissListener = this.f1050m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: q */
    public void mo1054q(View view) {
        this.f1051n = view;
    }

    /* renamed from: s */
    public void mo1055s(boolean z) {
        this.f1042e.mo1084d(z);
    }

    public void show() {
        if (!m1544A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: t */
    public void mo1057t(int i) {
        this.f1058u = i;
    }

    /* renamed from: u */
    public void mo1058u(int i) {
        this.f1047j.mo1766e(i);
    }

    /* renamed from: v */
    public void mo1059v(PopupWindow.OnDismissListener onDismissListener) {
        this.f1050m = onDismissListener;
    }

    /* renamed from: w */
    public void mo1060w(boolean z) {
        this.f1059v = z;
    }

    /* renamed from: x */
    public void mo1061x(int i) {
        this.f1047j.mo1768k(i);
    }
}
