package com.gmerge.dfs.namenode.server;

/**
 * 负责管理元数据的核心组件
 *
 * @author Ge Mingjia
 * @date 2023/7/11
 */
public class FSNameSystem {

    /**
     * 负责管理内存文件目录树的组件
     */
    private FSDirectory directory;

    /**
     * 负责管理edits log写入磁盘的组件
     */
    private FSEditsLog editsLog;

    public FSNameSystem() {
        this.directory = new FSDirectory();
        this.editsLog = new FSEditsLog();
    }

    /**
     * 创建目录
     *
     * @param path 目录的路径
     * @return 是否创建成功
     * @throws Exception
     */
    public boolean mkdir(String path) throws Exception {

        return true;
    }
}
