
package utils;

import java.util.Scanner;

/*
Inputer: là 1 cái khuôn (class)
nhưng anh không dùng cái khung để đúc ra oject 
mà anh chỉ dùng cái  khuông này để lưu trữ những hàm tiện ích hỗ trợ 
 cho anh trong việc nhập 

nhưng em phải nhớ rằng trong java k hề có hàm (trong java có method giống hàm)

 //public static void ahiihi(){  // tạo như vậy thì có rất nhiều phiên bản ,
                         // mỗi oject tạo ra sở hửu 1 ahihi khi . (chấm) thì ko bik sài cái nào 
                        // thêm static có 1 phiên bản duy nhất thì trong main sài trực tiếp đc lun ko 
                        //để đở tạo ra object , tiết kiệm dữ liệu hơn vd Inputter.ahihi(); sài trực tiếp
 // }
*/
public class Inputter {
     public  static Scanner sc = new Scanner(System.in);
   //những method hỗ trợ nhập chuẩn 
     //1.method ép người dùng nhập số nguyên chuẩn 
     public static int getAnInteger(String inpMsg, String errMsg){
         System.out.println(inpMsg);// hiển thị lời mời 
         while(true){
             try{
                 int number = Integer.parseInt(sc.nextLine());
                 return number;
             }catch(Exception e){
                 System.out.println(errMsg);// hiển thị câu chửi
             }
         }
     }
     //2.method ép người dùng nhập số nguyên chuẩn và nằm trong khoản yêu cầu 
      public static int getAnInteger(String inpMsg, String errMsg, 
                                     int lowerBound,int upperBound){
          if(lowerBound > upperBound){ // swap khi dùng nhập vô tri 
              int tmp = lowerBound;
              lowerBound = upperBound;
              upperBound = tmp;
          }
         System.out.println(inpMsg);// hiển thị lời mời 
         while(true){
             try{
                 int number = Integer.parseInt(sc.nextLine());
                 if(number < lowerBound || number > upperBound){
                     throw new Exception();
                     
                 }
                 return number;
             }catch(Exception e){
                 System.out.println(errMsg);// hiển thị câu chửi
             }
         }
     }
      
      //3.method ép người dùng nhập số thực chuẩn 
     public static double getADouble(String inpMsg, String errMsg){
         System.out.println(inpMsg);// hiển thị lời mời 
         while(true){
             try{
                 double number = Double.parseDouble(sc.nextLine());
                 return number;
             }catch(Exception e){
                 System.out.println(errMsg);// hiển thị câu chửi
             }
         }
     }
     //4.method ép người dùng nhập số thực chuẩn và nằm trong khoản yêu cầu 
      public static double getADouble(String inpMsg, String errMsg, 
                                    double lowerBound,double upperBound){
          if(lowerBound > upperBound){ // swap khi dùng nhập vô tri 
              double tmp = lowerBound;
              lowerBound = upperBound;
              upperBound = tmp;
          }
         System.out.println(inpMsg);// hiển thị lời mời 
         while(true){
             try{
                 double number = Double.parseDouble(sc.nextLine());
                 if(number < lowerBound || number > upperBound){
                     throw new Exception();
                     
                 }
                 return number;
             }catch(Exception e){
                 System.out.println(errMsg);// hiển thị câu chửi
             }
         }
     }
   //5.method ép người dùng nhập 1 chuỗi cắm để rỗng
      public static String getString(String inpMsg, String errMsg){
          System.out.println(inpMsg);
          while(true){
              try{
                  String str = sc.nextLine();
                  if(str.isEmpty()){
                      throw new Exception();
                  }
                  return str;
              }catch(Exception e){
                  System.out.println(errMsg);
              }
          }
      }
     //6.method ép người dùng nhập 1 chuỗi cắm để rỗng và theo regex
      public static String getString(String inpMsg, String errMsg, 
                                    String regex){
          System.out.println(inpMsg);
          while(true){
              try{
                  String str = sc.nextLine();
                  if(str.isEmpty() || !str.matches(regex)){
                      throw new Exception();
                  }
                  return str;
              }catch(Exception e){
                  System.out.println(errMsg);
              }
          }
      } 
      
    
}
