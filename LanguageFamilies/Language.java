public class Language{ // 定义一个名为Language的公共类
    protected String name; // 受保护的字符串变量，表示语言的名称
    protected int numSpeakers; // 受保护的整数变量，表示说这种语言的人数
    protected String regionSpoken; // 受保护的字符串变量，表示这种语言主要使用的地区
    protected String wordOrder; // 受保护的字符串变量，表示这种语言的词序
    public Language(String name,int numSpeakers,String regionSpoken,String wordOrder){
      this.name=name; // 初始化语言名称
      this.numSpeakers=numSpeakers; // 初始化说这种语言的人数
      this.regionSpoken=regionSpoken; // 初始化这种语言主要使用的地区
      this.wordOrder=wordOrder; // 初始化这种语言的词序
     }
    public static void main (String[]args){
     Language spanish=new Language("Spanish",555000000,"Spain, Latin America, and Equatorial Guinea", "subject-verb-object"); // 创建一个Language类的实例，表示西班牙语
    spanish.getInfo(); // 调用getInfo方法，输出西班牙语的信息
    Mayan kiche=new Mayan("Ki'che'",2330000); // 创建一个Mayan类的实例，表示基切语
    kiche.getInfo(); // 调用getInfo方法，输出基切语的信息
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000); // 创建一个SinoTibetan类的实例，表示中文
    mandarin.getInfo(); // 调用getInfo方法，输出中文的信息
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000); // 创建一个SinoTibetan类的实例，表示缅甸语
    burmese.getInfo(); // 调用getInfo方法，输出缅甸语的信息
  }
    public void getInfo(){ // 定义一个名为getInfo的方法
      System.out.println(name+" is spoken by "+ numSpeakers+" people mainly in "+regionSpoken+"\nThe language follows the word order: "+wordOrder+"."); // 输出语言的详细信息
    }
    
   }