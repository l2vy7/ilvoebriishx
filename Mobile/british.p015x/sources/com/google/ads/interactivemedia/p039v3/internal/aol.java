package com.google.ads.interactivemedia.p039v3.internal;

import android.os.StrictMode;
import com.google.android.gms.common.internal.Hide;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.aol */
/* compiled from: IMASDK */
public final class aol {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m14469a(arv<T> arv) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T a = arv.mo14153a();
            StrictMode.setThreadPolicy(threadPolicy);
            return a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
