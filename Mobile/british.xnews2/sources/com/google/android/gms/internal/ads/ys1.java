package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzaw;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ys1 extends FrameLayout {

    /* renamed from: b */
    private final zzaw f41991b;

    public ys1(Context context, View view, zzaw zzaw) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f41991b = zzaw;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f41991b.zzm(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof xt0)) {
                arrayList.add((xt0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((xt0) arrayList.get(i2)).destroy();
        }
    }
}
