package p303d9;

import p334v8.C12926k;
import p334v8.C12928m;

/* renamed from: d9.g */
/* compiled from: BasicExpiresHandler */
public class C12662g extends C12650a {

    /* renamed from: a */
    private final String[] f55304a;

    public C12662g(String[] strArr) {
        if (strArr != null) {
            this.f55304a = strArr;
            return;
        }
        throw new IllegalArgumentException("Array of date patterns may not be null");
    }

    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        if (mVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                mVar.mo47669m(C12674q.m53947a(str, this.f55304a));
            } catch (C12673p unused) {
                throw new C12926k("Unable to parse expires attribute: " + str);
            }
        } else {
            throw new C12926k("Missing value for expires attribute");
        }
    }
}
