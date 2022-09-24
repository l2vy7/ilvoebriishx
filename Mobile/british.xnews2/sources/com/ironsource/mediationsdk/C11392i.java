package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.i */
public final class C11392i {

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<C11393a>> f51212a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f51213b;

    /* renamed from: com.ironsource.mediationsdk.i$a */
    public enum C11393a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C11392i(List<String> list, int i) {
        this.f51213b = i;
        for (String put : list) {
            ArrayList arrayList = new ArrayList();
            this.f51212a.put(put, arrayList);
        }
    }

    /* renamed from: a */
    public final String mo44294a(String str) {
        ArrayList arrayList = this.f51212a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((C11393a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo44295a(ConcurrentHashMap<String, C11393a> concurrentHashMap) {
        if (this.f51213b != 0) {
            for (String next : this.f51212a.keySet()) {
                C11393a aVar = C11393a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f51212a.get(next);
                if (this.f51213b != -1 && arrayList.size() == this.f51213b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}
