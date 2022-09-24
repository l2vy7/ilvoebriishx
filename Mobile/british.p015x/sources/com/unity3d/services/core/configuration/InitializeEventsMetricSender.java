package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {
    private static InitializeEventsMetricSender _instance;
    private long _configStartTime = 0;
    private boolean _initMetricSent = false;
    private Map<String, String> _metricTags;
    private long _startTime = 0;
    private boolean _tokenMetricSent = false;

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (_instance == null) {
            _instance = new InitializeEventsMetricSender();
        }
        return _instance;
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z) {
        Metric metric;
        if (this._startTime == 0) {
            DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
        Map<String, String> metricTags = getMetricTags();
        if (z) {
            metric = TSIMetric.newTokenAvailabilityLatencyConfig(valueOf, metricTags);
        } else {
            metric = TSIMetric.newTokenAvailabilityLatencyWebview(valueOf, metricTags);
        }
        sendMetric(metric);
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if (this._configStartTime == 0) {
            DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(TSIMetric.newTokenResolutionRequestLatency(tokenDuration(), getMetricTags()));
        }
    }

    public void didConfigRequestStart() {
        this._configStartTime = System.nanoTime();
    }

    public void didInitStart() {
        this._startTime = System.nanoTime();
        sendMetric(TSIMetric.newInitStarted(getMetricTags()));
    }

    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
    }

    public Map<String, String> getMetricTags() {
        Map<String, String> map = this._metricTags;
        if (map != null) {
            return map;
        }
        return new HashMap();
    }

    public Long initializationStartTimeStamp() {
        return Long.valueOf(this._startTime);
    }

    public void onSdkInitializationFailed(String str, int i) {
        sdkInitializeFailed(str);
    }

    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sdkDidInitialize() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5._startTime     // Catch:{ all -> 0x0028 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            java.lang.String r0 = "sdkDidInitialize called before didInitStart, skipping metric"
            com.unity3d.services.core.log.DeviceLog.debug(r0)     // Catch:{ all -> 0x0028 }
            monitor-exit(r5)
            return
        L_0x0010:
            boolean r0 = r5._initMetricSent     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            java.lang.Long r0 = r5.duration()     // Catch:{ all -> 0x0028 }
            java.util.Map r1 = r5.getMetricTags()     // Catch:{ all -> 0x0028 }
            com.unity3d.services.core.request.metrics.Metric r0 = com.unity3d.services.core.request.metrics.TSIMetric.newInitTimeSuccess(r0, r1)     // Catch:{ all -> 0x0028 }
            r5.sendMetric(r0)     // Catch:{ all -> 0x0028 }
            r0 = 1
            r5._initMetricSent = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r5)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.InitializeEventsMetricSender.sdkDidInitialize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sdkInitializeFailed(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4._startTime     // Catch:{ all -> 0x0028 }
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            java.lang.String r5 = "sdkInitializeFailed called before didInitStart, skipping metric"
            com.unity3d.services.core.log.DeviceLog.debug(r5)     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)
            return
        L_0x0010:
            boolean r5 = r4._initMetricSent     // Catch:{ all -> 0x0028 }
            if (r5 != 0) goto L_0x0026
            java.lang.Long r5 = r4.duration()     // Catch:{ all -> 0x0028 }
            java.util.Map r0 = r4.getMetricTags()     // Catch:{ all -> 0x0028 }
            com.unity3d.services.core.request.metrics.Metric r5 = com.unity3d.services.core.request.metrics.TSIMetric.newInitTimeFailure(r5, r0)     // Catch:{ all -> 0x0028 }
            r4.sendMetric(r5)     // Catch:{ all -> 0x0028 }
            r5 = 1
            r4._initMetricSent = r5     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r4)
            return
        L_0x0028:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.InitializeEventsMetricSender.sdkInitializeFailed(java.lang.String):void");
    }

    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        if (!this._tokenMetricSent) {
            sendTokenAvailabilityMetricWithConfig(z);
            if (z) {
                sendTokenResolutionRequestMetricIfNeeded();
            }
            this._tokenMetricSent = true;
        }
    }

    public void sendMetric(Metric metric) {
        SDKMetrics.getInstance().sendMetric(metric);
    }

    public void setMetricTags(Map<String, String> map) {
        this._metricTags = map;
    }

    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._configStartTime));
    }
}
