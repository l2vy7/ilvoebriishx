package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0511q;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0561b;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.C0572f;
import androidx.constraintlayout.widget.C0573g;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p111m0.C5715m;
import p155u.C6169g;
import p166w.C6240a;
import p166w.C6246e;
import p166w.C6249f;
import p166w.C6250g;
import p166w.C6252h;
import p166w.C6254i;
import p166w.C6255j;
import p166w.C6257l;

public class MotionLayout extends ConstraintLayout implements C5715m {

    /* renamed from: Z0 */
    public static boolean f1843Z0;

    /* renamed from: A */
    float f1844A = 0.0f;

    /* renamed from: A0 */
    private ArrayList<MotionHelper> f1845A0 = null;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f1846B = -1;

    /* renamed from: B0 */
    private ArrayList<C0472i> f1847B0 = null;

    /* renamed from: C */
    int f1848C = -1;

    /* renamed from: C0 */
    private int f1849C0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f1850D = -1;

    /* renamed from: D0 */
    private long f1851D0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f1852E = 0;

    /* renamed from: E0 */
    private float f1853E0 = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f1854F = 0;

    /* renamed from: F0 */
    private int f1855F0 = 0;

    /* renamed from: G */
    private boolean f1856G = true;

    /* renamed from: G0 */
    private float f1857G0 = 0.0f;

    /* renamed from: H */
    HashMap<View, C0508n> f1858H = new HashMap<>();

    /* renamed from: H0 */
    boolean f1859H0 = false;

    /* renamed from: I */
    private long f1860I = 0;

    /* renamed from: I0 */
    protected boolean f1861I0 = false;

    /* renamed from: J */
    private float f1862J = 1.0f;

    /* renamed from: J0 */
    int f1863J0;

    /* renamed from: K */
    float f1864K = 0.0f;

    /* renamed from: K0 */
    int f1865K0;

    /* renamed from: L */
    float f1866L = 0.0f;

    /* renamed from: L0 */
    int f1867L0;

    /* renamed from: M */
    private long f1868M;

    /* renamed from: M0 */
    int f1869M0;

    /* renamed from: N */
    float f1870N = 0.0f;

    /* renamed from: N0 */
    int f1871N0;

    /* renamed from: O */
    private boolean f1872O;

    /* renamed from: O0 */
    int f1873O0;

    /* renamed from: P */
    boolean f1874P = false;

    /* renamed from: P0 */
    float f1875P0;

    /* renamed from: Q */
    boolean f1876Q = false;

    /* renamed from: Q0 */
    private C0479e f1877Q0 = new C0479e();

    /* renamed from: R */
    private C0472i f1878R;

    /* renamed from: R0 */
    private boolean f1879R0 = false;

    /* renamed from: S */
    private float f1880S;

    /* renamed from: S0 */
    private C0471h f1881S0;

    /* renamed from: T */
    private float f1882T;

    /* renamed from: T0 */
    C0473j f1883T0 = C0473j.UNDEFINED;

    /* renamed from: U */
    int f1884U = 0;

    /* renamed from: U0 */
    C0468e f1885U0 = new C0468e();

    /* renamed from: V */
    C0467d f1886V;

    /* renamed from: V0 */
    private boolean f1887V0 = false;

    /* renamed from: W */
    private boolean f1888W = false;

    /* renamed from: W0 */
    private RectF f1889W0 = new RectF();

    /* renamed from: X0 */
    private View f1890X0 = null;

    /* renamed from: Y0 */
    ArrayList<Integer> f1891Y0 = new ArrayList<>();

    /* renamed from: l0 */
    private C6169g f1892l0 = new C6169g();

    /* renamed from: m0 */
    private C0466c f1893m0 = new C0466c();

    /* renamed from: n0 */
    private C0475b f1894n0;

    /* renamed from: o0 */
    boolean f1895o0 = true;

    /* renamed from: p0 */
    int f1896p0;

    /* renamed from: q0 */
    int f1897q0;

    /* renamed from: r0 */
    int f1898r0;

    /* renamed from: s0 */
    int f1899s0;

    /* renamed from: t0 */
    boolean f1900t0 = false;

    /* renamed from: u0 */
    float f1901u0;

    /* renamed from: v0 */
    float f1902v0;

    /* renamed from: w0 */
    long f1903w0;

    /* renamed from: x0 */
    float f1904x0;

    /* renamed from: y */
    C0511q f1905y;

    /* renamed from: y0 */
    private boolean f1906y0 = false;

    /* renamed from: z */
    Interpolator f1907z;

    /* renamed from: z0 */
    private ArrayList<MotionHelper> f1908z0 = null;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    class C0464a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1909b;

        C0464a(View view) {
            this.f1909b = view;
        }

        public void run() {
            this.f1909b.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    static /* synthetic */ class C0465b {

        /* renamed from: a */
        static final /* synthetic */ int[] f1911a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$j[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0473j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1911a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0473j.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1911a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0473j.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1911a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0473j.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1911a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0473j.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0465b.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    class C0466c extends C0509o {

        /* renamed from: a */
        float f1912a = 0.0f;

        /* renamed from: b */
        float f1913b = 0.0f;

        /* renamed from: c */
        float f1914c;

        C0466c() {
        }

        /* renamed from: a */
        public float mo2588a() {
            return MotionLayout.this.f1844A;
        }

        /* renamed from: b */
        public void mo2589b(float f, float f2, float f3) {
            this.f1912a = f;
            this.f1913b = f2;
            this.f1914c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f1912a;
            if (f4 > 0.0f) {
                float f5 = this.f1914c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f1844A = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f1913b;
            } else {
                float f6 = this.f1914c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f1844A = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f1913b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    private class C0467d {

        /* renamed from: a */
        float[] f1916a;

        /* renamed from: b */
        int[] f1917b;

        /* renamed from: c */
        float[] f1918c;

        /* renamed from: d */
        Path f1919d;

        /* renamed from: e */
        Paint f1920e;

        /* renamed from: f */
        Paint f1921f;

        /* renamed from: g */
        Paint f1922g;

        /* renamed from: h */
        Paint f1923h;

        /* renamed from: i */
        Paint f1924i;

        /* renamed from: j */
        private float[] f1925j;

        /* renamed from: k */
        final int f1926k = -21965;

        /* renamed from: l */
        final int f1927l = -2067046;

        /* renamed from: m */
        final int f1928m = -13391360;

        /* renamed from: n */
        final int f1929n = 1996488704;

        /* renamed from: o */
        final int f1930o = 10;

        /* renamed from: p */
        DashPathEffect f1931p;

        /* renamed from: q */
        int f1932q;

        /* renamed from: r */
        Rect f1933r = new Rect();

        /* renamed from: s */
        boolean f1934s = false;

        /* renamed from: t */
        int f1935t = 1;

        public C0467d() {
            Paint paint = new Paint();
            this.f1920e = paint;
            paint.setAntiAlias(true);
            this.f1920e.setColor(-21965);
            this.f1920e.setStrokeWidth(2.0f);
            this.f1920e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1921f = paint2;
            paint2.setAntiAlias(true);
            this.f1921f.setColor(-2067046);
            this.f1921f.setStrokeWidth(2.0f);
            this.f1921f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1922g = paint3;
            paint3.setAntiAlias(true);
            this.f1922g.setColor(-13391360);
            this.f1922g.setStrokeWidth(2.0f);
            this.f1922g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1923h = paint4;
            paint4.setAntiAlias(true);
            this.f1923h.setColor(-13391360);
            this.f1923h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1925j = new float[8];
            Paint paint5 = new Paint();
            this.f1924i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1931p = dashPathEffect;
            this.f1922g.setPathEffect(dashPathEffect);
            this.f1918c = new float[100];
            this.f1917b = new int[50];
            if (this.f1934s) {
                this.f1920e.setStrokeWidth(8.0f);
                this.f1924i.setStrokeWidth(8.0f);
                this.f1921f.setStrokeWidth(8.0f);
                this.f1935t = 4;
            }
        }

        /* renamed from: c */
        private void m2555c(Canvas canvas) {
            canvas.drawLines(this.f1916a, this.f1920e);
        }

        /* renamed from: d */
        private void m2556d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f1932q; i++) {
                int[] iArr = this.f1917b;
                if (iArr[i] == 1) {
                    z = true;
                }
                if (iArr[i] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                m2559g(canvas);
            }
            if (z2) {
                m2557e(canvas);
            }
        }

        /* renamed from: e */
        private void m2557e(Canvas canvas) {
            float[] fArr = this.f1916a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f1922g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f1922g);
        }

        /* renamed from: f */
        private void m2558f(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f1916a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            double abs = (double) ((min2 * 100.0f) / Math.abs(f5 - f3));
            Double.isNaN(abs);
            sb.append(((float) ((int) (abs + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2593l(sb2, this.f1923h);
            canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.f1933r.width() / 2))) + min, f2 - 20.0f, this.f1923h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f1922g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            double abs2 = (double) ((max2 * 100.0f) / Math.abs(f6 - f4));
            Double.isNaN(abs2);
            sb3.append(((float) ((int) (abs2 + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2593l(sb4, this.f1923h);
            canvas2.drawText(sb4, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f1933r.height() / 2))), this.f1923h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f1922g);
        }

        /* renamed from: g */
        private void m2559g(Canvas canvas) {
            float[] fArr = this.f1916a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1922g);
        }

        /* renamed from: h */
        private void m2560h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1916a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            mo2593l(str, this.f1923h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f1933r.width() / 2)), -20.0f, this.f1923h);
            canvas.drawLine(f, f2, f10, f11, this.f1922g);
        }

        /* renamed from: i */
        private void m2561i(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            double width = (double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)));
            Double.isNaN(width);
            sb.append(((float) ((int) (width + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2593l(sb2, this.f1923h);
            canvas2.drawText(sb2, ((f / 2.0f) - ((float) (this.f1933r.width() / 2))) + 0.0f, f2 - 20.0f, this.f1923h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f1922g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            double height = (double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)));
            Double.isNaN(height);
            sb3.append(((float) ((int) (height + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2593l(sb4, this.f1923h);
            canvas2.drawText(sb4, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f1933r.height() / 2))), this.f1923h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f1922g);
        }

        /* renamed from: j */
        private void m2562j(Canvas canvas, C0508n nVar) {
            this.f1919d.reset();
            for (int i = 0; i <= 50; i++) {
                nVar.mo2656e(((float) i) / ((float) 50), this.f1925j, 0);
                Path path = this.f1919d;
                float[] fArr = this.f1925j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1919d;
                float[] fArr2 = this.f1925j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1919d;
                float[] fArr3 = this.f1925j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1919d;
                float[] fArr4 = this.f1925j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1919d.close();
            }
            this.f1920e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1919d, this.f1920e);
            canvas.translate(-2.0f, -2.0f);
            this.f1920e.setColor(-65536);
            canvas.drawPath(this.f1919d, this.f1920e);
        }

        /* renamed from: k */
        private void m2563k(Canvas canvas, int i, int i2, C0508n nVar) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            Canvas canvas2 = canvas;
            int i6 = i;
            C0508n nVar2 = nVar;
            View view = nVar2.f2124a;
            if (view != null) {
                i4 = view.getWidth();
                i3 = nVar2.f2124a.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i7 = 1; i7 < i2 - 1; i7++) {
                if (i6 != 4 || this.f1917b[i7 - 1] != 0) {
                    float[] fArr = this.f1918c;
                    int i8 = i7 * 2;
                    float f3 = fArr[i8];
                    float f4 = fArr[i8 + 1];
                    this.f1919d.reset();
                    this.f1919d.moveTo(f3, f4 + 10.0f);
                    this.f1919d.lineTo(f3 + 10.0f, f4);
                    this.f1919d.lineTo(f3, f4 - 10.0f);
                    this.f1919d.lineTo(f3 - 10.0f, f4);
                    this.f1919d.close();
                    int i9 = i7 - 1;
                    nVar2.mo2661k(i9);
                    if (i6 == 4) {
                        int[] iArr = this.f1917b;
                        if (iArr[i9] == 1) {
                            m2560h(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i9] == 2) {
                            m2558f(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i9] == 3) {
                            i5 = 3;
                            f2 = f4;
                            f = f3;
                            m2561i(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f1919d, this.f1924i);
                        }
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                        canvas2.drawPath(this.f1919d, this.f1924i);
                    } else {
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                    }
                    if (i6 == 2) {
                        m2560h(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == i5) {
                        m2558f(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == 6) {
                        m2561i(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f1919d, this.f1924i);
                }
            }
            float[] fArr2 = this.f1916a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1921f);
                float[] fArr3 = this.f1916a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1921f);
            }
        }

        /* renamed from: a */
        public void mo2591a(Canvas canvas, HashMap<View, C0508n> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1850D) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f1923h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f1920e);
                }
                for (C0508n next : hashMap.values()) {
                    int h = next.mo2658h();
                    if (i2 > 0 && h == 0) {
                        h = 1;
                    }
                    if (h != 0) {
                        this.f1932q = next.mo2654c(this.f1918c, this.f1917b);
                        if (h >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f1916a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f1916a = new float[(i3 * 2)];
                                this.f1919d = new Path();
                            }
                            int i4 = this.f1935t;
                            canvas.translate((float) i4, (float) i4);
                            this.f1920e.setColor(1996488704);
                            this.f1924i.setColor(1996488704);
                            this.f1921f.setColor(1996488704);
                            this.f1922g.setColor(1996488704);
                            next.mo2655d(this.f1916a, i3);
                            mo2592b(canvas, h, this.f1932q, next);
                            this.f1920e.setColor(-21965);
                            this.f1921f.setColor(-2067046);
                            this.f1924i.setColor(-2067046);
                            this.f1922g.setColor(-13391360);
                            int i5 = this.f1935t;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo2592b(canvas, h, this.f1932q, next);
                            if (h == 5) {
                                m2562j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void mo2592b(Canvas canvas, int i, int i2, C0508n nVar) {
            if (i == 4) {
                m2556d(canvas);
            }
            if (i == 2) {
                m2559g(canvas);
            }
            if (i == 3) {
                m2557e(canvas);
            }
            m2555c(canvas);
            m2563k(canvas, i, i2, nVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2593l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1933r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    class C0468e {

        /* renamed from: a */
        C6249f f1937a = new C6249f();

        /* renamed from: b */
        C6249f f1938b = new C6249f();

        /* renamed from: c */
        C0564c f1939c = null;

        /* renamed from: d */
        C0564c f1940d = null;

        /* renamed from: e */
        int f1941e;

        /* renamed from: f */
        int f1942f;

        C0468e() {
        }

        /* renamed from: i */
        private void m2567i(C6249f fVar, C0564c cVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            Iterator<C6246e> it = fVar.mo23941L0().iterator();
            while (it.hasNext()) {
                C6246e next = it.next();
                sparseArray.put(((View) next.mo23843r()).getId(), next);
            }
            Iterator<C6246e> it2 = fVar.mo23941L0().iterator();
            while (it2.hasNext()) {
                C6246e next2 = it2.next();
                View view = (View) next2.mo23843r();
                cVar.mo2907g(view.getId(), layoutParams);
                next2.mo23792F0(cVar.mo2919v(view.getId()));
                next2.mo23827i0(cVar.mo2914q(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.mo2905e((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo2824u();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.mo2826c(false, view, next2, layoutParams, sparseArray);
                if (cVar.mo2918u(view.getId()) == 1) {
                    next2.mo23790E0(view.getVisibility());
                } else {
                    next2.mo23790E0(cVar.mo2917t(view.getId()));
                }
            }
            Iterator<C6246e> it3 = fVar.mo23941L0().iterator();
            while (it3.hasNext()) {
                C6246e next3 = it3.next();
                if (next3 instanceof C6257l) {
                    C6254i iVar = (C6254i) next3;
                    ((ConstraintHelper) next3.mo23843r()).mo2823t(fVar, iVar, sparseArray);
                    ((C6257l) iVar).mo23922M0();
                }
            }
        }

        /* renamed from: a */
        public void mo2594a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f1858H.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.f1858H.put(childAt, new C0508n(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C0508n nVar = MotionLayout.this.f1858H.get(childAt2);
                if (nVar != null) {
                    if (this.f1939c != null) {
                        C6246e c = mo2596c(this.f1937a, childAt2);
                        if (c != null) {
                            nVar.mo2667t(c, this.f1939c);
                        } else if (MotionLayout.this.f1884U != 0) {
                            Log.e("MotionLayout", C0474a.m2599a() + "no widget for  " + C0474a.m2601c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f1940d != null) {
                        C6246e c2 = mo2596c(this.f1938b, childAt2);
                        if (c2 != null) {
                            nVar.mo2664q(c2, this.f1940d);
                        } else if (MotionLayout.this.f1884U != 0) {
                            Log.e("MotionLayout", C0474a.m2599a() + "no widget for  " + C0474a.m2601c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2595b(C6249f fVar, C6249f fVar2) {
            C6246e eVar;
            ArrayList<C6246e> L0 = fVar.mo23941L0();
            HashMap hashMap = new HashMap();
            hashMap.put(fVar, fVar2);
            fVar2.mo23941L0().clear();
            fVar2.mo23763l(fVar, hashMap);
            Iterator<C6246e> it = L0.iterator();
            while (it.hasNext()) {
                C6246e next = it.next();
                if (next instanceof C6240a) {
                    eVar = new C6240a();
                } else if (next instanceof C6252h) {
                    eVar = new C6252h();
                } else if (next instanceof C6250g) {
                    eVar = new C6250g();
                } else if (next instanceof C6254i) {
                    eVar = new C6255j();
                } else {
                    eVar = new C6246e();
                }
                fVar2.mo23944c(eVar);
                hashMap.put(next, eVar);
            }
            Iterator<C6246e> it2 = L0.iterator();
            while (it2.hasNext()) {
                C6246e next2 = it2.next();
                ((C6246e) hashMap.get(next2)).mo23763l(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6246e mo2596c(C6249f fVar, View view) {
            if (fVar.mo23843r() == view) {
                return fVar;
            }
            ArrayList<C6246e> L0 = fVar.mo23941L0();
            int size = L0.size();
            for (int i = 0; i < size; i++) {
                C6246e eVar = L0.get(i);
                if (eVar.mo23843r() == view) {
                    return eVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2597d(C6249f fVar, C0564c cVar, C0564c cVar2) {
            this.f1939c = cVar;
            this.f1940d = cVar2;
            this.f1937a = new C6249f();
            this.f1938b = new C6249f();
            this.f1937a.mo23877h1(MotionLayout.this.f2321d.mo23867W0());
            this.f1938b.mo23877h1(MotionLayout.this.f2321d.mo23867W0());
            this.f1937a.mo23943O0();
            this.f1938b.mo23943O0();
            mo2595b(MotionLayout.this.f2321d, this.f1937a);
            mo2595b(MotionLayout.this.f2321d, this.f1938b);
            if (((double) MotionLayout.this.f1866L) > 0.5d) {
                if (cVar != null) {
                    m2567i(this.f1937a, cVar);
                }
                m2567i(this.f1938b, cVar2);
            } else {
                m2567i(this.f1938b, cVar2);
                if (cVar != null) {
                    m2567i(this.f1937a, cVar);
                }
            }
            this.f1937a.mo23879j1(MotionLayout.this.mo2842q());
            this.f1937a.mo23881l1();
            this.f1938b.mo23879j1(MotionLayout.this.mo2842q());
            this.f1938b.mo23881l1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C6249f fVar2 = this.f1937a;
                    C6246e.C6248b bVar = C6246e.C6248b.WRAP_CONTENT;
                    fVar2.mo23834m0(bVar);
                    this.f1938b.mo23834m0(bVar);
                }
                if (layoutParams.height == -2) {
                    C6249f fVar3 = this.f1937a;
                    C6246e.C6248b bVar2 = C6246e.C6248b.WRAP_CONTENT;
                    fVar3.mo23784B0(bVar2);
                    this.f1938b.mo23784B0(bVar2);
                }
            }
        }

        /* renamed from: e */
        public boolean mo2598e(int i, int i2) {
            return (i == this.f1941e && i2 == this.f1942f) ? false : true;
        }

        /* renamed from: f */
        public void mo2599f(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f1871N0 = mode;
            motionLayout.f1873O0 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.f1848C == motionLayout2.getStartState()) {
                MotionLayout.this.mo2854u(this.f1938b, optimizationLevel, i, i2);
                if (this.f1939c != null) {
                    MotionLayout.this.mo2854u(this.f1937a, optimizationLevel, i, i2);
                }
            } else {
                if (this.f1939c != null) {
                    MotionLayout.this.mo2854u(this.f1937a, optimizationLevel, i, i2);
                }
                MotionLayout.this.mo2854u(this.f1938b, optimizationLevel, i, i2);
            }
            boolean z = false;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.f1871N0 = mode;
                motionLayout3.f1873O0 = mode2;
                if (motionLayout3.f1848C == motionLayout3.getStartState()) {
                    MotionLayout.this.mo2854u(this.f1938b, optimizationLevel, i, i2);
                    if (this.f1939c != null) {
                        MotionLayout.this.mo2854u(this.f1937a, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.f1939c != null) {
                        MotionLayout.this.mo2854u(this.f1937a, optimizationLevel, i, i2);
                    }
                    MotionLayout.this.mo2854u(this.f1938b, optimizationLevel, i, i2);
                }
                MotionLayout.this.f1863J0 = this.f1937a.mo23808Q();
                MotionLayout.this.f1865K0 = this.f1937a.mo23853w();
                MotionLayout.this.f1867L0 = this.f1938b.mo23808Q();
                MotionLayout.this.f1869M0 = this.f1938b.mo23853w();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.f1861I0 = (motionLayout4.f1863J0 == motionLayout4.f1867L0 && motionLayout4.f1865K0 == motionLayout4.f1869M0) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i3 = motionLayout5.f1863J0;
            int i4 = motionLayout5.f1865K0;
            int i5 = motionLayout5.f1871N0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (((float) i3) + (motionLayout5.f1875P0 * ((float) (motionLayout5.f1867L0 - i3))));
            }
            int i6 = motionLayout5.f1873O0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) (((float) i4) + (motionLayout5.f1875P0 * ((float) (motionLayout5.f1869M0 - i4))));
            }
            boolean z2 = this.f1937a.mo23874d1() || this.f1938b.mo23874d1();
            if (this.f1937a.mo23872b1() || this.f1938b.mo23872b1()) {
                z = true;
            }
            MotionLayout.this.mo2853t(i, i2, i3, i4, z2, z);
        }

        /* renamed from: g */
        public void mo2600g() {
            mo2599f(MotionLayout.this.f1852E, MotionLayout.this.f1854F);
            MotionLayout.this.m2525r0();
        }

        /* renamed from: h */
        public void mo2601h(int i, int i2) {
            this.f1941e = i;
            this.f1942f = i2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    protected interface C0469f {
        /* renamed from: a */
        void mo2602a();

        /* renamed from: b */
        void mo2603b(MotionEvent motionEvent);

        /* renamed from: c */
        float mo2604c();

        /* renamed from: d */
        float mo2605d();

        /* renamed from: e */
        void mo2606e(int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    private static class C0470g implements C0469f {

        /* renamed from: b */
        private static C0470g f1944b = new C0470g();

        /* renamed from: a */
        VelocityTracker f1945a;

        private C0470g() {
        }

        /* renamed from: f */
        public static C0470g m2581f() {
            f1944b.f1945a = VelocityTracker.obtain();
            return f1944b;
        }

        /* renamed from: a */
        public void mo2602a() {
            this.f1945a.recycle();
            this.f1945a = null;
        }

        /* renamed from: b */
        public void mo2603b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1945a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        /* renamed from: c */
        public float mo2604c() {
            return this.f1945a.getYVelocity();
        }

        /* renamed from: d */
        public float mo2605d() {
            return this.f1945a.getXVelocity();
        }

        /* renamed from: e */
        public void mo2606e(int i) {
            this.f1945a.computeCurrentVelocity(i);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    class C0471h {

        /* renamed from: a */
        float f1946a = Float.NaN;

        /* renamed from: b */
        float f1947b = Float.NaN;

        /* renamed from: c */
        int f1948c = -1;

        /* renamed from: d */
        int f1949d = -1;

        /* renamed from: e */
        final String f1950e = "motion.progress";

        /* renamed from: f */
        final String f1951f = "motion.velocity";

        /* renamed from: g */
        final String f1952g = "motion.StartState";

        /* renamed from: h */
        final String f1953h = "motion.EndState";

        C0471h() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2607a() {
            int i = this.f1948c;
            if (!(i == -1 && this.f1949d == -1)) {
                if (i == -1) {
                    MotionLayout.this.mo2585v0(this.f1949d);
                } else {
                    int i2 = this.f1949d;
                    if (i2 == -1) {
                        MotionLayout.this.mo2564p0(i, -1, -1);
                    } else {
                        MotionLayout.this.mo2565q0(i, i2);
                    }
                }
                MotionLayout.this.setState(C0473j.SETUP);
            }
            if (!Float.isNaN(this.f1947b)) {
                MotionLayout.this.mo2555o0(this.f1946a, this.f1947b);
                this.f1946a = Float.NaN;
                this.f1947b = Float.NaN;
                this.f1948c = -1;
                this.f1949d = -1;
            } else if (!Float.isNaN(this.f1946a)) {
                MotionLayout.this.setProgress(this.f1946a);
            }
        }

        /* renamed from: b */
        public Bundle mo2608b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1946a);
            bundle.putFloat("motion.velocity", this.f1947b);
            bundle.putInt("motion.StartState", this.f1948c);
            bundle.putInt("motion.EndState", this.f1949d);
            return bundle;
        }

        /* renamed from: c */
        public void mo2609c() {
            this.f1949d = MotionLayout.this.f1850D;
            this.f1948c = MotionLayout.this.f1846B;
            this.f1947b = MotionLayout.this.getVelocity();
            this.f1946a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void mo2610d(int i) {
            this.f1949d = i;
        }

        /* renamed from: e */
        public void mo2611e(float f) {
            this.f1946a = f;
        }

        /* renamed from: f */
        public void mo2612f(int i) {
            this.f1948c = i;
        }

        /* renamed from: g */
        public void mo2613g(Bundle bundle) {
            this.f1946a = bundle.getFloat("motion.progress");
            this.f1947b = bundle.getFloat("motion.velocity");
            this.f1948c = bundle.getInt("motion.StartState");
            this.f1949d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void mo2614h(float f) {
            this.f1947b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface C0472i {
        /* renamed from: a */
        void mo2522a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: b */
        void mo2523b(MotionLayout motionLayout, int i, int i2);

        /* renamed from: c */
        void mo2524c(MotionLayout motionLayout, int i, boolean z, float f);

        /* renamed from: d */
        void mo2525d(MotionLayout motionLayout, int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    enum C0473j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2522i0(attributeSet);
    }

    /* renamed from: V */
    private void m2515V() {
        C0511q qVar = this.f1905y;
        if (qVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int x = qVar.mo2714x();
        C0511q qVar2 = this.f1905y;
        m2516W(x, qVar2.mo2701i(qVar2.mo2714x()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C0511q.C0513b> it = this.f1905y.mo2704l().iterator();
        while (it.hasNext()) {
            C0511q.C0513b next = it.next();
            if (next == this.f1905y.f2168c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            m2517X(next);
            int A = next.mo2718A();
            int y = next.mo2726y();
            String b = C0474a.m2600b(getContext(), A);
            String b2 = C0474a.m2600b(getContext(), y);
            if (sparseIntArray.get(A) == y) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + b + "->" + b2);
            }
            if (sparseIntArray2.get(y) == A) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + b + "->" + b2);
            }
            sparseIntArray.put(A, y);
            sparseIntArray2.put(y, A);
            if (this.f1905y.mo2701i(A) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + b);
            }
            if (this.f1905y.mo2701i(y) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + b);
            }
        }
    }

    /* renamed from: W */
    private void m2516W(int i, C0564c cVar) {
        String b = C0474a.m2600b(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + b + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (cVar.mo2913p(id) == null) {
                Log.w("MotionLayout", "CHECK: " + b + " NO CONSTRAINTS for " + C0474a.m2601c(childAt));
            }
        }
        int[] r = cVar.mo2915r();
        for (int i3 = 0; i3 < r.length; i3++) {
            int i4 = r[i3];
            String b2 = C0474a.m2600b(getContext(), i4);
            if (findViewById(r[i3]) == null) {
                Log.w("MotionLayout", "CHECK: " + b + " NO View matches id " + b2);
            }
            if (cVar.mo2914q(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + b + "(" + b2 + ") no LAYOUT_HEIGHT");
            }
            if (cVar.mo2919v(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + b + "(" + b2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: X */
    private void m2517X(C0511q.C0513b bVar) {
        Log.v("MotionLayout", "CHECK: transition = " + bVar.mo2724u(getContext()));
        Log.v("MotionLayout", "CHECK: transition.setDuration = " + bVar.mo2725x());
        if (bVar.mo2718A() == bVar.mo2726y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    /* renamed from: Y */
    private void m2518Y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0508n nVar = this.f1858H.get(childAt);
            if (nVar != null) {
                nVar.mo2666s(childAt);
            }
        }
    }

    /* renamed from: a0 */
    private void m2519a0() {
        boolean z;
        float signum = Math.signum(this.f1870N - this.f1866L);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1907z;
        float f = this.f1866L + (!(interpolator instanceof C6169g) ? ((((float) (nanoTime - this.f1868M)) * signum) * 1.0E-9f) / this.f1862J : 0.0f);
        if (this.f1872O) {
            f = this.f1870N;
        }
        if ((signum <= 0.0f || f < this.f1870N) && (signum > 0.0f || f > this.f1870N)) {
            z = false;
        } else {
            f = this.f1870N;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.f1888W) {
                f = interpolator.getInterpolation(((float) (nanoTime - this.f1860I)) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((signum > 0.0f && f >= this.f1870N) || (signum <= 0.0f && f <= this.f1870N)) {
            f = this.f1870N;
        }
        this.f1875P0 = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0508n nVar = this.f1858H.get(childAt);
            if (nVar != null) {
                nVar.mo2663o(childAt, f, nanoTime2, this.f1877Q0);
            }
        }
        if (this.f1861I0) {
            requestLayout();
        }
    }

    /* renamed from: b0 */
    private void m2520b0() {
        ArrayList<C0472i> arrayList;
        if ((this.f1878R != null || ((arrayList = this.f1847B0) != null && !arrayList.isEmpty())) && this.f1857G0 != this.f1864K) {
            if (this.f1855F0 != -1) {
                C0472i iVar = this.f1878R;
                if (iVar != null) {
                    iVar.mo2523b(this, this.f1846B, this.f1850D);
                }
                ArrayList<C0472i> arrayList2 = this.f1847B0;
                if (arrayList2 != null) {
                    Iterator<C0472i> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2523b(this, this.f1846B, this.f1850D);
                    }
                }
                this.f1859H0 = true;
            }
            this.f1855F0 = -1;
            float f = this.f1864K;
            this.f1857G0 = f;
            C0472i iVar2 = this.f1878R;
            if (iVar2 != null) {
                iVar2.mo2522a(this, this.f1846B, this.f1850D, f);
            }
            ArrayList<C0472i> arrayList3 = this.f1847B0;
            if (arrayList3 != null) {
                Iterator<C0472i> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2522a(this, this.f1846B, this.f1850D, this.f1864K);
                }
            }
            this.f1859H0 = true;
        }
    }

    /* renamed from: h0 */
    private boolean m2521h0(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m2521h0(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.f1889W0.set(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, f + ((float) view.getRight()), f2 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            return this.f1889W0.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent);
        }
        if (view.onTouchEvent(motionEvent)) {
            return true;
        }
    }

    /* renamed from: i0 */
    private void m2522i0(AttributeSet attributeSet) {
        C0511q qVar;
        f1843Z0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2642H6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2669K6) {
                    this.f1905y = new C0511q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0572f.f2660J6) {
                    this.f1848C = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0572f.f2687M6) {
                    this.f1870N = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1874P = true;
                } else if (index == C0572f.f2651I6) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C0572f.f2696N6) {
                    if (this.f1884U == 0) {
                        this.f1884U = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0572f.f2678L6) {
                    this.f1884U = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f1905y == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f1905y = null;
            }
        }
        if (this.f1884U != 0) {
            m2515V();
        }
        if (this.f1848C == -1 && (qVar = this.f1905y) != null) {
            this.f1848C = qVar.mo2714x();
            this.f1846B = this.f1905y.mo2714x();
            this.f1850D = this.f1905y.mo2706n();
        }
    }

    /* renamed from: l0 */
    private void m2523l0() {
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            if (qVar.mo2698f(this, this.f1848C)) {
                requestLayout();
                return;
            }
            int i = this.f1848C;
            if (i != -1) {
                this.f1905y.mo2697e(this, i);
            }
            if (this.f1905y.mo2696Q()) {
                this.f1905y.mo2695O();
            }
        }
    }

    /* renamed from: m0 */
    private void m2524m0() {
        ArrayList<C0472i> arrayList;
        if (this.f1878R != null || ((arrayList = this.f1847B0) != null && !arrayList.isEmpty())) {
            this.f1859H0 = false;
            Iterator<Integer> it = this.f1891Y0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C0472i iVar = this.f1878R;
                if (iVar != null) {
                    iVar.mo2525d(this, next.intValue());
                }
                ArrayList<C0472i> arrayList2 = this.f1847B0;
                if (arrayList2 != null) {
                    Iterator<C0472i> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo2525d(this, next.intValue());
                    }
                }
            }
            this.f1891Y0.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m2525r0() {
        int childCount = getChildCount();
        this.f1885U0.mo2594a();
        boolean z = true;
        this.f1874P = true;
        int width = getWidth();
        int height = getHeight();
        int h = this.f1905y.mo2700h();
        int i = 0;
        if (h != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                C0508n nVar = this.f1858H.get(getChildAt(i2));
                if (nVar != null) {
                    nVar.mo2665r(h);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0508n nVar2 = this.f1858H.get(getChildAt(i3));
            if (nVar2 != null) {
                this.f1905y.mo2708q(nVar2);
                nVar2.mo2670v(width, height, this.f1862J, getNanoTime());
            }
        }
        float w = this.f1905y.mo2713w();
        if (w != 0.0f) {
            boolean z2 = ((double) w) < 0.0d;
            float abs = Math.abs(w);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i4 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                }
                C0508n nVar3 = this.f1858H.get(getChildAt(i4));
                if (!Float.isNaN(nVar3.f2134k)) {
                    break;
                }
                float i5 = nVar3.mo2659i();
                float j = nVar3.mo2660j();
                float f5 = z2 ? j - i5 : j + i5;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
                i4++;
            }
            if (z) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0508n nVar4 = this.f1858H.get(getChildAt(i6));
                    if (!Float.isNaN(nVar4.f2134k)) {
                        f2 = Math.min(f2, nVar4.f2134k);
                        f = Math.max(f, nVar4.f2134k);
                    }
                }
                while (i < childCount) {
                    C0508n nVar5 = this.f1858H.get(getChildAt(i));
                    if (!Float.isNaN(nVar5.f2134k)) {
                        nVar5.f2136m = 1.0f / (1.0f - abs);
                        if (z2) {
                            nVar5.f2135l = abs - (((f - nVar5.f2134k) / (f - f2)) * abs);
                        } else {
                            nVar5.f2135l = abs - (((nVar5.f2134k - f2) * abs) / (f - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                C0508n nVar6 = this.f1858H.get(getChildAt(i));
                float i7 = nVar6.mo2659i();
                float j2 = nVar6.mo2660j();
                float f6 = z2 ? j2 - i7 : j2 + i7;
                nVar6.f2136m = 1.0f / (1.0f - abs);
                nVar6.f2135l = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* renamed from: x0 */
    private static boolean m2526x0(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo2531U(float f) {
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            float f2 = this.f1866L;
            float f3 = this.f1864K;
            if (f2 != f3 && this.f1872O) {
                this.f1866L = f3;
            }
            float f4 = this.f1866L;
            if (f4 != f) {
                this.f1888W = false;
                this.f1870N = f;
                this.f1862J = ((float) qVar.mo2705m()) / 1000.0f;
                setProgress(this.f1870N);
                this.f1907z = this.f1905y.mo2707p();
                this.f1872O = false;
                this.f1860I = getNanoTime();
                this.f1874P = true;
                this.f1864K = f4;
                this.f1866L = f4;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo2532Z(boolean z) {
        float f;
        boolean z2;
        int i;
        int i2;
        float f2;
        if (this.f1868M == -1) {
            this.f1868M = getNanoTime();
        }
        float f3 = this.f1866L;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f1848C = -1;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (this.f1906y0 || (this.f1874P && (z || this.f1870N != f3))) {
            float signum = Math.signum(this.f1870N - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f1907z;
            if (!(interpolator instanceof C0509o)) {
                f = ((((float) (nanoTime - this.f1868M)) * signum) * 1.0E-9f) / this.f1862J;
                this.f1844A = f;
            } else {
                f = 0.0f;
            }
            float f4 = this.f1866L + f;
            if (this.f1872O) {
                f4 = this.f1870N;
            }
            if ((signum <= 0.0f || f4 < this.f1870N) && (signum > 0.0f || f4 > this.f1870N)) {
                z2 = false;
            } else {
                f4 = this.f1870N;
                this.f1874P = false;
                z2 = true;
            }
            this.f1866L = f4;
            this.f1864K = f4;
            this.f1868M = nanoTime;
            if (interpolator != null && !z2) {
                if (this.f1888W) {
                    f2 = interpolator.getInterpolation(((float) (nanoTime - this.f1860I)) * 1.0E-9f);
                    this.f1866L = f2;
                    this.f1868M = nanoTime;
                    Interpolator interpolator2 = this.f1907z;
                    if (interpolator2 instanceof C0509o) {
                        float a = ((C0509o) interpolator2).mo2588a();
                        this.f1844A = a;
                        if (Math.abs(a) * this.f1862J <= 1.0E-5f) {
                            this.f1874P = false;
                        }
                        if (a > 0.0f && f2 >= 1.0f) {
                            this.f1866L = 1.0f;
                            this.f1874P = false;
                            f2 = 1.0f;
                        }
                        if (a < 0.0f && f2 <= 0.0f) {
                            this.f1866L = 0.0f;
                            this.f1874P = false;
                            f4 = 0.0f;
                        }
                    }
                } else {
                    f2 = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.f1907z;
                    if (interpolator3 instanceof C0509o) {
                        this.f1844A = ((C0509o) interpolator3).mo2588a();
                    } else {
                        this.f1844A = ((interpolator3.getInterpolation(f4 + f) - f2) * signum) / f;
                    }
                }
                f4 = f2;
            }
            if (Math.abs(this.f1844A) > 1.0E-5f) {
                setState(C0473j.MOVING);
            }
            if ((signum > 0.0f && f4 >= this.f1870N) || (signum <= 0.0f && f4 <= this.f1870N)) {
                f4 = this.f1870N;
                this.f1874P = false;
            }
            if (f4 >= 1.0f || f4 <= 0.0f) {
                this.f1874P = false;
                setState(C0473j.FINISHED);
            }
            int childCount = getChildCount();
            this.f1906y0 = false;
            long nanoTime2 = getNanoTime();
            this.f1875P0 = f4;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0508n nVar = this.f1858H.get(childAt);
                if (nVar != null) {
                    this.f1906y0 |= nVar.mo2663o(childAt, f4, nanoTime2, this.f1877Q0);
                }
            }
            boolean z5 = (signum > 0.0f && f4 >= this.f1870N) || (signum <= 0.0f && f4 <= this.f1870N);
            if (!this.f1906y0 && !this.f1874P && z5) {
                setState(C0473j.FINISHED);
            }
            if (this.f1861I0) {
                requestLayout();
            }
            this.f1906y0 = (!z5) | this.f1906y0;
            if (!(f4 > 0.0f || (i2 = this.f1846B) == -1 || this.f1848C == i2)) {
                this.f1848C = i2;
                this.f1905y.mo2701i(i2).mo2903c(this);
                setState(C0473j.FINISHED);
                z4 = true;
            }
            if (((double) f4) >= 1.0d && this.f1848C != (i = this.f1850D)) {
                this.f1848C = i;
                this.f1905y.mo2701i(i).mo2903c(this);
                setState(C0473j.FINISHED);
                z4 = true;
            }
            if (this.f1906y0 || this.f1874P) {
                invalidate();
            } else if ((signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                setState(C0473j.FINISHED);
            }
            if ((!this.f1906y0 && this.f1874P && signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                m2523l0();
            }
        }
        float f5 = this.f1866L;
        if (f5 >= 1.0f) {
            int i4 = this.f1848C;
            int i5 = this.f1850D;
            if (i4 == i5) {
                z3 = z4;
            }
            this.f1848C = i5;
        } else {
            if (f5 <= 0.0f) {
                int i6 = this.f1848C;
                int i7 = this.f1846B;
                if (i6 == i7) {
                    z3 = z4;
                }
                this.f1848C = i7;
            }
            this.f1887V0 |= z4;
            if (z4 && !this.f1879R0) {
                requestLayout();
            }
            this.f1864K = this.f1866L;
        }
        z4 = z3;
        this.f1887V0 |= z4;
        requestLayout();
        this.f1864K = this.f1866L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo2533c0() {
        int i;
        ArrayList<C0472i> arrayList;
        if ((this.f1878R != null || ((arrayList = this.f1847B0) != null && !arrayList.isEmpty())) && this.f1855F0 == -1) {
            this.f1855F0 = this.f1848C;
            if (!this.f1891Y0.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.f1891Y0;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f1848C;
            if (!(i == i2 || i2 == -1)) {
                this.f1891Y0.add(Integer.valueOf(i2));
            }
        }
        m2524m0();
    }

    /* renamed from: d0 */
    public void mo2534d0(int i, boolean z, float f) {
        C0472i iVar = this.f1878R;
        if (iVar != null) {
            iVar.mo2524c(this, i, z, f);
        }
        ArrayList<C0472i> arrayList = this.f1847B0;
        if (arrayList != null) {
            Iterator<C0472i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2524c(this, i, z, f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        String str;
        mo2532Z(false);
        super.dispatchDraw(canvas);
        if (this.f1905y != null) {
            if ((this.f1884U & 1) == 1 && !isInEditMode()) {
                this.f1849C0++;
                long nanoTime = getNanoTime();
                long j = this.f1851D0;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f1853E0 = ((float) ((int) ((((float) this.f1849C0) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f1849C0 = 0;
                        this.f1851D0 = nanoTime;
                    }
                } else {
                    this.f1851D0 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1853E0 + " fps " + C0474a.m2602d(this, this.f1846B) + " -> ");
                sb.append(C0474a.m2602d(this, this.f1850D));
                sb.append(" (progress: ");
                sb.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb.append(" ) state=");
                int i = this.f1848C;
                if (i == -1) {
                    str = AdError.UNDEFINED_DOMAIN;
                } else {
                    str = C0474a.m2602d(this, i);
                }
                sb.append(str);
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f1884U > 1) {
                if (this.f1886V == null) {
                    this.f1886V = new C0467d();
                }
                this.f1886V.mo2591a(canvas, this.f1858H, this.f1905y.mo2705m(), this.f1884U);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo2536e0(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, C0508n> hashMap = this.f1858H;
        View h = mo2840h(i);
        C0508n nVar = hashMap.get(h);
        if (nVar != null) {
            nVar.mo2657g(f, f2, f3, fArr);
            float y = h.getY();
            this.f1880S = f;
            this.f1882T = y;
            return;
        }
        if (h == null) {
            str = "" + i;
        } else {
            str = h.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + str);
    }

    /* renamed from: f0 */
    public C0511q.C0513b mo2537f0(int i) {
        return this.f1905y.mo2715y(i);
    }

    /* renamed from: g0 */
    public void mo2538g0(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f1844A;
        float f5 = this.f1866L;
        if (this.f1907z != null) {
            float signum = Math.signum(this.f1870N - f5);
            float interpolation = this.f1907z.getInterpolation(this.f1866L + 1.0E-5f);
            float interpolation2 = this.f1907z.getInterpolation(this.f1866L);
            f4 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.f1862J;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f1907z;
        if (interpolator instanceof C0509o) {
            f4 = ((C0509o) interpolator).mo2588a();
        }
        C0508n nVar = this.f1858H.get(view);
        if ((i & 1) == 0) {
            nVar.mo2662l(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            nVar.mo2657g(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public int[] getConstraintSetIds() {
        C0511q qVar = this.f1905y;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2703k();
    }

    public int getCurrentState() {
        return this.f1848C;
    }

    public ArrayList<C0511q.C0513b> getDefinedTransitions() {
        C0511q qVar = this.f1905y;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2704l();
    }

    public C0475b getDesignTool() {
        if (this.f1894n0 == null) {
            this.f1894n0 = new C0475b(this);
        }
        return this.f1894n0;
    }

    public int getEndState() {
        return this.f1850D;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1866L;
    }

    public int getStartState() {
        return this.f1846B;
    }

    public float getTargetPosition() {
        return this.f1870N;
    }

    public Bundle getTransitionState() {
        if (this.f1881S0 == null) {
            this.f1881S0 = new C0471h();
        }
        this.f1881S0.mo2609c();
        return this.f1881S0.mo2608b();
    }

    public long getTransitionTimeMs() {
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            this.f1862J = ((float) qVar.mo2705m()) / 1000.0f;
        }
        return (long) (this.f1862J * 1000.0f);
    }

    public float getVelocity() {
        return this.f1844A;
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    /* renamed from: j */
    public void mo1345j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f1900t0 && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f1900t0 = false;
    }

    /* renamed from: j0 */
    public boolean mo2552j0() {
        return this.f1856G;
    }

    /* renamed from: k */
    public void mo1346k(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public C0469f mo2553k0() {
        return C0470g.m2581f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.f2168c;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1347l(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.q r1 = r0.f1905y
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f2168c
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.t r1 = r1.mo2719B()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.q r1 = r0.f1905y
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f2168c
            androidx.constraintlayout.motion.widget.t r1 = r1.mo2719B()
            int r1 = r1.mo2752d()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo1347l(android.view.View, android.view.View, int, int):boolean");
    }

    /* renamed from: m */
    public void mo1348m(View view, View view2, int i, int i2) {
    }

    /* renamed from: n */
    public void mo1349n(View view, int i) {
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            float f = this.f1901u0;
            float f2 = this.f1904x0;
            qVar.mo2688G(f / f2, this.f1902v0 / f2);
        }
    }

    /* renamed from: n0 */
    public void mo2554n0() {
        this.f1885U0.mo2600g();
        invalidate();
    }

    /* renamed from: o */
    public void mo1350o(View view, int i, int i2, int[] iArr, int i3) {
        C0511q.C0513b bVar;
        C0547t B;
        int k;
        C0511q qVar = this.f1905y;
        if (qVar != null && (bVar = qVar.f2168c) != null && bVar.mo2720C()) {
            C0511q.C0513b bVar2 = this.f1905y.f2168c;
            if (bVar2 == null || !bVar2.mo2720C() || (B = bVar2.mo2719B()) == null || (k = B.mo2759k()) == -1 || view.getId() == k) {
                C0511q qVar2 = this.f1905y;
                if (qVar2 != null && qVar2.mo2711t()) {
                    float f = this.f1864K;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
                if (!(bVar2.mo2719B() == null || (this.f1905y.f2168c.mo2719B().mo2752d() & 1) == 0)) {
                    float u = this.f1905y.mo2712u((float) i, (float) i2);
                    float f2 = this.f1866L;
                    if ((f2 <= 0.0f && u < 0.0f) || (f2 >= 1.0f && u > 0.0f)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post(new C0464a(view));
                            return;
                        }
                        return;
                    }
                }
                float f3 = this.f1864K;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.f1901u0 = f4;
                float f5 = (float) i2;
                this.f1902v0 = f5;
                double d = (double) (nanoTime - this.f1903w0);
                Double.isNaN(d);
                this.f1904x0 = (float) (d * 1.0E-9d);
                this.f1903w0 = nanoTime;
                this.f1905y.mo2687F(f4, f5);
                if (f3 != this.f1864K) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo2532Z(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f1900t0 = true;
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo2555o0(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f1881S0 == null) {
                this.f1881S0 = new C0471h();
            }
            this.f1881S0.mo2611e(f);
            this.f1881S0.mo2614h(f2);
            return;
        }
        setProgress(f);
        setState(C0473j.MOVING);
        this.f1844A = f2;
        mo2531U(1.0f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        C0511q qVar = this.f1905y;
        if (!(qVar == null || (i = this.f1848C) == -1)) {
            C0564c i2 = qVar.mo2701i(i);
            this.f1905y.mo2690J(this);
            if (i2 != null) {
                i2.mo2904d(this);
            }
            this.f1846B = this.f1848C;
        }
        m2523l0();
        C0471h hVar = this.f1881S0;
        if (hVar != null) {
            hVar.mo2607a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0511q.C0513b bVar;
        C0547t B;
        int k;
        RectF j;
        C0511q qVar = this.f1905y;
        if (qVar != null && this.f1856G && (bVar = qVar.f2168c) != null && bVar.mo2720C() && (B = bVar.mo2719B()) != null && ((motionEvent.getAction() != 0 || (j = B.mo2758j(this, new RectF())) == null || j.contains(motionEvent.getX(), motionEvent.getY())) && (k = B.mo2759k()) != -1)) {
            View view = this.f1890X0;
            if (view == null || view.getId() != k) {
                this.f1890X0 = findViewById(k);
            }
            View view2 = this.f1890X0;
            if (view2 != null) {
                this.f1889W0.set((float) view2.getLeft(), (float) this.f1890X0.getTop(), (float) this.f1890X0.getRight(), (float) this.f1890X0.getBottom());
                if (this.f1889W0.contains(motionEvent.getX(), motionEvent.getY()) && !m2521h0(0.0f, 0.0f, this.f1890X0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1879R0 = true;
        try {
            if (this.f1905y == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f1898r0 == i5 && this.f1899s0 == i6)) {
                mo2554n0();
                mo2532Z(true);
            }
            this.f1898r0 = i5;
            this.f1899s0 = i6;
            this.f1896p0 = i5;
            this.f1897q0 = i6;
            this.f1879R0 = false;
        } finally {
            this.f1879R0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1905y == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.f1852E == i && this.f1854F == i2) ? false : true;
        if (this.f1887V0) {
            this.f1887V0 = false;
            m2523l0();
            m2524m0();
            z2 = true;
        }
        if (this.f2326i) {
            z2 = true;
        }
        this.f1852E = i;
        this.f1854F = i2;
        int x = this.f1905y.mo2714x();
        int n = this.f1905y.mo2706n();
        if ((z2 || this.f1885U0.mo2598e(x, n)) && this.f1846B != -1) {
            super.onMeasure(i, i2);
            this.f1885U0.mo2597d(this.f2321d, this.f1905y.mo2701i(x), this.f1905y.mo2701i(n));
            this.f1885U0.mo2600g();
            this.f1885U0.mo2601h(x, n);
        } else {
            z = true;
        }
        if (this.f1861I0 || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int Q = this.f2321d.mo23808Q() + getPaddingLeft() + getPaddingRight();
            int w = this.f2321d.mo23853w() + paddingTop;
            int i3 = this.f1871N0;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f1863J0;
                Q = (int) (((float) i4) + (this.f1875P0 * ((float) (this.f1867L0 - i4))));
                requestLayout();
            }
            int i5 = this.f1873O0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f1865K0;
                w = (int) (((float) i6) + (this.f1875P0 * ((float) (this.f1869M0 - i6))));
                requestLayout();
            }
            setMeasuredDimension(Q, w);
        }
        m2519a0();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            qVar.mo2692L(mo2842q());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0511q qVar = this.f1905y;
        if (qVar == null || !this.f1856G || !qVar.mo2696Q()) {
            return super.onTouchEvent(motionEvent);
        }
        C0511q.C0513b bVar = this.f1905y.f2168c;
        if (bVar != null && !bVar.mo2720C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1905y.mo2689H(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f1847B0 == null) {
                this.f1847B0 = new ArrayList<>();
            }
            this.f1847B0.add(motionHelper);
            if (motionHelper.mo2529w()) {
                if (this.f1908z0 == null) {
                    this.f1908z0 = new ArrayList<>();
                }
                this.f1908z0.add(motionHelper);
            }
            if (motionHelper.mo2528v()) {
                if (this.f1845A0 == null) {
                    this.f1845A0 = new ArrayList<>();
                }
                this.f1845A0.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1908z0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1845A0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public void mo2564p0(int i, int i2, int i3) {
        setState(C0473j.SETUP);
        this.f1848C = i;
        this.f1846B = -1;
        this.f1850D = -1;
        C0561b bVar = this.f2329l;
        if (bVar != null) {
            bVar.mo2895d(i, (float) i2, (float) i3);
            return;
        }
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            qVar.mo2701i(i).mo2904d(this);
        }
    }

    /* renamed from: q0 */
    public void mo2565q0(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f1881S0 == null) {
                this.f1881S0 = new C0471h();
            }
            this.f1881S0.mo2612f(i);
            this.f1881S0.mo2610d(i2);
            return;
        }
        C0511q qVar = this.f1905y;
        if (qVar != null) {
            this.f1846B = i;
            this.f1850D = i2;
            qVar.mo2693M(i, i2);
            this.f1885U0.mo2597d(this.f2321d, this.f1905y.mo2701i(i), this.f1905y.mo2701i(i2));
            mo2554n0();
            this.f1866L = 0.0f;
            mo2584u0();
        }
    }

    public void requestLayout() {
        C0511q qVar;
        C0511q.C0513b bVar;
        if (this.f1861I0 || this.f1848C != -1 || (qVar = this.f1905y) == null || (bVar = qVar.f2168c) == null || bVar.mo2727z() != 0) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo2567s(int i) {
        this.f2329l = null;
    }

    /* renamed from: s0 */
    public void mo2568s0(int i, float f, float f2) {
        if (this.f1905y != null && this.f1866L != f) {
            this.f1888W = true;
            this.f1860I = getNanoTime();
            float m = ((float) this.f1905y.mo2705m()) / 1000.0f;
            this.f1862J = m;
            this.f1870N = f;
            this.f1874P = true;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f = 0.0f;
                } else if (i == 2) {
                    f = 1.0f;
                }
                this.f1892l0.mo23570c(this.f1866L, f, f2, m, this.f1905y.mo2709r(), this.f1905y.mo2710s());
                int i2 = this.f1848C;
                this.f1870N = f;
                this.f1848C = i2;
                this.f1907z = this.f1892l0;
            } else if (i == 4) {
                this.f1893m0.mo2589b(f2, this.f1866L, this.f1905y.mo2709r());
                this.f1907z = this.f1893m0;
            } else if (i == 5) {
                if (m2526x0(f2, this.f1866L, this.f1905y.mo2709r())) {
                    this.f1893m0.mo2589b(f2, this.f1866L, this.f1905y.mo2709r());
                    this.f1907z = this.f1893m0;
                } else {
                    this.f1892l0.mo23570c(this.f1866L, f, f2, this.f1862J, this.f1905y.mo2709r(), this.f1905y.mo2710s());
                    this.f1844A = 0.0f;
                    int i3 = this.f1848C;
                    this.f1870N = f;
                    this.f1848C = i3;
                    this.f1907z = this.f1892l0;
                }
            }
            this.f1872O = false;
            this.f1860I = getNanoTime();
            invalidate();
        }
    }

    public void setDebugMode(int i) {
        this.f1884U = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.f1856G = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f1905y != null) {
            setState(C0473j.MOVING);
            Interpolator p = this.f1905y.mo2707p();
            if (p != null) {
                setProgress(p.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f1845A0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1845A0.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f1908z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1908z0.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (!isAttachedToWindow()) {
            if (this.f1881S0 == null) {
                this.f1881S0 = new C0471h();
            }
            this.f1881S0.mo2611e(f);
            return;
        }
        if (f <= 0.0f) {
            this.f1848C = this.f1846B;
            if (this.f1866L == 0.0f) {
                setState(C0473j.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f1848C = this.f1850D;
            if (this.f1866L == 1.0f) {
                setState(C0473j.FINISHED);
            }
        } else {
            this.f1848C = -1;
            setState(C0473j.MOVING);
        }
        if (this.f1905y != null) {
            this.f1872O = true;
            this.f1870N = f;
            this.f1864K = f;
            this.f1868M = -1;
            this.f1860I = -1;
            this.f1907z = null;
            this.f1874P = true;
            invalidate();
        }
    }

    public void setScene(C0511q qVar) {
        this.f1905y = qVar;
        qVar.mo2692L(mo2842q());
        mo2554n0();
    }

    /* access modifiers changed from: package-private */
    public void setState(C0473j jVar) {
        C0473j jVar2 = C0473j.FINISHED;
        if (jVar != jVar2 || this.f1848C != -1) {
            C0473j jVar3 = this.f1883T0;
            this.f1883T0 = jVar;
            C0473j jVar4 = C0473j.MOVING;
            if (jVar3 == jVar4 && jVar == jVar4) {
                m2520b0();
            }
            int i = C0465b.f1911a[jVar3.ordinal()];
            if (i == 1 || i == 2) {
                if (jVar == jVar4) {
                    m2520b0();
                }
                if (jVar == jVar2) {
                    mo2533c0();
                }
            } else if (i == 3 && jVar == jVar2) {
                mo2533c0();
            }
        }
    }

    public void setTransition(int i) {
        if (this.f1905y != null) {
            C0511q.C0513b f0 = mo2537f0(i);
            this.f1846B = f0.mo2718A();
            this.f1850D = f0.mo2726y();
            if (!isAttachedToWindow()) {
                if (this.f1881S0 == null) {
                    this.f1881S0 = new C0471h();
                }
                this.f1881S0.mo2612f(this.f1846B);
                this.f1881S0.mo2610d(this.f1850D);
                return;
            }
            float f = Float.NaN;
            int i2 = this.f1848C;
            float f2 = 0.0f;
            if (i2 == this.f1846B) {
                f = 0.0f;
            } else if (i2 == this.f1850D) {
                f = 1.0f;
            }
            this.f1905y.mo2694N(f0);
            this.f1885U0.mo2597d(this.f2321d, this.f1905y.mo2701i(this.f1846B), this.f1905y.mo2701i(this.f1850D));
            mo2554n0();
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.f1866L = f2;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", C0474a.m2599a() + " transitionToStart ");
                mo2584u0();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransitionDuration(int i) {
        C0511q qVar = this.f1905y;
        if (qVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            qVar.mo2691K(i);
        }
    }

    public void setTransitionListener(C0472i iVar) {
        this.f1878R = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1881S0 == null) {
            this.f1881S0 = new C0471h();
        }
        this.f1881S0.mo2613g(bundle);
        if (isAttachedToWindow()) {
            this.f1881S0.mo2607a();
        }
    }

    /* renamed from: t0 */
    public void mo2582t0() {
        mo2531U(1.0f);
    }

    public String toString() {
        Context context = getContext();
        return C0474a.m2600b(context, this.f1846B) + "->" + C0474a.m2600b(context, this.f1850D) + " (pos:" + this.f1866L + " Dpos/Dt:" + this.f1844A;
    }

    /* renamed from: u0 */
    public void mo2584u0() {
        mo2531U(0.0f);
    }

    /* renamed from: v0 */
    public void mo2585v0(int i) {
        if (!isAttachedToWindow()) {
            if (this.f1881S0 == null) {
                this.f1881S0 = new C0471h();
            }
            this.f1881S0.mo2610d(i);
            return;
        }
        mo2586w0(i, -1, -1);
    }

    /* renamed from: w0 */
    public void mo2586w0(int i, int i2, int i3) {
        C0573g gVar;
        int a;
        C0511q qVar = this.f1905y;
        if (!(qVar == null || (gVar = qVar.f2167b) == null || (a = gVar.mo2933a(this.f1848C, i, (float) i2, (float) i3)) == -1)) {
            i = a;
        }
        int i4 = this.f1848C;
        if (i4 != i) {
            if (this.f1846B == i) {
                mo2531U(0.0f);
            } else if (this.f1850D == i) {
                mo2531U(1.0f);
            } else {
                this.f1850D = i;
                if (i4 != -1) {
                    mo2565q0(i4, i);
                    mo2531U(1.0f);
                    this.f1866L = 0.0f;
                    mo2582t0();
                    return;
                }
                this.f1888W = false;
                this.f1870N = 1.0f;
                this.f1864K = 0.0f;
                this.f1866L = 0.0f;
                this.f1868M = getNanoTime();
                this.f1860I = getNanoTime();
                this.f1872O = false;
                this.f1907z = null;
                this.f1862J = ((float) this.f1905y.mo2705m()) / 1000.0f;
                this.f1846B = -1;
                this.f1905y.mo2693M(-1, this.f1850D);
                this.f1905y.mo2714x();
                int childCount = getChildCount();
                this.f1858H.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.f1858H.put(childAt, new C0508n(childAt));
                }
                this.f1874P = true;
                this.f1885U0.mo2597d(this.f2321d, (C0564c) null, this.f1905y.mo2701i(i));
                mo2554n0();
                this.f1885U0.mo2594a();
                m2518Y();
                int width = getWidth();
                int height = getHeight();
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0508n nVar = this.f1858H.get(getChildAt(i6));
                    this.f1905y.mo2708q(nVar);
                    nVar.mo2670v(width, height, this.f1862J, getNanoTime());
                }
                float w = this.f1905y.mo2713w();
                if (w != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        C0508n nVar2 = this.f1858H.get(getChildAt(i7));
                        float j = nVar2.mo2660j() + nVar2.mo2659i();
                        f = Math.min(f, j);
                        f2 = Math.max(f2, j);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C0508n nVar3 = this.f1858H.get(getChildAt(i8));
                        float i9 = nVar3.mo2659i();
                        float j2 = nVar3.mo2660j();
                        nVar3.f2136m = 1.0f / (1.0f - w);
                        nVar3.f2135l = w - ((((i9 + j2) - f) * w) / (f2 - f));
                    }
                }
                this.f1864K = 0.0f;
                this.f1866L = 0.0f;
                this.f1874P = true;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(C0511q.C0513b bVar) {
        this.f1905y.mo2694N(bVar);
        setState(C0473j.SETUP);
        if (this.f1848C == this.f1905y.mo2706n()) {
            this.f1866L = 1.0f;
            this.f1864K = 1.0f;
            this.f1870N = 1.0f;
        } else {
            this.f1866L = 0.0f;
            this.f1864K = 0.0f;
            this.f1870N = 0.0f;
        }
        this.f1868M = bVar.mo2721D(1) ? -1 : getNanoTime();
        int x = this.f1905y.mo2714x();
        int n = this.f1905y.mo2706n();
        if (x != this.f1846B || n != this.f1850D) {
            this.f1846B = x;
            this.f1850D = n;
            this.f1905y.mo2693M(x, n);
            this.f1885U0.mo2597d(this.f2321d, this.f1905y.mo2701i(this.f1846B), this.f1905y.mo2701i(this.f1850D));
            this.f1885U0.mo2601h(this.f1846B, this.f1850D);
            this.f1885U0.mo2600g();
            mo2554n0();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2522i0(attributeSet);
    }
}
