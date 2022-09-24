package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.view.Display;
import androidx.annotation.RecentlyNonNull;
import androidx.mediarouter.media.C1003s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8564i0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a5.C6492o;
import p108l4.C10667c;
import p108l4.C10673e;
import p108l4.C10681h;
import p108l4.C10682i;
import p185z4.C6469a;
import p243q4.C10922b;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class CastRemoteDisplayLocalService extends Service {

    /* renamed from: o */
    private static final C10922b f28351o = new C10922b("CastRDLocalService");

    /* renamed from: p */
    private static final int f28352p = C10681h.f49301a;

    /* renamed from: q */
    private static final Object f28353q = new Object();

    /* renamed from: r */
    private static AtomicBoolean f28354r = new AtomicBoolean(false);
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: s */
    private static CastRemoteDisplayLocalService f28355s;

    /* renamed from: b */
    private String f28356b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WeakReference<C7079a> f28357c;

    /* renamed from: d */
    private Notification f28358d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CastDevice f28359e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Display f28360f;

    /* renamed from: g */
    private Context f28361g;

    /* renamed from: h */
    private ServiceConnection f28362h;

    /* renamed from: i */
    private Handler f28363i;

    /* renamed from: j */
    private C1003s f28364j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f28365k = false;

    /* renamed from: l */
    private C10673e f28366l;

    /* renamed from: m */
    private final C1003s.C1005b f28367m = new C7093b0(this);

    /* renamed from: n */
    private final IBinder f28368n = new C7096e(this);

    /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public interface C7079a {
        /* renamed from: a */
        void mo29198a(@RecentlyNonNull CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        /* renamed from: b */
        void mo29199b(@RecentlyNonNull Status status);
    }

    /* renamed from: b */
    public static void m29052b() {
        m29061k(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m29060j(boolean z) {
        m29062l("Stopping Service");
        C4604n.m20093f("stopServiceInstanceInternal must be called on the main thread");
        if (!z && this.f28364j != null) {
            m29062l("Setting default route");
            C1003s sVar = this.f28364j;
            sVar.mo4713r(sVar.mo4705f());
        }
        m29062l("stopRemoteDisplaySession");
        m29062l("stopRemoteDisplay");
        this.f28366l.mo42811g().addOnCompleteListener(new C7095d(this));
        C7079a aVar = (C7079a) this.f28357c.get();
        if (aVar != null) {
            aVar.mo29198a(this);
        }
        mo29194a();
        m29062l("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
        if (this.f28364j != null) {
            C4604n.m20093f("CastRemoteDisplayLocalService calls must be done on the main thread");
            m29062l("removeMediaRouterCallback");
            this.f28364j.mo4711p(this.f28367m);
        }
        Context context = this.f28361g;
        ServiceConnection serviceConnection = this.f28362h;
        if (!(context == null || serviceConnection == null)) {
            try {
                C6469a.m28199b().mo24299c(context, serviceConnection);
            } catch (IllegalArgumentException unused) {
                m29062l("No need to unbind service, already unbound");
            }
        }
        this.f28362h = null;
        this.f28361g = null;
        this.f28356b = null;
        this.f28358d = null;
        this.f28360f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r3.f28363i == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r3.f28363i.post(new com.google.android.gms.cast.C7094c(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r3.m29060j(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m29061k(boolean r4) {
        /*
            q4.b r0 = f28351o
            java.lang.String r1 = "Stopping Service"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.mo43190a(r1, r3)
            java.util.concurrent.atomic.AtomicBoolean r1 = f28354r
            r1.set(r2)
            java.lang.Object r1 = f28353q
            monitor-enter(r1)
            com.google.android.gms.cast.CastRemoteDisplayLocalService r3 = f28355s     // Catch:{ all -> 0x0040 }
            if (r3 != 0) goto L_0x001f
            java.lang.String r4 = "Service is already being stopped"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0040 }
            r0.mo43192c(r4, r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            return
        L_0x001f:
            r0 = 0
            f28355s = r0     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            android.os.Handler r0 = r3.f28363i
            if (r0 == 0) goto L_0x003f
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x003c
            android.os.Handler r0 = r3.f28363i
            com.google.android.gms.cast.c r1 = new com.google.android.gms.cast.c
            r1.<init>(r3, r4)
            r0.post(r1)
            return
        L_0x003c:
            r3.m29060j(r4)
        L_0x003f:
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastRemoteDisplayLocalService.m29061k(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m29062l(String str) {
        f28351o.mo43190a("[Instance: %s] %s", this, str);
    }

    /* renamed from: a */
    public abstract void mo29194a();

    @RecentlyNonNull
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        m29062l("onBind");
        return this.f28368n;
    }

    public void onCreate() {
        m29062l("onCreate");
        super.onCreate();
        C8564i0 i0Var = new C8564i0(getMainLooper());
        this.f28363i = i0Var;
        i0Var.postDelayed(new C7092b(this), 100);
        if (this.f28366l == null) {
            this.f28366l = C10667c.m48492a(this);
        }
        if (C6492o.m28288k()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_remote_display_local_service", getString(C10682i.cast_notification_default_channel_name), 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    public int onStartCommand(@RecentlyNonNull Intent intent, int i, int i2) {
        m29062l("onStartCommand");
        this.f28365k = true;
        return 2;
    }
}
