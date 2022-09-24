package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0608c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.i */
/* compiled from: TwilightManager */
class C0268i {

    /* renamed from: d */
    private static C0268i f815d;

    /* renamed from: a */
    private final Context f816a;

    /* renamed from: b */
    private final LocationManager f817b;

    /* renamed from: c */
    private final C0269a f818c = new C0269a();

    /* renamed from: androidx.appcompat.app.i$a */
    /* compiled from: TwilightManager */
    private static class C0269a {

        /* renamed from: a */
        boolean f819a;

        /* renamed from: b */
        long f820b;

        /* renamed from: c */
        long f821c;

        /* renamed from: d */
        long f822d;

        /* renamed from: e */
        long f823e;

        /* renamed from: f */
        long f824f;

        C0269a() {
        }
    }

    C0268i(Context context, LocationManager locationManager) {
        this.f816a = context;
        this.f817b = locationManager;
    }

    /* renamed from: a */
    static C0268i m1257a(Context context) {
        if (f815d == null) {
            Context applicationContext = context.getApplicationContext();
            f815d = new C0268i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f815d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1258b() {
        Location location = null;
        Location c = C0608c.m3321c(this.f816a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1259c("network") : null;
        if (C0608c.m3321c(this.f816a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1259c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m1259c(String str) {
        try {
            if (this.f817b.isProviderEnabled(str)) {
                return this.f817b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m1260e() {
        return this.f818c.f824f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m1261f(Location location) {
        long j;
        C0269a aVar = this.f818c;
        long currentTimeMillis = System.currentTimeMillis();
        C0267h b = C0267h.m1255b();
        C0267h hVar = b;
        hVar.mo957a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f812a;
        hVar.mo957a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f814c == 1;
        long j3 = b.f813b;
        long j4 = j2;
        long j5 = b.f812a;
        long j6 = j3;
        boolean z2 = z;
        b.mo957a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f813b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f819a = z2;
        aVar.f820b = j4;
        aVar.f821c = j6;
        aVar.f822d = j5;
        aVar.f823e = j7;
        aVar.f824f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo958d() {
        C0269a aVar = this.f818c;
        if (m1260e()) {
            return aVar.f819a;
        }
        Location b = m1258b();
        if (b != null) {
            m1261f(b);
            return aVar.f819a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
