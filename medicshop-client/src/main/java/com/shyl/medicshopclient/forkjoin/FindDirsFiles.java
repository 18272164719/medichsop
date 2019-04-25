package com.shyl.medicshopclient.forkjoin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * fork/join   框架   异步查找文件的实现   多线程快速查找文件
 */
public class FindDirsFiles extends RecursiveAction{

    private File file;

    private String fileName;

    public FindDirsFiles(File file, String fileName){
        this.file = file;
        this.fileName = fileName;
    }

    @Override
    protected void compute() {

        List<FindDirsFiles> findDirsFilesList = new ArrayList<>();
        File[] files = file.listFiles();
        if(files != null){
            for(File f : files){
                if(f.isDirectory()){
                    findDirsFilesList.add(new FindDirsFiles(f,this.fileName));
                }else{
                    if(f.getAbsolutePath().contains(this.fileName)){
                        System.out.println("文件名为"+f.getAbsolutePath());
                    }
                }
            }
        }
        if(!findDirsFilesList.isEmpty()){
            for(FindDirsFiles findDirsFiles : invokeAll(findDirsFilesList)){
                findDirsFiles.join();
            }
        }
    }

    public static void main(String[] args) {

        //用一个fork/join pool 实现任务总调度
        ForkJoinPool pool = new ForkJoinPool();
        FindDirsFiles task = new FindDirsFiles(new File("F:/"),"cloud");

        pool.execute(task);
        task.join();
        System.out.println("task is end");
    }
}
