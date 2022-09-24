package android.support.p007v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0180a;
import android.support.p007v4.media.session.C0183b;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p001a0.C0022f;
import p118n1.C5790a;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0148b f343a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f344b;

    /* renamed from: c */
    private final ConcurrentHashMap<C0144a, Boolean> f345c = new ConcurrentHashMap<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0148b {

        /* renamed from: a */
        protected final MediaController f346a;

        /* renamed from: b */
        final Object f347b = new Object();

        /* renamed from: c */
        private final List<C0144a> f348c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0144a, C0143a> f349d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f350e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: b */
            private WeakReference<MediaControllerImplApi21> f351b;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f351b = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f351b.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f347b) {
                        mediaControllerImplApi21.f350e.mo439g(C0183b.C0184a.m878x(C0022f.m51a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f350e.mo440h(C5790a.m25637b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo361f();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0143a extends C0144a.C0147c {
            C0143a(C0144a aVar) {
                super(aVar);
            }

            /* renamed from: B3 */
            public void mo365B3(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: F1 */
            public void mo366F1(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Q3 */
            public void mo367Q3() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: T3 */
            public void mo368T3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Z1 */
            public void mo369Z1(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: j6 */
            public void mo370j6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f350e = token;
            this.f346a = new MediaController(context, (MediaSession.Token) token.mo438f());
            if (token.mo434d() == null) {
                m520g();
            }
        }

        /* renamed from: g */
        private void m520g() {
            mo363h("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: H */
        public MediaMetadataCompat mo355H() {
            MediaMetadata metadata = this.f346a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.m488b(metadata);
            }
            return null;
        }

        /* renamed from: a */
        public final void mo356a(C0144a aVar) {
            this.f346a.unregisterCallback(aVar.f352b);
            synchronized (this.f347b) {
                if (this.f350e.mo434d() != null) {
                    try {
                        C0143a remove = this.f349d.remove(aVar);
                        if (remove != null) {
                            aVar.f354d = null;
                            this.f350e.mo434d().mo564q2(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.f348c.remove(aVar);
                }
            }
        }

        /* renamed from: b */
        public boolean mo357b(KeyEvent keyEvent) {
            return this.f346a.dispatchMediaButtonEvent(keyEvent);
        }

        /* renamed from: c */
        public PendingIntent mo358c() {
            return this.f346a.getSessionActivity();
        }

        /* renamed from: d */
        public C0151e mo359d() {
            return new C0152f(this.f346a.getTransportControls());
        }

        /* renamed from: e */
        public final void mo360e(C0144a aVar, Handler handler) {
            this.f346a.registerCallback(aVar.f352b, handler);
            synchronized (this.f347b) {
                if (this.f350e.mo434d() != null) {
                    C0143a aVar2 = new C0143a(aVar);
                    this.f349d.put(aVar, aVar2);
                    aVar.f354d = aVar2;
                    try {
                        this.f350e.mo434d().mo571v0(aVar2);
                        aVar.mo384m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.f354d = null;
                    this.f348c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo361f() {
            if (this.f350e.mo434d() != null) {
                for (C0144a next : this.f348c) {
                    C0143a aVar = new C0143a(next);
                    this.f349d.put(next, aVar);
                    next.f354d = aVar;
                    try {
                        this.f350e.mo434d().mo571v0(aVar);
                        next.mo384m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f348c.clear();
            }
        }

        public PlaybackStateCompat getPlaybackState() {
            if (this.f350e.mo434d() != null) {
                try {
                    return this.f350e.mo434d().getPlaybackState();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
            }
            PlaybackState playbackState = this.f346a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.m804a(playbackState);
            }
            return null;
        }

        /* renamed from: h */
        public void mo363h(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f346a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0144a implements IBinder.DeathRecipient {

        /* renamed from: b */
        final MediaController.Callback f352b;

        /* renamed from: c */
        C0146b f353c;

        /* renamed from: d */
        C0180a f354d;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private static class C0145a extends MediaController.Callback {

            /* renamed from: a */
            private final WeakReference<C0144a> f355a;

            C0145a(C0144a aVar) {
                this.f355a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null) {
                    aVar.mo371a(new C0150d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m4369c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m583c(bundle);
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null) {
                    aVar.mo374c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null) {
                    aVar.mo375d(MediaMetadataCompat.m488b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null && aVar.f354d == null) {
                    aVar.mo376e(PlaybackStateCompat.m804a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null) {
                    aVar.mo377f(MediaSessionCompat.QueueItem.m602b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null) {
                    aVar.mo378g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar != null) {
                    aVar.mo380i();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m583c(bundle);
                C0144a aVar = (C0144a) this.f355a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f354d == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo381j(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private class C0146b extends Handler {

            /* renamed from: a */
            boolean f356a = false;

            C0146b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f356a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m583c(data);
                            C0144a.this.mo381j((String) message.obj, data);
                            return;
                        case 2:
                            C0144a.this.mo376e((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C0144a.this.mo375d((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C0144a.this.mo371a((C0150d) message.obj);
                            return;
                        case 5:
                            C0144a.this.mo377f((List) message.obj);
                            return;
                        case 6:
                            C0144a.this.mo378g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m583c(bundle);
                            C0144a.this.mo374c(bundle);
                            return;
                        case 8:
                            C0144a.this.mo380i();
                            return;
                        case 9:
                            C0144a.this.mo379h(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C0144a.this.mo372b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C0144a.this.mo383l(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C0144a.this.mo382k();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0147c extends C0180a.C0181a {

            /* renamed from: b */
            private final WeakReference<C0144a> f358b;

            C0147c(C0144a aVar) {
                this.f358b = new WeakReference<>(aVar);
            }

            /* renamed from: B3 */
            public void mo365B3(CharSequence charSequence) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: E1 */
            public void mo395E1() throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: F1 */
            public void mo366F1(Bundle bundle) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: I4 */
            public void mo396I4(int i) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: Q3 */
            public void mo367Q3() throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: T3 */
            public void mo368T3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: Z1 */
            public void mo369Z1(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(5, list, (Bundle) null);
                }
            }

            /* renamed from: Z2 */
            public void mo397Z2(boolean z) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: Z5 */
            public void mo398Z5(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: a6 */
            public void mo399a6(String str, Bundle bundle) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(1, str, bundle);
                }
            }

            /* renamed from: j6 */
            public void mo370j6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(4, parcelableVolumeInfo != null ? new C0150d(parcelableVolumeInfo.f445b, parcelableVolumeInfo.f446c, parcelableVolumeInfo.f447d, parcelableVolumeInfo.f448e, parcelableVolumeInfo.f449f) : null, (Bundle) null);
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                C0144a aVar = (C0144a) this.f358b.get();
                if (aVar != null) {
                    aVar.mo384m(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: y3 */
            public void mo401y3(boolean z) throws RemoteException {
            }
        }

        public C0144a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f352b = new C0145a(this);
                return;
            }
            this.f352b = null;
            this.f354d = new C0147c(this);
        }

        /* renamed from: a */
        public void mo371a(C0150d dVar) {
        }

        /* renamed from: b */
        public void mo372b(boolean z) {
        }

        public void binderDied() {
            mo384m(8, (Object) null, (Bundle) null);
        }

        /* renamed from: c */
        public void mo374c(Bundle bundle) {
        }

        /* renamed from: d */
        public void mo375d(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: e */
        public void mo376e(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: f */
        public void mo377f(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: g */
        public void mo378g(CharSequence charSequence) {
        }

        /* renamed from: h */
        public void mo379h(int i) {
        }

        /* renamed from: i */
        public void mo380i() {
        }

        /* renamed from: j */
        public void mo381j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo382k() {
        }

        /* renamed from: l */
        public void mo383l(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo384m(int i, Object obj, Bundle bundle) {
            C0146b bVar = this.f353c;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo385n(Handler handler) {
            if (handler == null) {
                C0146b bVar = this.f353c;
                if (bVar != null) {
                    bVar.f356a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.f353c = null;
                    return;
                }
                return;
            }
            C0146b bVar2 = new C0146b(handler.getLooper());
            this.f353c = bVar2;
            bVar2.f356a = true;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0148b {
        /* renamed from: H */
        MediaMetadataCompat mo355H();

        /* renamed from: a */
        void mo356a(C0144a aVar);

        /* renamed from: b */
        boolean mo357b(KeyEvent keyEvent);

        /* renamed from: c */
        PendingIntent mo358c();

        /* renamed from: d */
        C0151e mo359d();

        /* renamed from: e */
        void mo360e(C0144a aVar, Handler handler);

        PlaybackStateCompat getPlaybackState();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0149c implements C0148b {

        /* renamed from: a */
        private C0183b f359a;

        /* renamed from: b */
        private C0151e f360b;

        C0149c(MediaSessionCompat.Token token) {
            this.f359a = C0183b.C0184a.m878x((IBinder) token.mo438f());
        }

        /* renamed from: H */
        public MediaMetadataCompat mo355H() {
            try {
                return this.f359a.mo529H();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
                return null;
            }
        }

        /* renamed from: a */
        public void mo356a(C0144a aVar) {
            if (aVar != null) {
                try {
                    this.f359a.mo564q2(aVar.f354d);
                    this.f359a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: b */
        public boolean mo357b(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f359a.mo572v3(keyEvent);
                    return false;
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        /* renamed from: c */
        public PendingIntent mo358c() {
            try {
                return this.f359a.mo550k1();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        /* renamed from: d */
        public C0151e mo359d() {
            if (this.f360b == null) {
                this.f360b = new C0153g(this.f359a);
            }
            return this.f360b;
        }

        /* renamed from: e */
        public void mo360e(C0144a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f359a.asBinder().linkToDeath(aVar, 0);
                    this.f359a.mo571v0(aVar.f354d);
                    aVar.mo384m(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    aVar.mo384m(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public PlaybackStateCompat getPlaybackState() {
            try {
                return this.f359a.getPlaybackState();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static final class C0150d {

        /* renamed from: a */
        private final int f361a;

        /* renamed from: b */
        private final AudioAttributesCompat f362b;

        /* renamed from: c */
        private final int f363c;

        /* renamed from: d */
        private final int f364d;

        /* renamed from: e */
        private final int f365e;

        C0150d(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.C0805a().mo4061b(i2).mo4060a(), i3, i4, i5);
        }

        C0150d(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f361a = i;
            this.f362b = audioAttributesCompat;
            this.f363c = i2;
            this.f364d = i3;
            this.f365e = i4;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static abstract class C0151e {
        C0151e() {
        }

        /* renamed from: a */
        public abstract void mo402a();

        /* renamed from: b */
        public abstract void mo403b();

        /* renamed from: c */
        public abstract void mo404c();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    static class C0152f extends C0151e {

        /* renamed from: a */
        protected final MediaController.TransportControls f366a;

        C0152f(MediaController.TransportControls transportControls) {
            this.f366a = transportControls;
        }

        /* renamed from: a */
        public void mo402a() {
            this.f366a.pause();
        }

        /* renamed from: b */
        public void mo403b() {
            this.f366a.play();
        }

        /* renamed from: c */
        public void mo404c() {
            this.f366a.stop();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    static class C0153g extends C0151e {

        /* renamed from: a */
        private C0183b f367a;

        public C0153g(C0183b bVar) {
            this.f367a = bVar;
        }

        /* renamed from: a */
        public void mo402a() {
            try {
                this.f367a.pause();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in pause.", e);
            }
        }

        /* renamed from: b */
        public void mo403b() {
            try {
                this.f367a.play();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in play.", e);
            }
        }

        /* renamed from: c */
        public void mo404c() {
            try {
                this.f367a.stop();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in stop.", e);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token f = mediaSessionCompat.mo408f();
            this.f344b = f;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f343a = new MediaControllerImplApi21(context, f);
            } else {
                this.f343a = new C0149c(f);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    /* renamed from: a */
    public boolean mo347a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f343a.mo357b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public MediaMetadataCompat mo348b() {
        return this.f343a.mo355H();
    }

    /* renamed from: c */
    public PlaybackStateCompat mo349c() {
        return this.f343a.getPlaybackState();
    }

    /* renamed from: d */
    public PendingIntent mo350d() {
        return this.f343a.mo358c();
    }

    /* renamed from: e */
    public C0151e mo351e() {
        return this.f343a.mo359d();
    }

    /* renamed from: f */
    public void mo352f(C0144a aVar) {
        mo353g(aVar, (Handler) null);
    }

    /* renamed from: g */
    public void mo353g(C0144a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f345c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.mo385n(handler);
            this.f343a.mo360e(aVar, handler);
        }
    }

    /* renamed from: h */
    public void mo354h(C0144a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f345c.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.f343a.mo356a(aVar);
            } finally {
                aVar.mo385n((Handler) null);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f344b = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f343a = new MediaControllerImplApi21(context, token);
            } else {
                this.f343a = new C0149c(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
