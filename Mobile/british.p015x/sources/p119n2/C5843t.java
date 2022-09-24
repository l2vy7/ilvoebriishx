package p119n2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import p004a3.C0052a;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;

/* renamed from: n2.t */
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class C5843t implements C5165j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C5810d f24583a = new C5810d();

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(InputStream inputStream, int i, int i2, C5163h hVar) throws IOException {
        return this.f24583a.mo21345b(ImageDecoder.createSource(C0052a.m214b(inputStream)), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo21344a(InputStream inputStream, C5163h hVar) throws IOException {
        return true;
    }
}
