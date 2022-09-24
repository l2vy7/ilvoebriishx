package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.iid.d0 */
final /* synthetic */ class C10425d0 implements Runnable {

    /* renamed from: b */
    private final C10423c0 f48860b;

    /* renamed from: c */
    private final Bundle f48861c;

    /* renamed from: d */
    private final TaskCompletionSource f48862d;

    C10425d0(C10423c0 c0Var, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.f48860b = c0Var;
        this.f48861c = bundle;
        this.f48862d = taskCompletionSource;
    }

    public final void run() {
        this.f48860b.mo41876j(this.f48861c, this.f48862d);
    }
}
