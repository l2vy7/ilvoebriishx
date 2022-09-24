package p110m0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p016c0.C2618b;
import p104l0.C5643c;
import p104l0.C5648h;

/* renamed from: m0.c0 */
/* compiled from: WindowInsetsCompat */
public class C5690c0 {

    /* renamed from: b */
    public static final C5690c0 f24298b;

    /* renamed from: a */
    private final C5702l f24299a;

    /* renamed from: m0.c0$a */
    /* compiled from: WindowInsetsCompat */
    static class C5691a {

        /* renamed from: a */
        private static Field f24300a;

        /* renamed from: b */
        private static Field f24301b;

        /* renamed from: c */
        private static Field f24302c;

        /* renamed from: d */
        private static boolean f24303d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f24300a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f24301b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f24302c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C5690c0 m25135a(View view) {
            if (f24303d && view.isAttachedToWindow()) {
                try {
                    Object obj = f24300a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f24301b.get(obj);
                        Rect rect2 = (Rect) f24302c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C5690c0 a = new C5692b().mo22424b(C2618b.m9122c(rect)).mo22425c(C2618b.m9122c(rect2)).mo22423a();
                            a.mo22420t(a);
                            a.mo22403d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: m0.c0$e */
    /* compiled from: WindowInsetsCompat */
    private static class C5695e extends C5694d {
        C5695e() {
        }

        C5695e(C5690c0 c0Var) {
            super(c0Var);
        }
    }

    /* renamed from: m0.c0$f */
    /* compiled from: WindowInsetsCompat */
    private static class C5696f {

        /* renamed from: a */
        private final C5690c0 f24312a;

        /* renamed from: b */
        C2618b[] f24313b;

        C5696f() {
            this(new C5690c0((C5690c0) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo22432a() {
            C2618b[] bVarArr = this.f24313b;
            if (bVarArr != null) {
                C2618b bVar = bVarArr[C5703m.m25203a(1)];
                C2618b bVar2 = this.f24313b[C5703m.m25203a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f24312a.mo22406f(2);
                }
                if (bVar == null) {
                    bVar = this.f24312a.mo22406f(1);
                }
                mo22428f(C2618b.m9120a(bVar, bVar2));
                C2618b bVar3 = this.f24313b[C5703m.m25203a(16)];
                if (bVar3 != null) {
                    mo22430e(bVar3);
                }
                C2618b bVar4 = this.f24313b[C5703m.m25203a(32)];
                if (bVar4 != null) {
                    mo22429c(bVar4);
                }
                C2618b bVar5 = this.f24313b[C5703m.m25203a(64)];
                if (bVar5 != null) {
                    mo22431g(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5690c0 mo22426b() {
            mo22432a();
            return this.f24312a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo22429c(C2618b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22427d(C2618b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo22430e(C2618b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo22428f(C2618b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22431g(C2618b bVar) {
        }

        C5696f(C5690c0 c0Var) {
            this.f24312a = c0Var;
        }
    }

    /* renamed from: m0.c0$i */
    /* compiled from: WindowInsetsCompat */
    private static class C5699i extends C5698h {
        C5699i(C5690c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5690c0 mo22449a() {
            return C5690c0.m25112w(this.f24320c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5699i)) {
                return false;
            }
            C5699i iVar = (C5699i) obj;
            if (!Objects.equals(this.f24320c, iVar.f24320c) || !Objects.equals(this.f24324g, iVar.f24324g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C5689c mo22450f() {
            return C5689c.m25106e(this.f24320c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f24320c.hashCode();
        }

        C5699i(C5690c0 c0Var, C5699i iVar) {
            super(c0Var, (C5698h) iVar);
        }
    }

    /* renamed from: m0.c0$k */
    /* compiled from: WindowInsetsCompat */
    private static class C5701k extends C5700j {

        /* renamed from: r */
        static final C5690c0 f24329r = C5690c0.m25112w(WindowInsets.CONSUMED);

        C5701k(C5690c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo22433d(View view) {
        }

        /* renamed from: g */
        public C2618b mo22436g(int i) {
            return C2618b.m9123d(this.f24320c.getInsets(C5704n.m25204a(i)));
        }

        C5701k(C5690c0 c0Var, C5701k kVar) {
            super(c0Var, (C5700j) kVar);
        }
    }

    /* renamed from: m0.c0$l */
    /* compiled from: WindowInsetsCompat */
    private static class C5702l {

        /* renamed from: b */
        static final C5690c0 f24330b = new C5692b().mo22423a().mo22400a().mo22401b().mo22402c();

        /* renamed from: a */
        final C5690c0 f24331a;

        C5702l(C5690c0 c0Var) {
            this.f24331a = c0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5690c0 mo22449a() {
            return this.f24331a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5690c0 mo22444b() {
            return this.f24331a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5690c0 mo22445c() {
            return this.f24331a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22433d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo22434e(C5690c0 c0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5702l)) {
                return false;
            }
            C5702l lVar = (C5702l) obj;
            if (mo22439o() != lVar.mo22439o() || mo22447n() != lVar.mo22447n() || !C5643c.m24954a(mo22437k(), lVar.mo22437k()) || !C5643c.m24954a(mo22446i(), lVar.mo22446i()) || !C5643c.m24954a(mo22450f(), lVar.mo22450f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C5689c mo22450f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C2618b mo22436g(int i) {
            return C2618b.f10358e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C2618b mo22452h() {
            return mo22437k();
        }

        public int hashCode() {
            return C5643c.m24955b(Boolean.valueOf(mo22439o()), Boolean.valueOf(mo22447n()), mo22437k(), mo22446i(), mo22450f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C2618b mo22446i() {
            return C2618b.f10358e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C2618b mo22453j() {
            return mo22437k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C2618b mo22437k() {
            return C2618b.f10358e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C2618b mo22454l() {
            return mo22437k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C5690c0 mo22438m(int i, int i2, int i3, int i4) {
            return f24330b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo22447n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo22439o() {
            return false;
        }

        /* renamed from: p */
        public void mo22440p(C2618b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo22441q(C2618b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo22442r(C5690c0 c0Var) {
        }

        /* renamed from: s */
        public void mo22448s(C2618b bVar) {
        }
    }

    /* renamed from: m0.c0$m */
    /* compiled from: WindowInsetsCompat */
    public static final class C5703m {
        /* renamed from: a */
        static int m25203a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    /* renamed from: m0.c0$n */
    /* compiled from: WindowInsetsCompat */
    private static final class C5704n {
        /* renamed from: a */
        static int m25204a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f24298b = C5701k.f24329r;
        } else {
            f24298b = C5702l.f24330b;
        }
    }

    private C5690c0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f24299a = new C5701k(this, windowInsets);
        } else if (i >= 29) {
            this.f24299a = new C5700j(this, windowInsets);
        } else if (i >= 28) {
            this.f24299a = new C5699i(this, windowInsets);
        } else if (i >= 21) {
            this.f24299a = new C5698h(this, windowInsets);
        } else if (i >= 20) {
            this.f24299a = new C5697g(this, windowInsets);
        } else {
            this.f24299a = new C5702l(this);
        }
    }

    /* renamed from: o */
    static C2618b m25111o(C2618b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f10359a - i);
        int max2 = Math.max(0, bVar.f10360b - i2);
        int max3 = Math.max(0, bVar.f10361c - i3);
        int max4 = Math.max(0, bVar.f10362d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return bVar;
        }
        return C2618b.m9121b(max, max2, max3, max4);
    }

    /* renamed from: w */
    public static C5690c0 m25112w(WindowInsets windowInsets) {
        return m25113x(windowInsets, (View) null);
    }

    /* renamed from: x */
    public static C5690c0 m25113x(WindowInsets windowInsets, View view) {
        C5690c0 c0Var = new C5690c0((WindowInsets) C5648h.m24964c(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0Var.mo22420t(C5723u.m25279I(view));
            c0Var.mo22403d(view.getRootView());
        }
        return c0Var;
    }

    @Deprecated
    /* renamed from: a */
    public C5690c0 mo22400a() {
        return this.f24299a.mo22449a();
    }

    @Deprecated
    /* renamed from: b */
    public C5690c0 mo22401b() {
        return this.f24299a.mo22444b();
    }

    @Deprecated
    /* renamed from: c */
    public C5690c0 mo22402c() {
        return this.f24299a.mo22445c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo22403d(View view) {
        this.f24299a.mo22433d(view);
    }

    /* renamed from: e */
    public C5689c mo22404e() {
        return this.f24299a.mo22450f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5690c0)) {
            return false;
        }
        return C5643c.m24954a(this.f24299a, ((C5690c0) obj).f24299a);
    }

    /* renamed from: f */
    public C2618b mo22406f(int i) {
        return this.f24299a.mo22436g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C2618b mo22407g() {
        return this.f24299a.mo22452h();
    }

    @Deprecated
    /* renamed from: h */
    public C2618b mo22408h() {
        return this.f24299a.mo22446i();
    }

    public int hashCode() {
        C5702l lVar = this.f24299a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo22410i() {
        return this.f24299a.mo22437k().f10362d;
    }

    @Deprecated
    /* renamed from: j */
    public int mo22411j() {
        return this.f24299a.mo22437k().f10359a;
    }

    @Deprecated
    /* renamed from: k */
    public int mo22412k() {
        return this.f24299a.mo22437k().f10361c;
    }

    @Deprecated
    /* renamed from: l */
    public int mo22413l() {
        return this.f24299a.mo22437k().f10360b;
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo22414m() {
        return !this.f24299a.mo22437k().equals(C2618b.f10358e);
    }

    /* renamed from: n */
    public C5690c0 mo22415n(int i, int i2, int i3, int i4) {
        return this.f24299a.mo22438m(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean mo22416p() {
        return this.f24299a.mo22447n();
    }

    @Deprecated
    /* renamed from: q */
    public C5690c0 mo22417q(int i, int i2, int i3, int i4) {
        return new C5692b(this).mo22425c(C2618b.m9121b(i, i2, i3, i4)).mo22423a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo22418r(C2618b[] bVarArr) {
        this.f24299a.mo22440p(bVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo22419s(C2618b bVar) {
        this.f24299a.mo22441q(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo22420t(C5690c0 c0Var) {
        this.f24299a.mo22442r(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo22421u(C2618b bVar) {
        this.f24299a.mo22448s(bVar);
    }

    /* renamed from: v */
    public WindowInsets mo22422v() {
        C5702l lVar = this.f24299a;
        if (lVar instanceof C5697g) {
            return ((C5697g) lVar).f24320c;
        }
        return null;
    }

    /* renamed from: m0.c0$c */
    /* compiled from: WindowInsetsCompat */
    private static class C5693c extends C5696f {

        /* renamed from: e */
        private static Field f24305e = null;

        /* renamed from: f */
        private static boolean f24306f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f24307g = null;

        /* renamed from: h */
        private static boolean f24308h = false;

        /* renamed from: c */
        private WindowInsets f24309c;

        /* renamed from: d */
        private C2618b f24310d;

        C5693c() {
            this.f24309c = m25139h();
        }

        /* renamed from: h */
        private static WindowInsets m25139h() {
            if (!f24306f) {
                try {
                    f24305e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f24306f = true;
            }
            Field field = f24305e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f24308h) {
                try {
                    f24307g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f24308h = true;
            }
            Constructor<WindowInsets> constructor = f24307g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5690c0 mo22426b() {
            mo22432a();
            C5690c0 w = C5690c0.m25112w(this.f24309c);
            w.mo22418r(this.f24313b);
            w.mo22421u(this.f24310d);
            return w;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22427d(C2618b bVar) {
            this.f24310d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo22428f(C2618b bVar) {
            WindowInsets windowInsets = this.f24309c;
            if (windowInsets != null) {
                this.f24309c = windowInsets.replaceSystemWindowInsets(bVar.f10359a, bVar.f10360b, bVar.f10361c, bVar.f10362d);
            }
        }

        C5693c(C5690c0 c0Var) {
            super(c0Var);
            this.f24309c = c0Var.mo22422v();
        }
    }

    /* renamed from: m0.c0$d */
    /* compiled from: WindowInsetsCompat */
    private static class C5694d extends C5696f {

        /* renamed from: c */
        final WindowInsets.Builder f24311c;

        C5694d() {
            this.f24311c = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5690c0 mo22426b() {
            mo22432a();
            C5690c0 w = C5690c0.m25112w(this.f24311c.build());
            w.mo22418r(this.f24313b);
            return w;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo22429c(C2618b bVar) {
            this.f24311c.setMandatorySystemGestureInsets(bVar.mo9257e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22427d(C2618b bVar) {
            this.f24311c.setStableInsets(bVar.mo9257e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo22430e(C2618b bVar) {
            this.f24311c.setSystemGestureInsets(bVar.mo9257e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo22428f(C2618b bVar) {
            this.f24311c.setSystemWindowInsets(bVar.mo9257e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22431g(C2618b bVar) {
            this.f24311c.setTappableElementInsets(bVar.mo9257e());
        }

        C5694d(C5690c0 c0Var) {
            super(c0Var);
            WindowInsets.Builder builder;
            WindowInsets v = c0Var.mo22422v();
            if (v != null) {
                builder = new WindowInsets.Builder(v);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f24311c = builder;
        }
    }

    /* renamed from: m0.c0$h */
    /* compiled from: WindowInsetsCompat */
    private static class C5698h extends C5697g {

        /* renamed from: n */
        private C2618b f24325n = null;

        C5698h(C5690c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5690c0 mo22444b() {
            return C5690c0.m25112w(this.f24320c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5690c0 mo22445c() {
            return C5690c0.m25112w(this.f24320c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final C2618b mo22446i() {
            if (this.f24325n == null) {
                this.f24325n = C2618b.m9121b(this.f24320c.getStableInsetLeft(), this.f24320c.getStableInsetTop(), this.f24320c.getStableInsetRight(), this.f24320c.getStableInsetBottom());
            }
            return this.f24325n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo22447n() {
            return this.f24320c.isConsumed();
        }

        /* renamed from: s */
        public void mo22448s(C2618b bVar) {
            this.f24325n = bVar;
        }

        C5698h(C5690c0 c0Var, C5698h hVar) {
            super(c0Var, (C5697g) hVar);
            this.f24325n = hVar.f24325n;
        }
    }

    /* renamed from: m0.c0$g */
    /* compiled from: WindowInsetsCompat */
    private static class C5697g extends C5702l {

        /* renamed from: h */
        private static boolean f24314h = false;

        /* renamed from: i */
        private static Method f24315i;

        /* renamed from: j */
        private static Class<?> f24316j;

        /* renamed from: k */
        private static Class<?> f24317k;

        /* renamed from: l */
        private static Field f24318l;

        /* renamed from: m */
        private static Field f24319m;

        /* renamed from: c */
        final WindowInsets f24320c;

        /* renamed from: d */
        private C2618b[] f24321d;

        /* renamed from: e */
        private C2618b f24322e;

        /* renamed from: f */
        private C5690c0 f24323f;

        /* renamed from: g */
        C2618b f24324g;

        C5697g(C5690c0 c0Var, WindowInsets windowInsets) {
            super(c0Var);
            this.f24322e = null;
            this.f24320c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C2618b m25156t(int i, boolean z) {
            C2618b bVar = C2618b.f10358e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C2618b.m9120a(bVar, mo22443u(i2, z));
                }
            }
            return bVar;
        }

        /* renamed from: v */
        private C2618b m25157v() {
            C5690c0 c0Var = this.f24323f;
            if (c0Var != null) {
                return c0Var.mo22408h();
            }
            return C2618b.f10358e;
        }

        /* renamed from: w */
        private C2618b m25158w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f24314h) {
                    m25159x();
                }
                Method method = f24315i;
                if (!(method == null || f24317k == null || f24318l == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f24318l.get(f24319m.get(invoke));
                        if (rect != null) {
                            return C2618b.m9122c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m25159x() {
            try {
                f24315i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f24316j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f24317k = cls;
                f24318l = cls.getDeclaredField("mVisibleInsets");
                f24319m = f24316j.getDeclaredField("mAttachInfo");
                f24318l.setAccessible(true);
                f24319m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f24314h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22433d(View view) {
            C2618b w = m25158w(view);
            if (w == null) {
                w = C2618b.f10358e;
            }
            mo22441q(w);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo22434e(C5690c0 c0Var) {
            c0Var.mo22420t(this.f24323f);
            c0Var.mo22419s(this.f24324g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f24324g, ((C5697g) obj).f24324g);
        }

        /* renamed from: g */
        public C2618b mo22436g(int i) {
            return m25156t(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final C2618b mo22437k() {
            if (this.f24322e == null) {
                this.f24322e = C2618b.m9121b(this.f24320c.getSystemWindowInsetLeft(), this.f24320c.getSystemWindowInsetTop(), this.f24320c.getSystemWindowInsetRight(), this.f24320c.getSystemWindowInsetBottom());
            }
            return this.f24322e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C5690c0 mo22438m(int i, int i2, int i3, int i4) {
            C5692b bVar = new C5692b(C5690c0.m25112w(this.f24320c));
            bVar.mo22425c(C5690c0.m25111o(mo22437k(), i, i2, i3, i4));
            bVar.mo22424b(C5690c0.m25111o(mo22446i(), i, i2, i3, i4));
            return bVar.mo22423a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo22439o() {
            return this.f24320c.isRound();
        }

        /* renamed from: p */
        public void mo22440p(C2618b[] bVarArr) {
            this.f24321d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo22441q(C2618b bVar) {
            this.f24324g = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo22442r(C5690c0 c0Var) {
            this.f24323f = c0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public C2618b mo22443u(int i, boolean z) {
            int i2;
            C5689c cVar;
            if (i != 1) {
                C2618b bVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C2618b[] bVarArr = this.f24321d;
                        if (bVarArr != null) {
                            bVar = bVarArr[C5703m.m25203a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        C2618b k = mo22437k();
                        C2618b v = m25157v();
                        int i3 = k.f10362d;
                        if (i3 > v.f10362d) {
                            return C2618b.m9121b(0, 0, 0, i3);
                        }
                        C2618b bVar2 = this.f24324g;
                        if (bVar2 == null || bVar2.equals(C2618b.f10358e) || (i2 = this.f24324g.f10362d) <= v.f10362d) {
                            return C2618b.f10358e;
                        }
                        return C2618b.m9121b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo22453j();
                    } else {
                        if (i == 32) {
                            return mo22452h();
                        }
                        if (i == 64) {
                            return mo22454l();
                        }
                        if (i != 128) {
                            return C2618b.f10358e;
                        }
                        C5690c0 c0Var = this.f24323f;
                        if (c0Var != null) {
                            cVar = c0Var.mo22404e();
                        } else {
                            cVar = mo22450f();
                        }
                        if (cVar != null) {
                            return C2618b.m9121b(cVar.mo22394b(), cVar.mo22396d(), cVar.mo22395c(), cVar.mo22393a());
                        }
                        return C2618b.f10358e;
                    }
                } else if (z) {
                    C2618b v2 = m25157v();
                    C2618b i4 = mo22446i();
                    return C2618b.m9121b(Math.max(v2.f10359a, i4.f10359a), 0, Math.max(v2.f10361c, i4.f10361c), Math.max(v2.f10362d, i4.f10362d));
                } else {
                    C2618b k2 = mo22437k();
                    C5690c0 c0Var2 = this.f24323f;
                    if (c0Var2 != null) {
                        bVar = c0Var2.mo22408h();
                    }
                    int i5 = k2.f10362d;
                    if (bVar != null) {
                        i5 = Math.min(i5, bVar.f10362d);
                    }
                    return C2618b.m9121b(k2.f10359a, 0, k2.f10361c, i5);
                }
            } else if (z) {
                return C2618b.m9121b(0, Math.max(m25157v().f10360b, mo22437k().f10360b), 0, 0);
            } else {
                return C2618b.m9121b(0, mo22437k().f10360b, 0, 0);
            }
        }

        C5697g(C5690c0 c0Var, C5697g gVar) {
            this(c0Var, new WindowInsets(gVar.f24320c));
        }
    }

    /* renamed from: m0.c0$j */
    /* compiled from: WindowInsetsCompat */
    private static class C5700j extends C5699i {

        /* renamed from: o */
        private C2618b f24326o = null;

        /* renamed from: p */
        private C2618b f24327p = null;

        /* renamed from: q */
        private C2618b f24328q = null;

        C5700j(C5690c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C2618b mo22452h() {
            if (this.f24327p == null) {
                this.f24327p = C2618b.m9123d(this.f24320c.getMandatorySystemGestureInsets());
            }
            return this.f24327p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C2618b mo22453j() {
            if (this.f24326o == null) {
                this.f24326o = C2618b.m9123d(this.f24320c.getSystemGestureInsets());
            }
            return this.f24326o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C2618b mo22454l() {
            if (this.f24328q == null) {
                this.f24328q = C2618b.m9123d(this.f24320c.getTappableElementInsets());
            }
            return this.f24328q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C5690c0 mo22438m(int i, int i2, int i3, int i4) {
            return C5690c0.m25112w(this.f24320c.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo22448s(C2618b bVar) {
        }

        C5700j(C5690c0 c0Var, C5700j jVar) {
            super(c0Var, (C5699i) jVar);
        }
    }

    /* renamed from: m0.c0$b */
    /* compiled from: WindowInsetsCompat */
    public static final class C5692b {

        /* renamed from: a */
        private final C5696f f24304a;

        public C5692b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f24304a = new C5695e();
            } else if (i >= 29) {
                this.f24304a = new C5694d();
            } else if (i >= 20) {
                this.f24304a = new C5693c();
            } else {
                this.f24304a = new C5696f();
            }
        }

        /* renamed from: a */
        public C5690c0 mo22423a() {
            return this.f24304a.mo22426b();
        }

        @Deprecated
        /* renamed from: b */
        public C5692b mo22424b(C2618b bVar) {
            this.f24304a.mo22427d(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C5692b mo22425c(C2618b bVar) {
            this.f24304a.mo22428f(bVar);
            return this;
        }

        public C5692b(C5690c0 c0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f24304a = new C5695e(c0Var);
            } else if (i >= 29) {
                this.f24304a = new C5694d(c0Var);
            } else if (i >= 20) {
                this.f24304a = new C5693c(c0Var);
            } else {
                this.f24304a = new C5696f(c0Var);
            }
        }
    }

    public C5690c0(C5690c0 c0Var) {
        if (c0Var != null) {
            C5702l lVar = c0Var.f24299a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C5701k)) {
                this.f24299a = new C5701k(this, (C5701k) lVar);
            } else if (i >= 29 && (lVar instanceof C5700j)) {
                this.f24299a = new C5700j(this, (C5700j) lVar);
            } else if (i >= 28 && (lVar instanceof C5699i)) {
                this.f24299a = new C5699i(this, (C5699i) lVar);
            } else if (i >= 21 && (lVar instanceof C5698h)) {
                this.f24299a = new C5698h(this, (C5698h) lVar);
            } else if (i < 20 || !(lVar instanceof C5697g)) {
                this.f24299a = new C5702l(this);
            } else {
                this.f24299a = new C5697g(this, (C5697g) lVar);
            }
            lVar.mo22434e(this);
            return;
        }
        this.f24299a = new C5702l(this);
    }
}
