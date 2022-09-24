package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ga4 implements DisplayManager.DisplayListener, da4 {

    /* renamed from: a */
    private final DisplayManager f32212a;

    /* renamed from: b */
    private ba4 f32213b;

    private ga4(DisplayManager displayManager) {
        this.f32212a = displayManager;
    }

    /* renamed from: b */
    public static da4 m32386b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new ga4(displayManager);
        }
        return null;
    }

    /* renamed from: c */
    private final Display m32387c() {
        return this.f32212a.getDisplay(0);
    }

    /* renamed from: a */
    public final void mo31192a(ba4 ba4) {
        this.f32213b = ba4;
        this.f32212a.registerDisplayListener(this, d13.m20307f0((Handler.Callback) null));
        ia4.m33141b(ba4.f29945a, m32387c());
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        ba4 ba4 = this.f32213b;
        if (ba4 != null && i == 0) {
            ia4.m33141b(ba4.f29945a, m32387c());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.f32212a.unregisterDisplayListener(this);
        this.f32213b = null;
    }
}
