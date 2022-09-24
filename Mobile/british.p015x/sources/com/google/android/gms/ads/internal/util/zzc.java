package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.co0;
import java.io.IOException;
import p252t4.C11013c;
import p252t4.C11014d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzc extends zzb {

    /* renamed from: c */
    private final Context f27874c;

    zzc(Context context) {
        this.f27874c = context;
    }

    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f27874c);
        } catch (IOException | IllegalStateException | C11013c | C11014d e) {
            co0.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        bo0.m30769j(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        co0.zzj(sb.toString());
    }
}
