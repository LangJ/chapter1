/**
 * Created by Administrator on 2018/3/9.
 */
public class Demo2
{

    private int age;
    private  String name;
//alt+insert
//构造方法，set\get方法
    public Demo2(String name)
    {
        this.name = name;
    }

    public Demo2()
    {

    }

    public Demo2(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
