package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C10286a f48394k = new C10286a(this);

    /* renamed from: E */
    public boolean mo39727E(View view) {
        return this.f48394k.mo41376a(view);
    }

    /* renamed from: k */
    public boolean mo3004k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f48394k.mo41377b(coordinatorLayout, view, motionEvent);
        return super.mo3004k(coordinatorLayout, view, motionEvent);
    }
}
