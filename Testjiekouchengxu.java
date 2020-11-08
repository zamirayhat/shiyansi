package jiekouchengxu;

public class Testjiekou {
 public static void main(String args[]) {
  Student doc1=new Student("张三","男",20);
  Teacher doc2=new Teacher("张三","男",20);
  Doctor doc3=new Doctor("张三","男",20);
  Student doc4=new Student("李四","女",20);
  Teacher doc5=new Teacher("李四","女",20);
  Doctor doc6=new Doctor("李四","女",20);
  doc2.setxinshui(20000);
  doc1.setxuefei(15000);
  System.out.println(doc1.name+doc1.sex+doc1.age+"学费"+doc1.tuition+"薪水"+doc2.salary+"交税"+doc3.jiaoshui(doc2,doc1));
  System.out.println(doc2.name+doc2.sex+doc2.age+"学费"+doc1.tuition+"薪水"+doc2.salary+"交税"+doc3.jiaoshui(doc2,doc1));
 }

}