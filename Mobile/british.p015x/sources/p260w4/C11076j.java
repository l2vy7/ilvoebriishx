package p260w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import p229l5.C10713a;
import p229l5.C10715c;

/* renamed from: w4.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C11076j extends C10713a {
    C11076j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: n6 */
    public final void mo43351n6(TelemetryData telemetryData) throws RemoteException {
        Parcel x = mo42870x();
        C10715c.m48548c(x, telemetryData);
        mo42869m6(1, x);
    }
}
