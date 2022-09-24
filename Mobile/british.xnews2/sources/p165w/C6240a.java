package p165w;

import java.util.HashMap;
import p160v.C6213d;
import p160v.C6222i;
import p165w.C6246e;

/* renamed from: w.a */
/* compiled from: Barrier */
public class C6240a extends C6255j {

    /* renamed from: I0 */
    private int f25684I0 = 0;

    /* renamed from: J0 */
    private boolean f25685J0 = true;

    /* renamed from: K0 */
    private int f25686K0 = 0;

    /* renamed from: L0 */
    public boolean mo23754L0() {
        return this.f25685J0;
    }

    /* renamed from: M0 */
    public int mo23755M0() {
        return this.f25684I0;
    }

    /* renamed from: N0 */
    public int mo23756N0() {
        return this.f25686K0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo23757O0() {
        for (int i = 0; i < this.f25892H0; i++) {
            C6246e eVar = this.f25891G0[i];
            int i2 = this.f25684I0;
            if (i2 == 0 || i2 == 1) {
                eVar.mo23840p0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.mo23840p0(1, true);
            }
        }
    }

    /* renamed from: P0 */
    public void mo23758P0(boolean z) {
        this.f25685J0 = z;
    }

    /* renamed from: Q0 */
    public void mo23759Q0(int i) {
        this.f25684I0 = i;
    }

    /* renamed from: R0 */
    public void mo23760R0(int i) {
        this.f25686K0 = i;
    }

    /* renamed from: f */
    public void mo23761f(C6213d dVar) {
        C6243d[] dVarArr;
        boolean z;
        int i;
        int i2;
        int i3;
        C6243d[] dVarArr2 = this.f25744L;
        dVarArr2[0] = this.f25734D;
        dVarArr2[2] = this.f25736E;
        dVarArr2[1] = this.f25738F;
        dVarArr2[3] = this.f25739G;
        int i4 = 0;
        while (true) {
            dVarArr = this.f25744L;
            if (i4 >= dVarArr.length) {
                break;
            }
            dVarArr[i4].f25715g = dVar.mo23709q(dVarArr[i4]);
            i4++;
        }
        int i5 = this.f25684I0;
        if (i5 >= 0 && i5 < 4) {
            C6243d dVar2 = dVarArr[i5];
            int i6 = 0;
            while (true) {
                if (i6 >= this.f25892H0) {
                    z = false;
                    break;
                }
                C6246e eVar = this.f25891G0[i6];
                if ((this.f25685J0 || eVar.mo23762g()) && ((((i2 = this.f25684I0) == 0 || i2 == 1) && eVar.mo23859z() == C6246e.C6248b.MATCH_CONSTRAINT && eVar.f25734D.f25712d != null && eVar.f25738F.f25712d != null) || (((i3 = this.f25684I0) == 2 || i3 == 3) && eVar.mo23805N() == C6246e.C6248b.MATCH_CONSTRAINT && eVar.f25736E.f25712d != null && eVar.f25739G.f25712d != null))) {
                    z = true;
                } else {
                    i6++;
                }
            }
            z = true;
            boolean z2 = this.f25734D.mo23774i() || this.f25738F.mo23774i();
            boolean z3 = this.f25736E.mo23774i() || this.f25739G.mo23774i();
            boolean z4 = !z && (((i = this.f25684I0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))));
            int i7 = 5;
            if (!z4) {
                i7 = 4;
            }
            for (int i8 = 0; i8 < this.f25892H0; i8++) {
                C6246e eVar2 = this.f25891G0[i8];
                if (this.f25685J0 || eVar2.mo23762g()) {
                    C6222i q = dVar.mo23709q(eVar2.f25744L[this.f25684I0]);
                    C6243d[] dVarArr3 = eVar2.f25744L;
                    int i9 = this.f25684I0;
                    dVarArr3[i9].f25715g = q;
                    int i10 = (dVarArr3[i9].f25712d == null || dVarArr3[i9].f25712d.f25710b != this) ? 0 : dVarArr3[i9].f25713e + 0;
                    if (i9 == 0 || i9 == 2) {
                        dVar.mo23703i(dVar2.f25715g, q, this.f25686K0 - i10, z);
                    } else {
                        dVar.mo23701g(dVar2.f25715g, q, this.f25686K0 + i10, z);
                    }
                    dVar.mo23699e(dVar2.f25715g, q, this.f25686K0 + i10, i7);
                }
            }
            int i11 = this.f25684I0;
            if (i11 == 0) {
                dVar.mo23699e(this.f25738F.f25715g, this.f25734D.f25715g, 0, 8);
                dVar.mo23699e(this.f25734D.f25715g, this.f25748P.f25738F.f25715g, 0, 4);
                dVar.mo23699e(this.f25734D.f25715g, this.f25748P.f25734D.f25715g, 0, 0);
            } else if (i11 == 1) {
                dVar.mo23699e(this.f25734D.f25715g, this.f25738F.f25715g, 0, 8);
                dVar.mo23699e(this.f25734D.f25715g, this.f25748P.f25734D.f25715g, 0, 4);
                dVar.mo23699e(this.f25734D.f25715g, this.f25748P.f25738F.f25715g, 0, 0);
            } else if (i11 == 2) {
                dVar.mo23699e(this.f25739G.f25715g, this.f25736E.f25715g, 0, 8);
                dVar.mo23699e(this.f25736E.f25715g, this.f25748P.f25739G.f25715g, 0, 4);
                dVar.mo23699e(this.f25736E.f25715g, this.f25748P.f25736E.f25715g, 0, 0);
            } else if (i11 == 3) {
                dVar.mo23699e(this.f25736E.f25715g, this.f25739G.f25715g, 0, 8);
                dVar.mo23699e(this.f25736E.f25715g, this.f25748P.f25736E.f25715g, 0, 4);
                dVar.mo23699e(this.f25736E.f25715g, this.f25748P.f25739G.f25715g, 0, 0);
            }
        }
    }

    /* renamed from: g */
    public boolean mo23762g() {
        return true;
    }

    /* renamed from: l */
    public void mo23763l(C6246e eVar, HashMap<C6246e, C6246e> hashMap) {
        super.mo23763l(eVar, hashMap);
        C6240a aVar = (C6240a) eVar;
        this.f25684I0 = aVar.f25684I0;
        this.f25685J0 = aVar.f25685J0;
        this.f25686K0 = aVar.f25686K0;
    }

    public String toString() {
        String str = "[Barrier] " + mo23845s() + " {";
        for (int i = 0; i < this.f25892H0; i++) {
            C6246e eVar = this.f25891G0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo23845s();
        }
        return str + "}";
    }
}
