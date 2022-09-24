package p230l7;

import p230l7.C10732d;

/* renamed from: l7.a */
/* compiled from: AutoValue_InstallationResponse */
final class C10725a extends C10732d {

    /* renamed from: a */
    private final String f49349a;

    /* renamed from: b */
    private final String f49350b;

    /* renamed from: c */
    private final String f49351c;

    /* renamed from: d */
    private final C10736f f49352d;

    /* renamed from: e */
    private final C10732d.C10734b f49353e;

    /* renamed from: l7.a$b */
    /* compiled from: AutoValue_InstallationResponse */
    static final class C10727b extends C10732d.C10733a {

        /* renamed from: a */
        private String f49354a;

        /* renamed from: b */
        private String f49355b;

        /* renamed from: c */
        private String f49356c;

        /* renamed from: d */
        private C10736f f49357d;

        /* renamed from: e */
        private C10732d.C10734b f49358e;

        C10727b() {
        }

        /* renamed from: a */
        public C10732d mo42885a() {
            return new C10725a(this.f49354a, this.f49355b, this.f49356c, this.f49357d, this.f49358e);
        }

        /* renamed from: b */
        public C10732d.C10733a mo42886b(C10736f fVar) {
            this.f49357d = fVar;
            return this;
        }

        /* renamed from: c */
        public C10732d.C10733a mo42887c(String str) {
            this.f49355b = str;
            return this;
        }

        /* renamed from: d */
        public C10732d.C10733a mo42888d(String str) {
            this.f49356c = str;
            return this;
        }

        /* renamed from: e */
        public C10732d.C10733a mo42889e(C10732d.C10734b bVar) {
            this.f49358e = bVar;
            return this;
        }

        /* renamed from: f */
        public C10732d.C10733a mo42890f(String str) {
            this.f49354a = str;
            return this;
        }
    }

    /* renamed from: b */
    public C10736f mo42877b() {
        return this.f49352d;
    }

    /* renamed from: c */
    public String mo42878c() {
        return this.f49350b;
    }

    /* renamed from: d */
    public String mo42879d() {
        return this.f49351c;
    }

    /* renamed from: e */
    public C10732d.C10734b mo42880e() {
        return this.f49353e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10732d)) {
            return false;
        }
        C10732d dVar = (C10732d) obj;
        String str = this.f49349a;
        if (str != null ? str.equals(dVar.mo42882f()) : dVar.mo42882f() == null) {
            String str2 = this.f49350b;
            if (str2 != null ? str2.equals(dVar.mo42878c()) : dVar.mo42878c() == null) {
                String str3 = this.f49351c;
                if (str3 != null ? str3.equals(dVar.mo42879d()) : dVar.mo42879d() == null) {
                    C10736f fVar = this.f49352d;
                    if (fVar != null ? fVar.equals(dVar.mo42877b()) : dVar.mo42877b() == null) {
                        C10732d.C10734b bVar = this.f49353e;
                        if (bVar == null) {
                            if (dVar.mo42880e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo42880e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo42882f() {
        return this.f49349a;
    }

    public int hashCode() {
        String str = this.f49349a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f49350b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f49351c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C10736f fVar = this.f49352d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C10732d.C10734b bVar = this.f49353e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f49349a + ", fid=" + this.f49350b + ", refreshToken=" + this.f49351c + ", authToken=" + this.f49352d + ", responseCode=" + this.f49353e + "}";
    }

    private C10725a(String str, String str2, String str3, C10736f fVar, C10732d.C10734b bVar) {
        this.f49349a = str;
        this.f49350b = str2;
        this.f49351c = str3;
        this.f49352d = fVar;
        this.f49353e = bVar;
    }
}
