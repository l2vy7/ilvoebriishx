package androidx.mediarouter.media;

import androidx.mediarouter.media.C1003s;
import java.util.concurrent.Executor;

/* renamed from: androidx.mediarouter.media.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1026v implements Executor {

    /* renamed from: b */
    public final /* synthetic */ C1003s.C1008e.C1011c f4658b;

    public /* synthetic */ C1026v(C1003s.C1008e.C1011c cVar) {
        this.f4658b = cVar;
    }

    public final void execute(Runnable runnable) {
        this.f4658b.post(runnable);
    }
}
