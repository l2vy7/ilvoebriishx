package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzaw;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzg extends RelativeLayout {

    /* renamed from: b */
    final zzaw f27790b;

    /* renamed from: c */
    boolean f27791c;

    public zzg(Context context, String str, String str2, String str3) {
        super(context);
        zzaw zzaw = new zzaw(context, str);
        this.f27790b = zzaw;
        zzaw.zzo(str2);
        zzaw.zzn(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27791c) {
            return false;
        }
        this.f27790b.zzm(motionEvent);
        return false;
    }
}
