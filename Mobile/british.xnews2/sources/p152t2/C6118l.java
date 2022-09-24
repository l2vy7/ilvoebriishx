package p152t2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C3319b;
import com.bumptech.glide.C3335j;
import java.util.HashMap;
import java.util.Map;
import p004a3.C0066k;
import p149t.C6077a;

/* renamed from: t2.l */
/* compiled from: RequestManagerRetriever */
public class C6118l implements Handler.Callback {

    /* renamed from: j */
    private static final C6120b f25361j = new C6119a();

    /* renamed from: b */
    private volatile C3335j f25362b;

    /* renamed from: c */
    final Map<FragmentManager, C6116k> f25363c = new HashMap();

    /* renamed from: d */
    final Map<androidx.fragment.app.FragmentManager, C6123o> f25364d = new HashMap();

    /* renamed from: e */
    private final Handler f25365e;

    /* renamed from: f */
    private final C6120b f25366f;

    /* renamed from: g */
    private final C6077a<View, Fragment> f25367g = new C6077a<>();

    /* renamed from: h */
    private final C6077a<View, android.app.Fragment> f25368h = new C6077a<>();

    /* renamed from: i */
    private final Bundle f25369i = new Bundle();

    /* renamed from: t2.l$a */
    /* compiled from: RequestManagerRetriever */
    class C6119a implements C6120b {
        C6119a() {
        }

        /* renamed from: a */
        public C3335j mo23452a(C3319b bVar, C6113h hVar, C6121m mVar, Context context) {
            return new C3335j(bVar, hVar, mVar, context);
        }
    }

    /* renamed from: t2.l$b */
    /* compiled from: RequestManagerRetriever */
    public interface C6120b {
        /* renamed from: a */
        C3335j mo23452a(C3319b bVar, C6113h hVar, C6121m mVar, Context context);
    }

    public C6118l(C6120b bVar) {
        this.f25366f = bVar == null ? f25361j : bVar;
        this.f25365e = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    private static void m26863a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static Activity m26864b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m26864b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    /* renamed from: c */
    private C3335j m26865c(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C6116k i = m26867i(fragmentManager, fragment, z);
        C3335j e = i.mo23435e();
        if (e != null) {
            return e;
        }
        C3335j a = this.f25366f.mo23452a(C3319b.m11097c(context), i.mo23434c(), i.mo23436f(), context);
        i.mo23438k(a);
        return a;
    }

    /* renamed from: g */
    private C3335j m26866g(Context context) {
        if (this.f25362b == null) {
            synchronized (this) {
                if (this.f25362b == null) {
                    this.f25362b = this.f25366f.mo23452a(C3319b.m11097c(context.getApplicationContext()), new C6105b(), new C6112g(), context.getApplicationContext());
                }
            }
        }
        return this.f25362b;
    }

    /* renamed from: i */
    private C6116k m26867i(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C6116k kVar = (C6116k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f25363c.get(fragmentManager)) == null) {
            kVar = new C6116k();
            kVar.mo23437j(fragment);
            if (z) {
                kVar.mo23434c().mo23427d();
            }
            this.f25363c.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f25365e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    /* renamed from: k */
    private C6123o m26868k(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C6123o oVar = (C6123o) fragmentManager.mo3592j0("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f25364d.get(fragmentManager)) == null) {
            oVar = new C6123o();
            oVar.mo23465X1(fragment);
            if (z) {
                oVar.mo23462P1().mo23427d();
            }
            this.f25364d.put(fragmentManager, oVar);
            fragmentManager.mo3598m().mo3852d(oVar, "com.bumptech.glide.manager").mo3673h();
            this.f25365e.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    /* renamed from: l */
    private static boolean m26869l(Context context) {
        Activity b = m26864b(context);
        return b == null || !b.isFinishing();
    }

    /* renamed from: m */
    private C3335j m26870m(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C6123o k = m26868k(fragmentManager, fragment, z);
        C3335j R1 = k.mo23463R1();
        if (R1 != null) {
            return R1;
        }
        C3335j a = this.f25366f.mo23452a(C3319b.m11097c(context), k.mo23462P1(), k.mo23464S1(), context);
        k.mo23466Y1(a);
        return a;
    }

    /* renamed from: d */
    public C3335j mo23446d(Activity activity) {
        if (C0066k.m264p()) {
            return mo23447e(activity.getApplicationContext());
        }
        m26863a(activity);
        return m26865c(activity, activity.getFragmentManager(), (android.app.Fragment) null, m26869l(activity));
    }

    /* renamed from: e */
    public C3335j mo23447e(Context context) {
        if (context != null) {
            if (C0066k.m265q() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo23448f((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo23446d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo23447e(contextWrapper.getBaseContext());
                    }
                }
            }
            return m26866g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: f */
    public C3335j mo23448f(FragmentActivity fragmentActivity) {
        if (C0066k.m264p()) {
            return mo23447e(fragmentActivity.getApplicationContext());
        }
        m26863a(fragmentActivity);
        return m26870m(fragmentActivity, fragmentActivity.mo3505r(), (Fragment) null, m26869l(fragmentActivity));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: h */
    public C6116k mo23449h(Activity activity) {
        return m26867i(activity.getFragmentManager(), (android.app.Fragment) null, m26869l(activity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f25363c.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj3 = (androidx.fragment.app.FragmentManager) message.obj;
            obj2 = this.f25364d.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C6123o mo23451j(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m26868k(fragmentManager, (Fragment) null, m26869l(context));
    }
}
