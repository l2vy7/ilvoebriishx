package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6647d0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ExoPlayerImplInternal f27369b;

    /* renamed from: c */
    public final /* synthetic */ PlayerMessage f27370c;

    public /* synthetic */ C6647d0(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        this.f27369b = exoPlayerImplInternal;
        this.f27370c = playerMessage;
    }

    public final void run() {
        this.f27369b.lambda$sendMessageToTargetThread$1(this.f27370c);
    }
}
