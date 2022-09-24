package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.C0390h0;
import androidx.core.content.C0600b;
import androidx.core.widget.C0624k;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C10023a;
import p062d0.C5135a;
import p110m0.C5721s;
import p110m0.C5723u;
import p116n0.C5771c;
import p193c6.C6524d;
import p193c6.C6525e;
import p193c6.C6526f;
import p193c6.C6530j;

/* renamed from: com.google.android.material.navigation.a */
/* compiled from: NavigationBarItemView */
public abstract class C10239a extends FrameLayout implements C0298k.C0299a {

    /* renamed from: r */
    private static final int[] f48169r = {16842912};

    /* renamed from: b */
    private final int f48170b;

    /* renamed from: c */
    private float f48171c;

    /* renamed from: d */
    private float f48172d;

    /* renamed from: e */
    private float f48173e;

    /* renamed from: f */
    private int f48174f;

    /* renamed from: g */
    private boolean f48175g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageView f48176h;

    /* renamed from: i */
    private final ViewGroup f48177i;

    /* renamed from: j */
    private final TextView f48178j;

    /* renamed from: k */
    private final TextView f48179k;

    /* renamed from: l */
    private int f48180l = -1;

    /* renamed from: m */
    private C0291g f48181m;

    /* renamed from: n */
    private ColorStateList f48182n;

    /* renamed from: o */
    private Drawable f48183o;

    /* renamed from: p */
    private Drawable f48184p;

    /* renamed from: q */
    private BadgeDrawable f48185q;

    /* renamed from: com.google.android.material.navigation.a$a */
    /* compiled from: NavigationBarItemView */
    class C10240a implements View.OnLayoutChangeListener {
        C10240a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C10239a.this.f48176h.getVisibility() == 0) {
                C10239a aVar = C10239a.this;
                aVar.m47186m(aVar.f48176h);
            }
        }
    }

    public C10239a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f48176h = (ImageView) findViewById(C6526f.navigation_bar_item_icon_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(C6526f.navigation_bar_item_labels_group);
        this.f48177i = viewGroup;
        TextView textView = (TextView) findViewById(C6526f.navigation_bar_item_small_label_view);
        this.f48178j = textView;
        TextView textView2 = (TextView) findViewById(C6526f.navigation_bar_item_large_label_view);
        this.f48179k = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f48170b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        viewGroup.setTag(C6526f.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        C5723u.m25350y0(textView, 2);
        C5723u.m25350y0(textView2, 2);
        setFocusable(true);
        m47179c(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f48176h;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C10240a());
        }
    }

    /* renamed from: c */
    private void m47179c(float f, float f2) {
        this.f48171c = f - f2;
        this.f48172d = (f2 * 1.0f) / f;
        this.f48173e = (f * 1.0f) / f2;
    }

    /* renamed from: f */
    private FrameLayout m47180f(View view) {
        ImageView imageView = this.f48176h;
        if (view != imageView || !C10023a.f47264a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: g */
    private boolean m47181g() {
        return this.f48185q != null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C10239a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.f48185q;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) this.f48176h.getLayoutParams()).topMargin) + this.f48176h.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int i;
        BadgeDrawable badgeDrawable = this.f48185q;
        if (badgeDrawable == null) {
            i = 0;
        } else {
            i = badgeDrawable.getMinimumWidth() - this.f48185q.mo39700j();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48176h.getLayoutParams();
        return Math.max(i, layoutParams.leftMargin) + this.f48176h.getMeasuredWidth() + Math.max(i, layoutParams.rightMargin);
    }

    /* renamed from: i */
    private static void m47182i(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private static void m47183j(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: k */
    private void m47184k(View view) {
        if (m47181g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C10023a.m45821a(this.f48185q, view, m47180f(view));
        }
    }

    /* renamed from: l */
    private void m47185l(View view) {
        if (m47181g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C10023a.m45824d(this.f48185q, view);
            }
            this.f48185q = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m47186m(View view) {
        if (m47181g()) {
            C10023a.m45825e(this.f48185q, view, m47180f(view));
        }
    }

    /* renamed from: n */
    private static void m47187n(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: d */
    public boolean mo992d() {
        return false;
    }

    /* renamed from: e */
    public void mo993e(C0291g gVar, int i) {
        CharSequence charSequence;
        this.f48181m = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(gVar.getTooltipText())) {
            charSequence = gVar.getTooltipText();
        } else {
            charSequence = gVar.getTitle();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21 || i2 > 23) {
            C0390h0.m2064a(this, charSequence);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
    }

    public BadgeDrawable getBadge() {
        return this.f48185q;
    }

    /* access modifiers changed from: protected */
    public int getItemBackgroundResId() {
        return C6525e.mtrl_navigation_bar_item_background;
    }

    public C0291g getItemData() {
        return this.f48181m;
    }

    /* access modifiers changed from: protected */
    public int getItemDefaultMarginResId() {
        return C6524d.mtrl_navigation_bar_item_default_margin;
    }

    /* access modifiers changed from: protected */
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f48180l;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48177i.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f48177i.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48177i.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f48177i.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo41066h() {
        m47185l(this.f48176h);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0291g gVar = this.f48181m;
        if (gVar != null && gVar.isCheckable() && this.f48181m.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f48169r);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f48185q;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f48181m.getTitle();
            if (!TextUtils.isEmpty(this.f48181m.getContentDescription())) {
                title = this.f48181m.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f48185q.mo39697h());
        }
        C5771c H0 = C5771c.m25532H0(accessibilityNodeInfo);
        H0.mo22633f0(C5771c.C5774c.m25623a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            H0.mo22629d0(false);
            H0.mo22617T(C5771c.C5772a.f24476i);
        }
        H0.mo22661v0(getResources().getString(C6530j.item_view_role_description));
    }

    /* access modifiers changed from: package-private */
    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f48185q = badgeDrawable;
        ImageView imageView = this.f48176h;
        if (imageView != null) {
            m47184k(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f48179k;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f48179k;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f48178j;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f48178j;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f48174f;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m47182i(this.f48176h, this.f48170b, 49);
                    ViewGroup viewGroup = this.f48177i;
                    m47187n(viewGroup, ((Integer) viewGroup.getTag(C6526f.mtrl_view_tag_bottom_padding)).intValue());
                    this.f48179k.setVisibility(0);
                } else {
                    m47182i(this.f48176h, this.f48170b, 17);
                    m47187n(this.f48177i, 0);
                    this.f48179k.setVisibility(4);
                }
                this.f48178j.setVisibility(4);
            } else if (i == 1) {
                ViewGroup viewGroup2 = this.f48177i;
                m47187n(viewGroup2, ((Integer) viewGroup2.getTag(C6526f.mtrl_view_tag_bottom_padding)).intValue());
                if (z) {
                    m47182i(this.f48176h, (int) (((float) this.f48170b) + this.f48171c), 49);
                    m47183j(this.f48179k, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f48178j;
                    float f = this.f48172d;
                    m47183j(textView5, f, f, 4);
                } else {
                    m47182i(this.f48176h, this.f48170b, 49);
                    TextView textView6 = this.f48179k;
                    float f2 = this.f48173e;
                    m47183j(textView6, f2, f2, 4);
                    m47183j(this.f48178j, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m47182i(this.f48176h, this.f48170b, 17);
                this.f48179k.setVisibility(8);
                this.f48178j.setVisibility(8);
            }
        } else if (this.f48175g) {
            if (z) {
                m47182i(this.f48176h, this.f48170b, 49);
                ViewGroup viewGroup3 = this.f48177i;
                m47187n(viewGroup3, ((Integer) viewGroup3.getTag(C6526f.mtrl_view_tag_bottom_padding)).intValue());
                this.f48179k.setVisibility(0);
            } else {
                m47182i(this.f48176h, this.f48170b, 17);
                m47187n(this.f48177i, 0);
                this.f48179k.setVisibility(4);
            }
            this.f48178j.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f48177i;
            m47187n(viewGroup4, ((Integer) viewGroup4.getTag(C6526f.mtrl_view_tag_bottom_padding)).intValue());
            if (z) {
                m47182i(this.f48176h, (int) (((float) this.f48170b) + this.f48171c), 49);
                m47183j(this.f48179k, 1.0f, 1.0f, 0);
                TextView textView7 = this.f48178j;
                float f3 = this.f48172d;
                m47183j(textView7, f3, f3, 4);
            } else {
                m47182i(this.f48176h, this.f48170b, 49);
                TextView textView8 = this.f48179k;
                float f4 = this.f48173e;
                m47183j(textView8, f4, f4, 4);
                m47183j(this.f48178j, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f48178j.setEnabled(z);
        this.f48179k.setEnabled(z);
        this.f48176h.setEnabled(z);
        if (z) {
            C5723u.m25270D0(this, C5721s.m25261b(getContext(), 1002));
        } else {
            C5723u.m25270D0(this, (C5721s) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f48183o) {
            this.f48183o = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C5135a.m23418r(drawable).mutate();
                this.f48184p = drawable;
                ColorStateList colorStateList = this.f48182n;
                if (colorStateList != null) {
                    C5135a.m23415o(drawable, colorStateList);
                }
            }
            this.f48176h.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48176h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f48176h.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f48182n = colorStateList;
        if (this.f48181m != null && (drawable = this.f48184p) != null) {
            C5135a.m23415o(drawable, colorStateList);
            this.f48184p.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0600b.m3294f(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f48180l = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f48174f != i) {
            this.f48174f = i;
            C0291g gVar = this.f48181m;
            if (gVar != null) {
                setChecked(gVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f48175g != z) {
            this.f48175g = z;
            C0291g gVar = this.f48181m;
            if (gVar != null) {
                setChecked(gVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C0624k.m3467q(this.f48179k, i);
        m47179c(this.f48178j.getTextSize(), this.f48179k.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C0624k.m3467q(this.f48178j, i);
        m47179c(this.f48178j.getTextSize(), this.f48179k.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f48178j.setTextColor(colorStateList);
            this.f48179k.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f48178j.setText(charSequence);
        this.f48179k.setText(charSequence);
        C0291g gVar = this.f48181m;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0291g gVar2 = this.f48181m;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f48181m.getTooltipText();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 21 || i > 23) {
            C0390h0.m2064a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C5723u.m25336r0(this, drawable);
    }
}
