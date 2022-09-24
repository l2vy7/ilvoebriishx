package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class es0 implements Iterable<ds0> {

    /* renamed from: b */
    private final List<ds0> f31490b = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ds0 mo31657a(mq0 mq0) {
        Iterator<ds0> it = iterator();
        while (it.hasNext()) {
            ds0 next = it.next();
            if (next.f30991c == mq0) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo31658b(ds0 ds0) {
        this.f31490b.add(ds0);
    }

    /* renamed from: c */
    public final void mo31659c(ds0 ds0) {
        this.f31490b.remove(ds0);
    }

    /* renamed from: e */
    public final boolean mo31660e(mq0 mq0) {
        ArrayList<ds0> arrayList = new ArrayList<>();
        Iterator<ds0> it = iterator();
        while (it.hasNext()) {
            ds0 next = it.next();
            if (next.f30991c == mq0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (ds0 ds0 : arrayList) {
            ds0.f30992d.mo18556g();
        }
        return true;
    }

    public final Iterator<ds0> iterator() {
        return this.f31490b.iterator();
    }
}
