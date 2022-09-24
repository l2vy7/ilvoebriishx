package p147s3;

import p147s3.C6052k;

/* renamed from: s3.e */
/* compiled from: AutoValue_ClientInfo */
final class C6038e extends C6052k {

    /* renamed from: a */
    private final C6052k.C6054b f25154a;

    /* renamed from: b */
    private final C6025a f25155b;

    /* renamed from: s3.e$b */
    /* compiled from: AutoValue_ClientInfo */
    static final class C6040b extends C6052k.C6053a {

        /* renamed from: a */
        private C6052k.C6054b f25156a;

        /* renamed from: b */
        private C6025a f25157b;

        C6040b() {
        }

        /* renamed from: a */
        public C6052k mo23198a() {
            return new C6038e(this.f25156a, this.f25157b);
        }

        /* renamed from: b */
        public C6052k.C6053a mo23199b(C6025a aVar) {
            this.f25157b = aVar;
            return this;
        }

        /* renamed from: c */
        public C6052k.C6053a mo23200c(C6052k.C6054b bVar) {
            this.f25156a = bVar;
            return this;
        }
    }

    /* renamed from: b */
    public C6025a mo23193b() {
        return this.f25155b;
    }

    /* renamed from: c */
    public C6052k.C6054b mo23194c() {
        return this.f25154a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6052k)) {
            return false;
        }
        C6052k kVar = (C6052k) obj;
        C6052k.C6054b bVar = this.f25154a;
        if (bVar != null ? bVar.equals(kVar.mo23194c()) : kVar.mo23194c() == null) {
            C6025a aVar = this.f25155b;
            if (aVar == null) {
                if (kVar.mo23193b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.mo23193b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C6052k.C6054b bVar = this.f25154a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C6025a aVar = this.f25155b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f25154a + ", androidClientInfo=" + this.f25155b + "}";
    }

    private C6038e(C6052k.C6054b bVar, C6025a aVar) {
        this.f25154a = bVar;
        this.f25155b = aVar;
    }
}
