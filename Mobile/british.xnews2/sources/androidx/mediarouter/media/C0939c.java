package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.C0983l;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C0996n;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import p011b1.C1542j;
import p017c1.C2635b;
import p017c1.C2636c;
import p017c1.C2639f;

/* renamed from: androidx.mediarouter.media.c */
/* compiled from: MediaRoute2Provider */
class C0939c extends C0985m {

    /* renamed from: t */
    static final boolean f4389t = Log.isLoggable("MR2Provider", 3);

    /* renamed from: j */
    final MediaRouter2 f4390j;

    /* renamed from: k */
    final C0940a f4391k;

    /* renamed from: l */
    final Map<MediaRouter2.RoutingController, C0942c> f4392l = new ArrayMap();

    /* renamed from: m */
    private final MediaRouter2.RouteCallback f4393m = new C0945e();

    /* renamed from: n */
    private final MediaRouter2.TransferCallback f4394n = new C0946f();

    /* renamed from: o */
    private final MediaRouter2.ControllerCallback f4395o = new C0941b();

    /* renamed from: p */
    private final Handler f4396p;

    /* renamed from: q */
    private final Executor f4397q;

    /* renamed from: r */
    private List<MediaRoute2Info> f4398r = new ArrayList();

    /* renamed from: s */
    private Map<String, String> f4399s = new ArrayMap();

    /* renamed from: androidx.mediarouter.media.c$a */
    /* compiled from: MediaRoute2Provider */
    static abstract class C0940a {
        C0940a() {
        }

        /* renamed from: a */
        public abstract void mo4507a(C0985m.C0995e eVar);

        /* renamed from: b */
        public abstract void mo4508b(int i);

        /* renamed from: c */
        public abstract void mo4509c(String str, int i);
    }

    /* renamed from: androidx.mediarouter.media.c$b */
    /* compiled from: MediaRoute2Provider */
    private class C0941b extends MediaRouter2.ControllerCallback {
        C0941b() {
        }

        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            C0939c.this.mo4505G(routingController);
        }
    }

    /* renamed from: androidx.mediarouter.media.c$c */
    /* compiled from: MediaRoute2Provider */
    private class C0942c extends C0985m.C0987b {

        /* renamed from: f */
        final String f4401f;

        /* renamed from: g */
        final MediaRouter2.RoutingController f4402g;

        /* renamed from: h */
        final Messenger f4403h;

        /* renamed from: i */
        final Messenger f4404i;

        /* renamed from: j */
        final SparseArray<C1003s.C1007d> f4405j = new SparseArray<>();

        /* renamed from: k */
        final Handler f4406k;

        /* renamed from: l */
        AtomicInteger f4407l = new AtomicInteger(1);

        /* renamed from: m */
        private final Runnable f4408m = new C0948d(this);

        /* renamed from: n */
        int f4409n = -1;

        /* renamed from: androidx.mediarouter.media.c$c$a */
        /* compiled from: MediaRoute2Provider */
        class C0943a extends Handler {
            C0943a() {
                super(Looper.getMainLooper());
            }

            public void handleMessage(Message message) {
                String str;
                int i = message.what;
                int i2 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                C1003s.C1007d dVar = C0942c.this.f4405j.get(i2);
                if (dVar == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                C0942c.this.f4405j.remove(i2);
                if (i == 3) {
                    dVar.mo4423b((Bundle) obj);
                } else if (i == 4) {
                    if (peekData == null) {
                        str = null;
                    } else {
                        str = peekData.getString("error");
                    }
                    dVar.mo4422a(str, (Bundle) obj);
                }
            }
        }

        C0942c(MediaRouter2.RoutingController routingController, String str) {
            Messenger messenger;
            this.f4402g = routingController;
            this.f4401f = str;
            Messenger B = C0939c.m4863B(routingController);
            this.f4403h = B;
            if (B == null) {
                messenger = null;
            } else {
                messenger = new Messenger(new C0943a());
            }
            this.f4404i = messenger;
            this.f4406k = new Handler(Looper.getMainLooper());
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m4879s() {
            this.f4409n = -1;
        }

        /* renamed from: t */
        private void m4880t() {
            this.f4406k.removeCallbacks(this.f4408m);
            this.f4406k.postDelayed(this.f4408m, 1000);
        }

        /* renamed from: d */
        public boolean mo4490d(Intent intent, C1003s.C1007d dVar) {
            MediaRouter2.RoutingController routingController = this.f4402g;
            if (!(routingController == null || routingController.isReleased() || this.f4403h == null)) {
                int andIncrement = this.f4407l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 9;
                obtain.arg1 = andIncrement;
                obtain.obj = intent;
                obtain.replyTo = this.f4404i;
                try {
                    this.f4403h.send(obtain);
                    if (dVar == null) {
                        return true;
                    }
                    this.f4405j.put(andIncrement, dVar);
                    return true;
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e("MR2Provider", "Could not send control request to service.", e);
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo4491e() {
            this.f4402g.release();
        }

        /* renamed from: g */
        public void mo4493g(int i) {
            MediaRouter2.RoutingController routingController = this.f4402g;
            if (routingController != null) {
                routingController.setVolume(i);
                this.f4409n = i;
                m4880t();
            }
        }

        /* renamed from: j */
        public void mo4496j(int i) {
            MediaRouter2.RoutingController routingController = this.f4402g;
            if (routingController != null) {
                int i2 = this.f4409n;
                if (i2 < 0) {
                    i2 = routingController.getVolume();
                }
                int max = Math.max(0, Math.min(i2 + i, this.f4402g.getVolumeMax()));
                this.f4409n = max;
                this.f4402g.setVolume(max);
                m4880t();
            }
        }

        /* renamed from: n */
        public void mo4499n(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info C = C0939c.this.mo4503C(str);
            if (C == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=" + str);
                return;
            }
            this.f4402g.selectRoute(C);
        }

        /* renamed from: o */
        public void mo4500o(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info C = C0939c.this.mo4503C(str);
            if (C == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=" + str);
                return;
            }
            this.f4402g.deselectRoute(C);
        }

        /* renamed from: p */
        public void mo4501p(List<String> list) {
            if (list == null || list.isEmpty()) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
                return;
            }
            String str = list.get(0);
            MediaRoute2Info C = C0939c.this.mo4503C(str);
            if (C == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            C0939c.this.f4390j.transferTo(C);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4511u(String str, int i) {
            int andIncrement = this.f4407l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f4404i;
            try {
                this.f4403h.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4512v(String str, int i) {
            int andIncrement = this.f4407l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f4404i;
            try {
                this.f4403h.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.c$d */
    /* compiled from: MediaRoute2Provider */
    private class C0944d extends C0985m.C0995e {

        /* renamed from: a */
        final String f4412a;

        /* renamed from: b */
        final C0942c f4413b;

        C0944d(String str, C0942c cVar) {
            this.f4412a = str;
            this.f4413b = cVar;
        }

        /* renamed from: g */
        public void mo4493g(int i) {
            C0942c cVar;
            String str = this.f4412a;
            if (str != null && (cVar = this.f4413b) != null) {
                cVar.mo4511u(str, i);
            }
        }

        /* renamed from: j */
        public void mo4496j(int i) {
            C0942c cVar;
            String str = this.f4412a;
            if (str != null && (cVar = this.f4413b) != null) {
                cVar.mo4512v(str, i);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.c$e */
    /* compiled from: MediaRoute2Provider */
    private class C0945e extends MediaRouter2.RouteCallback {
        C0945e() {
        }

        public void onRoutesAdded(List<MediaRoute2Info> list) {
            C0939c.this.mo4504F();
        }

        public void onRoutesChanged(List<MediaRoute2Info> list) {
            C0939c.this.mo4504F();
        }

        public void onRoutesRemoved(List<MediaRoute2Info> list) {
            C0939c.this.mo4504F();
        }
    }

    /* renamed from: androidx.mediarouter.media.c$f */
    /* compiled from: MediaRoute2Provider */
    private class C0946f extends MediaRouter2.TransferCallback {
        C0946f() {
        }

        public void onStop(MediaRouter2.RoutingController routingController) {
            C0985m.C0995e remove = C0939c.this.f4392l.remove(routingController);
            if (remove != null) {
                C0939c.this.f4391k.mo4507a(remove);
                return;
            }
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
        }

        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            C0939c.this.f4392l.remove(routingController);
            if (routingController2 == C0939c.this.f4390j.getSystemController()) {
                C0939c.this.f4391k.mo4508b(3);
                return;
            }
            List selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            String id = ((MediaRoute2Info) selectedRoutes.get(0)).getId();
            C0939c.this.f4392l.put(routingController2, new C0942c(routingController2, id));
            C0939c.this.f4391k.mo4509c(id, 3);
            C0939c.this.mo4505G(routingController2);
        }

        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    C0939c(Context context, C0940a aVar) {
        super(context);
        this.f4390j = MediaRouter2.getInstance(context);
        this.f4391k = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f4396p = handler;
        Objects.requireNonNull(handler);
        this.f4397q = new C2635b(handler);
    }

    /* renamed from: B */
    static Messenger m4863B(MediaRouter2.RoutingController routingController) {
        Bundle controlHints;
        if (routingController == null || (controlHints = routingController.getControlHints()) == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    /* renamed from: D */
    static String m4864D(C0985m.C0995e eVar) {
        MediaRouter2.RoutingController routingController;
        if ((eVar instanceof C0942c) && (routingController = ((C0942c) eVar).f4402g) != null) {
            return routingController.getId();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ boolean m4865E(MediaRoute2Info mediaRoute2Info) {
        return !mediaRoute2Info.isSystemRoute();
    }

    /* renamed from: I */
    private C2639f m4866I(C2639f fVar, boolean z) {
        if (fVar == null) {
            fVar = new C2639f(C1001r.f4553c, false);
        }
        List<String> e = fVar.mo9289d().mo4691e();
        if (!z) {
            e.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!e.contains("android.media.intent.category.LIVE_AUDIO")) {
            e.add("android.media.intent.category.LIVE_AUDIO");
        }
        return new C2639f(new C1001r.C1002a().mo4698a(e).mo4701d(), fVar.mo9290e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public MediaRoute2Info mo4503C(String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info next : this.f4398r) {
            if (TextUtils.equals(next.getId(), str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo4504F() {
        List<MediaRoute2Info> list = (List) this.f4390j.getRoutes().stream().distinct().filter(C0927b.f4349a).collect(Collectors.toList());
        if (!list.equals(this.f4398r)) {
            this.f4398r = list;
            this.f4399s.clear();
            for (MediaRoute2Info next : this.f4398r) {
                Bundle extras = next.getExtras();
                if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                    Log.w("MR2Provider", "Cannot find the original route Id. route=" + next);
                } else {
                    this.f4399s.put(next.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
                }
            }
            mo4655x(new C0996n.C0997a().mo4686e(true).mo4683b((List) this.f4398r.stream().map(C0923a.f4348a).filter(C2636c.f10390a).collect(Collectors.toList())).mo4684c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo4505G(MediaRouter2.RoutingController routingController) {
        C0942c cVar = this.f4392l.get(routingController);
        if (cVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<String> a = C1028x.m5295a(routingController.getSelectedRoutes());
        C0983l f = C1028x.m5300f((MediaRoute2Info) routingController.getSelectedRoutes().get(0));
        C0983l lVar = null;
        Bundle controlHints = routingController.getControlHints();
        String string = mo4649n().getString(C1542j.mr_dialog_default_group_name);
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    lVar = C0983l.m5016e(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (lVar == null) {
            lVar = new C0983l.C0984a(routingController.getId(), string).mo4633g(2).mo4642p(1).mo4644r(routingController.getVolume()).mo4646t(routingController.getVolumeMax()).mo4645s(routingController.getVolumeHandling()).mo4628b(f.mo4607g()).mo4630d(a).mo4631e();
        }
        List<String> a2 = C1028x.m5295a(routingController.getSelectableRoutes());
        List<String> a3 = C1028x.m5295a(routingController.getDeselectableRoutes());
        C0996n o = mo4650o();
        if (o == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C0983l> c = o.mo4678c();
        if (!c.isEmpty()) {
            for (C0983l next : c) {
                String m = next.mo4613m();
                arrayList.add(new C0985m.C0987b.C0990c.C0991a(next).mo4672e(a.contains(m) ? 3 : 1).mo4669b(a2.contains(m)).mo4671d(a3.contains(m)).mo4670c(true).mo4668a());
            }
        }
        cVar.mo4658m(lVar, arrayList);
    }

    /* renamed from: H */
    public void mo4506H(String str) {
        MediaRoute2Info C = mo4503C(str);
        if (C == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.f4390j.transferTo(C);
    }

    /* renamed from: s */
    public C0985m.C0987b mo4452s(String str) {
        for (Map.Entry<MediaRouter2.RoutingController, C0942c> value : this.f4392l.entrySet()) {
            C0942c cVar = (C0942c) value.getValue();
            if (TextUtils.equals(str, cVar.f4401f)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public C0985m.C0995e mo4453t(String str) {
        return new C0944d(this.f4399s.get(str), (C0942c) null);
    }

    /* renamed from: u */
    public C0985m.C0995e mo4455u(String str, String str2) {
        String str3 = this.f4399s.get(str);
        for (C0942c next : this.f4392l.values()) {
            if (TextUtils.equals(str2, next.f4402g.getId())) {
                return new C0944d(str3, next);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C0944d(str3, (C0942c) null);
    }

    /* renamed from: v */
    public void mo4456v(C2639f fVar) {
        if (C1003s.m5132g() > 0) {
            this.f4390j.registerRouteCallback(this.f4397q, this.f4393m, C1028x.m5297c(m4866I(fVar, C1003s.m5135o())));
            this.f4390j.registerTransferCallback(this.f4397q, this.f4394n);
            this.f4390j.registerControllerCallback(this.f4397q, this.f4395o);
            return;
        }
        this.f4390j.unregisterRouteCallback(this.f4393m);
        this.f4390j.unregisterTransferCallback(this.f4394n);
        this.f4390j.unregisterControllerCallback(this.f4395o);
    }
}
