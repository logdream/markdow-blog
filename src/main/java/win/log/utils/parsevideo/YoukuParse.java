package win.log.utils.parsevideo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import win.log.utils.HttpUtils;

public class YoukuParse {

	private String link;
	
	private final static String infoUrl = "https://ups.youku.com/ups/get.json?&ccode=0502&client_ip=0.0.0.0&utid=SR0FEVRbDSICAXEufXSyjJqv&vid=";
	
	
	private final static String IDREPX1 = "id_(.*?==)";
	private final static String IDREPX2 = "id_(.*?)\\.html";
	public YoukuParse(String link) {
		super();
		this.link = link;
	}

	private String getVideoId(){
		Pattern r = Pattern.compile(IDREPX1);
		Matcher matcher = r.matcher(this.link);
		String result = null;
		if(!matcher.find()){
			 r = Pattern.compile(IDREPX2);
			 matcher = r.matcher(this.link);
		}
		
		if(matcher.groupCount()>0)
			result =  matcher.group(1);
		if(null!=result&&result.indexOf("==")<1){
			result = result +"==";
		}
		return result;
		 
	}
	
	public String getJson(){
		Map<String, String> appendHeader = new HashMap<>();
		String videoId = getVideoId();
		appendHeader.put("Referer", "http://v.youku.com/v_show/id_"+videoId+".html");
		appendHeader.put("host", "ups.youku.com");
		String result = HttpUtils.getRequest(infoUrl+videoId+"&client_ts="+(System.currentTimeMillis()/1000),appendHeader);
		return result;
	}
	
	
	
}
