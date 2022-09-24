package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.s0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C7142s0 implements Runnable {

    /* renamed from: b */
    private final MediaNotificationService f28734b;

    /* renamed from: c */
    private final int f28735c;

    C7142s0(MediaNotificationService mediaNotificationService, int i) {
        this.f28734b = mediaNotificationService;
        this.f28735c = i;
    }

    public final void run() {
        this.f28734b.stopSelf(this.f28735c);
    }
}
