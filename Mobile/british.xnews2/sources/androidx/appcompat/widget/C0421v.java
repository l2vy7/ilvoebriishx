package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0600b;
import androidx.vectordrawable.graphics.drawable.C1345c;
import androidx.vectordrawable.graphics.drawable.C1355i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p062d0.C5135a;
import p083h.C5354a;
import p088i.C5418a;
import p149t.C6082d;
import p149t.C6083e;
import p149t.C6090g;
import p149t.C6091h;

/* renamed from: androidx.appcompat.widget.v */
/* compiled from: ResourceManagerInternal */
public final class C0421v {

    /* renamed from: h */
    private static final PorterDuff.Mode f1691h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0421v f1692i;

    /* renamed from: j */
    private static final C0424c f1693j = new C0424c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C6091h<ColorStateList>> f1694a;

    /* renamed from: b */
    private C6090g<String, C0426e> f1695b;

    /* renamed from: c */
    private C6091h<String> f1696c;

    /* renamed from: d */
    private final WeakHashMap<Context, C6082d<WeakReference<Drawable.ConstantState>>> f1697d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1698e;

    /* renamed from: f */
    private boolean f1699f;

    /* renamed from: g */
    private C0427f f1700g;

    /* renamed from: androidx.appcompat.widget.v$a */
    /* compiled from: ResourceManagerInternal */
    static class C0422a implements C0426e {
        C0422a() {
        }

        /* renamed from: a */
        public Drawable mo2267a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5354a.m24102m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$b */
    /* compiled from: ResourceManagerInternal */
    private static class C0423b implements C0426e {
        C0423b() {
        }

        /* renamed from: a */
        public Drawable mo2267a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1345c.m7160a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$c */
    /* compiled from: ResourceManagerInternal */
    private static class C0424c extends C6083e<Integer, PorterDuffColorFilter> {
        public C0424c(int i) {
            super(i);
        }

        /* renamed from: j */
        private static int m2264j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public PorterDuffColorFilter mo2268k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo23310c(Integer.valueOf(m2264j(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public PorterDuffColorFilter mo2269l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo23311d(Integer.valueOf(m2264j(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.v$d */
    /* compiled from: ResourceManagerInternal */
    static class C0425d implements C0426e {
        C0425d() {
        }

        /* renamed from: a */
        public Drawable mo2267a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0425d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$e */
    /* compiled from: ResourceManagerInternal */
    private interface C0426e {
        /* renamed from: a */
        Drawable mo2267a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.v$f */
    /* compiled from: ResourceManagerInternal */
    interface C0427f {
        /* renamed from: a */
        boolean mo2090a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo2091b(int i);

        /* renamed from: c */
        Drawable mo2092c(C0421v vVar, Context context, int i);

        /* renamed from: d */
        ColorStateList mo2093d(Context context, int i);

        /* renamed from: e */
        boolean mo2094e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.v$g */
    /* compiled from: ResourceManagerInternal */
    private static class C0428g implements C0426e {
        C0428g() {
        }

        /* renamed from: a */
        public Drawable mo2267a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1355i.m7193c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m2238a(String str, C0426e eVar) {
        if (this.f1695b == null) {
            this.f1695b = new C6090g<>();
        }
        this.f1695b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m2239b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C6082d dVar = this.f1697d.get(context);
        if (dVar == null) {
            dVar = new C6082d();
            this.f1697d.put(context, dVar);
        }
        dVar.mo23302l(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    private void m2240c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1694a == null) {
            this.f1694a = new WeakHashMap<>();
        }
        C6091h hVar = this.f1694a.get(context);
        if (hVar == null) {
            hVar = new C6091h();
            this.f1694a.put(context, hVar);
        }
        hVar.mo23399a(i, colorStateList);
    }

    /* renamed from: d */
    private void m2241d(Context context) {
        if (!this.f1699f) {
            this.f1699f = true;
            Drawable j = mo2259j(context, C5418a.f23748a);
            if (j == null || !m2250q(j)) {
                this.f1699f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m2242e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m2243f(Context context, int i) {
        Drawable drawable;
        if (this.f1698e == null) {
            this.f1698e = new TypedValue();
        }
        TypedValue typedValue = this.f1698e;
        context.getResources().getValue(i, typedValue, true);
        long e = m2242e(typedValue);
        Drawable i2 = m2246i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0427f fVar = this.f1700g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo2092c(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m2239b(context, e, drawable);
        }
        return drawable;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m2244g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2247l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0421v m2245h() {
        C0421v vVar;
        synchronized (C0421v.class) {
            if (f1692i == null) {
                C0421v vVar2 = new C0421v();
                f1692i = vVar2;
                m2249p(vVar2);
            }
            vVar = f1692i;
        }
        return vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m2246i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, t.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1697d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            t.d r0 = (p149t.C6082d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo23298g(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo23303m(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0421v.m2246i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m2247l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (C0421v.class) {
            C0424c cVar = f1693j;
            k = cVar.mo2268k(i, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i, mode);
                cVar.mo2269l(i, mode, k);
            }
        }
        return k;
    }

    /* renamed from: n */
    private ColorStateList m2248n(Context context, int i) {
        C6091h hVar;
        WeakHashMap<Context, C6091h<ColorStateList>> weakHashMap = this.f1694a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo23403g(i);
    }

    /* renamed from: p */
    private static void m2249p(C0421v vVar) {
        if (Build.VERSION.SDK_INT < 24) {
            vVar.m2238a("vector", new C0428g());
            vVar.m2238a("animated-vector", new C0423b());
            vVar.m2238a("animated-selector", new C0422a());
            vVar.m2238a("drawable", new C0425d());
        }
    }

    /* renamed from: q */
    private static boolean m2250q(Drawable drawable) {
        return (drawable instanceof C1355i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2251r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            t.g<java.lang.String, androidx.appcompat.widget.v$e> r0 = r10.f1695b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            t.h<java.lang.String> r0 = r10.f1696c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo23403g(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            t.g<java.lang.String, androidx.appcompat.widget.v$e> r3 = r10.f1695b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            t.h r0 = new t.h
            r0.<init>()
            r10.f1696c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1698e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1698e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1698e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m2242e(r0)
            android.graphics.drawable.Drawable r6 = r10.m2246i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            t.h<java.lang.String> r8 = r10.f1696c     // Catch:{ Exception -> 0x00a2 }
            r8.mo23399a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            t.g<java.lang.String, androidx.appcompat.widget.v$e> r8 = r10.f1695b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.v$e r3 = (androidx.appcompat.widget.C0421v.C0426e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2267a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m2239b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            t.h<java.lang.String> r11 = r10.f1696c
            r11.mo23399a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0421v.m2251r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m2252v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo2261m(context, i);
        if (m != null) {
            if (C0409p.m2197a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C5135a.m23418r(drawable);
            C5135a.m23415o(r, m);
            PorterDuff.Mode o = mo2262o(i);
            if (o == null) {
                return r;
            }
            C5135a.m23416p(r, o);
            return r;
        }
        C0427f fVar = this.f1700g;
        if ((fVar == null || !fVar.mo2094e(context, i, drawable)) && !mo2266x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m2253w(Drawable drawable, C0379d0 d0Var, int[] iArr) {
        if (!C0409p.m2197a(drawable) || drawable.mutate() == drawable) {
            boolean z = d0Var.f1543d;
            if (z || d0Var.f1542c) {
                drawable.setColorFilter(m2244g(z ? d0Var.f1540a : null, d0Var.f1542c ? d0Var.f1541b : f1691h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable mo2259j(Context context, int i) {
        return mo2260k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo2260k(Context context, int i, boolean z) {
        Drawable r;
        m2241d(context);
        r = m2251r(context, i);
        if (r == null) {
            r = m2243f(context, i);
        }
        if (r == null) {
            r = C0600b.m3294f(context, i);
        }
        if (r != null) {
            r = m2252v(context, i, z, r);
        }
        if (r != null) {
            C0409p.m2198b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo2261m(Context context, int i) {
        ColorStateList n;
        n = m2248n(context, i);
        if (n == null) {
            C0427f fVar = this.f1700g;
            n = fVar == null ? null : fVar.mo2093d(context, i);
            if (n != null) {
                m2240c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo2262o(int i) {
        C0427f fVar = this.f1700g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo2091b(i);
    }

    /* renamed from: s */
    public synchronized void mo2263s(Context context) {
        C6082d dVar = this.f1697d.get(context);
        if (dVar != null) {
            dVar.mo23295b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo2264t(Context context, C0398k0 k0Var, int i) {
        Drawable r = m2251r(context, i);
        if (r == null) {
            r = k0Var.mo2182c(i);
        }
        if (r == null) {
            return null;
        }
        return m2252v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo2265u(C0427f fVar) {
        this.f1700g = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2266x(Context context, int i, Drawable drawable) {
        C0427f fVar = this.f1700g;
        return fVar != null && fVar.mo2090a(context, i, drawable);
    }
}
