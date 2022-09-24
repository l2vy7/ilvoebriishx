package p097j3;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p071e3.C5235d;
import p071e3.C5237f;

/* renamed from: j3.e */
/* compiled from: ViewObserver */
final class C5516e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    private static final String f23942e = C5516e.class.getCanonicalName();

    /* renamed from: f */
    private static final Map<Integer, C5516e> f23943f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Activity> f23944b;

    /* renamed from: c */
    private final Handler f23945c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private AtomicBoolean f23946d = new AtomicBoolean(false);

    /* renamed from: j3.e$a */
    /* compiled from: ViewObserver */
    class C5517a implements Runnable {
        C5517a() {
        }

        public void run() {
            try {
                View a = C5516e.this.m24596c();
                Activity activity = (Activity) C5516e.this.f23944b.get();
                if (a == null) {
                    return;
                }
                if (activity != null) {
                    for (View next : C5514c.m24586a(a)) {
                        if (!C5235d.m23729g(next)) {
                            String j = C5237f.m23742j(next);
                            if (!j.isEmpty() && j.length() <= 300) {
                                C5518f.m24604c(next, a, activity.getLocalClassName());
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private C5516e(Activity activity) {
        this.f23944b = new WeakReference<>(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public View m24596c() {
        Window window;
        Activity activity = (Activity) this.f23944b.get();
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootView();
    }

    /* renamed from: d */
    private void m24597d() {
        C5517a aVar = new C5517a();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            this.f23945c.post(aVar);
        }
    }

    /* renamed from: e */
    private void m24598e() {
        View c;
        if (!this.f23946d.getAndSet(true) && (c = m24596c()) != null) {
            ViewTreeObserver viewTreeObserver = c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                m24597d();
            }
        }
    }

    /* renamed from: f */
    static void m24599f(Activity activity) {
        int hashCode = activity.hashCode();
        Map<Integer, C5516e> map = f23943f;
        if (!map.containsKey(Integer.valueOf(hashCode))) {
            C5516e eVar = new C5516e(activity);
            map.put(Integer.valueOf(hashCode), eVar);
            eVar.m24598e();
        }
    }

    /* renamed from: g */
    private void m24600g() {
        View c;
        if (this.f23946d.getAndSet(false) && (c = m24596c()) != null) {
            ViewTreeObserver viewTreeObserver = c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                if (Build.VERSION.SDK_INT < 16) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                } else {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    /* renamed from: h */
    static void m24601h(Activity activity) {
        int hashCode = activity.hashCode();
        Map<Integer, C5516e> map = f23943f;
        if (map.containsKey(Integer.valueOf(hashCode))) {
            map.remove(Integer.valueOf(hashCode));
            map.get(Integer.valueOf(hashCode)).m24600g();
        }
    }

    public void onGlobalLayout() {
        m24597d();
    }
}
