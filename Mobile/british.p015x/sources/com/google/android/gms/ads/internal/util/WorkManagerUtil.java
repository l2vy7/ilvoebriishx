package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.C1419b;
import androidx.work.C1423c;
import androidx.work.C1427e;
import androidx.work.C1485n;
import androidx.work.C1486o;
import androidx.work.C1503x;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.co0;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class WorkManagerUtil extends zzbu {
    /* renamed from: n6 */
    private static void m28798n6(Context context) {
        try {
            C1503x.m7803l(context.getApplicationContext(), new C1419b.C1421b().mo6867a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(@RecentlyNonNull C10487a aVar) {
        Context context = (Context) C10489b.m48194f3(aVar);
        m28798n6(context);
        try {
            C1503x j = C1503x.m7802j(context);
            j.mo7041c("offline_ping_sender_work");
            j.mo7043e((C1486o) ((C1486o.C1487a) ((C1486o.C1487a) new C1486o.C1487a(OfflinePingSender.class).mo7054e(new C1423c.C1424a().mo6889b(C1485n.CONNECTED).mo6888a())).mo7052a("offline_ping_sender_work")).mo7053b());
        } catch (IllegalStateException e) {
            co0.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzf(@RecentlyNonNull C10487a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) C10489b.m48194f3(aVar);
        m28798n6(context);
        C1423c a = new C1423c.C1424a().mo6889b(C1485n.CONNECTED).mo6888a();
        try {
            C1503x.m7802j(context).mo7043e((C1486o) ((C1486o.C1487a) ((C1486o.C1487a) ((C1486o.C1487a) new C1486o.C1487a(OfflineNotificationPoster.class).mo7054e(a)).mo7056g(new C1427e.C1428a().mo6911f("uri", str).mo6911f("gws_query_id", str2).mo6906a())).mo7052a("offline_notification_work")).mo7053b());
            return true;
        } catch (IllegalStateException e) {
            co0.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
