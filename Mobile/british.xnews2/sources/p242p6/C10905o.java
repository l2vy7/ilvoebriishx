package p242p6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p239o6.C10857a;

/* renamed from: p6.o */
/* compiled from: ShapePath */
public class C10905o {
    @Deprecated

    /* renamed from: a */
    public float f49764a;
    @Deprecated

    /* renamed from: b */
    public float f49765b;
    @Deprecated

    /* renamed from: c */
    public float f49766c;
    @Deprecated

    /* renamed from: d */
    public float f49767d;
    @Deprecated

    /* renamed from: e */
    public float f49768e;
    @Deprecated

    /* renamed from: f */
    public float f49769f;

    /* renamed from: g */
    private final List<C10911f> f49770g = new ArrayList();

    /* renamed from: h */
    private final List<C10912g> f49771h = new ArrayList();

    /* renamed from: i */
    private boolean f49772i;

    /* renamed from: p6.o$a */
    /* compiled from: ShapePath */
    class C10906a extends C10912g {

        /* renamed from: b */
        final /* synthetic */ List f49773b;

        /* renamed from: c */
        final /* synthetic */ Matrix f49774c;

        C10906a(List list, Matrix matrix) {
            this.f49773b = list;
            this.f49774c = matrix;
        }

        /* renamed from: a */
        public void mo43180a(Matrix matrix, C10857a aVar, int i, Canvas canvas) {
            for (C10912g a : this.f49773b) {
                a.mo43180a(this.f49774c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: p6.o$b */
    /* compiled from: ShapePath */
    static class C10907b extends C10912g {

        /* renamed from: b */
        private final C10909d f49776b;

        public C10907b(C10909d dVar) {
            this.f49776b = dVar;
        }

        /* renamed from: a */
        public void mo43180a(Matrix matrix, C10857a aVar, int i, Canvas canvas) {
            float h = this.f49776b.m49106m();
            float i2 = this.f49776b.m49107n();
            aVar.mo43038a(canvas, matrix, new RectF(this.f49776b.m49104k(), this.f49776b.m49108o(), this.f49776b.m49105l(), this.f49776b.m49103j()), i, h, i2);
        }
    }

    /* renamed from: p6.o$c */
    /* compiled from: ShapePath */
    static class C10908c extends C10912g {

        /* renamed from: b */
        private final C10910e f49777b;

        /* renamed from: c */
        private final float f49778c;

        /* renamed from: d */
        private final float f49779d;

        public C10908c(C10910e eVar, float f, float f2) {
            this.f49777b = eVar;
            this.f49778c = f;
            this.f49779d = f2;
        }

        /* renamed from: a */
        public void mo43180a(Matrix matrix, C10857a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f49777b.f49788c - this.f49779d), (double) (this.f49777b.f49787b - this.f49778c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f49778c, this.f49779d);
            matrix2.preRotate(mo43181c());
            aVar.mo43039b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo43181c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f49777b.f49788c - this.f49779d) / (this.f49777b.f49787b - this.f49778c))));
        }
    }

    /* renamed from: p6.o$d */
    /* compiled from: ShapePath */
    public static class C10909d extends C10911f {

        /* renamed from: h */
        private static final RectF f49780h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f49781b;
        @Deprecated

        /* renamed from: c */
        public float f49782c;
        @Deprecated

        /* renamed from: d */
        public float f49783d;
        @Deprecated

        /* renamed from: e */
        public float f49784e;
        @Deprecated

        /* renamed from: f */
        public float f49785f;
        @Deprecated

        /* renamed from: g */
        public float f49786g;

        public C10909d(float f, float f2, float f3, float f4) {
            m49110q(f);
            m49114u(f2);
            m49111r(f3);
            m49109p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m49103j() {
            return this.f49784e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m49104k() {
            return this.f49781b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m49105l() {
            return this.f49783d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m49106m() {
            return this.f49785f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m49107n() {
            return this.f49786g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m49108o() {
            return this.f49782c;
        }

        /* renamed from: p */
        private void m49109p(float f) {
            this.f49784e = f;
        }

        /* renamed from: q */
        private void m49110q(float f) {
            this.f49781b = f;
        }

        /* renamed from: r */
        private void m49111r(float f) {
            this.f49783d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m49112s(float f) {
            this.f49785f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m49113t(float f) {
            this.f49786g = f;
        }

        /* renamed from: u */
        private void m49114u(float f) {
            this.f49782c = f;
        }

        /* renamed from: a */
        public void mo43182a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f49789a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f49780h;
            rectF.set(m49104k(), m49108o(), m49105l(), m49103j());
            path.arcTo(rectF, m49106m(), m49107n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: p6.o$e */
    /* compiled from: ShapePath */
    public static class C10910e extends C10911f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f49787b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f49788c;

        /* renamed from: a */
        public void mo43182a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f49789a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f49787b, this.f49788c);
            path.transform(matrix);
        }
    }

    /* renamed from: p6.o$f */
    /* compiled from: ShapePath */
    public static abstract class C10911f {

        /* renamed from: a */
        protected final Matrix f49789a = new Matrix();

        /* renamed from: a */
        public abstract void mo43182a(Matrix matrix, Path path);
    }

    /* renamed from: p6.o$g */
    /* compiled from: ShapePath */
    static abstract class C10912g {

        /* renamed from: a */
        static final Matrix f49790a = new Matrix();

        C10912g() {
        }

        /* renamed from: a */
        public abstract void mo43180a(Matrix matrix, C10857a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo43183b(C10857a aVar, int i, Canvas canvas) {
            mo43180a(f49790a, aVar, i, canvas);
        }
    }

    public C10905o() {
        mo43178n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m49070b(float f) {
        if (m49072g() != f) {
            float g = ((f - m49072g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C10909d dVar = new C10909d(mo43173i(), mo43174j(), mo43173i(), mo43174j());
                dVar.m49112s(m49072g());
                dVar.m49113t(g);
                this.f49771h.add(new C10907b(dVar));
                m49074p(f);
            }
        }
    }

    /* renamed from: c */
    private void m49071c(C10912g gVar, float f, float f2) {
        m49070b(f);
        this.f49771h.add(gVar);
        m49074p(f2);
    }

    /* renamed from: g */
    private float m49072g() {
        return this.f49768e;
    }

    /* renamed from: h */
    private float m49073h() {
        return this.f49769f;
    }

    /* renamed from: p */
    private void m49074p(float f) {
        this.f49768e = f;
    }

    /* renamed from: q */
    private void m49075q(float f) {
        this.f49769f = f;
    }

    /* renamed from: r */
    private void m49076r(float f) {
        this.f49766c = f;
    }

    /* renamed from: s */
    private void m49077s(float f) {
        this.f49767d = f;
    }

    /* renamed from: t */
    private void m49078t(float f) {
        this.f49764a = f;
    }

    /* renamed from: u */
    private void m49079u(float f) {
        this.f49765b = f;
    }

    /* renamed from: a */
    public void mo43169a(float f, float f2, float f3, float f4, float f5, float f6) {
        C10909d dVar = new C10909d(f, f2, f3, f4);
        dVar.m49112s(f5);
        dVar.m49113t(f6);
        this.f49770g.add(dVar);
        C10907b bVar = new C10907b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m49071c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m49076r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m49077s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo43170d(Matrix matrix, Path path) {
        int size = this.f49770g.size();
        for (int i = 0; i < size; i++) {
            this.f49770g.get(i).mo43182a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo43171e() {
        return this.f49772i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10912g mo43172f(Matrix matrix) {
        m49070b(m49073h());
        return new C10906a(new ArrayList(this.f49771h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo43173i() {
        return this.f49766c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo43174j() {
        return this.f49767d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo43175k() {
        return this.f49764a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo43176l() {
        return this.f49765b;
    }

    /* renamed from: m */
    public void mo43177m(float f, float f2) {
        C10910e eVar = new C10910e();
        float unused = eVar.f49787b = f;
        float unused2 = eVar.f49788c = f2;
        this.f49770g.add(eVar);
        C10908c cVar = new C10908c(eVar, mo43173i(), mo43174j());
        m49071c(cVar, cVar.mo43181c() + 270.0f, cVar.mo43181c() + 270.0f);
        m49076r(f);
        m49077s(f2);
    }

    /* renamed from: n */
    public void mo43178n(float f, float f2) {
        mo43179o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo43179o(float f, float f2, float f3, float f4) {
        m49078t(f);
        m49079u(f2);
        m49076r(f);
        m49077s(f2);
        m49074p(f3);
        m49075q((f3 + f4) % 360.0f);
        this.f49770g.clear();
        this.f49771h.clear();
        this.f49772i = false;
    }
}
