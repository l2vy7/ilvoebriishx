package p204e7;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p204e7.C10518f;
import p215h7.C10581b;
import p267y6.C11114d;
import p267y6.C11119e;
import p267y6.C11133q;
import p267y6.C11138w;

/* renamed from: e7.d */
/* compiled from: DefaultHeartBeatInfo */
public class C10516d implements C10518f {

    /* renamed from: d */
    private static final ThreadFactory f49036d = C12687b.f55324a;

    /* renamed from: a */
    private C10581b<C10520g> f49037a;

    /* renamed from: b */
    private final Set<C10517e> f49038b;

    /* renamed from: c */
    private final Executor f49039c;

    private C10516d(Context context, Set<C10517e> set) {
        this(new C11138w(new C12686a(context)), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f49036d));
    }

    /* renamed from: e */
    public static C11114d<C10518f> m48249e() {
        return C11114d.m49620c(C10518f.class).mo43400b(C11133q.m49699h(Context.class)).mo43400b(C11133q.m49700i(C10517e.class)).mo43404f(C12688c.f55325a).mo43402d();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C10518f m48250f(C11119e eVar) {
        return new C10516d((Context) eVar.mo43389a(Context.class), eVar.mo43390d(C10517e.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Thread m48252h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* renamed from: a */
    public C10518f.C10519a mo42649a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d = this.f49037a.get().mo42652d(str, currentTimeMillis);
        boolean c = this.f49037a.get().mo42651c(currentTimeMillis);
        if (d && c) {
            return C10518f.C10519a.COMBINED;
        }
        if (c) {
            return C10518f.C10519a.GLOBAL;
        }
        if (d) {
            return C10518f.C10519a.SDK;
        }
        return C10518f.C10519a.NONE;
    }

    C10516d(C10581b<C10520g> bVar, Set<C10517e> set, Executor executor) {
        this.f49037a = bVar;
        this.f49038b = set;
        this.f49039c = executor;
    }
}
