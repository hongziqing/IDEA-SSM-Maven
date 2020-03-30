package com.utils;

import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;

public class PageUtils<T> {


    public  String PageInfo(PageInfo<T> pageInfo, HttpServletRequest request){
        String path = request.getContextPath()+"/queryStudent";

        StringBuffer stringBuffer = new StringBuffer();

        //首页
        stringBuffer.append("<li><a href='"+path+"?page=1'>首页</a></li>");
        //上一页
        if (pageInfo.isHasPreviousPage()){
            stringBuffer.append("<li><a href='"+path+"?page="+pageInfo.getPrePage()+"'><span aria-hidden='true'>&laquo;</span></a></li>");
        }else {
            stringBuffer.append("<li class='disabled'><a href='#'><span aria-hidden='true'>&laquo;</span></a></li>");
        }
     int num[] =pageInfo.getNavigatepageNums();

        for (int i:num) {

            if (i==pageInfo.getPageNum()){

                stringBuffer.append("<li class='active'><a  href='"+path+"?page="+i+"'>"+i+"</a></li>");
            }else {
                stringBuffer.append("<li><a href='"+path+"?page="+i+"'>"+i+"</a></li>");
            }
        }
        //下一页
        if (pageInfo.isHasNextPage()){
            stringBuffer.append("<li><a href='"+path+"?page="+pageInfo.getNextPage()+"'><span aria-hidden='true'>&raquo;</span></a></li>");
        }else {
            stringBuffer.append("<li class='disabled'><a href='#'>&raquo;</a></li>");
        }
        //尾页
        stringBuffer.append("<li><a href='"+path+"?page="+pageInfo.getPages()+"'>尾页</a></li>");
        return stringBuffer.toString();
    }
}

