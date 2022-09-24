package p147s3;

import p147s3.C6060o;

/* renamed from: s3.i */
/* compiled from: AutoValue_NetworkConnectionInfo */
final class C6048i extends C6060o {

    /* renamed from: a */
    private final C6060o.C6063c f25187a;

    /* renamed from: b */
    private final C6060o.C6062b f25188b;

    /* renamed from: s3.i$b */
    /* compiled from: AutoValue_NetworkConnectionInfo */
    static final class C6050b extends C6060o.C6061a {

        /* renamed from: a */
        private C6060o.C6063c f25189a;

        /* renamed from: b */
        private C6060o.C6062b f25190b;

        C6050b() {
        }

        /* renamed from: a */
        public C6060o mo23246a() {
            return new C6048i(this.f25189a, this.f25190b);
        }

        /* renamed from: b */
        public C6060o.C6061a mo23247b(C6060o.C6062b bVar) {
            this.f25190b = bVar;
            return this;
        }

        /* renamed from: c */
        public C6060o.C6061a mo23248c(C6060o.C6063c cVar) {
            this.f25189a = cVar;
            return this;
        }
    }

    /* renamed from: b */
    public C6060o.C6062b mo23241b() {
        return this.f25188b;
    }

    /* renamed from: c */
    public C6060o.C6063c mo23242c() {
        return this.f25187a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6060o)) {
            return false;
        }
        C6060o oVar = (C6060o) obj;
        C6060o.C6063c cVar = this.f25187a;
        if (cVar != null ? cVar.equals(oVar.mo23242c()) : oVar.mo23242c() == null) {
            C6060o.C6062b bVar = this.f25188b;
            if (bVar == null) {
                if (oVar.mo23241b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.mo23241b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C6060o.C6063c cVar = this.f25187a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C6060o.C6062b bVar = this.f25188b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f25187a + ", mobileSubtype=" + this.f25188b + "}";
    }

    private C6048i(C6060o.C6063c cVar, C6060o.C6062b bVar) {
        this.f25187a = cVar;
        this.f25188b = bVar;
    }
}
