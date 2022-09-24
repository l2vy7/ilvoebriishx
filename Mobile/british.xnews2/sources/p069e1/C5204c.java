package p069e1;

/* renamed from: e1.c */
/* compiled from: Target */
public final class C5204c {

    /* renamed from: e */
    public static final C5204c f22707e;

    /* renamed from: f */
    public static final C5204c f22708f;

    /* renamed from: g */
    public static final C5204c f22709g;

    /* renamed from: h */
    public static final C5204c f22710h;

    /* renamed from: i */
    public static final C5204c f22711i;

    /* renamed from: j */
    public static final C5204c f22712j;

    /* renamed from: a */
    final float[] f22713a;

    /* renamed from: b */
    final float[] f22714b;

    /* renamed from: c */
    final float[] f22715c = new float[3];

    /* renamed from: d */
    boolean f22716d = true;

    static {
        C5204c cVar = new C5204c();
        f22707e = cVar;
        m23618m(cVar);
        m23621p(cVar);
        C5204c cVar2 = new C5204c();
        f22708f = cVar2;
        m23620o(cVar2);
        m23621p(cVar2);
        C5204c cVar3 = new C5204c();
        f22709g = cVar3;
        m23617l(cVar3);
        m23621p(cVar3);
        C5204c cVar4 = new C5204c();
        f22710h = cVar4;
        m23618m(cVar4);
        m23619n(cVar4);
        C5204c cVar5 = new C5204c();
        f22711i = cVar5;
        m23620o(cVar5);
        m23619n(cVar5);
        C5204c cVar6 = new C5204c();
        f22712j = cVar6;
        m23617l(cVar6);
        m23619n(cVar6);
    }

    C5204c() {
        float[] fArr = new float[3];
        this.f22713a = fArr;
        float[] fArr2 = new float[3];
        this.f22714b = fArr2;
        m23623r(fArr);
        m23623r(fArr2);
        m23622q();
    }

    /* renamed from: l */
    private static void m23617l(C5204c cVar) {
        float[] fArr = cVar.f22714b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    private static void m23618m(C5204c cVar) {
        float[] fArr = cVar.f22714b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    private static void m23619n(C5204c cVar) {
        float[] fArr = cVar.f22713a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    private static void m23620o(C5204c cVar) {
        float[] fArr = cVar.f22714b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    private static void m23621p(C5204c cVar) {
        float[] fArr = cVar.f22713a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: q */
    private void m23622q() {
        float[] fArr = this.f22715c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* renamed from: r */
    private static void m23623r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float mo21411a() {
        return this.f22715c[1];
    }

    /* renamed from: b */
    public float mo21412b() {
        return this.f22714b[2];
    }

    /* renamed from: c */
    public float mo21413c() {
        return this.f22713a[2];
    }

    /* renamed from: d */
    public float mo21414d() {
        return this.f22714b[0];
    }

    /* renamed from: e */
    public float mo21415e() {
        return this.f22713a[0];
    }

    /* renamed from: f */
    public float mo21416f() {
        return this.f22715c[2];
    }

    /* renamed from: g */
    public float mo21417g() {
        return this.f22715c[0];
    }

    /* renamed from: h */
    public float mo21418h() {
        return this.f22714b[1];
    }

    /* renamed from: i */
    public float mo21419i() {
        return this.f22713a[1];
    }

    /* renamed from: j */
    public boolean mo21420j() {
        return this.f22716d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo21421k() {
        float f = 0.0f;
        for (float f2 : this.f22715c) {
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length = this.f22715c.length;
            for (int i = 0; i < length; i++) {
                float[] fArr = this.f22715c;
                if (fArr[i] > 0.0f) {
                    fArr[i] = fArr[i] / f;
                }
            }
        }
    }
}
