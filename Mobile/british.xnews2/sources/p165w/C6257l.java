package p165w;

import p165w.C6246e;
import p170x.C6317b;

/* renamed from: w.l */
/* compiled from: VirtualLayout */
public class C6257l extends C6255j {

    /* renamed from: I0 */
    private int f25894I0 = 0;

    /* renamed from: J0 */
    private int f25895J0 = 0;

    /* renamed from: K0 */
    private int f25896K0 = 0;

    /* renamed from: L0 */
    private int f25897L0 = 0;

    /* renamed from: M0 */
    private int f25898M0 = 0;

    /* renamed from: N0 */
    private int f25899N0 = 0;

    /* renamed from: O0 */
    private int f25900O0 = 0;

    /* renamed from: P0 */
    private int f25901P0 = 0;

    /* renamed from: Q0 */
    private boolean f25902Q0 = false;

    /* renamed from: R0 */
    private int f25903R0 = 0;

    /* renamed from: S0 */
    private int f25904S0 = 0;

    /* renamed from: T0 */
    protected C6317b.C6318a f25905T0 = new C6317b.C6318a();

    /* renamed from: U0 */
    C6317b.C6319b f25906U0 = null;

    /* renamed from: L0 */
    public void mo23921L0(boolean z) {
        int i = this.f25898M0;
        if (i <= 0 && this.f25899N0 <= 0) {
            return;
        }
        if (z) {
            this.f25900O0 = this.f25899N0;
            this.f25901P0 = i;
            return;
        }
        this.f25900O0 = i;
        this.f25901P0 = this.f25899N0;
    }

    /* renamed from: M0 */
    public void mo23922M0() {
        for (int i = 0; i < this.f25892H0; i++) {
            C6246e eVar = this.f25891G0[i];
            if (eVar != null) {
                eVar.mo23844r0(true);
            }
        }
    }

    /* renamed from: N0 */
    public int mo23923N0() {
        return this.f25904S0;
    }

    /* renamed from: O0 */
    public int mo23924O0() {
        return this.f25903R0;
    }

    /* renamed from: P0 */
    public int mo23925P0() {
        return this.f25895J0;
    }

    /* renamed from: Q0 */
    public int mo23926Q0() {
        return this.f25900O0;
    }

    /* renamed from: R0 */
    public int mo23927R0() {
        return this.f25901P0;
    }

    /* renamed from: S0 */
    public int mo23928S0() {
        return this.f25894I0;
    }

    /* renamed from: T0 */
    public void mo23895T0(int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public void mo23929U0(C6246e eVar, C6246e.C6248b bVar, int i, C6246e.C6248b bVar2, int i2) {
        while (this.f25906U0 == null && mo23795H() != null) {
            this.f25906U0 = ((C6249f) mo23795H()).mo23867W0();
        }
        C6317b.C6318a aVar = this.f25905T0;
        aVar.f26081a = bVar;
        aVar.f26082b = bVar2;
        aVar.f26083c = i;
        aVar.f26084d = i2;
        this.f25906U0.mo2862b(eVar, aVar);
        eVar.mo23792F0(this.f25905T0.f26085e);
        eVar.mo23827i0(this.f25905T0.f26086f);
        eVar.mo23825h0(this.f25905T0.f26088h);
        eVar.mo23819c0(this.f25905T0.f26087g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public boolean mo23930V0() {
        C6246e eVar = this.f25748P;
        C6317b.C6319b W0 = eVar != null ? ((C6249f) eVar).mo23867W0() : null;
        if (W0 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f25892H0) {
                return true;
            }
            C6246e eVar2 = this.f25891G0[i];
            if (eVar2 != null && !(eVar2 instanceof C6252h)) {
                C6246e.C6248b t = eVar2.mo23847t(0);
                C6246e.C6248b t2 = eVar2.mo23847t(1);
                C6246e.C6248b bVar = C6246e.C6248b.MATCH_CONSTRAINT;
                if (t != bVar || eVar2.f25781l == 1 || t2 != bVar || eVar2.f25783m == 1) {
                    z = false;
                }
                if (!z) {
                    if (t == bVar) {
                        t = C6246e.C6248b.WRAP_CONTENT;
                    }
                    if (t2 == bVar) {
                        t2 = C6246e.C6248b.WRAP_CONTENT;
                    }
                    C6317b.C6318a aVar = this.f25905T0;
                    aVar.f26081a = t;
                    aVar.f26082b = t2;
                    aVar.f26083c = eVar2.mo23808Q();
                    this.f25905T0.f26084d = eVar2.mo23853w();
                    W0.mo2862b(eVar2, this.f25905T0);
                    eVar2.mo23792F0(this.f25905T0.f26085e);
                    eVar2.mo23827i0(this.f25905T0.f26086f);
                    eVar2.mo23819c0(this.f25905T0.f26087g);
                }
            }
            i++;
        }
    }

    /* renamed from: W0 */
    public boolean mo23931W0() {
        return this.f25902Q0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo23932X0(boolean z) {
        this.f25902Q0 = z;
    }

    /* renamed from: Y0 */
    public void mo23933Y0(int i, int i2) {
        this.f25903R0 = i;
        this.f25904S0 = i2;
    }

    /* renamed from: Z0 */
    public void mo23934Z0(int i) {
        this.f25896K0 = i;
        this.f25894I0 = i;
        this.f25897L0 = i;
        this.f25895J0 = i;
        this.f25898M0 = i;
        this.f25899N0 = i;
    }

    /* renamed from: a1 */
    public void mo23935a1(int i) {
        this.f25895J0 = i;
    }

    /* renamed from: b */
    public void mo23919b(C6249f fVar) {
        mo23922M0();
    }

    /* renamed from: b1 */
    public void mo23936b1(int i) {
        this.f25899N0 = i;
    }

    /* renamed from: c1 */
    public void mo23937c1(int i) {
        this.f25896K0 = i;
        this.f25900O0 = i;
    }

    /* renamed from: d1 */
    public void mo23938d1(int i) {
        this.f25897L0 = i;
        this.f25901P0 = i;
    }

    /* renamed from: e1 */
    public void mo23939e1(int i) {
        this.f25898M0 = i;
        this.f25900O0 = i;
        this.f25901P0 = i;
    }

    /* renamed from: f1 */
    public void mo23940f1(int i) {
        this.f25894I0 = i;
    }
}
