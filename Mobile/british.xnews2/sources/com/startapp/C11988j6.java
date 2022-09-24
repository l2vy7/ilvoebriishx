package com.startapp;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;

/* renamed from: com.startapp.j6 */
/* compiled from: Sta */
public class C11988j6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C11958i6 f53166a;

    public C11988j6(C11958i6 i6Var) {
        this.f53166a = i6Var;
    }

    public void run() {
        long j = 1000;
        long uptimeMillis = (((long) this.f53166a.f52617s) * 1000) - SystemClock.uptimeMillis();
        C11958i6 i6Var = this.f53166a;
        long j2 = uptimeMillis + i6Var.f52551A;
        TextView textView = i6Var.f53092O;
        if (textView != null) {
            long j3 = j2 / 1000;
            if (j3 > 0 && j2 % 1000 < 100) {
                j3--;
            }
            textView.setText(String.valueOf(j3));
        }
        if (j2 >= 1000) {
            Handler handler = this.f53166a.f53096S;
            long j4 = j2 % 1000;
            if (j4 != 0) {
                j = j4;
            }
            handler.postDelayed(this, j);
            return;
        }
        C11958i6 i6Var2 = this.f53166a;
        if (i6Var2.f53092O != null) {
            i6Var2.f53093P.setVisibility(8);
            this.f53166a.f53092O.setVisibility(8);
        }
        this.f53166a.mo45123u();
    }
}
