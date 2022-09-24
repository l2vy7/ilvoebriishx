package p310h9;

import java.io.Serializable;
import p307g8.C12715b0;
import p307g8.C12742z;
import p316k9.C12821b;

/* renamed from: h9.m */
/* compiled from: BasicRequestLine */
public class C12774m implements C12715b0, Cloneable, Serializable {

    /* renamed from: b */
    private final C12742z f55457b;

    /* renamed from: c */
    private final String f55458c;

    /* renamed from: d */
    private final String f55459d;

    public C12774m(String str, String str2, C12742z zVar) {
        if (str == null) {
            throw new IllegalArgumentException("Method must not be null.");
        } else if (str2 == null) {
            throw new IllegalArgumentException("URI must not be null.");
        } else if (zVar != null) {
            this.f55458c = str;
            this.f55459d = str2;
            this.f55457b = zVar;
        } else {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
    }

    /* renamed from: a */
    public C12742z mo47757a() {
        return this.f55457b;
    }

    /* renamed from: c */
    public String mo47758c() {
        return this.f55458c;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getUri() {
        return this.f55459d;
    }

    public String toString() {
        return C12770i.f55448a.mo47867a((C12821b) null, this).toString();
    }
}
