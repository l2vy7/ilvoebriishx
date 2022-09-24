package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class e33 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ ub3 f31211a;

    public /* synthetic */ e33(ub3 ub3) {
        this.f31211a = ub3;
    }

    public final void onComplete(Task task) {
        ub3 ub3 = this.f31211a;
        if (task.isCanceled()) {
            ub3.cancel(false);
        } else if (task.isSuccessful()) {
            ub3.mo18663v(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                ub3.mo18664w(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
