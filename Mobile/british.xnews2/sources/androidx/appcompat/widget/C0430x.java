package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.x */
/* compiled from: RtlSpacingHelper */
class C0430x {

    /* renamed from: a */
    private int f1702a = 0;

    /* renamed from: b */
    private int f1703b = 0;

    /* renamed from: c */
    private int f1704c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1705d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1706e = 0;

    /* renamed from: f */
    private int f1707f = 0;

    /* renamed from: g */
    private boolean f1708g = false;

    /* renamed from: h */
    private boolean f1709h = false;

    C0430x() {
    }

    /* renamed from: a */
    public int mo2313a() {
        return this.f1708g ? this.f1702a : this.f1703b;
    }

    /* renamed from: b */
    public int mo2314b() {
        return this.f1702a;
    }

    /* renamed from: c */
    public int mo2315c() {
        return this.f1703b;
    }

    /* renamed from: d */
    public int mo2316d() {
        return this.f1708g ? this.f1703b : this.f1702a;
    }

    /* renamed from: e */
    public void mo2317e(int i, int i2) {
        this.f1709h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1706e = i;
            this.f1702a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1707f = i2;
            this.f1703b = i2;
        }
    }

    /* renamed from: f */
    public void mo2318f(boolean z) {
        if (z != this.f1708g) {
            this.f1708g = z;
            if (!this.f1709h) {
                this.f1702a = this.f1706e;
                this.f1703b = this.f1707f;
            } else if (z) {
                int i = this.f1705d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1706e;
                }
                this.f1702a = i;
                int i2 = this.f1704c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1707f;
                }
                this.f1703b = i2;
            } else {
                int i3 = this.f1704c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1706e;
                }
                this.f1702a = i3;
                int i4 = this.f1705d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1707f;
                }
                this.f1703b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo2319g(int i, int i2) {
        this.f1704c = i;
        this.f1705d = i2;
        this.f1709h = true;
        if (this.f1708g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1702a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1703b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1702a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1703b = i2;
        }
    }
}
