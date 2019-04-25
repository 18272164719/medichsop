package com.shyl.medicshopclient.permission;

/**
 * 通过位运算来控制权限  //4中权限   read update insert delete
 * <p>
 * &    (1&1 =1  1&0 =0  0&0 =0)
 * |    (1&1 =0   1&0 =1  0&0 =0)
 */
public class Permission {

    private static final int ALLOW_READ = 1 << 0;   //0001     1

    private static final int ALLOW_UPDATE = 1 << 1;   //0010   2

    private static final int ALLOW_INSERT = 1 << 2;   //0100   4

    private static final int ALLOW_DELETE = 1 << 3;   //1000   8
    //存储目前的用户状态
    private int flag;


    //设置用户的权限
    public void setPer(int per) {
        this.flag = per;
    }

    //增加用户的权限
    public void addPer(int per) {
        flag = flag | per;
    }

    //删除用户的权限
    public void reducePer(int per) {
        flag = flag & ~per;
    }

    //判断用户的权限
    public boolean isAllow(int per) {
        return ((flag & per) == per);
    }

    //判断用户没有权限
    public boolean isNotAllow(int per) {
        return ((flag & per) == 0);
    }

}
