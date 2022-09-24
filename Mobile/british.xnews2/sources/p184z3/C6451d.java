package p184z3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p005a4.C0078c;
import p066d4.C5190a;
import p153t3.C6150m;
import p169w3.C6315a;

/* renamed from: z3.d */
/* compiled from: JobInfoScheduler */
public class C6451d implements C6468q {

    /* renamed from: a */
    private final Context f26503a;

    /* renamed from: b */
    private final C0078c f26504b;

    /* renamed from: c */
    private final C6452e f26505c;

    public C6451d(Context context, C0078c cVar, C6452e eVar) {
        this.f26503a = context;
        this.f26504b = cVar;
        this.f26505c = eVar;
    }

    /* renamed from: c */
    private boolean m28146c(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24267a(C6150m mVar, int i) {
        ComponentName componentName = new ComponentName(this.f26503a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f26503a.getSystemService("jobscheduler");
        int b = mo24284b(mVar);
        if (m28146c(jobScheduler, b, i)) {
            C6315a.m27820a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long B0 = this.f26504b.mo219B0(mVar);
        JobInfo.Builder c = this.f26505c.mo24285c(new JobInfo.Builder(b, componentName), mVar.mo23505d(), B0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", mVar.mo23503b());
        persistableBundle.putInt("priority", C5190a.m23550a(mVar.mo23505d()));
        if (mVar.mo23504c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.mo23504c(), 0));
        }
        c.setExtras(persistableBundle);
        C6315a.m27821b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(b), Long.valueOf(this.f26505c.mo24286g(mVar.mo23505d(), B0, i)), Long.valueOf(B0), Integer.valueOf(i));
        jobScheduler.schedule(c.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24284b(C6150m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f26503a.getPackageName().getBytes(Charset.forName(C6540C.UTF8_NAME)));
        adler32.update(mVar.mo23503b().getBytes(Charset.forName(C6540C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(C5190a.m23550a(mVar.mo23505d())).array());
        if (mVar.mo23504c() != null) {
            adler32.update(mVar.mo23504c());
        }
        return (int) adler32.getValue();
    }
}
