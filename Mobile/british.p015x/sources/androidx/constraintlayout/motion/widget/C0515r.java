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
import java.util.Arrays;
import p155u.C6162b;

/* renamed from: androidx.constraintlayout.motion.widget.r */
/* compiled from: SplineSet */
public abstract class C0515r {

    /* renamed from: a */
    protected C6162b f2208a;

    /* renamed from: b */
    protected int[] f2209b = new int[10];

    /* renamed from: c */
    protected float[] f2210c = new float[10];

    /* renamed from: d */
    private int f2211d;

    /* renamed from: e */
    private String f2212e;

    /* renamed from: androidx.constraintlayout.motion.widget.r$a */
    /* compiled from: SplineSet */
    static class C0516a extends C0515r {
        C0516a() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setAlpha(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$b */
    /* compiled from: SplineSet */
    static class C0517b extends C0515r {

        /* renamed from: f */
        String f2213f;

        /* renamed from: g */
        SparseArray<C0558a> f2214g;

        /* renamed from: h */
        float[] f2215h;

        public C0517b(String str, SparseArray<C0558a> sparseArray) {
            this.f2213f = str.split(",")[1];
            this.f2214g = sparseArray;
        }

        /* renamed from: e */
        public void mo2734e(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            this.f2208a.mo23545e((double) f, this.f2215h);
            this.f2214g.valueAt(0).mo2892i(view, this.f2215h);
        }

        /* renamed from: h */
        public void mo2737h(int i) {
            int size = this.f2214g.size();
            int f = this.f2214g.valueAt(0).mo2891f();
            double[] dArr = new double[size];
            this.f2215h = new float[f];
            int[] iArr = new int[2];
            iArr[1] = f;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                double keyAt = (double) this.f2214g.keyAt(i2);
                Double.isNaN(keyAt);
                dArr[i2] = keyAt * 0.01d;
                this.f2214g.valueAt(i2).mo2890e(this.f2215h);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f2215h;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f2208a = C6162b.m27039a(i, dArr, dArr2);
        }

        /* renamed from: i */
        public void mo2739i(int i, C0558a aVar) {
            this.f2214g.append(i, aVar);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$c */
    /* compiled from: SplineSet */
    static class C0518c extends C0515r {
        C0518c() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo2732a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$d */
    /* compiled from: SplineSet */
    static class C0519d extends C0515r {
        C0519d() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
        }

        /* renamed from: i */
        public void mo2740i(View view, float f, double d, double d2) {
            view.setRotation(mo2732a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$e */
    /* compiled from: SplineSet */
    static class C0520e extends C0515r {
        C0520e() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setPivotX(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$f */
    /* compiled from: SplineSet */
    static class C0521f extends C0515r {
        C0521f() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setPivotY(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$g */
    /* compiled from: SplineSet */
    static class C0522g extends C0515r {

        /* renamed from: f */
        boolean f2216f = false;

        C0522g() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2732a(f));
            } else if (!this.f2216f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f2216f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2732a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$h */
    /* compiled from: SplineSet */
    static class C0523h extends C0515r {
        C0523h() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setRotation(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$i */
    /* compiled from: SplineSet */
    static class C0524i extends C0515r {
        C0524i() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setRotationX(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$j */
    /* compiled from: SplineSet */
    static class C0525j extends C0515r {
        C0525j() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setRotationY(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$k */
    /* compiled from: SplineSet */
    static class C0526k extends C0515r {
        C0526k() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setScaleX(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$l */
    /* compiled from: SplineSet */
    static class C0527l extends C0515r {
        C0527l() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setScaleY(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$m */
    /* compiled from: SplineSet */
    private static class C0528m {
        /* renamed from: a */
        static void m2930a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m2931b(iArr, fArr, i5, i6);
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
        private static int m2931b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2932c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2932c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2932c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$n */
    /* compiled from: SplineSet */
    static class C0529n extends C0515r {
        C0529n() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setTranslationX(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$o */
    /* compiled from: SplineSet */
    static class C0530o extends C0515r {
        C0530o() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            view.setTranslationY(mo2732a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$p */
    /* compiled from: SplineSet */
    static class C0531p extends C0515r {
        C0531p() {
        }

        /* renamed from: f */
        public void mo2735f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2732a(f));
            }
        }
    }

    /* renamed from: c */
    static C0515r m2906c(String str, SparseArray<C0558a> sparseArray) {
        return new C0517b(str, sparseArray);
    }

    /* renamed from: d */
    static C0515r m2907d(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0524i();
            case 1:
                return new C0525j();
            case 2:
                return new C0529n();
            case 3:
                return new C0530o();
            case 4:
                return new C0531p();
            case 5:
                return new C0522g();
            case 6:
                return new C0526k();
            case 7:
                return new C0527l();
            case 8:
                return new C0516a();
            case 9:
                return new C0520e();
            case 10:
                return new C0521f();
            case 11:
                return new C0523h();
            case 12:
                return new C0518c();
            case 13:
                return new C0519d();
            case 14:
                return new C0516a();
            case 15:
                return new C0516a();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public float mo2732a(float f) {
        return (float) this.f2208a.mo23543c((double) f, 0);
    }

    /* renamed from: b */
    public float mo2733b(float f) {
        return (float) this.f2208a.mo23546f((double) f, 0);
    }

    /* renamed from: e */
    public void mo2734e(int i, float f) {
        int[] iArr = this.f2209b;
        if (iArr.length < this.f2211d + 1) {
            this.f2209b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f2210c;
            this.f2210c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f2209b;
        int i2 = this.f2211d;
        iArr2[i2] = i;
        this.f2210c[i2] = f;
        this.f2211d = i2 + 1;
    }

    /* renamed from: f */
    public abstract void mo2735f(View view, float f);

    /* renamed from: g */
    public void mo2736g(String str) {
        this.f2212e = str;
    }

    /* renamed from: h */
    public void mo2737h(int i) {
        int i2 = this.f2211d;
        if (i2 != 0) {
            C0528m.m2930a(this.f2209b, this.f2210c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f2211d; i4++) {
                int[] iArr = this.f2209b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i3;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2211d; i6++) {
                if (i6 > 0) {
                    int[] iArr3 = this.f2209b;
                    if (iArr3[i6] == iArr3[i6 - 1]) {
                    }
                }
                double d = (double) this.f2209b[i6];
                Double.isNaN(d);
                dArr[i5] = d * 0.01d;
                dArr2[i5][0] = (double) this.f2210c[i6];
                i5++;
            }
            this.f2208a = C6162b.m27039a(i, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f2212e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f2211d; i++) {
            str = str + "[" + this.f2209b[i] + " , " + decimalFormat.format((double) this.f2210c[i]) + "] ";
        }
        return str;
    }
}
