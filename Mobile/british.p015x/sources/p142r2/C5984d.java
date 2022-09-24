package p142r2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p004a3.C0052a;
import p065d2.C5156c;
import p065d2.C5163h;
import p065d2.C5166k;
import p082g2.C5323v;

/* renamed from: r2.d */
/* compiled from: GifDrawableEncoder */
public class C5984d implements C5166k<C5982c> {
    /* renamed from: a */
    public C5156c mo21346a(C5163h hVar) {
        return C5156c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo21330b(C5323v<C5982c> vVar, File file, C5163h hVar) {
        try {
            C0052a.m217e(vVar.get().mo23043c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
