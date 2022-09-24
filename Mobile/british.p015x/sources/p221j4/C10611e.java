package p221j4;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.internal.C7296q;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p172x0.C6336a;

/* renamed from: j4.e */
public final class C10611e extends C6336a<Void> implements C7296q {

    /* renamed from: p */
    private Semaphore f49168p = new Semaphore(0);

    /* renamed from: q */
    private Set<C7206f> f49169q;

    public C10611e(Context context, Set<C7206f> set) {
        super(context);
        this.f49169q = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final Void mo24121G() {
        int i = 0;
        for (C7206f m : this.f49169q) {
            if (m.mo29773m(this)) {
                i++;
            }
        }
        try {
            this.f49168p.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo29918a() {
        this.f49168p.release();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo24137s() {
        this.f49168p.drainPermits();
        mo24145i();
    }
}
