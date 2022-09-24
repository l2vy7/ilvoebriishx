package p112m2;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.io.IOException;
import p064d2.C5155b;
import p064d2.C5160g;
import p064d2.C5163h;
import p064d2.C5164i;
import p064d2.C5165j;
import p081g2.C5323v;
import p118n2.C5823l;
import p118n2.C5831m;
import p118n2.C5839r;

/* renamed from: m2.a */
/* compiled from: ImageDecoderResourceDecoder */
public abstract class C5750a<T> implements C5165j<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C5839r f24391a = C5839r.m25796a();

    /* renamed from: m2.a$a */
    /* compiled from: ImageDecoderResourceDecoder */
    class C5751a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f24392a;

        /* renamed from: b */
        final /* synthetic */ int f24393b;

        /* renamed from: c */
        final /* synthetic */ boolean f24394c;

        /* renamed from: d */
        final /* synthetic */ C5155b f24395d;

        /* renamed from: e */
        final /* synthetic */ C5823l f24396e;

        /* renamed from: f */
        final /* synthetic */ C5164i f24397f;

        /* renamed from: m2.a$a$a */
        /* compiled from: ImageDecoderResourceDecoder */
        class C5752a implements ImageDecoder.OnPartialImageListener {
            C5752a() {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C5751a(int i, int i2, boolean z, C5155b bVar, C5823l lVar, C5164i iVar) {
            this.f24392a = i;
            this.f24393b = i2;
            this.f24394c = z;
            this.f24395d = bVar;
            this.f24396e = lVar;
            this.f24397f = iVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (C5750a.this.f24391a.mo22733c(this.f24392a, this.f24393b, this.f24394c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f24395d == C5155b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C5752a());
            Size size = imageInfo.getSize();
            int i = this.f24392a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f24393b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f24396e.mo22723b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f24397f == C5164i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C5323v<T> mo22525c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: d */
    public final C5323v<T> mo21345b(ImageDecoder.Source source, int i, int i2, C5163h hVar) throws IOException {
        C5155b bVar = (C5155b) hVar.mo21340c(C5831m.f24552f);
        C5823l lVar = (C5823l) hVar.mo21340c(C5823l.f24547h);
        C5160g gVar = C5831m.f24556j;
        return mo22525c(source, i, i2, new C5751a(i, i2, hVar.mo21340c(gVar) != null && ((Boolean) hVar.mo21340c(gVar)).booleanValue(), bVar, lVar, (C5164i) hVar.mo21340c(C5831m.f24553g)));
    }

    /* renamed from: e */
    public final boolean mo21344a(ImageDecoder.Source source, C5163h hVar) {
        return true;
    }
}
