package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p110m0.C5723u;
import p222j6.C10632a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f48770a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C10374a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f48771b;

        /* renamed from: c */
        final /* synthetic */ int f48772c;

        /* renamed from: d */
        final /* synthetic */ C10632a f48773d;

        C10374a(View view, int i, C10632a aVar) {
            this.f48771b = view;
            this.f48772c = i;
            this.f48773d = aVar;
        }

        public boolean onPreDraw() {
            this.f48771b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f48770a == this.f48772c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C10632a aVar = this.f48773d;
                expandableBehavior.mo41810H((View) aVar, this.f48771b, aVar.mo40606a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: F */
    private boolean m47884F(boolean z) {
        if (z) {
            int i = this.f48770a;
            return i == 0 || i == 2;
        } else if (this.f48770a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C10632a mo41809G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> v = coordinatorLayout.mo2985v(view);
        int size = v.size();
        for (int i = 0; i < size; i++) {
            View view2 = v.get(i);
            if (mo2998e(coordinatorLayout, view, view2)) {
                return (C10632a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo41810H(View view, View view2, boolean z, boolean z2);

    /* renamed from: e */
    public abstract boolean mo2998e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* renamed from: h */
    public boolean mo3001h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C10632a aVar = (C10632a) view2;
        if (!m47884F(aVar.mo40606a())) {
            return false;
        }
        this.f48770a = aVar.mo40606a() ? 1 : 2;
        return mo41810H((View) aVar, view, aVar.mo40606a(), true);
    }

    /* renamed from: l */
    public boolean mo3005l(CoordinatorLayout coordinatorLayout, View view, int i) {
        C10632a G;
        if (C5723u.m25294T(view) || (G = mo41809G(coordinatorLayout, view)) == null || !m47884F(G.mo40606a())) {
            return false;
        }
        int i2 = G.mo40606a() ? 1 : 2;
        this.f48770a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C10374a(view, i2, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
