package com.iab.omid.library.ironsrc.walking.p053a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.b */
public abstract class C4911b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4912a f21875a;

    /* renamed from: d */
    protected final C4913b f21876d;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$a */
    public interface C4912a {
        /* renamed from: a */
        void mo20394a(C4911b bVar);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$b */
    public interface C4913b {
        /* renamed from: a */
        void mo20395a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo20396b();
    }

    public C4911b(C4913b bVar) {
        this.f21876d = bVar;
    }

    /* renamed from: a */
    public void mo20390a(C4912a aVar) {
        this.f21875a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4912a aVar = this.f21875a;
        if (aVar != null) {
            aVar.mo20394a(this);
        }
    }

    /* renamed from: a */
    public void mo20392a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
