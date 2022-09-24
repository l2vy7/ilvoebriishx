package androidx.work;

import android.os.Build;

/* renamed from: androidx.work.c */
/* compiled from: Constraints */
public final class C1423c {

    /* renamed from: i */
    public static final C1423c f6310i = new C1424a().mo6888a();

    /* renamed from: a */
    private C1485n f6311a = C1485n.NOT_REQUIRED;

    /* renamed from: b */
    private boolean f6312b;

    /* renamed from: c */
    private boolean f6313c;

    /* renamed from: d */
    private boolean f6314d;

    /* renamed from: e */
    private boolean f6315e;

    /* renamed from: f */
    private long f6316f = -1;

    /* renamed from: g */
    private long f6317g = -1;

    /* renamed from: h */
    private C1425d f6318h = new C1425d();

    /* renamed from: androidx.work.c$a */
    /* compiled from: Constraints */
    public static final class C1424a {

        /* renamed from: a */
        boolean f6319a = false;

        /* renamed from: b */
        boolean f6320b = false;

        /* renamed from: c */
        C1485n f6321c = C1485n.NOT_REQUIRED;

        /* renamed from: d */
        boolean f6322d = false;

        /* renamed from: e */
        boolean f6323e = false;

        /* renamed from: f */
        long f6324f = -1;

        /* renamed from: g */
        long f6325g = -1;

        /* renamed from: h */
        C1425d f6326h = new C1425d();

        /* renamed from: a */
        public C1423c mo6888a() {
            return new C1423c(this);
        }

        /* renamed from: b */
        public C1424a mo6889b(C1485n nVar) {
            this.f6321c = nVar;
            return this;
        }
    }

    public C1423c() {
    }

    /* renamed from: a */
    public C1425d mo6869a() {
        return this.f6318h;
    }

    /* renamed from: b */
    public C1485n mo6870b() {
        return this.f6311a;
    }

    /* renamed from: c */
    public long mo6871c() {
        return this.f6316f;
    }

    /* renamed from: d */
    public long mo6872d() {
        return this.f6317g;
    }

    /* renamed from: e */
    public boolean mo6873e() {
        return this.f6318h.mo6892c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1423c.class != obj.getClass()) {
            return false;
        }
        C1423c cVar = (C1423c) obj;
        if (this.f6312b == cVar.f6312b && this.f6313c == cVar.f6313c && this.f6314d == cVar.f6314d && this.f6315e == cVar.f6315e && this.f6316f == cVar.f6316f && this.f6317g == cVar.f6317g && this.f6311a == cVar.f6311a) {
            return this.f6318h.equals(cVar.f6318h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo6875f() {
        return this.f6314d;
    }

    /* renamed from: g */
    public boolean mo6876g() {
        return this.f6312b;
    }

    /* renamed from: h */
    public boolean mo6877h() {
        return this.f6313c;
    }

    public int hashCode() {
        long j = this.f6316f;
        long j2 = this.f6317g;
        return (((((((((((((this.f6311a.hashCode() * 31) + (this.f6312b ? 1 : 0)) * 31) + (this.f6313c ? 1 : 0)) * 31) + (this.f6314d ? 1 : 0)) * 31) + (this.f6315e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f6318h.hashCode();
    }

    /* renamed from: i */
    public boolean mo6879i() {
        return this.f6315e;
    }

    /* renamed from: j */
    public void mo6880j(C1425d dVar) {
        this.f6318h = dVar;
    }

    /* renamed from: k */
    public void mo6881k(C1485n nVar) {
        this.f6311a = nVar;
    }

    /* renamed from: l */
    public void mo6882l(boolean z) {
        this.f6314d = z;
    }

    /* renamed from: m */
    public void mo6883m(boolean z) {
        this.f6312b = z;
    }

    /* renamed from: n */
    public void mo6884n(boolean z) {
        this.f6313c = z;
    }

    /* renamed from: o */
    public void mo6885o(boolean z) {
        this.f6315e = z;
    }

    /* renamed from: p */
    public void mo6886p(long j) {
        this.f6316f = j;
    }

    /* renamed from: q */
    public void mo6887q(long j) {
        this.f6317g = j;
    }

    C1423c(C1424a aVar) {
        this.f6312b = aVar.f6319a;
        int i = Build.VERSION.SDK_INT;
        this.f6313c = i >= 23 && aVar.f6320b;
        this.f6311a = aVar.f6321c;
        this.f6314d = aVar.f6322d;
        this.f6315e = aVar.f6323e;
        if (i >= 24) {
            this.f6318h = aVar.f6326h;
            this.f6316f = aVar.f6324f;
            this.f6317g = aVar.f6325g;
        }
    }

    public C1423c(C1423c cVar) {
        this.f6312b = cVar.f6312b;
        this.f6313c = cVar.f6313c;
        this.f6311a = cVar.f6311a;
        this.f6314d = cVar.f6314d;
        this.f6315e = cVar.f6315e;
        this.f6318h = cVar.f6318h;
    }
}
