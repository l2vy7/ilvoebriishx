package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p071e2.C5224m;
import p087h2.C5382b;
import p119n2.C5846w;

/* renamed from: com.bumptech.glide.load.a */
/* compiled from: ImageHeaderParserUtils */
public final class C3339a {

    /* renamed from: com.bumptech.glide.load.a$a */
    /* compiled from: ImageHeaderParserUtils */
    class C3340a implements C3346g {

        /* renamed from: a */
        final /* synthetic */ InputStream f12699a;

        C3340a(InputStream inputStream) {
            this.f12699a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo11177a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo11174b(this.f12699a);
            } finally {
                this.f12699a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    /* compiled from: ImageHeaderParserUtils */
    class C3341b implements C3346g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f12700a;

        C3341b(ByteBuffer byteBuffer) {
            this.f12700a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo11177a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo11173a(this.f12700a);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    /* compiled from: ImageHeaderParserUtils */
    class C3342c implements C3346g {

        /* renamed from: a */
        final /* synthetic */ C5224m f12701a;

        /* renamed from: b */
        final /* synthetic */ C5382b f12702b;

        C3342c(C5224m mVar, C5382b bVar) {
            this.f12701a = mVar;
            this.f12702b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo11177a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                n2.w r1 = new n2.w     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                e2.m r3 = r4.f12701a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo21440a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                h2.b r3 = r4.f12702b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo11174b(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                e2.m r0 = r4.f12701a
                r0.mo21440a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                e2.m r0 = r4.f12701a
                r0.mo21440a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C3339a.C3342c.mo11177a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    /* compiled from: ImageHeaderParserUtils */
    class C3343d implements C3345f {

        /* renamed from: a */
        final /* synthetic */ InputStream f12703a;

        /* renamed from: b */
        final /* synthetic */ C5382b f12704b;

        C3343d(InputStream inputStream, C5382b bVar) {
            this.f12703a = inputStream;
            this.f12704b = bVar;
        }

        /* renamed from: a */
        public int mo11178a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo11175c(this.f12703a, this.f12704b);
            } finally {
                this.f12703a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    /* compiled from: ImageHeaderParserUtils */
    class C3344e implements C3345f {

        /* renamed from: a */
        final /* synthetic */ C5224m f12705a;

        /* renamed from: b */
        final /* synthetic */ C5382b f12706b;

        C3344e(C5224m mVar, C5382b bVar) {
            this.f12705a = mVar;
            this.f12706b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo11178a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                n2.w r1 = new n2.w     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                e2.m r3 = r4.f12705a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo21440a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                h2.b r3 = r4.f12706b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                h2.b r0 = r4.f12706b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo11175c(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                e2.m r0 = r4.f12705a
                r0.mo21440a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                e2.m r0 = r4.f12705a
                r0.mo21440a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C3339a.C3344e.mo11178a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    /* compiled from: ImageHeaderParserUtils */
    private interface C3345f {
        /* renamed from: a */
        int mo11178a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    /* compiled from: ImageHeaderParserUtils */
    private interface C3346g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo11177a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: a */
    public static int m11186a(List<ImageHeaderParser> list, C5224m mVar, C5382b bVar) throws IOException {
        return m11188c(list, new C3344e(mVar, bVar));
    }

    /* renamed from: b */
    public static int m11187b(List<ImageHeaderParser> list, InputStream inputStream, C5382b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5846w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m11188c(list, new C3343d(inputStream, bVar));
    }

    /* renamed from: c */
    private static int m11188c(List<ImageHeaderParser> list, C3345f fVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo11178a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m11189d(List<ImageHeaderParser> list, C5224m mVar, C5382b bVar) throws IOException {
        return m11192g(list, new C3342c(mVar, bVar));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m11190e(List<ImageHeaderParser> list, InputStream inputStream, C5382b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5846w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m11192g(list, new C3340a(inputStream));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m11191f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m11192g(list, new C3341b(byteBuffer));
    }

    /* renamed from: g */
    private static ImageHeaderParser.ImageType m11192g(List<ImageHeaderParser> list, C3346g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = gVar.mo11177a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
