package p267y6;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p215h7.C10581b;

/* renamed from: y6.g */
/* compiled from: ComponentDiscovery */
public final class C11120g<T> {

    /* renamed from: a */
    private final T f50103a;

    /* renamed from: b */
    private final C11123c<T> f50104b;

    /* renamed from: y6.g$b */
    /* compiled from: ComponentDiscovery */
    private static class C11122b implements C11123c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f50105a;

        /* renamed from: b */
        private Bundle m49656b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f50105a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f50105a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo43408a(Context context) {
            Bundle b = m49656b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C11122b(Class<? extends Service> cls) {
            this.f50105a = cls;
        }
    }

    /* renamed from: y6.g$c */
    /* compiled from: ComponentDiscovery */
    interface C11123c<T> {
        /* renamed from: a */
        List<String> mo43408a(T t);
    }

    C11120g(T t, C11123c<T> cVar) {
        this.f50103a = t;
        this.f50104b = cVar;
    }

    /* renamed from: c */
    public static C11120g<Context> m49652c(Context context, Class<? extends Service> cls) {
        return new C11120g<>(context, new C11122b(cls));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C11125i m49653d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (C11125i.class.isAssignableFrom(cls)) {
                return (C11125i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C11137v(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new C11137v(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new C11137v(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new C11137v(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new C11137v(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: b */
    public List<C10581b<C11125i>> mo43407b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f50104b.mo43408a(this.f50103a)) {
            arrayList.add(new C12964f(fVar));
        }
        return arrayList;
    }
}
