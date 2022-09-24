package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.mediarouter.media.C1003s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p018c1.C2639f;
import p105l0.C5643c;

/* renamed from: androidx.mediarouter.media.m */
/* compiled from: MediaRouteProvider */
public abstract class C0985m {

    /* renamed from: b */
    private final Context f4511b;

    /* renamed from: c */
    private final C0994d f4512c;

    /* renamed from: d */
    private final C0993c f4513d;

    /* renamed from: e */
    private C0986a f4514e;

    /* renamed from: f */
    private C2639f f4515f;

    /* renamed from: g */
    private boolean f4516g;

    /* renamed from: h */
    private C0996n f4517h;

    /* renamed from: i */
    private boolean f4518i;

    /* renamed from: androidx.mediarouter.media.m$a */
    /* compiled from: MediaRouteProvider */
    public static abstract class C0986a {
        /* renamed from: a */
        public abstract void mo4432a(C0985m mVar, C0996n nVar);
    }

    /* renamed from: androidx.mediarouter.media.m$b */
    /* compiled from: MediaRouteProvider */
    public static abstract class C0987b extends C0995e {

        /* renamed from: a */
        private final Object f4519a = new Object();

        /* renamed from: b */
        Executor f4520b;

        /* renamed from: c */
        C0992d f4521c;

        /* renamed from: d */
        C0983l f4522d;

        /* renamed from: e */
        Collection<C0990c> f4523e;

        /* renamed from: androidx.mediarouter.media.m$b$a */
        /* compiled from: MediaRouteProvider */
        class C0988a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0992d f4524b;

            /* renamed from: c */
            final /* synthetic */ C0983l f4525c;

            /* renamed from: d */
            final /* synthetic */ Collection f4526d;

            C0988a(C0992d dVar, C0983l lVar, Collection collection) {
                this.f4524b = dVar;
                this.f4525c = lVar;
                this.f4526d = collection;
            }

            public void run() {
                this.f4524b.mo4431a(C0987b.this, this.f4525c, this.f4526d);
            }
        }

        /* renamed from: androidx.mediarouter.media.m$b$b */
        /* compiled from: MediaRouteProvider */
        class C0989b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0992d f4528b;

            /* renamed from: c */
            final /* synthetic */ C0983l f4529c;

            /* renamed from: d */
            final /* synthetic */ Collection f4530d;

            C0989b(C0992d dVar, C0983l lVar, Collection collection) {
                this.f4528b = dVar;
                this.f4529c = lVar;
                this.f4530d = collection;
            }

            public void run() {
                this.f4528b.mo4431a(C0987b.this, this.f4529c, this.f4530d);
            }
        }

        /* renamed from: androidx.mediarouter.media.m$b$c */
        /* compiled from: MediaRouteProvider */
        public static final class C0990c {

            /* renamed from: a */
            final C0983l f4532a;

            /* renamed from: b */
            final int f4533b;

            /* renamed from: c */
            final boolean f4534c;

            /* renamed from: d */
            final boolean f4535d;

            /* renamed from: e */
            final boolean f4536e;

            /* renamed from: f */
            Bundle f4537f;

            /* renamed from: androidx.mediarouter.media.m$b$c$a */
            /* compiled from: MediaRouteProvider */
            public static final class C0991a {

                /* renamed from: a */
                private final C0983l f4538a;

                /* renamed from: b */
                private int f4539b = 1;

                /* renamed from: c */
                private boolean f4540c = false;

                /* renamed from: d */
                private boolean f4541d = false;

                /* renamed from: e */
                private boolean f4542e = false;

                public C0991a(C0983l lVar) {
                    this.f4538a = lVar;
                }

                /* renamed from: a */
                public C0990c mo4668a() {
                    return new C0990c(this.f4538a, this.f4539b, this.f4540c, this.f4541d, this.f4542e);
                }

                /* renamed from: b */
                public C0991a mo4669b(boolean z) {
                    this.f4541d = z;
                    return this;
                }

                /* renamed from: c */
                public C0991a mo4670c(boolean z) {
                    this.f4542e = z;
                    return this;
                }

                /* renamed from: d */
                public C0991a mo4671d(boolean z) {
                    this.f4540c = z;
                    return this;
                }

                /* renamed from: e */
                public C0991a mo4672e(int i) {
                    this.f4539b = i;
                    return this;
                }
            }

            C0990c(C0983l lVar, int i, boolean z, boolean z2, boolean z3) {
                this.f4532a = lVar;
                this.f4533b = i;
                this.f4534c = z;
                this.f4535d = z2;
                this.f4536e = z3;
            }

            /* renamed from: a */
            static C0990c m5084a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new C0990c(C0983l.m5016e(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            /* renamed from: b */
            public C0983l mo4662b() {
                return this.f4532a;
            }

            /* renamed from: c */
            public int mo4663c() {
                return this.f4533b;
            }

            /* renamed from: d */
            public boolean mo4664d() {
                return this.f4535d;
            }

            /* renamed from: e */
            public boolean mo4665e() {
                return this.f4536e;
            }

            /* renamed from: f */
            public boolean mo4666f() {
                return this.f4534c;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public Bundle mo4667g() {
                if (this.f4537f == null) {
                    Bundle bundle = new Bundle();
                    this.f4537f = bundle;
                    bundle.putBundle("mrDescriptor", this.f4532a.mo4602a());
                    this.f4537f.putInt("selectionState", this.f4533b);
                    this.f4537f.putBoolean("isUnselectable", this.f4534c);
                    this.f4537f.putBoolean("isGroupable", this.f4535d);
                    this.f4537f.putBoolean("isTransferable", this.f4536e);
                }
                return this.f4537f;
            }
        }

        /* renamed from: androidx.mediarouter.media.m$b$d */
        /* compiled from: MediaRouteProvider */
        interface C0992d {
            /* renamed from: a */
            void mo4431a(C0987b bVar, C0983l lVar, Collection<C0990c> collection);
        }

        /* renamed from: k */
        public String mo4497k() {
            return null;
        }

        /* renamed from: l */
        public String mo4498l() {
            return null;
        }

        /* renamed from: m */
        public final void mo4658m(C0983l lVar, Collection<C0990c> collection) {
            Objects.requireNonNull(lVar, "groupRoute must not be null");
            Objects.requireNonNull(collection, "dynamicRoutes must not be null");
            synchronized (this.f4519a) {
                Executor executor = this.f4520b;
                if (executor != null) {
                    executor.execute(new C0989b(this.f4521c, lVar, collection));
                } else {
                    this.f4522d = lVar;
                    this.f4523e = new ArrayList(collection);
                }
            }
        }

        /* renamed from: n */
        public abstract void mo4499n(String str);

        /* renamed from: o */
        public abstract void mo4500o(String str);

        /* renamed from: p */
        public abstract void mo4501p(List<String> list);

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4659q(Executor executor, C0992d dVar) {
            synchronized (this.f4519a) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                } else if (dVar != null) {
                    this.f4520b = executor;
                    this.f4521c = dVar;
                    Collection<C0990c> collection = this.f4523e;
                    if (collection != null && !collection.isEmpty()) {
                        C0983l lVar = this.f4522d;
                        Collection<C0990c> collection2 = this.f4523e;
                        this.f4522d = null;
                        this.f4523e = null;
                        this.f4520b.execute(new C0988a(dVar, lVar, collection2));
                    }
                } else {
                    throw new NullPointerException("Listener shouldn't be null");
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.m$c */
    /* compiled from: MediaRouteProvider */
    private final class C0993c extends Handler {
        C0993c() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C0985m.this.mo4647l();
            } else if (i == 2) {
                C0985m.this.mo4648m();
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.m$d */
    /* compiled from: MediaRouteProvider */
    public static final class C0994d {

        /* renamed from: a */
        private final ComponentName f4544a;

        C0994d(ComponentName componentName) {
            if (componentName != null) {
                this.f4544a = componentName;
                return;
            }
            throw new IllegalArgumentException("componentName must not be null");
        }

        /* renamed from: a */
        public ComponentName mo4674a() {
            return this.f4544a;
        }

        /* renamed from: b */
        public String mo4675b() {
            return this.f4544a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.f4544a.flattenToShortString() + " }";
        }
    }

    /* renamed from: androidx.mediarouter.media.m$e */
    /* compiled from: MediaRouteProvider */
    public static abstract class C0995e {
        /* renamed from: d */
        public boolean mo4490d(Intent intent, C1003s.C1007d dVar) {
            return false;
        }

        /* renamed from: e */
        public void mo4491e() {
        }

        /* renamed from: f */
        public void mo4492f() {
        }

        /* renamed from: g */
        public void mo4493g(int i) {
        }

        @Deprecated
        /* renamed from: h */
        public void mo4494h() {
        }

        /* renamed from: i */
        public void mo4495i(int i) {
            mo4494h();
        }

        /* renamed from: j */
        public void mo4496j(int i) {
        }
    }

    public C0985m(Context context) {
        this(context, (C0994d) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4647l() {
        this.f4518i = false;
        C0986a aVar = this.f4514e;
        if (aVar != null) {
            aVar.mo4432a(this, this.f4517h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4648m() {
        this.f4516g = false;
        mo4456v(this.f4515f);
    }

    /* renamed from: n */
    public final Context mo4649n() {
        return this.f4511b;
    }

    /* renamed from: o */
    public final C0996n mo4650o() {
        return this.f4517h;
    }

    /* renamed from: p */
    public final C2639f mo4651p() {
        return this.f4515f;
    }

    /* renamed from: q */
    public final Handler mo4652q() {
        return this.f4513d;
    }

    /* renamed from: r */
    public final C0994d mo4653r() {
        return this.f4512c;
    }

    /* renamed from: s */
    public C0987b mo4452s(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: t */
    public C0995e mo4453t(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /* renamed from: u */
    public C0995e mo4455u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return mo4453t(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    /* renamed from: v */
    public void mo4456v(C2639f fVar) {
    }

    /* renamed from: w */
    public final void mo4654w(C0986a aVar) {
        C1003s.m5130d();
        this.f4514e = aVar;
    }

    /* renamed from: x */
    public final void mo4655x(C0996n nVar) {
        C1003s.m5130d();
        if (this.f4517h != nVar) {
            this.f4517h = nVar;
            if (!this.f4518i) {
                this.f4518i = true;
                this.f4513d.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: y */
    public final void mo4656y(C2639f fVar) {
        C1003s.m5130d();
        if (!C5643c.m24954a(this.f4515f, fVar)) {
            mo4657z(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo4657z(C2639f fVar) {
        this.f4515f = fVar;
        if (!this.f4516g) {
            this.f4516g = true;
            this.f4513d.sendEmptyMessage(2);
        }
    }

    C0985m(Context context, C0994d dVar) {
        this.f4513d = new C0993c();
        if (context != null) {
            this.f4511b = context;
            if (dVar == null) {
                this.f4512c = new C0994d(new ComponentName(context, getClass()));
            } else {
                this.f4512c = dVar;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }
}
