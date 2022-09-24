package p165w;

import java.util.HashMap;
import p160v.C6213d;
import p160v.C6222i;
import p165w.C6243d;
import p165w.C6246e;

/* renamed from: w.h */
/* compiled from: Guideline */
public class C6252h extends C6246e {

    /* renamed from: G0 */
    protected float f25884G0 = -1.0f;

    /* renamed from: H0 */
    protected int f25885H0 = -1;

    /* renamed from: I0 */
    protected int f25886I0 = -1;

    /* renamed from: J0 */
    private C6243d f25887J0 = this.f25736E;

    /* renamed from: K0 */
    private int f25888K0;

    /* renamed from: L0 */
    private int f25889L0;

    /* renamed from: w.h$a */
    /* compiled from: Guideline */
    static /* synthetic */ class C6253a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25890a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                w.d$b[] r0 = p165w.C6243d.C6245b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25890a = r0
                w.d$b r1 = p165w.C6243d.C6245b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.d$b r1 = p165w.C6243d.C6245b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.d$b r1 = p165w.C6243d.C6245b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w.d$b r1 = p165w.C6243d.C6245b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x003e }
                w.d$b r1 = p165w.C6243d.C6245b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x0049 }
                w.d$b r1 = p165w.C6243d.C6245b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x0054 }
                w.d$b r1 = p165w.C6243d.C6245b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x0060 }
                w.d$b r1 = p165w.C6243d.C6245b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25890a     // Catch:{ NoSuchFieldError -> 0x006c }
                w.d$b r1 = p165w.C6243d.C6245b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p165w.C6252h.C6253a.<clinit>():void");
        }
    }

    public C6252h() {
        this.f25888K0 = 0;
        this.f25889L0 = 0;
        this.f25745M.clear();
        this.f25745M.add(this.f25887J0);
        int length = this.f25744L.length;
        for (int i = 0; i < length; i++) {
            this.f25744L[i] = this.f25887J0;
        }
    }

    /* renamed from: K0 */
    public void mo23802K0(C6213d dVar) {
        if (mo23795H() != null) {
            int x = dVar.mo23713x(this.f25887J0);
            if (this.f25888K0 == 1) {
                mo23794G0(x);
                mo23796H0(0);
                mo23827i0(mo23795H().mo23853w());
                mo23792F0(0);
                return;
            }
            mo23794G0(0);
            mo23796H0(x);
            mo23792F0(mo23795H().mo23808Q());
            mo23827i0(0);
        }
    }

    /* renamed from: L0 */
    public int mo23910L0() {
        return this.f25888K0;
    }

    /* renamed from: M0 */
    public int mo23911M0() {
        return this.f25885H0;
    }

    /* renamed from: N0 */
    public int mo23912N0() {
        return this.f25886I0;
    }

    /* renamed from: O0 */
    public float mo23913O0() {
        return this.f25884G0;
    }

    /* renamed from: P0 */
    public void mo23914P0(int i) {
        if (i > -1) {
            this.f25884G0 = -1.0f;
            this.f25885H0 = i;
            this.f25886I0 = -1;
        }
    }

    /* renamed from: Q0 */
    public void mo23915Q0(int i) {
        if (i > -1) {
            this.f25884G0 = -1.0f;
            this.f25885H0 = -1;
            this.f25886I0 = i;
        }
    }

    /* renamed from: R0 */
    public void mo23916R0(float f) {
        if (f > -1.0f) {
            this.f25884G0 = f;
            this.f25885H0 = -1;
            this.f25886I0 = -1;
        }
    }

    /* renamed from: S0 */
    public void mo23917S0(int i) {
        if (this.f25888K0 != i) {
            this.f25888K0 = i;
            this.f25745M.clear();
            if (this.f25888K0 == 1) {
                this.f25887J0 = this.f25734D;
            } else {
                this.f25887J0 = this.f25736E;
            }
            this.f25745M.add(this.f25887J0);
            int length = this.f25744L.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f25744L[i2] = this.f25887J0;
            }
        }
    }

    /* renamed from: f */
    public void mo23761f(C6213d dVar) {
        C6249f fVar = (C6249f) mo23795H();
        if (fVar != null) {
            C6243d n = fVar.mo23835n(C6243d.C6245b.LEFT);
            C6243d n2 = fVar.mo23835n(C6243d.C6245b.RIGHT);
            C6246e eVar = this.f25748P;
            boolean z = true;
            boolean z2 = eVar != null && eVar.f25747O[0] == C6246e.C6248b.WRAP_CONTENT;
            if (this.f25888K0 == 0) {
                n = fVar.mo23835n(C6243d.C6245b.TOP);
                n2 = fVar.mo23835n(C6243d.C6245b.BOTTOM);
                C6246e eVar2 = this.f25748P;
                if (eVar2 == null || eVar2.f25747O[1] != C6246e.C6248b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f25885H0 != -1) {
                C6222i q = dVar.mo23709q(this.f25887J0);
                dVar.mo23699e(q, dVar.mo23709q(n), this.f25885H0, 8);
                if (z2) {
                    dVar.mo23702h(dVar.mo23709q(n2), q, 0, 5);
                }
            } else if (this.f25886I0 != -1) {
                C6222i q2 = dVar.mo23709q(this.f25887J0);
                C6222i q3 = dVar.mo23709q(n2);
                dVar.mo23699e(q2, q3, -this.f25886I0, 8);
                if (z2) {
                    dVar.mo23702h(q2, dVar.mo23709q(n), 0, 5);
                    dVar.mo23702h(q3, q2, 0, 5);
                }
            } else if (this.f25884G0 != -1.0f) {
                dVar.mo23698d(C6213d.m27237s(dVar, dVar.mo23709q(this.f25887J0), dVar.mo23709q(n2), this.f25884G0));
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
        C6252h hVar = (C6252h) eVar;
        this.f25884G0 = hVar.f25884G0;
        this.f25885H0 = hVar.f25885H0;
        this.f25886I0 = hVar.f25886I0;
        mo23917S0(hVar.f25888K0);
    }

    /* renamed from: n */
    public C6243d mo23835n(C6243d.C6245b bVar) {
        switch (C6253a.f25890a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f25888K0 == 1) {
                    return this.f25887J0;
                }
                break;
            case 3:
            case 4:
                if (this.f25888K0 == 0) {
                    return this.f25887J0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
