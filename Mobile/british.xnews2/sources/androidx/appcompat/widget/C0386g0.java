package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.widget.Toolbar;
import p072f.C5238a;
import p072f.C5242e;
import p072f.C5243f;
import p072f.C5245h;
import p072f.C5247j;
import p078g.C5264a;
import p103l.C5630a;
import p110m0.C5684a0;
import p110m0.C5723u;
import p110m0.C5740y;

/* renamed from: androidx.appcompat.widget.g0 */
/* compiled from: ToolbarWidgetWrapper */
public class C0386g0 implements C0408o {

    /* renamed from: a */
    Toolbar f1563a;

    /* renamed from: b */
    private int f1564b;

    /* renamed from: c */
    private View f1565c;

    /* renamed from: d */
    private View f1566d;

    /* renamed from: e */
    private Drawable f1567e;

    /* renamed from: f */
    private Drawable f1568f;

    /* renamed from: g */
    private Drawable f1569g;

    /* renamed from: h */
    private boolean f1570h;

    /* renamed from: i */
    CharSequence f1571i;

    /* renamed from: j */
    private CharSequence f1572j;

    /* renamed from: k */
    private CharSequence f1573k;

    /* renamed from: l */
    Window.Callback f1574l;

    /* renamed from: m */
    boolean f1575m;

    /* renamed from: n */
    private ActionMenuPresenter f1576n;

    /* renamed from: o */
    private int f1577o;

    /* renamed from: p */
    private int f1578p;

    /* renamed from: q */
    private Drawable f1579q;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0387a implements View.OnClickListener {

        /* renamed from: b */
        final C5630a f1580b;

        C0387a() {
            this.f1580b = new C5630a(C0386g0.this.f1563a.getContext(), 0, 16908332, 0, 0, C0386g0.this.f1571i);
        }

        public void onClick(View view) {
            C0386g0 g0Var = C0386g0.this;
            Window.Callback callback = g0Var.f1574l;
            if (callback != null && g0Var.f1575m) {
                callback.onMenuItemSelected(0, this.f1580b);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0388b extends C5684a0 {

        /* renamed from: a */
        private boolean f1582a = false;

        /* renamed from: b */
        final /* synthetic */ int f1583b;

        C0388b(int i) {
            this.f1583b = i;
        }

        /* renamed from: a */
        public void mo2054a(View view) {
            this.f1582a = true;
        }

        /* renamed from: b */
        public void mo875b(View view) {
            if (!this.f1582a) {
                C0386g0.this.f1563a.setVisibility(this.f1583b);
            }
        }

        /* renamed from: c */
        public void mo876c(View view) {
            C0386g0.this.f1563a.setVisibility(0);
        }
    }

    public C0386g0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C5245h.f22962a, C5242e.f22879n);
    }

    /* renamed from: F */
    private void m2016F(CharSequence charSequence) {
        this.f1571i = charSequence;
        if ((this.f1564b & 8) != 0) {
            this.f1563a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m2017G() {
        if ((this.f1564b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1573k)) {
            this.f1563a.setNavigationContentDescription(this.f1578p);
        } else {
            this.f1563a.setNavigationContentDescription(this.f1573k);
        }
    }

    /* renamed from: H */
    private void m2018H() {
        if ((this.f1564b & 4) != 0) {
            Toolbar toolbar = this.f1563a;
            Drawable drawable = this.f1569g;
            if (drawable == null) {
                drawable = this.f1579q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1563a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: I */
    private void m2019I() {
        Drawable drawable;
        int i = this.f1564b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1568f;
            if (drawable == null) {
                drawable = this.f1567e;
            }
        } else {
            drawable = this.f1567e;
        }
        this.f1563a.setLogo(drawable);
    }

    /* renamed from: y */
    private int m2020y() {
        if (this.f1563a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1579q = this.f1563a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo2115A(int i) {
        if (i != this.f1578p) {
            this.f1578p = i;
            if (TextUtils.isEmpty(this.f1563a.getNavigationContentDescription())) {
                mo2117C(this.f1578p);
            }
        }
    }

    /* renamed from: B */
    public void mo2116B(Drawable drawable) {
        this.f1568f = drawable;
        m2019I();
    }

    /* renamed from: C */
    public void mo2117C(int i) {
        mo2118D(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: D */
    public void mo2118D(CharSequence charSequence) {
        this.f1573k = charSequence;
        m2017G();
    }

    /* renamed from: E */
    public void mo2119E(Drawable drawable) {
        this.f1569g = drawable;
        m2018H();
    }

    /* renamed from: a */
    public void mo2120a(Menu menu, C0296j.C0297a aVar) {
        if (this.f1576n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1563a.getContext());
            this.f1576n = actionMenuPresenter;
            actionMenuPresenter.mo1042s(C5243f.f22920g);
        }
        this.f1576n.mo1031g(aVar);
        this.f1563a.mo1939I((C0287e) menu, this.f1576n);
    }

    /* renamed from: b */
    public boolean mo2121b() {
        return this.f1563a.mo1936A();
    }

    /* renamed from: c */
    public void mo2122c() {
        this.f1575m = true;
    }

    public void collapseActionView() {
        this.f1563a.mo1947e();
    }

    /* renamed from: d */
    public boolean mo2124d() {
        return this.f1563a.mo1946d();
    }

    /* renamed from: e */
    public boolean mo2125e() {
        return this.f1563a.mo2028z();
    }

    /* renamed from: f */
    public boolean mo2126f() {
        return this.f1563a.mo2026w();
    }

    /* renamed from: g */
    public boolean mo2127g() {
        return this.f1563a.mo1943O();
    }

    public Context getContext() {
        return this.f1563a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1563a.getTitle();
    }

    /* renamed from: h */
    public void mo2130h() {
        this.f1563a.mo1948f();
    }

    /* renamed from: i */
    public void mo2131i(C0431y yVar) {
        Toolbar toolbar;
        View view = this.f1565c;
        if (view != null && view.getParent() == (toolbar = this.f1563a)) {
            toolbar.removeView(this.f1565c);
        }
        this.f1565c = yVar;
        if (yVar != null && this.f1577o == 2) {
            this.f1563a.addView(yVar, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1565c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f552a = 8388691;
            yVar.setAllowCollapse(true);
        }
    }

    /* renamed from: j */
    public boolean mo2132j() {
        return this.f1563a.mo2025v();
    }

    /* renamed from: k */
    public void mo2133k(int i) {
        View view;
        int i2 = this.f1564b ^ i;
        this.f1564b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2017G();
                }
                m2018H();
            }
            if ((i2 & 3) != 0) {
                m2019I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1563a.setTitle(this.f1571i);
                    this.f1563a.setSubtitle(this.f1572j);
                } else {
                    this.f1563a.setTitle((CharSequence) null);
                    this.f1563a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1566d) != null) {
                if ((i & 16) != 0) {
                    this.f1563a.addView(view);
                } else {
                    this.f1563a.removeView(view);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo2134l(CharSequence charSequence) {
        this.f1572j = charSequence;
        if ((this.f1564b & 8) != 0) {
            this.f1563a.setSubtitle(charSequence);
        }
    }

    /* renamed from: m */
    public Menu mo2135m() {
        return this.f1563a.getMenu();
    }

    /* renamed from: n */
    public void mo2136n(int i) {
        mo2116B(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    /* renamed from: o */
    public int mo2137o() {
        return this.f1577o;
    }

    /* renamed from: p */
    public C5740y mo2138p(int i, long j) {
        return C5723u.m25307d(this.f1563a).mo22504a(i == 0 ? 1.0f : 0.0f).mo22507d(j).mo22509f(new C0388b(i));
    }

    /* renamed from: q */
    public void mo2139q(int i) {
        mo2119E(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    /* renamed from: r */
    public void mo2140r(C0296j.C0297a aVar, C0287e.C0288a aVar2) {
        this.f1563a.mo1940J(aVar, aVar2);
    }

    /* renamed from: s */
    public ViewGroup mo2141s() {
        return this.f1563a;
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1570h = true;
        m2016F(charSequence);
    }

    public void setVisibility(int i) {
        this.f1563a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1574l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1570h) {
            m2016F(charSequence);
        }
    }

    /* renamed from: t */
    public void mo2148t(boolean z) {
    }

    /* renamed from: u */
    public int mo2149u() {
        return this.f1564b;
    }

    /* renamed from: v */
    public void mo2150v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: w */
    public void mo2151w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: x */
    public void mo2152x(boolean z) {
        this.f1563a.setCollapsible(z);
    }

    /* renamed from: z */
    public void mo2153z(View view) {
        View view2 = this.f1566d;
        if (!(view2 == null || (this.f1564b & 16) == 0)) {
            this.f1563a.removeView(view2);
        }
        this.f1566d = view;
        if (view != null && (this.f1564b & 16) != 0) {
            this.f1563a.addView(view);
        }
    }

    public C0386g0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1577o = 0;
        this.f1578p = 0;
        this.f1563a = toolbar;
        this.f1571i = toolbar.getTitle();
        this.f1572j = toolbar.getSubtitle();
        this.f1570h = this.f1571i != null;
        this.f1569g = toolbar.getNavigationIcon();
        C0384f0 v = C0384f0.m1994v(toolbar.getContext(), (AttributeSet) null, C5247j.f23110a, C5238a.f22807c, 0);
        this.f1579q = v.mo2101g(C5247j.f23166l);
        if (z) {
            CharSequence p = v.mo2110p(C5247j.f23196r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.mo2110p(C5247j.f23186p);
            if (!TextUtils.isEmpty(p2)) {
                mo2134l(p2);
            }
            Drawable g = v.mo2101g(C5247j.f23176n);
            if (g != null) {
                mo2116B(g);
            }
            Drawable g2 = v.mo2101g(C5247j.f23171m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1569g == null && (drawable = this.f1579q) != null) {
                mo2119E(drawable);
            }
            mo2133k(v.mo2105k(C5247j.f23146h, 0));
            int n = v.mo2108n(C5247j.f23141g, 0);
            if (n != 0) {
                mo2153z(LayoutInflater.from(this.f1563a.getContext()).inflate(n, this.f1563a, false));
                mo2133k(this.f1564b | 16);
            }
            int m = v.mo2107m(C5247j.f23156j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1563a.getLayoutParams();
                layoutParams.height = m;
                this.f1563a.setLayoutParams(layoutParams);
            }
            int e = v.mo2099e(C5247j.f23136f, -1);
            int e2 = v.mo2099e(C5247j.f23131e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1563a.mo1938H(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo2108n(C5247j.f23201s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1563a;
                toolbar2.mo1942L(toolbar2.getContext(), n2);
            }
            int n3 = v.mo2108n(C5247j.f23191q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1563a;
                toolbar3.mo1941K(toolbar3.getContext(), n3);
            }
            int n4 = v.mo2108n(C5247j.f23181o, 0);
            if (n4 != 0) {
                this.f1563a.setPopupTheme(n4);
            }
        } else {
            this.f1564b = m2020y();
        }
        v.mo2114w();
        mo2115A(i);
        this.f1573k = this.f1563a.getNavigationContentDescription();
        this.f1563a.setNavigationOnClickListener(new C0387a());
    }

    public void setIcon(Drawable drawable) {
        this.f1567e = drawable;
        m2019I();
    }
}
