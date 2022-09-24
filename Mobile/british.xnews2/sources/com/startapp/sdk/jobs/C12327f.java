package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.C11887e9;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C12320b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.sdk.jobs.f */
/* compiled from: Sta */
public class C12327f implements C11887e9 {

    /* renamed from: a */
    public final WeakReference<Context> f54736a;

    /* renamed from: b */
    public final Map<Integer, Future<?>> f54737b = new HashMap();

    /* renamed from: c */
    public final ScheduledExecutorService f54738c = Executors.newScheduledThreadPool(1, ComponentLocator.m23307b("scheduler"));

    /* renamed from: com.startapp.sdk.jobs.f$a */
    /* compiled from: Sta */
    public class C12328a extends C12319a {

        /* renamed from: a */
        public final /* synthetic */ JobRequest f54739a;

        /* renamed from: b */
        public final /* synthetic */ long f54740b;

        public C12328a(JobRequest jobRequest, long j) {
            this.f54739a = jobRequest;
            this.f54740b = j;
        }

        /* renamed from: a */
        public void mo46480a(C12320b bVar) {
            C12327f fVar = C12327f.this;
            int a = JobRequest.m53447a(this.f54739a.f54714a);
            long j = this.f54740b;
            synchronized (fVar) {
                fVar.f54737b.put(Integer.valueOf(a), fVar.f54738c.scheduleAtFixedRate(bVar, j, j, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: com.startapp.sdk.jobs.f$b */
    /* compiled from: Sta */
    public class C12329b implements C12320b.C12321a {
        public C12329b(C12327f fVar, JobRequest jobRequest) {
        }

        /* renamed from: a */
        public void mo46481a(C12320b bVar, boolean z) {
        }
    }

    /* renamed from: com.startapp.sdk.jobs.f$c */
    /* compiled from: Sta */
    public class C12330c extends C12319a {

        /* renamed from: a */
        public final /* synthetic */ JobRequest f54742a;

        /* renamed from: b */
        public final /* synthetic */ long f54743b;

        public C12330c(JobRequest jobRequest, long j) {
            this.f54742a = jobRequest;
            this.f54743b = j;
        }

        /* renamed from: a */
        public void mo46480a(C12320b bVar) {
            C12327f fVar = C12327f.this;
            int a = JobRequest.m53447a(this.f54742a.f54714a);
            long j = this.f54743b;
            synchronized (fVar) {
                fVar.f54737b.put(Integer.valueOf(a), fVar.f54738c.schedule(bVar, j, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: com.startapp.sdk.jobs.f$d */
    /* compiled from: Sta */
    public class C12331d implements C12320b.C12321a {

        /* renamed from: a */
        public final /* synthetic */ JobRequest f54745a;

        /* renamed from: b */
        public final /* synthetic */ long f54746b;

        public C12331d(JobRequest jobRequest, long j) {
            this.f54745a = jobRequest;
            this.f54746b = j;
        }

        /* renamed from: a */
        public void mo46481a(C12320b bVar, boolean z) {
            if (z) {
                C12327f fVar = C12327f.this;
                int a = JobRequest.m53447a(this.f54745a.f54714a);
                long j = this.f54746b;
                synchronized (fVar) {
                    fVar.f54737b.put(Integer.valueOf(a), fVar.f54738c.schedule(bVar, j, TimeUnit.MILLISECONDS));
                }
                return;
            }
            synchronized (this) {
                C12327f.this.f54737b.remove(Integer.valueOf(JobRequest.m53447a(this.f54745a.f54714a)));
            }
        }
    }

    public C12327f(Context context) {
        this.f54736a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public boolean mo45330a(JobRequest jobRequest, long j) {
        Context context = (Context) this.f54736a.get();
        if (context == null) {
            return false;
        }
        return new C12328a(jobRequest, j).mo46482a(context, jobRequest.f54714a, new C12329b(this, jobRequest), (Bundle) null);
    }

    /* renamed from: a */
    public boolean mo45331a(JobRequest jobRequest, Long l, Long l2) {
        Context context = (Context) this.f54736a.get();
        if (context == null) {
            return false;
        }
        long longValue = l != null ? l.longValue() : 0;
        return new C12330c(jobRequest, longValue).mo46482a(context, jobRequest.f54714a, new C12331d(jobRequest, longValue), (Bundle) null);
    }

    /* renamed from: a */
    public synchronized boolean mo45329a(int i) {
        Future future = this.f54737b.get(Integer.valueOf(i));
        if (future == null) {
            return false;
        }
        this.f54737b.remove(Integer.valueOf(i));
        return future.cancel(true);
    }
}
