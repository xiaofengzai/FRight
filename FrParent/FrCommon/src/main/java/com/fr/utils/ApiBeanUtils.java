package com.fr.utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by szty on 2018/6/21.
 */
public class ApiBeanUtils {

//    public static <S,T> PageList<T> convertToPageList(Page<S> pages,Function<S, T> mapper){
//        PageList<T> pageList=new PageList<>();
//        pageList.setTotalElement(pages.getTotalElements());
//        pageList.setTotalPageSize(pages.getTotalPages());
//        pageList.setPageIndex(pages.getNumber());
//        pageList.setPageSize(pages.getSize());
//        if(mapper!=null){
//            pageList.setList(Linq4j.asEnumerable(pages.getContent()).select(mapper::apply).toList());
//        }else{
//            pageList.setList((List<T>) pages.getContent());
//        }
//
//        return pageList;
//    }
//
//    public static <S,T> PageList<T> convertToPageList(Page<S> pages){
//        return convertToPageList(pages,null);
//    }



    public static <S,T> T copyProperties(S source ,Class<T> targetClass){
        try {
            T target =targetClass.newInstance();
            BeanUtils.copyProperties(source,target);
            return target;
        }catch (Exception ex){
            return null;
        }
    }



    public static <T,R> List<R> toList(List<T> data, Function<T, R> mapFunc) {
        return data.stream().map(mapFunc).collect(Collectors.toList());
    }
}
