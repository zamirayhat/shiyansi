package jiekouchengxu;

interface xuesheng {
 void setxuefei(int xuefei);
 void chaxuefei();
}


public class Student extends Doctor implements xuesheng{
 Student(String name, String sex, int age) {
  super(name, sex, age);
  this.name=name;
  this.sex=sex;
  this.age=age;
  // TODO Auto-generated constructor stub
 }
 //定义学生的属性
 public String name;
 public String sex;
 public int age;
 public int tuition;
 @Override
 public void setxuefei(int xuefei) {
  // TODO Auto-generated method stub
  this.tuition=xuefei;
 }
 @Override
 public void chaxuefei() {
  // TODO Auto-generated method stub
  
 }
 
}