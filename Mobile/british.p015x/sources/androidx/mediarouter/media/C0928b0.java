package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C1003s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p018c1.C2639f;

/* renamed from: androidx.mediarouter.media.b0 */
/* compiled from: RegisteredMediaRouteProvider */
final class C0928b0 extends C0985m implements ServiceConnection {

    /* renamed from: r */
    static final boolean f4350r = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* renamed from: j */
    private final ComponentName f4351j;

    /* renamed from: k */
    final C0934d f4352k;

    /* renamed from: l */
    private final ArrayList<C0933c> f4353l = new ArrayList<>();

    /* renamed from: m */
    private boolean f4354m;

    /* renamed from: n */
    private boolean f4355n;

    /* renamed from: o */
    private C0929a f4356o;

    /* renamed from: p */
    private boolean f4357p;

    /* renamed from: q */
    private C0932b f4358q;

    /* renamed from: androidx.mediarouter.media.b0$a */
    /* compiled from: RegisteredMediaRouteProvider */
    private final class C0929a implements IBinder.DeathRecipient {

        /* renamed from: b */
        private final Messenger f4359b;

        /* renamed from: c */
        private final C0935e f4360c;

        /* renamed from: d */
        private final Messenger f4361d;

        /* renamed from: e */
        private int f4362e = 1;

        /* renamed from: f */
        private int f4363f = 1;

        /* renamed from: g */
        private int f4364g;

        /* renamed from: h */
        private int f4365h;

        /* renamed from: i */
        private final SparseArray<C1003s.C1007d> f4366i = new SparseArray<>();

        /* renamed from: androidx.mediarouter.media.b0$a$a */
        /* compiled from: RegisteredMediaRouteProvider */
        class C0930a implements Runnable {
            C0930a() {
            }

            public void run() {
                C0929a.this.mo4462e();
            }
        }

        /* renamed from: androidx.mediarouter.media.b0$a$b */
        /* compiled from: RegisteredMediaRouteProvider */
        class C0931b implements Runnable {
            C0931b() {
            }

            public void run() {
                C0929a aVar = C0929a.this;
                C0928b0.this.mo4441K(aVar);
            }
        }

        public C0929a(Messenger messenger) {
            this.f4359b = messenger;
            C0935e eVar = new C0935e(this);
            this.f4360c = eVar;
            this.f4361d = new Messenger(eVar);
        }

        /* renamed from: t */
        private boolean m4803t(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.f4361d;
            try {
                this.f4359b.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
        }

        /* renamed from: a */
        public void mo4457a(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            m4803t(12, i2, i, (Object) null, bundle);
        }

        /* renamed from: b */
        public int mo4458b(String str, C1003s.C1007d dVar) {
            int i = this.f4363f;
            this.f4363f = i + 1;
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            m4803t(11, i2, i, (Object) null, bundle);
            this.f4366i.put(i2, dVar);
            return i;
        }

        public void binderDied() {
            C0928b0.this.f4352k.post(new C0931b());
        }

        /* renamed from: c */
        public int mo4460c(String str, String str2) {
            int i = this.f4363f;
            this.f4363f = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            m4803t(3, i2, i, (Object) null, bundle);
            return i;
        }

        /* renamed from: d */
        public void mo4461d() {
            m4803t(2, 0, 0, (Object) null, (Bundle) null);
            this.f4360c.mo4488a();
            this.f4359b.getBinder().unlinkToDeath(this, 0);
            C0928b0.this.f4352k.post(new C0930a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4462e() {
            int size = this.f4366i.size();
            for (int i = 0; i < size; i++) {
                this.f4366i.valueAt(i).mo4422a((String) null, (Bundle) null);
            }
            this.f4366i.clear();
        }

        /* renamed from: f */
        public boolean mo4463f(int i, String str, Bundle bundle) {
            C1003s.C1007d dVar = this.f4366i.get(i);
            if (dVar == null) {
                return false;
            }
            this.f4366i.remove(i);
            dVar.mo4422a(str, bundle);
            return true;
        }

        /* renamed from: g */
        public boolean mo4464g(int i, Bundle bundle) {
            C1003s.C1007d dVar = this.f4366i.get(i);
            if (dVar == null) {
                return false;
            }
            this.f4366i.remove(i);
            dVar.mo4423b(bundle);
            return true;
        }

        /* renamed from: h */
        public void mo4465h(int i) {
            C0928b0.this.mo4439I(this, i);
        }

        /* renamed from: i */
        public boolean mo4466i(Bundle bundle) {
            if (this.f4364g == 0) {
                return false;
            }
            C0928b0.this.mo4440J(this, C0996n.m5106b(bundle));
            return true;
        }

        /* renamed from: j */
        public void mo4467j(int i, Bundle bundle) {
            C1003s.C1007d dVar = this.f4366i.get(i);
            if (bundle == null || !bundle.containsKey("routeId")) {
                dVar.mo4422a("DynamicGroupRouteController is created without valid route id.", bundle);
                return;
            }
            this.f4366i.remove(i);
            dVar.mo4423b(bundle);
        }

        /* renamed from: k */
        public boolean mo4468k(int i, Bundle bundle) {
            if (this.f4364g == 0) {
                return false;
            }
            C0983l lVar = null;
            Bundle bundle2 = (Bundle) bundle.getParcelable("groupRoute");
            if (bundle2 != null) {
                lVar = C0983l.m5016e(bundle2);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(C0985m.C0987b.C0990c.m5084a((Bundle) it.next()));
            }
            C0928b0.this.mo4445O(this, i, lVar, arrayList);
            return true;
        }

        /* renamed from: l */
        public boolean mo4469l(int i) {
            if (i == this.f4365h) {
                this.f4365h = 0;
                C0928b0.this.mo4442L(this, "Registration failed");
            }
            C1003s.C1007d dVar = this.f4366i.get(i);
            if (dVar == null) {
                return true;
            }
            this.f4366i.remove(i);
            dVar.mo4422a((String) null, (Bundle) null);
            return true;
        }

        /* renamed from: m */
        public boolean mo4470m(int i) {
            return true;
        }

        /* renamed from: n */
        public boolean mo4471n(int i, int i2, Bundle bundle) {
            if (this.f4364g != 0 || i != this.f4365h || i2 < 1) {
                return false;
            }
            this.f4365h = 0;
            this.f4364g = i2;
            C0928b0.this.mo4440J(this, C0996n.m5106b(bundle));
            C0928b0.this.mo4443M(this);
            return true;
        }

        /* renamed from: o */
        public boolean mo4472o() {
            int i = this.f4362e;
            this.f4362e = i + 1;
            this.f4365h = i;
            if (!m4803t(1, i, 4, (Object) null, (Bundle) null)) {
                return false;
            }
            try {
                this.f4359b.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        /* renamed from: p */
        public void mo4473p(int i) {
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            m4803t(4, i2, i, (Object) null, (Bundle) null);
        }

        /* renamed from: q */
        public void mo4474q(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            m4803t(13, i2, i, (Object) null, bundle);
        }

        /* renamed from: r */
        public void mo4475r(int i) {
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            m4803t(5, i2, i, (Object) null, (Bundle) null);
        }

        /* renamed from: s */
        public boolean mo4476s(int i, Intent intent, C1003s.C1007d dVar) {
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            if (!m4803t(9, i2, i, intent, (Bundle) null)) {
                return false;
            }
            if (dVar == null) {
                return true;
            }
            this.f4366i.put(i2, dVar);
            return true;
        }

        /* renamed from: u */
        public void mo4477u(C2639f fVar) {
            int i = this.f4362e;
            this.f4362e = i + 1;
            m4803t(10, i, 0, fVar != null ? fVar.mo9288a() : null, (Bundle) null);
        }

        /* renamed from: v */
        public void mo4478v(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f4362e;
            this.f4362e = i3 + 1;
            m4803t(7, i3, i, (Object) null, bundle);
        }

        /* renamed from: w */
        public void mo4479w(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.f4362e;
            this.f4362e = i3 + 1;
            m4803t(6, i3, i, (Object) null, bundle);
        }

        /* renamed from: x */
        public void mo4480x(int i, List<String> list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList(list));
            int i2 = this.f4362e;
            this.f4362e = i2 + 1;
            m4803t(14, i2, i, (Object) null, bundle);
        }

        /* renamed from: y */
        public void mo4481y(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f4362e;
            this.f4362e = i3 + 1;
            m4803t(8, i3, i, (Object) null, bundle);
        }
    }

    /* renamed from: androidx.mediarouter.media.b0$b */
    /* compiled from: RegisteredMediaRouteProvider */
    interface C0932b {
        /* renamed from: a */
        void mo4484a(C0985m.C0995e eVar);
    }

    /* renamed from: androidx.mediarouter.media.b0$c */
    /* compiled from: RegisteredMediaRouteProvider */
    interface C0933c {
        /* renamed from: a */
        int mo4485a();

        /* renamed from: b */
        void mo4486b();

        /* renamed from: c */
        void mo4487c(C0929a aVar);
    }

    /* renamed from: androidx.mediarouter.media.b0$d */
    /* compiled from: RegisteredMediaRouteProvider */
    private static final class C0934d extends Handler {
        C0934d() {
        }
    }

    /* renamed from: androidx.mediarouter.media.b0$e */
    /* compiled from: RegisteredMediaRouteProvider */
    private static final class C0935e extends Handler {

        /* renamed from: a */
        private final WeakReference<C0929a> f4370a;

        public C0935e(C0929a aVar) {
            this.f4370a = new WeakReference<>(aVar);
        }

        /* renamed from: b */
        private boolean m4832b(C0929a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            String str;
            switch (i) {
                case 0:
                    aVar.mo4469l(i2);
                    return true;
                case 1:
                    aVar.mo4470m(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.mo4471n(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.mo4464g(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return false;
                    }
                    if (bundle == null) {
                        str = null;
                    } else {
                        str = bundle.getString("error");
                    }
                    return aVar.mo4463f(i2, str, (Bundle) obj);
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.mo4466i((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (obj instanceof Bundle) {
                        aVar.mo4467j(i2, (Bundle) obj);
                        return false;
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.mo4468k(i3, (Bundle) obj);
                    }
                    return false;
                case 8:
                    aVar.mo4465h(i3);
                    return false;
                default:
                    return false;
            }
        }

        /* renamed from: a */
        public void mo4488a() {
            this.f4370a.clear();
        }

        public void handleMessage(Message message) {
            C0929a aVar = (C0929a) this.f4370a.get();
            if (aVar != null) {
                if (!m4832b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && C0928b0.f4350r) {
                    Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.b0$f */
    /* compiled from: RegisteredMediaRouteProvider */
    private final class C0936f extends C0985m.C0987b implements C0933c {

        /* renamed from: f */
        private final String f4371f;

        /* renamed from: g */
        String f4372g;

        /* renamed from: h */
        String f4373h;

        /* renamed from: i */
        private boolean f4374i;

        /* renamed from: j */
        private int f4375j = -1;

        /* renamed from: k */
        private int f4376k;

        /* renamed from: l */
        private C0929a f4377l;

        /* renamed from: m */
        private int f4378m = -1;

        /* renamed from: androidx.mediarouter.media.b0$f$a */
        /* compiled from: RegisteredMediaRouteProvider */
        class C0937a extends C1003s.C1007d {
            C0937a() {
            }

            /* renamed from: a */
            public void mo4422a(String str, Bundle bundle) {
                Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
            }

            /* renamed from: b */
            public void mo4423b(Bundle bundle) {
                C0936f.this.f4372g = bundle.getString("groupableTitle");
                C0936f.this.f4373h = bundle.getString("transferableTitle");
            }
        }

        C0936f(String str) {
            this.f4371f = str;
        }

        /* renamed from: a */
        public int mo4485a() {
            return this.f4378m;
        }

        /* renamed from: b */
        public void mo4486b() {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4473p(this.f4378m);
                this.f4377l = null;
                this.f4378m = 0;
            }
        }

        /* renamed from: c */
        public void mo4487c(C0929a aVar) {
            C0937a aVar2 = new C0937a();
            this.f4377l = aVar;
            int b = aVar.mo4458b(this.f4371f, aVar2);
            this.f4378m = b;
            if (this.f4374i) {
                aVar.mo4475r(b);
                int i = this.f4375j;
                if (i >= 0) {
                    aVar.mo4478v(this.f4378m, i);
                    this.f4375j = -1;
                }
                int i2 = this.f4376k;
                if (i2 != 0) {
                    aVar.mo4481y(this.f4378m, i2);
                    this.f4376k = 0;
                }
            }
        }

        /* renamed from: d */
        public boolean mo4490d(Intent intent, C1003s.C1007d dVar) {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                return aVar.mo4476s(this.f4378m, intent, dVar);
            }
            return false;
        }

        /* renamed from: e */
        public void mo4491e() {
            C0928b0.this.mo4444N(this);
        }

        /* renamed from: f */
        public void mo4492f() {
            this.f4374i = true;
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4475r(this.f4378m);
            }
        }

        /* renamed from: g */
        public void mo4493g(int i) {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4478v(this.f4378m, i);
                return;
            }
            this.f4375j = i;
            this.f4376k = 0;
        }

        /* renamed from: h */
        public void mo4494h() {
            mo4495i(0);
        }

        /* renamed from: i */
        public void mo4495i(int i) {
            this.f4374i = false;
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4479w(this.f4378m, i);
            }
        }

        /* renamed from: j */
        public void mo4496j(int i) {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4481y(this.f4378m, i);
            } else {
                this.f4376k += i;
            }
        }

        /* renamed from: k */
        public String mo4497k() {
            return this.f4372g;
        }

        /* renamed from: l */
        public String mo4498l() {
            return this.f4373h;
        }

        /* renamed from: n */
        public void mo4499n(String str) {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4457a(this.f4378m, str);
            }
        }

        /* renamed from: o */
        public void mo4500o(String str) {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4474q(this.f4378m, str);
            }
        }

        /* renamed from: p */
        public void mo4501p(List<String> list) {
            C0929a aVar = this.f4377l;
            if (aVar != null) {
                aVar.mo4480x(this.f4378m, list);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo4502r(C0983l lVar, List<C0985m.C0987b.C0990c> list) {
            mo4658m(lVar, list);
        }
    }

    /* renamed from: androidx.mediarouter.media.b0$g */
    /* compiled from: RegisteredMediaRouteProvider */
    private final class C0938g extends C0985m.C0995e implements C0933c {

        /* renamed from: a */
        private final String f4381a;

        /* renamed from: b */
        private final String f4382b;

        /* renamed from: c */
        private boolean f4383c;

        /* renamed from: d */
        private int f4384d = -1;

        /* renamed from: e */
        private int f4385e;

        /* renamed from: f */
        private C0929a f4386f;

        /* renamed from: g */
        private int f4387g;

        C0938g(String str, String str2) {
            this.f4381a = str;
            this.f4382b = str2;
        }

        /* renamed from: a */
        public int mo4485a() {
            return this.f4387g;
        }

        /* renamed from: b */
        public void mo4486b() {
            C0929a aVar = this.f4386f;
            if (aVar != null) {
                aVar.mo4473p(this.f4387g);
                this.f4386f = null;
                this.f4387g = 0;
            }
        }

        /* renamed from: c */
        public void mo4487c(C0929a aVar) {
            this.f4386f = aVar;
            int c = aVar.mo4460c(this.f4381a, this.f4382b);
            this.f4387g = c;
            if (this.f4383c) {
                aVar.mo4475r(c);
                int i = this.f4384d;
                if (i >= 0) {
                    aVar.mo4478v(this.f4387g, i);
                    this.f4384d = -1;
                }
                int i2 = this.f4385e;
                if (i2 != 0) {
                    aVar.mo4481y(this.f4387g, i2);
                    this.f4385e = 0;
                }
            }
        }

        /* renamed from: d */
        public boolean mo4490d(Intent intent, C1003s.C1007d dVar) {
            C0929a aVar = this.f4386f;
            if (aVar != null) {
                return aVar.mo4476s(this.f4387g, intent, dVar);
            }
            return false;
        }

        /* renamed from: e */
        public void mo4491e() {
            C0928b0.this.mo4444N(this);
        }

        /* renamed from: f */
        public void mo4492f() {
            this.f4383c = true;
            C0929a aVar = this.f4386f;
            if (aVar != null) {
                aVar.mo4475r(this.f4387g);
            }
        }

        /* renamed from: g */
        public void mo4493g(int i) {
            C0929a aVar = this.f4386f;
            if (aVar != null) {
                aVar.mo4478v(this.f4387g, i);
                return;
            }
            this.f4384d = i;
            this.f4385e = 0;
        }

        /* renamed from: h */
        public void mo4494h() {
            mo4495i(0);
        }

        /* renamed from: i */
        public void mo4495i(int i) {
            this.f4383c = false;
            C0929a aVar = this.f4386f;
            if (aVar != null) {
                aVar.mo4479w(this.f4387g, i);
            }
        }

        /* renamed from: j */
        public void mo4496j(int i) {
            C0929a aVar = this.f4386f;
            if (aVar != null) {
                aVar.mo4481y(this.f4387g, i);
            } else {
                this.f4385e += i;
            }
        }
    }

    public C0928b0(Context context, ComponentName componentName) {
        super(context, new C0985m.C0994d(componentName));
        this.f4351j = componentName;
        this.f4352k = new C0934d();
    }

    /* renamed from: A */
    private void m4777A() {
        int size = this.f4353l.size();
        for (int i = 0; i < size; i++) {
            this.f4353l.get(i).mo4487c(this.f4356o);
        }
    }

    /* renamed from: B */
    private void m4778B() {
        if (!this.f4355n) {
            boolean z = f4350r;
            if (z) {
                Log.d("MediaRouteProviderProxy", this + ": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f4351j);
            int i = 1;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 4097;
                }
                boolean bindService = mo4649n().bindService(intent, this, i);
                this.f4355n = bindService;
                if (!bindService && z) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed");
                }
            } catch (SecurityException e) {
                if (f4350r) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed", e);
                }
            }
        }
    }

    /* renamed from: C */
    private C0985m.C0987b m4779C(String str) {
        C0996n o = mo4650o();
        if (o == null) {
            return null;
        }
        List<C0983l> c = o.mo4678c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            if (c.get(i).mo4613m().equals(str)) {
                C0936f fVar = new C0936f(str);
                this.f4353l.add(fVar);
                if (this.f4357p) {
                    fVar.mo4487c(this.f4356o);
                }
                m4786V();
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: D */
    private C0985m.C0995e m4780D(String str, String str2) {
        C0996n o = mo4650o();
        if (o == null) {
            return null;
        }
        List<C0983l> c = o.mo4678c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            if (c.get(i).mo4613m().equals(str)) {
                C0938g gVar = new C0938g(str, str2);
                this.f4353l.add(gVar);
                if (this.f4357p) {
                    gVar.mo4487c(this.f4356o);
                }
                m4786V();
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: E */
    private void m4781E() {
        int size = this.f4353l.size();
        for (int i = 0; i < size; i++) {
            this.f4353l.get(i).mo4486b();
        }
    }

    /* renamed from: F */
    private void m4782F() {
        if (this.f4356o != null) {
            mo4655x((C0996n) null);
            this.f4357p = false;
            m4781E();
            this.f4356o.mo4461d();
            this.f4356o = null;
        }
    }

    /* renamed from: G */
    private C0933c m4783G(int i) {
        Iterator<C0933c> it = this.f4353l.iterator();
        while (it.hasNext()) {
            C0933c next = it.next();
            if (next.mo4485a() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: R */
    private boolean m4784R() {
        if (!this.f4354m) {
            return false;
        }
        if (mo4651p() == null && this.f4353l.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    private void m4785U() {
        if (this.f4355n) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f4355n = false;
            m4782F();
            try {
                mo4649n().unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    /* renamed from: V */
    private void m4786V() {
        if (m4784R()) {
            m4778B();
        } else {
            m4785U();
        }
    }

    /* renamed from: H */
    public boolean mo4438H(String str, String str2) {
        return this.f4351j.getPackageName().equals(str) && this.f4351j.getClassName().equals(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4439I(C0929a aVar, int i) {
        if (this.f4356o == aVar) {
            C0933c G = m4783G(i);
            C0932b bVar = this.f4358q;
            if (bVar != null && (G instanceof C0985m.C0995e)) {
                bVar.mo4484a((C0985m.C0995e) G);
            }
            mo4444N(G);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo4440J(C0929a aVar, C0996n nVar) {
        if (this.f4356o == aVar) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + nVar);
            }
            mo4655x(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4441K(C0929a aVar) {
        if (this.f4356o == aVar) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            m4782F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo4442L(C0929a aVar, String str) {
        if (this.f4356o == aVar) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            m4785U();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4443M(C0929a aVar) {
        if (this.f4356o == aVar) {
            this.f4357p = true;
            m4777A();
            C2639f p = mo4651p();
            if (p != null) {
                this.f4356o.mo4477u(p);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo4444N(C0933c cVar) {
        this.f4353l.remove(cVar);
        cVar.mo4486b();
        m4786V();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4445O(C0929a aVar, int i, C0983l lVar, List<C0985m.C0987b.C0990c> list) {
        if (this.f4356o == aVar) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": DynamicRouteDescriptors changed, descriptors=" + list);
            }
            C0933c G = m4783G(i);
            if (G instanceof C0936f) {
                ((C0936f) G).mo4502r(lVar, list);
            }
        }
    }

    /* renamed from: P */
    public void mo4446P() {
        if (this.f4356o == null && m4784R()) {
            m4785U();
            m4778B();
        }
    }

    /* renamed from: Q */
    public void mo4447Q(C0932b bVar) {
        this.f4358q = bVar;
    }

    /* renamed from: S */
    public void mo4448S() {
        if (!this.f4354m) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": Starting");
            }
            this.f4354m = true;
            m4786V();
        }
    }

    /* renamed from: T */
    public void mo4449T() {
        if (this.f4354m) {
            if (f4350r) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.f4354m = false;
            m4786V();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = f4350r;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f4355n) {
            m4782F();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (C0998o.m5116a(messenger)) {
                C0929a aVar = new C0929a(messenger);
                if (aVar.mo4472o()) {
                    this.f4356o = aVar;
                } else if (z) {
                    Log.d("MediaRouteProviderProxy", this + ": Registration failed");
                }
            } else {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (f4350r) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        m4782F();
    }

    /* renamed from: s */
    public C0985m.C0987b mo4452s(String str) {
        if (str != null) {
            return m4779C(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: t */
    public C0985m.C0995e mo4453t(String str) {
        if (str != null) {
            return m4780D(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.f4351j.flattenToShortString();
    }

    /* renamed from: u */
    public C0985m.C0995e mo4455u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return m4780D(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    /* renamed from: v */
    public void mo4456v(C2639f fVar) {
        if (this.f4357p) {
            this.f4356o.mo4477u(fVar);
        }
        m4786V();
    }
}
