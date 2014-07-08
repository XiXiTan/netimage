package cn.itcast.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class StreamTool {
	/**
	 * 读取流中的数据
	 * @param inStream
	 * @return
	 * @throws Exception
	 */
	public static byte[] read(InputStream inStream) throws Exception{
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while( (len = inStream.read(buffer)) != -1){
			outStream.write(buffer, 0, len);
		}
		inStream.close();
		return outStream.toByteArray();
	}

}
