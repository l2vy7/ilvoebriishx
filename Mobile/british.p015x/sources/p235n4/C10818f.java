package p235n4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8794w9;
import p244q4.C10922b;

/* renamed from: n4.f */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10818f extends AsyncTask<Uri, Long, Bitmap> {

    /* renamed from: c */
    private static final C10922b f49568c = new C10922b("FetchBitmapTask");

    /* renamed from: a */
    private final C10821i f49569a;

    /* renamed from: b */
    private final C10814b f49570b;

    public C10818f(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, C10814b bVar, byte[] bArr) {
        this.f49570b = bVar;
        this.f49569a = C8794w9.m41379e(context.getApplicationContext(), this, new C10817e(this, (C10815c) null), i, i2, false, 2097152, 5, 333, 10000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        C10821i iVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (iVar = this.f49569a) == null) {
            return null;
        }
        try {
            return iVar.mo42987c1(uri);
        } catch (RemoteException e) {
            f49568c.mo43191b(e, "Unable to call %s on %s.", "doFetch", C10821i.class.getSimpleName());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C10814b bVar = this.f49570b;
        if (bVar != null) {
            bVar.mo42983d(bitmap);
        }
    }
}
