package p158u3;

import java.util.Arrays;
import java.util.Objects;
import p153t3.C6141h;
import p158u3.C6197f;

/* renamed from: u3.a */
/* compiled from: AutoValue_BackendRequest */
final class C6190a extends C6197f {

    /* renamed from: a */
    private final Iterable<C6141h> f25541a;

    /* renamed from: b */
    private final byte[] f25542b;

    /* renamed from: u3.a$b */
    /* compiled from: AutoValue_BackendRequest */
    static final class C6192b extends C6197f.C6198a {

        /* renamed from: a */
        private Iterable<C6141h> f25543a;

        /* renamed from: b */
        private byte[] f25544b;

        C6192b() {
        }

        /* renamed from: a */
        public C6197f mo23616a() {
            String str = "";
            if (this.f25543a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C6190a(this.f25543a, this.f25544b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6197f.C6198a mo23617b(Iterable<C6141h> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f25543a = iterable;
            return this;
        }

        /* renamed from: c */
        public C6197f.C6198a mo23618c(byte[] bArr) {
            this.f25544b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable<C6141h> mo23611b() {
        return this.f25541a;
    }

    /* renamed from: c */
    public byte[] mo23612c() {
        return this.f25542b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6197f)) {
            return false;
        }
        C6197f fVar = (C6197f) obj;
        if (this.f25541a.equals(fVar.mo23611b())) {
            if (Arrays.equals(this.f25542b, fVar instanceof C6190a ? ((C6190a) fVar).f25542b : fVar.mo23612c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25541a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25542b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f25541a + ", extras=" + Arrays.toString(this.f25542b) + "}";
    }

    private C6190a(Iterable<C6141h> iterable, byte[] bArr) {
        this.f25541a = iterable;
        this.f25542b = bArr;
    }
}
