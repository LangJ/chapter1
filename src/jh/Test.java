package jh;

import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Administrator on 2018/3/13.
 */
public class Test
{
    public static void main(String[] args)
    {


    Scanner scan = new Scanner(System.in);
    List a = new LinkedList();


        while(true)

    {
        System.out.println("1.注册 2.登录");
        int num = scan.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("请输入用户名");
                String name = scan.next();
                System.out.println("请输入密码");
                String pwd = scan.next();
                Demo6 d2 = new Demo6(name, pwd);


                if(a.contains(d2)){
                System.out.println("用户名已存在");

            }else {a.add(d2);
                    System.out.println("注册成功");
                }


                break;
            case 2:
                System.out.println("请输入用户名");
                String name1 = scan.next();

                System.out.println("请输入密码");
                String pwd1 = scan.next();
                Demo6 d3 = new Demo6(name1, pwd1);

                if (a.contains(d3))
                {
                    System.out.println("登录成功");
                } else
                {
                    System.out.println("用户名或密码错误");
                }
        }
    }}}
