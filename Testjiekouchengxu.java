package jiekouchengxu;

public class Testjiekou {
 public static void main(String args[]) {
  Student doc1=new Student("����","��",20);
  Teacher doc2=new Teacher("����","��",20);
  Doctor doc3=new Doctor("����","��",20);
  Student doc4=new Student("����","Ů",20);
  Teacher doc5=new Teacher("����","Ů",20);
  Doctor doc6=new Doctor("����","Ů",20);
  doc2.setxinshui(20000);
  doc1.setxuefei(15000);
  System.out.println(doc1.name+doc1.sex+doc1.age+"ѧ��"+doc1.tuition+"нˮ"+doc2.salary+"��˰"+doc3.jiaoshui(doc2,doc1));
  System.out.println(doc2.name+doc2.sex+doc2.age+"ѧ��"+doc1.tuition+"нˮ"+doc2.salary+"��˰"+doc3.jiaoshui(doc2,doc1));
 }

}