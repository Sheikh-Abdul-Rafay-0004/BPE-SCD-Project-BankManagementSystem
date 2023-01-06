package main;

public class SingUpSimpleAcountProxy implements main.SingUpSimpleAcount {
  private String _endpoint = null;
  private main.SingUpSimpleAcount singUpSimpleAcount = null;
  
  public SingUpSimpleAcountProxy() {
    _initSingUpSimpleAcountProxy();
  }
  
  public SingUpSimpleAcountProxy(String endpoint) {
    _endpoint = endpoint;
    _initSingUpSimpleAcountProxy();
  }
  
  private void _initSingUpSimpleAcountProxy() {
    try {
      singUpSimpleAcount = (new main.SingUpSimpleAcountServiceLocator()).getSingUpSimpleAcount();
      if (singUpSimpleAcount != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)singUpSimpleAcount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)singUpSimpleAcount)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (singUpSimpleAcount != null)
      ((javax.xml.rpc.Stub)singUpSimpleAcount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.SingUpSimpleAcount getSingUpSimpleAcount() {
    if (singUpSimpleAcount == null)
      _initSingUpSimpleAcountProxy();
    return singUpSimpleAcount;
  }
  
  public java.lang.String tableres(java.lang.String account_Number, java.lang.String first_Name, java.lang.String last_Name, java.lang.String phone_Number, java.lang.String email, java.lang.String account_Type, java.lang.String country, java.lang.String cuty, java.lang.String address, java.lang.String CNIC, java.lang.String occupation, java.lang.String d_O_B, java.lang.String password, java.lang.String amount) throws java.rmi.RemoteException{
    if (singUpSimpleAcount == null)
      _initSingUpSimpleAcountProxy();
    return singUpSimpleAcount.tableres(account_Number, first_Name, last_Name, phone_Number, email, account_Type, country, cuty, address, CNIC, occupation, d_O_B, password, amount);
  }
  
  public java.lang.String generateKey() throws java.rmi.RemoteException{
    if (singUpSimpleAcount == null)
      _initSingUpSimpleAcountProxy();
    return singUpSimpleAcount.generateKey();
  }
  
  
}