package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public class zzl implements Parcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C10451x();

    /* renamed from: b */
    private Messenger f48937b;

    /* renamed from: c */
    private C10431g0 f48938c;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C10454a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.m48002x()) {
                return zzl.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f48937b = new Messenger(iBinder);
        } else {
            this.f48938c = new C10433h0(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m48127a() {
        Messenger messenger = this.f48937b;
        return messenger != null ? messenger.getBinder() : this.f48938c.asBinder();
    }

    /* renamed from: b */
    public final void mo41922b(Message message) throws RemoteException {
        Messenger messenger = this.f48937b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f48938c.mo41882h1(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m48127a().equals(((zzl) obj).m48127a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m48127a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f48937b;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f48938c.asBinder());
        }
    }
}
