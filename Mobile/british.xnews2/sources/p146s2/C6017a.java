package p146s2;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p064d2.C5163h;
import p081g2.C5323v;
import p123o2.C5870b;

/* renamed from: s2.a */
/* compiled from: BitmapBytesTranscoder */
public class C6017a implements C6021e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f25080a;

    /* renamed from: b */
    private final int f25081b;

    public C6017a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public C5323v<byte[]> mo23148a(C5323v<Bitmap> vVar, C5163h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f25080a, this.f25081b, byteArrayOutputStream);
        vVar.mo21591a();
        return new C5870b(byteArrayOutputStream.toByteArray());
    }

    public C6017a(Bitmap.CompressFormat compressFormat, int i) {
        this.f25080a = compressFormat;
        this.f25081b = i;
    }
}
