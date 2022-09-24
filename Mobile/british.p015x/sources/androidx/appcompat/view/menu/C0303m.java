package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0287e;

/* renamed from: androidx.appcompat.view.menu.m */
/* compiled from: SubMenuBuilder */
public class C0303m extends C0287e implements SubMenu {

    /* renamed from: B */
    private C0287e f1062B;

    /* renamed from: C */
    private C0291g f1063C;

    public C0303m(Context context, C0287e eVar, C0291g gVar) {
        super(context);
        this.f1062B = eVar;
        this.f1063C = gVar;
    }

    /* renamed from: F */
    public C0287e mo1094F() {
        return this.f1062B.mo1094F();
    }

    /* renamed from: H */
    public boolean mo1096H() {
        return this.f1062B.mo1096H();
    }

    /* renamed from: I */
    public boolean mo1097I() {
        return this.f1062B.mo1097I();
    }

    /* renamed from: J */
    public boolean mo1098J() {
        return this.f1062B.mo1098J();
    }

    /* renamed from: V */
    public void mo1109V(C0287e.C0288a aVar) {
        this.f1062B.mo1109V(aVar);
    }

    /* renamed from: f */
    public boolean mo1135f(C0291g gVar) {
        return this.f1062B.mo1135f(gVar);
    }

    public MenuItem getItem() {
        return this.f1063C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1139h(C0287e eVar, MenuItem menuItem) {
        return super.mo1139h(eVar, menuItem) || this.f1062B.mo1139h(eVar, menuItem);
    }

    /* renamed from: i0 */
    public Menu mo1275i0() {
        return this.f1062B;
    }

    /* renamed from: m */
    public boolean mo1143m(C0291g gVar) {
        return this.f1062B.mo1143m(gVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1062B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1113Z(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1127c0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1132d0(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1063C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1062B.setQwertyMode(z);
    }

    /* renamed from: v */
    public String mo1161v() {
        C0291g gVar = this.f1063C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1161v() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1112Y(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1125b0(i);
    }

    public SubMenu setIcon(int i) {
        this.f1063C.setIcon(i);
        return this;
    }
}
