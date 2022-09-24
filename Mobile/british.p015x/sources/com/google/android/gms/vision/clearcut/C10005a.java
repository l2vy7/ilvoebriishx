package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.C9508f0;

/* renamed from: com.google.android.gms.vision.clearcut.a */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C10005a implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ int f47088b;

    /* renamed from: c */
    private final /* synthetic */ C9508f0 f47089c;

    /* renamed from: d */
    private final /* synthetic */ DynamiteClearcutLogger f47090d;

    C10005a(DynamiteClearcutLogger dynamiteClearcutLogger, int i, C9508f0 f0Var) {
        this.f47090d = dynamiteClearcutLogger;
        this.f47088b = i;
        this.f47089c = f0Var;
    }

    public final void run() {
        this.f47090d.zzbx.zzb(this.f47088b, this.f47089c);
    }
}
