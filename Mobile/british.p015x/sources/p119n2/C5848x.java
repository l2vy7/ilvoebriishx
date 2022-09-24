package p119n2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;
import p087h2.C5387e;
import p130p2.C5900d;

/* renamed from: n2.x */
/* compiled from: ResourceBitmapDecoder */
public class C5848x implements C5165j<Uri, Bitmap> {

    /* renamed from: a */
    private final C5900d f24593a;

    /* renamed from: b */
    private final C5387e f24594b;

    public C5848x(C5900d dVar, C5387e eVar) {
        this.f24593a = dVar;
        this.f24594b = eVar;
    }

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(Uri uri, int i, int i2, C5163h hVar) {
        C5323v<Drawable> c = this.f24593a.mo21345b(uri, i, i2, hVar);
        if (c == null) {
            return null;
        }
        return C5834n.m25784a(this.f24594b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo21344a(Uri uri, C5163h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
