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

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* compiled from: KeyAttributes */
public class C0477d extends C0476c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1973g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1974h = -1;

    /* renamed from: i */
    private boolean f1975i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1976j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1977k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1978l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1979m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1980n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1981o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1982p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1983q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1984r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1985s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1986t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1987u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1988v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f1989w = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    /* compiled from: KeyAttributes */
    private static class C0478a {

        /* renamed from: a */
        private static SparseIntArray f1990a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1990a = sparseIntArray;
            sparseIntArray.append(C0572f.f2585B3, 1);
            f1990a.append(C0572f.f2684M3, 2);
            f1990a.append(C0572f.f2648I3, 4);
            f1990a.append(C0572f.f2657J3, 5);
            f1990a.append(C0572f.f2666K3, 6);
            f1990a.append(C0572f.f2594C3, 19);
            f1990a.append(C0572f.f2603D3, 20);
            f1990a.append(C0572f.f2630G3, 7);
            f1990a.append(C0572f.f2738S3, 8);
            f1990a.append(C0572f.f2729R3, 9);
            f1990a.append(C0572f.f2720Q3, 10);
            f1990a.append(C0572f.f2702O3, 12);
            f1990a.append(C0572f.f2693N3, 13);
            f1990a.append(C0572f.f2639H3, 14);
            f1990a.append(C0572f.f2612E3, 15);
            f1990a.append(C0572f.f2621F3, 16);
            f1990a.append(C0572f.f2675L3, 17);
            f1990a.append(C0572f.f2711P3, 18);
        }

        /* renamed from: a */
        public static void m2644a(C0477d dVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1990a.get(index)) {
                    case 1:
                        float unused = dVar.f1976j = typedArray.getFloat(index, dVar.f1976j);
                        break;
                    case 2:
                        float unused2 = dVar.f1977k = typedArray.getDimension(index, dVar.f1977k);
                        break;
                    case 4:
                        float unused3 = dVar.f1978l = typedArray.getFloat(index, dVar.f1978l);
                        break;
                    case 5:
                        float unused4 = dVar.f1979m = typedArray.getFloat(index, dVar.f1979m);
                        break;
                    case 6:
                        float unused5 = dVar.f1980n = typedArray.getFloat(index, dVar.f1980n);
                        break;
                    case 7:
                        float unused6 = dVar.f1984r = typedArray.getFloat(index, dVar.f1984r);
                        break;
                    case 8:
                        float unused7 = dVar.f1983q = typedArray.getFloat(index, dVar.f1983q);
                        break;
                    case 9:
                        String unused8 = dVar.f1973g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1843Z0) {
                            if (typedArray.peekValue(index).type != 3) {
                                dVar.f1969b = typedArray.getResourceId(index, dVar.f1969b);
                                break;
                            } else {
                                dVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, dVar.f1969b);
                            dVar.f1969b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                dVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        dVar.f1968a = typedArray.getInt(index, dVar.f1968a);
                        break;
                    case 13:
                        int unused9 = dVar.f1974h = typedArray.getInteger(index, dVar.f1974h);
                        break;
                    case 14:
                        float unused10 = dVar.f1985s = typedArray.getFloat(index, dVar.f1985s);
                        break;
                    case 15:
                        float unused11 = dVar.f1986t = typedArray.getDimension(index, dVar.f1986t);
                        break;
                    case 16:
                        float unused12 = dVar.f1987u = typedArray.getDimension(index, dVar.f1987u);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = dVar.f1988v = typedArray.getDimension(index, dVar.f1988v);
                            break;
                        }
                    case 18:
                        float unused14 = dVar.f1989w = typedArray.getFloat(index, dVar.f1989w);
                        break;
                    case 19:
                        float unused15 = dVar.f1981o = typedArray.getDimension(index, dVar.f1981o);
                        break;
                    case 20:
                        float unused16 = dVar.f1982p = typedArray.getDimension(index, dVar.f1982p);
                        break;
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1990a.get(index));
                        break;
                }
            }
        }
    }

    public C0477d() {
        this.f1971d = 1;
        this.f1972e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2615a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0515r> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f8
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.motion.widget.r r2 = (androidx.constraintlayout.motion.widget.C0515r) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x0039
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.f1972e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0558a) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.widget.r$b r2 = (androidx.constraintlayout.motion.widget.C0515r.C0517b) r2
            int r3 = r6.f1968a
            r2.mo2739i(r3, r1)
            goto L_0x0008
        L_0x0039:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00df;
                case -1249320805: goto L_0x00d3;
                case -1225497657: goto L_0x00c7;
                case -1225497656: goto L_0x00bb;
                case -1225497655: goto L_0x00b0;
                case -1001078227: goto L_0x00a5;
                case -908189618: goto L_0x009a;
                case -908189617: goto L_0x0091;
                case -760884510: goto L_0x0085;
                case -760884509: goto L_0x0078;
                case -40300674: goto L_0x006b;
                case -4379043: goto L_0x005e;
                case 37232917: goto L_0x0051;
                case 92909918: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            r4 = -1
            goto L_0x00ea
        L_0x0044:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004d
            goto L_0x0041
        L_0x004d:
            r4 = 13
            goto L_0x00ea
        L_0x0051:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005a
            goto L_0x0041
        L_0x005a:
            r4 = 12
            goto L_0x00ea
        L_0x005e:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0067
            goto L_0x0041
        L_0x0067:
            r4 = 11
            goto L_0x00ea
        L_0x006b:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0074
            goto L_0x0041
        L_0x0074:
            r4 = 10
            goto L_0x00ea
        L_0x0078:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0081
            goto L_0x0041
        L_0x0081:
            r4 = 9
            goto L_0x00ea
        L_0x0085:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x008e
            goto L_0x0041
        L_0x008e:
            r4 = 8
            goto L_0x00ea
        L_0x0091:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00ea
            goto L_0x0041
        L_0x009a:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a3
            goto L_0x0041
        L_0x00a3:
            r4 = 6
            goto L_0x00ea
        L_0x00a5:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ae
            goto L_0x0041
        L_0x00ae:
            r4 = 5
            goto L_0x00ea
        L_0x00b0:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x0041
        L_0x00b9:
            r4 = 4
            goto L_0x00ea
        L_0x00bb:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c5
            goto L_0x0041
        L_0x00c5:
            r4 = 3
            goto L_0x00ea
        L_0x00c7:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d1
            goto L_0x0041
        L_0x00d1:
            r4 = 2
            goto L_0x00ea
        L_0x00d3:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00dd
            goto L_0x0041
        L_0x00dd:
            r4 = 1
            goto L_0x00ea
        L_0x00df:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00e9
            goto L_0x0041
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            switch(r4) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01c5;
                case 3: goto L_0x01b4;
                case 4: goto L_0x01a3;
                case 5: goto L_0x0192;
                case 6: goto L_0x0181;
                case 7: goto L_0x0170;
                case 8: goto L_0x015f;
                case 9: goto L_0x014e;
                case 10: goto L_0x013d;
                case 11: goto L_0x012c;
                case 12: goto L_0x011b;
                case 13: goto L_0x010a;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyAttributes"
            android.util.Log.v(r2, r1)
            goto L_0x0008
        L_0x010a:
            float r1 = r6.f1976j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1976j
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x011b:
            float r1 = r6.f1983q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1983q
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x012c:
            float r1 = r6.f1977k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1977k
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x013d:
            float r1 = r6.f1978l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1978l
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x014e:
            float r1 = r6.f1980n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1982p
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x015f:
            float r1 = r6.f1979m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1981o
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x0170:
            float r1 = r6.f1985s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1985s
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x0181:
            float r1 = r6.f1984r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1984r
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x0192:
            float r1 = r6.f1989w
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1989w
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x01a3:
            float r1 = r6.f1988v
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1988v
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x01b4:
            float r1 = r6.f1987u
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1987u
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x01c5:
            float r1 = r6.f1986t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1986t
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x01d6:
            float r1 = r6.f1980n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1980n
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x01e7:
            float r1 = r6.f1979m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1968a
            float r3 = r6.f1979m
            r2.mo2734e(r1, r3)
            goto L_0x0008
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0477d.mo2615a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public void mo2616b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1976j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1977k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1978l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1979m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1980n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1981o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f1982p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f1986t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1987u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1988v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1983q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1984r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1984r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1989w)) {
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
        C0478a.m2644a(this, context.obtainStyledAttributes(attributeSet, C0572f.f2576A3));
    }

    /* renamed from: e */
    public void mo2619e(HashMap<String, Integer> hashMap) {
        if (this.f1974h != -1) {
            if (!Float.isNaN(this.f1976j)) {
                hashMap.put("alpha", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1977k)) {
                hashMap.put("elevation", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1978l)) {
                hashMap.put("rotation", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1979m)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1980n)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1981o)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1982p)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1986t)) {
                hashMap.put("translationX", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1987u)) {
                hashMap.put("translationY", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1988v)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1983q)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1984r)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1985s)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1974h));
            }
            if (!Float.isNaN(this.f1989w)) {
                hashMap.put("progress", Integer.valueOf(this.f1974h));
            }
            if (this.f1972e.size() > 0) {
                for (String str : this.f1972e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f1974h));
                }
            }
        }
    }
}
