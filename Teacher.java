package jiekouchengxu;

interface laoshi {
 void setxinshui(int salary);
 String yesxinshui();
 String noxinshui();
}
public class Teacher extends Doctor implements laoshi{
 Teacher(String name, String sex, int age) {
  super(name, sex, age);
   this.name=name;
   this.sex=sex;
   this.age=age;
  // TODO Auto-generated constructor stub
 }
 //定义老师的属性
 String s = "";
 public String name;
 public String sex;
 public int age;
 public int salary;
 @Override
 public void setxinshui(int salary) {
  // TODO Auto-generated method stub
  this.salary=salary;
 }
 @Override
 public String yesxinshui() {
  // TODO Auto-generated method stub
  return s = "yifaxinshui";  
 }
 public String noxinshui() {
  // TODO Auto-generated method stub
  return s = "meifaxinshui";  
 }
 
}