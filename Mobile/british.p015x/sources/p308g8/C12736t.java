package p308g8;

/* renamed from: g8.t */
/* compiled from: HttpVersion */
public final class C12736t extends C12742z {

    /* renamed from: e */
    public static final C12736t f55405e = new C12736t(0, 9);

    /* renamed from: f */
    public static final C12736t f55406f = new C12736t(1, 0);

    /* renamed from: g */
    public static final C12736t f55407g = new C12736t(1, 1);

    public C12736t(int i, int i2) {
        super("HTTP", i, i2);
    }

    /* renamed from: b */
    public C12742z mo47809b(int i, int i2) {
        if (i == this.f55409c && i2 == this.f55410d) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return f55406f;
            }
            if (i2 == 1) {
                return f55407g;
            }
        }
        if (i == 0 && i2 == 9) {
            return f55405e;
        }
        return new C12736t(i, i2);
    }
}
