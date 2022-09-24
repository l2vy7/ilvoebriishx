package com.ironsource.sdk.p299k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.environment.C4952a;
import com.ironsource.sdk.p294g.C11709e;
import com.ironsource.sdk.p295h.C11715c;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.k.a */
public final class C11731a extends Handler {

    /* renamed from: a */
    public C11736c f52439a;

    public final void handleMessage(Message message) {
        C11736c cVar = this.f52439a;
        if (cVar == null) {
            Logger.m51953i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i != 1016) {
                this.f52439a.mo44760a((C11715c) message.obj, new C11709e(i, C4952a.C49531.m22715a(i)));
                return;
            }
            cVar.mo44759a((C11715c) message.obj);
        } catch (Throwable th) {
            Logger.m51953i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
