package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;

/* renamed from: com.google.android.material.navigation.b */
/* compiled from: NavigationBarMenu */
public final class C10241b extends C0287e {

    /* renamed from: B */
    private final Class<?> f48187B;

    /* renamed from: C */
    private final int f48188C;

    public C10241b(Context context, Class<?> cls, int i) {
        super(context);
        this.f48187B = cls;
        this.f48188C = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1114a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f48188C) {
            mo1140h0();
            MenuItem a = super.mo1114a(i, i2, i3, charSequence);
            if (a instanceof C0291g) {
                ((C0291g) a).mo1244t(true);
            }
            mo1137g0();
            return a;
        }
        String simpleName = this.f48187B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f48188C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f48187B.getSimpleName() + " does not support submenus");
    }
}
