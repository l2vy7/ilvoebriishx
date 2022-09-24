package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0474a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p154u.C6164c;
import p165w.C6246e;
import p165w.C6255j;

/* renamed from: androidx.constraintlayout.widget.c */
/* compiled from: ConstraintSet */
public class C0564c {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f2470e = {0, 4, 8};

    /* renamed from: f */
    private static SparseIntArray f2471f;

    /* renamed from: a */
    private boolean f2472a;

    /* renamed from: b */
    private HashMap<String, C0558a> f2473b = new HashMap<>();

    /* renamed from: c */
    private boolean f2474c = true;

    /* renamed from: d */
    private HashMap<Integer, C0565a> f2475d = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* compiled from: ConstraintSet */
    public static class C0565a {

        /* renamed from: a */
        int f2476a;

        /* renamed from: b */
        public final C0568d f2477b = new C0568d();

        /* renamed from: c */
        public final C0567c f2478c = new C0567c();

        /* renamed from: d */
        public final C0566b f2479d = new C0566b();

        /* renamed from: e */
        public final C0569e f2480e = new C0569e();

        /* renamed from: f */
        public HashMap<String, C0558a> f2481f = new HashMap<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m3102f(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2476a = i;
            C0566b bVar = this.f2479d;
            bVar.f2523h = layoutParams.f2374d;
            bVar.f2525i = layoutParams.f2376e;
            bVar.f2527j = layoutParams.f2378f;
            bVar.f2529k = layoutParams.f2380g;
            bVar.f2530l = layoutParams.f2382h;
            bVar.f2531m = layoutParams.f2384i;
            bVar.f2532n = layoutParams.f2386j;
            bVar.f2533o = layoutParams.f2388k;
            bVar.f2534p = layoutParams.f2390l;
            bVar.f2535q = layoutParams.f2398p;
            bVar.f2536r = layoutParams.f2399q;
            bVar.f2537s = layoutParams.f2400r;
            bVar.f2538t = layoutParams.f2401s;
            bVar.f2539u = layoutParams.f2408z;
            bVar.f2540v = layoutParams.f2342A;
            bVar.f2541w = layoutParams.f2343B;
            bVar.f2542x = layoutParams.f2392m;
            bVar.f2543y = layoutParams.f2394n;
            bVar.f2544z = layoutParams.f2396o;
            bVar.f2483A = layoutParams.f2358Q;
            bVar.f2484B = layoutParams.f2359R;
            bVar.f2485C = layoutParams.f2360S;
            bVar.f2521g = layoutParams.f2372c;
            bVar.f2517e = layoutParams.f2368a;
            bVar.f2519f = layoutParams.f2370b;
            bVar.f2513c = layoutParams.width;
            bVar.f2515d = layoutParams.height;
            bVar.f2486D = layoutParams.leftMargin;
            bVar.f2487E = layoutParams.rightMargin;
            bVar.f2488F = layoutParams.topMargin;
            bVar.f2489G = layoutParams.bottomMargin;
            bVar.f2498P = layoutParams.f2347F;
            bVar.f2499Q = layoutParams.f2346E;
            bVar.f2501S = layoutParams.f2349H;
            bVar.f2500R = layoutParams.f2348G;
            bVar.f2524h0 = layoutParams.f2361T;
            bVar.f2526i0 = layoutParams.f2362U;
            bVar.f2502T = layoutParams.f2350I;
            bVar.f2503U = layoutParams.f2351J;
            bVar.f2504V = layoutParams.f2354M;
            bVar.f2505W = layoutParams.f2355N;
            bVar.f2506X = layoutParams.f2352K;
            bVar.f2507Y = layoutParams.f2353L;
            bVar.f2508Z = layoutParams.f2356O;
            bVar.f2510a0 = layoutParams.f2357P;
            bVar.f2522g0 = layoutParams.f2363V;
            bVar.f2493K = layoutParams.f2403u;
            bVar.f2495M = layoutParams.f2405w;
            bVar.f2492J = layoutParams.f2402t;
            bVar.f2494L = layoutParams.f2404v;
            bVar.f2497O = layoutParams.f2406x;
            bVar.f2496N = layoutParams.f2407y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.f2490H = layoutParams.getMarginEnd();
                this.f2479d.f2491I = layoutParams.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m3103g(int i, Constraints.LayoutParams layoutParams) {
            m3102f(i, layoutParams);
            this.f2477b.f2556d = layoutParams.f2422p0;
            C0569e eVar = this.f2480e;
            eVar.f2560b = layoutParams.f2425s0;
            eVar.f2561c = layoutParams.f2426t0;
            eVar.f2562d = layoutParams.f2427u0;
            eVar.f2563e = layoutParams.f2428v0;
            eVar.f2564f = layoutParams.f2429w0;
            eVar.f2565g = layoutParams.f2430x0;
            eVar.f2566h = layoutParams.f2431y0;
            eVar.f2567i = layoutParams.f2432z0;
            eVar.f2568j = layoutParams.f2420A0;
            eVar.f2569k = layoutParams.f2421B0;
            eVar.f2571m = layoutParams.f2424r0;
            eVar.f2570l = layoutParams.f2423q0;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m3104h(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            m3103g(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C0566b bVar = this.f2479d;
                bVar.f2516d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2512b0 = barrier.getType();
                this.f2479d.f2518e0 = barrier.getReferencedIds();
                this.f2479d.f2514c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void mo2923d(ConstraintLayout.LayoutParams layoutParams) {
            C0566b bVar = this.f2479d;
            layoutParams.f2374d = bVar.f2523h;
            layoutParams.f2376e = bVar.f2525i;
            layoutParams.f2378f = bVar.f2527j;
            layoutParams.f2380g = bVar.f2529k;
            layoutParams.f2382h = bVar.f2530l;
            layoutParams.f2384i = bVar.f2531m;
            layoutParams.f2386j = bVar.f2532n;
            layoutParams.f2388k = bVar.f2533o;
            layoutParams.f2390l = bVar.f2534p;
            layoutParams.f2398p = bVar.f2535q;
            layoutParams.f2399q = bVar.f2536r;
            layoutParams.f2400r = bVar.f2537s;
            layoutParams.f2401s = bVar.f2538t;
            layoutParams.leftMargin = bVar.f2486D;
            layoutParams.rightMargin = bVar.f2487E;
            layoutParams.topMargin = bVar.f2488F;
            layoutParams.bottomMargin = bVar.f2489G;
            layoutParams.f2406x = bVar.f2497O;
            layoutParams.f2407y = bVar.f2496N;
            layoutParams.f2403u = bVar.f2493K;
            layoutParams.f2405w = bVar.f2495M;
            layoutParams.f2408z = bVar.f2539u;
            layoutParams.f2342A = bVar.f2540v;
            layoutParams.f2392m = bVar.f2542x;
            layoutParams.f2394n = bVar.f2543y;
            layoutParams.f2396o = bVar.f2544z;
            layoutParams.f2343B = bVar.f2541w;
            layoutParams.f2358Q = bVar.f2483A;
            layoutParams.f2359R = bVar.f2484B;
            layoutParams.f2347F = bVar.f2498P;
            layoutParams.f2346E = bVar.f2499Q;
            layoutParams.f2349H = bVar.f2501S;
            layoutParams.f2348G = bVar.f2500R;
            layoutParams.f2361T = bVar.f2524h0;
            layoutParams.f2362U = bVar.f2526i0;
            layoutParams.f2350I = bVar.f2502T;
            layoutParams.f2351J = bVar.f2503U;
            layoutParams.f2354M = bVar.f2504V;
            layoutParams.f2355N = bVar.f2505W;
            layoutParams.f2352K = bVar.f2506X;
            layoutParams.f2353L = bVar.f2507Y;
            layoutParams.f2356O = bVar.f2508Z;
            layoutParams.f2357P = bVar.f2510a0;
            layoutParams.f2360S = bVar.f2485C;
            layoutParams.f2372c = bVar.f2521g;
            layoutParams.f2368a = bVar.f2517e;
            layoutParams.f2370b = bVar.f2519f;
            layoutParams.width = bVar.f2513c;
            layoutParams.height = bVar.f2515d;
            String str = bVar.f2522g0;
            if (str != null) {
                layoutParams.f2363V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(bVar.f2491I);
                layoutParams.setMarginEnd(this.f2479d.f2490H);
            }
            layoutParams.mo2859c();
        }

        /* renamed from: e */
        public C0565a clone() {
            C0565a aVar = new C0565a();
            aVar.f2479d.mo2925a(this.f2479d);
            aVar.f2478c.mo2927a(this.f2478c);
            aVar.f2477b.mo2929a(this.f2477b);
            aVar.f2480e.mo2931a(this.f2480e);
            aVar.f2476a = this.f2476a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* compiled from: ConstraintSet */
    public static class C0566b {

        /* renamed from: k0 */
        private static SparseIntArray f2482k0;

        /* renamed from: A */
        public int f2483A = -1;

        /* renamed from: B */
        public int f2484B = -1;

        /* renamed from: C */
        public int f2485C = -1;

        /* renamed from: D */
        public int f2486D = -1;

        /* renamed from: E */
        public int f2487E = -1;

        /* renamed from: F */
        public int f2488F = -1;

        /* renamed from: G */
        public int f2489G = -1;

        /* renamed from: H */
        public int f2490H = -1;

        /* renamed from: I */
        public int f2491I = -1;

        /* renamed from: J */
        public int f2492J = -1;

        /* renamed from: K */
        public int f2493K = -1;

        /* renamed from: L */
        public int f2494L = -1;

        /* renamed from: M */
        public int f2495M = -1;

        /* renamed from: N */
        public int f2496N = -1;

        /* renamed from: O */
        public int f2497O = -1;

        /* renamed from: P */
        public float f2498P = -1.0f;

        /* renamed from: Q */
        public float f2499Q = -1.0f;

        /* renamed from: R */
        public int f2500R = 0;

        /* renamed from: S */
        public int f2501S = 0;

        /* renamed from: T */
        public int f2502T = 0;

        /* renamed from: U */
        public int f2503U = 0;

        /* renamed from: V */
        public int f2504V = -1;

        /* renamed from: W */
        public int f2505W = -1;

        /* renamed from: X */
        public int f2506X = -1;

        /* renamed from: Y */
        public int f2507Y = -1;

        /* renamed from: Z */
        public float f2508Z = 1.0f;

        /* renamed from: a */
        public boolean f2509a = false;

        /* renamed from: a0 */
        public float f2510a0 = 1.0f;

        /* renamed from: b */
        public boolean f2511b = false;

        /* renamed from: b0 */
        public int f2512b0 = -1;

        /* renamed from: c */
        public int f2513c;

        /* renamed from: c0 */
        public int f2514c0 = 0;

        /* renamed from: d */
        public int f2515d;

        /* renamed from: d0 */
        public int f2516d0 = -1;

        /* renamed from: e */
        public int f2517e = -1;

        /* renamed from: e0 */
        public int[] f2518e0;

        /* renamed from: f */
        public int f2519f = -1;

        /* renamed from: f0 */
        public String f2520f0;

        /* renamed from: g */
        public float f2521g = -1.0f;

        /* renamed from: g0 */
        public String f2522g0;

        /* renamed from: h */
        public int f2523h = -1;

        /* renamed from: h0 */
        public boolean f2524h0 = false;

        /* renamed from: i */
        public int f2525i = -1;

        /* renamed from: i0 */
        public boolean f2526i0 = false;

        /* renamed from: j */
        public int f2527j = -1;

        /* renamed from: j0 */
        public boolean f2528j0 = true;

        /* renamed from: k */
        public int f2529k = -1;

        /* renamed from: l */
        public int f2530l = -1;

        /* renamed from: m */
        public int f2531m = -1;

        /* renamed from: n */
        public int f2532n = -1;

        /* renamed from: o */
        public int f2533o = -1;

        /* renamed from: p */
        public int f2534p = -1;

        /* renamed from: q */
        public int f2535q = -1;

        /* renamed from: r */
        public int f2536r = -1;

        /* renamed from: s */
        public int f2537s = -1;

        /* renamed from: t */
        public int f2538t = -1;

        /* renamed from: u */
        public float f2539u = 0.5f;

        /* renamed from: v */
        public float f2540v = 0.5f;

        /* renamed from: w */
        public String f2541w = null;

        /* renamed from: x */
        public int f2542x = -1;

        /* renamed from: y */
        public int f2543y = 0;

        /* renamed from: z */
        public float f2544z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2482k0 = sparseIntArray;
            sparseIntArray.append(C0572f.f2704O5, 24);
            f2482k0.append(C0572f.f2713P5, 25);
            f2482k0.append(C0572f.f2731R5, 28);
            f2482k0.append(C0572f.f2740S5, 29);
            f2482k0.append(C0572f.f2785X5, 35);
            f2482k0.append(C0572f.f2776W5, 34);
            f2482k0.append(C0572f.f3049z5, 4);
            f2482k0.append(C0572f.f3040y5, 3);
            f2482k0.append(C0572f.f3022w5, 1);
            f2482k0.append(C0572f.f2833c6, 6);
            f2482k0.append(C0572f.f2843d6, 7);
            f2482k0.append(C0572f.f2632G5, 17);
            f2482k0.append(C0572f.f2641H5, 18);
            f2482k0.append(C0572f.f2650I5, 19);
            f2482k0.append(C0572f.f2882h5, 26);
            f2482k0.append(C0572f.f2749T5, 31);
            f2482k0.append(C0572f.f2758U5, 32);
            f2482k0.append(C0572f.f2623F5, 10);
            f2482k0.append(C0572f.f2614E5, 9);
            f2482k0.append(C0572f.f2873g6, 13);
            f2482k0.append(C0572f.f2903j6, 16);
            f2482k0.append(C0572f.f2883h6, 14);
            f2482k0.append(C0572f.f2853e6, 11);
            f2482k0.append(C0572f.f2893i6, 15);
            f2482k0.append(C0572f.f2863f6, 12);
            f2482k0.append(C0572f.f2813a6, 38);
            f2482k0.append(C0572f.f2686M5, 37);
            f2482k0.append(C0572f.f2677L5, 39);
            f2482k0.append(C0572f.f2803Z5, 40);
            f2482k0.append(C0572f.f2668K5, 20);
            f2482k0.append(C0572f.f2794Y5, 36);
            f2482k0.append(C0572f.f2605D5, 5);
            f2482k0.append(C0572f.f2695N5, 76);
            f2482k0.append(C0572f.f2767V5, 76);
            f2482k0.append(C0572f.f2722Q5, 76);
            f2482k0.append(C0572f.f3031x5, 76);
            f2482k0.append(C0572f.f3013v5, 76);
            f2482k0.append(C0572f.f2912k5, 23);
            f2482k0.append(C0572f.f2932m5, 27);
            f2482k0.append(C0572f.f2950o5, 30);
            f2482k0.append(C0572f.f2959p5, 8);
            f2482k0.append(C0572f.f2922l5, 33);
            f2482k0.append(C0572f.f2941n5, 2);
            f2482k0.append(C0572f.f2892i5, 22);
            f2482k0.append(C0572f.f2902j5, 21);
            f2482k0.append(C0572f.f2578A5, 61);
            f2482k0.append(C0572f.f2596C5, 62);
            f2482k0.append(C0572f.f2587B5, 63);
            f2482k0.append(C0572f.f2823b6, 69);
            f2482k0.append(C0572f.f2659J5, 70);
            f2482k0.append(C0572f.f2995t5, 71);
            f2482k0.append(C0572f.f2977r5, 72);
            f2482k0.append(C0572f.f2986s5, 73);
            f2482k0.append(C0572f.f3004u5, 74);
            f2482k0.append(C0572f.f2968q5, 75);
        }

        /* renamed from: a */
        public void mo2925a(C0566b bVar) {
            this.f2509a = bVar.f2509a;
            this.f2513c = bVar.f2513c;
            this.f2511b = bVar.f2511b;
            this.f2515d = bVar.f2515d;
            this.f2517e = bVar.f2517e;
            this.f2519f = bVar.f2519f;
            this.f2521g = bVar.f2521g;
            this.f2523h = bVar.f2523h;
            this.f2525i = bVar.f2525i;
            this.f2527j = bVar.f2527j;
            this.f2529k = bVar.f2529k;
            this.f2530l = bVar.f2530l;
            this.f2531m = bVar.f2531m;
            this.f2532n = bVar.f2532n;
            this.f2533o = bVar.f2533o;
            this.f2534p = bVar.f2534p;
            this.f2535q = bVar.f2535q;
            this.f2536r = bVar.f2536r;
            this.f2537s = bVar.f2537s;
            this.f2538t = bVar.f2538t;
            this.f2539u = bVar.f2539u;
            this.f2540v = bVar.f2540v;
            this.f2541w = bVar.f2541w;
            this.f2542x = bVar.f2542x;
            this.f2543y = bVar.f2543y;
            this.f2544z = bVar.f2544z;
            this.f2483A = bVar.f2483A;
            this.f2484B = bVar.f2484B;
            this.f2485C = bVar.f2485C;
            this.f2486D = bVar.f2486D;
            this.f2487E = bVar.f2487E;
            this.f2488F = bVar.f2488F;
            this.f2489G = bVar.f2489G;
            this.f2490H = bVar.f2490H;
            this.f2491I = bVar.f2491I;
            this.f2492J = bVar.f2492J;
            this.f2493K = bVar.f2493K;
            this.f2494L = bVar.f2494L;
            this.f2495M = bVar.f2495M;
            this.f2496N = bVar.f2496N;
            this.f2497O = bVar.f2497O;
            this.f2498P = bVar.f2498P;
            this.f2499Q = bVar.f2499Q;
            this.f2500R = bVar.f2500R;
            this.f2501S = bVar.f2501S;
            this.f2502T = bVar.f2502T;
            this.f2503U = bVar.f2503U;
            this.f2504V = bVar.f2504V;
            this.f2505W = bVar.f2505W;
            this.f2506X = bVar.f2506X;
            this.f2507Y = bVar.f2507Y;
            this.f2508Z = bVar.f2508Z;
            this.f2510a0 = bVar.f2510a0;
            this.f2512b0 = bVar.f2512b0;
            this.f2514c0 = bVar.f2514c0;
            this.f2516d0 = bVar.f2516d0;
            this.f2522g0 = bVar.f2522g0;
            int[] iArr = bVar.f2518e0;
            if (iArr != null) {
                this.f2518e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2518e0 = null;
            }
            this.f2520f0 = bVar.f2520f0;
            this.f2524h0 = bVar.f2524h0;
            this.f2526i0 = bVar.f2526i0;
            this.f2528j0 = bVar.f2528j0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2926b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2872g5);
            this.f2511b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2482k0.get(index);
                if (i2 == 80) {
                    this.f2524h0 = obtainStyledAttributes.getBoolean(index, this.f2524h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f2534p = C0564c.m3074y(obtainStyledAttributes, index, this.f2534p);
                            break;
                        case 2:
                            this.f2489G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2489G);
                            break;
                        case 3:
                            this.f2533o = C0564c.m3074y(obtainStyledAttributes, index, this.f2533o);
                            break;
                        case 4:
                            this.f2532n = C0564c.m3074y(obtainStyledAttributes, index, this.f2532n);
                            break;
                        case 5:
                            this.f2541w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f2483A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2483A);
                            break;
                        case 7:
                            this.f2484B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2484B);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f2490H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2490H);
                                break;
                            }
                        case 9:
                            this.f2538t = C0564c.m3074y(obtainStyledAttributes, index, this.f2538t);
                            break;
                        case 10:
                            this.f2537s = C0564c.m3074y(obtainStyledAttributes, index, this.f2537s);
                            break;
                        case 11:
                            this.f2495M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2495M);
                            break;
                        case 12:
                            this.f2496N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2496N);
                            break;
                        case 13:
                            this.f2492J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2492J);
                            break;
                        case 14:
                            this.f2494L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2494L);
                            break;
                        case 15:
                            this.f2497O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2497O);
                            break;
                        case 16:
                            this.f2493K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2493K);
                            break;
                        case 17:
                            this.f2517e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2517e);
                            break;
                        case 18:
                            this.f2519f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2519f);
                            break;
                        case 19:
                            this.f2521g = obtainStyledAttributes.getFloat(index, this.f2521g);
                            break;
                        case 20:
                            this.f2539u = obtainStyledAttributes.getFloat(index, this.f2539u);
                            break;
                        case 21:
                            this.f2515d = obtainStyledAttributes.getLayoutDimension(index, this.f2515d);
                            break;
                        case 22:
                            this.f2513c = obtainStyledAttributes.getLayoutDimension(index, this.f2513c);
                            break;
                        case 23:
                            this.f2486D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2486D);
                            break;
                        case 24:
                            this.f2523h = C0564c.m3074y(obtainStyledAttributes, index, this.f2523h);
                            break;
                        case 25:
                            this.f2525i = C0564c.m3074y(obtainStyledAttributes, index, this.f2525i);
                            break;
                        case 26:
                            this.f2485C = obtainStyledAttributes.getInt(index, this.f2485C);
                            break;
                        case 27:
                            this.f2487E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2487E);
                            break;
                        case 28:
                            this.f2527j = C0564c.m3074y(obtainStyledAttributes, index, this.f2527j);
                            break;
                        case 29:
                            this.f2529k = C0564c.m3074y(obtainStyledAttributes, index, this.f2529k);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f2491I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2491I);
                                break;
                            }
                        case 31:
                            this.f2535q = C0564c.m3074y(obtainStyledAttributes, index, this.f2535q);
                            break;
                        case 32:
                            this.f2536r = C0564c.m3074y(obtainStyledAttributes, index, this.f2536r);
                            break;
                        case 33:
                            this.f2488F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2488F);
                            break;
                        case 34:
                            this.f2531m = C0564c.m3074y(obtainStyledAttributes, index, this.f2531m);
                            break;
                        case 35:
                            this.f2530l = C0564c.m3074y(obtainStyledAttributes, index, this.f2530l);
                            break;
                        case 36:
                            this.f2540v = obtainStyledAttributes.getFloat(index, this.f2540v);
                            break;
                        case 37:
                            this.f2499Q = obtainStyledAttributes.getFloat(index, this.f2499Q);
                            break;
                        case 38:
                            this.f2498P = obtainStyledAttributes.getFloat(index, this.f2498P);
                            break;
                        case 39:
                            this.f2500R = obtainStyledAttributes.getInt(index, this.f2500R);
                            break;
                        case 40:
                            this.f2501S = obtainStyledAttributes.getInt(index, this.f2501S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f2502T = obtainStyledAttributes.getInt(index, this.f2502T);
                                    break;
                                case 55:
                                    this.f2503U = obtainStyledAttributes.getInt(index, this.f2503U);
                                    break;
                                case 56:
                                    this.f2504V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2504V);
                                    break;
                                case 57:
                                    this.f2505W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2505W);
                                    break;
                                case 58:
                                    this.f2506X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2506X);
                                    break;
                                case 59:
                                    this.f2507Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2507Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2542x = C0564c.m3074y(obtainStyledAttributes, index, this.f2542x);
                                            break;
                                        case 62:
                                            this.f2543y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2543y);
                                            break;
                                        case 63:
                                            this.f2544z = obtainStyledAttributes.getFloat(index, this.f2544z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f2508Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f2510a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f2512b0 = obtainStyledAttributes.getInt(index, this.f2512b0);
                                                    break;
                                                case 73:
                                                    this.f2514c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2514c0);
                                                    break;
                                                case 74:
                                                    this.f2520f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f2528j0 = obtainStyledAttributes.getBoolean(index, this.f2528j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2482k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f2522g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2482k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2526i0 = obtainStyledAttributes.getBoolean(index, this.f2526i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    /* compiled from: ConstraintSet */
    public static class C0567c {

        /* renamed from: h */
        private static SparseIntArray f2545h;

        /* renamed from: a */
        public boolean f2546a = false;

        /* renamed from: b */
        public int f2547b = -1;

        /* renamed from: c */
        public String f2548c = null;

        /* renamed from: d */
        public int f2549d = -1;

        /* renamed from: e */
        public int f2550e = 0;

        /* renamed from: f */
        public float f2551f = Float.NaN;

        /* renamed from: g */
        public float f2552g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2545h = sparseIntArray;
            sparseIntArray.append(C0572f.f2579A6, 1);
            f2545h.append(C0572f.f2597C6, 2);
            f2545h.append(C0572f.f2606D6, 3);
            f2545h.append(C0572f.f3050z6, 4);
            f2545h.append(C0572f.f3041y6, 5);
            f2545h.append(C0572f.f2588B6, 6);
        }

        /* renamed from: a */
        public void mo2927a(C0567c cVar) {
            this.f2546a = cVar.f2546a;
            this.f2547b = cVar.f2547b;
            this.f2548c = cVar.f2548c;
            this.f2549d = cVar.f2549d;
            this.f2550e = cVar.f2550e;
            this.f2552g = cVar.f2552g;
            this.f2551f = cVar.f2551f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2928b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f3032x6);
            this.f2546a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2545h.get(index)) {
                    case 1:
                        this.f2552g = obtainStyledAttributes.getFloat(index, this.f2552g);
                        break;
                    case 2:
                        this.f2549d = obtainStyledAttributes.getInt(index, this.f2549d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f2548c = C6164c.f25470c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f2548c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f2550e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2547b = C0564c.m3074y(obtainStyledAttributes, index, this.f2547b);
                        break;
                    case 6:
                        this.f2551f = obtainStyledAttributes.getFloat(index, this.f2551f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    /* compiled from: ConstraintSet */
    public static class C0568d {

        /* renamed from: a */
        public boolean f2553a = false;

        /* renamed from: b */
        public int f2554b = 0;

        /* renamed from: c */
        public int f2555c = 0;

        /* renamed from: d */
        public float f2556d = 1.0f;

        /* renamed from: e */
        public float f2557e = Float.NaN;

        /* renamed from: a */
        public void mo2929a(C0568d dVar) {
            this.f2553a = dVar.f2553a;
            this.f2554b = dVar.f2554b;
            this.f2556d = dVar.f2556d;
            this.f2557e = dVar.f2557e;
            this.f2555c = dVar.f2555c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2930b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2943n7);
            this.f2553a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2961p7) {
                    this.f2556d = obtainStyledAttributes.getFloat(index, this.f2556d);
                } else if (index == C0572f.f2952o7) {
                    this.f2554b = obtainStyledAttributes.getInt(index, this.f2554b);
                    this.f2554b = C0564c.f2470e[this.f2554b];
                } else if (index == C0572f.f2979r7) {
                    this.f2555c = obtainStyledAttributes.getInt(index, this.f2555c);
                } else if (index == C0572f.f2970q7) {
                    this.f2557e = obtainStyledAttributes.getFloat(index, this.f2557e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    /* compiled from: ConstraintSet */
    public static class C0569e {

        /* renamed from: n */
        private static SparseIntArray f2558n;

        /* renamed from: a */
        public boolean f2559a = false;

        /* renamed from: b */
        public float f2560b = 0.0f;

        /* renamed from: c */
        public float f2561c = 0.0f;

        /* renamed from: d */
        public float f2562d = 0.0f;

        /* renamed from: e */
        public float f2563e = 1.0f;

        /* renamed from: f */
        public float f2564f = 1.0f;

        /* renamed from: g */
        public float f2565g = Float.NaN;

        /* renamed from: h */
        public float f2566h = Float.NaN;

        /* renamed from: i */
        public float f2567i = 0.0f;

        /* renamed from: j */
        public float f2568j = 0.0f;

        /* renamed from: k */
        public float f2569k = 0.0f;

        /* renamed from: l */
        public boolean f2570l = false;

        /* renamed from: m */
        public float f2571m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2558n = sparseIntArray;
            sparseIntArray.append(C0572f.f2688M7, 1);
            f2558n.append(C0572f.f2697N7, 2);
            f2558n.append(C0572f.f2706O7, 3);
            f2558n.append(C0572f.f2670K7, 4);
            f2558n.append(C0572f.f2679L7, 5);
            f2558n.append(C0572f.f2634G7, 6);
            f2558n.append(C0572f.f2643H7, 7);
            f2558n.append(C0572f.f2652I7, 8);
            f2558n.append(C0572f.f2661J7, 9);
            f2558n.append(C0572f.f2715P7, 10);
            f2558n.append(C0572f.f2724Q7, 11);
        }

        /* renamed from: a */
        public void mo2931a(C0569e eVar) {
            this.f2559a = eVar.f2559a;
            this.f2560b = eVar.f2560b;
            this.f2561c = eVar.f2561c;
            this.f2562d = eVar.f2562d;
            this.f2563e = eVar.f2563e;
            this.f2564f = eVar.f2564f;
            this.f2565g = eVar.f2565g;
            this.f2566h = eVar.f2566h;
            this.f2567i = eVar.f2567i;
            this.f2568j = eVar.f2568j;
            this.f2569k = eVar.f2569k;
            this.f2570l = eVar.f2570l;
            this.f2571m = eVar.f2571m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2932b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2625F7);
            this.f2559a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2558n.get(index)) {
                    case 1:
                        this.f2560b = obtainStyledAttributes.getFloat(index, this.f2560b);
                        break;
                    case 2:
                        this.f2561c = obtainStyledAttributes.getFloat(index, this.f2561c);
                        break;
                    case 3:
                        this.f2562d = obtainStyledAttributes.getFloat(index, this.f2562d);
                        break;
                    case 4:
                        this.f2563e = obtainStyledAttributes.getFloat(index, this.f2563e);
                        break;
                    case 5:
                        this.f2564f = obtainStyledAttributes.getFloat(index, this.f2564f);
                        break;
                    case 6:
                        this.f2565g = obtainStyledAttributes.getDimension(index, this.f2565g);
                        break;
                    case 7:
                        this.f2566h = obtainStyledAttributes.getDimension(index, this.f2566h);
                        break;
                    case 8:
                        this.f2567i = obtainStyledAttributes.getDimension(index, this.f2567i);
                        break;
                    case 9:
                        this.f2568j = obtainStyledAttributes.getDimension(index, this.f2568j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2569k = obtainStyledAttributes.getDimension(index, this.f2569k);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2570l = true;
                            this.f2571m = obtainStyledAttributes.getDimension(index, this.f2571m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2471f = sparseIntArray;
        sparseIntArray.append(C0572f.f2999u0, 25);
        f2471f.append(C0572f.f3008v0, 26);
        f2471f.append(C0572f.f3026x0, 29);
        f2471f.append(C0572f.f3035y0, 30);
        f2471f.append(C0572f.f2609E0, 36);
        f2471f.append(C0572f.f2600D0, 35);
        f2471f.append(C0572f.f2827c0, 4);
        f2471f.append(C0572f.f2817b0, 3);
        f2471f.append(C0572f.f2797Z, 1);
        f2471f.append(C0572f.f2681M0, 6);
        f2471f.append(C0572f.f2690N0, 7);
        f2471f.append(C0572f.f2897j0, 17);
        f2471f.append(C0572f.f2907k0, 18);
        f2471f.append(C0572f.f2917l0, 19);
        f2471f.append(C0572f.f2980s, 27);
        f2471f.append(C0572f.f3044z0, 32);
        f2471f.append(C0572f.f2573A0, 33);
        f2471f.append(C0572f.f2887i0, 10);
        f2471f.append(C0572f.f2877h0, 9);
        f2471f.append(C0572f.f2717Q0, 13);
        f2471f.append(C0572f.f2744T0, 16);
        f2471f.append(C0572f.f2726R0, 14);
        f2471f.append(C0572f.f2699O0, 11);
        f2471f.append(C0572f.f2735S0, 15);
        f2471f.append(C0572f.f2708P0, 12);
        f2471f.append(C0572f.f2636H0, 40);
        f2471f.append(C0572f.f2981s0, 39);
        f2471f.append(C0572f.f2972r0, 41);
        f2471f.append(C0572f.f2627G0, 42);
        f2471f.append(C0572f.f2963q0, 20);
        f2471f.append(C0572f.f2618F0, 37);
        f2471f.append(C0572f.f2867g0, 5);
        f2471f.append(C0572f.f2990t0, 82);
        f2471f.append(C0572f.f2591C0, 82);
        f2471f.append(C0572f.f3017w0, 82);
        f2471f.append(C0572f.f2807a0, 82);
        f2471f.append(C0572f.f2788Y, 82);
        f2471f.append(C0572f.f3025x, 24);
        f2471f.append(C0572f.f3043z, 28);
        f2471f.append(C0572f.f2671L, 31);
        f2471f.append(C0572f.f2680M, 8);
        f2471f.append(C0572f.f3034y, 34);
        f2471f.append(C0572f.f2572A, 2);
        f2471f.append(C0572f.f3007v, 23);
        f2471f.append(C0572f.f3016w, 21);
        f2471f.append(C0572f.f2998u, 22);
        f2471f.append(C0572f.f2581B, 43);
        f2471f.append(C0572f.f2698O, 44);
        f2471f.append(C0572f.f2653J, 45);
        f2471f.append(C0572f.f2662K, 46);
        f2471f.append(C0572f.f2644I, 60);
        f2471f.append(C0572f.f2626G, 47);
        f2471f.append(C0572f.f2635H, 48);
        f2471f.append(C0572f.f2590C, 49);
        f2471f.append(C0572f.f2599D, 50);
        f2471f.append(C0572f.f2608E, 51);
        f2471f.append(C0572f.f2617F, 52);
        f2471f.append(C0572f.f2689N, 53);
        f2471f.append(C0572f.f2645I0, 54);
        f2471f.append(C0572f.f2927m0, 55);
        f2471f.append(C0572f.f2654J0, 56);
        f2471f.append(C0572f.f2936n0, 57);
        f2471f.append(C0572f.f2663K0, 58);
        f2471f.append(C0572f.f2945o0, 59);
        f2471f.append(C0572f.f2837d0, 61);
        f2471f.append(C0572f.f2857f0, 62);
        f2471f.append(C0572f.f2847e0, 63);
        f2471f.append(C0572f.f2707P, 64);
        f2471f.append(C0572f.f2780X0, 65);
        f2471f.append(C0572f.f2761V, 66);
        f2471f.append(C0572f.f2789Y0, 67);
        f2471f.append(C0572f.f2762V0, 79);
        f2471f.append(C0572f.f2989t, 38);
        f2471f.append(C0572f.f2753U0, 68);
        f2471f.append(C0572f.f2672L0, 69);
        f2471f.append(C0572f.f2954p0, 70);
        f2471f.append(C0572f.f2743T, 71);
        f2471f.append(C0572f.f2725R, 72);
        f2471f.append(C0572f.f2734S, 73);
        f2471f.append(C0572f.f2752U, 74);
        f2471f.append(C0572f.f2716Q, 75);
        f2471f.append(C0572f.f2771W0, 76);
        f2471f.append(C0572f.f2582B0, 77);
        f2471f.append(C0572f.f2798Z0, 78);
        f2471f.append(C0572f.f2779X, 80);
        f2471f.append(C0572f.f2770W, 81);
    }

    /* renamed from: m */
    private int[] m3071m(View view, String str) {
        int i;
        Object f;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0571e.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, TtmlNode.ATTR_ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f = ((ConstraintLayout) view.getParent()).mo2830f(0, trim)) != null && (f instanceof Integer)) {
                i = ((Integer) f).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: n */
    private C0565a m3072n(Context context, AttributeSet attributeSet) {
        C0565a aVar = new C0565a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2971r);
        m3075z(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: o */
    private C0565a m3073o(int i) {
        if (!this.f2475d.containsKey(Integer.valueOf(i))) {
            this.f2475d.put(Integer.valueOf(i), new C0565a());
        }
        return this.f2475d.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static int m3074y(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: z */
    private void m3075z(Context context, C0565a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0572f.f2989t || C0572f.f2671L == index || C0572f.f2680M == index)) {
                aVar.f2478c.f2546a = true;
                aVar.f2479d.f2511b = true;
                aVar.f2477b.f2553a = true;
                aVar.f2480e.f2559a = true;
            }
            switch (f2471f.get(index)) {
                case 1:
                    C0566b bVar = aVar.f2479d;
                    bVar.f2534p = m3074y(typedArray, index, bVar.f2534p);
                    break;
                case 2:
                    C0566b bVar2 = aVar.f2479d;
                    bVar2.f2489G = typedArray.getDimensionPixelSize(index, bVar2.f2489G);
                    break;
                case 3:
                    C0566b bVar3 = aVar.f2479d;
                    bVar3.f2533o = m3074y(typedArray, index, bVar3.f2533o);
                    break;
                case 4:
                    C0566b bVar4 = aVar.f2479d;
                    bVar4.f2532n = m3074y(typedArray, index, bVar4.f2532n);
                    break;
                case 5:
                    aVar.f2479d.f2541w = typedArray.getString(index);
                    break;
                case 6:
                    C0566b bVar5 = aVar.f2479d;
                    bVar5.f2483A = typedArray.getDimensionPixelOffset(index, bVar5.f2483A);
                    break;
                case 7:
                    C0566b bVar6 = aVar.f2479d;
                    bVar6.f2484B = typedArray.getDimensionPixelOffset(index, bVar6.f2484B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0566b bVar7 = aVar.f2479d;
                        bVar7.f2490H = typedArray.getDimensionPixelSize(index, bVar7.f2490H);
                        break;
                    }
                case 9:
                    C0566b bVar8 = aVar.f2479d;
                    bVar8.f2538t = m3074y(typedArray, index, bVar8.f2538t);
                    break;
                case 10:
                    C0566b bVar9 = aVar.f2479d;
                    bVar9.f2537s = m3074y(typedArray, index, bVar9.f2537s);
                    break;
                case 11:
                    C0566b bVar10 = aVar.f2479d;
                    bVar10.f2495M = typedArray.getDimensionPixelSize(index, bVar10.f2495M);
                    break;
                case 12:
                    C0566b bVar11 = aVar.f2479d;
                    bVar11.f2496N = typedArray.getDimensionPixelSize(index, bVar11.f2496N);
                    break;
                case 13:
                    C0566b bVar12 = aVar.f2479d;
                    bVar12.f2492J = typedArray.getDimensionPixelSize(index, bVar12.f2492J);
                    break;
                case 14:
                    C0566b bVar13 = aVar.f2479d;
                    bVar13.f2494L = typedArray.getDimensionPixelSize(index, bVar13.f2494L);
                    break;
                case 15:
                    C0566b bVar14 = aVar.f2479d;
                    bVar14.f2497O = typedArray.getDimensionPixelSize(index, bVar14.f2497O);
                    break;
                case 16:
                    C0566b bVar15 = aVar.f2479d;
                    bVar15.f2493K = typedArray.getDimensionPixelSize(index, bVar15.f2493K);
                    break;
                case 17:
                    C0566b bVar16 = aVar.f2479d;
                    bVar16.f2517e = typedArray.getDimensionPixelOffset(index, bVar16.f2517e);
                    break;
                case 18:
                    C0566b bVar17 = aVar.f2479d;
                    bVar17.f2519f = typedArray.getDimensionPixelOffset(index, bVar17.f2519f);
                    break;
                case 19:
                    C0566b bVar18 = aVar.f2479d;
                    bVar18.f2521g = typedArray.getFloat(index, bVar18.f2521g);
                    break;
                case 20:
                    C0566b bVar19 = aVar.f2479d;
                    bVar19.f2539u = typedArray.getFloat(index, bVar19.f2539u);
                    break;
                case 21:
                    C0566b bVar20 = aVar.f2479d;
                    bVar20.f2515d = typedArray.getLayoutDimension(index, bVar20.f2515d);
                    break;
                case 22:
                    C0568d dVar = aVar.f2477b;
                    dVar.f2554b = typedArray.getInt(index, dVar.f2554b);
                    C0568d dVar2 = aVar.f2477b;
                    dVar2.f2554b = f2470e[dVar2.f2554b];
                    break;
                case 23:
                    C0566b bVar21 = aVar.f2479d;
                    bVar21.f2513c = typedArray.getLayoutDimension(index, bVar21.f2513c);
                    break;
                case 24:
                    C0566b bVar22 = aVar.f2479d;
                    bVar22.f2486D = typedArray.getDimensionPixelSize(index, bVar22.f2486D);
                    break;
                case 25:
                    C0566b bVar23 = aVar.f2479d;
                    bVar23.f2523h = m3074y(typedArray, index, bVar23.f2523h);
                    break;
                case 26:
                    C0566b bVar24 = aVar.f2479d;
                    bVar24.f2525i = m3074y(typedArray, index, bVar24.f2525i);
                    break;
                case 27:
                    C0566b bVar25 = aVar.f2479d;
                    bVar25.f2485C = typedArray.getInt(index, bVar25.f2485C);
                    break;
                case 28:
                    C0566b bVar26 = aVar.f2479d;
                    bVar26.f2487E = typedArray.getDimensionPixelSize(index, bVar26.f2487E);
                    break;
                case 29:
                    C0566b bVar27 = aVar.f2479d;
                    bVar27.f2527j = m3074y(typedArray, index, bVar27.f2527j);
                    break;
                case 30:
                    C0566b bVar28 = aVar.f2479d;
                    bVar28.f2529k = m3074y(typedArray, index, bVar28.f2529k);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0566b bVar29 = aVar.f2479d;
                        bVar29.f2491I = typedArray.getDimensionPixelSize(index, bVar29.f2491I);
                        break;
                    }
                case 32:
                    C0566b bVar30 = aVar.f2479d;
                    bVar30.f2535q = m3074y(typedArray, index, bVar30.f2535q);
                    break;
                case 33:
                    C0566b bVar31 = aVar.f2479d;
                    bVar31.f2536r = m3074y(typedArray, index, bVar31.f2536r);
                    break;
                case 34:
                    C0566b bVar32 = aVar.f2479d;
                    bVar32.f2488F = typedArray.getDimensionPixelSize(index, bVar32.f2488F);
                    break;
                case 35:
                    C0566b bVar33 = aVar.f2479d;
                    bVar33.f2531m = m3074y(typedArray, index, bVar33.f2531m);
                    break;
                case 36:
                    C0566b bVar34 = aVar.f2479d;
                    bVar34.f2530l = m3074y(typedArray, index, bVar34.f2530l);
                    break;
                case 37:
                    C0566b bVar35 = aVar.f2479d;
                    bVar35.f2540v = typedArray.getFloat(index, bVar35.f2540v);
                    break;
                case 38:
                    aVar.f2476a = typedArray.getResourceId(index, aVar.f2476a);
                    break;
                case 39:
                    C0566b bVar36 = aVar.f2479d;
                    bVar36.f2499Q = typedArray.getFloat(index, bVar36.f2499Q);
                    break;
                case 40:
                    C0566b bVar37 = aVar.f2479d;
                    bVar37.f2498P = typedArray.getFloat(index, bVar37.f2498P);
                    break;
                case 41:
                    C0566b bVar38 = aVar.f2479d;
                    bVar38.f2500R = typedArray.getInt(index, bVar38.f2500R);
                    break;
                case 42:
                    C0566b bVar39 = aVar.f2479d;
                    bVar39.f2501S = typedArray.getInt(index, bVar39.f2501S);
                    break;
                case 43:
                    C0568d dVar3 = aVar.f2477b;
                    dVar3.f2556d = typedArray.getFloat(index, dVar3.f2556d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0569e eVar = aVar.f2480e;
                        eVar.f2570l = true;
                        eVar.f2571m = typedArray.getDimension(index, eVar.f2571m);
                        break;
                    }
                case 45:
                    C0569e eVar2 = aVar.f2480e;
                    eVar2.f2561c = typedArray.getFloat(index, eVar2.f2561c);
                    break;
                case 46:
                    C0569e eVar3 = aVar.f2480e;
                    eVar3.f2562d = typedArray.getFloat(index, eVar3.f2562d);
                    break;
                case 47:
                    C0569e eVar4 = aVar.f2480e;
                    eVar4.f2563e = typedArray.getFloat(index, eVar4.f2563e);
                    break;
                case 48:
                    C0569e eVar5 = aVar.f2480e;
                    eVar5.f2564f = typedArray.getFloat(index, eVar5.f2564f);
                    break;
                case 49:
                    C0569e eVar6 = aVar.f2480e;
                    eVar6.f2565g = typedArray.getDimension(index, eVar6.f2565g);
                    break;
                case 50:
                    C0569e eVar7 = aVar.f2480e;
                    eVar7.f2566h = typedArray.getDimension(index, eVar7.f2566h);
                    break;
                case 51:
                    C0569e eVar8 = aVar.f2480e;
                    eVar8.f2567i = typedArray.getDimension(index, eVar8.f2567i);
                    break;
                case 52:
                    C0569e eVar9 = aVar.f2480e;
                    eVar9.f2568j = typedArray.getDimension(index, eVar9.f2568j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0569e eVar10 = aVar.f2480e;
                        eVar10.f2569k = typedArray.getDimension(index, eVar10.f2569k);
                        break;
                    }
                case 54:
                    C0566b bVar40 = aVar.f2479d;
                    bVar40.f2502T = typedArray.getInt(index, bVar40.f2502T);
                    break;
                case 55:
                    C0566b bVar41 = aVar.f2479d;
                    bVar41.f2503U = typedArray.getInt(index, bVar41.f2503U);
                    break;
                case 56:
                    C0566b bVar42 = aVar.f2479d;
                    bVar42.f2504V = typedArray.getDimensionPixelSize(index, bVar42.f2504V);
                    break;
                case 57:
                    C0566b bVar43 = aVar.f2479d;
                    bVar43.f2505W = typedArray.getDimensionPixelSize(index, bVar43.f2505W);
                    break;
                case 58:
                    C0566b bVar44 = aVar.f2479d;
                    bVar44.f2506X = typedArray.getDimensionPixelSize(index, bVar44.f2506X);
                    break;
                case 59:
                    C0566b bVar45 = aVar.f2479d;
                    bVar45.f2507Y = typedArray.getDimensionPixelSize(index, bVar45.f2507Y);
                    break;
                case 60:
                    C0569e eVar11 = aVar.f2480e;
                    eVar11.f2560b = typedArray.getFloat(index, eVar11.f2560b);
                    break;
                case 61:
                    C0566b bVar46 = aVar.f2479d;
                    bVar46.f2542x = m3074y(typedArray, index, bVar46.f2542x);
                    break;
                case 62:
                    C0566b bVar47 = aVar.f2479d;
                    bVar47.f2543y = typedArray.getDimensionPixelSize(index, bVar47.f2543y);
                    break;
                case 63:
                    C0566b bVar48 = aVar.f2479d;
                    bVar48.f2544z = typedArray.getFloat(index, bVar48.f2544z);
                    break;
                case 64:
                    C0567c cVar = aVar.f2478c;
                    cVar.f2547b = m3074y(typedArray, index, cVar.f2547b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f2478c.f2548c = C6164c.f25470c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f2478c.f2548c = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f2478c.f2550e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0567c cVar2 = aVar.f2478c;
                    cVar2.f2552g = typedArray.getFloat(index, cVar2.f2552g);
                    break;
                case 68:
                    C0568d dVar4 = aVar.f2477b;
                    dVar4.f2557e = typedArray.getFloat(index, dVar4.f2557e);
                    break;
                case 69:
                    aVar.f2479d.f2508Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2479d.f2510a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0566b bVar49 = aVar.f2479d;
                    bVar49.f2512b0 = typedArray.getInt(index, bVar49.f2512b0);
                    break;
                case 73:
                    C0566b bVar50 = aVar.f2479d;
                    bVar50.f2514c0 = typedArray.getDimensionPixelSize(index, bVar50.f2514c0);
                    break;
                case 74:
                    aVar.f2479d.f2520f0 = typedArray.getString(index);
                    break;
                case 75:
                    C0566b bVar51 = aVar.f2479d;
                    bVar51.f2528j0 = typedArray.getBoolean(index, bVar51.f2528j0);
                    break;
                case 76:
                    C0567c cVar3 = aVar.f2478c;
                    cVar3.f2549d = typedArray.getInt(index, cVar3.f2549d);
                    break;
                case 77:
                    aVar.f2479d.f2522g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0568d dVar5 = aVar.f2477b;
                    dVar5.f2555c = typedArray.getInt(index, dVar5.f2555c);
                    break;
                case 79:
                    C0567c cVar4 = aVar.f2478c;
                    cVar4.f2551f = typedArray.getFloat(index, cVar4.f2551f);
                    break;
                case 80:
                    C0566b bVar52 = aVar.f2479d;
                    bVar52.f2524h0 = typedArray.getBoolean(index, bVar52.f2524h0);
                    break;
                case 81:
                    C0566b bVar53 = aVar.f2479d;
                    bVar53.f2526i0 = typedArray.getBoolean(index, bVar53.f2526i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2471f.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2471f.get(index));
                    break;
            }
        }
    }

    /* renamed from: A */
    public void mo2899A(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2474c || id != -1) {
                if (!this.f2475d.containsKey(Integer.valueOf(id))) {
                    this.f2475d.put(Integer.valueOf(id), new C0565a());
                }
                C0565a aVar = this.f2475d.get(Integer.valueOf(id));
                if (!aVar.f2479d.f2511b) {
                    aVar.m3102f(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f2479d.f2518e0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f2479d.f2528j0 = barrier.mo2813v();
                            aVar.f2479d.f2512b0 = barrier.getType();
                            aVar.f2479d.f2514c0 = barrier.getMargin();
                        }
                    }
                    aVar.f2479d.f2511b = true;
                }
                C0568d dVar = aVar.f2477b;
                if (!dVar.f2553a) {
                    dVar.f2554b = childAt.getVisibility();
                    aVar.f2477b.f2556d = childAt.getAlpha();
                    aVar.f2477b.f2553a = true;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    C0569e eVar = aVar.f2480e;
                    if (!eVar.f2559a) {
                        eVar.f2559a = true;
                        eVar.f2560b = childAt.getRotation();
                        aVar.f2480e.f2561c = childAt.getRotationX();
                        aVar.f2480e.f2562d = childAt.getRotationY();
                        aVar.f2480e.f2563e = childAt.getScaleX();
                        aVar.f2480e.f2564f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0569e eVar2 = aVar.f2480e;
                            eVar2.f2565g = pivotX;
                            eVar2.f2566h = pivotY;
                        }
                        aVar.f2480e.f2567i = childAt.getTranslationX();
                        aVar.f2480e.f2568j = childAt.getTranslationY();
                        if (i2 >= 21) {
                            aVar.f2480e.f2569k = childAt.getTranslationZ();
                            C0569e eVar3 = aVar.f2480e;
                            if (eVar3.f2570l) {
                                eVar3.f2571m = childAt.getElevation();
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: B */
    public void mo2900B(C0564c cVar) {
        for (Integer next : cVar.f2475d.keySet()) {
            int intValue = next.intValue();
            C0565a aVar = cVar.f2475d.get(next);
            if (!this.f2475d.containsKey(Integer.valueOf(intValue))) {
                this.f2475d.put(Integer.valueOf(intValue), new C0565a());
            }
            C0565a aVar2 = this.f2475d.get(Integer.valueOf(intValue));
            C0566b bVar = aVar2.f2479d;
            if (!bVar.f2511b) {
                bVar.mo2925a(aVar.f2479d);
            }
            C0568d dVar = aVar2.f2477b;
            if (!dVar.f2553a) {
                dVar.mo2929a(aVar.f2477b);
            }
            C0569e eVar = aVar2.f2480e;
            if (!eVar.f2559a) {
                eVar.mo2931a(aVar.f2480e);
            }
            C0567c cVar2 = aVar2.f2478c;
            if (!cVar2.f2546a) {
                cVar2.mo2927a(aVar.f2478c);
            }
            for (String next2 : aVar.f2481f.keySet()) {
                if (!aVar2.f2481f.containsKey(next2)) {
                    aVar2.f2481f.put(next2, aVar.f2481f.get(next2));
                }
            }
        }
    }

    /* renamed from: C */
    public void mo2901C(boolean z) {
        this.f2474c = z;
    }

    /* renamed from: D */
    public void mo2902D(boolean z) {
        this.f2472a = z;
    }

    /* renamed from: c */
    public void mo2903c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2475d.containsKey(Integer.valueOf(id))) {
                Log.v("ConstraintSet", "id unknown " + C0474a.m2601c(childAt));
            } else if (this.f2474c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f2475d.containsKey(Integer.valueOf(id))) {
                C0558a.m3055h(childAt, this.f2475d.get(Integer.valueOf(id)).f2481f);
            }
        }
    }

    /* renamed from: d */
    public void mo2904d(ConstraintLayout constraintLayout) {
        mo2906f(constraintLayout, true);
        constraintLayout.setConstraintSet((C0564c) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: e */
    public void mo2905e(ConstraintHelper constraintHelper, C6246e eVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C6246e> sparseArray) {
        int id = constraintHelper.getId();
        if (this.f2475d.containsKey(Integer.valueOf(id))) {
            C0565a aVar = this.f2475d.get(Integer.valueOf(id));
            if (eVar instanceof C6255j) {
                constraintHelper.mo2485n(aVar, (C6255j) eVar, layoutParams, sparseArray);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2906f(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2475d.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2475d.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0474a.m2601c(childAt));
            } else if (this.f2474c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2475d.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0565a aVar = this.f2475d.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f2479d.f2516d0 = 1;
                    }
                    int i2 = aVar.f2479d.f2516d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f2479d.f2512b0);
                        barrier.setMargin(aVar.f2479d.f2514c0);
                        barrier.setAllowsGoneWidget(aVar.f2479d.f2528j0);
                        C0566b bVar = aVar.f2479d;
                        int[] iArr = bVar.f2518e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f2520f0;
                            if (str != null) {
                                bVar.f2518e0 = m3071m(barrier, str);
                                barrier.setReferencedIds(aVar.f2479d.f2518e0);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.mo2859c();
                    aVar.mo2923d(layoutParams);
                    if (z) {
                        C0558a.m3055h(childAt, aVar.f2481f);
                    }
                    childAt.setLayoutParams(layoutParams);
                    C0568d dVar = aVar.f2477b;
                    if (dVar.f2555c == 0) {
                        childAt.setVisibility(dVar.f2554b);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 17) {
                        childAt.setAlpha(aVar.f2477b.f2556d);
                        childAt.setRotation(aVar.f2480e.f2560b);
                        childAt.setRotationX(aVar.f2480e.f2561c);
                        childAt.setRotationY(aVar.f2480e.f2562d);
                        childAt.setScaleX(aVar.f2480e.f2563e);
                        childAt.setScaleY(aVar.f2480e.f2564f);
                        if (!Float.isNaN(aVar.f2480e.f2565g)) {
                            childAt.setPivotX(aVar.f2480e.f2565g);
                        }
                        if (!Float.isNaN(aVar.f2480e.f2566h)) {
                            childAt.setPivotY(aVar.f2480e.f2566h);
                        }
                        childAt.setTranslationX(aVar.f2480e.f2567i);
                        childAt.setTranslationY(aVar.f2480e.f2568j);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(aVar.f2480e.f2569k);
                            C0569e eVar = aVar.f2480e;
                            if (eVar.f2570l) {
                                childAt.setElevation(eVar.f2571m);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0565a aVar2 = this.f2475d.get(num);
            int i4 = aVar2.f2479d.f2516d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0566b bVar2 = aVar2.f2479d;
                int[] iArr2 = bVar2.f2518e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2520f0;
                    if (str2 != null) {
                        bVar2.f2518e0 = m3071m(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f2479d.f2518e0);
                    }
                }
                barrier2.setType(aVar2.f2479d.f2512b0);
                barrier2.setMargin(aVar2.f2479d.f2514c0);
                ConstraintLayout.LayoutParams d = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2824u();
                aVar2.mo2923d(d);
                constraintLayout.addView(barrier2, d);
            }
            if (aVar2.f2479d.f2509a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams d2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2923d(d2);
                constraintLayout.addView(guideline, d2);
            }
        }
    }

    /* renamed from: g */
    public void mo2907g(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.f2475d.containsKey(Integer.valueOf(i))) {
            this.f2475d.get(Integer.valueOf(i)).mo2923d(layoutParams);
        }
    }

    /* renamed from: h */
    public void mo2908h(int i, int i2) {
        if (this.f2475d.containsKey(Integer.valueOf(i))) {
            C0565a aVar = this.f2475d.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0566b bVar = aVar.f2479d;
                    bVar.f2525i = -1;
                    bVar.f2523h = -1;
                    bVar.f2486D = -1;
                    bVar.f2492J = -1;
                    return;
                case 2:
                    C0566b bVar2 = aVar.f2479d;
                    bVar2.f2529k = -1;
                    bVar2.f2527j = -1;
                    bVar2.f2487E = -1;
                    bVar2.f2494L = -1;
                    return;
                case 3:
                    C0566b bVar3 = aVar.f2479d;
                    bVar3.f2531m = -1;
                    bVar3.f2530l = -1;
                    bVar3.f2488F = -1;
                    bVar3.f2493K = -1;
                    return;
                case 4:
                    C0566b bVar4 = aVar.f2479d;
                    bVar4.f2532n = -1;
                    bVar4.f2533o = -1;
                    bVar4.f2489G = -1;
                    bVar4.f2495M = -1;
                    return;
                case 5:
                    aVar.f2479d.f2534p = -1;
                    return;
                case 6:
                    C0566b bVar5 = aVar.f2479d;
                    bVar5.f2535q = -1;
                    bVar5.f2536r = -1;
                    bVar5.f2491I = -1;
                    bVar5.f2497O = -1;
                    return;
                case 7:
                    C0566b bVar6 = aVar.f2479d;
                    bVar6.f2537s = -1;
                    bVar6.f2538t = -1;
                    bVar6.f2490H = -1;
                    bVar6.f2496N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: i */
    public void mo2909i(Context context, int i) {
        mo2910j((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: j */
    public void mo2910j(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2475d.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2474c || id != -1) {
                if (!this.f2475d.containsKey(Integer.valueOf(id))) {
                    this.f2475d.put(Integer.valueOf(id), new C0565a());
                }
                C0565a aVar = this.f2475d.get(Integer.valueOf(id));
                aVar.f2481f = C0558a.m3053b(this.f2473b, childAt);
                aVar.m3102f(id, layoutParams);
                aVar.f2477b.f2554b = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    aVar.f2477b.f2556d = childAt.getAlpha();
                    aVar.f2480e.f2560b = childAt.getRotation();
                    aVar.f2480e.f2561c = childAt.getRotationX();
                    aVar.f2480e.f2562d = childAt.getRotationY();
                    aVar.f2480e.f2563e = childAt.getScaleX();
                    aVar.f2480e.f2564f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0569e eVar = aVar.f2480e;
                        eVar.f2565g = pivotX;
                        eVar.f2566h = pivotY;
                    }
                    aVar.f2480e.f2567i = childAt.getTranslationX();
                    aVar.f2480e.f2568j = childAt.getTranslationY();
                    if (i2 >= 21) {
                        aVar.f2480e.f2569k = childAt.getTranslationZ();
                        C0569e eVar2 = aVar.f2480e;
                        if (eVar2.f2570l) {
                            eVar2.f2571m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2479d.f2528j0 = barrier.mo2813v();
                    aVar.f2479d.f2518e0 = barrier.getReferencedIds();
                    aVar.f2479d.f2512b0 = barrier.getType();
                    aVar.f2479d.f2514c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: k */
    public void mo2911k(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2475d.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2474c || id != -1) {
                if (!this.f2475d.containsKey(Integer.valueOf(id))) {
                    this.f2475d.put(Integer.valueOf(id), new C0565a());
                }
                C0565a aVar = this.f2475d.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar.m3104h((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.m3103g(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: l */
    public void mo2912l(int i, int i2, int i3, float f) {
        C0566b bVar = m3073o(i).f2479d;
        bVar.f2542x = i2;
        bVar.f2543y = i3;
        bVar.f2544z = f;
    }

    /* renamed from: p */
    public C0565a mo2913p(int i) {
        if (this.f2475d.containsKey(Integer.valueOf(i))) {
            return this.f2475d.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: q */
    public int mo2914q(int i) {
        return m3073o(i).f2479d.f2515d;
    }

    /* renamed from: r */
    public int[] mo2915r() {
        Integer[] numArr = (Integer[]) this.f2475d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: s */
    public C0565a mo2916s(int i) {
        return m3073o(i);
    }

    /* renamed from: t */
    public int mo2917t(int i) {
        return m3073o(i).f2477b.f2554b;
    }

    /* renamed from: u */
    public int mo2918u(int i) {
        return m3073o(i).f2477b.f2555c;
    }

    /* renamed from: v */
    public int mo2919v(int i) {
        return m3073o(i).f2479d.f2513c;
    }

    /* renamed from: w */
    public void mo2920w(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0565a n = m3072n(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        n.f2479d.f2509a = true;
                    }
                    this.f2475d.put(Integer.valueOf(n.f2476a), n);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        continue;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2921x(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0188
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0179
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r0 = r9.f2475d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r3 = r2.f2476a     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2 = r1
            goto L_0x0179
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016c;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0179
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f2481f     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.C0558a.m3054g(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.c$c r0 = r2.f2478c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2928b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.c$b r0 = r2.f2479d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2926b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.c$e r0 = r2.f2480e     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2932b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.c$d r0 = r2.f2477b     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2930b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.c$a r0 = r9.m3072n(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.c$b r2 = r0.f2479d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f2516d0 = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.c$a r0 = r9.m3072n(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.c$b r2 = r0.f2479d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f2509a = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f2511b = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x016c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.c$a r0 = r9.m3072n(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0174:
            r2 = r0
            goto L_0x0179
        L_0x0176:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0179:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0006
        L_0x017f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0188
        L_0x0184:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0564c.mo2921x(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
