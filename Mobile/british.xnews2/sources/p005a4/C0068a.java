package p005a4;

import p005a4.C0080d;

/* renamed from: a4.a */
/* compiled from: AutoValue_EventStoreConfig */
final class C0068a extends C0080d {

    /* renamed from: b */
    private final long f194b;

    /* renamed from: c */
    private final int f195c;

    /* renamed from: d */
    private final int f196d;

    /* renamed from: e */
    private final long f197e;

    /* renamed from: f */
    private final int f198f;

    /* renamed from: a4.a$b */
    /* compiled from: AutoValue_EventStoreConfig */
    static final class C0070b extends C0080d.C0081a {

        /* renamed from: a */
        private Long f199a;

        /* renamed from: b */
        private Integer f200b;

        /* renamed from: c */
        private Integer f201c;

        /* renamed from: d */
        private Long f202d;

        /* renamed from: e */
        private Integer f203e;

        C0070b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0080d mo206a() {
            String str = "";
            if (this.f199a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f200b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f201c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f202d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f203e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0068a(this.f199a.longValue(), this.f200b.intValue(), this.f201c.intValue(), this.f202d.longValue(), this.f203e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0080d.C0081a mo207b(int i) {
            this.f201c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0080d.C0081a mo208c(long j) {
            this.f202d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0080d.C0081a mo209d(int i) {
            this.f200b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0080d.C0081a mo210e(int i) {
            this.f203e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0080d.C0081a mo211f(long j) {
            this.f199a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo198b() {
        return this.f196d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo199c() {
        return this.f197e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo200d() {
        return this.f195c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo201e() {
        return this.f198f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0080d)) {
            return false;
        }
        C0080d dVar = (C0080d) obj;
        if (this.f194b == dVar.mo203f() && this.f195c == dVar.mo200d() && this.f196d == dVar.mo198b() && this.f197e == dVar.mo199c() && this.f198f == dVar.mo201e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo203f() {
        return this.f194b;
    }

    public int hashCode() {
        long j = this.f194b;
        long j2 = this.f197e;
        return this.f198f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f195c) * 1000003) ^ this.f196d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f194b + ", loadBatchSize=" + this.f195c + ", criticalSectionEnterTimeoutMs=" + this.f196d + ", eventCleanUpAge=" + this.f197e + ", maxBlobByteSizePerRow=" + this.f198f + "}";
    }

    private C0068a(long j, int i, int i2, long j2, int i3) {
        this.f194b = j;
        this.f195c = i;
        this.f196d = i2;
        this.f197e = j2;
        this.f198f = i3;
    }
}
