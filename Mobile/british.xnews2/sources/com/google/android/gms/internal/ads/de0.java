package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class de0 extends hd0 {

    /* renamed from: b */
    private final UnifiedNativeAdMapper f30724b;

    public de0(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f30724b = unifiedNativeAdMapper;
    }

    /* renamed from: J5 */
    public final void mo31203J5(C10487a aVar) {
        this.f30724b.handleClick((View) C10489b.m48194f3(aVar));
    }

    /* renamed from: O3 */
    public final void mo31204O3(C10487a aVar) {
        this.f30724b.untrackView((View) C10489b.m48194f3(aVar));
    }

    /* renamed from: m0 */
    public final void mo31205m0(C10487a aVar, C10487a aVar2, C10487a aVar3) {
        this.f30724b.trackViews((View) C10489b.m48194f3(aVar), (HashMap) C10489b.m48194f3(aVar2), (HashMap) C10489b.m48194f3(aVar3));
    }

    /* renamed from: n */
    public final String mo31206n() {
        return this.f30724b.getStore();
    }

    public final boolean zzA() {
        return this.f30724b.getOverrideClickHandling();
    }

    public final boolean zzB() {
        return this.f30724b.getOverrideImpressionRecording();
    }

    public final double zze() {
        if (this.f30724b.getStarRating() != null) {
            return this.f30724b.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    public final float zzf() {
        return this.f30724b.getMediaContentAspectRatio();
    }

    public final float zzg() {
        return this.f30724b.getCurrentTime();
    }

    public final float zzh() {
        return this.f30724b.getDuration();
    }

    public final Bundle zzi() {
        return this.f30724b.getExtras();
    }

    public final C7774hy zzj() {
        if (this.f30724b.zzb() != null) {
            return this.f30724b.zzb().zza();
        }
        return null;
    }

    public final i30 zzk() {
        return null;
    }

    public final q30 zzl() {
        NativeAd.Image icon = this.f30724b.getIcon();
        if (icon != null) {
            return new c30(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    public final C10487a zzm() {
        View adChoicesContent = this.f30724b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C10489b.m48195m6(adChoicesContent);
    }

    public final C10487a zzn() {
        View zza = this.f30724b.zza();
        if (zza == null) {
            return null;
        }
        return C10489b.m48195m6(zza);
    }

    public final C10487a zzo() {
        Object zzc = this.f30724b.zzc();
        if (zzc == null) {
            return null;
        }
        return C10489b.m48195m6(zzc);
    }

    public final String zzp() {
        return this.f30724b.getAdvertiser();
    }

    public final String zzq() {
        return this.f30724b.getBody();
    }

    public final String zzr() {
        return this.f30724b.getCallToAction();
    }

    public final String zzs() {
        return this.f30724b.getHeadline();
    }

    public final String zzt() {
        return this.f30724b.getPrice();
    }

    public final List zzv() {
        List<NativeAd.Image> images = this.f30724b.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new c30(next.getDrawable(), next.getUri(), next.getScale(), next.zzb(), next.zza()));
            }
        }
        return arrayList;
    }

    public final void zzx() {
        this.f30724b.recordImpression();
    }
}
