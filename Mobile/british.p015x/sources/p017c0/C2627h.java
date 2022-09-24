package p017c0;

import android.graphics.Typeface;
import com.google.android.exoplayer2.C6540C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c0.h */
/* compiled from: TypefaceCompatApi28Impl */
public class C2627h extends C2626g {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo9268l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10379g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10385m.invoke((Object) null, new Object[]{newInstance, C6540C.SANS_SERIF_NAME, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo9272x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
