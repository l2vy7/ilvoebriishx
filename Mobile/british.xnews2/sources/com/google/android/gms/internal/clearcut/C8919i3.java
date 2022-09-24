package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.i3 */
final class C8919i3 extends C8969o3 {

    /* renamed from: c */
    private final /* synthetic */ C8898f3 f44560c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8919i3(C8898f3 f3Var) {
        super(f3Var, (C8905g3) null);
        this.f44560c = f3Var;
    }

    /* synthetic */ C8919i3(C8898f3 f3Var, C8905g3 g3Var) {
        this(f3Var);
    }

    public final Iterator iterator() {
        return new C8912h3(this.f44560c, (C8905g3) null);
    }
}
