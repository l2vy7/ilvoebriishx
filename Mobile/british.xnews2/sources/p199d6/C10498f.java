package p199d6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: d6.f */
/* compiled from: ImageMatrixProperty */
public class C10498f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f49017a = new Matrix();

    public C10498f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f49017a.set(imageView.getImageMatrix());
        return this.f49017a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
