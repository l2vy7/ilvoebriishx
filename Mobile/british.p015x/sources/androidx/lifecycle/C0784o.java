package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0769d;

/* renamed from: androidx.lifecycle.o */
/* compiled from: ReportFragment */
public class C0784o extends Fragment {

    /* renamed from: b */
    private C0785a f3854b;

    /* renamed from: androidx.lifecycle.o$a */
    /* compiled from: ReportFragment */
    interface C0785a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.o$b */
    /* compiled from: ReportFragment */
    static class C0786b implements Application.ActivityLifecycleCallbacks {
        C0786b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0786b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0784o.m4303a(activity, C0769d.C0771b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0784o.m4303a(activity, C0769d.C0771b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0784o.m4303a(activity, C0769d.C0771b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0784o.m4303a(activity, C0769d.C0771b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0784o.m4303a(activity, C0769d.C0771b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0784o.m4303a(activity, C0769d.C0771b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4303a(Activity activity, C0769d.C0771b bVar) {
        if (activity instanceof C0778i) {
            ((C0778i) activity).mo639a().mo3989h(bVar);
        } else if (activity instanceof C0775g) {
            C0769d a = ((C0775g) activity).mo639a();
            if (a instanceof C0776h) {
                ((C0776h) a).mo3989h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m4304b(C0769d.C0771b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4303a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m4305c(C0785a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: d */
    private void m4306d(C0785a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: e */
    private void m4307e(C0785a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    public static void m4308f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0786b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0784o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4305c(this.f3854b);
        m4304b(C0769d.C0771b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m4304b(C0769d.C0771b.ON_DESTROY);
        this.f3854b = null;
    }

    public void onPause() {
        super.onPause();
        m4304b(C0769d.C0771b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m4306d(this.f3854b);
        m4304b(C0769d.C0771b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m4307e(this.f3854b);
        m4304b(C0769d.C0771b.ON_START);
    }

    public void onStop() {
        super.onStop();
        m4304b(C0769d.C0771b.ON_STOP);
    }
}
