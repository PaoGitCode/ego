package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.pojo.Item;
import com.manager.service.ItemService;

/**
 * 商品控制类
 * @author Pao
 * @version 1.0 2018-1-23
 */
@Controller
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Item getItemById(@PathVariable Long itemId) {
		return itemService.getItemById(itemId);
	}
}
