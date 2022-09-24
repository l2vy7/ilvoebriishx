package p111m0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: m0.o */
/* compiled from: NestedScrollingParentHelper */
public class C5717o {

    /* renamed from: a */
    private int f24343a;

    /* renamed from: b */
    private int f24344b;

    public C5717o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo22469a() {
        return this.f24343a | this.f24344b;
    }

    /* renamed from: b */
    public void mo22470b(View view, View view2, int i) {
        mo22471c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo22471c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f24344b = i;
        } else {
            this.f24343a = i;
        }
    }

    /* renamed from: d */
    public void mo22472d(View view) {
        mo22473e(view, 0);
    }

    /* renamed from: e */
    public void mo22473e(View view, int i) {
        if (i == 1) {
            this.f24344b = 0;
        } else {
            this.f24343a = 0;
        }
    }
}
