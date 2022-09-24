package com.google.ads.interactivemedia.p038v3.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hh */
/* compiled from: IMASDK */
public final class C4042hh extends C4068ig {
    public C4042hh(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "ymEBQrm9U6oe66zraL8TMCz2DXOLL9KQTnrV40u0sowIyd/opEzPMlsdilx/qVZg", "EUHQvfImnZF71YZIWfpsbLorbTgsT1XsQrZZ+fhXkl4=", kVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        C3830ab abVar;
        this.f17423d.mo16068c(C3830ab.ENUM_FAILURE);
        try {
            boolean booleanValue = ((Boolean) this.f17424e.invoke((Object) null, new Object[]{this.f17420a.mo15893a()})).booleanValue();
            C4115k kVar = this.f17423d;
            if (booleanValue) {
                abVar = C3830ab.ENUM_TRUE;
            } else {
                abVar = C3830ab.ENUM_FALSE;
            }
            kVar.mo16068c(abVar);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
