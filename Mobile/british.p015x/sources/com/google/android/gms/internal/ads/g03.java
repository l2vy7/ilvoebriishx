package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class g03 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ C8040p7 f32088a;

    /* renamed from: b */
    public final /* synthetic */ int f32089b;

    public /* synthetic */ g03(C8040p7 p7Var, int i) {
        this.f32088a = p7Var;
        this.f32089b = i;
    }

    public final Object then(Task task) {
        C8040p7 p7Var = this.f32088a;
        int i = this.f32089b;
        int i2 = k03.f34093f;
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        i23 a = ((j23) task.getResult()).mo32819a(((C8181t7) p7Var.mo32424p()).mo33365g());
        a.mo32529a(i);
        a.mo32531c();
        return Boolean.TRUE;
    }
}
