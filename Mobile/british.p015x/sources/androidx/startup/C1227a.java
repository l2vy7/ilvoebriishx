package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p101k1.C5551a;
import p101k1.C5552b;
import p101k1.C5553c;
import p106l1.C5650a;

/* renamed from: androidx.startup.a */
/* compiled from: AppInitializer */
public final class C1227a {

    /* renamed from: d */
    private static volatile C1227a f5578d;

    /* renamed from: e */
    private static final Object f5579e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f5580a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends C5551a<?>>> f5581b = new HashSet();

    /* renamed from: c */
    final Context f5582c;

    C1227a(Context context) {
        this.f5582c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C1227a m6694c(Context context) {
        if (f5578d == null) {
            synchronized (f5579e) {
                if (f5578d == null) {
                    f5578d = new C1227a(context);
                }
            }
        }
        return f5578d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6037a() {
        try {
            C5650a.m24972a("Startup");
            Bundle bundle = this.f5582c.getPackageManager().getProviderInfo(new ComponentName(this.f5582c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
            String string = this.f5582c.getString(C5552b.androidx_startup);
            if (bundle != null) {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (C5551a.class.isAssignableFrom(cls)) {
                            this.f5581b.add(cls);
                            mo6038b(cls, hashSet);
                        }
                    }
                }
            }
            C5650a.m24973b();
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
            throw new C5553c(e);
        } catch (Throwable th) {
            C5650a.m24973b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> T mo6038b(Class<? extends C5551a<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (f5579e) {
            if (C5650a.m24975d()) {
                try {
                    C5650a.m24972a(cls.getSimpleName());
                } catch (Throwable th) {
                    C5650a.m24973b();
                    throw th;
                }
            }
            if (!set.contains(cls)) {
                if (!this.f5580a.containsKey(cls)) {
                    set.add(cls);
                    C5551a aVar = (C5551a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends C5551a<?>>> a = aVar.mo6838a();
                    if (!a.isEmpty()) {
                        for (Class next : a) {
                            if (!this.f5580a.containsKey(next)) {
                                mo6038b(next, set);
                            }
                        }
                    }
                    t = aVar.mo6839b(this.f5582c);
                    set.remove(cls);
                    this.f5580a.put(cls, t);
                } else {
                    t = this.f5580a.get(cls);
                }
                C5650a.m24973b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return t;
    }
}
