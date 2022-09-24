package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.view.menu.C0303m;
import androidx.recyclerview.widget.C1162k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p110m0.C5690c0;
import p110m0.C5723u;
import p116n0.C5771c;
import p193c6.C6524d;
import p193c6.C6528h;

/* renamed from: com.google.android.material.internal.f */
/* compiled from: NavigationMenuPresenter */
public class C10195f implements C0296j {

    /* renamed from: b */
    private NavigationMenuView f48064b;

    /* renamed from: c */
    LinearLayout f48065c;

    /* renamed from: d */
    private C0296j.C0297a f48066d;

    /* renamed from: e */
    C0287e f48067e;

    /* renamed from: f */
    private int f48068f;

    /* renamed from: g */
    C10198c f48069g;

    /* renamed from: h */
    LayoutInflater f48070h;

    /* renamed from: i */
    int f48071i;

    /* renamed from: j */
    boolean f48072j;

    /* renamed from: k */
    ColorStateList f48073k;

    /* renamed from: l */
    ColorStateList f48074l;

    /* renamed from: m */
    Drawable f48075m;

    /* renamed from: n */
    int f48076n;

    /* renamed from: o */
    int f48077o;

    /* renamed from: p */
    int f48078p;

    /* renamed from: q */
    boolean f48079q;

    /* renamed from: r */
    boolean f48080r = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f48081s;

    /* renamed from: t */
    private int f48082t;

    /* renamed from: u */
    int f48083u;

    /* renamed from: v */
    private int f48084v = -1;

    /* renamed from: w */
    final View.OnClickListener f48085w = new C10196a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* compiled from: NavigationMenuPresenter */
    class C10196a implements View.OnClickListener {
        C10196a() {
        }

        public void onClick(View view) {
            boolean z = true;
            C10195f.this.mo40947J(true);
            C0291g itemData = ((NavigationMenuItemView) view).getItemData();
            C10195f fVar = C10195f.this;
            boolean O = fVar.f48067e.mo1103O(itemData, fVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                C10195f.this.f48069g.mo40971j(itemData);
            }
            C10195f.this.mo40947J(false);
            if (z) {
                C10195f.this.mo1028c(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* compiled from: NavigationMenuPresenter */
    private static class C10197b extends C10207l {
        public C10197b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.f$c */
    /* compiled from: NavigationMenuPresenter */
    private class C10198c extends RecyclerView.C1092h<C10207l> {

        /* renamed from: a */
        private final ArrayList<C10200e> f48087a = new ArrayList<>();

        /* renamed from: b */
        private C0291g f48088b;

        /* renamed from: c */
        private boolean f48089c;

        C10198c() {
            m47061h();
        }

        /* renamed from: a */
        private void m47060a(int i, int i2) {
            while (i < i2) {
                ((C10202g) this.f48087a.get(i)).f48094b = true;
                i++;
            }
        }

        /* renamed from: h */
        private void m47061h() {
            if (!this.f48089c) {
                this.f48089c = true;
                this.f48087a.clear();
                this.f48087a.add(new C10199d());
                int i = -1;
                int size = C10195f.this.f48067e.mo1095G().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0291g gVar = C10195f.this.f48067e.mo1095G().get(i3);
                    if (gVar.isChecked()) {
                        mo40971j(gVar);
                    }
                    if (gVar.isCheckable()) {
                        gVar.mo1244t(false);
                    }
                    if (gVar.hasSubMenu()) {
                        SubMenu subMenu = gVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f48087a.add(new C10201f(C10195f.this.f48083u, 0));
                            }
                            this.f48087a.add(new C10202g(gVar));
                            int size2 = this.f48087a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0291g gVar2 = (C0291g) subMenu.getItem(i4);
                                if (gVar2.isVisible()) {
                                    if (!z2 && gVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (gVar2.isCheckable()) {
                                        gVar2.mo1244t(false);
                                    }
                                    if (gVar.isChecked()) {
                                        mo40971j(gVar);
                                    }
                                    this.f48087a.add(new C10202g(gVar2));
                                }
                            }
                            if (z2) {
                                m47060a(size2, this.f48087a.size());
                            }
                        }
                    } else {
                        int groupId = gVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f48087a.size();
                            z = gVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<C10200e> arrayList = this.f48087a;
                                int i5 = C10195f.this.f48083u;
                                arrayList.add(new C10201f(i5, i5));
                            }
                        } else if (!z && gVar.getIcon() != null) {
                            m47060a(i2, this.f48087a.size());
                            z = true;
                        }
                        C10202g gVar3 = new C10202g(gVar);
                        gVar3.f48094b = z;
                        this.f48087a.add(gVar3);
                        i = groupId;
                    }
                }
                this.f48089c = false;
            }
        }

        /* renamed from: b */
        public Bundle mo40964b() {
            Bundle bundle = new Bundle();
            C0291g gVar = this.f48088b;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f48087a.size();
            for (int i = 0; i < size; i++) {
                C10200e eVar = this.f48087a.get(i);
                if (eVar instanceof C10202g) {
                    C0291g a = ((C10202g) eVar).mo40976a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: c */
        public C0291g mo40965c() {
            return this.f48088b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo40966d() {
            int i = C10195f.this.f48065c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C10195f.this.f48069g.getItemCount(); i2++) {
                if (C10195f.this.f48069g.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: e */
        public void onBindViewHolder(C10207l lVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(C10195f.this.f48074l);
                C10195f fVar = C10195f.this;
                if (fVar.f48072j) {
                    navigationMenuItemView.setTextAppearance(fVar.f48071i);
                }
                ColorStateList colorStateList = C10195f.this.f48073k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C10195f.this.f48075m;
                C5723u.m25336r0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C10202g gVar = (C10202g) this.f48087a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f48094b);
                navigationMenuItemView.setHorizontalPadding(C10195f.this.f48076n);
                navigationMenuItemView.setIconPadding(C10195f.this.f48077o);
                C10195f fVar2 = C10195f.this;
                if (fVar2.f48079q) {
                    navigationMenuItemView.setIconSize(fVar2.f48078p);
                }
                navigationMenuItemView.setMaxLines(C10195f.this.f48081s);
                navigationMenuItemView.mo993e(gVar.mo40976a(), 0);
            } else if (itemViewType == 1) {
                ((TextView) lVar.itemView).setText(((C10202g) this.f48087a.get(i)).mo40976a().getTitle());
            } else if (itemViewType == 2) {
                C10201f fVar3 = (C10201f) this.f48087a.get(i);
                lVar.itemView.setPadding(0, fVar3.mo40975b(), 0, fVar3.mo40974a());
            }
        }

        /* renamed from: f */
        public C10207l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C10195f fVar = C10195f.this;
                return new C10204i(fVar.f48070h, viewGroup, fVar.f48085w);
            } else if (i == 1) {
                return new C10206k(C10195f.this.f48070h, viewGroup);
            } else {
                if (i == 2) {
                    return new C10205j(C10195f.this.f48070h, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C10197b(C10195f.this.f48065c);
            }
        }

        /* renamed from: g */
        public void onViewRecycled(C10207l lVar) {
            if (lVar instanceof C10204i) {
                ((NavigationMenuItemView) lVar.itemView).mo40842D();
            }
        }

        public int getItemCount() {
            return this.f48087a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            C10200e eVar = this.f48087a.get(i);
            if (eVar instanceof C10201f) {
                return 2;
            }
            if (eVar instanceof C10199d) {
                return 3;
            }
            if (eVar instanceof C10202g) {
                return ((C10202g) eVar).mo40976a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: i */
        public void mo40970i(Bundle bundle) {
            C0291g a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0291g a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f48089c = true;
                int size = this.f48087a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C10200e eVar = this.f48087a.get(i2);
                    if ((eVar instanceof C10202g) && (a2 = ((C10202g) eVar).mo40976a()) != null && a2.getItemId() == i) {
                        mo40971j(a2);
                        break;
                    }
                    i2++;
                }
                this.f48089c = false;
                m47061h();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f48087a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C10200e eVar2 = this.f48087a.get(i3);
                    if (!(!(eVar2 instanceof C10202g) || (a = ((C10202g) eVar2).mo40976a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo40971j(C0291g gVar) {
            if (this.f48088b != gVar && gVar.isCheckable()) {
                C0291g gVar2 = this.f48088b;
                if (gVar2 != null) {
                    gVar2.setChecked(false);
                }
                this.f48088b = gVar;
                gVar.setChecked(true);
            }
        }

        /* renamed from: k */
        public void mo40972k(boolean z) {
            this.f48089c = z;
        }

        /* renamed from: l */
        public void mo40973l() {
            m47061h();
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.google.android.material.internal.f$d */
    /* compiled from: NavigationMenuPresenter */
    private static class C10199d implements C10200e {
        C10199d() {
        }
    }

    /* renamed from: com.google.android.material.internal.f$e */
    /* compiled from: NavigationMenuPresenter */
    private interface C10200e {
    }

    /* renamed from: com.google.android.material.internal.f$f */
    /* compiled from: NavigationMenuPresenter */
    private static class C10201f implements C10200e {

        /* renamed from: a */
        private final int f48091a;

        /* renamed from: b */
        private final int f48092b;

        public C10201f(int i, int i2) {
            this.f48091a = i;
            this.f48092b = i2;
        }

        /* renamed from: a */
        public int mo40974a() {
            return this.f48092b;
        }

        /* renamed from: b */
        public int mo40975b() {
            return this.f48091a;
        }
    }

    /* renamed from: com.google.android.material.internal.f$g */
    /* compiled from: NavigationMenuPresenter */
    private static class C10202g implements C10200e {

        /* renamed from: a */
        private final C0291g f48093a;

        /* renamed from: b */
        boolean f48094b;

        C10202g(C0291g gVar) {
            this.f48093a = gVar;
        }

        /* renamed from: a */
        public C0291g mo40976a() {
            return this.f48093a;
        }
    }

    /* renamed from: com.google.android.material.internal.f$h */
    /* compiled from: NavigationMenuPresenter */
    private class C10203h extends C1162k {
        C10203h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22630e0(C5771c.C5773b.m25621a(C10195f.this.f48069g.mo40966d(), 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$i */
    /* compiled from: NavigationMenuPresenter */
    private static class C10204i extends C10207l {
        public C10204i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C6528h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.f$j */
    /* compiled from: NavigationMenuPresenter */
    private static class C10205j extends C10207l {
        public C10205j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C6528h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$k */
    /* compiled from: NavigationMenuPresenter */
    private static class C10206k extends C10207l {
        public C10206k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C6528h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$l */
    /* compiled from: NavigationMenuPresenter */
    private static abstract class C10207l extends RecyclerView.C1087c0 {
        public C10207l(View view) {
            super(view);
        }
    }

    /* renamed from: K */
    private void m47024K() {
        int i = (this.f48065c.getChildCount() != 0 || !this.f48080r) ? 0 : this.f48082t;
        NavigationMenuView navigationMenuView = this.f48064b;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void mo40938A(Drawable drawable) {
        this.f48075m = drawable;
        mo1028c(false);
    }

    /* renamed from: B */
    public void mo40939B(int i) {
        this.f48076n = i;
        mo1028c(false);
    }

    /* renamed from: C */
    public void mo40940C(int i) {
        this.f48077o = i;
        mo1028c(false);
    }

    /* renamed from: D */
    public void mo40941D(int i) {
        if (this.f48078p != i) {
            this.f48078p = i;
            this.f48079q = true;
            mo1028c(false);
        }
    }

    /* renamed from: E */
    public void mo40942E(ColorStateList colorStateList) {
        this.f48074l = colorStateList;
        mo1028c(false);
    }

    /* renamed from: F */
    public void mo40943F(int i) {
        this.f48081s = i;
        mo1028c(false);
    }

    /* renamed from: G */
    public void mo40944G(int i) {
        this.f48071i = i;
        this.f48072j = true;
        mo1028c(false);
    }

    /* renamed from: H */
    public void mo40945H(ColorStateList colorStateList) {
        this.f48073k = colorStateList;
        mo1028c(false);
    }

    /* renamed from: I */
    public void mo40946I(int i) {
        this.f48084v = i;
        NavigationMenuView navigationMenuView = this.f48064b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: J */
    public void mo40947J(boolean z) {
        C10198c cVar = this.f48069g;
        if (cVar != null) {
            cVar.mo40972k(z);
        }
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
        C0296j.C0297a aVar = this.f48066d;
        if (aVar != null) {
            aVar.mo877b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        C10198c cVar = this.f48069g;
        if (cVar != null) {
            cVar.mo40973l();
        }
    }

    /* renamed from: d */
    public boolean mo1045d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1029e(C0287e eVar, C0291g gVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1030f(C0287e eVar, C0291g gVar) {
        return false;
    }

    public int getId() {
        return this.f48068f;
    }

    /* renamed from: h */
    public void mo1033h(Context context, C0287e eVar) {
        this.f48070h = LayoutInflater.from(context);
        this.f48067e = eVar;
        this.f48083u = context.getResources().getDimensionPixelOffset(C6524d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: i */
    public void mo1047i(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f48064b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f48069g.mo40970i(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f48065c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: j */
    public void mo40948j(View view) {
        this.f48065c.addView(view);
        NavigationMenuView navigationMenuView = this.f48064b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: k */
    public boolean mo1035k(C0303m mVar) {
        return false;
    }

    /* renamed from: l */
    public Parcelable mo1049l() {
        Bundle bundle = new Bundle();
        if (this.f48064b != null) {
            SparseArray sparseArray = new SparseArray();
            this.f48064b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C10198c cVar = this.f48069g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.mo40964b());
        }
        if (this.f48065c != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f48065c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: m */
    public void mo40949m(C5690c0 c0Var) {
        int l = c0Var.mo22413l();
        if (this.f48082t != l) {
            this.f48082t = l;
            m47024K();
        }
        NavigationMenuView navigationMenuView = this.f48064b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0Var.mo22410i());
        C5723u.m25315h(this.f48065c, c0Var);
    }

    /* renamed from: n */
    public C0291g mo40950n() {
        return this.f48069g.mo40965c();
    }

    /* renamed from: o */
    public int mo40951o() {
        return this.f48065c.getChildCount();
    }

    /* renamed from: p */
    public Drawable mo40952p() {
        return this.f48075m;
    }

    /* renamed from: q */
    public int mo40953q() {
        return this.f48076n;
    }

    /* renamed from: r */
    public int mo40954r() {
        return this.f48077o;
    }

    /* renamed from: s */
    public int mo40955s() {
        return this.f48081s;
    }

    /* renamed from: t */
    public ColorStateList mo40956t() {
        return this.f48073k;
    }

    /* renamed from: u */
    public ColorStateList mo40957u() {
        return this.f48074l;
    }

    /* renamed from: v */
    public C0298k mo40958v(ViewGroup viewGroup) {
        if (this.f48064b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f48070h.inflate(C6528h.design_navigation_menu, viewGroup, false);
            this.f48064b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C10203h(this.f48064b));
            if (this.f48069g == null) {
                this.f48069g = new C10198c();
            }
            int i = this.f48084v;
            if (i != -1) {
                this.f48064b.setOverScrollMode(i);
            }
            this.f48065c = (LinearLayout) this.f48070h.inflate(C6528h.design_navigation_item_header, this.f48064b, false);
            this.f48064b.setAdapter(this.f48069g);
        }
        return this.f48064b;
    }

    /* renamed from: w */
    public View mo40959w(int i) {
        View inflate = this.f48070h.inflate(i, this.f48065c, false);
        mo40948j(inflate);
        return inflate;
    }

    /* renamed from: x */
    public void mo40960x(boolean z) {
        if (this.f48080r != z) {
            this.f48080r = z;
            m47024K();
        }
    }

    /* renamed from: y */
    public void mo40961y(C0291g gVar) {
        this.f48069g.mo40971j(gVar);
    }

    /* renamed from: z */
    public void mo40962z(int i) {
        this.f48068f = i;
    }
}
