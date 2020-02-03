package com.example.demo.controller;

import com.example.demo.util.Result;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/3 0:02
 */
public abstract class BaseResult<T> {
    protected Result getResult(T data, Integer code){
        return new Result(data, code);
    }
}


