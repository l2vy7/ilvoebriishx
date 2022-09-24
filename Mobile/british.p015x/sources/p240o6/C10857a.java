package p240o6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p017c0.C2617a;

/* renamed from: o6.a */
/* compiled from: ShadowRenderer */
public class C10857a {

    /* renamed from: i */
    private static final int[] f49630i = new int[3];

    /* renamed from: j */
    private static final float[] f49631j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f49632k = new int[4];

    /* renamed from: l */
    private static final float[] f49633l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f49634a;

    /* renamed from: b */
    private final Paint f49635b;

    /* renamed from: c */
    private final Paint f49636c;

    /* renamed from: d */
    private int f49637d;

    /* renamed from: e */
    private int f49638e;

    /* renamed from: f */
    private int f49639f;

    /* renamed from: g */
    private final Path f49640g;

    /* renamed from: h */
    private Paint f49641h;

    public C10857a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo43038a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f49640g;
        if (z) {
            int[] iArr = f49632k;
            iArr[0] = 0;
            iArr[1] = this.f49639f;
            iArr[2] = this.f49638e;
            iArr[3] = this.f49637d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f49632k;
            iArr2[0] = 0;
            iArr2[1] = this.f49637d;
            iArr2[2] = this.f49638e;
            iArr2[3] = this.f49639f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f49633l;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f49635b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f49632k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f49641h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f49635b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo43039b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f49630i;
        iArr[0] = this.f49639f;
        iArr[1] = this.f49638e;
        iArr[2] = this.f49637d;
        Paint paint = this.f49636c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f49631j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f49636c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo43040c() {
        return this.f49634a;
    }

    /* renamed from: d */
    public void mo43041d(int i) {
        this.f49637d = C2617a.m9119m(i, 68);
        this.f49638e = C2617a.m9119m(i, 20);
        this.f49639f = C2617a.m9119m(i, 0);
        this.f49634a.setColor(this.f49637d);
    }

    public C10857a(int i) {
        this.f49640g = new Path();
        this.f49641h = new Paint();
        this.f49634a = new Paint();
        mo43041d(i);
        this.f49641h.setColor(0);
        Paint paint = new Paint(4);
        this.f49635b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f49636c = new Paint(paint);
    }
}
