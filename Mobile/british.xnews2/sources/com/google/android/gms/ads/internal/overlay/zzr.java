package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.impl.C7046R;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.vn0;
import p006a5.C6492o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzr extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ImageButton f27815b;

    /* renamed from: c */
    private final zzaa f27816c;

    public zzr(Context context, zzq zzq, zzaa zzaa) {
        super(context);
        this.f27816c = zzaa;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f27815b = imageButton;
        m28797b();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C8241uv.m38463b();
        int s = vn0.m38860s(context, zzq.zza);
        C8241uv.m38463b();
        int s2 = vn0.m38860s(context, 0);
        C8241uv.m38463b();
        int s3 = vn0.m38860s(context, zzq.zzb);
        C8241uv.m38463b();
        imageButton.setPadding(s, s2, s3, vn0.m38860s(context, zzq.zzc));
        imageButton.setContentDescription("Interstitial close button");
        C8241uv.m38463b();
        int s4 = vn0.m38860s(context, zzq.zzd + zzq.zza + zzq.zzb);
        C8241uv.m38463b();
        addView(imageButton, new FrameLayout.LayoutParams(s4, vn0.m38860s(context, zzq.zzd + zzq.zzc), 17));
        long longValue = ((Long) C8311wv.m39277c().mo18570b(p00.f36960Q0)).longValue();
        if (longValue > 0) {
            zzp zzp = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36968R0)).booleanValue() ? new zzp(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzp);
        }
    }

    /* renamed from: b */
    private final void m28797b() {
        String str = (String) C8311wv.m39277c().mo18570b(p00.f36952P0);
        if (!C6492o.m28285h() || TextUtils.isEmpty(str) || RewardedVideo.VIDEO_MODE_DEFAULT.equals(str)) {
            this.f27815b.setImageResource(17301527);
            return;
        }
        Resources d = zzt.zzo().mo18580d();
        if (d != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = d.getDrawable(C7046R.C7047drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = d.getDrawable(C7046R.C7047drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                co0.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.f27815b.setImageResource(17301527);
                return;
            }
            this.f27815b.setImageDrawable(drawable);
            this.f27815b.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.f27815b.setImageResource(17301527);
    }

    public final void onClick(View view) {
        zzaa zzaa = this.f27816c;
        if (zzaa != null) {
            zzaa.zzbR();
        }
    }

    public final void zzb(boolean z) {
        if (z) {
            this.f27815b.setVisibility(8);
            if (((Long) C8311wv.m39277c().mo18570b(p00.f36960Q0)).longValue() > 0) {
                this.f27815b.animate().cancel();
                this.f27815b.clearAnimation();
                return;
            }
            return;
        }
        this.f27815b.setVisibility(0);
    }
}
