package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4776v;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final C4776v<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String key;
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    public static final class Builder {
        private final C4776v.C4777a<String, String> attributesBuilder = new C4776v.C4777a<>();
        /* access modifiers changed from: private */
        public int bitrate = -1;
        /* access modifiers changed from: private */
        public String connection;
        /* access modifiers changed from: private */
        public String key;
        /* access modifiers changed from: private */
        public String mediaTitle;
        /* access modifiers changed from: private */
        public final String mediaType;
        /* access modifiers changed from: private */
        public final int payloadType;
        /* access modifiers changed from: private */
        public final int port;
        /* access modifiers changed from: private */
        public final String transportProtocol;

        public Builder(String str, int i, String str2, int i2) {
            this.mediaType = str;
            this.port = i;
            this.transportProtocol = str2;
            this.payloadType = i2;
        }

        public Builder addAttribute(String str, String str2) {
            this.attributesBuilder.mo19923c(str, str2);
            return this;
        }

        public MediaDescription build() {
            C4776v<String, String> a = this.attributesBuilder.mo19922a();
            try {
                Assertions.checkState(a.containsKey(SessionDescription.ATTR_RTPMAP));
                return new MediaDescription(this, a, RtpMapAttribute.parse((String) Util.castNonNull(a.get(SessionDescription.ATTR_RTPMAP))));
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setMediaTitle(String str) {
            this.mediaTitle = str;
            return this;
        }
    }

    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        private RtpMapAttribute(int i, String str, int i2, int i3) {
            this.payloadType = i;
            this.mediaEncoding = str;
            this.clockRate = i2;
            this.encodingParameters = i3;
        }

        public static RtpMapAttribute parse(String str) throws ParserException {
            String[] split = Util.split(str, " ");
            Assertions.checkArgument(split.length == 2);
            int parseInt = RtspMessageUtil.parseInt(split[0]);
            String[] split2 = Util.split(split[1], "/");
            Assertions.checkArgument(split2.length >= 2);
            int parseInt2 = RtspMessageUtil.parseInt(split2[1]);
            int i = -1;
            if (split2.length == 3) {
                i = RtspMessageUtil.parseInt(split2[2]);
            }
            return new RtpMapAttribute(parseInt, split2[0], parseInt2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || RtpMapAttribute.class != obj.getClass()) {
                return false;
            }
            RtpMapAttribute rtpMapAttribute = (RtpMapAttribute) obj;
            if (this.payloadType == rtpMapAttribute.payloadType && this.mediaEncoding.equals(rtpMapAttribute.mediaEncoding) && this.clockRate == rtpMapAttribute.clockRate && this.encodingParameters == rtpMapAttribute.encodingParameters) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((217 + this.payloadType) * 31) + this.mediaEncoding.hashCode()) * 31) + this.clockRate) * 31) + this.encodingParameters;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaDescription.class != obj.getClass()) {
            return false;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        if (!this.mediaType.equals(mediaDescription.mediaType) || this.port != mediaDescription.port || !this.transportProtocol.equals(mediaDescription.transportProtocol) || this.payloadType != mediaDescription.payloadType || this.bitrate != mediaDescription.bitrate || !this.attributes.equals(mediaDescription.attributes) || !this.rtpMapAttribute.equals(mediaDescription.rtpMapAttribute) || !Util.areEqual(this.mediaTitle, mediaDescription.mediaTitle) || !Util.areEqual(this.connection, mediaDescription.connection) || !Util.areEqual(this.key, mediaDescription.key)) {
            return false;
        }
        return true;
    }

    public C4776v<String, String> getFmtpParametersAsMap() {
        String str = this.attributes.get(SessionDescription.ATTR_FMTP);
        if (str == null) {
            return C4776v.m22050o();
        }
        String[] splitAtFirst = Util.splitAtFirst(str, " ");
        Assertions.checkArgument(splitAtFirst.length == 2, str);
        String[] split = Util.split(splitAtFirst[1], ";\\s?");
        C4776v.C4777a aVar = new C4776v.C4777a();
        for (String splitAtFirst2 : split) {
            String[] splitAtFirst3 = Util.splitAtFirst(splitAtFirst2, "=");
            aVar.mo19923c(splitAtFirst3[0], splitAtFirst3[1]);
        }
        return aVar.mo19922a();
    }

    public int hashCode() {
        int hashCode = (((((((((((((217 + this.mediaType.hashCode()) * 31) + this.port) * 31) + this.transportProtocol.hashCode()) * 31) + this.payloadType) * 31) + this.bitrate) * 31) + this.attributes.hashCode()) * 31) + this.rtpMapAttribute.hashCode()) * 31;
        String str = this.mediaTitle;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.connection;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    private MediaDescription(Builder builder, C4776v<String, String> vVar, RtpMapAttribute rtpMapAttribute2) {
        this.mediaType = builder.mediaType;
        this.port = builder.port;
        this.transportProtocol = builder.transportProtocol;
        this.payloadType = builder.payloadType;
        this.mediaTitle = builder.mediaTitle;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.attributes = vVar;
        this.rtpMapAttribute = rtpMapAttribute2;
    }
}
