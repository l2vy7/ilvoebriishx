package p252t4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: t4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C11011a implements ServiceConnection {

    /* renamed from: b */
    boolean f49963b = false;

    /* renamed from: c */
    private final BlockingQueue<IBinder> f49964c = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo43303a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C4604n.m20097j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f49963b) {
            this.f49963b = true;
            IBinder poll = this.f49964c.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f49964c.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
