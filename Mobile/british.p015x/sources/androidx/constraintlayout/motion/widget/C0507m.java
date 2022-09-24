package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0515r;
import androidx.constraintlayout.widget.C0558a;
import androidx.constraintlayout.widget.C0564c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p155u.C6164c;
import p166w.C6246e;

/* renamed from: androidx.constraintlayout.motion.widget.m */
/* compiled from: MotionConstrainedPoint */
class C0507m implements Comparable<C0507m> {

    /* renamed from: D */
    static String[] f2093D = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: A */
    int f2094A = 0;

    /* renamed from: B */
    double[] f2095B = new double[18];

    /* renamed from: C */
    double[] f2096C = new double[18];

    /* renamed from: b */
    private float f2097b = 1.0f;

    /* renamed from: c */
    int f2098c = 0;

    /* renamed from: d */
    int f2099d;

    /* renamed from: e */
    private boolean f2100e = false;

    /* renamed from: f */
    private float f2101f = 0.0f;

    /* renamed from: g */
    private float f2102g = 0.0f;

    /* renamed from: h */
    private float f2103h = 0.0f;

    /* renamed from: i */
    public float f2104i = 0.0f;

    /* renamed from: j */
    private float f2105j = 1.0f;

    /* renamed from: k */
    private float f2106k = 1.0f;

    /* renamed from: l */
    private float f2107l = Float.NaN;

    /* renamed from: m */
    private float f2108m = Float.NaN;

    /* renamed from: n */
    private float f2109n = 0.0f;

    /* renamed from: o */
    private float f2110o = 0.0f;

    /* renamed from: p */
    private float f2111p = 0.0f;

    /* renamed from: q */
    private C6164c f2112q;

    /* renamed from: r */
    private int f2113r = 0;

    /* renamed from: s */
    private float f2114s;

    /* renamed from: t */
    private float f2115t;

    /* renamed from: u */
    private float f2116u;

    /* renamed from: v */
    private float f2117v;

    /* renamed from: w */
    private float f2118w;

    /* renamed from: x */
    private float f2119x = Float.NaN;

    /* renamed from: y */
    private float f2120y = Float.NaN;

    /* renamed from: z */
    LinkedHashMap<String, C0558a> f2121z = new LinkedHashMap<>();

    /* renamed from: i */
    private boolean m2781i(float f, float f2) {
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
    public void mo2643a(HashMap<String, C0515r> hashMap, int i) {
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
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f2103h)) {
                        f2 = this.f2103h;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f2104i)) {
                        f2 = this.f2104i;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f2109n)) {
                        f2 = this.f2109n;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f2110o)) {
                        f2 = this.f2110o;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f2111p)) {
                        f2 = this.f2111p;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f2120y)) {
                        f2 = this.f2120y;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f2105j)) {
                        f = this.f2105j;
                    }
                    rVar.mo2734e(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f2106k)) {
                        f = this.f2106k;
                    }
                    rVar.mo2734e(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.f2107l)) {
                        f2 = this.f2107l;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 9:
                    if (!Float.isNaN(this.f2108m)) {
                        f2 = this.f2108m;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.f2102g)) {
                        f2 = this.f2102g;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f2101f)) {
                        f2 = this.f2101f;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 12:
                    if (!Float.isNaN(this.f2119x)) {
                        f2 = this.f2119x;
                    }
                    rVar.mo2734e(i, f2);
                    break;
                case 13:
                    if (!Float.isNaN(this.f2097b)) {
                        f = this.f2097b;
                    }
                    rVar.mo2734e(i, f);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f2121z.containsKey(str)) {
                            Log.e("MotionPaths", "UNKNOWN customName " + str);
                            break;
                        } else {
                            C0558a aVar = this.f2121z.get(str);
                            if (!(rVar instanceof C0515r.C0517b)) {
                                Log.e("MotionPaths", next + " splineSet not a CustomSet frame = " + i + ", value" + aVar.mo2889d() + rVar);
                                break;
                            } else {
                                ((C0515r.C0517b) rVar).mo2739i(i, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: b */
    public void mo2644b(View view) {
        this.f2099d = view.getVisibility();
        this.f2097b = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f2100e = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            this.f2101f = view.getElevation();
        }
        this.f2102g = view.getRotation();
        this.f2103h = view.getRotationX();
        this.f2104i = view.getRotationY();
        this.f2105j = view.getScaleX();
        this.f2106k = view.getScaleY();
        this.f2107l = view.getPivotX();
        this.f2108m = view.getPivotY();
        this.f2109n = view.getTranslationX();
        this.f2110o = view.getTranslationY();
        if (i >= 21) {
            this.f2111p = view.getTranslationZ();
        }
    }

    /* renamed from: c */
    public void mo2645c(C0564c.C0565a aVar) {
        float f;
        C0564c.C0568d dVar = aVar.f2477b;
        int i = dVar.f2555c;
        this.f2098c = i;
        int i2 = dVar.f2554b;
        this.f2099d = i2;
        if (i2 == 0 || i != 0) {
            f = dVar.f2556d;
        } else {
            f = 0.0f;
        }
        this.f2097b = f;
        C0564c.C0569e eVar = aVar.f2480e;
        this.f2100e = eVar.f2570l;
        this.f2101f = eVar.f2571m;
        this.f2102g = eVar.f2560b;
        this.f2103h = eVar.f2561c;
        this.f2104i = eVar.f2562d;
        this.f2105j = eVar.f2563e;
        this.f2106k = eVar.f2564f;
        this.f2107l = eVar.f2565g;
        this.f2108m = eVar.f2566h;
        this.f2109n = eVar.f2567i;
        this.f2110o = eVar.f2568j;
        this.f2111p = eVar.f2569k;
        this.f2112q = C6164c.m27053c(aVar.f2478c.f2548c);
        C0564c.C0567c cVar = aVar.f2478c;
        this.f2119x = cVar.f2552g;
        this.f2113r = cVar.f2550e;
        this.f2120y = aVar.f2477b.f2557e;
        for (String next : aVar.f2481f.keySet()) {
            C0558a aVar2 = aVar.f2481f.get(next);
            if (aVar2.mo2888c() != C0558a.C0560b.STRING_TYPE) {
                this.f2121z.put(next, aVar2);
            }
        }
    }

    /* renamed from: d */
    public int compareTo(C0507m mVar) {
        return Float.compare(this.f2114s, mVar.f2114s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2648j(C0507m mVar, HashSet<String> hashSet) {
        if (m2781i(this.f2097b, mVar.f2097b)) {
            hashSet.add("alpha");
        }
        if (m2781i(this.f2101f, mVar.f2101f)) {
            hashSet.add("elevation");
        }
        int i = this.f2099d;
        int i2 = mVar.f2099d;
        if (i != i2 && this.f2098c == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m2781i(this.f2102g, mVar.f2102g)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2119x) || !Float.isNaN(mVar.f2119x)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2120y) || !Float.isNaN(mVar.f2120y)) {
            hashSet.add("progress");
        }
        if (m2781i(this.f2103h, mVar.f2103h)) {
            hashSet.add("rotationX");
        }
        if (m2781i(this.f2104i, mVar.f2104i)) {
            hashSet.add("rotationY");
        }
        if (m2781i(this.f2107l, mVar.f2107l)) {
            hashSet.add("transformPivotX");
        }
        if (m2781i(this.f2108m, mVar.f2108m)) {
            hashSet.add("transformPivotY");
        }
        if (m2781i(this.f2105j, mVar.f2105j)) {
            hashSet.add("scaleX");
        }
        if (m2781i(this.f2106k, mVar.f2106k)) {
            hashSet.add("scaleY");
        }
        if (m2781i(this.f2109n, mVar.f2109n)) {
            hashSet.add("translationX");
        }
        if (m2781i(this.f2110o, mVar.f2110o)) {
            hashSet.add("translationY");
        }
        if (m2781i(this.f2111p, mVar.f2111p)) {
            hashSet.add("translationZ");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2649k(float f, float f2, float f3, float f4) {
        this.f2115t = f;
        this.f2116u = f2;
        this.f2117v = f3;
        this.f2118w = f4;
    }

    /* renamed from: l */
    public void mo2650l(View view) {
        mo2649k(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo2644b(view);
    }

    /* renamed from: m */
    public void mo2651m(C6246e eVar, C0564c cVar, int i) {
        mo2649k((float) eVar.mo23809R(), (float) eVar.mo23810S(), (float) eVar.mo23808Q(), (float) eVar.mo23853w());
        mo2645c(cVar.mo2916s(i));
    }
}
