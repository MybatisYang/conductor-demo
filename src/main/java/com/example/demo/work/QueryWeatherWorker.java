//package com.example.demo.work;
//import com.netflix.conductor.client.worker.Worker;
//import com.netflix.conductor.common.metadata.tasks.Task;
//import com.netflix.conductor.common.metadata.tasks.TaskResult;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
///**
// * @Description: ceshi
// * @Author: yjs
// * @createTime: 2022年04月23日 23:54:09
// * @version: 1.0
// */
//@Component
//public class QueryWeatherWorker implements Worker {
//    Map<String, Integer> cityTemp = new HashMap<>();
//    private final String taskDefName = "queryWeather";
//
//    public QueryWeatherWorker() {
//        cityTemp.put("广州", 38);
//        cityTemp.put("湖南", 18);
//    }
//
//    @Override
//    public String getTaskDefName() {
//        return taskDefName;
//    }
//
//    @Override
//    public TaskResult execute(Task task) {
//        System.out.printf("Executing %s%n", taskDefName);
//        String city = (String) task.getInputData().get("city");
//        System.out.println(city + " 气温:" + cityTemp.get(city));
//
//        TaskResult result = new TaskResult(task);
//        result.setStatus(TaskResult.Status.COMPLETED);
//        //Register the output of the task
//        result.getOutputData().put("temperature", cityTemp.get(city));
//        result.log(city + " 气温:" + cityTemp.get(city));
//        return result;
//    }
//
//}
