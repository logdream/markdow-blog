package win.log.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Random;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpUtils {

	public static String getRequest(String url, Map<String, String> appendHead) {
		HttpGet httpGet = new HttpGet(url);
		String randomIp = randomIp();
		httpGet.addHeader("CLIENT-IP", randomIp);
		httpGet.addHeader("X-FORWARDED-FOR", randomIp);
		httpGet.addHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36");
		for (String key : appendHead.keySet()) {
			httpGet.addHeader(key, appendHead.get(key));
		}
		// RequestConfig config = RequestConfig.DEFAULT;
		// config.se
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			CloseableHttpResponse response1 = httpclient.execute(httpGet);
			HttpEntity entity = response1.getEntity();
			InputStream inputStream = entity.getContent();
			StringBuffer out = new StringBuffer();
			byte[] b = new byte[4096];
			for (int n; (n = inputStream.read(b)) != -1;) {
				out.append(new String(b, 0, n));
			}
			
			return out.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != httpclient) {
				try {
					httpclient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	private static String randomIp() {
		String arrays[] = new String[4];
		Random random = new Random();
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = random.nextInt(249) + "";
		}
		return String.join(".", arrays);
	}
}
