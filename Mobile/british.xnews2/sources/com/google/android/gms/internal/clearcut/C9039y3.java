package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.y3 */
public final class C9039y3 extends AbstractList<String> implements C9009u1, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9009u1 f44801b;

    public C9039y3(C9009u1 u1Var) {
        this.f44801b = u1Var;
    }

    /* renamed from: B */
    public final List<?> mo37162B() {
        return this.f44801b.mo37162B();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f44801b.get(i);
    }

    public final Iterator<String> iterator() {
        return new C8851a4(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C9046z3(this, i);
    }

    public final int size() {
        return this.f44801b.size();
    }

    /* renamed from: t0 */
    public final C9009u1 mo37168t0() {
        return this;
    }

    /* renamed from: u0 */
    public final Object mo37169u0(int i) {
        return this.f44801b.mo37169u0(i);
    }
}
