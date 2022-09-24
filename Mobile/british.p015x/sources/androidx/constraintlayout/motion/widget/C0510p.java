package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.C0558a;
import androidx.constraintlayout.widget.C0564c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p155u.C6164c;

/* renamed from: androidx.constraintlayout.motion.widget.p */
/* compiled from: MotionPaths */
class C0510p implements Comparable<C0510p> {

    /* renamed from: q */
    static String[] f2150q = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b */
    C6164c f2151b;

    /* renamed from: c */
    int f2152c = 0;

    /* renamed from: d */
    float f2153d;

    /* renamed from: e */
    float f2154e;

    /* renamed from: f */
    float f2155f;

    /* renamed from: g */
    float f2156g;

    /* renamed from: h */
    float f2157h;

    /* renamed from: i */
    float f2158i;

    /* renamed from: j */
    float f2159j = Float.NaN;

    /* renamed from: k */
    float f2160k = Float.NaN;

    /* renamed from: l */
    int f2161l = C0476c.f1967f;

    /* renamed from: m */
    LinkedHashMap<String, C0558a> f2162m = new LinkedHashMap<>();

    /* renamed from: n */
    int f2163n = 0;

    /* renamed from: o */
    double[] f2164o = new double[18];

    /* renamed from: p */
    double[] f2165p = new double[18];

    public C0510p() {
    }

    /* renamed from: c */
    private boolean m2813c(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo2671a(C0564c.C0565a aVar) {
        this.f2151b = C6164c.m27053c(aVar.f2478c.f2548c);
        C0564c.C0567c cVar = aVar.f2478c;
        this.f2161l = cVar.f2549d;
        this.f2159j = cVar.f2552g;
        this.f2152c = cVar.f2550e;
        this.f2160k = aVar.f2477b.f2557e;
        for (String next : aVar.f2481f.keySet()) {
            C0558a aVar2 = aVar.f2481f.get(next);
            if (aVar2.mo2888c() != C0558a.C0560b.STRING_TYPE) {
                this.f2162m.put(next, aVar2);
            }
        }
    }

    /* renamed from: b */
    public int compareTo(C0510p pVar) {
        return Float.compare(this.f2154e, pVar.f2154e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2674d(C0510p pVar, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | m2813c(this.f2154e, pVar.f2154e);
        zArr[1] = zArr[1] | m2813c(this.f2155f, pVar.f2155f) | z;
        zArr[2] = z | m2813c(this.f2156g, pVar.f2156g) | zArr[2];
        zArr[3] = zArr[3] | m2813c(this.f2157h, pVar.f2157h);
        zArr[4] = m2813c(this.f2158i, pVar.f2158i) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2675i(double[] dArr, int[] iArr) {
        float[] fArr = {this.f2154e, this.f2155f, this.f2156g, this.f2157h, this.f2158i, this.f2159j};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2676j(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f2155f;
        float f2 = this.f2156g;
        float f3 = this.f2157h;
        float f4 = this.f2158i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2677k(String str, double[] dArr, int i) {
        C0558a aVar = this.f2162m.get(str);
        if (aVar.mo2891f() == 1) {
            dArr[i] = (double) aVar.mo2889d();
            return 1;
        }
        int f = aVar.mo2891f();
        float[] fArr = new float[f];
        aVar.mo2890e(fArr);
        int i2 = 0;
        while (i2 < f) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2678l(String str) {
        return this.f2162m.get(str).mo2891f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2679m(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f2155f;
        float f2 = this.f2156g;
        float f3 = this.f2157h;
        float f4 = this.f2158i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo2680n(String str) {
        return this.f2162m.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2681o(C0500i iVar, C0510p pVar, C0510p pVar2) {
        C0500i iVar2 = iVar;
        C0510p pVar3 = pVar;
        C0510p pVar4 = pVar2;
        float f = ((float) iVar2.f1968a) / 100.0f;
        this.f2153d = f;
        this.f2152c = iVar2.f2042j;
        float f2 = Float.isNaN(iVar2.f2043k) ? f : iVar2.f2043k;
        float f3 = Float.isNaN(iVar2.f2044l) ? f : iVar2.f2044l;
        float f4 = pVar4.f2157h;
        float f5 = pVar3.f2157h;
        float f6 = pVar4.f2158i;
        float f7 = pVar3.f2158i;
        this.f2154e = this.f2153d;
        float f8 = pVar3.f2155f;
        float f9 = pVar3.f2156g;
        float f10 = (pVar4.f2155f + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (pVar4.f2156g + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f2155f = (float) ((int) ((f8 + (f10 * f)) - f13));
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.f2156g = (float) ((int) ((f9 + (f11 * f)) - f15));
        this.f2157h = (float) ((int) (f5 + f12));
        this.f2158i = (float) ((int) (f7 + f14));
        C0500i iVar3 = iVar;
        float f16 = Float.isNaN(iVar3.f2045m) ? f : iVar3.f2045m;
        float f17 = 0.0f;
        float f18 = Float.isNaN(iVar3.f2048p) ? 0.0f : iVar3.f2048p;
        if (!Float.isNaN(iVar3.f2046n)) {
            f = iVar3.f2046n;
        }
        if (!Float.isNaN(iVar3.f2047o)) {
            f17 = iVar3.f2047o;
        }
        this.f2163n = 2;
        C0510p pVar5 = pVar;
        this.f2155f = (float) ((int) (((pVar5.f2155f + (f16 * f10)) + (f17 * f11)) - f13));
        this.f2156g = (float) ((int) (((pVar5.f2156g + (f10 * f18)) + (f11 * f)) - f15));
        this.f2151b = C6164c.m27053c(iVar3.f2040h);
        this.f2161l = iVar3.f2041i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2682p(C0500i iVar, C0510p pVar, C0510p pVar2) {
        C0500i iVar2 = iVar;
        C0510p pVar3 = pVar;
        C0510p pVar4 = pVar2;
        float f = ((float) iVar2.f1968a) / 100.0f;
        this.f2153d = f;
        this.f2152c = iVar2.f2042j;
        float f2 = Float.isNaN(iVar2.f2043k) ? f : iVar2.f2043k;
        float f3 = Float.isNaN(iVar2.f2044l) ? f : iVar2.f2044l;
        float f4 = pVar4.f2157h - pVar3.f2157h;
        float f5 = pVar4.f2158i - pVar3.f2158i;
        this.f2154e = this.f2153d;
        if (!Float.isNaN(iVar2.f2045m)) {
            f = iVar2.f2045m;
        }
        float f6 = pVar3.f2155f;
        float f7 = pVar3.f2157h;
        float f8 = pVar3.f2156g;
        float f9 = pVar3.f2158i;
        float f10 = (pVar4.f2155f + (pVar4.f2157h / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (pVar4.f2156g + (pVar4.f2158i / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.f2155f = (float) ((int) ((f6 + f12) - f14));
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.f2156g = (float) ((int) ((f8 + f15) - f17));
        this.f2157h = (float) ((int) (f7 + f13));
        this.f2158i = (float) ((int) (f9 + f16));
        C0500i iVar3 = iVar;
        float f18 = Float.isNaN(iVar3.f2046n) ? 0.0f : iVar3.f2046n;
        float f19 = (-f11) * f18;
        float f20 = f10 * f18;
        this.f2163n = 1;
        C0510p pVar5 = pVar;
        float f21 = (float) ((int) ((pVar5.f2155f + f12) - f14));
        this.f2155f = f21;
        float f22 = (float) ((int) ((pVar5.f2156g + f15) - f17));
        this.f2156g = f22;
        this.f2155f = f21 + f19;
        this.f2156g = f22 + f20;
        this.f2151b = C6164c.m27053c(iVar3.f2040h);
        this.f2161l = iVar3.f2041i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2683q(int i, int i2, C0500i iVar, C0510p pVar, C0510p pVar2) {
        C0500i iVar2 = iVar;
        C0510p pVar3 = pVar;
        C0510p pVar4 = pVar2;
        float f = ((float) iVar2.f1968a) / 100.0f;
        this.f2153d = f;
        this.f2152c = iVar2.f2042j;
        float f2 = Float.isNaN(iVar2.f2043k) ? f : iVar2.f2043k;
        float f3 = Float.isNaN(iVar2.f2044l) ? f : iVar2.f2044l;
        float f4 = pVar4.f2157h;
        float f5 = pVar3.f2157h;
        float f6 = pVar4.f2158i;
        float f7 = pVar3.f2158i;
        this.f2154e = this.f2153d;
        float f8 = pVar3.f2155f;
        float f9 = pVar3.f2156g;
        float f10 = pVar4.f2155f + (f4 / 2.0f);
        float f11 = pVar4.f2156g + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f2155f = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f3;
        this.f2156g = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f)));
        this.f2157h = (float) ((int) (f5 + f12));
        this.f2158i = (float) ((int) (f7 + f13));
        this.f2163n = 3;
        C0500i iVar3 = iVar;
        if (!Float.isNaN(iVar3.f2045m)) {
            this.f2155f = (float) ((int) (iVar3.f2045m * ((float) ((int) (((float) i) - this.f2157h)))));
        }
        if (!Float.isNaN(iVar3.f2046n)) {
            this.f2156g = (float) ((int) (iVar3.f2046n * ((float) ((int) (((float) i2) - this.f2158i)))));
        }
        this.f2151b = C6164c.m27053c(iVar3.f2040h);
        this.f2161l = iVar3.f2041i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2684s(float f, float f2, float f3, float f4) {
        this.f2155f = f;
        this.f2156g = f2;
        this.f2157h = f3;
        this.f2158i = f4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2685u(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2686w(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f;
        View view2 = view;
        int[] iArr2 = iArr;
        float f2 = this.f2155f;
        float f3 = this.f2156g;
        float f4 = this.f2157h;
        float f5 = this.f2158i;
        if (iArr2.length != 0 && this.f2164o.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f2164o = new double[i];
            this.f2165p = new double[i];
        }
        Arrays.fill(this.f2164o, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.f2164o[iArr2[i2]] = dArr[i2];
            this.f2165p[iArr2[i2]] = dArr2[i2];
        }
        int i3 = 0;
        float f6 = Float.NaN;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (true) {
            double[] dArr4 = this.f2164o;
            if (i3 >= dArr4.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr4[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.f2164o[i3])) {
                    d = this.f2164o[i3] + d;
                }
                f = f2;
                float f11 = (float) d;
                float f12 = (float) this.f2165p[i3];
                if (i3 == 1) {
                    f7 = f12;
                    f2 = f11;
                } else if (i3 == 2) {
                    f3 = f11;
                    f9 = f12;
                } else if (i3 == 3) {
                    f4 = f11;
                    f8 = f12;
                } else if (i3 == 4) {
                    f5 = f11;
                    f10 = f12;
                } else if (i3 == 5) {
                    f2 = f;
                    f6 = f11;
                }
                i3++;
            } else {
                f = f2;
            }
            f2 = f;
            i3++;
        }
        float f13 = f2;
        if (!Float.isNaN(f6)) {
            float f14 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f14 = 0.0f;
            }
            double d2 = (double) f14;
            double d3 = (double) f6;
            double degrees = Math.toDegrees(Math.atan2((double) (f9 + (f10 / 2.0f)), (double) (f7 + (f8 / 2.0f))));
            Double.isNaN(d3);
            Double.isNaN(d2);
            view2.setRotation((float) (d2 + d3 + degrees));
        } else if (!Float.isNaN(Float.NaN)) {
            view2.setRotation(Float.NaN);
        }
        float f15 = f13 + 0.5f;
        int i4 = (int) f15;
        float f16 = f3 + 0.5f;
        int i5 = (int) f16;
        int i6 = (int) (f15 + f4);
        int i7 = (int) (f16 + f5);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if ((i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight()) ? false : true) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view2.layout(i4, i5, i6, i7);
    }

    public C0510p(int i, int i2, C0500i iVar, C0510p pVar, C0510p pVar2) {
        int i3 = iVar.f2049q;
        if (i3 == 1) {
            mo2682p(iVar, pVar, pVar2);
        } else if (i3 != 2) {
            mo2681o(iVar, pVar, pVar2);
        } else {
            mo2683q(i, i2, iVar, pVar, pVar2);
        }
    }
}
