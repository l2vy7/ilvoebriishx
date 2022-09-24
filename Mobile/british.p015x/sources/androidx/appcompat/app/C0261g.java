package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.widget.C0386g0;
import androidx.appcompat.widget.C0408o;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p099k.C5534i;
import p111m0.C5723u;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: ToolbarActionBar */
class C0261g extends ActionBar {

    /* renamed from: a */
    C0408o f797a;

    /* renamed from: b */
    boolean f798b;

    /* renamed from: c */
    Window.Callback f799c;

    /* renamed from: d */
    private boolean f800d;

    /* renamed from: e */
    private boolean f801e;

    /* renamed from: f */
    private ArrayList<ActionBar.C0212a> f802f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f803g = new C0262a();

    /* renamed from: h */
    private final Toolbar.C0369e f804h;

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: ToolbarActionBar */
    class C0262a implements Runnable {
        C0262a() {
        }

        public void run() {
            C0261g.this.mo951A();
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    /* compiled from: ToolbarActionBar */
    class C0263b implements Toolbar.C0369e {
        C0263b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0261g.this.f799c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    /* compiled from: ToolbarActionBar */
    private final class C0264c implements C0296j.C0297a {

        /* renamed from: b */
        private boolean f807b;

        C0264c() {
        }

        /* renamed from: b */
        public void mo877b(C0287e eVar, boolean z) {
            if (!this.f807b) {
                this.f807b = true;
                C0261g.this.f797a.mo2130h();
                Window.Callback callback = C0261g.this.f799c;
                if (callback != null) {
                    callback.onPanelClosed(108, eVar);
                }
                this.f807b = false;
            }
        }

        /* renamed from: c */
        public boolean mo878c(C0287e eVar) {
            Window.Callback callback = C0261g.this.f799c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    /* compiled from: ToolbarActionBar */
    private final class C0265d implements C0287e.C0288a {
        C0265d() {
        }

        /* renamed from: a */
        public boolean mo821a(C0287e eVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo822b(C0287e eVar) {
            C0261g gVar = C0261g.this;
            if (gVar.f799c == null) {
                return;
            }
            if (gVar.f797a.mo2121b()) {
                C0261g.this.f799c.onPanelClosed(108, eVar);
            } else if (C0261g.this.f799c.onPreparePanel(0, (View) null, eVar)) {
                C0261g.this.f799c.onMenuOpened(108, eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    /* compiled from: ToolbarActionBar */
    private class C0266e extends C5534i {
        public C0266e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0261g.this.f797a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0261g gVar = C0261g.this;
                if (!gVar.f798b) {
                    gVar.f797a.mo2122c();
                    C0261g.this.f798b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0261g(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0263b bVar = new C0263b();
        this.f804h = bVar;
        this.f797a = new C0386g0(toolbar, false);
        C0266e eVar = new C0266e(callback);
        this.f799c = eVar;
        this.f797a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f797a.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    private Menu m1229y() {
        if (!this.f800d) {
            this.f797a.mo2140r(new C0264c(), new C0265d());
            this.f800d = true;
        }
        return this.f797a.mo2135m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo951A() {
        Menu y = m1229y();
        C0287e eVar = y instanceof C0287e ? (C0287e) y : null;
        if (eVar != null) {
            eVar.mo1140h0();
        }
        try {
            y.clear();
            if (!this.f799c.onCreatePanelMenu(0, y) || !this.f799c.onPreparePanel(0, (View) null, y)) {
                y.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.mo1137g0();
            }
        }
    }

    /* renamed from: B */
    public void mo952B(int i, int i2) {
        this.f797a.mo2133k((i & i2) | ((i2 ^ -1) & this.f797a.mo2149u()));
    }

    /* renamed from: f */
    public boolean mo707f() {
        return this.f797a.mo2126f();
    }

    /* renamed from: g */
    public boolean mo708g() {
        if (!this.f797a.mo2132j()) {
            return false;
        }
        this.f797a.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo709h(boolean z) {
        if (z != this.f801e) {
            this.f801e = z;
            int size = this.f802f.size();
            for (int i = 0; i < size; i++) {
                this.f802f.get(i).mo726a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo710i() {
        return this.f797a.mo2149u();
    }

    /* renamed from: j */
    public Context mo711j() {
        return this.f797a.getContext();
    }

    /* renamed from: k */
    public boolean mo712k() {
        this.f797a.mo2141s().removeCallbacks(this.f803g);
        C5723u.m25314g0(this.f797a.mo2141s(), this.f803g);
        return true;
    }

    /* renamed from: l */
    public void mo713l(Configuration configuration) {
        super.mo713l(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo714m() {
        this.f797a.mo2141s().removeCallbacks(this.f803g);
    }

    /* renamed from: n */
    public boolean mo715n(int i, KeyEvent keyEvent) {
        Menu y = m1229y();
        if (y == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        y.setQwertyMode(z);
        return y.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: o */
    public boolean mo716o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo717p();
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo717p() {
        return this.f797a.mo2127g();
    }

    /* renamed from: q */
    public void mo718q(boolean z) {
    }

    /* renamed from: r */
    public void mo719r(boolean z) {
        mo952B(z ? 4 : 0, 4);
    }

    /* renamed from: s */
    public void mo720s(int i) {
        this.f797a.mo2139q(i);
    }

    /* renamed from: t */
    public void mo721t(boolean z) {
    }

    /* renamed from: u */
    public void mo722u(CharSequence charSequence) {
        this.f797a.mo2134l(charSequence);
    }

    /* renamed from: v */
    public void mo723v(CharSequence charSequence) {
        this.f797a.setTitle(charSequence);
    }

    /* renamed from: w */
    public void mo724w(CharSequence charSequence) {
        this.f797a.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    public Window.Callback mo953z() {
        return this.f799c;
    }
}
