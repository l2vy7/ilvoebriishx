package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f24 {

    /* renamed from: a */
    public final int f31593a;

    /* renamed from: b */
    public final c54 f31594b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<e24> f31595c;

    public f24() {
        this(new CopyOnWriteArrayList(), 0, (c54) null);
    }

    private f24(CopyOnWriteArrayList<e24> copyOnWriteArrayList, int i, c54 c54) {
        this.f31595c = copyOnWriteArrayList;
        this.f31593a = i;
        this.f31594b = c54;
    }

    /* renamed from: a */
    public final f24 mo31714a(int i, c54 c54) {
        return new f24(this.f31595c, i, c54);
    }

    /* renamed from: b */
    public final void mo31715b(Handler handler, g24 g24) {
        this.f31595c.add(new e24(handler, g24));
    }

    /* renamed from: c */
    public final void mo31716c(g24 g24) {
        Iterator<e24> it = this.f31595c.iterator();
        while (it.hasNext()) {
            e24 next = it.next();
            if (next.f31180b == g24) {
                this.f31595c.remove(next);
            }
        }
    }
}
