/**
 * SingUpSimpleAcount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface SingUpSimpleAcount extends java.rmi.Remote {
    public java.lang.String tableres(java.lang.String account_Number, java.lang.String first_Name, java.lang.String last_Name, java.lang.String phone_Number, java.lang.String email, java.lang.String account_Type, java.lang.String country, java.lang.String cuty, java.lang.String address, java.lang.String CNIC, java.lang.String occupation, java.lang.String d_O_B, java.lang.String password, java.lang.String amount) throws java.rmi.RemoteException;
    public java.lang.String generateKey() throws java.rmi.RemoteException;
}
