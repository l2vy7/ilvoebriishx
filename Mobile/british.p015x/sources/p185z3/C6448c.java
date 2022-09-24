package p185z3;

import java.util.Objects;
import java.util.Set;
import p185z3.C6452e;

/* renamed from: z3.c */
/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class C6448c extends C6452e.C6454b {

    /* renamed from: a */
    private final long f26497a;

    /* renamed from: b */
    private final long f26498b;

    /* renamed from: c */
    private final Set<C6452e.C6456c> f26499c;

    /* renamed from: z3.c$b */
    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class C6450b extends C6452e.C6454b.C6455a {

        /* renamed from: a */
        private Long f26500a;

        /* renamed from: b */
        private Long f26501b;

        /* renamed from: c */
        private Set<C6452e.C6456c> f26502c;

        C6450b() {
        }

        /* renamed from: a */
        public C6452e.C6454b mo24280a() {
            String str = "";
            if (this.f26500a == null) {
                str = str + " delta";
            }
            if (this.f26501b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f26502c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6448c(this.f26500a.longValue(), this.f26501b.longValue(), this.f26502c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6452e.C6454b.C6455a mo24281b(long j) {
            this.f26500a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C6452e.C6454b.C6455a mo24282c(Set<C6452e.C6456c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f26502c = set;
            return this;
        }

        /* renamed from: d */
        public C6452e.C6454b.C6455a mo24283d(long j) {
            this.f26501b = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo24274b() {
        return this.f26497a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C6452e.C6456c> mo24275c() {
        return this.f26499c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo24276d() {
        return this.f26498b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6452e.C6454b)) {
            return false;
        }
        C6452e.C6454b bVar = (C6452e.C6454b) obj;
        if (this.f26497a == bVar.mo24274b() && this.f26498b == bVar.mo24276d() && this.f26499c.equals(bVar.mo24275c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f26497a;
        long j2 = this.f26498b;
        return this.f26499c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f26497a + ", maxAllowedDelay=" + this.f26498b + ", flags=" + this.f26499c + "}";
    }

    private C6448c(long j, long j2, Set<C6452e.C6456c> set) {
        this.f26497a = j;
        this.f26498b = j2;
        this.f26499c = set;
    }
}
