package org.leo.crawler.service.impl;

import org.leo.crawler.entity.Page;
import org.leo.crawler.service.DownloadService;
import org.leo.crawler.utils.PageDownloadUtil;

/**
 * 下载接口的实现类
 * @author leoliu
 *
 */
public class DownloadServiceImpl implements DownloadService {

	@Override
	public Page download(String url) {

		Page page = new Page();
		page.setUrl(url);
		page.setContent(PageDownloadUtil.getPageContent(url));
		return page;
	}

}
