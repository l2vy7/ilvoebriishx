package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0572f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.l */
/* compiled from: KeyTrigger */
public class C0505l extends C0476c {

    /* renamed from: g */
    private int f2072g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f2073h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f2074i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f2075j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f2076k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f2077l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f2078m;

    /* renamed from: n */
    private View f2079n;

    /* renamed from: o */
    float f2080o;

    /* renamed from: p */
    private boolean f2081p;

    /* renamed from: q */
    private boolean f2082q;

    /* renamed from: r */
    private boolean f2083r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f2084s;

    /* renamed from: t */
    private Method f2085t;

    /* renamed from: u */
    private Method f2086u;

    /* renamed from: v */
    private Method f2087v;

    /* renamed from: w */
    private float f2088w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f2089x;

    /* renamed from: y */
    RectF f2090y;

    /* renamed from: z */
    RectF f2091z;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    /* compiled from: KeyTrigger */
    private static class C0506a {

        /* renamed from: a */
        private static SparseIntArray f2092a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2092a = sparseIntArray;
            sparseIntArray.append(C0572f.f2775W4, 8);
            f2092a.append(C0572f.f2812a5, 4);
            f2092a.append(C0572f.f2822b5, 1);
            f2092a.append(C0572f.f2832c5, 2);
            f2092a.append(C0572f.f2784X4, 7);
            f2092a.append(C0572f.f2842d5, 6);
            f2092a.append(C0572f.f2862f5, 5);
            f2092a.append(C0572f.f2802Z4, 9);
            f2092a.append(C0572f.f2793Y4, 10);
            f2092a.append(C0572f.f2852e5, 11);
        }

        /* renamed from: a */
        public static void m2780a(C0505l lVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2092a.get(index)) {
                    case 1:
                        String unused = lVar.f2075j = typedArray.getString(index);
                        continue;
                    case 2:
                        String unused2 = lVar.f2076k = typedArray.getString(index);
                        continue;
                    case 4:
                        String unused3 = lVar.f2073h = typedArray.getString(index);
                        continue;
                    case 5:
                        lVar.f2080o = typedArray.getFloat(index, lVar.f2080o);
                        continue;
                    case 6:
                        int unused4 = lVar.f2077l = typedArray.getResourceId(index, lVar.f2077l);
                        continue;
                    case 7:
                        if (!MotionLayout.f1843Z0) {
                            if (typedArray.peekValue(index).type != 3) {
                                lVar.f1969b = typedArray.getResourceId(index, lVar.f1969b);
                                break;
                            } else {
                                lVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, lVar.f1969b);
                            lVar.f1969b = resourceId;
                            if (resourceId == -1) {
                                lVar.f1970c = typedArray.getString(index);
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, lVar.f1968a);
                        lVar.f1968a = integer;
                        float unused5 = lVar.f2084s = (((float) integer) + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        int unused6 = lVar.f2078m = typedArray.getResourceId(index, lVar.f2078m);
                        continue;
                    case 10:
                        boolean unused7 = lVar.f2089x = typedArray.getBoolean(index, lVar.f2089x);
                        continue;
                    case 11:
                        int unused8 = lVar.f2074i = typedArray.getResourceId(index, lVar.f2074i);
                        break;
                }
                Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2092a.get(index));
            }
        }
    }

    public C0505l() {
        int i = C0476c.f1967f;
        this.f2074i = i;
        this.f2075j = null;
        this.f2076k = null;
        this.f2077l = i;
        this.f2078m = i;
        this.f2079n = null;
        this.f2080o = 0.1f;
        this.f2081p = true;
        this.f2082q = true;
        this.f2083r = true;
        this.f2084s = Float.NaN;
        this.f2089x = false;
        this.f2090y = new RectF();
        this.f2091z = new RectF();
        this.f1971d = 5;
        this.f1972e = new HashMap<>();
    }

    /* renamed from: s */
    private void m2775s(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public void mo2615a(HashMap<String, C0515r> hashMap) {
    }

    /* renamed from: b */
    public void mo2616b(HashSet<String> hashSet) {
    }

    /* renamed from: c */
    public void mo2617c(Context context, AttributeSet attributeSet) {
        C0506a.m2780a(this, context.obtainStyledAttributes(attributeSet, C0572f.f2766V4), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011a A[SYNTHETIC, Splitter:B:73:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0193 A[SYNTHETIC, Splitter:B:86:0x0193] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0208  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2642r(float r11, android.view.View r12) {
        /*
            r10 = this;
            int r0 = r10.f2078m
            int r1 = androidx.constraintlayout.motion.widget.C0476c.f1967f
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r10.f2079n
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r12.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r10.f2078m
            android.view.View r0 = r0.findViewById(r1)
            r10.f2079n = r0
        L_0x001a:
            android.graphics.RectF r0 = r10.f2090y
            android.view.View r1 = r10.f2079n
            boolean r4 = r10.f2089x
            r10.m2775s(r0, r1, r4)
            android.graphics.RectF r0 = r10.f2091z
            boolean r1 = r10.f2089x
            r10.m2775s(r0, r12, r1)
            android.graphics.RectF r0 = r10.f2090y
            android.graphics.RectF r1 = r10.f2091z
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r10.f2081p
            if (r0 == 0) goto L_0x003c
            r10.f2081p = r3
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r10.f2083r
            if (r1 == 0) goto L_0x0045
            r10.f2083r = r3
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r10.f2082q = r2
            r2 = r1
            r1 = 0
            goto L_0x00e0
        L_0x004c:
            boolean r0 = r10.f2081p
            if (r0 != 0) goto L_0x0054
            r10.f2081p = r2
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            boolean r1 = r10.f2082q
            if (r1 == 0) goto L_0x005d
            r10.f2082q = r3
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            r10.f2083r = r2
            goto L_0x00df
        L_0x0062:
            boolean r0 = r10.f2081p
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r10.f2084s
            float r4 = r11 - r0
            float r5 = r10.f2088w
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r10.f2081p = r3
            r0 = 1
            goto L_0x0089
        L_0x0078:
            float r0 = r10.f2084s
            float r0 = r11 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r10.f2080o
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r10.f2081p = r2
        L_0x0088:
            r0 = 0
        L_0x0089:
            boolean r4 = r10.f2082q
            if (r4 == 0) goto L_0x00a2
            float r4 = r10.f2084s
            float r5 = r11 - r4
            float r6 = r10.f2088w
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            r10.f2082q = r3
            r4 = 1
            goto L_0x00b3
        L_0x00a2:
            float r4 = r10.f2084s
            float r4 = r11 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r10.f2080o
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r10.f2082q = r2
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r10.f2083r
            if (r5 == 0) goto L_0x00ce
            float r5 = r10.f2084s
            float r6 = r11 - r5
            float r7 = r10.f2088w
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cb
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cb
            r10.f2083r = r3
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            r1 = r4
            goto L_0x00e0
        L_0x00ce:
            float r1 = r10.f2084s
            float r1 = r11 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r10.f2080o
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00de
            r10.f2083r = r2
        L_0x00de:
            r1 = r4
        L_0x00df:
            r2 = 0
        L_0x00e0:
            r10.f2088w = r11
            if (r1 != 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            if (r2 == 0) goto L_0x00f3
        L_0x00e8:
            android.view.ViewParent r4 = r12.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r10.f2077l
            r4.mo2534d0(r5, r2, r11)
        L_0x00f3:
            int r11 = r10.f2074i
            int r4 = androidx.constraintlayout.motion.widget.C0476c.f1967f
            if (r11 != r4) goto L_0x00fa
            goto L_0x0106
        L_0x00fa:
            android.view.ViewParent r11 = r12.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r12 = r10.f2074i
            android.view.View r12 = r11.findViewById(r12)
        L_0x0106:
            java.lang.String r11 = "Could not find method \""
            java.lang.String r4 = "Exception in call \""
            java.lang.String r5 = " "
            java.lang.String r6 = "\"on class "
            java.lang.String r7 = "KeyTrigger"
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = r10.f2075j
            if (r1 == 0) goto L_0x0189
            java.lang.reflect.Method r1 = r10.f2086u
            if (r1 != 0) goto L_0x0155
            java.lang.Class r1 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0129 }
            java.lang.String r8 = r10.f2075j     // Catch:{ NoSuchMethodException -> 0x0129 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0129 }
            java.lang.reflect.Method r1 = r1.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0129 }
            r10.f2086u = r1     // Catch:{ NoSuchMethodException -> 0x0129 }
            goto L_0x0155
        L_0x0129:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r8 = r10.f2075j
            r1.append(r8)
            r1.append(r6)
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r1.append(r8)
            r1.append(r5)
            java.lang.String r8 = androidx.constraintlayout.motion.widget.C0474a.m2601c(r12)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r7, r1)
        L_0x0155:
            java.lang.reflect.Method r1 = r10.f2086u     // Catch:{ Exception -> 0x015d }
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x015d }
            r1.invoke(r12, r8)     // Catch:{ Exception -> 0x015d }
            goto L_0x0189
        L_0x015d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r8 = r10.f2075j
            r1.append(r8)
            r1.append(r6)
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r1.append(r8)
            r1.append(r5)
            java.lang.String r8 = androidx.constraintlayout.motion.widget.C0474a.m2601c(r12)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r7, r1)
        L_0x0189:
            if (r2 == 0) goto L_0x0202
            java.lang.String r1 = r10.f2076k
            if (r1 == 0) goto L_0x0202
            java.lang.reflect.Method r1 = r10.f2087v
            if (r1 != 0) goto L_0x01ce
            java.lang.Class r1 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x01a2 }
            java.lang.String r2 = r10.f2076k     // Catch:{ NoSuchMethodException -> 0x01a2 }
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x01a2 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r8)     // Catch:{ NoSuchMethodException -> 0x01a2 }
            r10.f2087v = r1     // Catch:{ NoSuchMethodException -> 0x01a2 }
            goto L_0x01ce
        L_0x01a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = r10.f2076k
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = androidx.constraintlayout.motion.widget.C0474a.m2601c(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r7, r1)
        L_0x01ce:
            java.lang.reflect.Method r1 = r10.f2087v     // Catch:{ Exception -> 0x01d6 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01d6 }
            r1.invoke(r12, r2)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x0202
        L_0x01d6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r10.f2076k
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = androidx.constraintlayout.motion.widget.C0474a.m2601c(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r7, r1)
        L_0x0202:
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = r10.f2073h
            if (r0 == 0) goto L_0x027b
            java.lang.reflect.Method r0 = r10.f2085t
            if (r0 != 0) goto L_0x0247
            java.lang.Class r0 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x021b }
            java.lang.String r1 = r10.f2073h     // Catch:{ NoSuchMethodException -> 0x021b }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x021b }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x021b }
            r10.f2085t = r0     // Catch:{ NoSuchMethodException -> 0x021b }
            goto L_0x0247
        L_0x021b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = r10.f2073h
            r0.append(r11)
            r0.append(r6)
            java.lang.Class r11 = r12.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r0.append(r11)
            r0.append(r5)
            java.lang.String r11 = androidx.constraintlayout.motion.widget.C0474a.m2601c(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.e(r7, r11)
        L_0x0247:
            java.lang.reflect.Method r11 = r10.f2085t     // Catch:{ Exception -> 0x024f }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x024f }
            r11.invoke(r12, r0)     // Catch:{ Exception -> 0x024f }
            goto L_0x027b
        L_0x024f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            java.lang.String r0 = r10.f2073h
            r11.append(r0)
            r11.append(r6)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            r11.append(r5)
            java.lang.String r12 = androidx.constraintlayout.motion.widget.C0474a.m2601c(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r7, r11)
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0505l.mo2642r(float, android.view.View):void");
    }
}
