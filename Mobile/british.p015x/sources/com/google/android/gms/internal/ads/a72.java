package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class a72 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CopyOnWriteArraySet f29548b;

    /* renamed from: c */
    public final /* synthetic */ int f29549c;

    /* renamed from: d */
    public final /* synthetic */ b82 f29550d;

    public /* synthetic */ a72(CopyOnWriteArraySet copyOnWriteArraySet, int i, b82 b82) {
        this.f29548b = copyOnWriteArraySet;
        this.f29549c = i;
        this.f29550d = b82;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f29548b;
        int i = this.f29549c;
        b82 b82 = this.f29550d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((da2) it.next()).mo18229a(i, b82);
        }
    }
}
