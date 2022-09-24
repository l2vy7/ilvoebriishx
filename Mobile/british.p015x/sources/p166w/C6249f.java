package p166w;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import p161v.C6213d;
import p166w.C6246e;
import p171x.C6317b;
import p171x.C6322e;

/* renamed from: w.f */
/* compiled from: ConstraintWidgetContainer */
public class C6249f extends C6258m {

    /* renamed from: H0 */
    C6317b f25818H0 = new C6317b(this);

    /* renamed from: I0 */
    public C6322e f25819I0 = new C6322e(this);

    /* renamed from: J0 */
    protected C6317b.C6319b f25820J0 = null;

    /* renamed from: K0 */
    private boolean f25821K0 = false;

    /* renamed from: L0 */
    protected C6213d f25822L0 = new C6213d();

    /* renamed from: M0 */
    int f25823M0;

    /* renamed from: N0 */
    int f25824N0;

    /* renamed from: O0 */
    int f25825O0;

    /* renamed from: P0 */
    int f25826P0;

    /* renamed from: Q0 */
    int f25827Q0 = 0;

    /* renamed from: R0 */
    int f25828R0 = 0;

    /* renamed from: S0 */
    C6242c[] f25829S0 = new C6242c[4];

    /* renamed from: T0 */
    C6242c[] f25830T0 = new C6242c[4];

    /* renamed from: U0 */
    public boolean f25831U0 = false;

    /* renamed from: V0 */
    public boolean f25832V0 = false;

    /* renamed from: W0 */
    public boolean f25833W0 = false;

    /* renamed from: X0 */
    public int f25834X0 = 0;

    /* renamed from: Y0 */
    public int f25835Y0 = 0;

    /* renamed from: Z0 */
    private int f25836Z0 = 263;

    /* renamed from: a1 */
    public boolean f25837a1 = false;

    /* renamed from: b1 */
    private boolean f25838b1 = false;

    /* renamed from: c1 */
    private boolean f25839c1 = false;

    /* renamed from: d1 */
    int f25840d1 = 0;

    /* renamed from: R0 */
    private void m27449R0(C6246e eVar) {
        int i = this.f25827Q0 + 1;
        C6242c[] cVarArr = this.f25830T0;
        if (i >= cVarArr.length) {
            this.f25830T0 = (C6242c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f25830T0[this.f25827Q0] = new C6242c(eVar, 0, mo23873c1());
        this.f25827Q0++;
    }

    /* renamed from: S0 */
    private void m27450S0(C6246e eVar) {
        int i = this.f25828R0 + 1;
        C6242c[] cVarArr = this.f25829S0;
        if (i >= cVarArr.length) {
            this.f25829S0 = (C6242c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f25829S0[this.f25828R0] = new C6242c(eVar, 1, mo23873c1());
        this.f25828R0++;
    }

    /* renamed from: g1 */
    private void m27451g1() {
        this.f25827Q0 = 0;
        this.f25828R0 = 0;
    }

    /* renamed from: J0 */
    public void mo23800J0(boolean z, boolean z2) {
        super.mo23800J0(z, z2);
        int size = this.f25907G0.size();
        for (int i = 0; i < size; i++) {
            this.f25907G0.get(i).mo23800J0(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* renamed from: M0 */
    public void mo23861M0() {
        boolean z;
        ? r11;
        boolean z2;
        this.f25753U = 0;
        this.f25754V = 0;
        int max = Math.max(0, mo23808Q());
        int max2 = Math.max(0, mo23853w());
        this.f25838b1 = false;
        this.f25839c1 = false;
        boolean z3 = mo23876f1(64) || mo23876f1(128);
        C6213d dVar = this.f25822L0;
        dVar.f25604g = false;
        dVar.f25605h = false;
        if (this.f25836Z0 != 0 && z3) {
            dVar.f25605h = true;
        }
        C6246e.C6248b[] bVarArr = this.f25747O;
        C6246e.C6248b bVar = bVarArr[1];
        C6246e.C6248b bVar2 = bVarArr[0];
        ArrayList<C6246e> arrayList = this.f25907G0;
        C6246e.C6248b z4 = mo23859z();
        C6246e.C6248b bVar3 = C6246e.C6248b.WRAP_CONTENT;
        boolean z5 = z4 == bVar3 || mo23805N() == bVar3;
        m27451g1();
        int size = this.f25907G0.size();
        for (int i = 0; i < size; i++) {
            C6246e eVar = this.f25907G0.get(i);
            if (eVar instanceof C6258m) {
                ((C6258m) eVar).mo23861M0();
            }
        }
        int i2 = 0;
        boolean z6 = true;
        boolean z7 = false;
        while (z6) {
            int i3 = i2 + 1;
            try {
                this.f25822L0.mo23695D();
                m27451g1();
                mo23833m(this.f25822L0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.f25907G0.get(i4).mo23833m(this.f25822L0);
                }
                z6 = mo23863Q0(this.f25822L0);
                if (z6) {
                    this.f25822L0.mo23714z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                PrintStream printStream = System.out;
                printStream.println("EXCEPTION : " + e);
            }
            if (z6) {
                mo23880k1(this.f25822L0, C6256k.f25893a);
            } else {
                mo23802K0(this.f25822L0);
                for (int i5 = 0; i5 < size; i5++) {
                    this.f25907G0.get(i5).mo23802K0(this.f25822L0);
                }
            }
            if (!z5 || i3 >= 8 || !C6256k.f25893a[2]) {
                z = false;
            } else {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    C6246e eVar2 = this.f25907G0.get(i8);
                    i6 = Math.max(i6, eVar2.f25753U + eVar2.mo23808Q());
                    i7 = Math.max(i7, eVar2.f25754V + eVar2.mo23853w());
                }
                int max3 = Math.max(this.f25762b0, i6);
                int max4 = Math.max(this.f25764c0, i7);
                C6246e.C6248b bVar4 = C6246e.C6248b.WRAP_CONTENT;
                if (bVar2 != bVar4 || mo23808Q() >= max3) {
                    z = false;
                } else {
                    mo23792F0(max3);
                    this.f25747O[0] = bVar4;
                    z = true;
                    z7 = true;
                }
                if (bVar == bVar4 && mo23853w() < max4) {
                    mo23827i0(max4);
                    this.f25747O[1] = bVar4;
                    z = true;
                    z7 = true;
                }
            }
            int max5 = Math.max(this.f25762b0, mo23808Q());
            if (max5 > mo23808Q()) {
                mo23792F0(max5);
                this.f25747O[0] = C6246e.C6248b.FIXED;
                z = true;
                z7 = true;
            }
            int max6 = Math.max(this.f25764c0, mo23853w());
            if (max6 > mo23853w()) {
                mo23827i0(max6);
                r11 = 1;
                this.f25747O[1] = C6246e.C6248b.FIXED;
                z = true;
                z2 = true;
            } else {
                r11 = 1;
                z2 = z7;
            }
            if (!z2) {
                C6246e.C6248b bVar5 = this.f25747O[0];
                C6246e.C6248b bVar6 = C6246e.C6248b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && mo23808Q() > max) {
                    this.f25838b1 = r11;
                    this.f25747O[0] = C6246e.C6248b.FIXED;
                    mo23792F0(max);
                    z = true;
                    z2 = true;
                }
                if (this.f25747O[r11] == bVar6 && max2 > 0 && mo23853w() > max2) {
                    this.f25839c1 = r11;
                    this.f25747O[r11] = C6246e.C6248b.FIXED;
                    mo23827i0(max2);
                    z6 = true;
                    z7 = true;
                    i2 = i3;
                }
            }
            z6 = z;
            z7 = z2;
            i2 = i3;
        }
        this.f25907G0 = arrayList;
        if (z7) {
            C6246e.C6248b[] bVarArr2 = this.f25747O;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        mo23818b0(this.f25822L0.mo23712v());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo23862P0(C6246e eVar, int i) {
        if (i == 0) {
            m27449R0(eVar);
        } else if (i == 1) {
            m27450S0(eVar);
        }
    }

    /* renamed from: Q0 */
    public boolean mo23863Q0(C6213d dVar) {
        mo23761f(dVar);
        int size = this.f25907G0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C6246e eVar = this.f25907G0.get(i);
            eVar.mo23840p0(0, false);
            eVar.mo23840p0(1, false);
            if (eVar instanceof C6240a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C6246e eVar2 = this.f25907G0.get(i2);
                if (eVar2 instanceof C6240a) {
                    ((C6240a) eVar2).mo23757O0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C6246e eVar3 = this.f25907G0.get(i3);
            if (eVar3.mo23821e()) {
                eVar3.mo23761f(dVar);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C6246e eVar4 = this.f25907G0.get(i4);
            if (eVar4 instanceof C6249f) {
                C6246e.C6248b[] bVarArr = eVar4.f25747O;
                C6246e.C6248b bVar = bVarArr[0];
                C6246e.C6248b bVar2 = bVarArr[1];
                C6246e.C6248b bVar3 = C6246e.C6248b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.mo23834m0(C6246e.C6248b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.mo23784B0(C6246e.C6248b.FIXED);
                }
                eVar4.mo23761f(dVar);
                if (bVar == bVar3) {
                    eVar4.mo23834m0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.mo23784B0(bVar2);
                }
            } else {
                C6256k.m27553a(this, dVar, eVar4);
                if (!eVar4.mo23821e()) {
                    eVar4.mo23761f(dVar);
                }
            }
        }
        if (this.f25827Q0 > 0) {
            C6241b.m27344a(this, dVar, 0);
        }
        if (this.f25828R0 > 0) {
            C6241b.m27344a(this, dVar, 1);
        }
        return true;
    }

    /* renamed from: T0 */
    public boolean mo23864T0(boolean z) {
        return this.f25819I0.mo24090f(z);
    }

    /* renamed from: U0 */
    public boolean mo23865U0(boolean z) {
        return this.f25819I0.mo24091g(z);
    }

    /* renamed from: V0 */
    public boolean mo23866V0(boolean z, int i) {
        return this.f25819I0.mo24092h(z, i);
    }

    /* renamed from: W0 */
    public C6317b.C6319b mo23867W0() {
        return this.f25820J0;
    }

    /* renamed from: X0 */
    public int mo23868X0() {
        return this.f25836Z0;
    }

    /* renamed from: Y0 */
    public boolean mo23869Y0() {
        return false;
    }

    /* renamed from: Z */
    public void mo23816Z() {
        this.f25822L0.mo23695D();
        this.f25823M0 = 0;
        this.f25825O0 = 0;
        this.f25824N0 = 0;
        this.f25826P0 = 0;
        this.f25837a1 = false;
        super.mo23816Z();
    }

    /* renamed from: Z0 */
    public void mo23870Z0() {
        this.f25819I0.mo24093j();
    }

    /* renamed from: a1 */
    public void mo23871a1() {
        this.f25819I0.mo24094k();
    }

    /* renamed from: b1 */
    public boolean mo23872b1() {
        return this.f25839c1;
    }

    /* renamed from: c1 */
    public boolean mo23873c1() {
        return this.f25821K0;
    }

    /* renamed from: d1 */
    public boolean mo23874d1() {
        return this.f25838b1;
    }

    /* renamed from: e1 */
    public long mo23875e1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f25823M0 = i10;
        int i11 = i9;
        this.f25824N0 = i11;
        return this.f25818H0.mo24079d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: f1 */
    public boolean mo23876f1(int i) {
        return (this.f25836Z0 & i) == i;
    }

    /* renamed from: h1 */
    public void mo23877h1(C6317b.C6319b bVar) {
        this.f25820J0 = bVar;
        this.f25819I0.mo24096n(bVar);
    }

    /* renamed from: i1 */
    public void mo23878i1(int i) {
        this.f25836Z0 = i;
        C6213d.f25595s = C6256k.m27554b(i, 256);
    }

    /* renamed from: j1 */
    public void mo23879j1(boolean z) {
        this.f25821K0 = z;
    }

    /* renamed from: k1 */
    public void mo23880k1(C6213d dVar, boolean[] zArr) {
        zArr[2] = false;
        mo23802K0(dVar);
        int size = this.f25907G0.size();
        for (int i = 0; i < size; i++) {
            this.f25907G0.get(i).mo23802K0(dVar);
        }
    }

    /* renamed from: l1 */
    public void mo23881l1() {
        this.f25818H0.mo24080e(this);
    }
}
