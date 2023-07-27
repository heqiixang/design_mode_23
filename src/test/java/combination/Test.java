package combination;

import com.combination.demo.Directory;
import com.combination.demo.File;

public class Test {
    @org.junit.Test
    public void test(){
        //创建根节点
        Directory rootDir =new Directory("root");
        //创建树枝节点
        Directory binDir =new Directory("bin");
        //给bin节点添加叶子节点
        binDir.add(new File("vi",100));
        binDir.add(new File("test",200));

        Directory tmpDir =new Directory("tmp");
        Directory usrDir =new Directory("usr");
        Directory mysqlDir =new Directory("mysql");
        mysqlDir.add(new File("my.cof",300));
        mysqlDir.add(new File("test.db",400));
        usrDir.add(mysqlDir);
        //将所有子文件夹封装到根节点里面
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        rootDir.add(mysqlDir);
        rootDir.printList("");
    }
}
