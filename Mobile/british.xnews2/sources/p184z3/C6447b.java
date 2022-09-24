package p184z3;

import java.util.Map;
import java.util.Objects;
import p020c4.C2657a;
import p142r3.C5998d;
import p184z3.C6452e;

/* renamed from: z3.b */
/* compiled from: AutoValue_SchedulerConfig */
final class C6447b extends C6452e {

    /* renamed from: a */
    private final C2657a f26495a;

    /* renamed from: b */
    private final Map<C5998d, C6452e.C6454b> f26496b;

    C6447b(C2657a aVar, Map<C5998d, C6452e.C6454b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f26495a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f26496b = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2657a mo24269e() {
        return this.f26495a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6452e)) {
            return false;
        }
        C6452e eVar = (C6452e) obj;
        if (!this.f26495a.equals(eVar.mo24269e()) || !this.f26496b.equals(eVar.mo24271h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<C5998d, C6452e.C6454b> mo24271h() {
        return this.f26496b;
    }

    public int hashCode() {
        return ((this.f26495a.hashCode() ^ 1000003) * 1000003) ^ this.f26496b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f26495a + ", values=" + this.f26496b + "}";
    }
}
