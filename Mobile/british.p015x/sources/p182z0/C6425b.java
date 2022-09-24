package p182z0;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* renamed from: z0.b */
/* compiled from: MediaSessionManager */
public final class C6425b {

    /* renamed from: a */
    C6426c f26458a;

    public C6425b(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f26458a = new C6427d(str, i, i2);
        } else {
            this.f26458a = new C6428e(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6425b)) {
            return false;
        }
        return this.f26458a.equals(((C6425b) obj).f26458a);
    }

    public int hashCode() {
        return this.f26458a.hashCode();
    }

    public C6425b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f26458a = new C6427d(remoteUserInfo);
    }
}
