package p082g2;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C3323d;
import com.bumptech.glide.C3325f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p004a3.C0061f;
import p013b3.C1554a;
import p013b3.C1562b;
import p013b3.C1563c;
import p065d2.C5154a;
import p065d2.C5159f;
import p065d2.C5160g;
import p065d2.C5163h;
import p065d2.C5166k;
import p065d2.C5167l;
import p071e2.C5208d;
import p071e2.C5210e;
import p082g2.C5278f;
import p082g2.C5290i;
import p092i2.C5445a;
import p105l0.C5645e;
import p119n2.C5831m;

/* renamed from: g2.h */
/* compiled from: DecodeJob */
class C5281h<R> implements C5278f.C5279a, Runnable, Comparable<C5281h<?>>, C1554a.C1560f {

    /* renamed from: A */
    private Object f23333A;

    /* renamed from: B */
    private C5154a f23334B;

    /* renamed from: C */
    private C5208d<?> f23335C;

    /* renamed from: D */
    private volatile C5278f f23336D;

    /* renamed from: E */
    private volatile boolean f23337E;

    /* renamed from: F */
    private volatile boolean f23338F;

    /* renamed from: b */
    private final C5280g<R> f23339b = new C5280g<>();

    /* renamed from: c */
    private final List<Throwable> f23340c = new ArrayList();

    /* renamed from: d */
    private final C1563c f23341d = C1563c.m7996a();

    /* renamed from: e */
    private final C5286e f23342e;

    /* renamed from: f */
    private final C5645e<C5281h<?>> f23343f;

    /* renamed from: g */
    private final C5285d<?> f23344g = new C5285d<>();

    /* renamed from: h */
    private final C5287f f23345h = new C5287f();

    /* renamed from: i */
    private C3323d f23346i;

    /* renamed from: j */
    private C5159f f23347j;

    /* renamed from: k */
    private C3325f f23348k;

    /* renamed from: l */
    private C5312n f23349l;

    /* renamed from: m */
    private int f23350m;

    /* renamed from: n */
    private int f23351n;

    /* renamed from: o */
    private C5292j f23352o;

    /* renamed from: p */
    private C5163h f23353p;

    /* renamed from: q */
    private C5283b<R> f23354q;

    /* renamed from: r */
    private int f23355r;

    /* renamed from: s */
    private C5289h f23356s;

    /* renamed from: t */
    private C5288g f23357t;

    /* renamed from: u */
    private long f23358u;

    /* renamed from: v */
    private boolean f23359v;

    /* renamed from: w */
    private Object f23360w;

    /* renamed from: x */
    private Thread f23361x;

    /* renamed from: y */
    private C5159f f23362y;

    /* renamed from: z */
    private C5159f f23363z;

    /* renamed from: g2.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C5282a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23364a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23365b;

        /* renamed from: c */
        static final /* synthetic */ int[] f23366c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                d2.c[] r0 = p065d2.C5156c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23366c = r0
                r1 = 1
                d2.c r2 = p065d2.C5156c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23366c     // Catch:{ NoSuchFieldError -> 0x001d }
                d2.c r3 = p065d2.C5156c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                g2.h$h[] r2 = p082g2.C5281h.C5289h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f23365b = r2
                g2.h$h r3 = p082g2.C5281h.C5289h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f23365b     // Catch:{ NoSuchFieldError -> 0x0038 }
                g2.h$h r3 = p082g2.C5281h.C5289h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f23365b     // Catch:{ NoSuchFieldError -> 0x0043 }
                g2.h$h r4 = p082g2.C5281h.C5289h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f23365b     // Catch:{ NoSuchFieldError -> 0x004e }
                g2.h$h r4 = p082g2.C5281h.C5289h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f23365b     // Catch:{ NoSuchFieldError -> 0x0059 }
                g2.h$h r4 = p082g2.C5281h.C5289h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                g2.h$g[] r3 = p082g2.C5281h.C5288g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f23364a = r3
                g2.h$g r4 = p082g2.C5281h.C5288g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f23364a     // Catch:{ NoSuchFieldError -> 0x0074 }
                g2.h$g r3 = p082g2.C5281h.C5288g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f23364a     // Catch:{ NoSuchFieldError -> 0x007e }
                g2.h$g r1 = p082g2.C5281h.C5288g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082g2.C5281h.C5282a.<clinit>():void");
        }
    }

    /* renamed from: g2.h$b */
    /* compiled from: DecodeJob */
    interface C5283b<R> {
        /* renamed from: a */
        void mo21534a(C5323v<R> vVar, C5154a aVar);

        /* renamed from: c */
        void mo21535c(C5316q qVar);

        /* renamed from: d */
        void mo21536d(C5281h<?> hVar);
    }

    /* renamed from: g2.h$c */
    /* compiled from: DecodeJob */
    private final class C5284c<Z> implements C5290i.C5291a<Z> {

        /* renamed from: a */
        private final C5154a f23367a;

        C5284c(C5154a aVar) {
            this.f23367a = aVar;
        }

        /* renamed from: a */
        public C5323v<Z> mo21537a(C5323v<Z> vVar) {
            return C5281h.this.mo21526F(this.f23367a, vVar);
        }
    }

    /* renamed from: g2.h$d */
    /* compiled from: DecodeJob */
    private static class C5285d<Z> {

        /* renamed from: a */
        private C5159f f23369a;

        /* renamed from: b */
        private C5166k<Z> f23370b;

        /* renamed from: c */
        private C5321u<Z> f23371c;

        C5285d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo21538a() {
            this.f23369a = null;
            this.f23370b = null;
            this.f23371c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo21539b(C5286e eVar, C5163h hVar) {
            C1562b.m7992a("DecodeJob.encode");
            try {
                eVar.mo21542a().mo21910b(this.f23369a, new C5277e(this.f23370b, this.f23371c, hVar));
            } finally {
                this.f23371c.mo21620g();
                C1562b.m7995d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo21540c() {
            return this.f23371c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <X> void mo21541d(C5159f fVar, C5166k<X> kVar, C5321u<X> uVar) {
            this.f23369a = fVar;
            this.f23370b = kVar;
            this.f23371c = uVar;
        }
    }

    /* renamed from: g2.h$e */
    /* compiled from: DecodeJob */
    interface C5286e {
        /* renamed from: a */
        C5445a mo21542a();
    }

    /* renamed from: g2.h$f */
    /* compiled from: DecodeJob */
    private static class C5287f {

        /* renamed from: a */
        private boolean f23372a;

        /* renamed from: b */
        private boolean f23373b;

        /* renamed from: c */
        private boolean f23374c;

        C5287f() {
        }

        /* renamed from: a */
        private boolean m23877a(boolean z) {
            return (this.f23374c || z || this.f23373b) && this.f23372a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo21543b() {
            this.f23373b = true;
            return m23877a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo21544c() {
            this.f23374c = true;
            return m23877a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo21545d(boolean z) {
            this.f23372a = true;
            return m23877a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo21546e() {
            this.f23373b = false;
            this.f23372a = false;
            this.f23374c = false;
        }
    }

    /* renamed from: g2.h$g */
    /* compiled from: DecodeJob */
    private enum C5288g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: g2.h$h */
    /* compiled from: DecodeJob */
    private enum C5289h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C5281h(C5286e eVar, C5645e<C5281h<?>> eVar2) {
        this.f23342e = eVar;
        this.f23343f = eVar2;
    }

    /* renamed from: A */
    private void m23839A(C5323v<R> vVar, C5154a aVar) {
        m23848L();
        this.f23354q.mo21534a(vVar, aVar);
    }

    /* renamed from: B */
    private void m23840B(C5323v<R> vVar, C5154a aVar) {
        if (vVar instanceof C5318r) {
            ((C5318r) vVar).initialize();
        }
        C5321u<R> uVar = null;
        C5321u<R> uVar2 = vVar;
        if (this.f23344g.mo21540c()) {
            C5321u<R> e = C5321u.m23986e(vVar);
            uVar = e;
            uVar2 = e;
        }
        m23839A(uVar2, aVar);
        this.f23356s = C5289h.ENCODE;
        try {
            if (this.f23344g.mo21540c()) {
                this.f23344g.mo21539b(this.f23342e, this.f23353p);
            }
            m23842D();
        } finally {
            if (uVar != null) {
                uVar.mo21620g();
            }
        }
    }

    /* renamed from: C */
    private void m23841C() {
        m23848L();
        this.f23354q.mo21535c(new C5316q("Failed to load resource", (List<Throwable>) new ArrayList(this.f23340c)));
        m23843E();
    }

    /* renamed from: D */
    private void m23842D() {
        if (this.f23345h.mo21543b()) {
            m23844H();
        }
    }

    /* renamed from: E */
    private void m23843E() {
        if (this.f23345h.mo21544c()) {
            m23844H();
        }
    }

    /* renamed from: H */
    private void m23844H() {
        this.f23345h.mo21546e();
        this.f23344g.mo21538a();
        this.f23339b.mo21502a();
        this.f23337E = false;
        this.f23346i = null;
        this.f23347j = null;
        this.f23353p = null;
        this.f23348k = null;
        this.f23349l = null;
        this.f23354q = null;
        this.f23356s = null;
        this.f23336D = null;
        this.f23361x = null;
        this.f23362y = null;
        this.f23333A = null;
        this.f23334B = null;
        this.f23335C = null;
        this.f23358u = 0;
        this.f23338F = false;
        this.f23360w = null;
        this.f23340c.clear();
        this.f23343f.mo7110a(this);
    }

    /* renamed from: I */
    private void m23845I() {
        this.f23361x = Thread.currentThread();
        this.f23358u = C0061f.m231b();
        boolean z = false;
        while (!this.f23338F && this.f23336D != null && !(z = this.f23336D.mo21495a())) {
            this.f23356s = m23853s(this.f23356s);
            this.f23336D = m23852q();
            if (this.f23356s == C5289h.SOURCE) {
                mo21499d();
                return;
            }
        }
        if ((this.f23356s == C5289h.FINISHED || this.f23338F) && !z) {
            m23841C();
        }
    }

    /* renamed from: J */
    private <Data, ResourceType> C5323v<R> m23846J(Data data, C5154a aVar, C5320t<Data, ResourceType, R> tVar) throws C5316q {
        C5163h u = m23854u(aVar);
        C5210e l = this.f23346i.mo11116h().mo11128l(data);
        try {
            return tVar.mo21618a(l, u, this.f23350m, this.f23351n, new C5284c(aVar));
        } finally {
            l.mo21441b();
        }
    }

    /* renamed from: K */
    private void m23847K() {
        int i = C5282a.f23364a[this.f23357t.ordinal()];
        if (i == 1) {
            this.f23356s = m23853s(C5289h.INITIALIZE);
            this.f23336D = m23852q();
            m23845I();
        } else if (i == 2) {
            m23845I();
        } else if (i == 3) {
            m23851p();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f23357t);
        }
    }

    /* renamed from: L */
    private void m23848L() {
        Throwable th;
        this.f23341d.mo7114c();
        if (this.f23337E) {
            if (this.f23340c.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f23340c;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f23337E = true;
    }

    /* renamed from: n */
    private <Data> C5323v<R> m23849n(C5208d<?> dVar, Data data, C5154a aVar) throws C5316q {
        if (data == null) {
            dVar.mo21427b();
            return null;
        }
        try {
            long b = C0061f.m231b();
            C5323v<R> o = m23850o(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m23856y("Decoded result " + o, b);
            }
            return o;
        } finally {
            dVar.mo21427b();
        }
    }

    /* renamed from: o */
    private <Data> C5323v<R> m23850o(Data data, C5154a aVar) throws C5316q {
        return m23846J(data, aVar, this.f23339b.mo21509h(data.getClass()));
    }

    /* renamed from: p */
    private void m23851p() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f23358u;
            m23857z("Retrieved data", j, "data: " + this.f23333A + ", cache key: " + this.f23362y + ", fetcher: " + this.f23335C);
        }
        C5323v<R> vVar = null;
        try {
            vVar = m23849n(this.f23335C, this.f23333A, this.f23334B);
        } catch (C5316q e) {
            e.mo21605i(this.f23363z, this.f23334B);
            this.f23340c.add(e);
        }
        if (vVar != null) {
            m23840B(vVar, this.f23334B);
        } else {
            m23845I();
        }
    }

    /* renamed from: q */
    private C5278f m23852q() {
        int i = C5282a.f23365b[this.f23356s.ordinal()];
        if (i == 1) {
            return new C5324w(this.f23339b, this);
        }
        if (i == 2) {
            return new C5275c(this.f23339b, this);
        }
        if (i == 3) {
            return new C5328z(this.f23339b, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f23356s);
    }

    /* renamed from: s */
    private C5289h m23853s(C5289h hVar) {
        int i = C5282a.f23365b[hVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f23359v ? C5289h.FINISHED : C5289h.SOURCE;
            }
            if (i == 3 || i == 4) {
                return C5289h.FINISHED;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unrecognized stage: " + hVar);
            } else if (this.f23352o.mo21550b()) {
                return C5289h.RESOURCE_CACHE;
            } else {
                return m23853s(C5289h.RESOURCE_CACHE);
            }
        } else if (this.f23352o.mo21549a()) {
            return C5289h.DATA_CACHE;
        } else {
            return m23853s(C5289h.DATA_CACHE);
        }
    }

    /* renamed from: u */
    private C5163h m23854u(C5154a aVar) {
        C5163h hVar = this.f23353p;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z = aVar == C5154a.RESOURCE_DISK_CACHE || this.f23339b.mo21524w();
        C5160g gVar = C5831m.f24556j;
        Boolean bool = (Boolean) hVar.mo21340c(gVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return hVar;
        }
        C5163h hVar2 = new C5163h();
        hVar2.mo21341d(this.f23353p);
        hVar2.mo21342e(gVar, Boolean.valueOf(z));
        return hVar2;
    }

    /* renamed from: w */
    private int m23855w() {
        return this.f23348k.ordinal();
    }

    /* renamed from: y */
    private void m23856y(String str, long j) {
        m23857z(str, j, (String) null);
    }

    /* renamed from: z */
    private void m23857z(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C0061f.m230a(j));
        sb.append(", load key: ");
        sb.append(this.f23349l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: g2.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: g2.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: g2.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: g2.x} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> p082g2.C5323v<Z> mo21526F(p065d2.C5154a r12, p082g2.C5323v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            d2.a r0 = p065d2.C5154a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            g2.g<R> r0 = r11.f23339b
            d2.l r0 = r0.mo21519r(r8)
            com.bumptech.glide.d r2 = r11.f23346i
            int r3 = r11.f23350m
            int r4 = r11.f23351n
            g2.v r2 = r0.mo21347b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo21591a()
        L_0x002b:
            g2.g<R> r13 = r11.f23339b
            boolean r13 = r13.mo21523v(r0)
            if (r13 == 0) goto L_0x0040
            g2.g<R> r13 = r11.f23339b
            d2.k r1 = r13.mo21515n(r0)
            d2.h r13 = r11.f23353p
            d2.c r13 = r1.mo21346a(r13)
            goto L_0x0042
        L_0x0040:
            d2.c r13 = p065d2.C5156c.NONE
        L_0x0042:
            r10 = r1
            g2.g<R> r1 = r11.f23339b
            d2.f r2 = r11.f23362y
            boolean r1 = r1.mo21525x(r2)
            r2 = 1
            r1 = r1 ^ r2
            g2.j r3 = r11.f23352o
            boolean r12 = r3.mo21552d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = p082g2.C5281h.C5282a.f23366c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            g2.x r12 = new g2.x
            g2.g<R> r13 = r11.f23339b
            h2.b r2 = r13.mo21503b()
            d2.f r3 = r11.f23362y
            d2.f r4 = r11.f23347j
            int r5 = r11.f23350m
            int r6 = r11.f23351n
            d2.h r9 = r11.f23353p
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            g2.d r12 = new g2.d
            d2.f r13 = r11.f23362y
            d2.f r1 = r11.f23347j
            r12.<init>(r13, r1)
        L_0x009b:
            g2.u r0 = p082g2.C5321u.m23986e(r0)
            g2.h$d<?> r13 = r11.f23344g
            r13.mo21541d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.h$d r12 = new com.bumptech.glide.h$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082g2.C5281h.mo21526F(d2.a, g2.v):g2.v");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo21527G(boolean z) {
        if (this.f23345h.mo21545d(z)) {
            m23844H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo21528M() {
        C5289h s = m23853s(C5289h.INITIALIZE);
        return s == C5289h.RESOURCE_CACHE || s == C5289h.DATA_CACHE;
    }

    /* renamed from: d */
    public void mo21499d() {
        this.f23357t = C5288g.SWITCH_TO_SOURCE_SERVICE;
        this.f23354q.mo21536d(this);
    }

    /* renamed from: i */
    public void mo21500i(C5159f fVar, Object obj, C5208d<?> dVar, C5154a aVar, C5159f fVar2) {
        this.f23362y = fVar;
        this.f23333A = obj;
        this.f23335C = dVar;
        this.f23334B = aVar;
        this.f23363z = fVar2;
        if (Thread.currentThread() != this.f23361x) {
            this.f23357t = C5288g.DECODE_DATA;
            this.f23354q.mo21536d(this);
            return;
        }
        C1562b.m7992a("DecodeJob.decodeFromRetrievedData");
        try {
            m23851p();
        } finally {
            C1562b.m7995d();
        }
    }

    /* renamed from: j */
    public void mo21501j(C5159f fVar, Exception exc, C5208d<?> dVar, C5154a aVar) {
        dVar.mo21427b();
        C5316q qVar = new C5316q("Fetching data failed", (Throwable) exc);
        qVar.mo21606j(fVar, aVar, dVar.mo21422a());
        this.f23340c.add(qVar);
        if (Thread.currentThread() != this.f23361x) {
            this.f23357t = C5288g.SWITCH_TO_SOURCE_SERVICE;
            this.f23354q.mo21536d(this);
            return;
        }
        m23845I();
    }

    /* renamed from: k */
    public C1563c mo7112k() {
        return this.f23341d;
    }

    /* renamed from: l */
    public void mo21530l() {
        this.f23338F = true;
        C5278f fVar = this.f23336D;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: m */
    public int compareTo(C5281h<?> hVar) {
        int w = m23855w() - hVar.m23855w();
        return w == 0 ? this.f23355r - hVar.f23355r : w;
    }

    public void run() {
        C1562b.m7993b("DecodeJob#run(model=%s)", this.f23360w);
        C5208d<?> dVar = this.f23335C;
        try {
            if (this.f23338F) {
                m23841C();
                if (dVar != null) {
                    dVar.mo21427b();
                }
                C1562b.m7995d();
                return;
            }
            m23847K();
            if (dVar != null) {
                dVar.mo21427b();
            }
            C1562b.m7995d();
        } catch (C5274b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo21427b();
            }
            C1562b.m7995d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C5281h<R> mo21533x(C3323d dVar, Object obj, C5312n nVar, C5159f fVar, int i, int i2, Class<?> cls, Class<R> cls2, C3325f fVar2, C5292j jVar, Map<Class<?>, C5167l<?>> map, boolean z, boolean z2, boolean z3, C5163h hVar, C5283b<R> bVar, int i3) {
        this.f23339b.mo21522u(dVar, obj, fVar, i, i2, jVar, cls, cls2, fVar2, hVar, map, z, z2, this.f23342e);
        this.f23346i = dVar;
        this.f23347j = fVar;
        this.f23348k = fVar2;
        this.f23349l = nVar;
        this.f23350m = i;
        this.f23351n = i2;
        this.f23352o = jVar;
        this.f23359v = z3;
        this.f23353p = hVar;
        this.f23354q = bVar;
        this.f23355r = i3;
        this.f23357t = C5288g.INITIALIZE;
        this.f23360w = obj;
        return this;
    }
}
