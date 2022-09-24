package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0558a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p154u.C6162b;
import p154u.C6168f;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* compiled from: KeyCycleOscillator */
public abstract class C0482g {

    /* renamed from: a */
    private C6162b f2011a;

    /* renamed from: b */
    private C0486d f2012b;

    /* renamed from: c */
    protected C0558a f2013c;

    /* renamed from: d */
    private String f2014d;

    /* renamed from: e */
    private int f2015e = 0;

    /* renamed from: f */
    public int f2016f = 0;

    /* renamed from: g */
    ArrayList<C0498p> f2017g = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    /* compiled from: KeyCycleOscillator */
    class C0483a implements Comparator<C0498p> {
        C0483a() {
        }

        /* renamed from: a */
        public int compare(C0498p pVar, C0498p pVar2) {
            return Integer.compare(pVar.f2034a, pVar2.f2034a);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$b */
    /* compiled from: KeyCycleOscillator */
    static class C0484b extends C0482g {
        C0484b() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setAlpha(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$c */
    /* compiled from: KeyCycleOscillator */
    static class C0485c extends C0482g {

        /* renamed from: h */
        float[] f2019h = new float[1];

        C0485c() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            this.f2019h[0] = mo2624a(f);
            this.f2013c.mo2892i(view, this.f2019h);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$d */
    /* compiled from: KeyCycleOscillator */
    static class C0486d {

        /* renamed from: a */
        private final int f2020a;

        /* renamed from: b */
        C6168f f2021b = new C6168f();

        /* renamed from: c */
        float[] f2022c;

        /* renamed from: d */
        double[] f2023d;

        /* renamed from: e */
        float[] f2024e;

        /* renamed from: f */
        float[] f2025f;

        /* renamed from: g */
        float[] f2026g;

        /* renamed from: h */
        int f2027h;

        /* renamed from: i */
        C6162b f2028i;

        /* renamed from: j */
        double[] f2029j;

        /* renamed from: k */
        double[] f2030k;

        /* renamed from: l */
        float f2031l;

        /* renamed from: m */
        public HashMap<String, C0558a> f2032m = new HashMap<>();

        C0486d(int i, int i2, int i3) {
            this.f2027h = i;
            this.f2020a = i2;
            this.f2021b.mo23568g(i);
            this.f2022c = new float[i3];
            this.f2023d = new double[i3];
            this.f2024e = new float[i3];
            this.f2025f = new float[i3];
            this.f2026g = new float[i3];
        }

        /* renamed from: a */
        public double mo2635a(float f) {
            C6162b bVar = this.f2028i;
            if (bVar != null) {
                double d = (double) f;
                bVar.mo23547g(d, this.f2030k);
                this.f2028i.mo23544d(d, this.f2029j);
            } else {
                double[] dArr = this.f2030k;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = (double) f;
            double e = this.f2021b.mo23566e(d2);
            double d3 = this.f2021b.mo23565d(d2);
            double[] dArr2 = this.f2030k;
            return dArr2[0] + (e * dArr2[1]) + (d3 * this.f2029j[1]);
        }

        /* renamed from: b */
        public double mo2636b(float f) {
            C6162b bVar = this.f2028i;
            if (bVar != null) {
                bVar.mo23544d((double) f, this.f2029j);
            } else {
                double[] dArr = this.f2029j;
                dArr[0] = (double) this.f2025f[0];
                dArr[1] = (double) this.f2022c[0];
            }
            return this.f2029j[0] + (this.f2021b.mo23566e((double) f) * this.f2029j[1]);
        }

        /* renamed from: c */
        public void mo2637c(int i, int i2, float f, float f2, float f3) {
            double[] dArr = this.f2023d;
            double d = (double) i2;
            Double.isNaN(d);
            dArr[i] = d / 100.0d;
            this.f2024e[i] = f;
            this.f2025f[i] = f2;
            this.f2022c[i] = f3;
        }

        /* renamed from: d */
        public void mo2638d(float f) {
            this.f2031l = f;
            int length = this.f2023d.length;
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.f2022c;
            this.f2029j = new double[(fArr.length + 1)];
            this.f2030k = new double[(fArr.length + 1)];
            if (this.f2023d[0] > 0.0d) {
                this.f2021b.mo23562a(0.0d, this.f2024e[0]);
            }
            double[] dArr2 = this.f2023d;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f2021b.mo23562a(1.0d, this.f2024e[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.f2025f[i];
                int i2 = 0;
                while (true) {
                    float[] fArr2 = this.f2022c;
                    if (i2 >= fArr2.length) {
                        break;
                    }
                    dArr[i2][1] = (double) fArr2[i2];
                    i2++;
                }
                this.f2021b.mo23562a(this.f2023d[i], this.f2024e[i]);
            }
            this.f2021b.mo23567f();
            double[] dArr3 = this.f2023d;
            if (dArr3.length > 1) {
                this.f2028i = C6162b.m27039a(0, dArr3, dArr);
            } else {
                this.f2028i = null;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$e */
    /* compiled from: KeyCycleOscillator */
    static class C0487e extends C0482g {
        C0487e() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo2624a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$f */
    /* compiled from: KeyCycleOscillator */
    static class C0488f extends C0482g {
        C0488f() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
        }

        /* renamed from: j */
        public void mo2639j(View view, float f, double d, double d2) {
            view.setRotation(mo2624a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$g */
    /* compiled from: KeyCycleOscillator */
    static class C0489g extends C0482g {

        /* renamed from: h */
        boolean f2033h = false;

        C0489g() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2624a(f));
            } else if (!this.f2033h) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f2033h = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2624a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$h */
    /* compiled from: KeyCycleOscillator */
    static class C0490h extends C0482g {
        C0490h() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setRotation(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$i */
    /* compiled from: KeyCycleOscillator */
    static class C0491i extends C0482g {
        C0491i() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setRotationX(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$j */
    /* compiled from: KeyCycleOscillator */
    static class C0492j extends C0482g {
        C0492j() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setRotationY(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$k */
    /* compiled from: KeyCycleOscillator */
    static class C0493k extends C0482g {
        C0493k() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setScaleX(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$l */
    /* compiled from: KeyCycleOscillator */
    static class C0494l extends C0482g {
        C0494l() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setScaleY(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$m */
    /* compiled from: KeyCycleOscillator */
    static class C0495m extends C0482g {
        C0495m() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setTranslationX(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$n */
    /* compiled from: KeyCycleOscillator */
    static class C0496n extends C0482g {
        C0496n() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            view.setTranslationY(mo2624a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$o */
    /* compiled from: KeyCycleOscillator */
    static class C0497o extends C0482g {
        C0497o() {
        }

        /* renamed from: f */
        public void mo2628f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2624a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$p */
    /* compiled from: KeyCycleOscillator */
    static class C0498p {

        /* renamed from: a */
        int f2034a;

        /* renamed from: b */
        float f2035b;

        /* renamed from: c */
        float f2036c;

        /* renamed from: d */
        float f2037d;

        public C0498p(int i, float f, float f2, float f3) {
            this.f2034a = i;
            this.f2035b = f3;
            this.f2036c = f2;
            this.f2037d = f;
        }
    }

    /* renamed from: c */
    static C0482g m2689c(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C0485c();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0491i();
            case 1:
                return new C0492j();
            case 2:
                return new C0495m();
            case 3:
                return new C0496n();
            case 4:
                return new C0497o();
            case 5:
                return new C0489g();
            case 6:
                return new C0493k();
            case 7:
                return new C0494l();
            case 8:
                return new C0484b();
            case 9:
                return new C0490h();
            case 10:
                return new C0487e();
            case 11:
                return new C0488f();
            case 12:
                return new C0484b();
            case 13:
                return new C0484b();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public float mo2624a(float f) {
        return (float) this.f2012b.mo2636b(f);
    }

    /* renamed from: b */
    public float mo2625b(float f) {
        return (float) this.f2012b.mo2635a(f);
    }

    /* renamed from: d */
    public void mo2626d(int i, int i2, int i3, float f, float f2, float f3) {
        this.f2017g.add(new C0498p(i, f, f2, f3));
        if (i3 != -1) {
            this.f2016f = i3;
        }
        this.f2015e = i2;
    }

    /* renamed from: e */
    public void mo2627e(int i, int i2, int i3, float f, float f2, float f3, C0558a aVar) {
        this.f2017g.add(new C0498p(i, f, f2, f3));
        if (i3 != -1) {
            this.f2016f = i3;
        }
        this.f2015e = i2;
        this.f2013c = aVar;
    }

    /* renamed from: f */
    public abstract void mo2628f(View view, float f);

    /* renamed from: g */
    public void mo2629g(String str) {
        this.f2014d = str;
    }

    @TargetApi(19)
    /* renamed from: h */
    public void mo2630h(float f) {
        int size = this.f2017g.size();
        if (size != 0) {
            Collections.sort(this.f2017g, new C0483a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.f2012b = new C0486d(this.f2015e, this.f2016f, size);
            Iterator<C0498p> it = this.f2017g.iterator();
            int i = 0;
            while (it.hasNext()) {
                C0498p next = it.next();
                float f2 = next.f2037d;
                double d = (double) f2;
                Double.isNaN(d);
                dArr[i] = d * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.f2035b;
                dArr3[0] = (double) f3;
                double[] dArr4 = dArr2[i];
                float f4 = next.f2036c;
                dArr4[1] = (double) f4;
                this.f2012b.mo2637c(i, next.f2034a, f2, f4, f3);
                i++;
            }
            this.f2012b.mo2638d(f);
            this.f2011a = C6162b.m27039a(0, dArr, dArr2);
        }
    }

    /* renamed from: i */
    public boolean mo2631i() {
        return this.f2016f == 1;
    }

    public String toString() {
        String str = this.f2014d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C0498p> it = this.f2017g.iterator();
        while (it.hasNext()) {
            C0498p next = it.next();
            str = str + "[" + next.f2034a + " , " + decimalFormat.format((double) next.f2035b) + "] ";
        }
        return str;
    }
}
