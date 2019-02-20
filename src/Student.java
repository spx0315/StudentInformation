public class Student {
    private String name;
    private String sex;
    private int num;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNum(int num) {
        this.num = num;
    }
    /*
    保护数据
     */
    public  Student(){
    }//无参


    public Student(String name, String sex, int num){
       this.name=name;
       this.sex=sex;
       this.num=num;
    }//含参
    String getName(){
        return name;
    }//获取姓名
    String getSex(){
        return sex;
    }//获取性别
    int getNum(){
        return num;
    }//获取学号
    public void study(){
        System.out.println(this.name + this.num + "爱学习");
    }
    public void eat(){
        System.out.println(this.name + "在吃饭");
    }
    public void sleep(){
        System.out.println(this.name + "在睡觉");
    }
}
