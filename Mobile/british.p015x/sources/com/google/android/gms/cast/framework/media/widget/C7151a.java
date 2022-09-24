package com.google.android.gms.cast.framework.media.widget;

/* renamed from: com.google.android.gms.cast.framework.media.widget.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C7151a implements Runnable {

    /* renamed from: b */
    private final CastSeekBar f28817b;

    C7151a(CastSeekBar castSeekBar) {
        this.f28817b = castSeekBar;
    }

    public final void run() {
        this.f28817b.sendAccessibilityEvent(4);
    }
}
