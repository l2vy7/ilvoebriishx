package p101k2;

import com.bumptech.glide.C3325f;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p064d2.C5154a;
import p064d2.C5163h;
import p070e2.C5208d;
import p101k2.C5596n;
import p183z2.C6445b;

/* renamed from: k2.b */
/* compiled from: ByteArrayLoader */
public class C5558b<Data> implements C5596n<byte[], Data> {

    /* renamed from: a */
    private final C5561b<Data> f24082a;

    /* renamed from: k2.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C5559a implements C5598o<byte[], ByteBuffer> {

        /* renamed from: k2.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C5560a implements C5561b<ByteBuffer> {
            C5560a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo22121a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo22122b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: a */
        public C5596n<byte[], ByteBuffer> mo22118a(C5604r rVar) {
            return new C5558b(new C5560a());
        }
    }

    /* renamed from: k2.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C5561b<Data> {
        /* renamed from: a */
        Class<Data> mo22121a();

        /* renamed from: b */
        Data mo22122b(byte[] bArr);
    }

    /* renamed from: k2.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C5562c<Data> implements C5208d<Data> {

        /* renamed from: b */
        private final byte[] f24084b;

        /* renamed from: c */
        private final C5561b<Data> f24085c;

        C5562c(byte[] bArr, C5561b<Data> bVar) {
            this.f24084b = bArr;
            this.f24085c = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo21422a() {
            return this.f24085c.mo22121a();
        }

        /* renamed from: b */
        public void mo21427b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return C5154a.LOCAL;
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super Data> aVar) {
            aVar.mo21439f(this.f24085c.mo22122b(this.f24084b));
        }
    }

    /* renamed from: k2.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C5563d implements C5598o<byte[], InputStream> {

        /* renamed from: k2.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C5564a implements C5561b<InputStream> {
            C5564a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo22121a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo22122b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: a */
        public C5596n<byte[], InputStream> mo22118a(C5604r rVar) {
            return new C5558b(new C5564a());
        }
    }

    public C5558b(C5561b<Data> bVar) {
        this.f24082a = bVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(byte[] bArr, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(bArr), new C5562c(bArr, this.f24082a));
    }

    /* renamed from: d */
    public boolean mo22114b(byte[] bArr) {
        return true;
    }
}
