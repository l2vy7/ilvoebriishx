package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.mo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7948mo {

    /* renamed from: a */
    private final int f35586a;

    /* renamed from: b */
    private final C4614jo f35587b = new C8022oo();

    public C7948mo(int i) {
        this.f35586a = i;
    }

    /* renamed from: a */
    public final String mo33577a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList.get(i).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        C7911lo loVar = new C7911lo();
        PriorityQueue priorityQueue = new PriorityQueue(this.f35586a, new C7874ko(this));
        for (String b : split) {
            String[] b2 = C4615no.m20741b(b, false);
            if (b2.length != 0) {
                C4621ro.m20904c(b2, this.f35586a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                loVar.f35149b.write(this.f35587b.mo18456b(((C8093qo) it.next()).f38206b));
            } catch (IOException e) {
                co0.zzh("Error while writing hash to byteStream", e);
            }
        }
        return loVar.toString();
    }
}
