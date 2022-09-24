package p082g2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: g2.y */
/* compiled from: ResourceRecycler */
class C5326y {

    /* renamed from: a */
    private boolean f23509a;

    /* renamed from: b */
    private final Handler f23510b = new Handler(Looper.getMainLooper(), new C5327a());

    /* renamed from: g2.y$a */
    /* compiled from: ResourceRecycler */
    private static final class C5327a implements Handler.Callback {
        C5327a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C5323v) message.obj).mo21591a();
            return true;
        }
    }

    C5326y() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21623a(C5323v<?> vVar, boolean z) {
        if (!this.f23509a) {
            if (!z) {
                this.f23509a = true;
                vVar.mo21591a();
                this.f23509a = false;
            }
        }
        this.f23510b.obtainMessage(1, vVar).sendToTarget();
    }
}
