package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.oh0;
import com.google.android.gms.internal.ads.xa3;
import java.util.Collections;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzt implements xa3<Uri> {

    /* renamed from: a */
    final /* synthetic */ oh0 f19908a;

    /* renamed from: b */
    final /* synthetic */ zzv f19909b;

    zzt(zzv zzv, oh0 oh0) {
        this.f19909b = zzv;
        this.f19908a = oh0;
    }

    public final void zza(Throwable th) {
        try {
            oh0 oh0 = this.f19908a;
            String valueOf = String.valueOf(th.getMessage());
            oh0.mo33543b(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        Uri uri = (Uri) obj;
        try {
            this.f19909b.f28109v.getAndIncrement();
            this.f19908a.mo33544y1(Collections.singletonList(uri));
            if (this.f19909b.f28104q) {
                zzv zzv = this.f19909b;
                this.f19909b.f28102o.mo34829b(zzv.m28902x6(uri, zzv.f28112y, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).toString());
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
