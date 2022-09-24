package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import p017c1.C2637d;
import p017c1.C2638e;
import p017c1.C2639f;
import p149t.C6077a;

/* renamed from: androidx.mediarouter.media.k */
/* compiled from: MediaRoute2ProviderServiceAdapter */
class C0978k extends MediaRoute2ProviderService {

    /* renamed from: g */
    static final boolean f4479g = Log.isLoggable("MR2ProviderService", 3);

    /* renamed from: b */
    private final Object f4480b = new Object();

    /* renamed from: c */
    final MediaRouteProviderService.C0914b f4481c;

    /* renamed from: d */
    final Map<String, C0982d> f4482d = new C6077a();

    /* renamed from: e */
    final SparseArray<String> f4483e = new SparseArray<>();

    /* renamed from: f */
    private volatile C0996n f4484f;

    /* renamed from: androidx.mediarouter.media.k$a */
    /* compiled from: MediaRoute2ProviderServiceAdapter */
    class C0979a extends C1003s.C1007d {

        /* renamed from: a */
        final /* synthetic */ String f4485a;

        /* renamed from: b */
        final /* synthetic */ Intent f4486b;

        /* renamed from: c */
        final /* synthetic */ Messenger f4487c;

        /* renamed from: d */
        final /* synthetic */ int f4488d;

        C0979a(String str, Intent intent, Messenger messenger, int i) {
            this.f4485a = str;
            this.f4486b = intent;
            this.f4487c = messenger;
            this.f4488d = i;
        }

        /* renamed from: a */
        public void mo4422a(String str, Bundle bundle) {
            if (C0978k.f4479g) {
                Log.d("MR2ProviderService", "Route control request failed, sessionId=" + this.f4485a + ", intent=" + this.f4486b + ", error=" + str + ", data=" + bundle);
            }
            if (str != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("error", str);
                mo4592c(this.f4487c, 4, this.f4488d, 0, bundle, bundle2);
                return;
            }
            mo4592c(this.f4487c, 4, this.f4488d, 0, bundle, (Bundle) null);
        }

        /* renamed from: b */
        public void mo4423b(Bundle bundle) {
            if (C0978k.f4479g) {
                Log.d("MR2ProviderService", "Route control request succeeded, sessionId=" + this.f4485a + ", intent=" + this.f4486b + ", data=" + bundle);
            }
            mo4592c(this.f4487c, 3, this.f4488d, 0, bundle, (Bundle) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4592c(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
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
                Log.e("MR2ProviderService", "Could not send message to the client.", e);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.k$b */
    /* compiled from: MediaRoute2ProviderServiceAdapter */
    private static class C0980b extends C0985m.C0987b {

        /* renamed from: f */
        private final String f4490f;

        /* renamed from: g */
        final C0985m.C0995e f4491g;

        C0980b(String str, C0985m.C0995e eVar) {
            this.f4490f = str;
            this.f4491g = eVar;
        }

        /* renamed from: d */
        public boolean mo4490d(Intent intent, C1003s.C1007d dVar) {
            return this.f4491g.mo4490d(intent, dVar);
        }

        /* renamed from: e */
        public void mo4491e() {
            this.f4491g.mo4491e();
        }

        /* renamed from: f */
        public void mo4492f() {
            this.f4491g.mo4492f();
        }

        /* renamed from: g */
        public void mo4493g(int i) {
            this.f4491g.mo4493g(i);
        }

        /* renamed from: i */
        public void mo4495i(int i) {
            this.f4491g.mo4495i(i);
        }

        /* renamed from: j */
        public void mo4496j(int i) {
            this.f4491g.mo4496j(i);
        }

        /* renamed from: n */
        public void mo4499n(String str) {
        }

        /* renamed from: o */
        public void mo4500o(String str) {
        }

        /* renamed from: p */
        public void mo4501p(List<String> list) {
        }

        /* renamed from: r */
        public String mo4593r() {
            return this.f4490f;
        }
    }

    /* renamed from: androidx.mediarouter.media.k$c */
    /* compiled from: MediaRoute2ProviderServiceAdapter */
    static class C0981c extends Handler {

        /* renamed from: a */
        private final C0978k f4492a;

        /* renamed from: b */
        private final String f4493b;

        C0981c(C0978k kVar, String str) {
            super(Looper.myLooper());
            this.f4492a = kVar;
            this.f4493b = str;
        }

        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            int i = message.what;
            int i2 = message.arg1;
            Object obj = message.obj;
            Bundle data = message.getData();
            if (i == 7) {
                int i3 = data.getInt("volume", -1);
                String string = data.getString("routeId");
                if (i3 >= 0 && string != null) {
                    this.f4492a.mo4589t(string, i3);
                }
            } else if (i == 8) {
                int i4 = data.getInt("volume", 0);
                String string2 = data.getString("routeId");
                if (i4 != 0 && string2 != null) {
                    this.f4492a.mo4590u(string2, i4);
                }
            } else if (i == 9 && (obj instanceof Intent)) {
                this.f4492a.mo4586q(messenger, i2, this.f4493b, (Intent) obj);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.k$d */
    /* compiled from: MediaRoute2ProviderServiceAdapter */
    final class C0982d {

        /* renamed from: a */
        private final Map<String, C0985m.C0995e> f4494a;

        /* renamed from: b */
        private final C0985m.C0987b f4495b;

        /* renamed from: c */
        private final long f4496c;

        /* renamed from: d */
        private final int f4497d;

        /* renamed from: e */
        private final WeakReference<MediaRouteProviderService.C0914b.C0915a> f4498e;

        /* renamed from: f */
        private boolean f4499f;

        /* renamed from: g */
        private boolean f4500g;

        /* renamed from: h */
        private RoutingSessionInfo f4501h;

        /* renamed from: i */
        String f4502i;

        /* renamed from: j */
        String f4503j;

        C0982d(C0978k kVar, C0985m.C0987b bVar, long j, int i) {
            this(bVar, j, i, (MediaRouteProviderService.C0914b.C0915a) null);
        }

        /* renamed from: d */
        private C0985m.C0995e m5006d(String str, String str2) {
            C0985m.C0995e eVar;
            C0985m.C0995e eVar2 = this.f4494a.get(str);
            if (eVar2 != null) {
                return eVar2;
            }
            if (str2 == null) {
                eVar = C0978k.this.mo4575i().mo4453t(str);
            } else {
                eVar = C0978k.this.mo4575i().mo4455u(str, str2);
            }
            if (eVar != null) {
                this.f4494a.put(str, eVar);
            }
            return eVar;
        }

        /* renamed from: e */
        private void m5007e() {
            if (this.f4499f) {
                Log.w("MR2ProviderService", "notifySessionCreated: Routing session is already created.");
                return;
            }
            this.f4499f = true;
            C0978k.this.notifySessionCreated(this.f4496c, this.f4501h);
        }

        /* renamed from: g */
        private boolean m5008g(String str) {
            C0985m.C0995e remove = this.f4494a.remove(str);
            if (remove == null) {
                return false;
            }
            remove.mo4495i(0);
            remove.mo4491e();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0985m.C0995e mo4595a(String str) {
            MediaRouteProviderService.C0914b.C0915a aVar = (MediaRouteProviderService.C0914b.C0915a) this.f4498e.get();
            if (aVar != null) {
                return aVar.mo4414n(str);
            }
            return this.f4494a.get(str);
        }

        /* renamed from: b */
        public int mo4596b() {
            return this.f4497d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0985m.C0987b mo4597c() {
            return this.f4495b;
        }

        /* renamed from: f */
        public void mo4598f(boolean z) {
            MediaRouteProviderService.C0914b.C0915a aVar;
            if (!this.f4500g) {
                if ((this.f4497d & 3) == 3) {
                    mo4600i((String) null, this.f4501h, (RoutingSessionInfo) null);
                }
                if (z) {
                    this.f4495b.mo4495i(2);
                    this.f4495b.mo4491e();
                    if ((this.f4497d & 1) == 0 && (aVar = (MediaRouteProviderService.C0914b.C0915a) this.f4498e.get()) != null) {
                        C0985m.C0995e eVar = this.f4495b;
                        if (eVar instanceof C0980b) {
                            eVar = ((C0980b) eVar).f4491g;
                        }
                        aVar.mo4416q(eVar, this.f4503j);
                    }
                }
                this.f4500g = true;
                C0978k.this.notifySessionReleased(this.f4502i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4599h(RoutingSessionInfo routingSessionInfo) {
            if (this.f4501h != null) {
                Log.w("MR2ProviderService", "setSessionInfo: This shouldn't be called after sesionInfo is set");
                return;
            }
            Messenger messenger = new Messenger(new C0981c(C0978k.this, this.f4502i));
            RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
            Bundle bundle = new Bundle();
            bundle.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", messenger);
            bundle.putString("androidx.mediarouter.media.KEY_SESSION_NAME", routingSessionInfo.getName() != null ? routingSessionInfo.getName().toString() : null);
            this.f4501h = builder.setControlHints(bundle).build();
        }

        /* renamed from: i */
        public void mo4600i(String str, RoutingSessionInfo routingSessionInfo, RoutingSessionInfo routingSessionInfo2) {
            List<String> list;
            List<String> list2;
            if (routingSessionInfo == null) {
                list = Collections.emptyList();
            } else {
                list = routingSessionInfo.getSelectedRoutes();
            }
            if (routingSessionInfo2 == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = routingSessionInfo2.getSelectedRoutes();
            }
            for (String str2 : list2) {
                if (mo4595a(str2) == null) {
                    m5006d(str2, str).mo4492f();
                }
            }
            for (String str3 : list) {
                if (!list2.contains(str3)) {
                    m5008g(str3);
                }
            }
        }

        /* renamed from: j */
        public void mo4601j(C0983l lVar, Collection<C0985m.C0987b.C0990c> collection) {
            RoutingSessionInfo routingSessionInfo = this.f4501h;
            if (routingSessionInfo == null) {
                Log.w("MR2ProviderService", "updateSessionInfo: mSessionInfo is null. This shouldn't happen.");
            } else if (lVar == null || lVar.mo4625x()) {
                RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
                if (lVar != null) {
                    this.f4503j = lVar.mo4613m();
                    builder.setName(lVar.mo4616p()).setVolume(lVar.mo4622u()).setVolumeMax(lVar.mo4624w()).setVolumeHandling(lVar.mo4623v());
                    Bundle controlHints = routingSessionInfo.getControlHints();
                    if (controlHints == null) {
                        Log.w("MR2ProviderService", "updateSessionInfo: controlHints is null. This shouldn't happen.");
                        controlHints = new Bundle();
                    }
                    controlHints.putString("androidx.mediarouter.media.KEY_SESSION_NAME", lVar.mo4616p());
                    controlHints.putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", lVar.mo4602a());
                    builder.setControlHints(controlHints);
                }
                this.f4501h = builder.build();
                if (collection != null && !collection.isEmpty()) {
                    boolean z = false;
                    builder.clearSelectedRoutes();
                    builder.clearSelectableRoutes();
                    builder.clearDeselectableRoutes();
                    builder.clearTransferableRoutes();
                    for (C0985m.C0987b.C0990c next : collection) {
                        String m = next.mo4662b().mo4613m();
                        int i = next.f4533b;
                        if (i == 2 || i == 3) {
                            builder.addSelectedRoute(m);
                            z = true;
                        }
                        if (next.mo4664d()) {
                            builder.addSelectableRoute(m);
                        }
                        if (next.mo4666f()) {
                            builder.addDeselectableRoute(m);
                        }
                        if (next.mo4665e()) {
                            builder.addTransferableRoute(m);
                        }
                    }
                    if (z) {
                        this.f4501h = builder.build();
                    }
                }
                if ((this.f4497d & 5) == 5 && lVar != null) {
                    mo4600i(lVar.mo4613m(), routingSessionInfo, this.f4501h);
                }
                if (!this.f4499f) {
                    m5007e();
                } else {
                    C0978k.this.notifySessionUpdated(this.f4501h);
                }
            } else {
                C0978k.this.onReleaseSession(0, this.f4502i);
            }
        }

        C0982d(C0985m.C0987b bVar, long j, int i, MediaRouteProviderService.C0914b.C0915a aVar) {
            this.f4494a = new C6077a();
            this.f4499f = false;
            this.f4495b = bVar;
            this.f4496c = j;
            this.f4497d = i;
            this.f4498e = new WeakReference<>(aVar);
        }
    }

    C0978k(MediaRouteProviderService.C0914b bVar) {
        this.f4481c = bVar;
    }

    /* renamed from: e */
    private String m4975e(C0982d dVar) {
        String uuid;
        synchronized (this.f4480b) {
            do {
                uuid = UUID.randomUUID().toString();
            } while (this.f4482d.containsKey(uuid));
            dVar.f4502i = uuid;
            this.f4482d.put(uuid, dVar);
        }
        return uuid;
    }

    /* renamed from: f */
    private C0985m.C0995e m4976f(String str) {
        ArrayList<C0982d> arrayList = new ArrayList<>();
        synchronized (this.f4480b) {
            arrayList.addAll(this.f4482d.values());
        }
        for (C0982d a : arrayList) {
            C0985m.C0995e a2 = a.mo4595a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: g */
    private C0985m.C0987b m4977g(String str) {
        C0985m.C0987b bVar;
        synchronized (this.f4480b) {
            C0982d dVar = this.f4482d.get(str);
            if (dVar == null) {
                bVar = null;
            } else {
                bVar = dVar.mo4597c();
            }
        }
        return bVar;
    }

    /* renamed from: h */
    private C0982d m4978h(C0985m.C0987b bVar) {
        synchronized (this.f4480b) {
            for (Map.Entry<String, C0982d> value : this.f4482d.entrySet()) {
                C0982d dVar = (C0982d) value.getValue();
                if (dVar.mo4597c() == bVar) {
                    return dVar;
                }
            }
            return null;
        }
    }

    /* renamed from: j */
    private C0983l m4979j(String str, String str2) {
        if (mo4575i() == null || this.f4484f == null) {
            Log.w("MR2ProviderService", str2 + ": no provider info");
            return null;
        }
        for (C0983l next : this.f4484f.mo4678c()) {
            if (TextUtils.equals(next.mo4613m(), str)) {
                return next;
            }
        }
        Log.w("MR2ProviderService", str2 + ": Couldn't find a route : " + str);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C0983l m4981l(C0983l lVar) {
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ C0983l m4982m(C0983l lVar, C0983l lVar2) {
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ boolean m4983n(C0982d dVar) {
        return (dVar.mo4596b() & 4) == 0;
    }

    public void attachBaseContext(Context context) {
        C0978k.super.attachBaseContext(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0985m mo4575i() {
        MediaRouteProviderService v = this.f4481c.mo4419v();
        if (v == null) {
            return null;
        }
        return v.mo4384d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4576o(MediaRouteProviderService.C0914b.C0915a aVar, C0985m.C0995e eVar, int i, String str, String str2) {
        int i2;
        C0980b bVar;
        C0983l j = m4979j(str2, "notifyRouteControllerAdded");
        if (j != null) {
            int i3 = 0;
            if (eVar instanceof C0985m.C0987b) {
                bVar = (C0985m.C0987b) eVar;
                i2 = 6;
            } else {
                if (!j.mo4611k().isEmpty()) {
                    i3 = 2;
                }
                i2 = i3;
                bVar = new C0980b(str2, eVar);
            }
            C0982d dVar = new C0982d(bVar, 0, i2, aVar);
            dVar.f4503j = str2;
            String e = m4975e(dVar);
            this.f4483e.put(i, e);
            dVar.mo4599h(new RoutingSessionInfo.Builder(e, str).addSelectedRoute(str2).setName(j.mo4616p()).setVolumeHandling(j.mo4623v()).setVolume(j.mo4622u()).setVolumeMax(j.mo4624w()).build());
        }
    }

    public void onCreateSession(long j, String str, String str2, Bundle bundle) {
        C0985m.C0987b bVar;
        C0985m i = mo4575i();
        C0983l j2 = m4979j(str2, "onCreateSession");
        int i2 = 3;
        if (j2 == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        if (this.f4484f.mo4680e()) {
            bVar = i.mo4452s(str2);
            i2 = 7;
            if (bVar == null) {
                Log.w("MR2ProviderService", "onCreateSession: Couldn't create a dynamic controller");
                notifyRequestFailed(j, 1);
                return;
            }
        } else {
            C0985m.C0995e t = i.mo4453t(str2);
            if (t == null) {
                Log.w("MR2ProviderService", "onCreateSession: Couldn't create a controller");
                notifyRequestFailed(j, 1);
                return;
            }
            if (j2.mo4611k().isEmpty()) {
                i2 = 1;
            }
            bVar = new C0980b(str2, t);
        }
        bVar.mo4492f();
        C0982d dVar = new C0982d(this, bVar, j, i2);
        RoutingSessionInfo.Builder volumeMax = new RoutingSessionInfo.Builder(m4975e(dVar), str).setName(j2.mo4616p()).setVolumeHandling(j2.mo4623v()).setVolume(j2.mo4622u()).setVolumeMax(j2.mo4624w());
        if (j2.mo4611k().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            for (String addSelectedRoute : j2.mo4611k()) {
                volumeMax.addSelectedRoute(addSelectedRoute);
            }
        }
        RoutingSessionInfo build = volumeMax.build();
        dVar.mo4599h(build);
        if ((i2 & 6) == 2) {
            dVar.mo4600i(str2, (RoutingSessionInfo) null, build);
        }
        this.f4481c.mo4406B(bVar);
    }

    public void onDeselectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            Log.w("MR2ProviderService", "onDeselectRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else if (m4979j(str2, "onDeselectRoute") == null) {
            notifyRequestFailed(j, 3);
        } else {
            C0985m.C0987b g = m4977g(str);
            if (g == null) {
                Log.w("MR2ProviderService", "onDeselectRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
                return;
            }
            g.mo4500o(str2);
        }
    }

    public void onDiscoveryPreferenceChanged(RouteDiscoveryPreference routeDiscoveryPreference) {
        this.f4481c.mo4420x(new C2639f(new C1001r.C1002a().mo4698a((Collection) routeDiscoveryPreference.getPreferredFeatures().stream().map(C0976i.f4477a).collect(Collectors.toList())).mo4701d(), routeDiscoveryPreference.shouldPerformActiveScan()));
    }

    public void onReleaseSession(long j, String str) {
        C0982d remove;
        if (getSessionInfo(str) != null) {
            synchronized (this.f4480b) {
                remove = this.f4482d.remove(str);
            }
            if (remove == null) {
                Log.w("MR2ProviderService", "onReleaseSession: Couldn't find a session");
                notifyRequestFailed(j, 4);
                return;
            }
            remove.mo4598f(true);
        }
    }

    public void onSelectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            Log.w("MR2ProviderService", "onSelectRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else if (m4979j(str2, "onSelectRoute") == null) {
            notifyRequestFailed(j, 3);
        } else {
            C0985m.C0987b g = m4977g(str);
            if (g == null) {
                Log.w("MR2ProviderService", "onSelectRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
                return;
            }
            g.mo4499n(str2);
        }
    }

    public void onSetRouteVolume(long j, String str, int i) {
        C0985m.C0995e f = m4976f(str);
        if (f == null) {
            Log.w("MR2ProviderService", "onSetRouteVolume: Couldn't find a controller for routeId=" + str);
            notifyRequestFailed(j, 3);
            return;
        }
        f.mo4493g(i);
    }

    public void onSetSessionVolume(long j, String str, int i) {
        if (getSessionInfo(str) == null) {
            Log.w("MR2ProviderService", "onSetSessionVolume: Couldn't find a session");
            notifyRequestFailed(j, 4);
            return;
        }
        C0985m.C0987b g = m4977g(str);
        if (g == null) {
            Log.w("MR2ProviderService", "onSetSessionVolume: Couldn't find a controller");
            notifyRequestFailed(j, 3);
            return;
        }
        g.mo4493g(i);
    }

    public void onTransferToRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            Log.w("MR2ProviderService", "onTransferToRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else if (m4979j(str2, "onTransferToRoute") == null) {
            notifyRequestFailed(j, 3);
        } else {
            C0985m.C0987b g = m4977g(str);
            if (g == null) {
                Log.w("MR2ProviderService", "onTransferToRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
                return;
            }
            g.mo4501p(Collections.singletonList(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4585p(int i) {
        C0982d remove;
        String str = this.f4483e.get(i);
        if (str != null) {
            this.f4483e.remove(i);
            synchronized (this.f4480b) {
                remove = this.f4482d.remove(str);
            }
            if (remove != null) {
                remove.mo4598f(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4586q(Messenger messenger, int i, String str, Intent intent) {
        if (getSessionInfo(str) == null) {
            Log.w("MR2ProviderService", "onCustomCommand: Couldn't find a session");
            return;
        }
        C0985m.C0987b g = m4977g(str);
        if (g == null) {
            Log.w("MR2ProviderService", "onControlRequest: Couldn't find a controller");
            notifyRequestFailed((long) i, 3);
            return;
        }
        g.mo4490d(intent, new C0979a(str, intent, messenger, i));
    }

    /* renamed from: r */
    public void mo4587r(C0985m.C0987b bVar, C0983l lVar, Collection<C0985m.C0987b.C0990c> collection) {
        C0982d h = m4978h(bVar);
        if (h == null) {
            Log.w("MR2ProviderService", "setDynamicRouteDescriptor: Ignoring unknown controller");
        } else {
            h.mo4601j(lVar, collection);
        }
    }

    /* renamed from: s */
    public void mo4588s(C0996n nVar) {
        this.f4484f = nVar;
        Map map = (Map) (nVar == null ? Collections.emptyList() : nVar.mo4678c()).stream().filter(C2638e.f10392a).collect(Collectors.toMap(C0955f.f4432a, C0962g.f4447a, C0950e.f4421a));
        mo4591v(map);
        notifyRoutes((Collection) map.values().stream().map(C0975h.f4476a).filter(C2637d.f10391a).collect(Collectors.toList()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4589t(String str, int i) {
        C0985m.C0995e f = m4976f(str);
        if (f == null) {
            Log.w("MR2ProviderService", "setRouteVolume: Couldn't find a controller for routeId=" + str);
            return;
        }
        f.mo4493g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4590u(String str, int i) {
        C0985m.C0995e f = m4976f(str);
        if (f == null) {
            Log.w("MR2ProviderService", "updateRouteVolume: Couldn't find a controller for routeId=" + str);
            return;
        }
        f.mo4496j(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4591v(Map<String, C0983l> map) {
        List<C0982d> list;
        synchronized (this.f4480b) {
            list = (List) this.f4482d.values().stream().filter(C0977j.f4478a).collect(Collectors.toList());
        }
        for (C0982d dVar : list) {
            C0980b bVar = (C0980b) dVar.mo4597c();
            if (map.containsKey(bVar.mo4593r())) {
                dVar.mo4601j(map.get(bVar.mo4593r()), (Collection<C0985m.C0987b.C0990c>) null);
            }
        }
    }
}
