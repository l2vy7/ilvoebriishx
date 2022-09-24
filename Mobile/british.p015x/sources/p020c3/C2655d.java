package p020c3;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import com.facebook.appevents.C3420m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p072e3.C5237f;

/* renamed from: c3.d */
/* compiled from: MetadataViewObserver */
final class C2655d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: f */
    private static final String f10460f = C2655d.class.getCanonicalName();

    /* renamed from: g */
    private static final Map<Integer, C2655d> f10461g = new HashMap();

    /* renamed from: b */
    private final Set<String> f10462b = new HashSet();

    /* renamed from: c */
    private final Handler f10463c;

    /* renamed from: d */
    private WeakReference<Activity> f10464d;

    /* renamed from: e */
    private AtomicBoolean f10465e;

    /* renamed from: c3.d$a */
    /* compiled from: MetadataViewObserver */
    class C2656a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f10466b;

        C2656a(View view) {
            this.f10466b = view;
        }

        public void run() {
            View view = this.f10466b;
            if (view instanceof EditText) {
                C2655d.this.m9305d(view);
            }
        }
    }

    private C2655d(Activity activity) {
        this.f10464d = new WeakReference<>(activity);
        this.f10463c = new Handler(Looper.getMainLooper());
        this.f10465e = new AtomicBoolean(false);
    }

    /* renamed from: b */
    private View m9303b() {
        Window window;
        Activity activity = (Activity) this.f10464d.get();
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootView();
    }

    /* renamed from: c */
    private void m9304c(View view) {
        m9306e(new C2656a(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m9305d(View view) {
        String trim = ((EditText) view).getText().toString().trim();
        if (!trim.isEmpty() && !this.f10462b.contains(trim) && trim.length() <= 100) {
            this.f10462b.add(trim);
            HashMap hashMap = new HashMap();
            List<String> list = null;
            ArrayList arrayList = null;
            for (C2654c next : C2654c.m9296d()) {
                if (C2653b.m9294e(trim, next.mo9333e())) {
                    if (list == null) {
                        list = C2653b.m9290a(view);
                    }
                    if (C2653b.m9293d(list, next.mo9331b())) {
                        hashMap.put(next.mo9332c(), trim);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            ViewGroup i = C5237f.m23741i(view);
                            if (i != null) {
                                for (View next2 : C5237f.m23734b(i)) {
                                    if (view != next2) {
                                        arrayList.addAll(C2653b.m9291b(next2));
                                    }
                                }
                            }
                        }
                        if (C2653b.m9293d(arrayList, next.mo9331b())) {
                            hashMap.put(next.mo9332c(), trim);
                        }
                    }
                }
            }
            C3420m.m11433m(hashMap);
        }
    }

    /* renamed from: e */
    private void m9306e(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f10463c.post(runnable);
        }
    }

    /* renamed from: f */
    private void m9307f() {
        View b;
        if (!this.f10465e.getAndSet(true) && (b = m9303b()) != null) {
            ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        }
    }

    /* renamed from: g */
    static void m9308g(Activity activity) {
        C2655d dVar;
        int hashCode = activity.hashCode();
        Map<Integer, C2655d> map = f10461g;
        if (!map.containsKey(Integer.valueOf(hashCode))) {
            dVar = new C2655d(activity);
            map.put(Integer.valueOf(activity.hashCode()), dVar);
        } else {
            dVar = map.get(Integer.valueOf(hashCode));
        }
        dVar.m9307f();
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (view != null) {
            m9304c(view);
        }
        if (view2 != null) {
            m9304c(view2);
        }
    }
}
