package p119n2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p004a3.C0057d;
import p004a3.C0063h;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;
import p087h2.C5382b;
import p087h2.C5387e;
import p119n2.C5831m;

/* renamed from: n2.z */
/* compiled from: StreamBitmapDecoder */
public class C5850z implements C5165j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C5831m f24597a;

    /* renamed from: b */
    private final C5382b f24598b;

    /* renamed from: n2.z$a */
    /* compiled from: StreamBitmapDecoder */
    static class C5851a implements C5831m.C5833b {

        /* renamed from: a */
        private final C5846w f24599a;

        /* renamed from: b */
        private final C0057d f24600b;

        C5851a(C5846w wVar, C0057d dVar) {
            this.f24599a = wVar;
            this.f24600b = dVar;
        }

        /* renamed from: a */
        public void mo22730a(C5387e eVar, Bitmap bitmap) throws IOException {
            IOException c = this.f24600b.mo167c();
            if (c != null) {
                if (bitmap != null) {
                    eVar.mo21827c(bitmap);
                }
                throw c;
            }
        }

        /* renamed from: b */
        public void mo22731b() {
            this.f24599a.mo22746d();
        }
    }

    public C5850z(C5831m mVar, C5382b bVar) {
        this.f24597a = mVar;
        this.f24598b = bVar;
    }

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(InputStream inputStream, int i, int i2, C5163h hVar) throws IOException {
        C5846w wVar;
        boolean z;
        if (inputStream instanceof C5846w) {
            wVar = (C5846w) inputStream;
            z = false;
        } else {
            wVar = new C5846w(inputStream, this.f24598b);
            z = true;
        }
        C0057d d = C0057d.m224d(wVar);
        try {
            return this.f24597a.mo22726f(new C0063h(d), i, i2, hVar, new C5851a(wVar, d));
        } finally {
            d.mo169e();
            if (z) {
                wVar.mo22747e();
            }
        }
    }

    /* renamed from: d */
    public boolean mo21344a(InputStream inputStream, C5163h hVar) {
        return this.f24597a.mo22728p(inputStream);
    }
}
