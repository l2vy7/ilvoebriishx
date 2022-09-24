package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.xt0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(xt0 xt0) throws zzf {
        this.zzb = xt0.getLayoutParams();
        ViewParent parent = xt0.getParent();
        this.zzd = xt0.mo18782q();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(xt0.mo18790t());
        viewGroup.removeView(xt0.mo18790t());
        xt0.mo18755i0(true);
    }
}
