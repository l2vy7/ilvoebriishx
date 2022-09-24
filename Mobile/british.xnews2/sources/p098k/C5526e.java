package p098k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p098k.C5522b;

/* renamed from: k.e */
/* compiled from: StandaloneActionMode */
public class C5526e extends C5522b implements C0287e.C0288a {

    /* renamed from: d */
    private Context f23968d;

    /* renamed from: e */
    private ActionBarContextView f23969e;

    /* renamed from: f */
    private C5522b.C5523a f23970f;

    /* renamed from: g */
    private WeakReference<View> f23971g;

    /* renamed from: h */
    private boolean f23972h;

    /* renamed from: i */
    private boolean f23973i;

    /* renamed from: j */
    private C0287e f23974j;

    public C5526e(Context context, ActionBarContextView actionBarContextView, C5522b.C5523a aVar, boolean z) {
        this.f23968d = context;
        this.f23969e = actionBarContextView;
        this.f23970f = aVar;
        C0287e W = new C0287e(actionBarContextView.getContext()).mo1110W(1);
        this.f23974j = W;
        W.mo1109V(this);
        this.f23973i = z;
    }

    /* renamed from: a */
    public boolean mo821a(C0287e eVar, MenuItem menuItem) {
        return this.f23970f.mo879a(this, menuItem);
    }

    /* renamed from: b */
    public void mo822b(C0287e eVar) {
        mo981k();
        this.f23969e.mo1312l();
    }

    /* renamed from: c */
    public void mo975c() {
        if (!this.f23972h) {
            this.f23972h = true;
            this.f23969e.sendAccessibilityEvent(32);
            this.f23970f.mo882d(this);
        }
    }

    /* renamed from: d */
    public View mo976d() {
        WeakReference<View> weakReference = this.f23971g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo977e() {
        return this.f23974j;
    }

    /* renamed from: f */
    public MenuInflater mo978f() {
        return new C5529g(this.f23969e.getContext());
    }

    /* renamed from: g */
    public CharSequence mo979g() {
        return this.f23969e.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo980i() {
        return this.f23969e.getTitle();
    }

    /* renamed from: k */
    public void mo981k() {
        this.f23970f.mo881c(this, this.f23974j);
    }

    /* renamed from: l */
    public boolean mo982l() {
        return this.f23969e.mo1310j();
    }

    /* renamed from: m */
    public void mo983m(View view) {
        this.f23969e.setCustomView(view);
        this.f23971g = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo984n(int i) {
        mo985o(this.f23968d.getString(i));
    }

    /* renamed from: o */
    public void mo985o(CharSequence charSequence) {
        this.f23969e.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo986q(int i) {
        mo987r(this.f23968d.getString(i));
    }

    /* renamed from: r */
    public void mo987r(CharSequence charSequence) {
        this.f23969e.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo988s(boolean z) {
        super.mo988s(z);
        this.f23969e.setTitleOptional(z);
    }
}
