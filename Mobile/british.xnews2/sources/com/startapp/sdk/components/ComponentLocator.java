package com.startapp.sdk.components;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.startapp.C11781a7;
import com.startapp.C11805ba;
import com.startapp.C11822c6;
import com.startapp.C11824c7;
import com.startapp.C11828cb;
import com.startapp.C11832cd;
import com.startapp.C11873dd;
import com.startapp.C11887e9;
import com.startapp.C11919g4;
import com.startapp.C11920g5;
import com.startapp.C11933h1;
import com.startapp.C11979j4;
import com.startapp.C11991j9;
import com.startapp.C11992ja;
import com.startapp.C12001k;
import com.startapp.C12034lb;
import com.startapp.C12052ma;
import com.startapp.C12071n3;
import com.startapp.C12105o3;
import com.startapp.C12124p3;
import com.startapp.C12125p4;
import com.startapp.C12146q9;
import com.startapp.C12153r;
import com.startapp.C12165r8;
import com.startapp.C12177s4;
import com.startapp.C12359u3;
import com.startapp.C12378v;
import com.startapp.C12404w1;
import com.startapp.C12410w5;
import com.startapp.C12421x1;
import com.startapp.C12446y4;
import com.startapp.C12458z0;
import com.startapp.C12459z1;
import com.startapp.C12462z2;
import com.startapp.C5000a0;
import com.startapp.C5001b2;
import com.startapp.C5009h0;
import com.startapp.C5120v8;
import com.startapp.sdk.ads.video.C12243h;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.crashreport.C12281a;
import com.startapp.sdk.adsbase.crashreport.C12282b;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.C12322c;
import com.startapp.sdk.jobs.C12327f;
import com.startapp.sdk.jobs.SchedulerService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ComponentLocator {

    /* renamed from: K */
    public static final C12421x1<ComponentLocator, Context> f22424K = new C5095k();

    /* renamed from: A */
    public final C12404w1<Executor> f22425A;

    /* renamed from: B */
    public final C12404w1<Executor> f22426B;

    /* renamed from: C */
    public final C12404w1<C12071n3> f22427C;

    /* renamed from: D */
    public final C12404w1<C5069e> f22428D;

    /* renamed from: E */
    public final C12404w1<C5069e> f22429E;

    /* renamed from: F */
    public final C12404w1<C12153r> f22430F;

    /* renamed from: G */
    public final C12404w1<C12001k> f22431G;

    /* renamed from: H */
    public final C12404w1<C12282b> f22432H;

    /* renamed from: I */
    public final C12404w1<C12034lb> f22433I;

    /* renamed from: J */
    public final C12404w1<C12243h> f22434J;

    /* renamed from: a */
    public final C12404w1<C11873dd> f22435a;

    /* renamed from: b */
    public final C12404w1<C11832cd> f22436b;

    /* renamed from: c */
    public final C12404w1<C12410w5> f22437c;

    /* renamed from: d */
    public final C12404w1<C12177s4> f22438d;

    /* renamed from: e */
    public final C12404w1<C11992ja> f22439e;

    /* renamed from: f */
    public final C12404w1<C12052ma> f22440f;

    /* renamed from: g */
    public final C12404w1<AdvertisingIdResolver> f22441g;

    /* renamed from: h */
    public final C12404w1<C12165r8> f22442h;

    /* renamed from: i */
    public final C12404w1<C5001b2> f22443i;

    /* renamed from: j */
    public final C12404w1<C12446y4> f22444j;

    /* renamed from: k */
    public final C12404w1<C12146q9> f22445k = new C5085f(this);

    /* renamed from: l */
    public final C12404w1<C11828cb> f22446l;

    /* renamed from: m */
    public final C12404w1<C5000a0> f22447m;

    /* renamed from: n */
    public final C12404w1<C12359u3> f22448n;

    /* renamed from: o */
    public final C12404w1<C11805ba> f22449o;

    /* renamed from: p */
    public final C12404w1<C12378v> f22450p;

    /* renamed from: q */
    public final C12404w1<C11979j4> f22451q;

    /* renamed from: r */
    public final C12404w1<C11933h1> f22452r;

    /* renamed from: s */
    public final C12404w1<C11991j9> f22453s;

    /* renamed from: t */
    public final C12404w1<C12459z1> f22454t;

    /* renamed from: u */
    public final C12404w1<C5120v8> f22455u;

    /* renamed from: v */
    public final C12404w1<C11920g5> f22456v;

    /* renamed from: w */
    public final C12404w1<C11822c6> f22457w;

    /* renamed from: x */
    public final C12404w1<C12071n3> f22458x;

    /* renamed from: y */
    public final C12404w1<Executor> f22459y;

    /* renamed from: z */
    public final C12404w1<Executor> f22460z;

    /* renamed from: com.startapp.sdk.components.ComponentLocator$a */
    /* compiled from: Sta */
    public class C5075a extends C12404w1<C12052ma> {

        /* renamed from: b */
        public final /* synthetic */ Context f22461b;

        /* renamed from: c */
        public final /* synthetic */ C12462z2 f22462c;

        public C5075a(Context context, C12462z2 z2Var) {
            this.f22461b = context;
            this.f22462c = z2Var;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12052ma(this.f22461b, ComponentLocator.this.mo21221h(), new C5069e(this.f22461b.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0), (C5069e.C5071b) null), ComponentLocator.this.mo21219f(), this.f22462c);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$a0 */
    /* compiled from: Sta */
    public class C5076a0 extends C12404w1<C5069e> {

        /* renamed from: b */
        public final /* synthetic */ Context f22464b;

        public C5076a0(ComponentLocator componentLocator, Context context) {
            this.f22464b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C5069e(this.f22464b.getSharedPreferences("com.startapp.sdk", 0), (C5069e.C5071b) null);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$b */
    /* compiled from: Sta */
    public class C5077b extends C12404w1<AdvertisingIdResolver> {

        /* renamed from: b */
        public final /* synthetic */ Context f22465b;

        public C5077b(ComponentLocator componentLocator, Context context) {
            this.f22465b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new AdvertisingIdResolver(this.f22465b, new C5092i0("air"), new C12298a(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$b0 */
    /* compiled from: Sta */
    public class C5078b0 extends C12404w1<C5069e> {

        /* renamed from: b */
        public final /* synthetic */ Context f22466b;

        public C5078b0(ComponentLocator componentLocator, Context context) {
            this.f22466b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C5069e(this.f22466b.getSharedPreferences("com.startapp.sdk.extras", 0), new C12312o(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$c */
    /* compiled from: Sta */
    public class C5079c extends C12404w1<C12165r8> {

        /* renamed from: b */
        public final /* synthetic */ Context f22467b;

        public C5079c(ComponentLocator componentLocator, Context context) {
            this.f22467b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12165r8(this.f22467b, new C12299b(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$c0 */
    /* compiled from: Sta */
    public class C5080c0 extends C12404w1<C12153r> {

        /* renamed from: b */
        public final /* synthetic */ Context f22468b;

        public C5080c0(ComponentLocator componentLocator, Context context) {
            this.f22468b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12153r(this.f22468b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$d */
    /* compiled from: Sta */
    public class C5081d extends C12404w1<C5001b2> {

        /* renamed from: b */
        public final /* synthetic */ Context f22469b;

        public C5081d(Context context) {
            this.f22469b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C5001b2(this.f22469b, ComponentLocator.this.mo21217d());
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$d0 */
    /* compiled from: Sta */
    public class C5082d0 extends C12404w1<C12001k> {

        /* renamed from: b */
        public final /* synthetic */ Context f22471b;

        public C5082d0(ComponentLocator componentLocator, Context context) {
            this.f22471b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12001k(this.f22471b, new C12313p(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$e */
    /* compiled from: Sta */
    public class C5083e extends C12404w1<C12446y4> {

        /* renamed from: b */
        public final /* synthetic */ Context f22472b;

        public C5083e(ComponentLocator componentLocator, Context context) {
            this.f22472b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12446y4(new C5069e(this.f22472b.getSharedPreferences("StartApp-54ff24db2aee60b9", 0), (C5069e.C5071b) null));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$e0 */
    /* compiled from: Sta */
    public class C5084e0 extends C12404w1<C12034lb> {
        public C5084e0(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12034lb();
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$f */
    /* compiled from: Sta */
    public class C5085f extends C12404w1<C12146q9> {
        public C5085f(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12146q9();
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$f0 */
    /* compiled from: Sta */
    public class C5086f0 extends C12404w1<C12243h> {

        /* renamed from: b */
        public final /* synthetic */ Context f22473b;

        public C5086f0(Context context) {
            this.f22473b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12243h(this.f22473b, ComponentLocator.this.f22460z.mo46698b(), C5059d.f22346h);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$g */
    /* compiled from: Sta */
    public class C5087g extends C12404w1<C11828cb> {

        /* renamed from: b */
        public final /* synthetic */ Context f22475b;

        public C5087g(Context context) {
            this.f22475b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11828cb(this.f22475b.getPackageName(), new C5069e(this.f22475b.getSharedPreferences("StartApp-fba1a5307d96ef31", 0), (C5069e.C5071b) null), ComponentLocator.m23306a(0, 1, "tlp", 5), ComponentLocator.this.mo21226m(), ComponentLocator.this.mo21214a(), ComponentLocator.this.mo21235v(), new C12300c(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$g0 */
    /* compiled from: Sta */
    public class C5088g0 extends C12404w1<C11873dd> {

        /* renamed from: b */
        public final /* synthetic */ Context f22477b;

        public C5088g0(ComponentLocator componentLocator, Context context) {
            this.f22477b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11873dd(this.f22477b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$h */
    /* compiled from: Sta */
    public class C5089h extends C12404w1<C5000a0> {

        /* renamed from: b */
        public final /* synthetic */ Context f22478b;

        public C5089h(ComponentLocator componentLocator, Context context) {
            this.f22478b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C5000a0(new C5069e(this.f22478b.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0), (C5069e.C5071b) null));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$h0 */
    /* compiled from: Sta */
    public class C5090h0 implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$i */
    /* compiled from: Sta */
    public class C5091i extends C12404w1<C12359u3> {

        /* renamed from: b */
        public final /* synthetic */ Context f22479b;

        /* renamed from: c */
        public final /* synthetic */ C12404w1 f22480c;

        public C5091i(Context context, C12404w1 w1Var) {
            this.f22479b = context;
            this.f22480c = w1Var;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12359u3(ComponentLocator.this.mo21214a(), ComponentLocator.this.mo21235v(), ComponentLocator.this.mo21227n(), new C11781a7(this.f22479b, new C5069e(this.f22479b.getSharedPreferences("StartApp-770c613f81fb5b52", 0), (C5069e.C5071b) null), new C11824c7(this.f22479b, "StartApp-ac51a09f00e0f80c"), (Executor) this.f22480c.mo46698b(), new C12301d(this)), new C12302e(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$i0 */
    /* compiled from: Sta */
    public class C5092i0 implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f22482a = new AtomicInteger();

        /* renamed from: b */
        public final /* synthetic */ String f22483b;

        public C5092i0(String str) {
            this.f22483b = str;
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder a = C12458z0.m53804a("startapp-");
            a.append(this.f22483b);
            a.append("-");
            a.append(this.f22482a.incrementAndGet());
            return new Thread(runnable, a.toString());
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$j */
    /* compiled from: Sta */
    public class C5093j extends C12404w1<C11805ba> {

        /* renamed from: b */
        public final /* synthetic */ Context f22484b;

        public C5093j(ComponentLocator componentLocator, Context context) {
            this.f22484b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11805ba(this.f22484b, new C5069e(this.f22484b.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0), (C5069e.C5071b) null), new C12303f(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$j0 */
    /* compiled from: Sta */
    public class C5094j0 extends C12404w1<C11832cd> {

        /* renamed from: b */
        public final /* synthetic */ Context f22485b;

        public C5094j0(Context context) {
            this.f22485b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11832cd(this.f22485b, ComponentLocator.this.mo21236w());
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$k */
    /* compiled from: Sta */
    public class C5095k extends C12421x1<ComponentLocator, Context> {
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$k0 */
    /* compiled from: Sta */
    public class C5096k0 extends C12404w1<C12071n3> {
        public C5096k0(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23304a("db");
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$l */
    /* compiled from: Sta */
    public class C5097l extends C12404w1<C12378v> {

        /* renamed from: b */
        public final /* synthetic */ Context f22487b;

        public C5097l(ComponentLocator componentLocator, Context context) {
            this.f22487b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12378v(this.f22487b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$l0 */
    /* compiled from: Sta */
    public class C5098l0 extends C12404w1<C12410w5> {

        /* renamed from: b */
        public final /* synthetic */ Context f22488b;

        public C5098l0(ComponentLocator componentLocator, Context context) {
            this.f22488b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12410w5(this.f22488b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$m */
    /* compiled from: Sta */
    public class C5099m extends C12404w1<C11979j4> {

        /* renamed from: b */
        public final /* synthetic */ Context f22489b;

        /* renamed from: c */
        public final /* synthetic */ C12404w1 f22490c;

        public C5099m(Context context, C12404w1 w1Var) {
            this.f22489b = context;
            this.f22490c = w1Var;
        }

        /* renamed from: a */
        public Object mo21238a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C5092i0("info"));
            C12306i iVar = new C12306i(this, threadPoolExecutor);
            C12459z1 e = ComponentLocator.this.mo21218e();
            Context context = this.f22489b;
            ComponentLocator componentLocator = ComponentLocator.this;
            return new C11979j4(new C11919g4(this.f22489b, "StartApp-d6864f2502af7851"), (C12071n3) this.f22490c.mo46698b(), threadPoolExecutor, iVar, e, new C12125p4(context, componentLocator.f22448n, componentLocator.f22442h), new C12307j(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$m0 */
    /* compiled from: Sta */
    public class C5100m0 extends C12404w1<C12177s4> {

        /* renamed from: b */
        public final /* synthetic */ Context f22492b;

        public C5100m0(ComponentLocator componentLocator, Context context) {
            this.f22492b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12177s4(this.f22492b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$n */
    /* compiled from: Sta */
    public class C5101n extends C12404w1<C11933h1> {

        /* renamed from: b */
        public final /* synthetic */ Context f22493b;

        public C5101n(Context context) {
            this.f22493b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11933h1(this.f22493b, ComponentLocator.this.mo21217d(), new C5069e(this.f22493b.getSharedPreferences("StartApp-dfeaf103310003d9", 0), (C5069e.C5071b) null), ComponentLocator.this.mo21219f(), ComponentLocator.this.mo21221h(), new C12308k(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$n0 */
    /* compiled from: Sta */
    public class C5102n0 implements C12462z2<TelephonyMetadata> {
        public C5102n0(ComponentLocator componentLocator) {
        }

        public Object call() {
            return MetaData.f22407k.mo21169K();
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$o */
    /* compiled from: Sta */
    public class C5103o extends C12404w1<C11991j9> {

        /* renamed from: b */
        public final /* synthetic */ Context f22495b;

        public C5103o(Context context) {
            this.f22495b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11991j9(this.f22495b, new C5069e(this.f22495b.getSharedPreferences("StartApp-6cd3cac226013e8e", 0), (C5069e.C5071b) null), ComponentLocator.this.mo21219f(), ComponentLocator.this.mo21221h(), new C12309l(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$o0 */
    /* compiled from: Sta */
    public class C5104o0 extends C12404w1<C11992ja> {

        /* renamed from: b */
        public final /* synthetic */ Context f22497b;

        /* renamed from: c */
        public final /* synthetic */ C12462z2 f22498c;

        public C5104o0(Context context, C12462z2 z2Var) {
            this.f22497b = context;
            this.f22498c = z2Var;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11992ja(this.f22497b, new C5069e(this.f22497b.getSharedPreferences("StartApp-6d5362e8ecc8a910", 0), (C5069e.C5071b) null), ComponentLocator.this.mo21221h(), ComponentLocator.this.mo21219f(), this.f22498c, new C12314q(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$p */
    /* compiled from: Sta */
    public class C5105p extends C12404w1<C12459z1> {

        /* renamed from: b */
        public final /* synthetic */ Context f22500b;

        public C5105p(ComponentLocator componentLocator, Context context) {
            this.f22500b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C12459z1(this.f22500b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$q */
    /* compiled from: Sta */
    public class C5106q extends C12404w1<C5120v8> {

        /* renamed from: b */
        public final /* synthetic */ Context f22501b;

        public C5106q(Context context) {
            this.f22501b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C5120v8(this.f22501b, ComponentLocator.this.mo21223j(), new C12310m(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$r */
    /* compiled from: Sta */
    public class C5107r extends C12404w1<C11920g5> {

        /* renamed from: b */
        public final /* synthetic */ Context f22503b;

        public C5107r(ComponentLocator componentLocator, Context context) {
            this.f22503b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            Pair pair;
            Context context = this.f22503b;
            C12327f fVar = new C12327f(context);
            if (Build.VERSION.SDK_INT >= 21) {
                pair = new Pair(new C12322c(context, SchedulerService.class), fVar);
            } else {
                pair = new Pair(fVar, fVar);
            }
            return new C11920g5((C11887e9) pair.first, (C11887e9) pair.second);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$s */
    /* compiled from: Sta */
    public class C5108s extends C12404w1<C11822c6> {

        /* renamed from: b */
        public final /* synthetic */ Context f22504b;

        public C5108s(ComponentLocator componentLocator, Context context) {
            this.f22504b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            return new C11822c6(this.f22504b, new C5069e(this.f22504b.getSharedPreferences("StartApp-b36110d5cb803404", 0), (C5069e.C5071b) null), new C12311n(this), new Handler(Looper.getMainLooper()));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$t */
    /* compiled from: Sta */
    public class C5109t extends C12404w1<C12071n3> {
        public C5109t(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23304a("core");
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$u */
    /* compiled from: Sta */
    public class C5110u extends C12404w1<Executor> {
        public C5110u(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23306a(0, 4, "net-api", 10);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$v */
    /* compiled from: Sta */
    public class C5111v extends C12404w1<C12282b> {

        /* renamed from: b */
        public final /* synthetic */ Context f22505b;

        public C5111v(ComponentLocator componentLocator, Context context) {
            this.f22505b = context;
        }

        /* renamed from: a */
        public Object mo21238a() {
            ANRRemoteConfig e = MetaData.f22407k.mo21191e();
            C12282b bVar = new C12282b(e != null ? e.mo46213c() : SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, e != null && e.mo46218g());
            if (e != null && e.mo46215e()) {
                bVar.f54582b = new C12304g(this, e);
                bVar.f54581a = new C12281a(this.f22505b, "com.startapp.", e.mo46219h(), e.mo46211a(), e.mo46214d());
                if (e.mo46217f()) {
                    bVar.f54584d = new C12305h(this);
                }
                bVar.start();
            }
            return bVar;
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$w */
    /* compiled from: Sta */
    public class C5112w extends C12404w1<Executor> {
        public C5112w(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23306a(0, 2, "net-media", 10);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$x */
    /* compiled from: Sta */
    public class C5113x extends C12404w1<Executor> {
        public C5113x(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23306a(0, 2, "disk", 5);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$y */
    /* compiled from: Sta */
    public class C5114y extends C12404w1<Executor> {
        public C5114y(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23306a(0, 4, "generic", 5);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$z */
    /* compiled from: Sta */
    public class C5115z extends C12404w1<C12071n3> {
        public C5115z(ComponentLocator componentLocator) {
        }

        /* renamed from: a */
        public Object mo21238a() {
            return ComponentLocator.m23304a("dc");
        }
    }

    public ComponentLocator(Context context) {
        this.f22432H = new C5111v(this, context);
        this.f22435a = new C5088g0(this, context);
        this.f22436b = new C5094j0(context);
        C5096k0 k0Var = new C5096k0(this);
        this.f22437c = new C5098l0(this, context);
        this.f22438d = new C5100m0(this, context);
        C5102n0 n0Var = new C5102n0(this);
        this.f22439e = new C5104o0(context, n0Var);
        this.f22440f = new C5075a(context, n0Var);
        this.f22441g = new C5077b(this, context);
        this.f22442h = new C5079c(this, context);
        this.f22443i = new C5081d(context);
        this.f22444j = new C5083e(this, context);
        this.f22446l = new C5087g(context);
        this.f22447m = new C5089h(this, context);
        this.f22448n = new C5091i(context, k0Var);
        this.f22449o = new C5093j(this, context);
        this.f22450p = new C5097l(this, context);
        this.f22451q = new C5099m(context, k0Var);
        this.f22452r = new C5101n(context);
        this.f22453s = new C5103o(context);
        this.f22454t = new C5105p(this, context);
        this.f22455u = new C5106q(context);
        this.f22456v = new C5107r(this, context);
        this.f22457w = new C5108s(this, context);
        this.f22458x = new C5109t(this);
        this.f22459y = new C5110u(this);
        this.f22460z = new C5112w(this);
        this.f22425A = new C5113x(this);
        this.f22426B = new C5114y(this);
        this.f22427C = new C5115z(this);
        this.f22428D = new C5076a0(this, context);
        this.f22429E = new C5078b0(this, context);
        this.f22430F = new C5080c0(this, context);
        this.f22431G = new C5082d0(this, context);
        this.f22433I = new C5084e0(this);
        this.f22434J = new C5086f0(context);
    }

    /* renamed from: a */
    public static ComponentLocator m23305a(Context context) {
        C12421x1<ComponentLocator, Context> x1Var = f22424K;
        T t = x1Var.f55097a;
        if (t == null) {
            synchronized (x1Var) {
                t = x1Var.f55097a;
                if (t == null) {
                    Context a = C5009h0.m22892a(context);
                    if (a != null) {
                        context = a;
                    }
                    t = new ComponentLocator(context);
                    x1Var.f55097a = t;
                }
            }
        }
        return (ComponentLocator) t;
    }

    /* renamed from: b */
    public C12378v mo21215b() {
        return this.f22450p.mo46698b();
    }

    /* renamed from: c */
    public C5000a0 mo21216c() {
        return this.f22447m.mo46698b();
    }

    /* renamed from: d */
    public C5069e mo21217d() {
        return this.f22428D.mo46698b();
    }

    /* renamed from: e */
    public C12459z1 mo21218e() {
        return this.f22454t.mo46698b();
    }

    /* renamed from: f */
    public C5001b2 mo21219f() {
        return this.f22443i.mo46698b();
    }

    /* renamed from: g */
    public C12071n3 mo21220g() {
        return this.f22458x.mo46698b();
    }

    /* renamed from: h */
    public C12071n3 mo21221h() {
        return this.f22427C.mo46698b();
    }

    /* renamed from: i */
    public Executor mo21222i() {
        return this.f22425A.mo46698b();
    }

    /* renamed from: j */
    public Executor mo21223j() {
        return this.f22426B.mo46698b();
    }

    /* renamed from: k */
    public C12359u3 mo21224k() {
        return this.f22448n.mo46698b();
    }

    /* renamed from: l */
    public C11979j4 mo21225l() {
        return this.f22451q.mo46698b();
    }

    /* renamed from: m */
    public C11920g5 mo21226m() {
        return this.f22456v.mo46698b();
    }

    /* renamed from: n */
    public C12410w5 mo21227n() {
        return this.f22437c.mo46698b();
    }

    /* renamed from: o */
    public C11822c6 mo21228o() {
        return this.f22457w.mo46698b();
    }

    /* renamed from: p */
    public Executor mo21229p() {
        return this.f22459y.mo46698b();
    }

    /* renamed from: q */
    public C12165r8 mo21230q() {
        return this.f22442h.mo46698b();
    }

    /* renamed from: r */
    public C5120v8 mo21231r() {
        return this.f22455u.mo46698b();
    }

    /* renamed from: s */
    public C12146q9 mo21232s() {
        return this.f22445k.mo46698b();
    }

    /* renamed from: t */
    public C11992ja mo21233t() {
        return this.f22439e.mo46698b();
    }

    /* renamed from: u */
    public C12052ma mo21234u() {
        return this.f22440f.mo46698b();
    }

    /* renamed from: v */
    public C12034lb mo21235v() {
        return this.f22433I.mo46698b();
    }

    /* renamed from: w */
    public C11873dd mo21236w() {
        return this.f22435a.mo46698b();
    }

    /* renamed from: b */
    public static ThreadFactory m23307b(String str) {
        return new C5092i0(str);
    }

    /* renamed from: a */
    public AdvertisingIdResolver mo21214a() {
        return this.f22441g.mo46698b();
    }

    /* renamed from: a */
    public static Executor m23306a(int i, int i2, String str, long j) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                public boolean offer(Object obj) {
                    return tryTransfer((Runnable) obj);
                }
            }, new C5092i0(str), new C5090h0());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i2 < 2) {
            return Executors.newSingleThreadExecutor(new C5092i0(str));
        } else {
            return Executors.newCachedThreadPool(new C5092i0(str));
        }
    }

    /* renamed from: a */
    public static C12071n3 m23304a(String str) {
        C12124p3 p3Var = new C12124p3("startapp-" + str);
        p3Var.start();
        return new C12105o3(new Handler(p3Var.getLooper()));
    }
}
