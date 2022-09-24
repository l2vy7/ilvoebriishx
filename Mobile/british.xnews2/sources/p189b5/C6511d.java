package p189b5;

import android.os.Process;

/* renamed from: b5.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C6511d implements Runnable {

    /* renamed from: b */
    private final Runnable f26589b;

    public C6511d(Runnable runnable, int i) {
        this.f26589b = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f26589b.run();
    }
}
