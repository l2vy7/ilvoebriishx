package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.MediaContent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MediaView extends FrameLayout {

    /* renamed from: b */
    private MediaContent f28044b;

    /* renamed from: c */
    private boolean f28045c;

    /* renamed from: d */
    private ImageView.ScaleType f28046d;

    /* renamed from: e */
    private boolean f28047e;

    /* renamed from: f */
    private zzb f28048f;

    /* renamed from: g */
    private zzc f28049g;

    public MediaView(@RecentlyNonNull Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo28820a(zzb zzb) {
        this.f28048f = zzb;
        if (this.f28045c) {
            zzb.zza.mo17733b(this.f28044b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo28821b(zzc zzc) {
        this.f28049g = zzc;
        if (this.f28047e) {
            zzc.zza.mo17735c(this.f28046d);
        }
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f28047e = true;
        this.f28046d = scaleType;
        zzc zzc = this.f28049g;
        if (zzc != null) {
            zzc.zza.mo17735c(scaleType);
        }
    }

    public void setMediaContent(@RecentlyNonNull MediaContent mediaContent) {
        this.f28045c = true;
        this.f28044b = mediaContent;
        zzb zzb = this.f28048f;
        if (zzb != null) {
            zzb.zza.mo17733b(mediaContent);
        }
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
