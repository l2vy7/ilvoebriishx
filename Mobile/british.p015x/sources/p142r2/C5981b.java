package p142r2;

import android.graphics.Bitmap;
import p019c2.C2645a;
import p087h2.C5382b;
import p087h2.C5387e;

/* renamed from: r2.b */
/* compiled from: GifBitmapProvider */
public final class C5981b implements C2645a.C2646a {

    /* renamed from: a */
    private final C5387e f24938a;

    /* renamed from: b */
    private final C5382b f24939b;

    public C5981b(C5387e eVar, C5382b bVar) {
        this.f24938a = eVar;
        this.f24939b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo9315a(int i, int i2, Bitmap.Config config) {
        return this.f24938a.mo21829e(i, i2, config);
    }

    /* renamed from: b */
    public int[] mo9316b(int i) {
        C5382b bVar = this.f24939b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo21806d(i, int[].class);
    }

    /* renamed from: c */
    public void mo9317c(Bitmap bitmap) {
        this.f24938a.mo21827c(bitmap);
    }

    /* renamed from: d */
    public void mo9318d(byte[] bArr) {
        C5382b bVar = this.f24939b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    /* renamed from: e */
    public byte[] mo9319e(int i) {
        C5382b bVar = this.f24939b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo21806d(i, byte[].class);
    }

    /* renamed from: f */
    public void mo9320f(int[] iArr) {
        C5382b bVar = this.f24939b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }
}
