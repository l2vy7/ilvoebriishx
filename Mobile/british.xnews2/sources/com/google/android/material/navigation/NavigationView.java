package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.widget.C0384f0;
import androidx.core.content.C0600b;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C10191b;
import com.google.android.material.internal.C10194e;
import com.google.android.material.internal.C10195f;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import p072f.C5238a;
import p078g.C5264a;
import p098k.C5529g;
import p110m0.C5690c0;
import p193c6.C6522b;
import p193c6.C6531k;
import p193c6.C6532l;
import p232m6.C10805c;
import p242p6.C10889h;
import p242p6.C10893i;
import p242p6.C10897m;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: n */
    private static final int[] f48156n = {16842912};

    /* renamed from: o */
    private static final int[] f48157o = {-16842910};

    /* renamed from: p */
    private static final int f48158p = C6531k.Widget_Design_NavigationView;

    /* renamed from: g */
    private final C10194e f48159g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10195f f48160h;

    /* renamed from: i */
    C10238c f48161i;

    /* renamed from: j */
    private final int f48162j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int[] f48163k;

    /* renamed from: l */
    private MenuInflater f48164l;

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f48165m;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    class C10236a implements C0287e.C0288a {
        C10236a() {
        }

        /* renamed from: a */
        public boolean mo821a(C0287e eVar, MenuItem menuItem) {
            C10238c cVar = NavigationView.this.f48161i;
            return cVar != null && cVar.mo41060a(menuItem);
        }

        /* renamed from: b */
        public void mo822b(C0287e eVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    class C10237b implements ViewTreeObserver.OnGlobalLayoutListener {
        C10237b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f48163k);
            boolean z = true;
            boolean z2 = NavigationView.this.f48163k[1] == 0;
            NavigationView.this.f48160h.mo40960x(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a = C10191b.m47016a(NavigationView.this.getContext());
            if (a != null && Build.VERSION.SDK_INT >= 21) {
                boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z3 || !z4) {
                    z = false;
                }
                navigationView2.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C10238c {
        /* renamed from: a */
        boolean mo41060a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.navigationViewStyle);
    }

    /* renamed from: d */
    private ColorStateList m47164d(int i) {
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
        int[] iArr = f48157o;
        return new ColorStateList(new int[][]{iArr, f48156n, FrameLayout.EMPTY_STATE_SET}, new int[]{c.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: e */
    private final Drawable m47165e(C0384f0 f0Var) {
        C10889h hVar = new C10889h(C10897m.m48993b(getContext(), f0Var.mo2108n(C6532l.f26703I5, 0), f0Var.mo2108n(C6532l.f26714J5, 0)).mo43154m());
        hVar.mo43091a0(C10805c.m48754b(getContext(), f0Var, C6532l.f26725K5));
        return new InsetDrawable(hVar, f0Var.mo2100f(C6532l.f26758N5, 0), f0Var.mo2100f(C6532l.f26769O5, 0), f0Var.mo2100f(C6532l.f26747M5, 0), f0Var.mo2100f(C6532l.f26736L5, 0));
    }

    /* renamed from: f */
    private boolean m47166f(C0384f0 f0Var) {
        return f0Var.mo2113s(C6532l.f26703I5) || f0Var.mo2113s(C6532l.f26714J5);
    }

    private MenuInflater getMenuInflater() {
        if (this.f48164l == null) {
            this.f48164l = new C5529g(getContext());
        }
        return this.f48164l;
    }

    /* renamed from: i */
    private void m47167i() {
        this.f48165m = new C10237b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f48165m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40877a(C5690c0 c0Var) {
        this.f48160h.mo40949m(c0Var);
    }

    /* renamed from: g */
    public View mo41023g(int i) {
        return this.f48160h.mo40959w(i);
    }

    public MenuItem getCheckedItem() {
        return this.f48160h.mo40950n();
    }

    public int getHeaderCount() {
        return this.f48160h.mo40951o();
    }

    public Drawable getItemBackground() {
        return this.f48160h.mo40952p();
    }

    public int getItemHorizontalPadding() {
        return this.f48160h.mo40953q();
    }

    public int getItemIconPadding() {
        return this.f48160h.mo40954r();
    }

    public ColorStateList getItemIconTintList() {
        return this.f48160h.mo40957u();
    }

    public int getItemMaxLines() {
        return this.f48160h.mo40955s();
    }

    public ColorStateList getItemTextColor() {
        return this.f48160h.mo40956t();
    }

    public Menu getMenu() {
        return this.f48159g;
    }

    /* renamed from: h */
    public void mo41033h(int i) {
        this.f48160h.mo40947J(true);
        getMenuInflater().inflate(i, this.f48159g);
        this.f48160h.mo40947J(false);
        this.f48160h.mo1028c(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48986e(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f48165m);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f48165m);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f48162j), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f48162j, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        this.f48159g.mo1106S(savedState.f48166d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f48166d = bundle;
        this.f48159g.mo1108U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f48159g.findItem(i);
        if (findItem != null) {
            this.f48160h.mo40961y((C0291g) findItem);
        }
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C10893i.m48985d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f48160h.mo40938A(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0600b.m3294f(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f48160h.mo40939B(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f48160h.mo40939B(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f48160h.mo40940C(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f48160h.mo40940C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f48160h.mo40941D(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f48160h.mo40942E(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f48160h.mo40943F(i);
    }

    public void setItemTextAppearance(int i) {
        this.f48160h.mo40944G(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f48160h.mo40945H(colorStateList);
    }

    public void setNavigationItemSelectedListener(C10238c cVar) {
        this.f48161i = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C10195f fVar = this.f48160h;
        if (fVar != null) {
            fVar.mo40946I(i);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10235a();

        /* renamed from: d */
        public Bundle f48166d;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        static class C10235a implements Parcelable.ClassLoaderCreator<SavedState> {
            C10235a() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f48166d = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f48166d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f48158p
            android.content.Context r11 = p245q6.C10962a.m49296c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.internal.f r11 = new com.google.android.material.internal.f
            r11.<init>()
            r10.f48160h = r11
            r0 = 2
            int[] r0 = new int[r0]
            r10.f48163k = r0
            android.content.Context r7 = r10.getContext()
            com.google.android.material.internal.e r8 = new com.google.android.material.internal.e
            r8.<init>(r7)
            r10.f48159g = r8
            int[] r2 = p193c6.C6532l.f27136w5
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            androidx.appcompat.widget.f0 r0 = com.google.android.material.internal.C10220m.m47117i(r0, r1, r2, r3, r4, r5)
            int r1 = p193c6.C6532l.f27147x5
            boolean r2 = r0.mo2113s(r1)
            if (r2 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r1 = r0.mo2101g(r1)
            p110m0.C5723u.m25336r0(r10, r1)
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0072
        L_0x004a:
            p6.m$b r12 = p242p6.C10897m.m48996e(r7, r12, r13, r6)
            p6.m r12 = r12.mo43154m()
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            p6.h r1 = new p6.h
            r1.<init>((p242p6.C10897m) r12)
            boolean r12 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006c
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            int r12 = r13.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r1.mo43091a0(r12)
        L_0x006c:
            r1.mo43084P(r7)
            p110m0.C5723u.m25336r0(r10, r1)
        L_0x0072:
            int r12 = p193c6.C6532l.f26615A5
            boolean r13 = r0.mo2113s(r12)
            if (r13 == 0) goto L_0x0082
            int r12 = r0.mo2100f(r12, r9)
            float r12 = (float) r12
            r10.setElevation(r12)
        L_0x0082:
            int r12 = p193c6.C6532l.f27158y5
            boolean r12 = r0.mo2095a(r12, r9)
            r10.setFitsSystemWindows(r12)
            int r12 = p193c6.C6532l.f27169z5
            int r12 = r0.mo2100f(r12, r9)
            r10.f48162j = r12
            int r12 = p193c6.C6532l.f26681G5
            boolean r13 = r0.mo2113s(r12)
            if (r13 == 0) goto L_0x00a0
            android.content.res.ColorStateList r12 = r0.mo2097c(r12)
            goto L_0x00a7
        L_0x00a0:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r10.m47164d(r12)
        L_0x00a7:
            int r13 = p193c6.C6532l.f26780P5
            boolean r1 = r0.mo2113s(r13)
            r2 = 1
            if (r1 == 0) goto L_0x00b6
            int r13 = r0.mo2108n(r13, r9)
            r1 = 1
            goto L_0x00b8
        L_0x00b6:
            r13 = 0
            r1 = 0
        L_0x00b8:
            int r3 = p193c6.C6532l.f26670F5
            boolean r4 = r0.mo2113s(r3)
            if (r4 == 0) goto L_0x00c7
            int r3 = r0.mo2100f(r3, r9)
            r10.setItemIconSize(r3)
        L_0x00c7:
            r3 = 0
            int r4 = p193c6.C6532l.f26791Q5
            boolean r5 = r0.mo2113s(r4)
            if (r5 == 0) goto L_0x00d4
            android.content.res.ColorStateList r3 = r0.mo2097c(r4)
        L_0x00d4:
            if (r1 != 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            r3 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r3 = r10.m47164d(r3)
        L_0x00df:
            int r4 = p193c6.C6532l.f26637C5
            android.graphics.drawable.Drawable r4 = r0.mo2101g(r4)
            if (r4 != 0) goto L_0x00f1
            boolean r5 = r10.m47166f(r0)
            if (r5 == 0) goto L_0x00f1
            android.graphics.drawable.Drawable r4 = r10.m47165e(r0)
        L_0x00f1:
            int r5 = p193c6.C6532l.f26648D5
            boolean r6 = r0.mo2113s(r5)
            if (r6 == 0) goto L_0x0100
            int r5 = r0.mo2100f(r5, r9)
            r11.mo40939B(r5)
        L_0x0100:
            int r5 = p193c6.C6532l.f26659E5
            int r5 = r0.mo2100f(r5, r9)
            int r6 = p193c6.C6532l.f26692H5
            int r6 = r0.mo2105k(r6, r2)
            r10.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$a r6 = new com.google.android.material.navigation.NavigationView$a
            r6.<init>()
            r8.mo1109V(r6)
            r11.mo40962z(r2)
            r11.mo1033h(r7, r8)
            r11.mo40942E(r12)
            int r12 = r10.getOverScrollMode()
            r11.mo40946I(r12)
            if (r1 == 0) goto L_0x012c
            r11.mo40944G(r13)
        L_0x012c:
            r11.mo40945H(r3)
            r11.mo40938A(r4)
            r11.mo40940C(r5)
            r8.mo1124b(r11)
            androidx.appcompat.view.menu.k r11 = r11.mo40958v(r10)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            int r11 = p193c6.C6532l.f26802R5
            boolean r12 = r0.mo2113s(r11)
            if (r12 == 0) goto L_0x0150
            int r11 = r0.mo2108n(r11, r9)
            r10.mo41033h(r11)
        L_0x0150:
            int r11 = p193c6.C6532l.f26626B5
            boolean r12 = r0.mo2113s(r11)
            if (r12 == 0) goto L_0x015f
            int r11 = r0.mo2108n(r11, r9)
            r10.mo41023g(r11)
        L_0x015f:
            r0.mo2114w()
            r10.m47167i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f48159g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f48160h.mo40961y((C0291g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
