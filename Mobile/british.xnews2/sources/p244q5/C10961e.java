package p244q5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: q5.e */
public final class C10961e extends C7387f<C10958b> {
    public C10961e(Context context, Looper looper, C4601e eVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 51, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof C10958b ? (C10958b) queryLocalInterface : new C10959c(iBinder);
    }

    public final int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
