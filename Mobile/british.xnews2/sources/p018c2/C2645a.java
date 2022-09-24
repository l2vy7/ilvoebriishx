package p018c2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: c2.a */
/* compiled from: GifDecoder */
public interface C2645a {

    /* renamed from: c2.a$a */
    /* compiled from: GifDecoder */
    public interface C2646a {
        /* renamed from: a */
        Bitmap mo9315a(int i, int i2, Bitmap.Config config);

        /* renamed from: b */
        int[] mo9316b(int i);

        /* renamed from: c */
        void mo9317c(Bitmap bitmap);

        /* renamed from: d */
        void mo9318d(byte[] bArr);

        /* renamed from: e */
        byte[] mo9319e(int i);

        /* renamed from: f */
        void mo9320f(int[] iArr);
    }

    /* renamed from: a */
    Bitmap mo9305a();

    /* renamed from: b */
    void mo9306b();

    /* renamed from: c */
    int mo9307c();

    void clear();

    /* renamed from: d */
    int mo9309d();

    /* renamed from: e */
    void mo9310e(Bitmap.Config config);

    /* renamed from: f */
    void mo9311f();

    /* renamed from: g */
    int mo9312g();

    ByteBuffer getData();

    /* renamed from: h */
    int mo9314h();
}
