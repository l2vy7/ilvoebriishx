package p152t2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C3319b;
import com.bumptech.glide.C3335j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: t2.o */
/* compiled from: SupportRequestManagerFragment */
public class C6123o extends Fragment {

    /* renamed from: m0 */
    private final C6104a f25373m0;

    /* renamed from: n0 */
    private final C6121m f25374n0;

    /* renamed from: o0 */
    private final Set<C6123o> f25375o0;

    /* renamed from: p0 */
    private C6123o f25376p0;

    /* renamed from: q0 */
    private C3335j f25377q0;

    /* renamed from: r0 */
    private Fragment f25378r0;

    /* renamed from: t2.o$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C6124a implements C6121m {
        C6124a() {
        }

        /* renamed from: a */
        public Set<C3335j> mo23432a() {
            Set<C6123o> O1 = C6123o.this.mo23461O1();
            HashSet hashSet = new HashSet(O1.size());
            for (C6123o next : O1) {
                if (next.mo23463R1() != null) {
                    hashSet.add(next.mo23463R1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C6123o.this + "}";
        }
    }

    public C6123o() {
        this(new C6104a());
    }

    /* renamed from: N1 */
    private void m26886N1(C6123o oVar) {
        this.f25375o0.add(oVar);
    }

    /* renamed from: Q1 */
    private Fragment m26887Q1() {
        Fragment J = mo3368J();
        return J != null ? J : this.f25378r0;
    }

    /* renamed from: T1 */
    private static FragmentManager m26888T1(Fragment fragment) {
        while (fragment.mo3368J() != null) {
            fragment = fragment.mo3368J();
        }
        return fragment.mo3350D();
    }

    /* renamed from: U1 */
    private boolean m26889U1(Fragment fragment) {
        Fragment Q1 = m26887Q1();
        while (true) {
            Fragment J = fragment.mo3368J();
            if (J == null) {
                return false;
            }
            if (J.equals(Q1)) {
                return true;
            }
            fragment = fragment.mo3368J();
        }
    }

    /* renamed from: V1 */
    private void m26890V1(Context context, FragmentManager fragmentManager) {
        m26892Z1();
        C6123o j = C3319b.m11097c(context).mo11098k().mo23451j(context, fragmentManager);
        this.f25376p0 = j;
        if (!equals(j)) {
            this.f25376p0.m26886N1(this);
        }
    }

    /* renamed from: W1 */
    private void m26891W1(C6123o oVar) {
        this.f25375o0.remove(oVar);
    }

    /* renamed from: Z1 */
    private void m26892Z1() {
        C6123o oVar = this.f25376p0;
        if (oVar != null) {
            oVar.m26891W1(this);
            this.f25376p0 = null;
        }
    }

    /* renamed from: B0 */
    public void mo3345B0() {
        super.mo3345B0();
        this.f25378r0 = null;
        m26892Z1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public Set<C6123o> mo23461O1() {
        C6123o oVar = this.f25376p0;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f25375o0);
        }
        HashSet hashSet = new HashSet();
        for (C6123o next : this.f25376p0.mo23461O1()) {
            if (m26889U1(next.m26887Q1())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public C6104a mo23462P1() {
        return this.f25373m0;
    }

    /* renamed from: Q0 */
    public void mo3387Q0() {
        super.mo3387Q0();
        this.f25373m0.mo23427d();
    }

    /* renamed from: R0 */
    public void mo3389R0() {
        super.mo3389R0();
        this.f25373m0.mo23428e();
    }

    /* renamed from: R1 */
    public C3335j mo23463R1() {
        return this.f25377q0;
    }

    /* renamed from: S1 */
    public C6121m mo23464S1() {
        return this.f25374n0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public void mo23465X1(Fragment fragment) {
        FragmentManager T1;
        this.f25378r0 = fragment;
        if (fragment != null && fragment.mo3466w() != null && (T1 = m26888T1(fragment)) != null) {
            m26890V1(fragment.mo3466w(), T1);
        }
    }

    /* renamed from: Y1 */
    public void mo23466Y1(C3335j jVar) {
        this.f25377q0 = jVar;
    }

    /* renamed from: q0 */
    public void mo3447q0(Context context) {
        super.mo3447q0(context);
        FragmentManager T1 = m26888T1(this);
        if (T1 != null) {
            try {
                m26890V1(mo3466w(), T1);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public String toString() {
        return super.toString() + "{parent=" + m26887Q1() + "}";
    }

    /* renamed from: y0 */
    public void mo3471y0() {
        super.mo3471y0();
        this.f25373m0.mo23426c();
        m26892Z1();
    }

    @SuppressLint({"ValidFragment"})
    public C6123o(C6104a aVar) {
        this.f25374n0 = new C6124a();
        this.f25375o0 = new HashSet();
        this.f25373m0 = aVar;
    }
}
