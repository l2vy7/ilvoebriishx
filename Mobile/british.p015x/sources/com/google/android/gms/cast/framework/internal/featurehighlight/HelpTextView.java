package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import p115m4.C10766k;

@Keep
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class HelpTextView extends LinearLayout {
    private TextView zza;
    private TextView zzb;

    @Keep
    public HelpTextView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static final void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    @RecentlyNonNull
    @Keep
    public View asView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(C10766k.f49443z);
        Objects.requireNonNull(textView);
        this.zza = textView;
        TextView textView2 = (TextView) findViewById(C10766k.f49442y);
        Objects.requireNonNull(textView2);
        this.zzb = textView2;
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zza, charSequence);
        zza(this.zzb, charSequence2);
    }
}
