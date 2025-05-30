
package runtime;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Program {

    public static void main(String[] args) {
        playWithArrayList();//call
        playWithQueue();
    }
        public static void playWithArrayList(){//build
            /*
                ArrayList là 1 mảng đặc biệt, và là class triễn khai của 
            interface List
            
            ArrayList rất giống primitive Array(mảng cùi bên C) NHƯNG mà primitive 
            Array là mảng cố định còn ArrayList là mảng động(co giản)
            */
            int arrPrimitive[] = new int[10];//thiếu 10 là bug ngay
            //tao ra mảng cùi có 10 ptu thôi, muốn thêm cx k đc
            //mà xài ít hơn cx k cho
            //arrPrimitive sẽ luu được gi? primitive dâttype, wrapper class, obj
            
            //ArrayList là 1 mảng có khả năng co giản nhưng chỉ chơi dc với obj
            ArrayList <Integer> arrIntList = new ArrayList<>();
            //Các collection(bao gồm ArrayList) thì k chơi với primitive
            //nên phải dùng wrapper class
            //ngoài ra ta có thể khai báo ntn
            List<Integer> arrIntListV2 = new ArrayList<>();
            //khai cha new con
            //các method của ArrayList
            //.add(value): thêm 1 value vào trong List
            arrIntList.add(new Integer(3));//vì mình luu Integer k phải int
            arrIntList.add(new Integer(2));
            arrIntList.add(4);//dc vì nó có auto-unboxing
            System.out.println(arrIntList);//[3,2,4]
            
            //.clear(): xóa hết các ptu trong mảng
            arrIntList.clear();
            System.out.println(arrIntList);//mảng rỗng []
            
            //.add(index, value): "nhét" value vao vị trí index
            arrIntList.add(0, 3);
            arrIntList.add(1, 5);
            arrIntList.add(2, 4);
            arrIntList.add(1, 4);
            System.out.println(arrIntList);
            
            //giả xử, anh cần phải truy xuất mảng bằng mảng cùi, rồi
            //sau đó quay lại sài mảng ArrayList để có thể co giản thì làm sao
            Integer arrDemo[] = {3, 5, 7};//mảng cùi 3 phần tử
            ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arrDemo));
            //arrList là phiên bản của ArrayList của arrDemo
            //arrList sẽ co giản dc, nhưng truy xuất chậm
            //.toArray() biến List thành array primitive
            //1. tạo mảng cùi
            Integer numList[] = new Integer[arrList.size()];
            //lấy size của mảng xịn, đe tạo array primitive, vì nó cần có kích
            //thước lúc khởi tạo
            //2. nạp giá trị từ mảng xịn vào array Primitive
            arrList.toArray(numList);//numList dc nạp giá trị từ arrList
            //3. in ra
            System.out.println(numList);//tótring chưa đc xử lý
            //chạy dòng for để in đc arrayPrimitive
          
            //.get(index): lấy ra ptu ở vị trí index
            //arrList[3,5,7]
            //lấy ptu vị trí 1 ra'xem'
            System.out.println(arrList.get(1));//5
            
            //set(index, value): đổi giá trị ở vị trí index bang value
            arrList.set(1, 9);//arrList[3,9,7]
            //thử thách: swap 3 và 7 trong mảng
            Integer tmp = arrList.get(0);//tmp = 3;
            arrList.set(0, arrList.get(2));
            arrList.set(2, tmp);
            //vậy arrList là [7,9,3]
            System.out.println(arrList);
            
            //iterable: tính khả lập(khả duyệt)
            //iterator: 1 obj có khả năng định nghĩa đc trình tự và giá trị
            //  có thể trả ra cho lần gọi tiêp theo( tính và sẵn sàng để đưa nha)
            //mmô tả những gì muốn fore thằng arrList, anh sẽ tạo ra obj từ arrList
            Iterator<Integer> it = arrList.iterator();
            //it là iterator của arrList và fore sẽ dùng it để duyêt thay vì
            //chạy for
            //từ 0 đến size-1
            System.out.println(it.hasNext());//còn là true | false
            System.out.println(it.next());//lấy ra ptu tiếp theo 7
            System.out.println(it.next());//lấy ra ptu tiếp theo 9
            System.out.println(it.next());//lấy ra ptu tiếp theo 3
            //System.out.println(it.next());//het r, lỗi
            
            //.remove(index): xóa ptu nằm ở vị trị index trong List
            arrList.remove(1);//xóa sô 9 còm lại [7,3]
            
            //.removeAll(list): xóa hết các ptu trong List
            arrList.add(5);
            arrList.add(9);
            arrList.add(2);
            arrList.add(12);
            //arrList[7,3,5,9,2,12]
            //arrIntListV2[9,12]
            arrList.removeAll(arrIntListV2);//xóa hết 9 và 12
            System.out.println(arrList);
            
            //.size(): lấy kích thước
            
            //.clone: tạo ra 1 list mới có cùng ptu và cùng size, dung lượng
            ArrayList<Integer> demoClone = (ArrayList)arrList.clone();
            //clone là shallow copy: copy nhưng chưa cắt hết dây mơ rễ má
            //deepcopy: căt hết dây mưo rễ má
            
            //contain(key): tìm key trong danh sách(boolean)
            //notifyCapacity(): giới hạn lưu trữ
            //isEmpty(): có rỗng hay k? boolean
            //indexOf(key): tìm key ở vị trí nào
            //trimToSize(): thu nhỏ đến kích thước thật
            
        }
        
        public static void playWithQueue(){
            Queue<Integer> numList = new LinkedList<>();//khai cha new con
            //.add() nhet ptu vao ftail của danh sách (true/illegal exception)
            numList.add(3);//k co .add(index, value) vì nếu xai là chen hàng r
            //.offer() nhet sptu vào danh sách (true/false)
            numList.offer(1);
            numList.offer(5);
            numList.offer(4);
            //numList: head [3,1,5,4] tail
            //hàng đợi thì k có get() => k thể lấy ra ptu bất kì
            
            //.element(): lấy ra 'xem' ptu đầu tiên trong hàng dợi(ptu/nullPointer exception)
            System.out.println(numList.element());//3
            
            //.peek(): nhìn trộm, lấy ptu đâu ftieen ra 'xem' (ptu/null)
            System.out.println(numList.peek());//3
            
            //.remove(): lấy ptu ở đâu ra và xóa khỏi danh sách (ptu/nullPointer exception)
            System.out.println(numList.remove());//3 [1,5,4] xóa và đưa ra số đó
            System.out.println(numList.remove());//1 [5,4]
            
            //.poll(): lấy ptu ở đâu ra là xóa khỏi danh sách (ptu/null)
            System.out.println(numList.poll());//5 [4]
            
            //nhét thêm vai số
            numList.offer(5);
            numList.offer(1);
            numList.offer(2);
            //numList [4,5,1,2]
            
            //thường thì khi dug Queue ngta sẽ k quan tâm đến trong đó chua gi
            //sô lượng bao nhiêu, chỉ quan tâm thằng tiêp theo, còn hay k?, k còn 
            //thì kết thúc
            //mô phỏng xử lý hàng đợi
            while(true){
                Integer tmp = numList.poll();//lấy đâu hang
                if(tmp == null) break;//hết thì thoát
                //do something
                System.out.println("Ahihi" + tmp +"là đauws bị xử lý tiêp theo");
            }
            //sau khi làm xong thì numList sẽ là rỗng[]
            
            //Priority Queue: hàng đượi uu tiên (min heap | max heap)->Hãy search GG
            Queue<Integer> numListV2 = new PriorityQueue<>();
            numListV2.offer(3);
            numListV2.offer(1);
            numListV2.offer(5);
            numListV2.offer(9);
            numListV2.offer(2);
            System.out.println(numListV2);//[1,2,5,9,3]
            System.out.println(numListV2.poll());//1
            System.out.println(numListV2.poll());//2
            System.out.println(numListV2.poll());//3
            System.out.println(numListV2.poll());//5
            System.out.println(numListV2.poll());//9
            
            //ArrayBlockingQueue: hàng đợi limit
            Queue<Integer> numListV3 = new ArrayBlockingQueue<>(3);//có 3 mới đc
            //hàng này chỉ chứa 3 thô, nếu cùng lức 4 đứa là k dc
            //.add lỗi | offer false
            
            //ArrayDeque
            Deque<Integer> numDeque = new ArrayDeque<>();
            //front(first)     rear(last)
            //.add() | .offer() thì để nhét vao rear
            //.addLast() | .offerLast() cx nhét vào rear
            //.addFirst() | .offerFirst nhét vào front
            
            //nhìn 
            //.elementFirst() | .peakFirst() nhìn ở đầu front
            //.elementLast() | .peakLast() | .element() nhìn ở đầu rear
            
            //lấy ra
            //.remove() | .removeLast() | .poll() | .pollLast() lấy ra va xóa ở ds rear
            //.removeFirst() | .pollFirst() lấy ra và xóa ở ds front
            //anh muốn arrayDeque để mô tả 1 cái queue FIFO(vào tail ra head)
            //front(first)  và  rear(last)
            //quy ước
            //them: .offerLast()
            //nhìn: .peakFirst()
            //lấy: .pollFirst()
            
            //anh muốn arrayDeque để mô tả 1 cái stack FIOF(vào tail ra tail)
            //front(first)  và  rear(last)
            //quy ước
            //them: .offLast()
            //nhìn: .peekLast()
            //lấy: .pollLast()
            
        }
}
