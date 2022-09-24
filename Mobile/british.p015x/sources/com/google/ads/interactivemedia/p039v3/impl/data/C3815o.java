package com.google.ads.interactivemedia.p039v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.o */
/* compiled from: IMASDK */
final class C3815o extends C3777aq {
    private Integer height;
    private Integer left;
    private Integer top;
    private Integer width;

    C3815o() {
    }

    public C3778ar build() {
        String str;
        String str2 = "";
        if (this.left == null) {
            str2 = str2.concat(" left");
        }
        if (this.top == null) {
            str2 = String.valueOf(str2).concat(" top");
        }
        if (this.height == null) {
            str2 = String.valueOf(str2).concat(" height");
        }
        if (this.width == null) {
            str2 = String.valueOf(str2).concat(" width");
        }
        if (str2.isEmpty()) {
            return new C3816p(this.left.intValue(), this.top.intValue(), this.height.intValue(), this.width.intValue());
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public C3777aq height(int i) {
        this.height = Integer.valueOf(i);
        return this;
    }

    public C3777aq left(int i) {
        this.left = Integer.valueOf(i);
        return this;
    }

    public C3777aq top(int i) {
        this.top = Integer.valueOf(i);
        return this;
    }

    public C3777aq width(int i) {
        this.width = Integer.valueOf(i);
        return this;
    }
}
