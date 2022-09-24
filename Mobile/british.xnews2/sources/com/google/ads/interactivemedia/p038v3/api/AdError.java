package com.google.ads.interactivemedia.p038v3.api;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdError */
/* compiled from: IMASDK */
public final class AdError extends Exception {

    /* renamed from: a */
    private final AdErrorCode f13884a;

    /* renamed from: b */
    private final AdErrorType f13885b;

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode */
    /* compiled from: IMASDK */
    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(301),
        VAST_TOO_MANY_REDIRECTS(IronSourceConstants.OFFERWALL_AVAILABLE),
        VIDEO_PLAY_ERROR(400),
        VAST_MEDIA_LOAD_TIMEOUT(402),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION),
        VAST_NONLINEAR_ASSET_MISMATCH(503),
        COMPANION_AD_LOADING_FAILED(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(AnalyticsListener.EVENT_AUDIO_UNDERRUN),
        INVALID_ARGUMENTS(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE),
        PLAYLIST_NO_CONTENT_TRACKING(IronSourceConstants.RV_INSTANCE_ENDED),
        UNEXPECTED_ADS_LOADED_EVENT(IronSourceConstants.RV_INSTANCE_VISIBLE);
        

        /* renamed from: a */
        private final int f13887a;

        private AdErrorCode(int i) {
            this.f13887a = i;
        }

        public boolean equals(int i) {
            return this.f13887a == i;
        }

        public int getErrorNumber() {
            return this.f13887a;
        }

        public String toString() {
            String name = name();
            int i = this.f13887a;
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 41);
            sb.append("AdErrorCode [name: ");
            sb.append(name);
            sb.append(", number: ");
            sb.append(i);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdError$AdErrorType */
    /* compiled from: IMASDK */
    public enum AdErrorType {
        LOAD,
        PLAY
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdError(com.google.ads.interactivemedia.p038v3.api.AdError.AdErrorType r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode[] r0 = com.google.ads.interactivemedia.p038v3.api.AdError.AdErrorCode.values()
            int r1 = r0.length
            r2 = 0
        L_0x0006:
            if (r2 >= r1) goto L_0x0014
            r3 = r0[r2]
            int r4 = r3.getErrorNumber()
            if (r4 != r7) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0014:
            r0 = 1204(0x4b4, float:1.687E-42)
            if (r7 != r0) goto L_0x001b
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode r3 = com.google.ads.interactivemedia.p038v3.api.AdError.AdErrorCode.INTERNAL_ERROR
            goto L_0x001d
        L_0x001b:
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode r3 = com.google.ads.interactivemedia.p038v3.api.AdError.AdErrorCode.UNKNOWN_ERROR
        L_0x001d:
            r5.<init>((com.google.ads.interactivemedia.p038v3.api.AdError.AdErrorType) r6, (com.google.ads.interactivemedia.p038v3.api.AdError.AdErrorCode) r3, (java.lang.String) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.api.AdError.<init>(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, int, java.lang.String):void");
    }

    public AdErrorCode getErrorCode() {
        return this.f13884a;
    }

    public int getErrorCodeNumber() {
        return this.f13884a.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.f13885b;
    }

    public String getMessage() {
        return super.getMessage();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13885b);
        String valueOf2 = String.valueOf(this.f13884a);
        String message = getMessage();
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 45 + valueOf2.length() + String.valueOf(message).length());
        sb.append("AdError [errorType: ");
        sb.append(valueOf);
        sb.append(", errorCode: ");
        sb.append(valueOf2);
        sb.append(", message: ");
        sb.append(message);
        sb.append("]");
        return sb.toString();
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.f13885b = adErrorType;
        this.f13884a = adErrorCode;
    }
}
