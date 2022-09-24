package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0208c;
import androidx.activity.result.C0211d;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0776h;
import androidx.lifecycle.C0784o;
import androidx.lifecycle.C0794s;
import androidx.lifecycle.C0795t;
import androidx.lifecycle.C0796u;
import androidx.lifecycle.C0797v;
import androidx.savedstate.C1219b;
import androidx.savedstate.C1220c;
import androidx.savedstate.C1221d;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0008a;
import p001a0.C0015c;
import p062d.C5133a;
import p062d.C5134b;
import p068e.C5191a;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements C0795t, C1220c, C0202c, C0211d {

    /* renamed from: d */
    final C5133a f491d = new C5133a();

    /* renamed from: e */
    private final C0776h f492e = new C0776h(this);

    /* renamed from: f */
    final C1219b f493f = C1219b.m6649a(this);

    /* renamed from: g */
    private C0794s f494g;

    /* renamed from: h */
    private final OnBackPressedDispatcher f495h = new OnBackPressedDispatcher(new C0194a());

    /* renamed from: i */
    private int f496i;

    /* renamed from: j */
    private final AtomicInteger f497j = new AtomicInteger();

    /* renamed from: k */
    private C0208c f498k = new C0195b();

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0194a implements Runnable {
        C0194a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0195b extends C0208c {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        class C0196a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f503b;

            /* renamed from: c */
            final /* synthetic */ C5191a.C5192a f504c;

            C0196a(int i, C5191a.C5192a aVar) {
                this.f503b = i;
                this.f504c = aVar;
            }

            public void run() {
                C0195b.this.mo702c(this.f503b, this.f504c.mo21379a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        class C0197b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f506b;

            /* renamed from: c */
            final /* synthetic */ IntentSender.SendIntentException f507c;

            C0197b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f506b = i;
                this.f507c = sendIntentException;
            }

            public void run() {
                C0195b.this.mo701b(this.f506b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f507c));
            }
        }

        C0195b() {
        }

        /* renamed from: e */
        public <I, O> void mo662e(int i, C5191a<I, O> aVar, I i2, C0015c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C5191a.C5192a<O> b = aVar.mo21378b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0196a(i, b));
                return;
            }
            Intent a = aVar.mo3632a(componentActivity, i2);
            Bundle bundle = null;
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : stringArrayExtra) {
                        if (ComponentActivity.this.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                            arrayList.add(str);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C0008a.m34p(componentActivity, (String[]) arrayList.toArray(new String[0]), i);
                    }
                }
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C0008a.m36r(componentActivity, intentSenderRequest.mo688e(), i, intentSenderRequest.mo684a(), intentSenderRequest.mo685b(), intentSenderRequest.mo686d(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0197b(i, e));
                }
            } else {
                C0008a.m35q(componentActivity, a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static final class C0198c {

        /* renamed from: a */
        Object f509a;

        /* renamed from: b */
        C0794s f510b;

        C0198c() {
        }
    }

    public ComponentActivity() {
        if (mo639a() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                mo639a().mo3984a(new C0773e() {
                    /* renamed from: c */
                    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
                        if (bVar == C0769d.C0771b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo639a().mo3984a(new C0773e() {
                /* renamed from: c */
                public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
                    if (bVar == C0769d.C0771b.ON_DESTROY) {
                        ComponentActivity.this.f491d.mo21281b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo643g().mo4028a();
                        }
                    }
                }
            });
            if (19 <= i && i <= 23) {
                mo639a().mo3984a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: o */
    private void m894o() {
        C0796u.m4330a(getWindow().getDecorView(), this);
        C0797v.m4331a(getWindow().getDecorView(), this);
        C1221d.m6654a(getWindow().getDecorView(), this);
    }

    /* renamed from: a */
    public C0769d mo639a() {
        return this.f492e;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m894o();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: c */
    public final OnBackPressedDispatcher mo641c() {
        return this.f495h;
    }

    /* renamed from: e */
    public final C0208c mo642e() {
        return this.f498k;
    }

    /* renamed from: g */
    public C0794s mo643g() {
        if (getApplication() != null) {
            if (this.f494g == null) {
                C0198c cVar = (C0198c) getLastNonConfigurationInstance();
                if (cVar != null) {
                    this.f494g = cVar.f510b;
                }
                if (this.f494g == null) {
                    this.f494g = new C0794s();
                }
            }
            return this.f494g;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: i */
    public final SavedStateRegistry mo644i() {
        return this.f493f.mo5973b();
    }

    /* renamed from: n */
    public final void mo645n(C5134b bVar) {
        this.f491d.mo21280a(bVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f498k.mo701b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f495h.mo667c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f493f.mo5974c(bundle);
        this.f491d.mo21282c(this);
        super.onCreate(bundle);
        this.f498k.mo703f(bundle);
        C0784o.m4308f(this);
        int i = this.f496i;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f498k.mo701b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0198c cVar;
        Object p = mo652p();
        C0794s sVar = this.f494g;
        if (sVar == null && (cVar = (C0198c) getLastNonConfigurationInstance()) != null) {
            sVar = cVar.f510b;
        }
        if (sVar == null && p == null) {
            return null;
        }
        C0198c cVar2 = new C0198c();
        cVar2.f509a = p;
        cVar2.f510b = sVar;
        return cVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0769d a = mo639a();
        if (a instanceof C0776h) {
            ((C0776h) a).mo3991o(C0769d.C0772c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f493f.mo5975d(bundle);
        this.f498k.mo704g(bundle);
    }

    @Deprecated
    /* renamed from: p */
    public Object mo652p() {
        return null;
    }

    public void setContentView(int i) {
        m894o();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m894o();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m894o();
        super.setContentView(view, layoutParams);
    }
}
