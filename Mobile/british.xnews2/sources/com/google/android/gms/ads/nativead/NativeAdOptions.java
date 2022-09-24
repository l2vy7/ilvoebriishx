package com.google.android.gms.ads.nativead;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;

    /* renamed from: a */
    private final boolean f28050a;

    /* renamed from: b */
    private final int f28051b;

    /* renamed from: c */
    private final boolean f28052c;

    /* renamed from: d */
    private final int f28053d;

    /* renamed from: e */
    private final VideoOptions f28054e;

    /* renamed from: f */
    private final boolean f28055f;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f28056a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f28057b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f28058c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public VideoOptions f28059d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f28060e = 1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f28061f = false;

        @RecentlyNonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this, (zza) null);
        }

        @RecentlyNonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f28060e = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.f28057b = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f28061f = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.f28058c = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.f28056a = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setVideoOptions(@RecentlyNonNull VideoOptions videoOptions) {
            this.f28059d = videoOptions;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zza zza) {
        this.f28050a = builder.f28056a;
        this.f28051b = builder.f28057b;
        this.f28052c = builder.f28058c;
        this.f28053d = builder.f28060e;
        this.f28054e = builder.f28059d;
        this.f28055f = builder.f28061f;
    }

    public int getAdChoicesPlacement() {
        return this.f28053d;
    }

    public int getMediaAspectRatio() {
        return this.f28051b;
    }

    @RecentlyNullable
    public VideoOptions getVideoOptions() {
        return this.f28054e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f28052c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f28050a;
    }

    public final boolean zza() {
        return this.f28055f;
    }
}
