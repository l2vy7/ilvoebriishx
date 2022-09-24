package p153t3;

import java.util.Map;
import java.util.Objects;
import p153t3.C6141h;

/* renamed from: t3.a */
/* compiled from: AutoValue_EventInternal */
final class C6126a extends C6141h {

    /* renamed from: a */
    private final String f25381a;

    /* renamed from: b */
    private final Integer f25382b;

    /* renamed from: c */
    private final C6140g f25383c;

    /* renamed from: d */
    private final long f25384d;

    /* renamed from: e */
    private final long f25385e;

    /* renamed from: f */
    private final Map<String, String> f25386f;

    /* renamed from: t3.a$b */
    /* compiled from: AutoValue_EventInternal */
    static final class C6128b extends C6141h.C6142a {

        /* renamed from: a */
        private String f25387a;

        /* renamed from: b */
        private Integer f25388b;

        /* renamed from: c */
        private C6140g f25389c;

        /* renamed from: d */
        private Long f25390d;

        /* renamed from: e */
        private Long f25391e;

        /* renamed from: f */
        private Map<String, String> f25392f;

        C6128b() {
        }

        /* renamed from: d */
        public C6141h mo23481d() {
            String str = "";
            if (this.f25387a == null) {
                str = str + " transportName";
            }
            if (this.f25389c == null) {
                str = str + " encodedPayload";
            }
            if (this.f25390d == null) {
                str = str + " eventMillis";
            }
            if (this.f25391e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f25392f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6126a(this.f25387a, this.f25388b, this.f25389c, this.f25390d.longValue(), this.f25391e.longValue(), this.f25392f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo23482e() {
            Map<String, String> map = this.f25392f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C6141h.C6142a mo23483f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f25392f = map;
            return this;
        }

        /* renamed from: g */
        public C6141h.C6142a mo23484g(Integer num) {
            this.f25388b = num;
            return this;
        }

        /* renamed from: h */
        public C6141h.C6142a mo23485h(C6140g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f25389c = gVar;
            return this;
        }

        /* renamed from: i */
        public C6141h.C6142a mo23486i(long j) {
            this.f25390d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C6141h.C6142a mo23487j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f25387a = str;
            return this;
        }

        /* renamed from: k */
        public C6141h.C6142a mo23488k(long j) {
            this.f25391e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo23472c() {
        return this.f25386f;
    }

    /* renamed from: d */
    public Integer mo23473d() {
        return this.f25382b;
    }

    /* renamed from: e */
    public C6140g mo23474e() {
        return this.f25383c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6141h)) {
            return false;
        }
        C6141h hVar = (C6141h) obj;
        if (!this.f25381a.equals(hVar.mo23478j()) || ((num = this.f25382b) != null ? !num.equals(hVar.mo23473d()) : hVar.mo23473d() != null) || !this.f25383c.equals(hVar.mo23474e()) || this.f25384d != hVar.mo23476f() || this.f25385e != hVar.mo23479k() || !this.f25386f.equals(hVar.mo23472c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo23476f() {
        return this.f25384d;
    }

    public int hashCode() {
        int hashCode = (this.f25381a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f25382b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f25384d;
        long j2 = this.f25385e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f25383c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f25386f.hashCode();
    }

    /* renamed from: j */
    public String mo23478j() {
        return this.f25381a;
    }

    /* renamed from: k */
    public long mo23479k() {
        return this.f25385e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f25381a + ", code=" + this.f25382b + ", encodedPayload=" + this.f25383c + ", eventMillis=" + this.f25384d + ", uptimeMillis=" + this.f25385e + ", autoMetadata=" + this.f25386f + "}";
    }

    private C6126a(String str, Integer num, C6140g gVar, long j, long j2, Map<String, String> map) {
        this.f25381a = str;
        this.f25382b = num;
        this.f25383c = gVar;
        this.f25384d = j;
        this.f25385e = j2;
        this.f25386f = map;
    }
}
