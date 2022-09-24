package p010b0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p105l0.C5643c;
import p105l0.C5648h;

/* renamed from: b0.f */
/* compiled from: ResourcesCompat */
public final class C1523f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f6548a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C1525b, SparseArray<C1524a>> f6549b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f6550c = new Object();

    /* renamed from: b0.f$a */
    /* compiled from: ResourcesCompat */
    private static class C1524a {

        /* renamed from: a */
        final ColorStateList f6551a;

        /* renamed from: b */
        final Configuration f6552b;

        C1524a(ColorStateList colorStateList, Configuration configuration) {
            this.f6551a = colorStateList;
            this.f6552b = configuration;
        }
    }

    /* renamed from: b0.f$b */
    /* compiled from: ResourcesCompat */
    private static final class C1525b {

        /* renamed from: a */
        final Resources f6553a;

        /* renamed from: b */
        final Resources.Theme f6554b;

        C1525b(Resources resources, Resources.Theme theme) {
            this.f6553a = resources;
            this.f6554b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1525b.class != obj.getClass()) {
                return false;
            }
            C1525b bVar = (C1525b) obj;
            if (!this.f6553a.equals(bVar.f6553a) || !C5643c.m24954a(this.f6554b, bVar.f6554b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C5643c.m24955b(this.f6553a, this.f6554b);
        }
    }

    /* renamed from: b0.f$c */
    /* compiled from: ResourcesCompat */
    public static abstract class C1526c {

        /* renamed from: b0.f$c$a */
        /* compiled from: ResourcesCompat */
        class C1527a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Typeface f6555b;

            C1527a(Typeface typeface) {
                this.f6555b = typeface;
            }

            public void run() {
                C1526c.this.mo2207e(this.f6555b);
            }
        }

        /* renamed from: b0.f$c$b */
        /* compiled from: ResourcesCompat */
        class C1528b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f6557b;

            C1528b(int i) {
                this.f6557b = i;
            }

            public void run() {
                C1526c.this.mo2206d(this.f6557b);
            }
        }

        /* renamed from: c */
        public static Handler m7895c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void mo7082a(int i, Handler handler) {
            m7895c(handler).post(new C1528b(i));
        }

        /* renamed from: b */
        public final void mo7083b(Typeface typeface, Handler handler) {
            m7895c(handler).post(new C1527a(typeface));
        }

        /* renamed from: d */
        public abstract void mo2206d(int i);

        /* renamed from: e */
        public abstract void mo2207e(Typeface typeface);
    }

    /* renamed from: b0.f$d */
    /* compiled from: ResourcesCompat */
    public static final class C1529d {

        /* renamed from: b0.f$d$a */
        /* compiled from: ResourcesCompat */
        static class C1530a {

            /* renamed from: a */
            private static final Object f6559a = new Object();

            /* renamed from: b */
            private static Method f6560b;

            /* renamed from: c */
            private static boolean f6561c;

            /* renamed from: a */
            static void m7901a(Resources.Theme theme) {
                synchronized (f6559a) {
                    if (!f6561c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f6560b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f6561c = true;
                    }
                    Method method = f6560b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f6560b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: b0.f$d$b */
        /* compiled from: ResourcesCompat */
        static class C1531b {
            /* renamed from: a */
            static void m7902a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m7900a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C1531b.m7902a(theme);
            } else if (i >= 23) {
                C1530a.m7901a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m7882a(C1525b bVar, int i, ColorStateList colorStateList) {
        synchronized (f6550c) {
            WeakHashMap<C1525b, SparseArray<C1524a>> weakHashMap = f6549b;
            SparseArray sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i, new C1524a(colorStateList, bVar.f6553a.getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m7883b(p010b0.C1523f.C1525b r4, int r5) {
        /*
            java.lang.Object r0 = f6550c
            monitor-enter(r0)
            java.util.WeakHashMap<b0.f$b, android.util.SparseArray<b0.f$a>> r1 = f6549b     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0033 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0030
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 <= 0) goto L_0x0030
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0033 }
            b0.f$a r2 = (p010b0.C1523f.C1524a) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0030
            android.content.res.Configuration r3 = r2.f6552b     // Catch:{ all -> 0x0033 }
            android.content.res.Resources r4 = r4.f6553a     // Catch:{ all -> 0x0033 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0033 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002d
            android.content.res.ColorStateList r4 = r2.f6551a     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002d:
            r1.remove(r5)     // Catch:{ all -> 0x0033 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            r4 = 0
            return r4
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C1523f.m7883b(b0.f$b, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static Typeface m7884c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m7893l(context, i, new TypedValue(), 0, (C1526c) null, (Handler) null, false, true);
    }

    /* renamed from: d */
    public static ColorStateList m7885d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        C1525b bVar = new C1525b(resources, theme);
        ColorStateList b = m7883b(bVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList j = m7891j(resources, i, theme);
        if (j == null) {
            return resources.getColorStateList(i);
        }
        m7882a(bVar, i, j);
        return j;
    }

    /* renamed from: e */
    public static Drawable m7886e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: f */
    public static Typeface m7887f(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m7893l(context, i, new TypedValue(), 0, (C1526c) null, (Handler) null, false, false);
    }

    /* renamed from: g */
    public static Typeface m7888g(Context context, int i, TypedValue typedValue, int i2, C1526c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m7893l(context, i, typedValue, i2, cVar, (Handler) null, true, false);
    }

    /* renamed from: h */
    public static void m7889h(Context context, int i, C1526c cVar, Handler handler) throws Resources.NotFoundException {
        C5648h.m24964c(cVar);
        if (context.isRestricted()) {
            cVar.mo7082a(-4, handler);
            return;
        }
        m7893l(context, i, new TypedValue(), 0, cVar, handler, false, false);
    }

    /* renamed from: i */
    private static TypedValue m7890i() {
        ThreadLocal<TypedValue> threadLocal = f6548a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: j */
    private static ColorStateList m7891j(Resources resources, int i, Resources.Theme theme) {
        if (m7892k(resources, i)) {
            return null;
        }
        try {
            return C1513a.m7836a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: k */
    private static boolean m7892k(Resources resources, int i) {
        TypedValue i2 = m7890i();
        resources.getValue(i, i2, true);
        int i3 = i2.type;
        if (i3 < 28 || i3 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static Typeface m7893l(Context context, int i, TypedValue typedValue, int i2, C1526c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface m = m7894m(context, resources, typedValue, i, i2, cVar, handler, z, z2);
        if (m != null || cVar != null || z2) {
            return m;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m7894m(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p010b0.C1523f.C1526c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00aa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo7082a(r13, r10)
        L_0x0025:
            return r14
        L_0x0026:
            android.graphics.Typeface r1 = p017c0.C2622d.m9145f(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo7083b(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r1 == 0) goto L_0x0068
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            b0.c$a r2 = p010b0.C1515c.m7857b(r1, r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x0056
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0055
            r9.mo7082a(r13, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
        L_0x0055:
            return r14
        L_0x0056:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p017c0.C2622d.m9142c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            return r0
        L_0x0068:
            r1 = r15
            android.graphics.Typeface r0 = p017c0.C2622d.m9143d(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0075
            r9.mo7083b(r0, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            goto L_0x0078
        L_0x0075:
            r9.mo7082a(r13, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a4
        L_0x008f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a4:
            if (r9 == 0) goto L_0x00a9
            r9.mo7082a(r13, r10)
        L_0x00a9:
            return r14
        L_0x00aa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C1523f.m7894m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, b0.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
