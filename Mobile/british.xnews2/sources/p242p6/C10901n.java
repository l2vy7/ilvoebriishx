package p242p6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: p6.n */
/* compiled from: ShapeAppearancePathProvider */
public class C10901n {

    /* renamed from: a */
    private final C10905o[] f49746a = new C10905o[4];

    /* renamed from: b */
    private final Matrix[] f49747b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f49748c = new Matrix[4];

    /* renamed from: d */
    private final PointF f49749d = new PointF();

    /* renamed from: e */
    private final Path f49750e = new Path();

    /* renamed from: f */
    private final Path f49751f = new Path();

    /* renamed from: g */
    private final C10905o f49752g = new C10905o();

    /* renamed from: h */
    private final float[] f49753h = new float[2];

    /* renamed from: i */
    private final float[] f49754i = new float[2];

    /* renamed from: j */
    private final Path f49755j = new Path();

    /* renamed from: k */
    private final Path f49756k = new Path();

    /* renamed from: l */
    private boolean f49757l = true;

    /* renamed from: p6.n$a */
    /* compiled from: ShapeAppearancePathProvider */
    private static class C10902a {

        /* renamed from: a */
        static final C10901n f49758a = new C10901n();
    }

    /* renamed from: p6.n$b */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C10903b {
        /* renamed from: a */
        void mo43120a(C10905o oVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo43121b(C10905o oVar, Matrix matrix, int i);
    }

    /* renamed from: p6.n$c */
    /* compiled from: ShapeAppearancePathProvider */
    static final class C10904c {

        /* renamed from: a */
        public final C10897m f49759a;

        /* renamed from: b */
        public final Path f49760b;

        /* renamed from: c */
        public final RectF f49761c;

        /* renamed from: d */
        public final C10903b f49762d;

        /* renamed from: e */
        public final float f49763e;

        C10904c(C10897m mVar, float f, RectF rectF, C10903b bVar, Path path) {
            this.f49762d = bVar;
            this.f49759a = mVar;
            this.f49763e = f;
            this.f49761c = rectF;
            this.f49760b = path;
        }
    }

    public C10901n() {
        for (int i = 0; i < 4; i++) {
            this.f49746a[i] = new C10905o();
            this.f49747b[i] = new Matrix();
            this.f49748c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m49054a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m49055b(C10904c cVar, int i) {
        this.f49753h[0] = this.f49746a[i].mo43175k();
        this.f49753h[1] = this.f49746a[i].mo43176l();
        this.f49747b[i].mapPoints(this.f49753h);
        if (i == 0) {
            Path path = cVar.f49760b;
            float[] fArr = this.f49753h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f49760b;
            float[] fArr2 = this.f49753h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f49746a[i].mo43170d(this.f49747b[i], cVar.f49760b);
        C10903b bVar = cVar.f49762d;
        if (bVar != null) {
            bVar.mo43121b(this.f49746a[i], this.f49747b[i], i);
        }
    }

    /* renamed from: c */
    private void m49056c(C10904c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f49753h[0] = this.f49746a[i].mo43173i();
        this.f49753h[1] = this.f49746a[i].mo43174j();
        this.f49747b[i].mapPoints(this.f49753h);
        this.f49754i[0] = this.f49746a[i2].mo43175k();
        this.f49754i[1] = this.f49746a[i2].mo43176l();
        this.f49747b[i2].mapPoints(this.f49754i);
        float[] fArr = this.f49753h;
        float f = fArr[0];
        float[] fArr2 = this.f49754i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m49060i(cVar.f49761c, i);
        this.f49752g.mo43178n(0.0f, 0.0f);
        C10887f j = m49061j(i, cVar.f49759a);
        j.mo39782b(max, i3, cVar.f49763e, this.f49752g);
        this.f49755j.reset();
        this.f49752g.mo43170d(this.f49748c[i], this.f49755j);
        if (!this.f49757l || Build.VERSION.SDK_INT < 19 || (!j.mo43072a() && !m49063l(this.f49755j, i) && !m49063l(this.f49755j, i2))) {
            this.f49752g.mo43170d(this.f49748c[i], cVar.f49760b);
        } else {
            Path path = this.f49755j;
            path.op(path, this.f49751f, Path.Op.DIFFERENCE);
            this.f49753h[0] = this.f49752g.mo43175k();
            this.f49753h[1] = this.f49752g.mo43176l();
            this.f49748c[i].mapPoints(this.f49753h);
            Path path2 = this.f49750e;
            float[] fArr3 = this.f49753h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f49752g.mo43170d(this.f49748c[i], this.f49750e);
        }
        C10903b bVar = cVar.f49762d;
        if (bVar != null) {
            bVar.mo43120a(this.f49752g, this.f49748c[i], i);
        }
    }

    /* renamed from: f */
    private void m49057f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private C10884c m49058g(int i, C10897m mVar) {
        if (i == 1) {
            return mVar.mo43131l();
        }
        if (i == 2) {
            return mVar.mo43129j();
        }
        if (i != 3) {
            return mVar.mo43138t();
        }
        return mVar.mo43136r();
    }

    /* renamed from: h */
    private C10885d m49059h(int i, C10897m mVar) {
        if (i == 1) {
            return mVar.mo43130k();
        }
        if (i == 2) {
            return mVar.mo43128i();
        }
        if (i != 3) {
            return mVar.mo43137s();
        }
        return mVar.mo43135q();
    }

    /* renamed from: i */
    private float m49060i(RectF rectF, int i) {
        float[] fArr = this.f49753h;
        C10905o[] oVarArr = this.f49746a;
        fArr[0] = oVarArr[i].f49766c;
        fArr[1] = oVarArr[i].f49767d;
        this.f49747b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f49753h[0]);
        }
        return Math.abs(rectF.centerY() - this.f49753h[1]);
    }

    /* renamed from: j */
    private C10887f m49061j(int i, C10897m mVar) {
        if (i == 1) {
            return mVar.mo43127h();
        }
        if (i == 2) {
            return mVar.mo43132n();
        }
        if (i != 3) {
            return mVar.mo43133o();
        }
        return mVar.mo43134p();
    }

    /* renamed from: k */
    public static C10901n m49062k() {
        return C10902a.f49758a;
    }

    /* renamed from: l */
    private boolean m49063l(Path path, int i) {
        this.f49756k.reset();
        this.f49746a[i].mo43170d(this.f49747b[i], this.f49756k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f49756k.computeBounds(rectF, true);
        path.op(this.f49756k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m49064m(C10904c cVar, int i) {
        m49059h(i, cVar.f49759a).mo43071b(this.f49746a[i], 90.0f, cVar.f49763e, cVar.f49761c, m49058g(i, cVar.f49759a));
        float a = m49054a(i);
        this.f49747b[i].reset();
        m49057f(i, cVar.f49761c, this.f49749d);
        Matrix matrix = this.f49747b[i];
        PointF pointF = this.f49749d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f49747b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m49065n(int i) {
        this.f49753h[0] = this.f49746a[i].mo43173i();
        this.f49753h[1] = this.f49746a[i].mo43174j();
        this.f49747b[i].mapPoints(this.f49753h);
        float a = m49054a(i);
        this.f49748c[i].reset();
        Matrix matrix = this.f49748c[i];
        float[] fArr = this.f49753h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f49748c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo43167d(C10897m mVar, float f, RectF rectF, Path path) {
        mo43168e(mVar, f, rectF, (C10903b) null, path);
    }

    /* renamed from: e */
    public void mo43168e(C10897m mVar, float f, RectF rectF, C10903b bVar, Path path) {
        path.rewind();
        this.f49750e.rewind();
        this.f49751f.rewind();
        this.f49751f.addRect(rectF, Path.Direction.CW);
        C10904c cVar = new C10904c(mVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m49064m(cVar, i);
            m49065n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m49055b(cVar, i2);
            m49056c(cVar, i2);
        }
        path.close();
        this.f49750e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f49750e.isEmpty()) {
            path.op(this.f49750e, Path.Op.UNION);
        }
    }
}
