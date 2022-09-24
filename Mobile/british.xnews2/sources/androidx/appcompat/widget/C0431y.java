package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import p072f.C5238a;
import p098k.C5521a;

/* renamed from: androidx.appcompat.widget.y */
/* compiled from: ScrollingTabContainerView */
public class C0431y extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k */
    private static final Interpolator f1710k = new DecelerateInterpolator();

    /* renamed from: b */
    Runnable f1711b;

    /* renamed from: c */
    private C0434c f1712c;

    /* renamed from: d */
    LinearLayoutCompat f1713d;

    /* renamed from: e */
    private Spinner f1714e;

    /* renamed from: f */
    private boolean f1715f;

    /* renamed from: g */
    int f1716g;

    /* renamed from: h */
    int f1717h;

    /* renamed from: i */
    private int f1718i;

    /* renamed from: j */
    private int f1719j;

    /* renamed from: androidx.appcompat.widget.y$a */
    /* compiled from: ScrollingTabContainerView */
    class C0432a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1720b;

        C0432a(View view) {
            this.f1720b = view;
        }

        public void run() {
            C0431y.this.smoothScrollTo(this.f1720b.getLeft() - ((C0431y.this.getWidth() - this.f1720b.getWidth()) / 2), 0);
            C0431y.this.f1711b = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0433b extends BaseAdapter {
        C0433b() {
        }

        public int getCount() {
            return C0431y.this.f1713d.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0435d) C0431y.this.f1713d.getChildAt(i)).mo2338b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0431y.this.mo2321c((ActionBar.C0213b) getItem(i), true);
            }
            ((C0435d) view).mo2337a((ActionBar.C0213b) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0434c implements View.OnClickListener {
        C0434c() {
        }

        public void onClick(View view) {
            ((C0435d) view).mo2338b().mo731e();
            int childCount = C0431y.this.f1713d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0431y.this.f1713d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0435d extends LinearLayout {

        /* renamed from: b */
        private final int[] f1724b;

        /* renamed from: c */
        private ActionBar.C0213b f1725c;

        /* renamed from: d */
        private TextView f1726d;

        /* renamed from: e */
        private ImageView f1727e;

        /* renamed from: f */
        private View f1728f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0435d(android.content.Context r6, androidx.appcompat.app.ActionBar.C0213b r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0431y.this = r5
                int r5 = p072f.C5238a.f22808d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1724b = r1
                r4.f1725c = r7
                androidx.appcompat.widget.f0 r5 = androidx.appcompat.widget.C0384f0.m1994v(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo2113s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo2101g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo2114w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2339c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0431y.C0435d.<init>(androidx.appcompat.widget.y, android.content.Context, androidx.appcompat.app.ActionBar$b, boolean):void");
        }

        /* renamed from: a */
        public void mo2337a(ActionBar.C0213b bVar) {
            this.f1725c = bVar;
            mo2339c();
        }

        /* renamed from: b */
        public ActionBar.C0213b mo2338b() {
            return this.f1725c;
        }

        /* renamed from: c */
        public void mo2339c() {
            ActionBar.C0213b bVar = this.f1725c;
            View b = bVar.mo728b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1728f = b;
                TextView textView = this.f1726d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1727e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1727e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1728f;
            if (view != null) {
                removeView(view);
                this.f1728f = null;
            }
            Drawable c = bVar.mo729c();
            CharSequence d = bVar.mo730d();
            if (c != null) {
                if (this.f1727e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1727e = appCompatImageView;
                }
                this.f1727e.setImageDrawable(c);
                this.f1727e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1727e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1727e.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1726d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C5238a.f22809e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1726d = appCompatTextView;
                }
                this.f1726d.setText(d);
                this.f1726d.setVisibility(0);
            } else {
                TextView textView2 = this.f1726d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1726d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1727e;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.mo727a());
            }
            if (!z) {
                charSequence = bVar.mo727a();
            }
            C0390h0.m2064a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0431y.this.f1716g > 0 && getMeasuredWidth() > (i3 = C0431y.this.f1716g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m2282b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C5238a.f22812h);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: d */
    private boolean m2283d() {
        Spinner spinner = this.f1714e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m2284e() {
        if (!m2283d()) {
            if (this.f1714e == null) {
                this.f1714e = m2282b();
            }
            removeView(this.f1713d);
            addView(this.f1714e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1714e.getAdapter() == null) {
                this.f1714e.setAdapter(new C0433b());
            }
            Runnable runnable = this.f1711b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1711b = null;
            }
            this.f1714e.setSelection(this.f1719j);
        }
    }

    /* renamed from: f */
    private boolean m2285f() {
        if (!m2283d()) {
            return false;
        }
        removeView(this.f1714e);
        addView(this.f1713d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1714e.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2320a(int i) {
        View childAt = this.f1713d.getChildAt(i);
        Runnable runnable = this.f1711b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0432a aVar = new C0432a(childAt);
        this.f1711b = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0435d mo2321c(ActionBar.C0213b bVar, boolean z) {
        C0435d dVar = new C0435d(getContext(), bVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1718i));
        } else {
            dVar.setFocusable(true);
            if (this.f1712c == null) {
                this.f1712c = new C0434c();
            }
            dVar.setOnClickListener(this.f1712c);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1711b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5521a b = C5521a.m24610b(getContext());
        setContentHeight(b.mo22009f());
        this.f1717h = b.mo22008e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1711b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0435d) view).mo2338b().mo731e();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1713d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1716g = -1;
        } else {
            if (childCount > 2) {
                this.f1716g = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1716g = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1716g = Math.min(this.f1716g, this.f1717h);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1718i, 1073741824);
        if (z2 || !this.f1715f) {
            z = false;
        }
        if (z) {
            this.f1713d.measure(0, makeMeasureSpec);
            if (this.f1713d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2284e();
            } else {
                m2285f();
            }
        } else {
            m2285f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1719j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1715f = z;
    }

    public void setContentHeight(int i) {
        this.f1718i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1719j = i;
        int childCount = this.f1713d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1713d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2320a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1714e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
