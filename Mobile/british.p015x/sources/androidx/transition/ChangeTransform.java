package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;
import p010b0.C1532g;
import p111m0.C5723u;
import p112m1.C5746b;

public class ChangeTransform extends Transition {

    /* renamed from: O */
    private static final String[] f5726O = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: P */
    private static final Property<C1263e, float[]> f5727P = new C1259a(float[].class, "nonTranslations");

    /* renamed from: Q */
    private static final Property<C1263e, PointF> f5728Q = new C1260b(PointF.class, "translations");

    /* renamed from: R */
    private static final boolean f5729R = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: L */
    boolean f5730L = true;

    /* renamed from: M */
    private boolean f5731M = true;

    /* renamed from: N */
    private Matrix f5732N = new Matrix();

    /* renamed from: androidx.transition.ChangeTransform$a */
    static class C1259a extends Property<C1263e, float[]> {
        C1259a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C1263e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1263e eVar, float[] fArr) {
            eVar.mo6210d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    static class C1260b extends Property<C1263e, PointF> {
        C1260b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1263e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1263e eVar, PointF pointF) {
            eVar.mo6209c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    class C1261c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5733a;

        /* renamed from: b */
        private Matrix f5734b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f5735c;

        /* renamed from: d */
        final /* synthetic */ Matrix f5736d;

        /* renamed from: e */
        final /* synthetic */ View f5737e;

        /* renamed from: f */
        final /* synthetic */ C1264f f5738f;

        /* renamed from: g */
        final /* synthetic */ C1263e f5739g;

        C1261c(boolean z, Matrix matrix, View view, C1264f fVar, C1263e eVar) {
            this.f5735c = z;
            this.f5736d = matrix;
            this.f5737e = view;
            this.f5738f = fVar;
            this.f5739g = eVar;
        }

        /* renamed from: a */
        private void m6833a(Matrix matrix) {
            this.f5734b.set(matrix);
            this.f5737e.setTag(C5746b.transition_transform, this.f5734b);
            this.f5738f.mo6211a(this.f5737e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5733a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5733a) {
                if (!this.f5735c || !ChangeTransform.this.f5730L) {
                    this.f5737e.setTag(C5746b.transition_transform, (Object) null);
                    this.f5737e.setTag(C5746b.parent_matrix, (Object) null);
                } else {
                    m6833a(this.f5736d);
                }
            }
            C1305f0.m7065f(this.f5737e, (Matrix) null);
            this.f5738f.mo6211a(this.f5737e);
        }

        public void onAnimationPause(Animator animator) {
            m6833a(this.f5739g.mo6208a());
        }

        public void onAnimationResume(Animator animator) {
            ChangeTransform.m6818A0(this.f5737e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    private static class C1262d extends C1330r {

        /* renamed from: a */
        private View f5741a;

        /* renamed from: b */
        private C1302e f5742b;

        C1262d(View view, C1302e eVar) {
            this.f5741a = view;
            this.f5742b = eVar;
        }

        /* renamed from: b */
        public void mo6183b(Transition transition) {
            this.f5742b.setVisibility(4);
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            transition.mo6246i0(this);
            C1313i.m7097b(this.f5741a);
            this.f5741a.setTag(C5746b.transition_transform, (Object) null);
            this.f5741a.setTag(C5746b.parent_matrix, (Object) null);
        }

        /* renamed from: e */
        public void mo6186e(Transition transition) {
            this.f5742b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    private static class C1263e {

        /* renamed from: a */
        private final Matrix f5743a = new Matrix();

        /* renamed from: b */
        private final View f5744b;

        /* renamed from: c */
        private final float[] f5745c;

        /* renamed from: d */
        private float f5746d;

        /* renamed from: e */
        private float f5747e;

        C1263e(View view, float[] fArr) {
            this.f5744b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f5745c = fArr2;
            this.f5746d = fArr2[2];
            this.f5747e = fArr2[5];
            m6837b();
        }

        /* renamed from: b */
        private void m6837b() {
            float[] fArr = this.f5745c;
            fArr[2] = this.f5746d;
            fArr[5] = this.f5747e;
            this.f5743a.setValues(fArr);
            C1305f0.m7065f(this.f5744b, this.f5743a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Matrix mo6208a() {
            return this.f5743a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6209c(PointF pointF) {
            this.f5746d = pointF.x;
            this.f5747e = pointF.y;
            m6837b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6210d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f5745c, 0, fArr.length);
            m6837b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    private static class C1264f {

        /* renamed from: a */
        final float f5748a;

        /* renamed from: b */
        final float f5749b;

        /* renamed from: c */
        final float f5750c;

        /* renamed from: d */
        final float f5751d;

        /* renamed from: e */
        final float f5752e;

        /* renamed from: f */
        final float f5753f;

        /* renamed from: g */
        final float f5754g;

        /* renamed from: h */
        final float f5755h;

        C1264f(View view) {
            this.f5748a = view.getTranslationX();
            this.f5749b = view.getTranslationY();
            this.f5750c = C5723u.m25285L(view);
            this.f5751d = view.getScaleX();
            this.f5752e = view.getScaleY();
            this.f5753f = view.getRotationX();
            this.f5754g = view.getRotationY();
            this.f5755h = view.getRotation();
        }

        /* renamed from: a */
        public void mo6211a(View view) {
            ChangeTransform.m6820C0(view, this.f5748a, this.f5749b, this.f5750c, this.f5751d, this.f5752e, this.f5753f, this.f5754g, this.f5755h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1264f)) {
                return false;
            }
            C1264f fVar = (C1264f) obj;
            if (fVar.f5748a == this.f5748a && fVar.f5749b == this.f5749b && fVar.f5750c == this.f5750c && fVar.f5751d == this.f5751d && fVar.f5752e == this.f5752e && fVar.f5753f == this.f5753f && fVar.f5754g == this.f5754g && fVar.f5755h == this.f5755h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            float f = this.f5748a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f5749b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f5750c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f5751d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f5752e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f5753f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f5754g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f5755h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    public ChangeTransform() {
    }

    /* renamed from: A0 */
    static void m6818A0(View view) {
        m6820C0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: B0 */
    private void m6819B0(C1336u uVar, C1336u uVar2) {
        Matrix matrix = (Matrix) uVar2.f5949a.get("android:changeTransform:parentMatrix");
        uVar2.f5950b.setTag(C5746b.parent_matrix, matrix);
        Matrix matrix2 = this.f5732N;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) uVar.f5949a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            uVar.f5949a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) uVar.f5949a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: C0 */
    static void m6820C0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C5723u.m25276G0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: w0 */
    private void m6821w0(C1336u uVar) {
        View view = uVar.f5950b;
        if (view.getVisibility() != 8) {
            uVar.f5949a.put("android:changeTransform:parent", view.getParent());
            uVar.f5949a.put("android:changeTransform:transforms", new C1264f(view));
            Matrix matrix = view.getMatrix();
            uVar.f5949a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f5731M) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C1305f0.m7069j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                uVar.f5949a.put("android:changeTransform:parentMatrix", matrix2);
                uVar.f5949a.put("android:changeTransform:intermediateMatrix", view.getTag(C5746b.transition_transform));
                uVar.f5949a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C5746b.parent_matrix));
            }
        }
    }

    /* renamed from: x0 */
    private void m6822x0(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        View view = uVar2.f5950b;
        Matrix matrix = new Matrix((Matrix) uVar2.f5949a.get("android:changeTransform:parentMatrix"));
        C1305f0.m7070k(viewGroup, matrix);
        C1302e a = C1313i.m7096a(view, viewGroup, matrix);
        if (a != null) {
            a.mo6306a((ViewGroup) uVar.f5949a.get("android:changeTransform:parent"), uVar.f5950b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.f5804s;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.mo6239a(new C1262d(view, a));
            if (f5729R) {
                View view2 = uVar.f5950b;
                if (view2 != uVar2.f5950b) {
                    C1305f0.m7067h(view2, 0.0f);
                }
                C1305f0.m7067h(view, 1.0f);
            }
        }
    }

    /* renamed from: y0 */
    private ObjectAnimator m6823y0(C1336u uVar, C1336u uVar2, boolean z) {
        Matrix matrix = (Matrix) uVar.f5949a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) uVar2.f5949a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C1317k.f5908a;
        }
        if (matrix2 == null) {
            matrix2 = C1317k.f5908a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = uVar2.f5950b;
        m6818A0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1263e eVar = new C1263e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f5727P, new C1293c(new float[9]), new float[][]{fArr, fArr2}), C1324n.m7124a(f5728Q, mo6229M().mo6147a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C1261c cVar = new C1261c(z, matrix3, view, (C1264f) uVar2.f5949a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C1287a.m7000a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f5950b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6824z0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo6238Y(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo6238Y(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.u r4 = r3.mo6227K(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f5950b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.m6824z0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: U */
    public String[] mo6151U() {
        return f5726O;
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        m6821w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        m6821w0(uVar);
        if (!f5729R) {
            ((ViewGroup) uVar.f5950b.getParent()).startViewTransition(uVar.f5950b);
        }
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        if (uVar == null || uVar2 == null || !uVar.f5949a.containsKey("android:changeTransform:parent") || !uVar2.f5949a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) uVar.f5949a.get("android:changeTransform:parent");
        boolean z = this.f5731M && !m6824z0(viewGroup2, (ViewGroup) uVar2.f5949a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) uVar.f5949a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            uVar.f5949a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) uVar.f5949a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            uVar.f5949a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m6819B0(uVar, uVar2);
        }
        ObjectAnimator y0 = m6823y0(uVar, uVar2, z);
        if (z && y0 != null && this.f5730L) {
            m6822x0(viewGroup, uVar, uVar2);
        } else if (!f5729R) {
            viewGroup2.endViewTransition(uVar.f5950b);
        }
        return y0;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5931g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f5730L = C1532g.m7907e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f5731M = C1532g.m7907e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
