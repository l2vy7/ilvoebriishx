package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p227k7.C10655d;

/* renamed from: com.google.firebase.installations.d */
/* compiled from: GetIdListener */
class C10461d implements C10462e {

    /* renamed from: a */
    final TaskCompletionSource<String> f48963a;

    public C10461d(TaskCompletionSource<String> taskCompletionSource) {
        this.f48963a = taskCompletionSource;
    }

    /* renamed from: a */
    public boolean mo41934a(Exception exc) {
        return false;
    }

    /* renamed from: b */
    public boolean mo41935b(C10655d dVar) {
        if (!dVar.mo42786l() && !dVar.mo42785k() && !dVar.mo42783i()) {
            return false;
        }
        this.f48963a.trySetResult(dVar.mo42762d());
        return true;
    }
}
