import java.util.ArrayList; // 导入ArrayList类

class Lunch { // 定义Lunch类
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) { // 定义removeAnts方法，参数为ArrayList<String>类型的lunchBox
      int i=0; // 初始化索引i为0
     while(i<lunchBox.size()){ // 当i小于lunchBox的大小时循环
      if(lunchBox.get(i) == "ant"){ // 如果lunchBox中第i个元素是"ant"
      lunchBox.remove(lunchBox.get(i)); // 移除lunchBox中第i个元素
      } else{ // 否则
        i++; // 索引i加1
      }
     }
     return lunchBox; // 返回修改后的lunchBox
    }
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>(); // 创建一个ArrayList对象lunchContainer
    lunchContainer.add("apple"); // 向lunchContainer中添加"apple"
    lunchContainer.add("ant"); // 向lunchContainer中添加"ant"
    lunchContainer.add("ant"); // 向lunchContainer中添加"ant"
    lunchContainer.add("sandwich"); // 向lunchContainer中添加"sandwich"
    lunchContainer.add("ant"); // 向lunchContainer中添加"ant"
    lunchContainer = removeAnts(lunchContainer); // 调用removeAnts方法移除lunchContainer中的"ant"
    System.out.println(lunchContainer); // 打印lunchContainer

  }
}