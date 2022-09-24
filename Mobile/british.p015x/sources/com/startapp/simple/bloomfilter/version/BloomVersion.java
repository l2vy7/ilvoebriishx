package com.startapp.simple.bloomfilter.version;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: Sta */
public enum BloomVersion {
    ZERO(SessionDescription.SUPPORTED_SDP_VERSION, 1, 720),
    THREE("3.0", 1, 720) {
    },
    FOUR("4", 3, IronSourceConstants.BN_AUCTION_REQUEST),
    FIVE("5", 3, 1000000);
    
    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    /* renamed from: a */
    public int mo46527a() {
        return this.numberOfHashes;
    }

    /* renamed from: b */
    public int mo46528b() {
        return this.sizeOfBucket;
    }

    /* renamed from: c */
    public String mo46529c() {
        return this.version;
    }

    /* access modifiers changed from: public */
    BloomVersion(String str, int i, int i2) {
        this.version = str;
        this.numberOfHashes = i;
        this.sizeOfBucket = i2;
    }
}
