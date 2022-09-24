package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.zzbkq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class VideoOptions {

    /* renamed from: a */
    private final boolean f27743a;

    /* renamed from: b */
    private final boolean f27744b;

    /* renamed from: c */
    private final boolean f27745c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f27746a = true;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f27747b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f27748c = false;

        @RecentlyNonNull
        public VideoOptions build() {
            return new VideoOptions(this, (zzd) null);
        }

        @RecentlyNonNull
        public Builder setClickToExpandRequested(boolean z) {
            this.f27748c = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setCustomControlsRequested(boolean z) {
            this.f27747b = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setStartMuted(boolean z) {
            this.f27746a = z;
            return this;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, zzd zzd) {
        this.f27743a = builder.f27746a;
        this.f27744b = builder.f27747b;
        this.f27745c = builder.f27748c;
    }

    public VideoOptions(zzbkq zzbkq) {
        this.f27743a = zzbkq.f42990b;
        this.f27744b = zzbkq.f42991c;
        this.f27745c = zzbkq.f42992d;
    }

    public boolean getClickToExpandRequested() {
        return this.f27745c;
    }

    public boolean getCustomControlsRequested() {
        return this.f27744b;
    }

    public boolean getStartMuted() {
        return this.f27743a;
    }
}
