package com.google.ads.interactivemedia.p039v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ah */
/* compiled from: IMASDK */
final class C3768ah extends ResizeAndPositionVideoMsgData {
    private final Integer height;
    private final Integer width;

    /* renamed from: x */
    private final Integer f13894x;

    /* renamed from: y */
    private final Integer f13895y;

    C3768ah(Integer num, Integer num2, Integer num3, Integer num4) {
        Objects.requireNonNull(num, "Null x");
        this.f13894x = num;
        Objects.requireNonNull(num2, "Null y");
        this.f13895y = num2;
        Objects.requireNonNull(num3, "Null width");
        this.width = num3;
        Objects.requireNonNull(num4, "Null height");
        this.height = num4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResizeAndPositionVideoMsgData) {
            ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = (ResizeAndPositionVideoMsgData) obj;
            return this.f13894x.equals(resizeAndPositionVideoMsgData.mo12903x()) && this.f13895y.equals(resizeAndPositionVideoMsgData.mo12904y()) && this.width.equals(resizeAndPositionVideoMsgData.width()) && this.height.equals(resizeAndPositionVideoMsgData.height());
        }
    }

    public int hashCode() {
        return ((((((this.f13894x.hashCode() ^ 1000003) * 1000003) ^ this.f13895y.hashCode()) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode();
    }

    public Integer height() {
        return this.height;
    }

    public Integer width() {
        return this.width;
    }

    /* renamed from: x */
    public Integer mo12903x() {
        return this.f13894x;
    }

    /* renamed from: y */
    public Integer mo12904y() {
        return this.f13895y;
    }
}
