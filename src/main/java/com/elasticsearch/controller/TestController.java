package com.elasticsearch.controller;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.script.Script;
import org.elasticsearch.script.ScriptType;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.metrics.sum.Sum;
import org.elasticsearch.search.aggregations.pipeline.PipelineAggregatorBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elasticsearch.config.ElasticsearchUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Map;

/**
 * Created by baishuai on 2017/8/24.
 */
@RestController
public class TestController {

    @Resource
    TransportClient client;//注入es操作对象

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println("test");
    	ElasticsearchUtils.createIndex("testdemo");
        return "Hello,elasticsearch";
    }

}
