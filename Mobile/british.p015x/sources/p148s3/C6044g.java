package p148s3;

import java.util.List;
import p148s3.C6057m;

/* renamed from: s3.g */
/* compiled from: AutoValue_LogRequest */
final class C6044g extends C6057m {

    /* renamed from: a */
    private final long f25172a;

    /* renamed from: b */
    private final long f25173b;

    /* renamed from: c */
    private final C6052k f25174c;

    /* renamed from: d */
    private final Integer f25175d;

    /* renamed from: e */
    private final String f25176e;

    /* renamed from: f */
    private final List<C6055l> f25177f;

    /* renamed from: g */
    private final C6064p f25178g;

    /* renamed from: s3.g$b */
    /* compiled from: AutoValue_LogRequest */
    static final class C6046b extends C6057m.C6058a {

        /* renamed from: a */
        private Long f25179a;

        /* renamed from: b */
        private Long f25180b;

        /* renamed from: c */
        private C6052k f25181c;

        /* renamed from: d */
        private Integer f25182d;

        /* renamed from: e */
        private String f25183e;

        /* renamed from: f */
        private List<C6055l> f25184f;

        /* renamed from: g */
        private C6064p f25185g;

        C6046b() {
        }

        /* renamed from: a */
        public C6057m mo23229a() {
            String str = "";
            if (this.f25179a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f25180b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6044g(this.f25179a.longValue(), this.f25180b.longValue(), this.f25181c, this.f25182d, this.f25183e, this.f25184f, this.f25185g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6057m.C6058a mo23230b(C6052k kVar) {
            this.f25181c = kVar;
            return this;
        }

        /* renamed from: c */
        public C6057m.C6058a mo23231c(List<C6055l> list) {
            this.f25184f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6057m.C6058a mo23232d(Integer num) {
            this.f25182d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6057m.C6058a mo23233e(String str) {
            this.f25183e = str;
            return this;
        }

        /* renamed from: f */
        public C6057m.C6058a mo23234f(C6064p pVar) {
            this.f25185g = pVar;
            return this;
        }

        /* renamed from: g */
        public C6057m.C6058a mo23235g(long j) {
            this.f25179a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C6057m.C6058a mo23236h(long j) {
            this.f25180b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public C6052k mo23219b() {
        return this.f25174c;
    }

    /* renamed from: c */
    public List<C6055l> mo23220c() {
        return this.f25177f;
    }

    /* renamed from: d */
    public Integer mo23221d() {
        return this.f25175d;
    }

    /* renamed from: e */
    public String mo23222e() {
        return this.f25176e;
    }

    public boolean equals(Object obj) {
        C6052k kVar;
        Integer num;
        String str;
        List<C6055l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6057m)) {
            return false;
        }
        C6057m mVar = (C6057m) obj;
        if (this.f25172a == mVar.mo23225g() && this.f25173b == mVar.mo23226h() && ((kVar = this.f25174c) != null ? kVar.equals(mVar.mo23219b()) : mVar.mo23219b() == null) && ((num = this.f25175d) != null ? num.equals(mVar.mo23221d()) : mVar.mo23221d() == null) && ((str = this.f25176e) != null ? str.equals(mVar.mo23222e()) : mVar.mo23222e() == null) && ((list = this.f25177f) != null ? list.equals(mVar.mo23220c()) : mVar.mo23220c() == null)) {
            C6064p pVar = this.f25178g;
            if (pVar == null) {
                if (mVar.mo23224f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.mo23224f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C6064p mo23224f() {
        return this.f25178g;
    }

    /* renamed from: g */
    public long mo23225g() {
        return this.f25172a;
    }

    /* renamed from: h */
    public long mo23226h() {
        return this.f25173b;
    }

    public int hashCode() {
        long j = this.f25172a;
        long j2 = this.f25173b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        C6052k kVar = this.f25174c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f25175d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f25176e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C6055l> list = this.f25177f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C6064p pVar = this.f25178g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f25172a + ", requestUptimeMs=" + this.f25173b + ", clientInfo=" + this.f25174c + ", logSource=" + this.f25175d + ", logSourceName=" + this.f25176e + ", logEvents=" + this.f25177f + ", qosTier=" + this.f25178g + "}";
    }

    private C6044g(long j, long j2, C6052k kVar, Integer num, String str, List<C6055l> list, C6064p pVar) {
        this.f25172a = j;
        this.f25173b = j2;
        this.f25174c = kVar;
        this.f25175d = num;
        this.f25176e = str;
        this.f25177f = list;
        this.f25178g = pVar;
    }
}
