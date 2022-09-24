package com.google.android.exoplayer2.mediacodec;

/* renamed from: com.google.android.exoplayer2.mediacodec.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6741e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AsynchronousMediaCodecCallback f27457b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f27458c;

    public /* synthetic */ C6741e(AsynchronousMediaCodecCallback asynchronousMediaCodecCallback, Runnable runnable) {
        this.f27457b = asynchronousMediaCodecCallback;
        this.f27458c = runnable;
    }

    public final void run() {
        this.f27457b.lambda$flushAsync$0(this.f27458c);
    }
}
