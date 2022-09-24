package android.support.p007v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p007v4.media.MediaDescriptionCompat;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.RatingCompat;
import android.support.p007v4.media.session.C0183b;
import android.support.p007v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p117n1.C5791b;
import p181z0.C6425b;
import p181z0.C6432i;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: d */
    static int f368d;

    /* renamed from: a */
    private final C0161c f369a;

    /* renamed from: b */
    private final MediaControllerCompat f370b;

    /* renamed from: c */
    private final ArrayList<C0175j> f371c;

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0155a();

        /* renamed from: b */
        ResultReceiver f375b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        class C0155a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0155a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f375b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f375b.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0156a();

        /* renamed from: b */
        private final Object f376b;

        /* renamed from: c */
        private final Object f377c;

        /* renamed from: d */
        private C0183b f378d;

        /* renamed from: e */
        private C5791b f379e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        class C0156a implements Parcelable.Creator<Token> {
            C0156a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0183b) null, (C5791b) null);
        }

        /* renamed from: a */
        public static Token m608a(Object obj) {
            return m609b(obj, (C0183b) null);
        }

        /* renamed from: b */
        public static Token m609b(Object obj, C0183b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        /* renamed from: d */
        public C0183b mo434d() {
            C0183b bVar;
            synchronized (this.f376b) {
                bVar = this.f378d;
            }
            return bVar;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public C5791b mo436e() {
            C5791b bVar;
            synchronized (this.f376b) {
                bVar = this.f379e;
            }
            return bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f377c;
            if (obj2 != null) {
                Object obj3 = token.f377c;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f377c == null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: f */
        public Object mo438f() {
            return this.f377c;
        }

        /* renamed from: g */
        public void mo439g(C0183b bVar) {
            synchronized (this.f376b) {
                this.f378d = bVar;
            }
        }

        /* renamed from: h */
        public void mo440h(C5791b bVar) {
            synchronized (this.f376b) {
                this.f379e = bVar;
            }
        }

        public int hashCode() {
            Object obj = this.f377c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f377c, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f377c);
            }
        }

        Token(Object obj, C0183b bVar) {
            this(obj, bVar, (C5791b) null);
        }

        Token(Object obj, C0183b bVar, C5791b bVar2) {
            this.f376b = new Object();
            this.f377c = obj;
            this.f378d = bVar;
            this.f379e = bVar2;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    class C0157a extends C0158b {
        C0157a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public static abstract class C0158b {

        /* renamed from: a */
        final Object f381a = new Object();

        /* renamed from: b */
        final MediaSession.Callback f382b;

        /* renamed from: c */
        private boolean f383c;

        /* renamed from: d */
        WeakReference<C0161c> f384d;

        /* renamed from: e */
        C0159a f385e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$a */
        private class C0159a extends Handler {
            C0159a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                C0161c cVar;
                C0158b bVar;
                C0159a aVar;
                if (message.what == 1) {
                    synchronized (C0158b.this.f381a) {
                        cVar = (C0161c) C0158b.this.f384d.get();
                        bVar = C0158b.this;
                        aVar = bVar.f385e;
                    }
                    if (cVar != null && bVar == cVar.mo505g() && aVar != null) {
                        cVar.mo513m((C6425b) message.obj);
                        C0158b.this.mo451a(cVar, aVar);
                        cVar.mo513m((C6425b) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b */
        private class C0160b extends MediaSession.Callback {
            C0160b() {
            }

            /* renamed from: a */
            private void m647a(C0161c cVar) {
                cVar.mo513m((C6425b) null);
            }

            /* renamed from: b */
            private C0166f m648b() {
                C0166f fVar;
                synchronized (C0158b.this.f381a) {
                    fVar = (C0166f) C0158b.this.f384d.get();
                }
                if (C0158b.this == fVar.mo505g()) {
                    return fVar;
                }
                return null;
            }

            /* renamed from: c */
            private void m649c(C0161c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String c = cVar.mo501c();
                    if (TextUtils.isEmpty(c)) {
                        c = "android.media.session.MediaController";
                    }
                    cVar.mo513m(new C6425b(c, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$f r0 = r5.m648b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.p007v4.media.session.MediaSessionCompat.m583c(r7)
                    r5.m649c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.mo499a()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.b r1 = r7.mo434d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    p001a0.C0022f.m52b(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    n1.b r7 = r7.mo436e()     // Catch:{ BadParcelableException -> 0x00b8 }
                    p117n1.C5790a.m25638c(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p007v4.media.session.MediaSessionCompat.C0158b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p007v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo452b(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p007v4.media.session.MediaSessionCompat.C0158b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p007v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo453c(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p007v4.media.session.MediaSessionCompat.C0158b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p007v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo467q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f398h     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f398h     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f398h     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.p007v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p007v4.media.session.MediaSessionCompat.C0158b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.mo420d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo467q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.p007v4.media.session.MediaSessionCompat.C0158b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.mo454d(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.m647a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.session.MediaSessionCompat.C0158b.C0160b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m583c(bundle2);
                            C0158b.this.mo462l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            C0158b.this.mo463m();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m583c(bundle3);
                            C0158b.this.mo464n(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m583c(bundle4);
                            C0158b.this.mo465o(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m583c(bundle5);
                            C0158b.this.mo466p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            C0158b.this.mo470t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            C0158b.this.mo474x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            C0158b.this.mo475y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m583c(bundle6);
                            C0158b.this.mo473w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            C0158b.this.mo471u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            C0158b.this.mo455e(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    m647a(b);
                }
            }

            public void onFastForward() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo456f();
                    m647a(b);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                C0166f b = m648b();
                if (b == null) {
                    return false;
                }
                m649c(b);
                boolean g = C0158b.this.mo457g(intent);
                m647a(b);
                if (g || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo458h();
                    m647a(b);
                }
            }

            public void onPlay() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo459i();
                    m647a(b);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    C0158b.this.mo460j(str, bundle);
                    m647a(b);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    C0158b.this.mo461k(str, bundle);
                    m647a(b);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    C0158b.this.mo462l(uri, bundle);
                    m647a(b);
                }
            }

            public void onPrepare() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo463m();
                    m647a(b);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    C0158b.this.mo464n(str, bundle);
                    m647a(b);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    C0158b.this.mo465o(str, bundle);
                    m647a(b);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C0166f b = m648b();
                if (b != null) {
                    MediaSessionCompat.m583c(bundle);
                    m649c(b);
                    C0158b.this.mo466p(uri, bundle);
                    m647a(b);
                }
            }

            public void onRewind() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo468r();
                    m647a(b);
                }
            }

            public void onSeekTo(long j) {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo469s(j);
                    m647a(b);
                }
            }

            public void onSetPlaybackSpeed(float f) {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo471u(f);
                    m647a(b);
                }
            }

            public void onSetRating(Rating rating) {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo472v(RatingCompat.m504a(rating));
                    m647a(b);
                }
            }

            public void onSkipToNext() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo476z();
                    m647a(b);
                }
            }

            public void onSkipToPrevious() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo447A();
                    m647a(b);
                }
            }

            public void onSkipToQueueItem(long j) {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo448B(j);
                    m647a(b);
                }
            }

            public void onStop() {
                C0166f b = m648b();
                if (b != null) {
                    m649c(b);
                    C0158b.this.mo449C();
                    m647a(b);
                }
            }
        }

        public C0158b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f382b = new C0160b();
            } else {
                this.f382b = null;
            }
            this.f384d = new WeakReference<>((Object) null);
        }

        /* renamed from: A */
        public void mo447A() {
        }

        /* renamed from: B */
        public void mo448B(long j) {
        }

        /* renamed from: C */
        public void mo449C() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo450D(C0161c cVar, Handler handler) {
            synchronized (this.f381a) {
                this.f384d = new WeakReference<>(cVar);
                C0159a aVar = this.f385e;
                C0159a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages((Object) null);
                }
                if (cVar != null) {
                    if (handler != null) {
                        aVar2 = new C0159a(handler.getLooper());
                    }
                }
                this.f385e = aVar2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo451a(C0161c cVar, Handler handler) {
            long j;
            if (this.f383c) {
                boolean z = false;
                this.f383c = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = cVar.getPlaybackState();
                if (playbackState == null) {
                    j = 0;
                } else {
                    j = playbackState.mo596b();
                }
                boolean z2 = playbackState != null && playbackState.mo602h() == 3;
                boolean z3 = (516 & j) != 0;
                if ((j & 514) != 0) {
                    z = true;
                }
                if (z2 && z) {
                    mo458h();
                } else if (!z2 && z3) {
                    mo459i();
                }
            }
        }

        /* renamed from: b */
        public void mo452b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: c */
        public void mo453c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: d */
        public void mo454d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: e */
        public void mo455e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo456f() {
        }

        /* renamed from: g */
        public boolean mo457g(Intent intent) {
            C0161c cVar;
            C0159a aVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f381a) {
                cVar = (C0161c) this.f384d.get();
                aVar = this.f385e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C6425b n = cVar.mo514n();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    mo451a(cVar, aVar);
                } else if (this.f383c) {
                    aVar.removeMessages(1);
                    this.f383c = false;
                    PlaybackStateCompat playbackState = cVar.getPlaybackState();
                    if (playbackState == null) {
                        j = 0;
                    } else {
                        j = playbackState.mo596b();
                    }
                    if ((j & 32) != 0) {
                        mo476z();
                    }
                } else {
                    this.f383c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, n), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo451a(cVar, aVar);
            return false;
        }

        /* renamed from: h */
        public void mo458h() {
        }

        /* renamed from: i */
        public void mo459i() {
        }

        /* renamed from: j */
        public void mo460j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo461k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo462l(Uri uri, Bundle bundle) {
        }

        /* renamed from: m */
        public void mo463m() {
        }

        /* renamed from: n */
        public void mo464n(String str, Bundle bundle) {
        }

        /* renamed from: o */
        public void mo465o(String str, Bundle bundle) {
        }

        /* renamed from: p */
        public void mo466p(Uri uri, Bundle bundle) {
        }

        /* renamed from: q */
        public void mo467q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: r */
        public void mo468r() {
        }

        /* renamed from: s */
        public void mo469s(long j) {
        }

        /* renamed from: t */
        public void mo470t(boolean z) {
        }

        /* renamed from: u */
        public void mo471u(float f) {
        }

        /* renamed from: v */
        public void mo472v(RatingCompat ratingCompat) {
        }

        /* renamed from: w */
        public void mo473w(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: x */
        public void mo474x(int i) {
        }

        /* renamed from: y */
        public void mo475y(int i) {
        }

        /* renamed from: z */
        public void mo476z() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    interface C0161c {
        /* renamed from: a */
        Token mo499a();

        /* renamed from: b */
        void mo500b(C6432i iVar);

        /* renamed from: c */
        String mo501c();

        /* renamed from: d */
        void mo502d(PendingIntent pendingIntent);

        /* renamed from: e */
        void mo503e(C0158b bVar, Handler handler);

        /* renamed from: f */
        void mo504f(int i);

        /* renamed from: g */
        C0158b mo505g();

        PlaybackStateCompat getPlaybackState();

        /* renamed from: h */
        void mo507h(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: i */
        void mo508i(PendingIntent pendingIntent);

        boolean isActive();

        /* renamed from: j */
        Object mo510j();

        /* renamed from: k */
        void mo511k(boolean z);

        /* renamed from: l */
        void mo512l(PlaybackStateCompat playbackStateCompat);

        /* renamed from: m */
        void mo513m(C6425b bVar);

        /* renamed from: n */
        C6425b mo514n();

        void release();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0162d extends C0170i {

        /* renamed from: G */
        private static boolean f388G = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        class C0163a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            C0163a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0162d.this.mo580t(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        C0162d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C5791b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo516B(PendingIntent pendingIntent, ComponentName componentName) {
            if (f388G) {
                this.f421i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo516B(pendingIntent, componentName);
            }
        }

        /* renamed from: e */
        public void mo503e(C0158b bVar, Handler handler) {
            super.mo503e(bVar, handler);
            if (bVar == null) {
                this.f422j.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f422j.setPlaybackPositionUpdateListener(new C0163a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public int mo517s(long j) {
            int s = super.mo517s(j);
            return (j & 256) != 0 ? s | 256 : s;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo518u(PendingIntent pendingIntent, ComponentName componentName) {
            if (f388G) {
                try {
                    this.f421i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f388G = false;
                }
            }
            if (!f388G) {
                super.mo518u(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo519z(PlaybackStateCompat playbackStateCompat) {
            long g = playbackStateCompat.mo601g();
            float e = playbackStateCompat.mo599e();
            long d = playbackStateCompat.mo597d();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo602h() == 3) {
                long j = 0;
                if (g > 0) {
                    if (d > 0) {
                        j = elapsedRealtime - d;
                        if (e > 0.0f && e != 1.0f) {
                            j = (long) (((float) j) * e);
                        }
                    }
                    g += j;
                }
            }
            this.f422j.setPlaybackState(mo579r(playbackStateCompat.mo602h()), g, e);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0164e extends C0162d {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class C0165a implements RemoteControlClient.OnMetadataUpdateListener {
            C0165a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0164e.this.mo580t(19, -1, -1, RatingCompat.m504a(obj), (Bundle) null);
                }
            }
        }

        C0164e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C5791b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        /* renamed from: e */
        public void mo503e(C0158b bVar, Handler handler) {
            super.mo503e(bVar, handler);
            if (bVar == null) {
                this.f422j.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f422j.setMetadataUpdateListener(new C0165a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public RemoteControlClient.MetadataEditor mo521p(Bundle bundle) {
            RemoteControlClient.MetadataEditor p = super.mo521p(bundle);
            PlaybackStateCompat playbackStateCompat = this.f432t;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.mo596b()) & 128) != 0) {
                p.addEditableKey(268435457);
            }
            if (bundle == null) {
                return p;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                p.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                p.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                p.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public int mo517s(long j) {
            int s = super.mo517s(j);
            return (j & 128) != 0 ? s | 512 : s;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0166f implements C0161c {

        /* renamed from: a */
        final MediaSession f391a;

        /* renamed from: b */
        final Token f392b;

        /* renamed from: c */
        final Object f393c = new Object();

        /* renamed from: d */
        Bundle f394d;

        /* renamed from: e */
        boolean f395e = false;

        /* renamed from: f */
        final RemoteCallbackList<C0180a> f396f = new RemoteCallbackList<>();

        /* renamed from: g */
        PlaybackStateCompat f397g;

        /* renamed from: h */
        List<QueueItem> f398h;

        /* renamed from: i */
        MediaMetadataCompat f399i;

        /* renamed from: j */
        int f400j;

        /* renamed from: k */
        boolean f401k;

        /* renamed from: l */
        int f402l;

        /* renamed from: m */
        int f403m;

        /* renamed from: n */
        C0158b f404n;

        /* renamed from: o */
        C6425b f405o;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        class C0167a extends C0183b.C0184a {
            C0167a() {
            }

            /* renamed from: C4 */
            public boolean mo524C4() {
                return C0166f.this.f401k;
            }

            /* renamed from: C5 */
            public void mo525C5(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: D3 */
            public void mo526D3(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: E0 */
            public boolean mo527E0() {
                return false;
            }

            /* renamed from: E2 */
            public void mo528E2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: H */
            public MediaMetadataCompat mo529H() {
                throw new AssertionError();
            }

            /* renamed from: H0 */
            public void mo530H0(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: J0 */
            public void mo531J0(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: K0 */
            public void mo532K0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: K2 */
            public void mo533K2() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: K3 */
            public void mo534K3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O2 */
            public void mo535O2(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: R3 */
            public void mo536R3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: R4 */
            public void mo537R4(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: T4 */
            public List<QueueItem> mo538T4() {
                return null;
            }

            /* renamed from: X4 */
            public void mo539X4() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Z */
            public Bundle mo540Z() {
                throw new AssertionError();
            }

            /* renamed from: Z0 */
            public void mo541Z0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: a4 */
            public void mo542a4(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b1 */
            public boolean mo543b1() {
                throw new AssertionError();
            }

            /* renamed from: e1 */
            public void mo544e1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: f2 */
            public CharSequence mo545f2() {
                throw new AssertionError();
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            public PlaybackStateCompat getPlaybackState() {
                C0166f fVar = C0166f.this;
                return MediaSessionCompat.m584g(fVar.f397g, fVar.f399i);
            }

            public int getRepeatMode() {
                return C0166f.this.f402l;
            }

            public String getTag() {
                throw new AssertionError();
            }

            /* renamed from: k1 */
            public PendingIntent mo550k1() {
                throw new AssertionError();
            }

            /* renamed from: l1 */
            public int mo551l1() {
                return C0166f.this.f400j;
            }

            /* renamed from: l5 */
            public long mo552l5() {
                throw new AssertionError();
            }

            /* renamed from: n2 */
            public void mo553n2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: n5 */
            public void mo554n5(long j) {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: o0 */
            public void mo556o0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: o1 */
            public void mo557o1(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: o5 */
            public void mo558o5(boolean z) throws RemoteException {
            }

            /* renamed from: p2 */
            public Bundle mo559p2() {
                if (C0166f.this.f394d == null) {
                    return null;
                }
                return new Bundle(C0166f.this.f394d);
            }

            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            public void play() throws RemoteException {
                throw new AssertionError();
            }

            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: q2 */
            public void mo564q2(C0180a aVar) {
                C0166f.this.f396f.unregister(aVar);
            }

            /* renamed from: r4 */
            public int mo565r4() {
                return C0166f.this.f403m;
            }

            /* renamed from: s5 */
            public ParcelableVolumeInfo mo566s5() {
                throw new AssertionError();
            }

            public void seekTo(long j) throws RemoteException {
                throw new AssertionError();
            }

            public void setPlaybackSpeed(float f) throws RemoteException {
                throw new AssertionError();
            }

            public void setRepeatMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: v0 */
            public void mo571v0(C0180a aVar) {
                if (!C0166f.this.f395e) {
                    C0166f.this.f396f.register(aVar, new C6425b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: v3 */
            public boolean mo572v3(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: v4 */
            public void mo573v4(int i) {
                throw new AssertionError();
            }

            /* renamed from: x2 */
            public void mo574x2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
        }

        C0166f(MediaSession mediaSession, C5791b bVar, Bundle bundle) {
            this.f391a = mediaSession;
            this.f392b = new Token(mediaSession.getSessionToken(), new C0167a(), bVar);
            this.f394d = bundle;
            mo523o(3);
        }

        /* renamed from: a */
        public Token mo499a() {
            return this.f392b;
        }

        /* renamed from: b */
        public void mo500b(C6432i iVar) {
            this.f391a.setPlaybackToRemote((VolumeProvider) iVar.mo24251d());
        }

        /* renamed from: c */
        public String mo501c() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f391a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f391a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        /* renamed from: d */
        public void mo502d(PendingIntent pendingIntent) {
            this.f391a.setSessionActivity(pendingIntent);
        }

        /* renamed from: e */
        public void mo503e(C0158b bVar, Handler handler) {
            synchronized (this.f393c) {
                this.f404n = bVar;
                this.f391a.setCallback(bVar == null ? null : bVar.f382b, handler);
                if (bVar != null) {
                    bVar.mo450D(this, handler);
                }
            }
        }

        /* renamed from: f */
        public void mo504f(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f391a.setPlaybackToLocal(builder.build());
        }

        /* renamed from: g */
        public C0158b mo505g() {
            C0158b bVar;
            synchronized (this.f393c) {
                bVar = this.f404n;
            }
            return bVar;
        }

        public PlaybackStateCompat getPlaybackState() {
            return this.f397g;
        }

        /* renamed from: h */
        public void mo507h(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f399i = mediaMetadataCompat;
            MediaSession mediaSession = this.f391a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.mo328h();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        /* renamed from: i */
        public void mo508i(PendingIntent pendingIntent) {
            this.f391a.setMediaButtonReceiver(pendingIntent);
        }

        public boolean isActive() {
            return this.f391a.isActive();
        }

        /* renamed from: j */
        public Object mo510j() {
            return null;
        }

        /* renamed from: k */
        public void mo511k(boolean z) {
            this.f391a.setActive(z);
        }

        /* renamed from: l */
        public void mo512l(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f397g = playbackStateCompat;
            for (int beginBroadcast = this.f396f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f396f.getBroadcastItem(beginBroadcast).mo398Z5(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f396f.finishBroadcast();
            MediaSession mediaSession = this.f391a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.mo600f();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        /* renamed from: m */
        public void mo513m(C6425b bVar) {
            synchronized (this.f393c) {
                this.f405o = bVar;
            }
        }

        /* renamed from: n */
        public C6425b mo514n() {
            C6425b bVar;
            synchronized (this.f393c) {
                bVar = this.f405o;
            }
            return bVar;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: o */
        public void mo523o(int i) {
            this.f391a.setFlags(i | 1 | 2);
        }

        public void release() {
            this.f395e = true;
            this.f396f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f391a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f391a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.f391a.setCallback((MediaSession.Callback) null);
            this.f391a.release();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0168g extends C0166f {
        C0168g(MediaSession mediaSession, C5791b bVar, Bundle bundle) {
            super(mediaSession, bVar, bundle);
        }

        /* renamed from: m */
        public void mo513m(C6425b bVar) {
        }

        /* renamed from: n */
        public final C6425b mo514n() {
            return new C6425b(this.f391a.getCurrentControllerInfo());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    static class C0169h extends C0168g {
        C0169h(MediaSession mediaSession, C5791b bVar, Bundle bundle) {
            super(mediaSession, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    static class C0170i implements C0161c {

        /* renamed from: A */
        int f407A;

        /* renamed from: B */
        Bundle f408B;

        /* renamed from: C */
        int f409C;

        /* renamed from: D */
        int f410D;

        /* renamed from: E */
        C6432i f411E;

        /* renamed from: F */
        private C6432i.C6435c f412F = new C0171a();

        /* renamed from: a */
        private final Context f413a;

        /* renamed from: b */
        private final ComponentName f414b;

        /* renamed from: c */
        private final PendingIntent f415c;

        /* renamed from: d */
        private final C0173c f416d;

        /* renamed from: e */
        private final Token f417e;

        /* renamed from: f */
        final String f418f;

        /* renamed from: g */
        final Bundle f419g;

        /* renamed from: h */
        final String f420h;

        /* renamed from: i */
        final AudioManager f421i;

        /* renamed from: j */
        final RemoteControlClient f422j;

        /* renamed from: k */
        final Object f423k = new Object();

        /* renamed from: l */
        final RemoteCallbackList<C0180a> f424l = new RemoteCallbackList<>();

        /* renamed from: m */
        private C0174d f425m;

        /* renamed from: n */
        boolean f426n = false;

        /* renamed from: o */
        boolean f427o = false;

        /* renamed from: p */
        volatile C0158b f428p;

        /* renamed from: q */
        private C6425b f429q;

        /* renamed from: r */
        int f430r = 3;

        /* renamed from: s */
        MediaMetadataCompat f431s;

        /* renamed from: t */
        PlaybackStateCompat f432t;

        /* renamed from: u */
        PendingIntent f433u;

        /* renamed from: v */
        List<QueueItem> f434v;

        /* renamed from: w */
        CharSequence f435w;

        /* renamed from: x */
        int f436x;

        /* renamed from: y */
        boolean f437y;

        /* renamed from: z */
        int f438z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$a */
        class C0171a extends C6432i.C6435c {
            C0171a() {
            }

            /* renamed from: a */
            public void mo582a(C6432i iVar) {
                if (C0170i.this.f411E == iVar) {
                    C0170i iVar2 = C0170i.this;
                    C0170i.this.mo581y(new ParcelableVolumeInfo(iVar2.f409C, iVar2.f410D, iVar.mo24250c(), iVar.mo24249b(), iVar.mo24248a()));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$b */
        private static final class C0172b {

            /* renamed from: a */
            public final String f440a;

            /* renamed from: b */
            public final Bundle f441b;

            /* renamed from: c */
            public final ResultReceiver f442c;

            public C0172b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f440a = str;
                this.f441b = bundle;
                this.f442c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$c */
        class C0173c extends C0183b.C0184a {
            C0173c() {
            }

            /* renamed from: C4 */
            public boolean mo524C4() {
                return C0170i.this.f437y;
            }

            /* renamed from: C5 */
            public void mo525C5(int i) throws RemoteException {
                mo584m6(30, i);
            }

            /* renamed from: D3 */
            public void mo526D3(int i, int i2, String str) {
                C0170i.this.mo577o(i, i2);
            }

            /* renamed from: E0 */
            public boolean mo527E0() {
                return false;
            }

            /* renamed from: E2 */
            public void mo528E2(String str, Bundle bundle) throws RemoteException {
                mo587p6(9, str, bundle);
            }

            /* renamed from: H */
            public MediaMetadataCompat mo529H() {
                return C0170i.this.f431s;
            }

            /* renamed from: H0 */
            public void mo530H0(RatingCompat ratingCompat) throws RemoteException {
                mo585n6(19, ratingCompat);
            }

            /* renamed from: J0 */
            public void mo531J0(int i, int i2, String str) {
                C0170i.this.mo575A(i, i2);
            }

            /* renamed from: K0 */
            public void mo532K0(Uri uri, Bundle bundle) throws RemoteException {
                mo587p6(6, uri, bundle);
            }

            /* renamed from: K2 */
            public void mo533K2() throws RemoteException {
                mo583f3(16);
            }

            /* renamed from: K3 */
            public void mo534K3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo587p6(31, ratingCompat, bundle);
            }

            /* renamed from: O2 */
            public void mo535O2(Uri uri, Bundle bundle) throws RemoteException {
                mo587p6(10, uri, bundle);
            }

            /* renamed from: R3 */
            public void mo536R3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo586o6(26, mediaDescriptionCompat, i);
            }

            /* renamed from: R4 */
            public void mo537R4(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.f375b;
                }
                mo585n6(1, new C0172b(str, bundle, resultReceiver));
            }

            /* renamed from: T4 */
            public List<QueueItem> mo538T4() {
                List<QueueItem> list;
                synchronized (C0170i.this.f423k) {
                    list = C0170i.this.f434v;
                }
                return list;
            }

            /* renamed from: X4 */
            public void mo539X4() throws RemoteException {
                mo583f3(17);
            }

            /* renamed from: Z */
            public Bundle mo540Z() {
                Bundle bundle;
                synchronized (C0170i.this.f423k) {
                    bundle = C0170i.this.f408B;
                }
                return bundle;
            }

            /* renamed from: Z0 */
            public void mo541Z0(MediaDescriptionCompat mediaDescriptionCompat) {
                mo585n6(27, mediaDescriptionCompat);
            }

            /* renamed from: a4 */
            public void mo542a4(boolean z) throws RemoteException {
                mo585n6(29, Boolean.valueOf(z));
            }

            /* renamed from: b1 */
            public boolean mo543b1() {
                return true;
            }

            /* renamed from: e1 */
            public void mo544e1(MediaDescriptionCompat mediaDescriptionCompat) {
                mo585n6(25, mediaDescriptionCompat);
            }

            /* renamed from: f2 */
            public CharSequence mo545f2() {
                return C0170i.this.f435w;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f3 */
            public void mo583f3(int i) {
                C0170i.this.mo580t(i, 0, 0, (Object) null, (Bundle) null);
            }

            public String getPackageName() {
                return C0170i.this.f418f;
            }

            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0170i.this.f423k) {
                    C0170i iVar = C0170i.this;
                    playbackStateCompat = iVar.f432t;
                    mediaMetadataCompat = iVar.f431s;
                }
                return MediaSessionCompat.m584g(playbackStateCompat, mediaMetadataCompat);
            }

            public int getRepeatMode() {
                return C0170i.this.f438z;
            }

            public String getTag() {
                return C0170i.this.f420h;
            }

            /* renamed from: k1 */
            public PendingIntent mo550k1() {
                PendingIntent pendingIntent;
                synchronized (C0170i.this.f423k) {
                    pendingIntent = C0170i.this.f433u;
                }
                return pendingIntent;
            }

            /* renamed from: l1 */
            public int mo551l1() {
                return C0170i.this.f436x;
            }

            /* renamed from: l5 */
            public long mo552l5() {
                long j;
                synchronized (C0170i.this.f423k) {
                    j = (long) C0170i.this.f430r;
                }
                return j;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: m6 */
            public void mo584m6(int i, int i2) {
                C0170i.this.mo580t(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: n2 */
            public void mo553n2(String str, Bundle bundle) throws RemoteException {
                mo587p6(4, str, bundle);
            }

            /* renamed from: n5 */
            public void mo554n5(long j) {
                mo585n6(11, Long.valueOf(j));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: n6 */
            public void mo585n6(int i, Object obj) {
                C0170i.this.mo580t(i, 0, 0, obj, (Bundle) null);
            }

            public void next() throws RemoteException {
                mo583f3(14);
            }

            /* renamed from: o0 */
            public void mo556o0(String str, Bundle bundle) throws RemoteException {
                mo587p6(20, str, bundle);
            }

            /* renamed from: o1 */
            public void mo557o1(String str, Bundle bundle) throws RemoteException {
                mo587p6(5, str, bundle);
            }

            /* renamed from: o5 */
            public void mo558o5(boolean z) throws RemoteException {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: o6 */
            public void mo586o6(int i, Object obj, int i2) {
                C0170i.this.mo580t(i, i2, 0, obj, (Bundle) null);
            }

            /* renamed from: p2 */
            public Bundle mo559p2() {
                if (C0170i.this.f419g == null) {
                    return null;
                }
                return new Bundle(C0170i.this.f419g);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: p6 */
            public void mo587p6(int i, Object obj, Bundle bundle) {
                C0170i.this.mo580t(i, 0, 0, obj, bundle);
            }

            public void pause() throws RemoteException {
                mo583f3(12);
            }

            public void play() throws RemoteException {
                mo583f3(7);
            }

            public void prepare() throws RemoteException {
                mo583f3(3);
            }

            public void previous() throws RemoteException {
                mo583f3(15);
            }

            /* renamed from: q2 */
            public void mo564q2(C0180a aVar) {
                C0170i.this.f424l.unregister(aVar);
            }

            /* renamed from: r4 */
            public int mo565r4() {
                return C0170i.this.f407A;
            }

            /* renamed from: s5 */
            public ParcelableVolumeInfo mo566s5() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0170i.this.f423k) {
                    C0170i iVar = C0170i.this;
                    i = iVar.f409C;
                    i2 = iVar.f410D;
                    C6432i iVar2 = iVar.f411E;
                    i3 = 2;
                    if (i == 2) {
                        int c = iVar2.mo24250c();
                        int b = iVar2.mo24249b();
                        i4 = iVar2.mo24248a();
                        i5 = b;
                        i3 = c;
                    } else {
                        i5 = iVar.f421i.getStreamMaxVolume(i2);
                        i4 = C0170i.this.f421i.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i5, i4);
            }

            public void seekTo(long j) throws RemoteException {
                mo585n6(18, Long.valueOf(j));
            }

            public void setPlaybackSpeed(float f) throws RemoteException {
                mo585n6(32, Float.valueOf(f));
            }

            public void setRepeatMode(int i) throws RemoteException {
                mo584m6(23, i);
            }

            public void stop() throws RemoteException {
                mo583f3(13);
            }

            /* renamed from: v0 */
            public void mo571v0(C0180a aVar) {
                if (C0170i.this.f426n) {
                    try {
                        aVar.mo367Q3();
                    } catch (Exception unused) {
                    }
                } else {
                    C0170i.this.f424l.register(aVar, new C6425b(C0170i.this.mo578q(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: v3 */
            public boolean mo572v3(KeyEvent keyEvent) {
                mo585n6(21, keyEvent);
                return true;
            }

            /* renamed from: v4 */
            public void mo573v4(int i) {
                mo584m6(28, i);
            }

            /* renamed from: x2 */
            public void mo574x2(String str, Bundle bundle) throws RemoteException {
                mo587p6(8, str, bundle);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$d */
        class C0174d extends Handler {
            public C0174d(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m800a(KeyEvent keyEvent, C0158b bVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0170i.this.f432t;
                    long b = playbackStateCompat == null ? 0 : playbackStateCompat.mo596b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((b & 1) != 0) {
                                            bVar.mo449C();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((b & 32) != 0) {
                                            bVar.mo476z();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((b & 16) != 0) {
                                            bVar.mo447A();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((b & 8) != 0) {
                                            bVar.mo468r();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((b & 64) != 0) {
                                            bVar.mo456f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((b & 2) != 0) {
                                bVar.mo458h();
                                return;
                            } else {
                                return;
                            }
                        } else if ((b & 4) != 0) {
                            bVar.mo459i();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            public void handleMessage(Message message) {
                C0158b bVar = C0170i.this.f428p;
                if (bVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m583c(data);
                    C0170i.this.mo513m(new C6425b(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.m583c(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0172b bVar2 = (C0172b) message.obj;
                                bVar.mo454d(bVar2.f440a, bVar2.f441b, bVar2.f442c);
                                break;
                            case 2:
                                C0170i.this.mo577o(message.arg1, 0);
                                break;
                            case 3:
                                bVar.mo463m();
                                break;
                            case 4:
                                bVar.mo464n((String) message.obj, bundle);
                                break;
                            case 5:
                                bVar.mo465o((String) message.obj, bundle);
                                break;
                            case 6:
                                bVar.mo466p((Uri) message.obj, bundle);
                                break;
                            case 7:
                                bVar.mo459i();
                                break;
                            case 8:
                                bVar.mo460j((String) message.obj, bundle);
                                break;
                            case 9:
                                bVar.mo461k((String) message.obj, bundle);
                                break;
                            case 10:
                                bVar.mo462l((Uri) message.obj, bundle);
                                break;
                            case 11:
                                bVar.mo448B(((Long) message.obj).longValue());
                                break;
                            case 12:
                                bVar.mo458h();
                                break;
                            case 13:
                                bVar.mo449C();
                                break;
                            case 14:
                                bVar.mo476z();
                                break;
                            case 15:
                                bVar.mo447A();
                                break;
                            case 16:
                                bVar.mo456f();
                                break;
                            case 17:
                                bVar.mo468r();
                                break;
                            case 18:
                                bVar.mo469s(((Long) message.obj).longValue());
                                break;
                            case 19:
                                bVar.mo472v((RatingCompat) message.obj);
                                break;
                            case 20:
                                bVar.mo455e((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!bVar.mo457g(intent)) {
                                    m800a(keyEvent, bVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0170i.this.mo575A(message.arg1, 0);
                                break;
                            case 23:
                                bVar.mo474x(message.arg1);
                                break;
                            case 25:
                                bVar.mo452b((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                bVar.mo453c((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                bVar.mo467q((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = C0170i.this.f434v;
                                if (list != null) {
                                    int i = message.arg1;
                                    QueueItem queueItem = (i < 0 || i >= list.size()) ? null : C0170i.this.f434v.get(message.arg1);
                                    if (queueItem != null) {
                                        bVar.mo467q(queueItem.mo420d());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                bVar.mo470t(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                bVar.mo475y(message.arg1);
                                break;
                            case 31:
                                bVar.mo473w((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                bVar.mo471u(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        C0170i.this.mo513m((C6425b) null);
                    }
                }
            }
        }

        public C0170i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C5791b bVar, Bundle bundle) {
            if (componentName != null) {
                this.f413a = context;
                this.f418f = context.getPackageName();
                this.f419g = bundle;
                this.f421i = (AudioManager) context.getSystemService("audio");
                this.f420h = str;
                this.f414b = componentName;
                this.f415c = pendingIntent;
                C0173c cVar = new C0173c();
                this.f416d = cVar;
                this.f417e = new Token(cVar, (C0183b) null, bVar);
                this.f436x = 0;
                this.f409C = 1;
                this.f410D = 3;
                this.f422j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        /* renamed from: v */
        private void m727v(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f424l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f424l.getBroadcastItem(beginBroadcast).mo368T3(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f424l.finishBroadcast();
        }

        /* renamed from: w */
        private void m728w() {
            for (int beginBroadcast = this.f424l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f424l.getBroadcastItem(beginBroadcast).mo367Q3();
                } catch (RemoteException unused) {
                }
            }
            this.f424l.finishBroadcast();
            this.f424l.kill();
        }

        /* renamed from: x */
        private void m729x(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f424l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f424l.getBroadcastItem(beginBroadcast).mo398Z5(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f424l.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo575A(int i, int i2) {
            if (this.f409C == 2) {
                C6432i iVar = this.f411E;
                if (iVar != null) {
                    iVar.mo4765f(i);
                    return;
                }
                return;
            }
            this.f421i.setStreamVolume(this.f410D, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo516B(PendingIntent pendingIntent, ComponentName componentName) {
            this.f421i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo576C() {
            if (this.f427o) {
                mo518u(this.f415c, this.f414b);
                this.f421i.registerRemoteControlClient(this.f422j);
                mo507h(this.f431s);
                mo512l(this.f432t);
                return;
            }
            mo516B(this.f415c, this.f414b);
            this.f422j.setPlaybackState(0);
            this.f421i.unregisterRemoteControlClient(this.f422j);
        }

        /* renamed from: a */
        public Token mo499a() {
            return this.f417e;
        }

        /* renamed from: b */
        public void mo500b(C6432i iVar) {
            if (iVar != null) {
                C6432i iVar2 = this.f411E;
                if (iVar2 != null) {
                    iVar2.mo24252g((C6432i.C6435c) null);
                }
                this.f409C = 2;
                this.f411E = iVar;
                mo581y(new ParcelableVolumeInfo(this.f409C, this.f410D, this.f411E.mo24250c(), this.f411E.mo24249b(), this.f411E.mo24248a()));
                iVar.mo24252g(this.f412F);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        /* renamed from: c */
        public String mo501c() {
            return null;
        }

        /* renamed from: d */
        public void mo502d(PendingIntent pendingIntent) {
            synchronized (this.f423k) {
                this.f433u = pendingIntent;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo503e(android.support.p007v4.media.session.MediaSessionCompat.C0158b r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f423k
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$i$d r1 = r4.f425m     // Catch:{ all -> 0x0037 }
                r2 = 0
                if (r1 == 0) goto L_0x000b
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0037 }
            L_0x000b:
                if (r5 == 0) goto L_0x001a
                if (r6 != 0) goto L_0x0010
                goto L_0x001a
            L_0x0010:
                android.support.v4.media.session.MediaSessionCompat$i$d r1 = new android.support.v4.media.session.MediaSessionCompat$i$d     // Catch:{ all -> 0x0037 }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x0037 }
                r1.<init>(r3)     // Catch:{ all -> 0x0037 }
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                r4.f425m = r1     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f428p     // Catch:{ all -> 0x0037 }
                if (r1 == r5) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f428p     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f428p     // Catch:{ all -> 0x0037 }
                r1.mo450D(r2, r2)     // Catch:{ all -> 0x0037 }
            L_0x002a:
                r4.f428p = r5     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f428p     // Catch:{ all -> 0x0037 }
                if (r5 == 0) goto L_0x0035
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f428p     // Catch:{ all -> 0x0037 }
                r5.mo450D(r4, r6)     // Catch:{ all -> 0x0037 }
            L_0x0035:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                return
            L_0x0037:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.session.MediaSessionCompat.C0170i.mo503e(android.support.v4.media.session.MediaSessionCompat$b, android.os.Handler):void");
        }

        /* renamed from: f */
        public void mo504f(int i) {
            C6432i iVar = this.f411E;
            if (iVar != null) {
                iVar.mo24252g((C6432i.C6435c) null);
            }
            this.f410D = i;
            this.f409C = 1;
            int i2 = this.f409C;
            int i3 = this.f410D;
            mo581y(new ParcelableVolumeInfo(i2, i3, 2, this.f421i.getStreamMaxVolume(i3), this.f421i.getStreamVolume(this.f410D)));
        }

        /* renamed from: g */
        public C0158b mo505g() {
            C0158b bVar;
            synchronized (this.f423k) {
                bVar = this.f428p;
            }
            return bVar;
        }

        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f423k) {
                playbackStateCompat = this.f432t;
            }
            return playbackStateCompat;
        }

        /* renamed from: h */
        public void mo507h(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0141b(mediaMetadataCompat, MediaSessionCompat.f368d).mo336a();
            }
            synchronized (this.f423k) {
                this.f431s = mediaMetadataCompat;
            }
            m727v(mediaMetadataCompat);
            if (this.f427o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo325e();
                }
                mo521p(bundle).apply();
            }
        }

        /* renamed from: i */
        public void mo508i(PendingIntent pendingIntent) {
        }

        public boolean isActive() {
            return this.f427o;
        }

        /* renamed from: j */
        public Object mo510j() {
            return null;
        }

        /* renamed from: k */
        public void mo511k(boolean z) {
            if (z != this.f427o) {
                this.f427o = z;
                mo576C();
            }
        }

        /* renamed from: l */
        public void mo512l(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f423k) {
                this.f432t = playbackStateCompat;
            }
            m729x(playbackStateCompat);
            if (this.f427o) {
                if (playbackStateCompat == null) {
                    this.f422j.setPlaybackState(0);
                    this.f422j.setTransportControlFlags(0);
                    return;
                }
                mo519z(playbackStateCompat);
                this.f422j.setTransportControlFlags(mo517s(playbackStateCompat.mo596b()));
            }
        }

        /* renamed from: m */
        public void mo513m(C6425b bVar) {
            synchronized (this.f423k) {
                this.f429q = bVar;
            }
        }

        /* renamed from: n */
        public C6425b mo514n() {
            C6425b bVar;
            synchronized (this.f423k) {
                bVar = this.f429q;
            }
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo577o(int i, int i2) {
            if (this.f409C == 2) {
                C6432i iVar = this.f411E;
                if (iVar != null) {
                    iVar.mo4764e(i);
                    return;
                }
                return;
            }
            this.f421i.adjustStreamVolume(this.f410D, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public RemoteControlClient.MetadataEditor mo521p(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f422j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public String mo578q(int i) {
            String nameForUid = this.f413a.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo579r(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public void release() {
            this.f427o = false;
            this.f426n = true;
            mo576C();
            m728w();
            mo503e((C0158b) null, (Handler) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public int mo517s(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo580t(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f423k) {
                C0174d dVar = this.f425m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", mo578q(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo518u(PendingIntent pendingIntent, ComponentName componentName) {
            this.f421i.registerMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo581y(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f424l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f424l.getBroadcastItem(beginBroadcast).mo370j6(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f424l.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo519z(PlaybackStateCompat playbackStateCompat) {
            this.f422j.setPlaybackState(mo579r(playbackStateCompat.mo602h()));
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    public interface C0175j {
        /* renamed from: a */
        void mo589a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    /* renamed from: b */
    private MediaSession m582b(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new MediaSession(context, str, bundle);
        }
        return new MediaSession(context, str);
    }

    /* renamed from: c */
    public static void m583c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: g */
    static PlaybackStateCompat m584g(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.mo601g() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo602h() != 3 && playbackStateCompat.mo602h() != 4 && playbackStateCompat.mo602h() != 5) {
            return playbackStateCompat;
        }
        long d = playbackStateCompat.mo597d();
        if (d <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long e = ((long) (playbackStateCompat.mo599e() * ((float) (elapsedRealtime - d)))) + playbackStateCompat.mo601g();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo322a("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.mo327g("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.C0179b(playbackStateCompat).mo620d(playbackStateCompat.mo602h(), (j < 0 || e <= j) ? e < 0 ? 0 : e : j, playbackStateCompat.mo599e(), elapsedRealtime).mo617a();
    }

    /* renamed from: s */
    public static Bundle m585s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m583c(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: a */
    public void mo405a(C0175j jVar) {
        if (jVar != null) {
            this.f371c.add(jVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    /* renamed from: d */
    public MediaControllerCompat mo406d() {
        return this.f370b;
    }

    /* renamed from: e */
    public Object mo407e() {
        return this.f369a.mo510j();
    }

    /* renamed from: f */
    public Token mo408f() {
        return this.f369a.mo499a();
    }

    /* renamed from: h */
    public boolean mo409h() {
        return this.f369a.isActive();
    }

    /* renamed from: i */
    public void mo410i() {
        this.f369a.release();
    }

    /* renamed from: j */
    public void mo411j(C0175j jVar) {
        if (jVar != null) {
            this.f371c.remove(jVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    /* renamed from: k */
    public void mo412k(boolean z) {
        this.f369a.mo511k(z);
        Iterator<C0175j> it = this.f371c.iterator();
        while (it.hasNext()) {
            it.next().mo589a();
        }
    }

    /* renamed from: l */
    public void mo413l(C0158b bVar) {
        mo414m(bVar, (Handler) null);
    }

    /* renamed from: m */
    public void mo414m(C0158b bVar, Handler handler) {
        if (bVar == null) {
            this.f369a.mo503e((C0158b) null, (Handler) null);
            return;
        }
        C0161c cVar = this.f369a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.mo503e(bVar, handler);
    }

    /* renamed from: n */
    public void mo415n(MediaMetadataCompat mediaMetadataCompat) {
        this.f369a.mo507h(mediaMetadataCompat);
    }

    /* renamed from: o */
    public void mo416o(PlaybackStateCompat playbackStateCompat) {
        this.f369a.mo512l(playbackStateCompat);
    }

    /* renamed from: p */
    public void mo417p(int i) {
        this.f369a.mo504f(i);
    }

    /* renamed from: q */
    public void mo418q(C6432i iVar) {
        if (iVar != null) {
            this.f369a.mo500b(iVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    /* renamed from: r */
    public void mo419r(PendingIntent pendingIntent) {
        this.f369a.mo502d(pendingIntent);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (C5791b) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, C5791b bVar) {
        this.f371c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = MediaButtonReceiver.m4451a(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                MediaSession b = m582b(context, str, bundle);
                if (i >= 29) {
                    this.f369a = new C0169h(b, bVar, bundle);
                } else if (i >= 28) {
                    this.f369a = new C0168g(b, bVar, bundle);
                } else {
                    this.f369a = new C0166f(b, bVar, bundle);
                }
                mo414m(new C0157a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f369a.mo508i(pendingIntent2);
            } else if (i >= 19) {
                this.f369a = new C0164e(context, str, componentName2, pendingIntent2, bVar, bundle);
            } else if (i >= 18) {
                this.f369a = new C0162d(context, str, componentName2, pendingIntent2, bVar, bundle);
            } else {
                this.f369a = new C0170i(context, str, componentName2, pendingIntent2, bVar, bundle);
            }
            this.f370b = new MediaControllerCompat(context, this);
            if (f368d == 0) {
                f368d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0154a();

        /* renamed from: b */
        private final MediaDescriptionCompat f372b;

        /* renamed from: c */
        private final long f373c;

        /* renamed from: d */
        private MediaSession.QueueItem f374d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        class C0154a implements Parcelable.Creator<QueueItem> {
            C0154a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f372b = mediaDescriptionCompat;
                this.f373c = j;
                this.f374d = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m601a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m470a(queueItem.getDescription()), queueItem.getQueueId());
        }

        /* renamed from: b */
        public static List<QueueItem> m602b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m601a(a));
            }
            return arrayList;
        }

        /* renamed from: d */
        public MediaDescriptionCompat mo420d() {
            return this.f372b;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f372b + ", Id=" + this.f373c + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f372b.writeToParcel(parcel, i);
            parcel.writeLong(this.f373c);
        }

        QueueItem(Parcel parcel) {
            this.f372b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f373c = parcel.readLong();
        }
    }
}
