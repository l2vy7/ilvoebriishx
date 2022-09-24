package com.google.android.gms.cast.framework.media;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;
import p244q4.C10943m;
import p244q4.C10946p;

/* renamed from: com.google.android.gms.cast.framework.media.z */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7164z implements C10946p {

    /* renamed from: a */
    final /* synthetic */ C7107b0 f28829a;

    C7164z(C7107b0 b0Var) {
        this.f28829a = b0Var;
    }

    /* renamed from: a */
    public final void mo29607a(long j) {
        try {
            C7107b0 b0Var = this.f28829a;
            b0Var.mo29791i(new C7103a0(b0Var, new Status(IronSourceConstants.IS_CHECK_CAPPED_TRUE)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    /* renamed from: b */
    public final void mo29608b(long j, int i, Object obj) {
        MediaError mediaError = null;
        if (true != (obj instanceof C10943m)) {
            obj = null;
        }
        try {
            C7107b0 b0Var = this.f28829a;
            Status status = new Status(i);
            JSONObject jSONObject = obj != null ? ((C10943m) obj).f49864a : null;
            if (obj != null) {
                mediaError = ((C10943m) obj).f49865b;
            }
            b0Var.mo29791i(new C7110c0(status, jSONObject, mediaError));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}
