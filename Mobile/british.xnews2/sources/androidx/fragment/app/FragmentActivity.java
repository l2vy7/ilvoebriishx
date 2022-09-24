package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0202c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0208c;
import androidx.activity.result.C0211d;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0776h;
import androidx.lifecycle.C0794s;
import androidx.lifecycle.C0795t;
import androidx.loader.app.C0798a;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p001a0.C0008a;
import p061d.C5134b;

public class FragmentActivity extends ComponentActivity implements C0008a.C0011c, C0008a.C0013e {

    /* renamed from: l */
    final C0705f f3416l = C0705f.m3964b(new C0651c());

    /* renamed from: m */
    final C0776h f3417m = new C0776h(this);

    /* renamed from: n */
    boolean f3418n;

    /* renamed from: o */
    boolean f3419o;

    /* renamed from: p */
    boolean f3420p = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    class C0649a implements SavedStateRegistry.C1217b {
        C0649a() {
        }

        /* renamed from: a */
        public Bundle mo798a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.mo3507u();
            FragmentActivity.this.f3417m.mo3989h(C0769d.C0771b.ON_STOP);
            Parcelable x = FragmentActivity.this.f3416l.mo3768x();
            if (x != null) {
                bundle.putParcelable("android:support:fragments", x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$b */
    class C0650b implements C5134b {
        C0650b() {
        }

        /* renamed from: a */
        public void mo799a(Context context) {
            FragmentActivity.this.f3416l.mo3746a((Fragment) null);
            Bundle a = FragmentActivity.this.mo644i().mo5968a("android:support:fragments");
            if (a != null) {
                FragmentActivity.this.f3416l.mo3767w(a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$c */
    class C0651c extends C0707h<FragmentActivity> implements C0795t, C0202c, C0211d, C0714m {
        public C0651c() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public C0769d mo639a() {
            return FragmentActivity.this.f3417m;
        }

        /* renamed from: b */
        public void mo3511b(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.mo3508w(fragment);
        }

        /* renamed from: c */
        public OnBackPressedDispatcher mo641c() {
            return FragmentActivity.this.mo641c();
        }

        /* renamed from: e */
        public C0208c mo642e() {
            return FragmentActivity.this.mo642e();
        }

        /* renamed from: f */
        public View mo3487f(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: g */
        public C0794s mo643g() {
            return FragmentActivity.this.mo643g();
        }

        /* renamed from: h */
        public boolean mo3488h() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: n */
        public LayoutInflater mo3513n() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: o */
        public boolean mo3514o(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: q */
        public void mo3515q() {
            FragmentActivity.this.mo763A();
        }

        /* renamed from: r */
        public FragmentActivity mo3512m() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        m3702t();
    }

    /* renamed from: t */
    private void m3702t() {
        mo644i().mo5971d("android:support:fragments", new C0649a());
        mo645n(new C0650b());
    }

    /* renamed from: v */
    private static boolean m3703v(FragmentManager fragmentManager, C0769d.C0772c cVar) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo3605t0()) {
            if (next != null) {
                if (next.mo3353E() != null) {
                    z |= m3703v(next.mo3463v(), cVar);
                }
                C0741u uVar = next.f3357U;
                if (uVar != null && uVar.mo639a().mo3985b().mo3988a(C0769d.C0772c.STARTED)) {
                    next.f3357U.mo3914h(cVar);
                    z = true;
                }
                if (next.f3356T.mo3985b().mo3988a(C0769d.C0772c.STARTED)) {
                    next.f3356T.mo3991o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: A */
    public void mo763A() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: b */
    public final void mo32b(int i) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3418n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3419o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3420p);
        if (getApplication() != null) {
            C0798a.m4332b(this).mo4032a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3416l.mo3764t().mo3571X(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f3416l.mo3765u();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3416l.mo3765u();
        this.f3416l.mo3748d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3417m.mo3989h(C0769d.C0771b.ON_CREATE);
        this.f3416l.mo3750f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f3416l.mo3751g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View q = mo3504q(view, str, context, attributeSet);
        return q == null ? super.onCreateView(view, str, context, attributeSet) : q;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3416l.mo3752h();
        this.f3417m.mo3989h(C0769d.C0771b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f3416l.mo3753i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f3416l.mo3755k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f3416l.mo3749e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f3416l.mo3754j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f3416l.mo3765u();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f3416l.mo3756l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f3419o = false;
        this.f3416l.mo3757m();
        this.f3417m.mo3989h(C0769d.C0771b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f3416l.mo3758n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3510z();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return mo3509y(view, menu) | this.f3416l.mo3759o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3416l.mo3765u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f3419o = true;
        this.f3416l.mo3765u();
        this.f3416l.mo3763s();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f3420p = false;
        if (!this.f3418n) {
            this.f3418n = true;
            this.f3416l.mo3747c();
        }
        this.f3416l.mo3765u();
        this.f3416l.mo3763s();
        this.f3417m.mo3989h(C0769d.C0771b.ON_START);
        this.f3416l.mo3761q();
    }

    public void onStateNotSaved() {
        this.f3416l.mo3765u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f3420p = true;
        mo3507u();
        this.f3416l.mo3762r();
        this.f3417m.mo3989h(C0769d.C0771b.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final View mo3504q(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3416l.mo3766v(view, str, context, attributeSet);
    }

    /* renamed from: r */
    public FragmentManager mo3505r() {
        return this.f3416l.mo3764t();
    }

    @Deprecated
    /* renamed from: s */
    public C0798a mo3506s() {
        return C0798a.m4332b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3507u() {
        do {
        } while (m3703v(mo3505r(), C0769d.C0772c.CREATED));
    }

    @Deprecated
    /* renamed from: w */
    public void mo3508w(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: y */
    public boolean mo3509y(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo3510z() {
        this.f3417m.mo3989h(C0769d.C0771b.ON_RESUME);
        this.f3416l.mo3760p();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View q = mo3504q((View) null, str, context, attributeSet);
        return q == null ? super.onCreateView(str, context, attributeSet) : q;
    }
}
