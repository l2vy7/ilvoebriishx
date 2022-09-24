package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.p5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9596p5 extends AbstractList<String> implements C9570m3, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9570m3 f45825b;

    public C9596p5(C9570m3 m3Var) {
        this.f45825b = m3Var;
    }

    /* renamed from: R */
    public final C9570m3 mo38501R() {
        return this;
    }

    /* renamed from: Y */
    public final List<?> mo38502Y() {
        return this.f45825b.mo38502Y();
    }

    /* renamed from: b0 */
    public final Object mo38503b0(int i) {
        return this.f45825b.mo38503b0(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f45825b.get(i);
    }

    public final Iterator<String> iterator() {
        return new C9621s5(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C9629t5(this, i);
    }

    public final int size() {
        return this.f45825b.size();
    }
}
