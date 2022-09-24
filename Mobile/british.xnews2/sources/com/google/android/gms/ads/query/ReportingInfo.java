package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.uh0;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ReportingInfo {

    /* renamed from: a */
    private final uh0 f28128a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final th0 f28129a;

        public Builder(@RecentlyNonNull View view) {
            th0 th0 = new th0();
            this.f28129a = th0;
            th0.mo18857b(view);
        }

        @RecentlyNonNull
        public ReportingInfo build() {
            return new ReportingInfo(this, (zza) null);
        }

        @RecentlyNonNull
        public Builder setAssetViews(@RecentlyNonNull Map<String, View> map) {
            this.f28129a.mo18858c(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zza zza) {
        this.f28128a = new uh0(builder.f28129a);
    }

    public void reportTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        this.f28128a.mo18886a(motionEvent);
    }

    public void updateClickUrl(@RecentlyNonNull Uri uri, @RecentlyNonNull UpdateClickUrlCallback updateClickUrlCallback) {
        this.f28128a.mo18887b(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(@RecentlyNonNull List<Uri> list, @RecentlyNonNull UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f28128a.mo18888c(list, updateImpressionUrlsCallback);
    }
}
