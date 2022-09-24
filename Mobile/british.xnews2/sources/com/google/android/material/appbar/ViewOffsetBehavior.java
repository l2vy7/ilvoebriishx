package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private C10019a f47218a;

    /* renamed from: b */
    private int f47219b = 0;

    /* renamed from: c */
    private int f47220c = 0;

    public ViewOffsetBehavior() {
    }

    /* renamed from: E */
    public int mo39580E() {
        C10019a aVar = this.f47218a;
        if (aVar != null) {
            return aVar.mo39684c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo39671F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2944M(v, i);
    }

    /* renamed from: G */
    public boolean mo39581G(int i) {
        C10019a aVar = this.f47218a;
        if (aVar != null) {
            return aVar.mo39687f(i);
        }
        this.f47219b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo3005l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo39671F(coordinatorLayout, v, i);
        if (this.f47218a == null) {
            this.f47218a = new C10019a(v);
        }
        this.f47218a.mo39685d();
        this.f47218a.mo39682a();
        int i2 = this.f47219b;
        if (i2 != 0) {
            this.f47218a.mo39687f(i2);
            this.f47219b = 0;
        }
        int i3 = this.f47220c;
        if (i3 == 0) {
            return true;
        }
        this.f47218a.mo39686e(i3);
        this.f47220c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
