package p123o2;

import java.nio.ByteBuffer;
import p070e2.C5210e;

/* renamed from: o2.a */
/* compiled from: ByteBufferRewinder */
public class C5868a implements C5210e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f24621a;

    /* renamed from: o2.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C5869a implements C5210e.C5211a<ByteBuffer> {
        /* renamed from: a */
        public Class<ByteBuffer> mo21442a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public C5210e<ByteBuffer> mo21443b(ByteBuffer byteBuffer) {
            return new C5868a(byteBuffer);
        }
    }

    public C5868a(ByteBuffer byteBuffer) {
        this.f24621a = byteBuffer;
    }

    /* renamed from: b */
    public void mo21441b() {
    }

    /* renamed from: c */
    public ByteBuffer mo21440a() {
        this.f24621a.position(0);
        return this.f24621a;
    }
}
