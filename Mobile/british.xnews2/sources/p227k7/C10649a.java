package p227k7;

import java.util.Objects;
import p227k7.C10653c;
import p227k7.C10655d;

/* renamed from: k7.a */
/* compiled from: AutoValue_PersistedInstallationEntry */
final class C10649a extends C10655d {

    /* renamed from: b */
    private final String f49217b;

    /* renamed from: c */
    private final C10653c.C10654a f49218c;

    /* renamed from: d */
    private final String f49219d;

    /* renamed from: e */
    private final String f49220e;

    /* renamed from: f */
    private final long f49221f;

    /* renamed from: g */
    private final long f49222g;

    /* renamed from: h */
    private final String f49223h;

    /* renamed from: k7.a$b */
    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class C10651b extends C10655d.C10656a {

        /* renamed from: a */
        private String f49224a;

        /* renamed from: b */
        private C10653c.C10654a f49225b;

        /* renamed from: c */
        private String f49226c;

        /* renamed from: d */
        private String f49227d;

        /* renamed from: e */
        private Long f49228e;

        /* renamed from: f */
        private Long f49229f;

        /* renamed from: g */
        private String f49230g;

        /* renamed from: a */
        public C10655d mo42771a() {
            String str = "";
            if (this.f49225b == null) {
                str = str + " registrationStatus";
            }
            if (this.f49228e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f49229f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C10649a(this.f49224a, this.f49225b, this.f49226c, this.f49227d, this.f49228e.longValue(), this.f49229f.longValue(), this.f49230g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10655d.C10656a mo42772b(String str) {
            this.f49226c = str;
            return this;
        }

        /* renamed from: c */
        public C10655d.C10656a mo42773c(long j) {
            this.f49228e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C10655d.C10656a mo42774d(String str) {
            this.f49224a = str;
            return this;
        }

        /* renamed from: e */
        public C10655d.C10656a mo42775e(String str) {
            this.f49230g = str;
            return this;
        }

        /* renamed from: f */
        public C10655d.C10656a mo42776f(String str) {
            this.f49227d = str;
            return this;
        }

        /* renamed from: g */
        public C10655d.C10656a mo42777g(C10653c.C10654a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f49225b = aVar;
            return this;
        }

        /* renamed from: h */
        public C10655d.C10656a mo42778h(long j) {
            this.f49229f = Long.valueOf(j);
            return this;
        }

        C10651b() {
        }

        private C10651b(C10655d dVar) {
            this.f49224a = dVar.mo42762d();
            this.f49225b = dVar.mo42766g();
            this.f49226c = dVar.mo42760b();
            this.f49227d = dVar.mo42765f();
            this.f49228e = Long.valueOf(dVar.mo42761c());
            this.f49229f = Long.valueOf(dVar.mo42767h());
            this.f49230g = dVar.mo42763e();
        }
    }

    /* renamed from: b */
    public String mo42760b() {
        return this.f49219d;
    }

    /* renamed from: c */
    public long mo42761c() {
        return this.f49221f;
    }

    /* renamed from: d */
    public String mo42762d() {
        return this.f49217b;
    }

    /* renamed from: e */
    public String mo42763e() {
        return this.f49223h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10655d)) {
            return false;
        }
        C10655d dVar = (C10655d) obj;
        String str3 = this.f49217b;
        if (str3 != null ? str3.equals(dVar.mo42762d()) : dVar.mo42762d() == null) {
            if (this.f49218c.equals(dVar.mo42766g()) && ((str = this.f49219d) != null ? str.equals(dVar.mo42760b()) : dVar.mo42760b() == null) && ((str2 = this.f49220e) != null ? str2.equals(dVar.mo42765f()) : dVar.mo42765f() == null) && this.f49221f == dVar.mo42761c() && this.f49222g == dVar.mo42767h()) {
                String str4 = this.f49223h;
                if (str4 == null) {
                    if (dVar.mo42763e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo42763e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo42765f() {
        return this.f49220e;
    }

    /* renamed from: g */
    public C10653c.C10654a mo42766g() {
        return this.f49218c;
    }

    /* renamed from: h */
    public long mo42767h() {
        return this.f49222g;
    }

    public int hashCode() {
        String str = this.f49217b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f49218c.hashCode()) * 1000003;
        String str2 = this.f49219d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f49220e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f49221f;
        long j2 = this.f49222g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f49223h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C10655d.C10656a mo42769n() {
        return new C10651b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f49217b + ", registrationStatus=" + this.f49218c + ", authToken=" + this.f49219d + ", refreshToken=" + this.f49220e + ", expiresInSecs=" + this.f49221f + ", tokenCreationEpochInSecs=" + this.f49222g + ", fisError=" + this.f49223h + "}";
    }

    private C10649a(String str, C10653c.C10654a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f49217b = str;
        this.f49218c = aVar;
        this.f49219d = str2;
        this.f49220e = str3;
        this.f49221f = j;
        this.f49222g = j2;
        this.f49223h = str4;
    }
}
