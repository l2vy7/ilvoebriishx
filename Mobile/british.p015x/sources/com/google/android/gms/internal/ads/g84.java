package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g84 {

    /* renamed from: a */
    private final CopyOnWriteArrayList<f84> f32188a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void mo32029a(Handler handler, h84 h84) {
        mo32031c(h84);
        this.f32188a.add(new f84(handler, h84));
    }

    /* renamed from: b */
    public final void mo32030b(int i, long j, long j2) {
        Iterator<f84> it = this.f32188a.iterator();
        while (it.hasNext()) {
            f84 next = it.next();
            if (!next.f31672c) {
                next.f31670a.post(new e84(next, i, j, j2));
            }
        }
    }

    /* renamed from: c */
    public final void mo32031c(h84 h84) {
        Iterator<f84> it = this.f32188a.iterator();
        while (it.hasNext()) {
            f84 next = it.next();
            if (next.f31671b == h84) {
                next.mo31782c();
                this.f32188a.remove(next);
            }
        }
    }
}
