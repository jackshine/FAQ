package com.renault.faq.service;

import com.renault.faq.entity.Options;
import com.renault.faq.entity.custom.OptionsCustom;


/**
 * Created by 言曌 on 2017/9/7.
 */
public interface OptionsService {
	//获得基本信息
	public OptionsCustom getOptions() throws Exception;

	//新建基本信息
	public void insertOptions(Options options) throws Exception;

	//更新基本信息
	public void updateOptions(Options options) throws Exception;
}
