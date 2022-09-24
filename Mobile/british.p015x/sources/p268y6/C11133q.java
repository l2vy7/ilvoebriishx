package p268y6;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: y6.q */
/* compiled from: Dependency */
public final class C11133q {

    /* renamed from: a */
    private final Class<?> f50121a;

    /* renamed from: b */
    private final int f50122b;

    /* renamed from: c */
    private final int f50123c;

    private C11133q(Class<?> cls, int i, int i2) {
        this.f50121a = (Class) C11113c0.m49616c(cls, "Null dependency anInterface.");
        this.f50122b = i;
        this.f50123c = i2;
    }

    /* renamed from: a */
    private static String m49697a(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    /* renamed from: g */
    public static C11133q m49698g(Class<?> cls) {
        return new C11133q(cls, 0, 1);
    }

    /* renamed from: h */
    public static C11133q m49699h(Class<?> cls) {
        return new C11133q(cls, 1, 0);
    }

    /* renamed from: i */
    public static C11133q m49700i(Class<?> cls) {
        return new C11133q(cls, 2, 0);
    }

    /* renamed from: b */
    public Class<?> mo43424b() {
        return this.f50121a;
    }

    /* renamed from: c */
    public boolean mo43425c() {
        return this.f50123c == 2;
    }

    /* renamed from: d */
    public boolean mo43426d() {
        return this.f50123c == 0;
    }

    /* renamed from: e */
    public boolean mo43427e() {
        return this.f50122b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11133q)) {
            return false;
        }
        C11133q qVar = (C11133q) obj;
        if (this.f50121a == qVar.f50121a && this.f50122b == qVar.f50122b && this.f50123c == qVar.f50123c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo43429f() {
        return this.f50122b == 2;
    }

    public int hashCode() {
        return ((((this.f50121a.hashCode() ^ 1000003) * 1000003) ^ this.f50122b) * 1000003) ^ this.f50123c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f50121a);
        sb.append(", type=");
        int i = this.f50122b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m49697a(this.f50123c));
        sb.append("}");
        return sb.toString();
    }
}
