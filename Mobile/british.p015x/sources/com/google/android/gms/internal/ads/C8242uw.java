package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.uw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C8242uw extends C8187td implements C8279vw {
    /* renamed from: n6 */
    public static C8279vw m38504n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof C8279vw ? (C8279vw) queryLocalInterface : new C8206tw(iBinder);
    }
}
