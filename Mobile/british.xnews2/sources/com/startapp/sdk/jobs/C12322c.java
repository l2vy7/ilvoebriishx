package com.startapp.sdk.jobs;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.startapp.C11887e9;
import com.startapp.C12437y;
import com.startapp.sdk.jobs.JobRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.sdk.jobs.c */
/* compiled from: Sta */
public class C12322c implements C11887e9 {

    /* renamed from: a */
    public final JobScheduler f54729a;

    /* renamed from: b */
    public final ComponentName f54730b;

    /* renamed from: c */
    public final boolean f54731c;

    public C12322c(Context context, Class<? extends JobService> cls) throws IllegalStateException {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            this.f54729a = jobScheduler;
            this.f54730b = new ComponentName(context, cls);
            this.f54731c = C12437y.m53782a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final JobInfo.Builder mo46484a(JobRequest jobRequest, Integer num) {
        int i;
        int i2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = JobRequest.m53447a(jobRequest.f54714a);
        }
        JobInfo.Builder builder = new JobInfo.Builder(i, this.f54730b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", jobRequest.f54715b.toString());
        persistableBundle.putStringArray("extraKeyTags", jobRequest.f54714a);
        if (num != null) {
            persistableBundle.putInt("extraKeyDuplicate", 1);
        }
        builder.setExtras(persistableBundle);
        JobRequest.Network network = jobRequest.f54716c;
        if (network != null) {
            if (network == JobRequest.Network.UNMETERED) {
                i2 = 2;
            } else {
                i2 = network == JobRequest.Network.ANY ? 1 : 0;
            }
            builder.setRequiredNetworkType(i2);
        }
        if (this.f54731c) {
            builder.setPersisted(true);
        }
        return builder;
    }

    /* renamed from: a */
    public final boolean mo46486a(JobInfo jobInfo) {
        try {
            return this.f54729a.schedule(jobInfo) == 1;
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final List<JobInfo> mo46485a() {
        List<JobInfo> list;
        try {
            list = this.f54729a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JobInfo next : list) {
            if (this.f54730b.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo45330a(JobRequest jobRequest, long j) {
        JobInfo.Builder a = mo46484a(jobRequest, (Integer) null);
        if (Build.VERSION.SDK_INT >= 24) {
            return mo46486a(a.setPeriodic(j, JobInfo.getMinFlexMillis()).build());
        }
        List<JobInfo> a2 = mo46485a();
        if (a2 == null) {
            return false;
        }
        for (JobInfo next : a2) {
            if (next.getId() == JobRequest.m53447a(jobRequest.f54714a) && next.getIntervalMillis() == j) {
                return false;
            }
        }
        return mo46486a(a.setPeriodic(j).build());
    }

    /* renamed from: a */
    public boolean mo45331a(JobRequest jobRequest, Long l, Long l2) {
        ArrayList arrayList = null;
        JobInfo.Builder a = mo46484a(jobRequest, (Integer) null);
        long j = 0;
        if (l != null || Build.VERSION.SDK_INT <= 28) {
            a.setMinimumLatency(l != null ? l.longValue() : 0);
        }
        JobInfo build = a.build();
        boolean a2 = mo46486a(build);
        if (Build.VERSION.SDK_INT == 23) {
            String uuid = jobRequest.f54715b.toString();
            List<JobInfo> a3 = mo46485a();
            if (a3 != null) {
                arrayList = new ArrayList(2);
                for (JobInfo next : a3) {
                    PersistableBundle extras = next.getExtras();
                    try {
                        if (extras.containsKey("extraKeyUuid") && uuid.equals(extras.getString("extraKeyUuid"))) {
                            arrayList.add(Integer.valueOf(next.getId()));
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (arrayList != null) {
                int id = build.getId();
                int indexOf = arrayList.indexOf(Integer.valueOf(id));
                if (indexOf >= 0) {
                    arrayList.remove(indexOf);
                }
                JobInfo.Builder a4 = mo46484a(jobRequest, Integer.valueOf(!arrayList.isEmpty() ? ((Integer) arrayList.get(0)).intValue() : id < Integer.MAX_VALUE ? id + 1 : id - 1));
                if (l != null || Build.VERSION.SDK_INT <= 28) {
                    if (l != null) {
                        j = l.longValue();
                    }
                    a4.setMinimumLatency(j);
                }
                mo46486a(a4.build());
            }
        }
        return a2;
    }

    /* renamed from: a */
    public boolean mo45329a(int i) {
        List<JobInfo> a = mo46485a();
        if (a == null) {
            return false;
        }
        try {
            for (JobInfo id : a) {
                if (id.getId() == i) {
                    this.f54729a.cancel(i);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
