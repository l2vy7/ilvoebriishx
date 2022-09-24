package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ListIterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asl */
/* compiled from: IMASDK */
final class asl extends asj implements ListIterator {

    /* renamed from: d */
    final /* synthetic */ asm f15659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    asl(asm asm) {
        super(asm);
        this.f15659d = asm;
    }

    /* renamed from: b */
    private final ListIterator m14672b() {
        mo14333a();
        return (ListIterator) this.f15651a;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f15659d.isEmpty();
        m14672b().add(obj);
        asn.m14676q(this.f15659d.f15660f);
        if (isEmpty) {
            this.f15659d.mo14341c();
        }
    }

    public final boolean hasPrevious() {
        return m14672b().hasPrevious();
    }

    public final int nextIndex() {
        return m14672b().nextIndex();
    }

    public final Object previous() {
        return m14672b().previous();
    }

    public final int previousIndex() {
        return m14672b().previousIndex();
    }

    public final void set(Object obj) {
        m14672b().set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asl(asm asm, int i) {
        super(asm, asm.mo14361d().listIterator(i));
        this.f15659d = asm;
    }
}
