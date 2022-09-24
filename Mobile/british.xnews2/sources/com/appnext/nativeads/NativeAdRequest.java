package com.appnext.nativeads;

import com.appnext.base.C3117a;
import com.appnext.core.C3176c;

public class NativeAdRequest extends C3176c {
    private String categories = "";
    private CreativeType creativeType = CreativeType.ALL;

    /* renamed from: fS */
    private CachingPolicy f12501fS = CachingPolicy.ALL;

    /* renamed from: fT */
    private VideoLength f12502fT = VideoLength.DEFAULT;

    /* renamed from: fU */
    private VideoQuality f12503fU = VideoQuality.DEFAULT;
    private String mSpecificCategories = "";
    private int maxVideoLength = 0;
    private int minVideoLength = 0;
    private String postback = "";

    public enum CachingPolicy {
        NOTHING(0),
        STATIC_ONLY(1),
        VIDEO_ONLY(2),
        ALL(3);
        
        private int value;

        private CachingPolicy(int i) {
            this.value = i;
        }

        public static CachingPolicy fromInt(int i) {
            for (CachingPolicy cachingPolicy : values()) {
                if (cachingPolicy.getValue() == i) {
                    return cachingPolicy;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum CreativeType {
        STATIC_ONLY,
        VIDEO_ONLY,
        ALL
    }

    public enum VideoLength {
        DEFAULT(0),
        LONG(1),
        SHORT(2);
        
        private int value;

        private VideoLength(int i) {
            this.value = i;
        }

        public static VideoLength fromInt(int i) {
            try {
                for (VideoLength videoLength : values()) {
                    if (videoLength.getValue() == i) {
                        return videoLength;
                    }
                }
                return null;
            } catch (Throwable th) {
                C3117a.m10553a("NativeAdRequest$VideoLength", th);
                return null;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum VideoQuality {
        DEFAULT(0),
        HIGH(1),
        LOW(2);
        
        private int value;

        private VideoQuality(int i) {
            this.value = i;
        }

        public static VideoQuality fromInt(int i) {
            for (VideoQuality videoQuality : values()) {
                if (videoQuality.getValue() == i) {
                    return videoQuality;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public NativeAdRequest() {
    }

    public CachingPolicy getCachingPolicy() {
        return this.f12501fS;
    }

    public String getCategories() {
        return this.categories;
    }

    public CreativeType getCreativeType() {
        return this.creativeType;
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public VideoLength getVideoLength() {
        return this.f12502fT;
    }

    public VideoQuality getVideoQuality() {
        return this.f12503fU;
    }

    public NativeAdRequest setCachingPolicy(CachingPolicy cachingPolicy) {
        this.f12501fS = cachingPolicy;
        return this;
    }

    public NativeAdRequest setCategories(String str) {
        this.categories = str;
        return this;
    }

    public NativeAdRequest setCreativeType(CreativeType creativeType2) {
        this.creativeType = creativeType2;
        return this;
    }

    public NativeAdRequest setMaxVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Max Length must be higher than 0");
        } else if (i <= 0 || getMinVideoLength() <= 0 || i >= getMinVideoLength()) {
            this.maxVideoLength = i;
            return this;
        } else {
            throw new IllegalArgumentException("Max Length cannot be lower than min length");
        }
    }

    public NativeAdRequest setMinVideoLength(int i) {
        if (i < 0 || (i > 0 && getMaxVideoLength() > 0 && i > getMaxVideoLength())) {
            this.minVideoLength = 0;
        } else {
            this.minVideoLength = i;
        }
        return this;
    }

    public NativeAdRequest setPostback(String str) {
        this.postback = str;
        return this;
    }

    public NativeAdRequest setSpecificCategories(String str) {
        this.mSpecificCategories = str;
        return this;
    }

    public NativeAdRequest setVideoLength(VideoLength videoLength) {
        this.f12502fT = videoLength;
        return this;
    }

    public NativeAdRequest setVideoQuality(VideoQuality videoQuality) {
        this.f12503fU = videoQuality;
        return this;
    }

    NativeAdRequest(NativeAdRequest nativeAdRequest) {
        this.categories = nativeAdRequest.categories;
        this.mSpecificCategories = nativeAdRequest.mSpecificCategories;
        this.postback = nativeAdRequest.postback;
        this.f12501fS = nativeAdRequest.f12501fS;
        this.creativeType = nativeAdRequest.creativeType;
        this.f12502fT = nativeAdRequest.f12502fT;
        this.f12503fU = nativeAdRequest.f12503fU;
    }
}
