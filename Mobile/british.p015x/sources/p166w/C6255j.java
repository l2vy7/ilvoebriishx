package p166w;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: w.j */
/* compiled from: HelperWidget */
public class C6255j extends C6246e implements C6254i {

    /* renamed from: G0 */
    public C6246e[] f25891G0 = new C6246e[4];

    /* renamed from: H0 */
    public int f25892H0 = 0;

    /* renamed from: a */
    public void mo23918a() {
        this.f25892H0 = 0;
        Arrays.fill(this.f25891G0, (Object) null);
    }

    /* renamed from: b */
    public void mo23919b(C6249f fVar) {
    }

    /* renamed from: c */
    public void mo23920c(C6246e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f25892H0 + 1;
            C6246e[] eVarArr = this.f25891G0;
            if (i > eVarArr.length) {
                this.f25891G0 = (C6246e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C6246e[] eVarArr2 = this.f25891G0;
            int i2 = this.f25892H0;
            eVarArr2[i2] = eVar;
            this.f25892H0 = i2 + 1;
        }
    }

    /* renamed from: l */
    public void mo23763l(C6246e eVar, HashMap<C6246e, C6246e> hashMap) {
        super.mo23763l(eVar, hashMap);
        C6255j jVar = (C6255j) eVar;
        this.f25892H0 = 0;
        int i = jVar.f25892H0;
        for (int i2 = 0; i2 < i; i2++) {
            mo23920c(hashMap.get(jVar.f25891G0[i2]));
        }
    }
}
