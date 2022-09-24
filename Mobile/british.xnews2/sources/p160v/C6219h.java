package p160v;

import java.util.Arrays;
import java.util.Comparator;
import p160v.C6210b;

/* renamed from: v.h */
/* compiled from: PriorityGoalRow */
public class C6219h extends C6210b {

    /* renamed from: g */
    private int f25617g = 128;

    /* renamed from: h */
    private C6222i[] f25618h = new C6222i[128];

    /* renamed from: i */
    private C6222i[] f25619i = new C6222i[128];

    /* renamed from: j */
    private int f25620j = 0;

    /* renamed from: k */
    C6221b f25621k = new C6221b(this);

    /* renamed from: l */
    C6212c f25622l;

    /* renamed from: v.h$a */
    /* compiled from: PriorityGoalRow */
    class C6220a implements Comparator<C6222i> {
        C6220a() {
        }

        /* renamed from: a */
        public int compare(C6222i iVar, C6222i iVar2) {
            return iVar.f25630c - iVar2.f25630c;
        }
    }

    /* renamed from: v.h$b */
    /* compiled from: PriorityGoalRow */
    class C6221b implements Comparable {

        /* renamed from: b */
        C6222i f25624b;

        /* renamed from: c */
        C6219h f25625c;

        public C6221b(C6219h hVar) {
            this.f25625c = hVar;
        }

        /* renamed from: a */
        public boolean mo23720a(C6222i iVar, float f) {
            boolean z = true;
            if (this.f25624b.f25628a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f25624b.f25636i;
                    fArr[i] = fArr[i] + (iVar.f25636i[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f25624b.f25636i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C6219h.this.m27271G(this.f25624b);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f25636i[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f25624b.f25636i[i2] = f3;
                } else {
                    this.f25624b.f25636i[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo23721b(C6222i iVar) {
            this.f25624b = iVar;
        }

        public int compareTo(Object obj) {
            return this.f25624b.f25630c - ((C6222i) obj).f25630c;
        }

        /* renamed from: d */
        public final boolean mo23723d() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f25624b.f25636i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: i */
        public final boolean mo23724i(C6222i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f25636i[i];
                float f2 = this.f25624b.f25636i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public void mo23725j() {
            Arrays.fill(this.f25624b.f25636i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f25624b != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f25624b.f25636i[i] + " ";
                }
            }
            return str + "] " + this.f25624b;
        }
    }

    public C6219h(C6212c cVar) {
        super(cVar);
        this.f25622l = cVar;
    }

    /* renamed from: F */
    private final void m27270F(C6222i iVar) {
        int i;
        int i2 = this.f25620j + 1;
        C6222i[] iVarArr = this.f25618h;
        if (i2 > iVarArr.length) {
            C6222i[] iVarArr2 = (C6222i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f25618h = iVarArr2;
            this.f25619i = (C6222i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C6222i[] iVarArr3 = this.f25618h;
        int i3 = this.f25620j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f25620j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f25630c > iVar.f25630c) {
            int i5 = 0;
            while (true) {
                i = this.f25620j;
                if (i5 >= i) {
                    break;
                }
                this.f25619i[i5] = this.f25618h[i5];
                i5++;
            }
            Arrays.sort(this.f25619i, 0, i, new C6220a());
            for (int i6 = 0; i6 < this.f25620j; i6++) {
                this.f25618h[i6] = this.f25619i[i6];
            }
        }
        iVar.f25628a = true;
        iVar.mo23727a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m27271G(C6222i iVar) {
        int i = 0;
        while (i < this.f25620j) {
            if (this.f25618h[i] == iVar) {
                while (true) {
                    int i2 = this.f25620j;
                    if (i < i2 - 1) {
                        C6222i[] iVarArr = this.f25618h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f25620j = i2 - 1;
                        iVar.f25628a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: C */
    public void mo23665C(C6210b bVar, boolean z) {
        C6222i iVar = bVar.f25583a;
        if (iVar != null) {
            C6210b.C6211a aVar = bVar.f25587e;
            int c = aVar.mo23652c();
            for (int i = 0; i < c; i++) {
                C6222i d = aVar.mo23654d(i);
                float g = aVar.mo23657g(i);
                this.f25621k.mo23721b(d);
                if (this.f25621k.mo23720a(iVar, g)) {
                    m27270F(d);
                }
                this.f25584b += bVar.f25584b * g;
            }
            m27271G(iVar);
        }
    }

    /* renamed from: b */
    public C6222i mo23668b(C6213d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f25620j; i2++) {
            C6222i iVar = this.f25618h[i2];
            if (!zArr[iVar.f25630c]) {
                this.f25621k.mo23721b(iVar);
                if (i == -1) {
                    if (!this.f25621k.mo23723d()) {
                    }
                } else if (!this.f25621k.mo23724i(this.f25618h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f25618h[i];
    }

    /* renamed from: c */
    public void mo23669c(C6222i iVar) {
        this.f25621k.mo23721b(iVar);
        this.f25621k.mo23725j();
        iVar.f25636i[iVar.f25632e] = 1.0f;
        m27270F(iVar);
    }

    public void clear() {
        this.f25620j = 0;
        this.f25584b = 0.0f;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f25584b + ") : ";
        for (int i = 0; i < this.f25620j; i++) {
            this.f25621k.mo23721b(this.f25618h[i]);
            str = str + this.f25621k + " ";
        }
        return str;
    }
}
