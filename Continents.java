public class Continents{ // 定义Continents类
  public static void main(String[]args){ // 主方法入口
    int continent=4; // 定义整数变量continent并赋值为4
    switch(continent){ // 根据continent的值进行分支选择
        case 1: // 如果continent的值为1
        System.out.println("North America: Mexico City, Mexico"); // 输出北美洲的首都
        break; // 结束当前case
        case 2: // 如果continent的值为2
        System.out.println("South America: Sao Paulo, Brazil"); // 输出南美洲的首都
        break; // 结束当前case
        case 3: // 如果continent的值为3
        System.out.println("Europe: Moscow, Russia"); // 输出欧洲的首都
        break; // 结束当前case
        case 4: // 如果continent的值为4
        System.out.println("Africa: Lagos, Nigeria"); // 输出非洲的首都
        break; // 结束当前case
        case 5: // 如果continent的值为5
        System.out.println("Asia: Shanghai, China"); // 输出亚洲的首都
        break; // 结束当前case
        case 6: // 如果continent的值为6
        System.out.println("Antarctica: McMurdo Station, US"); // 输出南极洲的首都
        break; // 结束当前case
        default: // 如果continent的值不在1到6之间
        System.out.println("Undefined continent!"); // 输出未定义的大陆
        break; // 结束当前case

    }
     }
}