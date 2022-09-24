package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C12320b;

/* renamed from: com.startapp.bb */
/* compiled from: Sta */
public class C11806bb extends C12320b {
    public C11806bb(Context context, C12320b.C12321a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        C11828cb b = ComponentLocator.m23305a(this.context).f22446l.mo46698b();
        C12320b.C12321a aVar = this.callback;
        if (aVar != null) {
            b.f52686e.post(new C11871db(b, aVar, this));
        } else {
            b.f52686e.post(b.f52691j);
        }
    }
}
