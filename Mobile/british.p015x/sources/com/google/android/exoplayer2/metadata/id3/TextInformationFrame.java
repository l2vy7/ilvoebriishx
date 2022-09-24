package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() {
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    };
    public final String description;
    public final String value;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!Util.areEqual(this.f27472id, textInformationFrame.f27472id) || !Util.areEqual(this.description, textInformationFrame.description) || !Util.areEqual(this.value, textInformationFrame.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27472id.hashCode()) * 31;
        String str = this.description;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.f27472id;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 1;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 2;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 3;
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 4;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 5;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 6;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
                builder.setAlbumTitle(this.value);
                return;
            case 1:
            case 6:
                builder.setArtist(this.value);
                return;
            case 2:
            case 7:
                builder.setAlbumArtist(this.value);
                return;
            case 3:
            case 5:
                builder.setTitle(this.value);
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f27472id;
        String str2 = this.description;
        String str3 = this.value;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27472id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }

    TextInformationFrame(Parcel parcel) {
        super((String) Util.castNonNull(parcel.readString()));
        this.description = parcel.readString();
        this.value = (String) Util.castNonNull(parcel.readString());
    }
}
