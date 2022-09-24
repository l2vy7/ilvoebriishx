package p255u5;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C4667d3;
import com.google.android.gms.measurement.internal.C4670h4;

/* renamed from: u5.j */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C11035j {

    /* renamed from: a */
    private final C11034i f49994a;

    public C11035j(C11034i iVar) {
        C4604n.m20098k(iVar);
        this.f49994a = iVar;
    }

    /* renamed from: a */
    public final void mo43341a(Context context, Intent intent) {
        C4670h4 H = C4670h4.m21577H(context, (zzcl) null, (Long) null);
        C4667d3 j = H.mo19276j();
        if (intent == null) {
            j.mo19287w().mo38856a("Receiver called with null intent");
            return;
        }
        H.mo19275g();
        String action = intent.getAction();
        j.mo19286v().mo38857b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            j.mo19286v().mo38856a("Starting wakeful intent.");
            this.f49994a.mo38805a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            j.mo19287w().mo38856a("Install Referrer Broadcasts are deprecated");
        }
    }
}
