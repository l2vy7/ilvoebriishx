package com.google.ads.interactivemedia.p039v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.p */
/* compiled from: IMASDK */
final class C3816p extends C3778ar {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private C3816p(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.height = i3;
        this.width = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3778ar) {
            C3778ar arVar = (C3778ar) obj;
            return this.left == arVar.left() && this.top == arVar.top() && this.height == arVar.height() && this.width == arVar.width();
        }
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    public int height() {
        return this.height;
    }

    public int left() {
        return this.left;
    }

    public String toString() {
        int i = this.left;
        int i2 = this.top;
        int i3 = this.height;
        int i4 = this.width;
        StringBuilder sb = new StringBuilder(90);
        sb.append("BoundingRectData{left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", width=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }

    public int top() {
        return this.top;
    }

    public int width() {
        return this.width;
    }
}
