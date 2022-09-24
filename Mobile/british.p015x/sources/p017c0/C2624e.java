package p017c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b0.C1515c;
import p095j0.C5484f;

/* renamed from: c0.e */
/* compiled from: TypefaceCompatApi21Impl */
class C2624e extends C2629j {

    /* renamed from: b */
    private static Class<?> f10370b = null;

    /* renamed from: c */
    private static Constructor<?> f10371c = null;

    /* renamed from: d */
    private static Method f10372d = null;

    /* renamed from: e */
    private static Method f10373e = null;

    /* renamed from: f */
    private static boolean f10374f = false;

    C2624e() {
    }

    /* renamed from: k */
    private static boolean m9150k(Object obj, String str, int i, boolean z) {
        m9153n();
        try {
            return ((Boolean) f10372d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo9268l(Object obj) {
        m9153n();
        try {
            Object newInstance = Array.newInstance(f10370b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10373e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m9152m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m9153n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f10374f) {
            f10374f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f10371c = constructor;
            f10370b = cls;
            f10372d = method;
            f10373e = method2;
        }
    }

    /* renamed from: o */
    private static Object m9154o() {
        m9153n();
        try {
            return f10371c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo9264b(Context context, C1515c.C1517b bVar, Resources resources, int i) {
        Object o = m9154o();
        C1515c.C1518c[] a = bVar.mo7069a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C1515c.C1518c cVar = a[i2];
            File e = C2633k.m9211e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C2633k.m9209c(e, resources, cVar.mo7071b())) {
                    e.delete();
                    return null;
                } else if (!m9150k(o, e.getPath(), cVar.mo7074e(), cVar.mo7075f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo9268l(o);
    }

    /* renamed from: c */
    public Typeface mo9265c(Context context, CancellationSignal cancellationSignal, C5484f.C5486b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C5484f.C5486b h = mo9276h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo21958d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = m9152m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo9275d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
