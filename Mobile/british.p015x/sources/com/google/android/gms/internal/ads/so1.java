package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class so1 {

    /* renamed from: a */
    private final zzbs f39015a;

    /* renamed from: b */
    private final C6483e f39016b;

    /* renamed from: c */
    private final Executor f39017c;

    public so1(zzbs zzbs, C6483e eVar, Executor executor) {
        this.f39015a = zzbs;
        this.f39016b = eVar;
        this.f39017c = executor;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Bitmap m37460a(so1 so1, byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36844B4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            so1.m37461c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) C8311wv.m39277c().mo18570b(p00.f36852C4)).intValue())) / 2);
            }
        }
        return so1.m37461c(bArr, options);
    }

    /* renamed from: c */
    private final Bitmap m37461c(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.f39016b.elapsedRealtime();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.f39016b.elapsedRealtime();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = elapsedRealtime2 - elapsedRealtime;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            zze.zza(sb.toString());
        }
        return decodeByteArray;
    }

    /* renamed from: b */
    public final mb3<Bitmap> mo34730b(String str, double d, boolean z) {
        return bb3.m30653m(this.f39015a.zza(str), new ro1(this, d, z), this.f39017c);
    }
}
