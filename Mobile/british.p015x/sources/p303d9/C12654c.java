package p303d9;

import java.util.Date;
import p334v8.C12927l;

/* renamed from: d9.c */
/* compiled from: BasicClientCookie2 */
public class C12654c extends C12656d implements C12927l {

    /* renamed from: k */
    private String f55292k;

    /* renamed from: l */
    private int[] f55293l;

    /* renamed from: m */
    private boolean f55294m;

    public C12654c(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: B */
    public void mo47653B(int[] iArr) {
        this.f55293l = iArr;
    }

    public Object clone() throws CloneNotSupportedException {
        C12654c cVar = (C12654c) super.clone();
        int[] iArr = this.f55293l;
        if (iArr != null) {
            cVar.f55293l = (int[]) iArr.clone();
        }
        return cVar;
    }

    /* renamed from: k */
    public void mo47655k(boolean z) {
        this.f55294m = z;
    }

    /* renamed from: l */
    public int[] mo47656l() {
        return this.f55293l;
    }

    /* renamed from: o */
    public void mo47657o(String str) {
        this.f55292k = str;
    }

    /* renamed from: s */
    public boolean mo47658s(Date date) {
        return this.f55294m || super.mo47658s(date);
    }
}
