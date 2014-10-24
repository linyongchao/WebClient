package service;

public class IUploadServiceProxy implements service.IUploadService {
  private String _endpoint = null;
  private service.IUploadService iUploadService = null;
  
  public IUploadServiceProxy() {
    _initIUploadServiceProxy();
  }
  
  public IUploadServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIUploadServiceProxy();
  }
  
  private void _initIUploadServiceProxy() {
    try {
      iUploadService = (new service.impl.UploadServiceImplServiceLocator()).getUploadServiceImplPort();
      if (iUploadService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iUploadService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iUploadService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iUploadService != null)
      ((javax.xml.rpc.Stub)iUploadService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.IUploadService getIUploadService() {
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService;
  }
  
  public boolean saveFile(java.lang.String arg0, byte[] arg1, int arg2, long arg3, int arg4) throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.saveFile(arg0, arg1, arg2, arg3, arg4);
  }
  
  public boolean checkMD5(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.checkMD5(arg0);
  }
  
  public byte[] getClient() throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.getClient();
  }
  
  public java.lang.String getVersion() throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.getVersion();
  }
  
  public int login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.login(arg0, arg1);
  }
  
  public java.lang.String init(java.lang.Integer arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.init(arg0, arg1, arg2);
  }
  
  public long getSize(int arg0) throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.getSize(arg0);
  }
  
  public long getNumber(int arg0) throws java.rmi.RemoteException{
    if (iUploadService == null)
      _initIUploadServiceProxy();
    return iUploadService.getNumber(arg0);
  }
  
  
}