package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0303m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p072f.C5238a;
import p072f.C5247j;
import p078g.C5264a;
import p098k.C5524c;
import p098k.C5529g;
import p110m0.C5705d;
import p110m0.C5709g;
import p110m0.C5723u;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ColorStateList f1453A;

    /* renamed from: B */
    private ColorStateList f1454B;

    /* renamed from: C */
    private boolean f1455C;

    /* renamed from: D */
    private boolean f1456D;

    /* renamed from: E */
    private final ArrayList<View> f1457E;

    /* renamed from: F */
    private final ArrayList<View> f1458F;

    /* renamed from: G */
    private final int[] f1459G;

    /* renamed from: H */
    C0369e f1460H;

    /* renamed from: I */
    private final ActionMenuView.C0320d f1461I;

    /* renamed from: J */
    private C0386g0 f1462J;

    /* renamed from: K */
    private ActionMenuPresenter f1463K;

    /* renamed from: L */
    private C0368d f1464L;

    /* renamed from: M */
    private C0296j.C0297a f1465M;

    /* renamed from: N */
    private C0287e.C0288a f1466N;

    /* renamed from: O */
    private boolean f1467O;

    /* renamed from: P */
    private final Runnable f1468P;

    /* renamed from: b */
    private ActionMenuView f1469b;

    /* renamed from: c */
    private TextView f1470c;

    /* renamed from: d */
    private TextView f1471d;

    /* renamed from: e */
    private ImageButton f1472e;

    /* renamed from: f */
    private ImageView f1473f;

    /* renamed from: g */
    private Drawable f1474g;

    /* renamed from: h */
    private CharSequence f1475h;

    /* renamed from: i */
    ImageButton f1476i;

    /* renamed from: j */
    View f1477j;

    /* renamed from: k */
    private Context f1478k;

    /* renamed from: l */
    private int f1479l;

    /* renamed from: m */
    private int f1480m;

    /* renamed from: n */
    private int f1481n;

    /* renamed from: o */
    int f1482o;

    /* renamed from: p */
    private int f1483p;

    /* renamed from: q */
    private int f1484q;

    /* renamed from: r */
    private int f1485r;

    /* renamed from: s */
    private int f1486s;

    /* renamed from: t */
    private int f1487t;

    /* renamed from: u */
    private C0430x f1488u;

    /* renamed from: v */
    private int f1489v;

    /* renamed from: w */
    private int f1490w;

    /* renamed from: x */
    private int f1491x;

    /* renamed from: y */
    private CharSequence f1492y;

    /* renamed from: z */
    private CharSequence f1493z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0365a implements ActionMenuView.C0320d {
        C0365a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0369e eVar = Toolbar.this.f1460H;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0366b implements Runnable {
        C0366b() {
        }

        public void run() {
            Toolbar.this.mo1943O();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0367c implements View.OnClickListener {
        C0367c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1947e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0368d implements C0296j {

        /* renamed from: b */
        C0287e f1500b;

        /* renamed from: c */
        C0291g f1501c;

        C0368d() {
        }

        /* renamed from: b */
        public void mo1027b(C0287e eVar, boolean z) {
        }

        /* renamed from: c */
        public void mo1028c(boolean z) {
            if (this.f1501c != null) {
                C0287e eVar = this.f1500b;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1500b.getItem(i) == this.f1501c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1029e(this.f1500b, this.f1501c);
                }
            }
        }

        /* renamed from: d */
        public boolean mo1045d() {
            return false;
        }

        /* renamed from: e */
        public boolean mo1029e(C0287e eVar, C0291g gVar) {
            View view = Toolbar.this.f1477j;
            if (view instanceof C5524c) {
                ((C5524c) view).mo1806f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1477j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1476i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1477j = null;
            toolbar3.mo1944a();
            this.f1501c = null;
            Toolbar.this.requestLayout();
            gVar.mo1215r(false);
            return true;
        }

        /* renamed from: f */
        public boolean mo1030f(C0287e eVar, C0291g gVar) {
            Toolbar.this.mo1949g();
            ViewParent parent = Toolbar.this.f1476i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1476i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1476i);
            }
            Toolbar.this.f1477j = gVar.getActionView();
            this.f1501c = gVar;
            ViewParent parent2 = Toolbar.this.f1477j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1477j);
                }
                LayoutParams m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f552a = 8388611 | (toolbar4.f1482o & 112);
                m.f1494b = 2;
                toolbar4.f1477j.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1477j);
            }
            Toolbar.this.mo1937G();
            Toolbar.this.requestLayout();
            gVar.mo1215r(true);
            View view = Toolbar.this.f1477j;
            if (view instanceof C5524c) {
                ((C5524c) view).mo1803c();
            }
            return true;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: h */
        public void mo1033h(Context context, C0287e eVar) {
            C0291g gVar;
            C0287e eVar2 = this.f1500b;
            if (!(eVar2 == null || (gVar = this.f1501c) == null)) {
                eVar2.mo1135f(gVar);
            }
            this.f1500b = eVar;
        }

        /* renamed from: i */
        public void mo1047i(Parcelable parcelable) {
        }

        /* renamed from: k */
        public boolean mo1035k(C0303m mVar) {
            return false;
        }

        /* renamed from: l */
        public Parcelable mo1049l() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public interface C0369e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22804R);
    }

    /* renamed from: B */
    private int m1876B(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m1891q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: C */
    private int m1877C(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m1891q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: D */
    private int m1878D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m1879E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m1880F() {
        removeCallbacks(this.f1468P);
        post(this.f1468P);
    }

    /* renamed from: M */
    private boolean m1881M() {
        if (!this.f1467O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1882N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private boolean m1882N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1883b(List<View> list, int i) {
        boolean z = C5723u.m25265B(this) == 1;
        int childCount = getChildCount();
        int b = C5705d.m25206b(i, C5723u.m25265B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1494b == 0 && m1882N(childAt) && m1890p(layoutParams.f552a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1494b == 0 && m1882N(childAt2) && m1890p(layoutParams2.f552a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1884c(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1494b = 1;
        if (!z || this.f1477j == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1458F.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C5529g(getContext());
    }

    /* renamed from: h */
    private void m1885h() {
        if (this.f1488u == null) {
            this.f1488u = new C0430x();
        }
    }

    /* renamed from: i */
    private void m1886i() {
        if (this.f1473f == null) {
            this.f1473f = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    private void m1887j() {
        m1888k();
        if (this.f1469b.mo1420N() == null) {
            C0287e eVar = (C0287e) this.f1469b.getMenu();
            if (this.f1464L == null) {
                this.f1464L = new C0368d();
            }
            this.f1469b.setExpandedActionViewsExclusive(true);
            eVar.mo1126c(this.f1464L, this.f1478k);
        }
    }

    /* renamed from: k */
    private void m1888k() {
        if (this.f1469b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1469b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1479l);
            this.f1469b.setOnMenuItemClickListener(this.f1461I);
            this.f1469b.mo1421O(this.f1465M, this.f1466N);
            LayoutParams m = generateDefaultLayoutParams();
            m.f552a = 8388613 | (this.f1482o & 112);
            this.f1469b.setLayoutParams(m);
            m1884c(this.f1469b, false);
        }
    }

    /* renamed from: l */
    private void m1889l() {
        if (this.f1472e == null) {
            this.f1472e = new AppCompatImageButton(getContext(), (AttributeSet) null, C5238a.f22803Q);
            LayoutParams m = generateDefaultLayoutParams();
            m.f552a = 8388611 | (this.f1482o & 112);
            this.f1472e.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m1890p(int i) {
        int B = C5723u.m25265B(this);
        int b = C5705d.m25206b(i, B) & 7;
        if (b == 1 || b == 3 || b == 5) {
            return b;
        }
        return B == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m1891q(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m1892r(layoutParams.f552a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = layoutParams.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = layoutParams.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m1892r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1491x & 112;
    }

    /* renamed from: s */
    private int m1893s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C5709g.m25217b(marginLayoutParams) + C5709g.m25216a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m1894t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m1895u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            int i6 = layoutParams.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m1896y(View view) {
        return view.getParent() == this || this.f1458F.contains(view);
    }

    /* renamed from: A */
    public boolean mo1936A() {
        ActionMenuView actionMenuView = this.f1469b;
        return actionMenuView != null && actionMenuView.mo1418J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo1937G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1494b == 2 || childAt == this.f1469b)) {
                removeViewAt(childCount);
                this.f1458F.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void mo1938H(int i, int i2) {
        m1885h();
        this.f1488u.mo2319g(i, i2);
    }

    /* renamed from: I */
    public void mo1939I(C0287e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar != null || this.f1469b != null) {
            m1888k();
            C0287e N = this.f1469b.mo1420N();
            if (N != eVar) {
                if (N != null) {
                    N.mo1104Q(this.f1463K);
                    N.mo1104Q(this.f1464L);
                }
                if (this.f1464L == null) {
                    this.f1464L = new C0368d();
                }
                actionMenuPresenter.mo1394J(true);
                if (eVar != null) {
                    eVar.mo1126c(actionMenuPresenter, this.f1478k);
                    eVar.mo1126c(this.f1464L, this.f1478k);
                } else {
                    actionMenuPresenter.mo1033h(this.f1478k, (C0287e) null);
                    this.f1464L.mo1033h(this.f1478k, (C0287e) null);
                    actionMenuPresenter.mo1028c(true);
                    this.f1464L.mo1028c(true);
                }
                this.f1469b.setPopupTheme(this.f1479l);
                this.f1469b.setPresenter(actionMenuPresenter);
                this.f1463K = actionMenuPresenter;
            }
        }
    }

    /* renamed from: J */
    public void mo1940J(C0296j.C0297a aVar, C0287e.C0288a aVar2) {
        this.f1465M = aVar;
        this.f1466N = aVar2;
        ActionMenuView actionMenuView = this.f1469b;
        if (actionMenuView != null) {
            actionMenuView.mo1421O(aVar, aVar2);
        }
    }

    /* renamed from: K */
    public void mo1941K(Context context, int i) {
        this.f1481n = i;
        TextView textView = this.f1471d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: L */
    public void mo1942L(Context context, int i) {
        this.f1480m = i;
        TextView textView = this.f1470c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public boolean mo1943O() {
        ActionMenuView actionMenuView = this.f1469b;
        return actionMenuView != null && actionMenuView.mo1422P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1944a() {
        for (int size = this.f1458F.size() - 1; size >= 0; size--) {
            addView(this.f1458F.get(size));
        }
        this.f1458F.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1469b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1946d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1469b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1419K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1946d():boolean");
    }

    /* renamed from: e */
    public void mo1947e() {
        C0291g gVar;
        C0368d dVar = this.f1464L;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f1501c;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1948f() {
        ActionMenuView actionMenuView = this.f1469b;
        if (actionMenuView != null) {
            actionMenuView.mo1410B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1949g() {
        if (this.f1476i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, C5238a.f22803Q);
            this.f1476i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1474g);
            this.f1476i.setContentDescription(this.f1475h);
            LayoutParams m = generateDefaultLayoutParams();
            m.f552a = 8388611 | (this.f1482o & 112);
            m.f1494b = 2;
            this.f1476i.setLayoutParams(m);
            this.f1476i.setOnClickListener(new C0367c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1476i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1476i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0430x xVar = this.f1488u;
        if (xVar != null) {
            return xVar.mo2313a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1490w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0430x xVar = this.f1488u;
        if (xVar != null) {
            return xVar.mo2314b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0430x xVar = this.f1488u;
        if (xVar != null) {
            return xVar.mo2315c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0430x xVar = this.f1488u;
        if (xVar != null) {
            return xVar.mo2316d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1489v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1420N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1469b
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.e r0 = r0.mo1420N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1490w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C5723u.m25265B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C5723u.m25265B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1489v, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1473f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1473f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1887j();
        return this.f1469b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1472e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1472e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1463K;
    }

    public Drawable getOverflowIcon() {
        m1887j();
        return this.f1469b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1478k;
    }

    public int getPopupTheme() {
        return this.f1479l;
    }

    public CharSequence getSubtitle() {
        return this.f1493z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1471d;
    }

    public CharSequence getTitle() {
        return this.f1492y;
    }

    public int getTitleMarginBottom() {
        return this.f1487t;
    }

    public int getTitleMarginEnd() {
        return this.f1485r;
    }

    public int getTitleMarginStart() {
        return this.f1484q;
    }

    public int getTitleMarginTop() {
        return this.f1486s;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1470c;
    }

    public C0408o getWrapper() {
        if (this.f1462J == null) {
            this.f1462J = new C0386g0(this, true);
        }
        return this.f1462J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: n */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1468P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1456D = false;
        }
        if (!this.f1456D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1456D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1456D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p110m0.C5723u.m25265B(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1459G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p110m0.C5723u.m25267C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1472e
            boolean r13 = r0.m1882N(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1472e
            int r13 = r0.m1877C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1472e
            int r13 = r0.m1876B(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1476i
            boolean r15 = r0.m1882N(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1476i
            int r14 = r0.m1877C(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1476i
            int r13 = r0.m1876B(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1469b
            boolean r15 = r0.m1882N(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1469b
            int r13 = r0.m1876B(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1469b
            int r14 = r0.m1877C(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1477j
            boolean r13 = r0.m1882N(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1477j
            int r10 = r0.m1877C(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1477j
            int r2 = r0.m1876B(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1473f
            boolean r13 = r0.m1882N(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1473f
            int r10 = r0.m1877C(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1473f
            int r2 = r0.m1876B(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1470c
            boolean r13 = r0.m1882N(r13)
            android.widget.TextView r14 = r0.f1471d
            boolean r14 = r0.m1882N(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1470c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1470c
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1471d
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1471d
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1470c
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1471d
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1471d
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1470c
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1470c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1471d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f1491x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1486s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1487t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1487t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1486s
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f1484q
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1470c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1470c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1470c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1470c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1485r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f1471d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1471d
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1471d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1471d
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1485r
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f1484q
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f1470c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            android.widget.TextView r4 = r0.f1470c
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1470c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1470c
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1485r
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f1471d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1471d
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1471d
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1471d
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1485r
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            r4 = 3
            r0.m1883b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            int r3 = r3.size()
            r7 = 0
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.f1457E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m1876B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            r4 = 5
            r0.m1883b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            int r3 = r3.size()
            r7 = 0
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.f1457E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1877C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            r4 = 1
            r0.m1883b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            int r3 = r0.m1895u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.f1457E
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.f1457E
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m1876B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.f1457E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1459G;
        char b = C0401l0.m2125b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (m1882N(this.f1472e)) {
            m1879E(this.f1472e, i, 0, i2, 0, this.f1483p);
            i5 = this.f1472e.getMeasuredWidth() + m1893s(this.f1472e);
            i4 = Math.max(0, this.f1472e.getMeasuredHeight() + m1894t(this.f1472e));
            i3 = View.combineMeasuredStates(0, this.f1472e.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1882N(this.f1476i)) {
            m1879E(this.f1476i, i, 0, i2, 0, this.f1483p);
            i5 = this.f1476i.getMeasuredWidth() + m1893s(this.f1476i);
            i4 = Math.max(i4, this.f1476i.getMeasuredHeight() + m1894t(this.f1476i));
            i3 = View.combineMeasuredStates(i3, this.f1476i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (m1882N(this.f1469b)) {
            m1879E(this.f1469b, i, max, i2, 0, this.f1483p);
            i6 = this.f1469b.getMeasuredWidth() + m1893s(this.f1469b);
            i4 = Math.max(i4, this.f1469b.getMeasuredHeight() + m1894t(this.f1469b));
            i3 = View.combineMeasuredStates(i3, this.f1469b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1882N(this.f1477j)) {
            max2 += m1878D(this.f1477j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1477j.getMeasuredHeight() + m1894t(this.f1477j));
            i3 = View.combineMeasuredStates(i3, this.f1477j.getMeasuredState());
        }
        if (m1882N(this.f1473f)) {
            max2 += m1878D(this.f1473f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1473f.getMeasuredHeight() + m1894t(this.f1473f));
            i3 = View.combineMeasuredStates(i3, this.f1473f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f1494b == 0 && m1882N(childAt)) {
                max2 += m1878D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1894t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1486s + this.f1487t;
        int i13 = this.f1484q + this.f1485r;
        if (m1882N(this.f1470c)) {
            m1878D(this.f1470c, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1470c.getMeasuredWidth() + m1893s(this.f1470c);
            i7 = this.f1470c.getMeasuredHeight() + m1894t(this.f1470c);
            i9 = View.combineMeasuredStates(i3, this.f1470c.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1882N(this.f1471d)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m1878D(this.f1471d, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1471d.getMeasuredHeight() + m1894t(this.f1471d);
            i9 = View.combineMeasuredStates(i9, this.f1471d.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1881M()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        ActionMenuView actionMenuView = this.f1469b;
        C0287e N = actionMenuView != null ? actionMenuView.mo1420N() : null;
        int i = savedState.f1495d;
        if (!(i == 0 || this.f1464L == null || N == null || (findItem = N.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1496e) {
            m1880F();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1885h();
        C0430x xVar = this.f1488u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        xVar.mo2318f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0291g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0368d dVar = this.f1464L;
        if (!(dVar == null || (gVar = dVar.f1501c) == null)) {
            savedState.f1495d = gVar.getItemId();
        }
        savedState.f1496e = mo1936A();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1455C = false;
        }
        if (!this.f1455C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1455C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1455C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C5264a.m23789d(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1467O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1490w) {
            this.f1490w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1489v) {
            this.f1489v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C5264a.m23789d(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C5264a.m23789d(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1889l();
        this.f1472e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0369e eVar) {
        this.f1460H = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1887j();
        this.f1469b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1479l != i) {
            this.f1479l = i;
            if (i == 0) {
                this.f1478k = getContext();
            } else {
                this.f1478k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1487t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1485r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1484q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1486s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean mo2025v() {
        C0368d dVar = this.f1464L;
        return (dVar == null || dVar.f1501c == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo2026w() {
        ActionMenuView actionMenuView = this.f1469b;
        return actionMenuView != null && actionMenuView.mo1416H();
    }

    /* renamed from: x */
    public void mo2027x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean mo2028z() {
        ActionMenuView actionMenuView = this.f1469b;
        return actionMenuView != null && actionMenuView.mo1417I();
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        int f1494b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2029a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f552a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1494b = layoutParams.f1494b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo2029a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1491x = 8388627;
        this.f1457E = new ArrayList<>();
        this.f1458F = new ArrayList<>();
        this.f1459G = new int[2];
        this.f1461I = new C0365a();
        this.f1468P = new C0366b();
        Context context2 = getContext();
        int[] iArr = C5247j.f23175m3;
        C0384f0 v = C0384f0.m1994v(context2, attributeSet, iArr, i, 0);
        C5723u.m25326m0(this, context, iArr, attributeSet, v.mo2112r(), i, 0);
        this.f1480m = v.mo2108n(C5247j.f23054O3, 0);
        this.f1481n = v.mo2108n(C5247j.f23009F3, 0);
        this.f1491x = v.mo2106l(C5247j.f23180n3, this.f1491x);
        this.f1482o = v.mo2106l(C5247j.f23185o3, 48);
        int e = v.mo2099e(C5247j.f23024I3, 0);
        int i2 = C5247j.f23049N3;
        e = v.mo2113s(i2) ? v.mo2099e(i2, e) : e;
        this.f1487t = e;
        this.f1486s = e;
        this.f1485r = e;
        this.f1484q = e;
        int e2 = v.mo2099e(C5247j.f23039L3, -1);
        if (e2 >= 0) {
            this.f1484q = e2;
        }
        int e3 = v.mo2099e(C5247j.f23034K3, -1);
        if (e3 >= 0) {
            this.f1485r = e3;
        }
        int e4 = v.mo2099e(C5247j.f23044M3, -1);
        if (e4 >= 0) {
            this.f1486s = e4;
        }
        int e5 = v.mo2099e(C5247j.f23029J3, -1);
        if (e5 >= 0) {
            this.f1487t = e5;
        }
        this.f1483p = v.mo2100f(C5247j.f23240z3, -1);
        int e6 = v.mo2099e(C5247j.f23220v3, Integer.MIN_VALUE);
        int e7 = v.mo2099e(C5247j.f23200r3, Integer.MIN_VALUE);
        int f = v.mo2100f(C5247j.f23210t3, 0);
        int f2 = v.mo2100f(C5247j.f23215u3, 0);
        m1885h();
        this.f1488u.mo2317e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f1488u.mo2319g(e6, e7);
        }
        this.f1489v = v.mo2099e(C5247j.f23225w3, Integer.MIN_VALUE);
        this.f1490w = v.mo2099e(C5247j.f23205s3, Integer.MIN_VALUE);
        this.f1474g = v.mo2101g(C5247j.f23195q3);
        this.f1475h = v.mo2110p(C5247j.f23190p3);
        CharSequence p = v.mo2110p(C5247j.f23019H3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo2110p(C5247j.f23004E3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1478k = getContext();
        setPopupTheme(v.mo2108n(C5247j.f22999D3, 0));
        Drawable g = v.mo2101g(C5247j.f22994C3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo2110p(C5247j.f22989B3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo2101g(C5247j.f23230x3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo2110p(C5247j.f23235y3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C5247j.f23059P3;
        if (v.mo2113s(i3)) {
            setTitleTextColor(v.mo2097c(i3));
        }
        int i4 = C5247j.f23014G3;
        if (v.mo2113s(i4)) {
            setSubtitleTextColor(v.mo2097c(i4));
        }
        int i5 = C5247j.f22984A3;
        if (v.mo2113s(i5)) {
            mo2027x(v.mo2108n(i5, 0));
        }
        v.mo2114w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1949g();
        }
        ImageButton imageButton = this.f1476i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1949g();
            this.f1476i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1476i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1474g);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1886i();
            if (!m1896y(this.f1473f)) {
                m1884c(this.f1473f, true);
            }
        } else {
            ImageView imageView = this.f1473f;
            if (imageView != null && m1896y(imageView)) {
                removeView(this.f1473f);
                this.f1458F.remove(this.f1473f);
            }
        }
        ImageView imageView2 = this.f1473f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1886i();
        }
        ImageView imageView = this.f1473f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1889l();
        }
        ImageButton imageButton = this.f1472e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1889l();
            if (!m1896y(this.f1472e)) {
                m1884c(this.f1472e, true);
            }
        } else {
            ImageButton imageButton = this.f1472e;
            if (imageButton != null && m1896y(imageButton)) {
                removeView(this.f1472e);
                this.f1458F.remove(this.f1472e);
            }
        }
        ImageButton imageButton2 = this.f1472e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1471d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1471d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1471d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1481n;
                if (i != 0) {
                    this.f1471d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1454B;
                if (colorStateList != null) {
                    this.f1471d.setTextColor(colorStateList);
                }
            }
            if (!m1896y(this.f1471d)) {
                m1884c(this.f1471d, true);
            }
        } else {
            TextView textView = this.f1471d;
            if (textView != null && m1896y(textView)) {
                removeView(this.f1471d);
                this.f1458F.remove(this.f1471d);
            }
        }
        TextView textView2 = this.f1471d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1493z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1454B = colorStateList;
        TextView textView = this.f1471d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1470c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1470c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1470c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1480m;
                if (i != 0) {
                    this.f1470c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1453A;
                if (colorStateList != null) {
                    this.f1470c.setTextColor(colorStateList);
                }
            }
            if (!m1896y(this.f1470c)) {
                m1884c(this.f1470c, true);
            }
        } else {
            TextView textView = this.f1470c;
            if (textView != null && m1896y(textView)) {
                removeView(this.f1470c);
                this.f1458F.remove(this.f1470c);
            }
        }
        TextView textView2 = this.f1470c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1492y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1453A = colorStateList;
        TextView textView = this.f1470c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0364a();

        /* renamed from: d */
        int f1495d;

        /* renamed from: e */
        boolean f1496e;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        class C0364a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0364a() {
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
            this.f1495d = parcel.readInt();
            this.f1496e = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1495d);
            parcel.writeInt(this.f1496e ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
