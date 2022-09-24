package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p149t.C6090g;

/* renamed from: androidx.fragment.app.g */
/* compiled from: FragmentFactory */
public class C0706g {

    /* renamed from: a */
    private static final C6090g<String, Class<?>> f3615a = new C6090g<>();

    /* renamed from: b */
    static boolean m3988b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3989c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m3989c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C6090g<String, Class<?>> gVar = f3615a;
        Class<?> cls = gVar.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m3990d(ClassLoader classLoader, String str) {
        try {
            return m3989c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0646f("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0646f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3627a(ClassLoader classLoader, String str) {
        throw null;
    }
}
