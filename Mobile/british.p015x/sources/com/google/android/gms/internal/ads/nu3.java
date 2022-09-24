package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nu3 {

    /* renamed from: j */
    public static final nu3 f36139j = new nu3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final nu3 f36140k = new nu3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final nu3 f36141l = new nu3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final nu3 f36142m = new nu3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f36143a;

    /* renamed from: b */
    public final double f36144b;

    /* renamed from: c */
    public final double f36145c;

    /* renamed from: d */
    public final double f36146d;

    /* renamed from: e */
    public final double f36147e;

    /* renamed from: f */
    public final double f36148f;

    /* renamed from: g */
    public final double f36149g;

    /* renamed from: h */
    public final double f36150h;

    /* renamed from: i */
    public final double f36151i;

    public nu3(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f36143a = d5;
        this.f36144b = d6;
        this.f36145c = d7;
        this.f36146d = d;
        this.f36147e = d2;
        this.f36148f = d3;
        this.f36149g = d4;
        this.f36150h = d8;
        this.f36151i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nu3.class != obj.getClass()) {
            return false;
        }
        nu3 nu3 = (nu3) obj;
        return Double.compare(nu3.f36146d, this.f36146d) == 0 && Double.compare(nu3.f36147e, this.f36147e) == 0 && Double.compare(nu3.f36148f, this.f36148f) == 0 && Double.compare(nu3.f36149g, this.f36149g) == 0 && Double.compare(nu3.f36150h, this.f36150h) == 0 && Double.compare(nu3.f36151i, this.f36151i) == 0 && Double.compare(nu3.f36143a, this.f36143a) == 0 && Double.compare(nu3.f36144b, this.f36144b) == 0 && Double.compare(nu3.f36145c, this.f36145c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f36143a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f36144b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f36145c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f36146d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f36147e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f36148f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f36149g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f36150h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f36151i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f36139j)) {
            return "Rotate 0°";
        }
        if (equals(f36140k)) {
            return "Rotate 90°";
        }
        if (equals(f36141l)) {
            return "Rotate 180°";
        }
        if (equals(f36142m)) {
            return "Rotate 270°";
        }
        double d = this.f36143a;
        double d2 = this.f36144b;
        double d3 = this.f36145c;
        double d4 = this.f36146d;
        double d5 = this.f36147e;
        double d6 = this.f36148f;
        double d7 = this.f36149g;
        double d8 = this.f36150h;
        double d9 = this.f36151i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
