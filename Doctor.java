package jiekouchengxu;

interface boshi extends laoshi,xuesheng{
 public double jiaoshui(Teacher a,Student b);
 
}
public class Doctor implements boshi{
 public String name;
 public String sex;
 public int age;
 public int salary;
 public int tuition;
 public double jiaoshui(Teacher a,Student b) {
  if ((a.salary-b.tuition)*0.03>0)
  {return (a.salary-b.tuition)*0.03;}
  else 
   return 0;
  
 }
 Doctor(String name,String sex,int age){
  this.name=name;
  this.sex=sex;
  this.age=age;
 }
  @Override
 public void setxinshui(int salary) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public String yesxinshui() {
  // TODO Auto-generated method stub
  return null;
 }
 @Override
 public String noxinshui() {
  // TODO Auto-generated method stub
  return null;
 }
 @Override
 public void setxuefei(int xuefei) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public void chaxuefei() {
  // TODO Auto-generated method stub
  
 }
 

 
}


