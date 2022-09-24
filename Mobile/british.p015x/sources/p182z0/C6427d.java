package p182z0;

import android.media.session.MediaSessionManager;

/* renamed from: z0.d */
/* compiled from: MediaSessionManagerImplApi28 */
final class C6427d extends C6428e {

    /* renamed from: d */
    final MediaSessionManager.RemoteUserInfo f26459d;

    C6427d(String str, int i, int i2) {
        super(str, i, i2);
        this.f26459d = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    C6427d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f26459d = remoteUserInfo;
    }
}
