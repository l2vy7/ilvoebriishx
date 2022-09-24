package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ca4 {
    /* renamed from: a */
    public static void m30938a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            fc2.m20475a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
