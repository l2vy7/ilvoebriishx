package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8564i0;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.json.JSONObject;
import p108l4.C10657a;
import p108l4.C10675f;
import p108l4.C10678g;
import p108l4.C10697p0;
import p243q4.C10944n;

/* renamed from: com.google.android.gms.cast.framework.media.e */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C4580e implements C10657a.C10663e {
    @RecentlyNonNull

    /* renamed from: l */
    public static final String f19924l = C10944n.f49866C;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f19925a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f19926b = new C8564i0(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10944n f19927c;

    /* renamed from: d */
    private final C7149w f19928d;
    @NotOnlyInitialized

    /* renamed from: e */
    private final C7105b f19929e;

    /* renamed from: f */
    private C10697p0 f19930f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final List<C4582b> f19931g = new CopyOnWriteArrayList();

    /* renamed from: h */
    final List<C4581a> f19932h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final Map<C4585e, C7116f0> f19933i = new ConcurrentHashMap();

    /* renamed from: j */
    private final Map<Long, C7116f0> f19934j = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C4584d f19935k;

    /* renamed from: com.google.android.gms.cast.framework.media.e$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public static abstract class C4581a {
        /* renamed from: a */
        public void mo17862a() {
        }

        /* renamed from: b */
        public void mo17863b(@RecentlyNonNull MediaError mediaError) {
        }

        /* renamed from: c */
        public void mo17864c() {
        }

        /* renamed from: d */
        public void mo17865d() {
        }

        /* renamed from: e */
        public void mo17866e() {
        }

        /* renamed from: f */
        public void mo17867f() {
        }

        /* renamed from: g */
        public void mo17868g() {
        }

        /* renamed from: h */
        public void mo17869h(@RecentlyNonNull int[] iArr) {
        }

        /* renamed from: i */
        public void mo17870i(@RecentlyNonNull int[] iArr, int i) {
        }

        /* renamed from: j */
        public void mo17871j(@RecentlyNonNull int[] iArr) {
        }

        /* renamed from: k */
        public void mo17872k(@RecentlyNonNull int[] iArr) {
        }

        /* renamed from: l */
        public void mo17873l(@RecentlyNonNull MediaQueueItem[] mediaQueueItemArr) {
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.cast.framework.media.e$b */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public interface C4582b {
        /* renamed from: c */
        void mo9079c();

        /* renamed from: d */
        void mo9080d();

        /* renamed from: e */
        void mo9081e();

        /* renamed from: f */
        void mo9082f();

        /* renamed from: g */
        void mo9083g();

        /* renamed from: l */
        void mo9084l();
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$c */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public interface C4583c extends C7341k {
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$d */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public interface C4584d {
        @RecentlyNonNull
        /* renamed from: a */
        List<AdBreakInfo> mo17874a(@RecentlyNonNull MediaStatus mediaStatus);

        /* renamed from: b */
        boolean mo17875b(@RecentlyNonNull MediaStatus mediaStatus);
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$e */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public interface C4585e {
        /* renamed from: a */
        void mo17876a(long j, long j2);
    }

    public C4580e(C10944n nVar) {
        C7149w wVar = new C7149w(this);
        this.f19928d = wVar;
        C10944n nVar2 = (C10944n) C4604n.m20098k(nVar);
        this.f19927c = nVar2;
        nVar2.mo43247z(new C7113d0(this, (C7127l) null));
        nVar2.mo43201b(wVar);
        this.f19929e = new C7105b(this, 20, 20);
    }

    @RecentlyNonNull
    /* renamed from: U */
    public static C7210g<C4583c> m19846U(int i, String str) {
        C7162y yVar = new C7162y();
        yVar.mo29791i(new C7160x(yVar, new Status(i, str)));
        return yVar;
    }

    /* renamed from: V */
    static /* synthetic */ void m19847V(C4580e eVar) {
        for (C7116f0 next : eVar.f19934j.values()) {
            if (eVar.mo17850o() && !next.mo29564g()) {
                next.mo29562e();
            } else if (!eVar.mo17850o() && next.mo29564g()) {
                next.mo29563f();
            }
            if (next.mo29564g() && (eVar.mo17851p() || eVar.mo17834S() || eVar.mo17854s() || eVar.mo17853r())) {
                eVar.m19855d0(next.f28703a);
            }
        }
    }

    /* renamed from: c0 */
    private final boolean m19854c0() {
        return this.f19930f != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m19855d0(Set<C4585e> set) {
        MediaInfo G0;
        HashSet<C4585e> hashSet = new HashSet<>(set);
        if (mo17855t() || mo17854s() || mo17851p() || mo17834S()) {
            for (C4585e a : hashSet) {
                a.mo17876a(mo17842g(), mo17849n());
            }
        } else if (mo17853r()) {
            MediaQueueItem i = mo17844i();
            if (i != null && (G0 = i.mo29320G0()) != null) {
                for (C4585e a2 : hashSet) {
                    a2.mo17876a(0, G0.mo29229N0());
                }
            }
        } else {
            for (C4585e a3 : hashSet) {
                a3.mo17876a(0, 0);
            }
        }
    }

    /* renamed from: e0 */
    private static final C7107b0 m19856e0(C7107b0 b0Var) {
        try {
            b0Var.mo29542s();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            b0Var.mo29791i(new C7103a0(b0Var, new Status(2100)));
        }
        return b0Var;
    }

    @RecentlyNonNull
    /* renamed from: A */
    public C7210g<C4583c> mo17816A() {
        return mo17817B((JSONObject) null);
    }

    @RecentlyNonNull
    /* renamed from: B */
    public C7210g<C4583c> mo17817B(JSONObject jSONObject) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7143t tVar = new C7143t(this, jSONObject);
        m19856e0(tVar);
        return tVar;
    }

    @RecentlyNonNull
    /* renamed from: C */
    public C7210g<C4583c> mo17818C(JSONObject jSONObject) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7131n nVar = new C7131n(this, jSONObject);
        m19856e0(nVar);
        return nVar;
    }

    @RecentlyNonNull
    /* renamed from: D */
    public C7210g<C4583c> mo17819D(JSONObject jSONObject) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7129m mVar = new C7129m(this, jSONObject);
        m19856e0(mVar);
        return mVar;
    }

    /* renamed from: E */
    public void mo17820E(@RecentlyNonNull C4581a aVar) {
        C4604n.m20093f("Must be called from the main thread.");
        if (aVar != null) {
            this.f19932h.add(aVar);
        }
    }

    @Deprecated
    /* renamed from: F */
    public void mo17821F(@RecentlyNonNull C4582b bVar) {
        C4604n.m20093f("Must be called from the main thread.");
        if (bVar != null) {
            this.f19931g.remove(bVar);
        }
    }

    /* renamed from: G */
    public void mo17822G(@RecentlyNonNull C4585e eVar) {
        C4604n.m20093f("Must be called from the main thread.");
        C7116f0 remove = this.f19933i.remove(eVar);
        if (remove != null) {
            remove.mo29560c(eVar);
            if (!remove.mo29561d()) {
                this.f19934j.remove(Long.valueOf(remove.mo29558a()));
                remove.mo29563f();
            }
        }
    }

    @RecentlyNonNull
    /* renamed from: H */
    public C7210g<C4583c> mo17823H() {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7123j jVar = new C7123j(this);
        m19856e0(jVar);
        return jVar;
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: I */
    public C7210g<C4583c> mo17824I(long j) {
        return mo17825J(j, 0, (JSONObject) null);
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: J */
    public C7210g<C4583c> mo17825J(long j, int i, JSONObject jSONObject) {
        C10678g.C10679a aVar = new C10678g.C10679a();
        aVar.mo42832d(j);
        aVar.mo42833e(i);
        aVar.mo42830b(jSONObject);
        return mo17826K(aVar.mo42829a());
    }

    @RecentlyNonNull
    /* renamed from: K */
    public C7210g<C4583c> mo17826K(@RecentlyNonNull C10678g gVar) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7145u uVar = new C7145u(this, gVar);
        m19856e0(uVar);
        return uVar;
    }

    @RecentlyNonNull
    /* renamed from: L */
    public C7210g<C4583c> mo17827L(@RecentlyNonNull long[] jArr) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7125k kVar = new C7125k(this, jArr);
        m19856e0(kVar);
        return kVar;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public C7210g<C4583c> mo17828M() {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7121i iVar = new C7121i(this);
        m19856e0(iVar);
        return iVar;
    }

    /* renamed from: N */
    public void mo17829N() {
        C4604n.m20093f("Must be called from the main thread.");
        int m = mo17848m();
        if (m == 4 || m == 2) {
            mo17860y();
        } else {
            mo17816A();
        }
    }

    /* renamed from: O */
    public final void mo17830O(C10697p0 p0Var) {
        C10697p0 p0Var2 = this.f19930f;
        if (p0Var2 != p0Var) {
            if (p0Var2 != null) {
                this.f19927c.mo43204e();
                this.f19929e.mo29529a();
                p0Var2.mo22365c0(mo17847l());
                this.f19928d.mo29587b((C10697p0) null);
                this.f19926b.removeCallbacksAndMessages((Object) null);
            }
            this.f19930f = p0Var;
            if (p0Var != null) {
                this.f19928d.mo29587b(p0Var);
            }
        }
    }

    /* renamed from: P */
    public final void mo17831P() {
        C10697p0 p0Var = this.f19930f;
        if (p0Var != null) {
            p0Var.mo22367f(mo17847l(), this);
            mo17823H();
        }
    }

    @RecentlyNonNull
    /* renamed from: Q */
    public final C7210g<C4583c> mo17832Q() {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7133o oVar = new C7133o(this, true);
        m19856e0(oVar);
        return oVar;
    }

    @RecentlyNonNull
    /* renamed from: R */
    public final C7210g<C4583c> mo17833R(@RecentlyNonNull int[] iArr) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7135p pVar = new C7135p(this, true, iArr);
        m19856e0(pVar);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean mo17834S() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        return k != null && k.mo29341N0() == 5;
    }

    /* renamed from: T */
    public final boolean mo17835T() {
        C4604n.m20093f("Must be called from the main thread.");
        if (!mo17852q()) {
            return true;
        }
        MediaStatus k = mo17846k();
        if (k == null || !k.mo29351X0(2) || k.mo29337J0() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo17836a(@RecentlyNonNull CastDevice castDevice, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this.f19927c.mo43244n(str2);
    }

    @Deprecated
    /* renamed from: b */
    public void mo17837b(@RecentlyNonNull C4582b bVar) {
        C4604n.m20093f("Must be called from the main thread.");
        if (bVar != null) {
            this.f19931g.add(bVar);
        }
    }

    /* renamed from: c */
    public boolean mo17838c(@RecentlyNonNull C4585e eVar, long j) {
        C4604n.m20093f("Must be called from the main thread.");
        if (eVar == null || this.f19933i.containsKey(eVar)) {
            return false;
        }
        Map<Long, C7116f0> map = this.f19934j;
        Long valueOf = Long.valueOf(j);
        C7116f0 f0Var = map.get(valueOf);
        if (f0Var == null) {
            f0Var = new C7116f0(this, j);
            this.f19934j.put(valueOf, f0Var);
        }
        f0Var.mo29559b(eVar);
        this.f19933i.put(eVar, f0Var);
        if (!mo17850o()) {
            return true;
        }
        f0Var.mo29562e();
        return true;
    }

    /* renamed from: d */
    public long mo17839d() {
        long K;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            K = this.f19927c.mo43237K();
        }
        return K;
    }

    /* renamed from: e */
    public long mo17840e() {
        long J;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            J = this.f19927c.mo43236J();
        }
        return J;
    }

    /* renamed from: f */
    public long mo17841f() {
        long I;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            I = this.f19927c.mo43235I();
        }
        return I;
    }

    /* renamed from: g */
    public long mo17842g() {
        long H;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            H = this.f19927c.mo43234H();
        }
        return H;
    }

    /* renamed from: h */
    public int mo17843h() {
        int G0;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            MediaStatus k = mo17846k();
            G0 = k != null ? k.mo29334G0() : 0;
        }
        return G0;
    }

    @RecentlyNullable
    /* renamed from: i */
    public MediaQueueItem mo17844i() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        if (k == null) {
            return null;
        }
        return k.mo29344Q0(k.mo29338K0());
    }

    @RecentlyNullable
    /* renamed from: j */
    public MediaInfo mo17845j() {
        MediaInfo j;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            j = this.f19927c.mo43240j();
        }
        return j;
    }

    @RecentlyNullable
    /* renamed from: k */
    public MediaStatus mo17846k() {
        MediaStatus i;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            i = this.f19927c.mo43239i();
        }
        return i;
    }

    @RecentlyNonNull
    /* renamed from: l */
    public String mo17847l() {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f19927c.mo43200a();
    }

    /* renamed from: m */
    public int mo17848m() {
        int N0;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            MediaStatus k = mo17846k();
            N0 = k != null ? k.mo29341N0() : 1;
        }
        return N0;
    }

    /* renamed from: n */
    public long mo17849n() {
        long L;
        synchronized (this.f19925a) {
            C4604n.m20093f("Must be called from the main thread.");
            L = this.f19927c.mo43238L();
        }
        return L;
    }

    /* renamed from: o */
    public boolean mo17850o() {
        C4604n.m20093f("Must be called from the main thread.");
        return mo17851p() || mo17834S() || mo17855t() || mo17854s() || mo17853r();
    }

    /* renamed from: p */
    public boolean mo17851p() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        return k != null && k.mo29341N0() == 4;
    }

    /* renamed from: q */
    public boolean mo17852q() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaInfo j = mo17845j();
        return j != null && j.mo29230O0() == 2;
    }

    /* renamed from: r */
    public boolean mo17853r() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        return (k == null || k.mo29338K0() == 0) ? false : true;
    }

    /* renamed from: s */
    public boolean mo17854s() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        if (k != null) {
            if (k.mo29341N0() == 3) {
                return true;
            }
            if (!mo17852q() || mo17843h() != 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo17855t() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        return k != null && k.mo29341N0() == 2;
    }

    /* renamed from: u */
    public boolean mo17856u() {
        C4604n.m20093f("Must be called from the main thread.");
        MediaStatus k = mo17846k();
        return k != null && k.mo29353Z0();
    }

    @RecentlyNonNull
    /* renamed from: v */
    public C7210g<C4583c> mo17857v(@RecentlyNonNull MediaInfo mediaInfo, @RecentlyNonNull C10675f fVar) {
        MediaLoadRequestData.C7082a aVar = new MediaLoadRequestData.C7082a();
        aVar.mo29274h(mediaInfo);
        aVar.mo29269c(Boolean.valueOf(fVar.mo42814b()));
        aVar.mo29272f(fVar.mo42818f());
        aVar.mo29275i(fVar.mo42819g());
        aVar.mo29268b(fVar.mo42813a());
        aVar.mo29273g(fVar.mo42817e());
        aVar.mo29270d(fVar.mo42815c());
        aVar.mo29271e(fVar.mo42816d());
        return mo17859x(aVar.mo29267a());
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: w */
    public C7210g<C4583c> mo17858w(@RecentlyNonNull MediaInfo mediaInfo, boolean z) {
        C10675f.C10676a aVar = new C10675f.C10676a();
        aVar.mo42821b(z);
        return mo17857v(mediaInfo, aVar.mo42820a());
    }

    @RecentlyNonNull
    /* renamed from: x */
    public C7210g<C4583c> mo17859x(@RecentlyNonNull MediaLoadRequestData mediaLoadRequestData) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7137q qVar = new C7137q(this, mediaLoadRequestData);
        m19856e0(qVar);
        return qVar;
    }

    @RecentlyNonNull
    /* renamed from: y */
    public C7210g<C4583c> mo17860y() {
        return mo17861z((JSONObject) null);
    }

    @RecentlyNonNull
    /* renamed from: z */
    public C7210g<C4583c> mo17861z(JSONObject jSONObject) {
        C4604n.m20093f("Must be called from the main thread.");
        if (!m19854c0()) {
            return m19846U(17, (String) null);
        }
        C7139r rVar = new C7139r(this, jSONObject);
        m19856e0(rVar);
        return rVar;
    }
}
