package androidx.mediarouter.media;

import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.media.y */
/* compiled from: MediaRouterJellybean */
final class C1029y {

    /* renamed from: androidx.mediarouter.media.y$a */
    /* compiled from: MediaRouterJellybean */
    public interface C1030a {
        /* renamed from: a */
        void mo4558a(Object obj);

        /* renamed from: b */
        void mo4559b(int i, Object obj);

        /* renamed from: d */
        void mo4560d(Object obj);

        /* renamed from: e */
        void mo4561e(int i, Object obj);

        /* renamed from: g */
        void mo4562g(Object obj, Object obj2);

        /* renamed from: h */
        void mo4563h(Object obj, Object obj2, int i);

        /* renamed from: i */
        void mo4564i(Object obj);

        /* renamed from: k */
        void mo4565k(Object obj);
    }

    /* renamed from: androidx.mediarouter.media.y$b */
    /* compiled from: MediaRouterJellybean */
    static class C1031b<T extends C1030a> extends MediaRouter.Callback {

        /* renamed from: a */
        protected final T f4660a;

        public C1031b(T t) {
            this.f4660a = t;
        }

        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f4660a.mo4564i(routeInfo);
        }

        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f4660a.mo4558a(routeInfo);
        }

        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
            this.f4660a.mo4563h(routeInfo, routeGroup, i);
        }

        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f4660a.mo4560d(routeInfo);
        }

        public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.f4660a.mo4561e(i, routeInfo);
        }

        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.f4660a.mo4562g(routeInfo, routeGroup);
        }

        public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.f4660a.mo4559b(i, routeInfo);
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f4660a.mo4565k(routeInfo);
        }
    }

    /* renamed from: androidx.mediarouter.media.y$c */
    /* compiled from: MediaRouterJellybean */
    public static final class C1032c {

        /* renamed from: a */
        private Method f4661a;

        public C1032c() {
            int i = Build.VERSION.SDK_INT;
            if (i < 16 || i > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f4661a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: a */
        public Object mo4837a(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            Method method = this.f4661a;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    /* renamed from: androidx.mediarouter.media.y$d */
    /* compiled from: MediaRouterJellybean */
    public static final class C1033d {
        /* renamed from: a */
        public static CharSequence m5323a(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        /* renamed from: b */
        public static int m5324b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        /* renamed from: c */
        public static int m5325c(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        /* renamed from: d */
        public static int m5326d(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        /* renamed from: e */
        public static Object m5327e(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        /* renamed from: f */
        public static int m5328f(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        /* renamed from: g */
        public static int m5329g(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        /* renamed from: h */
        public static int m5330h(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        /* renamed from: i */
        public static void m5331i(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i);
        }

        /* renamed from: j */
        public static void m5332j(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i);
        }

        /* renamed from: k */
        public static void m5333k(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }
    }

    /* renamed from: androidx.mediarouter.media.y$e */
    /* compiled from: MediaRouterJellybean */
    public static final class C1034e {

        /* renamed from: a */
        private Method f4662a;

        public C1034e() {
            int i = Build.VERSION.SDK_INT;
            if (i < 16 || i > 17) {
                throw new UnsupportedOperationException();
            }
            Class<MediaRouter> cls = MediaRouter.class;
            try {
                this.f4662a = cls.getMethod("selectRouteInt", new Class[]{Integer.TYPE, MediaRouter.RouteInfo.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: a */
        public void mo4838a(Object obj, int i, Object obj2) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                Method method = this.f4662a;
                if (method != null) {
                    try {
                        method.invoke(mediaRouter, new Object[]{Integer.valueOf(i), routeInfo});
                        return;
                    } catch (IllegalAccessException e) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e);
                    } catch (InvocationTargetException e2) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e2);
                    }
                } else {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            mediaRouter.selectRoute(i, routeInfo);
        }
    }

    /* renamed from: androidx.mediarouter.media.y$f */
    /* compiled from: MediaRouterJellybean */
    public static final class C1035f {
        /* renamed from: a */
        public static void m5335a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        /* renamed from: b */
        public static void m5336b(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i);
        }

        /* renamed from: c */
        public static void m5337c(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i);
        }

        /* renamed from: d */
        public static void m5338d(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setRemoteControlClient((RemoteControlClient) obj2);
        }

        /* renamed from: e */
        public static void m5339e(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i);
        }

        /* renamed from: f */
        public static void m5340f(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        /* renamed from: g */
        public static void m5341g(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i);
        }

        /* renamed from: h */
        public static void m5342h(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i);
        }
    }

    /* renamed from: androidx.mediarouter.media.y$g */
    /* compiled from: MediaRouterJellybean */
    public interface C1036g {
        /* renamed from: c */
        void mo4535c(Object obj, int i);

        /* renamed from: j */
        void mo4536j(Object obj, int i);
    }

    /* renamed from: androidx.mediarouter.media.y$h */
    /* compiled from: MediaRouterJellybean */
    static class C1037h<T extends C1036g> extends MediaRouter.VolumeCallback {

        /* renamed from: a */
        protected final T f4663a;

        public C1037h(T t) {
            this.f4663a = t;
        }

        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.f4663a.mo4536j(routeInfo, i);
        }

        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.f4663a.mo4535c(routeInfo, i);
        }
    }

    /* renamed from: a */
    public static void m5302a(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2);
    }

    /* renamed from: b */
    public static void m5303b(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* renamed from: c */
    public static Object m5304c(C1030a aVar) {
        return new C1031b(aVar);
    }

    /* renamed from: d */
    public static Object m5305d(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    /* renamed from: e */
    public static Object m5306e(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    /* renamed from: f */
    public static Object m5307f(C1036g gVar) {
        return new C1037h(gVar);
    }

    /* renamed from: g */
    public static Object m5308g(Context context) {
        return context.getSystemService("media_router");
    }

    /* renamed from: h */
    public static List m5309h(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public static Object m5310i(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    /* renamed from: j */
    public static void m5311j(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    /* renamed from: k */
    public static void m5312k(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* renamed from: l */
    public static void m5313l(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (MediaRouter.RouteInfo) obj2);
    }
}
