package com.startapp.sdk.adsbase.crashreport;

import android.app.Activity;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ANRRemoteConfig implements Serializable {
    private static final long serialVersionUID = -5572648856211286333L;
    private long checkInterval = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    private boolean collectBlockedOnly = true;
    private boolean enableForegroundCheck = true;
    private boolean enableLoggerExtraCheck;
    private boolean enabled = false;
    private boolean ignorePredefinedStacktraceElements = true;
    private boolean shrinkStacktrace = true;
    private long sleepInterval = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;

    /* renamed from: a */
    public boolean mo46211a() {
        return this.collectBlockedOnly;
    }

    /* renamed from: b */
    public long mo46212b() {
        return this.checkInterval;
    }

    /* renamed from: c */
    public long mo46213c() {
        return this.sleepInterval;
    }

    /* renamed from: d */
    public boolean mo46214d() {
        return this.ignorePredefinedStacktraceElements;
    }

    /* renamed from: e */
    public boolean mo46215e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ANRRemoteConfig aNRRemoteConfig = (ANRRemoteConfig) obj;
        if (this.enabled == aNRRemoteConfig.enabled && this.shrinkStacktrace == aNRRemoteConfig.shrinkStacktrace && this.collectBlockedOnly == aNRRemoteConfig.collectBlockedOnly && this.ignorePredefinedStacktraceElements == aNRRemoteConfig.ignorePredefinedStacktraceElements && this.enableLoggerExtraCheck == aNRRemoteConfig.enableLoggerExtraCheck && this.enableForegroundCheck == aNRRemoteConfig.enableForegroundCheck && this.checkInterval == aNRRemoteConfig.checkInterval && this.sleepInterval == aNRRemoteConfig.sleepInterval) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo46217f() {
        return this.enableForegroundCheck;
    }

    /* renamed from: g */
    public boolean mo46218g() {
        return this.enableLoggerExtraCheck;
    }

    /* renamed from: h */
    public boolean mo46219h() {
        return this.shrinkStacktrace;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Boolean.valueOf(this.shrinkStacktrace), Boolean.valueOf(this.collectBlockedOnly), Boolean.valueOf(this.ignorePredefinedStacktraceElements), Boolean.valueOf(this.enableLoggerExtraCheck), Boolean.valueOf(this.enableForegroundCheck), Long.valueOf(this.checkInterval), Long.valueOf(this.sleepInterval)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
