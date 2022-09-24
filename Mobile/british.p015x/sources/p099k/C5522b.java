package p099k;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: k.b */
/* compiled from: ActionMode */
public abstract class C5522b {

    /* renamed from: b */
    private Object f23961b;

    /* renamed from: c */
    private boolean f23962c;

    /* renamed from: k.b$a */
    /* compiled from: ActionMode */
    public interface C5523a {
        /* renamed from: a */
        boolean mo879a(C5522b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo880b(C5522b bVar, Menu menu);

        /* renamed from: c */
        boolean mo881c(C5522b bVar, Menu menu);

        /* renamed from: d */
        void mo882d(C5522b bVar);
    }

    /* renamed from: c */
    public abstract void mo975c();

    /* renamed from: d */
    public abstract View mo976d();

    /* renamed from: e */
    public abstract Menu mo977e();

    /* renamed from: f */
    public abstract MenuInflater mo978f();

    /* renamed from: g */
    public abstract CharSequence mo979g();

    /* renamed from: h */
    public Object mo22012h() {
        return this.f23961b;
    }

    /* renamed from: i */
    public abstract CharSequence mo980i();

    /* renamed from: j */
    public boolean mo22013j() {
        return this.f23962c;
    }

    /* renamed from: k */
    public abstract void mo981k();

    /* renamed from: l */
    public abstract boolean mo982l();

    /* renamed from: m */
    public abstract void mo983m(View view);

    /* renamed from: n */
    public abstract void mo984n(int i);

    /* renamed from: o */
    public abstract void mo985o(CharSequence charSequence);

    /* renamed from: p */
    public void mo22014p(Object obj) {
        this.f23961b = obj;
    }

    /* renamed from: q */
    public abstract void mo986q(int i);

    /* renamed from: r */
    public abstract void mo987r(CharSequence charSequence);

    /* renamed from: s */
    public void mo988s(boolean z) {
        this.f23962c = z;
    }
}
