package p315j9;

import java.io.IOException;
import p308g8.C12727k;
import p308g8.C12731o;
import p308g8.C12732p;
import p308g8.C12733q;
import p308g8.C12735s;

/* renamed from: j9.h */
/* compiled from: ImmutableHttpProcessor */
public final class C12814h implements C12812f {

    /* renamed from: b */
    private final C12732p[] f55485b;

    /* renamed from: c */
    private final C12735s[] f55486c;

    public C12814h(C12732p[] pVarArr, C12735s[] sVarArr) {
        if (pVarArr != null) {
            int length = pVarArr.length;
            this.f55485b = new C12732p[length];
            for (int i = 0; i < length; i++) {
                this.f55485b[i] = pVarArr[i];
            }
        } else {
            this.f55485b = new C12732p[0];
        }
        if (sVarArr != null) {
            int length2 = sVarArr.length;
            this.f55486c = new C12735s[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                this.f55486c[i2] = sVarArr[i2];
            }
            return;
        }
        this.f55486c = new C12735s[0];
    }

    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws IOException, C12727k {
        int i = 0;
        while (true) {
            C12732p[] pVarArr = this.f55485b;
            if (i < pVarArr.length) {
                pVarArr[i].mo47803a(oVar, eVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo47808b(C12733q qVar, C12811e eVar) throws IOException, C12727k {
        int i = 0;
        while (true) {
            C12735s[] sVarArr = this.f55486c;
            if (i < sVarArr.length) {
                sVarArr[i].mo47808b(qVar, eVar);
                i++;
            } else {
                return;
            }
        }
    }
}
