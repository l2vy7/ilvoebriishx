package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fa4 implements da4 {

    /* renamed from: a */
    private final WindowManager f31684a;

    private fa4(WindowManager windowManager) {
        this.f31684a = windowManager;
    }

    /* renamed from: b */
    public static da4 m32098b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new fa4(windowManager);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo31192a(ba4 ba4) {
        ia4.m33141b(ba4.f29945a, this.f31684a.getDefaultDisplay());
    }

    public final void zza() {
    }
}
