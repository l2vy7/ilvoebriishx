package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;

/* renamed from: androidx.browser.customtabs.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0440a implements IBinder.DeathRecipient {

    /* renamed from: b */
    public final /* synthetic */ CustomTabsService.C0438a f1757b;

    /* renamed from: c */
    public final /* synthetic */ C0441b f1758c;

    public /* synthetic */ C0440a(CustomTabsService.C0438a aVar, C0441b bVar) {
        this.f1757b = aVar;
        this.f1758c = bVar;
    }

    public final void binderDied() {
        this.f1757b.m2326n6(this.f1758c);
    }
}
