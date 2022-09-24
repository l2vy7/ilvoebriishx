package com.google.android.exoplayer2.ext.ima;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p038v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.AdError;
import com.google.ads.interactivemedia.p038v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p038v3.api.AdEvent;
import com.google.ads.interactivemedia.p038v3.api.AdsLoader;
import com.google.ads.interactivemedia.p038v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p038v3.api.AdsRequest;
import com.google.ads.interactivemedia.p038v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p038v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p038v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p038v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p038v3.api.UiElement;
import com.google.ads.interactivemedia.p038v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p038v3.api.player.VideoProgressUpdate;
import com.google.android.exoplayer2.upstream.DataSchemeDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class ImaUtil {
    public static final int BITRATE_UNSET = -1;
    public static final int TIMEOUT_UNSET = -1;

    public static final class Configuration {
        public final List<String> adMediaMimeTypes;
        public final long adPreloadTimeoutMs;
        public final Set<UiElement> adUiElements;
        public final AdErrorEvent.AdErrorListener applicationAdErrorListener;
        public final AdEvent.AdEventListener applicationAdEventListener;
        public final VideoAdPlayer.VideoAdPlayerCallback applicationVideoAdPlayerCallback;
        public final Collection<CompanionAdSlot> companionAdSlots;
        public final boolean debugModeEnabled;
        public final Boolean enableContinuousPlayback;
        public final boolean focusSkipButtonWhenAvailable;
        public final ImaSdkSettings imaSdkSettings;
        public final int mediaBitrate;
        public final int mediaLoadTimeoutMs;
        public final boolean playAdBeforeStartPosition;
        public final int vastLoadTimeoutMs;

        public Configuration(long j, int i, int i2, boolean z, boolean z2, int i3, Boolean bool, List<String> list, Set<UiElement> set, Collection<CompanionAdSlot> collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings2, boolean z3) {
            this.adPreloadTimeoutMs = j;
            this.vastLoadTimeoutMs = i;
            this.mediaLoadTimeoutMs = i2;
            this.focusSkipButtonWhenAvailable = z;
            this.playAdBeforeStartPosition = z2;
            this.mediaBitrate = i3;
            this.enableContinuousPlayback = bool;
            this.adMediaMimeTypes = list;
            this.adUiElements = set;
            this.companionAdSlots = collection;
            this.applicationAdErrorListener = adErrorListener;
            this.applicationAdEventListener = adEventListener;
            this.applicationVideoAdPlayerCallback = videoAdPlayerCallback;
            this.imaSdkSettings = imaSdkSettings2;
            this.debugModeEnabled = z3;
        }
    }

    public interface ImaFactory {
        AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer);

        AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer);

        AdsRenderingSettings createAdsRenderingSettings();

        AdsRequest createAdsRequest();

        AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer);

        FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

        ImaSdkSettings createImaSdkSettings();
    }

    private ImaUtil() {
    }

    public static long[] getAdGroupTimesUsForCuePoints(List<Float> list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            double floatValue = (double) list.get(i2).floatValue();
            if (floatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                Double.isNaN(floatValue);
                jArr[i] = Math.round(floatValue * 1000000.0d);
                i++;
            }
        }
        Arrays.sort(jArr, 0, i);
        return jArr;
    }

    public static AdsRequest getAdsRequestForAdTagDataSpec(ImaFactory imaFactory, DataSpec dataSpec) throws IOException {
        AdsRequest createAdsRequest = imaFactory.createAdsRequest();
        if ("data".equals(dataSpec.uri.getScheme())) {
            DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
            try {
                dataSchemeDataSource.open(dataSpec);
                createAdsRequest.setAdsResponse(Util.fromUtf8Bytes(Util.readToEnd(dataSchemeDataSource)));
            } finally {
                dataSchemeDataSource.close();
            }
        } else {
            createAdsRequest.setAdTagUrl(dataSpec.uri.toString());
        }
        return createAdsRequest;
    }

    public static FriendlyObstructionPurpose getFriendlyObstructionPurpose(int i) {
        if (i == 0) {
            return FriendlyObstructionPurpose.VIDEO_CONTROLS;
        }
        if (i == 1) {
            return FriendlyObstructionPurpose.CLOSE_AD;
        }
        if (i != 3) {
            return FriendlyObstructionPurpose.OTHER;
        }
        return FriendlyObstructionPurpose.NOT_VISIBLE;
    }

    public static Looper getImaLooper() {
        return Looper.getMainLooper();
    }

    public static String getStringForVideoProgressUpdate(VideoProgressUpdate videoProgressUpdate) {
        if (VideoProgressUpdate.VIDEO_TIME_NOT_READY.equals(videoProgressUpdate)) {
            return "not ready";
        }
        return Util.formatInvariant("%d ms of %d ms", Long.valueOf(videoProgressUpdate.getCurrentTimeMs()), Long.valueOf(videoProgressUpdate.getDurationMs()));
    }

    public static boolean isAdGroupLoadError(AdError adError) {
        return adError.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || adError.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR;
    }
}
