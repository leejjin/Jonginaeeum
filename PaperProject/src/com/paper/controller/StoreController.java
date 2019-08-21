package com.paper.controller;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.paper.dao.store.StoreDao;
import com.paper.dao.store.StoreDaoImpl;
import com.paper.model.page.PageGroupResult;
import com.paper.sql.CountSql;

import model.Store;
import service.PageManager;

@WebServlet(urlPatterns = {"/store/storeMain", "/store/list", "/store/seoul","/store/silent"})
public class StoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex+1);
		String dispatchUrl = "/jsp/store/store_intro.jsp";
		
		StoreDao storeDao = new StoreDaoImpl();
		
		if(action.equals("storeMain")) {
			dispatchUrl = "/jsp/store/store_intro.jsp";
		}else if(action.equals("seoul")) {
			request.setCharacterEncoding("utf-8");			
			List<Store> stores = storeDao.selectSeoul();
			
			/*for(Store r : stores) {
				 //포문 돌면서 content에 img가 있으면 
				// 이미지 태그를 추출하기 위한 정규식.
				 Pattern pattern  =  Pattern.compile("<img[^>]*src=[\"']?([^>\"']+)[\"']?[^>]*>");
				 
				 // 추출할 내용.
				 String content = r.getBook_profile();
				  
				 // 내용 중에서 이미지 태그를 찾아라!
				 Matcher match = pattern.matcher(content);
				  
				 String imgTag = null;
				  
				 if(match.find()){ // 이미지 태그를 찾았다면,,
				     imgTag = match.group(0); // 글 내용 중에 첫번째 이미지 태그를 뽑아옴.
					 r.setBook_profile(imgTag);
				 }else {
					 String img = " <img src=\"../img/common/no_img.png\" class=\"img-thumbnail\" />";
					 r.setBook_profile(img);
				 }
			 
			 }*/
			 
			
			
			request.setAttribute("storesList", stores);
			dispatchUrl = "/jsp/store/store_local_detail.jsp";
			
		}else if(action.equals("silent")) {
			dispatchUrl = "/jsp/store/store_thema_detail.jsp";
		}

		

		RequestDispatcher dispatcher = request.getRequestDispatcher(dispatchUrl);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}
