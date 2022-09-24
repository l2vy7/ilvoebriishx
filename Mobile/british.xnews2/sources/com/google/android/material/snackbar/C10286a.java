package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C10291e;

/* renamed from: com.google.android.material.snackbar.a */
/* compiled from: BaseTransientBottomBar */
public class C10286a {

    /* renamed from: a */
    private C10291e.C10293b f48399a;

    public C10286a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.mo39729K(0.1f);
        swipeDismissBehavior.mo39728J(0.6f);
        swipeDismissBehavior.mo39730L(0);
    }

    /* renamed from: a */
    public boolean mo41376a(View view) {
        return view instanceof C10289d;
    }

    /* renamed from: b */
    public void mo41377b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C10291e.m47493b().mo41393f(this.f48399a);
            }
        } else if (coordinatorLayout.mo2941F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C10291e.m47493b().mo41392e(this.f48399a);
        }
    }
}
