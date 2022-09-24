package p179y3;

import android.content.Context;
import android.os.Build;
import p005a4.C0078c;
import p020c4.C2657a;
import p184z3.C6446a;
import p184z3.C6451d;
import p184z3.C6452e;
import p184z3.C6468q;

/* renamed from: y3.h */
/* compiled from: SchedulingModule */
public abstract class C6415h {
    /* renamed from: a */
    static C6468q m28105a(Context context, C0078c cVar, C6452e eVar, C2657a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C6451d(context, cVar, eVar);
        }
        return new C6446a(context, cVar, aVar, eVar);
    }
}
