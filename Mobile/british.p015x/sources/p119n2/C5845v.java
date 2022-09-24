package p119n2;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;

/* renamed from: n2.v */
/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class C5845v implements C5165j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C5831m f24586a;

    public C5845v(C5831m mVar) {
        this.f24586a = mVar;
    }

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C5163h hVar) throws IOException {
        return this.f24586a.mo22724d(parcelFileDescriptor, i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo21344a(ParcelFileDescriptor parcelFileDescriptor, C5163h hVar) {
        return this.f24586a.mo22727o(parcelFileDescriptor);
    }
}
