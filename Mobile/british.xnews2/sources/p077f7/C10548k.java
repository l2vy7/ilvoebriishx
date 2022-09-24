package p077f7;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzl;

/* renamed from: f7.k */
final class C10548k {

    /* renamed from: a */
    private final Messenger f49095a;

    /* renamed from: b */
    private final zzl f49096b;

    C10548k(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f49095a = new Messenger(iBinder);
            this.f49096b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f49096b = new zzl(iBinder);
            this.f49095a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42671a(Message message) throws RemoteException {
        Messenger messenger = this.f49095a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzl zzl = this.f49096b;
        if (zzl != null) {
            zzl.mo41922b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
