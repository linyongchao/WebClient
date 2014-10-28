package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;

import service.IUploadService;
import service.IUploadServiceProxy;
import utils.FileTools;


public class Test {
	public static void main(String[] args) throws IOException {
		// 创建webservice
		IUploadService ius = new IUploadServiceProxy();
		// 文件生成md5
		String path = "/home/lin/sql.txt";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		String md5 = DigestUtils.md5Hex(fis);
		// 登陆
		int id = ius.login("yangkai", "123");
		// 获取datakey
		String dataKey = ius.init(id, "sql.txt", md5);
		// 上传
		byte[] buffer = FileTools.fileToByte2(file);
		boolean isSuccess = ius.saveFile(dataKey, buffer, (int) file.length(),
				0l, 0);
		// 上传成功后校验md5
		if (isSuccess) {
			isSuccess = ius.checkMD5(dataKey);
		}
		// 输出结果
		if (isSuccess) {
			System.out.println("成功");
		} else {
			System.out.println("失败");
		}
	}
}