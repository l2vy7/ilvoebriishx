package p161v;

import java.util.Arrays;
import p161v.C6210b;

/* renamed from: v.a */
/* compiled from: ArrayLinkedVariables */
public class C6209a implements C6210b.C6211a {

    /* renamed from: l */
    private static float f25571l = 0.001f;

    /* renamed from: a */
    int f25572a = 0;

    /* renamed from: b */
    private final C6210b f25573b;

    /* renamed from: c */
    protected final C6212c f25574c;

    /* renamed from: d */
    private int f25575d = 8;

    /* renamed from: e */
    private C6222i f25576e = null;

    /* renamed from: f */
    private int[] f25577f = new int[8];

    /* renamed from: g */
    private int[] f25578g = new int[8];

    /* renamed from: h */
    private float[] f25579h = new float[8];

    /* renamed from: i */
    private int f25580i = -1;

    /* renamed from: j */
    private int f25581j = -1;

    /* renamed from: k */
    private boolean f25582k = false;

    C6209a(C6210b bVar, C6212c cVar) {
        this.f25573b = bVar;
        this.f25574c = cVar;
    }

    /* renamed from: a */
    public float mo23650a(C6210b bVar, boolean z) {
        float j = mo23660j(bVar.f25583a);
        mo23658h(bVar.f25583a, z);
        C6210b.C6211a aVar = bVar.f25587e;
        int c = aVar.mo23652c();
        for (int i = 0; i < c; i++) {
            C6222i d = aVar.mo23654d(i);
            mo23659i(d, aVar.mo23660j(d) * j, z);
        }
        return j;
    }

    /* renamed from: b */
    public final void mo23651b(C6222i iVar, float f) {
        if (f == 0.0f) {
            mo23658h(iVar, true);
            return;
        }
        int i = this.f25580i;
        if (i == -1) {
            this.f25580i = 0;
            this.f25579h[0] = f;
            this.f25577f[0] = iVar.f25630c;
            this.f25578g[0] = -1;
            iVar.f25640m++;
            iVar.mo23727a(this.f25573b);
            this.f25572a++;
            if (!this.f25582k) {
                int i2 = this.f25581j + 1;
                this.f25581j = i2;
                int[] iArr = this.f25577f;
                if (i2 >= iArr.length) {
                    this.f25582k = true;
                    this.f25581j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f25572a) {
            int[] iArr2 = this.f25577f;
            int i5 = iArr2[i];
            int i6 = iVar.f25630c;
            if (i5 == i6) {
                this.f25579h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f25578g[i];
            i3++;
        }
        int i7 = this.f25581j;
        int i8 = i7 + 1;
        if (this.f25582k) {
            int[] iArr3 = this.f25577f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f25577f;
        if (i7 >= iArr4.length && this.f25572a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f25577f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f25577f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f25575d * 2;
            this.f25575d = i10;
            this.f25582k = false;
            this.f25581j = i7 - 1;
            this.f25579h = Arrays.copyOf(this.f25579h, i10);
            this.f25577f = Arrays.copyOf(this.f25577f, this.f25575d);
            this.f25578g = Arrays.copyOf(this.f25578g, this.f25575d);
        }
        this.f25577f[i7] = iVar.f25630c;
        this.f25579h[i7] = f;
        if (i4 != -1) {
            int[] iArr7 = this.f25578g;
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            this.f25578g[i7] = this.f25580i;
            this.f25580i = i7;
        }
        iVar.f25640m++;
        iVar.mo23727a(this.f25573b);
        int i11 = this.f25572a + 1;
        this.f25572a = i11;
        if (!this.f25582k) {
            this.f25581j++;
        }
        int[] iArr8 = this.f25577f;
        if (i11 >= iArr8.length) {
            this.f25582k = true;
        }
        if (this.f25581j >= iArr8.length) {
            this.f25582k = true;
            this.f25581j = iArr8.length - 1;
        }
    }

    /* renamed from: c */
    public int mo23652c() {
        return this.f25572a;
    }

    public final void clear() {
        int i = this.f25580i;
        int i2 = 0;
        while (i != -1 && i2 < this.f25572a) {
            C6222i iVar = this.f25574c.f25592d[this.f25577f[i]];
            if (iVar != null) {
                iVar.mo23728c(this.f25573b);
            }
            i = this.f25578g[i];
            i2++;
        }
        this.f25580i = -1;
        this.f25581j = -1;
        this.f25582k = false;
        this.f25572a = 0;
    }

    /* renamed from: d */
    public C6222i mo23654d(int i) {
        int i2 = this.f25580i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f25572a) {
            if (i3 == i) {
                return this.f25574c.f25592d[this.f25577f[i2]];
            }
            i2 = this.f25578g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo23655e(C6222i iVar) {
        int i = this.f25580i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f25572a) {
            if (this.f25577f[i] == iVar.f25630c) {
                return true;
            }
            i = this.f25578g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: f */
    public void mo23656f() {
        int i = this.f25580i;
        int i2 = 0;
        while (i != -1 && i2 < this.f25572a) {
            float[] fArr = this.f25579h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f25578g[i];
            i2++;
        }
    }

    /* renamed from: g */
    public float mo23657g(int i) {
        int i2 = this.f25580i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f25572a) {
            if (i3 == i) {
                return this.f25579h[i2];
            }
            i2 = this.f25578g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float mo23658h(C6222i iVar, boolean z) {
        if (this.f25576e == iVar) {
            this.f25576e = null;
        }
        int i = this.f25580i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f25572a) {
            if (this.f25577f[i] == iVar.f25630c) {
                if (i == this.f25580i) {
                    this.f25580i = this.f25578g[i];
                } else {
                    int[] iArr = this.f25578g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo23728c(this.f25573b);
                }
                iVar.f25640m--;
                this.f25572a--;
                this.f25577f[i] = -1;
                if (this.f25582k) {
                    this.f25581j = i;
                }
                return this.f25579h[i];
            }
            i2++;
            i3 = i;
            i = this.f25578g[i];
        }
        return 0.0f;
    }

    /* renamed from: i */
    public void mo23659i(C6222i iVar, float f, boolean z) {
        float f2 = f25571l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f25580i;
            if (i == -1) {
                this.f25580i = 0;
                this.f25579h[0] = f;
                this.f25577f[0] = iVar.f25630c;
                this.f25578g[0] = -1;
                iVar.f25640m++;
                iVar.mo23727a(this.f25573b);
                this.f25572a++;
                if (!this.f25582k) {
                    int i2 = this.f25581j + 1;
                    this.f25581j = i2;
                    int[] iArr = this.f25577f;
                    if (i2 >= iArr.length) {
                        this.f25582k = true;
                        this.f25581j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f25572a) {
                int[] iArr2 = this.f25577f;
                int i5 = iArr2[i];
                int i6 = iVar.f25630c;
                if (i5 == i6) {
                    float[] fArr = this.f25579h;
                    float f3 = fArr[i] + f;
                    float f4 = f25571l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f25580i) {
                            this.f25580i = this.f25578g[i];
                        } else {
                            int[] iArr3 = this.f25578g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo23728c(this.f25573b);
                        }
                        if (this.f25582k) {
                            this.f25581j = i;
                        }
                        iVar.f25640m--;
                        this.f25572a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f25578g[i];
                i3++;
            }
            int i7 = this.f25581j;
            int i8 = i7 + 1;
            if (this.f25582k) {
                int[] iArr4 = this.f25577f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f25577f;
            if (i7 >= iArr5.length && this.f25572a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f25577f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f25577f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f25575d * 2;
                this.f25575d = i10;
                this.f25582k = false;
                this.f25581j = i7 - 1;
                this.f25579h = Arrays.copyOf(this.f25579h, i10);
                this.f25577f = Arrays.copyOf(this.f25577f, this.f25575d);
                this.f25578g = Arrays.copyOf(this.f25578g, this.f25575d);
            }
            this.f25577f[i7] = iVar.f25630c;
            this.f25579h[i7] = f;
            if (i4 != -1) {
                int[] iArr8 = this.f25578g;
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                this.f25578g[i7] = this.f25580i;
                this.f25580i = i7;
            }
            iVar.f25640m++;
            iVar.mo23727a(this.f25573b);
            this.f25572a++;
            if (!this.f25582k) {
                this.f25581j++;
            }
            int i11 = this.f25581j;
            int[] iArr9 = this.f25577f;
            if (i11 >= iArr9.length) {
                this.f25582k = true;
                this.f25581j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: j */
    public final float mo23660j(C6222i iVar) {
        int i = this.f25580i;
        int i2 = 0;
        while (i != -1 && i2 < this.f25572a) {
            if (this.f25577f[i] == iVar.f25630c) {
                return this.f25579h[i];
            }
            i = this.f25578g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public void mo23661k(float f) {
        int i = this.f25580i;
        int i2 = 0;
        while (i != -1 && i2 < this.f25572a) {
            float[] fArr = this.f25579h;
            fArr[i] = fArr[i] / f;
            i = this.f25578g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f25580i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f25572a) {
            str = ((str + " -> ") + this.f25579h[i] + " : ") + this.f25574c.f25592d[this.f25577f[i]];
            i = this.f25578g[i];
            i2++;
        }
        return str;
    }
}
