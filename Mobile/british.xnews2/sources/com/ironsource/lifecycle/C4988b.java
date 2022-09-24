package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.b */
public final class C4988b extends Fragment {

    /* renamed from: b */
    C4989a f22060b;

    /* renamed from: com.ironsource.lifecycle.b$a */
    interface C4989a {
        /* renamed from: a */
        void mo20608a(Activity activity);

        /* renamed from: b */
        void mo20609b(Activity activity);
    }

    /* renamed from: a */
    static C4988b m22843a(Activity activity) {
        return (C4988b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    /* renamed from: b */
    static void m22844b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new C4988b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f22060b != null) {
            getActivity();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f22060b = null;
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        C4989a aVar = this.f22060b;
        if (aVar != null) {
            aVar.mo20609b(getActivity());
        }
    }

    public final void onStart() {
        super.onStart();
        C4989a aVar = this.f22060b;
        if (aVar != null) {
            aVar.mo20608a(getActivity());
        }
    }

    public final void onStop() {
        super.onStop();
    }
}
