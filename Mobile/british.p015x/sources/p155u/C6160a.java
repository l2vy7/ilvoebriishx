package p155u;

import java.util.Arrays;

/* renamed from: u.a */
/* compiled from: ArcCurveFit */
class C6160a extends C6162b {

    /* renamed from: a */
    private final double[] f25446a;

    /* renamed from: b */
    C6161a[] f25447b;

    /* renamed from: u.a$a */
    /* compiled from: ArcCurveFit */
    private static class C6161a {

        /* renamed from: s */
        private static double[] f25448s = new double[91];

        /* renamed from: a */
        double[] f25449a;

        /* renamed from: b */
        double f25450b;

        /* renamed from: c */
        double f25451c;

        /* renamed from: d */
        double f25452d;

        /* renamed from: e */
        double f25453e;

        /* renamed from: f */
        double f25454f;

        /* renamed from: g */
        double f25455g;

        /* renamed from: h */
        double f25456h;

        /* renamed from: i */
        double f25457i;

        /* renamed from: j */
        double f25458j;

        /* renamed from: k */
        double f25459k;

        /* renamed from: l */
        double f25460l;

        /* renamed from: m */
        double f25461m;

        /* renamed from: n */
        double f25462n;

        /* renamed from: o */
        double f25463o;

        /* renamed from: p */
        double f25464p;

        /* renamed from: q */
        boolean f25465q;

        /* renamed from: r */
        boolean f25466r = false;

        C6161a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2 = i;
            double d7 = d;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            boolean z = false;
            int i3 = 1;
            this.f25465q = i2 == 1 ? true : z;
            this.f25451c = d7;
            this.f25452d = d8;
            this.f25457i = 1.0d / (d8 - d7);
            if (3 == i2) {
                this.f25466r = true;
            }
            double d13 = d11 - d9;
            double d14 = d12 - d10;
            if (this.f25466r || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
                this.f25466r = true;
                this.f25453e = d9;
                this.f25454f = d11;
                this.f25455g = d10;
                this.f25456h = d6;
                double hypot = Math.hypot(d14, d13);
                this.f25450b = hypot;
                this.f25462n = hypot * this.f25457i;
                double d15 = this.f25452d;
                double d16 = this.f25451c;
                this.f25460l = d13 / (d15 - d16);
                this.f25461m = d14 / (d15 - d16);
                return;
            }
            this.f25449a = new double[101];
            boolean z2 = this.f25465q;
            double d17 = (double) (z2 ? -1 : 1);
            Double.isNaN(d17);
            this.f25458j = d13 * d17;
            double d18 = (double) (!z2 ? -1 : i3);
            Double.isNaN(d18);
            this.f25459k = d14 * d18;
            this.f25460l = z2 ? d11 : d9;
            this.f25461m = z2 ? d10 : d6;
            m27028a(d3, d4, d5, d6);
            this.f25462n = this.f25450b * this.f25457i;
        }

        /* renamed from: a */
        private void m27028a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f25448s;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = (double) i;
                Double.isNaN(d11);
                double d12 = d8;
                double length = (double) (dArr.length - 1);
                Double.isNaN(length);
                double radians = Math.toRadians((d11 * 90.0d) / length);
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d12;
                    f25448s[i] = d5;
                } else {
                    d5 = d12;
                }
                i++;
                d10 = cos;
                double d13 = sin;
                d8 = d5;
                d9 = d13;
            }
            double d14 = d8;
            this.f25450b = d14;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f25448s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d14;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f25449a;
                if (i3 < dArr3.length) {
                    double d15 = (double) i3;
                    double length2 = (double) (dArr3.length - 1);
                    Double.isNaN(d15);
                    Double.isNaN(length2);
                    double d16 = d15 / length2;
                    int binarySearch = Arrays.binarySearch(f25448s, d16);
                    if (binarySearch >= 0) {
                        this.f25449a[i3] = (double) (binarySearch / (f25448s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f25449a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double d17 = (double) i5;
                        double[] dArr4 = f25448s;
                        Double.isNaN(d17);
                        double length3 = (double) (dArr4.length - 1);
                        Double.isNaN(length3);
                        this.f25449a[i3] = (d17 + ((d16 - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / length3;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public double mo23549b() {
            double d = this.f25458j * this.f25464p;
            double hypot = this.f25462n / Math.hypot(d, (-this.f25459k) * this.f25463o);
            if (this.f25465q) {
                d = -d;
            }
            return d * hypot;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public double mo23550c() {
            double d = this.f25458j * this.f25464p;
            double d2 = (-this.f25459k) * this.f25463o;
            double hypot = this.f25462n / Math.hypot(d, d2);
            return this.f25465q ? (-d2) * hypot : d2 * hypot;
        }

        /* renamed from: d */
        public double mo23551d(double d) {
            return this.f25460l;
        }

        /* renamed from: e */
        public double mo23552e(double d) {
            return this.f25461m;
        }

        /* renamed from: f */
        public double mo23553f(double d) {
            double d2 = (d - this.f25451c) * this.f25457i;
            double d3 = this.f25453e;
            return d3 + (d2 * (this.f25454f - d3));
        }

        /* renamed from: g */
        public double mo23554g(double d) {
            double d2 = (d - this.f25451c) * this.f25457i;
            double d3 = this.f25455g;
            return d3 + (d2 * (this.f25456h - d3));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public double mo23555h() {
            return this.f25460l + (this.f25458j * this.f25463o);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public double mo23556i() {
            return this.f25461m + (this.f25459k * this.f25464p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public double mo23557j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f25449a;
            double length = (double) (dArr.length - 1);
            Double.isNaN(length);
            double d2 = d * length;
            int i = (int) d2;
            double d3 = (double) i;
            Double.isNaN(d3);
            return dArr[i] + ((d2 - d3) * (dArr[i + 1] - dArr[i]));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo23558k(double d) {
            double j = mo23557j((this.f25465q ? this.f25452d - d : d - this.f25451c) * this.f25457i) * 1.5707963267948966d;
            this.f25463o = Math.sin(j);
            this.f25464p = Math.cos(j);
        }
    }

    public C6160a(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f25446a = dArr3;
        this.f25447b = new C6161a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C6161a[] aVarArr = this.f25447b;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    i2 = i2 == 1 ? 2 : 1;
                    i3 = i2;
                }
                int i5 = i + 1;
                aVarArr[i] = new C6161a(i3, dArr3[i], dArr3[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public double mo23543c(double d, int i) {
        C6161a[] aVarArr = this.f25447b;
        int i2 = 0;
        if (d < aVarArr[0].f25451c) {
            d = aVarArr[0].f25451c;
        } else if (d > aVarArr[aVarArr.length - 1].f25452d) {
            d = aVarArr[aVarArr.length - 1].f25452d;
        }
        while (true) {
            C6161a[] aVarArr2 = this.f25447b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].f25452d) {
                i2++;
            } else if (!aVarArr2[i2].f25466r) {
                aVarArr2[i2].mo23558k(d);
                if (i == 0) {
                    return this.f25447b[i2].mo23555h();
                }
                return this.f25447b[i2].mo23556i();
            } else if (i == 0) {
                return aVarArr2[i2].mo23553f(d);
            } else {
                return aVarArr2[i2].mo23554g(d);
            }
        }
    }

    /* renamed from: d */
    public void mo23544d(double d, double[] dArr) {
        C6161a[] aVarArr = this.f25447b;
        if (d < aVarArr[0].f25451c) {
            d = aVarArr[0].f25451c;
        }
        if (d > aVarArr[aVarArr.length - 1].f25452d) {
            d = aVarArr[aVarArr.length - 1].f25452d;
        }
        int i = 0;
        while (true) {
            C6161a[] aVarArr2 = this.f25447b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f25452d) {
                i++;
            } else if (aVarArr2[i].f25466r) {
                dArr[0] = aVarArr2[i].mo23553f(d);
                dArr[1] = this.f25447b[i].mo23554g(d);
                return;
            } else {
                aVarArr2[i].mo23558k(d);
                dArr[0] = this.f25447b[i].mo23555h();
                dArr[1] = this.f25447b[i].mo23556i();
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo23545e(double d, float[] fArr) {
        C6161a[] aVarArr = this.f25447b;
        if (d < aVarArr[0].f25451c) {
            d = aVarArr[0].f25451c;
        } else if (d > aVarArr[aVarArr.length - 1].f25452d) {
            d = aVarArr[aVarArr.length - 1].f25452d;
        }
        int i = 0;
        while (true) {
            C6161a[] aVarArr2 = this.f25447b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f25452d) {
                i++;
            } else if (aVarArr2[i].f25466r) {
                fArr[0] = (float) aVarArr2[i].mo23553f(d);
                fArr[1] = (float) this.f25447b[i].mo23554g(d);
                return;
            } else {
                aVarArr2[i].mo23558k(d);
                fArr[0] = (float) this.f25447b[i].mo23555h();
                fArr[1] = (float) this.f25447b[i].mo23556i();
                return;
            }
        }
    }

    /* renamed from: f */
    public double mo23546f(double d, int i) {
        C6161a[] aVarArr = this.f25447b;
        int i2 = 0;
        if (d < aVarArr[0].f25451c) {
            d = aVarArr[0].f25451c;
        }
        if (d > aVarArr[aVarArr.length - 1].f25452d) {
            d = aVarArr[aVarArr.length - 1].f25452d;
        }
        while (true) {
            C6161a[] aVarArr2 = this.f25447b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].f25452d) {
                i2++;
            } else if (!aVarArr2[i2].f25466r) {
                aVarArr2[i2].mo23558k(d);
                if (i == 0) {
                    return this.f25447b[i2].mo23549b();
                }
                return this.f25447b[i2].mo23550c();
            } else if (i == 0) {
                return aVarArr2[i2].mo23551d(d);
            } else {
                return aVarArr2[i2].mo23552e(d);
            }
        }
    }

    /* renamed from: g */
    public void mo23547g(double d, double[] dArr) {
        C6161a[] aVarArr = this.f25447b;
        if (d < aVarArr[0].f25451c) {
            d = aVarArr[0].f25451c;
        } else if (d > aVarArr[aVarArr.length - 1].f25452d) {
            d = aVarArr[aVarArr.length - 1].f25452d;
        }
        int i = 0;
        while (true) {
            C6161a[] aVarArr2 = this.f25447b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f25452d) {
                i++;
            } else if (aVarArr2[i].f25466r) {
                dArr[0] = aVarArr2[i].mo23551d(d);
                dArr[1] = this.f25447b[i].mo23552e(d);
                return;
            } else {
                aVarArr2[i].mo23558k(d);
                dArr[0] = this.f25447b[i].mo23549b();
                dArr[1] = this.f25447b[i].mo23550c();
                return;
            }
        }
    }

    /* renamed from: h */
    public double[] mo23548h() {
        return this.f25446a;
    }
}
