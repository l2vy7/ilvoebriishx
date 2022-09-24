package p153t3;

import java.util.Objects;
import p142r3.C5996b;
import p142r3.C5997c;
import p142r3.C5999e;
import p153t3.C6148l;

/* renamed from: t3.b */
/* compiled from: AutoValue_SendRequest */
final class C6129b extends C6148l {

    /* renamed from: a */
    private final C6150m f25393a;

    /* renamed from: b */
    private final String f25394b;

    /* renamed from: c */
    private final C5997c<?> f25395c;

    /* renamed from: d */
    private final C5999e<?, byte[]> f25396d;

    /* renamed from: e */
    private final C5996b f25397e;

    /* renamed from: t3.b$b */
    /* compiled from: AutoValue_SendRequest */
    static final class C6131b extends C6148l.C6149a {

        /* renamed from: a */
        private C6150m f25398a;

        /* renamed from: b */
        private String f25399b;

        /* renamed from: c */
        private C5997c<?> f25400c;

        /* renamed from: d */
        private C5999e<?, byte[]> f25401d;

        /* renamed from: e */
        private C5996b f25402e;

        C6131b() {
        }

        /* renamed from: a */
        public C6148l mo23497a() {
            String str = "";
            if (this.f25398a == null) {
                str = str + " transportContext";
            }
            if (this.f25399b == null) {
                str = str + " transportName";
            }
            if (this.f25400c == null) {
                str = str + " event";
            }
            if (this.f25401d == null) {
                str = str + " transformer";
            }
            if (this.f25402e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6129b(this.f25398a, this.f25399b, this.f25400c, this.f25401d, this.f25402e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6148l.C6149a mo23498b(C5996b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f25402e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6148l.C6149a mo23499c(C5997c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f25400c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6148l.C6149a mo23500d(C5999e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f25401d = eVar;
            return this;
        }

        /* renamed from: e */
        public C6148l.C6149a mo23501e(C6150m mVar) {
            Objects.requireNonNull(mVar, "Null transportContext");
            this.f25398a = mVar;
            return this;
        }

        /* renamed from: f */
        public C6148l.C6149a mo23502f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f25399b = str;
            return this;
        }
    }

    /* renamed from: b */
    public C5996b mo23489b() {
        return this.f25397e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5997c<?> mo23490c() {
        return this.f25395c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5999e<?, byte[]> mo23491e() {
        return this.f25396d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6148l)) {
            return false;
        }
        C6148l lVar = (C6148l) obj;
        if (!this.f25393a.equals(lVar.mo23493f()) || !this.f25394b.equals(lVar.mo23494g()) || !this.f25395c.equals(lVar.mo23490c()) || !this.f25396d.equals(lVar.mo23491e()) || !this.f25397e.equals(lVar.mo23489b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C6150m mo23493f() {
        return this.f25393a;
    }

    /* renamed from: g */
    public String mo23494g() {
        return this.f25394b;
    }

    public int hashCode() {
        return ((((((((this.f25393a.hashCode() ^ 1000003) * 1000003) ^ this.f25394b.hashCode()) * 1000003) ^ this.f25395c.hashCode()) * 1000003) ^ this.f25396d.hashCode()) * 1000003) ^ this.f25397e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f25393a + ", transportName=" + this.f25394b + ", event=" + this.f25395c + ", transformer=" + this.f25396d + ", encoding=" + this.f25397e + "}";
    }

    private C6129b(C6150m mVar, String str, C5997c<?> cVar, C5999e<?, byte[]> eVar, C5996b bVar) {
        this.f25393a = mVar;
        this.f25394b = str;
        this.f25395c = cVar;
        this.f25396d = eVar;
        this.f25397e = bVar;
    }
}
