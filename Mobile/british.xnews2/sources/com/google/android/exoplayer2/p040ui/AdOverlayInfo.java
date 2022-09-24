package com.google.android.exoplayer2.p040ui;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 1;
    public static final int PURPOSE_CONTROLS = 0;
    public static final int PURPOSE_NOT_VISIBLE = 3;
    public static final int PURPOSE_OTHER = 2;
    public final int purpose;
    public final String reasonDetail;
    public final View view;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo$Purpose */
    public @interface Purpose {
    }

    public AdOverlayInfo(View view2, int i) {
        this(view2, i, (String) null);
    }

    public AdOverlayInfo(View view2, int i, String str) {
        this.view = view2;
        this.purpose = i;
        this.reasonDetail = str;
    }
}
