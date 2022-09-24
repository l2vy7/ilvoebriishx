package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0390h0;
import androidx.core.widget.C0624k;
import androidx.viewpager.widget.C1385a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C10023a;
import com.google.android.material.internal.C10227s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p062d0.C5135a;
import p078g.C5264a;
import p104l0.C5645e;
import p104l0.C5647g;
import p110m0.C5709g;
import p110m0.C5721s;
import p110m0.C5723u;
import p116n0.C5771c;
import p193c6.C6522b;
import p193c6.C6528h;
import p193c6.C6530j;
import p193c6.C6531k;
import p199d6.C10493a;
import p242p6.C10893i;

@ViewPager.C1377e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: R */
    private static final int f48427R = C6531k.Widget_Design_TabLayout;

    /* renamed from: S */
    private static final C5645e<C10304g> f48428S = new C5647g(16);

    /* renamed from: A */
    int f48429A;

    /* renamed from: B */
    boolean f48430B;

    /* renamed from: C */
    boolean f48431C;

    /* renamed from: D */
    int f48432D;

    /* renamed from: E */
    boolean f48433E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C10310b f48434F;

    /* renamed from: G */
    private C10298c f48435G;

    /* renamed from: H */
    private final ArrayList<C10298c> f48436H;

    /* renamed from: I */
    private C10298c f48437I;

    /* renamed from: J */
    private ValueAnimator f48438J;

    /* renamed from: K */
    ViewPager f48439K;

    /* renamed from: L */
    private C1385a f48440L;

    /* renamed from: M */
    private DataSetObserver f48441M;

    /* renamed from: N */
    private C10305h f48442N;

    /* renamed from: O */
    private C10297b f48443O;

    /* renamed from: P */
    private boolean f48444P;

    /* renamed from: Q */
    private final C5645e<C10306i> f48445Q;

    /* renamed from: b */
    private final ArrayList<C10304g> f48446b;

    /* renamed from: c */
    private C10304g f48447c;

    /* renamed from: d */
    final C10301f f48448d;

    /* renamed from: e */
    int f48449e;

    /* renamed from: f */
    int f48450f;

    /* renamed from: g */
    int f48451g;

    /* renamed from: h */
    int f48452h;

    /* renamed from: i */
    int f48453i;

    /* renamed from: j */
    ColorStateList f48454j;

    /* renamed from: k */
    ColorStateList f48455k;

    /* renamed from: l */
    ColorStateList f48456l;

    /* renamed from: m */
    Drawable f48457m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f48458n;

    /* renamed from: o */
    PorterDuff.Mode f48459o;

    /* renamed from: p */
    float f48460p;

    /* renamed from: q */
    float f48461q;

    /* renamed from: r */
    final int f48462r;

    /* renamed from: s */
    int f48463s;

    /* renamed from: t */
    private final int f48464t;

    /* renamed from: u */
    private final int f48465u;

    /* renamed from: v */
    private final int f48466v;

    /* renamed from: w */
    private int f48467w;

    /* renamed from: x */
    int f48468x;

    /* renamed from: y */
    int f48469y;

    /* renamed from: z */
    int f48470z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C10296a implements ValueAnimator.AnimatorUpdateListener {
        C10296a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C10297b implements ViewPager.C1380h {

        /* renamed from: a */
        private boolean f48472a;

        C10297b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41472a(boolean z) {
            this.f48472a = z;
        }

        /* renamed from: b */
        public void mo6616b(ViewPager viewPager, C1385a aVar, C1385a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f48439K == viewPager) {
                tabLayout.mo41411G(aVar2, this.f48472a);
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C10298c<T extends C10304g> {
        /* renamed from: a */
        void mo41473a(T t);

        /* renamed from: b */
        void mo41474b(T t);

        /* renamed from: c */
        void mo41475c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C10299d extends C10298c<C10304g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C10300e extends DataSetObserver {
        C10300e() {
        }

        public void onChanged() {
            TabLayout.this.mo41470z();
        }

        public void onInvalidated() {
            TabLayout.this.mo41470z();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    class C10301f extends LinearLayout {

        /* renamed from: b */
        ValueAnimator f48475b;

        /* renamed from: c */
        int f48476c = -1;

        /* renamed from: d */
        float f48477d;

        /* renamed from: e */
        private int f48478e = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class C10302a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f48480a;

            /* renamed from: b */
            final /* synthetic */ View f48481b;

            C10302a(View view, View view2) {
                this.f48480a = view;
                this.f48481b = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10301f.this.m47551g(this.f48480a, this.f48481b, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        class C10303b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f48483a;

            C10303b(int i) {
                this.f48483a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C10301f.this.f48476c = this.f48483a;
            }

            public void onAnimationStart(Animator animator) {
                C10301f.this.f48476c = this.f48483a;
            }
        }

        C10301f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: d */
        private void m47550d() {
            View childAt = getChildAt(this.f48476c);
            C10310b a = TabLayout.this.f48434F;
            TabLayout tabLayout = TabLayout.this;
            a.mo41519d(tabLayout, childAt, tabLayout.f48457m);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m47551g(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C10310b a = TabLayout.this.f48434F;
                TabLayout tabLayout = TabLayout.this;
                a.mo41518c(tabLayout, view, view2, f, tabLayout.f48457m);
            } else {
                Drawable drawable = TabLayout.this.f48457m;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f48457m.getBounds().bottom);
            }
            C5723u.m25310e0(this);
        }

        /* renamed from: h */
        private void m47552h(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f48476c);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m47550d();
                return;
            }
            C10302a aVar = new C10302a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f48475b = valueAnimator;
                valueAnimator.setInterpolator(C10493a.f49009b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new C10303b(i));
                valueAnimator.start();
                return;
            }
            this.f48475b.removeAllUpdateListeners();
            this.f48475b.addUpdateListener(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41478b(int i, int i2) {
            ValueAnimator valueAnimator = this.f48475b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f48475b.cancel();
            }
            m47552h(true, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo41479c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            int height = TabLayout.this.f48457m.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f48457m.getIntrinsicHeight();
            }
            int i = TabLayout.this.f48470z;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f48457m.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f48457m.getBounds();
                TabLayout.this.f48457m.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f48457m;
                if (tabLayout.f48458n != 0) {
                    drawable = C5135a.m23418r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f48458n, PorterDuff.Mode.SRC_IN);
                    } else {
                        C5135a.m23414n(drawable, TabLayout.this.f48458n);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo41481e(int i, float f) {
            ValueAnimator valueAnimator = this.f48475b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f48475b.cancel();
            }
            this.f48476c = i;
            this.f48477d = f;
            m47551g(getChildAt(i), getChildAt(this.f48476c + 1), this.f48477d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo41482f(int i) {
            Rect bounds = TabLayout.this.f48457m.getBounds();
            TabLayout.this.f48457m.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f48475b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m47550d();
            } else {
                m47552h(false, this.f48476c, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f48468x == 1 || tabLayout.f48429A == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C10227s.m47135c(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f48468x = 0;
                            tabLayout2.mo41415N(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f48478e != i) {
                requestLayout();
                this.f48478e = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C10304g {

        /* renamed from: a */
        private Object f48485a;

        /* renamed from: b */
        private Drawable f48486b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f48487c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CharSequence f48488d;

        /* renamed from: e */
        private int f48489e = -1;

        /* renamed from: f */
        private View f48490f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f48491g = 1;

        /* renamed from: h */
        public TabLayout f48492h;

        /* renamed from: i */
        public C10306i f48493i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f48494j = -1;

        /* renamed from: e */
        public View mo41489e() {
            return this.f48490f;
        }

        /* renamed from: f */
        public Drawable mo41490f() {
            return this.f48486b;
        }

        /* renamed from: g */
        public int mo41491g() {
            return this.f48489e;
        }

        /* renamed from: h */
        public int mo41492h() {
            return this.f48491g;
        }

        /* renamed from: i */
        public CharSequence mo41493i() {
            return this.f48487c;
        }

        /* renamed from: j */
        public boolean mo41494j() {
            TabLayout tabLayout = this.f48492h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f48489e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo41495k() {
            this.f48492h = null;
            this.f48493i = null;
            this.f48485a = null;
            this.f48486b = null;
            this.f48494j = -1;
            this.f48487c = null;
            this.f48488d = null;
            this.f48489e = -1;
            this.f48490f = null;
        }

        /* renamed from: l */
        public void mo41496l() {
            TabLayout tabLayout = this.f48492h;
            if (tabLayout != null) {
                tabLayout.mo41409E(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C10304g mo41497m(CharSequence charSequence) {
            this.f48488d = charSequence;
            mo41503s();
            return this;
        }

        /* renamed from: n */
        public C10304g mo41498n(int i) {
            return mo41499o(LayoutInflater.from(this.f48493i.getContext()).inflate(i, this.f48493i, false));
        }

        /* renamed from: o */
        public C10304g mo41499o(View view) {
            this.f48490f = view;
            mo41503s();
            return this;
        }

        /* renamed from: p */
        public C10304g mo41500p(Drawable drawable) {
            this.f48486b = drawable;
            TabLayout tabLayout = this.f48492h;
            if (tabLayout.f48468x == 1 || tabLayout.f48429A == 2) {
                tabLayout.mo41415N(true);
            }
            mo41503s();
            if (C10023a.f47264a && this.f48493i.m47591l() && this.f48493i.f48502f.isVisible()) {
                this.f48493i.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo41501q(int i) {
            this.f48489e = i;
        }

        /* renamed from: r */
        public C10304g mo41502r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f48488d) && !TextUtils.isEmpty(charSequence)) {
                this.f48493i.setContentDescription(charSequence);
            }
            this.f48487c = charSequence;
            mo41503s();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo41503s() {
            C10306i iVar = this.f48493i;
            if (iVar != null) {
                iVar.mo41515t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C10305h implements ViewPager.C1381i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f48495a;

        /* renamed from: b */
        private int f48496b;

        /* renamed from: c */
        private int f48497c;

        public C10305h(TabLayout tabLayout) {
            this.f48495a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo6615a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f48495a.get();
            if (tabLayout != null) {
                int i3 = this.f48497c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f48496b == 1;
                if (!(i3 == 2 && this.f48496b == 0)) {
                    z = true;
                }
                tabLayout.mo41413I(i, f, z2, z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41504b() {
            this.f48497c = 0;
            this.f48496b = 0;
        }

        /* renamed from: c */
        public void mo6617c(int i) {
            this.f48496b = this.f48497c;
            this.f48497c = i;
        }

        /* renamed from: d */
        public void mo6618d(int i) {
            TabLayout tabLayout = (TabLayout) this.f48495a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f48497c;
                tabLayout.mo41410F(tabLayout.mo41467w(i), i2 == 0 || (i2 == 2 && this.f48496b == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C10306i extends LinearLayout {

        /* renamed from: b */
        private C10304g f48498b;

        /* renamed from: c */
        private TextView f48499c;

        /* renamed from: d */
        private ImageView f48500d;

        /* renamed from: e */
        private View f48501e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public BadgeDrawable f48502f;

        /* renamed from: g */
        private View f48503g;

        /* renamed from: h */
        private TextView f48504h;

        /* renamed from: i */
        private ImageView f48505i;

        /* renamed from: j */
        private Drawable f48506j;

        /* renamed from: k */
        private int f48507k = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        class C10307a implements View.OnLayoutChangeListener {

            /* renamed from: b */
            final /* synthetic */ View f48509b;

            C10307a(View view) {
                this.f48509b = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f48509b.getVisibility() == 0) {
                    C10306i.this.m47597s(this.f48509b);
                }
            }
        }

        public C10306i(Context context) {
            super(context);
            m47598u(context);
            C5723u.m25268C0(this, TabLayout.this.f48449e, TabLayout.this.f48450f, TabLayout.this.f48451g, TabLayout.this.f48452h);
            setGravity(17);
            setOrientation(TabLayout.this.f48430B ^ true ? 1 : 0);
            setClickable(true);
            C5723u.m25270D0(this, C5721s.m25261b(getContext(), 1002));
        }

        /* renamed from: f */
        private void m47585f(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C10307a(view));
            }
        }

        /* renamed from: g */
        private float m47586g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private BadgeDrawable getBadge() {
            return this.f48502f;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f48502f == null) {
                this.f48502f = BadgeDrawable.m45766c(getContext());
            }
            m47596r();
            BadgeDrawable badgeDrawable = this.f48502f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m47587h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        private FrameLayout m47588i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m47589j(Canvas canvas) {
            Drawable drawable = this.f48506j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f48506j.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m47590k(View view) {
            if ((view == this.f48500d || view == this.f48499c) && C10023a.f47264a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m47591l() {
            return this.f48502f != null;
        }

        /* renamed from: m */
        private void m47592m() {
            ViewGroup viewGroup;
            if (C10023a.f47264a) {
                viewGroup = m47588i();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C6528h.design_layout_tab_icon, viewGroup, false);
            this.f48500d = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: n */
        private void m47593n() {
            ViewGroup viewGroup;
            if (C10023a.f47264a) {
                viewGroup = m47588i();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C6528h.design_layout_tab_text, viewGroup, false);
            this.f48499c = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: p */
        private void m47594p(View view) {
            if (m47591l() && view != null) {
                m47587h(false);
                C10023a.m45821a(this.f48502f, view, m47590k(view));
                this.f48501e = view;
            }
        }

        /* renamed from: q */
        private void m47595q() {
            if (m47591l()) {
                m47587h(true);
                View view = this.f48501e;
                if (view != null) {
                    C10023a.m45824d(this.f48502f, view);
                    this.f48501e = null;
                }
            }
        }

        /* renamed from: r */
        private void m47596r() {
            C10304g gVar;
            C10304g gVar2;
            if (m47591l()) {
                if (this.f48503g != null) {
                    m47595q();
                } else if (this.f48500d != null && (gVar2 = this.f48498b) != null && gVar2.mo41490f() != null) {
                    View view = this.f48501e;
                    ImageView imageView = this.f48500d;
                    if (view != imageView) {
                        m47595q();
                        m47594p(this.f48500d);
                        return;
                    }
                    m47597s(imageView);
                } else if (this.f48499c == null || (gVar = this.f48498b) == null || gVar.mo41492h() != 1) {
                    m47595q();
                } else {
                    View view2 = this.f48501e;
                    TextView textView = this.f48499c;
                    if (view2 != textView) {
                        m47595q();
                        m47594p(this.f48499c);
                        return;
                    }
                    m47597s(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m47597s(View view) {
            if (m47591l() && view == this.f48501e) {
                C10023a.m45825e(this.f48502f, view, m47590k(view));
            }
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m47598u(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f48462r
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = p078g.C5264a.m23789d(r7, r0)
                r6.f48506j = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f48506j
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f48506j = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f48456l
                if (r2 == 0) goto L_0x0074
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f48456l
                android.content.res.ColorStateList r3 = p236n6.C10841b.m48830a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x005f
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f48433E
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                if (r4 == 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0074
            L_0x005f:
                android.graphics.drawable.Drawable r1 = p062d0.C5135a.m23418r(r2)
                p062d0.C5135a.m23415o(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0074:
                p110m0.C5723u.m25336r0(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C10306i.m47598u(android.content.Context):void");
        }

        /* renamed from: w */
        private void m47599w(TextView textView, ImageView imageView) {
            C10304g gVar = this.f48498b;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.mo41490f() == null) ? null : C5135a.m23418r(this.f48498b.mo41490f()).mutate();
            C10304g gVar2 = this.f48498b;
            CharSequence i = gVar2 != null ? gVar2.mo41493i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(i);
            if (textView != null) {
                if (z) {
                    textView.setText(i);
                    if (this.f48498b.f48491g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int c = (!z || imageView.getVisibility() != 0) ? 0 : (int) C10227s.m47135c(getContext(), 8);
                if (TabLayout.this.f48430B) {
                    if (c != C5709g.m25216a(marginLayoutParams)) {
                        C5709g.m25218c(marginLayoutParams, c);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (c != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = c;
                    C5709g.m25218c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C10304g gVar3 = this.f48498b;
            if (gVar3 != null) {
                charSequence = gVar3.f48488d;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 21 || i2 > 23) {
                if (!z) {
                    i = charSequence;
                }
                C0390h0.m2064a(this, i);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f48506j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f48506j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f48499c, this.f48500d, this.f48503g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f48499c, this.f48500d, this.f48503g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public C10304g getTab() {
            return this.f48498b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo41509o() {
            setTab((C10304g) null);
            setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f48502f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f48502f.mo39697h());
            }
            C5771c H0 = C5771c.m25532H0(accessibilityNodeInfo);
            H0.mo22633f0(C5771c.C5774c.m25623a(0, 1, this.f48498b.mo41491g(), 1, false, isSelected()));
            if (isSelected()) {
                H0.mo22629d0(false);
                H0.mo22617T(C5771c.C5772a.f24476i);
            }
            H0.mo22661v0(getResources().getString(C6530j.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f48463s, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f48499c != null) {
                float f = TabLayout.this.f48460p;
                int i3 = this.f48507k;
                ImageView imageView = this.f48500d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f48499c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f48461q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f48499c.getTextSize();
                int lineCount = this.f48499c.getLineCount();
                int d = C0624k.m3454d(this.f48499c);
                if (f != textSize || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f48429A == 1 && f > textSize && lineCount == 1 && ((layout = this.f48499c.getLayout()) == null || m47586g(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f48499c.setTextSize(0, f);
                        this.f48499c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f48498b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f48498b.mo41496l();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f48499c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f48500d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f48503g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(C10304g gVar) {
            if (gVar != this.f48498b) {
                this.f48498b = gVar;
                mo41515t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo41515t() {
            C10304g gVar = this.f48498b;
            Drawable drawable = null;
            View e = gVar != null ? gVar.mo41489e() : null;
            if (e != null) {
                ViewParent parent = e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e);
                    }
                    addView(e);
                }
                this.f48503g = e;
                TextView textView = this.f48499c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f48500d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f48500d.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) e.findViewById(16908308);
                this.f48504h = textView2;
                if (textView2 != null) {
                    this.f48507k = C0624k.m3454d(textView2);
                }
                this.f48505i = (ImageView) e.findViewById(16908294);
            } else {
                View view = this.f48503g;
                if (view != null) {
                    removeView(view);
                    this.f48503g = null;
                }
                this.f48504h = null;
                this.f48505i = null;
            }
            if (this.f48503g == null) {
                if (this.f48500d == null) {
                    m47592m();
                }
                if (!(gVar == null || gVar.mo41490f() == null)) {
                    drawable = C5135a.m23418r(gVar.mo41490f()).mutate();
                }
                if (drawable != null) {
                    C5135a.m23415o(drawable, TabLayout.this.f48455k);
                    PorterDuff.Mode mode = TabLayout.this.f48459o;
                    if (mode != null) {
                        C5135a.m23416p(drawable, mode);
                    }
                }
                if (this.f48499c == null) {
                    m47593n();
                    this.f48507k = C0624k.m3454d(this.f48499c);
                }
                C0624k.m3467q(this.f48499c, TabLayout.this.f48453i);
                ColorStateList colorStateList = TabLayout.this.f48454j;
                if (colorStateList != null) {
                    this.f48499c.setTextColor(colorStateList);
                }
                m47599w(this.f48499c, this.f48500d);
                m47596r();
                m47585f(this.f48500d);
                m47585f(this.f48499c);
            } else {
                TextView textView3 = this.f48504h;
                if (!(textView3 == null && this.f48505i == null)) {
                    m47599w(textView3, this.f48505i);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f48488d)) {
                setContentDescription(gVar.f48488d);
            }
            setSelected(gVar != null && gVar.mo41494j());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo41516v() {
            setOrientation(TabLayout.this.f48430B ^ true ? 1 : 0);
            TextView textView = this.f48504h;
            if (textView == null && this.f48505i == null) {
                m47599w(this.f48499c, this.f48500d);
            } else {
                m47599w(textView, this.f48505i);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C10308j implements C10299d {

        /* renamed from: a */
        private final ViewPager f48511a;

        public C10308j(ViewPager viewPager) {
            this.f48511a = viewPager;
        }

        /* renamed from: a */
        public void mo41473a(C10304g gVar) {
        }

        /* renamed from: b */
        public void mo41474b(C10304g gVar) {
            this.f48511a.setCurrentItem(gVar.mo41491g());
        }

        /* renamed from: c */
        public void mo41475c(C10304g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.tabStyle);
    }

    /* renamed from: D */
    private void m47504D(int i) {
        C10306i iVar = (C10306i) this.f48448d.getChildAt(i);
        this.f48448d.removeViewAt(i);
        if (iVar != null) {
            iVar.mo41509o();
            this.f48445Q.mo7110a(iVar);
        }
        requestLayout();
    }

    /* renamed from: K */
    private void m47505K(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f48439K;
        if (viewPager2 != null) {
            C10305h hVar = this.f48442N;
            if (hVar != null) {
                viewPager2.mo6626J(hVar);
            }
            C10297b bVar = this.f48443O;
            if (bVar != null) {
                this.f48439K.mo6625I(bVar);
            }
        }
        C10298c cVar = this.f48437I;
        if (cVar != null) {
            mo41408C(cVar);
            this.f48437I = null;
        }
        if (viewPager != null) {
            this.f48439K = viewPager;
            if (this.f48442N == null) {
                this.f48442N = new C10305h(this);
            }
            this.f48442N.mo41504b();
            viewPager.mo6637c(this.f48442N);
            C10308j jVar = new C10308j(viewPager);
            this.f48437I = jVar;
            mo41420c(jVar);
            C1385a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo41411G(adapter, z);
            }
            if (this.f48443O == null) {
                this.f48443O = new C10297b();
            }
            this.f48443O.mo41472a(z);
            viewPager.mo6636b(this.f48443O);
            mo41412H(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f48439K = null;
            mo41411G((C1385a) null, false);
        }
        this.f48444P = z2;
    }

    /* renamed from: L */
    private void m47506L() {
        int size = this.f48446b.size();
        for (int i = 0; i < size; i++) {
            this.f48446b.get(i).mo41503s();
        }
    }

    /* renamed from: M */
    private void m47507M(LinearLayout.LayoutParams layoutParams) {
        if (this.f48429A == 1 && this.f48468x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: g */
    private void m47510g(TabItem tabItem) {
        C10304g y = mo41469y();
        CharSequence charSequence = tabItem.f48424b;
        if (charSequence != null) {
            y.mo41502r(charSequence);
        }
        Drawable drawable = tabItem.f48425c;
        if (drawable != null) {
            y.mo41500p(drawable);
        }
        int i = tabItem.f48426d;
        if (i != 0) {
            y.mo41498n(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            y.mo41497m(tabItem.getContentDescription());
        }
        mo41421d(y);
    }

    private int getDefaultHeight() {
        int size = this.f48446b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C10304g gVar = this.f48446b.get(i);
                if (gVar != null && gVar.mo41490f() != null && !TextUtils.isEmpty(gVar.mo41493i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f48430B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f48464t;
        if (i != -1) {
            return i;
        }
        int i2 = this.f48429A;
        if (i2 == 0 || i2 == 2) {
            return this.f48466v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f48448d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m47511h(C10304g gVar) {
        C10306i iVar = gVar.f48493i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f48448d.addView(iVar, gVar.mo41491g(), m47519p());
    }

    /* renamed from: i */
    private void m47512i(View view) {
        if (view instanceof TabItem) {
            m47510g((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: j */
    private void m47513j(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C5723u.m25294T(this) || this.f48448d.mo41479c()) {
                mo41412H(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int m = m47516m(i, 0.0f);
            if (scrollX != m) {
                m47524v();
                this.f48438J.setIntValues(new int[]{scrollX, m});
                this.f48438J.start();
            }
            this.f48448d.mo41478b(i, this.f48469y);
        }
    }

    /* renamed from: k */
    private void m47514k(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f48448d.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f48448d.setGravity(8388611);
    }

    /* renamed from: l */
    private void m47515l() {
        int i;
        int i2 = this.f48429A;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f48467w - this.f48449e);
        } else {
            i = 0;
        }
        C5723u.m25268C0(this.f48448d, i, 0, 0, 0);
        int i3 = this.f48429A;
        if (i3 == 0) {
            m47514k(this.f48468x);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f48468x == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f48448d.setGravity(1);
        }
        mo41415N(true);
    }

    /* renamed from: m */
    private int m47516m(int i, float f) {
        int i2 = this.f48429A;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f48448d.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f48448d.getChildCount() ? this.f48448d.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C5723u.m25265B(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: n */
    private void m47517n(C10304g gVar, int i) {
        gVar.mo41501q(i);
        this.f48446b.add(i, gVar);
        int size = this.f48446b.size();
        while (true) {
            i++;
            if (i < size) {
                this.f48446b.get(i).mo41501q(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    private static ColorStateList m47518o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: p */
    private LinearLayout.LayoutParams m47519p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m47507M(layoutParams);
        return layoutParams;
    }

    /* renamed from: r */
    private C10306i m47520r(C10304g gVar) {
        C5645e<C10306i> eVar = this.f48445Q;
        C10306i acquire = eVar != null ? eVar.acquire() : null;
        if (acquire == null) {
            acquire = new C10306i(getContext());
        }
        acquire.setTab(gVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f48488d)) {
            acquire.setContentDescription(gVar.f48487c);
        } else {
            acquire.setContentDescription(gVar.f48488d);
        }
        return acquire;
    }

    /* renamed from: s */
    private void m47521s(C10304g gVar) {
        for (int size = this.f48436H.size() - 1; size >= 0; size--) {
            this.f48436H.get(size).mo41473a(gVar);
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f48448d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f48448d.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private void m47522t(C10304g gVar) {
        for (int size = this.f48436H.size() - 1; size >= 0; size--) {
            this.f48436H.get(size).mo41474b(gVar);
        }
    }

    /* renamed from: u */
    private void m47523u(C10304g gVar) {
        for (int size = this.f48436H.size() - 1; size >= 0; size--) {
            this.f48436H.get(size).mo41475c(gVar);
        }
    }

    /* renamed from: v */
    private void m47524v() {
        if (this.f48438J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f48438J = valueAnimator;
            valueAnimator.setInterpolator(C10493a.f49009b);
            this.f48438J.setDuration((long) this.f48469y);
            this.f48438J.addUpdateListener(new C10296a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo41406A(C10304g gVar) {
        return f48428S.mo7110a(gVar);
    }

    /* renamed from: B */
    public void mo41407B() {
        for (int childCount = this.f48448d.getChildCount() - 1; childCount >= 0; childCount--) {
            m47504D(childCount);
        }
        Iterator<C10304g> it = this.f48446b.iterator();
        while (it.hasNext()) {
            C10304g next = it.next();
            it.remove();
            next.mo41495k();
            mo41406A(next);
        }
        this.f48447c = null;
    }

    @Deprecated
    /* renamed from: C */
    public void mo41408C(C10298c cVar) {
        this.f48436H.remove(cVar);
    }

    /* renamed from: E */
    public void mo41409E(C10304g gVar) {
        mo41410F(gVar, true);
    }

    /* renamed from: F */
    public void mo41410F(C10304g gVar, boolean z) {
        C10304g gVar2 = this.f48447c;
        if (gVar2 != gVar) {
            int g = gVar != null ? gVar.mo41491g() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo41491g() == -1) && g != -1) {
                    mo41412H(g, 0.0f, true);
                } else {
                    m47513j(g);
                }
                if (g != -1) {
                    setSelectedTabView(g);
                }
            }
            this.f48447c = gVar;
            if (gVar2 != null) {
                m47523u(gVar2);
            }
            if (gVar != null) {
                m47522t(gVar);
            }
        } else if (gVar2 != null) {
            m47521s(gVar);
            m47513j(gVar.mo41491g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo41411G(C1385a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C1385a aVar2 = this.f48440L;
        if (!(aVar2 == null || (dataSetObserver = this.f48441M) == null)) {
            aVar2.mo6719t(dataSetObserver);
        }
        this.f48440L = aVar;
        if (z && aVar != null) {
            if (this.f48441M == null) {
                this.f48441M = new C10300e();
            }
            aVar.mo6711l(this.f48441M);
        }
        mo41470z();
    }

    /* renamed from: H */
    public void mo41412H(int i, float f, boolean z) {
        mo41413I(i, f, z, true);
    }

    /* renamed from: I */
    public void mo41413I(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f48448d.getChildCount()) {
            if (z2) {
                this.f48448d.mo41481e(i, f);
            }
            ValueAnimator valueAnimator = this.f48438J;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f48438J.cancel();
            }
            scrollTo(m47516m(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: J */
    public void mo41414J(ViewPager viewPager, boolean z) {
        m47505K(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo41415N(boolean z) {
        for (int i = 0; i < this.f48448d.getChildCount(); i++) {
            View childAt = this.f48448d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m47507M((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m47512i(view);
    }

    @Deprecated
    /* renamed from: c */
    public void mo41420c(C10298c cVar) {
        if (!this.f48436H.contains(cVar)) {
            this.f48436H.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo41421d(C10304g gVar) {
        mo41423f(gVar, this.f48446b.isEmpty());
    }

    /* renamed from: e */
    public void mo41422e(C10304g gVar, int i, boolean z) {
        if (gVar.f48492h == this) {
            m47517n(gVar, i);
            m47511h(gVar);
            if (z) {
                gVar.mo41496l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: f */
    public void mo41423f(C10304g gVar, boolean z) {
        mo41422e(gVar, this.f48446b.size(), z);
    }

    public int getSelectedTabPosition() {
        C10304g gVar = this.f48447c;
        if (gVar != null) {
            return gVar.mo41491g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f48446b.size();
    }

    public int getTabGravity() {
        return this.f48468x;
    }

    public ColorStateList getTabIconTint() {
        return this.f48455k;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f48432D;
    }

    public int getTabIndicatorGravity() {
        return this.f48470z;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f48463s;
    }

    public int getTabMode() {
        return this.f48429A;
    }

    public ColorStateList getTabRippleColor() {
        return this.f48456l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f48457m;
    }

    public ColorStateList getTabTextColors() {
        return this.f48454j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48986e(this);
        if (this.f48439K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m47505K((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f48444P) {
            setupWithViewPager((ViewPager) null);
            this.f48444P = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f48448d.getChildCount(); i++) {
            View childAt = this.f48448d.getChildAt(i);
            if (childAt instanceof C10306i) {
                ((C10306i) childAt).m47589j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C10227s.m47135c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f48465u
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C10227s.m47135c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f48463s = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f48429A
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C10304g mo41441q() {
        C10304g acquire = f48428S.acquire();
        return acquire == null ? new C10304g() : acquire;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10893i.m48985d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f48430B != z) {
            this.f48430B = z;
            for (int i = 0; i < this.f48448d.getChildCount(); i++) {
                View childAt = this.f48448d.getChildAt(i);
                if (childAt instanceof C10306i) {
                    ((C10306i) childAt).mo41516v();
                }
            }
            m47515l();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C10299d dVar) {
        setOnTabSelectedListener((C10298c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m47524v();
        this.f48438J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f48457m != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f48457m = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f48458n = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f48470z != i) {
            this.f48470z = i;
            C5723u.m25310e0(this.f48448d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f48448d.mo41482f(i);
    }

    public void setTabGravity(int i) {
        if (this.f48468x != i) {
            this.f48468x = i;
            m47515l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f48455k != colorStateList) {
            this.f48455k = colorStateList;
            m47506L();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C5264a.m23788c(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f48432D = i;
        if (i == 0) {
            this.f48434F = new C10310b();
        } else if (i == 1) {
            this.f48434F = new C10309a();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f48431C = z;
        C5723u.m25310e0(this.f48448d);
    }

    public void setTabMode(int i) {
        if (i != this.f48429A) {
            this.f48429A = i;
            m47515l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f48456l != colorStateList) {
            this.f48456l = colorStateList;
            for (int i = 0; i < this.f48448d.getChildCount(); i++) {
                View childAt = this.f48448d.getChildAt(i);
                if (childAt instanceof C10306i) {
                    ((C10306i) childAt).m47598u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C5264a.m23788c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f48454j != colorStateList) {
            this.f48454j = colorStateList;
            m47506L();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C1385a aVar) {
        mo41411G(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f48433E != z) {
            this.f48433E = z;
            for (int i = 0; i < this.f48448d.getChildCount(); i++) {
                View childAt = this.f48448d.getChildAt(i);
                if (childAt instanceof C10306i) {
                    ((C10306i) childAt).m47598u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo41414J(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: w */
    public C10304g mo41467w(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f48446b.get(i);
    }

    /* renamed from: x */
    public boolean mo41468x() {
        return this.f48431C;
    }

    /* renamed from: y */
    public C10304g mo41469y() {
        C10304g q = mo41441q();
        q.f48492h = this;
        q.f48493i = m47520r(q);
        if (q.f48494j != -1) {
            q.f48493i.setId(q.f48494j);
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo41470z() {
        int currentItem;
        mo41407B();
        C1385a aVar = this.f48440L;
        if (aVar != null) {
            int e = aVar.mo6704e();
            for (int i = 0; i < e; i++) {
                mo41423f(mo41469y().mo41502r(this.f48440L.mo6706g(i)), false);
            }
            ViewPager viewPager = this.f48439K;
            if (viewPager != null && e > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo41409E(mo41467w(currentItem));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f48427R
            android.content.Context r12 = p245q6.C10962a.m49296c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f48446b = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f48457m = r12
            r12 = 0
            r11.f48458n = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f48463s = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f48436H = r0
            l0.f r0 = new l0.f
            r1 = 12
            r0.<init>(r1)
            r11.f48445Q = r0
            android.content.Context r6 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$f r7 = new com.google.android.material.tabs.TabLayout$f
            r7.<init>(r6)
            r11.f48448d = r7
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r8 = -1
            r0.<init>(r1, r8)
            super.addView(r7, r12, r0)
            int[] r2 = p193c6.C6532l.f27138w7
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = p193c6.C6532l.f26836U7
            r5[r12] = r10
            r0 = r6
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0082
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            p6.h r0 = new p6.h
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo43091a0(r14)
            r0.mo43084P(r6)
            float r14 = p110m0.C5723u.m25345w(r11)
            r0.mo43090Z(r14)
            p110m0.C5723u.m25336r0(r11, r0)
        L_0x0082:
            int r14 = p193c6.C6532l.f26639C7
            android.graphics.drawable.Drawable r14 = p232m6.C10805c.m48756d(r6, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = p193c6.C6532l.f26672F7
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = p193c6.C6532l.f26705I7
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r7.mo41482f(r14)
            int r14 = p193c6.C6532l.f26694H7
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = p193c6.C6532l.f26683G7
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = p193c6.C6532l.f26661E7
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = p193c6.C6532l.f26760N7
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f48452h = r14
            r11.f48451g = r14
            r11.f48450f = r14
            r11.f48449e = r14
            int r0 = p193c6.C6532l.f26793Q7
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f48449e = r14
            int r14 = p193c6.C6532l.f26804R7
            int r0 = r11.f48450f
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f48450f = r14
            int r14 = p193c6.C6532l.f26782P7
            int r0 = r11.f48451g
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f48451g = r14
            int r14 = p193c6.C6532l.f26771O7
            int r0 = r11.f48452h
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f48452h = r14
            int r14 = p193c6.C6531k.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f48453i = r14
            int[] r0 = p072f.C5247j.f23108Z2
            android.content.res.TypedArray r14 = r6.obtainStyledAttributes(r14, r0)
            int r0 = p072f.C5247j.f23114a3     // Catch:{ all -> 0x01b7 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b7 }
            r11.f48460p = r0     // Catch:{ all -> 0x01b7 }
            int r0 = p072f.C5247j.f23130d3     // Catch:{ all -> 0x01b7 }
            android.content.res.ColorStateList r0 = p232m6.C10805c.m48753a(r6, r14, r0)     // Catch:{ all -> 0x01b7 }
            r11.f48454j = r0     // Catch:{ all -> 0x01b7 }
            r14.recycle()
            int r14 = p193c6.C6532l.f26846V7
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x011c
            android.content.res.ColorStateList r14 = p232m6.C10805c.m48753a(r6, r13, r14)
            r11.f48454j = r14
        L_0x011c:
            int r14 = p193c6.C6532l.f26826T7
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0134
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f48454j
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m47518o(r0, r14)
            r11.f48454j = r14
        L_0x0134:
            int r14 = p193c6.C6532l.f26617A7
            android.content.res.ColorStateList r14 = p232m6.C10805c.m48753a(r6, r13, r14)
            r11.f48455k = r14
            int r14 = p193c6.C6532l.f26628B7
            int r14 = r13.getInt(r14, r8)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.C10227s.m47141i(r14, r0)
            r11.f48459o = r14
            int r14 = p193c6.C6532l.f26815S7
            android.content.res.ColorStateList r14 = p232m6.C10805c.m48753a(r6, r13, r14)
            r11.f48456l = r14
            int r14 = p193c6.C6532l.f26650D7
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f48469y = r14
            int r14 = p193c6.C6532l.f26738L7
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f48464t = r14
            int r14 = p193c6.C6532l.f26727K7
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f48465u = r14
            int r14 = p193c6.C6532l.f27149x7
            int r14 = r13.getResourceId(r14, r12)
            r11.f48462r = r14
            int r14 = p193c6.C6532l.f27160y7
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f48467w = r14
            int r14 = p193c6.C6532l.f26749M7
            int r14 = r13.getInt(r14, r9)
            r11.f48429A = r14
            int r14 = p193c6.C6532l.f27171z7
            int r14 = r13.getInt(r14, r12)
            r11.f48468x = r14
            int r14 = p193c6.C6532l.f26716J7
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f48430B = r14
            int r14 = p193c6.C6532l.f26856W7
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f48433E = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = p193c6.C6524d.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f48461q = r13
            int r13 = p193c6.C6524d.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f48466v = r12
            r11.m47515l()
            return
        L_0x01b7:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, int i) {
        m47512i(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C10298c cVar) {
        C10298c cVar2 = this.f48435G;
        if (cVar2 != null) {
            mo41408C(cVar2);
        }
        this.f48435G = cVar;
        if (cVar != null) {
            mo41420c(cVar);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m47512i(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C5264a.m23789d(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m47512i(view);
    }
}
