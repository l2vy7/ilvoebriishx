package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0782m;

/* renamed from: androidx.fragment.app.c */
/* compiled from: DialogFragment */
public class C0690c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0 */
    private boolean f3574A0;

    /* renamed from: B0 */
    private boolean f3575B0 = false;

    /* renamed from: m0 */
    private Handler f3576m0;

    /* renamed from: n0 */
    private Runnable f3577n0 = new C0691a();

    /* renamed from: o0 */
    private DialogInterface.OnCancelListener f3578o0 = new C0692b();
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public DialogInterface.OnDismissListener f3579p0 = new C0693c();

    /* renamed from: q0 */
    private int f3580q0 = 0;

    /* renamed from: r0 */
    private int f3581r0 = 0;

    /* renamed from: s0 */
    private boolean f3582s0 = true;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public boolean f3583t0 = true;

    /* renamed from: u0 */
    private int f3584u0 = -1;

    /* renamed from: v0 */
    private boolean f3585v0;

    /* renamed from: w0 */
    private C0782m<C0775g> f3586w0 = new C0694d();
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public Dialog f3587x0;

    /* renamed from: y0 */
    private boolean f3588y0;

    /* renamed from: z0 */
    private boolean f3589z0;

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: DialogFragment */
    class C0691a implements Runnable {
        C0691a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C0690c.this.f3579p0.onDismiss(C0690c.this.f3587x0);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* compiled from: DialogFragment */
    class C0692b implements DialogInterface.OnCancelListener {
        C0692b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (C0690c.this.f3587x0 != null) {
                C0690c cVar = C0690c.this;
                cVar.onCancel(cVar.f3587x0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    /* compiled from: DialogFragment */
    class C0693c implements DialogInterface.OnDismissListener {
        C0693c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (C0690c.this.f3587x0 != null) {
                C0690c cVar = C0690c.this;
                cVar.onDismiss(cVar.f3587x0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    /* compiled from: DialogFragment */
    class C0694d implements C0782m<C0775g> {
        C0694d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo3735a(C0775g gVar) {
            if (gVar != null && C0690c.this.f3583t0) {
                View u1 = C0690c.this.mo3462u1();
                if (u1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C0690c.this.f3587x0 != null) {
                    if (FragmentManager.m3729F0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C0690c.this.f3587x0);
                    }
                    C0690c.this.f3587x0.setContentView(u1);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    /* compiled from: DialogFragment */
    class C0695e extends C0704e {

        /* renamed from: a */
        final /* synthetic */ C0704e f3594a;

        C0695e(C0704e eVar) {
            this.f3594a = eVar;
        }

        /* renamed from: f */
        public View mo3487f(int i) {
            View V1 = C0690c.this.mo3722V1(i);
            if (V1 != null) {
                return V1;
            }
            if (this.f3594a.mo3488h()) {
                return this.f3594a.mo3487f(i);
            }
            return null;
        }

        /* renamed from: h */
        public boolean mo3488h() {
            return C0690c.this.mo3723W1() || this.f3594a.mo3488h();
        }
    }

    /* renamed from: R1 */
    private void m3929R1(boolean z, boolean z2) {
        if (!this.f3589z0) {
            this.f3589z0 = true;
            this.f3574A0 = false;
            Dialog dialog = this.f3587x0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3587x0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3576m0.getLooper()) {
                        onDismiss(this.f3587x0);
                    } else {
                        this.f3576m0.post(this.f3577n0);
                    }
                }
            }
            this.f3588y0 = true;
            if (this.f3584u0 >= 0) {
                mo3371K().mo3566T0(this.f3584u0, 1);
                this.f3584u0 = -1;
                return;
            }
            C0720q m = mo3371K().mo3598m();
            m.mo3678n(this);
            if (z) {
                m.mo3673h();
            } else {
                m.mo3672g();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: X1 */
    private void m3930X1(Bundle bundle) {
        if (this.f3583t0 && !this.f3575B0) {
            try {
                this.f3585v0 = true;
                Dialog U1 = mo3721U1(bundle);
                this.f3587x0 = U1;
                if (this.f3583t0) {
                    mo3727c2(U1, this.f3580q0);
                    Context w = mo3466w();
                    if (w instanceof Activity) {
                        this.f3587x0.setOwnerActivity((Activity) w);
                    }
                    this.f3587x0.setCancelable(this.f3582s0);
                    this.f3587x0.setOnCancelListener(this.f3578o0);
                    this.f3587x0.setOnDismissListener(this.f3579p0);
                    this.f3575B0 = true;
                } else {
                    this.f3587x0 = null;
                }
                this.f3585v0 = false;
            } catch (Throwable th) {
                this.f3585v0 = false;
                throw th;
            }
        }
    }

    /* renamed from: A0 */
    public void mo3342A0() {
        super.mo3342A0();
        Dialog dialog = this.f3587x0;
        if (dialog != null) {
            this.f3588y0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3587x0.dismiss();
            if (!this.f3589z0) {
                onDismiss(this.f3587x0);
            }
            this.f3587x0 = null;
            this.f3575B0 = false;
        }
    }

    /* renamed from: B0 */
    public void mo3345B0() {
        super.mo3345B0();
        if (!this.f3574A0 && !this.f3589z0) {
            this.f3589z0 = true;
        }
        mo3400X().mo3961m(this.f3586w0);
    }

    /* renamed from: C0 */
    public LayoutInflater mo3348C0(Bundle bundle) {
        LayoutInflater C0 = super.mo3348C0(bundle);
        if (!this.f3583t0 || this.f3585v0) {
            if (FragmentManager.m3729F0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f3583t0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return C0;
        }
        m3930X1(bundle);
        if (FragmentManager.m3729F0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f3587x0;
        return dialog != null ? C0.cloneInContext(dialog.getContext()) : C0;
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        Dialog dialog = this.f3587x0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f3580q0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3581r0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3582s0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3583t0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3584u0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: Q0 */
    public void mo3387Q0() {
        super.mo3387Q0();
        Dialog dialog = this.f3587x0;
        if (dialog != null) {
            this.f3588y0 = false;
            dialog.show();
        }
    }

    /* renamed from: Q1 */
    public void mo3718Q1() {
        m3929R1(false, false);
    }

    /* renamed from: R0 */
    public void mo3389R0() {
        super.mo3389R0();
        Dialog dialog = this.f3587x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: S1 */
    public Dialog mo3719S1() {
        return this.f3587x0;
    }

    /* renamed from: T0 */
    public void mo3393T0(Bundle bundle) {
        Bundle bundle2;
        super.mo3393T0(bundle);
        if (this.f3587x0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3587x0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: T1 */
    public int mo3720T1() {
        return this.f3581r0;
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(mo3458t1(), mo3720T1());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public View mo3722V1(int i) {
        Dialog dialog = this.f3587x0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public boolean mo3723W1() {
        return this.f3575B0;
    }

    /* renamed from: Y1 */
    public final Dialog mo3724Y1() {
        Dialog S1 = mo3719S1();
        if (S1 != null) {
            return S1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: Z1 */
    public void mo3725Z1(boolean z) {
        this.f3582s0 = z;
        Dialog dialog = this.f3587x0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo3405a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3405a1(layoutInflater, viewGroup, bundle);
        if (this.f3345I == null && this.f3587x0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3587x0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: a2 */
    public void mo3726a2(boolean z) {
        this.f3583t0 = z;
    }

    /* renamed from: c2 */
    public void mo3727c2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: d2 */
    public int mo3728d2(C0720q qVar, String str) {
        this.f3589z0 = false;
        this.f3574A0 = true;
        qVar.mo3852d(this, str);
        this.f3588y0 = false;
        int g = qVar.mo3672g();
        this.f3584u0 = g;
        return g;
    }

    /* renamed from: e2 */
    public void mo3729e2(FragmentManager fragmentManager, String str) {
        this.f3589z0 = false;
        this.f3574A0 = true;
        C0720q m = fragmentManager.mo3598m();
        m.mo3852d(this, str);
        m.mo3672g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0704e mo3429l() {
        return new C0695e(super.mo3429l());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3588y0) {
            if (FragmentManager.m3729F0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m3929R1(true, true);
        }
    }

    /* renamed from: q0 */
    public void mo3447q0(Context context) {
        super.mo3447q0(context);
        mo3400X().mo3957i(this.f3586w0);
        if (!this.f3574A0) {
            this.f3589z0 = false;
        }
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        super.mo3457t0(bundle);
        this.f3576m0 = new Handler();
        this.f3583t0 = this.f3386y == 0;
        if (bundle != null) {
            this.f3580q0 = bundle.getInt("android:style", 0);
            this.f3581r0 = bundle.getInt("android:theme", 0);
            this.f3582s0 = bundle.getBoolean("android:cancelable", true);
            this.f3583t0 = bundle.getBoolean("android:showsDialog", this.f3583t0);
            this.f3584u0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
