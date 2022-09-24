package p118n2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p064d2.C5156c;
import p064d2.C5163h;
import p064d2.C5166k;
import p081g2.C5323v;
import p086h2.C5387e;

/* renamed from: n2.b */
/* compiled from: BitmapDrawableEncoder */
public class C5797b implements C5166k<BitmapDrawable> {

    /* renamed from: a */
    private final C5387e f24512a;

    /* renamed from: b */
    private final C5166k<Bitmap> f24513b;

    public C5797b(C5387e eVar, C5166k<Bitmap> kVar) {
        this.f24512a = eVar;
        this.f24513b = kVar;
    }

    /* renamed from: a */
    public C5156c mo21346a(C5163h hVar) {
        return this.f24513b.mo21346a(hVar);
    }

    /* renamed from: c */
    public boolean mo21330b(C5323v<BitmapDrawable> vVar, File file, C5163h hVar) {
        return this.f24513b.mo21330b(new C5811e(vVar.get().getBitmap(), this.f24512a), file, hVar);
    }
}
