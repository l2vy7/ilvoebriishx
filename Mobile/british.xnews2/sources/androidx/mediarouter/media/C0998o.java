package androidx.mediarouter.media;

import android.os.Messenger;

/* renamed from: androidx.mediarouter.media.o */
/* compiled from: MediaRouteProviderProtocol */
abstract class C0998o {
    /* renamed from: a */
    public static boolean m5116a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
