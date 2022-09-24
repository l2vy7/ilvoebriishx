package com.google.firebase.iid;

import com.google.firebase.iid.FirebaseInstanceId;
import p201d7.C10504a;
import p201d7.C10505b;

/* renamed from: com.google.firebase.iid.b0 */
final /* synthetic */ class C10421b0 implements C10505b {

    /* renamed from: a */
    private final FirebaseInstanceId.C10416a f48852a;

    C10421b0(FirebaseInstanceId.C10416a aVar) {
        this.f48852a = aVar;
    }

    /* renamed from: a */
    public final void mo41875a(C10504a aVar) {
        FirebaseInstanceId.C10416a aVar2 = this.f48852a;
        synchronized (aVar2) {
            if (aVar2.mo41871a()) {
                FirebaseInstanceId.this.m48000s();
            }
        }
    }
}
