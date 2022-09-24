package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzt extends zzl {
    public zzt(Activity activity) {
        super(activity);
    }

    public final void zzk(Bundle bundle) {
        zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f27813u = 4;
        this.f27794b.finish();
    }
}
