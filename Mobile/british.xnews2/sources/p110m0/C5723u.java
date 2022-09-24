package p110m0;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p110m0.C5682a;
import p110m0.C5690c0;
import p116n0.C5771c;
import p116n0.C5781f;
import p180z.C6420d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: m0.u */
/* compiled from: ViewCompat */
public class C5723u {

    /* renamed from: a */
    private static final AtomicInteger f24349a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f24350b;

    /* renamed from: c */
    private static boolean f24351c;

    /* renamed from: d */
    private static Field f24352d;

    /* renamed from: e */
    private static boolean f24353e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f24354f;

    /* renamed from: g */
    private static WeakHashMap<View, C5740y> f24355g = null;

    /* renamed from: h */
    private static Field f24356h;

    /* renamed from: i */
    private static boolean f24357i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f24358j;

    /* renamed from: k */
    private static final int[] f24359k = {C6420d.f26388b, C6420d.f26390c, C6420d.f26403n, C6420d.f26414y, C6420d.f26364B, C6420d.f26365C, C6420d.f26366D, C6420d.f26367E, C6420d.f26368F, C6420d.f26369G, C6420d.f26392d, C6420d.f26394e, C6420d.f26395f, C6420d.f26396g, C6420d.f26397h, C6420d.f26398i, C6420d.f26399j, C6420d.f26400k, C6420d.f26401l, C6420d.f26402m, C6420d.f26404o, C6420d.f26405p, C6420d.f26406q, C6420d.f26407r, C6420d.f26408s, C6420d.f26409t, C6420d.f26410u, C6420d.f26411v, C6420d.f26412w, C6420d.f26413x, C6420d.f26415z, C6420d.f26363A};

    /* renamed from: l */
    private static final C5719q f24360l = new C5724a();

    /* renamed from: m */
    private static C5729f f24361m = new C5729f();

    /* renamed from: m0.u$a */
    /* compiled from: ViewCompat */
    class C5724a implements C5719q {
        C5724a() {
        }
    }

    /* renamed from: m0.u$b */
    /* compiled from: ViewCompat */
    class C5725b extends C5730g<Boolean> {
        C5725b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo22479d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo22480e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22481h(Boolean bool, Boolean bool2) {
            return !mo22497a(bool, bool2);
        }
    }

    /* renamed from: m0.u$c */
    /* compiled from: ViewCompat */
    class C5726c extends C5730g<CharSequence> {
        C5726c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo22479d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo22480e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22481h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: m0.u$d */
    /* compiled from: ViewCompat */
    class C5727d extends C5730g<CharSequence> {
        C5727d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo22479d(View view) {
            return view.getStateDescription();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo22480e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22481h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: m0.u$e */
    /* compiled from: ViewCompat */
    class C5728e extends C5730g<Boolean> {
        C5728e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo22479d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo22480e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22481h(Boolean bool, Boolean bool2) {
            return !mo22497a(bool, bool2);
        }
    }

    /* renamed from: m0.u$f */
    /* compiled from: ViewCompat */
    static class C5729f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f24362b = new WeakHashMap<>();

        C5729f() {
        }

        /* renamed from: a */
        private void m25377a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C5723u.m25298X(view, z2 ? 16 : 32);
                this.f24362b.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m25378b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f24362b.entrySet()) {
                    m25377a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m25378b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: m0.u$g */
    /* compiled from: ViewCompat */
    static abstract class C5730g<T> {

        /* renamed from: a */
        private final int f24363a;

        /* renamed from: b */
        private final Class<T> f24364b;

        /* renamed from: c */
        private final int f24365c;

        /* renamed from: d */
        private final int f24366d;

        C5730g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m25379b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m25380c() {
            return Build.VERSION.SDK_INT >= this.f24365c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo22497a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo22479d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo22480e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo22498f(View view) {
            if (m25380c()) {
                return mo22479d(view);
            }
            if (!m25379b()) {
                return null;
            }
            T tag = view.getTag(this.f24363a);
            if (this.f24364b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22499g(View view, T t) {
            if (m25380c()) {
                mo22480e(view, t);
            } else if (m25379b() && mo22481h(mo22498f(view), t)) {
                C5723u.m25271E(view);
                view.setTag(this.f24363a, t);
                C5723u.m25298X(view, this.f24366d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo22481h(T t, T t2);

        C5730g(int i, Class<T> cls, int i2, int i3) {
            this.f24363a = i;
            this.f24364b = cls;
            this.f24366d = i2;
            this.f24365c = i3;
        }
    }

    /* renamed from: m0.u$h */
    /* compiled from: ViewCompat */
    private static class C5731h {

        /* renamed from: m0.u$h$a */
        /* compiled from: ViewCompat */
        class C5732a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C5690c0 f24367a = null;

            /* renamed from: b */
            final /* synthetic */ View f24368b;

            /* renamed from: c */
            final /* synthetic */ C5718p f24369c;

            C5732a(View view, C5718p pVar) {
                this.f24368b = view;
                this.f24369c = pVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C5690c0 x = C5690c0.m25113x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C5731h.m25387a(windowInsets, this.f24368b);
                    if (x.equals(this.f24367a)) {
                        return this.f24369c.mo870a(view, x).mo22422v();
                    }
                }
                this.f24367a = x;
                C5690c0 a = this.f24369c.mo870a(view, x);
                if (i >= 30) {
                    return a.mo22422v();
                }
                C5723u.m25324l0(view);
                return a.mo22422v();
            }
        }

        /* renamed from: a */
        static void m25387a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C6420d.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C5690c0 m25388b(View view, C5690c0 c0Var, Rect rect) {
            WindowInsets v = c0Var.mo22422v();
            if (v != null) {
                return C5690c0.m25113x(view.computeSystemWindowInsets(v, rect), view);
            }
            rect.setEmpty();
            return c0Var;
        }

        /* renamed from: c */
        public static C5690c0 m25389c(View view) {
            return C5690c0.C5691a.m25135a(view);
        }

        /* renamed from: d */
        static void m25390d(View view, C5718p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C6420d.tag_on_apply_window_listener, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C6420d.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C5732a(view, pVar));
            }
        }
    }

    /* renamed from: m0.u$i */
    /* compiled from: ViewCompat */
    private static class C5733i {
        /* renamed from: a */
        public static C5690c0 m25391a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C5690c0 w = C5690c0.m25112w(rootWindowInsets);
            w.mo22420t(w);
            w.mo22403d(view.getRootView());
            return w;
        }
    }

    /* renamed from: m0.u$j */
    /* compiled from: ViewCompat */
    private static class C5734j {
        /* renamed from: a */
        static void m25392a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: m0.u$k */
    /* compiled from: ViewCompat */
    public interface C5735k {
        /* renamed from: a */
        boolean mo22501a(View view, KeyEvent keyEvent);
    }

    /* renamed from: m0.u$l */
    /* compiled from: ViewCompat */
    static class C5736l {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f24370d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f24371a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f24372b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f24373c = null;

        C5736l() {
        }

        /* renamed from: a */
        static C5736l m25394a(View view) {
            int i = C6420d.f26384X;
            C5736l lVar = (C5736l) view.getTag(i);
            if (lVar != null) {
                return lVar;
            }
            C5736l lVar2 = new C5736l();
            view.setTag(i, lVar2);
            return lVar2;
        }

        /* renamed from: c */
        private View m25395c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f24371a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m25395c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m25397e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m25396d() {
            if (this.f24372b == null) {
                this.f24372b = new SparseArray<>();
            }
            return this.f24372b;
        }

        /* renamed from: e */
        private boolean m25397e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C6420d.f26385Y);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C5735k) arrayList.get(size)).mo22501a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m25398g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f24371a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f24370d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f24371a == null) {
                        this.f24371a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f24370d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f24371a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f24371a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo22502b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m25398g();
            }
            View c = m25395c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m25396d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo22503f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f24373c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f24373c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m25396d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C5723u.m25293S(view)) {
                m25397e(view, keyEvent);
            }
            return true;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A */
    public static int m25263A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m25264A0(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: B */
    public static int m25265B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: B0 */
    public static void m25266B0(View view, C5718p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C5731h.m25390d(view, pVar);
        }
    }

    /* renamed from: C */
    public static int m25267C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f24353e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f24352d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f24353e = true;
        }
        Field field = f24352d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: C0 */
    public static void m25268C0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: D */
    public static int m25269D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f24351c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f24350b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f24351c = true;
        }
        Field field = f24350b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: D0 */
    public static void m25270D0(View view, C5721s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.mo22478a() : null));
        }
    }

    /* renamed from: E */
    static C5682a m25271E(View view) {
        C5682a l = m25323l(view);
        if (l == null) {
            l = new C5682a();
        }
        m25330o0(view, l);
        return l;
    }

    /* renamed from: E0 */
    public static void m25272E0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: F */
    public static int m25273F(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: F0 */
    public static void m25274F0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f24354f == null) {
            f24354f = new WeakHashMap<>();
        }
        f24354f.put(view, str);
    }

    /* renamed from: G */
    public static int m25275G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: G0 */
    public static void m25276G0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: H */
    public static ViewParent m25277H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: H0 */
    private static void m25278H0(View view) {
        if (m25351z(view) == 0) {
            m25350y0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m25351z((View) parent) == 4) {
                m25350y0(view, 2);
                return;
            }
        }
    }

    /* renamed from: I */
    public static C5690c0 m25279I(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C5733i.m25391a(view);
        }
        if (i >= 21) {
            return C5731h.m25389c(view);
        }
        return null;
    }

    /* renamed from: I0 */
    public static void m25280I0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    /* renamed from: J */
    public static final CharSequence m25281J(View view) {
        return m25282J0().mo22498f(view);
    }

    /* renamed from: J0 */
    private static C5730g<CharSequence> m25282J0() {
        return new C5727d(C6420d.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: K */
    public static String m25283K(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f24354f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: K0 */
    public static void m25284K0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C5712j) {
            ((C5712j) view).stopNestedScroll();
        }
    }

    /* renamed from: L */
    public static float m25285L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    /* renamed from: L0 */
    private static void m25286L0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: M */
    public static int m25287M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: N */
    public static float m25288N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: O */
    public static boolean m25289O(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m25290P(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m25291Q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m25292R(View view) {
        Boolean f = m25301a().mo22498f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: S */
    public static boolean m25293S(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: T */
    public static boolean m25294T(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: U */
    public static boolean m25295U(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C5712j) {
            return ((C5712j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m25296V(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m25297W(View view) {
        Boolean f = m25328n0().mo22498f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: X */
    static void m25298X(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m25331p(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (m25329o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m25331p(view));
                    m25278H0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m25331p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: Y */
    public static void m25299Y(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect x = m25347x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m25309e(view, i);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            m25309e(view, i);
        }
    }

    /* renamed from: Z */
    public static void m25300Z(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect x = m25347x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m25311f(view, i);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            m25311f(view, i);
        }
    }

    /* renamed from: a */
    private static C5730g<Boolean> m25301a() {
        return new C5728e(C6420d.f26380R, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static C5690c0 m25302a0(View view, C5690c0 c0Var) {
        WindowInsets v;
        if (Build.VERSION.SDK_INT >= 21 && (v = c0Var.mo22422v()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(v);
            if (!onApplyWindowInsets.equals(v)) {
                return C5690c0.m25113x(onApplyWindowInsets, view);
            }
        }
        return c0Var;
    }

    /* renamed from: b */
    public static int m25303b(View view, CharSequence charSequence, C5781f fVar) {
        int r = m25335r(view, charSequence);
        if (r != -1) {
            m25305c(view, new C5771c.C5772a(r, charSequence, fVar));
        }
        return r;
    }

    /* renamed from: b0 */
    public static void m25304b0(View view, C5771c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo22607G0());
    }

    /* renamed from: c */
    private static void m25305c(View view, C5771c.C5772a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m25271E(view);
            m25320j0(aVar.mo22669b(), view);
            m25333q(view).add(aVar);
            m25298X(view, 0);
        }
    }

    /* renamed from: c0 */
    private static C5730g<CharSequence> m25306c0() {
        return new C5726c(C6420d.f26381S, CharSequence.class, 8, 28);
    }

    /* renamed from: d */
    public static C5740y m25307d(View view) {
        if (f24355g == null) {
            f24355g = new WeakHashMap<>();
        }
        C5740y yVar = f24355g.get(view);
        if (yVar != null) {
            return yVar;
        }
        C5740y yVar2 = new C5740y(view);
        f24355g.put(view, yVar2);
        return yVar2;
    }

    /* renamed from: d0 */
    public static boolean m25308d0(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: e */
    private static void m25309e(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m25286L0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m25286L0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m25310e0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: f */
    private static void m25311f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m25286L0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m25286L0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static void m25312f0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: g */
    public static C5690c0 m25313g(View view, C5690c0 c0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C5731h.m25388b(view, c0Var, rect) : c0Var;
    }

    /* renamed from: g0 */
    public static void m25314g0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: h */
    public static C5690c0 m25315h(View view, C5690c0 c0Var) {
        WindowInsets v;
        if (Build.VERSION.SDK_INT >= 21 && (v = c0Var.mo22422v()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(v);
            if (!dispatchApplyWindowInsets.equals(v)) {
                return C5690c0.m25113x(dispatchApplyWindowInsets, view);
            }
        }
        return c0Var;
    }

    /* renamed from: h0 */
    public static void m25316h0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: i */
    static boolean m25317i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C5736l.m25394a(view).mo22502b(view, keyEvent);
    }

    /* renamed from: i0 */
    public static void m25318i0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m25320j0(i, view);
            m25298X(view, 0);
        }
    }

    /* renamed from: j */
    static boolean m25319j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C5736l.m25394a(view).mo22503f(keyEvent);
    }

    /* renamed from: j0 */
    private static void m25320j0(int i, View view) {
        List<C5771c.C5772a> q = m25333q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (q.get(i2).mo22669b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: k */
    public static int m25321k() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f24349a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: k0 */
    public static void m25322k0(View view, C5771c.C5772a aVar, CharSequence charSequence, C5781f fVar) {
        if (fVar == null && charSequence == null) {
            m25318i0(view, aVar.mo22669b());
        } else {
            m25305c(view, aVar.mo22668a(charSequence, fVar));
        }
    }

    /* renamed from: l */
    public static C5682a m25323l(View view) {
        View.AccessibilityDelegate m = m25325m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C5682a.C5683a) {
            return ((C5682a.C5683a) m).f24296a;
        }
        return new C5682a(m);
    }

    /* renamed from: l0 */
    public static void m25324l0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m25325m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m25327n(view);
    }

    /* renamed from: m0 */
    public static void m25326m0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C5734j.m25392a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m25327n(View view) {
        if (f24357i) {
            return null;
        }
        if (f24356h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f24356h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f24357i = true;
                return null;
            }
        }
        try {
            Object obj = f24356h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f24357i = true;
            return null;
        }
    }

    /* renamed from: n0 */
    private static C5730g<Boolean> m25328n0() {
        return new C5725b(C6420d.f26382U, Boolean.class, 28);
    }

    /* renamed from: o */
    public static int m25329o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: o0 */
    public static void m25330o0(View view, C5682a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m25325m(view) instanceof C5682a.C5683a)) {
            aVar = new C5682a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo22379d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: p */
    public static CharSequence m25331p(View view) {
        return m25306c0().mo22498f(view);
    }

    /* renamed from: p0 */
    public static void m25332p0(View view, boolean z) {
        m25301a().mo22499g(view, Boolean.valueOf(z));
    }

    /* renamed from: q */
    private static List<C5771c.C5772a> m25333q(View view) {
        int i = C6420d.f26378P;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m25334q0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: r */
    private static int m25335r(View view, CharSequence charSequence) {
        List<C5771c.C5772a> q = m25333q(view);
        for (int i = 0; i < q.size(); i++) {
            if (TextUtils.equals(charSequence, q.get(i).mo22670c())) {
                return q.get(i).mo22669b();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f24359k;
            if (i2 >= iArr.length || i3 != -1) {
                return i3;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < q.size(); i5++) {
                z &= q.get(i5).mo22669b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: r0 */
    public static void m25336r0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: s */
    public static ColorStateList m25337s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C5722t) {
            return ((C5722t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m25338s0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C5722t) {
            ((C5722t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: t */
    public static PorterDuff.Mode m25339t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C5722t) {
            return ((C5722t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: t0 */
    public static void m25340t0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintMode(mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C5722t) {
            ((C5722t) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: u */
    public static Rect m25341u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m25342u0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: v */
    public static Display m25343v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m25293S(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m25344v0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: w */
    public static float m25345w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    @Deprecated
    /* renamed from: w0 */
    public static void m25346w0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: x */
    private static Rect m25347x() {
        if (f24358j == null) {
            f24358j = new ThreadLocal<>();
        }
        Rect rect = f24358j.get();
        if (rect == null) {
            rect = new Rect();
            f24358j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: x0 */
    public static void m25348x0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: y */
    public static boolean m25349y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: y0 */
    public static void m25350y0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: z */
    public static int m25351z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: z0 */
    public static void m25352z0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }
}
