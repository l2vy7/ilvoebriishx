package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import p015c.C2614a;

public abstract class NotificationCompatSideChannelService extends Service {

    /* renamed from: androidx.core.app.NotificationCompatSideChannelService$a */
    private class C0596a extends C2614a.C2615a {
        C0596a() {
        }

        /* renamed from: L5 */
        public void mo3096L5(String str, int i, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3093c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3094d(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: V3 */
        public void mo3097V3(String str, int i, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3093c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3091a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: Y1 */
        public void mo3098Y1(String str) {
            NotificationCompatSideChannelService.this.mo3093c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3092b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3091a(String str, int i, String str2);

    /* renamed from: b */
    public abstract void mo3092b(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3093c(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    /* renamed from: d */
    public abstract void mo3094d(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL") || Build.VERSION.SDK_INT > 19) {
            return null;
        }
        return new C0596a();
    }
}
