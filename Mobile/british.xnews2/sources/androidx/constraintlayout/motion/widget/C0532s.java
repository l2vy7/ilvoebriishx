package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0558a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import p154u.C6162b;

/* renamed from: androidx.constraintlayout.motion.widget.s */
/* compiled from: TimeCycleSplineSet */
public abstract class C0532s {

    /* renamed from: k */
    private static float f2217k = 6.2831855f;

    /* renamed from: a */
    protected C6162b f2218a;

    /* renamed from: b */
    protected int f2219b = 0;

    /* renamed from: c */
    protected int[] f2220c = new int[10];

    /* renamed from: d */
    protected float[][] f2221d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e */
    private int f2222e;

    /* renamed from: f */
    private String f2223f;

    /* renamed from: g */
    private float[] f2224g = new float[3];

    /* renamed from: h */
    protected boolean f2225h = false;

    /* renamed from: i */
    long f2226i;

    /* renamed from: j */
    float f2227j = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    /* compiled from: TimeCycleSplineSet */
    static class C0533a extends C0532s {
        C0533a() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setAlpha(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    /* compiled from: TimeCycleSplineSet */
    static class C0534b extends C0532s {

        /* renamed from: l */
        String f2228l;

        /* renamed from: m */
        SparseArray<C0558a> f2229m;

        /* renamed from: n */
        SparseArray<float[]> f2230n = new SparseArray<>();

        /* renamed from: o */
        float[] f2231o;

        /* renamed from: p */
        float[] f2232p;

        public C0534b(String str, SparseArray<C0558a> sparseArray) {
            this.f2228l = str.split(",")[1];
            this.f2229m = sparseArray;
        }

        /* renamed from: e */
        public void mo2743e(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            this.f2218a.mo23545e((double) f, this.f2231o);
            float[] fArr = this.f2231o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            double d = (double) this.f2227j;
            double d2 = (double) (j - this.f2226i);
            Double.isNaN(d2);
            double d3 = (double) f2;
            Double.isNaN(d3);
            Double.isNaN(d);
            float f4 = (float) ((d + ((d2 * 1.0E-9d) * d3)) % 1.0d);
            this.f2227j = f4;
            this.f2226i = j;
            float a = mo2741a(f4);
            this.f2225h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f2232p;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f2225h;
                float[] fArr3 = this.f2231o;
                this.f2225h = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a) + f3;
                i++;
            }
            this.f2229m.valueAt(0).mo2892i(view, this.f2232p);
            if (f2 != 0.0f) {
                this.f2225h = true;
            }
            return this.f2225h;
        }

        /* renamed from: i */
        public void mo2747i(int i) {
            int size = this.f2229m.size();
            int f = this.f2229m.valueAt(0).mo2891f();
            double[] dArr = new double[size];
            int i2 = f + 2;
            this.f2231o = new float[i2];
            this.f2232p = new float[f];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f2229m.keyAt(i3);
                float[] valueAt = this.f2230n.valueAt(i3);
                double d = (double) keyAt;
                Double.isNaN(d);
                dArr[i3] = d * 0.01d;
                this.f2229m.valueAt(i3).mo2890e(this.f2231o);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f2231o;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][f] = (double) valueAt[0];
                dArr2[i3][f + 1] = (double) valueAt[1];
            }
            this.f2218a = C6162b.m27039a(i, dArr, dArr2);
        }

        /* renamed from: j */
        public void mo2749j(int i, C0558a aVar, float f, int i2, float f2) {
            this.f2229m.append(i, aVar);
            this.f2230n.append(i, new float[]{f, f2});
            this.f2219b = Math.max(this.f2219b, i2);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$c */
    /* compiled from: TimeCycleSplineSet */
    static class C0535c extends C0532s {
        C0535c() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo2742b(f, j, view, eVar));
            }
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$d */
    /* compiled from: TimeCycleSplineSet */
    static class C0536d extends C0532s {
        C0536d() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            return this.f2225h;
        }

        /* renamed from: j */
        public boolean mo2750j(View view, C0479e eVar, float f, long j, double d, double d2) {
            view.setRotation(mo2742b(f, j, view, eVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$e */
    /* compiled from: TimeCycleSplineSet */
    static class C0537e extends C0532s {

        /* renamed from: l */
        boolean f2233l = false;

        C0537e() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(mo2742b(f, j, view, eVar));
            } else if (this.f2233l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f2233l = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(mo2742b(f, j, view, eVar))});
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$f */
    /* compiled from: TimeCycleSplineSet */
    static class C0538f extends C0532s {
        C0538f() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setRotation(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$g */
    /* compiled from: TimeCycleSplineSet */
    static class C0539g extends C0532s {
        C0539g() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setRotationX(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$h */
    /* compiled from: TimeCycleSplineSet */
    static class C0540h extends C0532s {
        C0540h() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setRotationY(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$i */
    /* compiled from: TimeCycleSplineSet */
    static class C0541i extends C0532s {
        C0541i() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setScaleX(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$j */
    /* compiled from: TimeCycleSplineSet */
    static class C0542j extends C0532s {
        C0542j() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setScaleY(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$k */
    /* compiled from: TimeCycleSplineSet */
    private static class C0543k {
        /* renamed from: a */
        static void m2959a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m2960b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        private static int m2960b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2961c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2961c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2961c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$l */
    /* compiled from: TimeCycleSplineSet */
    static class C0544l extends C0532s {
        C0544l() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setTranslationX(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$m */
    /* compiled from: TimeCycleSplineSet */
    static class C0545m extends C0532s {
        C0545m() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            view.setTranslationY(mo2742b(f, j, view, eVar));
            return this.f2225h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$n */
    /* compiled from: TimeCycleSplineSet */
    static class C0546n extends C0532s {
        C0546n() {
        }

        /* renamed from: f */
        public boolean mo2744f(View view, float f, long j, C0479e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2742b(f, j, view, eVar));
            }
            return this.f2225h;
        }
    }

    /* renamed from: c */
    static C0532s m2936c(String str, SparseArray<C0558a> sparseArray) {
        return new C0534b(str, sparseArray);
    }

    /* renamed from: d */
    static C0532s m2937d(String str, long j) {
        C0532s sVar;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                sVar = new C0539g();
                break;
            case 1:
                sVar = new C0540h();
                break;
            case 2:
                sVar = new C0544l();
                break;
            case 3:
                sVar = new C0545m();
                break;
            case 4:
                sVar = new C0546n();
                break;
            case 5:
                sVar = new C0537e();
                break;
            case 6:
                sVar = new C0541i();
                break;
            case 7:
                sVar = new C0542j();
                break;
            case 8:
                sVar = new C0538f();
                break;
            case 9:
                sVar = new C0535c();
                break;
            case 10:
                sVar = new C0536d();
                break;
            case 11:
                sVar = new C0533a();
                break;
            default:
                return null;
        }
        sVar.mo2745g(j);
        return sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo2741a(float f) {
        float abs;
        switch (this.f2219b) {
            case 1:
                return Math.signum(f * f2217k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f2217k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f2217k));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public float mo2742b(float f, long j, View view, C0479e eVar) {
        long j2 = j;
        View view2 = view;
        C0479e eVar2 = eVar;
        this.f2218a.mo23545e((double) f, this.f2224g);
        float[] fArr = this.f2224g;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f2225h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f2227j)) {
            float a = eVar2.mo2620a(view2, this.f2223f, 0);
            this.f2227j = a;
            if (Float.isNaN(a)) {
                this.f2227j = 0.0f;
            }
        }
        double d = (double) this.f2227j;
        double d2 = (double) (j2 - this.f2226i);
        Double.isNaN(d2);
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f3 = (float) ((d + ((d2 * 1.0E-9d) * d3)) % 1.0d);
        this.f2227j = f3;
        eVar2.mo2621b(view2, this.f2223f, 0, f3);
        this.f2226i = j2;
        float f4 = this.f2224g[0];
        float a2 = (mo2741a(this.f2227j) * f4) + this.f2224g[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f2225h = z;
        return a2;
    }

    /* renamed from: e */
    public void mo2743e(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f2220c;
        int i3 = this.f2222e;
        iArr[i3] = i;
        float[][] fArr = this.f2221d;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f2219b = Math.max(this.f2219b, i2);
        this.f2222e++;
    }

    /* renamed from: f */
    public abstract boolean mo2744f(View view, float f, long j, C0479e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2745g(long j) {
        this.f2226i = j;
    }

    /* renamed from: h */
    public void mo2746h(String str) {
        this.f2223f = str;
    }

    /* renamed from: i */
    public void mo2747i(int i) {
        int i2 = this.f2222e;
        if (i2 == 0) {
            Log.e("SplineSet", "Error no points added to " + this.f2223f);
            return;
        }
        C0543k.m2959a(this.f2220c, this.f2221d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f2220c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i4;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f2222e; i6++) {
            if (i6 > 0) {
                int[] iArr3 = this.f2220c;
                if (iArr3[i6] == iArr3[i6 - 1]) {
                }
            }
            double d = (double) this.f2220c[i6];
            Double.isNaN(d);
            dArr[i5] = d * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.f2221d;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.f2218a = C6162b.m27039a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f2223f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f2222e; i++) {
            str = str + "[" + this.f2220c[i] + " , " + decimalFormat.format(this.f2221d[i]) + "] ";
        }
        return str;
    }
}
