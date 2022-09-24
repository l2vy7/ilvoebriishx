package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1366a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1366a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3151a = (IconCompat) aVar.mo6582v(remoteActionCompat.f3151a, 1);
        remoteActionCompat.f3152b = aVar.mo6572l(remoteActionCompat.f3152b, 2);
        remoteActionCompat.f3153c = aVar.mo6572l(remoteActionCompat.f3153c, 3);
        remoteActionCompat.f3154d = (PendingIntent) aVar.mo6578r(remoteActionCompat.f3154d, 4);
        remoteActionCompat.f3155e = aVar.mo6568h(remoteActionCompat.f3155e, 5);
        remoteActionCompat.f3156f = aVar.mo6568h(remoteActionCompat.f3156f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1366a aVar) {
        aVar.mo6584x(false, false);
        aVar.mo6563M(remoteActionCompat.f3151a, 1);
        aVar.mo6554D(remoteActionCompat.f3152b, 2);
        aVar.mo6554D(remoteActionCompat.f3153c, 3);
        aVar.mo6558H(remoteActionCompat.f3154d, 4);
        aVar.mo6586z(remoteActionCompat.f3155e, 5);
        aVar.mo6586z(remoteActionCompat.f3156f, 6);
    }
}
