package p118n2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import p064d2.C5163h;
import p064d2.C5165j;
import p081g2.C5323v;

/* renamed from: n2.h */
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class C5814h implements C5165j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C5810d f24532a = new C5810d();

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(ByteBuffer byteBuffer, int i, int i2, C5163h hVar) throws IOException {
        return this.f24532a.mo21345b(ImageDecoder.createSource(byteBuffer), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo21344a(ByteBuffer byteBuffer, C5163h hVar) throws IOException {
        return true;
    }
}
