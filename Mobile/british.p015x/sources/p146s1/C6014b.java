package p146s1;

/* renamed from: s1.b */
/* compiled from: NetworkState */
public class C6014b {

    /* renamed from: a */
    private boolean f25072a;

    /* renamed from: b */
    private boolean f25073b;

    /* renamed from: c */
    private boolean f25074c;

    /* renamed from: d */
    private boolean f25075d;

    public C6014b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f25072a = z;
        this.f25073b = z2;
        this.f25074c = z3;
        this.f25075d = z4;
    }

    /* renamed from: a */
    public boolean mo23136a() {
        return this.f25072a;
    }

    /* renamed from: b */
    public boolean mo23137b() {
        return this.f25074c;
    }

    /* renamed from: c */
    public boolean mo23138c() {
        return this.f25075d;
    }

    /* renamed from: d */
    public boolean mo23139d() {
        return this.f25073b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6014b)) {
            return false;
        }
        C6014b bVar = (C6014b) obj;
        if (this.f25072a == bVar.f25072a && this.f25073b == bVar.f25073b && this.f25074c == bVar.f25074c && this.f25075d == bVar.f25075d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f25072a;
        if (this.f25073b) {
            i += 16;
        }
        if (this.f25074c) {
            i += 256;
        }
        return this.f25075d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f25072a), Boolean.valueOf(this.f25073b), Boolean.valueOf(this.f25074c), Boolean.valueOf(this.f25075d)});
    }
}
