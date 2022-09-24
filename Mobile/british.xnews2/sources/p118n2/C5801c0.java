package p118n2;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p064d2.C5160g;
import p064d2.C5163h;
import p064d2.C5165j;
import p081g2.C5323v;
import p086h2.C5387e;

/* renamed from: n2.c0 */
/* compiled from: VideoDecoder */
public class C5801c0<T> implements C5165j<T, Bitmap> {

    /* renamed from: d */
    public static final C5160g<Long> f24518d = C5160g.m23471a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5802a());

    /* renamed from: e */
    public static final C5160g<Integer> f24519e = C5160g.m23471a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5803b());

    /* renamed from: f */
    private static final C5807e f24520f = new C5807e();

    /* renamed from: a */
    private final C5808f<T> f24521a;

    /* renamed from: b */
    private final C5387e f24522b;

    /* renamed from: c */
    private final C5807e f24523c;

    /* renamed from: n2.c0$a */
    /* compiled from: VideoDecoder */
    class C5802a implements C5160g.C5162b<Long> {

        /* renamed from: a */
        private final ByteBuffer f24524a = ByteBuffer.allocate(8);

        C5802a() {
        }

        /* renamed from: b */
        public void mo21339a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f24524a) {
                this.f24524a.position(0);
                messageDigest.update(this.f24524a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: n2.c0$b */
    /* compiled from: VideoDecoder */
    class C5803b implements C5160g.C5162b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f24525a = ByteBuffer.allocate(4);

        C5803b() {
        }

        /* renamed from: b */
        public void mo21339a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f24525a) {
                    this.f24525a.position(0);
                    messageDigest.update(this.f24525a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: n2.c0$c */
    /* compiled from: VideoDecoder */
    private static final class C5804c implements C5808f<AssetFileDescriptor> {
        private C5804c() {
        }

        /* renamed from: b */
        public void mo22700a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ C5804c(C5802a aVar) {
            this();
        }
    }

    /* renamed from: n2.c0$d */
    /* compiled from: VideoDecoder */
    static final class C5805d implements C5808f<ByteBuffer> {

        /* renamed from: n2.c0$d$a */
        /* compiled from: VideoDecoder */
        class C5806a extends MediaDataSource {

            /* renamed from: b */
            final /* synthetic */ ByteBuffer f24526b;

            C5806a(ByteBuffer byteBuffer) {
                this.f24526b = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f24526b.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f24526b.limit())) {
                    return -1;
                }
                this.f24526b.position((int) j);
                int min = Math.min(i2, this.f24526b.remaining());
                this.f24526b.get(bArr, i, min);
                return min;
            }
        }

        C5805d() {
        }

        /* renamed from: b */
        public void mo22700a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C5806a(byteBuffer));
        }
    }

    /* renamed from: n2.c0$e */
    /* compiled from: VideoDecoder */
    static class C5807e {
        C5807e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo22706a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: n2.c0$f */
    /* compiled from: VideoDecoder */
    interface C5808f<T> {
        /* renamed from: a */
        void mo22700a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: n2.c0$g */
    /* compiled from: VideoDecoder */
    static final class C5809g implements C5808f<ParcelFileDescriptor> {
        C5809g() {
        }

        /* renamed from: b */
        public void mo22700a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C5801c0(C5387e eVar, C5808f<T> fVar) {
        this(eVar, fVar, f24520f);
    }

    /* renamed from: c */
    public static C5165j<AssetFileDescriptor, Bitmap> m25675c(C5387e eVar) {
        return new C5801c0(eVar, new C5804c((C5802a) null));
    }

    /* renamed from: d */
    public static C5165j<ByteBuffer, Bitmap> m25676d(C5387e eVar) {
        return new C5801c0(eVar, new C5805d());
    }

    /* renamed from: e */
    private static Bitmap m25677e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C5823l lVar) {
        Bitmap g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || lVar == C5823l.f24545f) ? null : m25679g(mediaMetadataRetriever, j, i, i2, i3, lVar);
        return g == null ? m25678f(mediaMetadataRetriever, j, i) : g;
    }

    /* renamed from: f */
    private static Bitmap m25678f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: g */
    private static Bitmap m25679g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C5823l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = lVar.mo22723b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: h */
    public static C5165j<ParcelFileDescriptor, Bitmap> m25680h(C5387e eVar) {
        return new C5801c0(eVar, new C5809g());
    }

    /* renamed from: a */
    public boolean mo21344a(T t, C5163h hVar) {
        return true;
    }

    /* renamed from: b */
    public C5323v<Bitmap> mo21345b(T t, int i, int i2, C5163h hVar) throws IOException {
        long longValue = ((Long) hVar.mo21340c(f24518d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) hVar.mo21340c(f24519e);
            if (num == null) {
                num = 2;
            }
            C5823l lVar = (C5823l) hVar.mo21340c(C5823l.f24547h);
            if (lVar == null) {
                lVar = C5823l.f24546g;
            }
            C5823l lVar2 = lVar;
            MediaMetadataRetriever a = this.f24523c.mo22706a();
            try {
                this.f24521a.mo22700a(a, t);
                Bitmap e = m25677e(a, longValue, num.intValue(), i, i2, lVar2);
                a.release();
                return C5811e.m25696e(e, this.f24522b);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    C5801c0(C5387e eVar, C5808f<T> fVar, C5807e eVar2) {
        this.f24522b = eVar;
        this.f24521a = fVar;
        this.f24523c = eVar2;
    }
}
