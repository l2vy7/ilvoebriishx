package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xz */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8351xz implements Callable<Boolean> {
    C8351xz() {
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
