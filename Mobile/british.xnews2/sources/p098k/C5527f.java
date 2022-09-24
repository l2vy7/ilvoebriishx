package p098k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p073f0.C5248a;
import p073f0.C5249b;
import p098k.C5522b;
import p103l.C5632c;
import p103l.C5638d;
import p149t.C6090g;

/* renamed from: k.f */
/* compiled from: SupportActionModeWrapper */
public class C5527f extends ActionMode {

    /* renamed from: a */
    final Context f23975a;

    /* renamed from: b */
    final C5522b f23976b;

    /* renamed from: k.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C5528a implements C5522b.C5523a {

        /* renamed from: a */
        final ActionMode.Callback f23977a;

        /* renamed from: b */
        final Context f23978b;

        /* renamed from: c */
        final ArrayList<C5527f> f23979c = new ArrayList<>();

        /* renamed from: d */
        final C6090g<Menu, Menu> f23980d = new C6090g<>();

        public C5528a(Context context, ActionMode.Callback callback) {
            this.f23978b = context;
            this.f23977a = callback;
        }

        /* renamed from: f */
        private Menu m24662f(Menu menu) {
            Menu menu2 = this.f23980d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C5638d dVar = new C5638d(this.f23978b, (C5248a) menu);
            this.f23980d.put(menu, dVar);
            return dVar;
        }

        /* renamed from: a */
        public boolean mo879a(C5522b bVar, MenuItem menuItem) {
            return this.f23977a.onActionItemClicked(mo22041e(bVar), new C5632c(this.f23978b, (C5249b) menuItem));
        }

        /* renamed from: b */
        public boolean mo880b(C5522b bVar, Menu menu) {
            return this.f23977a.onCreateActionMode(mo22041e(bVar), m24662f(menu));
        }

        /* renamed from: c */
        public boolean mo881c(C5522b bVar, Menu menu) {
            return this.f23977a.onPrepareActionMode(mo22041e(bVar), m24662f(menu));
        }

        /* renamed from: d */
        public void mo882d(C5522b bVar) {
            this.f23977a.onDestroyActionMode(mo22041e(bVar));
        }

        /* renamed from: e */
        public ActionMode mo22041e(C5522b bVar) {
            int size = this.f23979c.size();
            for (int i = 0; i < size; i++) {
                C5527f fVar = this.f23979c.get(i);
                if (fVar != null && fVar.f23976b == bVar) {
                    return fVar;
                }
            }
            C5527f fVar2 = new C5527f(this.f23978b, bVar);
            this.f23979c.add(fVar2);
            return fVar2;
        }
    }

    public C5527f(Context context, C5522b bVar) {
        this.f23975a = context;
        this.f23976b = bVar;
    }

    public void finish() {
        this.f23976b.mo975c();
    }

    public View getCustomView() {
        return this.f23976b.mo976d();
    }

    public Menu getMenu() {
        return new C5638d(this.f23975a, (C5248a) this.f23976b.mo977e());
    }

    public MenuInflater getMenuInflater() {
        return this.f23976b.mo978f();
    }

    public CharSequence getSubtitle() {
        return this.f23976b.mo979g();
    }

    public Object getTag() {
        return this.f23976b.mo22012h();
    }

    public CharSequence getTitle() {
        return this.f23976b.mo980i();
    }

    public boolean getTitleOptionalHint() {
        return this.f23976b.mo22013j();
    }

    public void invalidate() {
        this.f23976b.mo981k();
    }

    public boolean isTitleOptional() {
        return this.f23976b.mo982l();
    }

    public void setCustomView(View view) {
        this.f23976b.mo983m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f23976b.mo985o(charSequence);
    }

    public void setTag(Object obj) {
        this.f23976b.mo22014p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f23976b.mo987r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f23976b.mo988s(z);
    }

    public void setSubtitle(int i) {
        this.f23976b.mo984n(i);
    }

    public void setTitle(int i) {
        this.f23976b.mo986q(i);
    }
}
