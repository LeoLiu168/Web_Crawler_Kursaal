package org.leo.crawler.utils;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * 基于HttpClient的页面下载工具类
 * @author leoliu
 *
 */
public class PageDownloadUtil {
	
	public static String getPageContent(String url) {
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		System.out.println("Executing request " + httpGet.getRequestLine());
		String content = null;
		CloseableHttpResponse response = null;
		try {
			response = client.execute(httpGet);
			System.out.println(response.getStatusLine());
			HttpEntity entity = response.getEntity();
			content = EntityUtils.toString(entity);
			EntityUtils.consume(entity);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return content;
	}

}
