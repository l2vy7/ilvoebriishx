package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aam */
/* compiled from: IMASDK */
public final class aam extends aaf<aak> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C4129kn f13946a;

    /* renamed from: b */
    private final List<aak> f13947b;

    /* renamed from: c */
    private final Set<acc> f13948c;

    /* renamed from: d */
    private Handler f13949d;

    /* renamed from: e */
    private final List<aak> f13950e;

    /* renamed from: f */
    private final IdentityHashMap<aaz, aak> f13951f;

    /* renamed from: g */
    private final Map<Object, aak> f13952g;

    /* renamed from: h */
    private final Set<aak> f13953h;

    /* renamed from: i */
    private boolean f13954i;

    /* renamed from: j */
    private Set<acc> f13955j;

    /* renamed from: k */
    private ack f13956k;

    static {
        C4124ki kiVar = new C4124ki();
        kiVar.mo16144f(Uri.EMPTY);
        f13946a = kiVar.mo16139a();
    }

    public aam(ack ack, abd... abdArr) {
        this.f13956k = ack.mo13429a() > 0 ? ack.mo13436h() : ack;
        this.f13951f = new IdentityHashMap<>();
        this.f13952g = new HashMap();
        this.f13947b = new ArrayList();
        this.f13950e = new ArrayList();
        this.f13955j = new HashSet();
        this.f13948c = new HashSet();
        this.f13953h = new HashSet();
        mo13279E(Arrays.asList(abdArr));
    }

    /* renamed from: J */
    private final void m12754J() {
        m12764T((acc) null);
    }

    /* renamed from: K */
    private final void m12755K() {
        this.f13954i = false;
        Set<acc> set = this.f13955j;
        this.f13955j = new HashSet();
        mo16937e(new aai(this.f13950e, this.f13956k));
        m12756L().obtainMessage(5, set).sendToTarget();
    }

    /* renamed from: L */
    private final Handler m12756L() {
        Handler handler = this.f13949d;
        aup.m14890u(handler);
        return handler;
    }

    /* renamed from: M */
    private final synchronized void m12757M(Set<acc> set) {
        Iterator<acc> it = set.iterator();
        if (!it.hasNext()) {
            this.f13948c.removeAll(set);
        } else {
            acc next = it.next();
            throw null;
        }
    }

    /* renamed from: N */
    private final void m12758N(int i, Collection<aak> collection) {
        for (aak next : collection) {
            int i2 = i + 1;
            if (i > 0) {
                aak aak = this.f13950e.get(i - 1);
                next.mo13276a(i, aak.f13941e + aak.f13937a.mo13307C().mo13271t());
            } else {
                next.mo13276a(i, 0);
            }
            m12760P(i, 1, next.f13937a.mo13307C().mo13271t());
            this.f13950e.add(i, next);
            this.f13952g.put(next.f13938b, next);
            mo13258v(next, next.f13937a);
            if (!mo16942j() || !this.f13951f.isEmpty()) {
                mo13260x(next);
            } else {
                this.f13953h.add(next);
            }
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void mo13252B(aak aak, C4171mb mbVar) {
        int t;
        if (aak.f13940d + 1 < this.f13950e.size() && (t = mbVar.mo13271t() - (this.f13950e.get(aak.f13940d + 1).f13941e - aak.f13941e)) != 0) {
            m12760P(aak.f13940d + 1, 0, t);
        }
        m12754J();
    }

    /* renamed from: P */
    private final void m12760P(int i, int i2, int i3) {
        while (i < this.f13950e.size()) {
            aak aak = this.f13950e.get(i);
            aak.f13940d += i2;
            aak.f13941e += i3;
            i++;
        }
    }

    /* renamed from: Q */
    private final void m12761Q(aak aak) {
        if (aak.f13942f && aak.f13939c.isEmpty()) {
            this.f13953h.remove(aak);
            mo13261y(aak);
        }
    }

    /* renamed from: R */
    private final void m12762R() {
        Iterator<aak> it = this.f13953h.iterator();
        while (it.hasNext()) {
            aak next = it.next();
            if (next.f13939c.isEmpty()) {
                mo13260x(next);
                it.remove();
            }
        }
    }

    /* renamed from: S */
    private final void m12763S(int i, Collection<abd> collection) {
        aup.m14885p(true);
        Handler handler = this.f13949d;
        for (abd u : collection) {
            aup.m14890u(u);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (abd aak : collection) {
            arrayList.add(new aak(aak));
        }
        this.f13947b.addAll(i, arrayList);
        if (handler != null && !collection.isEmpty()) {
            handler.obtainMessage(0, new aal(i, arrayList, null, (acc) null)).sendToTarget();
        }
    }

    /* renamed from: T */
    private final void m12764T(acc acc) {
        if (!this.f13954i) {
            m12756L().obtainMessage(4).sendToTarget();
            this.f13954i = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ abb mo13251A(Object obj, abb abb) {
        int i = 0;
        while (true) {
            aak aak = (aak) obj;
            if (i >= aak.f13939c.size()) {
                return null;
            }
            if (aak.f13939c.get(i).f14001d == abb.f14001d) {
                return abb.mo13315c(Pair.create(aak.f13938b, abb.f13998a));
            }
            i++;
        }
    }

    /* renamed from: C */
    public final synchronized void mo13277C(abd abd) {
        mo13278D(this.f13947b.size(), abd);
    }

    /* renamed from: D */
    public final synchronized void mo13278D(int i, abd abd) {
        m12763S(i, Collections.singletonList(abd));
    }

    /* renamed from: E */
    public final synchronized void mo13279E(Collection<abd> collection) {
        m12763S(this.f13947b.size(), collection);
    }

    /* renamed from: F */
    public final synchronized abd mo13280F(int i) {
        return this.f13947b.get(i).f13937a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1 A[LOOP:1: B:33:0x00cf->B:34:0x00d1, LOOP_END] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo13281H(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r1 = 0
            if (r0 == 0) goto L_0x00fa
            r2 = 1
            if (r0 == r2) goto L_0x009f
            r3 = 2
            if (r0 == r3) goto L_0x0038
            r2 = 3
            if (r0 == r2) goto L_0x0028
            r1 = 4
            if (r0 == r1) goto L_0x0024
            r1 = 5
            if (r0 != r1) goto L_0x001e
            java.lang.Object r8 = r8.obj
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            java.util.Set r8 = (java.util.Set) r8
            r7.m12757M(r8)
            return
        L_0x001e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0024:
            r7.m12755K()
            return
        L_0x0028:
            java.lang.Object r8 = r8.obj
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.aal r8 = (com.google.ads.interactivemedia.p038v3.internal.aal) r8
            T r8 = r8.f13944b
            com.google.ads.interactivemedia.v3.internal.ack r8 = (com.google.ads.interactivemedia.p038v3.internal.ack) r8
            r7.f13956k = r8
            r7.m12764T(r1)
            return
        L_0x0038:
            java.lang.Object r8 = r8.obj
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.aal r8 = (com.google.ads.interactivemedia.p038v3.internal.aal) r8
            com.google.ads.interactivemedia.v3.internal.ack r0 = r7.f13956k
            int r3 = r8.f13943a
            int r4 = r3 + 1
            com.google.ads.interactivemedia.v3.internal.ack r0 = r0.mo13435g(r3, r4)
            r7.f13956k = r0
            T r3 = r8.f13944b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.ads.interactivemedia.v3.internal.ack r0 = r0.mo13434f(r3, r2)
            r7.f13956k = r0
            int r0 = r8.f13943a
            T r8 = r8.f13944b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r2 = java.lang.Math.min(r0, r8)
            int r3 = java.lang.Math.max(r0, r8)
            java.util.List<com.google.ads.interactivemedia.v3.internal.aak> r4 = r7.f13950e
            java.lang.Object r4 = r4.get(r2)
            com.google.ads.interactivemedia.v3.internal.aak r4 = (com.google.ads.interactivemedia.p038v3.internal.aak) r4
            int r4 = r4.f13941e
            java.util.List<com.google.ads.interactivemedia.v3.internal.aak> r5 = r7.f13950e
            java.lang.Object r0 = r5.remove(r0)
            com.google.ads.interactivemedia.v3.internal.aak r0 = (com.google.ads.interactivemedia.p038v3.internal.aak) r0
            r5.add(r8, r0)
        L_0x007f:
            if (r2 > r3) goto L_0x009b
            java.util.List<com.google.ads.interactivemedia.v3.internal.aak> r8 = r7.f13950e
            java.lang.Object r8 = r8.get(r2)
            com.google.ads.interactivemedia.v3.internal.aak r8 = (com.google.ads.interactivemedia.p038v3.internal.aak) r8
            r8.f13940d = r2
            r8.f13941e = r4
            com.google.ads.interactivemedia.v3.internal.aaw r8 = r8.f13937a
            com.google.ads.interactivemedia.v3.internal.mb r8 = r8.mo13307C()
            int r8 = r8.mo13271t()
            int r4 = r4 + r8
            int r2 = r2 + 1
            goto L_0x007f
        L_0x009b:
            r7.m12764T(r1)
            return
        L_0x009f:
            java.lang.Object r8 = r8.obj
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.aal r8 = (com.google.ads.interactivemedia.p038v3.internal.aal) r8
            int r0 = r8.f13943a
            T r8 = r8.f13944b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3 = 0
            if (r0 != 0) goto L_0x00c4
            com.google.ads.interactivemedia.v3.internal.ack r0 = r7.f13956k
            int r0 = r0.mo13429a()
            if (r8 != r0) goto L_0x00c3
            com.google.ads.interactivemedia.v3.internal.ack r0 = r7.f13956k
            com.google.ads.interactivemedia.v3.internal.ack r0 = r0.mo13436h()
            r7.f13956k = r0
            goto L_0x00cd
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            com.google.ads.interactivemedia.v3.internal.ack r3 = r7.f13956k
            com.google.ads.interactivemedia.v3.internal.ack r3 = r3.mo13435g(r0, r8)
            r7.f13956k = r3
            r3 = r0
        L_0x00cd:
            r0 = -1
            int r8 = r8 + r0
        L_0x00cf:
            if (r8 < r3) goto L_0x00f6
            java.util.List<com.google.ads.interactivemedia.v3.internal.aak> r4 = r7.f13950e
            java.lang.Object r4 = r4.remove(r8)
            com.google.ads.interactivemedia.v3.internal.aak r4 = (com.google.ads.interactivemedia.p038v3.internal.aak) r4
            java.util.Map<java.lang.Object, com.google.ads.interactivemedia.v3.internal.aak> r5 = r7.f13952g
            java.lang.Object r6 = r4.f13938b
            r5.remove(r6)
            com.google.ads.interactivemedia.v3.internal.aaw r5 = r4.f13937a
            com.google.ads.interactivemedia.v3.internal.mb r5 = r5.mo13307C()
            int r5 = r5.mo13271t()
            int r5 = -r5
            r7.m12760P(r8, r0, r5)
            r4.f13942f = r2
            r7.m12761Q(r4)
            int r8 = r8 + -1
            goto L_0x00cf
        L_0x00f6:
            r7.m12764T(r1)
            return
        L_0x00fa:
            java.lang.Object r8 = r8.obj
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.aal r8 = (com.google.ads.interactivemedia.p038v3.internal.aal) r8
            com.google.ads.interactivemedia.v3.internal.ack r0 = r7.f13956k
            int r2 = r8.f13943a
            T r3 = r8.f13944b
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            com.google.ads.interactivemedia.v3.internal.ack r0 = r0.mo13434f(r2, r3)
            r7.f13956k = r0
            int r0 = r8.f13943a
            T r8 = r8.f13944b
            java.util.Collection r8 = (java.util.Collection) r8
            r7.m12758N(r0, r8)
            r7.m12764T(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.aam.mo13281H(android.os.Message):void");
    }

    /* renamed from: I */
    public final synchronized void mo13282I(int i) {
        mo13280F(i);
        int i2 = i + 1;
        aup.m14885p(true);
        Handler handler = this.f13949d;
        amm.m14235e(this.f13947b, i, i2);
        if (handler != null) {
            handler.obtainMessage(1, new aal(i, Integer.valueOf(i2), null, (acc) null)).sendToTarget();
        }
    }

    /* renamed from: U */
    public final C4129kn mo13273U() {
        return f13946a;
    }

    /* renamed from: V */
    public final void mo13274V(aaz aaz) {
        aak remove = this.f13951f.remove(aaz);
        aup.m14890u(remove);
        remove.f13937a.mo13274V(aaz);
        remove.f13939c.remove(((aat) aaz).f13966a);
        if (!this.f13951f.isEmpty()) {
            m12762R();
        }
        m12761Q(remove);
    }

    /* renamed from: W */
    public final aaz mo13275W(abb abb, ajl ajl, long j) {
        Object a = C4073il.m17384a(abb.f13998a);
        abb c = abb.mo13315c(C4073il.m17385b(abb.f13998a));
        aak aak = this.f13952g.get(a);
        if (aak == null) {
            aak = new aak(new aaj((byte[]) null));
            aak.f13942f = true;
            mo13258v(aak, aak.f13937a);
        }
        this.f13953h.add(aak);
        mo13259w(aak);
        aak.f13939c.add(c);
        aat D = aak.f13937a.mo13275W(c, ajl, j);
        this.f13951f.put(D, aak);
        m12762R();
        return D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo13253X() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo13254a(akp akp) {
        super.mo13254a(akp);
        this.f13949d = new Handler(new aah(this));
        if (this.f13947b.isEmpty()) {
            m12755K();
            return;
        }
        this.f13956k = this.f13956k.mo13434f(0, this.f13947b.size());
        m12758N(0, this.f13947b);
        m12754J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo13255c() {
        super.mo13255c();
        this.f13953h.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized void mo13256d() {
        super.mo13256d();
        this.f13950e.clear();
        this.f13953h.clear();
        this.f13952g.clear();
        this.f13956k = this.f13956k.mo13436h();
        Handler handler = this.f13949d;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f13949d = null;
        }
        this.f13954i = false;
        this.f13955j.clear();
        m12757M(this.f13948c);
    }

    /* renamed from: r */
    public final synchronized C4171mb mo13283r() {
        ack ack;
        if (this.f13956k.mo13429a() != this.f13947b.size()) {
            ack = this.f13956k.mo13436h().mo13434f(0, this.f13947b.size());
        } else {
            ack = this.f13956k;
        }
        return new aai(this.f13947b, ack);
    }

    /* renamed from: s */
    public final boolean mo13284s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ int mo13262z(Object obj, int i) {
        return i + ((aak) obj).f13941e;
    }
}
