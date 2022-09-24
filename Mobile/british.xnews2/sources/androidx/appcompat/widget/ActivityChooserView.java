package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import p072f.C5241d;
import p072f.C5243f;
import p072f.C5244g;
import p072f.C5245h;
import p072f.C5247j;
import p103l.C5639e;
import p110m0.C5685b;
import p110m0.C5723u;
import p116n0.C5771c;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: b */
    final C0326f f1171b;

    /* renamed from: c */
    private final C0327g f1172c;

    /* renamed from: d */
    private final View f1173d;

    /* renamed from: e */
    private final Drawable f1174e;

    /* renamed from: f */
    final FrameLayout f1175f;

    /* renamed from: g */
    private final ImageView f1176g;

    /* renamed from: h */
    final FrameLayout f1177h;

    /* renamed from: i */
    private final ImageView f1178i;

    /* renamed from: j */
    private final int f1179j;

    /* renamed from: k */
    C5685b f1180k;

    /* renamed from: l */
    final DataSetObserver f1181l;

    /* renamed from: m */
    private final ViewTreeObserver.OnGlobalLayoutListener f1182m;

    /* renamed from: n */
    private ListPopupWindow f1183n;

    /* renamed from: o */
    PopupWindow.OnDismissListener f1184o;

    /* renamed from: p */
    boolean f1185p;

    /* renamed from: q */
    int f1186q;

    /* renamed from: r */
    private boolean f1187r;

    /* renamed from: s */
    private int f1188s;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: b */
        private static final int[] f1189b = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0384f0 u = C0384f0.m1993u(context, attributeSet, f1189b);
            setBackgroundDrawable(u.mo2101g(0));
            u.mo2114w();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    class C0321a extends DataSetObserver {
        C0321a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1171b.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1171b.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    class C0322b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0322b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.mo1447b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().show();
            C5685b bVar = ActivityChooserView.this.f1180k;
            if (bVar != null) {
                bVar.subUiVisibilityChanged(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    class C0323c extends View.AccessibilityDelegate {
        C0323c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C5771c.m25532H0(accessibilityNodeInfo).mo22621Z(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    class C0324d extends C0415s {
        C0324d(View view) {
            super(view);
        }

        /* renamed from: b */
        public C5639e mo1009b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo1010c() {
            ActivityChooserView.this.mo1448c();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo1409d() {
            ActivityChooserView.this.mo1446a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    class C0325e extends DataSetObserver {
        C0325e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mo1450e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    private class C0326f extends BaseAdapter {

        /* renamed from: b */
        private C0376c f1195b;

        /* renamed from: c */
        private int f1196c = 4;

        /* renamed from: d */
        private boolean f1197d;

        /* renamed from: e */
        private boolean f1198e;

        /* renamed from: f */
        private boolean f1199f;

        C0326f() {
        }

        /* renamed from: a */
        public int mo1469a() {
            throw null;
        }

        /* renamed from: b */
        public C0376c mo1470b() {
            return this.f1195b;
        }

        /* renamed from: c */
        public ResolveInfo mo1471c() {
            throw null;
        }

        /* renamed from: d */
        public int mo1472d() {
            throw null;
        }

        /* renamed from: e */
        public boolean mo1473e() {
            return this.f1197d;
        }

        /* renamed from: f */
        public void mo1474f(C0376c cVar) {
            ActivityChooserView.this.f1171b.mo1470b();
            notifyDataSetChanged();
        }

        public int getCount() {
            throw null;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            } else if (!this.f1197d) {
                throw null;
            } else {
                throw null;
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f1199f || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C5243f.f22937x) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C5244g.f22945f, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C5243f.f22935v)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C5243f.f22910S)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1197d || i != 0 || !this.f1198e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C5244g.f22945f, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C5243f.f22910S)).setText(ActivityChooserView.this.getContext().getString(C5245h.f22963b));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    private class C0327g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        C0327g() {
        }

        /* renamed from: a */
        private void m1699a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1184o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1177h) {
                activityChooserView.mo1446a();
                ActivityChooserView.this.f1171b.mo1471c();
                ActivityChooserView.this.f1171b.mo1470b();
                throw null;
            } else if (view == activityChooserView.f1175f) {
                activityChooserView.f1185p = false;
                activityChooserView.mo1449d(activityChooserView.f1186q);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m1699a();
            C5685b bVar = ActivityChooserView.this.f1180k;
            if (bVar != null) {
                bVar.subUiVisibilityChanged(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0326f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo1446a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f1185p) {
                    activityChooserView.f1171b.mo1473e();
                    ActivityChooserView.this.f1171b.mo1470b();
                    throw null;
                } else if (i > 0) {
                    activityChooserView.f1171b.mo1470b();
                    throw null;
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.mo1449d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1177h) {
                if (activityChooserView.f1171b.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f1185p = true;
                    activityChooserView2.mo1449d(activityChooserView2.f1186q);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo1446a() {
        if (!mo1447b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1182m);
        return true;
    }

    /* renamed from: b */
    public boolean mo1447b() {
        return getListPopupWindow().mo1044a();
    }

    /* renamed from: c */
    public boolean mo1448c() {
        if (mo1447b() || !this.f1187r) {
            return false;
        }
        this.f1185p = false;
        mo1449d(this.f1186q);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1449d(int i) {
        this.f1171b.mo1470b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1450e() {
        if (this.f1171b.getCount() > 0) {
            this.f1175f.setEnabled(true);
        } else {
            this.f1175f.setEnabled(false);
        }
        int a = this.f1171b.mo1469a();
        int d = this.f1171b.mo1472d();
        if (a == 1 || (a > 1 && d > 0)) {
            this.f1177h.setVisibility(0);
            ResolveInfo c = this.f1171b.mo1471c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1178i.setImageDrawable(c.loadIcon(packageManager));
            if (this.f1188s != 0) {
                CharSequence loadLabel = c.loadLabel(packageManager);
                this.f1177h.setContentDescription(getContext().getString(this.f1188s, new Object[]{loadLabel}));
            }
        } else {
            this.f1177h.setVisibility(8);
        }
        if (this.f1177h.getVisibility() == 0) {
            this.f1173d.setBackgroundDrawable(this.f1174e);
        } else {
            this.f1173d.setBackgroundDrawable((Drawable) null);
        }
    }

    public C0376c getDataModel() {
        return this.f1171b.mo1470b();
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.f1183n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1183n = listPopupWindow;
            listPopupWindow.mo1630o(this.f1171b);
            this.f1183n.mo1751C(this);
            this.f1183n.mo1757I(true);
            this.f1183n.mo1759K(this.f1172c);
            this.f1183n.mo1758J(this.f1172c);
        }
        return this.f1183n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1171b.mo1470b();
        this.f1187r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1171b.mo1470b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1182m);
        }
        if (mo1447b()) {
            mo1446a();
        }
        this.f1187r = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1173d.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1447b()) {
            mo1446a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f1173d;
        if (this.f1177h.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0376c cVar) {
        this.f1171b.mo1474f(cVar);
        if (mo1447b()) {
            mo1446a();
            mo1448c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1188s = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1176g.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1176g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1186q = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1184o = onDismissListener;
    }

    public void setProvider(C5685b bVar) {
        this.f1180k = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1181l = new C0321a();
        this.f1182m = new C0322b();
        this.f1186q = 4;
        int[] iArr = C5247j.f23000E;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C5723u.m25326m0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f1186q = obtainStyledAttributes.getInt(C5247j.f23010G, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C5247j.f23005F);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C5244g.f22944e, this, true);
        C0327g gVar = new C0327g();
        this.f1172c = gVar;
        View findViewById = findViewById(C5243f.f22923j);
        this.f1173d = findViewById;
        this.f1174e = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C5243f.f22931r);
        this.f1177h = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = C5243f.f22936w;
        this.f1178i = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C5243f.f22933t);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0323c());
        frameLayout2.setOnTouchListener(new C0324d(frameLayout2));
        this.f1175f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f1176g = imageView;
        imageView.setImageDrawable(drawable);
        C0326f fVar = new C0326f();
        this.f1171b = fVar;
        fVar.registerDataSetObserver(new C0325e());
        Resources resources = context.getResources();
        this.f1179j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5241d.f22843d));
    }
}
