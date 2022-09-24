package p251t4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: t4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C11012b extends DialogFragment {

    /* renamed from: b */
    private Dialog f49965b;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f49966c;

    /* renamed from: d */
    private Dialog f49967d;

    /* renamed from: a */
    public static C11012b m49373a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C11012b bVar = new C11012b();
        Dialog dialog2 = (Dialog) C4604n.m20099l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f49965b = dialog2;
        if (onCancelListener != null) {
            bVar.f49966c = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f49966c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f49965b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f49967d == null) {
            this.f49967d = new AlertDialog.Builder((Context) C4604n.m20098k(getActivity())).create();
        }
        return this.f49967d;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
