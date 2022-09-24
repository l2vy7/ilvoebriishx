package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9511f2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.vision.u2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
abstract class C9634u2<T extends C9511f2> {

    /* renamed from: a */
    private static final Logger f45888a = Logger.getLogger(C9482c2.class.getName());

    /* renamed from: b */
    private static String f45889b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C9634u2() {
    }

    /* renamed from: a */
    static <T extends C9511f2> T m44598a(Class<T> cls) {
        String str;
        Class<C9634u2> cls2 = C9634u2.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C9511f2.class)) {
            str = f45889b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C9511f2) cls.cast(((C9634u2) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo38591b());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C9634u2) it.next()).mo38591b()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f45888a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C9511f2) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C9511f2) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo38591b();
}
