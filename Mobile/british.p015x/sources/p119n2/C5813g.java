package p119n2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import p004a3.C0052a;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;

/* renamed from: n2.g */
/* compiled from: ByteBufferBitmapDecoder */
public class C5813g implements C5165j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C5831m f24531a;

    public C5813g(C5831m mVar) {
        this.f24531a = mVar;
    }

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(ByteBuffer byteBuffer, int i, int i2, C5163h hVar) throws IOException {
        return this.f24531a.mo22725e(C0052a.m218f(byteBuffer), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo21344a(ByteBuffer byteBuffer, C5163h hVar) {
        return this.f24531a.mo22729q(byteBuffer);
    }
}
