package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.circularreveal.C10080c;
import p226k6.C10648a;

/* renamed from: com.google.android.material.circularreveal.b */
/* compiled from: CircularRevealHelper */
public class C10078b {

    /* renamed from: j */
    public static final int f47617j;

    /* renamed from: a */
    private final C10079a f47618a;

    /* renamed from: b */
    private final View f47619b;

    /* renamed from: c */
    private final Path f47620c = new Path();

    /* renamed from: d */
    private final Paint f47621d = new Paint(7);

    /* renamed from: e */
    private final Paint f47622e;

    /* renamed from: f */
    private C10080c.C10085e f47623f;

    /* renamed from: g */
    private Drawable f47624g;

    /* renamed from: h */
    private boolean f47625h;

    /* renamed from: i */
    private boolean f47626i;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    /* compiled from: CircularRevealHelper */
    public interface C10079a {
        /* renamed from: c */
        void mo40339c(Canvas canvas);

        /* renamed from: d */
        boolean mo40340d();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f47617j = 2;
        } else if (i >= 18) {
            f47617j = 1;
        } else {
            f47617j = 0;
        }
    }

    public C10078b(C10079a aVar) {
        this.f47618a = aVar;
        View view = (View) aVar;
        this.f47619b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f47622e = paint;
        paint.setColor(0);
    }

    /* renamed from: d */
    private void m46388d(Canvas canvas) {
        if (m46392o()) {
            Rect bounds = this.f47624g.getBounds();
            float width = this.f47623f.f47631a - (((float) bounds.width()) / 2.0f);
            float height = this.f47623f.f47632b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f47624g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: g */
    private float m46389g(C10080c.C10085e eVar) {
        return C10648a.m48414b(eVar.f47631a, eVar.f47632b, 0.0f, 0.0f, (float) this.f47619b.getWidth(), (float) this.f47619b.getHeight());
    }

    /* renamed from: i */
    private void m46390i() {
        if (f47617j == 1) {
            this.f47620c.rewind();
            C10080c.C10085e eVar = this.f47623f;
            if (eVar != null) {
                this.f47620c.addCircle(eVar.f47631a, eVar.f47632b, eVar.f47633c, Path.Direction.CW);
            }
        }
        this.f47619b.invalidate();
    }

    /* renamed from: n */
    private boolean m46391n() {
        C10080c.C10085e eVar = this.f47623f;
        boolean z = eVar == null || eVar.mo40380a();
        if (f47617j != 0) {
            return !z;
        }
        if (z || !this.f47626i) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m46392o() {
        return (this.f47625h || this.f47624g == null || this.f47623f == null) ? false : true;
    }

    /* renamed from: p */
    private boolean m46393p() {
        return !this.f47625h && Color.alpha(this.f47622e.getColor()) != 0;
    }

    /* renamed from: a */
    public void mo40360a() {
        if (f47617j == 0) {
            this.f47625h = true;
            this.f47626i = false;
            this.f47619b.buildDrawingCache();
            Bitmap drawingCache = this.f47619b.getDrawingCache();
            if (!(drawingCache != null || this.f47619b.getWidth() == 0 || this.f47619b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f47619b.getWidth(), this.f47619b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f47619b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f47621d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f47625h = false;
            this.f47626i = true;
        }
    }

    /* renamed from: b */
    public void mo40361b() {
        if (f47617j == 0) {
            this.f47626i = false;
            this.f47619b.destroyDrawingCache();
            this.f47621d.setShader((Shader) null);
            this.f47619b.invalidate();
        }
    }

    /* renamed from: c */
    public void mo40362c(Canvas canvas) {
        if (m46391n()) {
            int i = f47617j;
            if (i == 0) {
                C10080c.C10085e eVar = this.f47623f;
                canvas.drawCircle(eVar.f47631a, eVar.f47632b, eVar.f47633c, this.f47621d);
                if (m46393p()) {
                    C10080c.C10085e eVar2 = this.f47623f;
                    canvas.drawCircle(eVar2.f47631a, eVar2.f47632b, eVar2.f47633c, this.f47622e);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f47620c);
                this.f47618a.mo40339c(canvas);
                if (m46393p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f47619b.getWidth(), (float) this.f47619b.getHeight(), this.f47622e);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f47618a.mo40339c(canvas);
                if (m46393p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f47619b.getWidth(), (float) this.f47619b.getHeight(), this.f47622e);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f47618a.mo40339c(canvas);
            if (m46393p()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f47619b.getWidth(), (float) this.f47619b.getHeight(), this.f47622e);
            }
        }
        m46388d(canvas);
    }

    /* renamed from: e */
    public Drawable mo40363e() {
        return this.f47624g;
    }

    /* renamed from: f */
    public int mo40364f() {
        return this.f47622e.getColor();
    }

    /* renamed from: h */
    public C10080c.C10085e mo40365h() {
        C10080c.C10085e eVar = this.f47623f;
        if (eVar == null) {
            return null;
        }
        C10080c.C10085e eVar2 = new C10080c.C10085e(eVar);
        if (eVar2.mo40380a()) {
            eVar2.f47633c = m46389g(eVar2);
        }
        return eVar2;
    }

    /* renamed from: j */
    public boolean mo40366j() {
        return this.f47618a.mo40340d() && !m46391n();
    }

    /* renamed from: k */
    public void mo40367k(Drawable drawable) {
        this.f47624g = drawable;
        this.f47619b.invalidate();
    }

    /* renamed from: l */
    public void mo40368l(int i) {
        this.f47622e.setColor(i);
        this.f47619b.invalidate();
    }

    /* renamed from: m */
    public void mo40369m(C10080c.C10085e eVar) {
        if (eVar == null) {
            this.f47623f = null;
        } else {
            C10080c.C10085e eVar2 = this.f47623f;
            if (eVar2 == null) {
                this.f47623f = new C10080c.C10085e(eVar);
            } else {
                eVar2.mo40382c(eVar);
            }
            if (C10648a.m48415c(eVar.f47633c, m46389g(eVar), 1.0E-4f)) {
                this.f47623f.f47633c = Float.MAX_VALUE;
            }
        }
        m46390i();
    }
}
