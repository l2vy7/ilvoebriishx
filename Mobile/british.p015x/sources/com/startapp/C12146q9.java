package com.startapp;

import android.app.Activity;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.q9 */
/* compiled from: Sta */
public class C12146q9 {

    /* renamed from: a */
    public final Map<C12147a, String> f54069a = new ConcurrentHashMap();

    /* renamed from: com.startapp.q9$a */
    /* compiled from: Sta */
    public static class C12147a {

        /* renamed from: a */
        public final AdPreferences.Placement f54070a;

        /* renamed from: b */
        public final int f54071b;

        public C12147a(AdPreferences.Placement placement, int i) {
            this.f54070a = placement;
            this.f54071b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12147a.class != obj.getClass()) {
                return false;
            }
            C12147a aVar = (C12147a) obj;
            if (this.f54071b == aVar.f54071b && this.f54070a == aVar.f54070a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object[] objArr = {this.f54070a, Integer.valueOf(this.f54071b)};
            Map<Activity, Integer> map = C5015nb.f22145a;
            return Arrays.deepHashCode(objArr);
        }
    }
}
