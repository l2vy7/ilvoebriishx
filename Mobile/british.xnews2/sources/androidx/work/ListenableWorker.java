package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p177y1.C6400a;

public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C1412a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1413a extends C1412a {

            /* renamed from: a */
            private final C1427e f6264a;

            public C1413a() {
                this(C1427e.f6331c);
            }

            /* renamed from: e */
            public C1427e mo6827e() {
                return this.f6264a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1413a.class != obj.getClass()) {
                    return false;
                }
                return this.f6264a.equals(((C1413a) obj).f6264a);
            }

            public int hashCode() {
                return (C1413a.class.getName().hashCode() * 31) + this.f6264a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f6264a + '}';
            }

            public C1413a(C1427e eVar) {
                this.f6264a = eVar;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1414b extends C1412a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C1414b.class == obj.getClass();
            }

            public int hashCode() {
                return C1414b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1415c extends C1412a {

            /* renamed from: a */
            private final C1427e f6265a;

            public C1415c() {
                this(C1427e.f6331c);
            }

            /* renamed from: e */
            public C1427e mo6834e() {
                return this.f6265a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1415c.class != obj.getClass()) {
                    return false;
                }
                return this.f6265a.equals(((C1415c) obj).f6265a);
            }

            public int hashCode() {
                return (C1415c.class.getName().hashCode() * 31) + this.f6265a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f6265a + '}';
            }

            public C1415c(C1427e eVar) {
                this.f6265a = eVar;
            }
        }

        C1412a() {
        }

        /* renamed from: a */
        public static C1412a m7511a() {
            return new C1413a();
        }

        /* renamed from: b */
        public static C1412a m7512b() {
            return new C1414b();
        }

        /* renamed from: c */
        public static C1412a m7513c() {
            return new C1415c();
        }

        /* renamed from: d */
        public static C1412a m7514d(C1427e eVar) {
            return new C1415c(eVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.mo6843a();
    }

    public C10412b<C1431h> getForegroundInfoAsync() {
        C1476d t = C1476d.m7752t();
        t.mo6990q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t;
    }

    public final UUID getId() {
        return this.mWorkerParams.mo6845c();
    }

    public final C1427e getInputData() {
        return this.mWorkerParams.mo6846d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.mo6847e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.mo6849g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.mo6850h();
    }

    public C6400a getTaskExecutor() {
        return this.mWorkerParams.mo6851i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.mo6852j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.mo6853k();
    }

    public C1506z getWorkerFactory() {
        return this.mWorkerParams.mo6854l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final C10412b<Void> setForegroundAsync(C1431h hVar) {
        this.mRunInForeground = true;
        return this.mWorkerParams.mo6844b().mo6918a(getApplicationContext(), getId(), hVar);
    }

    public C10412b<Void> setProgressAsync(C1427e eVar) {
        return this.mWorkerParams.mo6848f().mo7028a(getApplicationContext(), getId(), eVar);
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract C10412b<C1412a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
