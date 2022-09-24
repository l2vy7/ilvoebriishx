package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.m */
/* compiled from: PathProperty */
class C1322m<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f5914a;

    /* renamed from: b */
    private final PathMeasure f5915b;

    /* renamed from: c */
    private final float f5916c;

    /* renamed from: d */
    private final float[] f5917d = new float[2];

    /* renamed from: e */
    private final PointF f5918e = new PointF();

    /* renamed from: f */
    private float f5919f;

    C1322m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5914a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5915b = pathMeasure;
        this.f5916c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f5919f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f5919f = f.floatValue();
        this.f5915b.getPosTan(this.f5916c * f.floatValue(), this.f5917d, (float[]) null);
        PointF pointF = this.f5918e;
        float[] fArr = this.f5917d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f5914a.set(t, pointF);
    }
}
