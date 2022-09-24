package p132p5;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.internal.location.C9050b;
import javax.annotation.Nullable;

/* renamed from: p5.g */
public final class C5905g extends C10879m {

    /* renamed from: d */
    private final C9050b f24753d;

    public C5905g(Context context, Looper looper, C7206f.C7208b bVar, C7206f.C7209c cVar, String str, @Nullable C4601e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.f24753d = new C9050b(context, this.f49661c);
    }

    public final void disconnect() {
        synchronized (this.f24753d) {
            if (isConnected()) {
                try {
                    this.f24753d.mo37274b();
                    this.f24753d.mo37276d();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: f */
    public final Location mo22892f() throws RemoteException {
        return this.f24753d.mo37273a();
    }
}
