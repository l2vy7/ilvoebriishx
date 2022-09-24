package android.support.p007v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaDescriptionCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import p149t.C6077a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0140a();

    /* renamed from: e */
    static final C6077a<String, Integer> f332e;

    /* renamed from: f */
    private static final String[] f333f = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: g */
    private static final String[] f334g = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: h */
    private static final String[] f335h = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f336b;

    /* renamed from: c */
    private MediaMetadata f337c;

    /* renamed from: d */
    private MediaDescriptionCompat f338d;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    class C0140a implements Parcelable.Creator<MediaMetadataCompat> {
        C0140a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C6077a<String, Integer> aVar = new C6077a<>();
        f332e = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f336b = bundle2;
        MediaSessionCompat.m583c(bundle2);
    }

    /* renamed from: b */
    public static MediaMetadataCompat m488b(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f337c = mediaMetadata;
        return createFromParcel;
    }

    /* renamed from: a */
    public boolean mo322a(String str) {
        return this.f336b.containsKey(str);
    }

    /* renamed from: d */
    public Bitmap mo323d(String str) {
        try {
            return (Bitmap) this.f336b.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Bundle mo325e() {
        return new Bundle(this.f336b);
    }

    /* renamed from: f */
    public MediaDescriptionCompat mo326f() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f338d;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String i = mo329i("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence j = mo330j("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(j)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = f333f;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence j2 = mo330j(strArr[i3]);
                if (!TextUtils.isEmpty(j2)) {
                    charSequenceArr[i2] = j2;
                    i2++;
                }
                i3 = i4;
            }
        } else {
            charSequenceArr[0] = j;
            charSequenceArr[1] = mo330j("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = mo330j("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = f334g;
            uri = null;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = mo323d(strArr2[i5]);
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = f335h;
            if (i6 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String i7 = mo329i(strArr3[i6]);
            if (!TextUtils.isEmpty(i7)) {
                uri2 = Uri.parse(i7);
                break;
            }
            i6++;
        }
        String i8 = mo329i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(i8)) {
            uri = Uri.parse(i8);
        }
        MediaDescriptionCompat.C0139b bVar = new MediaDescriptionCompat.C0139b();
        bVar.mo318f(i);
        bVar.mo321i(charSequenceArr[0]);
        bVar.mo320h(charSequenceArr[1]);
        bVar.mo314b(charSequenceArr[2]);
        bVar.mo316d(bitmap);
        bVar.mo317e(uri2);
        bVar.mo319g(uri);
        Bundle bundle = new Bundle();
        if (this.f336b.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", mo327g("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f336b.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", mo327g("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            bVar.mo315c(bundle);
        }
        MediaDescriptionCompat a = bVar.mo313a();
        this.f338d = a;
        return a;
    }

    /* renamed from: g */
    public long mo327g(String str) {
        return this.f336b.getLong(str, 0);
    }

    /* renamed from: h */
    public Object mo328h() {
        if (this.f337c == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f337c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f337c;
    }

    /* renamed from: i */
    public String mo329i(String str) {
        CharSequence charSequence = this.f336b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: j */
    public CharSequence mo330j(String str) {
        return this.f336b.getCharSequence(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f336b);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0141b {

        /* renamed from: a */
        private final Bundle f339a;

        public C0141b() {
            this.f339a = new Bundle();
        }

        /* renamed from: e */
        private Bitmap m499e(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        /* renamed from: a */
        public MediaMetadataCompat mo336a() {
            return new MediaMetadataCompat(this.f339a);
        }

        /* renamed from: b */
        public C0141b mo337b(String str, Bitmap bitmap) {
            C6077a<String, Integer> aVar = MediaMetadataCompat.f332e;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f339a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C0141b mo338c(String str, long j) {
            C6077a<String, Integer> aVar = MediaMetadataCompat.f332e;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f339a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C0141b mo339d(String str, String str2) {
            C6077a<String, Integer> aVar = MediaMetadataCompat.f332e;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f339a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public C0141b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f336b);
            this.f339a = bundle;
            MediaSessionCompat.m583c(bundle);
        }

        public C0141b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f339a.keySet()) {
                Object obj = this.f339a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo337b(str, m499e(bitmap, i));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f336b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
