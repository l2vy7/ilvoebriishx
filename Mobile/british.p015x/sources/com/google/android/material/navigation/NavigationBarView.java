package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.C0384f0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C10220m;
import com.google.android.material.internal.C10227s;
import p063d0.C5135a;
import p099k.C5529g;
import p111m0.C5690c0;
import p111m0.C5723u;
import p194c6.C6524d;
import p194c6.C6532l;
import p233m6.C10805c;
import p237n6.C10841b;
import p243p6.C10889h;
import p243p6.C10893i;
import p246q6.C10962a;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: b */
    private final C10241b f21359b;

    /* renamed from: c */
    private final C10242c f21360c;

    /* renamed from: d */
    private final NavigationBarPresenter f21361d;

    /* renamed from: e */
    private ColorStateList f21362e;

    /* renamed from: f */
    private MenuInflater f21363f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4679d f21364g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4678c f21365h;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4675a();

        /* renamed from: d */
        Bundle f21366d;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        static class C4675a implements Parcelable.ClassLoaderCreator<SavedState> {
            C4675a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m21650b(Parcel parcel, ClassLoader classLoader) {
            this.f21366d = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f21366d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m21650b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    class C4676a implements C0287e.C0288a {
        C4676a() {
        }

        /* renamed from: a */
        public boolean mo821a(C0287e eVar, MenuItem menuItem) {
            if (NavigationBarView.this.f21365h != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                NavigationBarView.this.f21365h.mo19456a(menuItem);
                return true;
            } else if (NavigationBarView.this.f21364g == null || NavigationBarView.this.f21364g.mo19457a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public void mo822b(C0287e eVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    class C4677b implements C10227s.C10232e {
        C4677b() {
        }

        /* renamed from: a */
        public C5690c0 mo19455a(View view, C5690c0 c0Var, C10227s.C10233f fVar) {
            fVar.f48149d += c0Var.mo22410i();
            boolean z = true;
            if (C5723u.m25265B(view) != 1) {
                z = false;
            }
            int j = c0Var.mo22411j();
            int k = c0Var.mo22412k();
            fVar.f48146a += z ? k : j;
            int i = fVar.f48148c;
            if (!z) {
                j = k;
            }
            fVar.f48148c = i + j;
            fVar.mo41013a(view);
            return c0Var;
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C4678c {
        /* renamed from: a */
        void mo19456a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$d */
    public interface C4679d {
        /* renamed from: a */
        boolean mo19457a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C10962a.m49296c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f21361d = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C6532l.f26971h5;
        int i3 = C6532l.f27059p5;
        int i4 = C6532l.f27048o5;
        C0384f0 i5 = C10220m.m47117i(context2, attributeSet, iArr, i, i2, i3, i4);
        C10241b bVar = new C10241b(context2, getClass(), getMaxItemCount());
        this.f21359b = bVar;
        C10242c e = mo19413e(context2);
        this.f21360c = e;
        navigationBarPresenter.mo41015j(e);
        navigationBarPresenter.mo41014a(1);
        e.setPresenter(navigationBarPresenter);
        bVar.mo1124b(navigationBarPresenter);
        navigationBarPresenter.mo1033h(getContext(), bVar);
        int i6 = C6532l.f27026m5;
        if (i5.mo2113s(i6)) {
            e.setIconTintList(i5.mo2097c(i6));
        } else {
            e.setIconTintList(e.mo41087e(16842808));
        }
        setItemIconSize(i5.mo2100f(C6532l.f27015l5, getResources().getDimensionPixelSize(C6524d.mtrl_navigation_bar_item_default_icon_size)));
        if (i5.mo2113s(i3)) {
            setItemTextAppearanceInactive(i5.mo2108n(i3, 0));
        }
        if (i5.mo2113s(i4)) {
            setItemTextAppearanceActive(i5.mo2108n(i4, 0));
        }
        int i7 = C6532l.f27070q5;
        if (i5.mo2113s(i7)) {
            setItemTextColor(i5.mo2097c(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C5723u.m25336r0(this, m21647d(context2));
        }
        int i8 = C6532l.f26993j5;
        if (i5.mo2113s(i8)) {
            setElevation((float) i5.mo2100f(i8, 0));
        }
        C5135a.m23415o(getBackground().mutate(), C10805c.m48754b(context2, i5, C6532l.f26982i5));
        setLabelVisibilityMode(i5.mo2106l(C6532l.f27081r5, -1));
        int n = i5.mo2108n(C6532l.f27004k5, 0);
        if (n != 0) {
            e.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(C10805c.m48754b(context2, i5, C6532l.f27037n5));
        }
        int i9 = C6532l.f27092s5;
        if (i5.mo2113s(i9)) {
            mo19418f(i5.mo2108n(i9, 0));
        }
        i5.mo2114w();
        addView(e);
        bVar.mo1109V(new C4676a());
        m21646c();
    }

    /* renamed from: c */
    private void m21646c() {
        C10227s.m47134b(this, new C4677b());
    }

    /* renamed from: d */
    private C10889h m21647d(Context context) {
        C10889h hVar = new C10889h();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            hVar.mo43091a0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        hVar.mo43084P(context);
        return hVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f21363f == null) {
            this.f21363f = new C5529g(getContext());
        }
        return this.f21363f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C10242c mo19413e(Context context);

    /* renamed from: f */
    public void mo19418f(int i) {
        this.f21361d.mo41016m(true);
        getMenuInflater().inflate(i, this.f21359b);
        this.f21361d.mo41016m(false);
        this.f21361d.mo1028c(true);
    }

    public Drawable getItemBackground() {
        return this.f21360c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f21360c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f21360c.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f21360c.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f21362e;
    }

    public int getItemTextAppearanceActive() {
        return this.f21360c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f21360c.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f21360c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f21360c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f21359b;
    }

    public C0298k getMenuView() {
        return this.f21360c;
    }

    /* access modifiers changed from: protected */
    public NavigationBarPresenter getPresenter() {
        return this.f21361d;
    }

    public int getSelectedItemId() {
        return this.f21360c.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48986e(this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        this.f21359b.mo1106S(savedState.f21366d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f21366d = bundle;
        this.f21359b.mo1108U(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C10893i.m48985d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f21360c.setItemBackground(drawable);
        this.f21362e = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f21360c.setItemBackgroundRes(i);
        this.f21362e = null;
    }

    public void setItemIconSize(int i) {
        this.f21360c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f21360c.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f21362e != colorStateList) {
            this.f21362e = colorStateList;
            if (colorStateList == null) {
                this.f21360c.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList a = C10841b.m48830a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f21360c.setItemBackground(new RippleDrawable(a, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable r = C5135a.m23418r(gradientDrawable);
            C5135a.m23415o(r, a);
            this.f21360c.setItemBackground(r);
        } else if (colorStateList == null && this.f21360c.getItemBackground() != null) {
            this.f21360c.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f21360c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f21360c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f21360c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f21360c.getLabelVisibilityMode() != i) {
            this.f21360c.setLabelVisibilityMode(i);
            this.f21361d.mo1028c(false);
        }
    }

    public void setOnItemReselectedListener(C4678c cVar) {
        this.f21365h = cVar;
    }

    public void setOnItemSelectedListener(C4679d dVar) {
        this.f21364g = dVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f21359b.findItem(i);
        if (findItem != null && !this.f21359b.mo1103O(findItem, this.f21361d, 0)) {
            findItem.setChecked(true);
        }
    }
}
