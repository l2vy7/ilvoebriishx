package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import p236n5.C10830a;

/* renamed from: com.google.firebase.iid.h */
final class C10432h extends C10830a {

    /* renamed from: a */
    private final /* synthetic */ C10430g f48874a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10432h(C10430g gVar, Looper looper) {
        super(looper);
        this.f48874a = gVar;
    }

    public final void handleMessage(Message message) {
        this.f48874a.m48051e(message);
    }
}
