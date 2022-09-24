package p142r2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C3339a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p004a3.C0061f;
import p004a3.C0066k;
import p019c2.C2645a;
import p019c2.C2648c;
import p019c2.C2649d;
import p019c2.C2650e;
import p065d2.C5155b;
import p065d2.C5163h;
import p065d2.C5165j;
import p087h2.C5382b;
import p087h2.C5387e;
import p113m2.C5754c;

/* renamed from: r2.a */
/* compiled from: ByteBufferGifDecoder */
public class C5978a implements C5165j<ByteBuffer, C5982c> {

    /* renamed from: f */
    private static final C5979a f24930f = new C5979a();

    /* renamed from: g */
    private static final C5980b f24931g = new C5980b();

    /* renamed from: a */
    private final Context f24932a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f24933b;

    /* renamed from: c */
    private final C5980b f24934c;

    /* renamed from: d */
    private final C5979a f24935d;

    /* renamed from: e */
    private final C5981b f24936e;

    /* renamed from: r2.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C5979a {
        C5979a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2645a mo23039a(C2645a.C2646a aVar, C2648c cVar, ByteBuffer byteBuffer, int i) {
            return new C2650e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: r2.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C5980b {

        /* renamed from: a */
        private final Queue<C2649d> f24937a = C0066k.m253e(0);

        C5980b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C2649d mo23040a(ByteBuffer byteBuffer) {
            C2649d poll;
            poll = this.f24937a.poll();
            if (poll == null) {
                poll = new C2649d();
            }
            return poll.mo9327p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo23041b(C2649d dVar) {
            dVar.mo9325a();
            this.f24937a.offer(dVar);
        }
    }

    public C5978a(Context context, List<ImageHeaderParser> list, C5387e eVar, C5382b bVar) {
        this(context, list, eVar, bVar, f24931g, f24930f);
    }

    /* renamed from: c */
    private C5985e m26352c(ByteBuffer byteBuffer, int i, int i2, C2649d dVar, C5163h hVar) {
        Bitmap.Config config;
        long b = C0061f.m231b();
        try {
            C2648c c = dVar.mo9326c();
            if (c.mo9322b() > 0) {
                if (c.mo9323c() == 0) {
                    if (hVar.mo21340c(C5993i.f24978a) == C5155b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    C2645a a = this.f24935d.mo23039a(this.f24936e, c, byteBuffer, m26353e(c, i, i2));
                    a.mo9310e(config);
                    a.mo9306b();
                    Bitmap a2 = a.mo9305a();
                    if (a2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C0061f.m230a(b));
                        }
                        return null;
                    }
                    C5985e eVar = new C5985e(new C5982c(this.f24932a, a, C5754c.m25455c(), i, i2, a2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C0061f.m230a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C0061f.m230a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m26353e(C2648c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo9321a() / i2, cVar.mo9324d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo9324d() + "x" + cVar.mo9321a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C5985e mo21345b(ByteBuffer byteBuffer, int i, int i2, C5163h hVar) {
        C2649d a = this.f24934c.mo23040a(byteBuffer);
        try {
            return m26352c(byteBuffer, i, i2, a, hVar);
        } finally {
            this.f24934c.mo23041b(a);
        }
    }

    /* renamed from: f */
    public boolean mo21344a(ByteBuffer byteBuffer, C5163h hVar) throws IOException {
        return !((Boolean) hVar.mo21340c(C5993i.f24979b)).booleanValue() && C3339a.m11191f(this.f24933b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C5978a(Context context, List<ImageHeaderParser> list, C5387e eVar, C5382b bVar, C5980b bVar2, C5979a aVar) {
        this.f24932a = context.getApplicationContext();
        this.f24933b = list;
        this.f24935d = aVar;
        this.f24936e = new C5981b(eVar, bVar);
        this.f24934c = bVar2;
    }
}
