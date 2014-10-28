/**
 * IUploadService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface IUploadService extends java.rmi.Remote {
	/**
	 * @param dataKey
	 *            ：文件唯一标示
	 * @return：文件长度
	 * @throws java.rmi.RemoteException
	 */
	public long getLength(java.lang.String dataKey)
			throws java.rmi.RemoteException;

	/**
	 * @param id
	 *            ：用户id
	 * @param fileName
	 *            ：文件名
	 * @param md5
	 *            ：文件的 md5 值
	 * @return：返回该文件的唯一标识：dataKey
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.String init(java.lang.Integer id,
			java.lang.String fileName, java.lang.String md5)
			throws java.rmi.RemoteException;

	/**
	 * @param id
	 *            ：用户 id
	 * @return：客户上传文件的总大小，单位是B
	 * @throws java.rmi.RemoteException
	 */
    public long getSize(int arg0) throws java.rmi.RemoteException;

	/**
	 * @param id
	 *            ：用户 id
	 * @return：客户上传文件的总个数
	 * @throws java.rmi.RemoteException
	 */
	public long getNumber(int id) throws java.rmi.RemoteException;

	/**
	 * @return：返回版本号
	 * @throws java.rmi.RemoteException
	 */
    public java.lang.String getVersion() throws java.rmi.RemoteException;

	/**
	 * @param username
	 *            ：用户名
	 * @param pwd
	 *            ：密码
	 * @return：>0 登陆成功，0 登陆失败
	 * @throws java.rmi.RemoteException
	 */
	public int login(java.lang.String username, java.lang.String pwd)
			throws java.rmi.RemoteException;

	/**
	 * @param dataKey
	 *            ：文件唯一标示
	 * @param buffer
	 *            ：二进制流
	 * @param length
	 *            ：有效长度
	 * @param position
	 *            ：起始位置
	 * @param blocks
	 *            ：块数
	 * @return：true 上传成功，false 上传失败
	 * @throws java.rmi.RemoteException
	 */
	public boolean saveFile(java.lang.String dataKey, byte[] buffer,
			int length, long position, int blocks)
			throws java.rmi.RemoteException;

	/**
	 * @param dataKey
	 *            ：文件唯一标示
	 * @return：true 上传成功，false 上传失败
	 * @throws java.rmi.RemoteException
	 */
	public boolean checkMD5(java.lang.String dataKey)
			throws java.rmi.RemoteException;

	/**
	 * @return：客户端自动更新
	 * @throws java.rmi.RemoteException
	 */
    public byte[] getClient() throws java.rmi.RemoteException;
}
