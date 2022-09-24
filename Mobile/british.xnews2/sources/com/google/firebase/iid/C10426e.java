package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.iid.e */
final /* synthetic */ class C10426e implements Continuation {

    /* renamed from: a */
    private final C10424d f48863a;

    /* renamed from: b */
    private final Pair f48864b;

    C10426e(C10424d dVar, Pair pair) {
        this.f48863a = dVar;
        this.f48864b = pair;
    }

    public final Object then(Task task) {
        return this.f48863a.mo41877a(this.f48864b, task);
    }
}
