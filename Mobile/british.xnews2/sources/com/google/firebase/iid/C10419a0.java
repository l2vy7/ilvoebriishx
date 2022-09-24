package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.iid.a0 */
final /* synthetic */ class C10419a0 implements OnCompleteListener {

    /* renamed from: a */
    private final FirebaseInstanceId f48846a;

    /* renamed from: b */
    private final String f48847b;

    /* renamed from: c */
    private final String f48848c;

    /* renamed from: d */
    private final TaskCompletionSource f48849d;

    /* renamed from: e */
    private final String f48850e;

    C10419a0(FirebaseInstanceId firebaseInstanceId, String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        this.f48846a = firebaseInstanceId;
        this.f48847b = str;
        this.f48848c = str2;
        this.f48849d = taskCompletionSource;
        this.f48850e = str3;
    }

    public final void onComplete(Task task) {
        this.f48846a.mo41862l(this.f48847b, this.f48848c, this.f48849d, this.f48850e, task);
    }
}
