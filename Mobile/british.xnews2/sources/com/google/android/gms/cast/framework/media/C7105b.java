package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8564i0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
import p243q4.C10920a;
import p243q4.C10922b;

/* renamed from: com.google.android.gms.cast.framework.media.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C7105b {

    /* renamed from: a */
    private final C10922b f28670a = new C10922b("MediaQueue");

    /* renamed from: b */
    long f28671b;

    /* renamed from: c */
    private final C4580e f28672c;

    /* renamed from: d */
    List<Integer> f28673d;

    /* renamed from: e */
    final SparseIntArray f28674e;

    /* renamed from: f */
    LruCache<Integer, MediaQueueItem> f28675f;

    /* renamed from: g */
    final List<Integer> f28676g;

    /* renamed from: h */
    final Deque<Integer> f28677h;

    /* renamed from: i */
    private final int f28678i;

    /* renamed from: j */
    private final Handler f28679j;

    /* renamed from: k */
    private TimerTask f28680k;

    /* renamed from: l */
    private C7210g<C4580e.C4583c> f28681l;

    /* renamed from: m */
    private C7210g<C4580e.C4583c> f28682m;

    /* renamed from: n */
    private Set<C7106a> f28683n = new HashSet();

    /* renamed from: com.google.android.gms.cast.framework.media.b$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public static abstract class C7106a {
        /* renamed from: a */
        public void mo29533a(int i, int i2) {
        }

        /* renamed from: b */
        public void mo29534b() {
        }

        /* renamed from: c */
        public void mo29535c(@RecentlyNonNull int[] iArr) {
        }

        /* renamed from: d */
        public void mo29536d(@RecentlyNonNull int[] iArr) {
        }

        /* renamed from: e */
        public void mo29537e() {
        }

        /* renamed from: f */
        public void mo29538f() {
        }
    }

    C7105b(C4580e eVar, int i, int i2) {
        this.f28672c = eVar;
        this.f28678i = Math.max(20, 1);
        this.f28673d = new ArrayList();
        this.f28674e = new SparseIntArray();
        this.f28676g = new ArrayList();
        this.f28677h = new ArrayDeque(20);
        this.f28679j = new C8564i0(Looper.getMainLooper());
        this.f28680k = new C7165z0(this);
        eVar.mo17820E(new C7108b1(this));
        m29333n(20);
        this.f28671b = m29338s();
        mo29530b();
    }

    /* renamed from: e */
    static /* synthetic */ void m29324e(C7105b bVar) {
        if (!bVar.f28677h.isEmpty() && bVar.f28681l == null && bVar.f28671b != 0) {
            C7210g<C4580e.C4583c> R = bVar.f28672c.mo17833R(C10920a.m49149l(bVar.f28677h));
            bVar.f28681l = R;
            R.mo29786d(new C7163y0(bVar));
            bVar.f28677h.clear();
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m29326g(C7105b bVar) {
        bVar.f28674e.clear();
        for (int i = 0; i < bVar.f28673d.size(); i++) {
            bVar.f28674e.put(bVar.f28673d.get(i).intValue(), i);
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m29329j(C7105b bVar, int i, int i2) {
        for (C7106a a : bVar.f28683n) {
            a.mo29533a(i, i2);
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m29331l(C7105b bVar, int[] iArr) {
        for (C7106a c : bVar.f28683n) {
            c.mo29535c(iArr);
        }
    }

    /* renamed from: n */
    private final void m29333n(int i) {
        this.f28675f = new C7104a1(this, i);
    }

    /* renamed from: o */
    private final void m29334o() {
        m29335p();
        this.f28679j.postDelayed(this.f28680k, 500);
    }

    /* renamed from: p */
    private final void m29335p() {
        this.f28679j.removeCallbacks(this.f28680k);
    }

    /* renamed from: q */
    private final void m29336q() {
        C7210g<C4580e.C4583c> gVar = this.f28682m;
        if (gVar != null) {
            gVar.mo29785c();
            this.f28682m = null;
        }
    }

    /* renamed from: r */
    private final void m29337r() {
        C7210g<C4580e.C4583c> gVar = this.f28681l;
        if (gVar != null) {
            gVar.mo29785c();
            this.f28681l = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final long m29338s() {
        MediaStatus k = this.f28672c.mo17846k();
        if (k == null || k.zzc()) {
            return 0;
        }
        return k.mo29354a1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m29339t() {
        for (C7106a f : this.f28683n) {
            f.mo29538f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m29340u() {
        for (C7106a e : this.f28683n) {
            e.mo29537e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m29341v() {
        for (C7106a b : this.f28683n) {
            b.mo29534b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m29342w(int[] iArr) {
        for (C7106a d : this.f28683n) {
            d.mo29536d(iArr);
        }
    }

    /* renamed from: a */
    public final void mo29529a() {
        m29339t();
        this.f28673d.clear();
        this.f28674e.clear();
        this.f28675f.evictAll();
        this.f28676g.clear();
        m29335p();
        this.f28677h.clear();
        m29336q();
        m29337r();
        m29341v();
        m29340u();
    }

    /* renamed from: b */
    public final void mo29530b() {
        C4604n.m20093f("Must be called from the main thread.");
        if (this.f28671b != 0 && this.f28682m == null) {
            m29336q();
            m29337r();
            C7210g<C4580e.C4583c> Q = this.f28672c.mo17832Q();
            this.f28682m = Q;
            Q.mo29786d(new C7161x0(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29531c(C4580e.C4583c cVar) {
        Status p0 = cVar.mo29527p0();
        int D0 = p0.mo29732D0();
        if (D0 != 0) {
            this.f28670a.mo43195f(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(D0), p0.mo29733E0()}), new Object[0]);
        }
        this.f28681l = null;
        if (!this.f28677h.isEmpty()) {
            m29334o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo29532d(C4580e.C4583c cVar) {
        Status p0 = cVar.mo29527p0();
        int D0 = p0.mo29732D0();
        if (D0 != 0) {
            this.f28670a.mo43195f(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(D0), p0.mo29733E0()}), new Object[0]);
        }
        this.f28682m = null;
        if (!this.f28677h.isEmpty()) {
            m29334o();
        }
    }
}
