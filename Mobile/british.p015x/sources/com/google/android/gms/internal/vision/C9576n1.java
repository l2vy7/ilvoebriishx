package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.n1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9576n1 extends C9592p1 {

    /* renamed from: b */
    private int f45743b = 0;

    /* renamed from: c */
    private final int f45744c;

    /* renamed from: d */
    private final /* synthetic */ C9552k1 f45745d;

    C9576n1(C9552k1 k1Var) {
        this.f45745d = k1Var;
        this.f45744c = k1Var.size();
    }

    /* renamed from: d */
    public final byte mo38506d() {
        int i = this.f45743b;
        if (i < this.f45744c) {
            this.f45743b = i + 1;
            return this.f45745d.mo38459h(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f45743b < this.f45744c;
    }
}
