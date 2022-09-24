package p103l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p073f0.C5248a;

/* renamed from: l.d */
/* compiled from: MenuWrapperICS */
public class C5638d extends C5631b implements Menu {

    /* renamed from: d */
    private final C5248a f24208d;

    public C5638d(Context context, C5248a aVar) {
        super(context);
        if (aVar != null) {
            this.f24208d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo22228c(this.f24208d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f24208d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo22228c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo22229d(this.f24208d.addSubMenu(charSequence));
    }

    public void clear() {
        mo22230e();
        this.f24208d.clear();
    }

    public void close() {
        this.f24208d.close();
    }

    public MenuItem findItem(int i) {
        return mo22228c(this.f24208d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo22228c(this.f24208d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f24208d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f24208d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f24208d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f24208d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo22231f(i);
        this.f24208d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo22232g(i);
        this.f24208d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f24208d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f24208d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f24208d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f24208d.setQwertyMode(z);
    }

    public int size() {
        return this.f24208d.size();
    }

    public MenuItem add(int i) {
        return mo22228c(this.f24208d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo22229d(this.f24208d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo22228c(this.f24208d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo22229d(this.f24208d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo22228c(this.f24208d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo22229d(this.f24208d.addSubMenu(i, i2, i3, i4));
    }
}
