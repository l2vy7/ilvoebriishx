package com.startapp.networkTest.controller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.startapp.C11934h2;
import com.startapp.C12112oa;
import com.startapp.C12356u2;
import com.startapp.C12385v4;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.enums.LocationProviders;
import java.util.List;

/* compiled from: Sta */
public class LocationController {

    /* renamed from: j */
    private static double f53339j = 0.0d;

    /* renamed from: k */
    private static double f53340k = 0.0d;

    /* renamed from: l */
    private static final String f53341l = "LocationController";

    /* renamed from: m */
    private static final boolean f53342m = false;

    /* renamed from: a */
    private LocationManager f53343a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f53344b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LocationInfo f53345c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Location f53346d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f53347e;

    /* renamed from: f */
    private C12082b f53348f;

    /* renamed from: g */
    private long f53349g = 4000;

    /* renamed from: h */
    private boolean f53350h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12083c f53351i;

    /* compiled from: Sta */
    public enum ProviderMode {
        Passive,
        Network,
        Gps,
        GpsAndNetwork,
        RailNet
    }

    /* renamed from: com.startapp.networkTest.controller.LocationController$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C12081a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53358a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.networkTest.controller.LocationController$ProviderMode[] r0 = com.startapp.networkTest.controller.LocationController.ProviderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53358a = r0
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Gps     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53358a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.GpsAndNetwork     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53358a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Network     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53358a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Passive     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.networkTest.controller.LocationController.C12081a.<clinit>():void");
        }
    }

    /* renamed from: com.startapp.networkTest.controller.LocationController$b */
    /* compiled from: Sta */
    public class C12082b implements LocationListener {
        private C12082b() {
        }

        public void onLocationChanged(Location location) {
            if (location != null && location.getProvider() != null) {
                if (LocationController.this.f53346d == null || location.getProvider().equals("gps") || LocationController.this.f53346d.getProvider() == null || !LocationController.this.f53346d.getProvider().equals("gps") || SystemClock.elapsedRealtime() - LocationController.this.f53344b >= DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                    Location unused = LocationController.this.f53346d = location;
                    long unused2 = LocationController.this.f53347e = SystemClock.elapsedRealtime();
                    LocationInfo unused3 = LocationController.this.f53345c = LocationController.m52638b(location);
                    LocationController.this.f53345c.LocationAge = 0;
                    long unused4 = LocationController.this.f53344b = SystemClock.elapsedRealtime();
                    if (LocationController.this.f53351i != null) {
                        LocationController.this.f53351i.mo45587a(LocationController.this.f53345c);
                    }
                    if (location.getProvider().equals("gps")) {
                        C12385v4.m53565f().mo45643a(location);
                    }
                }
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public /* synthetic */ C12082b(LocationController locationController, C12081a aVar) {
            this();
        }
    }

    /* renamed from: com.startapp.networkTest.controller.LocationController$c */
    /* compiled from: Sta */
    public interface C12083c {
        /* renamed from: a */
        void mo45587a(LocationInfo locationInfo);
    }

    public LocationController(Context context) {
        this.f53343a = (LocationManager) context.getSystemService("location");
        this.f53348f = new C12082b(this, (C12081a) null);
    }

    /* renamed from: e */
    public long mo45581e() {
        return this.f53349g;
    }

    /* renamed from: f */
    public void mo45582f() {
        C12082b bVar;
        LocationManager locationManager = this.f53343a;
        if (!(locationManager == null || (bVar = this.f53348f) == null)) {
            try {
                locationManager.removeUpdates(bVar);
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
        this.f53350h = false;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    private void m52641d() {
        Location location;
        List<String> allProviders = this.f53343a.getAllProviders();
        Location location2 = null;
        if (allProviders != null && allProviders.size() > 0) {
            Location location3 = null;
            for (int i = 0; i < allProviders.size(); i++) {
                try {
                    location = this.f53343a.getLastKnownLocation(allProviders.get(i));
                } catch (SecurityException e) {
                    C12356u2.m53524b(e);
                    location = null;
                    location3 = location;
                } catch (Throwable th) {
                    C12356u2.m53522a(th);
                    location = null;
                    location3 = location;
                }
                if (location != null && (location3 == null || location.getTime() > location3.getTime())) {
                    location3 = location;
                }
            }
            location2 = location3;
        }
        if (location2 != null) {
            this.f53346d = location2;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f53347e = location2.getElapsedRealtimeNanos() / 1000000;
            } else {
                this.f53347e = (System.currentTimeMillis() - location2.getTime()) + SystemClock.elapsedRealtime();
            }
            this.f53345c = m52638b(location2);
        }
    }

    /* renamed from: c */
    public LocationInfo mo45580c() {
        if (this.f53345c == null) {
            m52641d();
        }
        if (this.f53345c == null) {
            LocationInfo locationInfo = new LocationInfo();
            this.f53345c = locationInfo;
            locationInfo.LocationProvider = LocationProviders.Unknown;
        }
        LocationInfo locationInfo2 = this.f53345c;
        if (locationInfo2.LocationProvider != LocationProviders.Unknown) {
            locationInfo2.LocationAge = SystemClock.elapsedRealtime() - this.f53347e;
        }
        LocationInfo locationInfo3 = this.f53345c;
        f53339j = locationInfo3.LocationLatitude;
        f53340k = locationInfo3.LocationLongitude;
        try {
            return (LocationInfo) locationInfo3.clone();
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return this.f53345c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static LocationInfo m52638b(Location location) {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.LocationAccuracyHorizontal = (double) location.getAccuracy();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || !location.hasVerticalAccuracy()) {
            locationInfo.LocationAccuracyVertical = (double) location.getAccuracy();
        } else {
            locationInfo.LocationAccuracyVertical = (double) location.getVerticalAccuracyMeters();
        }
        long d = C12112oa.m52716d();
        locationInfo.locationTimestampMillis = d;
        locationInfo.LocationTimestamp = C11934h2.m52379b(d);
        locationInfo.LocationAltitude = location.getAltitude();
        locationInfo.LocationBearing = (double) location.getBearing();
        locationInfo.LocationLatitude = location.getLatitude();
        locationInfo.LocationLongitude = location.getLongitude();
        if (i >= 18) {
            locationInfo.IsMocked = location.isFromMockProvider() ? 1 : 0;
        }
        if (location.getProvider() == null) {
            locationInfo.LocationProvider = LocationProviders.Unknown;
        } else if (location.getProvider().equals("gps")) {
            locationInfo.LocationProvider = LocationProviders.Gps;
        } else if (location.getProvider().equals("network")) {
            locationInfo.LocationProvider = LocationProviders.Network;
        } else if (location.getProvider().equals("fused")) {
            locationInfo.LocationProvider = LocationProviders.Fused;
        } else {
            locationInfo.LocationProvider = LocationProviders.Unknown;
        }
        locationInfo.LocationSpeed = (double) location.getSpeed();
        return locationInfo;
    }

    /* renamed from: a */
    public void mo45578a(ProviderMode providerMode) {
        LocationManager locationManager;
        boolean z;
        boolean z2;
        if (providerMode != null && (locationManager = this.f53343a) != null) {
            this.f53350h = true;
            List<String> allProviders = locationManager.getAllProviders();
            boolean z3 = false;
            if (allProviders != null) {
                boolean z4 = false;
                z2 = false;
                z = false;
                for (String next : allProviders) {
                    next.getClass();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -792039641:
                            if (next.equals("passive")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 102570:
                            if (next.equals("gps")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1843485230:
                            if (next.equals("network")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            z = true;
                            break;
                        case 1:
                            z4 = true;
                            break;
                        case 2:
                            z2 = true;
                            break;
                    }
                }
                z3 = z4;
            } else {
                z2 = false;
                z = false;
            }
            try {
                int i = C12081a.f53358a[providerMode.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (z3) {
                            this.f53343a.requestLocationUpdates("gps", 500, 5.0f, this.f53348f);
                        }
                        if (z2) {
                            this.f53343a.requestLocationUpdates("network", 0, 0.0f, this.f53348f);
                        }
                    } else if (i != 3) {
                        if (i == 4) {
                            if (z) {
                                this.f53343a.requestLocationUpdates("passive", 0, 0.0f, this.f53348f);
                            }
                        }
                    } else if (z2) {
                        this.f53343a.requestLocationUpdates("network", 0, 0.0f, this.f53348f);
                    }
                } else if (z3) {
                    this.f53343a.requestLocationUpdates("gps", 500, 5.0f, this.f53348f);
                }
            } catch (SecurityException e) {
                C12356u2.m53524b(e);
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo45579a(C12083c cVar) {
        this.f53351i = cVar;
    }

    /* renamed from: a */
    public static double m52629a() {
        return f53339j;
    }

    /* renamed from: a */
    public void mo45577a(long j) {
        this.f53349g = j;
    }

    /* renamed from: b */
    public static double m52635b() {
        return f53340k;
    }
}
