package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C0201b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.activity.result.C0207b;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.C0696d;
import androidx.fragment.app.C0720q;
import androidx.fragment.app.C0722r;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0794s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p067e.C5191a;
import p089i0.C5421b;
import p149t.C6079b;
import p150t0.C6093b;

public abstract class FragmentManager {

    /* renamed from: O */
    private static boolean f3427O = false;

    /* renamed from: P */
    static boolean f3428P = true;

    /* renamed from: A */
    private C0207b<IntentSenderRequest> f3429A;

    /* renamed from: B */
    private C0207b<String[]> f3430B;

    /* renamed from: C */
    ArrayDeque<LaunchedFragmentInfo> f3431C = new ArrayDeque<>();

    /* renamed from: D */
    private boolean f3432D;

    /* renamed from: E */
    private boolean f3433E;

    /* renamed from: F */
    private boolean f3434F;

    /* renamed from: G */
    private boolean f3435G;

    /* renamed from: H */
    private boolean f3436H;

    /* renamed from: I */
    private ArrayList<C0674a> f3437I;

    /* renamed from: J */
    private ArrayList<Boolean> f3438J;

    /* renamed from: K */
    private ArrayList<Fragment> f3439K;

    /* renamed from: L */
    private ArrayList<C0669p> f3440L;

    /* renamed from: M */
    private C0712l f3441M;

    /* renamed from: N */
    private Runnable f3442N = new C0660g();

    /* renamed from: a */
    private final ArrayList<C0667n> f3443a = new ArrayList<>();

    /* renamed from: b */
    private boolean f3444b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0719p f3445c = new C0719p();

    /* renamed from: d */
    ArrayList<C0674a> f3446d;

    /* renamed from: e */
    private ArrayList<Fragment> f3447e;

    /* renamed from: f */
    private final C0708i f3448f = new C0708i(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f3449g;

    /* renamed from: h */
    private final C0201b f3450h = new C0656c(false);

    /* renamed from: i */
    private final AtomicInteger f3451i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<String, Bundle> f3452j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<String, Object> f3453k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    private ArrayList<C0666m> f3454l;

    /* renamed from: m */
    private Map<Fragment, HashSet<C5421b>> f3455m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C0722r.C0729g f3456n = new C0657d();

    /* renamed from: o */
    private final C0709j f3457o = new C0709j(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<C0714m> f3458p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f3459q = -1;

    /* renamed from: r */
    private C0707h<?> f3460r;

    /* renamed from: s */
    private C0704e f3461s;

    /* renamed from: t */
    private Fragment f3462t;

    /* renamed from: u */
    Fragment f3463u;

    /* renamed from: v */
    private C0706g f3464v = null;

    /* renamed from: w */
    private C0706g f3465w = new C0658e();

    /* renamed from: x */
    private C0756y f3466x = null;

    /* renamed from: y */
    private C0756y f3467y = new C0659f();

    /* renamed from: z */
    private C0207b<Intent> f3468z;

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C06526 implements C0773e {

        /* renamed from: a */
        final /* synthetic */ String f3469a;

        /* renamed from: b */
        final /* synthetic */ C0715n f3470b;

        /* renamed from: c */
        final /* synthetic */ C0769d f3471c;

        /* renamed from: d */
        final /* synthetic */ FragmentManager f3472d;

        /* renamed from: c */
        public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
            Bundle bundle;
            if (bVar == C0769d.C0771b.ON_START && (bundle = (Bundle) this.f3472d.f3452j.get(this.f3469a)) != null) {
                this.f3470b.mo3804a(this.f3469a, bundle);
                this.f3472d.mo3602r(this.f3469a);
            }
            if (bVar == C0769d.C0771b.ON_DESTROY) {
                this.f3471c.mo3986c(this);
                this.f3472d.f3453k.remove(this.f3469a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    class C0654a implements C0206a<ActivityResult> {
        C0654a() {
        }

        /* renamed from: b */
        public void mo697a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3431C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3473b;
            int i = pollFirst.f3474c;
            Fragment i2 = FragmentManager.this.f3445c.mo3834i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3438o0(i, activityResult.mo676b(), activityResult.mo675a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    class C0655b implements C0206a<Map<String, Boolean>> {
        C0655b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo697a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3431C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3473b;
            int i2 = pollFirst.f3474c;
            Fragment i3 = FragmentManager.this.f3445c.mo3834i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i3.mo3381N0(i2, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    class C0656c extends C0201b {
        C0656c(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo670b() {
            FragmentManager.this.mo3537C0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    class C0657d implements C0722r.C0729g {
        C0657d() {
        }

        /* renamed from: a */
        public void mo3625a(Fragment fragment, C5421b bVar) {
            if (!bVar.mo21873c()) {
                FragmentManager.this.mo3572Y0(fragment, bVar);
            }
        }

        /* renamed from: b */
        public void mo3626b(Fragment fragment, C5421b bVar) {
            FragmentManager.this.mo3580f(fragment, bVar);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    class C0658e extends C0706g {
        C0658e() {
        }

        /* renamed from: a */
        public Fragment mo3627a(ClassLoader classLoader, String str) {
            return FragmentManager.this.mo3608u0().mo3745d(FragmentManager.this.mo3608u0().mo3770k(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    class C0659f implements C0756y {
        C0659f() {
        }

        /* renamed from: a */
        public C0746x mo3628a(ViewGroup viewGroup) {
            return new C0675b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    class C0660g implements Runnable {
        C0660g() {
        }

        public void run() {
            FragmentManager.this.mo3575b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    class C0661h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3482a;

        /* renamed from: b */
        final /* synthetic */ View f3483b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3484c;

        C0661h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3482a = viewGroup;
            this.f3483b = view;
            this.f3484c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3482a.endViewTransition(this.f3483b);
            animator.removeListener(this);
            Fragment fragment = this.f3484c;
            View view = fragment.f3345I;
            if (view != null && fragment.f3337A) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    class C0662i implements C0714m {

        /* renamed from: b */
        final /* synthetic */ Fragment f3486b;

        C0662i(Fragment fragment) {
            this.f3486b = fragment;
        }

        /* renamed from: b */
        public void mo3511b(FragmentManager fragmentManager, Fragment fragment) {
            this.f3486b.mo3450r0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    class C0663j implements C0206a<ActivityResult> {
        C0663j() {
        }

        /* renamed from: b */
        public void mo697a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3431C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3473b;
            int i = pollFirst.f3474c;
            Fragment i2 = FragmentManager.this.f3445c.mo3834i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3438o0(i, activityResult.mo676b(), activityResult.mo675a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    static class C0664k extends C5191a<IntentSenderRequest, ActivityResult> {
        C0664k() {
        }

        /* renamed from: d */
        public Intent mo3632a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.mo684a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0205b(intentSenderRequest.mo688e()).mo695b((Intent) null).mo696c(intentSenderRequest.mo686d(), intentSenderRequest.mo685b()).mo694a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public ActivityResult mo3633c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public static abstract class C0665l {
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public interface C0666m {
        /* renamed from: a */
        void mo3636a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    interface C0667n {
        /* renamed from: a */
        boolean mo3637a(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    private class C0668o implements C0667n {

        /* renamed from: a */
        final String f3489a;

        /* renamed from: b */
        final int f3490b;

        /* renamed from: c */
        final int f3491c;

        C0668o(String str, int i, int i2) {
            this.f3489a = str;
            this.f3490b = i;
            this.f3491c = i2;
        }

        /* renamed from: a */
        public boolean mo3637a(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3463u;
            if (fragment != null && this.f3490b < 0 && this.f3489a == null && fragment.mo3463v().mo3568U0()) {
                return false;
            }
            return FragmentManager.this.mo3570W0(arrayList, arrayList2, this.f3489a, this.f3490b, this.f3491c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    static class C0669p implements Fragment.C0648h {

        /* renamed from: a */
        final boolean f3493a;

        /* renamed from: b */
        final C0674a f3494b;

        /* renamed from: c */
        private int f3495c;

        C0669p(C0674a aVar, boolean z) {
            this.f3493a = z;
            this.f3494b = aVar;
        }

        /* renamed from: a */
        public void mo3490a() {
            this.f3495c++;
        }

        /* renamed from: b */
        public void mo3491b() {
            int i = this.f3495c - 1;
            this.f3495c = i;
            if (i == 0) {
                this.f3494b.f3529t.mo3584g1();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3638c() {
            C0674a aVar = this.f3494b;
            aVar.f3529t.mo3607u(aVar, this.f3493a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3639d() {
            boolean z = this.f3495c > 0;
            for (Fragment next : this.f3494b.f3529t.mo3605t0()) {
                next.mo3358F1((Fragment.C0648h) null);
                if (z && next.mo3419h0()) {
                    next.mo3379M1();
                }
            }
            C0674a aVar = this.f3494b;
            aVar.f3529t.mo3607u(aVar, this.f3493a, !z, true);
        }

        /* renamed from: e */
        public boolean mo3640e() {
            return this.f3495c == 0;
        }
    }

    /* renamed from: A0 */
    static Fragment m3728A0(View view) {
        Object tag = view.getTag(C6093b.f25325a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: F0 */
    static boolean m3729F0(int i) {
        return f3427O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: G0 */
    private boolean m3730G0(Fragment fragment) {
        return (fragment.f3341E && fragment.f3342F) || fragment.f3383v.mo3600o();
    }

    /* renamed from: M */
    private void m3731M(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3586h0(fragment.f3368g))) {
            fragment.mo3434m1();
        }
    }

    /* renamed from: M0 */
    private void m3732M0(C6079b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment i2 = bVar.mo23283i(i);
            if (!i2.f3374m) {
                View u1 = i2.mo3462u1();
                i2.f3352P = u1.getAlpha();
                u1.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: T */
    private void m3733T(int i) {
        try {
            this.f3444b = true;
            this.f3445c.mo3829d(i);
            mo3557O0(i, false);
            if (f3428P) {
                for (C0746x h : m3759s()) {
                    h.mo3930h();
                }
            }
            this.f3444b = false;
            mo3575b0(true);
        } catch (Throwable th) {
            this.f3444b = false;
            throw th;
        }
    }

    /* renamed from: V0 */
    private boolean m3734V0(String str, int i, int i2) {
        mo3575b0(false);
        m3739a0(true);
        Fragment fragment = this.f3463u;
        if (fragment != null && i < 0 && str == null && fragment.mo3463v().mo3568U0()) {
            return true;
        }
        boolean W0 = mo3570W0(this.f3437I, this.f3438J, str, i, i2);
        if (W0) {
            this.f3444b = true;
            try {
                m3740a1(this.f3437I, this.f3438J);
            } finally {
                m3757q();
            }
        }
        m3754n1();
        m3735W();
        this.f3445c.mo3827b();
        return W0;
    }

    /* renamed from: W */
    private void m3735W() {
        if (this.f3436H) {
            this.f3436H = false;
            m3752m1();
        }
    }

    /* renamed from: X0 */
    private int m3736X0(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C6079b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0674a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo3668C() && !aVar.mo3667A(arrayList, i4 + 1, i2)) {
                if (this.f3440L == null) {
                    this.f3440L = new ArrayList<>();
                }
                C0669p pVar = new C0669p(aVar, booleanValue);
                this.f3440L.add(pVar);
                aVar.mo3670E(pVar);
                if (booleanValue) {
                    aVar.mo3684v();
                } else {
                    aVar.mo3685w(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m3744d(bVar);
            }
        }
        return i3;
    }

    /* renamed from: Y */
    private void m3737Y() {
        if (f3428P) {
            for (C0746x h : m3759s()) {
                h.mo3930h();
            }
        } else if (!this.f3455m.isEmpty()) {
            for (Fragment next : this.f3455m.keySet()) {
                m3753n(next);
                mo3559P0(next);
            }
        }
    }

    /* renamed from: a0 */
    private void m3739a0(boolean z) {
        if (this.f3444b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3460r == null) {
            if (this.f3435G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3460r.mo3771l().getLooper()) {
            if (!z) {
                m3756p();
            }
            if (this.f3437I == null) {
                this.f3437I = new ArrayList<>();
                this.f3438J = new ArrayList<>();
            }
            this.f3444b = true;
            try {
                m3748g0((ArrayList<C0674a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3444b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: a1 */
    private void m3740a1(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m3748g0(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3665r) {
                        if (i2 != i) {
                            m3746e0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3665r) {
                                i2++;
                            }
                        }
                        m3746e0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m3746e0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: c1 */
    private void m3743c1() {
        if (this.f3454l != null) {
            for (int i = 0; i < this.f3454l.size(); i++) {
                this.f3454l.get(i).mo3636a();
            }
        }
    }

    /* renamed from: d */
    private void m3744d(C6079b<Fragment> bVar) {
        int i = this.f3459q;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment next : this.f3445c.mo3839n()) {
                if (next.f3363b < min) {
                    mo3561Q0(next, min);
                    if (next.f3345I != null && !next.f3337A && next.f3350N) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: d0 */
    private static void m3745d0(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0674a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3679r(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3685w(z);
            } else {
                aVar.mo3679r(1);
                aVar.mo3684v();
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3746e0(java.util.ArrayList<androidx.fragment.app.C0674a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.C0674a) r0
            boolean r2 = r0.f3665r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3439K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f3439K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3439K
            androidx.fragment.app.p r1 = r6.f3445c
            java.util.List r1 = r1.mo3839n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.mo3614y0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0674a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f3439K
            androidx.fragment.app.Fragment r0 = r8.mo3686x(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f3439K
            androidx.fragment.app.Fragment r0 = r8.mo3671F(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f3656i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3439K
            r0.clear()
            if (r2 != 0) goto L_0x00b9
            int r0 = r6.f3459q
            if (r0 < r14) goto L_0x00b9
            boolean r0 = f3428P
            if (r0 == 0) goto L_0x00a0
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00b9
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.C0674a) r1
            java.util.ArrayList<androidx.fragment.app.q$a> r1 = r1.f3650c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x009d
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.q$a r7 = (androidx.fragment.app.C0720q.C0721a) r7
            androidx.fragment.app.Fragment r7 = r7.f3668b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.o r7 = r6.mo3610w(r7)
            androidx.fragment.app.p r8 = r6.f3445c
            r8.mo3841p(r7)
            goto L_0x0083
        L_0x009d:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a0:
            androidx.fragment.app.h<?> r0 = r6.f3460r
            android.content.Context r7 = r0.mo3770k()
            androidx.fragment.app.e r8 = r6.f3461s
            r13 = 0
            androidx.fragment.app.r$g r0 = r6.f3456n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.C0722r.m4092B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00ba
        L_0x00b9:
            r1 = 1
        L_0x00ba:
            m3745d0(r18, r19, r20, r21)
            boolean r0 = f3428P
            if (r0 == 0) goto L_0x0141
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r2 == 0) goto L_0x011f
            r2 = r4
        L_0x00d0:
            if (r2 >= r3) goto L_0x011a
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0674a) r7
            if (r0 == 0) goto L_0x00f9
            java.util.ArrayList<androidx.fragment.app.q$a> r8 = r7.f3650c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e1:
            if (r8 < 0) goto L_0x0117
            java.util.ArrayList<androidx.fragment.app.q$a> r9 = r7.f3650c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.q$a r9 = (androidx.fragment.app.C0720q.C0721a) r9
            androidx.fragment.app.Fragment r9 = r9.f3668b
            if (r9 == 0) goto L_0x00f6
            androidx.fragment.app.o r9 = r6.mo3610w(r9)
            r9.mo3815k()
        L_0x00f6:
            int r8 = r8 + -1
            goto L_0x00e1
        L_0x00f9:
            java.util.ArrayList<androidx.fragment.app.q$a> r7 = r7.f3650c
            java.util.Iterator r7 = r7.iterator()
        L_0x00ff:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0117
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.q$a r8 = (androidx.fragment.app.C0720q.C0721a) r8
            androidx.fragment.app.Fragment r8 = r8.f3668b
            if (r8 == 0) goto L_0x00ff
            androidx.fragment.app.o r8 = r6.mo3610w(r8)
            r8.mo3815k()
            goto L_0x00ff
        L_0x0117:
            int r2 = r2 + 1
            goto L_0x00d0
        L_0x011a:
            int r2 = r6.f3459q
            r6.mo3557O0(r2, r1)
        L_0x011f:
            java.util.Set r1 = r6.m3760t(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0127:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013d
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.x r2 = (androidx.fragment.app.C0746x) r2
            r2.mo3935o(r0)
            r2.mo3934n()
            r2.mo3929g()
            goto L_0x0127
        L_0x013d:
            r0 = r3
            r3 = r5
            goto L_0x0197
        L_0x0141:
            if (r2 == 0) goto L_0x0163
            t.b r7 = new t.b
            r7.<init>()
            r6.m3744d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.m3736X0(r1, r2, r3, r4, r5)
            r6.m3732M0(r7)
            goto L_0x0169
        L_0x0163:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x0169:
            if (r0 == r12) goto L_0x0195
            if (r8 == 0) goto L_0x0195
            int r1 = r6.f3459q
            if (r1 < r14) goto L_0x018c
            androidx.fragment.app.h<?> r1 = r6.f3460r
            android.content.Context r7 = r1.mo3770k()
            androidx.fragment.app.e r8 = r6.f3461s
            r1 = 1
            androidx.fragment.app.r$g r2 = r6.f3456n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.C0722r.m4092B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x018f
        L_0x018c:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x018f:
            int r2 = r6.f3459q
            r6.mo3557O0(r2, r1)
            goto L_0x0197
        L_0x0195:
            r3 = r11
            r0 = r13
        L_0x0197:
            r1 = r20
        L_0x0199:
            if (r1 >= r0) goto L_0x01ba
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C0674a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b4
            int r4 = r2.f3531v
            if (r4 < 0) goto L_0x01b4
            r4 = -1
            r2.f3531v = r4
        L_0x01b4:
            r2.mo3669D()
            int r1 = r1 + 1
            goto L_0x0199
        L_0x01ba:
            if (r16 == 0) goto L_0x01bf
            r17.m3743c1()
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m3746e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: e1 */
    static int m3747e1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: g0 */
    private void m3748g0(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0669p> arrayList3 = this.f3440L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0669p pVar = this.f3440L.get(i);
            if (arrayList != null && !pVar.f3493a && (indexOf2 = arrayList.indexOf(pVar.f3494b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f3440L.remove(i);
                i--;
                size--;
                pVar.mo3638c();
            } else if (pVar.mo3640e() || (arrayList != null && pVar.f3494b.mo3667A(arrayList, 0, arrayList.size()))) {
                this.f3440L.remove(i);
                i--;
                size--;
                if (arrayList == null || pVar.f3493a || (indexOf = arrayList.indexOf(pVar.f3494b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    pVar.mo3639d();
                } else {
                    pVar.mo3638c();
                }
            }
            i++;
        }
    }

    /* renamed from: k1 */
    private void m3749k1(Fragment fragment) {
        ViewGroup q0 = m3758q0(fragment);
        if (q0 != null) {
            int i = C6093b.f25326c;
            if (q0.getTag(i) == null) {
                q0.setTag(i, fragment);
            }
            ((Fragment) q0.getTag(i)).mo3352D1(fragment.mo3362H());
        }
    }

    /* renamed from: l0 */
    private void m3750l0() {
        if (f3428P) {
            for (C0746x i : m3759s()) {
                i.mo3931i();
            }
        } else if (this.f3440L != null) {
            while (!this.f3440L.isEmpty()) {
                this.f3440L.remove(0).mo3639d();
            }
        }
    }

    /* renamed from: m0 */
    private boolean m3751m0(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3443a) {
            if (this.f3443a.isEmpty()) {
                return false;
            }
            int size = this.f3443a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3443a.get(i).mo3637a(arrayList, arrayList2);
            }
            this.f3443a.clear();
            this.f3460r.mo3771l().removeCallbacks(this.f3442N);
            return z;
        }
    }

    /* renamed from: m1 */
    private void m3752m1() {
        for (C0716o S0 : this.f3445c.mo3836k()) {
            mo3565S0(S0);
        }
    }

    /* renamed from: n */
    private void m3753n(Fragment fragment) {
        HashSet hashSet = this.f3455m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C5421b) it.next()).mo21871a();
            }
            hashSet.clear();
            m3762x(fragment);
            this.f3455m.remove(fragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo3599n0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo3547I0(r3.f3462t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo674f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3450h;
     */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3754n1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$n> r0 = r3.f3443a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$n> r1 = r3.f3443a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f3450h     // Catch:{ all -> 0x002a }
            r1.mo674f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f3450h
            int r1 = r3.mo3599n0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3462t
            boolean r1 = r3.mo3547I0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo674f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m3754n1():void");
    }

    /* renamed from: o0 */
    private C0712l m3755o0(Fragment fragment) {
        return this.f3441M.mo3794h(fragment);
    }

    /* renamed from: p */
    private void m3756p() {
        if (mo3551K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q */
    private void m3757q() {
        this.f3444b = false;
        this.f3438J.clear();
        this.f3437I.clear();
    }

    /* renamed from: q0 */
    private ViewGroup m3758q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3344H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3386y > 0 && this.f3461s.mo3488h()) {
            View f = this.f3461s.mo3487f(fragment.f3386y);
            if (f instanceof ViewGroup) {
                return (ViewGroup) f;
            }
        }
        return null;
    }

    /* renamed from: s */
    private Set<C0746x> m3759s() {
        HashSet hashSet = new HashSet();
        for (C0716o j : this.f3445c.mo3836k()) {
            ViewGroup viewGroup = j.mo3814j().f3344H;
            if (viewGroup != null) {
                hashSet.add(C0746x.m4188m(viewGroup, mo3616z0()));
            }
        }
        return hashSet;
    }

    /* renamed from: t */
    private Set<C0746x> m3760t(ArrayList<C0674a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C0720q.C0721a> it = arrayList.get(i).f3650c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3668b;
                if (!(fragment == null || (viewGroup = fragment.f3344H) == null)) {
                    hashSet.add(C0746x.m4187l(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: v */
    private void m3761v(Fragment fragment) {
        Animator animator;
        if (fragment.f3345I != null) {
            C0696d.C0701d b = C0696d.m3959b(this.f3460r.mo3770k(), fragment, !fragment.f3337A);
            if (b == null || (animator = b.f3608b) == null) {
                if (b != null) {
                    fragment.f3345I.startAnimation(b.f3607a);
                    b.f3607a.start();
                }
                fragment.f3345I.setVisibility((!fragment.f3337A || fragment.mo3410d0()) ? 0 : 8);
                if (fragment.mo3410d0()) {
                    fragment.mo3349C1(false);
                }
            } else {
                animator.setTarget(fragment.f3345I);
                if (!fragment.f3337A) {
                    fragment.f3345I.setVisibility(0);
                } else if (fragment.mo3410d0()) {
                    fragment.mo3349C1(false);
                } else {
                    ViewGroup viewGroup = fragment.f3344H;
                    View view = fragment.f3345I;
                    viewGroup.startViewTransition(view);
                    b.f3608b.addListener(new C0661h(viewGroup, view, fragment));
                }
                b.f3608b.start();
            }
        }
        if (fragment.f3374m && m3730G0(fragment)) {
            this.f3432D = true;
        }
        fragment.f3351O = false;
        fragment.mo3351D0(fragment.f3337A);
    }

    /* renamed from: x */
    private void m3762x(Fragment fragment) {
        fragment.mo3409c1();
        this.f3457o.mo3788n(fragment, false);
        fragment.f3344H = null;
        fragment.f3345I = null;
        fragment.f3357U = null;
        fragment.f3358V.mo3962n(null);
        fragment.f3377p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3533A() {
        this.f3433E = false;
        this.f3434F = false;
        this.f3441M.mo3800n(false);
        m3733T(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo3534B(Configuration configuration) {
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null) {
                next.mo3399W0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public C0794s mo3535B0(Fragment fragment) {
        return this.f3441M.mo3797k(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo3536C(MenuItem menuItem) {
        if (this.f3459q < 1) {
            return false;
        }
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null && next.mo3401X0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo3537C0() {
        mo3575b0(true);
        if (this.f3450h.mo671c()) {
            mo3568U0();
        } else {
            this.f3449g.mo667c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo3538D() {
        this.f3433E = false;
        this.f3434F = false;
        this.f3441M.mo3800n(false);
        m3733T(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo3539D0(Fragment fragment) {
        if (m3729F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f3337A) {
            fragment.f3337A = true;
            fragment.f3351O = true ^ fragment.f3351O;
            m3749k1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3540E(Menu menu, MenuInflater menuInflater) {
        if (this.f3459q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null && mo3545H0(next) && next.mo3404Z0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3447e != null) {
            for (int i = 0; i < this.f3447e.size(); i++) {
                Fragment fragment = this.f3447e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3474z0();
                }
            }
        }
        this.f3447e = arrayList;
        return z;
    }

    /* renamed from: E0 */
    public boolean mo3541E0() {
        return this.f3435G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo3542F() {
        this.f3435G = true;
        mo3575b0(true);
        m3737Y();
        m3733T(-1);
        this.f3460r = null;
        this.f3461s = null;
        this.f3462t = null;
        if (this.f3449g != null) {
            this.f3450h.mo672d();
            this.f3449g = null;
        }
        C0207b<Intent> bVar = this.f3468z;
        if (bVar != null) {
            bVar.mo700c();
            this.f3429A.mo700c();
            this.f3430B.mo700c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3543G() {
        m3733T(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3544H() {
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null) {
                next.mo3416f1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean mo3545H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.mo3417g0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3546I(boolean z) {
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null) {
                next.mo3418g1(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean mo3547I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f3381t;
        if (!fragment.equals(fragmentManager.mo3614y0()) || !mo3547I0(fragmentManager.f3462t)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3548J(Fragment fragment) {
        Iterator<C0714m> it = this.f3458p.iterator();
        while (it.hasNext()) {
            it.next().mo3511b(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean mo3549J0(int i) {
        return this.f3459q >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo3550K(MenuItem menuItem) {
        if (this.f3459q < 1) {
            return false;
        }
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null && next.mo3420h1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    public boolean mo3551K0() {
        return this.f3433E || this.f3434F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo3552L(Menu menu) {
        if (this.f3459q >= 1) {
            for (Fragment next : this.f3445c.mo3839n()) {
                if (next != null) {
                    next.mo3423i1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo3553L0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f3468z != null) {
            this.f3431C.addLast(new LaunchedFragmentInfo(fragment.f3368g, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3468z.mo698a(intent);
            return;
        }
        this.f3460r.mo3772p(fragment, intent, i, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3554N() {
        m3733T(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo3555N0(Fragment fragment) {
        if (this.f3445c.mo3828c(fragment.f3368g)) {
            mo3559P0(fragment);
            View view = fragment.f3345I;
            if (!(view == null || !fragment.f3350N || fragment.f3344H == null)) {
                float f = fragment.f3352P;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                fragment.f3352P = 0.0f;
                fragment.f3350N = false;
                C0696d.C0701d b = C0696d.m3959b(this.f3460r.mo3770k(), fragment, true);
                if (b != null) {
                    Animation animation = b.f3607a;
                    if (animation != null) {
                        fragment.f3345I.startAnimation(animation);
                    } else {
                        b.f3608b.setTarget(fragment.f3345I);
                        b.f3608b.start();
                    }
                }
            }
            if (fragment.f3351O) {
                m3761v(fragment);
            }
        } else if (m3729F0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3459q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3556O(boolean z) {
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null) {
                next.mo3428k1(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3557O0(int i, boolean z) {
        C0707h<?> hVar;
        if (this.f3460r == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3459q) {
            this.f3459q = i;
            if (f3428P) {
                this.f3445c.mo3843r();
            } else {
                for (Fragment N0 : this.f3445c.mo3839n()) {
                    mo3555N0(N0);
                }
                for (C0716o next : this.f3445c.mo3836k()) {
                    Fragment j = next.mo3814j();
                    if (!j.f3350N) {
                        mo3555N0(j);
                    }
                    if (j.f3375n && !j.mo3412e0()) {
                        this.f3445c.mo3842q(next);
                    }
                }
            }
            m3752m1();
            if (this.f3432D && (hVar = this.f3460r) != null && this.f3459q == 7) {
                hVar.mo3515q();
                this.f3432D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo3558P(Menu menu) {
        boolean z = false;
        if (this.f3459q < 1) {
            return false;
        }
        for (Fragment next : this.f3445c.mo3839n()) {
            if (next != null && next.mo3431l1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo3559P0(Fragment fragment) {
        mo3561Q0(fragment, this.f3459q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo3560Q() {
        m3754n1();
        m3731M(this.f3463u);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0132  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3561Q0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.p r0 = r10.f3445c
            java.lang.String r1 = r11.f3368g
            androidx.fragment.app.o r0 = r0.mo3838m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.o r0 = new androidx.fragment.app.o
            androidx.fragment.app.j r2 = r10.f3457o
            androidx.fragment.app.p r3 = r10.f3445c
            r0.<init>(r2, r3, r11)
            r0.mo3821r(r1)
        L_0x0017:
            boolean r2 = r11.f3376o
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.f3377p
            if (r2 == 0) goto L_0x0028
            int r2 = r11.f3363b
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.mo3807c()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.f3363b
            java.lang.String r4 = "FragmentManager"
            r5 = 3
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<i0.b>> r2 = r10.f3455m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.m3753n(r11)
        L_0x0047:
            int r2 = r11.f3363b
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0136
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.mo3806b()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.mo3808d()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.mo3813i()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.mo3809e()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.mo3805a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.mo3822s()
        L_0x0075:
            if (r12 <= r7) goto L_0x0136
            r0.mo3818n()
            goto L_0x0136
        L_0x007c:
            if (r2 <= r12) goto L_0x0136
            if (r2 == 0) goto L_0x012f
            if (r2 == r1) goto L_0x0121
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0136
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.mo3816l()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.mo3823t()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = m3729F0(r5)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x00b3:
            android.view.View r2 = r11.f3345I
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.h<?> r2 = r10.f3460r
            boolean r2 = r2.mo3514o(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.f3365d
            if (r2 != 0) goto L_0x00c6
            r0.mo3820q()
        L_0x00c6:
            if (r12 >= r3) goto L_0x0121
            r2 = 0
            android.view.View r3 = r11.f3345I
            if (r3 == 0) goto L_0x0116
            android.view.ViewGroup r7 = r11.f3344H
            if (r7 == 0) goto L_0x0116
            r7.endViewTransition(r3)
            android.view.View r3 = r11.f3345I
            r3.clearAnimation()
            boolean r3 = r11.mo3424j0()
            if (r3 != 0) goto L_0x0116
            int r3 = r10.f3459q
            r7 = 0
            if (r3 <= r6) goto L_0x0101
            boolean r3 = r10.f3435G
            if (r3 != 0) goto L_0x0101
            android.view.View r3 = r11.f3345I
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0101
            float r3 = r11.f3352P
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0101
            androidx.fragment.app.h<?> r2 = r10.f3460r
            android.content.Context r2 = r2.mo3770k()
            r3 = 0
            androidx.fragment.app.d$d r2 = androidx.fragment.app.C0696d.m3959b(r2, r11, r3)
        L_0x0101:
            r11.f3352P = r7
            android.view.ViewGroup r3 = r11.f3344H
            android.view.View r6 = r11.f3345I
            if (r2 == 0) goto L_0x010e
            androidx.fragment.app.r$g r7 = r10.f3456n
            androidx.fragment.app.C0696d.m3958a(r11, r2, r7)
        L_0x010e:
            r3.removeView(r6)
            android.view.ViewGroup r2 = r11.f3344H
            if (r3 == r2) goto L_0x0116
            return
        L_0x0116:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<i0.b>> r2 = r10.f3455m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x0121
            r0.mo3811g()
        L_0x0121:
            if (r12 >= r1) goto L_0x012f
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<i0.b>> r2 = r10.f3455m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            r0.mo3810f()
        L_0x012f:
            r1 = r12
        L_0x0130:
            if (r1 >= 0) goto L_0x0135
            r0.mo3812h()
        L_0x0135:
            r12 = r1
        L_0x0136:
            int r0 = r11.f3363b
            if (r0 == r12) goto L_0x0168
            boolean r0 = m3729F0(r5)
            if (r0 == 0) goto L_0x0166
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.f3363b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0166:
            r11.f3363b = r12
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo3561Q0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3562R() {
        this.f3433E = false;
        this.f3434F = false;
        this.f3441M.mo3800n(false);
        m3733T(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3563R0() {
        if (this.f3460r != null) {
            this.f3433E = false;
            this.f3434F = false;
            this.f3441M.mo3800n(false);
            for (Fragment next : this.f3445c.mo3839n()) {
                if (next != null) {
                    next.mo3433m0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo3564S() {
        this.f3433E = false;
        this.f3434F = false;
        this.f3441M.mo3800n(false);
        m3733T(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo3565S0(C0716o oVar) {
        Fragment j = oVar.mo3814j();
        if (!j.f3346J) {
            return;
        }
        if (this.f3444b) {
            this.f3436H = true;
            return;
        }
        j.f3346J = false;
        if (f3428P) {
            oVar.mo3815k();
        } else {
            mo3559P0(j);
        }
    }

    /* renamed from: T0 */
    public void mo3566T0(int i, int i2) {
        if (i >= 0) {
            mo3573Z(new C0668o((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3567U() {
        this.f3434F = true;
        this.f3441M.mo3800n(true);
        m3733T(4);
    }

    /* renamed from: U0 */
    public boolean mo3568U0() {
        return m3734V0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo3569V() {
        m3733T(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public boolean mo3570W0(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0674a> arrayList3 = this.f3446d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3446d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0674a aVar = this.f3446d.get(size2);
                    if ((str != null && str.equals(aVar.mo3687y())) || (i >= 0 && i == aVar.f3531v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0674a aVar2 = this.f3446d.get(size2);
                        if ((str == null || !str.equals(aVar2.mo3687y())) && (i < 0 || i != aVar2.f3531v)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f3446d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3446d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3446d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: X */
    public void mo3571X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3445c.mo3830e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3447e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3447e.get(i).toString());
            }
        }
        ArrayList<C0674a> arrayList2 = this.f3446d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0674a aVar = this.f3446d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3681t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3451i.get());
        synchronized (this.f3443a) {
            int size3 = this.f3443a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3443a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3460r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3461s);
        if (this.f3462t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3462t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3459q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3433E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3434F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3435G);
        if (this.f3432D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3432D);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3572Y0(Fragment fragment, C5421b bVar) {
        HashSet hashSet = this.f3455m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f3455m.remove(fragment);
            if (fragment.f3363b < 5) {
                m3762x(fragment);
                mo3559P0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo3573Z(C0667n nVar, boolean z) {
        if (!z) {
            if (this.f3460r != null) {
                m3756p();
            } else if (this.f3435G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3443a) {
            if (this.f3460r != null) {
                this.f3443a.add(nVar);
                mo3584g1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo3574Z0(Fragment fragment) {
        if (m3729F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3380s);
        }
        boolean z = !fragment.mo3412e0();
        if (!fragment.f3338B || z) {
            this.f3445c.mo3844s(fragment);
            if (m3730G0(fragment)) {
                this.f3432D = true;
            }
            fragment.f3375n = true;
            m3749k1(fragment);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo3575b0(boolean z) {
        m3739a0(z);
        boolean z2 = false;
        while (m3751m0(this.f3437I, this.f3438J)) {
            this.f3444b = true;
            try {
                m3740a1(this.f3437I, this.f3438J);
                m3757q();
                z2 = true;
            } catch (Throwable th) {
                m3757q();
                throw th;
            }
        }
        m3754n1();
        m3735W();
        this.f3445c.mo3827b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3576b1(Fragment fragment) {
        this.f3441M.mo3799m(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo3577c0(C0667n nVar, boolean z) {
        if (!z || (this.f3460r != null && !this.f3435G)) {
            m3739a0(z);
            if (nVar.mo3637a(this.f3437I, this.f3438J)) {
                this.f3444b = true;
                try {
                    m3740a1(this.f3437I, this.f3438J);
                } finally {
                    m3757q();
                }
            }
            m3754n1();
            m3735W();
            this.f3445c.mo3827b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3578d1(Parcelable parcelable) {
        C0716o oVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f3496b != null) {
                this.f3445c.mo3845t();
                Iterator<FragmentState> it = fragmentManagerState.f3496b.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment g = this.f3441M.mo3793g(next.f3505c);
                        if (g != null) {
                            if (m3729F0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g);
                            }
                            oVar = new C0716o(this.f3457o, this.f3445c, g, next);
                        } else {
                            oVar = new C0716o(this.f3457o, this.f3445c, this.f3460r.mo3770k().getClassLoader(), mo3603r0(), next);
                        }
                        Fragment j = oVar.mo3814j();
                        j.f3381t = this;
                        if (m3729F0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + j.f3368g + "): " + j);
                        }
                        oVar.mo3817m(this.f3460r.mo3770k().getClassLoader());
                        this.f3445c.mo3841p(oVar);
                        oVar.mo3821r(this.f3459q);
                    }
                }
                for (Fragment next2 : this.f3441M.mo3796j()) {
                    if (!this.f3445c.mo3828c(next2.f3368g)) {
                        if (m3729F0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + fragmentManagerState.f3496b);
                        }
                        this.f3441M.mo3799m(next2);
                        next2.f3381t = this;
                        C0716o oVar2 = new C0716o(this.f3457o, this.f3445c, next2);
                        oVar2.mo3821r(1);
                        oVar2.mo3815k();
                        next2.f3375n = true;
                        oVar2.mo3815k();
                    }
                }
                this.f3445c.mo3846u(fragmentManagerState.f3497c);
                if (fragmentManagerState.f3498d != null) {
                    this.f3446d = new ArrayList<>(fragmentManagerState.f3498d.length);
                    int i = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f3498d;
                        if (i >= backStackStateArr.length) {
                            break;
                        }
                        C0674a a = backStackStateArr[i].mo3334a(this);
                        if (m3729F0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a.f3531v + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C0745w("FragmentManager"));
                            a.mo3683u("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3446d.add(a);
                        i++;
                    }
                } else {
                    this.f3446d = null;
                }
                this.f3451i.set(fragmentManagerState.f3499e);
                String str = fragmentManagerState.f3500f;
                if (str != null) {
                    Fragment h0 = mo3586h0(str);
                    this.f3463u = h0;
                    m3731M(h0);
                }
                ArrayList<String> arrayList = fragmentManagerState.f3501g;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        this.f3452j.put(arrayList.get(i2), fragmentManagerState.f3502h.get(i2));
                    }
                }
                this.f3431C = new ArrayDeque<>(fragmentManagerState.f3503i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3579e(C0674a aVar) {
        if (this.f3446d == null) {
            this.f3446d = new ArrayList<>();
        }
        this.f3446d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3580f(Fragment fragment, C5421b bVar) {
        if (this.f3455m.get(fragment) == null) {
            this.f3455m.put(fragment, new HashSet());
        }
        this.f3455m.get(fragment).add(bVar);
    }

    /* renamed from: f0 */
    public boolean mo3581f0() {
        boolean b0 = mo3575b0(true);
        m3750l0();
        return b0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public Parcelable mo3582f1() {
        int size;
        m3750l0();
        m3737Y();
        mo3575b0(true);
        this.f3433E = true;
        this.f3441M.mo3800n(true);
        ArrayList<FragmentState> v = this.f3445c.mo3847v();
        BackStackState[] backStackStateArr = null;
        if (v.isEmpty()) {
            if (m3729F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w = this.f3445c.mo3848w();
        ArrayList<C0674a> arrayList = this.f3446d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f3446d.get(i));
                if (m3729F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3446d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3496b = v;
        fragmentManagerState.f3497c = w;
        fragmentManagerState.f3498d = backStackStateArr;
        fragmentManagerState.f3499e = this.f3451i.get();
        Fragment fragment = this.f3463u;
        if (fragment != null) {
            fragmentManagerState.f3500f = fragment.f3368g;
        }
        fragmentManagerState.f3501g.addAll(this.f3452j.keySet());
        fragmentManagerState.f3502h.addAll(this.f3452j.values());
        fragmentManagerState.f3503i = new ArrayList<>(this.f3431C);
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3583g(Fragment fragment) {
        if (m3729F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        this.f3445c.mo3841p(mo3610w(fragment));
        if (!fragment.f3338B) {
            this.f3445c.mo3826a(fragment);
            fragment.f3375n = false;
            if (fragment.f3345I == null) {
                fragment.f3351O = false;
            }
            if (m3730G0(fragment)) {
                this.f3432D = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3584g1() {
        synchronized (this.f3443a) {
            ArrayList<C0669p> arrayList = this.f3440L;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f3443a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3460r.mo3771l().removeCallbacks(this.f3442N);
                this.f3460r.mo3771l().post(this.f3442N);
                m3754n1();
            }
        }
    }

    /* renamed from: h */
    public void mo3585h(C0714m mVar) {
        this.f3458p.add(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public Fragment mo3586h0(String str) {
        return this.f3445c.mo3831f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo3587h1(Fragment fragment, boolean z) {
        ViewGroup q0 = m3758q0(fragment);
        if (q0 != null && (q0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) q0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3588i(Fragment fragment) {
        this.f3441M.mo3790e(fragment);
    }

    /* renamed from: i0 */
    public Fragment mo3589i0(int i) {
        return this.f3445c.mo3832g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo3590i1(Fragment fragment, C0769d.C0772c cVar) {
        if (!fragment.equals(mo3586h0(fragment.f3368g)) || !(fragment.f3382u == null || fragment.f3381t == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f3355S = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo3591j() {
        return this.f3451i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment mo3592j0(String str) {
        return this.f3445c.mo3833h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3593j1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3586h0(fragment.f3368g)) && (fragment.f3382u == null || fragment.f3381t == this))) {
            Fragment fragment2 = this.f3463u;
            this.f3463u = fragment;
            m3731M(fragment2);
            m3731M(this.f3463u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3594k(androidx.fragment.app.C0707h<?> r3, androidx.fragment.app.C0704e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.h<?> r0 = r2.f3460r
            if (r0 != 0) goto L_0x0108
            r2.f3460r = r3
            r2.f3461s = r4
            r2.f3462t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$i r4 = new androidx.fragment.app.FragmentManager$i
            r4.<init>(r5)
            r2.mo3585h(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.C0714m
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.m r4 = (androidx.fragment.app.C0714m) r4
            r2.mo3585h(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.f3462t
            if (r4 == 0) goto L_0x0026
            r2.m3754n1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.C0202c
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0202c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo641c()
            r2.f3449g = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.b r1 = r2.f3450h
            r0.mo665a(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r3 = r5.f3381t
            androidx.fragment.app.l r3 = r3.m3755o0(r5)
            r2.f3441M = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.C0795t
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.t r3 = (androidx.lifecycle.C0795t) r3
            androidx.lifecycle.s r3 = r3.mo643g()
            androidx.fragment.app.l r3 = androidx.fragment.app.C0712l.m4016i(r3)
            r2.f3441M = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r4 = 0
            r3.<init>(r4)
            r2.f3441M = r3
        L_0x005f:
            androidx.fragment.app.l r3 = r2.f3441M
            boolean r4 = r2.mo3551K0()
            r3.mo3800n(r4)
            androidx.fragment.app.p r3 = r2.f3445c
            androidx.fragment.app.l r4 = r2.f3441M
            r3.mo3849x(r4)
            androidx.fragment.app.h<?> r3 = r2.f3460r
            boolean r4 = r3 instanceof androidx.activity.result.C0211d
            if (r4 == 0) goto L_0x0107
            androidx.activity.result.d r3 = (androidx.activity.result.C0211d) r3
            androidx.activity.result.c r3 = r3.mo642e()
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f3368g
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = ""
        L_0x0093:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            e.c r0 = new e.c
            r0.<init>()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.activity.result.b r5 = r3.mo705h(r5, r0, r1)
            r2.f3468z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$k r0 = new androidx.fragment.app.FragmentManager$k
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.b r5 = r3.mo705h(r5, r0, r1)
            r2.f3429A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            e.b r5 = new e.b
            r5.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            androidx.activity.result.b r3 = r3.mo705h(r4, r5, r0)
            r2.f3430B = r3
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo3594k(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Fragment mo3595k0(String str) {
        return this.f3445c.mo3834i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3596l(Fragment fragment) {
        if (m3729F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3338B) {
            fragment.f3338B = false;
            if (!fragment.f3374m) {
                this.f3445c.mo3826a(fragment);
                if (m3729F0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m3730G0(fragment)) {
                    this.f3432D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3597l1(Fragment fragment) {
        if (m3729F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3337A) {
            fragment.f3337A = false;
            fragment.f3351O = !fragment.f3351O;
        }
    }

    /* renamed from: m */
    public C0720q mo3598m() {
        return new C0674a(this);
    }

    /* renamed from: n0 */
    public int mo3599n0() {
        ArrayList<C0674a> arrayList = this.f3446d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo3600o() {
        boolean z = false;
        for (Fragment next : this.f3445c.mo3837l()) {
            if (next != null) {
                z = m3730G0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public C0704e mo3601p0() {
        return this.f3461s;
    }

    /* renamed from: r */
    public final void mo3602r(String str) {
        this.f3452j.remove(str);
    }

    /* renamed from: r0 */
    public C0706g mo3603r0() {
        C0706g gVar = this.f3464v;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.f3462t;
        if (fragment != null) {
            return fragment.f3381t.mo3603r0();
        }
        return this.f3465w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public C0719p mo3604s0() {
        return this.f3445c;
    }

    /* renamed from: t0 */
    public List<Fragment> mo3605t0() {
        return this.f3445c.mo3839n();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3462t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3462t)));
            sb.append("}");
        } else {
            C0707h<?> hVar = this.f3460r;
            if (hVar != null) {
                sb.append(hVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3460r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3607u(C0674a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3685w(z3);
        } else {
            aVar.mo3684v();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f3459q >= 1) {
            C0722r.m4092B(this.f3460r.mo3770k(), this.f3461s, arrayList, arrayList2, 0, 1, true, this.f3456n);
        }
        if (z3) {
            mo3557O0(this.f3459q, true);
        }
        for (Fragment next : this.f3445c.mo3837l()) {
            if (next != null && next.f3345I != null && next.f3350N && aVar.mo3688z(next.f3386y)) {
                float f = next.f3352P;
                if (f > 0.0f) {
                    next.f3345I.setAlpha(f);
                }
                if (z3) {
                    next.f3352P = 0.0f;
                } else {
                    next.f3352P = -1.0f;
                    next.f3350N = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public C0707h<?> mo3608u0() {
        return this.f3460r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public LayoutInflater.Factory2 mo3609v0() {
        return this.f3448f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0716o mo3610w(Fragment fragment) {
        C0716o m = this.f3445c.mo3838m(fragment.f3368g);
        if (m != null) {
            return m;
        }
        C0716o oVar = new C0716o(this.f3457o, this.f3445c, fragment);
        oVar.mo3817m(this.f3460r.mo3770k().getClassLoader());
        oVar.mo3821r(this.f3459q);
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public C0709j mo3611w0() {
        return this.f3457o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public Fragment mo3612x0() {
        return this.f3462t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3613y(Fragment fragment) {
        if (m3729F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f3338B) {
            fragment.f3338B = true;
            if (fragment.f3374m) {
                if (m3729F0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3445c.mo3844s(fragment);
                if (m3730G0(fragment)) {
                    this.f3432D = true;
                }
                m3749k1(fragment);
            }
        }
    }

    /* renamed from: y0 */
    public Fragment mo3614y0() {
        return this.f3463u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3615z() {
        this.f3433E = false;
        this.f3434F = false;
        this.f3441M.mo3800n(false);
        m3733T(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C0756y mo3616z0() {
        C0756y yVar = this.f3466x;
        if (yVar != null) {
            return yVar;
        }
        Fragment fragment = this.f3462t;
        if (fragment != null) {
            return fragment.f3381t.mo3616z0();
        }
        return this.f3467y;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0653a();

        /* renamed from: b */
        String f3473b;

        /* renamed from: c */
        int f3474c;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        class C0653a implements Parcelable.Creator<LaunchedFragmentInfo> {
            C0653a() {
            }

            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        LaunchedFragmentInfo(String str, int i) {
            this.f3473b = str;
            this.f3474c = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3473b);
            parcel.writeInt(this.f3474c);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3473b = parcel.readString();
            this.f3474c = parcel.readInt();
        }
    }
}
