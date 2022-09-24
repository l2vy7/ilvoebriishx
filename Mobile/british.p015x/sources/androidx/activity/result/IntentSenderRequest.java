package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0204a();

    /* renamed from: b */
    private final IntentSender f533b;

    /* renamed from: c */
    private final Intent f534c;

    /* renamed from: d */
    private final int f535d;

    /* renamed from: e */
    private final int f536e;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    class C0204a implements Parcelable.Creator<IntentSenderRequest> {
        C0204a() {
        }

        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0205b {

        /* renamed from: a */
        private IntentSender f537a;

        /* renamed from: b */
        private Intent f538b;

        /* renamed from: c */
        private int f539c;

        /* renamed from: d */
        private int f540d;

        public C0205b(IntentSender intentSender) {
            this.f537a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest mo694a() {
            return new IntentSenderRequest(this.f537a, this.f538b, this.f539c, this.f540d);
        }

        /* renamed from: b */
        public C0205b mo695b(Intent intent) {
            this.f538b = intent;
            return this;
        }

        /* renamed from: c */
        public C0205b mo696c(int i, int i2) {
            this.f540d = i;
            this.f539c = i2;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f533b = intentSender;
        this.f534c = intent;
        this.f535d = i;
        this.f536e = i2;
    }

    /* renamed from: a */
    public Intent mo684a() {
        return this.f534c;
    }

    /* renamed from: b */
    public int mo685b() {
        return this.f535d;
    }

    /* renamed from: d */
    public int mo686d() {
        return this.f536e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public IntentSender mo688e() {
        return this.f533b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f533b, i);
        parcel.writeParcelable(this.f534c, i);
        parcel.writeInt(this.f535d);
        parcel.writeInt(this.f536e);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f533b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f534c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f535d = parcel.readInt();
        this.f536e = parcel.readInt();
    }
}
