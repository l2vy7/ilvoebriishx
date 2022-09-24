package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0408o;
import androidx.appcompat.widget.C0431y;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p073f.C5238a;
import p073f.C5243f;
import p073f.C5247j;
import p099k.C5521a;
import p099k.C5522b;
import p099k.C5529g;
import p099k.C5532h;
import p111m0.C5684a0;
import p111m0.C5688b0;
import p111m0.C5723u;
import p111m0.C5740y;
import p111m0.C5744z;

/* renamed from: androidx.appcompat.app.j */
/* compiled from: WindowDecorActionBar */
public class C0270j extends ActionBar implements ActionBarOverlayLayout.C0308d {

    /* renamed from: E */
    private static final Interpolator f825E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f826F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f827A;

    /* renamed from: B */
    final C5744z f828B = new C0271a();

    /* renamed from: C */
    final C5744z f829C = new C0272b();

    /* renamed from: D */
    final C5688b0 f830D = new C0273c();

    /* renamed from: a */
    Context f831a;

    /* renamed from: b */
    private Context f832b;

    /* renamed from: c */
    private Activity f833c;

    /* renamed from: d */
    ActionBarOverlayLayout f834d;

    /* renamed from: e */
    ActionBarContainer f835e;

    /* renamed from: f */
    C0408o f836f;

    /* renamed from: g */
    ActionBarContextView f837g;

    /* renamed from: h */
    View f838h;

    /* renamed from: i */
    C0431y f839i;

    /* renamed from: j */
    private ArrayList<Object> f840j = new ArrayList<>();

    /* renamed from: k */
    private int f841k = -1;

    /* renamed from: l */
    private boolean f842l;

    /* renamed from: m */
    C0274d f843m;

    /* renamed from: n */
    C5522b f844n;

    /* renamed from: o */
    C5522b.C5523a f845o;

    /* renamed from: p */
    private boolean f846p;

    /* renamed from: q */
    private ArrayList<ActionBar.C0212a> f847q = new ArrayList<>();

    /* renamed from: r */
    private boolean f848r;

    /* renamed from: s */
    private int f849s = 0;

    /* renamed from: t */
    boolean f850t = true;

    /* renamed from: u */
    boolean f851u;

    /* renamed from: v */
    boolean f852v;

    /* renamed from: w */
    private boolean f853w;

    /* renamed from: x */
    private boolean f854x = true;

    /* renamed from: y */
    C5532h f855y;

    /* renamed from: z */
    private boolean f856z;

    /* renamed from: androidx.appcompat.app.j$a */
    /* compiled from: WindowDecorActionBar */
    class C0271a extends C5684a0 {
        C0271a() {
        }

        /* renamed from: b */
        public void mo875b(View view) {
            View view2;
            C0270j jVar = C0270j.this;
            if (jVar.f850t && (view2 = jVar.f838h) != null) {
                view2.setTranslationY(0.0f);
                C0270j.this.f835e.setTranslationY(0.0f);
            }
            C0270j.this.f835e.setVisibility(8);
            C0270j.this.f835e.setTransitioning(false);
            C0270j jVar2 = C0270j.this;
            jVar2.f855y = null;
            jVar2.mo959A();
            ActionBarOverlayLayout actionBarOverlayLayout = C0270j.this.f834d;
            if (actionBarOverlayLayout != null) {
                C5723u.m25324l0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    /* compiled from: WindowDecorActionBar */
    class C0272b extends C5684a0 {
        C0272b() {
        }

        /* renamed from: b */
        public void mo875b(View view) {
            C0270j jVar = C0270j.this;
            jVar.f855y = null;
            jVar.f835e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.j$c */
    /* compiled from: WindowDecorActionBar */
    class C0273c implements C5688b0 {
        C0273c() {
        }

        /* renamed from: a */
        public void mo974a(View view) {
            ((View) C0270j.this.f835e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.j$d */
    /* compiled from: WindowDecorActionBar */
    public class C0274d extends C5522b implements C0287e.C0288a {

        /* renamed from: d */
        private final Context f860d;

        /* renamed from: e */
        private final C0287e f861e;

        /* renamed from: f */
        private C5522b.C5523a f862f;

        /* renamed from: g */
        private WeakReference<View> f863g;

        public C0274d(Context context, C5522b.C5523a aVar) {
            this.f860d = context;
            this.f862f = aVar;
            C0287e W = new C0287e(context).mo1110W(1);
            this.f861e = W;
            W.mo1109V(this);
        }

        /* renamed from: a */
        public boolean mo821a(C0287e eVar, MenuItem menuItem) {
            C5522b.C5523a aVar = this.f862f;
            if (aVar != null) {
                return aVar.mo879a(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo822b(C0287e eVar) {
            if (this.f862f != null) {
                mo981k();
                C0270j.this.f837g.mo1312l();
            }
        }

        /* renamed from: c */
        public void mo975c() {
            C0270j jVar = C0270j.this;
            if (jVar.f843m == this) {
                if (!C0270j.m1270z(jVar.f851u, jVar.f852v, false)) {
                    C0270j jVar2 = C0270j.this;
                    jVar2.f844n = this;
                    jVar2.f845o = this.f862f;
                } else {
                    this.f862f.mo882d(this);
                }
                this.f862f = null;
                C0270j.this.mo973y(false);
                C0270j.this.f837g.mo1302g();
                C0270j.this.f836f.mo2141s().sendAccessibilityEvent(32);
                C0270j jVar3 = C0270j.this;
                jVar3.f834d.setHideOnContentScrollEnabled(jVar3.f827A);
                C0270j.this.f843m = null;
            }
        }

        /* renamed from: d */
        public View mo976d() {
            WeakReference<View> weakReference = this.f863g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo977e() {
            return this.f861e;
        }

        /* renamed from: f */
        public MenuInflater mo978f() {
            return new C5529g(this.f860d);
        }

        /* renamed from: g */
        public CharSequence mo979g() {
            return C0270j.this.f837g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo980i() {
            return C0270j.this.f837g.getTitle();
        }

        /* renamed from: k */
        public void mo981k() {
            if (C0270j.this.f843m == this) {
                this.f861e.mo1140h0();
                try {
                    this.f862f.mo881c(this, this.f861e);
                } finally {
                    this.f861e.mo1137g0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo982l() {
            return C0270j.this.f837g.mo1310j();
        }

        /* renamed from: m */
        public void mo983m(View view) {
            C0270j.this.f837g.setCustomView(view);
            this.f863g = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo984n(int i) {
            mo985o(C0270j.this.f831a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo985o(CharSequence charSequence) {
            C0270j.this.f837g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo986q(int i) {
            mo987r(C0270j.this.f831a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo987r(CharSequence charSequence) {
            C0270j.this.f837g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo988s(boolean z) {
            super.mo988s(z);
            C0270j.this.f837g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo989t() {
            this.f861e.mo1140h0();
            try {
                return this.f862f.mo880b(this, this.f861e);
            } finally {
                this.f861e.mo1137g0();
            }
        }
    }

    public C0270j(Activity activity, boolean z) {
        this.f833c = activity;
        View decorView = activity.getWindow().getDecorView();
        m1265G(decorView);
        if (!z) {
            this.f838h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: D */
    private C0408o m1263D(View view) {
        if (view instanceof C0408o) {
            return (C0408o) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: F */
    private void m1264F() {
        if (this.f853w) {
            this.f853w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f834d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1269O(false);
        }
    }

    /* renamed from: G */
    private void m1265G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5243f.f22930q);
        this.f834d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f836f = m1263D(view.findViewById(C5243f.f22914a));
        this.f837g = (ActionBarContextView) view.findViewById(C5243f.f22919f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5243f.f22916c);
        this.f835e = actionBarContainer;
        C0408o oVar = this.f836f;
        if (oVar == null || this.f837g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f831a = oVar.getContext();
        boolean z = (this.f836f.mo2149u() & 4) != 0;
        if (z) {
            this.f842l = true;
        }
        C5521a b = C5521a.m24610b(this.f831a);
        mo966L(b.mo22005a() || z);
        m1266J(b.mo22010g());
        TypedArray obtainStyledAttributes = this.f831a.obtainStyledAttributes((AttributeSet) null, C5247j.f23110a, C5238a.f22807c, 0);
        if (obtainStyledAttributes.getBoolean(C5247j.f23161k, false)) {
            mo965K(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5247j.f23151i, 0);
        if (dimensionPixelSize != 0) {
            mo964I((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    private void m1266J(boolean z) {
        this.f848r = z;
        if (!z) {
            this.f836f.mo2131i((C0431y) null);
            this.f835e.setTabContainer(this.f839i);
        } else {
            this.f835e.setTabContainer((C0431y) null);
            this.f836f.mo2131i(this.f839i);
        }
        boolean z2 = true;
        boolean z3 = mo962E() == 2;
        C0431y yVar = this.f839i;
        if (yVar != null) {
            if (z3) {
                yVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f834d;
                if (actionBarOverlayLayout != null) {
                    C5723u.m25324l0(actionBarOverlayLayout);
                }
            } else {
                yVar.setVisibility(8);
            }
        }
        this.f836f.mo2152x(!this.f848r && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f834d;
        if (this.f848r || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: M */
    private boolean m1267M() {
        return C5723u.m25294T(this.f835e);
    }

    /* renamed from: N */
    private void m1268N() {
        if (!this.f853w) {
            this.f853w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f834d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1269O(false);
        }
    }

    /* renamed from: O */
    private void m1269O(boolean z) {
        if (m1270z(this.f851u, this.f852v, this.f853w)) {
            if (!this.f854x) {
                this.f854x = true;
                mo961C(z);
            }
        } else if (this.f854x) {
            this.f854x = false;
            mo960B(z);
        }
    }

    /* renamed from: z */
    static boolean m1270z(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo959A() {
        C5522b.C5523a aVar = this.f845o;
        if (aVar != null) {
            aVar.mo882d(this.f844n);
            this.f844n = null;
            this.f845o = null;
        }
    }

    /* renamed from: B */
    public void mo960B(boolean z) {
        View view;
        C5532h hVar = this.f855y;
        if (hVar != null) {
            hVar.mo22051a();
        }
        if (this.f849s != 0 || (!this.f856z && !z)) {
            this.f828B.mo875b((View) null);
            return;
        }
        this.f835e.setAlpha(1.0f);
        this.f835e.setTransitioning(true);
        C5532h hVar2 = new C5532h();
        float f = (float) (-this.f835e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f835e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C5740y k = C5723u.m25307d(this.f835e).mo22513k(f);
        k.mo22511i(this.f830D);
        hVar2.mo22053c(k);
        if (this.f850t && (view = this.f838h) != null) {
            hVar2.mo22053c(C5723u.m25307d(view).mo22513k(f));
        }
        hVar2.mo22056f(f825E);
        hVar2.mo22055e(250);
        hVar2.mo22057g(this.f828B);
        this.f855y = hVar2;
        hVar2.mo22058h();
    }

    /* renamed from: C */
    public void mo961C(boolean z) {
        View view;
        View view2;
        C5532h hVar = this.f855y;
        if (hVar != null) {
            hVar.mo22051a();
        }
        this.f835e.setVisibility(0);
        if (this.f849s != 0 || (!this.f856z && !z)) {
            this.f835e.setAlpha(1.0f);
            this.f835e.setTranslationY(0.0f);
            if (this.f850t && (view = this.f838h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f829C.mo875b((View) null);
        } else {
            this.f835e.setTranslationY(0.0f);
            float f = (float) (-this.f835e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f835e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f835e.setTranslationY(f);
            C5532h hVar2 = new C5532h();
            C5740y k = C5723u.m25307d(this.f835e).mo22513k(0.0f);
            k.mo22511i(this.f830D);
            hVar2.mo22053c(k);
            if (this.f850t && (view2 = this.f838h) != null) {
                view2.setTranslationY(f);
                hVar2.mo22053c(C5723u.m25307d(this.f838h).mo22513k(0.0f));
            }
            hVar2.mo22056f(f826F);
            hVar2.mo22055e(250);
            hVar2.mo22057g(this.f829C);
            this.f855y = hVar2;
            hVar2.mo22058h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f834d;
        if (actionBarOverlayLayout != null) {
            C5723u.m25324l0(actionBarOverlayLayout);
        }
    }

    /* renamed from: E */
    public int mo962E() {
        return this.f836f.mo2137o();
    }

    /* renamed from: H */
    public void mo963H(int i, int i2) {
        int u = this.f836f.mo2149u();
        if ((i2 & 4) != 0) {
            this.f842l = true;
        }
        this.f836f.mo2133k((i & i2) | ((i2 ^ -1) & u));
    }

    /* renamed from: I */
    public void mo964I(float f) {
        C5723u.m25344v0(this.f835e, f);
    }

    /* renamed from: K */
    public void mo965K(boolean z) {
        if (!z || this.f834d.mo1381w()) {
            this.f827A = z;
            this.f834d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: L */
    public void mo966L(boolean z) {
        this.f836f.mo2148t(z);
    }

    /* renamed from: a */
    public void mo967a() {
        if (this.f852v) {
            this.f852v = false;
            m1269O(true);
        }
    }

    /* renamed from: b */
    public void mo968b() {
    }

    /* renamed from: c */
    public void mo969c(boolean z) {
        this.f850t = z;
    }

    /* renamed from: d */
    public void mo970d() {
        if (!this.f852v) {
            this.f852v = true;
            m1269O(true);
        }
    }

    /* renamed from: e */
    public void mo971e() {
        C5532h hVar = this.f855y;
        if (hVar != null) {
            hVar.mo22051a();
            this.f855y = null;
        }
    }

    /* renamed from: g */
    public boolean mo708g() {
        C0408o oVar = this.f836f;
        if (oVar == null || !oVar.mo2132j()) {
            return false;
        }
        this.f836f.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo709h(boolean z) {
        if (z != this.f846p) {
            this.f846p = z;
            int size = this.f847q.size();
            for (int i = 0; i < size; i++) {
                this.f847q.get(i).mo726a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo710i() {
        return this.f836f.mo2149u();
    }

    /* renamed from: j */
    public Context mo711j() {
        if (this.f832b == null) {
            TypedValue typedValue = new TypedValue();
            this.f831a.getTheme().resolveAttribute(C5238a.f22811g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f832b = new ContextThemeWrapper(this.f831a, i);
            } else {
                this.f832b = this.f831a;
            }
        }
        return this.f832b;
    }

    /* renamed from: l */
    public void mo713l(Configuration configuration) {
        m1266J(C5521a.m24610b(this.f831a).mo22010g());
    }

    /* renamed from: n */
    public boolean mo715n(int i, KeyEvent keyEvent) {
        Menu e;
        C0274d dVar = this.f843m;
        if (dVar == null || (e = dVar.mo977e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    public void onWindowVisibilityChanged(int i) {
        this.f849s = i;
    }

    /* renamed from: q */
    public void mo718q(boolean z) {
        if (!this.f842l) {
            mo719r(z);
        }
    }

    /* renamed from: r */
    public void mo719r(boolean z) {
        mo963H(z ? 4 : 0, 4);
    }

    /* renamed from: s */
    public void mo720s(int i) {
        this.f836f.mo2139q(i);
    }

    /* renamed from: t */
    public void mo721t(boolean z) {
        C5532h hVar;
        this.f856z = z;
        if (!z && (hVar = this.f855y) != null) {
            hVar.mo22051a();
        }
    }

    /* renamed from: u */
    public void mo722u(CharSequence charSequence) {
        this.f836f.mo2134l(charSequence);
    }

    /* renamed from: v */
    public void mo723v(CharSequence charSequence) {
        this.f836f.setTitle(charSequence);
    }

    /* renamed from: w */
    public void mo724w(CharSequence charSequence) {
        this.f836f.setWindowTitle(charSequence);
    }

    /* renamed from: x */
    public C5522b mo725x(C5522b.C5523a aVar) {
        C0274d dVar = this.f843m;
        if (dVar != null) {
            dVar.mo975c();
        }
        this.f834d.setHideOnContentScrollEnabled(false);
        this.f837g.mo1311k();
        C0274d dVar2 = new C0274d(this.f837g.getContext(), aVar);
        if (!dVar2.mo989t()) {
            return null;
        }
        this.f843m = dVar2;
        dVar2.mo981k();
        this.f837g.mo1309h(dVar2);
        mo973y(true);
        this.f837g.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: y */
    public void mo973y(boolean z) {
        C5740y yVar;
        C5740y yVar2;
        if (z) {
            m1268N();
        } else {
            m1264F();
        }
        if (m1267M()) {
            if (z) {
                yVar = this.f836f.mo2138p(4, 100);
                yVar2 = this.f837g.mo1301f(0, 200);
            } else {
                yVar2 = this.f836f.mo2138p(0, 200);
                yVar = this.f837g.mo1301f(8, 100);
            }
            C5532h hVar = new C5532h();
            hVar.mo22054d(yVar, yVar2);
            hVar.mo22058h();
        } else if (z) {
            this.f836f.setVisibility(4);
            this.f837g.setVisibility(0);
        } else {
            this.f836f.setVisibility(0);
            this.f837g.setVisibility(8);
        }
    }

    public C0270j(Dialog dialog) {
        m1265G(dialog.getWindow().getDecorView());
    }
}
