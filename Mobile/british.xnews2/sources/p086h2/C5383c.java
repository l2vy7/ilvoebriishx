package p086h2;

import android.graphics.Bitmap;
import p004a3.C0066k;

/* renamed from: h2.c */
/* compiled from: AttributeStrategy */
class C5383c implements C5399l {

    /* renamed from: a */
    private final C5385b f23668a = new C5385b();

    /* renamed from: b */
    private final C5390h<C5384a, Bitmap> f23669b = new C5390h<>();

    /* renamed from: h2.c$a */
    /* compiled from: AttributeStrategy */
    static class C5384a implements C5400m {

        /* renamed from: a */
        private final C5385b f23670a;

        /* renamed from: b */
        private int f23671b;

        /* renamed from: c */
        private int f23672c;

        /* renamed from: d */
        private Bitmap.Config f23673d;

        public C5384a(C5385b bVar) {
            this.f23670a = bVar;
        }

        /* renamed from: a */
        public void mo21815a() {
            this.f23670a.mo21824c(this);
        }

        /* renamed from: b */
        public void mo21816b(int i, int i2, Bitmap.Config config) {
            this.f23671b = i;
            this.f23672c = i2;
            this.f23673d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5384a)) {
                return false;
            }
            C5384a aVar = (C5384a) obj;
            if (this.f23671b == aVar.f23671b && this.f23672c == aVar.f23672c && this.f23673d == aVar.f23673d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f23671b * 31) + this.f23672c) * 31;
            Bitmap.Config config = this.f23673d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C5383c.m24213g(this.f23671b, this.f23672c, this.f23673d);
        }
    }

    /* renamed from: h2.c$b */
    /* compiled from: AttributeStrategy */
    static class C5385b extends C5386d<C5384a> {
        C5385b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C5384a mo21820a() {
            return new C5384a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5384a mo21822e(int i, int i2, Bitmap.Config config) {
            C5384a aVar = (C5384a) mo21823b();
            aVar.mo21816b(i, i2, config);
            return aVar;
        }
    }

    C5383c() {
    }

    /* renamed from: g */
    static String m24213g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: h */
    private static String m24214h(Bitmap bitmap) {
        return m24213g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public Bitmap mo21808a() {
        return this.f23669b.mo21834f();
    }

    /* renamed from: b */
    public String mo21809b(int i, int i2, Bitmap.Config config) {
        return m24213g(i, i2, config);
    }

    /* renamed from: c */
    public void mo21810c(Bitmap bitmap) {
        this.f23669b.mo21833d(this.f23668a.mo21822e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: d */
    public Bitmap mo21811d(int i, int i2, Bitmap.Config config) {
        return this.f23669b.mo21832a(this.f23668a.mo21822e(i, i2, config));
    }

    /* renamed from: e */
    public int mo21812e(Bitmap bitmap) {
        return C0066k.m255g(bitmap);
    }

    /* renamed from: f */
    public String mo21813f(Bitmap bitmap) {
        return m24214h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f23669b;
    }
}
