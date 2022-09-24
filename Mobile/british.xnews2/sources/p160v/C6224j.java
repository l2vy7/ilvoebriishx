package p160v;

import java.util.Arrays;
import p160v.C6210b;

/* renamed from: v.j */
/* compiled from: SolverVariableValues */
public class C6224j implements C6210b.C6211a {

    /* renamed from: n */
    private static float f25648n = 0.001f;

    /* renamed from: a */
    private final int f25649a = -1;

    /* renamed from: b */
    private int f25650b = 16;

    /* renamed from: c */
    private int f25651c = 16;

    /* renamed from: d */
    int[] f25652d = new int[16];

    /* renamed from: e */
    int[] f25653e = new int[16];

    /* renamed from: f */
    int[] f25654f = new int[16];

    /* renamed from: g */
    float[] f25655g = new float[16];

    /* renamed from: h */
    int[] f25656h = new int[16];

    /* renamed from: i */
    int[] f25657i = new int[16];

    /* renamed from: j */
    int f25658j = 0;

    /* renamed from: k */
    int f25659k = -1;

    /* renamed from: l */
    private final C6210b f25660l;

    /* renamed from: m */
    protected final C6212c f25661m;

    C6224j(C6210b bVar, C6212c cVar) {
        this.f25660l = bVar;
        this.f25661m = cVar;
        clear();
    }

    /* renamed from: l */
    private void m27288l(C6222i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f25630c % this.f25651c;
        int[] iArr2 = this.f25652d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f25653e;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f25653e[i] = -1;
    }

    /* renamed from: m */
    private void m27289m(int i, C6222i iVar, float f) {
        this.f25654f[i] = iVar.f25630c;
        this.f25655g[i] = f;
        this.f25656h[i] = -1;
        this.f25657i[i] = -1;
        iVar.mo23727a(this.f25660l);
        iVar.f25640m++;
        this.f25658j++;
    }

    /* renamed from: n */
    private int m27290n() {
        for (int i = 0; i < this.f25650b; i++) {
            if (this.f25654f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m27291o() {
        int i = this.f25650b * 2;
        this.f25654f = Arrays.copyOf(this.f25654f, i);
        this.f25655g = Arrays.copyOf(this.f25655g, i);
        this.f25656h = Arrays.copyOf(this.f25656h, i);
        this.f25657i = Arrays.copyOf(this.f25657i, i);
        this.f25653e = Arrays.copyOf(this.f25653e, i);
        for (int i2 = this.f25650b; i2 < i; i2++) {
            this.f25654f[i2] = -1;
            this.f25653e[i2] = -1;
        }
        this.f25650b = i;
    }

    /* renamed from: q */
    private void m27292q(int i, C6222i iVar, float f) {
        int n = m27290n();
        m27289m(n, iVar, f);
        if (i != -1) {
            this.f25656h[n] = i;
            int[] iArr = this.f25657i;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f25656h[n] = -1;
            if (this.f25658j > 0) {
                this.f25657i[n] = this.f25659k;
                this.f25659k = n;
            } else {
                this.f25657i[n] = -1;
            }
        }
        int[] iArr2 = this.f25657i;
        if (iArr2[n] != -1) {
            this.f25656h[iArr2[n]] = n;
        }
        m27288l(iVar, n);
    }

    /* renamed from: r */
    private void m27293r(C6222i iVar) {
        int[] iArr;
        int i = iVar.f25630c;
        int i2 = i % this.f25651c;
        int[] iArr2 = this.f25652d;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f25654f[i3] == i) {
                int[] iArr3 = this.f25653e;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
                return;
            }
            while (true) {
                iArr = this.f25653e;
                if (iArr[i3] == -1 || this.f25654f[iArr[i3]] == i) {
                    int i4 = iArr[i3];
                } else {
                    i3 = iArr[i3];
                }
            }
            int i42 = iArr[i3];
            if (i42 != -1 && this.f25654f[i42] == i) {
                iArr[i3] = iArr[i42];
                iArr[i42] = -1;
            }
        }
    }

    /* renamed from: a */
    public float mo23650a(C6210b bVar, boolean z) {
        float j = mo23660j(bVar.f25583a);
        mo23658h(bVar.f25583a, z);
        C6224j jVar = (C6224j) bVar.f25587e;
        int c = jVar.mo23652c();
        int i = 0;
        int i2 = 0;
        while (i < c) {
            int[] iArr = jVar.f25654f;
            if (iArr[i2] != -1) {
                mo23659i(this.f25661m.f25592d[iArr[i2]], jVar.f25655g[i2] * j, z);
                i++;
            }
            i2++;
        }
        return j;
    }

    /* renamed from: b */
    public void mo23651b(C6222i iVar, float f) {
        float f2 = f25648n;
        if (f <= (-f2) || f >= f2) {
            if (this.f25658j == 0) {
                m27289m(0, iVar, f);
                m27288l(iVar, 0);
                this.f25659k = 0;
                return;
            }
            int p = mo23734p(iVar);
            if (p != -1) {
                this.f25655g[p] = f;
                return;
            }
            if (this.f25658j + 1 >= this.f25650b) {
                m27291o();
            }
            int i = this.f25658j;
            int i2 = this.f25659k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f25654f;
                int i5 = iArr[i2];
                int i6 = iVar.f25630c;
                if (i5 == i6) {
                    this.f25655g[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f25657i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m27292q(i3, iVar, f);
            return;
        }
        mo23658h(iVar, true);
    }

    /* renamed from: c */
    public int mo23652c() {
        return this.f25658j;
    }

    public void clear() {
        int i = this.f25658j;
        for (int i2 = 0; i2 < i; i2++) {
            C6222i d = mo23654d(i2);
            if (d != null) {
                d.mo23728c(this.f25660l);
            }
        }
        for (int i3 = 0; i3 < this.f25650b; i3++) {
            this.f25654f[i3] = -1;
            this.f25653e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f25651c; i4++) {
            this.f25652d[i4] = -1;
        }
        this.f25658j = 0;
        this.f25659k = -1;
    }

    /* renamed from: d */
    public C6222i mo23654d(int i) {
        int i2 = this.f25658j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f25659k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f25661m.f25592d[this.f25654f[i3]];
            }
            i3 = this.f25657i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo23655e(C6222i iVar) {
        return mo23734p(iVar) != -1;
    }

    /* renamed from: f */
    public void mo23656f() {
        int i = this.f25658j;
        int i2 = this.f25659k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f25655g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f25657i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public float mo23657g(int i) {
        int i2 = this.f25658j;
        int i3 = this.f25659k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f25655g[i3];
            }
            i3 = this.f25657i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: h */
    public float mo23658h(C6222i iVar, boolean z) {
        int p = mo23734p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m27293r(iVar);
        float f = this.f25655g[p];
        if (this.f25659k == p) {
            this.f25659k = this.f25657i[p];
        }
        this.f25654f[p] = -1;
        int[] iArr = this.f25656h;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f25657i;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f25657i;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.f25658j--;
        iVar.f25640m--;
        if (z) {
            iVar.mo23728c(this.f25660l);
        }
        return f;
    }

    /* renamed from: i */
    public void mo23659i(C6222i iVar, float f, boolean z) {
        float f2 = f25648n;
        if (f <= (-f2) || f >= f2) {
            int p = mo23734p(iVar);
            if (p == -1) {
                mo23651b(iVar, f);
                return;
            }
            float[] fArr = this.f25655g;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = f25648n;
            if (f3 > (-f4) && fArr[p] < f4) {
                fArr[p] = 0.0f;
                mo23658h(iVar, z);
            }
        }
    }

    /* renamed from: j */
    public float mo23660j(C6222i iVar) {
        int p = mo23734p(iVar);
        if (p != -1) {
            return this.f25655g[p];
        }
        return 0.0f;
    }

    /* renamed from: k */
    public void mo23661k(float f) {
        int i = this.f25658j;
        int i2 = this.f25659k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f25655g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f25657i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public int mo23734p(C6222i iVar) {
        int[] iArr;
        if (this.f25658j == 0) {
            return -1;
        }
        int i = iVar.f25630c;
        int i2 = this.f25652d[i % this.f25651c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f25654f[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.f25653e;
            if (iArr[i2] != -1 && this.f25654f[iArr[i2]] != i) {
                i2 = iArr[i2];
            }
        }
        if (iArr[i2] != -1 && this.f25654f[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f25658j;
        for (int i2 = 0; i2 < i; i2++) {
            C6222i d = mo23654d(i2);
            if (d != null) {
                String str4 = str3 + d + " = " + mo23657g(i2) + " ";
                int p = mo23734p(d);
                String str5 = str4 + "[p: ";
                if (this.f25656h[p] != -1) {
                    str = str5 + this.f25661m.f25592d[this.f25654f[this.f25656h[p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f25657i[p] != -1) {
                    str2 = str6 + this.f25661m.f25592d[this.f25654f[this.f25657i[p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
