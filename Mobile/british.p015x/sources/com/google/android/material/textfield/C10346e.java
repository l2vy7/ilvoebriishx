package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
/* compiled from: EndIconDelegate */
abstract class C10346e {

    /* renamed from: a */
    TextInputLayout f48665a;

    /* renamed from: b */
    Context f48666b;

    /* renamed from: c */
    CheckableImageButton f48667c;

    C10346e(TextInputLayout textInputLayout) {
        this.f48665a = textInputLayout;
        this.f48666b = textInputLayout.getContext();
        this.f48667c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo41707a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo41723b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41708c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo41724d() {
        return false;
    }
}
