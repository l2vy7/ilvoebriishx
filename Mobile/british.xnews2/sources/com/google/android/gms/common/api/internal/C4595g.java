package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.common.internal.C7389g;
import com.google.android.gms.common.internal.C7390g0;
import com.google.android.gms.common.internal.C7414o;
import com.google.android.gms.common.internal.C7420q;
import com.google.android.gms.common.internal.C7423r;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p006a5.C6487i;
import p149t.C6079b;
import p228l5.C10723k;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4595g implements Handler.Callback {

    /* renamed from: s */
    public static final Status f19990s = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Status f19991t = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final Object f19992u = new Object();
    @GuardedBy("lock")

    /* renamed from: v */
    private static C4595g f19993v;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f19994b = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f19995c = 120000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f19996d = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f19997e = false;

    /* renamed from: f */
    private TelemetryData f19998f;

    /* renamed from: g */
    private C7423r f19999g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f20000h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7190a f20001i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C7390g0 f20002j;

    /* renamed from: k */
    private final AtomicInteger f20003k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f20004l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C7220b<?>, C4596m1<?>> f20005m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: n */
    public C7216a0 f20006n = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: o */
    public final Set<C7220b<?>> f20007o = new C6079b();

    /* renamed from: p */
    private final Set<C7220b<?>> f20008p = new C6079b();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: q */
    public final Handler f20009q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile boolean f20010r = true;

    private C4595g(Context context, Looper looper, C7190a aVar) {
        this.f20000h = context;
        C10723k kVar = new C10723k(looper, this);
        this.f20009q = kVar;
        this.f20001i = aVar;
        this.f20002j = new C7390g0(aVar);
        if (C6487i.m28263a(context)) {
            this.f20010r = false;
        }
        kVar.sendMessage(kVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m19967a() {
        synchronized (f19992u) {
            C4595g gVar = f19993v;
            if (gVar != null) {
                gVar.f20004l.incrementAndGet();
                Handler handler = gVar.f20009q;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Status m19969i(C7220b<?> bVar, ConnectionResult connectionResult) {
        String b = bVar.mo29817b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    /* renamed from: j */
    private final C4596m1<?> m19970j(C4591e<?> eVar) {
        C7220b<?> apiKey = eVar.getApiKey();
        C4596m1<?> m1Var = this.f20005m.get(apiKey);
        if (m1Var == null) {
            m1Var = new C4596m1<>(this, eVar);
            this.f20005m.put(apiKey, m1Var);
        }
        if (m1Var.mo17952N()) {
            this.f20008p.add(apiKey);
        }
        m1Var.mo17942C();
        return m1Var;
    }

    /* renamed from: k */
    private final C7423r m19971k() {
        if (this.f19999g == null) {
            this.f19999g = C7420q.m30058a(this.f20000h);
        }
        return this.f19999g;
    }

    /* renamed from: l */
    private final void m19972l() {
        TelemetryData telemetryData = this.f19998f;
        if (telemetryData != null) {
            if (telemetryData.mo17973C0() > 0 || mo17936g()) {
                m19971k().mo30157b(telemetryData);
            }
            this.f19998f = null;
        }
    }

    /* renamed from: m */
    private final <T> void m19973m(TaskCompletionSource<T> taskCompletionSource, int i, C4591e eVar) {
        C7330x1 a;
        if (i != 0 && (a = C7330x1.m29884a(this, i, eVar.getApiKey())) != null) {
            Task<T> task = taskCompletionSource.getTask();
            Handler handler = this.f20009q;
            handler.getClass();
            task.addOnCompleteListener((Executor) new C7246g1(handler), (OnCompleteListener<T>) a);
        }
    }

    /* renamed from: y */
    public static C4595g m19983y(Context context) {
        C4595g gVar;
        synchronized (f19992u) {
            if (f19993v == null) {
                f19993v = new C4595g(context.getApplicationContext(), C7389g.m30000c().getLooper(), C7190a.m29483q());
            }
            gVar = f19993v;
        }
        return gVar;
    }

    /* renamed from: A */
    public final Task<Boolean> mo17925A(C4591e<?> eVar) {
        C7221b0 b0Var = new C7221b0(eVar.getApiKey());
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(14, b0Var));
        return b0Var.mo29821b().getTask();
    }

    /* renamed from: B */
    public final <O extends C7191a.C7195d> Task<Void> mo17926B(C4591e<O> eVar, C7280n<C7191a.C7193b, ?> nVar, C7320v<C7191a.C7193b, ?> vVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m19973m(taskCompletionSource, nVar.mo29904e(), eVar);
        C7327w2 w2Var = new C7327w2(new C7229c2(nVar, vVar, runnable), taskCompletionSource);
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(8, new C7223b2(w2Var, this.f20004l.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: C */
    public final <O extends C7191a.C7195d> Task<Boolean> mo17927C(C4591e<O> eVar, C7259j.C7260a aVar, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m19973m(taskCompletionSource, i, eVar);
        C7335y2 y2Var = new C7335y2(aVar, taskCompletionSource);
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(13, new C7223b2(y2Var, this.f20004l.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: H */
    public final <O extends C7191a.C7195d> void mo17928H(C4591e<O> eVar, int i, C7231d<? extends C7341k, C7191a.C7193b> dVar) {
        C7323v2 v2Var = new C7323v2(i, dVar);
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(4, new C7223b2(v2Var, this.f20004l.get(), eVar)));
    }

    /* renamed from: I */
    public final <O extends C7191a.C7195d, ResultT> void mo17929I(C4591e<O> eVar, int i, C7310t<C7191a.C7193b, ResultT> tVar, TaskCompletionSource<ResultT> taskCompletionSource, C7301r rVar) {
        m19973m(taskCompletionSource, tVar.mo29935d(), eVar);
        C7331x2 x2Var = new C7331x2(i, tVar, taskCompletionSource, rVar);
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(4, new C7223b2(x2Var, this.f20004l.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo17930J(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(18, new C7334y1(methodInvocation, i, j, i2)));
    }

    /* renamed from: K */
    public final void mo17931K(ConnectionResult connectionResult, int i) {
        if (!mo17937h(connectionResult, i)) {
            Handler handler = this.f20009q;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void mo17932b() {
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo17933c(C4591e<?> eVar) {
        Handler handler = this.f20009q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: d */
    public final void mo17934d(C7216a0 a0Var) {
        synchronized (f19992u) {
            if (this.f20006n != a0Var) {
                this.f20006n = a0Var;
                this.f20007o.clear();
            }
            this.f20007o.addAll(a0Var.mo29809i());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo17935e(C7216a0 a0Var) {
        synchronized (f19992u) {
            if (this.f20006n == a0Var) {
                this.f20006n = null;
                this.f20007o.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo17936g() {
        if (this.f19997e) {
            return false;
        }
        RootTelemetryConfiguration a = C7414o.m30045b().mo30145a();
        if (a != null && !a.mo30035E0()) {
            return false;
        }
        int a2 = this.f20002j.mo30098a(this.f20000h, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo17937h(ConnectionResult connectionResult, int i) {
        return this.f20001i.mo29704A(this.f20000h, connectionResult, i);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        long j = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
        C4596m1 m1Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
                }
                this.f19996d = j;
                this.f20009q.removeMessages(12);
                for (C7220b<?> obtainMessage : this.f20005m.keySet()) {
                    Handler handler = this.f20009q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f19996d);
                }
                break;
            case 2:
                C7230c3 c3Var = (C7230c3) message.obj;
                Iterator<C7220b<?>> it = c3Var.mo29840a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C7220b next = it.next();
                        C4596m1 m1Var2 = this.f20005m.get(next);
                        if (m1Var2 == null) {
                            c3Var.mo29841b(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (m1Var2.mo17951M()) {
                            c3Var.mo29841b(next, ConnectionResult.f28862f, m1Var2.mo17958s().getEndpointPackageName());
                        } else {
                            ConnectionResult q = m1Var2.mo17957q();
                            if (q != null) {
                                c3Var.mo29841b(next, q, (String) null);
                            } else {
                                m1Var2.mo17947H(c3Var);
                                m1Var2.mo17942C();
                            }
                        }
                    }
                }
            case 3:
                for (C4596m1 next2 : this.f20005m.values()) {
                    next2.mo17941B();
                    next2.mo17942C();
                }
                break;
            case 4:
            case 8:
            case 13:
                C7223b2 b2Var = (C7223b2) message.obj;
                C4596m1<?> m1Var3 = this.f20005m.get(b2Var.f28976c.getApiKey());
                if (m1Var3 == null) {
                    m1Var3 = m19970j(b2Var.f28976c);
                }
                if (m1Var3.mo17952N() && this.f20004l.get() != b2Var.f28975b) {
                    b2Var.f28974a.mo29920a(f19990s);
                    m1Var3.mo17949J();
                    break;
                } else {
                    m1Var3.mo17943D(b2Var.f28974a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C4596m1<?>> it2 = this.f20005m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C4596m1 next3 = it2.next();
                        if (next3.mo17954o() == i2) {
                            m1Var = next3;
                        }
                    }
                }
                if (m1Var != null) {
                    if (connectionResult.mo29682C0() != 13) {
                        m1Var.m20004d(m19969i(m1Var.f20013d, connectionResult));
                        break;
                    } else {
                        String g = this.f20001i.mo29707g(connectionResult.mo29682C0());
                        String D0 = connectionResult.mo29683D0();
                        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(D0).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(g);
                        sb.append(": ");
                        sb.append(D0);
                        m1Var.m20004d(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f20000h.getApplicationContext() instanceof Application) {
                    C7225c.m29617c((Application) this.f20000h.getApplicationContext());
                    C7225c.m29616b().mo29824a(new C7251h1(this));
                    if (!C7225c.m29616b().mo29826e(true)) {
                        this.f19996d = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
                        break;
                    }
                }
                break;
            case 7:
                m19970j((C4591e) message.obj);
                break;
            case 9:
                if (this.f20005m.containsKey(message.obj)) {
                    this.f20005m.get(message.obj).mo17948I();
                    break;
                }
                break;
            case 10:
                for (C7220b<?> remove : this.f20008p) {
                    C4596m1 remove2 = this.f20005m.remove(remove);
                    if (remove2 != null) {
                        remove2.mo17949J();
                    }
                }
                this.f20008p.clear();
                break;
            case 11:
                if (this.f20005m.containsKey(message.obj)) {
                    this.f20005m.get(message.obj).mo17950K();
                    break;
                }
                break;
            case 12:
                if (this.f20005m.containsKey(message.obj)) {
                    this.f20005m.get(message.obj).mo17953a();
                    break;
                }
                break;
            case 14:
                C7221b0 b0Var = (C7221b0) message.obj;
                C7220b<?> a = b0Var.mo29820a();
                if (this.f20005m.containsKey(a)) {
                    b0Var.mo29821b().setResult(Boolean.valueOf(this.f20005m.get(a).m20014n(false)));
                    break;
                } else {
                    b0Var.mo29821b().setResult(Boolean.FALSE);
                    break;
                }
            case 15:
                C7288o1 o1Var = (C7288o1) message.obj;
                if (this.f20005m.containsKey(o1Var.f29086a)) {
                    C4596m1.m20020z(this.f20005m.get(o1Var.f29086a), o1Var);
                    break;
                }
                break;
            case 16:
                C7288o1 o1Var2 = (C7288o1) message.obj;
                if (this.f20005m.containsKey(o1Var2.f29086a)) {
                    C4596m1.m20000A(this.f20005m.get(o1Var2.f29086a), o1Var2);
                    break;
                }
                break;
            case 17:
                m19972l();
                break;
            case 18:
                C7334y1 y1Var = (C7334y1) message.obj;
                if (y1Var.f29199c != 0) {
                    TelemetryData telemetryData = this.f19998f;
                    if (telemetryData != null) {
                        List<MethodInvocation> D02 = telemetryData.mo17974D0();
                        if (telemetryData.mo17973C0() != y1Var.f29198b || (D02 != null && D02.size() >= y1Var.f29200d)) {
                            this.f20009q.removeMessages(17);
                            m19972l();
                        } else {
                            this.f19998f.mo17975E0(y1Var.f29197a);
                        }
                    }
                    if (this.f19998f == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(y1Var.f29197a);
                        this.f19998f = new TelemetryData(y1Var.f29198b, arrayList);
                        Handler handler2 = this.f20009q;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), y1Var.f29199c);
                        break;
                    }
                } else {
                    m19971k().mo30157b(new TelemetryData(y1Var.f29198b, Arrays.asList(new MethodInvocation[]{y1Var.f29197a})));
                    break;
                }
                break;
            case 19:
                this.f19997e = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo17939n() {
        return this.f20003k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final C4596m1 mo17940x(C7220b<?> bVar) {
        return this.f20005m.get(bVar);
    }
}
