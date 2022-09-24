package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.vision.c5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9487c5 extends C9539i5 {

    /* renamed from: c */
    private final /* synthetic */ C9675x4 f45605c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C9487c5(C9675x4 x4Var) {
        super(x4Var, (C9467a5) null);
        this.f45605c = x4Var;
    }

    public final Iterator iterator() {
        return new C9691z4(this.f45605c, (C9467a5) null);
    }

    /* synthetic */ C9487c5(C9675x4 x4Var, C9467a5 a5Var) {
        this(x4Var);
    }
}
