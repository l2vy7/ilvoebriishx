package p207f5;

import android.os.IInterface;
import android.os.RemoteException;
import p199d5.C10487a;

/* renamed from: f5.f */
public interface C10535f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException;

    int getIntFlagValue(String str, int i, int i2) throws RemoteException;

    long getLongFlagValue(String str, long j, int i) throws RemoteException;

    String getStringFlagValue(String str, String str2, int i) throws RemoteException;

    void init(C10487a aVar) throws RemoteException;
}
