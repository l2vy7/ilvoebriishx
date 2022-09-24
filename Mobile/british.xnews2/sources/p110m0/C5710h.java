package p110m0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p073f0.C5249b;

/* renamed from: m0.h */
/* compiled from: MenuItemCompat */
public final class C5710h {
    /* renamed from: a */
    public static C5685b m25220a(MenuItem menuItem) {
        if (menuItem instanceof C5249b) {
            return ((C5249b) menuItem).mo1173a();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    /* renamed from: b */
    public static MenuItem m25221b(MenuItem menuItem, C5685b bVar) {
        if (menuItem instanceof C5249b) {
            return ((C5249b) menuItem).mo1174b(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: c */
    public static void m25222c(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C5249b) {
            ((C5249b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: d */
    public static void m25223d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C5249b) {
            ((C5249b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: e */
    public static void m25224e(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C5249b) {
            ((C5249b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: f */
    public static void m25225f(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C5249b) {
            ((C5249b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: g */
    public static void m25226g(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C5249b) {
            ((C5249b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: h */
    public static void m25227h(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C5249b) {
            ((C5249b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
