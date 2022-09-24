package android.support.p007v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0138a();

    /* renamed from: b */
    private final String f315b;

    /* renamed from: c */
    private final CharSequence f316c;

    /* renamed from: d */
    private final CharSequence f317d;

    /* renamed from: e */
    private final CharSequence f318e;

    /* renamed from: f */
    private final Bitmap f319f;

    /* renamed from: g */
    private final Uri f320g;

    /* renamed from: h */
    private final Bundle f321h;

    /* renamed from: i */
    private final Uri f322i;

    /* renamed from: j */
    private MediaDescription f323j;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    class C0138a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0138a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m470a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0139b {

        /* renamed from: a */
        private String f324a;

        /* renamed from: b */
        private CharSequence f325b;

        /* renamed from: c */
        private CharSequence f326c;

        /* renamed from: d */
        private CharSequence f327d;

        /* renamed from: e */
        private Bitmap f328e;

        /* renamed from: f */
        private Uri f329f;

        /* renamed from: g */
        private Bundle f330g;

        /* renamed from: h */
        private Uri f331h;

        /* renamed from: a */
        public MediaDescriptionCompat mo313a() {
            return new MediaDescriptionCompat(this.f324a, this.f325b, this.f326c, this.f327d, this.f328e, this.f329f, this.f330g, this.f331h);
        }

        /* renamed from: b */
        public C0139b mo314b(CharSequence charSequence) {
            this.f327d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0139b mo315c(Bundle bundle) {
            this.f330g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0139b mo316d(Bitmap bitmap) {
            this.f328e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0139b mo317e(Uri uri) {
            this.f329f = uri;
            return this;
        }

        /* renamed from: f */
        public C0139b mo318f(String str) {
            this.f324a = str;
            return this;
        }

        /* renamed from: g */
        public C0139b mo319g(Uri uri) {
            this.f331h = uri;
            return this;
        }

        /* renamed from: h */
        public C0139b mo320h(CharSequence charSequence) {
            this.f326c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0139b mo321i(CharSequence charSequence) {
            this.f325b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f315b = str;
        this.f316c = charSequence;
        this.f317d = charSequence2;
        this.f318e = charSequence3;
        this.f319f = bitmap;
        this.f320g = uri;
        this.f321h = bundle;
        this.f322i = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p007v4.media.MediaDescriptionCompat m470a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0083
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0083
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.mo318f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.mo321i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.mo320h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.mo314b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.mo316d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.mo317e(r3)
            android.os.Bundle r3 = r9.getExtras()
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r3 = android.support.p007v4.media.session.MediaSessionCompat.m585s(r3)
        L_0x0044:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0062
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.mo315c(r0)
            if (r5 == 0) goto L_0x0072
            r2.mo319g(r5)
            goto L_0x007d
        L_0x0072:
            r0 = 23
            if (r1 < r0) goto L_0x007d
            android.net.Uri r0 = r9.getMediaUri()
            r2.mo319g(r0)
        L_0x007d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo313a()
            r0.f323j = r9
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.MediaDescriptionCompat.m470a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Bitmap mo300b() {
        return this.f319f;
    }

    /* renamed from: d */
    public Uri mo301d() {
        return this.f320g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Object mo303e() {
        int i;
        MediaDescription mediaDescription = this.f323j;
        if (mediaDescription != null || (i = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f315b);
        builder.setTitle(this.f316c);
        builder.setSubtitle(this.f317d);
        builder.setDescription(this.f318e);
        builder.setIconBitmap(this.f319f);
        builder.setIconUri(this.f320g);
        Bundle bundle = this.f321h;
        if (i < 23 && this.f322i != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f322i);
        }
        builder.setExtras(bundle);
        if (i >= 23) {
            builder.setMediaUri(this.f322i);
        }
        MediaDescription build = builder.build();
        this.f323j = build;
        return build;
    }

    /* renamed from: f */
    public String mo304f() {
        return this.f315b;
    }

    /* renamed from: g */
    public CharSequence mo305g() {
        return this.f317d;
    }

    /* renamed from: h */
    public CharSequence mo306h() {
        return this.f316c;
    }

    public String toString() {
        return this.f316c + ", " + this.f317d + ", " + this.f318e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f315b);
            TextUtils.writeToParcel(this.f316c, parcel, i);
            TextUtils.writeToParcel(this.f317d, parcel, i);
            TextUtils.writeToParcel(this.f318e, parcel, i);
            parcel.writeParcelable(this.f319f, i);
            parcel.writeParcelable(this.f320g, i);
            parcel.writeBundle(this.f321h);
            parcel.writeParcelable(this.f322i, i);
            return;
        }
        ((MediaDescription) mo303e()).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f315b = parcel.readString();
        this.f316c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f317d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f318e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f319f = (Bitmap) parcel.readParcelable(classLoader);
        this.f320g = (Uri) parcel.readParcelable(classLoader);
        this.f321h = parcel.readBundle(classLoader);
        this.f322i = (Uri) parcel.readParcelable(classLoader);
    }
}
