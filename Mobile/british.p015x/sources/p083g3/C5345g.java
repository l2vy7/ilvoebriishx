package p083g3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C3642m;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g3.g */
/* compiled from: InAppPurchaseActivityLifecycleTracker */
public class C5345g {

    /* renamed from: a */
    private static final String f23546a = "g3.g";

    /* renamed from: b */
    private static final AtomicBoolean f23547b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Boolean f23548c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Boolean f23549d = null;

    /* renamed from: e */
    private static ServiceConnection f23550e;

    /* renamed from: f */
    private static Application.ActivityLifecycleCallbacks f23551f;

    /* renamed from: g */
    private static Intent f23552g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Object f23553h;

    /* renamed from: g3.g$a */
    /* compiled from: InAppPurchaseActivityLifecycleTracker */
    static class C5346a implements ServiceConnection {
        C5346a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object unused = C5345g.f23553h = C5350h.m24066a(C3642m.m12279e(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: g3.g$b */
    /* compiled from: InAppPurchaseActivityLifecycleTracker */
    static class C5347b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: g3.g$b$a */
        /* compiled from: InAppPurchaseActivityLifecycleTracker */
        class C5348a implements Runnable {
            C5348a() {
            }

            public void run() {
                Context e = C3642m.m12279e();
                C5345g.m24063f(e, C5350h.m24074i(e, C5345g.f23553h), false);
                C5345g.m24063f(e, C5350h.m24075j(e, C5345g.f23553h), true);
            }
        }

        /* renamed from: g3.g$b$b */
        /* compiled from: InAppPurchaseActivityLifecycleTracker */
        class C5349b implements Runnable {
            C5349b() {
            }

            public void run() {
                Context e = C3642m.m12279e();
                ArrayList<String> i = C5350h.m24074i(e, C5345g.f23553h);
                if (i.isEmpty()) {
                    i = C5350h.m24072g(e, C5345g.f23553h);
                }
                C5345g.m24063f(e, i, false);
            }
        }

        C5347b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            try {
                C3642m.m12288n().execute(new C5348a());
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            try {
                if (C5345g.f23549d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    C3642m.m12288n().execute(new C5349b());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private static void m24062e() {
        if (f23548c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                Boolean bool = Boolean.TRUE;
                f23548c = bool;
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    f23549d = bool;
                } catch (ClassNotFoundException unused) {
                    f23549d = Boolean.FALSE;
                }
                C5350h.m24067b();
                f23552g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                f23550e = new C5346a();
                f23551f = new C5347b();
            } catch (ClassNotFoundException unused2) {
                f23548c = Boolean.FALSE;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m24063f(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(f23546a, "Error parsing in-app purchase data.", e);
                }
            }
            for (Map.Entry next2 : C5350h.m24076k(context, arrayList2, f23553h, z).entrySet()) {
                C5341d.m24054f((String) hashMap.get(next2.getKey()), (String) next2.getValue(), z);
            }
        }
    }

    /* renamed from: g */
    private static void m24064g() {
        if (f23547b.compareAndSet(false, true)) {
            Context e = C3642m.m12279e();
            if (e instanceof Application) {
                ((Application) e).registerActivityLifecycleCallbacks(f23551f);
                e.bindService(f23552g, f23550e, 1);
            }
        }
    }

    /* renamed from: h */
    public static void m24065h() {
        m24062e();
        if (f23548c.booleanValue() && C5341d.m24051c()) {
            m24064g();
        }
    }
}
