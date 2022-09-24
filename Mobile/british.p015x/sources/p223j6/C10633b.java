package p223j6;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: j6.b */
/* compiled from: ExpandableWidgetHelper */
public final class C10633b {

    /* renamed from: a */
    private final View f49181a;

    /* renamed from: b */
    private boolean f49182b = false;

    /* renamed from: c */
    private int f49183c = 0;

    public C10633b(C10632a aVar) {
        this.f49181a = (View) aVar;
    }

    /* renamed from: a */
    private void m48400a() {
        ViewParent parent = this.f49181a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo2971p(this.f49181a);
        }
    }

    /* renamed from: b */
    public int mo42745b() {
        return this.f49183c;
    }

    /* renamed from: c */
    public boolean mo42746c() {
        return this.f49182b;
    }

    /* renamed from: d */
    public void mo42747d(Bundle bundle) {
        this.f49182b = bundle.getBoolean("expanded", false);
        this.f49183c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f49182b) {
            m48400a();
        }
    }

    /* renamed from: e */
    public Bundle mo42748e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f49182b);
        bundle.putInt("expandedComponentIdHint", this.f49183c);
        return bundle;
    }

    /* renamed from: f */
    public void mo42749f(int i) {
        this.f49183c = i;
    }
}
