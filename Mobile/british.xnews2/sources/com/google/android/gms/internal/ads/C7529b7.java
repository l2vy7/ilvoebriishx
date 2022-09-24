package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.b7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7529b7 implements C8075q6 {

    /* renamed from: a */
    private File f29916a = null;

    /* renamed from: b */
    final /* synthetic */ Context f29917b;

    C7529b7(Context context) {
        this.f29917b = context;
    }

    public final File zza() {
        if (this.f29916a == null) {
            this.f29916a = new File(this.f29917b.getCacheDir(), "volley");
        }
        return this.f29916a;
    }
}
