package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p198d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a30 extends RelativeLayout {

    /* renamed from: c */
    private static final float[] f20104c = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private AnimationDrawable f20105b;

    public a30(Context context, z20 z20, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C4604n.m20098k(z20);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f20104c, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(z20.zzd());
        setLayoutParams(layoutParams);
        zzt.zzq();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(z20.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(z20.zzg());
            textView.setTextColor(z20.zze());
            textView.setTextSize((float) z20.mo35992o6());
            C8241uv.m38463b();
            int s = vn0.m38860s(context, 4);
            C8241uv.m38463b();
            textView.setPadding(s, 0, vn0.m38860s(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<c30> p6 = z20.mo35993p6();
        if (p6 != null && p6.size() > 1) {
            this.f20105b = new AnimationDrawable();
            for (c30 zzf : p6) {
                try {
                    this.f20105b.addFrame((Drawable) C10489b.m48194f3(zzf.zzf()), z20.zzb());
                } catch (Exception e) {
                    co0.zzh("Error while getting drawable.", e);
                }
            }
            zzt.zzq();
            imageView.setBackground(this.f20105b);
        } else if (p6.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C10489b.m48194f3(p6.get(0).zzf()));
            } catch (Exception e2) {
                co0.zzh("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f20105b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
