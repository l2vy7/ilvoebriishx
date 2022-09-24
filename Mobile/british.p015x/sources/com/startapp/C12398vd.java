package com.startapp;

import android.os.AsyncTask;

/* renamed from: com.startapp.vd */
/* compiled from: Sta */
public abstract class C12398vd extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    public C12399a f54936a;

    /* renamed from: b */
    public final C12400b f54937b;

    /* renamed from: com.startapp.vd$a */
    /* compiled from: Sta */
    public interface C12399a {
    }

    /* renamed from: com.startapp.vd$b */
    /* compiled from: Sta */
    public interface C12400b {
    }

    public C12398vd(C12400b bVar) {
        this.f54937b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        C12399a aVar = this.f54936a;
        if (aVar != null) {
            C11809be beVar = (C11809be) aVar;
            beVar.f52636c = null;
            C12398vd poll = beVar.f52635b.poll();
            beVar.f52636c = poll;
            if (poll != null) {
                poll.executeOnExecutor(beVar.f52634a, new Object[0]);
            }
        }
    }
}
