package android.support.p007v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0178a();

    /* renamed from: b */
    final int f450b;

    /* renamed from: c */
    final long f451c;

    /* renamed from: d */
    final long f452d;

    /* renamed from: e */
    final float f453e;

    /* renamed from: f */
    final long f454f;

    /* renamed from: g */
    final int f455g;

    /* renamed from: h */
    final CharSequence f456h;

    /* renamed from: i */
    final long f457i;

    /* renamed from: j */
    List<CustomAction> f458j;

    /* renamed from: k */
    final long f459k;

    /* renamed from: l */
    final Bundle f460l;

    /* renamed from: m */
    private PlaybackState f461m;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    class C0178a implements Parcelable.Creator<PlaybackStateCompat> {
        C0178a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f450b = i;
        this.f451c = j;
        this.f452d = j2;
        this.f453e = f;
        this.f454f = j3;
        this.f455g = i2;
        this.f456h = charSequence;
        this.f457i = j4;
        this.f458j = new ArrayList(list);
        this.f459k = j5;
        this.f460l = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m804a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction a : customActions) {
                arrayList2.add(CustomAction.m811a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
            MediaSessionCompat.m583c(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.f461m = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: b */
    public long mo596b() {
        return this.f454f;
    }

    /* renamed from: d */
    public long mo597d() {
        return this.f457i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public float mo599e() {
        return this.f453e;
    }

    /* renamed from: f */
    public Object mo600f() {
        if (this.f461m == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f450b, this.f451c, this.f453e, this.f457i);
            builder.setBufferedPosition(this.f452d);
            builder.setActions(this.f454f);
            builder.setErrorMessage(this.f456h);
            for (CustomAction b : this.f458j) {
                builder.addCustomAction((PlaybackState.CustomAction) b.mo605b());
            }
            builder.setActiveQueueItemId(this.f459k);
            if (Build.VERSION.SDK_INT >= 22) {
                builder.setExtras(this.f460l);
            }
            this.f461m = builder.build();
        }
        return this.f461m;
    }

    /* renamed from: g */
    public long mo601g() {
        return this.f451c;
    }

    /* renamed from: h */
    public int mo602h() {
        return this.f450b;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f450b + ", position=" + this.f451c + ", buffered position=" + this.f452d + ", speed=" + this.f453e + ", updated=" + this.f457i + ", actions=" + this.f454f + ", error code=" + this.f455g + ", error message=" + this.f456h + ", custom actions=" + this.f458j + ", active item id=" + this.f459k + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f450b);
        parcel.writeLong(this.f451c);
        parcel.writeFloat(this.f453e);
        parcel.writeLong(this.f457i);
        parcel.writeLong(this.f452d);
        parcel.writeLong(this.f454f);
        TextUtils.writeToParcel(this.f456h, parcel, i);
        parcel.writeTypedList(this.f458j);
        parcel.writeLong(this.f459k);
        parcel.writeBundle(this.f460l);
        parcel.writeInt(this.f455g);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static final class C0179b {

        /* renamed from: a */
        private final List<CustomAction> f467a;

        /* renamed from: b */
        private int f468b;

        /* renamed from: c */
        private long f469c;

        /* renamed from: d */
        private long f470d;

        /* renamed from: e */
        private float f471e;

        /* renamed from: f */
        private long f472f;

        /* renamed from: g */
        private int f473g;

        /* renamed from: h */
        private CharSequence f474h;

        /* renamed from: i */
        private long f475i;

        /* renamed from: j */
        private long f476j;

        /* renamed from: k */
        private Bundle f477k;

        public C0179b() {
            this.f467a = new ArrayList();
            this.f476j = -1;
        }

        /* renamed from: a */
        public PlaybackStateCompat mo617a() {
            return new PlaybackStateCompat(this.f468b, this.f469c, this.f470d, this.f471e, this.f472f, this.f473g, this.f474h, this.f475i, this.f467a, this.f476j, this.f477k);
        }

        /* renamed from: b */
        public C0179b mo618b(long j) {
            this.f472f = j;
            return this;
        }

        /* renamed from: c */
        public C0179b mo619c(int i, long j, float f) {
            return mo620d(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: d */
        public C0179b mo620d(int i, long j, float f, long j2) {
            this.f468b = i;
            this.f469c = j;
            this.f475i = j2;
            this.f471e = f;
            return this;
        }

        public C0179b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f467a = arrayList;
            this.f476j = -1;
            this.f468b = playbackStateCompat.f450b;
            this.f469c = playbackStateCompat.f451c;
            this.f471e = playbackStateCompat.f453e;
            this.f475i = playbackStateCompat.f457i;
            this.f470d = playbackStateCompat.f452d;
            this.f472f = playbackStateCompat.f454f;
            this.f473g = playbackStateCompat.f455g;
            this.f474h = playbackStateCompat.f456h;
            List<CustomAction> list = playbackStateCompat.f458j;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f476j = playbackStateCompat.f459k;
            this.f477k = playbackStateCompat.f460l;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0177a();

        /* renamed from: b */
        private final String f462b;

        /* renamed from: c */
        private final CharSequence f463c;

        /* renamed from: d */
        private final int f464d;

        /* renamed from: e */
        private final Bundle f465e;

        /* renamed from: f */
        private PlaybackState.CustomAction f466f;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        class C0177a implements Parcelable.Creator<CustomAction> {
            C0177a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f462b = str;
            this.f463c = charSequence;
            this.f464d = i;
            this.f465e = bundle;
        }

        /* renamed from: a */
        public static CustomAction m811a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.m583c(extras);
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            customAction2.f466f = customAction;
            return customAction2;
        }

        /* renamed from: b */
        public Object mo605b() {
            PlaybackState.CustomAction customAction = this.f466f;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f462b, this.f463c, this.f464d);
            builder.setExtras(this.f465e);
            return builder.build();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f463c + ", mIcon=" + this.f464d + ", mExtras=" + this.f465e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f462b);
            TextUtils.writeToParcel(this.f463c, parcel, i);
            parcel.writeInt(this.f464d);
            parcel.writeBundle(this.f465e);
        }

        CustomAction(Parcel parcel) {
            this.f462b = parcel.readString();
            this.f463c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f464d = parcel.readInt();
            this.f465e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f450b = parcel.readInt();
        this.f451c = parcel.readLong();
        this.f453e = parcel.readFloat();
        this.f457i = parcel.readLong();
        this.f452d = parcel.readLong();
        this.f454f = parcel.readLong();
        this.f456h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f458j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f459k = parcel.readLong();
        this.f460l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f455g = parcel.readInt();
    }
}
