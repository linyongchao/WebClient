package test;

import java.rmi.RemoteException;

import service.IUploadServiceProxy;

public class Test {
	public static void main(String[] args) {
		String endpoint = "http://localhost:8080/WebService/upload?wsdl";
		IUploadServiceProxy umsp = new IUploadServiceProxy(endpoint);
		long resultStr = 0;
		try {
			resultStr = umsp.getNumber(1);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println(resultStr);
	}
}
