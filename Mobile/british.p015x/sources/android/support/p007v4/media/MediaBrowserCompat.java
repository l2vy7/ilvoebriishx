package android.support.p007v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p007v4.media.session.C0183b;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.p008os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p001a0.C0022f;
import p150t.C6077a;
import p182z0.C6424a;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f265b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final C0122c f266a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo247a(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo247a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m585s(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo247a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m585s(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0118a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0132h> f269a;

        /* renamed from: b */
        private WeakReference<Messenger> f270b;

        C0118a(C0132h hVar) {
            this.f269a = new WeakReference<>(hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo255a(Messenger messenger) {
            this.f270b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f270b;
            if (weakReference != null && weakReference.get() != null && this.f269a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m583c(data);
                C0132h hVar = (C0132h) this.f269a.get();
                Messenger messenger = (Messenger) this.f270b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m583c(bundle);
                        hVar.mo270b(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        hVar.mo272f(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m583c(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m583c(bundle3);
                        hVar.mo271c(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        hVar.mo272f(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0119b {

        /* renamed from: a */
        final MediaBrowser.ConnectionCallback f271a;

        /* renamed from: b */
        C0121b f272b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        private class C0120a extends MediaBrowser.ConnectionCallback {
            C0120a() {
            }

            public void onConnected() {
                C0121b bVar = C0119b.this.f272b;
                if (bVar != null) {
                    bVar.onConnected();
                }
                C0119b.this.mo257a();
            }

            public void onConnectionFailed() {
                C0121b bVar = C0119b.this.f272b;
                if (bVar != null) {
                    bVar.mo265g();
                }
                C0119b.this.mo258b();
            }

            public void onConnectionSuspended() {
                C0121b bVar = C0119b.this.f272b;
                if (bVar != null) {
                    bVar.mo264d();
                }
                C0119b.this.mo259c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        interface C0121b {
            /* renamed from: d */
            void mo264d();

            /* renamed from: g */
            void mo265g();

            void onConnected();
        }

        public C0119b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f271a = new C0120a();
            } else {
                this.f271a = null;
            }
        }

        /* renamed from: a */
        public void mo257a() {
            throw null;
        }

        /* renamed from: b */
        public void mo258b() {
            throw null;
        }

        /* renamed from: c */
        public void mo259c() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo260d(C0121b bVar) {
            this.f272b = bVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    interface C0122c {
        /* renamed from: a */
        MediaSessionCompat.Token mo267a();

        void disconnect();

        /* renamed from: e */
        void mo269e();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    static class C0123d implements C0122c, C0132h, C0119b.C0121b {

        /* renamed from: a */
        final Context f274a;

        /* renamed from: b */
        protected final MediaBrowser f275b;

        /* renamed from: c */
        protected final Bundle f276c;

        /* renamed from: d */
        protected final C0118a f277d = new C0118a(this);

        /* renamed from: e */
        private final C6077a<String, C0134j> f278e = new C6077a<>();

        /* renamed from: f */
        protected int f279f;

        /* renamed from: g */
        protected C0133i f280g;

        /* renamed from: h */
        protected Messenger f281h;

        /* renamed from: i */
        private MediaSessionCompat.Token f282i;

        /* renamed from: j */
        private Bundle f283j;

        C0123d(Context context, ComponentName componentName, C0119b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f274a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f276c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            bVar.mo260d(this);
            this.f275b = new MediaBrowser(context, componentName, bVar.f271a, bundle2);
        }

        /* renamed from: a */
        public MediaSessionCompat.Token mo267a() {
            if (this.f282i == null) {
                this.f282i = MediaSessionCompat.Token.m608a(this.f275b.getSessionToken());
            }
            return this.f282i;
        }

        /* renamed from: b */
        public void mo270b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo271c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f281h == messenger) {
                C0134j jVar = this.f278e.get(str);
                if (jVar != null) {
                    C0135k a = jVar.mo288a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo293c(str);
                            return;
                        }
                        this.f283j = bundle2;
                        a.mo291a(str, list);
                        this.f283j = null;
                    } else if (list == null) {
                        a.mo294d(str, bundle);
                    } else {
                        this.f283j = bundle2;
                        a.mo292b(str, list, bundle);
                        this.f283j = null;
                    }
                } else if (MediaBrowserCompat.f265b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: d */
        public void mo264d() {
            this.f280g = null;
            this.f281h = null;
            this.f282i = null;
            this.f277d.mo255a((Messenger) null);
        }

        public void disconnect() {
            Messenger messenger;
            C0133i iVar = this.f280g;
            if (!(iVar == null || (messenger = this.f281h) == null)) {
                try {
                    iVar.mo287f(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f275b.disconnect();
        }

        /* renamed from: e */
        public void mo269e() {
            this.f275b.connect();
        }

        /* renamed from: f */
        public void mo272f(Messenger messenger) {
        }

        /* renamed from: g */
        public void mo265g() {
        }

        public void onConnected() {
            try {
                Bundle extras = this.f275b.getExtras();
                if (extras != null) {
                    this.f279f = extras.getInt("extra_service_version", 0);
                    IBinder a = C0022f.m51a(extras, "extra_messenger");
                    if (a != null) {
                        this.f280g = new C0133i(a, this.f276c);
                        Messenger messenger = new Messenger(this.f277d);
                        this.f281h = messenger;
                        this.f277d.mo255a(messenger);
                        try {
                            this.f280g.mo286d(this.f274a, this.f281h);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    C0183b x = C0183b.C0184a.m878x(C0022f.m51a(extras, "extra_session_binder"));
                    if (x != null) {
                        this.f282i = MediaSessionCompat.Token.m609b(this.f275b.getSessionToken(), x);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0124e extends C0123d {
        C0124e(Context context, ComponentName componentName, C0119b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0125f extends C0124e {
        C0125f(Context context, ComponentName componentName, C0119b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0126g implements C0122c, C0132h {

        /* renamed from: a */
        final Context f284a;

        /* renamed from: b */
        final ComponentName f285b;

        /* renamed from: c */
        final C0119b f286c;

        /* renamed from: d */
        final Bundle f287d;

        /* renamed from: e */
        final C0118a f288e = new C0118a(this);

        /* renamed from: f */
        private final C6077a<String, C0134j> f289f = new C6077a<>();

        /* renamed from: g */
        int f290g = 1;

        /* renamed from: h */
        C0129c f291h;

        /* renamed from: i */
        C0133i f292i;

        /* renamed from: j */
        Messenger f293j;

        /* renamed from: k */
        private String f294k;

        /* renamed from: l */
        private MediaSessionCompat.Token f295l;

        /* renamed from: m */
        private Bundle f296m;

        /* renamed from: n */
        private Bundle f297n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$g$a */
        class C0127a implements Runnable {
            C0127a() {
            }

            public void run() {
                C0126g gVar = C0126g.this;
                if (gVar.f290g != 0) {
                    gVar.f290g = 2;
                    if (MediaBrowserCompat.f265b && gVar.f291h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0126g.this.f291h);
                    } else if (gVar.f292i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0126g.this.f292i);
                    } else if (gVar.f293j == null) {
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(C0126g.this.f285b);
                        C0126g gVar2 = C0126g.this;
                        gVar2.f291h = new C0129c();
                        boolean z = false;
                        try {
                            C0126g gVar3 = C0126g.this;
                            z = gVar3.f284a.bindService(intent, gVar3.f291h, 1);
                        } catch (Exception unused) {
                            Log.e("MediaBrowserCompat", "Failed binding to service " + C0126g.this.f285b);
                        }
                        if (!z) {
                            C0126g.this.mo274g();
                            C0126g.this.f286c.mo258b();
                        }
                        if (MediaBrowserCompat.f265b) {
                            Log.d("MediaBrowserCompat", "connect...");
                            C0126g.this.mo273d();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0126g.this.f293j);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$g$b */
        class C0128b implements Runnable {
            C0128b() {
            }

            public void run() {
                C0126g gVar = C0126g.this;
                Messenger messenger = gVar.f293j;
                if (messenger != null) {
                    try {
                        gVar.f292i.mo285c(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0126g.this.f285b);
                    }
                }
                C0126g gVar2 = C0126g.this;
                int i = gVar2.f290g;
                gVar2.mo274g();
                if (i != 0) {
                    C0126g.this.f290g = i;
                }
                if (MediaBrowserCompat.f265b) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    C0126g.this.mo273d();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$g$c */
        private class C0129c implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$g$c$a */
            class C0130a implements Runnable {

                /* renamed from: b */
                final /* synthetic */ ComponentName f301b;

                /* renamed from: c */
                final /* synthetic */ IBinder f302c;

                C0130a(ComponentName componentName, IBinder iBinder) {
                    this.f301b = componentName;
                    this.f302c = iBinder;
                }

                public void run() {
                    boolean z = MediaBrowserCompat.f265b;
                    if (z) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.f301b + " binder=" + this.f302c);
                        C0126g.this.mo273d();
                    }
                    if (C0129c.this.mo278a("onServiceConnected")) {
                        C0126g gVar = C0126g.this;
                        gVar.f292i = new C0133i(this.f302c, gVar.f287d);
                        C0126g.this.f293j = new Messenger(C0126g.this.f288e);
                        C0126g gVar2 = C0126g.this;
                        gVar2.f288e.mo255a(gVar2.f293j);
                        C0126g.this.f290g = 2;
                        if (z) {
                            try {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                C0126g.this.mo273d();
                            } catch (RemoteException unused) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0126g.this.f285b);
                                if (MediaBrowserCompat.f265b) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0126g.this.mo273d();
                                    return;
                                }
                                return;
                            }
                        }
                        C0126g gVar3 = C0126g.this;
                        gVar3.f292i.mo284b(gVar3.f284a, gVar3.f293j);
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$g$c$b */
            class C0131b implements Runnable {

                /* renamed from: b */
                final /* synthetic */ ComponentName f304b;

                C0131b(ComponentName componentName) {
                    this.f304b = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f265b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.f304b + " this=" + this + " mServiceConnection=" + C0126g.this.f291h);
                        C0126g.this.mo273d();
                    }
                    if (C0129c.this.mo278a("onServiceDisconnected")) {
                        C0126g gVar = C0126g.this;
                        gVar.f292i = null;
                        gVar.f293j = null;
                        gVar.f288e.mo255a((Messenger) null);
                        C0126g gVar2 = C0126g.this;
                        gVar2.f290g = 4;
                        gVar2.f286c.mo259c();
                    }
                }
            }

            C0129c() {
            }

            /* renamed from: b */
            private void m451b(Runnable runnable) {
                if (Thread.currentThread() == C0126g.this.f288e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0126g.this.f288e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo278a(String str) {
                int i;
                C0126g gVar = C0126g.this;
                if (gVar.f291h == this && (i = gVar.f290g) != 0 && i != 1) {
                    return true;
                }
                int i2 = gVar.f290g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + C0126g.this.f285b + " with mServiceConnection=" + C0126g.this.f291h + " this=" + this);
                return false;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                m451b(new C0130a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                m451b(new C0131b(componentName));
            }
        }

        public C0126g(Context context, ComponentName componentName, C0119b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f284a = context;
                this.f285b = componentName;
                this.f286c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f287d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: h */
        private static String m441h(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        /* renamed from: j */
        private boolean m442j(Messenger messenger, String str) {
            int i;
            if (this.f293j == messenger && (i = this.f290g) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f290g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.f285b + " with mCallbacksMessenger=" + this.f293j + " this=" + this);
            return false;
        }

        /* renamed from: a */
        public MediaSessionCompat.Token mo267a() {
            if (mo275i()) {
                return this.f295l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f290g + ")");
        }

        /* renamed from: b */
        public void mo270b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m442j(messenger, "onConnect")) {
                if (this.f290g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m441h(this.f290g) + "... ignoring");
                    return;
                }
                this.f294k = str;
                this.f295l = token;
                this.f296m = bundle;
                this.f290g = 3;
                if (MediaBrowserCompat.f265b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    mo273d();
                }
                this.f286c.mo257a();
                try {
                    for (Map.Entry next : this.f289f.entrySet()) {
                        String str2 = (String) next.getKey();
                        C0134j jVar = (C0134j) next.getValue();
                        List<C0135k> b = jVar.mo289b();
                        List<Bundle> c = jVar.mo290c();
                        for (int i = 0; i < b.size(); i++) {
                            this.f292i.mo283a(str2, b.get(i).f311b, c.get(i), this.f293j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        /* renamed from: c */
        public void mo271c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (m442j(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f265b;
                if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f285b + " id=" + str);
                }
                C0134j jVar = this.f289f.get(str);
                if (jVar != null) {
                    C0135k a = jVar.mo288a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo293c(str);
                            return;
                        }
                        this.f297n = bundle2;
                        a.mo291a(str, list);
                        this.f297n = null;
                    } else if (list == null) {
                        a.mo294d(str, bundle);
                    } else {
                        this.f297n = bundle2;
                        a.mo292b(str, list, bundle);
                        this.f297n = null;
                    }
                } else if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo273d() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f285b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f286c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f287d);
            Log.d("MediaBrowserCompat", "  mState=" + m441h(this.f290g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f291h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f292i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f293j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f294k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f295l);
        }

        public void disconnect() {
            this.f290g = 0;
            this.f288e.post(new C0128b());
        }

        /* renamed from: e */
        public void mo269e() {
            int i = this.f290g;
            if (i == 0 || i == 1) {
                this.f290g = 2;
                this.f288e.post(new C0127a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m441h(this.f290g) + ")");
        }

        /* renamed from: f */
        public void mo272f(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f285b);
            if (m442j(messenger, "onConnectFailed")) {
                if (this.f290g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m441h(this.f290g) + "... ignoring");
                    return;
                }
                mo274g();
                this.f286c.mo258b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo274g() {
            C0129c cVar = this.f291h;
            if (cVar != null) {
                this.f284a.unbindService(cVar);
            }
            this.f290g = 1;
            this.f291h = null;
            this.f292i = null;
            this.f293j = null;
            this.f288e.mo255a((Messenger) null);
            this.f294k = null;
            this.f295l = null;
        }

        /* renamed from: i */
        public boolean mo275i() {
            return this.f290g == 3;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    interface C0132h {
        /* renamed from: b */
        void mo270b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: c */
        void mo271c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: f */
        void mo272f(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    private static class C0133i {

        /* renamed from: a */
        private Messenger f306a;

        /* renamed from: b */
        private Bundle f307b;

        public C0133i(IBinder iBinder, Bundle bundle) {
            this.f306a = new Messenger(iBinder);
            this.f307b = bundle;
        }

        /* renamed from: e */
        private void m456e(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f306a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo283a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0022f.m52b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m456e(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo284b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f307b);
            m456e(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo285c(Messenger messenger) throws RemoteException {
            m456e(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo286d(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f307b);
            m456e(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo287f(Messenger messenger) throws RemoteException {
            m456e(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    private static class C0134j {

        /* renamed from: a */
        private final List<C0135k> f308a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f309b = new ArrayList();

        /* renamed from: a */
        public C0135k mo288a(Bundle bundle) {
            for (int i = 0; i < this.f309b.size(); i++) {
                if (C6424a.m28109a(this.f309b.get(i), bundle)) {
                    return this.f308a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0135k> mo289b() {
            return this.f308a;
        }

        /* renamed from: c */
        public List<Bundle> mo290c() {
            return this.f309b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0135k {

        /* renamed from: a */
        final MediaBrowser.SubscriptionCallback f310a;

        /* renamed from: b */
        final IBinder f311b = new Binder();

        /* renamed from: c */
        WeakReference<C0134j> f312c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        private class C0136a extends MediaBrowser.SubscriptionCallback {
            C0136a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<MediaItem> mo295a(List<MediaItem> list, Bundle bundle) {
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

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<C0134j> weakReference = C0135k.this.f312c;
                C0134j jVar = weakReference == null ? null : (C0134j) weakReference.get();
                if (jVar == null) {
                    C0135k.this.mo291a(str, MediaItem.m421b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m421b(list);
                List<C0135k> b2 = jVar.mo289b();
                List<Bundle> c = jVar.mo290c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0135k.this.mo291a(str, b);
                    } else {
                        C0135k.this.mo292b(str, mo295a(b, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                C0135k.this.mo293c(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        private class C0137b extends C0136a {
            C0137b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m583c(bundle);
                C0135k.this.mo292b(str, MediaItem.m421b(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m583c(bundle);
                C0135k.this.mo294d(str, bundle);
            }
        }

        public C0135k() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                this.f310a = new C0137b();
            } else if (i >= 21) {
                this.f310a = new C0136a();
            } else {
                this.f310a = null;
            }
        }

        /* renamed from: a */
        public void mo291a(String str, List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo292b(String str, List<MediaItem> list, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo293c(String str) {
        }

        /* renamed from: d */
        public void mo294d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0119b bVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f266a = new C0125f(context, componentName, bVar, bundle);
        } else if (i >= 23) {
            this.f266a = new C0124e(context, componentName, bVar, bundle);
        } else if (i >= 21) {
            this.f266a = new C0123d(context, componentName, bVar, bundle);
        } else {
            this.f266a = new C0126g(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo244a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f266a.mo269e();
    }

    /* renamed from: b */
    public void mo245b() {
        this.f266a.disconnect();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token mo246c() {
        return this.f266a.mo267a();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0117a();

        /* renamed from: b */
        private final int f267b;

        /* renamed from: c */
        private final MediaDescriptionCompat f268c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        class C0117a implements Parcelable.Creator<MediaItem> {
            C0117a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo304f())) {
                this.f267b = i;
                this.f268c = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m420a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m470a(mediaItem.getDescription()), mediaItem.getFlags());
        }

        /* renamed from: b */
        public static List<MediaItem> m421b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m420a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f267b + ", mDescription=" + this.f268c + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f267b);
            this.f268c.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.f267b = parcel.readInt();
            this.f268c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
