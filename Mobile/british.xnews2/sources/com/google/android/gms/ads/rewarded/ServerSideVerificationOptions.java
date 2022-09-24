package com.google.android.gms.ads.rewarded;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class ServerSideVerificationOptions {

    /* renamed from: a */
    private final String f28130a;

    /* renamed from: b */
    private final String f28131b;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f28132a = "";
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f28133b = "";

        @RecentlyNonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, (zzb) null);
        }

        @RecentlyNonNull
        public Builder setCustomData(@RecentlyNonNull String str) {
            this.f28133b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setUserId(@RecentlyNonNull String str) {
            this.f28132a = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, zzb zzb) {
        this.f28130a = builder.f28132a;
        this.f28131b = builder.f28133b;
    }

    @RecentlyNonNull
    public String getCustomData() {
        return this.f28131b;
    }

    @RecentlyNonNull
    public String getUserId() {
        return this.f28130a;
    }
}
