package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;
import p010b0.C1532g;
import p110m0.C5723u;
import p111m1.C5747c;

public class Slide extends Visibility {

    /* renamed from: P */
    private static final TimeInterpolator f5766P = new DecelerateInterpolator();

    /* renamed from: Q */
    private static final TimeInterpolator f5767Q = new AccelerateInterpolator();

    /* renamed from: R */
    private static final C1273g f5768R = new C1267a();

    /* renamed from: S */
    private static final C1273g f5769S = new C1268b();

    /* renamed from: T */
    private static final C1273g f5770T = new C1269c();

    /* renamed from: U */
    private static final C1273g f5771U = new C1270d();

    /* renamed from: V */
    private static final C1273g f5772V = new C1271e();

    /* renamed from: W */
    private static final C1273g f5773W = new C1272f();

    /* renamed from: N */
    private C1273g f5774N = f5773W;

    /* renamed from: O */
    private int f5775O = 80;

    /* renamed from: androidx.transition.Slide$a */
    static class C1267a extends C1274h {
        C1267a() {
            super((C1267a) null);
        }

        /* renamed from: b */
        public float mo6220b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    static class C1268b extends C1274h {
        C1268b() {
            super((C1267a) null);
        }

        /* renamed from: b */
        public float mo6220b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C5723u.m25265B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    static class C1269c extends C1275i {
        C1269c() {
            super((C1267a) null);
        }

        /* renamed from: a */
        public float mo6221a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    static class C1270d extends C1274h {
        C1270d() {
            super((C1267a) null);
        }

        /* renamed from: b */
        public float mo6220b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    static class C1271e extends C1274h {
        C1271e() {
            super((C1267a) null);
        }

        /* renamed from: b */
        public float mo6220b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C5723u.m25265B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    static class C1272f extends C1275i {
        C1272f() {
            super((C1267a) null);
        }

        /* renamed from: a */
        public float mo6221a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    private interface C1273g {
        /* renamed from: a */
        float mo6221a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo6220b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    private static abstract class C1274h implements C1273g {
        private C1274h() {
        }

        /* renamed from: a */
        public float mo6221a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ C1274h(C1267a aVar) {
            this();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    private static abstract class C1275i implements C1273g {
        private C1275i() {
        }

        /* renamed from: b */
        public float mo6220b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ C1275i(C1267a aVar) {
            this();
        }
    }

    public Slide() {
        mo6219E0(80);
    }

    /* renamed from: w0 */
    private void m6860w0(C1336u uVar) {
        int[] iArr = new int[2];
        uVar.f5950b.getLocationOnScreen(iArr);
        uVar.f5949a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: B0 */
    public Animator mo6214B0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        if (uVar == null) {
            return null;
        }
        int[] iArr = (int[]) uVar.f5949a.get("android:slide:screenPosition");
        return C1338w.m7143a(view, uVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f5774N.mo6220b(viewGroup, view), this.f5774N.mo6221a(viewGroup, view), f5767Q, this);
    }

    /* renamed from: E0 */
    public void mo6219E0(int i) {
        if (i == 3) {
            this.f5774N = f5768R;
        } else if (i == 5) {
            this.f5774N = f5771U;
        } else if (i == 48) {
            this.f5774N = f5770T;
        } else if (i == 80) {
            this.f5774N = f5773W;
        } else if (i == 8388611) {
            this.f5774N = f5769S;
        } else if (i == 8388613) {
            this.f5774N = f5772V;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f5775O = i;
        C5747c cVar = new C5747c();
        cVar.mo22519j(i);
        mo6259s0(cVar);
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        super.mo6152k(uVar);
        m6860w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        super.mo6153n(uVar);
        m6860w0(uVar);
    }

    /* renamed from: z0 */
    public Animator mo6215z0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        if (uVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) uVar2.f5949a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1338w.m7143a(view, uVar2, iArr[0], iArr[1], this.f5774N.mo6220b(viewGroup, view), this.f5774N.mo6221a(viewGroup, view), translationX, translationY, f5766P, this);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5932h);
        int k = C1532g.m7913k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo6219E0(k);
    }
}
