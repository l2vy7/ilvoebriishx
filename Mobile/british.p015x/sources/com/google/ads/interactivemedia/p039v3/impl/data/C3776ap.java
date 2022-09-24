package com.google.ads.interactivemedia.p039v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ap */
/* compiled from: IMASDK */
final class C3776ap extends C3802bo {
    private final float volume;

    private C3776ap(float f) {
        this.volume = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C3802bo) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((C3802bo) obj).volume());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        float f = this.volume;
        StringBuilder sb = new StringBuilder(40);
        sb.append("VolumeUpdateData{volume=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }

    public float volume() {
        return this.volume;
    }
}
