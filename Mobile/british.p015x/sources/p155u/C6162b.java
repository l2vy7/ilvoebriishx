package p155u;

/* renamed from: u.b */
/* compiled from: CurveFit */
public abstract class C6162b {

    /* renamed from: u.b$a */
    /* compiled from: CurveFit */
    static class C6163a extends C6162b {

        /* renamed from: a */
        double f25467a;

        /* renamed from: b */
        double[] f25468b;

        C6163a(double d, double[] dArr) {
            this.f25467a = d;
            this.f25468b = dArr;
        }

        /* renamed from: c */
        public double mo23543c(double d, int i) {
            return this.f25468b[i];
        }

        /* renamed from: d */
        public void mo23544d(double d, double[] dArr) {
            double[] dArr2 = this.f25468b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: e */
        public void mo23545e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f25468b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public double mo23546f(double d, int i) {
            return 0.0d;
        }

        /* renamed from: g */
        public void mo23547g(double d, double[] dArr) {
            for (int i = 0; i < this.f25468b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: h */
        public double[] mo23548h() {
            return new double[]{this.f25467a};
        }
    }

    /* renamed from: a */
    public static C6162b m27039a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C6167e(dArr, dArr2);
        }
        if (i != 2) {
            return new C6166d(dArr, dArr2);
        }
        return new C6163a(dArr[0], dArr2[0]);
    }

    /* renamed from: b */
    public static C6162b m27040b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C6160a(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo23543c(double d, int i);

    /* renamed from: d */
    public abstract void mo23544d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo23545e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo23546f(double d, int i);

    /* renamed from: g */
    public abstract void mo23547g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo23548h();
}
