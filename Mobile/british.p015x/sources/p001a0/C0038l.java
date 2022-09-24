package p001a0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p016c.C2614a;

/* renamed from: a0.l */
/* compiled from: NotificationManagerCompat */
public final class C0038l {

    /* renamed from: c */
    private static final Object f121c = new Object();

    /* renamed from: d */
    private static String f122d;

    /* renamed from: e */
    private static Set<String> f123e = new HashSet();

    /* renamed from: f */
    private static final Object f124f = new Object();

    /* renamed from: g */
    private static C0042d f125g;

    /* renamed from: a */
    private final Context f126a;

    /* renamed from: b */
    private final NotificationManager f127b;

    /* renamed from: a0.l$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0039a implements C0044e {

        /* renamed from: a */
        final String f128a;

        /* renamed from: b */
        final int f129b;

        /* renamed from: c */
        final String f130c;

        /* renamed from: d */
        final boolean f131d = false;

        C0039a(String str, int i, String str2) {
            this.f128a = str;
            this.f129b = i;
            this.f130c = str2;
        }

        /* renamed from: a */
        public void mo108a(C2614a aVar) throws RemoteException {
            if (this.f131d) {
                aVar.mo3098Y1(this.f128a);
            } else {
                aVar.mo3097V3(this.f128a, this.f129b, this.f130c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f128a + ", id:" + this.f129b + ", tag:" + this.f130c + ", all:" + this.f131d + "]";
        }
    }

    /* renamed from: a0.l$b */
    /* compiled from: NotificationManagerCompat */
    private static class C0040b implements C0044e {

        /* renamed from: a */
        final String f132a;

        /* renamed from: b */
        final int f133b;

        /* renamed from: c */
        final String f134c;

        /* renamed from: d */
        final Notification f135d;

        C0040b(String str, int i, String str2, Notification notification) {
            this.f132a = str;
            this.f133b = i;
            this.f134c = str2;
            this.f135d = notification;
        }

        /* renamed from: a */
        public void mo108a(C2614a aVar) throws RemoteException {
            aVar.mo3096L5(this.f132a, this.f133b, this.f134c, this.f135d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f132a + ", id:" + this.f133b + ", tag:" + this.f134c + "]";
        }
    }

    /* renamed from: a0.l$c */
    /* compiled from: NotificationManagerCompat */
    private static class C0041c {

        /* renamed from: a */
        final ComponentName f136a;

        /* renamed from: b */
        final IBinder f137b;

        C0041c(ComponentName componentName, IBinder iBinder) {
            this.f136a = componentName;
            this.f137b = iBinder;
        }
    }

    /* renamed from: a0.l$d */
    /* compiled from: NotificationManagerCompat */
    private static class C0042d implements Handler.Callback, ServiceConnection {

        /* renamed from: b */
        private final Context f138b;

        /* renamed from: c */
        private final HandlerThread f139c;

        /* renamed from: d */
        private final Handler f140d;

        /* renamed from: e */
        private final Map<ComponentName, C0043a> f141e = new HashMap();

        /* renamed from: f */
        private Set<String> f142f = new HashSet();

        /* renamed from: a0.l$d$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0043a {

            /* renamed from: a */
            final ComponentName f143a;

            /* renamed from: b */
            boolean f144b = false;

            /* renamed from: c */
            C2614a f145c;

            /* renamed from: d */
            ArrayDeque<C0044e> f146d = new ArrayDeque<>();

            /* renamed from: e */
            int f147e = 0;

            C0043a(ComponentName componentName) {
                this.f143a = componentName;
            }
        }

        C0042d(Context context) {
            this.f138b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f139c = handlerThread;
            handlerThread.start();
            this.f140d = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m160a(C0043a aVar) {
            if (aVar.f144b) {
                return true;
            }
            boolean bindService = this.f138b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f143a), this, 33);
            aVar.f144b = bindService;
            if (bindService) {
                aVar.f147e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f143a);
                this.f138b.unbindService(this);
            }
            return aVar.f144b;
        }

        /* renamed from: b */
        private void m161b(C0043a aVar) {
            if (aVar.f144b) {
                this.f138b.unbindService(this);
                aVar.f144b = false;
            }
            aVar.f145c = null;
        }

        /* renamed from: c */
        private void m162c(C0044e eVar) {
            m168j();
            for (C0043a next : this.f141e.values()) {
                next.f146d.add(eVar);
                m166g(next);
            }
        }

        /* renamed from: d */
        private void m163d(ComponentName componentName) {
            C0043a aVar = this.f141e.get(componentName);
            if (aVar != null) {
                m166g(aVar);
            }
        }

        /* renamed from: e */
        private void m164e(ComponentName componentName, IBinder iBinder) {
            C0043a aVar = this.f141e.get(componentName);
            if (aVar != null) {
                aVar.f145c = C2614a.C2615a.m9103x(iBinder);
                aVar.f147e = 0;
                m166g(aVar);
            }
        }

        /* renamed from: f */
        private void m165f(ComponentName componentName) {
            C0043a aVar = this.f141e.get(componentName);
            if (aVar != null) {
                m161b(aVar);
            }
        }

        /* renamed from: g */
        private void m166g(C0043a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f143a + ", " + aVar.f146d.size() + " queued tasks");
            }
            if (!aVar.f146d.isEmpty()) {
                if (!m160a(aVar) || aVar.f145c == null) {
                    m167i(aVar);
                    return;
                }
                while (true) {
                    C0044e peek = aVar.f146d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo108a(aVar.f145c);
                        aVar.f146d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f143a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f143a, e);
                    }
                }
                if (!aVar.f146d.isEmpty()) {
                    m167i(aVar);
                }
            }
        }

        /* renamed from: i */
        private void m167i(C0043a aVar) {
            if (!this.f140d.hasMessages(3, aVar.f143a)) {
                int i = aVar.f147e + 1;
                aVar.f147e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f146d.size() + " tasks to " + aVar.f143a + " after " + aVar.f147e + " retries");
                    aVar.f146d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f140d.sendMessageDelayed(this.f140d.obtainMessage(3, aVar.f143a), (long) i2);
            }
        }

        /* renamed from: j */
        private void m168j() {
            Set<String> e = C0038l.m150e(this.f138b);
            if (!e.equals(this.f142f)) {
                this.f142f = e;
                List<ResolveInfo> queryIntentServices = this.f138b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (e.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f141e.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f141e.put(componentName2, new C0043a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0043a>> it = this.f141e.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m161b((C0043a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo111h(C0044e eVar) {
            this.f140d.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m162c((C0044e) message.obj);
                return true;
            } else if (i == 1) {
                C0041c cVar = (C0041c) message.obj;
                m164e(cVar.f136a, cVar.f137b);
                return true;
            } else if (i == 2) {
                m165f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m163d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f140d.obtainMessage(1, new C0041c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f140d.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: a0.l$e */
    /* compiled from: NotificationManagerCompat */
    private interface C0044e {
        /* renamed from: a */
        void mo108a(C2614a aVar) throws RemoteException;
    }

    private C0038l(Context context) {
        this.f126a = context;
        this.f127b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: d */
    public static C0038l m149d(Context context) {
        return new C0038l(context);
    }

    /* renamed from: e */
    public static Set<String> m150e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f121c) {
            if (string != null) {
                if (!string.equals(f122d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f123e = hashSet;
                    f122d = string;
                }
            }
            set = f123e;
        }
        return set;
    }

    /* renamed from: h */
    private void m151h(C0044e eVar) {
        synchronized (f124f) {
            if (f125g == null) {
                f125g = new C0042d(this.f126a.getApplicationContext());
            }
            f125g.mo111h(eVar);
        }
    }

    /* renamed from: i */
    private static boolean m152i(Notification notification) {
        Bundle a = C0026i.m62a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean mo103a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f127b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f126a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f126a.getApplicationInfo();
        String packageName = this.f126a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo104b(int i) {
        mo105c((String) null, i);
    }

    /* renamed from: c */
    public void mo105c(String str, int i) {
        this.f127b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m151h(new C0039a(this.f126a.getPackageName(), i, str));
        }
    }

    /* renamed from: f */
    public void mo106f(int i, Notification notification) {
        mo107g((String) null, i, notification);
    }

    /* renamed from: g */
    public void mo107g(String str, int i, Notification notification) {
        if (m152i(notification)) {
            m151h(new C0040b(this.f126a.getPackageName(), i, str, notification));
            this.f127b.cancel(str, i);
            return;
        }
        this.f127b.notify(str, i, notification);
    }
}
