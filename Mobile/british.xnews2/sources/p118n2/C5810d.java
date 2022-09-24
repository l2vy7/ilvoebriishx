package p118n2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p081g2.C5323v;
import p086h2.C5387e;
import p086h2.C5388f;
import p112m2.C5750a;

/* renamed from: n2.d */
/* compiled from: BitmapImageDecoderResourceDecoder */
public final class C5810d extends C5750a<Bitmap> {

    /* renamed from: b */
    private final C5387e f24528b = new C5388f();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C5323v<Bitmap> mo22525c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C5811e(decodeBitmap, this.f24528b);
    }
}
