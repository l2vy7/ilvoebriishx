package com.appnext.base.moments.services.p032a;

import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.base.moments.operations.C3141b;
import com.appnext.base.moments.p028a.p029a.C3130c;
import com.appnext.base.moments.p031b.C3138c;
import com.appnext.base.p027b.C3126b;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* renamed from: com.appnext.base.moments.services.a.a */
public abstract class C3145a {
    /* renamed from: n */
    private static long m10624n(String str) {
        try {
            if (str.length() != 4) {
                return -1;
            }
            int parseInt = Integer.parseInt(str.substring(0, 2));
            int parseInt2 = Integer.parseInt(str.substring(2, 4));
            Calendar instance = Calendar.getInstance();
            instance.set(11, parseInt);
            instance.set(12, parseInt2);
            instance.set(13, 0);
            if (new Date().after(instance.getTime())) {
                instance.add(5, 1);
            }
            return instance.getTimeInMillis();
        } catch (Throwable th) {
            C3117a.m10553a("ServiceSchedulingLogic$getStartTime", th);
            return -1;
        }
    }

    /* renamed from: a */
    public abstract void mo10584a(C3130c cVar, long j, long j2);

    /* renamed from: a */
    public final void mo10585a(C3130c cVar, boolean z) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.mo10563Y())) {
                    return;
                }
                if (!cVar.mo10563Y().equals("off")) {
                    long j = 0;
                    if (cVar.mo10564Z() != null && cVar.mo10565aa().equals("time")) {
                        if (!z) {
                            j = m10624n(cVar.mo10564Z());
                        }
                        if (j != -1) {
                            mo10584a(cVar, j + m10623a(-1800000, 1800000), 86400000);
                        }
                    } else if (cVar.mo10567ac() != null && cVar.mo10567ac().equals("interval")) {
                        long c = C3138c.m10613c(cVar.mo10564Z(), cVar.mo10565aa());
                        if (c != -1) {
                            C3126b ak = C3126b.m10572ak();
                            long a = ak.mo10548a(cVar.mo10568ad() + "_lastupdate", 0);
                            if (a != 0) {
                                if (!z) {
                                    mo10584a(cVar, c + a, c);
                                    return;
                                }
                            }
                            mo10584a(cVar, System.currentTimeMillis(), c);
                        }
                    } else if (cVar.mo10567ac() != null && cVar.mo10567ac().equals("once")) {
                        mo10584a(cVar, System.currentTimeMillis(), 0);
                    }
                }
            } catch (Throwable th) {
                C3117a.m10553a("ServiceSchedulingLogic$scheduleOperation", th);
            }
        }
    }

    /* renamed from: c */
    public final void mo10587c(C3130c cVar) {
        if (cVar != null) {
            try {
                C3141b.m10618aj().mo10582c(cVar);
                mo10588d(cVar);
            } catch (Throwable th) {
                C3117a.m10553a("ServiceSchedulingLogic$cancelOperation", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo10588d(C3130c cVar);

    /* renamed from: a */
    private static long m10623a(long j, long j2) {
        try {
            return 1800000 - ((long) new Random().nextInt((int) (Math.abs(-1800000) + 1800000)));
        } catch (Throwable unused) {
            return -1800000;
        }
    }

    /* renamed from: a */
    public final void mo10586a(List<C3130c> list) {
        if (list != null) {
            try {
                for (C3130c next : list) {
                    C3141b.m10618aj().mo10582c(next);
                    mo10587c(next);
                }
            } catch (Throwable th) {
                C3117a.m10553a("ServiceSchedulingLogic$cancelAllOperations", th);
            }
        }
    }
}
