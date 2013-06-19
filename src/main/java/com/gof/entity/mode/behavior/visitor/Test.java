package com.gof.entity.mode.behavior.visitor;
/**
 * 动态绑定和双分派
 * 双分派实现动态绑定的本质，就是在重载方法委派的前面加上了继承体系中覆盖的环节，由于覆盖是动态的，所以重载就是动态的了，与使用instanceof操作符的效果是一样的（用instanceof操作符可以实现重载方法动态绑定的原因也是因为instanceof操作符是动态的）。但是与使用instanceof操作符实现动态绑定相比，双分派方式的可扩展性要好的多。
 * @author zrw
 *
 */
    class Father {}  
    class Son1 extends Father{}  
    class Son2 extends Father{}  
      
    class Execute {  
        public void method(Father father){  
            System.out.println("This is Father's method");  
        }  
          
        public void method(Son1 son){  
            System.out.println("This is Son1's method");  
        }  
          
        public void method(Son2 son){  
            System.out.println("This is Son2's method");  
        }  
    }  
      
    public class Test {  
        public static void main(String[] args){  
            Father father = new Father();  
            Father s1 = new Son1();  
            Father s2 = new Son2();  
      
            Execute exe = new Execute();  
            exe.method(father);  
            exe.method(s1);  
            exe.method(s2);  
        }  
    }  