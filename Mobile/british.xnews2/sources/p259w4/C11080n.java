package p259w4;

import com.google.android.gms.common.api.internal.C7291p;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: w4.n */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C11080n implements C7291p {

    /* renamed from: a */
    public final /* synthetic */ TelemetryData f50017a;

    public /* synthetic */ C11080n(TelemetryData telemetryData) {
        this.f50017a = telemetryData;
    }

    public final void accept(Object obj, Object obj2) {
        TelemetryData telemetryData = this.f50017a;
        int i = C11082p.f50021d;
        ((C11076j) ((C11083q) obj).getService()).mo43351n6(telemetryData);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
