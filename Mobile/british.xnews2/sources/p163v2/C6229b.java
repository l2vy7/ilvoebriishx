package p163v2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v2.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C6229b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f25665a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo23739a(ImageHeaderParser imageHeaderParser) {
        this.f25665a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo23740b() {
        return this.f25665a;
    }
}
