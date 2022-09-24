package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1178c;
import androidx.room.C1181d;
import androidx.room.C1185f;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.g */
/* compiled from: MultiInstanceInvalidationClient */
class C1190g {

    /* renamed from: a */
    final Context f5461a;

    /* renamed from: b */
    final String f5462b;

    /* renamed from: c */
    int f5463c;

    /* renamed from: d */
    final C1185f f5464d;

    /* renamed from: e */
    final C1185f.C1188c f5465e;

    /* renamed from: f */
    C1181d f5466f;

    /* renamed from: g */
    final Executor f5467g;

    /* renamed from: h */
    final C1178c f5468h = new C1191a();

    /* renamed from: i */
    final AtomicBoolean f5469i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f5470j;

    /* renamed from: k */
    final Runnable f5471k;

    /* renamed from: l */
    final Runnable f5472l;

    /* renamed from: m */
    private final Runnable f5473m;

    /* renamed from: androidx.room.g$a */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1191a extends C1178c.C1179a {

        /* renamed from: androidx.room.g$a$a */
        /* compiled from: MultiInstanceInvalidationClient */
        class C1192a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String[] f5475b;

            C1192a(String[] strArr) {
                this.f5475b = strArr;
            }

            public void run() {
                C1190g.this.f5464d.mo5869e(this.f5475b);
            }
        }

        C1191a() {
        }

        /* renamed from: n1 */
        public void mo5859n1(String[] strArr) {
            C1190g.this.f5467g.execute(new C1192a(strArr));
        }
    }

    /* renamed from: androidx.room.g$b */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1193b implements ServiceConnection {
        C1193b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1190g.this.f5466f = C1181d.C1182a.m6560x(iBinder);
            C1190g gVar = C1190g.this;
            gVar.f5467g.execute(gVar.f5471k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1190g gVar = C1190g.this;
            gVar.f5467g.execute(gVar.f5472l);
            C1190g.this.f5466f = null;
        }
    }

    /* renamed from: androidx.room.g$c */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1194c implements Runnable {
        C1194c() {
        }

        public void run() {
            try {
                C1190g gVar = C1190g.this;
                C1181d dVar = gVar.f5466f;
                if (dVar != null) {
                    gVar.f5463c = dVar.mo5846d2(gVar.f5468h, gVar.f5462b);
                    C1190g gVar2 = C1190g.this;
                    gVar2.f5464d.mo5866a(gVar2.f5465e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.g$d */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1195d implements Runnable {
        C1195d() {
        }

        public void run() {
            C1190g gVar = C1190g.this;
            gVar.f5464d.mo5871g(gVar.f5465e);
        }
    }

    /* renamed from: androidx.room.g$e */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1196e implements Runnable {
        C1196e() {
        }

        public void run() {
            C1190g gVar = C1190g.this;
            gVar.f5464d.mo5871g(gVar.f5465e);
            try {
                C1190g gVar2 = C1190g.this;
                C1181d dVar = gVar2.f5466f;
                if (dVar != null) {
                    dVar.mo5845W5(gVar2.f5468h, gVar2.f5463c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            C1190g gVar3 = C1190g.this;
            gVar3.f5461a.unbindService(gVar3.f5470j);
        }
    }

    /* renamed from: androidx.room.g$f */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1197f extends C1185f.C1188c {
        C1197f(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5881a() {
            return true;
        }

        /* renamed from: b */
        public void mo5882b(Set<String> set) {
            if (!C1190g.this.f5469i.get()) {
                try {
                    C1190g gVar = C1190g.this;
                    C1181d dVar = gVar.f5466f;
                    if (dVar != null) {
                        dVar.mo5844B5(gVar.f5463c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    C1190g(Context context, String str, C1185f fVar, Executor executor) {
        C1193b bVar = new C1193b();
        this.f5470j = bVar;
        this.f5471k = new C1194c();
        this.f5472l = new C1195d();
        this.f5473m = new C1196e();
        Context applicationContext = context.getApplicationContext();
        this.f5461a = applicationContext;
        this.f5462b = str;
        this.f5464d = fVar;
        this.f5467g = executor;
        this.f5465e = new C1197f((String[]) fVar.f5438a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5885a() {
        if (this.f5469i.compareAndSet(false, true)) {
            this.f5467g.execute(this.f5473m);
        }
    }
}
