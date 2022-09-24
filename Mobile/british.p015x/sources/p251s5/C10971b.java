package p251s5;

import android.app.Activity;
import android.location.Location;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7215a;
import com.google.android.gms.common.api.internal.C7301r;
import com.google.android.gms.tasks.Task;

/* renamed from: s5.b */
public class C10971b extends C4591e<C7191a.C7195d.C7199d> {
    public C10971b(Activity activity) {
        super(activity, C10975f.f49938c, null, (C7301r) new C7215a());
    }

    /* renamed from: g */
    public Task<Location> mo43269g() {
        return doRead(new C10985p(this));
    }
}
