package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p244q4.C10942l;
import p244q4.C10946p;

/* renamed from: com.google.android.gms.cast.framework.media.b0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
abstract class C7107b0 extends BasePendingResult<C4580e.C4583c> {

    /* renamed from: r */
    private C10946p f28684r;

    /* renamed from: s */
    private final boolean f28685s;

    /* renamed from: t */
    final /* synthetic */ C4580e f28686t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7107b0(C4580e eVar, boolean z) {
        super((C7206f) null);
        this.f28686t = eVar;
        this.f28685s = z;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C7341k mo29539e(Status status) {
        return new C7103a0(this, status);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract void mo29540q() throws C10942l;

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final C10946p mo29541r() {
        if (this.f28684r == null) {
            this.f28684r = new C7164z(this);
        }
        return this.f28684r;
    }

    /* renamed from: s */
    public final void mo29542s() {
        if (!this.f28685s) {
            for (C4580e.C4582b e : this.f28686t.f19931g) {
                e.mo9081e();
            }
            for (C4580e.C4581a f : this.f28686t.f19932h) {
                f.mo17867f();
            }
        }
        try {
            synchronized (this.f28686t.f19925a) {
                mo29540q();
            }
        } catch (C10942l unused) {
            mo29791i(new C7103a0(this, new Status(2100)));
        }
    }
}
