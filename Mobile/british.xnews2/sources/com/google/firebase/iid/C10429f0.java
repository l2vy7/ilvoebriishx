package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.f0 */
final class C10429f0 implements Continuation<Bundle, String> {

    /* renamed from: a */
    private final /* synthetic */ C10423c0 f48865a;

    C10429f0(C10423c0 c0Var) {
        this.f48865a = c0Var;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        return C10423c0.m48034h((Bundle) task.getResult(IOException.class));
    }
}
