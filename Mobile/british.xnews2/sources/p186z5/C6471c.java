package p186z5;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* renamed from: z5.c */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C6471c {

    /* renamed from: a */
    private final C6473b f26556a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public ByteBuffer f26557b;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public C6474c f26558c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Bitmap f26559d;

    /* renamed from: z5.c$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static class C6472a {

        /* renamed from: a */
        private final C6471c f26560a = new C6471c();

        /* renamed from: a */
        public C6471c mo24306a() {
            if (this.f26560a.f26557b != null || this.f26560a.f26559d != null) {
                return this.f26560a;
            }
            C6474c unused = this.f26560a.f26558c;
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        /* renamed from: b */
        public C6472a mo24307b(int i) {
            int unused = this.f26560a.mo24305c().f26563c = i;
            return this;
        }

        /* renamed from: c */
        public C6472a mo24308c(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                ByteBuffer unused = this.f26560a.f26557b = byteBuffer;
                C6473b c = this.f26560a.mo24305c();
                int unused2 = c.f26561a = i;
                int unused3 = c.f26562b = i2;
                int unused4 = c.f26566f = i3;
                return this;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        public C6472a mo24309d(int i) {
            int unused = this.f26560a.mo24305c().f26565e = i;
            return this;
        }

        /* renamed from: e */
        public C6472a mo24310e(long j) {
            long unused = this.f26560a.mo24305c().f26564d = j;
            return this;
        }
    }

    /* renamed from: z5.c$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static class C6474c {
    }

    private C6471c() {
        this.f26556a = new C6473b();
        this.f26557b = null;
        this.f26559d = null;
    }

    /* renamed from: a */
    public Bitmap mo24303a() {
        return this.f26559d;
    }

    /* renamed from: b */
    public ByteBuffer mo24304b() {
        Bitmap bitmap = this.f26559d;
        if (bitmap == null) {
            return this.f26557b;
        }
        int width = bitmap.getWidth();
        int height = this.f26559d.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.f26559d.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public C6473b mo24305c() {
        return this.f26556a;
    }

    /* renamed from: z5.c$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static class C6473b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f26561a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f26562b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f26563c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f26564d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f26565e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f26566f = -1;

        public C6473b() {
        }

        /* renamed from: a */
        public int mo24311a() {
            return this.f26566f;
        }

        /* renamed from: b */
        public int mo24312b() {
            return this.f26562b;
        }

        /* renamed from: c */
        public int mo24313c() {
            return this.f26563c;
        }

        /* renamed from: d */
        public int mo24314d() {
            return this.f26565e;
        }

        /* renamed from: e */
        public long mo24315e() {
            return this.f26564d;
        }

        /* renamed from: f */
        public int mo24316f() {
            return this.f26561a;
        }

        /* renamed from: m */
        public final void mo24317m() {
            if (this.f26565e % 2 != 0) {
                int i = this.f26561a;
                this.f26561a = this.f26562b;
                this.f26562b = i;
            }
            this.f26565e = 0;
        }

        public C6473b(C6473b bVar) {
            this.f26561a = bVar.mo24316f();
            this.f26562b = bVar.mo24312b();
            this.f26563c = bVar.mo24313c();
            this.f26564d = bVar.mo24315e();
            this.f26565e = bVar.mo24314d();
            this.f26566f = bVar.mo24311a();
        }
    }
}
