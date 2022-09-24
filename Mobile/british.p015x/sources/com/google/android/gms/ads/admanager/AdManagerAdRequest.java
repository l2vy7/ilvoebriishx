package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.internal.ads.C4618oy;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder extends AdRequest.Builder {
        @RecentlyNonNull
        public Builder addCategoryExclusion(@RecentlyNonNull String str) {
            this.f19844a.mo33792D(str);
            return this;
        }

        @RecentlyNonNull
        public Builder addCustomTargeting(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f19844a.mo33794F(str, str2);
            return this;
        }

        @RecentlyNonNull
        public Builder setPublisherProvidedId(@RecentlyNonNull String str) {
            this.f19844a.mo33809i(str);
            return this;
        }

        @RecentlyNonNull
        public Builder addCustomTargeting(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
            if (list != null) {
                this.f19844a.mo33794F(str, TextUtils.join(",", list));
            }
            return this;
        }

        @RecentlyNonNull
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, (zza) null);
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setAdInfo(@RecentlyNonNull AdInfo adInfo) {
            this.f19844a.mo33800L(adInfo);
            return this;
        }

        @RecentlyNonNull
        public Builder setAdString(@RecentlyNonNull String str) {
            this.f19844a.mo33801a(str);
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, zza zza) {
        super(builder);
    }

    @RecentlyNonNull
    public Bundle getCustomTargeting() {
        return this.f19843a.mo18625f();
    }

    @RecentlyNonNull
    public String getPublisherProvidedId() {
        return this.f19843a.mo18633n();
    }

    public final C4618oy zza() {
        return this.f19843a;
    }
}
