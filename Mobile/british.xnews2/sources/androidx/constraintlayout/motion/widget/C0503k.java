package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0572f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.k */
/* compiled from: KeyTimeCycle */
public class C0503k extends C0476c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f2054g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f2055h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f2056i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f2057j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f2058k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f2059l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f2060m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f2061n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f2062o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f2063p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f2064q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f2065r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f2066s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f2067t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f2068u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f2069v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f2070w = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.k$a */
    /* compiled from: KeyTimeCycle */
    private static class C0504a {

        /* renamed from: a */
        private static SparseIntArray f2071a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2071a = sparseIntArray;
            sparseIntArray.append(C0572f.f2595C4, 1);
            f2071a.append(C0572f.f2676L4, 2);
            f2071a.append(C0572f.f2640H4, 4);
            f2071a.append(C0572f.f2649I4, 5);
            f2071a.append(C0572f.f2658J4, 6);
            f2071a.append(C0572f.f2622F4, 7);
            f2071a.append(C0572f.f2730R4, 8);
            f2071a.append(C0572f.f2721Q4, 9);
            f2071a.append(C0572f.f2712P4, 10);
            f2071a.append(C0572f.f2694N4, 12);
            f2071a.append(C0572f.f2685M4, 13);
            f2071a.append(C0572f.f2631G4, 14);
            f2071a.append(C0572f.f2604D4, 15);
            f2071a.append(C0572f.f2613E4, 16);
            f2071a.append(C0572f.f2667K4, 17);
            f2071a.append(C0572f.f2703O4, 18);
            f2071a.append(C0572f.f2748T4, 20);
            f2071a.append(C0572f.f2739S4, 21);
            f2071a.append(C0572f.f2757U4, 19);
        }

        /* renamed from: a */
        public static void m2762a(C0503k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2071a.get(index)) {
                    case 1:
                        float unused = kVar.f2056i = typedArray.getFloat(index, kVar.f2056i);
                        break;
                    case 2:
                        float unused2 = kVar.f2057j = typedArray.getDimension(index, kVar.f2057j);
                        break;
                    case 4:
                        float unused3 = kVar.f2058k = typedArray.getFloat(index, kVar.f2058k);
                        break;
                    case 5:
                        float unused4 = kVar.f2059l = typedArray.getFloat(index, kVar.f2059l);
                        break;
                    case 6:
                        float unused5 = kVar.f2060m = typedArray.getFloat(index, kVar.f2060m);
                        break;
                    case 7:
                        float unused6 = kVar.f2062o = typedArray.getFloat(index, kVar.f2062o);
                        break;
                    case 8:
                        float unused7 = kVar.f2061n = typedArray.getFloat(index, kVar.f2061n);
                        break;
                    case 9:
                        String unused8 = kVar.f2054g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1843Z0) {
                            if (typedArray.peekValue(index).type != 3) {
                                kVar.f1969b = typedArray.getResourceId(index, kVar.f1969b);
                                break;
                            } else {
                                kVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, kVar.f1969b);
                            kVar.f1969b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                kVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        kVar.f1968a = typedArray.getInt(index, kVar.f1968a);
                        break;
                    case 13:
                        int unused9 = kVar.f2055h = typedArray.getInteger(index, kVar.f2055h);
                        break;
                    case 14:
                        float unused10 = kVar.f2063p = typedArray.getFloat(index, kVar.f2063p);
                        break;
                    case 15:
                        float unused11 = kVar.f2064q = typedArray.getDimension(index, kVar.f2064q);
                        break;
                    case 16:
                        float unused12 = kVar.f2065r = typedArray.getDimension(index, kVar.f2065r);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = kVar.f2066s = typedArray.getDimension(index, kVar.f2066s);
                            break;
                        }
                    case 18:
                        float unused14 = kVar.f2067t = typedArray.getFloat(index, kVar.f2067t);
                        break;
                    case 19:
                        int unused15 = kVar.f2068u = typedArray.getInt(index, kVar.f2068u);
                        break;
                    case 20:
                        float unused16 = kVar.f2069v = typedArray.getFloat(index, kVar.f2069v);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused17 = kVar.f2070w = typedArray.getFloat(index, kVar.f2070w);
                            break;
                        } else {
                            float unused18 = kVar.f2070w = typedArray.getDimension(index, kVar.f2070w);
                            break;
                        }
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2071a.get(index));
                        break;
                }
            }
        }
    }

    public C0503k() {
        this.f1971d = 3;
        this.f1972e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r1.equals("scaleY") == false) goto L_0x004a;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2641M(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0532s> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.s r3 = (androidx.constraintlayout.motion.widget.C0532s) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.f1972e
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0558a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.s$b r4 = (androidx.constraintlayout.motion.widget.C0532s.C0534b) r4
            int r5 = r10.f1968a
            float r7 = r10.f2069v
            int r8 = r10.f2068u
            float r9 = r10.f2070w
            r4.mo2749j(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00cb;
                case -1249320805: goto L_0x00c0;
                case -1225497657: goto L_0x00b5;
                case -1225497656: goto L_0x00aa;
                case -1225497655: goto L_0x009f;
                case -1001078227: goto L_0x0094;
                case -908189618: goto L_0x0089;
                case -908189617: goto L_0x0080;
                case -40300674: goto L_0x0074;
                case -4379043: goto L_0x0067;
                case 37232917: goto L_0x005a;
                case 92909918: goto L_0x004d;
                default: goto L_0x004a;
            }
        L_0x004a:
            r4 = -1
            goto L_0x00d6
        L_0x004d:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0056
            goto L_0x004a
        L_0x0056:
            r4 = 11
            goto L_0x00d6
        L_0x005a:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0063
            goto L_0x004a
        L_0x0063:
            r4 = 10
            goto L_0x00d6
        L_0x0067:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0070
            goto L_0x004a
        L_0x0070:
            r4 = 9
            goto L_0x00d6
        L_0x0074:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x007d
            goto L_0x004a
        L_0x007d:
            r4 = 8
            goto L_0x00d6
        L_0x0080:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d6
            goto L_0x004a
        L_0x0089:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0092
            goto L_0x004a
        L_0x0092:
            r4 = 6
            goto L_0x00d6
        L_0x0094:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009d
            goto L_0x004a
        L_0x009d:
            r4 = 5
            goto L_0x00d6
        L_0x009f:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a8
            goto L_0x004a
        L_0x00a8:
            r4 = 4
            goto L_0x00d6
        L_0x00aa:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b3
            goto L_0x004a
        L_0x00b3:
            r4 = 3
            goto L_0x00d6
        L_0x00b5:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00be
            goto L_0x004a
        L_0x00be:
            r4 = 2
            goto L_0x00d6
        L_0x00c0:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c9
            goto L_0x004a
        L_0x00c9:
            r4 = 1
            goto L_0x00d6
        L_0x00cb:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d5
            goto L_0x004a
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            switch(r4) {
                case 0: goto L_0x01f3;
                case 1: goto L_0x01dc;
                case 2: goto L_0x01c5;
                case 3: goto L_0x01ae;
                case 4: goto L_0x0197;
                case 5: goto L_0x0180;
                case 6: goto L_0x0169;
                case 7: goto L_0x0152;
                case 8: goto L_0x013b;
                case 9: goto L_0x0124;
                case 10: goto L_0x010d;
                case 11: goto L_0x00f6;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f6:
            float r1 = r10.f2056i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2056i
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x010d:
            float r1 = r10.f2061n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2061n
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0124:
            float r1 = r10.f2057j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2057j
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x013b:
            float r1 = r10.f2058k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2058k
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0152:
            float r1 = r10.f2063p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2063p
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0169:
            float r1 = r10.f2062o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2062o
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0180:
            float r1 = r10.f2067t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2067t
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0197:
            float r1 = r10.f2066s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2066s
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01ae:
            float r1 = r10.f2065r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2065r
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01c5:
            float r1 = r10.f2064q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2064q
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01dc:
            float r1 = r10.f2060m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2060m
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01f3:
            float r1 = r10.f2059l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1968a
            float r5 = r10.f2059l
            float r6 = r10.f2069v
            int r7 = r10.f2068u
            float r8 = r10.f2070w
            r3.mo2743e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0503k.mo2641M(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo2615a(HashMap<String, C0515r> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public void mo2616b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f2056i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2057j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2058k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2059l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2060m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2064q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2065r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2066s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f2061n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2062o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2063p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2067t)) {
            hashSet.add("progress");
        }
        if (this.f1972e.size() > 0) {
            for (String str : this.f1972e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: c */
    public void mo2617c(Context context, AttributeSet attributeSet) {
        C0504a.m2762a(this, context.obtainStyledAttributes(attributeSet, C0572f.f2586B4));
    }

    /* renamed from: e */
    public void mo2619e(HashMap<String, Integer> hashMap) {
        if (this.f2055h != -1) {
            if (!Float.isNaN(this.f2056i)) {
                hashMap.put("alpha", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2057j)) {
                hashMap.put("elevation", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2058k)) {
                hashMap.put("rotation", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2059l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2060m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2064q)) {
                hashMap.put("translationX", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2065r)) {
                hashMap.put("translationY", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2066s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2061n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2062o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2062o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f2055h));
            }
            if (!Float.isNaN(this.f2067t)) {
                hashMap.put("progress", Integer.valueOf(this.f2055h));
            }
            if (this.f1972e.size() > 0) {
                for (String str : this.f1972e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f2055h));
                }
            }
        }
    }
}
