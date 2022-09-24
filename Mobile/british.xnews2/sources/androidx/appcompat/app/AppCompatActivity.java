package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0398k0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0796u;
import androidx.lifecycle.C0797v;
import androidx.savedstate.C1221d;
import androidx.savedstate.SavedStateRegistry;
import p001a0.C0008a;
import p001a0.C0024g;
import p001a0.C0048p;
import p061d.C5134b;
import p098k.C5522b;

public class AppCompatActivity extends FragmentActivity implements C0254b, C0048p.C0049a {

    /* renamed from: q */
    private C0255c f668q;

    /* renamed from: r */
    private Resources f669r;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    class C0227a implements SavedStateRegistry.C1217b {
        C0227a() {
        }

        /* renamed from: a */
        public Bundle mo798a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.mo764B().mo848u(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    class C0228b implements C5134b {
        C0228b() {
        }

        /* renamed from: a */
        public void mo799a(Context context) {
            C0255c B = AppCompatActivity.this.mo764B();
            B.mo833n();
            B.mo841q(AppCompatActivity.this.mo644i().mo5968a("androidx:appcompat"));
        }
    }

    public AppCompatActivity() {
        m1007D();
    }

    /* renamed from: D */
    private void m1007D() {
        mo644i().mo5971d("androidx:appcompat", new C0227a());
        mo645n(new C0228b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1008J(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.m1008J(android.view.KeyEvent):boolean");
    }

    /* renamed from: o */
    private void m1009o() {
        C0796u.m4330a(getWindow().getDecorView(), this);
        C0797v.m4331a(getWindow().getDecorView(), this);
        C1221d.m6654a(getWindow().getDecorView(), this);
    }

    /* renamed from: A */
    public void mo763A() {
        mo764B().mo835o();
    }

    /* renamed from: B */
    public C0255c mo764B() {
        if (this.f668q == null) {
            this.f668q = C0255c.m1165g(this, this);
        }
        return this.f668q;
    }

    /* renamed from: C */
    public ActionBar mo765C() {
        return mo764B().mo832m();
    }

    /* renamed from: E */
    public void mo766E(C0048p pVar) {
        pVar.mo132b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo767F(int i) {
    }

    /* renamed from: G */
    public void mo768G(C0048p pVar) {
    }

    @Deprecated
    /* renamed from: H */
    public void mo769H() {
    }

    /* renamed from: I */
    public boolean mo770I() {
        Intent f = mo139f();
        if (f == null) {
            return false;
        }
        if (mo773M(f)) {
            C0048p e = C0048p.m189e(this);
            mo766E(e);
            mo768G(e);
            e.mo137j();
            try {
                C0008a.m32n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo772L(f);
            return true;
        }
    }

    /* renamed from: K */
    public void mo771K(Toolbar toolbar) {
        mo764B().mo803D(toolbar);
    }

    /* renamed from: L */
    public void mo772L(Intent intent) {
        C0024g.m59e(this, intent);
    }

    /* renamed from: M */
    public boolean mo773M(Intent intent) {
        return C0024g.m60f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1009o();
        mo764B().mo824d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo764B().mo826f(context));
    }

    public void closeOptionsMenu() {
        ActionBar C = mo765C();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (C == null || !C.mo707f()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public void mo776d(C5522b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar C = mo765C();
        if (keyCode != 82 || C == null || !C.mo716o(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: f */
    public Intent mo139f() {
        return C0024g.m55a(this);
    }

    public <T extends View> T findViewById(int i) {
        return mo764B().mo829i(i);
    }

    public MenuInflater getMenuInflater() {
        return mo764B().mo831l();
    }

    public Resources getResources() {
        if (this.f669r == null && C0398k0.m2092b()) {
            this.f669r = new C0398k0(this, super.getResources());
        }
        Resources resources = this.f669r;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo764B().mo835o();
    }

    /* renamed from: j */
    public C5522b mo782j(C5522b.C5523a aVar) {
        return null;
    }

    /* renamed from: l */
    public void mo783l(C5522b bVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f669r != null) {
            this.f669r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo764B().mo839p(configuration);
    }

    public void onContentChanged() {
        mo769H();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo764B().mo843r();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m1008J(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar C = mo765C();
        if (menuItem.getItemId() != 16908332 || C == null || (C.mo710i() & 4) == 0) {
            return false;
        }
        return mo770I();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo764B().mo844s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo764B().mo846t();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo764B().mo849v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo764B().mo851w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo764B().mo806F(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar C = mo765C();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (C == null || !C.mo717p()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m1009o();
        mo764B().mo800A(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo764B().mo804E(i);
    }

    public void setContentView(View view) {
        m1009o();
        mo764B().mo801B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1009o();
        mo764B().mo802C(view, layoutParams);
    }
}
