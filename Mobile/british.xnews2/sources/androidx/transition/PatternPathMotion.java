package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p010b0.C1532g;
import p016c0.C2619c;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    private Path f5763a;

    /* renamed from: b */
    private final Path f5764b;

    /* renamed from: c */
    private final Matrix f5765c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f5764b = path;
        this.f5765c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f5763a = path;
    }

    /* renamed from: b */
    private static float m6857b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    public Path mo6147a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m6857b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f5765c.setScale(b, b);
        this.f5765c.postRotate((float) Math.toDegrees(atan2));
        this.f5765c.postTranslate(f, f2);
        Path path = new Path();
        this.f5764b.transform(this.f5765c, path);
        return path;
    }

    /* renamed from: c */
    public void mo6218c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f5765c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m6857b(f5, f6);
        this.f5765c.postScale(b, b);
        this.f5765c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f5765c, this.f5764b);
        this.f5763a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f5764b = new Path();
        this.f5765c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5935k);
        try {
            String m = C1532g.m7915m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                mo6218c(C2619c.m9129e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
