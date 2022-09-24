package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;

class FragmentStateAdapter$5 implements C0773e {

    /* renamed from: a */
    final /* synthetic */ Handler f6195a;

    /* renamed from: b */
    final /* synthetic */ Runnable f6196b;

    /* renamed from: c */
    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
        if (bVar == C0769d.C0771b.ON_DESTROY) {
            this.f6195a.removeCallbacks(this.f6196b);
            gVar.mo639a().mo3986c(this);
        }
    }
}
