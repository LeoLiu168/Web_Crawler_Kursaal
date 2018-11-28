package org.leo.crawler.service;

import org.leo.crawler.entity.Page;

/**
 * 下载接口
 * @author leoliu
 *
 */
public interface DownloadService {
	
	public Page download(String url);

}
