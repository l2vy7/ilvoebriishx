package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.m */
/* compiled from: PickerFragment */
abstract class C10134m<S> extends Fragment {

    /* renamed from: m0 */
    protected final LinkedHashSet<C10133l<S>> f47787m0 = new LinkedHashSet<>();

    C10134m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public boolean mo40497N1(C10133l<S> lVar) {
        return this.f47787m0.add(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void mo40540O1() {
        this.f47787m0.clear();
    }
}
