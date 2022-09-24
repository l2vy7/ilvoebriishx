package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.i */
/* compiled from: LoadErrorHandlingPolicy */
public final /* synthetic */ class C7002i {
    @Deprecated
    /* renamed from: a */
    public static long m28733a(LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i, long j, IOException iOException, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public static long m28734b(LoadErrorHandlingPolicy loadErrorHandlingPolicy, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        return loadErrorHandlingPolicy.getBlacklistDurationMsFor(loadErrorInfo.mediaLoadData.dataType, loadErrorInfo.loadEventInfo.loadDurationMs, loadErrorInfo.exception, loadErrorInfo.errorCount);
    }

    @Deprecated
    /* renamed from: c */
    public static long m28735c(LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i, long j, IOException iOException, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public static long m28736d(LoadErrorHandlingPolicy loadErrorHandlingPolicy, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        return loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo.mediaLoadData.dataType, loadErrorInfo.loadEventInfo.loadDurationMs, loadErrorInfo.exception, loadErrorInfo.errorCount);
    }

    /* renamed from: e */
    public static void m28737e(LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
    }
}
