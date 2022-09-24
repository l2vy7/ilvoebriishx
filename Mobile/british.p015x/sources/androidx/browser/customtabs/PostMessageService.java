package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p000a.C0000a;
import p000a.C0006c;

public class PostMessageService extends Service {

    /* renamed from: b */
    private C0006c.C0007a f1755b = new C0439a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    class C0439a extends C0006c.C0007a {
        C0439a() {
        }

        /* renamed from: O0 */
        public void mo24O0(C0000a aVar, Bundle bundle) throws RemoteException {
            aVar.mo1E5(bundle);
        }

        /* renamed from: W1 */
        public void mo25W1(C0000a aVar, String str, Bundle bundle) throws RemoteException {
            aVar.mo6x5(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1755b;
    }
}
