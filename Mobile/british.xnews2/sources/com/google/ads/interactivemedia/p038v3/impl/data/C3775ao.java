package com.google.ads.interactivemedia.p038v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ao */
/* compiled from: IMASDK */
final class C3775ao extends C3801bn {
    private Float volume;

    C3775ao() {
    }

    public C3802bo build() {
        String str;
        String str2 = "";
        if (this.volume == null) {
            str2 = str2.concat(" volume");
        }
        if (str2.isEmpty()) {
            return new C3776ap(this.volume.floatValue());
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public C3801bn volume(float f) {
        this.volume = Float.valueOf(f);
        return this;
    }
}
