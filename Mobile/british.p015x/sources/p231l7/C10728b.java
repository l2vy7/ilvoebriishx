package p231l7;

import p231l7.C10736f;

/* renamed from: l7.b */
/* compiled from: AutoValue_TokenResult */
final class C10728b extends C10736f {

    /* renamed from: a */
    private final String f49359a;

    /* renamed from: b */
    private final long f49360b;

    /* renamed from: c */
    private final C10736f.C10738b f49361c;

    /* renamed from: l7.b$b */
    /* compiled from: AutoValue_TokenResult */
    static final class C10730b extends C10736f.C10737a {

        /* renamed from: a */
        private String f49362a;

        /* renamed from: b */
        private Long f49363b;

        /* renamed from: c */
        private C10736f.C10738b f49364c;

        C10730b() {
        }

        /* renamed from: a */
        public C10736f mo42897a() {
            String str = "";
            if (this.f49363b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C10728b(this.f49362a, this.f49363b.longValue(), this.f49364c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10736f.C10737a mo42898b(C10736f.C10738b bVar) {
            this.f49364c = bVar;
            return this;
        }

        /* renamed from: c */
        public C10736f.C10737a mo42899c(String str) {
            this.f49362a = str;
            return this;
        }

        /* renamed from: d */
        public C10736f.C10737a mo42900d(long j) {
            this.f49363b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public C10736f.C10738b mo42891b() {
        return this.f49361c;
    }

    /* renamed from: c */
    public String mo42892c() {
        return this.f49359a;
    }

    /* renamed from: d */
    public long mo42893d() {
        return this.f49360b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10736f)) {
            return false;
        }
        C10736f fVar = (C10736f) obj;
        String str = this.f49359a;
        if (str != null ? str.equals(fVar.mo42892c()) : fVar.mo42892c() == null) {
            if (this.f49360b == fVar.mo42893d()) {
                C10736f.C10738b bVar = this.f49361c;
                if (bVar == null) {
                    if (fVar.mo42891b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo42891b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f49359a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f49360b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C10736f.C10738b bVar = this.f49361c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f49359a + ", tokenExpirationTimestamp=" + this.f49360b + ", responseCode=" + this.f49361c + "}";
    }

    private C10728b(String str, long j, C10736f.C10738b bVar) {
        this.f49359a = str;
        this.f49360b = j;
        this.f49361c = bVar;
    }
}
