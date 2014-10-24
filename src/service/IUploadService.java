/**
 * IUploadService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface IUploadService extends java.rmi.Remote {
    public boolean saveFile(java.lang.String arg0, byte[] arg1, int arg2, long arg3, int arg4) throws java.rmi.RemoteException;
    public boolean checkMD5(java.lang.String arg0) throws java.rmi.RemoteException;
    public byte[] getClient() throws java.rmi.RemoteException;
    public java.lang.String getVersion() throws java.rmi.RemoteException;
    public int login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.String init(java.lang.Integer arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public long getSize(int arg0) throws java.rmi.RemoteException;
    public long getNumber(int arg0) throws java.rmi.RemoteException;
}
