package p174x2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: x2.f */
/* compiled from: ImageViewTargetFactory */
public class C6384f {
    /* renamed from: a */
    public <Z> C6387i<ImageView, Z> mo24219a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C6380b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C6382d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
