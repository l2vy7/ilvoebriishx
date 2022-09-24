package com.startapp.sdk.adsbase;

import android.app.Activity;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class VideoConfig implements Serializable {
    private static final long serialVersionUID = -7167816130382369376L;
    @C5010hb(type = BackMode.class)
    private BackMode backMode = BackMode.DISABLED;
    private int maxCachedVideos = 3;
    private int maxTimeForCachingIndicator = 10;
    private int maxVastCampaignExclude = 10;
    private int maxVastLevels = 7;
    private long minAvailableStorageRequired = 20;
    private int minTimeForCachingIndicator = 1;
    private int nativePlayerProbability = 100;
    private boolean progressive = false;
    private int progressiveBufferInPercentage = 20;
    private int progressiveInitialBufferInPercentage = 5;
    private int progressiveMinBufferToPlayFromCache = 30;
    private int rewardGrantPercentage = 100;
    private String soundMode = RewardedVideo.VIDEO_MODE_DEFAULT;
    private long vastDefaultSkipIntervalMilli = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    private int vastMediaPicker = 0;
    private int vastPreferredBitrate = 0;
    private int vastRetryTimeout = 60000;
    private int vastTimeout = 30000;
    private int videoErrorsThreshold = 2;
    private boolean videoFallback = false;

    /* compiled from: Sta */
    public enum BackMode {
        DISABLED,
        SKIP,
        CLOSE,
        BOTH
    }

    /* renamed from: a */
    public BackMode mo20992a() {
        return this.backMode;
    }

    /* renamed from: b */
    public int mo20993b() {
        return this.maxCachedVideos;
    }

    /* renamed from: c */
    public long mo20994c() {
        return TimeUnit.SECONDS.toMillis((long) this.maxTimeForCachingIndicator);
    }

    /* renamed from: d */
    public int mo20995d() {
        return this.maxVastCampaignExclude;
    }

    /* renamed from: e */
    public int mo20996e() {
        return this.maxVastLevels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoConfig videoConfig = (VideoConfig) obj;
        if (this.maxCachedVideos == videoConfig.maxCachedVideos && this.minAvailableStorageRequired == videoConfig.minAvailableStorageRequired && this.rewardGrantPercentage == videoConfig.rewardGrantPercentage && this.videoErrorsThreshold == videoConfig.videoErrorsThreshold && this.nativePlayerProbability == videoConfig.nativePlayerProbability && this.minTimeForCachingIndicator == videoConfig.minTimeForCachingIndicator && this.maxTimeForCachingIndicator == videoConfig.maxTimeForCachingIndicator && this.videoFallback == videoConfig.videoFallback && this.progressive == videoConfig.progressive && this.progressiveBufferInPercentage == videoConfig.progressiveBufferInPercentage && this.progressiveInitialBufferInPercentage == videoConfig.progressiveInitialBufferInPercentage && this.progressiveMinBufferToPlayFromCache == videoConfig.progressiveMinBufferToPlayFromCache && this.maxVastLevels == videoConfig.maxVastLevels && this.vastTimeout == videoConfig.vastTimeout && this.vastRetryTimeout == videoConfig.vastRetryTimeout && this.maxVastCampaignExclude == videoConfig.maxVastCampaignExclude && this.vastMediaPicker == videoConfig.vastMediaPicker && this.vastPreferredBitrate == videoConfig.vastPreferredBitrate && this.vastDefaultSkipIntervalMilli == videoConfig.vastDefaultSkipIntervalMilli && this.backMode == videoConfig.backMode && C5015nb.m22922a(this.soundMode, videoConfig.soundMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo20998f() {
        return this.minAvailableStorageRequired;
    }

    /* renamed from: g */
    public long mo20999g() {
        return TimeUnit.SECONDS.toMillis((long) this.minTimeForCachingIndicator);
    }

    /* renamed from: h */
    public int mo21000h() {
        return this.progressiveBufferInPercentage;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.maxCachedVideos), Long.valueOf(this.minAvailableStorageRequired), Integer.valueOf(this.rewardGrantPercentage), Integer.valueOf(this.videoErrorsThreshold), this.backMode, Integer.valueOf(this.nativePlayerProbability), Integer.valueOf(this.minTimeForCachingIndicator), Integer.valueOf(this.maxTimeForCachingIndicator), Boolean.valueOf(this.videoFallback), Boolean.valueOf(this.progressive), Integer.valueOf(this.progressiveBufferInPercentage), Integer.valueOf(this.progressiveInitialBufferInPercentage), Integer.valueOf(this.progressiveMinBufferToPlayFromCache), this.soundMode, Integer.valueOf(this.maxVastLevels), Integer.valueOf(this.vastTimeout), Integer.valueOf(this.vastRetryTimeout), Integer.valueOf(this.maxVastCampaignExclude), Integer.valueOf(this.vastMediaPicker), Integer.valueOf(this.vastPreferredBitrate), Long.valueOf(this.vastDefaultSkipIntervalMilli)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public int mo21002i() {
        return this.progressiveInitialBufferInPercentage;
    }

    /* renamed from: j */
    public int mo21003j() {
        return this.progressiveMinBufferToPlayFromCache;
    }

    /* renamed from: k */
    public int mo21004k() {
        return this.rewardGrantPercentage;
    }

    /* renamed from: l */
    public String mo21005l() {
        return this.soundMode;
    }

    /* renamed from: m */
    public long mo21006m() {
        return this.vastDefaultSkipIntervalMilli;
    }

    /* renamed from: n */
    public int mo21007n() {
        return this.vastRetryTimeout;
    }

    /* renamed from: o */
    public int mo21008o() {
        return this.videoErrorsThreshold;
    }

    /* renamed from: p */
    public boolean mo21009p() {
        return this.progressive;
    }

    /* renamed from: q */
    public boolean mo21010q() {
        return this.videoFallback;
    }
}
