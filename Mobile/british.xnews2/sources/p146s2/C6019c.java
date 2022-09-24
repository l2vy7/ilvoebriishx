package p146s2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p064d2.C5163h;
import p081g2.C5323v;
import p086h2.C5387e;
import p118n2.C5811e;
import p141r2.C5982c;

/* renamed from: s2.c */
/* compiled from: DrawableBytesTranscoder */
public final class C6019c implements C6021e<Drawable, byte[]> {

    /* renamed from: a */
    private final C5387e f25083a;

    /* renamed from: b */
    private final C6021e<Bitmap, byte[]> f25084b;

    /* renamed from: c */
    private final C6021e<C5982c, byte[]> f25085c;

    public C6019c(C5387e eVar, C6021e<Bitmap, byte[]> eVar2, C6021e<C5982c, byte[]> eVar3) {
        this.f25083a = eVar;
        this.f25084b = eVar2;
        this.f25085c = eVar3;
    }

    /* renamed from: b */
    private static C5323v<C5982c> m26497b(C5323v<Drawable> vVar) {
        return vVar;
    }

    /* renamed from: a */
    public C5323v<byte[]> mo23148a(C5323v<Drawable> vVar, C5163h hVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f25084b.mo23148a(C5811e.m25696e(((BitmapDrawable) drawable).getBitmap(), this.f25083a), hVar);
        }
        if (drawable instanceof C5982c) {
            return this.f25085c.mo23148a(m26497b(vVar), hVar);
        }
        return null;
    }
}
