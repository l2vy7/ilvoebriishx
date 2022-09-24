package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.widget.C0623j;
import java.lang.reflect.Method;
import p072f.C5238a;
import p072f.C5247j;
import p103l.C5639e;
import p110m0.C5723u;

public class ListPopupWindow implements C5639e {

    /* renamed from: H */
    private static Method f1294H;

    /* renamed from: I */
    private static Method f1295I;

    /* renamed from: J */
    private static Method f1296J;

    /* renamed from: A */
    private final C0341c f1297A;

    /* renamed from: B */
    private Runnable f1298B;

    /* renamed from: C */
    final Handler f1299C;

    /* renamed from: D */
    private final Rect f1300D;

    /* renamed from: E */
    private Rect f1301E;

    /* renamed from: F */
    private boolean f1302F;

    /* renamed from: G */
    PopupWindow f1303G;

    /* renamed from: b */
    private Context f1304b;

    /* renamed from: c */
    private ListAdapter f1305c;

    /* renamed from: d */
    C0410q f1306d;

    /* renamed from: e */
    private int f1307e;

    /* renamed from: f */
    private int f1308f;

    /* renamed from: g */
    private int f1309g;

    /* renamed from: h */
    private int f1310h;

    /* renamed from: i */
    private int f1311i;

    /* renamed from: j */
    private boolean f1312j;

    /* renamed from: k */
    private boolean f1313k;

    /* renamed from: l */
    private boolean f1314l;

    /* renamed from: m */
    private int f1315m;

    /* renamed from: n */
    private boolean f1316n;

    /* renamed from: o */
    private boolean f1317o;

    /* renamed from: p */
    int f1318p;

    /* renamed from: q */
    private View f1319q;

    /* renamed from: r */
    private int f1320r;

    /* renamed from: s */
    private DataSetObserver f1321s;

    /* renamed from: t */
    private View f1322t;

    /* renamed from: u */
    private Drawable f1323u;

    /* renamed from: v */
    private AdapterView.OnItemClickListener f1324v;

    /* renamed from: w */
    private AdapterView.OnItemSelectedListener f1325w;

    /* renamed from: x */
    final C0345g f1326x;

    /* renamed from: y */
    private final C0344f f1327y;

    /* renamed from: z */
    private final C0343e f1328z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    class C0339a implements Runnable {
        C0339a() {
        }

        public void run() {
            View s = ListPopupWindow.this.mo1772s();
            if (s != null && s.getWindowToken() != null) {
                ListPopupWindow.this.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    class C0340b implements AdapterView.OnItemSelectedListener {
        C0340b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0410q qVar;
            if (i != -1 && (qVar = ListPopupWindow.this.f1306d) != null) {
                qVar.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    private class C0341c implements Runnable {
        C0341c() {
        }

        public void run() {
            ListPopupWindow.this.mo1770q();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    private class C0342d extends DataSetObserver {
        C0342d() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.mo1044a()) {
                ListPopupWindow.this.show();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    private class C0343e implements AbsListView.OnScrollListener {
        C0343e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo1778z() && ListPopupWindow.this.f1303G.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1299C.removeCallbacks(listPopupWindow.f1326x);
                ListPopupWindow.this.f1326x.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    private class C0344f implements View.OnTouchListener {
        C0344f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f1303G) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1303G.getWidth() && y >= 0 && y < ListPopupWindow.this.f1303G.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1299C.postDelayed(listPopupWindow.f1326x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f1299C.removeCallbacks(listPopupWindow2.f1326x);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    private class C0345g implements Runnable {
        C0345g() {
        }

        public void run() {
            C0410q qVar = ListPopupWindow.this.f1306d;
            if (qVar != null && C5723u.m25293S(qVar) && ListPopupWindow.this.f1306d.getCount() > ListPopupWindow.this.f1306d.getChildCount()) {
                int childCount = ListPopupWindow.this.f1306d.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f1318p) {
                    listPopupWindow.f1303G.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1294H = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1296J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1295I = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, C5238a.f22793G);
    }

    /* renamed from: B */
    private void m1772B() {
        View view = this.f1319q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1319q);
            }
        }
    }

    /* renamed from: M */
    private void m1773M(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1294H;
            if (method != null) {
                try {
                    method.invoke(this.f1303G, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1303G.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1774p() {
        /*
            r12 = this;
            androidx.appcompat.widget.q r0 = r12.f1306d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f1304b
            androidx.appcompat.widget.ListPopupWindow$a r5 = new androidx.appcompat.widget.ListPopupWindow$a
            r5.<init>()
            r12.f1298B = r5
            boolean r5 = r12.f1302F
            r5 = r5 ^ r3
            androidx.appcompat.widget.q r5 = r12.mo1771r(r0, r5)
            r12.f1306d = r5
            android.graphics.drawable.Drawable r6 = r12.f1323u
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.q r5 = r12.f1306d
            android.widget.ListAdapter r6 = r12.f1305c
            r5.setAdapter(r6)
            androidx.appcompat.widget.q r5 = r12.f1306d
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1324v
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.q r5 = r12.f1306d
            r5.setFocusable(r3)
            androidx.appcompat.widget.q r5 = r12.f1306d
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.q r5 = r12.f1306d
            androidx.appcompat.widget.ListPopupWindow$b r6 = new androidx.appcompat.widget.ListPopupWindow$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.q r5 = r12.f1306d
            androidx.appcompat.widget.ListPopupWindow$e r6 = r12.f1328z
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1325w
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.q r6 = r12.f1306d
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.q r5 = r12.f1306d
            android.view.View r6 = r12.f1319q
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1320r
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1320r
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1308f
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.f1303G
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.f1303G
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1319q
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.f1303G
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.f1300D
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1300D
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1312j
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f1310h = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.f1300D
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.f1303G
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.mo1772s()
            int r6 = r12.f1310h
            int r3 = r12.m1775t(r4, r6, r3)
            boolean r4 = r12.f1316n
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f1307e
            if (r4 != r2) goto L_0x011d
            goto L_0x017b
        L_0x011d:
            int r4 = r12.f1308f
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x015c
        L_0x012b:
            android.content.Context r2 = r12.f1304b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1300D
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x015c
        L_0x0144:
            android.content.Context r2 = r12.f1304b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1300D
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x015c:
            r7 = r1
            androidx.appcompat.widget.q r6 = r12.f1306d
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2225d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.q r2 = r12.f1306d
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.q r3 = r12.f1306d
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.m1774p():int");
    }

    /* renamed from: t */
    private int m1775t(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1303G.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1295I;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1303G, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1303G.getMaxAvailableHeight(view, i);
    }

    /* renamed from: A */
    public boolean mo1750A() {
        return this.f1302F;
    }

    /* renamed from: C */
    public void mo1751C(View view) {
        this.f1322t = view;
    }

    /* renamed from: D */
    public void mo1752D(int i) {
        this.f1303G.setAnimationStyle(i);
    }

    /* renamed from: E */
    public void mo1753E(int i) {
        Drawable background = this.f1303G.getBackground();
        if (background != null) {
            background.getPadding(this.f1300D);
            Rect rect = this.f1300D;
            this.f1308f = rect.left + rect.right + i;
            return;
        }
        mo1763P(i);
    }

    /* renamed from: F */
    public void mo1754F(int i) {
        this.f1315m = i;
    }

    /* renamed from: G */
    public void mo1755G(Rect rect) {
        this.f1301E = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: H */
    public void mo1756H(int i) {
        this.f1303G.setInputMethodMode(i);
    }

    /* renamed from: I */
    public void mo1757I(boolean z) {
        this.f1302F = z;
        this.f1303G.setFocusable(z);
    }

    /* renamed from: J */
    public void mo1758J(PopupWindow.OnDismissListener onDismissListener) {
        this.f1303G.setOnDismissListener(onDismissListener);
    }

    /* renamed from: K */
    public void mo1759K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1324v = onItemClickListener;
    }

    /* renamed from: L */
    public void mo1760L(boolean z) {
        this.f1314l = true;
        this.f1313k = z;
    }

    /* renamed from: N */
    public void mo1761N(int i) {
        this.f1320r = i;
    }

    /* renamed from: O */
    public void mo1762O(int i) {
        C0410q qVar = this.f1306d;
        if (mo1044a() && qVar != null) {
            qVar.setListSelectionHidden(false);
            qVar.setSelection(i);
            if (qVar.getChoiceMode() != 0) {
                qVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: P */
    public void mo1763P(int i) {
        this.f1308f = i;
    }

    /* renamed from: a */
    public boolean mo1044a() {
        return this.f1303G.isShowing();
    }

    /* renamed from: b */
    public void mo1764b(Drawable drawable) {
        this.f1303G.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public int mo1765c() {
        return this.f1309g;
    }

    public void dismiss() {
        this.f1303G.dismiss();
        m1772B();
        this.f1303G.setContentView((View) null);
        this.f1306d = null;
        this.f1299C.removeCallbacks(this.f1326x);
    }

    /* renamed from: e */
    public void mo1766e(int i) {
        this.f1309g = i;
    }

    /* renamed from: h */
    public Drawable mo1767h() {
        return this.f1303G.getBackground();
    }

    /* renamed from: j */
    public ListView mo1048j() {
        return this.f1306d;
    }

    /* renamed from: k */
    public void mo1768k(int i) {
        this.f1310h = i;
        this.f1312j = true;
    }

    /* renamed from: n */
    public int mo1769n() {
        if (!this.f1312j) {
            return 0;
        }
        return this.f1310h;
    }

    /* renamed from: o */
    public void mo1630o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1321s;
        if (dataSetObserver == null) {
            this.f1321s = new C0342d();
        } else {
            ListAdapter listAdapter2 = this.f1305c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1305c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1321s);
        }
        C0410q qVar = this.f1306d;
        if (qVar != null) {
            qVar.setAdapter(this.f1305c);
        }
    }

    /* renamed from: q */
    public void mo1770q() {
        C0410q qVar = this.f1306d;
        if (qVar != null) {
            qVar.setListSelectionHidden(true);
            qVar.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0410q mo1771r(Context context, boolean z) {
        return new C0410q(context, z);
    }

    /* renamed from: s */
    public View mo1772s() {
        return this.f1322t;
    }

    public void show() {
        int p = m1774p();
        boolean z = mo1778z();
        C0623j.m3449b(this.f1303G, this.f1311i);
        boolean z2 = true;
        if (!this.f1303G.isShowing()) {
            int i = this.f1308f;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1772s().getWidth();
            }
            int i2 = this.f1307e;
            if (i2 == -1) {
                p = -1;
            } else if (i2 != -2) {
                p = i2;
            }
            this.f1303G.setWidth(i);
            this.f1303G.setHeight(p);
            m1773M(true);
            this.f1303G.setOutsideTouchable(!this.f1317o && !this.f1316n);
            this.f1303G.setTouchInterceptor(this.f1327y);
            if (this.f1314l) {
                C0623j.m3448a(this.f1303G, this.f1313k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1296J;
                if (method != null) {
                    try {
                        method.invoke(this.f1303G, new Object[]{this.f1301E});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1303G.setEpicenterBounds(this.f1301E);
            }
            C0623j.m3450c(this.f1303G, mo1772s(), this.f1309g, this.f1310h, this.f1315m);
            this.f1306d.setSelection(-1);
            if (!this.f1302F || this.f1306d.isInTouchMode()) {
                mo1770q();
            }
            if (!this.f1302F) {
                this.f1299C.post(this.f1297A);
            }
        } else if (C5723u.m25293S(mo1772s())) {
            int i3 = this.f1308f;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1772s().getWidth();
            }
            int i4 = this.f1307e;
            if (i4 == -1) {
                if (!z) {
                    p = -1;
                }
                if (z) {
                    this.f1303G.setWidth(this.f1308f == -1 ? -1 : 0);
                    this.f1303G.setHeight(0);
                } else {
                    this.f1303G.setWidth(this.f1308f == -1 ? -1 : 0);
                    this.f1303G.setHeight(-1);
                }
            } else if (i4 != -2) {
                p = i4;
            }
            PopupWindow popupWindow = this.f1303G;
            if (this.f1317o || this.f1316n) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.f1303G.update(mo1772s(), this.f1309g, this.f1310h, i3 < 0 ? -1 : i3, p < 0 ? -1 : p);
        }
    }

    /* renamed from: u */
    public Object mo1773u() {
        if (!mo1044a()) {
            return null;
        }
        return this.f1306d.getSelectedItem();
    }

    /* renamed from: v */
    public long mo1774v() {
        if (!mo1044a()) {
            return Long.MIN_VALUE;
        }
        return this.f1306d.getSelectedItemId();
    }

    /* renamed from: w */
    public int mo1775w() {
        if (!mo1044a()) {
            return -1;
        }
        return this.f1306d.getSelectedItemPosition();
    }

    /* renamed from: x */
    public View mo1776x() {
        if (!mo1044a()) {
            return null;
        }
        return this.f1306d.getSelectedView();
    }

    /* renamed from: y */
    public int mo1777y() {
        return this.f1308f;
    }

    /* renamed from: z */
    public boolean mo1778z() {
        return this.f1303G.getInputMethodMode() == 2;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22793G);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1307e = -2;
        this.f1308f = -2;
        this.f1311i = 1002;
        this.f1315m = 0;
        this.f1316n = false;
        this.f1317o = false;
        this.f1318p = Integer.MAX_VALUE;
        this.f1320r = 0;
        this.f1326x = new C0345g();
        this.f1327y = new C0344f();
        this.f1328z = new C0343e();
        this.f1297A = new C0341c();
        this.f1300D = new Rect();
        this.f1304b = context;
        this.f1299C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23193q1, i, i2);
        this.f1309g = obtainStyledAttributes.getDimensionPixelOffset(C5247j.f23198r1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C5247j.f23203s1, 0);
        this.f1310h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1312j = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f1303G = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
