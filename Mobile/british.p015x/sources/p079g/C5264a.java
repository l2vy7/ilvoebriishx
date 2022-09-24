package p079g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0421v;
import androidx.core.content.C0600b;
import java.util.WeakHashMap;
import p010b0.C1513a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: g.a */
/* compiled from: AppCompatResources */
public final class C5264a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f23281a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C5265a>> f23282b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f23283c = new Object();

    /* renamed from: g.a$a */
    /* compiled from: AppCompatResources */
    private static class C5265a {

        /* renamed from: a */
        final ColorStateList f23284a;

        /* renamed from: b */
        final Configuration f23285b;

        C5265a(ColorStateList colorStateList, Configuration configuration) {
            this.f23284a = colorStateList;
            this.f23285b = configuration;
        }
    }

    /* renamed from: a */
    private static void m23786a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f23283c) {
            WeakHashMap<Context, SparseArray<C5265a>> weakHashMap = f23282b;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C5265a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m23787b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f23283c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<g.a$a>> r1 = f23282b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            g.a$a r2 = (p079g.C5264a.C5265a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f23285b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f23284a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p079g.C5264a.m23787b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m23788c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m23787b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m23791f(context, i);
        if (f == null) {
            return C0600b.m3293e(context, i);
        }
        m23786a(context, i, f);
        return f;
    }

    /* renamed from: d */
    public static Drawable m23789d(Context context, int i) {
        return C0421v.m2245h().mo2259j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m23790e() {
        ThreadLocal<TypedValue> threadLocal = f23281a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m23791f(Context context, int i) {
        if (m23792g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C1513a.m7836a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m23792g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m23790e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }
}
