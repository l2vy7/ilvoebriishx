package com.google.firebase.iid;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.iid.y */
final /* synthetic */ class C10452y implements Runnable {

    /* renamed from: b */
    private final FirebaseInstanceId f48922b;

    /* renamed from: c */
    private final String f48923c;

    /* renamed from: d */
    private final String f48924d;

    /* renamed from: e */
    private final TaskCompletionSource f48925e;

    /* renamed from: f */
    private final String f48926f;

    C10452y(FirebaseInstanceId firebaseInstanceId, String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        this.f48922b = firebaseInstanceId;
        this.f48923c = str;
        this.f48924d = str2;
        this.f48925e = taskCompletionSource;
        this.f48926f = str3;
    }

    public final void run() {
        this.f48922b.mo41861k(this.f48923c, this.f48924d, this.f48925e, this.f48926f);
    }
}
