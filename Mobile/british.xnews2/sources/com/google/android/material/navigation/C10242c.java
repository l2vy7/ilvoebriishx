package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0298k;
import androidx.transition.AutoTransition;
import androidx.transition.C1331s;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C10217k;
import java.util.HashSet;
import p072f.C5238a;
import p078g.C5264a;
import p104l0.C5645e;
import p104l0.C5647g;
import p110m0.C5723u;
import p116n0.C5771c;
import p155u0.C6172b;

/* renamed from: com.google.android.material.navigation.c */
/* compiled from: NavigationBarMenuView */
public abstract class C10242c extends ViewGroup implements C0298k {

    /* renamed from: u */
    private static final int[] f48189u = {16842912};

    /* renamed from: v */
    private static final int[] f48190v = {-16842910};

    /* renamed from: b */
    private final TransitionSet f48191b;

    /* renamed from: c */
    private final View.OnClickListener f48192c;

    /* renamed from: d */
    private final C5645e<C10239a> f48193d = new C5647g(5);

    /* renamed from: e */
    private final SparseArray<View.OnTouchListener> f48194e = new SparseArray<>(5);

    /* renamed from: f */
    private int f48195f;

    /* renamed from: g */
    private C10239a[] f48196g;

    /* renamed from: h */
    private int f48197h = 0;

    /* renamed from: i */
    private int f48198i = 0;

    /* renamed from: j */
    private ColorStateList f48199j;

    /* renamed from: k */
    private int f48200k;

    /* renamed from: l */
    private ColorStateList f48201l;

    /* renamed from: m */
    private final ColorStateList f48202m = mo41087e(16842808);

    /* renamed from: n */
    private int f48203n;

    /* renamed from: o */
    private int f48204o;

    /* renamed from: p */
    private Drawable f48205p;

    /* renamed from: q */
    private int f48206q;

    /* renamed from: r */
    private SparseArray<BadgeDrawable> f48207r = new SparseArray<>(5);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public NavigationBarPresenter f48208s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C0287e f48209t;

    /* renamed from: com.google.android.material.navigation.c$a */
    /* compiled from: NavigationBarMenuView */
    class C10243a implements View.OnClickListener {
        C10243a() {
        }

        public void onClick(View view) {
            C0291g itemData = ((C10239a) view).getItemData();
            if (!C10242c.this.f48209t.mo1103O(itemData, C10242c.this.f48208s, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public C10242c(Context context) {
        super(context);
        AutoTransition autoTransition = new AutoTransition();
        this.f48191b = autoTransition;
        autoTransition.mo6276G0(0);
        autoTransition.mo6251n0(115);
        autoTransition.mo6255p0(new C6172b());
        autoTransition.mo6280y0(new C10217k());
        this.f48192c = new C10243a();
        C5723u.m25350y0(this, 1);
    }

    private C10239a getNewItem() {
        C10239a acquire = this.f48193d.acquire();
        return acquire == null ? mo39797f(getContext()) : acquire;
    }

    /* renamed from: h */
    private boolean m47194h(int i) {
        return i != -1;
    }

    /* renamed from: i */
    private void m47195i() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f48209t.size(); i++) {
            hashSet.add(Integer.valueOf(this.f48209t.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f48207r.size(); i2++) {
            int keyAt = this.f48207r.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f48207r.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(C10239a aVar) {
        BadgeDrawable badgeDrawable;
        int id = aVar.getId();
        if (m47194h(id) && (badgeDrawable = this.f48207r.get(id)) != null) {
            aVar.setBadge(badgeDrawable);
        }
    }

    /* renamed from: b */
    public void mo1013b(C0287e eVar) {
        this.f48209t = eVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d */
    public void mo41086d() {
        removeAllViews();
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a aVar : aVarArr) {
                if (aVar != null) {
                    this.f48193d.mo7110a(aVar);
                    aVar.mo41066h();
                }
            }
        }
        if (this.f48209t.size() == 0) {
            this.f48197h = 0;
            this.f48198i = 0;
            this.f48196g = null;
            return;
        }
        m47195i();
        this.f48196g = new C10239a[this.f48209t.size()];
        boolean g = mo41088g(this.f48195f, this.f48209t.mo1095G().size());
        for (int i = 0; i < this.f48209t.size(); i++) {
            this.f48208s.mo41016m(true);
            this.f48209t.getItem(i).setCheckable(true);
            this.f48208s.mo41016m(false);
            C10239a newItem = getNewItem();
            this.f48196g[i] = newItem;
            newItem.setIconTintList(this.f48199j);
            newItem.setIconSize(this.f48200k);
            newItem.setTextColor(this.f48202m);
            newItem.setTextAppearanceInactive(this.f48203n);
            newItem.setTextAppearanceActive(this.f48204o);
            newItem.setTextColor(this.f48201l);
            Drawable drawable = this.f48205p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f48206q);
            }
            newItem.setShifting(g);
            newItem.setLabelVisibilityMode(this.f48195f);
            C0291g gVar = (C0291g) this.f48209t.getItem(i);
            newItem.mo993e(gVar, 0);
            newItem.setItemPosition(i);
            int itemId = gVar.getItemId();
            newItem.setOnTouchListener(this.f48194e.get(itemId));
            newItem.setOnClickListener(this.f48192c);
            int i2 = this.f48197h;
            if (i2 != 0 && itemId == i2) {
                this.f48198i = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f48209t.size() - 1, this.f48198i);
        this.f48198i = min;
        this.f48209t.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList mo41087e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c = C5264a.m23788c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C5238a.f22828x, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        int[] iArr = f48190v;
        return new ColorStateList(new int[][]{iArr, f48189u, ViewGroup.EMPTY_STATE_SET}, new int[]{c.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C10239a mo39797f(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo41088g(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f48207r;
    }

    public ColorStateList getIconTintList() {
        return this.f48199j;
    }

    public Drawable getItemBackground() {
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f48205p;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f48206q;
    }

    public int getItemIconSize() {
        return this.f48200k;
    }

    public int getItemTextAppearanceActive() {
        return this.f48204o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f48203n;
    }

    public ColorStateList getItemTextColor() {
        return this.f48201l;
    }

    public int getLabelVisibilityMode() {
        return this.f48195f;
    }

    /* access modifiers changed from: protected */
    public C0287e getMenu() {
        return this.f48209t;
    }

    public int getSelectedItemId() {
        return this.f48197h;
    }

    /* access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f48198i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo41102j(int i) {
        int size = this.f48209t.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f48209t.getItem(i2);
            if (i == item.getItemId()) {
                this.f48197h = i;
                this.f48198i = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo41103k() {
        C0287e eVar = this.f48209t;
        if (eVar != null && this.f48196g != null) {
            int size = eVar.size();
            if (size != this.f48196g.length) {
                mo41086d();
                return;
            }
            int i = this.f48197h;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f48209t.getItem(i2);
                if (item.isChecked()) {
                    this.f48197h = item.getItemId();
                    this.f48198i = i2;
                }
            }
            if (i != this.f48197h) {
                C1331s.m7133a(this, this.f48191b);
            }
            boolean g = mo41088g(this.f48195f, this.f48209t.mo1095G().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f48208s.mo41016m(true);
                this.f48196g[i3].setLabelVisibilityMode(this.f48195f);
                this.f48196g[i3].setShifting(g);
                this.f48196g[i3].mo993e((C0291g) this.f48209t.getItem(i3), 0);
                this.f48208s.mo41016m(false);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(1, this.f48209t.mo1095G().size(), false, 1));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f48207r = sparseArray;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f48199j = colorStateList;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f48205p = drawable;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f48206q = i;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f48200k = i;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f48204o = i;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f48201l;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f48203n = i;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f48201l;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f48201l = colorStateList;
        C10239a[] aVarArr = this.f48196g;
        if (aVarArr != null) {
            for (C10239a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f48195f = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f48208s = navigationBarPresenter;
    }
}
