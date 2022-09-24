package p104l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p074f0.C5249b;
import p074f0.C5250c;
import p150t.C6090g;

/* renamed from: l.b */
/* compiled from: BaseMenuWrapper */
abstract class C5631b {

    /* renamed from: a */
    final Context f24194a;

    /* renamed from: b */
    private C6090g<C5249b, MenuItem> f24195b;

    /* renamed from: c */
    private C6090g<C5250c, SubMenu> f24196c;

    C5631b(Context context) {
        this.f24194a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo22228c(MenuItem menuItem) {
        if (!(menuItem instanceof C5249b)) {
            return menuItem;
        }
        C5249b bVar = (C5249b) menuItem;
        if (this.f24195b == null) {
            this.f24195b = new C6090g<>();
        }
        MenuItem menuItem2 = this.f24195b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C5632c cVar = new C5632c(this.f24194a, bVar);
        this.f24195b.put(bVar, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo22229d(SubMenu subMenu) {
        if (!(subMenu instanceof C5250c)) {
            return subMenu;
        }
        C5250c cVar = (C5250c) subMenu;
        if (this.f24196c == null) {
            this.f24196c = new C6090g<>();
        }
        SubMenu subMenu2 = this.f24196c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C5640f fVar = new C5640f(this.f24194a, cVar);
        this.f24196c.put(cVar, fVar);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo22230e() {
        C6090g<C5249b, MenuItem> gVar = this.f24195b;
        if (gVar != null) {
            gVar.clear();
        }
        C6090g<C5250c, SubMenu> gVar2 = this.f24196c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo22231f(int i) {
        if (this.f24195b != null) {
            int i2 = 0;
            while (i2 < this.f24195b.size()) {
                if (this.f24195b.mo23390j(i2).getGroupId() == i) {
                    this.f24195b.mo159m(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo22232g(int i) {
        if (this.f24195b != null) {
            for (int i2 = 0; i2 < this.f24195b.size(); i2++) {
                if (this.f24195b.mo23390j(i2).getItemId() == i) {
                    this.f24195b.mo159m(i2);
                    return;
                }
            }
        }
    }
}
