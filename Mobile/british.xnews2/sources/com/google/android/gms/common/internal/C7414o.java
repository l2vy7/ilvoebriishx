package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.o */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7414o {

    /* renamed from: b */
    private static C7414o f29349b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f29350c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    private RootTelemetryConfiguration f29351a;

    private C7414o() {
    }

    /* renamed from: b */
    public static synchronized C7414o m30045b() {
        C7414o oVar;
        synchronized (C7414o.class) {
            if (f29349b == null) {
                f29349b = new C7414o();
            }
            oVar = f29349b;
        }
        return oVar;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration mo30145a() {
        return this.f29351a;
    }

    /* renamed from: c */
    public final synchronized void mo30146c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f29351a = f29350c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f29351a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.mo30037G0() < rootTelemetryConfiguration.mo30037G0()) {
            this.f29351a = rootTelemetryConfiguration;
        }
    }
}
