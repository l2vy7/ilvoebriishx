package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.C3481f0;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.p */
/* compiled from: GraphRequestAsyncTask */
public class C3651p extends AsyncTask<Void, Void, List<C3655r>> {

    /* renamed from: d */
    private static final String f13558d = C3651p.class.getCanonicalName();

    /* renamed from: a */
    private final HttpURLConnection f13559a;

    /* renamed from: b */
    private final C3652q f13560b;

    /* renamed from: c */
    private Exception f13561c;

    public C3651p(C3652q qVar) {
        this((HttpURLConnection) null, qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C3655r> doInBackground(Void... voidArr) {
        try {
            HttpURLConnection httpURLConnection = this.f13559a;
            if (httpURLConnection == null) {
                return this.f13560b.mo12363e();
            }
            return GraphRequest.m11282p(httpURLConnection, this.f13560b);
        } catch (Exception e) {
            this.f13561c = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(List<C3655r> list) {
        super.onPostExecute(list);
        Exception exc = this.f13561c;
        if (exc != null) {
            C3481f0.m11609T(f13558d, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (C3642m.m12294t()) {
            C3481f0.m11609T(f13558d, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.f13560b.mo12373t() == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f13560b.mo12356D(handler);
        }
    }

    public String toString() {
        return "{RequestAsyncTask: " + " connection: " + this.f13559a + ", requests: " + this.f13560b + "}";
    }

    public C3651p(HttpURLConnection httpURLConnection, C3652q qVar) {
        this.f13560b = qVar;
        this.f13559a = httpURLConnection;
    }
}
