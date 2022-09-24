package com.google.android.gms.ads.formats;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.VideoOptions;

@Deprecated
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
    @Deprecated
    public static final int ORIENTATION_ANY = 0;
    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;
    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: a */
    private final boolean f27755a;

    /* renamed from: b */
    private final int f27756b;

    /* renamed from: c */
    private final int f27757c;

    /* renamed from: d */
    private final boolean f27758d;

    /* renamed from: e */
    private final int f27759e;

    /* renamed from: f */
    private final VideoOptions f27760f;

    /* renamed from: g */
    private final boolean f27761g;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f27762a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f27763b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f27764c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f27765d = false;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public VideoOptions f27766e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f27767f = 1;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f27768g = false;

        @RecentlyNonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this, (zzd) null);
        }

        @RecentlyNonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f27767f = i;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setImageOrientation(int i) {
            this.f27763b = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.f27764c = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f27768g = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.f27765d = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.f27762a = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setVideoOptions(@RecentlyNonNull VideoOptions videoOptions) {
            this.f27766e = videoOptions;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zzd zzd) {
        this.f27755a = builder.f27762a;
        this.f27756b = builder.f27763b;
        this.f27757c = builder.f27764c;
        this.f27758d = builder.f27765d;
        this.f27759e = builder.f27767f;
        this.f27760f = builder.f27766e;
        this.f27761g = builder.f27768g;
    }

    public int getAdChoicesPlacement() {
        return this.f27759e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f27756b;
    }

    public int getMediaAspectRatio() {
        return this.f27757c;
    }

    @RecentlyNullable
    public VideoOptions getVideoOptions() {
        return this.f27760f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f27758d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f27755a;
    }

    public final boolean zza() {
        return this.f27761g;
    }
}
