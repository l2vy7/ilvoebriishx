package com.ironsource.p054b;

import android.os.AsyncTask;
import android.util.Pair;
import com.ironsource.p055c.C4947b;
import java.util.ArrayList;

/* renamed from: com.ironsource.b.b */
public final class C4944b extends AsyncTask<Object, Void, Boolean> {

    /* renamed from: a */
    private ArrayList f21956a;

    /* renamed from: b */
    private C4945c f21957b;

    public C4944b() {
    }

    public C4944b(C4945c cVar) {
        this.f21957b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Boolean doInBackground(Object... objArr) {
        try {
            this.f21956a = objArr[2];
            boolean z = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair(RtspHeaders.CONTENT_TYPE, "application/json"));
            int i = C4947b.m22703a(objArr[1], objArr[0], arrayList).f21974a;
            if (i != 200) {
                if (i != 204) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        C4945c cVar = this.f21957b;
        if (cVar != null) {
            cVar.mo20541a(this.f21956a, bool.booleanValue());
        }
    }
}
