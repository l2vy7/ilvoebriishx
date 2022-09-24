package p118n2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C3339a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p004a3.C0065j;
import p070e2.C5221k;
import p070e2.C5224m;
import p086h2.C5382b;

/* renamed from: n2.s */
/* compiled from: ImageReader */
interface C5840s {

    /* renamed from: n2.s$a */
    /* compiled from: ImageReader */
    public static final class C5841a implements C5840s {

        /* renamed from: a */
        private final C5221k f24577a;

        /* renamed from: b */
        private final C5382b f24578b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f24579c;

        C5841a(InputStream inputStream, List<ImageHeaderParser> list, C5382b bVar) {
            this.f24578b = (C5382b) C0065j.m247d(bVar);
            this.f24579c = (List) C0065j.m247d(list);
            this.f24577a = new C5221k(inputStream, bVar);
        }

        /* renamed from: a */
        public int mo22735a() throws IOException {
            return C3339a.m11187b(this.f24579c, this.f24577a.mo21440a(), this.f24578b);
        }

        /* renamed from: b */
        public Bitmap mo22736b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f24577a.mo21440a(), (Rect) null, options);
        }

        /* renamed from: c */
        public void mo22737c() {
            this.f24577a.mo21457c();
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo22738d() throws IOException {
            return C3339a.m11190e(this.f24579c, this.f24577a.mo21440a(), this.f24578b);
        }
    }

    /* renamed from: n2.s$b */
    /* compiled from: ImageReader */
    public static final class C5842b implements C5840s {

        /* renamed from: a */
        private final C5382b f24580a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f24581b;

        /* renamed from: c */
        private final C5224m f24582c;

        C5842b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C5382b bVar) {
            this.f24580a = (C5382b) C0065j.m247d(bVar);
            this.f24581b = (List) C0065j.m247d(list);
            this.f24582c = new C5224m(parcelFileDescriptor);
        }

        /* renamed from: a */
        public int mo22735a() throws IOException {
            return C3339a.m11186a(this.f24581b, this.f24582c, this.f24580a);
        }

        /* renamed from: b */
        public Bitmap mo22736b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f24582c.mo21440a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: c */
        public void mo22737c() {
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo22738d() throws IOException {
            return C3339a.m11189d(this.f24581b, this.f24582c, this.f24580a);
        }
    }

    /* renamed from: a */
    int mo22735a() throws IOException;

    /* renamed from: b */
    Bitmap mo22736b(BitmapFactory.Options options) throws IOException;

    /* renamed from: c */
    void mo22737c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo22738d() throws IOException;
}
