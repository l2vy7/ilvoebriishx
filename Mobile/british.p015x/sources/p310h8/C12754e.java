package p310h8;

/* renamed from: h8.e */
/* compiled from: AuthState */
public class C12754e {

    /* renamed from: a */
    private C12750a f55420a;

    /* renamed from: b */
    private C12753d f55421b;

    /* renamed from: c */
    private C12757h f55422c;

    /* renamed from: a */
    public C12750a mo47828a() {
        return this.f55420a;
    }

    /* renamed from: b */
    public C12753d mo47829b() {
        return this.f55421b;
    }

    /* renamed from: c */
    public C12757h mo47830c() {
        return this.f55422c;
    }

    /* renamed from: d */
    public void mo47831d() {
        this.f55420a = null;
        this.f55421b = null;
        this.f55422c = null;
    }

    /* renamed from: e */
    public boolean mo47832e() {
        return this.f55420a != null;
    }

    /* renamed from: f */
    public void mo47833f(C12750a aVar) {
        if (aVar == null) {
            mo47831d();
        } else {
            this.f55420a = aVar;
        }
    }

    /* renamed from: g */
    public void mo47834g(C12753d dVar) {
        this.f55421b = dVar;
    }

    /* renamed from: h */
    public void mo47835h(C12757h hVar) {
        this.f55422c = hVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("auth scope [");
        sb.append(this.f55421b);
        sb.append("]; credentials set [");
        sb.append(this.f55422c != null ? "true" : "false");
        sb.append("]");
        return sb.toString();
    }
}
