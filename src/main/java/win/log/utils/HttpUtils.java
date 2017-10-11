package win.log.utils;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

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
			String charset = "UTF-8";   
			 if (entity != null) {   
                 charset = getContentCharSet(entity);  
                    // 使用EntityUtils的toString方法，传递编码，默认编码是ISO-8859-1   
                 return EntityUtils.toString(entity, charset);   
           }   
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
	/** 
     * 默认编码utf -8 
     * Obtains character set of the entity, if known. 
     *  
     * @param entity must not be null 
     * @return the character set, or null if not found 
     * @throws ParseException if header elements cannot be parsed 
     * @throws IllegalArgumentException if entity is null 
     */    
    public static String getContentCharSet(final HttpEntity entity)   
        throws ParseException {   
   
        if (entity == null) {   
            throw new IllegalArgumentException("HTTP entity may not be null");   
        }   
        String charset = null;   
        if (entity.getContentType() != null) {    
            HeaderElement values[] = entity.getContentType().getElements();   
            if (values.length > 0) {   
                NameValuePair param = values[0].getParameterByName("charset" );   
                if (param != null) {   
                    charset = param.getValue();   
                }   
            }   
        }   
         
        if(null==charset||charset.length()<1){  
            charset = "UTF-8";  
        }  
        return charset;   
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
