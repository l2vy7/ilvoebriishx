package com.startapp;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;

/* renamed from: com.startapp.n5 */
/* compiled from: Sta */
public class C12073n5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List3DView f53326a;

    public C12073n5(List3DView list3DView) {
        this.f53326a = list3DView;
    }

    public void run() {
        this.f53326a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f53326a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
