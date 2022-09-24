package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7205d;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7377d<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zze = new Feature[0];
    private volatile String zzA;
    /* access modifiers changed from: private */
    public ConnectionResult zzB;
    /* access modifiers changed from: private */
    public boolean zzC;
    private volatile zzj zzD;
    C7419p1 zza;
    final Handler zzb;
    protected C7380c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final C7389g zzn;
    private final C7353b zzo;
    private final Object zzp;
    /* access modifiers changed from: private */
    public final Object zzq;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")
    public C7405l zzr;
    @GuardedBy("mLock")
    private T zzs;
    /* access modifiers changed from: private */
    public final ArrayList<C7442y0<?>> zzt;
    @GuardedBy("mLock")
    private C7371a1 zzu;
    @GuardedBy("mLock")
    private int zzv;
    /* access modifiers changed from: private */
    public final C7378a zzw;
    /* access modifiers changed from: private */
    public final C7379b zzx;
    private final int zzy;
    private final String zzz;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C7378a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C7379b {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C7380c {
        /* renamed from: a */
        void mo29866a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    protected class C7381d implements C7380c {
        public C7381d() {
        }

        /* renamed from: a */
        public final void mo29866a(ConnectionResult connectionResult) {
            if (connectionResult.mo29686G0()) {
                C7377d dVar = C7377d.this;
                dVar.getRemoteService((C7395i) null, dVar.getScopes());
            } else if (C7377d.this.zzx != null) {
                C7377d.this.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C7382e {
        /* renamed from: a */
        void mo29894a();
    }

    protected C7377d(Context context, Handler handler, C7389g gVar, C7353b bVar, int i, C7378a aVar, C7379b bVar2) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C4604n.m20099l(context, "Context must not be null");
        this.zzl = context;
        C4604n.m20099l(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        C4604n.m20099l(gVar, "Supervisor must not be null");
        this.zzn = gVar;
        C4604n.m20099l(bVar, "API availability must not be null");
        this.zzo = bVar;
        this.zzy = i;
        this.zzw = aVar;
        this.zzx = bVar2;
        this.zzz = null;
    }

    static /* bridge */ /* synthetic */ void zzj(C7377d dVar, zzj zzj2) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        dVar.zzD = zzj2;
        if (dVar.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj2.f29397e;
            C7414o b = C7414o.m30045b();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.mo30028H0();
            }
            b.mo30146c(rootTelemetryConfiguration);
        }
    }

    static /* bridge */ /* synthetic */ void zzk(C7377d dVar, int i) {
        int i2;
        int i3;
        synchronized (dVar.zzp) {
            i2 = dVar.zzv;
        }
        if (i2 == 3) {
            dVar.zzC = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = dVar.zzb;
        handler.sendMessage(handler.obtainMessage(i3, dVar.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(C7377d dVar, int i, int i2, IInterface iInterface) {
        synchronized (dVar.zzp) {
            if (dVar.zzv != i) {
                return false;
            }
            dVar.zzp(i2, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(C7377d dVar) {
        if (dVar.zzC || TextUtils.isEmpty(dVar.getServiceDescriptor()) || TextUtils.isEmpty(dVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(dVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzp(int i, T t) {
        C7419p1 p1Var;
        String str;
        C7419p1 p1Var2;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C4604n.m20088a(z);
        synchronized (this.zzp) {
            this.zzv = i;
            this.zzs = t;
            if (i == 1) {
                C7371a1 a1Var = this.zzu;
                if (a1Var != null) {
                    C7389g gVar = this.zzn;
                    String c = this.zza.mo30152c();
                    C4604n.m20098k(c);
                    gVar.mo30096e(c, this.zza.mo30151b(), this.zza.mo30150a(), a1Var, zze(), this.zza.mo30153d());
                    this.zzu = null;
                }
            } else if (i == 2 || i == 3) {
                C7371a1 a1Var2 = this.zzu;
                if (!(a1Var2 == null || (p1Var2 = this.zza) == null)) {
                    String c2 = p1Var2.mo30152c();
                    String b = p1Var2.mo30151b();
                    StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(b).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b);
                    Log.e("GmsClient", sb.toString());
                    C7389g gVar2 = this.zzn;
                    String c3 = this.zza.mo30152c();
                    C4604n.m20098k(c3);
                    gVar2.mo30096e(c3, this.zza.mo30151b(), this.zza.mo30150a(), a1Var2, zze(), this.zza.mo30153d());
                    this.zzd.incrementAndGet();
                }
                C7371a1 a1Var3 = new C7371a1(this, this.zzd.get());
                this.zzu = a1Var3;
                if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                    p1Var = new C7419p1(getStartServicePackage(), getStartServiceAction(), false, C7389g.m29998a(), getUseDynamicLookup());
                } else {
                    p1Var = new C7419p1(getContext().getPackageName(), getLocalStartServiceAction(), true, C7389g.m29998a(), false);
                }
                this.zza = p1Var;
                if (!p1Var.mo30153d() || getMinApkVersion() >= 17895000) {
                    C7389g gVar3 = this.zzn;
                    String c4 = this.zza.mo30152c();
                    C4604n.m20098k(c4);
                    if (!gVar3.mo30097f(new C7398i1(c4, this.zza.mo30151b(), this.zza.mo30150a(), this.zza.mo30153d()), a1Var3, zze(), getBindServiceExecutor())) {
                        String c5 = this.zza.mo30152c();
                        String b2 = this.zza.mo30151b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c5).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c5);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.w("GmsClient", sb2.toString());
                        zzl(16, (Bundle) null, this.zzd.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.zza.mo30152c());
                    if (valueOf.length() != 0) {
                        str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                    } else {
                        str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                    }
                    throw new IllegalStateException(str);
                }
            } else if (i == 4) {
                C4604n.m20098k(t);
                onConnectedLocked(t);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int j = this.zzo.mo29709j(this.zzl, getMinApkVersion());
        if (j != 0) {
            zzp(1, (IInterface) null);
            triggerNotAvailable(new C7381d(), j, (PendingIntent) null);
            return;
        }
        connect(new C7381d());
    }

    /* access modifiers changed from: protected */
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(C7380c cVar) {
        C4604n.m20099l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i = 0; i < size; i++) {
                this.zzt.get(i).mo30175d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, (IInterface) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C7405l lVar;
        synchronized (this.zzp) {
            i = this.zzv;
            t = this.zzs;
        }
        synchronized (this.zzq) {
            lVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (lVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(lVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzh;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C7205d.m29520a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzj2 = this.zzD;
        if (zzj2 == null) {
            return null;
        }
        return zzj2.f29395c;
    }

    /* access modifiers changed from: protected */
    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C7419p1 p1Var;
        if (isConnected() && (p1Var = this.zza) != null) {
            return p1Var.mo30151b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C7353b.f29212a;
    }

    public void getRemoteService(C7395i iVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.zzy, this.zzA);
        getServiceRequest.f29278e = this.zzl.getPackageName();
        getServiceRequest.f29281h = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f29280g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f29282i = account;
            if (iVar != null) {
                getServiceRequest.f29279f = iVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f29282i = getAccount();
        }
        getServiceRequest.f29283j = zze;
        getServiceRequest.f29284k = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f29287n = true;
        }
        try {
            synchronized (this.zzq) {
                C7405l lVar = this.zzr;
                if (lVar != null) {
                    lVar.mo30136B1(new C7444z0(this, this.zzd.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        }
    }

    /* access modifiers changed from: protected */
    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.zzp) {
            if (this.zzv != 5) {
                checkConnected();
                t = this.zzs;
                C4604n.m20099l(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            C7405l lVar = this.zzr;
            if (lVar == null) {
                return null;
            }
            IBinder asBinder = lVar.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzj2 = this.zzD;
        if (zzj2 == null) {
            return null;
        }
        return zzj2.f29397e;
    }

    /* access modifiers changed from: protected */
    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onConnectedLocked(T t) {
        this.zzh = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.mo29682C0();
        this.zzj = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C7374b1(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(C7382e eVar) {
        eVar.mo29894a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i));
    }

    /* access modifiers changed from: protected */
    public void triggerNotAvailable(C7380c cVar, int i, PendingIntent pendingIntent) {
        C4604n.m20099l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i, Bundle bundle, int i2) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C7376c1(this, i, (Bundle) null)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C7377d(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C7377d.C7378a r13, com.google.android.gms.common.internal.C7377d.C7379b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.g r3 = com.google.android.gms.common.internal.C7389g.m29999b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.C7353b.m29920h()
            com.google.android.gms.common.internal.C4604n.m20098k(r13)
            com.google.android.gms.common.internal.C4604n.m20098k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C7377d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    protected C7377d(Context context, Looper looper, C7389g gVar, C7353b bVar, int i, C7378a aVar, C7379b bVar2, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C4604n.m20099l(context, "Context must not be null");
        this.zzl = context;
        C4604n.m20099l(looper, "Looper must not be null");
        this.zzm = looper;
        C4604n.m20099l(gVar, "Supervisor must not be null");
        this.zzn = gVar;
        C4604n.m20099l(bVar, "API availability must not be null");
        this.zzo = bVar;
        this.zzb = new C7440x0(this, looper);
        this.zzy = i;
        this.zzw = aVar;
        this.zzx = bVar2;
        this.zzz = str;
    }
}
