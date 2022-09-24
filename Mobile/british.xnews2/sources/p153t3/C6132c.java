package p153t3;

import java.util.Arrays;
import java.util.Objects;
import p142r3.C5998d;
import p153t3.C6150m;

/* renamed from: t3.c */
/* compiled from: AutoValue_TransportContext */
final class C6132c extends C6150m {

    /* renamed from: a */
    private final String f25403a;

    /* renamed from: b */
    private final byte[] f25404b;

    /* renamed from: c */
    private final C5998d f25405c;

    /* renamed from: t3.c$b */
    /* compiled from: AutoValue_TransportContext */
    static final class C6134b extends C6150m.C6151a {

        /* renamed from: a */
        private String f25406a;

        /* renamed from: b */
        private byte[] f25407b;

        /* renamed from: c */
        private C5998d f25408c;

        C6134b() {
        }

        /* renamed from: a */
        public C6150m mo23508a() {
            String str = "";
            if (this.f25406a == null) {
                str = str + " backendName";
            }
            if (this.f25408c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6132c(this.f25406a, this.f25407b, this.f25408c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6150m.C6151a mo23509b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f25406a = str;
            return this;
        }

        /* renamed from: c */
        public C6150m.C6151a mo23510c(byte[] bArr) {
            this.f25407b = bArr;
            return this;
        }

        /* renamed from: d */
        public C6150m.C6151a mo23511d(C5998d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f25408c = dVar;
            return this;
        }
    }

    /* renamed from: b */
    public String mo23503b() {
        return this.f25403a;
    }

    /* renamed from: c */
    public byte[] mo23504c() {
        return this.f25404b;
    }

    /* renamed from: d */
    public C5998d mo23505d() {
        return this.f25405c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6150m)) {
            return false;
        }
        C6150m mVar = (C6150m) obj;
        if (this.f25403a.equals(mVar.mo23503b())) {
            if (!Arrays.equals(this.f25404b, mVar instanceof C6132c ? ((C6132c) mVar).f25404b : mVar.mo23504c()) || !this.f25405c.equals(mVar.mo23505d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f25403a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25404b)) * 1000003) ^ this.f25405c.hashCode();
    }

    private C6132c(String str, byte[] bArr, C5998d dVar) {
        this.f25403a = str;
        this.f25404b = bArr;
        this.f25405c = dVar;
    }
}
