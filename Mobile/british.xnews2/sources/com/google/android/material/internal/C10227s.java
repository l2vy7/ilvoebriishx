package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import p110m0.C5690c0;
import p110m0.C5718p;
import p110m0.C5723u;
import p193c6.C6532l;

/* renamed from: com.google.android.material.internal.s */
/* compiled from: ViewUtils */
public class C10227s {

    /* renamed from: com.google.android.material.internal.s$a */
    /* compiled from: ViewUtils */
    static class C10228a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f48139b;

        C10228a(View view) {
            this.f48139b = view;
        }

        public void run() {
            ((InputMethodManager) this.f48139b.getContext().getSystemService("input_method")).showSoftInput(this.f48139b, 1);
        }
    }

    /* renamed from: com.google.android.material.internal.s$b */
    /* compiled from: ViewUtils */
    static class C10229b implements C10232e {

        /* renamed from: a */
        final /* synthetic */ boolean f48140a;

        /* renamed from: b */
        final /* synthetic */ boolean f48141b;

        /* renamed from: c */
        final /* synthetic */ boolean f48142c;

        /* renamed from: d */
        final /* synthetic */ C10232e f48143d;

        C10229b(boolean z, boolean z2, boolean z3, C10232e eVar) {
            this.f48140a = z;
            this.f48141b = z2;
            this.f48142c = z3;
            this.f48143d = eVar;
        }

        /* renamed from: a */
        public C5690c0 mo19455a(View view, C5690c0 c0Var, C10233f fVar) {
            if (this.f48140a) {
                fVar.f48149d += c0Var.mo22410i();
            }
            boolean h = C10227s.m47140h(view);
            if (this.f48141b) {
                if (h) {
                    fVar.f48148c += c0Var.mo22411j();
                } else {
                    fVar.f48146a += c0Var.mo22411j();
                }
            }
            if (this.f48142c) {
                if (h) {
                    fVar.f48146a += c0Var.mo22412k();
                } else {
                    fVar.f48148c += c0Var.mo22412k();
                }
            }
            fVar.mo41013a(view);
            C10232e eVar = this.f48143d;
            return eVar != null ? eVar.mo19455a(view, c0Var, fVar) : c0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.s$c */
    /* compiled from: ViewUtils */
    static class C10230c implements C5718p {

        /* renamed from: a */
        final /* synthetic */ C10232e f48144a;

        /* renamed from: b */
        final /* synthetic */ C10233f f48145b;

        C10230c(C10232e eVar, C10233f fVar) {
            this.f48144a = eVar;
            this.f48145b = fVar;
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            return this.f48144a.mo19455a(view, c0Var, new C10233f(this.f48145b));
        }
    }

    /* renamed from: com.google.android.material.internal.s$d */
    /* compiled from: ViewUtils */
    static class C10231d implements View.OnAttachStateChangeListener {
        C10231d() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C5723u.m25324l0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.s$e */
    /* compiled from: ViewUtils */
    public interface C10232e {
        /* renamed from: a */
        C5690c0 mo19455a(View view, C5690c0 c0Var, C10233f fVar);
    }

    /* renamed from: a */
    public static void m47133a(View view, AttributeSet attributeSet, int i, int i2, C10232e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C6532l.f26958g3, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C6532l.f26969h3, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C6532l.f26980i3, false);
        boolean z3 = obtainStyledAttributes.getBoolean(C6532l.f26991j3, false);
        obtainStyledAttributes.recycle();
        m47134b(view, new C10229b(z, z2, z3, eVar));
    }

    /* renamed from: b */
    public static void m47134b(View view, C10232e eVar) {
        C5723u.m25266B0(view, new C10230c(eVar, new C10233f(C5723u.m25275G(view), view.getPaddingTop(), C5723u.m25273F(view), view.getPaddingBottom())));
        m47142j(view);
    }

    /* renamed from: c */
    public static float m47135c(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    public static ViewGroup m47136d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: e */
    public static C10226r m47137e(View view) {
        return m47138f(m47136d(view));
    }

    /* renamed from: f */
    public static C10226r m47138f(View view) {
        if (view == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return new C10225q(view);
        }
        return C10223p.m47121c(view);
    }

    /* renamed from: g */
    public static float m47139g(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C5723u.m25345w((View) parent);
        }
        return f;
    }

    /* renamed from: h */
    public static boolean m47140h(View view) {
        return C5723u.m25265B(view) == 1;
    }

    /* renamed from: i */
    public static PorterDuff.Mode m47141i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: j */
    public static void m47142j(View view) {
        if (C5723u.m25293S(view)) {
            C5723u.m25324l0(view);
        } else {
            view.addOnAttachStateChangeListener(new C10231d());
        }
    }

    /* renamed from: k */
    public static void m47143k(View view) {
        view.requestFocus();
        view.post(new C10228a(view));
    }

    /* renamed from: com.google.android.material.internal.s$f */
    /* compiled from: ViewUtils */
    public static class C10233f {

        /* renamed from: a */
        public int f48146a;

        /* renamed from: b */
        public int f48147b;

        /* renamed from: c */
        public int f48148c;

        /* renamed from: d */
        public int f48149d;

        public C10233f(int i, int i2, int i3, int i4) {
            this.f48146a = i;
            this.f48147b = i2;
            this.f48148c = i3;
            this.f48149d = i4;
        }

        /* renamed from: a */
        public void mo41013a(View view) {
            C5723u.m25268C0(view, this.f48146a, this.f48147b, this.f48148c, this.f48149d);
        }

        public C10233f(C10233f fVar) {
            this.f48146a = fVar.f48146a;
            this.f48147b = fVar.f48147b;
            this.f48148c = fVar.f48148c;
            this.f48149d = fVar.f48149d;
        }
    }
}
