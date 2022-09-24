package p199d6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: d6.g */
/* compiled from: MatrixEvaluator */
public class C10499g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f49018a = new float[9];

    /* renamed from: b */
    private final float[] f49019b = new float[9];

    /* renamed from: c */
    private final Matrix f49020c = new Matrix();

    /* renamed from: a */
    public Matrix mo40769a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f49018a);
        matrix2.getValues(this.f49019b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f49019b;
            float f2 = fArr[i];
            float[] fArr2 = this.f49018a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f49020c.setValues(this.f49019b);
        return this.f49020c;
    }
}
