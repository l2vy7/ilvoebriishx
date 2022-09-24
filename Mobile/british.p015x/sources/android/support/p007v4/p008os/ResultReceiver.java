package android.support.p007v4.p008os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p007v4.p008os.C0189a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0186a();

    /* renamed from: b */
    final boolean f482b = false;

    /* renamed from: c */
    final Handler f483c = null;

    /* renamed from: d */
    C0189a f484d;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0186a implements Parcelable.Creator<ResultReceiver> {
        C0186a() {
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0187b extends C0189a.C0190a {
        C0187b() {
        }

        /* renamed from: h6 */
        public void mo634h6(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f483c;
            if (handler != null) {
                handler.post(new C0188c(i, bundle));
            } else {
                resultReceiver.mo247a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0188c implements Runnable {

        /* renamed from: b */
        final int f486b;

        /* renamed from: c */
        final Bundle f487c;

        C0188c(int i, Bundle bundle) {
            this.f486b = i;
            this.f487c = bundle;
        }

        public void run() {
            ResultReceiver.this.mo247a(this.f486b, this.f487c);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f484d = C0189a.C0190a.m891x(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo247a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo627b(int i, Bundle bundle) {
        if (this.f482b) {
            Handler handler = this.f483c;
            if (handler != null) {
                handler.post(new C0188c(i, bundle));
            } else {
                mo247a(i, bundle);
            }
        } else {
            C0189a aVar = this.f484d;
            if (aVar != null) {
                try {
                    aVar.mo634h6(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f484d == null) {
                this.f484d = new C0187b();
            }
            parcel.writeStrongBinder(this.f484d.asBinder());
        }
    }
}
