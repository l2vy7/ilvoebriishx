package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0558a;
import androidx.constraintlayout.widget.C0572f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.f */
/* compiled from: KeyCycle */
public class C0480f extends C0476c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1992g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1993h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1994i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1995j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1996k = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1997l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f1998m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1999n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f2000o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f2001p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f2002q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f2003r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f2004s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f2005t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f2006u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f2007v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f2008w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public float f2009x = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    /* compiled from: KeyCycle */
    private static class C0481a {

        /* renamed from: a */
        private static SparseIntArray f2010a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2010a = sparseIntArray;
            sparseIntArray.append(C0572f.f2881h4, 1);
            f2010a.append(C0572f.f2861f4, 2);
            f2010a.append(C0572f.f2891i4, 3);
            f2010a.append(C0572f.f2851e4, 4);
            f2010a.append(C0572f.f2931m4, 5);
            f2010a.append(C0572f.f2921l4, 6);
            f2010a.append(C0572f.f2911k4, 7);
            f2010a.append(C0572f.f2940n4, 8);
            f2010a.append(C0572f.f2756U3, 9);
            f2010a.append(C0572f.f2841d4, 10);
            f2010a.append(C0572f.f2801Z3, 11);
            f2010a.append(C0572f.f2811a4, 12);
            f2010a.append(C0572f.f2821b4, 13);
            f2010a.append(C0572f.f2901j4, 14);
            f2010a.append(C0572f.f2783X3, 15);
            f2010a.append(C0572f.f2792Y3, 16);
            f2010a.append(C0572f.f2765V3, 17);
            f2010a.append(C0572f.f2774W3, 18);
            f2010a.append(C0572f.f2831c4, 19);
            f2010a.append(C0572f.f2871g4, 20);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m2688b(C0480f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2010a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1843Z0) {
                            if (typedArray.peekValue(index).type != 3) {
                                fVar.f1969b = typedArray.getResourceId(index, fVar.f1969b);
                                break;
                            } else {
                                fVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fVar.f1969b);
                            fVar.f1969b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                fVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        fVar.f1968a = typedArray.getInt(index, fVar.f1968a);
                        break;
                    case 3:
                        String unused = fVar.f1992g = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = fVar.f1993h = typedArray.getInteger(index, fVar.f1993h);
                        break;
                    case 5:
                        int unused3 = fVar.f1994i = typedArray.getInt(index, fVar.f1994i);
                        break;
                    case 6:
                        float unused4 = fVar.f1995j = typedArray.getFloat(index, fVar.f1995j);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused5 = fVar.f1996k = typedArray.getFloat(index, fVar.f1996k);
                            break;
                        } else {
                            float unused6 = fVar.f1996k = typedArray.getDimension(index, fVar.f1996k);
                            break;
                        }
                    case 8:
                        int unused7 = fVar.f1998m = typedArray.getInt(index, fVar.f1998m);
                        break;
                    case 9:
                        float unused8 = fVar.f1999n = typedArray.getFloat(index, fVar.f1999n);
                        break;
                    case 10:
                        float unused9 = fVar.f2000o = typedArray.getDimension(index, fVar.f2000o);
                        break;
                    case 11:
                        float unused10 = fVar.f2001p = typedArray.getFloat(index, fVar.f2001p);
                        break;
                    case 12:
                        float unused11 = fVar.f2003r = typedArray.getFloat(index, fVar.f2003r);
                        break;
                    case 13:
                        float unused12 = fVar.f2004s = typedArray.getFloat(index, fVar.f2004s);
                        break;
                    case 14:
                        float unused13 = fVar.f2002q = typedArray.getFloat(index, fVar.f2002q);
                        break;
                    case 15:
                        float unused14 = fVar.f2005t = typedArray.getFloat(index, fVar.f2005t);
                        break;
                    case 16:
                        float unused15 = fVar.f2006u = typedArray.getFloat(index, fVar.f2006u);
                        break;
                    case 17:
                        float unused16 = fVar.f2007v = typedArray.getDimension(index, fVar.f2007v);
                        break;
                    case 18:
                        float unused17 = fVar.f2008w = typedArray.getDimension(index, fVar.f2008w);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused18 = fVar.f2009x = typedArray.getDimension(index, fVar.f2009x);
                            break;
                        }
                    case 20:
                        float unused19 = fVar.f1997l = typedArray.getFloat(index, fVar.f1997l);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2010a.get(index));
                        break;
                }
            }
        }
    }

    public C0480f() {
        this.f1971d = 4;
        this.f1972e = new HashMap<>();
    }

    /* renamed from: O */
    public void mo2622O(HashMap<String, C0482g> hashMap) {
        C0558a aVar;
        HashMap<String, C0482g> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM") && (aVar = this.f1972e.get(next.substring(7))) != null && aVar.mo2888c() == C0558a.C0560b.FLOAT_TYPE) {
                hashMap2.get(next).mo2627e(this.f1968a, this.f1994i, this.f1998m, this.f1995j, this.f1996k, aVar.mo2889d(), aVar);
            }
            float P = mo2623P(next);
            if (!Float.isNaN(P)) {
                hashMap2.get(next).mo2626d(this.f1968a, this.f1994i, this.f1998m, this.f1995j, this.f1996k, P);
            }
        }
    }

    /* renamed from: P */
    public float mo2623P(String str) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f2003r;
            case 1:
                return this.f2004s;
            case 2:
                return this.f2007v;
            case 3:
                return this.f2008w;
            case 4:
                return this.f2009x;
            case 5:
                return this.f1997l;
            case 6:
                return this.f2005t;
            case 7:
                return this.f2006u;
            case 8:
                return this.f2001p;
            case 9:
                return this.f2000o;
            case 10:
                return this.f2002q;
            case 11:
                return this.f1999n;
            case 12:
                return this.f1996k;
            default:
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    /* renamed from: a */
    public void mo2615a(HashMap<String, C0515r> hashMap) {
        C0474a.m2603e("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            C0515r rVar = hashMap.get(next);
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 8;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 9;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 10;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (next.equals("waveOffset")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    rVar.mo2734e(this.f1968a, this.f2003r);
                    break;
                case 1:
                    rVar.mo2734e(this.f1968a, this.f2004s);
                    break;
                case 2:
                    rVar.mo2734e(this.f1968a, this.f2007v);
                    break;
                case 3:
                    rVar.mo2734e(this.f1968a, this.f2008w);
                    break;
                case 4:
                    rVar.mo2734e(this.f1968a, this.f2009x);
                    break;
                case 5:
                    rVar.mo2734e(this.f1968a, this.f1997l);
                    break;
                case 6:
                    rVar.mo2734e(this.f1968a, this.f2005t);
                    break;
                case 7:
                    rVar.mo2734e(this.f1968a, this.f2006u);
                    break;
                case 8:
                    rVar.mo2734e(this.f1968a, this.f2001p);
                    break;
                case 9:
                    rVar.mo2734e(this.f1968a, this.f2000o);
                    break;
                case 10:
                    rVar.mo2734e(this.f1968a, this.f2002q);
                    break;
                case 11:
                    rVar.mo2734e(this.f1968a, this.f1999n);
                    break;
                case 12:
                    rVar.mo2734e(this.f1968a, this.f1996k);
                    break;
                default:
                    Log.v("WARNING KeyCycle", "  UNKNOWN  " + next);
                    break;
            }
        }
    }

    /* renamed from: b */
    public void mo2616b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1999n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2000o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2001p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2003r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2004s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2005t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2006u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2002q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2007v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2008w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2009x)) {
            hashSet.add("translationZ");
        }
        if (this.f1972e.size() > 0) {
            for (String str : this.f1972e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: c */
    public void mo2617c(Context context, AttributeSet attributeSet) {
        C0481a.m2688b(this, context.obtainStyledAttributes(attributeSet, C0572f.f2747T3));
    }
}
