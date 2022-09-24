package p310h9;

import java.io.Serializable;
import p307g8.C12716c;
import p307g8.C12718d;
import p307g8.C12740x;
import p316k9.C12821b;

/* renamed from: h9.b */
/* compiled from: BasicHeader */
public class C12763b implements C12716c, Cloneable, Serializable {

    /* renamed from: b */
    private final String f55428b;

    /* renamed from: c */
    private final String f55429c;

    public C12763b(String str, String str2) {
        if (str != null) {
            this.f55428b = str;
            this.f55429c = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    /* renamed from: b */
    public C12718d[] mo47760b() throws C12740x {
        String str = this.f55429c;
        return str != null ? C12767f.m54176f(str, (C12779r) null) : new C12718d[0];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return this.f55428b;
    }

    public String getValue() {
        return this.f55429c;
    }

    public String toString() {
        return C12770i.f55448a.mo47868b((C12821b) null, this).toString();
    }
}
