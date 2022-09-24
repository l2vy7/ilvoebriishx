package com.iab.omid.library.adcolony.walking.p046a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.b */
public abstract class C4861b extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    protected final C4863b f21761d;

    /* renamed from: e */
    private C4862a f21762e;

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$a */
    public interface C4862a {
        /* renamed from: a */
        void mo20208a(C4861b bVar);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$b */
    public interface C4863b {
        /* renamed from: a */
        void mo20209a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo20210b();
    }

    public C4861b(C4863b bVar) {
        this.f21761d = bVar;
    }

    /* renamed from: a */
    public void mo20204a(C4862a aVar) {
        this.f21762e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4862a aVar = this.f21762e;
        if (aVar != null) {
            aVar.mo20208a(this);
        }
    }

    /* renamed from: a */
    public void mo20206a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
