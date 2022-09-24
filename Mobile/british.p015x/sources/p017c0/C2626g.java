package p017c0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p010b0.C1515c;
import p095j0.C5484f;

/* renamed from: c0.g */
/* compiled from: TypefaceCompatApi26Impl */
public class C2626g extends C2624e {

    /* renamed from: g */
    protected final Class<?> f10379g;

    /* renamed from: h */
    protected final Constructor<?> f10380h;

    /* renamed from: i */
    protected final Method f10381i;

    /* renamed from: j */
    protected final Method f10382j;

    /* renamed from: k */
    protected final Method f10383k;

    /* renamed from: l */
    protected final Method f10384l;

    /* renamed from: m */
    protected final Method f10385m;

    public C2626g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo9273y();
            constructor = mo9274z(y);
            method4 = mo9270v(y);
            method3 = mo9271w(y);
            method2 = mo9266A(y);
            method = mo9269u(y);
            Class<?> cls2 = y;
            method5 = mo9272x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f10379g = cls;
        this.f10380h = constructor;
        this.f10381i = method4;
        this.f10382j = method3;
        this.f10383k = method2;
        this.f10384l = method;
        this.f10385m = method5;
    }

    /* renamed from: o */
    private Object m9163o() {
        try {
            return this.f10380h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m9164p(Object obj) {
        try {
            this.f10384l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m9165q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10381i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m9166r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f10382j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m9167s(Object obj) {
        try {
            return ((Boolean) this.f10383k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m9168t() {
        if (this.f10381i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f10381i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo9266A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo9264b(Context context, C1515c.C1517b bVar, Resources resources, int i) {
        if (!m9168t()) {
            return super.mo9264b(context, bVar, resources, i);
        }
        Object o = m9163o();
        if (o == null) {
            return null;
        }
        for (C1515c.C1518c cVar : bVar.mo7069a()) {
            if (!m9165q(context, o, cVar.mo7070a(), cVar.mo7072c(), cVar.mo7074e(), cVar.mo7075f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo7073d()))) {
                m9164p(o);
                return null;
            }
        }
        if (!m9167s(o)) {
            return null;
        }
        return mo9268l(o);
    }

    /* renamed from: c */
    public Typeface mo9265c(Context context, CancellationSignal cancellationSignal, C5484f.C5486b[] bVarArr, int i) {
        Typeface l;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m9168t()) {
            C5484f.C5486b h = mo9276h(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo21958d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo21959e()).setItalic(h.mo21960f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h2 = C2633k.m9214h(context, bVarArr, cancellationSignal);
            Object o = m9163o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C5484f.C5486b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.mo21958d());
                if (byteBuffer != null) {
                    if (!m9166r(o, byteBuffer, bVar.mo21957c(), bVar.mo21959e(), bVar.mo21960f() ? 1 : 0)) {
                        m9164p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m9164p(o);
                return null;
            } else if (m9167s(o) && (l = mo9268l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo9267e(Context context, Resources resources, int i, String str, int i2) {
        if (!m9168t()) {
            return super.mo9267e(context, resources, i, str, i2);
        }
        Object o = m9163o();
        if (o == null) {
            return null;
        }
        if (!m9165q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m9164p(o);
            return null;
        } else if (!m9167s(o)) {
            return null;
        } else {
            return mo9268l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo9268l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10379g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10385m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo9269u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo9270v(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo9271w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo9272x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo9273y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo9274z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
