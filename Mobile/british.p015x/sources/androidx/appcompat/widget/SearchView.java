package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p073f.C5238a;
import p073f.C5241d;
import p073f.C5243f;
import p073f.C5244g;
import p073f.C5245h;
import p073f.C5247j;
import p099k.C5524c;
import p111m0.C5723u;
import p128p0.C5874a;

public class SearchView extends LinearLayoutCompat implements C5524c {

    /* renamed from: C0 */
    static final C0361n f1336C0 = (Build.VERSION.SDK_INT < 29 ? new C0361n() : null);

    /* renamed from: A */
    private Rect f1337A;

    /* renamed from: A0 */
    private final AdapterView.OnItemSelectedListener f1338A0;

    /* renamed from: B */
    private Rect f1339B;

    /* renamed from: B0 */
    private TextWatcher f1340B0;

    /* renamed from: C */
    private int[] f1341C;

    /* renamed from: D */
    private int[] f1342D;

    /* renamed from: E */
    private final ImageView f1343E;

    /* renamed from: F */
    private final Drawable f1344F;

    /* renamed from: G */
    private final int f1345G;

    /* renamed from: H */
    private final int f1346H;

    /* renamed from: I */
    private final Intent f1347I;

    /* renamed from: J */
    private final Intent f1348J;

    /* renamed from: K */
    private final CharSequence f1349K;

    /* renamed from: L */
    private C0359l f1350L;

    /* renamed from: M */
    private C0358k f1351M;

    /* renamed from: N */
    View.OnFocusChangeListener f1352N;

    /* renamed from: O */
    private C0360m f1353O;

    /* renamed from: P */
    private View.OnClickListener f1354P;

    /* renamed from: Q */
    private boolean f1355Q;

    /* renamed from: R */
    private boolean f1356R;

    /* renamed from: S */
    C5874a f1357S;

    /* renamed from: T */
    private boolean f1358T;

    /* renamed from: U */
    private CharSequence f1359U;

    /* renamed from: V */
    private boolean f1360V;

    /* renamed from: W */
    private boolean f1361W;

    /* renamed from: l0 */
    private int f1362l0;

    /* renamed from: m0 */
    private boolean f1363m0;

    /* renamed from: n0 */
    private CharSequence f1364n0;

    /* renamed from: o0 */
    private CharSequence f1365o0;

    /* renamed from: p0 */
    private boolean f1366p0;

    /* renamed from: q */
    final SearchAutoComplete f1367q;

    /* renamed from: q0 */
    private int f1368q0;

    /* renamed from: r */
    private final View f1369r;

    /* renamed from: r0 */
    SearchableInfo f1370r0;

    /* renamed from: s */
    private final View f1371s;

    /* renamed from: s0 */
    private Bundle f1372s0;

    /* renamed from: t */
    private final View f1373t;

    /* renamed from: t0 */
    private final Runnable f1374t0;

    /* renamed from: u */
    final ImageView f1375u;

    /* renamed from: u0 */
    private Runnable f1376u0;

    /* renamed from: v */
    final ImageView f1377v;

    /* renamed from: v0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1378v0;

    /* renamed from: w */
    final ImageView f1379w;

    /* renamed from: w0 */
    private final View.OnClickListener f1380w0;

    /* renamed from: x */
    final ImageView f1381x;

    /* renamed from: x0 */
    View.OnKeyListener f1382x0;

    /* renamed from: y */
    private final View f1383y;

    /* renamed from: y0 */
    private final TextView.OnEditorActionListener f1384y0;

    /* renamed from: z */
    private C0362o f1385z;

    /* renamed from: z0 */
    private final AdapterView.OnItemClickListener f1386z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0346a();

        /* renamed from: d */
        boolean f1387d;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0346a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0346a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1387d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1387d));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1387d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e */
        private int f1388e;

        /* renamed from: f */
        private SearchView f1389f;

        /* renamed from: g */
        private boolean f1390g;

        /* renamed from: h */
        final Runnable f1391h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0347a implements Runnable {
            C0347a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1847c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C5238a.f22820p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return PsExtractor.AUDIO_STREAM;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1845a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1336C0.mo1879c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1846b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1847c() {
            if (this.f1390g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1390g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1388e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1390g) {
                removeCallbacks(this.f1391h);
                post(this.f1391h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1389f.mo1801Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1389f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1389f.hasFocus() && getVisibility() == 0) {
                this.f1390g = true;
                if (SearchView.m1816M(getContext())) {
                    mo1845a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1390g = false;
                removeCallbacks(this.f1391h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1390g = false;
                removeCallbacks(this.f1391h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1390g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1389f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1388e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1391h = new C0347a();
            this.f1388e = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0348a implements TextWatcher {
        C0348a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1800Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0349b implements Runnable {
        C0349b() {
        }

        public void run() {
            SearchView.this.mo1807f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0350c implements Runnable {
        C0350c() {
        }

        public void run() {
            C5874a aVar = SearchView.this.f1357S;
            if (aVar instanceof C0436z) {
                aVar.mo2345b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0351d implements View.OnFocusChangeListener {
        C0351d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1352N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0352e implements View.OnLayoutChangeListener {
        C0352e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1789B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0353f implements View.OnClickListener {
        C0353f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1375u) {
                searchView.mo1797V();
            } else if (view == searchView.f1379w) {
                searchView.mo1793R();
            } else if (view == searchView.f1377v) {
                searchView.mo1798W();
            } else if (view == searchView.f1381x) {
                searchView.mo1802a0();
            } else if (view == searchView.f1367q) {
                searchView.mo1790H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0354g implements View.OnKeyListener {
        C0354g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1370r0 == null) {
                return false;
            }
            if (searchView.f1367q.isPopupShowing() && SearchView.this.f1367q.getListSelection() != -1) {
                return SearchView.this.mo1799X(view, i, keyEvent);
            }
            if (SearchView.this.f1367q.mo1846b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1792P(0, (String) null, searchView2.f1367q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0355h implements TextView.OnEditorActionListener {
        C0355h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1798W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0356i implements AdapterView.OnItemClickListener {
        C0356i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1794S(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0357j implements AdapterView.OnItemSelectedListener {
        C0357j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1795T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0358k {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0359l {
        /* renamed from: a */
        boolean mo1873a(String str);

        /* renamed from: b */
        boolean mo1874b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0360m {
        /* renamed from: a */
        boolean mo1875a(int i);

        /* renamed from: b */
        boolean mo1876b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0361n {

        /* renamed from: a */
        private Method f1403a = null;

        /* renamed from: b */
        private Method f1404b = null;

        /* renamed from: c */
        private Method f1405c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0361n() {
            m1857d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1403a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1404b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1405c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1857d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1877a(AutoCompleteTextView autoCompleteTextView) {
            m1857d();
            Method method = this.f1404b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1878b(AutoCompleteTextView autoCompleteTextView) {
            m1857d();
            Method method = this.f1403a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1879c(AutoCompleteTextView autoCompleteTextView) {
            m1857d();
            Method method = this.f1405c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0362o extends TouchDelegate {

        /* renamed from: a */
        private final View f1406a;

        /* renamed from: b */
        private final Rect f1407b = new Rect();

        /* renamed from: c */
        private final Rect f1408c = new Rect();

        /* renamed from: d */
        private final Rect f1409d = new Rect();

        /* renamed from: e */
        private final int f1410e;

        /* renamed from: f */
        private boolean f1411f;

        public C0362o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1410e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1880a(rect, rect2);
            this.f1406a = view;
        }

        /* renamed from: a */
        public void mo1880a(Rect rect, Rect rect2) {
            this.f1407b.set(rect);
            this.f1409d.set(rect);
            Rect rect3 = this.f1409d;
            int i = this.f1410e;
            rect3.inset(-i, -i);
            this.f1408c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1411f
                r7.f1411f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1411f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1409d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1407b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1411f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1408c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1406a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1406a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1408c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1406a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0362o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: C */
    private Intent m1808C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1365o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1372s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1370r0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m1809D(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String o;
        try {
            String o2 = C0436z.m2298o(cursor, "suggest_intent_action");
            if (o2 == null) {
                o2 = this.f1370r0.getSuggestIntentAction();
            }
            if (o2 == null) {
                o2 = "android.intent.action.SEARCH";
            }
            String str2 = o2;
            String o3 = C0436z.m2298o(cursor, "suggest_intent_data");
            if (o3 == null) {
                o3 = this.f1370r0.getSuggestIntentData();
            }
            if (!(o3 == null || (o = C0436z.m2298o(cursor, "suggest_intent_data_id")) == null)) {
                o3 = o3 + "/" + Uri.encode(o);
            }
            if (o3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o3);
            }
            return m1808C(str2, uri, C0436z.m2298o(cursor, "suggest_intent_extra_data"), C0436z.m2298o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m1810E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1372s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m1811F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: G */
    private void m1812G() {
        this.f1367q.dismissDropDown();
    }

    /* renamed from: I */
    private void m1813I(View view, Rect rect) {
        view.getLocationInWindow(this.f1341C);
        getLocationInWindow(this.f1342D);
        int[] iArr = this.f1341C;
        int i = iArr[1];
        int[] iArr2 = this.f1342D;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m1814J(CharSequence charSequence) {
        if (!this.f1355Q || this.f1344F == null) {
            return charSequence;
        }
        double textSize = (double) this.f1367q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f1344F.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1344F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m1815K() {
        SearchableInfo searchableInfo = this.f1370r0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1370r0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1347I;
        } else if (this.f1370r0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1348J;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    static boolean m1816M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m1817N() {
        return (this.f1358T || this.f1363m0) && !mo1791L();
    }

    /* renamed from: O */
    private void m1818O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m1819Q(int i, int i2, String str) {
        Cursor c = this.f1357S.mo22810c();
        if (c == null || !c.moveToPosition(i)) {
            return false;
        }
        m1818O(m1809D(c, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m1820b0() {
        post(this.f1374t0);
    }

    /* renamed from: c0 */
    private void m1821c0(int i) {
        Editable text = this.f1367q.getText();
        Cursor c = this.f1357S.mo22810c();
        if (c != null) {
            if (c.moveToPosition(i)) {
                CharSequence a = this.f1357S.mo2344a(c);
                if (a != null) {
                    setQuery(a);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: e0 */
    private void m1822e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1367q.getText());
        int i = 0;
        if (!z2 && (!this.f1355Q || this.f1366p0)) {
            z = false;
        }
        ImageView imageView = this.f1379w;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1379w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m1823g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1367q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1814J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C5241d.f22846g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C5241d.f22847h);
    }

    /* renamed from: h0 */
    private void m1824h0() {
        this.f1367q.setThreshold(this.f1370r0.getSuggestThreshold());
        this.f1367q.setImeOptions(this.f1370r0.getImeOptions());
        int inputType = this.f1370r0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1370r0.getSuggestAuthority() != null) {
                inputType = inputType | C6540C.DEFAULT_BUFFER_SEGMENT_SIZE | 524288;
            }
        }
        this.f1367q.setInputType(inputType);
        C5874a aVar = this.f1357S;
        if (aVar != null) {
            aVar.mo2345b((Cursor) null);
        }
        if (this.f1370r0.getSuggestAuthority() != null) {
            C0436z zVar = new C0436z(getContext(), this, this.f1370r0, this.f1378v0);
            this.f1357S = zVar;
            this.f1367q.setAdapter(zVar);
            C0436z zVar2 = (C0436z) this.f1357S;
            if (this.f1360V) {
                i = 2;
            }
            zVar2.mo2357y(i);
        }
    }

    /* renamed from: i0 */
    private void m1825i0() {
        this.f1373t.setVisibility((!m1817N() || !(this.f1377v.getVisibility() == 0 || this.f1381x.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m1826j0(boolean z) {
        this.f1377v.setVisibility((!this.f1358T || !m1817N() || !hasFocus() || (!z && this.f1363m0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m1827k0(boolean z) {
        this.f1356R = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1367q.getText());
        this.f1375u.setVisibility(i2);
        m1826j0(z2);
        this.f1369r.setVisibility(z ? 8 : 0);
        if (this.f1343E.getDrawable() == null || this.f1355Q) {
            i = 8;
        }
        this.f1343E.setVisibility(i);
        m1822e0();
        m1828l0(!z2);
        m1825i0();
    }

    /* renamed from: l0 */
    private void m1828l0(boolean z) {
        int i = 8;
        if (this.f1363m0 && !mo1791L() && z) {
            this.f1377v.setVisibility(8);
            i = 0;
        }
        this.f1381x.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1367q.setText(charSequence);
        this.f1367q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1789B() {
        int i;
        if (this.f1383y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1371s.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0401l0.m2125b(this);
            int dimensionPixelSize = this.f1355Q ? resources.getDimensionPixelSize(C5241d.f22844e) + resources.getDimensionPixelSize(C5241d.f22845f) : 0;
            this.f1367q.getDropDownBackground().getPadding(rect);
            if (b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1367q.setDropDownHorizontalOffset(i);
            this.f1367q.setDropDownWidth((((this.f1383y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1790H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1367q.refreshAutoCompleteResults();
            return;
        }
        C0361n nVar = f1336C0;
        nVar.mo1878b(this.f1367q);
        nVar.mo1877a(this.f1367q);
    }

    /* renamed from: L */
    public boolean mo1791L() {
        return this.f1356R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1792P(int i, String str, String str2) {
        getContext().startActivity(m1808C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1793R() {
        if (!TextUtils.isEmpty(this.f1367q.getText())) {
            this.f1367q.setText("");
            this.f1367q.requestFocus();
            this.f1367q.setImeVisibility(true);
        } else if (this.f1355Q) {
            C0358k kVar = this.f1351M;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                m1827k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1794S(int i, int i2, String str) {
        C0360m mVar = this.f1353O;
        if (mVar != null && mVar.mo1876b(i)) {
            return false;
        }
        m1819Q(i, 0, (String) null);
        this.f1367q.setImeVisibility(false);
        m1812G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1795T(int i) {
        C0360m mVar = this.f1353O;
        if (mVar != null && mVar.mo1875a(i)) {
            return false;
        }
        m1821c0(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1796U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1797V() {
        m1827k0(false);
        this.f1367q.requestFocus();
        this.f1367q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1354P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1798W() {
        Editable text = this.f1367q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0359l lVar = this.f1350L;
            if (lVar == null || !lVar.mo1874b(text.toString())) {
                if (this.f1370r0 != null) {
                    mo1792P(0, (String) null, text.toString());
                }
                this.f1367q.setImeVisibility(false);
                m1812G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1799X(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1370r0 != null && this.f1357S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1794S(this.f1367q.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f1367q.length();
                }
                this.f1367q.setSelection(i2);
                this.f1367q.setListSelection(0);
                this.f1367q.clearListSelection();
                this.f1367q.mo1845a();
                return true;
            } else if (i == 19) {
                this.f1367q.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1800Y(CharSequence charSequence) {
        Editable text = this.f1367q.getText();
        this.f1365o0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1826j0(z);
        m1828l0(!z);
        m1822e0();
        m1825i0();
        if (this.f1350L != null && !TextUtils.equals(charSequence, this.f1364n0)) {
            this.f1350L.mo1873a(charSequence.toString());
        }
        this.f1364n0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1801Z() {
        m1827k0(mo1791L());
        m1820b0();
        if (this.f1367q.hasFocus()) {
            mo1790H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1802a0() {
        SearchableInfo searchableInfo = this.f1370r0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m1811F(this.f1347I, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m1810E(this.f1348J, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: c */
    public void mo1803c() {
        if (!this.f1366p0) {
            this.f1366p0 = true;
            int imeOptions = this.f1367q.getImeOptions();
            this.f1368q0 = imeOptions;
            this.f1367q.setImeOptions(imeOptions | 33554432);
            this.f1367q.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f1361W = true;
        super.clearFocus();
        this.f1367q.clearFocus();
        this.f1367q.setImeVisibility(false);
        this.f1361W = false;
    }

    /* renamed from: d0 */
    public void mo1805d0(CharSequence charSequence, boolean z) {
        this.f1367q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1367q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1365o0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1798W();
        }
    }

    /* renamed from: f */
    public void mo1806f() {
        mo1805d0("", false);
        clearFocus();
        m1827k0(true);
        this.f1367q.setImeOptions(this.f1368q0);
        this.f1366p0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1807f0() {
        int[] iArr = this.f1367q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1371s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1373t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1367q.getImeOptions();
    }

    public int getInputType() {
        return this.f1367q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1362l0;
    }

    public CharSequence getQuery() {
        return this.f1367q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1359U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1370r0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1349K;
        }
        return getContext().getText(this.f1370r0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1346H;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1345G;
    }

    public C5874a getSuggestionsAdapter() {
        return this.f1357S;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1374t0);
        post(this.f1376u0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1813I(this.f1367q, this.f1337A);
            Rect rect = this.f1339B;
            Rect rect2 = this.f1337A;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0362o oVar = this.f1385z;
            if (oVar == null) {
                C0362o oVar2 = new C0362o(this.f1339B, this.f1337A, this.f1367q);
                this.f1385z = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.mo1880a(this.f1339B, this.f1337A);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo1791L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1362l0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1362l0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1362l0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        m1827k0(savedState.f1387d);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1387d = mo1791L();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1820b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1361W || !isFocusable()) {
            return false;
        }
        if (mo1791L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1367q.requestFocus(i, rect);
        if (requestFocus) {
            m1827k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1372s0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1793R();
        } else {
            mo1797V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1355Q != z) {
            this.f1355Q = z;
            m1827k0(z);
            m1823g0();
        }
    }

    public void setImeOptions(int i) {
        this.f1367q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1367q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1362l0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0358k kVar) {
        this.f1351M = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1352N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0359l lVar) {
        this.f1350L = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1354P = onClickListener;
    }

    public void setOnSuggestionListener(C0360m mVar) {
        this.f1353O = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1359U = charSequence;
        m1823g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1360V = z;
        C5874a aVar = this.f1357S;
        if (aVar instanceof C0436z) {
            ((C0436z) aVar).mo2357y(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1370r0 = searchableInfo;
        if (searchableInfo != null) {
            m1824h0();
            m1823g0();
        }
        boolean K = m1815K();
        this.f1363m0 = K;
        if (K) {
            this.f1367q.setPrivateImeOptions("nm");
        }
        m1827k0(mo1791L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1358T = z;
        m1827k0(mo1791L());
    }

    public void setSuggestionsAdapter(C5874a aVar) {
        this.f1357S = aVar;
        this.f1367q.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22797K);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1337A = new Rect();
        this.f1339B = new Rect();
        this.f1341C = new int[2];
        this.f1342D = new int[2];
        this.f1374t0 = new C0349b();
        this.f1376u0 = new C0350c();
        this.f1378v0 = new WeakHashMap<>();
        C0353f fVar = new C0353f();
        this.f1380w0 = fVar;
        this.f1382x0 = new C0354g();
        C0355h hVar = new C0355h();
        this.f1384y0 = hVar;
        C0356i iVar = new C0356i();
        this.f1386z0 = iVar;
        C0357j jVar = new C0357j();
        this.f1338A0 = jVar;
        this.f1340B0 = new C0348a();
        C0384f0 v = C0384f0.m1994v(context, attributeSet, C5247j.f23164k2, i, 0);
        LayoutInflater.from(context).inflate(v.mo2108n(C5247j.f23214u2, C5244g.f22959t), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C5243f.f22901J);
        this.f1367q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1369r = findViewById(C5243f.f22897F);
        View findViewById = findViewById(C5243f.f22900I);
        this.f1371s = findViewById;
        View findViewById2 = findViewById(C5243f.f22907P);
        this.f1373t = findViewById2;
        ImageView imageView = (ImageView) findViewById(C5243f.f22895D);
        this.f1375u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C5243f.f22898G);
        this.f1377v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C5243f.f22896E);
        this.f1379w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C5243f.f22902K);
        this.f1381x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C5243f.f22899H);
        this.f1343E = imageView5;
        C5723u.m25336r0(findViewById, v.mo2101g(C5247j.f23219v2));
        C5723u.m25336r0(findViewById2, v.mo2101g(C5247j.f23239z2));
        int i2 = C5247j.f23234y2;
        imageView.setImageDrawable(v.mo2101g(i2));
        imageView2.setImageDrawable(v.mo2101g(C5247j.f23204s2));
        imageView3.setImageDrawable(v.mo2101g(C5247j.f23189p2));
        imageView4.setImageDrawable(v.mo2101g(C5247j.f22988B2));
        imageView5.setImageDrawable(v.mo2101g(i2));
        this.f1344F = v.mo2101g(C5247j.f23229x2);
        C0390h0.m2064a(imageView, getResources().getString(C5245h.f22974m));
        this.f1345G = v.mo2108n(C5247j.f22983A2, C5244g.f22958s);
        this.f1346H = v.mo2108n(C5247j.f23194q2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1340B0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1382x0);
        searchAutoComplete.setOnFocusChangeListener(new C0351d());
        setIconifiedByDefault(v.mo2095a(C5247j.f23209t2, true));
        int f = v.mo2100f(C5247j.f23174m2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f1349K = v.mo2110p(C5247j.f23199r2);
        this.f1359U = v.mo2110p(C5247j.f23224w2);
        int k = v.mo2105k(C5247j.f23184o2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo2105k(C5247j.f23179n2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo2095a(C5247j.f23169l2, true));
        v.mo2114w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1347I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1348J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1383y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0352e());
        }
        m1827k0(this.f1355Q);
        m1823g0();
    }
}
