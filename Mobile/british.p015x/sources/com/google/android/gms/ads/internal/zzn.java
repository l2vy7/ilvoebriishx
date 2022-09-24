package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzn implements View.OnTouchListener {

    /* renamed from: b */
    final /* synthetic */ zzs f27964b;

    zzn(zzs zzs) {
        this.f27964b = zzs;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f27964b.f19888i == null) {
            return false;
        }
        this.f27964b.f19888i.mo30332d(motionEvent);
        return false;
    }
}
