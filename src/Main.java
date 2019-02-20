import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入学生个数");
        //确定个数
        Scanner information=new Scanner(System.in);
        int amount=information.nextInt();
        //输入数组长度
        Student[] stu=new Student[amount];
        //创建新数组（Student对象下）
        for(int i=0;i<amount;i++)
        {
            stu[i]=new Student();
            //创建数组长度个数的对象
            System.out.println("请输入第" + (i+1) + "个学生的姓名");
            String name=information.next();
            stu[i].setName(name);
            //输入名字
            System.out.println("请输入第" + (i+1) + "个学生的性别");
            stu[i].setSex(information.next());
            //输入性别
            System.out.println("请输入第" + (i+1) + "个学生的学号");
            stu[i].setNum(information.nextInt());
            //输入学号
        }
        for(int j=0;j<amount;j++)
        //进行数据输出与方法执行
        {
            System.out.println("学生" + (j+1));
            System.out.println("姓名：" + stu[j].getName());
            System.out.println("性别：" + stu[j].getSex());
            System.out.println("学号：" + stu[j].getNum());
            stu[j].sleep();
            stu[j].eat();
            stu[j].study();
        }
    }
}
