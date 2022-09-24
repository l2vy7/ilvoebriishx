package p199d6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: d6.i */
/* compiled from: MotionTiming */
public class C10501i {

    /* renamed from: a */
    private long f49023a = 0;

    /* renamed from: b */
    private long f49024b = 300;

    /* renamed from: c */
    private TimeInterpolator f49025c = null;

    /* renamed from: d */
    private int f49026d = 0;

    /* renamed from: e */
    private int f49027e = 1;

    public C10501i(long j, long j2) {
        this.f49023a = j;
        this.f49024b = j2;
    }

    /* renamed from: b */
    static C10501i m48224b(ValueAnimator valueAnimator) {
        C10501i iVar = new C10501i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m48225f(valueAnimator));
        iVar.f49026d = valueAnimator.getRepeatCount();
        iVar.f49027e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m48225f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C10493a.f49009b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C10493a.f49010c;
        }
        return interpolator instanceof DecelerateInterpolator ? C10493a.f49011d : interpolator;
    }

    /* renamed from: a */
    public void mo42632a(Animator animator) {
        animator.setStartDelay(mo42633c());
        animator.setDuration(mo42634d());
        animator.setInterpolator(mo42635e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo42637g());
            valueAnimator.setRepeatMode(mo42638h());
        }
    }

    /* renamed from: c */
    public long mo42633c() {
        return this.f49023a;
    }

    /* renamed from: d */
    public long mo42634d() {
        return this.f49024b;
    }

    /* renamed from: e */
    public TimeInterpolator mo42635e() {
        TimeInterpolator timeInterpolator = this.f49025c;
        return timeInterpolator != null ? timeInterpolator : C10493a.f49009b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10501i)) {
            return false;
        }
        C10501i iVar = (C10501i) obj;
        if (mo42633c() == iVar.mo42633c() && mo42634d() == iVar.mo42634d() && mo42637g() == iVar.mo42637g() && mo42638h() == iVar.mo42638h()) {
            return mo42635e().getClass().equals(iVar.mo42635e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo42637g() {
        return this.f49026d;
    }

    /* renamed from: h */
    public int mo42638h() {
        return this.f49027e;
    }

    public int hashCode() {
        return (((((((((int) (mo42633c() ^ (mo42633c() >>> 32))) * 31) + ((int) (mo42634d() ^ (mo42634d() >>> 32)))) * 31) + mo42635e().getClass().hashCode()) * 31) + mo42637g()) * 31) + mo42638h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo42633c() + " duration: " + mo42634d() + " interpolator: " + mo42635e().getClass() + " repeatCount: " + mo42637g() + " repeatMode: " + mo42638h() + "}\n";
    }

    public C10501i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f49023a = j;
        this.f49024b = j2;
        this.f49025c = timeInterpolator;
    }
}
