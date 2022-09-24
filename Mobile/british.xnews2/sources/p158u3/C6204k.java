package p158u3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u3.k */
/* compiled from: MetadataBackendRegistry */
class C6204k implements C6196e {

    /* renamed from: a */
    private final C6205a f25561a;

    /* renamed from: b */
    private final C6202i f25562b;

    /* renamed from: c */
    private final Map<String, C6207m> f25563c;

    /* renamed from: u3.k$a */
    /* compiled from: MetadataBackendRegistry */
    static class C6205a {

        /* renamed from: a */
        private final Context f25564a;

        /* renamed from: b */
        private Map<String, String> f25565b = null;

        C6205a(Context context) {
            this.f25564a = context;
        }

        /* renamed from: a */
        private Map<String, String> m27168a(Context context) {
            Bundle d = m27170d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m27169c() {
            if (this.f25565b == null) {
                this.f25565b = m27168a(this.f25564a);
            }
            return this.f25565b;
        }

        /* renamed from: d */
        private static Bundle m27170d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6195d mo23634b(String str) {
            String str2 = m27169c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C6195d) Class.forName(str2).asSubclass(C6195d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            }
        }
    }

    C6204k(Context context, C6202i iVar) {
        this(new C6205a(context), iVar);
    }

    public synchronized C6207m get(String str) {
        if (this.f25563c.containsKey(str)) {
            return this.f25563c.get(str);
        }
        C6195d b = this.f25561a.mo23634b(str);
        if (b == null) {
            return null;
        }
        C6207m create = b.create(this.f25562b.mo23632a(str));
        this.f25563c.put(str, create);
        return create;
    }

    C6204k(C6205a aVar, C6202i iVar) {
        this.f25563c = new HashMap();
        this.f25561a = aVar;
        this.f25562b = iVar;
    }
}
