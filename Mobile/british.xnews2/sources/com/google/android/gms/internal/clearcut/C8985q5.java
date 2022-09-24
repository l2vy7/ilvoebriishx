package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: com.google.android.gms.internal.clearcut.q5 */
public final class C8985q5 extends C7387f<C9013u5> {
    public C8985q5(Context context, Looper looper, C4601e eVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 40, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof C9013u5 ? (C9013u5) queryLocalInterface : new C9020v5(iBinder);
    }

    public final int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
