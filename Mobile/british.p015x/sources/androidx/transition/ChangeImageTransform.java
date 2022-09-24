package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1334t;
import java.util.Map;

public class ChangeImageTransform extends Transition {

    /* renamed from: L */
    private static final String[] f5721L = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: M */
    private static final TypeEvaluator<Matrix> f5722M = new C1256a();

    /* renamed from: N */
    private static final Property<ImageView, Matrix> f5723N = new C1257b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    static class C1256a implements TypeEvaluator<Matrix> {
        C1256a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    static class C1257b extends Property<ImageView, Matrix> {
        C1257b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            C1315j.m7099a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    static /* synthetic */ class C1258c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5724a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5724a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5724a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C1258c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: A0 */
    private ObjectAnimator m6800A0(ImageView imageView) {
        Property<ImageView, Matrix> property = f5723N;
        TypeEvaluator<Matrix> typeEvaluator = f5722M;
        Matrix matrix = C1317k.f5908a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    /* renamed from: B0 */
    private static Matrix m6801B0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: w0 */
    private void m6802w0(C1336u uVar) {
        View view = uVar.f5950b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = uVar.f5949a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", m6804y0(imageView));
            }
        }
    }

    /* renamed from: x0 */
    private static Matrix m6803x0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    /* renamed from: y0 */
    private static Matrix m6804y0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C1258c.f5724a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return m6801B0(imageView);
            }
            if (i == 2) {
                return m6803x0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: z0 */
    private ObjectAnimator m6805z0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f5723N, new C1334t.C1335a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: U */
    public String[] mo6151U() {
        return f5721L;
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        m6802w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        m6802w0(uVar);
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        if (uVar == null || uVar2 == null) {
            return null;
        }
        Rect rect = (Rect) uVar.f5949a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) uVar2.f5949a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) uVar.f5949a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) uVar2.f5949a.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) uVar2.f5950b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return m6800A0(imageView);
        }
        if (matrix == null) {
            matrix = C1317k.f5908a;
        }
        if (matrix2 == null) {
            matrix2 = C1317k.f5908a;
        }
        f5723N.set(imageView, matrix);
        return m6805z0(imageView, matrix, matrix2);
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
