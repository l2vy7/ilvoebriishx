package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.C4600c;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7365b implements Runnable {

    /* renamed from: b */
    private final Uri f29256b;

    /* renamed from: c */
    private final ParcelFileDescriptor f29257c;

    /* renamed from: d */
    final /* synthetic */ ImageManager f29258d;

    public C7365b(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f29256b = uri;
        this.f29257c = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        C4600c.m20061b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f29257c;
        Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f29256b)), e);
                z2 = true;
            }
            try {
                this.f29257c.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f29258d;
        ImageManager.m29955b(imageManager).post(new C7366c(imageManager, this.f29256b, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f29256b)));
        }
    }
}
