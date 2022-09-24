package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.z4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9691z4 implements Iterator {

    /* renamed from: b */
    private int f46023b;

    /* renamed from: c */
    private Iterator f46024c;

    /* renamed from: d */
    private final /* synthetic */ C9675x4 f46025d;

    private C9691z4(C9675x4 x4Var) {
        this.f46025d = x4Var;
        this.f46023b = x4Var.f45988c.size();
    }

    /* renamed from: a */
    private final Iterator m44920a() {
        if (this.f46024c == null) {
            this.f46024c = this.f46025d.f45992g.entrySet().iterator();
        }
        return this.f46024c;
    }

    public final boolean hasNext() {
        int i = this.f46023b;
        return (i > 0 && i <= this.f46025d.f45988c.size()) || m44920a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m44920a().hasNext()) {
            return (Map.Entry) m44920a().next();
        }
        List g = this.f46025d.f45988c;
        int i = this.f46023b - 1;
        this.f46023b = i;
        return (Map.Entry) g.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C9691z4(C9675x4 x4Var, C9467a5 a5Var) {
        this(x4Var);
    }
}
