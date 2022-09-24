package p251t4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C0690c;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: t4.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C11016f extends C0690c {

    /* renamed from: C0 */
    private Dialog f49971C0;

    /* renamed from: D0 */
    private DialogInterface.OnCancelListener f49972D0;

    /* renamed from: E0 */
    private Dialog f49973E0;

    /* renamed from: f2 */
    public static C11016f m49374f2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C11016f fVar = new C11016f();
        Dialog dialog2 = (Dialog) C4604n.m20099l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        fVar.f49971C0 = dialog2;
        if (onCancelListener != null) {
            fVar.f49972D0 = onCancelListener;
        }
        return fVar;
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        Dialog dialog = this.f49971C0;
        if (dialog != null) {
            return dialog;
        }
        mo3726a2(false);
        if (this.f49973E0 == null) {
            this.f49973E0 = new AlertDialog.Builder((Context) C4604n.m20098k(mo3466w())).create();
        }
        return this.f49973E0;
    }

    /* renamed from: e2 */
    public void mo3729e2(FragmentManager fragmentManager, String str) {
        super.mo3729e2(fragmentManager, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f49972D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
