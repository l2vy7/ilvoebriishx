package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.content.C0600b;
import androidx.mediarouter.media.C0983l;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C0996n;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p017c1.C2639f;
import p104l0.C5643c;
import p149t.C6077a;

public abstract class MediaRouteProviderService extends Service {

    /* renamed from: h */
    static final boolean f4314h = Log.isLoggable("MediaRouteProviderSrv", 3);

    /* renamed from: b */
    private final C0922e f4315b;

    /* renamed from: c */
    final Messenger f4316c;

    /* renamed from: d */
    final C0921d f4317d = new C0921d();

    /* renamed from: e */
    private final C0985m.C0986a f4318e;

    /* renamed from: f */
    C0985m f4319f;

    /* renamed from: g */
    final C0913a f4320g;

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$a */
    interface C0913a {
        /* renamed from: a */
        IBinder mo4388a(Intent intent);

        /* renamed from: b */
        boolean mo4389b(Messenger messenger, int i, int i2, String str);

        /* renamed from: c */
        boolean mo4390c(Messenger messenger, int i, int i2);

        /* renamed from: d */
        boolean mo4391d(Messenger messenger, int i, int i2, String str);

        /* renamed from: e */
        boolean mo4392e(Messenger messenger, int i, int i2, String str, String str2);

        /* renamed from: f */
        boolean mo4393f(Messenger messenger, int i, int i2, Intent intent);

        /* renamed from: g */
        boolean mo4394g(Messenger messenger, int i, int i2, int i3);

        /* renamed from: h */
        void mo4395h(Context context);

        /* renamed from: i */
        C0985m.C0986a mo4396i();

        /* renamed from: j */
        boolean mo4397j(Messenger messenger, int i, int i2, String str);

        /* renamed from: k */
        boolean mo4398k(Messenger messenger, int i, int i2, String str);

        /* renamed from: l */
        boolean mo4399l(Messenger messenger, int i, C2639f fVar);

        /* renamed from: m */
        boolean mo4400m(Messenger messenger, int i, int i2, List<String> list);

        /* renamed from: n */
        void mo4401n(Messenger messenger);

        /* renamed from: o */
        boolean mo4402o(Messenger messenger, int i, int i2, int i3);

        /* renamed from: p */
        boolean mo4403p(Messenger messenger, int i, int i2, int i3);

        /* renamed from: q */
        boolean mo4404q(Messenger messenger, int i, int i2);

        /* renamed from: r */
        boolean mo4405r(Messenger messenger, int i);
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$b */
    static class C0914b extends C0916c {

        /* renamed from: e */
        C0978k f4321e;

        /* renamed from: f */
        final C0985m.C0987b.C0992d f4322f = new C0999p(this);

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$b$a */
        class C0915a extends C0916c.C0918b {

            /* renamed from: i */
            private final Map<String, C0985m.C0995e> f4323i = new C6077a();

            /* renamed from: j */
            private final Handler f4324j = new Handler(Looper.getMainLooper());

            /* renamed from: k */
            private final Map<String, Integer> f4325k;

            C0915a(Messenger messenger, int i, String str) {
                super(messenger, i, str);
                if (i < 4) {
                    this.f4325k = new C6077a();
                } else {
                    this.f4325k = Collections.emptyMap();
                }
            }

            /* renamed from: l */
            private void m4719l(String str, int i) {
                this.f4325k.put(str, Integer.valueOf(i));
                this.f4324j.postDelayed(new C1000q(this, str), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                mo4417r();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public void m4721p(String str) {
                if (this.f4325k.remove(str) != null) {
                    mo4417r();
                }
            }

            /* renamed from: a */
            public Bundle mo4409a(C0996n nVar) {
                if (this.f4325k.isEmpty()) {
                    return super.mo4409a(nVar);
                }
                ArrayList arrayList = new ArrayList();
                for (C0983l next : nVar.mo4678c()) {
                    if (this.f4325k.containsKey(next.mo4613m())) {
                        arrayList.add(new C0983l.C0984a(next).mo4636j(false).mo4631e());
                    } else {
                        arrayList.add(next);
                    }
                }
                return super.mo4409a(new C0996n.C0997a(nVar).mo4685d(arrayList).mo4684c());
            }

            /* renamed from: b */
            public Bundle mo4410b(String str, int i) {
                Bundle b = super.mo4410b(str, i);
                if (!(b == null || this.f4339d == null)) {
                    C0914b.this.f4321e.mo4576o(this, this.f4341f.get(i), i, this.f4339d, str);
                }
                return b;
            }

            /* renamed from: c */
            public boolean mo4411c(String str, String str2, int i) {
                C0985m.C0995e eVar = this.f4323i.get(str);
                if (eVar != null) {
                    this.f4341f.put(i, eVar);
                    return true;
                }
                boolean c = super.mo4411c(str, str2, i);
                if (str2 == null && c && this.f4339d != null) {
                    C0914b.this.f4321e.mo4576o(this, this.f4341f.get(i), i, this.f4339d, str);
                }
                if (c) {
                    this.f4323i.put(str, this.f4341f.get(i));
                }
                return c;
            }

            /* renamed from: h */
            public boolean mo4412h(int i) {
                C0914b.this.f4321e.mo4585p(i);
                C0985m.C0995e eVar = this.f4341f.get(i);
                if (eVar != null) {
                    Iterator<Map.Entry<String, C0985m.C0995e>> it = this.f4323i.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        if (next.getValue() == eVar) {
                            this.f4323i.remove(next.getKey());
                            break;
                        }
                    }
                }
                Iterator<Map.Entry<String, Integer>> it2 = this.f4325k.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry next2 = it2.next();
                    if (((Integer) next2.getValue()).intValue() == i) {
                        m4721p((String) next2.getKey());
                        break;
                    }
                }
                return super.mo4412h(i);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void mo4413i(C0985m.C0987b bVar, C0983l lVar, Collection<C0985m.C0987b.C0990c> collection) {
                super.mo4413i(bVar, lVar, collection);
                C0978k kVar = C0914b.this.f4321e;
                if (kVar != null) {
                    kVar.mo4587r(bVar, lVar, collection);
                }
            }

            /* renamed from: n */
            public C0985m.C0995e mo4414n(String str) {
                return this.f4323i.get(str);
            }

            /* renamed from: o */
            public int mo4415o(C0985m.C0995e eVar) {
                int indexOfValue = this.f4341f.indexOfValue(eVar);
                if (indexOfValue < 0) {
                    return -1;
                }
                return this.f4341f.keyAt(indexOfValue);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: q */
            public void mo4416q(C0985m.C0995e eVar, String str) {
                int o = mo4415o(eVar);
                mo4412h(o);
                if (this.f4338c < 4) {
                    m4719l(str, o);
                } else if (o < 0) {
                    Log.w("MediaRouteProviderSrv", "releaseControllerByProvider: Can't find the controller. route ID=" + str);
                } else {
                    MediaRouteProviderService.m4689h(this.f4337b, 8, 0, o, (Object) null, (Bundle) null);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: r */
            public void mo4417r() {
                C0996n o = C0914b.this.mo4419v().mo4384d().mo4650o();
                if (o != null) {
                    MediaRouteProviderService.m4689h(this.f4337b, 5, 0, 0, mo4409a(o), (Bundle) null);
                }
            }
        }

        C0914b(MediaRouteProviderService mediaRouteProviderService) {
            super(mediaRouteProviderService);
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m4711A(C0985m.C0987b bVar, C0983l lVar, Collection collection) {
            this.f4321e.mo4587r(bVar, lVar, collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4406B(C0985m.C0987b bVar) {
            bVar.mo4659q(C0600b.m3297i(this.f4327a.getApplicationContext()), this.f4322f);
        }

        /* renamed from: a */
        public IBinder mo4388a(Intent intent) {
            this.f4327a.mo4383b();
            if (this.f4321e == null) {
                this.f4321e = new C0978k(this);
                if (this.f4327a.getBaseContext() != null) {
                    this.f4321e.attachBaseContext(this.f4327a);
                }
            }
            IBinder a = super.mo4388a(intent);
            if (a != null) {
                return a;
            }
            return this.f4321e.onBind(intent);
        }

        /* renamed from: h */
        public void mo4395h(Context context) {
            C0978k kVar = this.f4321e;
            if (kVar != null) {
                kVar.attachBaseContext(context);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C0916c.C0918b mo4407s(Messenger messenger, int i, String str) {
            return new C0915a(messenger, i, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4408w(C0996n nVar) {
            super.mo4408w(nVar);
            this.f4321e.mo4588s(nVar);
        }
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c */
    static class C0916c implements C0913a {

        /* renamed from: a */
        final MediaRouteProviderService f4327a;

        /* renamed from: b */
        final ArrayList<C0918b> f4328b = new ArrayList<>();

        /* renamed from: c */
        C2639f f4329c;

        /* renamed from: d */
        C2639f f4330d;

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$a */
        class C0917a extends C1003s.C1007d {

            /* renamed from: a */
            final /* synthetic */ C0918b f4331a;

            /* renamed from: b */
            final /* synthetic */ int f4332b;

            /* renamed from: c */
            final /* synthetic */ Intent f4333c;

            /* renamed from: d */
            final /* synthetic */ Messenger f4334d;

            /* renamed from: e */
            final /* synthetic */ int f4335e;

            C0917a(C0918b bVar, int i, Intent intent, Messenger messenger, int i2) {
                this.f4331a = bVar;
                this.f4332b = i;
                this.f4333c = intent;
                this.f4334d = messenger;
                this.f4335e = i2;
            }

            /* renamed from: a */
            public void mo4422a(String str, Bundle bundle) {
                if (MediaRouteProviderService.f4314h) {
                    Log.d("MediaRouteProviderSrv", this.f4331a + ": Route control request failed, controllerId=" + this.f4332b + ", intent=" + this.f4333c + ", error=" + str + ", data=" + bundle);
                }
                if (C0916c.this.mo4418t(this.f4334d) < 0) {
                    return;
                }
                if (str != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("error", str);
                    MediaRouteProviderService.m4689h(this.f4334d, 4, this.f4335e, 0, bundle, bundle2);
                    return;
                }
                MediaRouteProviderService.m4689h(this.f4334d, 4, this.f4335e, 0, bundle, (Bundle) null);
            }

            /* renamed from: b */
            public void mo4423b(Bundle bundle) {
                if (MediaRouteProviderService.f4314h) {
                    Log.d("MediaRouteProviderSrv", this.f4331a + ": Route control request succeeded, controllerId=" + this.f4332b + ", intent=" + this.f4333c + ", data=" + bundle);
                }
                if (C0916c.this.mo4418t(this.f4334d) >= 0) {
                    MediaRouteProviderService.m4689h(this.f4334d, 3, this.f4335e, 0, bundle, (Bundle) null);
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$b */
        class C0918b implements IBinder.DeathRecipient {

            /* renamed from: b */
            public final Messenger f4337b;

            /* renamed from: c */
            public final int f4338c;

            /* renamed from: d */
            public final String f4339d;

            /* renamed from: e */
            public C2639f f4340e;

            /* renamed from: f */
            final SparseArray<C0985m.C0995e> f4341f = new SparseArray<>();

            /* renamed from: g */
            final C0985m.C0987b.C0992d f4342g = new C0919a();

            /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$b$a */
            class C0919a implements C0985m.C0987b.C0992d {
                C0919a() {
                }

                /* renamed from: a */
                public void mo4431a(C0985m.C0987b bVar, C0983l lVar, Collection<C0985m.C0987b.C0990c> collection) {
                    C0918b.this.mo4413i(bVar, lVar, collection);
                }
            }

            C0918b(Messenger messenger, int i, String str) {
                this.f4337b = messenger;
                this.f4338c = i;
                this.f4339d = str;
            }

            /* renamed from: a */
            public Bundle mo4409a(C0996n nVar) {
                return MediaRouteProviderService.m4685a(nVar, this.f4338c);
            }

            /* renamed from: b */
            public Bundle mo4410b(String str, int i) {
                C0985m.C0987b s;
                if (this.f4341f.indexOfKey(i) >= 0 || (s = C0916c.this.f4327a.mo4384d().mo4452s(str)) == null) {
                    return null;
                }
                s.mo4659q(C0600b.m3297i(C0916c.this.f4327a.getApplicationContext()), this.f4342g);
                this.f4341f.put(i, s);
                Bundle bundle = new Bundle();
                bundle.putString("groupableTitle", s.mo4497k());
                bundle.putString("transferableTitle", s.mo4498l());
                return bundle;
            }

            public void binderDied() {
                C0916c.this.f4327a.f4317d.obtainMessage(1, this.f4337b).sendToTarget();
            }

            /* renamed from: c */
            public boolean mo4411c(String str, String str2, int i) {
                C0985m.C0995e eVar;
                if (this.f4341f.indexOfKey(i) >= 0) {
                    return false;
                }
                if (str2 == null) {
                    eVar = C0916c.this.f4327a.mo4384d().mo4453t(str);
                } else {
                    eVar = C0916c.this.f4327a.mo4384d().mo4455u(str, str2);
                }
                if (eVar == null) {
                    return false;
                }
                this.f4341f.put(i, eVar);
                return true;
            }

            /* renamed from: d */
            public void mo4425d() {
                int size = this.f4341f.size();
                for (int i = 0; i < size; i++) {
                    this.f4341f.valueAt(i).mo4491e();
                }
                this.f4341f.clear();
                this.f4337b.getBinder().unlinkToDeath(this, 0);
                mo4429j((C2639f) null);
            }

            /* renamed from: e */
            public C0985m.C0995e mo4426e(int i) {
                return this.f4341f.get(i);
            }

            /* renamed from: f */
            public boolean mo4427f(Messenger messenger) {
                return this.f4337b.getBinder() == messenger.getBinder();
            }

            /* renamed from: g */
            public boolean mo4428g() {
                try {
                    this.f4337b.getBinder().linkToDeath(this, 0);
                    return true;
                } catch (RemoteException unused) {
                    binderDied();
                    return false;
                }
            }

            /* renamed from: h */
            public boolean mo4412h(int i) {
                C0985m.C0995e eVar = this.f4341f.get(i);
                if (eVar == null) {
                    return false;
                }
                this.f4341f.remove(i);
                eVar.mo4491e();
                return true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void mo4413i(C0985m.C0987b bVar, C0983l lVar, Collection<C0985m.C0987b.C0990c> collection) {
                int indexOfValue = this.f4341f.indexOfValue(bVar);
                if (indexOfValue < 0) {
                    Log.w("MediaRouteProviderSrv", "Ignoring unknown dynamic group route controller: " + bVar);
                    return;
                }
                int keyAt = this.f4341f.keyAt(indexOfValue);
                ArrayList arrayList = new ArrayList();
                for (C0985m.C0987b.C0990c g : collection) {
                    arrayList.add(g.mo4667g());
                }
                Bundle bundle = new Bundle();
                if (lVar != null) {
                    bundle.putParcelable("groupRoute", lVar.mo4602a());
                }
                bundle.putParcelableArrayList("dynamicRoutes", arrayList);
                MediaRouteProviderService.m4689h(this.f4337b, 7, 0, keyAt, bundle, (Bundle) null);
            }

            /* renamed from: j */
            public boolean mo4429j(C2639f fVar) {
                if (C5643c.m24954a(this.f4340e, fVar)) {
                    return false;
                }
                this.f4340e = fVar;
                return C0916c.this.mo4421y();
            }

            public String toString() {
                return MediaRouteProviderService.m4686c(this.f4337b);
            }
        }

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$c */
        class C0920c extends C0985m.C0986a {
            C0920c() {
            }

            /* renamed from: a */
            public void mo4432a(C0985m mVar, C0996n nVar) {
                C0916c.this.mo4408w(nVar);
            }
        }

        C0916c(MediaRouteProviderService mediaRouteProviderService) {
            this.f4327a = mediaRouteProviderService;
        }

        /* renamed from: u */
        private C0918b m4731u(Messenger messenger) {
            int t = mo4418t(messenger);
            if (t >= 0) {
                return this.f4328b.get(t);
            }
            return null;
        }

        /* renamed from: a */
        public IBinder mo4388a(Intent intent) {
            if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
                return null;
            }
            this.f4327a.mo4383b();
            if (this.f4327a.mo4384d() != null) {
                return this.f4327a.f4316c.getBinder();
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo4389b(Messenger messenger, int i, int i2, String str) {
            C0918b u = m4731u(messenger);
            if (u == null) {
                return false;
            }
            C0985m.C0995e e = u.mo4426e(i2);
            if (!(e instanceof C0985m.C0987b)) {
                return false;
            }
            ((C0985m.C0987b) e).mo4500o(str);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Removed a member route, controllerId=" + i2 + ", memberId=" + str);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: c */
        public boolean mo4390c(Messenger messenger, int i, int i2) {
            C0985m.C0995e e;
            C0918b u = m4731u(messenger);
            if (u == null || (e = u.mo4426e(i2)) == null) {
                return false;
            }
            e.mo4492f();
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route selected, controllerId=" + i2);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: d */
        public boolean mo4391d(Messenger messenger, int i, int i2, String str) {
            Bundle b;
            C0918b u = m4731u(messenger);
            if (u == null || (b = u.mo4410b(str, i2)) == null) {
                return false;
            }
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route controller created, controllerId=" + i2 + ", initialMemberRouteId=" + str);
            }
            MediaRouteProviderService.m4689h(messenger, 6, i, 3, b, (Bundle) null);
            return true;
        }

        /* renamed from: e */
        public boolean mo4392e(Messenger messenger, int i, int i2, String str, String str2) {
            C0918b u = m4731u(messenger);
            if (u == null || !u.mo4411c(str, str2, i2)) {
                return false;
            }
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route controller created, controllerId=" + i2 + ", routeId=" + str + ", routeGroupId=" + str2);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: f */
        public boolean mo4393f(Messenger messenger, int i, int i2, Intent intent) {
            C0985m.C0995e e;
            C0918b u = m4731u(messenger);
            if (u == null || (e = u.mo4426e(i2)) == null) {
                return false;
            }
            C0917a aVar = null;
            if (i != 0) {
                aVar = new C0917a(u, i2, intent, messenger, i);
            }
            if (!e.mo4490d(intent, aVar)) {
                return false;
            }
            if (!MediaRouteProviderService.f4314h) {
                return true;
            }
            Log.d("MediaRouteProviderSrv", u + ": Route control request delivered, controllerId=" + i2 + ", intent=" + intent);
            return true;
        }

        /* renamed from: g */
        public boolean mo4394g(Messenger messenger, int i, int i2, int i3) {
            C0985m.C0995e e;
            C0918b u = m4731u(messenger);
            if (u == null || (e = u.mo4426e(i2)) == null) {
                return false;
            }
            e.mo4495i(i3);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route unselected, controllerId=" + i2);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: h */
        public void mo4395h(Context context) {
        }

        /* renamed from: i */
        public C0985m.C0986a mo4396i() {
            return new C0920c();
        }

        /* renamed from: j */
        public boolean mo4397j(Messenger messenger, int i, int i2, String str) {
            C0918b u = m4731u(messenger);
            if (u == null) {
                return false;
            }
            C0985m.C0995e e = u.mo4426e(i2);
            if (!(e instanceof C0985m.C0987b)) {
                return false;
            }
            ((C0985m.C0987b) e).mo4499n(str);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Added a member route, controllerId=" + i2 + ", memberId=" + str);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: k */
        public boolean mo4398k(Messenger messenger, int i, int i2, String str) {
            if (i2 < 1 || mo4418t(messenger) >= 0) {
                return false;
            }
            C0918b s = mo4407s(messenger, i2, str);
            if (!s.mo4428g()) {
                return false;
            }
            this.f4328b.add(s);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", s + ": Registered, version=" + i2);
            }
            if (i != 0) {
                MediaRouteProviderService.m4689h(messenger, 2, i, 3, MediaRouteProviderService.m4685a(this.f4327a.mo4384d().mo4650o(), s.f4338c), (Bundle) null);
            }
            return true;
        }

        /* renamed from: l */
        public boolean mo4399l(Messenger messenger, int i, C2639f fVar) {
            C0918b u = m4731u(messenger);
            if (u == null) {
                return false;
            }
            boolean j = u.mo4429j(fVar);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Set discovery request, request=" + fVar + ", actuallyChanged=" + j + ", compositeDiscoveryRequest=" + this.f4329c);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: m */
        public boolean mo4400m(Messenger messenger, int i, int i2, List<String> list) {
            C0918b u = m4731u(messenger);
            if (u == null) {
                return false;
            }
            C0985m.C0995e e = u.mo4426e(i2);
            if (!(e instanceof C0985m.C0987b)) {
                return false;
            }
            ((C0985m.C0987b) e).mo4501p(list);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Updated list of member routes, controllerId=" + i2 + ", memberIds=" + list);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: n */
        public void mo4401n(Messenger messenger) {
            int t = mo4418t(messenger);
            if (t >= 0) {
                C0918b remove = this.f4328b.remove(t);
                if (MediaRouteProviderService.f4314h) {
                    Log.d("MediaRouteProviderSrv", remove + ": Binder died");
                }
                remove.mo4425d();
            }
        }

        /* renamed from: o */
        public boolean mo4402o(Messenger messenger, int i, int i2, int i3) {
            C0985m.C0995e e;
            C0918b u = m4731u(messenger);
            if (u == null || (e = u.mo4426e(i2)) == null) {
                return false;
            }
            e.mo4493g(i3);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route volume changed, controllerId=" + i2 + ", volume=" + i3);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: p */
        public boolean mo4403p(Messenger messenger, int i, int i2, int i3) {
            C0985m.C0995e e;
            C0918b u = m4731u(messenger);
            if (u == null || (e = u.mo4426e(i2)) == null) {
                return false;
            }
            e.mo4496j(i3);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route volume updated, controllerId=" + i2 + ", delta=" + i3);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: q */
        public boolean mo4404q(Messenger messenger, int i, int i2) {
            C0918b u = m4731u(messenger);
            if (u == null || !u.mo4412h(i2)) {
                return false;
            }
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", u + ": Route controller released, controllerId=" + i2);
            }
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* renamed from: r */
        public boolean mo4405r(Messenger messenger, int i) {
            int t = mo4418t(messenger);
            if (t < 0) {
                return false;
            }
            C0918b remove = this.f4328b.remove(t);
            if (MediaRouteProviderService.f4314h) {
                Log.d("MediaRouteProviderSrv", remove + ": Unregistered");
            }
            remove.mo4425d();
            MediaRouteProviderService.m4688g(messenger, i);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C0918b mo4407s(Messenger messenger, int i, String str) {
            return new C0918b(messenger, i, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public int mo4418t(Messenger messenger) {
            int size = this.f4328b.size();
            for (int i = 0; i < size; i++) {
                if (this.f4328b.get(i).mo4427f(messenger)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: v */
        public MediaRouteProviderService mo4419v() {
            return this.f4327a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4408w(C0996n nVar) {
            int size = this.f4328b.size();
            for (int i = 0; i < size; i++) {
                C0918b bVar = this.f4328b.get(i);
                MediaRouteProviderService.m4689h(bVar.f4337b, 5, 0, 0, bVar.mo4409a(nVar), (Bundle) null);
                if (MediaRouteProviderService.f4314h) {
                    Log.d("MediaRouteProviderSrv", bVar + ": Sent descriptor change event, descriptor=" + nVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4420x(C2639f fVar) {
            if (C5643c.m24954a(this.f4330d, fVar)) {
                return false;
            }
            this.f4330d = fVar;
            return mo4421y();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4421y() {
            C1001r.C1002a aVar;
            boolean z;
            C2639f fVar = this.f4330d;
            C2639f fVar2 = null;
            if (fVar != null) {
                z = fVar.mo9290e();
                aVar = new C1001r.C1002a(this.f4330d.mo9289d());
            } else {
                aVar = null;
                z = false;
            }
            int size = this.f4328b.size();
            for (int i = 0; i < size; i++) {
                C2639f fVar3 = this.f4328b.get(i).f4340e;
                if (fVar3 != null && (!fVar3.mo9289d().mo4693f() || fVar3.mo9290e())) {
                    z |= fVar3.mo9290e();
                    if (aVar == null) {
                        aVar = new C1001r.C1002a(fVar3.mo9289d());
                    } else {
                        aVar.mo4700c(fVar3.mo9289d());
                    }
                }
            }
            if (aVar != null) {
                fVar2 = new C2639f(aVar.mo4701d(), z);
            }
            if (C5643c.m24954a(this.f4329c, fVar2)) {
                return false;
            }
            this.f4329c = fVar2;
            this.f4327a.mo4384d().mo4656y(fVar2);
            return true;
        }
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$d */
    private final class C0921d extends Handler {
        C0921d() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                MediaRouteProviderService.this.f4320g.mo4401n((Messenger) message.obj);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$e */
    private static final class C0922e extends Handler {

        /* renamed from: a */
        private final WeakReference<MediaRouteProviderService> f4347a;

        public C0922e(MediaRouteProviderService mediaRouteProviderService) {
            this.f4347a = new WeakReference<>(mediaRouteProviderService);
        }

        /* renamed from: a */
        private boolean m4770a(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle, String str) {
            MediaRouteProviderService mediaRouteProviderService = (MediaRouteProviderService) this.f4347a.get();
            int i4 = 0;
            if (mediaRouteProviderService != null) {
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.f4320g.mo4398k(messenger, i2, i3, str);
                    case 2:
                        return mediaRouteProviderService.f4320g.mo4405r(messenger, i2);
                    case 3:
                        String string = bundle.getString("routeId");
                        String string2 = bundle.getString("routeGroupId");
                        if (string != null) {
                            return mediaRouteProviderService.f4320g.mo4392e(messenger, i2, i3, string, string2);
                        }
                        break;
                    case 4:
                        return mediaRouteProviderService.f4320g.mo4404q(messenger, i2, i3);
                    case 5:
                        return mediaRouteProviderService.f4320g.mo4390c(messenger, i2, i3);
                    case 6:
                        if (bundle != null) {
                            i4 = bundle.getInt("unselectReason", 0);
                        }
                        return mediaRouteProviderService.f4320g.mo4394g(messenger, i2, i3, i4);
                    case 7:
                        int i5 = bundle.getInt("volume", -1);
                        if (i5 >= 0) {
                            return mediaRouteProviderService.f4320g.mo4402o(messenger, i2, i3, i5);
                        }
                        break;
                    case 8:
                        int i6 = bundle.getInt("volume", 0);
                        if (i6 != 0) {
                            return mediaRouteProviderService.f4320g.mo4403p(messenger, i2, i3, i6);
                        }
                        break;
                    case 9:
                        if (obj instanceof Intent) {
                            return mediaRouteProviderService.f4320g.mo4393f(messenger, i2, i3, (Intent) obj);
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            C2639f c = C2639f.m9217c((Bundle) obj);
                            C0913a aVar = mediaRouteProviderService.f4320g;
                            if (c == null || !c.mo9292f()) {
                                c = null;
                            }
                            return aVar.mo4399l(messenger, i2, c);
                        }
                    case 11:
                        String string3 = bundle.getString("memberRouteId");
                        if (string3 != null) {
                            return mediaRouteProviderService.f4320g.mo4391d(messenger, i2, i3, string3);
                        }
                        break;
                    case 12:
                        String string4 = bundle.getString("memberRouteId");
                        if (string4 != null) {
                            return mediaRouteProviderService.f4320g.mo4397j(messenger, i2, i3, string4);
                        }
                        break;
                    case 13:
                        String string5 = bundle.getString("memberRouteId");
                        if (string5 != null) {
                            return mediaRouteProviderService.f4320g.mo4389b(messenger, i2, i3, string5);
                        }
                        break;
                    case 14:
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("memberRouteIds");
                        if (stringArrayList != null) {
                            return mediaRouteProviderService.f4320g.mo4400m(messenger, i2, i3, stringArrayList);
                        }
                        break;
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r17) {
            /*
                r16 = this;
                r0 = r17
                android.os.Messenger r8 = r0.replyTo
                boolean r1 = androidx.mediarouter.media.C0998o.m5116a(r8)
                java.lang.String r9 = "MediaRouteProviderSrv"
                if (r1 == 0) goto L_0x0094
                int r10 = r0.what
                int r11 = r0.arg1
                int r12 = r0.arg2
                java.lang.Object r13 = r0.obj
                android.os.Bundle r14 = r17.peekData()
                r1 = 0
                r2 = 1
                if (r10 != r2) goto L_0x0040
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r2 < r3) goto L_0x0040
                r15 = r16
                java.lang.ref.WeakReference<androidx.mediarouter.media.MediaRouteProviderService> r2 = r15.f4347a
                java.lang.Object r2 = r2.get()
                androidx.mediarouter.media.MediaRouteProviderService r2 = (androidx.mediarouter.media.MediaRouteProviderService) r2
                android.content.pm.PackageManager r2 = r2.getPackageManager()
                int r0 = r0.sendingUid
                java.lang.String[] r0 = r2.getPackagesForUid(r0)
                if (r0 == 0) goto L_0x0042
                int r2 = r0.length
                if (r2 <= 0) goto L_0x0042
                r1 = 0
                r0 = r0[r1]
                r7 = r0
                goto L_0x0043
            L_0x0040:
                r15 = r16
            L_0x0042:
                r7 = r1
            L_0x0043:
                r0 = r16
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                boolean r0 = r0.m4770a(r1, r2, r3, r4, r5, r6, r7)
                if (r0 != 0) goto L_0x009f
                boolean r0 = androidx.mediarouter.media.MediaRouteProviderService.f4314h
                if (r0 == 0) goto L_0x0090
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = androidx.mediarouter.media.MediaRouteProviderService.m4686c(r8)
                r0.append(r1)
                java.lang.String r1 = ": Message failed, what="
                r0.append(r1)
                r0.append(r10)
                java.lang.String r1 = ", requestId="
                r0.append(r1)
                r0.append(r11)
                java.lang.String r1 = ", arg="
                r0.append(r1)
                r0.append(r12)
                java.lang.String r1 = ", obj="
                r0.append(r1)
                r0.append(r13)
                java.lang.String r1 = ", data="
                r0.append(r1)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r9, r0)
            L_0x0090:
                androidx.mediarouter.media.MediaRouteProviderService.m4687f(r8, r11)
                goto L_0x009f
            L_0x0094:
                r15 = r16
                boolean r0 = androidx.mediarouter.media.MediaRouteProviderService.f4314h
                if (r0 == 0) goto L_0x009f
                java.lang.String r0 = "Ignoring message without valid reply messenger."
                android.util.Log.d(r9, r0)
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.media.MediaRouteProviderService.C0922e.handleMessage(android.os.Message):void");
        }
    }

    @SuppressLint({"NewApi"})
    public MediaRouteProviderService() {
        C0922e eVar = new C0922e(this);
        this.f4315b = eVar;
        this.f4316c = new Messenger(eVar);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4320g = new C0914b(this);
        } else {
            this.f4320g = new C0916c(this);
        }
        this.f4318e = this.f4320g.mo4396i();
    }

    /* renamed from: a */
    static Bundle m4685a(C0996n nVar, int i) {
        if (nVar == null) {
            return null;
        }
        C0996n.C0997a aVar = new C0996n.C0997a(nVar);
        aVar.mo4685d((Collection<C0983l>) null);
        if (i < 4) {
            aVar.mo4686e(false);
        }
        for (C0983l next : nVar.mo4678c()) {
            if (i >= next.mo4615o() && i <= next.mo4614n()) {
                aVar.mo4682a(next);
            }
        }
        return aVar.mo4684c().mo4677a();
    }

    /* renamed from: c */
    static String m4686c(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    /* renamed from: f */
    static void m4687f(Messenger messenger, int i) {
        if (i != 0) {
            m4689h(messenger, 0, i, 0, (Object) null, (Bundle) null);
        }
    }

    /* renamed from: g */
    static void m4688g(Messenger messenger, int i) {
        if (i != 0) {
            m4689h(messenger, 1, i, 0, (Object) null, (Bundle) null);
        }
    }

    /* renamed from: h */
    static void m4689h(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MediaRouteProviderSrv", "Could not send message to " + m4686c(messenger), e);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f4320g.mo4395h(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4383b() {
        C0985m e;
        if (this.f4319f == null && (e = mo4385e()) != null) {
            String b = e.mo4653r().mo4675b();
            if (b.equals(getPackageName())) {
                this.f4319f = e;
                e.mo4654w(this.f4318e);
                return;
            }
            throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + b + ".  Service package name: " + getPackageName() + ".");
        }
    }

    /* renamed from: d */
    public C0985m mo4384d() {
        return this.f4319f;
    }

    /* renamed from: e */
    public abstract C0985m mo4385e();

    public IBinder onBind(Intent intent) {
        return this.f4320g.mo4388a(intent);
    }

    public void onDestroy() {
        C0985m mVar = this.f4319f;
        if (mVar != null) {
            mVar.mo4654w((C0985m.C0986a) null);
        }
        super.onDestroy();
    }
}
