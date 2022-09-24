package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.cache.C5065h;
import java.util.Iterator;

/* renamed from: com.startapp.sdk.adsbase.cache.e */
/* compiled from: Sta */
public class C12269e implements C5065h.C5067b {

    /* renamed from: a */
    public final /* synthetic */ C5059d f54544a;

    public C12269e(C5059d dVar) {
        this.f54544a = dVar;
    }

    /* renamed from: a */
    public void mo46174a(C5065h hVar) {
        synchronized (this.f54544a.f22347a) {
            Iterator<C5065h> it = this.f54544a.f22347a.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == hVar) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
