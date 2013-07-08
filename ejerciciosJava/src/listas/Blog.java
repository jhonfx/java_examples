/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author JhonFx
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Blog {

    private String name;
    private String message;

    public Blog(){}

    public Blog(String name, String message){
        this.name = name;
        this.message = message;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }


    public static void main(String[] args){

        List Blogs = new ArrayList();

        Blogs.add(new Blog("1","one"));
        Blogs.add(new Blog("2","two"));
        Blogs.add(new Blog("3","three"));
        Blogs.add(new Blog("4","four"));

        for(Iterator iter = Blogs.iterator(); iter.hasNext();){
            Blog blog = (Blog)iter.next();

            System.out.println(blog.getName() + " " + blog.getMessage());
        }
        
        
    }


}
