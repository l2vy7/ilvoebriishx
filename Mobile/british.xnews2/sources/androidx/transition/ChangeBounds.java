package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p010b0.C1532g;
import p110m0.C5723u;

public class ChangeBounds extends Transition {

    /* renamed from: O */
    private static final String[] f5681O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: P */
    private static final Property<Drawable, PointF> f5682P = new C1245b(PointF.class, "boundsOrigin");

    /* renamed from: Q */
    private static final Property<C1254k, PointF> f5683Q = new C1246c(PointF.class, "topLeft");

    /* renamed from: R */
    private static final Property<C1254k, PointF> f5684R = new C1247d(PointF.class, "bottomRight");

    /* renamed from: S */
    private static final Property<View, PointF> f5685S = new C1248e(PointF.class, "bottomRight");

    /* renamed from: T */
    private static final Property<View, PointF> f5686T = new C1249f(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<View, PointF> f5687U = new C1250g(PointF.class, "position");

    /* renamed from: V */
    private static C1326o f5688V = new C1326o();

    /* renamed from: L */
    private int[] f5689L = new int[2];

    /* renamed from: M */
    private boolean f5690M = false;

    /* renamed from: N */
    private boolean f5691N = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    class C1244a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5692a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f5693b;

        /* renamed from: c */
        final /* synthetic */ View f5694c;

        /* renamed from: d */
        final /* synthetic */ float f5695d;

        C1244a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5692a = viewGroup;
            this.f5693b = bitmapDrawable;
            this.f5694c = view;
            this.f5695d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1305f0.m7061b(this.f5692a).mo6295b(this.f5693b);
            C1305f0.m7067h(this.f5694c, this.f5695d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    static class C1245b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f5697a = new Rect();

        C1245b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5697a);
            Rect rect = this.f5697a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5697a);
            this.f5697a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5697a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    static class C1246c extends Property<C1254k, PointF> {
        C1246c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1254k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1254k kVar, PointF pointF) {
            kVar.mo6188c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    static class C1247d extends Property<C1254k, PointF> {
        C1247d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1254k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1254k kVar, PointF pointF) {
            kVar.mo6187a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    static class C1248e extends Property<View, PointF> {
        C1248e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1305f0.m7066g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    static class C1249f extends Property<View, PointF> {
        C1249f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1305f0.m7066g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    static class C1250g extends Property<View, PointF> {
        C1250g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1305f0.m7066g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    class C1251h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1254k f5698a;
        private C1254k mViewBounds;

        C1251h(C1254k kVar) {
            this.f5698a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    class C1252i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5700a;

        /* renamed from: b */
        final /* synthetic */ View f5701b;

        /* renamed from: c */
        final /* synthetic */ Rect f5702c;

        /* renamed from: d */
        final /* synthetic */ int f5703d;

        /* renamed from: e */
        final /* synthetic */ int f5704e;

        /* renamed from: f */
        final /* synthetic */ int f5705f;

        /* renamed from: g */
        final /* synthetic */ int f5706g;

        C1252i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5701b = view;
            this.f5702c = rect;
            this.f5703d = i;
            this.f5704e = i2;
            this.f5705f = i3;
            this.f5706g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5700a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5700a) {
                C5723u.m25342u0(this.f5701b, this.f5702c);
                C1305f0.m7066g(this.f5701b, this.f5703d, this.f5704e, this.f5705f, this.f5706g);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    class C1253j extends C1330r {

        /* renamed from: a */
        boolean f5708a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5709b;

        C1253j(ViewGroup viewGroup) {
            this.f5709b = viewGroup;
        }

        /* renamed from: b */
        public void mo6183b(Transition transition) {
            C1289a0.m7006d(this.f5709b, false);
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            if (!this.f5708a) {
                C1289a0.m7006d(this.f5709b, false);
            }
            transition.mo6246i0(this);
        }

        /* renamed from: d */
        public void mo6185d(Transition transition) {
            C1289a0.m7006d(this.f5709b, false);
            this.f5708a = true;
        }

        /* renamed from: e */
        public void mo6186e(Transition transition) {
            C1289a0.m7006d(this.f5709b, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    private static class C1254k {

        /* renamed from: a */
        private int f5711a;

        /* renamed from: b */
        private int f5712b;

        /* renamed from: c */
        private int f5713c;

        /* renamed from: d */
        private int f5714d;

        /* renamed from: e */
        private View f5715e;

        /* renamed from: f */
        private int f5716f;

        /* renamed from: g */
        private int f5717g;

        C1254k(View view) {
            this.f5715e = view;
        }

        /* renamed from: b */
        private void m6792b() {
            C1305f0.m7066g(this.f5715e, this.f5711a, this.f5712b, this.f5713c, this.f5714d);
            this.f5716f = 0;
            this.f5717g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6187a(PointF pointF) {
            this.f5713c = Math.round(pointF.x);
            this.f5714d = Math.round(pointF.y);
            int i = this.f5717g + 1;
            this.f5717g = i;
            if (this.f5716f == i) {
                m6792b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6188c(PointF pointF) {
            this.f5711a = Math.round(pointF.x);
            this.f5712b = Math.round(pointF.y);
            int i = this.f5716f + 1;
            this.f5716f = i;
            if (i == this.f5717g) {
                m6792b();
            }
        }
    }

    public ChangeBounds() {
    }

    /* renamed from: w0 */
    private void m6769w0(C1336u uVar) {
        View view = uVar.f5950b;
        if (C5723u.m25294T(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            uVar.f5949a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            uVar.f5949a.put("android:changeBounds:parent", uVar.f5950b.getParent());
            if (this.f5691N) {
                uVar.f5950b.getLocationInWindow(this.f5689L);
                uVar.f5949a.put("android:changeBounds:windowX", Integer.valueOf(this.f5689L[0]));
                uVar.f5949a.put("android:changeBounds:windowY", Integer.valueOf(this.f5689L[1]));
            }
            if (this.f5690M) {
                uVar.f5949a.put("android:changeBounds:clip", C5723u.m25341u(view));
            }
        }
    }

    /* renamed from: x0 */
    private boolean m6770x0(View view, View view2) {
        if (!this.f5691N) {
            return true;
        }
        C1336u K = mo6227K(view, true);
        if (K == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == K.f5950b) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public String[] mo6151U() {
        return f5681O;
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        m6769w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        m6769w0(uVar);
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        C1336u uVar3 = uVar;
        C1336u uVar4 = uVar2;
        if (uVar3 == null || uVar4 == null) {
            return null;
        }
        Map<String, Object> map = uVar3.f5949a;
        Map<String, Object> map2 = uVar4.f5949a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = uVar4.f5950b;
        if (m6770x0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) uVar3.f5949a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) uVar4.f5949a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) uVar3.f5949a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) uVar4.f5949a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f5690M) {
                view = view3;
                C1305f0.m7066g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C1320l.m7111a(view, f5687U, mo6229M().mo6147a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C1254k kVar = new C1254k(view);
                        ObjectAnimator a = C1320l.m7111a(kVar, f5683Q, mo6229M().mo6147a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C1320l.m7111a(kVar, f5684R, mo6229M().mo6147a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C1251h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C1320l.m7111a(view, f5685S, mo6229M().mo6147a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C1320l.m7111a(view, f5686T, mo6229M().mo6147a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C1305f0.m7066g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C1320l.m7111a(view, f5687U, mo6229M().mo6147a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C5723u.m25342u0(view, rect);
                    C1326o oVar = f5688V;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", oVar, objArr);
                    ofObject.addListener(new C1252i(view, rect6, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C1334t.m7141c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1289a0.m7006d(viewGroup4, true);
                mo6239a(new C1253j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) uVar3.f5949a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) uVar3.f5949a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) uVar4.f5949a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) uVar4.f5949a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5689L);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C1305f0.m7062c(view2);
        C1305f0.m7067h(view2, 0.0f);
        C1305f0.m7061b(viewGroup).mo6294a(bitmapDrawable);
        PathMotion M = mo6229M();
        int[] iArr = this.f5689L;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C1324n.m7124a(f5682P, M.mo6147a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C1244a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    /* renamed from: y0 */
    public void mo6155y0(boolean z) {
        this.f5690M = z;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5928d);
        boolean e = C1532g.m7907e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo6155y0(e);
    }
}
