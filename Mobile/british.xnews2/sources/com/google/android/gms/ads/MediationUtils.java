package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.p00;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MediationUtils {
    @RecentlyNullable
    public static AdSize findClosestSize(@RecentlyNonNull Context context, @RecentlyNonNull AdSize adSize, @RecentlyNonNull List<AdSize> list) {
        AdSize adSize2 = null;
        if (!(list == null || adSize == null)) {
            if (!adSize.mo17592h() && !adSize.mo17594i()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(((float) adSize.getWidthInPixels(context)) / f), Math.round(((float) adSize.getHeightInPixels(context)) / f));
            }
            for (AdSize next : list) {
                if (next != null) {
                    int width = adSize.getWidth();
                    int width2 = next.getWidth();
                    int height = adSize.getHeight();
                    int height2 = next.getHeight();
                    double d = (double) width;
                    Double.isNaN(d);
                    if (d * 0.5d <= ((double) width2) && width >= width2) {
                        if (adSize.mo17594i()) {
                            int a = adSize.mo17580a();
                            if (((Integer) C8311wv.m39277c().mo18570b(p00.f36917K5)).intValue() <= width2) {
                                if (((Integer) C8311wv.m39277c().mo18570b(p00.f36925L5)).intValue() <= height2) {
                                    if (a < height2) {
                                    }
                                }
                            }
                        } else if (!adSize.mo17592h()) {
                            double d2 = (double) height;
                            Double.isNaN(d2);
                            if (d2 * 0.7d <= ((double) height2)) {
                                if (height < height2) {
                                }
                            }
                        } else if (adSize.mo17581b() < height2) {
                        }
                        if (adSize2 == null || adSize2.getWidth() * adSize2.getHeight() <= next.getWidth() * next.getHeight()) {
                            adSize2 = next;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
