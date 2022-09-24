package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class p12 implements ha3 {

    /* renamed from: a */
    public final /* synthetic */ d22 f37281a;

    public /* synthetic */ p12(d22 d22) {
        this.f37281a = d22;
    }

    public final mb3 zza(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        po0.f37722a.execute(new ts2((InputStream) obj, createPipe[1]));
        return bb3.m30649i(parcelFileDescriptor);
    }
}
