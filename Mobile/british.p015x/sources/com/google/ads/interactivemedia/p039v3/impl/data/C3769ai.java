package com.google.ads.interactivemedia.p039v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ai */
/* compiled from: IMASDK */
final class C3769ai extends C3796bi {
    private final Integer height;
    private final Integer width;

    C3769ai(Integer num, Integer num2) {
        Objects.requireNonNull(num, "Null width");
        this.width = num;
        Objects.requireNonNull(num2, "Null height");
        this.height = num2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3796bi) {
            C3796bi biVar = (C3796bi) obj;
            return this.width.equals(biVar.width()) && this.height.equals(biVar.height());
        }
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }

    public Integer height() {
        return this.height;
    }

    public String toString() {
        String valueOf = String.valueOf(this.width);
        String valueOf2 = String.valueOf(this.height);
        StringBuilder sb = new StringBuilder(valueOf.length() + 25 + valueOf2.length());
        sb.append("SizeData{width=");
        sb.append(valueOf);
        sb.append(", height=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public Integer width() {
        return this.width;
    }
}
