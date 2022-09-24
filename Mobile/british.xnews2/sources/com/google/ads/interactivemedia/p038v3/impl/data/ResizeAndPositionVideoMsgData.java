package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.internal.ark;

@ark(mo14242a = C3768ah.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData */
/* compiled from: IMASDK */
public abstract class ResizeAndPositionVideoMsgData {
    public static ResizeAndPositionVideoMsgData create(Integer num, Integer num2, Integer num3, Integer num4) {
        return new C3768ah(num, num2, num3, num4);
    }

    public abstract Integer height();

    public final String toString() {
        String valueOf = String.valueOf(mo12903x());
        String valueOf2 = String.valueOf(mo12904y());
        String valueOf3 = String.valueOf(width());
        String valueOf4 = String.valueOf(height());
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 55 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("ResizeAndPositionVideoMsgData [x=");
        sb.append(valueOf);
        sb.append(", y=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(valueOf3);
        sb.append(", height=");
        sb.append(valueOf4);
        sb.append("]");
        return sb.toString();
    }

    public abstract Integer width();

    /* renamed from: x */
    public abstract Integer mo12903x();

    /* renamed from: y */
    public abstract Integer mo12904y();
}
