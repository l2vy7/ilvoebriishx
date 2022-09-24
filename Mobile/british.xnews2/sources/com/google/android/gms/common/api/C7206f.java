package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7217a1;
import com.google.android.gms.common.api.internal.C7224b3;
import com.google.android.gms.common.api.internal.C7231d;
import com.google.android.gms.common.api.internal.C7240f;
import com.google.android.gms.common.api.internal.C7249h;
import com.google.android.gms.common.api.internal.C7270k3;
import com.google.android.gms.common.api.internal.C7276m;
import com.google.android.gms.common.api.internal.C7296q;
import com.google.android.gms.common.api.internal.C7308s2;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7439x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import p149t.C6077a;
import p263x5.C11095a;
import p263x5.C11099e;
import p263x5.C11100f;

@Deprecated
/* renamed from: com.google.android.gms.common.api.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7206f {
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")

    /* renamed from: a */
    public static final Set<C7206f> f28900a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C7207a {

        /* renamed from: a */
        private Account f28901a;

        /* renamed from: b */
        private final Set<Scope> f28902b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f28903c = new HashSet();

        /* renamed from: d */
        private int f28904d;

        /* renamed from: e */
        private View f28905e;

        /* renamed from: f */
        private String f28906f;

        /* renamed from: g */
        private String f28907g;

        /* renamed from: h */
        private final Map<C7191a<?>, C7439x> f28908h = new C6077a();

        /* renamed from: i */
        private final Context f28909i;

        /* renamed from: j */
        private final Map<C7191a<?>, C7191a.C7195d> f28910j = new C6077a();

        /* renamed from: k */
        private C7249h f28911k;

        /* renamed from: l */
        private int f28912l = -1;

        /* renamed from: m */
        private C7209c f28913m;

        /* renamed from: n */
        private Looper f28914n;

        /* renamed from: o */
        private C7190a f28915o = C7190a.m29483q();

        /* renamed from: p */
        private C7191a.C7192a<? extends C11100f, C11095a> f28916p = C11099e.f50067c;

        /* renamed from: q */
        private final ArrayList<C7208b> f28917q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C7209c> f28918r = new ArrayList<>();

        public C7207a(Context context) {
            this.f28909i = context;
            this.f28914n = context.getMainLooper();
            this.f28906f = context.getPackageName();
            this.f28907g = context.getClass().getName();
        }

        /* renamed from: a */
        public C7207a mo29777a(C7191a<Object> aVar) {
            C4604n.m20099l(aVar, "Api must not be null");
            this.f28910j.put(aVar, (Object) null);
            List<Scope> impliedScopes = ((C7191a.C7200e) C4604n.m20099l(aVar.mo29743c(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f28903c.addAll(impliedScopes);
            this.f28902b.addAll(impliedScopes);
            return this;
        }

        /* renamed from: b */
        public <O extends C7191a.C7195d.C7198c> C7207a mo29778b(C7191a<O> aVar, O o) {
            C4604n.m20099l(aVar, "Api must not be null");
            C4604n.m20099l(o, "Null options are not permitted for this Api");
            this.f28910j.put(aVar, o);
            List<Scope> impliedScopes = ((C7191a.C7200e) C4604n.m20099l(aVar.mo29743c(), "Base client builder must not be null")).getImpliedScopes(o);
            this.f28903c.addAll(impliedScopes);
            this.f28902b.addAll(impliedScopes);
            return this;
        }

        /* renamed from: c */
        public C7207a mo29779c(C7208b bVar) {
            C4604n.m20099l(bVar, "Listener must not be null");
            this.f28917q.add(bVar);
            return this;
        }

        /* renamed from: d */
        public C7207a mo29780d(C7209c cVar) {
            C4604n.m20099l(cVar, "Listener must not be null");
            this.f28918r.add(cVar);
            return this;
        }

        /* renamed from: e */
        public C7206f mo29781e() {
            C4604n.m20089b(!this.f28910j.isEmpty(), "must call addApi() to add at least one API");
            C4601e g = mo29783g();
            Map<C7191a<?>, C7439x> k = g.mo17987k();
            C6077a aVar = new C6077a();
            C6077a aVar2 = new C6077a();
            ArrayList arrayList = new ArrayList();
            C7191a aVar3 = null;
            boolean z = false;
            for (C7191a next : this.f28910j.keySet()) {
                C7191a.C7195d dVar = this.f28910j.get(next);
                boolean z2 = k.get(next) != null;
                aVar.put(next, Boolean.valueOf(z2));
                C7270k3 k3Var = new C7270k3(next, z2);
                arrayList.add(k3Var);
                C7191a.C7192a aVar4 = (C7191a.C7192a) C4604n.m20098k(next.mo29741a());
                C7191a aVar5 = next;
                C7191a.C7201f buildClient = aVar4.buildClient(this.f28909i, this.f28914n, g, dVar, (C7208b) k3Var, (C7209c) k3Var);
                aVar2.put(aVar5.mo29742b(), buildClient);
                if (aVar4.getPriority() == 1) {
                    z = dVar != null;
                }
                if (buildClient.providesSignIn()) {
                    if (aVar3 == null) {
                        aVar3 = aVar5;
                    } else {
                        String d = aVar5.mo29744d();
                        String d2 = aVar3.mo29744d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z) {
                    C4604n.m20103p(this.f28901a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.mo29744d());
                    C4604n.m20103p(this.f28902b.equals(this.f28903c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.mo29744d());
                } else {
                    String d3 = aVar3.mo29744d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C7217a1 a1Var = new C7217a1(this.f28909i, new ReentrantLock(), this.f28914n, g, this.f28915o, this.f28916p, aVar, this.f28917q, this.f28918r, aVar2, this.f28912l, C7217a1.m29574t(aVar2.values(), true), arrayList);
            synchronized (C7206f.f28900a) {
                C7206f.f28900a.add(a1Var);
            }
            if (this.f28912l >= 0) {
                C7224b3.m29610i(this.f28911k).mo29822j(this.f28912l, a1Var, this.f28913m);
            }
            return a1Var;
        }

        /* renamed from: f */
        public C7207a mo29782f(Handler handler) {
            C4604n.m20099l(handler, "Handler must not be null");
            this.f28914n = handler.getLooper();
            return this;
        }

        /* renamed from: g */
        public final C4601e mo29783g() {
            C11095a aVar = C11095a.f50055k;
            Map<C7191a<?>, C7191a.C7195d> map = this.f28910j;
            C7191a<C11095a> aVar2 = C11099e.f50071g;
            if (map.containsKey(aVar2)) {
                aVar = (C11095a) this.f28910j.get(aVar2);
            }
            return new C4601e(this.f28901a, this.f28902b, this.f28908h, this.f28904d, this.f28905e, this.f28906f, this.f28907g, aVar, false);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7208b extends C7240f {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7209c extends C7276m {
    }

    /* renamed from: j */
    public static Set<C7206f> m29521j() {
        Set<C7206f> set = f28900a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: d */
    public abstract ConnectionResult mo29768d();

    /* renamed from: e */
    public abstract C7210g<Status> mo29769e();

    /* renamed from: f */
    public abstract void mo29770f();

    /* renamed from: g */
    public abstract void mo29771g();

    /* renamed from: h */
    public abstract void mo29772h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: i */
    public <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17960i(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public Context mo17961k() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public Looper mo17962l() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public boolean mo29773m(C7296q qVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public void mo29774n() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: o */
    public abstract void mo29775o(C7209c cVar);

    /* renamed from: p */
    public abstract void mo29776p(C7209c cVar);

    /* renamed from: q */
    public void mo17963q(C7308s2 s2Var) {
        throw new UnsupportedOperationException();
    }
}
