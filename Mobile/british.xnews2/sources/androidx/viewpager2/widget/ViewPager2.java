package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C1160j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.C1386a;
import p110m0.C5723u;
import p116n0.C5771c;
import p116n0.C5781f;
import p122o1.C5867a;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: v */
    static boolean f6197v = true;

    /* renamed from: b */
    private final Rect f6198b = new Rect();

    /* renamed from: c */
    private final Rect f6199c = new Rect();

    /* renamed from: d */
    private C1407b f6200d = new C1407b(3);

    /* renamed from: e */
    int f6201e;

    /* renamed from: f */
    boolean f6202f = false;

    /* renamed from: g */
    private RecyclerView.C1095j f6203g = new C1388a();

    /* renamed from: h */
    private LinearLayoutManager f6204h;

    /* renamed from: i */
    private int f6205i = -1;

    /* renamed from: j */
    private Parcelable f6206j;

    /* renamed from: k */
    RecyclerView f6207k;

    /* renamed from: l */
    private C1160j f6208l;

    /* renamed from: m */
    C1410e f6209m;

    /* renamed from: n */
    private C1407b f6210n;

    /* renamed from: o */
    private C1408c f6211o;

    /* renamed from: p */
    private C1409d f6212p;

    /* renamed from: q */
    private RecyclerView.C1098m f6213q = null;

    /* renamed from: r */
    private boolean f6214r = false;

    /* renamed from: s */
    private boolean f6215s = true;

    /* renamed from: t */
    private int f6216t = -1;

    /* renamed from: u */
    C1392e f6217u;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C1388a extends C1394g {
        C1388a() {
            super((C1388a) null);
        }

        /* renamed from: a */
        public void mo5360a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f6202f = true;
            viewPager2.f6209m.mo6800l();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C1389b extends C1396i {
        C1389b() {
        }

        /* renamed from: a */
        public void mo6761a(int i) {
            if (i == 0) {
                ViewPager2.this.mo6739m();
            }
        }

        /* renamed from: c */
        public void mo6762c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f6201e != i) {
                viewPager2.f6201e = i;
                viewPager2.f6217u.mo6779q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C1390c extends C1396i {
        C1390c() {
        }

        /* renamed from: c */
        public void mo6762c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f6207k.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C1391d implements RecyclerView.C1109q {
        C1391d() {
        }

        /* renamed from: a */
        public void mo5499a(View view) {
        }

        /* renamed from: b */
        public void mo5500b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.width != -1 || layoutParams.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class C1392e {
        private C1392e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6763a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6764b(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6765c(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6766d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6767e(RecyclerView.C1092h<?> hVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6768f(RecyclerView.C1092h<?> hVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String mo6769g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6770h(C1407b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo6771i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6772j(C5771c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6773k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo6774l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo6775m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public CharSequence mo6776n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo6777o(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo6778p() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6779q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6780r() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo6781s() {
        }

        /* synthetic */ C1392e(ViewPager2 viewPager2, C1388a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C1393f extends C1392e {
        C1393f() {
            super(ViewPager2.this, (C1388a) null);
        }

        /* renamed from: b */
        public boolean mo6764b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.mo6727e();
        }

        /* renamed from: d */
        public boolean mo6766d() {
            return true;
        }

        /* renamed from: j */
        public void mo6772j(C5771c cVar) {
            if (!ViewPager2.this.mo6727e()) {
                cVar.mo22617T(C5771c.C5772a.f24485r);
                cVar.mo22617T(C5771c.C5772a.f24484q);
                cVar.mo22664x0(false);
            }
        }

        /* renamed from: k */
        public boolean mo6773k(int i) {
            if (mo6764b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: n */
        public CharSequence mo6776n() {
            if (mo6766d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class C1394g extends RecyclerView.C1095j {
        private C1394g() {
        }

        /* renamed from: a */
        public abstract void mo5360a();

        /* renamed from: b */
        public final void mo5361b(int i, int i2) {
            mo5360a();
        }

        /* renamed from: c */
        public final void mo5362c(int i, int i2, Object obj) {
            mo5360a();
        }

        /* renamed from: d */
        public final void mo5363d(int i, int i2) {
            mo5360a();
        }

        /* renamed from: e */
        public final void mo5364e(int i, int i2, int i3) {
            mo5360a();
        }

        /* renamed from: f */
        public final void mo5365f(int i, int i2) {
            mo5360a();
        }

        /* synthetic */ C1394g(C1388a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C1395h extends LinearLayoutManager {
        C1395h(Context context) {
            super(context);
        }

        /* renamed from: M0 */
        public void mo5424M0(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, C5771c cVar) {
            super.mo5424M0(vVar, zVar, cVar);
            ViewPager2.this.f6217u.mo6772j(cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: M1 */
        public void mo5016M1(RecyclerView.C1121z zVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo5016M1(zVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: h1 */
        public boolean mo5460h1(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, int i, Bundle bundle) {
            if (ViewPager2.this.f6217u.mo6764b(i)) {
                return ViewPager2.this.f6217u.mo6773k(i);
            }
            return super.mo5460h1(vVar, zVar, i, bundle);
        }

        /* renamed from: s1 */
        public boolean mo5481s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class C1396i {
        /* renamed from: a */
        public void mo6761a(int i) {
        }

        /* renamed from: b */
        public void mo6782b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo6762c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    class C1397j extends C1392e {

        /* renamed from: b */
        private final C5781f f6228b = new C1398a();

        /* renamed from: c */
        private final C5781f f6229c = new C1399b();

        /* renamed from: d */
        private RecyclerView.C1095j f6230d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        class C1398a implements C5781f {
            C1398a() {
            }

            /* renamed from: a */
            public boolean mo6785a(View view, C5781f.C5782a aVar) {
                C1397j.this.mo6783v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        class C1399b implements C5781f {
            C1399b() {
            }

            /* renamed from: a */
            public boolean mo6785a(View view, C5781f.C5782a aVar) {
                C1397j.this.mo6783v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        class C1400c extends C1394g {
            C1400c() {
                super((C1388a) null);
            }

            /* renamed from: a */
            public void mo5360a() {
                C1397j.this.mo6784w();
            }
        }

        C1397j() {
            super(ViewPager2.this, (C1388a) null);
        }

        /* renamed from: t */
        private void m7449t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
                C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(i2, i, false, 0));
            }
            i = 0;
            C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(i2, i, false, 0));
        }

        /* renamed from: u */
        private void m7450u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.C1092h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.mo6727e()) {
                if (ViewPager2.this.f6201e > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f6201e < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: a */
        public boolean mo6763a() {
            return true;
        }

        /* renamed from: c */
        public boolean mo6765c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: e */
        public void mo6767e(RecyclerView.C1092h<?> hVar) {
            mo6784w();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f6230d);
            }
        }

        /* renamed from: f */
        public void mo6768f(RecyclerView.C1092h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f6230d);
            }
        }

        /* renamed from: g */
        public String mo6769g() {
            if (mo6763a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: h */
        public void mo6770h(C1407b bVar, RecyclerView recyclerView) {
            C5723u.m25350y0(recyclerView, 2);
            this.f6230d = new C1400c();
            if (C5723u.m25351z(ViewPager2.this) == 0) {
                C5723u.m25350y0(ViewPager2.this, 1);
            }
        }

        /* renamed from: i */
        public void mo6771i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m7449t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                m7450u(accessibilityNodeInfo);
            }
        }

        /* renamed from: l */
        public boolean mo6774l(int i, Bundle bundle) {
            int i2;
            if (mo6765c(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo6783v(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: m */
        public void mo6775m() {
            mo6784w();
        }

        /* renamed from: o */
        public void mo6777o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo6769g());
        }

        /* renamed from: p */
        public void mo6778p() {
            mo6784w();
        }

        /* renamed from: q */
        public void mo6779q() {
            mo6784w();
        }

        /* renamed from: r */
        public void mo6780r() {
            mo6784w();
        }

        /* renamed from: s */
        public void mo6781s() {
            mo6784w();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo6783v(int i) {
            if (ViewPager2.this.mo6727e()) {
                ViewPager2.this.mo6738j(i, true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo6784w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            C5723u.m25318i0(viewPager2, 16908360);
            C5723u.m25318i0(viewPager2, 16908361);
            C5723u.m25318i0(viewPager2, 16908358);
            C5723u.m25318i0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.mo6727e()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean d = ViewPager2.this.mo6725d();
                    int i2 = d ? 16908360 : 16908361;
                    if (d) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.f6201e < itemCount - 1) {
                        C5723u.m25322k0(viewPager2, new C5771c.C5772a(i2, (CharSequence) null), (CharSequence) null, this.f6228b);
                    }
                    if (ViewPager2.this.f6201e > 0) {
                        C5723u.m25322k0(viewPager2, new C5771c.C5772a(i, (CharSequence) null), (CharSequence) null, this.f6229c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f6201e < itemCount - 1) {
                    C5723u.m25322k0(viewPager2, new C5771c.C5772a(16908359, (CharSequence) null), (CharSequence) null, this.f6228b);
                }
                if (ViewPager2.this.f6201e > 0) {
                    C5723u.m25322k0(viewPager2, new C5771c.C5772a(16908358, (CharSequence) null), (CharSequence) null, this.f6229c);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface C1401k {
        /* renamed from: a */
        void mo6786a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    private class C1402l extends C1160j {
        C1402l() {
        }

        /* renamed from: f */
        public View mo5790f(RecyclerView.C1104p pVar) {
            if (ViewPager2.this.mo6722c()) {
                return null;
            }
            return super.mo5790f(pVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    private class C1403m extends RecyclerView {
        C1403m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f6217u.mo6766d()) {
                return ViewPager2.this.f6217u.mo6776n();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f6201e);
            accessibilityEvent.setToIndex(ViewPager2.this.f6201e);
            ViewPager2.this.f6217u.mo6777o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo6727e() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo6727e() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    private static class C1404n implements Runnable {

        /* renamed from: b */
        private final int f6237b;

        /* renamed from: c */
        private final RecyclerView f6238c;

        C1404n(int i, RecyclerView recyclerView) {
            this.f6237b = i;
            this.f6238c = recyclerView;
        }

        public void run() {
            this.f6238c.mo5195s1(this.f6237b);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7390b(context, attributeSet);
    }

    /* renamed from: a */
    private RecyclerView.C1109q m7389a() {
        return new C1391d();
    }

    /* renamed from: b */
    private void m7390b(Context context, AttributeSet attributeSet) {
        this.f6217u = f6197v ? new C1397j() : new C1393f();
        C1403m mVar = new C1403m(context);
        this.f6207k = mVar;
        mVar.setId(C5723u.m25321k());
        this.f6207k.setDescendantFocusability(131072);
        C1395h hVar = new C1395h(context);
        this.f6204h = hVar;
        this.f6207k.setLayoutManager(hVar);
        this.f6207k.setScrollingTouchSlop(1);
        m7393k(context, attributeSet);
        this.f6207k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f6207k.mo5160j(m7389a());
        C1410e eVar = new C1410e(this);
        this.f6209m = eVar;
        this.f6211o = new C1408c(this, eVar, this.f6207k);
        C1402l lVar = new C1402l();
        this.f6208l = lVar;
        lVar.mo5816b(this.f6207k);
        this.f6207k.mo5164l(this.f6209m);
        C1407b bVar = new C1407b(3);
        this.f6210n = bVar;
        this.f6209m.mo6802o(bVar);
        C1389b bVar2 = new C1389b();
        C1390c cVar = new C1390c();
        this.f6210n.mo6792d(bVar2);
        this.f6210n.mo6792d(cVar);
        this.f6217u.mo6770h(this.f6210n, this.f6207k);
        this.f6210n.mo6792d(this.f6200d);
        C1409d dVar = new C1409d(this.f6204h);
        this.f6212p = dVar;
        this.f6210n.mo6792d(dVar);
        RecyclerView recyclerView = this.f6207k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m7391f(RecyclerView.C1092h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f6203g);
        }
    }

    /* renamed from: h */
    private void m7392h() {
        RecyclerView.C1092h adapter;
        if (this.f6205i != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f6206j;
            if (parcelable != null) {
                if (adapter instanceof C1386a) {
                    ((C1386a) adapter).mo6721b(parcelable);
                }
                this.f6206j = null;
            }
            int max = Math.max(0, Math.min(this.f6205i, adapter.getItemCount() - 1));
            this.f6201e = max;
            this.f6205i = -1;
            this.f6207k.mo5163k1(max);
            this.f6217u.mo6775m();
        }
    }

    /* renamed from: k */
    private void m7393k(Context context, AttributeSet attributeSet) {
        int[] iArr = C5867a.f24619g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C5867a.f24620h, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: l */
    private void m7394l(RecyclerView.C1092h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f6203g);
        }
    }

    /* renamed from: c */
    public boolean mo6722c() {
        return this.f6211o.mo6793a();
    }

    public boolean canScrollHorizontally(int i) {
        return this.f6207k.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f6207k.canScrollVertically(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6725d() {
        return this.f6204h.mo5440Z() == 1;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f6218b;
            sparseArray.put(this.f6207k.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m7392h();
    }

    /* renamed from: e */
    public boolean mo6727e() {
        return this.f6215s;
    }

    /* renamed from: g */
    public void mo6728g() {
        if (this.f6212p.mo6794d() != null) {
            double g = this.f6209m.mo6796g();
            int i = (int) g;
            double d = (double) i;
            Double.isNaN(d);
            float f = (float) (g - d);
            this.f6212p.mo6782b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (this.f6217u.mo6763a()) {
            return this.f6217u.mo6769g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.C1092h getAdapter() {
        return this.f6207k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f6201e;
    }

    public int getItemDecorationCount() {
        return this.f6207k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f6216t;
    }

    public int getOrientation() {
        return this.f6204h.mo5034l2();
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f6207k;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f6209m.mo6797h();
    }

    /* renamed from: i */
    public void mo6737i(int i, boolean z) {
        if (!mo6722c()) {
            mo6738j(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6738j(int i, boolean z) {
        RecyclerView.C1092h adapter = getAdapter();
        if (adapter == null) {
            if (this.f6205i != -1) {
                this.f6205i = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.f6201e || !this.f6209m.mo6799j()) {
                int i2 = this.f6201e;
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.f6201e = min;
                    this.f6217u.mo6779q();
                    if (!this.f6209m.mo6799j()) {
                        d = this.f6209m.mo6796g();
                    }
                    this.f6209m.mo6801m(min, z);
                    if (!z) {
                        this.f6207k.mo5163k1(min);
                        return;
                    }
                    double d2 = (double) min;
                    Double.isNaN(d2);
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.f6207k.mo5163k1(d2 > d ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.f6207k;
                        recyclerView.post(new C1404n(min, recyclerView));
                        return;
                    }
                    this.f6207k.mo5195s1(min);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6739m() {
        C1160j jVar = this.f6208l;
        if (jVar != null) {
            View f = jVar.mo5790f(this.f6204h);
            if (f != null) {
                int h0 = this.f6204h.mo5459h0(f);
                if (h0 != this.f6201e && getScrollState() == 0) {
                    this.f6210n.mo6762c(h0);
                }
                this.f6202f = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f6217u.mo6771i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f6207k.getMeasuredWidth();
        int measuredHeight = this.f6207k.getMeasuredHeight();
        this.f6198b.left = getPaddingLeft();
        this.f6198b.right = (i3 - i) - getPaddingRight();
        this.f6198b.top = getPaddingTop();
        this.f6198b.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f6198b, this.f6199c);
        RecyclerView recyclerView = this.f6207k;
        Rect rect = this.f6199c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f6202f) {
            mo6739m();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChild(this.f6207k, i, i2);
        int measuredWidth = this.f6207k.getMeasuredWidth();
        int measuredHeight = this.f6207k.getMeasuredHeight();
        int measuredState = this.f6207k.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6205i = savedState.f6219c;
        this.f6206j = savedState.f6220d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6218b = this.f6207k.getId();
        int i = this.f6205i;
        if (i == -1) {
            i = this.f6201e;
        }
        savedState.f6219c = i;
        Parcelable parcelable = this.f6206j;
        if (parcelable != null) {
            savedState.f6220d = parcelable;
        } else {
            RecyclerView.C1092h adapter = this.f6207k.getAdapter();
            if (adapter instanceof C1386a) {
                savedState.f6220d = ((C1386a) adapter).mo6720a();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f6217u.mo6765c(i, bundle)) {
            return this.f6217u.mo6774l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.C1092h hVar) {
        RecyclerView.C1092h adapter = this.f6207k.getAdapter();
        this.f6217u.mo6768f(adapter);
        m7394l(adapter);
        this.f6207k.setAdapter(hVar);
        this.f6201e = 0;
        m7392h();
        this.f6217u.mo6767e(hVar);
        m7391f(hVar);
    }

    public void setCurrentItem(int i) {
        mo6737i(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f6217u.mo6778p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f6216t = i;
            this.f6207k.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f6204h.mo5045y2(i);
        this.f6217u.mo6780r();
    }

    public void setPageTransformer(C1401k kVar) {
        if (kVar != null) {
            if (!this.f6214r) {
                this.f6213q = this.f6207k.getItemAnimator();
                this.f6214r = true;
            }
            this.f6207k.setItemAnimator((RecyclerView.C1098m) null);
        } else if (this.f6214r) {
            this.f6207k.setItemAnimator(this.f6213q);
            this.f6213q = null;
            this.f6214r = false;
        }
        if (kVar != this.f6212p.mo6794d()) {
            this.f6212p.mo6795e(kVar);
            mo6728g();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f6215s = z;
        this.f6217u.mo6781s();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1387a();

        /* renamed from: b */
        int f6218b;

        /* renamed from: c */
        int f6219c;

        /* renamed from: d */
        Parcelable f6220d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        static class C1387a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1387a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m7402a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m7402a(Parcel parcel, ClassLoader classLoader) {
            this.f6218b = parcel.readInt();
            this.f6219c = parcel.readInt();
            this.f6220d = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6218b);
            parcel.writeInt(this.f6219c);
            parcel.writeParcelable(this.f6220d, i);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m7402a(parcel, (ClassLoader) null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7390b(context, attributeSet);
    }
}
