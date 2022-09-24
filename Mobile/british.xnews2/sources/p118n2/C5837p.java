package p118n2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p086h2.C5382b;
import p144s0.C6008a;

/* renamed from: n2.p */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C5837p implements ImageHeaderParser {
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo11173a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public ImageHeaderParser.ImageType mo11174b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public int mo11175c(InputStream inputStream, C5382b bVar) throws IOException {
        int d = new C6008a(inputStream).mo23104d("Orientation", 1);
        if (d == 0) {
            return -1;
        }
        return d;
    }
}
