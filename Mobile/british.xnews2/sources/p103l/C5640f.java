package p103l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p073f0.C5250c;

/* renamed from: l.f */
/* compiled from: SubMenuWrapperICS */
class C5640f extends C5638d implements SubMenu {

    /* renamed from: e */
    private final C5250c f24209e;

    C5640f(Context context, C5250c cVar) {
        super(context, cVar);
        this.f24209e = cVar;
    }

    public void clearHeader() {
        this.f24209e.clearHeader();
    }

    public MenuItem getItem() {
        return mo22228c(this.f24209e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f24209e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f24209e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f24209e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f24209e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f24209e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f24209e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f24209e.setIcon(drawable);
        return this;
    }
}
