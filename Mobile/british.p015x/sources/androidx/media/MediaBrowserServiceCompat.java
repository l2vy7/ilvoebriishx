package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p007v4.media.MediaBrowserCompat;
import android.support.p007v4.media.session.C0183b;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.p008os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p001a0.C0022f;
import p105l0.C5644d;
import p150t.C6077a;
import p182z0.C6424a;
import p182z0.C6425b;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: i */
    static final boolean f3897i = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    private C0817g f3898b;

    /* renamed from: c */
    final C0815f f3899c = new C0815f("android.media.session.MediaController", -1, -1, (Bundle) null, (C0841p) null);

    /* renamed from: d */
    final ArrayList<C0815f> f3900d = new ArrayList<>();

    /* renamed from: e */
    final C6077a<IBinder, C0815f> f3901e = new C6077a<>();

    /* renamed from: f */
    C0815f f3902f;

    /* renamed from: g */
    final C0843r f3903g = new C0843r();

    /* renamed from: h */
    MediaSessionCompat.Token f3904h;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    class C0810a extends C0829m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ C0815f f3905f;

        /* renamed from: g */
        final /* synthetic */ String f3906g;

        /* renamed from: h */
        final /* synthetic */ Bundle f3907h;

        /* renamed from: i */
        final /* synthetic */ Bundle f3908i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0810a(Object obj, C0815f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f3905f = fVar;
            this.f3906g = str;
            this.f3907h = bundle;
            this.f3908i = bundle2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4095d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f3901e.get(this.f3905f.f3923g.asBinder()) == this.f3905f) {
                if ((mo4118a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo4077b(list, this.f3907h);
                }
                try {
                    this.f3905f.f3923g.mo4143a(this.f3906g, list, this.f3907h, this.f3908i);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f3906g + " package=" + this.f3905f.f3918b);
                }
            } else if (MediaBrowserServiceCompat.f3897i) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f3905f.f3918b + " id=" + this.f3906g);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    class C0811b extends C0829m<MediaBrowserCompat.MediaItem> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3910f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0811b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3910f = resultReceiver;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4095d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((mo4118a() & 2) != 0) {
                this.f3910f.mo627b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f3910f.mo627b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    class C0812c extends C0829m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3912f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0812c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3912f = resultReceiver;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4095d(List<MediaBrowserCompat.MediaItem> list) {
            if ((mo4118a() & 4) != 0 || list == null) {
                this.f3912f.mo627b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f3912f.mo627b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    class C0813d extends C0829m<Bundle> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3914f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0813d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3914f = resultReceiver;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4099c(Bundle bundle) {
            this.f3914f.mo627b(-1, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4095d(Bundle bundle) {
            this.f3914f.mo627b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0814e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f3916a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Bundle f3917b;

        public C0814e(String str, Bundle bundle) {
            if (str != null) {
                this.f3916a = str;
                this.f3917b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        /* renamed from: c */
        public Bundle mo4101c() {
            return this.f3917b;
        }

        /* renamed from: d */
        public String mo4102d() {
            return this.f3916a;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    private class C0815f implements IBinder.DeathRecipient {

        /* renamed from: b */
        public final String f3918b;

        /* renamed from: c */
        public final int f3919c;

        /* renamed from: d */
        public final int f3920d;

        /* renamed from: e */
        public final C6425b f3921e;

        /* renamed from: f */
        public final Bundle f3922f;

        /* renamed from: g */
        public final C0841p f3923g;

        /* renamed from: h */
        public final HashMap<String, List<C5644d<IBinder, Bundle>>> f3924h = new HashMap<>();

        /* renamed from: i */
        public C0814e f3925i;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        class C0816a implements Runnable {
            C0816a() {
            }

            public void run() {
                C0815f fVar = C0815f.this;
                MediaBrowserServiceCompat.this.f3901e.remove(fVar.f3923g.asBinder());
            }
        }

        C0815f(String str, int i, int i2, Bundle bundle, C0841p pVar) {
            this.f3918b = str;
            this.f3919c = i;
            this.f3920d = i2;
            this.f3921e = new C6425b(str, i, i2);
            this.f3922f = bundle;
            this.f3923g = pVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f3903g.post(new C0816a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    interface C0817g {
        /* renamed from: a */
        IBinder mo4105a(Intent intent);

        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    class C0818h implements C0817g {

        /* renamed from: a */
        final List<Bundle> f3928a = new ArrayList();

        /* renamed from: b */
        MediaBrowserService f3929b;

        /* renamed from: c */
        Messenger f3930c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        class C0819a extends C0829m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0830n f3932f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0819a(Object obj, C0830n nVar) {
                super(obj);
                this.f3932f = nVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4095d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3932f.mo4124b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        class C0820b extends MediaBrowserService {
            C0820b(Context context) {
                attachBaseContext(context);
            }

            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.m583c(bundle);
                C0818h hVar = C0818h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                C0814e b = hVar.mo4107b(str, i, bundle2);
                if (b == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(b.f3916a, b.f3917b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C0818h.this.mo4108c(str, new C0830n(result));
            }
        }

        C0818h() {
        }

        /* renamed from: a */
        public IBinder mo4105a(Intent intent) {
            return this.f3929b.onBind(intent);
        }

        /* renamed from: b */
        public C0814e mo4107b(String str, int i, Bundle bundle) {
            int i2;
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i2 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.f3930c = new Messenger(MediaBrowserServiceCompat.this.f3903g);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C0022f.m52b(bundle2, "extra_messenger", this.f3930c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f3904h;
                if (token != null) {
                    C0183b d = token.mo434d();
                    if (d == null) {
                        iBinder = null;
                    } else {
                        iBinder = d.asBinder();
                    }
                    C0022f.m52b(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.f3928a.add(bundle2);
                }
                int i3 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i2 = i3;
            }
            C0815f fVar = new C0815f(str, i2, i, bundle, (C0841p) null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3902f = fVar;
            C0814e e = mediaBrowserServiceCompat.mo4081e(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f3902f = null;
            if (e == null) {
                return null;
            }
            if (this.f3930c != null) {
                mediaBrowserServiceCompat2.f3900d.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = e.mo4101c();
            } else if (e.mo4101c() != null) {
                bundle2.putAll(e.mo4101c());
            }
            return new C0814e(e.mo4102d(), bundle2);
        }

        /* renamed from: c */
        public void mo4108c(String str, C0830n<List<Parcel>> nVar) {
            C0819a aVar = new C0819a(str, nVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3902f = mediaBrowserServiceCompat.f3899c;
            mediaBrowserServiceCompat.mo4082f(str, aVar);
            MediaBrowserServiceCompat.this.f3902f = null;
        }

        public void onCreate() {
            C0820b bVar = new C0820b(MediaBrowserServiceCompat.this);
            this.f3929b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    class C0821i extends C0818h {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        class C0822a extends C0829m<MediaBrowserCompat.MediaItem> {

            /* renamed from: f */
            final /* synthetic */ C0830n f3936f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0822a(Object obj, C0830n nVar) {
                super(obj);
                this.f3936f = nVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4095d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f3936f.mo4124b(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f3936f.mo4124b(obtain);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$b */
        class C0823b extends C0818h.C0820b {
            C0823b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C0821i.this.mo4112d(str, new C0830n(result));
            }
        }

        C0821i() {
            super();
        }

        /* renamed from: d */
        public void mo4112d(String str, C0830n<Parcel> nVar) {
            C0822a aVar = new C0822a(str, nVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3902f = mediaBrowserServiceCompat.f3899c;
            mediaBrowserServiceCompat.mo4084h(str, aVar);
            MediaBrowserServiceCompat.this.f3902f = null;
        }

        public void onCreate() {
            C0823b bVar = new C0823b(MediaBrowserServiceCompat.this);
            this.f3929b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    class C0824j extends C0821i {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        class C0825a extends C0829m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0830n f3940f;

            /* renamed from: g */
            final /* synthetic */ Bundle f3941g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0825a(Object obj, C0830n nVar, Bundle bundle) {
                super(obj);
                this.f3940f = nVar;
                this.f3941g = bundle;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4095d(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f3940f.mo4124b(null);
                    return;
                }
                if ((mo4118a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo4077b(list, this.f3941g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                    Parcel obtain = Parcel.obtain();
                    writeToParcel.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f3940f.mo4124b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$b */
        class C0826b extends C0821i.C0823b {
            C0826b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m583c(bundle);
                C0824j jVar = C0824j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3902f = mediaBrowserServiceCompat.f3899c;
                jVar.mo4115e(str, new C0830n(result), bundle);
                MediaBrowserServiceCompat.this.f3902f = null;
            }
        }

        C0824j() {
            super();
        }

        /* renamed from: e */
        public void mo4115e(String str, C0830n<List<Parcel>> nVar, Bundle bundle) {
            C0825a aVar = new C0825a(str, nVar, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3902f = mediaBrowserServiceCompat.f3899c;
            mediaBrowserServiceCompat.mo4083g(str, aVar, bundle);
            MediaBrowserServiceCompat.this.f3902f = null;
        }

        public void onCreate() {
            C0826b bVar = new C0826b(MediaBrowserServiceCompat.this);
            this.f3929b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    class C0827k extends C0824j {
        C0827k() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    class C0828l implements C0817g {

        /* renamed from: a */
        private Messenger f3945a;

        C0828l() {
        }

        /* renamed from: a */
        public IBinder mo4105a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f3945a.getBinder();
            }
            return null;
        }

        public void onCreate() {
            this.f3945a = new Messenger(MediaBrowserServiceCompat.this.f3903g);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0829m<T> {

        /* renamed from: a */
        private final Object f3947a;

        /* renamed from: b */
        private boolean f3948b;

        /* renamed from: c */
        private boolean f3949c;

        /* renamed from: d */
        private boolean f3950d;

        /* renamed from: e */
        private int f3951e;

        C0829m(Object obj) {
            this.f3947a = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4118a() {
            return this.f3951e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4119b() {
            return this.f3948b || this.f3949c || this.f3950d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4099c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3947a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4095d(T t) {
            throw null;
        }

        /* renamed from: e */
        public void mo4120e(Bundle bundle) {
            if (this.f3949c || this.f3950d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f3947a);
            }
            this.f3950d = true;
            mo4099c(bundle);
        }

        /* renamed from: f */
        public void mo4121f(T t) {
            if (this.f3949c || this.f3950d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3947a);
            }
            this.f3949c = true;
            mo4095d(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4122g(int i) {
            this.f3951e = i;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    static class C0830n<T> {

        /* renamed from: a */
        MediaBrowserService.Result f3952a;

        C0830n(MediaBrowserService.Result result) {
            this.f3952a = result;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<MediaBrowser.MediaItem> mo4123a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: b */
        public void mo4124b(T t) {
            if (t instanceof List) {
                this.f3952a.sendResult(mo4123a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f3952a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f3952a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    private class C0831o {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$a */
        class C0832a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3954b;

            /* renamed from: c */
            final /* synthetic */ String f3955c;

            /* renamed from: d */
            final /* synthetic */ int f3956d;

            /* renamed from: e */
            final /* synthetic */ int f3957e;

            /* renamed from: f */
            final /* synthetic */ Bundle f3958f;

            C0832a(C0841p pVar, String str, int i, int i2, Bundle bundle) {
                this.f3954b = pVar;
                this.f3955c = str;
                this.f3956d = i;
                this.f3957e = i2;
                this.f3958f = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3954b.asBinder();
                MediaBrowserServiceCompat.this.f3901e.remove(asBinder);
                C0815f fVar = new C0815f(this.f3955c, this.f3956d, this.f3957e, this.f3958f, this.f3954b);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3902f = fVar;
                C0814e e = mediaBrowserServiceCompat.mo4081e(this.f3955c, this.f3957e, this.f3958f);
                fVar.f3925i = e;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f3902f = null;
                if (e == null) {
                    Log.i("MBServiceCompat", "No root for client " + this.f3955c + " from service " + getClass().getName());
                    try {
                        this.f3954b.mo4145b();
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f3955c);
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.f3901e.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.f3904h != null) {
                            this.f3954b.mo4146c(fVar.f3925i.mo4102d(), MediaBrowserServiceCompat.this.f3904h, fVar.f3925i.mo4101c());
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f3955c);
                        MediaBrowserServiceCompat.this.f3901e.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$b */
        class C0833b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3960b;

            C0833b(C0841p pVar) {
                this.f3960b = pVar;
            }

            public void run() {
                C0815f remove = MediaBrowserServiceCompat.this.f3901e.remove(this.f3960b.asBinder());
                if (remove != null) {
                    remove.f3923g.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$c */
        class C0834c implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3962b;

            /* renamed from: c */
            final /* synthetic */ String f3963c;

            /* renamed from: d */
            final /* synthetic */ IBinder f3964d;

            /* renamed from: e */
            final /* synthetic */ Bundle f3965e;

            C0834c(C0841p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.f3962b = pVar;
                this.f3963c = str;
                this.f3964d = iBinder;
                this.f3965e = bundle;
            }

            public void run() {
                C0815f fVar = MediaBrowserServiceCompat.this.f3901e.get(this.f3962b.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f3963c);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4076a(this.f3963c, fVar, this.f3964d, this.f3965e);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$d */
        class C0835d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3967b;

            /* renamed from: c */
            final /* synthetic */ String f3968c;

            /* renamed from: d */
            final /* synthetic */ IBinder f3969d;

            C0835d(C0841p pVar, String str, IBinder iBinder) {
                this.f3967b = pVar;
                this.f3968c = str;
                this.f3969d = iBinder;
            }

            public void run() {
                C0815f fVar = MediaBrowserServiceCompat.this.f3901e.get(this.f3967b.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f3968c);
                } else if (!MediaBrowserServiceCompat.this.mo4094p(this.f3968c, fVar, this.f3969d)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f3968c + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$e */
        class C0836e implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3971b;

            /* renamed from: c */
            final /* synthetic */ String f3972c;

            /* renamed from: d */
            final /* synthetic */ ResultReceiver f3973d;

            C0836e(C0841p pVar, String str, ResultReceiver resultReceiver) {
                this.f3971b = pVar;
                this.f3972c = str;
                this.f3973d = resultReceiver;
            }

            public void run() {
                C0815f fVar = MediaBrowserServiceCompat.this.f3901e.get(this.f3971b.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f3972c);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4090n(this.f3972c, fVar, this.f3973d);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$f */
        class C0837f implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3975b;

            /* renamed from: c */
            final /* synthetic */ int f3976c;

            /* renamed from: d */
            final /* synthetic */ String f3977d;

            /* renamed from: e */
            final /* synthetic */ int f3978e;

            /* renamed from: f */
            final /* synthetic */ Bundle f3979f;

            C0837f(C0841p pVar, int i, String str, int i2, Bundle bundle) {
                this.f3975b = pVar;
                this.f3976c = i;
                this.f3977d = str;
                this.f3978e = i2;
                this.f3979f = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3975b.asBinder();
                MediaBrowserServiceCompat.this.f3901e.remove(asBinder);
                Iterator<C0815f> it = MediaBrowserServiceCompat.this.f3900d.iterator();
                C0815f fVar = null;
                while (it.hasNext()) {
                    C0815f next = it.next();
                    if (next.f3920d == this.f3976c) {
                        if (TextUtils.isEmpty(this.f3977d) || this.f3978e <= 0) {
                            fVar = new C0815f(next.f3918b, next.f3919c, next.f3920d, this.f3979f, this.f3975b);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new C0815f(this.f3977d, this.f3978e, this.f3976c, this.f3979f, this.f3975b);
                }
                MediaBrowserServiceCompat.this.f3901e.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$g */
        class C0838g implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3981b;

            C0838g(C0841p pVar) {
                this.f3981b = pVar;
            }

            public void run() {
                IBinder asBinder = this.f3981b.asBinder();
                C0815f remove = MediaBrowserServiceCompat.this.f3901e.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$h */
        class C0839h implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3983b;

            /* renamed from: c */
            final /* synthetic */ String f3984c;

            /* renamed from: d */
            final /* synthetic */ Bundle f3985d;

            /* renamed from: e */
            final /* synthetic */ ResultReceiver f3986e;

            C0839h(C0841p pVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3983b = pVar;
                this.f3984c = str;
                this.f3985d = bundle;
                this.f3986e = resultReceiver;
            }

            public void run() {
                C0815f fVar = MediaBrowserServiceCompat.this.f3901e.get(this.f3983b.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f3984c);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4091o(this.f3984c, this.f3985d, fVar, this.f3986e);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$i */
        class C0840i implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0841p f3988b;

            /* renamed from: c */
            final /* synthetic */ String f3989c;

            /* renamed from: d */
            final /* synthetic */ Bundle f3990d;

            /* renamed from: e */
            final /* synthetic */ ResultReceiver f3991e;

            C0840i(C0841p pVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3988b = pVar;
                this.f3989c = str;
                this.f3990d = bundle;
                this.f3991e = resultReceiver;
            }

            public void run() {
                C0815f fVar = MediaBrowserServiceCompat.this.f3901e.get(this.f3988b.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3989c + ", extras=" + this.f3990d);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4088l(this.f3989c, this.f3990d, fVar, this.f3991e);
            }
        }

        C0831o() {
        }

        /* renamed from: a */
        public void mo4125a(String str, IBinder iBinder, Bundle bundle, C0841p pVar) {
            MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0834c(pVar, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void mo4126b(String str, int i, int i2, Bundle bundle, C0841p pVar) {
            if (MediaBrowserServiceCompat.this.mo4078c(str, i2)) {
                MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0832a(pVar, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void mo4127c(C0841p pVar) {
            MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0833b(pVar));
        }

        /* renamed from: d */
        public void mo4128d(String str, ResultReceiver resultReceiver, C0841p pVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0836e(pVar, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void mo4129e(C0841p pVar, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0837f(pVar, i2, str, i, bundle));
        }

        /* renamed from: f */
        public void mo4130f(String str, IBinder iBinder, C0841p pVar) {
            MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0835d(pVar, str, iBinder));
        }

        /* renamed from: g */
        public void mo4131g(String str, Bundle bundle, ResultReceiver resultReceiver, C0841p pVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0839h(pVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void mo4132h(String str, Bundle bundle, ResultReceiver resultReceiver, C0841p pVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0840i(pVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void mo4133i(C0841p pVar) {
            MediaBrowserServiceCompat.this.f3903g.mo4147a(new C0838g(pVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    private interface C0841p {
        /* renamed from: a */
        void mo4143a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo4145b() throws RemoteException;

        /* renamed from: c */
        void mo4146c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    private static class C0842q implements C0841p {

        /* renamed from: a */
        final Messenger f3993a;

        C0842q(Messenger messenger) {
            this.f3993a = messenger;
        }

        /* renamed from: d */
        private void m4446d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3993a.send(obtain);
        }

        /* renamed from: a */
        public void mo4143a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m4446d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f3993a.getBinder();
        }

        /* renamed from: b */
        public void mo4145b() throws RemoteException {
            m4446d(2, (Bundle) null);
        }

        /* renamed from: c */
        public void mo4146c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m4446d(1, bundle2);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$r */
    private final class C0843r extends Handler {

        /* renamed from: a */
        private final C0831o f3994a;

        C0843r() {
            this.f3994a = new C0831o();
        }

        /* renamed from: a */
        public void mo4147a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m583c(bundle);
                    this.f3994a.mo4126b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0842q(message.replyTo));
                    return;
                case 2:
                    this.f3994a.mo4127c(new C0842q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m583c(bundle2);
                    this.f3994a.mo4125a(data.getString("data_media_item_id"), C0022f.m51a(data, "data_callback_token"), bundle2, new C0842q(message.replyTo));
                    return;
                case 4:
                    this.f3994a.mo4130f(data.getString("data_media_item_id"), C0022f.m51a(data, "data_callback_token"), new C0842q(message.replyTo));
                    return;
                case 5:
                    this.f3994a.mo4128d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C0842q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m583c(bundle3);
                    C0831o oVar = this.f3994a;
                    C0842q qVar = new C0842q(message.replyTo);
                    oVar.mo4129e(qVar, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f3994a.mo4133i(new C0842q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m583c(bundle4);
                    this.f3994a.mo4131g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0842q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m583c(bundle5);
                    this.f3994a.mo4132h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0842q(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4076a(String str, C0815f fVar, IBinder iBinder, Bundle bundle) {
        List<C5644d> list = fVar.f3924h.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C5644d dVar : list) {
            if (iBinder == dVar.f24210a && C6424a.m28109a(bundle, (Bundle) dVar.f24211b)) {
                return;
            }
        }
        list.add(new C5644d(iBinder, bundle));
        fVar.f3924h.put(str, list);
        mo4089m(str, fVar, bundle, (Bundle) null);
        this.f3902f = fVar;
        mo4086j(str, bundle);
        this.f3902f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<MediaBrowserCompat.MediaItem> mo4077b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4078c(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo4079d(String str, Bundle bundle, C0829m<Bundle> mVar) {
        mVar.mo4120e((Bundle) null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public abstract C0814e mo4081e(String str, int i, Bundle bundle);

    /* renamed from: f */
    public abstract void mo4082f(String str, C0829m<List<MediaBrowserCompat.MediaItem>> mVar);

    /* renamed from: g */
    public void mo4083g(String str, C0829m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.mo4122g(1);
        mo4082f(str, mVar);
    }

    /* renamed from: h */
    public void mo4084h(String str, C0829m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.mo4122g(2);
        mVar.mo4121f(null);
    }

    /* renamed from: i */
    public void mo4085i(String str, Bundle bundle, C0829m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.mo4122g(4);
        mVar.mo4121f(null);
    }

    /* renamed from: j */
    public void mo4086j(String str, Bundle bundle) {
    }

    /* renamed from: k */
    public void mo4087k(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4088l(String str, Bundle bundle, C0815f fVar, ResultReceiver resultReceiver) {
        C0813d dVar = new C0813d(str, resultReceiver);
        this.f3902f = fVar;
        mo4079d(str, bundle, dVar);
        this.f3902f = null;
        if (!dVar.mo4119b()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4089m(String str, C0815f fVar, Bundle bundle, Bundle bundle2) {
        C0810a aVar = new C0810a(str, fVar, str, bundle, bundle2);
        this.f3902f = fVar;
        if (bundle == null) {
            mo4082f(str, aVar);
        } else {
            mo4083g(str, aVar, bundle);
        }
        this.f3902f = null;
        if (!aVar.mo4119b()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f3918b + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4090n(String str, C0815f fVar, ResultReceiver resultReceiver) {
        C0811b bVar = new C0811b(str, resultReceiver);
        this.f3902f = fVar;
        mo4084h(str, bVar);
        this.f3902f = null;
        if (!bVar.mo4119b()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4091o(String str, Bundle bundle, C0815f fVar, ResultReceiver resultReceiver) {
        C0812c cVar = new C0812c(str, resultReceiver);
        this.f3902f = fVar;
        mo4085i(str, bundle, cVar);
        this.f3902f = null;
        if (!cVar.mo4119b()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f3898b.mo4105a(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f3898b = new C0827k();
        } else if (i >= 26) {
            this.f3898b = new C0824j();
        } else if (i >= 23) {
            this.f3898b = new C0821i();
        } else if (i >= 21) {
            this.f3898b = new C0818h();
        } else {
            this.f3898b = new C0828l();
        }
        this.f3898b.onCreate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4094p(String str, C0815f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f3924h.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f3902f = fVar;
                mo4087k(str);
                this.f3902f = null;
            }
        } else {
            List list = fVar.f3924h.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C5644d) it.next()).f24210a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f3924h.remove(str);
                }
            }
            this.f3902f = fVar;
            mo4087k(str);
            this.f3902f = null;
            return z2;
        }
    }
}
