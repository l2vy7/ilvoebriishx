package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7195d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.internal.C4595g;
import com.google.android.gms.common.api.internal.C4596m1;
import com.google.android.gms.common.api.internal.C4597r1;
import com.google.android.gms.common.api.internal.C7215a;
import com.google.android.gms.common.api.internal.C7216a0;
import com.google.android.gms.common.api.internal.C7220b;
import com.google.android.gms.common.api.internal.C7231d;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.common.api.internal.C7266k;
import com.google.android.gms.common.api.internal.C7271l;
import com.google.android.gms.common.api.internal.C7278m2;
import com.google.android.gms.common.api.internal.C7280n;
import com.google.android.gms.common.api.internal.C7285o;
import com.google.android.gms.common.api.internal.C7301r;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.common.api.internal.C7320v;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p006a5.C6492o;

/* renamed from: com.google.android.gms.common.api.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4591e<O extends C7191a.C7195d> {
    protected final C4595g zaa;
    private final Context zab;
    private final String zac;
    private final C7191a<O> zad;
    private final O zae;
    private final C7220b<O> zaf;
    private final Looper zag;
    private final int zah;
    @NotOnlyInitialized
    private final C7206f zai;
    private final C7301r zaj;

    /* renamed from: com.google.android.gms.common.api.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4592a {

        /* renamed from: c */
        public static final C4592a f19970c = new C4593a().mo17905a();

        /* renamed from: a */
        public final C7301r f19971a;

        /* renamed from: b */
        public final Looper f19972b;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static class C4593a {

            /* renamed from: a */
            private C7301r f19973a;

            /* renamed from: b */
            private Looper f19974b;

            /* renamed from: a */
            public C4592a mo17905a() {
                if (this.f19973a == null) {
                    this.f19973a = new C7215a();
                }
                if (this.f19974b == null) {
                    this.f19974b = Looper.getMainLooper();
                }
                return new C4592a(this.f19973a, this.f19974b);
            }

            /* renamed from: b */
            public C4593a mo17906b(Looper looper) {
                C4604n.m20099l(looper, "Looper must not be null.");
                this.f19974b = looper;
                return this;
            }

            /* renamed from: c */
            public C4593a mo17907c(C7301r rVar) {
                C4604n.m20099l(rVar, "StatusExceptionMapper must not be null.");
                this.f19973a = rVar;
                return this;
            }
        }

        private C4592a(C7301r rVar, Account account, Looper looper) {
            this.f19971a = rVar;
            this.f19972b = looper;
        }
    }

    public C4591e(Activity activity, C7191a<O> aVar, O o, C4592a aVar2) {
        this((Context) activity, activity, aVar, o, aVar2);
    }

    private final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T zad(int i, T t) {
        t.mo29792m();
        this.zaa.mo17928H(this, i, t);
        return t;
    }

    private final <TResult, A extends C7191a.C7193b> Task<TResult> zae(int i, C7310t<A, TResult> tVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.mo17929I(this, i, tVar, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public C7206f asGoogleApiClient() {
        return this.zai;
    }

    /* access modifiers changed from: protected */
    public C4601e.C4602a createClientSettingsBuilder() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount W;
        C4601e.C4602a aVar = new C4601e.C4602a();
        O o = this.zae;
        if (!(o instanceof C7191a.C7195d.C7197b) || (W = ((C7191a.C7195d.C7197b) o).mo29747W()) == null) {
            O o2 = this.zae;
            account = o2 instanceof C7191a.C7195d.C7196a ? ((C7191a.C7195d.C7196a) o2).mo29746d0() : null;
        } else {
            account = W.mo29093d0();
        }
        aVar.mo17992d(account);
        O o3 = this.zae;
        if (o3 instanceof C7191a.C7195d.C7197b) {
            GoogleSignInAccount W2 = ((C7191a.C7195d.C7197b) o3).mo29747W();
            if (W2 == null) {
                set = Collections.emptySet();
            } else {
                set = W2.mo29089J0();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo17991c(set);
        aVar.mo17993e(this.zab.getClass().getName());
        aVar.mo17990b(this.zab.getPackageName());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public Task<Boolean> disconnectService() {
        return this.zaa.mo17925A(this);
    }

    public <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    public <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    @Deprecated
    public <A extends C7191a.C7193b, T extends C7280n<A, ?>, U extends C7320v<A, ?>> Task<Void> doRegisterEventListener(T t, U u) {
        C4604n.m20098k(t);
        C4604n.m20098k(u);
        C4604n.m20099l(t.mo29902b(), "Listener has already been released.");
        C4604n.m20099l(u.mo29948a(), "Listener has already been released.");
        C4604n.m20089b(C7408m.m30028a(t.mo29902b(), u.mo29948a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.mo17926B(this, t, u, C7348r.f29210b);
    }

    public Task<Boolean> doUnregisterEventListener(C7259j.C7260a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    public final C7220b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    public String getContextAttributionTag() {
        return this.zac;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C7259j<L> registerListener(L l, String str) {
        return C7266k.m29687a(l, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final C7191a.C7201f zab(Looper looper, C4596m1<O> m1Var) {
        Looper looper2 = looper;
        C7191a.C7201f buildClient = ((C7191a.C7192a) C4604n.m20098k(this.zad.mo29741a())).buildClient(this.zab, looper2, createClientSettingsBuilder().mo17989a(), this.zae, (C7206f.C7208b) m1Var, (C7206f.C7209c) m1Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof C7377d)) {
            ((C7377d) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof C7271l)) {
            ((C7271l) buildClient).mo29891f(contextAttributionTag);
        }
        return buildClient;
    }

    public final C7278m2 zac(Context context, Handler handler) {
        return new C7278m2(context, handler, createClientSettingsBuilder().mo17989a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4591e(android.app.Activity r2, com.google.android.gms.common.api.C7191a<O> r3, O r4, com.google.android.gms.common.api.internal.C7301r r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.mo17907c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.mo17906b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.mo17905a()
            r1.<init>((android.app.Activity) r2, r3, r4, (com.google.android.gms.common.api.C4591e.C4592a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C4591e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.r):void");
    }

    public <TResult, A extends C7191a.C7193b> Task<TResult> doBestEffortWrite(C7310t<A, TResult> tVar) {
        return zae(2, tVar);
    }

    public <TResult, A extends C7191a.C7193b> Task<TResult> doRead(C7310t<A, TResult> tVar) {
        return zae(0, tVar);
    }

    public Task<Boolean> doUnregisterEventListener(C7259j.C7260a<?> aVar, int i) {
        C4604n.m20099l(aVar, "Listener key cannot be null.");
        return this.zaa.mo17927C(this, aVar, i);
    }

    public <TResult, A extends C7191a.C7193b> Task<TResult> doWrite(C7310t<A, TResult> tVar) {
        return zae(1, tVar);
    }

    private C4591e(Context context, Activity activity, C7191a<O> aVar, O o, C4592a aVar2) {
        C4604n.m20099l(context, "Null context is not permitted.");
        C4604n.m20099l(aVar, "Api must not be null.");
        C4604n.m20099l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (C6492o.m28290m()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = aVar;
        this.zae = o;
        this.zag = aVar2.f19972b;
        C7220b<O> a = C7220b.m29599a(aVar, o, str);
        this.zaf = a;
        this.zai = new C4597r1(this);
        C4595g y = C4595g.m19983y(this.zab);
        this.zaa = y;
        this.zah = y.mo17939n();
        this.zaj = aVar2.f19971a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C7216a0.m29566j(activity, y, a);
        }
        y.mo17933c(this);
    }

    public <A extends C7191a.C7193b> Task<Void> doRegisterEventListener(C7285o<A, ?> oVar) {
        C4604n.m20098k(oVar);
        C4604n.m20099l(oVar.f29076a.mo29902b(), "Listener has already been released.");
        C4604n.m20099l(oVar.f29077b.mo29948a(), "Listener has already been released.");
        return this.zaa.mo17926B(this, oVar.f29076a, oVar.f29077b, oVar.f29078c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4591e(android.content.Context r2, com.google.android.gms.common.api.C7191a<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.C7301r r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.mo17906b(r5)
            r0.mo17907c(r6)
            com.google.android.gms.common.api.e$a r5 = r0.mo17905a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C4591e.C4592a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C4591e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, android.os.Looper, com.google.android.gms.common.api.internal.r):void");
    }

    public C4591e(Context context, C7191a<O> aVar, O o, C4592a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4591e(android.content.Context r2, com.google.android.gms.common.api.C7191a<O> r3, O r4, com.google.android.gms.common.api.internal.C7301r r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.mo17907c(r5)
            com.google.android.gms.common.api.e$a r5 = r0.mo17905a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C4591e.C4592a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C4591e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.r):void");
    }
}
