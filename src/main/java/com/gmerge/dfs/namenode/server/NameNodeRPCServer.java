package com.gmerge.dfs.namenode.server;

/**
 * NameNode 的RPC服务的接口
 * @author Ge Mingjia
 * @date 2023/7/11
 */
public class NameNodeRPCServer {

    /**
     * 创建目录
     * @param path 目录的路径
     * @return 是否创建成功
     * @throws Exception
     */
    public boolean mkdir(String path) throws Exception {

        return true;
    }
}
