package p141r2;

import android.util.Log;
import com.bumptech.glide.load.C3339a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p064d2.C5163h;
import p064d2.C5165j;
import p081g2.C5323v;
import p086h2.C5382b;

/* renamed from: r2.j */
/* compiled from: StreamGifDecoder */
public class C5994j implements C5165j<InputStream, C5982c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f24980a;

    /* renamed from: b */
    private final C5165j<ByteBuffer, C5982c> f24981b;

    /* renamed from: c */
    private final C5382b f24982c;

    public C5994j(List<ImageHeaderParser> list, C5165j<ByteBuffer, C5982c> jVar, C5382b bVar) {
        this.f24980a = list;
        this.f24981b = jVar;
        this.f24982c = bVar;
    }

    /* renamed from: e */
    private static byte[] m26419e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public C5323v<C5982c> mo21345b(InputStream inputStream, int i, int i2, C5163h hVar) throws IOException {
        byte[] e = m26419e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f24981b.mo21345b(ByteBuffer.wrap(e), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo21344a(InputStream inputStream, C5163h hVar) throws IOException {
        return !((Boolean) hVar.mo21340c(C5993i.f24979b)).booleanValue() && C3339a.m11190e(this.f24980a, inputStream, this.f24982c) == ImageHeaderParser.ImageType.GIF;
    }
}
