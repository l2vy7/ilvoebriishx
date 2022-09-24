package com.google.ads.interactivemedia.p039v3.internal;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dq */
/* compiled from: IMASDK */
final class C3943dq extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: a */
    Exception f16938a = null;

    /* renamed from: b */
    final /* synthetic */ C3945ds f16939b;

    C3943dq(C3945ds dsVar) {
        this.f16939b = dsVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            C3945ds dsVar = this.f16939b;
            return dsVar.mo15688a(dsVar.f16942a.src());
        } catch (IOException e) {
            this.f16938a = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            String src = this.f16939b.f16942a.src();
            String valueOf = String.valueOf(this.f16938a);
            StringBuilder sb = new StringBuilder(String.valueOf(src).length() + 33 + valueOf.length());
            sb.append("Loading image companion ");
            sb.append(src);
            sb.append(" failed: ");
            sb.append(valueOf);
            Log.e("IMASDK", sb.toString());
            return;
        }
        C3945ds.m16991c(this.f16939b);
        this.f16939b.setImageBitmap(bitmap);
    }
}
