package p156u0;

import android.view.animation.Interpolator;

/* renamed from: u0.d */
/* compiled from: LookupTableInterpolator */
abstract class C6174d implements Interpolator {

    /* renamed from: a */
    private final float[] f25513a;

    /* renamed from: b */
    private final float f25514b;

    protected C6174d(float[] fArr) {
        this.f25513a = fArr;
        this.f25514b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f25513a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f25514b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f25513a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
