package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;

/* renamed from: com.google.android.material.internal.e */
/* compiled from: NavigationMenu */
public class C10194e extends C0287e {
    public C10194e(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0291g gVar = (C0291g) mo1114a(i, i2, i3, charSequence);
        C10208g gVar2 = new C10208g(mo1162w(), this, gVar);
        gVar.mo1249x(gVar2);
        return gVar2;
    }
}
