package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.oh0;
import com.google.android.gms.internal.ads.xa3;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzs implements xa3<ArrayList<Uri>> {

    /* renamed from: a */
    final /* synthetic */ oh0 f19906a;

    /* renamed from: b */
    final /* synthetic */ zzv f19907b;

    zzs(zzv zzv, oh0 oh0) {
        this.f19907b = zzv;
        this.f19906a = oh0;
    }

    public final void zza(Throwable th) {
        try {
            oh0 oh0 = this.f19906a;
            String valueOf = String.valueOf(th.getMessage());
            oh0.mo33543b(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f19906a.mo33544y1(arrayList);
            if (this.f19907b.f28103p) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (zzv.m28896r6(uri)) {
                        zzv zzv = this.f19907b;
                        this.f19907b.f28102o.mo34829b(zzv.m28902x6(uri, zzv.f28112y, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).toString());
                    }
                }
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
