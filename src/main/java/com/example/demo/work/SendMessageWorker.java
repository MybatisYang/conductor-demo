//package com.example.demo.work;
//
//import com.netflix.conductor.client.worker.Worker;
//import com.netflix.conductor.common.metadata.tasks.Task;
//import com.netflix.conductor.common.metadata.tasks.TaskResult;
//import org.springframework.stereotype.Component;
//
//import com.netflix.conductor.common.metadata.tasks.TaskResult;
//import org.springframework.stereotype.Component;
//
///**
// * @Description: ceshi
// * @Author: yjs
// * @createTime: 2022年04月23日 23:54:26
// * @version: 1.0
// */
//@Component
//public class SendMessageWorker implements Worker {
//
//    private final String taskDefName="sendMessage";
//
//    @Override
//    public String getTaskDefName() {
//        return taskDefName;
//    }
//
//    @Override
//    public TaskResult execute(Task task) {
//        System.out.printf("Executing %s\n", taskDefName);
//        System.out.println("接收人:" + task.getInputData().get("receiver")+" "+task.getInputData().get("content"));
//
//        TaskResult result = new TaskResult(task);
//        result.setStatus(TaskResult.Status.COMPLETED);
//        result.log("接收人:" + task.getInputData().get("receiver")+" "+task.getInputData().get("content"));
//        return result;
//    }
//}
