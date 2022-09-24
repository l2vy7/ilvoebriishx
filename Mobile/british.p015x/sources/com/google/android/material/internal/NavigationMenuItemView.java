package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.C0390h0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.C0624k;
import p010b0.C1523f;
import p063d0.C5135a;
import p073f.C5238a;
import p111m0.C5682a;
import p111m0.C5723u;
import p117n0.C5771c;
import p194c6.C6524d;
import p194c6.C6525e;
import p194c6.C6526f;
import p194c6.C6528h;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0298k.C0299a {

    /* renamed from: G */
    private static final int[] f47978G = {16842912};

    /* renamed from: A */
    private FrameLayout f47979A;

    /* renamed from: B */
    private C0291g f47980B;

    /* renamed from: C */
    private ColorStateList f47981C;

    /* renamed from: D */
    private boolean f47982D;

    /* renamed from: E */
    private Drawable f47983E;

    /* renamed from: F */
    private final C5682a f47984F;

    /* renamed from: w */
    private int f47985w;

    /* renamed from: x */
    private boolean f47986x;

    /* renamed from: y */
    boolean f47987y;

    /* renamed from: z */
    private final CheckedTextView f47988z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C10183a extends C5682a {
        C10183a() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22623a0(NavigationMenuItemView.this.f47987y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m46914B() {
        if (m46916E()) {
            this.f47988z.setVisibility(8);
            FrameLayout frameLayout = this.f47979A;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f47979A.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f47988z.setVisibility(0);
        FrameLayout frameLayout2 = this.f47979A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f47979A.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m46915C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C5238a.f22826v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f47978G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: E */
    private boolean m46916E() {
        return this.f47980B.getTitle() == null && this.f47980B.getIcon() == null && this.f47980B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f47979A == null) {
                this.f47979A = (FrameLayout) ((ViewStub) findViewById(C6526f.design_menu_item_action_area_stub)).inflate();
            }
            this.f47979A.removeAllViews();
            this.f47979A.addView(view);
        }
    }

    /* renamed from: D */
    public void mo40842D() {
        FrameLayout frameLayout = this.f47979A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f47988z.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: d */
    public boolean mo992d() {
        return false;
    }

    /* renamed from: e */
    public void mo993e(C0291g gVar, int i) {
        this.f47980B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C5723u.m25336r0(this, m46915C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        C0390h0.m2064a(this, gVar.getTooltipText());
        m46914B();
    }

    public C0291g getItemData() {
        return this.f47980B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0291g gVar = this.f47980B;
        if (gVar != null && gVar.isCheckable() && this.f47980B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f47978G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f47987y != z) {
            this.f47987y = z;
            this.f47984F.mo5796l(this.f47988z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f47988z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f47982D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C5135a.m23418r(drawable).mutate();
                C5135a.m23415o(drawable, this.f47981C);
            }
            int i = this.f47985w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f47986x) {
            if (this.f47983E == null) {
                Drawable e = C1523f.m7886e(getResources(), C6525e.navigation_empty_icon, getContext().getTheme());
                this.f47983E = e;
                if (e != null) {
                    int i2 = this.f47985w;
                    e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f47983E;
        }
        C0624k.m3462l(this.f47988z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f47988z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f47985w = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f47981C = colorStateList;
        this.f47982D = colorStateList != null;
        C0291g gVar = this.f47980B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f47988z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f47986x = z;
    }

    public void setTextAppearance(int i) {
        C0624k.m3467q(this.f47988z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f47988z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f47988z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10183a aVar = new C10183a();
        this.f47984F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C6528h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C6524d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C6526f.design_menu_item_text);
        this.f47988z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C5723u.m25330o0(checkedTextView, aVar);
    }
}
