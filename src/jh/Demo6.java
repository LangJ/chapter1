package jh;

import java.util.*;

/**
 * Created by Administrator on 2018/3/13.
 */
public class Demo6
{
    String name;
    String pwd;

    public Demo6(String name, String pwd)
    {this.name=name;
        this.pwd=pwd;
    }

    @Override
    public String toString()
    {
        return name+pwd;
    }

    @Override
    public boolean equals(Object obj)
    {
        Demo6 d = (Demo6) obj;
        if (d.name.equals(this.name) && d.pwd .equals( this.pwd))
        {
            return true;
        }
        return false;
    }



}
