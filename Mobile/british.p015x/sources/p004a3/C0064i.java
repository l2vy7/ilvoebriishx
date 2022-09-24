package p004a3;

/* renamed from: a3.i */
/* compiled from: MultiClassKey */
public class C0064i {

    /* renamed from: a */
    private Class<?> f188a;

    /* renamed from: b */
    private Class<?> f189b;

    /* renamed from: c */
    private Class<?> f190c;

    public C0064i() {
    }

    /* renamed from: a */
    public void mo194a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f188a = cls;
        this.f189b = cls2;
        this.f190c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0064i iVar = (C0064i) obj;
        return this.f188a.equals(iVar.f188a) && this.f189b.equals(iVar.f189b) && C0066k.m251c(this.f190c, iVar.f190c);
    }

    public int hashCode() {
        int hashCode = ((this.f188a.hashCode() * 31) + this.f189b.hashCode()) * 31;
        Class<?> cls = this.f190c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f188a + ", second=" + this.f189b + '}';
    }

    public C0064i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo194a(cls, cls2, cls3);
    }
}
