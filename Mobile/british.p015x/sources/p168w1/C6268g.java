package p168w1;

/* renamed from: w1.g */
/* compiled from: SystemIdInfo */
public class C6268g {

    /* renamed from: a */
    public final String f25918a;

    /* renamed from: b */
    public final int f25919b;

    public C6268g(String str, int i) {
        this.f25918a = str;
        this.f25919b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6268g)) {
            return false;
        }
        C6268g gVar = (C6268g) obj;
        if (this.f25919b != gVar.f25919b) {
            return false;
        }
        return this.f25918a.equals(gVar.f25918a);
    }

    public int hashCode() {
        return (this.f25918a.hashCode() * 31) + this.f25919b;
    }
}
