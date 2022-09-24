package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.jc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7826jc extends C7827jd {
    public C7826jc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", d8Var, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        this.f33848e.mo31157Z(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f33849f.invoke((Object) null, new Object[]{this.f33845b.mo36029b()})).booleanValue();
            C7600d8 d8Var = this.f33848e;
            if (true == booleanValue) {
                i = 2;
            }
            d8Var.mo31157Z(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
