package androidx.mediarouter.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import androidx.mediarouter.media.C1029y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.mediarouter.media.z */
/* compiled from: MediaRouterJellybeanMr1 */
final class C1038z {

    /* renamed from: androidx.mediarouter.media.z$a */
    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class C1039a implements Runnable {

        /* renamed from: b */
        private final DisplayManager f4664b;

        /* renamed from: c */
        private final Handler f4665c;

        /* renamed from: d */
        private Method f4666d;

        /* renamed from: e */
        private boolean f4667e;

        public C1039a(Context context, Handler handler) {
            if (Build.VERSION.SDK_INT == 17) {
                this.f4664b = (DisplayManager) context.getSystemService("display");
                this.f4665c = handler;
                try {
                    this.f4666d = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
                } catch (NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: a */
        public void mo4841a(int i) {
            if ((i & 2) != 0) {
                if (this.f4667e) {
                    return;
                }
                if (this.f4666d != null) {
                    this.f4667e = true;
                    this.f4665c.post(this);
                    return;
                }
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            } else if (this.f4667e) {
                this.f4667e = false;
                this.f4665c.removeCallbacks(this);
            }
        }

        public void run() {
            if (this.f4667e) {
                try {
                    this.f4666d.invoke(this.f4664b, new Object[0]);
                } catch (IllegalAccessException e) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e);
                } catch (InvocationTargetException e2) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e2);
                }
                this.f4665c.postDelayed(this, 15000);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.z$b */
    /* compiled from: MediaRouterJellybeanMr1 */
    public interface C1040b extends C1029y.C1030a {
        /* renamed from: f */
        void mo4567f(Object obj);
    }

    /* renamed from: androidx.mediarouter.media.z$c */
    /* compiled from: MediaRouterJellybeanMr1 */
    static class C1041c<T extends C1040b> extends C1029y.C1031b<T> {
        public C1041c(T t) {
            super(t);
        }

        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((C1040b) this.f4660a).mo4567f(routeInfo);
        }
    }

    /* renamed from: androidx.mediarouter.media.z$d */
    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class C1042d {

        /* renamed from: a */
        private Method f4668a;

        /* renamed from: b */
        private int f4669b;

        public C1042d() {
            if (Build.VERSION.SDK_INT == 17) {
                try {
                    this.f4669b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt((Object) null);
                    this.f4668a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: a */
        public boolean mo4844a(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            Method method = this.f4668a;
            if (method == null) {
                return false;
            }
            try {
                if (((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.f4669b) {
                    return true;
                }
                return false;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.z$e */
    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class C1043e {
        /* renamed from: a */
        public static Display m5349a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                return null;
            }
        }

        /* renamed from: b */
        public static boolean m5350b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    /* renamed from: a */
    public static Object m5345a(C1040b bVar) {
        return new C1041c(bVar);
    }
}
