package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C11421g;
import com.ironsource.mediationsdk.model.C11426l;
import com.ironsource.mediationsdk.model.C11428m;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ironsource.mediationsdk.utils.c */
public class C11484c {

    /* renamed from: a */
    private boolean f51551a = true;

    /* renamed from: b */
    private IronSourceError f51552b = null;

    /* renamed from: com.ironsource.mediationsdk.utils.c$a */
    public enum C11485a {
        ;
        

        /* renamed from: a */
        public static final int f51553a = 1;

        /* renamed from: b */
        public static final int f51554b = 2;

        /* renamed from: c */
        public static final int f51555c = 3;

        /* renamed from: d */
        public static final int f51556d = 4;

        static {
            f51557e = new int[]{1, 2, 3, 4};
        }

        /* renamed from: a */
        public static int[] m51255a() {
            return (int[]) f51557e.clone();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.utils.c$b */
    static /* synthetic */ class C11486b {

        /* renamed from: a */
        static final /* synthetic */ int[] f51558a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ironsource.mediationsdk.model.m[] r0 = com.ironsource.mediationsdk.model.C11428m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51558a = r0
                com.ironsource.mediationsdk.model.m r1 = com.ironsource.mediationsdk.model.C11428m.PER_DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51558a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.model.m r1 = com.ironsource.mediationsdk.model.C11428m.PER_HOUR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11484c.C11486b.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static int m51231a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.m51214a(context, m51246d(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return C11485a.f51553a;
        }
        if (IronSourceUtils.m51214a(context, m51246d(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - IronSourceUtils.m51223j(context, m51246d(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0) < ((long) (IronSourceUtils.m51222i(context, m51246d(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000))) {
                return C11485a.f51555c;
            }
        }
        if (IronSourceUtils.m51214a(context, m51246d(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int i = IronSourceUtils.m51222i(context, m51246d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String d = m51246d(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int i2 = IronSourceUtils.m51222i(context, d, 0);
            String d2 = m51246d(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= IronSourceUtils.m51223j(context, d2, 0)) {
                IronSourceUtils.m51228o(context, d, 0);
                IronSourceUtils.m51229p(context, d2, 0);
            } else if (i2 >= i) {
                return C11485a.f51554b;
            }
        }
        return C11485a.f51556d;
    }

    /* renamed from: a */
    public static synchronized void m51232a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C11484c.class) {
            if (context != null) {
                C11426l placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m51249e(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m51233a(Context context, Placement placement) {
        synchronized (C11484c.class) {
            if (context != null) {
                C11426l placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m51249e(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m51234a(Context context, C11421g gVar) {
        synchronized (C11484c.class) {
            if (context != null) {
                C11426l placementAvailabilitySettings = gVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m51249e(context, IronSourceConstants.BANNER_AD_UNIT, gVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m51235a(Context context, String str) {
        boolean z;
        synchronized (C11484c.class) {
            z = m51231a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != C11485a.f51556d;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized boolean m51236a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (C11484c.class) {
            z = m51231a(context, m51242c(ad_unit), str) != C11485a.f51556d;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized int m51237b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C11484c.class) {
            if (!(context == null || interstitialPlacement == null)) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    int a = m51231a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                    return a;
                }
            }
            int i = C11485a.f51556d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized int m51238b(Context context, Placement placement) {
        synchronized (C11484c.class) {
            if (!(context == null || placement == null)) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    int a = m51231a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                    return a;
                }
            }
            int i = C11485a.f51556d;
            return i;
        }
    }

    /* renamed from: b */
    private static long m51239b(C11428m mVar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = C11486b.f51558a[mVar.ordinal()];
        if (i == 1) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 0);
            instance.add(6, 1);
        } else if (i == 2) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.add(11, 1);
        }
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    public static synchronized void m51240b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (C11484c.class) {
            m51251f(context, m51242c(ad_unit), str);
        }
    }

    /* renamed from: b */
    public static synchronized boolean m51241b(Context context, String str) {
        boolean z;
        synchronized (C11484c.class) {
            z = m51231a(context, IronSourceConstants.BANNER_AD_UNIT, str) != C11485a.f51556d;
        }
        return z;
    }

    /* renamed from: c */
    private static String m51242c(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit.toString();
    }

    /* renamed from: c */
    public static synchronized void m51243c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C11484c.class) {
            if (interstitialPlacement != null) {
                m51251f(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m51244c(Context context, Placement placement) {
        synchronized (C11484c.class) {
            if (placement != null) {
                m51251f(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m51245c(Context context, String str) {
        boolean z;
        synchronized (C11484c.class) {
            z = m51231a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != C11485a.f51556d;
        }
        return z;
    }

    /* renamed from: d */
    private static String m51246d(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    /* renamed from: d */
    public static synchronized void m51247d(Context context, String str) {
        synchronized (C11484c.class) {
            m51251f(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    /* renamed from: e */
    public static synchronized void m51248e(Context context, String str) {
        synchronized (C11484c.class) {
            m51251f(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    /* renamed from: e */
    private static void m51249e(Context context, String str, String str2, C11426l lVar) {
        boolean z = lVar.f51399a;
        IronSourceUtils.m51226m(context, m51246d(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = lVar.f51400b;
            IronSourceUtils.m51226m(context, m51246d(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.m51228o(context, m51246d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), lVar.f51403e);
                IronSourceUtils.m51230q(context, m51246d(str, "CappingManager.CAPPING_TYPE", str2), lVar.f51402d.toString());
            }
            boolean z3 = lVar.f51401c;
            IronSourceUtils.m51226m(context, m51246d(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.m51228o(context, m51246d(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), lVar.f51404f);
            }
        }
    }

    /* renamed from: f */
    public static synchronized void m51250f(Context context, String str) {
        synchronized (C11484c.class) {
            if (!TextUtils.isEmpty(str)) {
                m51251f(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    /* renamed from: f */
    private static void m51251f(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.m51214a(context, m51246d(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.m51229p(context, m51246d(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.m51214a(context, m51246d(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.m51222i(context, m51246d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String d = m51246d(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int i2 = IronSourceUtils.m51222i(context, d, 0);
            if (i2 == 0) {
                String l = IronSourceUtils.m51225l(context, m51246d(str, "CappingManager.CAPPING_TYPE", str2), C11428m.PER_DAY.toString());
                C11428m mVar = null;
                C11428m[] values = C11428m.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C11428m mVar2 = values[i];
                    if (mVar2.f51414c.equals(l)) {
                        mVar = mVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.m51229p(context, m51246d(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), m51239b(mVar));
            }
            IronSourceUtils.m51228o(context, d, i2 + 1);
        }
    }

    /* renamed from: a */
    public void mo44541a(IronSourceError ironSourceError) {
        this.f51551a = false;
        this.f51552b = ironSourceError;
    }

    /* renamed from: a */
    public boolean mo44542a() {
        return this.f51551a;
    }

    /* renamed from: b */
    public IronSourceError mo44543b() {
        return this.f51552b;
    }

    public String toString() {
        StringBuilder sb;
        if (mo44542a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f51551a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f51551a);
            sb.append(", IronSourceError:");
            sb.append(this.f51552b);
        }
        return sb.toString();
    }
}
