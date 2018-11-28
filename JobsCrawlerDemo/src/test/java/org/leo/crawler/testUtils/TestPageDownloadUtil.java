package org.leo.crawler.testUtils;

import org.junit.Test;
import org.leo.crawler.utils.PageDownloadUtil;

public class TestPageDownloadUtil {
	
	@Test
	public void testPageDownload() {
		String content = PageDownloadUtil.
				getPageContent("https://www.lagou.com/jobs/4960883.html");
		
		System.out.println(content);
	}

}
