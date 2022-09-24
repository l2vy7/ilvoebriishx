package p169w2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C3323d;
import com.bumptech.glide.C3325f;
import java.util.List;
import java.util.concurrent.Executor;
import p004a3.C0061f;
import p004a3.C0066k;
import p013b3.C1563c;
import p065d2.C5154a;
import p082g2.C5298k;
import p082g2.C5316q;
import p082g2.C5323v;
import p130p2.C5897a;
import p174x2.C6385g;
import p174x2.C6386h;
import p179y2.C6407c;

/* renamed from: w2.h */
/* compiled from: SingleRequest */
public final class C6312h<R> implements C6306c, C6385g, C6311g {

    /* renamed from: D */
    private static final boolean f26034D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f26035A;

    /* renamed from: B */
    private boolean f26036B;

    /* renamed from: C */
    private RuntimeException f26037C;

    /* renamed from: a */
    private final String f26038a;

    /* renamed from: b */
    private final C1563c f26039b;

    /* renamed from: c */
    private final Object f26040c;

    /* renamed from: d */
    private final C6309e<R> f26041d;

    /* renamed from: e */
    private final C6307d f26042e;

    /* renamed from: f */
    private final Context f26043f;

    /* renamed from: g */
    private final C3323d f26044g;

    /* renamed from: h */
    private final Object f26045h;

    /* renamed from: i */
    private final Class<R> f26046i;

    /* renamed from: j */
    private final C6304a<?> f26047j;

    /* renamed from: k */
    private final int f26048k;

    /* renamed from: l */
    private final int f26049l;

    /* renamed from: m */
    private final C3325f f26050m;

    /* renamed from: n */
    private final C6386h<R> f26051n;

    /* renamed from: o */
    private final List<C6309e<R>> f26052o;

    /* renamed from: p */
    private final C6407c<? super R> f26053p;

    /* renamed from: q */
    private final Executor f26054q;

    /* renamed from: r */
    private C5323v<R> f26055r;

    /* renamed from: s */
    private C5298k.C5304d f26056s;

    /* renamed from: t */
    private long f26057t;

    /* renamed from: u */
    private volatile C5298k f26058u;

    /* renamed from: v */
    private C6313a f26059v;

    /* renamed from: w */
    private Drawable f26060w;

    /* renamed from: x */
    private Drawable f26061x;

    /* renamed from: y */
    private Drawable f26062y;

    /* renamed from: z */
    private int f26063z;

    /* renamed from: w2.h$a */
    /* compiled from: SingleRequest */
    private enum C6313a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C6312h(Context context, C3323d dVar, Object obj, Object obj2, Class<R> cls, C6304a<?> aVar, int i, int i2, C3325f fVar, C6386h<R> hVar, C6309e<R> eVar, List<C6309e<R>> list, C6307d dVar2, C5298k kVar, C6407c<? super R> cVar, Executor executor) {
        this.f26038a = f26034D ? String.valueOf(super.hashCode()) : null;
        this.f26039b = C1563c.m7996a();
        this.f26040c = obj;
        this.f26043f = context;
        this.f26044g = dVar;
        this.f26045h = obj2;
        this.f26046i = cls;
        this.f26047j = aVar;
        this.f26048k = i;
        this.f26049l = i2;
        this.f26050m = fVar;
        this.f26051n = hVar;
        this.f26041d = eVar;
        this.f26052o = list;
        this.f26042e = dVar2;
        this.f26058u = kVar;
        this.f26053p = cVar;
        this.f26054q = executor;
        this.f26059v = C6313a.PENDING;
        if (this.f26037C == null && dVar.mo11117i()) {
            this.f26037C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: A */
    private void m27778A() {
        if (m27781l()) {
            Drawable drawable = null;
            if (this.f26045h == null) {
                drawable = m27785p();
            }
            if (drawable == null) {
                drawable = m27784o();
            }
            if (drawable == null) {
                drawable = m27786q();
            }
            this.f26051n.mo24209d(drawable);
        }
    }

    /* renamed from: j */
    private void m27779j() {
        if (this.f26036B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m27780k() {
        C6307d dVar = this.f26042e;
        return dVar == null || dVar.mo24069j(this);
    }

    /* renamed from: l */
    private boolean m27781l() {
        C6307d dVar = this.f26042e;
        return dVar == null || dVar.mo24064f(this);
    }

    /* renamed from: m */
    private boolean m27782m() {
        C6307d dVar = this.f26042e;
        return dVar == null || dVar.mo24066h(this);
    }

    /* renamed from: n */
    private void m27783n() {
        m27779j();
        this.f26039b.mo7114c();
        this.f26051n.mo24215e(this);
        C5298k.C5304d dVar = this.f26056s;
        if (dVar != null) {
            dVar.mo21563a();
            this.f26056s = null;
        }
    }

    /* renamed from: o */
    private Drawable m27784o() {
        if (this.f26060w == null) {
            Drawable l = this.f26047j.mo24044l();
            this.f26060w = l;
            if (l == null && this.f26047j.mo24042k() > 0) {
                this.f26060w = m27788s(this.f26047j.mo24042k());
            }
        }
        return this.f26060w;
    }

    /* renamed from: p */
    private Drawable m27785p() {
        if (this.f26062y == null) {
            Drawable m = this.f26047j.mo24046m();
            this.f26062y = m;
            if (m == null && this.f26047j.mo24048n() > 0) {
                this.f26062y = m27788s(this.f26047j.mo24048n());
            }
        }
        return this.f26062y;
    }

    /* renamed from: q */
    private Drawable m27786q() {
        if (this.f26061x == null) {
            Drawable y = this.f26047j.mo24057y();
            this.f26061x = y;
            if (y == null && this.f26047j.mo24010B() > 0) {
                this.f26061x = m27788s(this.f26047j.mo24010B());
            }
        }
        return this.f26061x;
    }

    /* renamed from: r */
    private boolean m27787r() {
        C6307d dVar = this.f26042e;
        return dVar == null || !dVar.mo24060c().mo24059b();
    }

    /* renamed from: s */
    private Drawable m27788s(int i) {
        return C5897a.m26042a(this.f26044g, i, this.f26047j.mo24015K() != null ? this.f26047j.mo24015K() : this.f26043f.getTheme());
    }

    /* renamed from: t */
    private void m27789t(String str) {
        Log.v("Request", str + " this: " + this.f26038a);
    }

    /* renamed from: u */
    private static int m27790u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: v */
    private void m27791v() {
        C6307d dVar = this.f26042e;
        if (dVar != null) {
            dVar.mo24058a(this);
        }
    }

    /* renamed from: w */
    private void m27792w() {
        C6307d dVar = this.f26042e;
        if (dVar != null) {
            dVar.mo24070k(this);
        }
    }

    /* renamed from: x */
    public static <R> C6312h<R> m27793x(Context context, C3323d dVar, Object obj, Object obj2, Class<R> cls, C6304a<?> aVar, int i, int i2, C3325f fVar, C6386h<R> hVar, C6309e<R> eVar, List<C6309e<R>> list, C6307d dVar2, C5298k kVar, C6407c<? super R> cVar, Executor executor) {
        return new C6312h(context, dVar, obj, obj2, cls, aVar, i, i2, fVar, hVar, eVar, list, dVar2, kVar, cVar, executor);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y */
    private void m27794y(C5316q qVar, int i) {
        boolean z;
        this.f26039b.mo7114c();
        synchronized (this.f26040c) {
            qVar.mo21607k(this.f26037C);
            int g = this.f26044g.mo11115g();
            if (g <= i) {
                Log.w("Glide", "Load failed for " + this.f26045h + " with size [" + this.f26063z + "x" + this.f26035A + "]", qVar);
                if (g <= 4) {
                    qVar.mo21603g("Glide");
                }
            }
            this.f26056s = null;
            this.f26059v = C6313a.FAILED;
            boolean z2 = true;
            this.f26036B = true;
            try {
                List<C6309e<R>> list = this.f26052o;
                if (list != null) {
                    z = false;
                    for (C6309e<R> onLoadFailed : list) {
                        z |= onLoadFailed.onLoadFailed(qVar, this.f26045h, this.f26051n, m27787r());
                    }
                } else {
                    z = false;
                }
                C6309e<R> eVar = this.f26041d;
                if (eVar == null || !eVar.onLoadFailed(qVar, this.f26045h, this.f26051n, m27787r())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m27778A();
                }
                this.f26036B = false;
                m27791v();
            } catch (Throwable th) {
                this.f26036B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7 A[Catch:{ all -> 0x00b8 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27795z(p082g2.C5323v<R> r11, R r12, p065d2.C5154a r13) {
        /*
            r10 = this;
            boolean r6 = r10.m27787r()
            w2.h$a r0 = p169w2.C6312h.C6313a.COMPLETE
            r10.f26059v = r0
            r10.f26055r = r11
            com.bumptech.glide.d r11 = r10.f26044g
            int r11 = r11.mo11115g()
            r0 = 3
            if (r11 > r0) goto L_0x006a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f26045h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f26063z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f26035A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f26057t
            double r0 = p004a3.C0061f.m230a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x006a:
            r11 = 1
            r10.f26036B = r11
            r7 = 0
            java.util.List<w2.e<R>> r0 = r10.f26052o     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r9 = 0
        L_0x0077:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b8 }
            w2.e r0 = (p169w2.C6309e) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r10.f26045h     // Catch:{ all -> 0x00b8 }
            x2.h<R> r3 = r10.f26051n     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r9 = r9 | r0
            goto L_0x0077
        L_0x0090:
            r9 = 0
        L_0x0091:
            w2.e<R> r0 = r10.f26041d     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r2 = r10.f26045h     // Catch:{ all -> 0x00b8 }
            x2.h<R> r3 = r10.f26051n     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b2
            y2.c<? super R> r11 = r10.f26053p     // Catch:{ all -> 0x00b8 }
            y2.b r11 = r11.mo24238a(r13, r6)     // Catch:{ all -> 0x00b8 }
            x2.h<R> r13 = r10.f26051n     // Catch:{ all -> 0x00b8 }
            r13.mo23079b(r12, r11)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            r10.f26036B = r7
            r10.m27792w()
            return
        L_0x00b8:
            r11 = move-exception
            r10.f26036B = r7
            goto L_0x00bd
        L_0x00bc:
            throw r11
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6312h.m27795z(g2.v, java.lang.Object, d2.a):void");
    }

    /* renamed from: a */
    public void mo24074a(C5323v<?> vVar, C5154a aVar) {
        this.f26039b.mo7114c();
        C5323v<?> vVar2 = null;
        try {
            synchronized (this.f26040c) {
                try {
                    this.f26056s = null;
                    if (vVar == null) {
                        mo24075c(new C5316q("Expected to receive a Resource<R> with an object of " + this.f26046i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    if (obj != null) {
                        if (this.f26046i.isAssignableFrom(obj.getClass())) {
                            if (!m27782m()) {
                                try {
                                    this.f26055r = null;
                                    this.f26059v = C6313a.COMPLETE;
                                    this.f26058u.mo21558k(vVar);
                                    return;
                                } catch (Throwable th) {
                                    vVar2 = vVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                m27795z(vVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.f26055r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f26046i);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(vVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    mo24075c(new C5316q(sb.toString()));
                    this.f26058u.mo21558k(vVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f26058u.mo21558k(vVar2);
            }
            throw th3;
        }
    }

    /* renamed from: b */
    public boolean mo24059b() {
        boolean z;
        synchronized (this.f26040c) {
            z = this.f26059v == C6313a.COMPLETE;
        }
        return z;
    }

    /* renamed from: c */
    public void mo24075c(C5316q qVar) {
        m27794y(qVar, 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f26058u.mo21558k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f26040c
            monitor-enter(r0)
            r5.m27779j()     // Catch:{ all -> 0x0039 }
            b3.c r1 = r5.f26039b     // Catch:{ all -> 0x0039 }
            r1.mo7114c()     // Catch:{ all -> 0x0039 }
            w2.h$a r1 = r5.f26059v     // Catch:{ all -> 0x0039 }
            w2.h$a r2 = p169w2.C6312h.C6313a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.m27783n()     // Catch:{ all -> 0x0039 }
            g2.v<R> r1 = r5.f26055r     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f26055r = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m27780k()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            x2.h<R> r3 = r5.f26051n     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.m27786q()     // Catch:{ all -> 0x0039 }
            r3.mo23080h(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f26059v = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            g2.k r0 = r5.f26058u
            r0.mo21558k(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6312h.clear():void");
    }

    /* renamed from: d */
    public boolean mo24062d() {
        boolean z;
        synchronized (this.f26040c) {
            z = this.f26059v == C6313a.COMPLETE;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo24063e(C6306c cVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C6304a<?> aVar;
        C3325f fVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C6304a<?> aVar2;
        C3325f fVar2;
        int size2;
        C6306c cVar2 = cVar;
        if (!(cVar2 instanceof C6312h)) {
            return false;
        }
        synchronized (this.f26040c) {
            i = this.f26048k;
            i2 = this.f26049l;
            obj = this.f26045h;
            cls = this.f26046i;
            aVar = this.f26047j;
            fVar = this.f26050m;
            List<C6309e<R>> list = this.f26052o;
            size = list != null ? list.size() : 0;
        }
        C6312h hVar = (C6312h) cVar2;
        synchronized (hVar.f26040c) {
            i3 = hVar.f26048k;
            i4 = hVar.f26049l;
            obj2 = hVar.f26045h;
            cls2 = hVar.f26046i;
            aVar2 = hVar.f26047j;
            fVar2 = hVar.f26050m;
            List<C6309e<R>> list2 = hVar.f26052o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C0066k.m250b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2;
    }

    /* renamed from: f */
    public void mo24077f(int i, int i2) {
        Object obj;
        this.f26039b.mo7114c();
        Object obj2 = this.f26040c;
        synchronized (obj2) {
            try {
                boolean z = f26034D;
                if (z) {
                    m27789t("Got onSizeReady in " + C0061f.m230a(this.f26057t));
                }
                if (this.f26059v == C6313a.WAITING_FOR_SIZE) {
                    C6313a aVar = C6313a.RUNNING;
                    this.f26059v = aVar;
                    float J = this.f26047j.mo24014J();
                    this.f26063z = m27790u(i, J);
                    this.f26035A = m27790u(i2, J);
                    if (z) {
                        m27789t("finished setup for calling load in " + C0061f.m230a(this.f26057t));
                    }
                    C6313a aVar2 = aVar;
                    boolean z2 = z;
                    C6313a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f26056s = this.f26058u.mo21557f(this.f26044g, this.f26045h, this.f26047j.mo24013I(), this.f26063z, this.f26035A, this.f26047j.mo24012H(), this.f26046i, this.f26050m, this.f26047j.mo24039i(), this.f26047j.mo24016L(), this.f26047j.mo24023U(), this.f26047j.mo24021Q(), this.f26047j.mo24052p(), this.f26047j.mo24019O(), this.f26047j.mo24018N(), this.f26047j.mo24017M(), this.f26047j.mo24050o(), this, this.f26054q);
                        if (this.f26059v != aVar3) {
                            this.f26056s = null;
                        }
                        if (z2) {
                            m27789t("finished onSizeReady in " + C0061f.m230a(this.f26057t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: g */
    public boolean mo24065g() {
        boolean z;
        synchronized (this.f26040c) {
            z = this.f26059v == C6313a.CLEARED;
        }
        return z;
    }

    /* renamed from: h */
    public Object mo24076h() {
        this.f26039b.mo7114c();
        return this.f26040c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24067i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f26040c
            monitor-enter(r0)
            r5.m27779j()     // Catch:{ all -> 0x00a7 }
            b3.c r1 = r5.f26039b     // Catch:{ all -> 0x00a7 }
            r1.mo7114c()     // Catch:{ all -> 0x00a7 }
            long r1 = p004a3.C0061f.m231b()     // Catch:{ all -> 0x00a7 }
            r5.f26057t = r1     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r5.f26045h     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f26048k     // Catch:{ all -> 0x00a7 }
            int r2 = r5.f26049l     // Catch:{ all -> 0x00a7 }
            boolean r1 = p004a3.C0066k.m267s(r1, r2)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f26048k     // Catch:{ all -> 0x00a7 }
            r5.f26063z = r1     // Catch:{ all -> 0x00a7 }
            int r1 = r5.f26049l     // Catch:{ all -> 0x00a7 }
            r5.f26035A = r1     // Catch:{ all -> 0x00a7 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.m27785p()     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            g2.q r2 = new g2.q     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a7 }
            r5.m27794y(r2, r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x003c:
            w2.h$a r1 = r5.f26059v     // Catch:{ all -> 0x00a7 }
            w2.h$a r2 = p169w2.C6312h.C6313a.RUNNING     // Catch:{ all -> 0x00a7 }
            if (r1 == r2) goto L_0x009f
            w2.h$a r3 = p169w2.C6312h.C6313a.COMPLETE     // Catch:{ all -> 0x00a7 }
            if (r1 != r3) goto L_0x004f
            g2.v<R> r1 = r5.f26055r     // Catch:{ all -> 0x00a7 }
            d2.a r2 = p065d2.C5154a.MEMORY_CACHE     // Catch:{ all -> 0x00a7 }
            r5.mo24074a(r1, r2)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x004f:
            w2.h$a r1 = p169w2.C6312h.C6313a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a7 }
            r5.f26059v = r1     // Catch:{ all -> 0x00a7 }
            int r3 = r5.f26048k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f26049l     // Catch:{ all -> 0x00a7 }
            boolean r3 = p004a3.C0066k.m267s(r3, r4)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0065
            int r3 = r5.f26048k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f26049l     // Catch:{ all -> 0x00a7 }
            r5.mo24077f(r3, r4)     // Catch:{ all -> 0x00a7 }
            goto L_0x006a
        L_0x0065:
            x2.h<R> r3 = r5.f26051n     // Catch:{ all -> 0x00a7 }
            r3.mo24213a(r5)     // Catch:{ all -> 0x00a7 }
        L_0x006a:
            w2.h$a r3 = r5.f26059v     // Catch:{ all -> 0x00a7 }
            if (r3 == r2) goto L_0x0070
            if (r3 != r1) goto L_0x007f
        L_0x0070:
            boolean r1 = r5.m27781l()     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007f
            x2.h<R> r1 = r5.f26051n     // Catch:{ all -> 0x00a7 }
            android.graphics.drawable.Drawable r2 = r5.m27786q()     // Catch:{ all -> 0x00a7 }
            r1.mo24210f(r2)     // Catch:{ all -> 0x00a7 }
        L_0x007f:
            boolean r1 = f26034D     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            long r2 = r5.f26057t     // Catch:{ all -> 0x00a7 }
            double r2 = p004a3.C0061f.m230a(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r5.m27789t(r1)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x009f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6312h.mo24067i():void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f26040c) {
            C6313a aVar = this.f26059v;
            if (aVar != C6313a.RUNNING) {
                if (aVar != C6313a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void pause() {
        synchronized (this.f26040c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
