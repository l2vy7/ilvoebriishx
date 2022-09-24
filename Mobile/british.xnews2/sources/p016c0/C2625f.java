package p016c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p010b0.C1515c;
import p094j0.C5484f;
import p149t.C6090g;

/* renamed from: c0.f */
/* compiled from: TypefaceCompatApi24Impl */
class C2625f extends C2629j {

    /* renamed from: b */
    private static final Class<?> f10375b;

    /* renamed from: c */
    private static final Constructor<?> f10376c;

    /* renamed from: d */
    private static final Method f10377d;

    /* renamed from: e */
    private static final Method f10378e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f10376c = constructor;
        f10375b = cls;
        f10377d = method;
        f10378e = method2;
    }

    C2625f() {
    }

    /* renamed from: k */
    private static boolean m9157k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f10377d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m9158l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f10375b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10378e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m9159m() {
        Method method = f10377d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m9160n() {
        try {
            return f10376c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo9264b(Context context, C1515c.C1517b bVar, Resources resources, int i) {
        Object n = m9160n();
        if (n == null) {
            return null;
        }
        for (C1515c.C1518c cVar : bVar.mo7069a()) {
            ByteBuffer b = C2633k.m9208b(context, resources, cVar.mo7071b());
            if (b == null || !m9157k(n, b, cVar.mo7072c(), cVar.mo7074e(), cVar.mo7075f())) {
                return null;
            }
        }
        return m9158l(n);
    }

    /* renamed from: c */
    public Typeface mo9265c(Context context, CancellationSignal cancellationSignal, C5484f.C5486b[] bVarArr, int i) {
        Object n = m9160n();
        if (n == null) {
            return null;
        }
        C6090g gVar = new C6090g();
        for (C5484f.C5486b bVar : bVarArr) {
            Uri d = bVar.mo21958d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C2633k.m9212f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m9157k(n, byteBuffer, bVar.mo21957c(), bVar.mo21959e(), bVar.mo21960f())) {
                return null;
            }
        }
        Typeface l = m9158l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
