package androidx.mediarouter.media;

import android.media.MediaRouter;

/* renamed from: androidx.mediarouter.media.a0 */
/* compiled from: MediaRouterJellybeanMr2 */
final class C0924a0 {

    /* renamed from: androidx.mediarouter.media.a0$a */
    /* compiled from: MediaRouterJellybeanMr2 */
    public static final class C0925a {
        /* renamed from: a */
        public static CharSequence m4774a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        /* renamed from: b */
        public static boolean m4775b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    /* renamed from: androidx.mediarouter.media.a0$b */
    /* compiled from: MediaRouterJellybeanMr2 */
    public static final class C0926b {
        /* renamed from: a */
        public static void m4776a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static void m4772a(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }

    /* renamed from: b */
    public static Object m4773b(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
