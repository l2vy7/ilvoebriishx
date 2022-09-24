package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ut2 implements tt2 {

    /* renamed from: a */
    private final Object[] f39971a;

    public ut2(zzbfd zzbfd, String str, int i, String str2, zzbfo zzbfo) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzbfd.f42941c));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m38447a(zzbfd.f42942d));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzbfd.f42942d.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzbfd.f42943e));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = zzbfd.f42944f;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzbfd.f42945g));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzbfd.f42946h));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzbfd.f42947i));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzbfd.f42948j);
        }
        if (hashSet.contains("location")) {
            Location location = zzbfd.f42950l;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzbfd.f42951m);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m38447a(zzbfd.f42952n));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m38447a(zzbfd.f42953o));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = zzbfd.f42954p;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzbfd.f42955q);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzbfd.f42956r);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzbfd.f42957s));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzbfd.f42959u));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzbfd.f42960v);
        }
        if (hashSet.contains(AdUnitActivity.EXTRA_ORIENTATION)) {
            if (zzbfo != null) {
                arrayList.add(Integer.valueOf(zzbfo.f42983b));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.f39971a = arrayList.toArray();
    }

    /* renamed from: a */
    private static String m38447a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = m38447a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ut2)) {
            return false;
        }
        return Arrays.equals(this.f39971a, ((ut2) obj).f39971a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39971a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f39971a);
        String arrays = Arrays.toString(this.f39971a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
