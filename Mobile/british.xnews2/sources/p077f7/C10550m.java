package p077f7;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: f7.m */
abstract class C10550m<T> {

    /* renamed from: a */
    final int f49097a;

    /* renamed from: b */
    final TaskCompletionSource<T> f49098b = new TaskCompletionSource<>();

    /* renamed from: c */
    final int f49099c;

    /* renamed from: d */
    final Bundle f49100d;

    C10550m(int i, int i2, Bundle bundle) {
        this.f49097a = i;
        this.f49099c = i2;
        this.f49100d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42674a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f49098b.setResult(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo42675b(C10551n nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(nVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f49098b.setException(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo42672c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo42673d(Bundle bundle);

    public String toString() {
        int i = this.f49099c;
        int i2 = this.f49097a;
        boolean c = mo42672c();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
