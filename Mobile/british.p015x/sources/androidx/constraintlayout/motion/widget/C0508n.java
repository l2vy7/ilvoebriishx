package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0558a;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p155u.C6162b;
import p155u.C6164c;
import p155u.C6170h;
import p166w.C6246e;

/* renamed from: androidx.constraintlayout.motion.widget.n */
/* compiled from: MotionController */
public class C0508n {

    /* renamed from: A */
    private C0505l[] f2122A;

    /* renamed from: B */
    private int f2123B = C0476c.f1967f;

    /* renamed from: a */
    View f2124a;

    /* renamed from: b */
    int f2125b;

    /* renamed from: c */
    String f2126c;

    /* renamed from: d */
    private int f2127d = -1;

    /* renamed from: e */
    private C0510p f2128e = new C0510p();

    /* renamed from: f */
    private C0510p f2129f = new C0510p();

    /* renamed from: g */
    private C0507m f2130g = new C0507m();

    /* renamed from: h */
    private C0507m f2131h = new C0507m();

    /* renamed from: i */
    private C6162b[] f2132i;

    /* renamed from: j */
    private C6162b f2133j;

    /* renamed from: k */
    float f2134k = Float.NaN;

    /* renamed from: l */
    float f2135l = 0.0f;

    /* renamed from: m */
    float f2136m = 1.0f;

    /* renamed from: n */
    private int[] f2137n;

    /* renamed from: o */
    private double[] f2138o;

    /* renamed from: p */
    private double[] f2139p;

    /* renamed from: q */
    private String[] f2140q;

    /* renamed from: r */
    private int[] f2141r;

    /* renamed from: s */
    private int f2142s = 4;

    /* renamed from: t */
    private float[] f2143t = new float[4];

    /* renamed from: u */
    private ArrayList<C0510p> f2144u = new ArrayList<>();

    /* renamed from: v */
    private float[] f2145v = new float[1];

    /* renamed from: w */
    private ArrayList<C0476c> f2146w = new ArrayList<>();

    /* renamed from: x */
    private HashMap<String, C0532s> f2147x;

    /* renamed from: y */
    private HashMap<String, C0515r> f2148y;

    /* renamed from: z */
    private HashMap<String, C0482g> f2149z;

    C0508n(View view) {
        mo2669u(view);
    }

    /* renamed from: f */
    private float m2790f(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f2136m;
            if (((double) f4) != 1.0d) {
                float f5 = this.f2135l;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = (f - f5) * f4;
                }
            }
        }
        C6164c cVar = this.f2128e.f2151b;
        float f6 = Float.NaN;
        Iterator<C0510p> it = this.f2144u.iterator();
        while (it.hasNext()) {
            C0510p next = it.next();
            C6164c cVar2 = next.f2151b;
            if (cVar2 != null) {
                float f7 = next.f2153d;
                if (f7 < f) {
                    cVar = cVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f2153d;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) cVar.mo23559a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo23560b(d);
            }
        }
        return f;
    }

    /* renamed from: m */
    private float m2791m() {
        float[] fArr = new float[2];
        float f = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3 = ((float) i) * f;
            double d3 = (double) f3;
            C6164c cVar = this.f2128e.f2151b;
            float f4 = Float.NaN;
            Iterator<C0510p> it = this.f2144u.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                C0510p next = it.next();
                C6164c cVar2 = next.f2151b;
                float f6 = f;
                if (cVar2 != null) {
                    float f7 = next.f2153d;
                    if (f7 < f3) {
                        f5 = f7;
                        cVar = cVar2;
                    } else if (Float.isNaN(f4)) {
                        f4 = next.f2153d;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (cVar != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f9 = f4 - f5;
                d3 = (double) ((((float) cVar.mo23559a((double) ((f3 - f5) / f9))) * f9) + f5);
            }
            this.f2132i[0].mo23544d(d3, this.f2138o);
            this.f2128e.mo2676j(this.f2137n, this.f2138o, fArr, 0);
            if (i > 0) {
                double d4 = (double) f2;
                double d5 = (double) fArr[1];
                Double.isNaN(d5);
                double d6 = d2 - d5;
                double d7 = (double) fArr[0];
                Double.isNaN(d7);
                double hypot = Math.hypot(d6, d - d7);
                Double.isNaN(d4);
                f2 = (float) (d4 + hypot);
            }
            d = (double) fArr[0];
            d2 = (double) fArr[1];
            i++;
            f = f8;
        }
        return f2;
    }

    /* renamed from: n */
    private void m2792n(C0510p pVar) {
        int binarySearch = Collections.binarySearch(this.f2144u, pVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath positon \"" + pVar.f2154e + "\" outside of range");
        }
        this.f2144u.add((-binarySearch) - 1, pVar);
    }

    /* renamed from: p */
    private void m2793p(C0510p pVar) {
        pVar.mo2684s((float) ((int) this.f2124a.getX()), (float) ((int) this.f2124a.getY()), (float) this.f2124a.getWidth(), (float) this.f2124a.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2652a(C0476c cVar) {
        this.f2146w.add(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2653b(ArrayList<C0476c> arrayList) {
        this.f2146w.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo2654c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f2132i[0].mo23548h();
        if (iArr != null) {
            Iterator<C0510p> it = this.f2144u.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f2163n;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.f2132i[0].mo23544d(d, this.f2138o);
            this.f2128e.mo2676j(this.f2137n, this.f2138o, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0103  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2655d(float[] r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r2 + -1
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r5 = r0.f2148y
            java.lang.String r6 = "translationX"
            r7 = 0
            if (r5 != 0) goto L_0x0016
            r5 = r7
            goto L_0x001c
        L_0x0016:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.r r5 = (androidx.constraintlayout.motion.widget.C0515r) r5
        L_0x001c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r8 = r0.f2148y
            java.lang.String r9 = "translationY"
            if (r8 != 0) goto L_0x0024
            r8 = r7
            goto L_0x002a
        L_0x0024:
            java.lang.Object r8 = r8.get(r9)
            androidx.constraintlayout.motion.widget.r r8 = (androidx.constraintlayout.motion.widget.C0515r) r8
        L_0x002a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.g> r10 = r0.f2149z
            if (r10 != 0) goto L_0x0030
            r6 = r7
            goto L_0x0036
        L_0x0030:
            java.lang.Object r6 = r10.get(r6)
            androidx.constraintlayout.motion.widget.g r6 = (androidx.constraintlayout.motion.widget.C0482g) r6
        L_0x0036:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.g> r10 = r0.f2149z
            if (r10 != 0) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            java.lang.Object r7 = r10.get(r9)
            androidx.constraintlayout.motion.widget.g r7 = (androidx.constraintlayout.motion.widget.C0482g) r7
        L_0x0041:
            r10 = 0
        L_0x0042:
            if (r10 >= r2) goto L_0x0118
            float r11 = (float) r10
            float r11 = r11 * r3
            float r12 = r0.f2136m
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0065
            float r14 = r0.f2135l
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 >= 0) goto L_0x0054
            r11 = 0
        L_0x0054:
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 <= 0) goto L_0x0065
            r16 = r5
            double r4 = (double) r11
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r19 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0067
            float r11 = r11 - r14
            float r11 = r11 * r12
            goto L_0x0067
        L_0x0065:
            r16 = r5
        L_0x0067:
            double r4 = (double) r11
            androidx.constraintlayout.motion.widget.p r12 = r0.f2128e
            u.c r12 = r12.f2151b
            r14 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r13 = r0.f2144u
            java.util.Iterator r13 = r13.iterator()
            r17 = 0
        L_0x0076:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L_0x009e
            java.lang.Object r18 = r13.next()
            r15 = r18
            androidx.constraintlayout.motion.widget.p r15 = (androidx.constraintlayout.motion.widget.C0510p) r15
            u.c r9 = r15.f2151b
            if (r9 == 0) goto L_0x009b
            float r2 = r15.f2153d
            int r20 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r20 >= 0) goto L_0x0092
            r17 = r2
            r12 = r9
            goto L_0x009b
        L_0x0092:
            boolean r2 = java.lang.Float.isNaN(r14)
            if (r2 == 0) goto L_0x009b
            float r2 = r15.f2153d
            r14 = r2
        L_0x009b:
            r2 = r23
            goto L_0x0076
        L_0x009e:
            if (r12 == 0) goto L_0x00b8
            boolean r2 = java.lang.Float.isNaN(r14)
            if (r2 == 0) goto L_0x00a8
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x00a8:
            float r2 = r11 - r17
            float r14 = r14 - r17
            float r2 = r2 / r14
            double r4 = (double) r2
            double r4 = r12.mo23559a(r4)
            float r2 = (float) r4
            float r2 = r2 * r14
            float r2 = r2 + r17
            double r4 = (double) r2
        L_0x00b8:
            u.b[] r2 = r0.f2132i
            r9 = 0
            r2 = r2[r9]
            double[] r12 = r0.f2138o
            r2.mo23544d(r4, r12)
            u.b r2 = r0.f2133j
            if (r2 == 0) goto L_0x00ce
            double[] r12 = r0.f2138o
            int r13 = r12.length
            if (r13 <= 0) goto L_0x00ce
            r2.mo23544d(r4, r12)
        L_0x00ce:
            androidx.constraintlayout.motion.widget.p r2 = r0.f2128e
            int[] r4 = r0.f2137n
            double[] r5 = r0.f2138o
            int r12 = r10 * 2
            r2.mo2676j(r4, r5, r1, r12)
            if (r6 == 0) goto L_0x00e5
            r2 = r1[r12]
            float r4 = r6.mo2624a(r11)
            float r2 = r2 + r4
            r1[r12] = r2
            goto L_0x00f3
        L_0x00e5:
            if (r16 == 0) goto L_0x00f3
            r2 = r1[r12]
            r5 = r16
            float r4 = r5.mo2732a(r11)
            float r2 = r2 + r4
            r1[r12] = r2
            goto L_0x00f5
        L_0x00f3:
            r5 = r16
        L_0x00f5:
            if (r7 == 0) goto L_0x0103
            int r12 = r12 + 1
            r2 = r1[r12]
            float r4 = r7.mo2624a(r11)
            float r2 = r2 + r4
            r1[r12] = r2
            goto L_0x0110
        L_0x0103:
            if (r8 == 0) goto L_0x0110
            int r12 = r12 + 1
            r2 = r1[r12]
            float r4 = r8.mo2732a(r11)
            float r2 = r2 + r4
            r1[r12] = r2
        L_0x0110:
            int r10 = r10 + 1
            r2 = r23
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0508n.mo2655d(float[], int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2656e(float f, float[] fArr, int i) {
        this.f2132i[0].mo23544d((double) m2790f(f, (float[]) null), this.f2138o);
        this.f2128e.mo2679m(this.f2137n, this.f2138o, fArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2657g(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float f4 = m2790f(f, this.f2145v);
        C6162b[] bVarArr = this.f2132i;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) f4;
            bVarArr[0].mo23547g(d, this.f2139p);
            this.f2132i[0].mo23544d(d, this.f2138o);
            float f5 = this.f2145v[0];
            while (true) {
                dArr = this.f2139p;
                if (i >= dArr.length) {
                    break;
                }
                double d2 = dArr[i];
                double d3 = (double) f5;
                Double.isNaN(d3);
                dArr[i] = d2 * d3;
                i++;
            }
            C6162b bVar = this.f2133j;
            if (bVar != null) {
                double[] dArr2 = this.f2138o;
                if (dArr2.length > 0) {
                    bVar.mo23544d(d, dArr2);
                    this.f2133j.mo23547g(d, this.f2139p);
                    this.f2128e.mo2685u(f2, f3, fArr, this.f2137n, this.f2139p, this.f2138o);
                    return;
                }
                return;
            }
            this.f2128e.mo2685u(f2, f3, fArr, this.f2137n, dArr, this.f2138o);
            return;
        }
        C0510p pVar = this.f2129f;
        float f6 = pVar.f2155f;
        C0510p pVar2 = this.f2128e;
        float f7 = f6 - pVar2.f2155f;
        float f8 = pVar.f2156g - pVar2.f2156g;
        float f9 = (pVar.f2157h - pVar2.f2157h) + f7;
        float f10 = (pVar.f2158i - pVar2.f2158i) + f8;
        fArr[0] = (f7 * (1.0f - f2)) + (f9 * f2);
        fArr[1] = (f8 * (1.0f - f3)) + (f10 * f3);
    }

    /* renamed from: h */
    public int mo2658h() {
        int i = this.f2128e.f2152c;
        Iterator<C0510p> it = this.f2144u.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f2152c);
        }
        return Math.max(i, this.f2129f.f2152c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2659i() {
        return this.f2129f.f2155f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2660j() {
        return this.f2129f.f2156g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0510p mo2661k(int i) {
        return this.f2144u.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2662l(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float f4 = m2790f(f, this.f2145v);
        HashMap<String, C0515r> hashMap = this.f2148y;
        C0482g gVar = null;
        C0515r rVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, C0515r> hashMap2 = this.f2148y;
        C0515r rVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, C0515r> hashMap3 = this.f2148y;
        C0515r rVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, C0515r> hashMap4 = this.f2148y;
        C0515r rVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, C0515r> hashMap5 = this.f2148y;
        C0515r rVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, C0482g> hashMap6 = this.f2149z;
        C0482g gVar2 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, C0482g> hashMap7 = this.f2149z;
        C0482g gVar3 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, C0482g> hashMap8 = this.f2149z;
        C0482g gVar4 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, C0482g> hashMap9 = this.f2149z;
        C0482g gVar5 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, C0482g> hashMap10 = this.f2149z;
        if (hashMap10 != null) {
            gVar = hashMap10.get("scaleY");
        }
        C6170h hVar = new C6170h();
        hVar.mo23574b();
        hVar.mo23576d(rVar3, f4);
        hVar.mo23580h(rVar, rVar2, f4);
        hVar.mo23578f(rVar4, rVar5, f4);
        hVar.mo23575c(gVar4, f4);
        hVar.mo23579g(gVar2, gVar3, f4);
        hVar.mo23577e(gVar5, gVar, f4);
        C6162b bVar = this.f2133j;
        if (bVar != null) {
            double[] dArr = this.f2138o;
            if (dArr.length > 0) {
                double d = (double) f4;
                bVar.mo23544d(d, dArr);
                this.f2133j.mo23547g(d, this.f2139p);
                this.f2128e.mo2685u(f2, f3, fArr, this.f2137n, this.f2139p, this.f2138o);
            }
            hVar.mo23573a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f2132i != null) {
            double f5 = (double) m2790f(f4, this.f2145v);
            this.f2132i[0].mo23547g(f5, this.f2139p);
            this.f2132i[0].mo23544d(f5, this.f2138o);
            float f6 = this.f2145v[0];
            while (true) {
                double[] dArr2 = this.f2139p;
                if (i3 < dArr2.length) {
                    double d2 = dArr2[i3];
                    double d3 = (double) f6;
                    Double.isNaN(d3);
                    dArr2[i3] = d2 * d3;
                    i3++;
                } else {
                    float f7 = f2;
                    float f8 = f3;
                    this.f2128e.mo2685u(f7, f8, fArr, this.f2137n, dArr2, this.f2138o);
                    hVar.mo23573a(f7, f8, i, i2, fArr);
                    return;
                }
            }
        } else {
            C0510p pVar = this.f2129f;
            float f9 = pVar.f2155f;
            C0510p pVar2 = this.f2128e;
            float f10 = f9 - pVar2.f2155f;
            float f11 = pVar.f2156g - pVar2.f2156g;
            C0482g gVar6 = gVar5;
            float f12 = (pVar.f2158i - pVar2.f2158i) + f11;
            fArr[0] = (f10 * (1.0f - f2)) + (((pVar.f2157h - pVar2.f2157h) + f10) * f2);
            fArr[1] = (f11 * (1.0f - f3)) + (f12 * f3);
            hVar.mo23574b();
            hVar.mo23576d(rVar3, f4);
            hVar.mo23580h(rVar, rVar2, f4);
            hVar.mo23578f(rVar4, rVar5, f4);
            hVar.mo23575c(gVar4, f4);
            hVar.mo23579g(gVar2, gVar3, f4);
            hVar.mo23577e(gVar6, gVar, f4);
            hVar.mo23573a(f2, f3, i, i2, fArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: androidx.constraintlayout.motion.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.constraintlayout.motion.widget.s$d} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2663o(android.view.View r23, float r24, long r25, androidx.constraintlayout.motion.widget.C0479e r27) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = 0
            r2 = r24
            float r12 = r0.m2790f(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r2 = r0.f2148y
            if (r2 == 0) goto L_0x0027
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.r r3 = (androidx.constraintlayout.motion.widget.C0515r) r3
            r3.mo2735f(r11, r12)
            goto L_0x0017
        L_0x0027:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r2 = r0.f2147x
            r13 = 0
            if (r2 == 0) goto L_0x0059
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0036:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.widget.s r1 = (androidx.constraintlayout.motion.widget.C0532s) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0532s.C0536d
            if (r2 == 0) goto L_0x004a
            r8 = r1
            androidx.constraintlayout.motion.widget.s$d r8 = (androidx.constraintlayout.motion.widget.C0532s.C0536d) r8
            goto L_0x0036
        L_0x004a:
            r2 = r23
            r3 = r12
            r4 = r25
            r6 = r27
            boolean r1 = r1.mo2744f(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0036
        L_0x0057:
            r14 = r9
            goto L_0x005b
        L_0x0059:
            r8 = r1
            r14 = 0
        L_0x005b:
            u.b[] r1 = r0.f2132i
            r15 = 1
            if (r1 == 0) goto L_0x013f
            r1 = r1[r13]
            double r9 = (double) r12
            double[] r2 = r0.f2138o
            r1.mo23544d(r9, r2)
            u.b[] r1 = r0.f2132i
            r1 = r1[r13]
            double[] r2 = r0.f2139p
            r1.mo23547g(r9, r2)
            u.b r1 = r0.f2133j
            if (r1 == 0) goto L_0x0084
            double[] r2 = r0.f2138o
            int r3 = r2.length
            if (r3 <= 0) goto L_0x0084
            r1.mo23544d(r9, r2)
            u.b r1 = r0.f2133j
            double[] r2 = r0.f2139p
            r1.mo23547g(r9, r2)
        L_0x0084:
            androidx.constraintlayout.motion.widget.p r1 = r0.f2128e
            int[] r3 = r0.f2137n
            double[] r4 = r0.f2138o
            double[] r5 = r0.f2139p
            r6 = 0
            r2 = r23
            r1.mo2686w(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r1 = r0.f2148y
            if (r1 == 0) goto L_0x00bd
            java.util.Collection r1 = r1.values()
            java.util.Iterator r16 = r1.iterator()
        L_0x009e:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r16.next()
            androidx.constraintlayout.motion.widget.r r1 = (androidx.constraintlayout.motion.widget.C0515r) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0515r.C0519d
            if (r2 == 0) goto L_0x009e
            androidx.constraintlayout.motion.widget.r$d r1 = (androidx.constraintlayout.motion.widget.C0515r.C0519d) r1
            double[] r2 = r0.f2139p
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.mo2740i(r2, r3, r4, r6)
            goto L_0x009e
        L_0x00bd:
            if (r8 == 0) goto L_0x00da
            double[] r1 = r0.f2139p
            r16 = r1[r13]
            r18 = r1[r15]
            r1 = r8
            r2 = r23
            r3 = r27
            r4 = r12
            r5 = r25
            r7 = r16
            r20 = r9
            r9 = r18
            boolean r1 = r1.mo2750j(r2, r3, r4, r5, r7, r9)
            r1 = r1 | r14
            r14 = r1
            goto L_0x00dc
        L_0x00da:
            r20 = r9
        L_0x00dc:
            r1 = 1
        L_0x00dd:
            u.b[] r2 = r0.f2132i
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0103
            r2 = r2[r1]
            float[] r3 = r0.f2143t
            r4 = r20
            r2.mo23545e(r4, r3)
            androidx.constraintlayout.motion.widget.p r2 = r0.f2128e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.f2162m
            java.lang.String[] r3 = r0.f2140q
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.a r2 = (androidx.constraintlayout.widget.C0558a) r2
            float[] r3 = r0.f2143t
            r2.mo2892i(r11, r3)
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0103:
            androidx.constraintlayout.motion.widget.m r1 = r0.f2130g
            int r2 = r1.f2098c
            if (r2 != 0) goto L_0x012d
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0114
            int r1 = r1.f2099d
            r11.setVisibility(r1)
            goto L_0x012d
        L_0x0114:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0122
            androidx.constraintlayout.motion.widget.m r1 = r0.f2131h
            int r1 = r1.f2099d
            r11.setVisibility(r1)
            goto L_0x012d
        L_0x0122:
            androidx.constraintlayout.motion.widget.m r2 = r0.f2131h
            int r2 = r2.f2099d
            int r1 = r1.f2099d
            if (r2 == r1) goto L_0x012d
            r11.setVisibility(r13)
        L_0x012d:
            androidx.constraintlayout.motion.widget.l[] r1 = r0.f2122A
            if (r1 == 0) goto L_0x018b
            r1 = 0
        L_0x0132:
            androidx.constraintlayout.motion.widget.l[] r2 = r0.f2122A
            int r3 = r2.length
            if (r1 >= r3) goto L_0x018b
            r2 = r2[r1]
            r2.mo2642r(r12, r11)
            int r1 = r1 + 1
            goto L_0x0132
        L_0x013f:
            androidx.constraintlayout.motion.widget.p r1 = r0.f2128e
            float r2 = r1.f2155f
            androidx.constraintlayout.motion.widget.p r3 = r0.f2129f
            float r4 = r3.f2155f
            float r4 = r4 - r2
            float r4 = r4 * r12
            float r2 = r2 + r4
            float r4 = r1.f2156g
            float r5 = r3.f2156g
            float r5 = r5 - r4
            float r5 = r5 * r12
            float r4 = r4 + r5
            float r5 = r1.f2157h
            float r6 = r3.f2157h
            float r7 = r6 - r5
            float r7 = r7 * r12
            float r7 = r7 + r5
            float r1 = r1.f2158i
            float r3 = r3.f2158i
            float r8 = r3 - r1
            float r8 = r8 * r12
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x017b
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0188
        L_0x017b:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
        L_0x0188:
            r11.layout(r10, r9, r2, r4)
        L_0x018b:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.g> r1 = r0.f2149z
            if (r1 == 0) goto L_0x01ba
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0197:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01ba
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.widget.g r1 = (androidx.constraintlayout.motion.widget.C0482g) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0482g.C0488f
            if (r2 == 0) goto L_0x01b6
            androidx.constraintlayout.motion.widget.g$f r1 = (androidx.constraintlayout.motion.widget.C0482g.C0488f) r1
            double[] r2 = r0.f2139p
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.mo2639j(r2, r3, r4, r6)
            goto L_0x0197
        L_0x01b6:
            r1.mo2628f(r11, r12)
            goto L_0x0197
        L_0x01ba:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0508n.mo2663o(android.view.View, float, long, androidx.constraintlayout.motion.widget.e):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2664q(C6246e eVar, C0564c cVar) {
        C0510p pVar = this.f2129f;
        pVar.f2153d = 1.0f;
        pVar.f2154e = 1.0f;
        m2793p(pVar);
        this.f2129f.mo2684s((float) eVar.mo23809R(), (float) eVar.mo23810S(), (float) eVar.mo23808Q(), (float) eVar.mo23853w());
        this.f2129f.mo2671a(cVar.mo2916s(this.f2125b));
        this.f2131h.mo2651m(eVar, cVar, this.f2125b);
    }

    /* renamed from: r */
    public void mo2665r(int i) {
        this.f2123B = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2666s(View view) {
        C0510p pVar = this.f2128e;
        pVar.f2153d = 0.0f;
        pVar.f2154e = 0.0f;
        pVar.mo2684s(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f2130g.mo2650l(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2667t(C6246e eVar, C0564c cVar) {
        C0510p pVar = this.f2128e;
        pVar.f2153d = 0.0f;
        pVar.f2154e = 0.0f;
        m2793p(pVar);
        this.f2128e.mo2684s((float) eVar.mo23809R(), (float) eVar.mo23810S(), (float) eVar.mo23808Q(), (float) eVar.mo23853w());
        C0564c.C0565a s = cVar.mo2916s(this.f2125b);
        this.f2128e.mo2671a(s);
        this.f2134k = s.f2478c.f2551f;
        this.f2130g.mo2651m(eVar, cVar, this.f2125b);
    }

    public String toString() {
        return " start: x: " + this.f2128e.f2155f + " y: " + this.f2128e.f2156g + " end: x: " + this.f2129f.f2155f + " y: " + this.f2129f.f2156g;
    }

    /* renamed from: u */
    public void mo2669u(View view) {
        this.f2124a = view;
        this.f2125b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f2126c = ((ConstraintLayout.LayoutParams) layoutParams).mo2857a();
        }
    }

    /* renamed from: v */
    public void mo2670v(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        C0532s sVar;
        C0558a aVar;
        C0515r rVar;
        C0558a aVar2;
        Class<double> cls = double.class;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i3 = this.f2123B;
        if (i3 != C0476c.f1967f) {
            this.f2128e.f2161l = i3;
        }
        this.f2130g.mo2648j(this.f2131h, hashSet2);
        ArrayList<C0476c> arrayList2 = this.f2146w;
        if (arrayList2 != null) {
            Iterator<C0476c> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                C0476c next = it.next();
                if (next instanceof C0500i) {
                    C0500i iVar = (C0500i) next;
                    m2792n(new C0510p(i, i2, iVar, this.f2128e, this.f2129f));
                    int i4 = iVar.f2053g;
                    if (i4 != C0476c.f1967f) {
                        this.f2127d = i4;
                    }
                } else if (next instanceof C0480f) {
                    next.mo2616b(hashSet3);
                } else if (next instanceof C0503k) {
                    next.mo2616b(hashSet);
                } else if (next instanceof C0505l) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C0505l) next);
                } else {
                    next.mo2619e(hashMap);
                    next.mo2616b(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c = 0;
        if (arrayList != null) {
            this.f2122A = (C0505l[]) arrayList.toArray(new C0505l[0]);
        }
        char c2 = 1;
        if (!hashSet2.isEmpty()) {
            this.f2148y = new HashMap<>();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[c2];
                    Iterator<C0476c> it3 = this.f2146w.iterator();
                    while (it3.hasNext()) {
                        C0476c next2 = it3.next();
                        HashMap<String, C0558a> hashMap2 = next2.f1972e;
                        if (!(hashMap2 == null || (aVar2 = hashMap2.get(str2)) == null)) {
                            sparseArray.append(next2.f1968a, aVar2);
                        }
                    }
                    rVar = C0515r.m2906c(str, sparseArray);
                } else {
                    rVar = C0515r.m2907d(str);
                }
                if (rVar != null) {
                    rVar.mo2736g(str);
                    this.f2148y.put(str, rVar);
                }
                c2 = 1;
            }
            ArrayList<C0476c> arrayList3 = this.f2146w;
            if (arrayList3 != null) {
                Iterator<C0476c> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C0476c next3 = it4.next();
                    if (next3 instanceof C0477d) {
                        next3.mo2615a(this.f2148y);
                    }
                }
            }
            this.f2130g.mo2643a(this.f2148y, 0);
            this.f2131h.mo2643a(this.f2148y, 100);
            for (String next4 : this.f2148y.keySet()) {
                this.f2148y.get(next4).mo2737h(hashMap.containsKey(next4) ? ((Integer) hashMap.get(next4)).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f2147x == null) {
                this.f2147x = new HashMap<>();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str3 = (String) it5.next();
                if (!this.f2147x.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str4 = str3.split(",")[1];
                        Iterator<C0476c> it6 = this.f2146w.iterator();
                        while (it6.hasNext()) {
                            C0476c next5 = it6.next();
                            HashMap<String, C0558a> hashMap3 = next5.f1972e;
                            if (!(hashMap3 == null || (aVar = hashMap3.get(str4)) == null)) {
                                sparseArray2.append(next5.f1968a, aVar);
                            }
                        }
                        sVar = C0532s.m2936c(str3, sparseArray2);
                        long j2 = j;
                    } else {
                        sVar = C0532s.m2937d(str3, j);
                    }
                    if (sVar != null) {
                        sVar.mo2746h(str3);
                        this.f2147x.put(str3, sVar);
                    }
                }
            }
            ArrayList<C0476c> arrayList4 = this.f2146w;
            if (arrayList4 != null) {
                Iterator<C0476c> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    C0476c next6 = it7.next();
                    if (next6 instanceof C0503k) {
                        ((C0503k) next6).mo2641M(this.f2147x);
                    }
                }
            }
            for (String next7 : this.f2147x.keySet()) {
                this.f2147x.get(next7).mo2747i(hashMap.containsKey(next7) ? ((Integer) hashMap.get(next7)).intValue() : 0);
            }
        }
        int i5 = 2;
        int size = this.f2144u.size() + 2;
        C0510p[] pVarArr = new C0510p[size];
        pVarArr[0] = this.f2128e;
        pVarArr[size - 1] = this.f2129f;
        if (this.f2144u.size() > 0 && this.f2127d == -1) {
            this.f2127d = 0;
        }
        Iterator<C0510p> it8 = this.f2144u.iterator();
        int i6 = 1;
        while (it8.hasNext()) {
            pVarArr[i6] = it8.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String next8 : this.f2129f.f2162m.keySet()) {
            if (this.f2128e.f2162m.containsKey(next8)) {
                if (!hashSet2.contains("CUSTOM," + next8)) {
                    hashSet4.add(next8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f2140q = strArr2;
        this.f2141r = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.f2140q;
            if (i7 >= strArr.length) {
                break;
            }
            String str5 = strArr[i7];
            this.f2141r[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                } else if (pVarArr[i8].f2162m.containsKey(str5)) {
                    int[] iArr = this.f2141r;
                    iArr[i7] = iArr[i7] + pVarArr[i8].f2162m.get(str5).mo2891f();
                    break;
                } else {
                    i8++;
                }
            }
            i7++;
        }
        boolean z = pVarArr[0].f2161l != C0476c.f1967f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < size; i9++) {
            pVarArr[i9].mo2674d(pVarArr[i9 - 1], zArr, this.f2140q, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        int[] iArr2 = new int[i10];
        this.f2137n = iArr2;
        this.f2138o = new double[iArr2.length];
        this.f2139p = new double[iArr2.length];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.f2137n[i12] = i13;
                i12++;
            }
        }
        int[] iArr3 = new int[2];
        iArr3[1] = this.f2137n.length;
        iArr3[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(cls, iArr3);
        double[] dArr2 = new double[size];
        for (int i14 = 0; i14 < size; i14++) {
            pVarArr[i14].mo2675i(dArr[i14], this.f2137n);
            dArr2[i14] = (double) pVarArr[i14].f2153d;
        }
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.f2137n;
            if (i15 >= iArr4.length) {
                break;
            }
            if (iArr4[i15] < C0510p.f2150q.length) {
                String str6 = C0510p.f2150q[this.f2137n[i15]] + " [";
                for (int i16 = 0; i16 < size; i16++) {
                    str6 = str6 + dArr[i16][i15];
                }
            }
            i15++;
        }
        this.f2132i = new C6162b[(this.f2140q.length + 1)];
        int i17 = 0;
        while (true) {
            String[] strArr3 = this.f2140q;
            if (i17 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i17];
            int i18 = 0;
            double[] dArr3 = null;
            int i19 = 0;
            double[][] dArr4 = null;
            while (i18 < size) {
                if (pVarArr[i18].mo2680n(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr5 = new int[i5];
                        iArr5[1] = pVarArr[i18].mo2678l(str7);
                        iArr5[c] = size;
                        dArr4 = (double[][]) Array.newInstance(cls, iArr5);
                    }
                    dArr3[i19] = (double) pVarArr[i18].f2153d;
                    pVarArr[i18].mo2677k(str7, dArr4[i19], 0);
                    i19++;
                }
                i18++;
                i5 = 2;
                c = 0;
            }
            i17++;
            this.f2132i[i17] = C6162b.m27039a(this.f2127d, Arrays.copyOf(dArr3, i19), (double[][]) Arrays.copyOf(dArr4, i19));
            i5 = 2;
            c = 0;
        }
        this.f2132i[0] = C6162b.m27039a(this.f2127d, dArr2, dArr);
        if (pVarArr[0].f2161l != C0476c.f1967f) {
            int[] iArr6 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr7 = new int[2];
            iArr7[1] = 2;
            iArr7[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr7);
            for (int i20 = 0; i20 < size; i20++) {
                iArr6[i20] = pVarArr[i20].f2161l;
                dArr5[i20] = (double) pVarArr[i20].f2153d;
                dArr6[i20][0] = (double) pVarArr[i20].f2155f;
                dArr6[i20][1] = (double) pVarArr[i20].f2156g;
            }
            this.f2133j = C6162b.m27040b(iArr6, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.f2149z = new HashMap<>();
        if (this.f2146w != null) {
            Iterator it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String str8 = (String) it9.next();
                C0482g c3 = C0482g.m2689c(str8);
                if (c3 != null) {
                    if (c3.mo2631i() && Float.isNaN(f2)) {
                        f2 = m2791m();
                    }
                    c3.mo2629g(str8);
                    this.f2149z.put(str8, c3);
                }
            }
            Iterator<C0476c> it10 = this.f2146w.iterator();
            while (it10.hasNext()) {
                C0476c next9 = it10.next();
                if (next9 instanceof C0480f) {
                    ((C0480f) next9).mo2622O(this.f2149z);
                }
            }
            for (C0482g h : this.f2149z.values()) {
                h.mo2630h(f2);
            }
        }
    }
}
