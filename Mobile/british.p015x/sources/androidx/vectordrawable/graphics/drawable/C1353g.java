package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p010b0.C1532g;
import p017c0.C2619c;

/* renamed from: androidx.vectordrawable.graphics.drawable.g */
/* compiled from: PathInterpolatorCompat */
public class C1353g implements Interpolator {

    /* renamed from: a */
    private float[] f5993a;

    /* renamed from: b */
    private float[] f5994b;

    public C1353g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m7187a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m7188b(path);
    }

    /* renamed from: b */
    private void m7188b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f5993a = new float[min];
            this.f5994b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f5993a[i2] = fArr[0];
                this.f5994b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f5993a[0])) <= 1.0E-5d && ((double) Math.abs(this.f5994b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f5993a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f5994b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f5993a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f5993a[0]);
            sb.append(",");
            sb.append(this.f5994b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f5993a[i6]);
            sb.append(",");
            sb.append(this.f5994b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m7189c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m7188b(path);
    }

    /* renamed from: d */
    private void m7190d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C1532g.m7920r(xmlPullParser, "pathData")) {
            String m = C1532g.m7915m(typedArray, xmlPullParser, "pathData", 4);
            Path e = C2619c.m9129e(m);
            if (e != null) {
                m7188b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m);
        } else if (!C1532g.m7920r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C1532g.m7920r(xmlPullParser, "controlY1")) {
            float j = C1532g.m7912j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j2 = C1532g.m7912j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r = C1532g.m7920r(xmlPullParser, "controlX2");
            if (r != C1532g.m7920r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!r) {
                m7189c(j, j2);
            } else {
                m7187a(j, j2, C1532g.m7912j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C1532g.m7912j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f5993a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f5993a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f5993a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f5994b[i];
        }
        float[] fArr2 = this.f5994b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public C1353g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C1343a.f5977l);
        m7190d(s, xmlPullParser);
        s.recycle();
    }
}
