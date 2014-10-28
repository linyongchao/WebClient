package utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTools {
	/**
	 * 将文件写成二进制字节流（ByteArrayOutputStream）
	 * 
	 * @param file
	 *            ：目标文件
	 * @return：二级制字节流
	 */
	public static byte[] fileToByte2(File file) {
		if (!file.exists()) {
			return new byte[0];
		}
		FileInputStream in = null;
		ByteArrayOutputStream out = null;
		try {
			in = new FileInputStream(file);
			out = new ByteArrayOutputStream(1024);
			byte[] temp = new byte[1024];
			int size = 0;
			while ((size = in.read(temp)) != -1) {
				out.write(temp, 0, size);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		if (out == null) {
			return new byte[0];
		} else {
			return out.toByteArray();
		}
	}
}
