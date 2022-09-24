package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C4600c;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7366c implements Runnable {

    /* renamed from: b */
    private final Uri f29259b;

    /* renamed from: c */
    private final Bitmap f29260c;

    /* renamed from: d */
    private final CountDownLatch f29261d;

    /* renamed from: e */
    final /* synthetic */ ImageManager f29262e;

    public C7366c(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f29259b = uri;
        this.f29260c = bitmap;
        this.f29261d = countDownLatch;
    }

    public final void run() {
        C4600c.m20060a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f29260c;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.m29961h(this.f29262e).remove(this.f29259b);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f29248c;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C7367d dVar = (C7367d) a.get(i);
                Bitmap bitmap2 = this.f29260c;
                if (bitmap2 == null || bitmap == null) {
                    ImageManager.m29959f(this.f29262e).put(this.f29259b, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f29262e;
                    dVar.mo30013b(ImageManager.m29954a(imageManager), ImageManager.m29956c(imageManager), false);
                } else {
                    dVar.mo30014c(ImageManager.m29954a(this.f29262e), bitmap2, false);
                }
                ImageManager.m29960g(this.f29262e).remove(dVar);
            }
        }
        this.f29261d.countDown();
        synchronized (ImageManager.f29245a) {
            ImageManager.f29246b.remove(this.f29259b);
        }
    }
}
