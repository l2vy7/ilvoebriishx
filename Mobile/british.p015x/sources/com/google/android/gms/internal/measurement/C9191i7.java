package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9191i7 extends C9236l7 {

    /* renamed from: b */
    private int f45084b = 0;

    /* renamed from: c */
    private final int f45085c;

    /* renamed from: d */
    final /* synthetic */ C9329r7 f45086d;

    C9191i7(C9329r7 r7Var) {
        this.f45086d = r7Var;
        this.f45085c = r7Var.mo37731c();
    }

    public final boolean hasNext() {
        return this.f45084b < this.f45085c;
    }

    public final byte zza() {
        int i = this.f45084b;
        if (i < this.f45085c) {
            this.f45084b = i + 1;
            return this.f45086d.mo37730b(i);
        }
        throw new NoSuchElementException();
    }
}
