package p203e6;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: e6.a */
/* compiled from: CanvasCompat */
public class C10515a {
    /* renamed from: a */
    public static int m48245a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
